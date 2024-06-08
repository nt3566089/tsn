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
 * The abstract condition-query of T_TRPACKRMDR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpackrmdrCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpackrmdrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPACKRMDR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingId The value of packingRemainingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingRemainingId_Equal(Long packingRemainingId) {
        doSetPackingRemainingId_Equal(packingRemainingId);
    }

    protected void doSetPackingRemainingId_Equal(Long packingRemainingId) {
        regPackingRemainingId(CK_EQ, packingRemainingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingId The value of packingRemainingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingRemainingId_NotEqual(Long packingRemainingId) {
        doSetPackingRemainingId_NotEqual(packingRemainingId);
    }

    protected void doSetPackingRemainingId_NotEqual(Long packingRemainingId) {
        regPackingRemainingId(CK_NES, packingRemainingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingId The value of packingRemainingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingRemainingId_GreaterThan(Long packingRemainingId) {
        regPackingRemainingId(CK_GT, packingRemainingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingId The value of packingRemainingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingRemainingId_LessThan(Long packingRemainingId) {
        regPackingRemainingId(CK_LT, packingRemainingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingId The value of packingRemainingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingRemainingId_GreaterEqual(Long packingRemainingId) {
        regPackingRemainingId(CK_GE, packingRemainingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingId The value of packingRemainingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingRemainingId_LessEqual(Long packingRemainingId) {
        regPackingRemainingId(CK_LE, packingRemainingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of packingRemainingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingRemainingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingRemainingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingRemainingId(), "PACKING_REMAINING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingIdList The collection of packingRemainingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRemainingId_InScope(Collection<Long> packingRemainingIdList) {
        doSetPackingRemainingId_InScope(packingRemainingIdList);
    }

    protected void doSetPackingRemainingId_InScope(Collection<Long> packingRemainingIdList) {
        regINS(CK_INS, cTL(packingRemainingIdList), xgetCValuePackingRemainingId(), "PACKING_REMAINING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingRemainingIdList The collection of packingRemainingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRemainingId_NotInScope(Collection<Long> packingRemainingIdList) {
        doSetPackingRemainingId_NotInScope(packingRemainingIdList);
    }

    protected void doSetPackingRemainingId_NotInScope(Collection<Long> packingRemainingIdList) {
        regINS(CK_NINS, cTL(packingRemainingIdList), xgetCValuePackingRemainingId(), "PACKING_REMAINING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPackingRemainingId_IsNull() { regPackingRemainingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPackingRemainingId_IsNotNull() { regPackingRemainingId(CK_ISNN, DOBJ); }

    protected void regPackingRemainingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingRemainingId(), "PACKING_REMAINING_ID"); }
    protected abstract ConditionValue xgetCValuePackingRemainingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkey The value of packrmdrkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackrmdrkey_Equal(java.math.BigDecimal packrmdrkey) {
        doSetPackrmdrkey_Equal(packrmdrkey);
    }

    protected void doSetPackrmdrkey_Equal(java.math.BigDecimal packrmdrkey) {
        regPackrmdrkey(CK_EQ, packrmdrkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkey The value of packrmdrkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackrmdrkey_NotEqual(java.math.BigDecimal packrmdrkey) {
        doSetPackrmdrkey_NotEqual(packrmdrkey);
    }

    protected void doSetPackrmdrkey_NotEqual(java.math.BigDecimal packrmdrkey) {
        regPackrmdrkey(CK_NES, packrmdrkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkey The value of packrmdrkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackrmdrkey_GreaterThan(java.math.BigDecimal packrmdrkey) {
        regPackrmdrkey(CK_GT, packrmdrkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkey The value of packrmdrkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackrmdrkey_LessThan(java.math.BigDecimal packrmdrkey) {
        regPackrmdrkey(CK_LT, packrmdrkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkey The value of packrmdrkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackrmdrkey_GreaterEqual(java.math.BigDecimal packrmdrkey) {
        regPackrmdrkey(CK_GE, packrmdrkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkey The value of packrmdrkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackrmdrkey_LessEqual(java.math.BigDecimal packrmdrkey) {
        regPackrmdrkey(CK_LE, packrmdrkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of packrmdrkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packrmdrkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackrmdrkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackrmdrkey(), "PACKRMDRKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkeyList The collection of packrmdrkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackrmdrkey_InScope(Collection<java.math.BigDecimal> packrmdrkeyList) {
        doSetPackrmdrkey_InScope(packrmdrkeyList);
    }

    protected void doSetPackrmdrkey_InScope(Collection<java.math.BigDecimal> packrmdrkeyList) {
        regINS(CK_INS, cTL(packrmdrkeyList), xgetCValuePackrmdrkey(), "PACKRMDRKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @param packrmdrkeyList The collection of packrmdrkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackrmdrkey_NotInScope(Collection<java.math.BigDecimal> packrmdrkeyList) {
        doSetPackrmdrkey_NotInScope(packrmdrkeyList);
    }

    protected void doSetPackrmdrkey_NotInScope(Collection<java.math.BigDecimal> packrmdrkeyList) {
        regINS(CK_NINS, cTL(packrmdrkeyList), xgetCValuePackrmdrkey(), "PACKRMDRKEY");
    }

    protected void regPackrmdrkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackrmdrkey(), "PACKRMDRKEY"); }
    protected abstract ConditionValue xgetCValuePackrmdrkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
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
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
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
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GT, pickingInstDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LT, pickingInstDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GE, pickingInstDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LE, pickingInstDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
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
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_NotInScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_NINS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    protected void regPickingInstDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstDetailId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
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
     * TAGCD: {varchar(30)}
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
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterThan(String tagcd) {
        regTagcd(CK_GT, fRES(tagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessThan(String tagcd) {
        regTagcd(CK_LT, fRES(tagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterEqual(String tagcd) {
        regTagcd(CK_GE, fRES(tagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessEqual(String tagcd) {
        regTagcd(CK_LE, fRES(tagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
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
     * TAGCD: {varchar(30)}
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
     * TAGCD: {varchar(30)} <br>
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
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagcd_NotLikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_PrefixSearch(String tagcd) {
        setTagcd_LikeSearch(tagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNull() { regTagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNullOrEmpty() { regTagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNotNull() { regTagcd(CK_ISNN, DOBJ); }

    protected void regTagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagcd(), "TAGCD"); }
    protected abstract ConditionValue xgetCValueTagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokey The value of sokey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_Equal(java.math.BigDecimal sokey) {
        doSetSokey_Equal(sokey);
    }

    protected void doSetSokey_Equal(java.math.BigDecimal sokey) {
        regSokey(CK_EQ, sokey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokey The value of sokey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_NotEqual(java.math.BigDecimal sokey) {
        doSetSokey_NotEqual(sokey);
    }

    protected void doSetSokey_NotEqual(java.math.BigDecimal sokey) {
        regSokey(CK_NES, sokey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokey The value of sokey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterThan(java.math.BigDecimal sokey) {
        regSokey(CK_GT, sokey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokey The value of sokey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessThan(java.math.BigDecimal sokey) {
        regSokey(CK_LT, sokey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokey The value of sokey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterEqual(java.math.BigDecimal sokey) {
        regSokey(CK_GE, sokey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokey The value of sokey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessEqual(java.math.BigDecimal sokey) {
        regSokey(CK_LE, sokey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param minNumber The min number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSokey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSokey(), "SOKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokeyList The collection of sokey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_InScope(sokeyList);
    }

    protected void doSetSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_INS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @param sokeyList The collection of sokey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_NotInScope(sokeyList);
    }

    protected void doSetSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_NINS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    protected void regSokey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSokey(), "SOKEY"); }
    protected abstract ConditionValue xgetCValueSokey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_Equal(Long solineno) {
        doSetSolineno_Equal(solineno);
    }

    protected void doSetSolineno_Equal(Long solineno) {
        regSolineno(CK_EQ, solineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_NotEqual(Long solineno) {
        doSetSolineno_NotEqual(solineno);
    }

    protected void doSetSolineno_NotEqual(Long solineno) {
        regSolineno(CK_NES, solineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_GreaterThan(Long solineno) {
        regSolineno(CK_GT, solineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_LessThan(Long solineno) {
        regSolineno(CK_LT, solineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_GreaterEqual(Long solineno) {
        regSolineno(CK_GE, solineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_LessEqual(Long solineno) {
        regSolineno(CK_LE, solineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of solineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of solineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSolineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSolineno(), "SOLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solinenoList The collection of solineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSolineno_InScope(Collection<Long> solinenoList) {
        doSetSolineno_InScope(solinenoList);
    }

    protected void doSetSolineno_InScope(Collection<Long> solinenoList) {
        regINS(CK_INS, cTL(solinenoList), xgetCValueSolineno(), "SOLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solinenoList The collection of solineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSolineno_NotInScope(Collection<Long> solinenoList) {
        doSetSolineno_NotInScope(solinenoList);
    }

    protected void doSetSolineno_NotInScope(Collection<Long> solinenoList) {
        regINS(CK_NINS, cTL(solinenoList), xgetCValueSolineno(), "SOLINENO");
    }

    protected void regSolineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSolineno(), "SOLINENO"); }
    protected abstract ConditionValue xgetCValueSolineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_Equal(java.math.BigDecimal actflg) {
        doSetActflg_Equal(actflg);
    }

    protected void doSetActflg_Equal(java.math.BigDecimal actflg) {
        regActflg(CK_EQ, actflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_NotEqual(java.math.BigDecimal actflg) {
        doSetActflg_NotEqual(actflg);
    }

    protected void doSetActflg_NotEqual(java.math.BigDecimal actflg) {
        regActflg(CK_NES, actflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(java.math.BigDecimal actflg) {
        regActflg(CK_GT, actflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessThan(java.math.BigDecimal actflg) {
        regActflg(CK_LT, actflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(java.math.BigDecimal actflg) {
        regActflg(CK_GE, actflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(java.math.BigDecimal actflg) {
        regActflg(CK_LE, actflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param minNumber The min number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setActflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueActflg(), "ACTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflgList The collection of actflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_InScope(actflgList);
    }

    protected void doSetActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_INS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflgList The collection of actflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_NotInScope(actflgList);
    }

    protected void doSetActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_NINS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    protected void regActflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActflg(), "ACTFLG"); }
    protected abstract ConditionValue xgetCValueActflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkey The value of deliverygroupkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_Equal(java.math.BigDecimal deliverygroupkey) {
        doSetDeliverygroupkey_Equal(deliverygroupkey);
    }

    protected void doSetDeliverygroupkey_Equal(java.math.BigDecimal deliverygroupkey) {
        regDeliverygroupkey(CK_EQ, deliverygroupkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkey The value of deliverygroupkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_NotEqual(java.math.BigDecimal deliverygroupkey) {
        doSetDeliverygroupkey_NotEqual(deliverygroupkey);
    }

    protected void doSetDeliverygroupkey_NotEqual(java.math.BigDecimal deliverygroupkey) {
        regDeliverygroupkey(CK_NES, deliverygroupkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkey The value of deliverygroupkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_GreaterThan(java.math.BigDecimal deliverygroupkey) {
        regDeliverygroupkey(CK_GT, deliverygroupkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkey The value of deliverygroupkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_LessThan(java.math.BigDecimal deliverygroupkey) {
        regDeliverygroupkey(CK_LT, deliverygroupkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkey The value of deliverygroupkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_GreaterEqual(java.math.BigDecimal deliverygroupkey) {
        regDeliverygroupkey(CK_GE, deliverygroupkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkey The value of deliverygroupkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_LessEqual(java.math.BigDecimal deliverygroupkey) {
        regDeliverygroupkey(CK_LE, deliverygroupkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param minNumber The min number of deliverygroupkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliverygroupkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliverygroupkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkeyList The collection of deliverygroupkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_InScope(Collection<java.math.BigDecimal> deliverygroupkeyList) {
        doSetDeliverygroupkey_InScope(deliverygroupkeyList);
    }

    protected void doSetDeliverygroupkey_InScope(Collection<java.math.BigDecimal> deliverygroupkeyList) {
        regINS(CK_INS, cTL(deliverygroupkeyList), xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @param deliverygroupkeyList The collection of deliverygroupkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_NotInScope(Collection<java.math.BigDecimal> deliverygroupkeyList) {
        doSetDeliverygroupkey_NotInScope(deliverygroupkeyList);
    }

    protected void doSetDeliverygroupkey_NotInScope(Collection<java.math.BigDecimal> deliverygroupkeyList) {
        regINS(CK_NINS, cTL(deliverygroupkeyList), xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     */
    public void setDeliverygroupkey_IsNull() { regDeliverygroupkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     */
    public void setDeliverygroupkey_IsNotNull() { regDeliverygroupkey(CK_ISNN, DOBJ); }

    protected void regDeliverygroupkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY"); }
    protected abstract ConditionValue xgetCValueDeliverygroupkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkey The value of wbkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_Equal(java.math.BigDecimal wbkey) {
        doSetWbkey_Equal(wbkey);
    }

    protected void doSetWbkey_Equal(java.math.BigDecimal wbkey) {
        regWbkey(CK_EQ, wbkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkey The value of wbkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_NotEqual(java.math.BigDecimal wbkey) {
        doSetWbkey_NotEqual(wbkey);
    }

    protected void doSetWbkey_NotEqual(java.math.BigDecimal wbkey) {
        regWbkey(CK_NES, wbkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkey The value of wbkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_GreaterThan(java.math.BigDecimal wbkey) {
        regWbkey(CK_GT, wbkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkey The value of wbkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_LessThan(java.math.BigDecimal wbkey) {
        regWbkey(CK_LT, wbkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkey The value of wbkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_GreaterEqual(java.math.BigDecimal wbkey) {
        regWbkey(CK_GE, wbkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkey The value of wbkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_LessEqual(java.math.BigDecimal wbkey) {
        regWbkey(CK_LE, wbkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param minNumber The min number of wbkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wbkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWbkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWbkey(), "WBKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkeyList The collection of wbkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWbkey_InScope(Collection<java.math.BigDecimal> wbkeyList) {
        doSetWbkey_InScope(wbkeyList);
    }

    protected void doSetWbkey_InScope(Collection<java.math.BigDecimal> wbkeyList) {
        regINS(CK_INS, cTL(wbkeyList), xgetCValueWbkey(), "WBKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @param wbkeyList The collection of wbkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWbkey_NotInScope(Collection<java.math.BigDecimal> wbkeyList) {
        doSetWbkey_NotInScope(wbkeyList);
    }

    protected void doSetWbkey_NotInScope(Collection<java.math.BigDecimal> wbkeyList) {
        regINS(CK_NINS, cTL(wbkeyList), xgetCValueWbkey(), "WBKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     */
    public void setWbkey_IsNull() { regWbkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WBKEY: {IX, decimal(16, 6)}
     */
    public void setWbkey_IsNotNull() { regWbkey(CK_ISNN, DOBJ); }

    protected void regWbkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWbkey(), "WBKEY"); }
    protected abstract ConditionValue xgetCValueWbkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)} <br>
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_Equal(String ownercd) {
        doSetOwnercd_Equal(fRES(ownercd));
    }

    protected void doSetOwnercd_Equal(String ownercd) {
        regOwnercd(CK_EQ, ownercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotEqual(String ownercd) {
        doSetOwnercd_NotEqual(fRES(ownercd));
    }

    protected void doSetOwnercd_NotEqual(String ownercd) {
        regOwnercd(CK_NES, ownercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterThan(String ownercd) {
        regOwnercd(CK_GT, fRES(ownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessThan(String ownercd) {
        regOwnercd(CK_LT, fRES(ownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterEqual(String ownercd) {
        regOwnercd(CK_GE, fRES(ownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessEqual(String ownercd) {
        regOwnercd(CK_LE, fRES(ownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_InScope(Collection<String> ownercdList) {
        doSetOwnercd_InScope(ownercdList);
    }

    protected void doSetOwnercd_InScope(Collection<String> ownercdList) {
        regINS(CK_INS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotInScope(Collection<String> ownercdList) {
        doSetOwnercd_NotInScope(ownercdList);
    }

    protected void doSetOwnercd_NotInScope(Collection<String> ownercdList) {
        regINS(CK_NINS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setOwnercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownercd The value of ownercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnercd_LikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercd_NotLikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_PrefixSearch(String ownercd) {
        setOwnercd_LikeSearch(ownercd, xcLSOPPre());
    }

    protected void regOwnercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercd(), "OWNERCD"); }
    protected abstract ConditionValue xgetCValueOwnercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_Equal(String itemadmin) {
        doSetItemadmin_Equal(fRES(itemadmin));
    }

    protected void doSetItemadmin_Equal(String itemadmin) {
        regItemadmin(CK_EQ, itemadmin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotEqual(String itemadmin) {
        doSetItemadmin_NotEqual(fRES(itemadmin));
    }

    protected void doSetItemadmin_NotEqual(String itemadmin) {
        regItemadmin(CK_NES, itemadmin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterThan(String itemadmin) {
        regItemadmin(CK_GT, fRES(itemadmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessThan(String itemadmin) {
        regItemadmin(CK_LT, fRES(itemadmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterEqual(String itemadmin) {
        regItemadmin(CK_GE, fRES(itemadmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessEqual(String itemadmin) {
        regItemadmin(CK_LE, fRES(itemadmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadminList The collection of itemadmin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_InScope(Collection<String> itemadminList) {
        doSetItemadmin_InScope(itemadminList);
    }

    protected void doSetItemadmin_InScope(Collection<String> itemadminList) {
        regINS(CK_INS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadminList The collection of itemadmin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotInScope(Collection<String> itemadminList) {
        doSetItemadmin_NotInScope(itemadminList);
    }

    protected void doSetItemadmin_NotInScope(Collection<String> itemadminList) {
        regINS(CK_NINS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemadmin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemadmin The value of itemadmin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemadmin_LikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemadmin_NotLikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_PrefixSearch(String itemadmin) {
        setItemadmin_LikeSearch(itemadmin, xcLSOPPre());
    }

    protected void regItemadmin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemadmin(), "ITEMADMIN"); }
    protected abstract ConditionValue xgetCValueItemadmin();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_Equal(Long lotkey) {
        doSetLotkey_Equal(lotkey);
    }

    protected void doSetLotkey_Equal(Long lotkey) {
        regLotkey(CK_EQ, lotkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_NotEqual(Long lotkey) {
        doSetLotkey_NotEqual(lotkey);
    }

    protected void doSetLotkey_NotEqual(Long lotkey) {
        regLotkey(CK_NES, lotkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterThan(Long lotkey) {
        regLotkey(CK_GT, lotkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessThan(Long lotkey) {
        regLotkey(CK_LT, lotkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterEqual(Long lotkey) {
        regLotkey(CK_GE, lotkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessEqual(Long lotkey) {
        regLotkey(CK_LE, lotkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotkey(), "LOTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkeyList The collection of lotkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_InScope(Collection<Long> lotkeyList) {
        doSetLotkey_InScope(lotkeyList);
    }

    protected void doSetLotkey_InScope(Collection<Long> lotkeyList) {
        regINS(CK_INS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkeyList The collection of lotkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_NotInScope(Collection<Long> lotkeyList) {
        doSetLotkey_NotInScope(lotkeyList);
    }

    protected void doSetLotkey_NotInScope(Collection<Long> lotkeyList) {
        regINS(CK_NINS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    protected void regLotkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotkey(), "LOTKEY"); }
    protected abstract ConditionValue xgetCValueLotkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1 The value of packedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty1_Equal(java.math.BigDecimal packedqty1) {
        doSetPackedqty1_Equal(packedqty1);
    }

    protected void doSetPackedqty1_Equal(java.math.BigDecimal packedqty1) {
        regPackedqty1(CK_EQ, packedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1 The value of packedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty1_NotEqual(java.math.BigDecimal packedqty1) {
        doSetPackedqty1_NotEqual(packedqty1);
    }

    protected void doSetPackedqty1_NotEqual(java.math.BigDecimal packedqty1) {
        regPackedqty1(CK_NES, packedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1 The value of packedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty1_GreaterThan(java.math.BigDecimal packedqty1) {
        regPackedqty1(CK_GT, packedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1 The value of packedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty1_LessThan(java.math.BigDecimal packedqty1) {
        regPackedqty1(CK_LT, packedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1 The value of packedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty1_GreaterEqual(java.math.BigDecimal packedqty1) {
        regPackedqty1(CK_GE, packedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1 The value of packedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty1_LessEqual(java.math.BigDecimal packedqty1) {
        regPackedqty1(CK_LE, packedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of packedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackedqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackedqty1(), "PACKEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1List The collection of packedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedqty1_InScope(Collection<java.math.BigDecimal> packedqty1List) {
        doSetPackedqty1_InScope(packedqty1List);
    }

    protected void doSetPackedqty1_InScope(Collection<java.math.BigDecimal> packedqty1List) {
        regINS(CK_INS, cTL(packedqty1List), xgetCValuePackedqty1(), "PACKEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param packedqty1List The collection of packedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedqty1_NotInScope(Collection<java.math.BigDecimal> packedqty1List) {
        doSetPackedqty1_NotInScope(packedqty1List);
    }

    protected void doSetPackedqty1_NotInScope(Collection<java.math.BigDecimal> packedqty1List) {
        regINS(CK_NINS, cTL(packedqty1List), xgetCValuePackedqty1(), "PACKEDQTY1");
    }

    protected void regPackedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackedqty1(), "PACKEDQTY1"); }
    protected abstract ConditionValue xgetCValuePackedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2 The value of packedqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty2_Equal(Long packedqty2) {
        doSetPackedqty2_Equal(packedqty2);
    }

    protected void doSetPackedqty2_Equal(Long packedqty2) {
        regPackedqty2(CK_EQ, packedqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2 The value of packedqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty2_NotEqual(Long packedqty2) {
        doSetPackedqty2_NotEqual(packedqty2);
    }

    protected void doSetPackedqty2_NotEqual(Long packedqty2) {
        regPackedqty2(CK_NES, packedqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2 The value of packedqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty2_GreaterThan(Long packedqty2) {
        regPackedqty2(CK_GT, packedqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2 The value of packedqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty2_LessThan(Long packedqty2) {
        regPackedqty2(CK_LT, packedqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2 The value of packedqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty2_GreaterEqual(Long packedqty2) {
        regPackedqty2(CK_GE, packedqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2 The value of packedqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty2_LessEqual(Long packedqty2) {
        regPackedqty2(CK_LE, packedqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of packedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackedqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackedqty2(), "PACKEDQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2List The collection of packedqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedqty2_InScope(Collection<Long> packedqty2List) {
        doSetPackedqty2_InScope(packedqty2List);
    }

    protected void doSetPackedqty2_InScope(Collection<Long> packedqty2List) {
        regINS(CK_INS, cTL(packedqty2List), xgetCValuePackedqty2(), "PACKEDQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty2List The collection of packedqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedqty2_NotInScope(Collection<Long> packedqty2List) {
        doSetPackedqty2_NotInScope(packedqty2List);
    }

    protected void doSetPackedqty2_NotInScope(Collection<Long> packedqty2List) {
        regINS(CK_NINS, cTL(packedqty2List), xgetCValuePackedqty2(), "PACKEDQTY2");
    }

    protected void regPackedqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackedqty2(), "PACKEDQTY2"); }
    protected abstract ConditionValue xgetCValuePackedqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3 The value of packedqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty3_Equal(Long packedqty3) {
        doSetPackedqty3_Equal(packedqty3);
    }

    protected void doSetPackedqty3_Equal(Long packedqty3) {
        regPackedqty3(CK_EQ, packedqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3 The value of packedqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty3_NotEqual(Long packedqty3) {
        doSetPackedqty3_NotEqual(packedqty3);
    }

    protected void doSetPackedqty3_NotEqual(Long packedqty3) {
        regPackedqty3(CK_NES, packedqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3 The value of packedqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty3_GreaterThan(Long packedqty3) {
        regPackedqty3(CK_GT, packedqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3 The value of packedqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty3_LessThan(Long packedqty3) {
        regPackedqty3(CK_LT, packedqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3 The value of packedqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty3_GreaterEqual(Long packedqty3) {
        regPackedqty3(CK_GE, packedqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3 The value of packedqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackedqty3_LessEqual(Long packedqty3) {
        regPackedqty3(CK_LE, packedqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of packedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackedqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackedqty3(), "PACKEDQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3List The collection of packedqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedqty3_InScope(Collection<Long> packedqty3List) {
        doSetPackedqty3_InScope(packedqty3List);
    }

    protected void doSetPackedqty3_InScope(Collection<Long> packedqty3List) {
        regINS(CK_INS, cTL(packedqty3List), xgetCValuePackedqty3(), "PACKEDQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param packedqty3List The collection of packedqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedqty3_NotInScope(Collection<Long> packedqty3List) {
        doSetPackedqty3_NotInScope(packedqty3List);
    }

    protected void doSetPackedqty3_NotInScope(Collection<Long> packedqty3List) {
        regINS(CK_NINS, cTL(packedqty3List), xgetCValuePackedqty3(), "PACKEDQTY3");
    }

    protected void regPackedqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackedqty3(), "PACKEDQTY3"); }
    protected abstract ConditionValue xgetCValuePackedqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(java.math.BigDecimal expectqty1) {
        doSetExpectqty1_Equal(expectqty1);
    }

    protected void doSetExpectqty1_Equal(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(java.math.BigDecimal expectqty1) {
        doSetExpectqty1_NotEqual(expectqty1);
    }

    protected void doSetExpectqty1_NotEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_GT, expectqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_LT, expectqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_GE, expectqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_LE, expectqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty1(), "EXPECTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<java.math.BigDecimal> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<java.math.BigDecimal> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<java.math.BigDecimal> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<java.math.BigDecimal> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_Equal(Long expectqty2) {
        doSetExpectqty2_Equal(expectqty2);
    }

    protected void doSetExpectqty2_Equal(Long expectqty2) {
        regExpectqty2(CK_EQ, expectqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_NotEqual(Long expectqty2) {
        doSetExpectqty2_NotEqual(expectqty2);
    }

    protected void doSetExpectqty2_NotEqual(Long expectqty2) {
        regExpectqty2(CK_NES, expectqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_GreaterThan(Long expectqty2) {
        regExpectqty2(CK_GT, expectqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_LessThan(Long expectqty2) {
        regExpectqty2(CK_LT, expectqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_GreaterEqual(Long expectqty2) {
        regExpectqty2(CK_GE, expectqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_LessEqual(Long expectqty2) {
        regExpectqty2(CK_LE, expectqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty2(), "EXPECTQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2List The collection of expectqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty2_InScope(Collection<Long> expectqty2List) {
        doSetExpectqty2_InScope(expectqty2List);
    }

    protected void doSetExpectqty2_InScope(Collection<Long> expectqty2List) {
        regINS(CK_INS, cTL(expectqty2List), xgetCValueExpectqty2(), "EXPECTQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2List The collection of expectqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty2_NotInScope(Collection<Long> expectqty2List) {
        doSetExpectqty2_NotInScope(expectqty2List);
    }

    protected void doSetExpectqty2_NotInScope(Collection<Long> expectqty2List) {
        regINS(CK_NINS, cTL(expectqty2List), xgetCValueExpectqty2(), "EXPECTQTY2");
    }

    protected void regExpectqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty2(), "EXPECTQTY2"); }
    protected abstract ConditionValue xgetCValueExpectqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_Equal(Long expectqty3) {
        doSetExpectqty3_Equal(expectqty3);
    }

    protected void doSetExpectqty3_Equal(Long expectqty3) {
        regExpectqty3(CK_EQ, expectqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_NotEqual(Long expectqty3) {
        doSetExpectqty3_NotEqual(expectqty3);
    }

    protected void doSetExpectqty3_NotEqual(Long expectqty3) {
        regExpectqty3(CK_NES, expectqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_GreaterThan(Long expectqty3) {
        regExpectqty3(CK_GT, expectqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_LessThan(Long expectqty3) {
        regExpectqty3(CK_LT, expectqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_GreaterEqual(Long expectqty3) {
        regExpectqty3(CK_GE, expectqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_LessEqual(Long expectqty3) {
        regExpectqty3(CK_LE, expectqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty3(), "EXPECTQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3List The collection of expectqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty3_InScope(Collection<Long> expectqty3List) {
        doSetExpectqty3_InScope(expectqty3List);
    }

    protected void doSetExpectqty3_InScope(Collection<Long> expectqty3List) {
        regINS(CK_INS, cTL(expectqty3List), xgetCValueExpectqty3(), "EXPECTQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3List The collection of expectqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty3_NotInScope(Collection<Long> expectqty3List) {
        doSetExpectqty3_NotInScope(expectqty3List);
    }

    protected void doSetExpectqty3_NotInScope(Collection<Long> expectqty3List) {
        regINS(CK_NINS, cTL(expectqty3List), xgetCValueExpectqty3(), "EXPECTQTY3");
    }

    protected void regExpectqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty3(), "EXPECTQTY3"); }
    protected abstract ConditionValue xgetCValueExpectqty3();

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
    public HpSLCFunction<TTrpackrmdrCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpackrmdrCB.class);
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
    public HpSLCFunction<TTrpackrmdrCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpackrmdrCB.class);
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
    public HpSLCFunction<TTrpackrmdrCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpackrmdrCB.class);
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
    public HpSLCFunction<TTrpackrmdrCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpackrmdrCB.class);
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
    public HpSLCFunction<TTrpackrmdrCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpackrmdrCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpackrmdrCB&gt;() {
     *     public void query(TTrpackrmdrCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpackrmdrCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpackrmdrCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpackrmdrCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpackrmdrCQ sq);

    protected TTrpackrmdrCB xcreateScalarConditionCB() {
        TTrpackrmdrCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpackrmdrCB xcreateScalarConditionPartitionByCB() {
        TTrpackrmdrCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpackrmdrCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpackrmdrCB cb = new TTrpackrmdrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_REMAINING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpackrmdrCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpackrmdrCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpackrmdrCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpackrmdrCB cb = new TTrpackrmdrCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_REMAINING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpackrmdrCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpackrmdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpackrmdrCB cb = new TTrpackrmdrCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpackrmdrCQ sq);

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
    protected TTrpackrmdrCB newMyCB() {
        return new TTrpackrmdrCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpackrmdrCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

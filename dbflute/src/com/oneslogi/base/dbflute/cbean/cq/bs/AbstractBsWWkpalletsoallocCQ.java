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
 * The abstract condition-query of W_WKPALLETSOALLOC.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkpalletsoallocCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkpalletsoallocCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKPALLETSOALLOC";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocId The value of wkpalletsoallocId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_Equal(Long wkpalletsoallocId) {
        doSetWkpalletsoallocId_Equal(wkpalletsoallocId);
    }

    protected void doSetWkpalletsoallocId_Equal(Long wkpalletsoallocId) {
        regWkpalletsoallocId(CK_EQ, wkpalletsoallocId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocId The value of wkpalletsoallocId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_NotEqual(Long wkpalletsoallocId) {
        doSetWkpalletsoallocId_NotEqual(wkpalletsoallocId);
    }

    protected void doSetWkpalletsoallocId_NotEqual(Long wkpalletsoallocId) {
        regWkpalletsoallocId(CK_NES, wkpalletsoallocId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocId The value of wkpalletsoallocId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_GreaterThan(Long wkpalletsoallocId) {
        regWkpalletsoallocId(CK_GT, wkpalletsoallocId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocId The value of wkpalletsoallocId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_LessThan(Long wkpalletsoallocId) {
        regWkpalletsoallocId(CK_LT, wkpalletsoallocId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocId The value of wkpalletsoallocId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_GreaterEqual(Long wkpalletsoallocId) {
        regWkpalletsoallocId(CK_GE, wkpalletsoallocId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocId The value of wkpalletsoallocId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_LessEqual(Long wkpalletsoallocId) {
        regWkpalletsoallocId(CK_LE, wkpalletsoallocId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of wkpalletsoallocId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wkpalletsoallocId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWkpalletsoallocId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWkpalletsoallocId(), "WKPALLETSOALLOC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocIdList The collection of wkpalletsoallocId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_InScope(Collection<Long> wkpalletsoallocIdList) {
        doSetWkpalletsoallocId_InScope(wkpalletsoallocIdList);
    }

    protected void doSetWkpalletsoallocId_InScope(Collection<Long> wkpalletsoallocIdList) {
        regINS(CK_INS, cTL(wkpalletsoallocIdList), xgetCValueWkpalletsoallocId(), "WKPALLETSOALLOC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletsoallocIdList The collection of wkpalletsoallocId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWkpalletsoallocId_NotInScope(Collection<Long> wkpalletsoallocIdList) {
        doSetWkpalletsoallocId_NotInScope(wkpalletsoallocIdList);
    }

    protected void doSetWkpalletsoallocId_NotInScope(Collection<Long> wkpalletsoallocIdList) {
        regINS(CK_NINS, cTL(wkpalletsoallocIdList), xgetCValueWkpalletsoallocId(), "WKPALLETSOALLOC_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWkpalletsoallocId_IsNull() { regWkpalletsoallocId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWkpalletsoallocId_IsNotNull() { regWkpalletsoallocId(CK_ISNN, DOBJ); }

    protected void regWkpalletsoallocId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWkpalletsoallocId(), "WKPALLETSOALLOC_ID"); }
    protected abstract ConditionValue xgetCValueWkpalletsoallocId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_Equal(Long trpalletId) {
        doSetTrpalletId_Equal(trpalletId);
    }

    protected void doSetTrpalletId_Equal(Long trpalletId) {
        regTrpalletId(CK_EQ, trpalletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_NotEqual(Long trpalletId) {
        doSetTrpalletId_NotEqual(trpalletId);
    }

    protected void doSetTrpalletId_NotEqual(Long trpalletId) {
        regTrpalletId(CK_NES, trpalletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterThan(Long trpalletId) {
        regTrpalletId(CK_GT, trpalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessThan(Long trpalletId) {
        regTrpalletId(CK_LT, trpalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterEqual(Long trpalletId) {
        regTrpalletId(CK_GE, trpalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessEqual(Long trpalletId) {
        regTrpalletId(CK_LE, trpalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletId(), "TRPALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletIdList The collection of trpalletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_InScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_InScope(trpalletIdList);
    }

    protected void doSetTrpalletId_InScope(Collection<Long> trpalletIdList) {
        regINS(CK_INS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletIdList The collection of trpalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_NotInScope(trpalletIdList);
    }

    protected void doSetTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        regINS(CK_NINS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    protected void regTrpalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpalletId(), "TRPALLET_ID"); }
    protected abstract ConditionValue xgetCValueTrpalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_Equal(Long palletno) {
        doSetPalletno_Equal(palletno);
    }

    protected void doSetPalletno_Equal(Long palletno) {
        regPalletno(CK_EQ, palletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_NotEqual(Long palletno) {
        doSetPalletno_NotEqual(palletno);
    }

    protected void doSetPalletno_NotEqual(Long palletno) {
        regPalletno(CK_NES, palletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterThan(Long palletno) {
        regPalletno(CK_GT, palletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessThan(Long palletno) {
        regPalletno(CK_LT, palletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterEqual(Long palletno) {
        regPalletno(CK_GE, palletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessEqual(Long palletno) {
        regPalletno(CK_LE, palletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param minNumber The min number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletno(), "PALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletnoList The collection of palletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_InScope(Collection<Long> palletnoList) {
        doSetPalletno_InScope(palletnoList);
    }

    protected void doSetPalletno_InScope(Collection<Long> palletnoList) {
        regINS(CK_INS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletnoList The collection of palletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotInScope(Collection<Long> palletnoList) {
        doSetPalletno_NotInScope(palletnoList);
    }

    protected void doSetPalletno_NotInScope(Collection<Long> palletnoList) {
        regINS(CK_NINS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    protected void regPalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletno(), "PALLETNO"); }
    protected abstract ConditionValue xgetCValuePalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_Equal(Long receivePlanHId) {
        doSetReceivePlanHId_Equal(receivePlanHId);
    }

    protected void doSetReceivePlanHId_Equal(Long receivePlanHId) {
        regReceivePlanHId(CK_EQ, receivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotEqual(Long receivePlanHId) {
        doSetReceivePlanHId_NotEqual(receivePlanHId);
    }

    protected void doSetReceivePlanHId_NotEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_NES, receivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_InScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_INS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     */
    public void setReceivePlanHId_IsNull() { regReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     */
    public void setReceivePlanHId_IsNotNull() { regReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_Equal(Long rcvlineno) {
        doSetRcvlineno_Equal(rcvlineno);
    }

    protected void doSetRcvlineno_Equal(Long rcvlineno) {
        regRcvlineno(CK_EQ, rcvlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_NotEqual(Long rcvlineno) {
        doSetRcvlineno_NotEqual(rcvlineno);
    }

    protected void doSetRcvlineno_NotEqual(Long rcvlineno) {
        regRcvlineno(CK_NES, rcvlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(Long rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(Long rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(Long rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(Long rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_InScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        regINS(CK_INS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     */
    public void setRcvlineno_IsNull() { regRcvlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     */
    public void setRcvlineno_IsNotNull() { regRcvlineno(CK_ISNN, DOBJ); }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RCVLINENO"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_Equal(String printedflg) {
        doSetPrintedflg_Equal(fRES(printedflg));
    }

    protected void doSetPrintedflg_Equal(String printedflg) {
        regPrintedflg(CK_EQ, printedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotEqual(String printedflg) {
        doSetPrintedflg_NotEqual(fRES(printedflg));
    }

    protected void doSetPrintedflg_NotEqual(String printedflg) {
        regPrintedflg(CK_NES, printedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_InScope(Collection<String> printedflgList) {
        doSetPrintedflg_InScope(printedflgList);
    }

    protected void doSetPrintedflg_InScope(Collection<String> printedflgList) {
        regINS(CK_INS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotInScope(Collection<String> printedflgList) {
        doSetPrintedflg_NotInScope(printedflgList);
    }

    protected void doSetPrintedflg_NotInScope(Collection<String> printedflgList) {
        regINS(CK_NINS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printedflg The value of printedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintedflg_LikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_Equal(String printingdate) {
        doSetPrintingdate_Equal(fRES(printingdate));
    }

    protected void doSetPrintingdate_Equal(String printingdate) {
        regPrintingdate(CK_EQ, printingdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_NotEqual(String printingdate) {
        doSetPrintingdate_NotEqual(fRES(printingdate));
    }

    protected void doSetPrintingdate_NotEqual(String printingdate) {
        regPrintingdate(CK_NES, printingdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_GreaterThan(String printingdate) {
        regPrintingdate(CK_GT, fRES(printingdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_LessThan(String printingdate) {
        regPrintingdate(CK_LT, fRES(printingdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_GreaterEqual(String printingdate) {
        regPrintingdate(CK_GE, fRES(printingdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_LessEqual(String printingdate) {
        regPrintingdate(CK_LE, fRES(printingdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdateList The collection of printingdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_InScope(Collection<String> printingdateList) {
        doSetPrintingdate_InScope(printingdateList);
    }

    protected void doSetPrintingdate_InScope(Collection<String> printingdateList) {
        regINS(CK_INS, cTL(printingdateList), xgetCValuePrintingdate(), "PRINTINGDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdateList The collection of printingdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_NotInScope(Collection<String> printingdateList) {
        doSetPrintingdate_NotInScope(printingdateList);
    }

    protected void doSetPrintingdate_NotInScope(Collection<String> printingdateList) {
        regINS(CK_NINS, cTL(printingdateList), xgetCValuePrintingdate(), "PRINTINGDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setPrintingdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printingdate The value of printingdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintingdate_LikeSearch(String printingdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printingdate), xgetCValuePrintingdate(), "PRINTINGDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintingdate_NotLikeSearch(String printingdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printingdate), xgetCValuePrintingdate(), "PRINTINGDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @param printingdate The value of printingdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_PrefixSearch(String printingdate) {
        setPrintingdate_LikeSearch(printingdate, xcLSOPPre());
    }

    protected void regPrintingdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintingdate(), "PRINTINGDATE"); }
    protected abstract ConditionValue xgetCValuePrintingdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
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
     * FIRMCARRYNO: {varchar(30)}
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
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterThan(String firmcarryno) {
        regFirmcarryno(CK_GT, fRES(firmcarryno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessThan(String firmcarryno) {
        regFirmcarryno(CK_LT, fRES(firmcarryno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterEqual(String firmcarryno) {
        regFirmcarryno(CK_GE, fRES(firmcarryno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessEqual(String firmcarryno) {
        regFirmcarryno(CK_LE, fRES(firmcarryno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
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
     * FIRMCARRYNO: {varchar(30)}
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
     * FIRMCARRYNO: {varchar(30)} <br>
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
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmcarryno_NotLikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_PrefixSearch(String firmcarryno) {
        setFirmcarryno_LikeSearch(firmcarryno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNull() { regFirmcarryno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNullOrEmpty() { regFirmcarryno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNotNull() { regFirmcarryno(CK_ISNN, DOBJ); }

    protected void regFirmcarryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmcarryno(), "FIRMCARRYNO"); }
    protected abstract ConditionValue xgetCValueFirmcarryno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_Equal(String transportno) {
        doSetTransportno_Equal(fRES(transportno));
    }

    protected void doSetTransportno_Equal(String transportno) {
        regTransportno(CK_EQ, transportno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_NotEqual(String transportno) {
        doSetTransportno_NotEqual(fRES(transportno));
    }

    protected void doSetTransportno_NotEqual(String transportno) {
        regTransportno(CK_NES, transportno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_GreaterThan(String transportno) {
        regTransportno(CK_GT, fRES(transportno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_LessThan(String transportno) {
        regTransportno(CK_LT, fRES(transportno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_GreaterEqual(String transportno) {
        regTransportno(CK_GE, fRES(transportno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_LessEqual(String transportno) {
        regTransportno(CK_LE, fRES(transportno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportnoList The collection of transportno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_InScope(Collection<String> transportnoList) {
        doSetTransportno_InScope(transportnoList);
    }

    protected void doSetTransportno_InScope(Collection<String> transportnoList) {
        regINS(CK_INS, cTL(transportnoList), xgetCValueTransportno(), "TRANSPORTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportnoList The collection of transportno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_NotInScope(Collection<String> transportnoList) {
        doSetTransportno_NotInScope(transportnoList);
    }

    protected void doSetTransportno_NotInScope(Collection<String> transportnoList) {
        regINS(CK_NINS, cTL(transportnoList), xgetCValueTransportno(), "TRANSPORTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {varchar(30)} <br>
     * <pre>e.g. setTransportno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportno The value of transportno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportno_LikeSearch(String transportno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportno), xgetCValueTransportno(), "TRANSPORTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportno_NotLikeSearch(String transportno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportno), xgetCValueTransportno(), "TRANSPORTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     * @param transportno The value of transportno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_PrefixSearch(String transportno) {
        setTransportno_LikeSearch(transportno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     */
    public void setTransportno_IsNull() { regTransportno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     */
    public void setTransportno_IsNullOrEmpty() { regTransportno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTNO: {varchar(30)}
     */
    public void setTransportno_IsNotNull() { regTransportno(CK_ISNN, DOBJ); }

    protected void regTransportno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportno(), "TRANSPORTNO"); }
    protected abstract ConditionValue xgetCValueTransportno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_Equal(String sourcecd) {
        doSetSourcecd_Equal(fRES(sourcecd));
    }

    protected void doSetSourcecd_Equal(String sourcecd) {
        regSourcecd(CK_EQ, sourcecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_NotEqual(String sourcecd) {
        doSetSourcecd_NotEqual(fRES(sourcecd));
    }

    protected void doSetSourcecd_NotEqual(String sourcecd) {
        regSourcecd(CK_NES, sourcecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_GreaterThan(String sourcecd) {
        regSourcecd(CK_GT, fRES(sourcecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_LessThan(String sourcecd) {
        regSourcecd(CK_LT, fRES(sourcecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_GreaterEqual(String sourcecd) {
        regSourcecd(CK_GE, fRES(sourcecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_LessEqual(String sourcecd) {
        regSourcecd(CK_LE, fRES(sourcecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecdList The collection of sourcecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_InScope(Collection<String> sourcecdList) {
        doSetSourcecd_InScope(sourcecdList);
    }

    protected void doSetSourcecd_InScope(Collection<String> sourcecdList) {
        regINS(CK_INS, cTL(sourcecdList), xgetCValueSourcecd(), "SOURCECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecdList The collection of sourcecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_NotInScope(Collection<String> sourcecdList) {
        doSetSourcecd_NotInScope(sourcecdList);
    }

    protected void doSetSourcecd_NotInScope(Collection<String> sourcecdList) {
        regINS(CK_NINS, cTL(sourcecdList), xgetCValueSourcecd(), "SOURCECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCECD: {varchar(30)} <br>
     * <pre>e.g. setSourcecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourcecd The value of sourcecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcecd_LikeSearch(String sourcecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcecd), xgetCValueSourcecd(), "SOURCECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcecd_NotLikeSearch(String sourcecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcecd), xgetCValueSourcecd(), "SOURCECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCECD: {varchar(30)}
     * @param sourcecd The value of sourcecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_PrefixSearch(String sourcecd) {
        setSourcecd_LikeSearch(sourcecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     */
    public void setSourcecd_IsNull() { regSourcecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     */
    public void setSourcecd_IsNullOrEmpty() { regSourcecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCECD: {varchar(30)}
     */
    public void setSourcecd_IsNotNull() { regSourcecd(CK_ISNN, DOBJ); }

    protected void regSourcecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourcecd(), "SOURCECD"); }
    protected abstract ConditionValue xgetCValueSourcecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_Equal(String schdate) {
        doSetSchdate_Equal(fRES(schdate));
    }

    protected void doSetSchdate_Equal(String schdate) {
        regSchdate(CK_EQ, schdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotEqual(String schdate) {
        doSetSchdate_NotEqual(fRES(schdate));
    }

    protected void doSetSchdate_NotEqual(String schdate) {
        regSchdate(CK_NES, schdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterThan(String schdate) {
        regSchdate(CK_GT, fRES(schdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessThan(String schdate) {
        regSchdate(CK_LT, fRES(schdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterEqual(String schdate) {
        regSchdate(CK_GE, fRES(schdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessEqual(String schdate) {
        regSchdate(CK_LE, fRES(schdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdateList The collection of schdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_InScope(Collection<String> schdateList) {
        doSetSchdate_InScope(schdateList);
    }

    protected void doSetSchdate_InScope(Collection<String> schdateList) {
        regINS(CK_INS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdateList The collection of schdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotInScope(Collection<String> schdateList) {
        doSetSchdate_NotInScope(schdateList);
    }

    protected void doSetSchdate_NotInScope(Collection<String> schdateList) {
        regINS(CK_NINS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)} <br>
     * <pre>e.g. setSchdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schdate The value of schdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchdate_LikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchdate_NotLikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_PrefixSearch(String schdate) {
        setSchdate_LikeSearch(schdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNull() { regSchdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNullOrEmpty() { regSchdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNotNull() { regSchdate(CK_ISNN, DOBJ); }

    protected void regSchdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchdate(), "SCHDATE"); }
    protected abstract ConditionValue xgetCValueSchdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_Equal(String receivecd) {
        doSetReceivecd_Equal(fRES(receivecd));
    }

    protected void doSetReceivecd_Equal(String receivecd) {
        regReceivecd(CK_EQ, receivecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_NotEqual(String receivecd) {
        doSetReceivecd_NotEqual(fRES(receivecd));
    }

    protected void doSetReceivecd_NotEqual(String receivecd) {
        regReceivecd(CK_NES, receivecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_GreaterThan(String receivecd) {
        regReceivecd(CK_GT, fRES(receivecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_LessThan(String receivecd) {
        regReceivecd(CK_LT, fRES(receivecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_GreaterEqual(String receivecd) {
        regReceivecd(CK_GE, fRES(receivecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_LessEqual(String receivecd) {
        regReceivecd(CK_LE, fRES(receivecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecdList The collection of receivecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_InScope(Collection<String> receivecdList) {
        doSetReceivecd_InScope(receivecdList);
    }

    protected void doSetReceivecd_InScope(Collection<String> receivecdList) {
        regINS(CK_INS, cTL(receivecdList), xgetCValueReceivecd(), "RECEIVECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecdList The collection of receivecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_NotInScope(Collection<String> receivecdList) {
        doSetReceivecd_NotInScope(receivecdList);
    }

    protected void doSetReceivecd_NotInScope(Collection<String> receivecdList) {
        regINS(CK_NINS, cTL(receivecdList), xgetCValueReceivecd(), "RECEIVECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setReceivecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivecd The value of receivecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivecd_LikeSearch(String receivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivecd), xgetCValueReceivecd(), "RECEIVECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivecd_NotLikeSearch(String receivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivecd), xgetCValueReceivecd(), "RECEIVECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @param receivecd The value of receivecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_PrefixSearch(String receivecd) {
        setReceivecd_LikeSearch(receivecd, xcLSOPPre());
    }

    protected void regReceivecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivecd(), "RECEIVECD"); }
    protected abstract ConditionValue xgetCValueReceivecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_Equal(String rcvdate) {
        doSetRcvdate_Equal(fRES(rcvdate));
    }

    protected void doSetRcvdate_Equal(String rcvdate) {
        regRcvdate(CK_EQ, rcvdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotEqual(String rcvdate) {
        doSetRcvdate_NotEqual(fRES(rcvdate));
    }

    protected void doSetRcvdate_NotEqual(String rcvdate) {
        regRcvdate(CK_NES, rcvdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterThan(String rcvdate) {
        regRcvdate(CK_GT, fRES(rcvdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessThan(String rcvdate) {
        regRcvdate(CK_LT, fRES(rcvdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterEqual(String rcvdate) {
        regRcvdate(CK_GE, fRES(rcvdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessEqual(String rcvdate) {
        regRcvdate(CK_LE, fRES(rcvdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdateList The collection of rcvdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_InScope(Collection<String> rcvdateList) {
        doSetRcvdate_InScope(rcvdateList);
    }

    protected void doSetRcvdate_InScope(Collection<String> rcvdateList) {
        regINS(CK_INS, cTL(rcvdateList), xgetCValueRcvdate(), "RCVDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdateList The collection of rcvdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotInScope(Collection<String> rcvdateList) {
        doSetRcvdate_NotInScope(rcvdateList);
    }

    protected void doSetRcvdate_NotInScope(Collection<String> rcvdateList) {
        regINS(CK_NINS, cTL(rcvdateList), xgetCValueRcvdate(), "RCVDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {varchar(8)} <br>
     * <pre>e.g. setRcvdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvdate The value of rcvdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvdate_LikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvdate), xgetCValueRcvdate(), "RCVDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvdate_NotLikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvdate), xgetCValueRcvdate(), "RCVDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {varchar(8)}
     * @param rcvdate The value of rcvdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_PrefixSearch(String rcvdate) {
        setRcvdate_LikeSearch(rcvdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     */
    public void setRcvdate_IsNull() { regRcvdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     */
    public void setRcvdate_IsNullOrEmpty() { regRcvdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVDATE: {varchar(8)}
     */
    public void setRcvdate_IsNotNull() { regRcvdate(CK_ISNN, DOBJ); }

    protected void regRcvdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvdate(), "RCVDATE"); }
    protected abstract ConditionValue xgetCValueRcvdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_Equal(String receivedate) {
        doSetReceivedate_Equal(fRES(receivedate));
    }

    protected void doSetReceivedate_Equal(String receivedate) {
        regReceivedate(CK_EQ, receivedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotEqual(String receivedate) {
        doSetReceivedate_NotEqual(fRES(receivedate));
    }

    protected void doSetReceivedate_NotEqual(String receivedate) {
        regReceivedate(CK_NES, receivedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterThan(String receivedate) {
        regReceivedate(CK_GT, fRES(receivedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessThan(String receivedate) {
        regReceivedate(CK_LT, fRES(receivedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterEqual(String receivedate) {
        regReceivedate(CK_GE, fRES(receivedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessEqual(String receivedate) {
        regReceivedate(CK_LE, fRES(receivedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_InScope(Collection<String> receivedateList) {
        doSetReceivedate_InScope(receivedateList);
    }

    protected void doSetReceivedate_InScope(Collection<String> receivedateList) {
        regINS(CK_INS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotInScope(Collection<String> receivedateList) {
        doSetReceivedate_NotInScope(receivedateList);
    }

    protected void doSetReceivedate_NotInScope(Collection<String> receivedateList) {
        regINS(CK_NINS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)} <br>
     * <pre>e.g. setReceivedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedate The value of receivedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedate_LikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedate_NotLikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_PrefixSearch(String receivedate) {
        setReceivedate_LikeSearch(receivedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNull() { regReceivedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNullOrEmpty() { regReceivedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNotNull() { regReceivedate(CK_ISNN, DOBJ); }

    protected void regReceivedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedate(), "RECEIVEDATE"); }
    protected abstract ConditionValue xgetCValueReceivedate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {NotNull, varchar(30)}
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
     * LOT3: {NotNull, varchar(30)}
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
     * LOT3: {NotNull, varchar(30)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {NotNull, varchar(30)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {NotNull, varchar(30)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {NotNull, varchar(30)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {NotNull, varchar(30)}
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
     * LOT3: {NotNull, varchar(30)}
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
     * LOT3: {NotNull, varchar(30)} <br>
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
     * LOT3: {NotNull, varchar(30)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {NotNull, varchar(30)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
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
     * LIMITDATE: {NotNull, varchar(8)}
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
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterThan(String limitdate) {
        regLimitdate(CK_GT, fRES(limitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessThan(String limitdate) {
        regLimitdate(CK_LT, fRES(limitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterEqual(String limitdate) {
        regLimitdate(CK_GE, fRES(limitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessEqual(String limitdate) {
        regLimitdate(CK_LE, fRES(limitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
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
     * LIMITDATE: {NotNull, varchar(8)}
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
     * LIMITDATE: {NotNull, varchar(8)} <br>
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
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdate_NotLikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_PrefixSearch(String limitdate) {
        setLimitdate_LikeSearch(limitdate, xcLSOPPre());
    }

    protected void regLimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdate(), "LIMITDATE"); }
    protected abstract ConditionValue xgetCValueLimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_Equal(String batarticlesign) {
        doSetBatarticlesign_Equal(fRES(batarticlesign));
    }

    protected void doSetBatarticlesign_Equal(String batarticlesign) {
        regBatarticlesign(CK_EQ, batarticlesign);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_NotEqual(String batarticlesign) {
        doSetBatarticlesign_NotEqual(fRES(batarticlesign));
    }

    protected void doSetBatarticlesign_NotEqual(String batarticlesign) {
        regBatarticlesign(CK_NES, batarticlesign);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_GreaterThan(String batarticlesign) {
        regBatarticlesign(CK_GT, fRES(batarticlesign));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_LessThan(String batarticlesign) {
        regBatarticlesign(CK_LT, fRES(batarticlesign));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_GreaterEqual(String batarticlesign) {
        regBatarticlesign(CK_GE, fRES(batarticlesign));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_LessEqual(String batarticlesign) {
        regBatarticlesign(CK_LE, fRES(batarticlesign));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesignList The collection of batarticlesign as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_InScope(Collection<String> batarticlesignList) {
        doSetBatarticlesign_InScope(batarticlesignList);
    }

    protected void doSetBatarticlesign_InScope(Collection<String> batarticlesignList) {
        regINS(CK_INS, cTL(batarticlesignList), xgetCValueBatarticlesign(), "BATARTICLESIGN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesignList The collection of batarticlesign as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_NotInScope(Collection<String> batarticlesignList) {
        doSetBatarticlesign_NotInScope(batarticlesignList);
    }

    protected void doSetBatarticlesign_NotInScope(Collection<String> batarticlesignList) {
        regINS(CK_NINS, cTL(batarticlesignList), xgetCValueBatarticlesign(), "BATARTICLESIGN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATARTICLESIGN: {varchar(30)} <br>
     * <pre>e.g. setBatarticlesign_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batarticlesign The value of batarticlesign as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatarticlesign_LikeSearch(String batarticlesign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batarticlesign), xgetCValueBatarticlesign(), "BATARTICLESIGN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatarticlesign_NotLikeSearch(String batarticlesign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batarticlesign), xgetCValueBatarticlesign(), "BATARTICLESIGN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @param batarticlesign The value of batarticlesign as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatarticlesign_PrefixSearch(String batarticlesign) {
        setBatarticlesign_LikeSearch(batarticlesign, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     */
    public void setBatarticlesign_IsNull() { regBatarticlesign(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     */
    public void setBatarticlesign_IsNullOrEmpty() { regBatarticlesign(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATARTICLESIGN: {varchar(30)}
     */
    public void setBatarticlesign_IsNotNull() { regBatarticlesign(CK_ISNN, DOBJ); }

    protected void regBatarticlesign(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatarticlesign(), "BATARTICLESIGN"); }
    protected abstract ConditionValue xgetCValueBatarticlesign();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
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
     * OTHERLOT1: {varchar(60)}
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
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterThan(String otherlot1) {
        regOtherlot1(CK_GT, fRES(otherlot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessThan(String otherlot1) {
        regOtherlot1(CK_LT, fRES(otherlot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterEqual(String otherlot1) {
        regOtherlot1(CK_GE, fRES(otherlot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessEqual(String otherlot1) {
        regOtherlot1(CK_LE, fRES(otherlot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
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
     * OTHERLOT1: {varchar(60)}
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
     * OTHERLOT1: {varchar(60)} <br>
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
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot1_NotLikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_PrefixSearch(String otherlot1) {
        setOtherlot1_LikeSearch(otherlot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNull() { regOtherlot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNullOrEmpty() { regOtherlot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNotNull() { regOtherlot1(CK_ISNN, DOBJ); }

    protected void regOtherlot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1(), "OTHERLOT1"); }
    protected abstract ConditionValue xgetCValueOtherlot1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycase The value of receiveqtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_Equal(java.math.BigDecimal receiveqtycase) {
        doSetReceiveqtycase_Equal(receiveqtycase);
    }

    protected void doSetReceiveqtycase_Equal(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_EQ, receiveqtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycase The value of receiveqtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_NotEqual(java.math.BigDecimal receiveqtycase) {
        doSetReceiveqtycase_NotEqual(receiveqtycase);
    }

    protected void doSetReceiveqtycase_NotEqual(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_NES, receiveqtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycase The value of receiveqtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_GreaterThan(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_GT, receiveqtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycase The value of receiveqtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_LessThan(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_LT, receiveqtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycase The value of receiveqtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_GreaterEqual(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_GE, receiveqtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycase The value of receiveqtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_LessEqual(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_LE, receiveqtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of receiveqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveqtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveqtycase(), "RECEIVEQTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycaseList The collection of receiveqtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtycase_InScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        doSetReceiveqtycase_InScope(receiveqtycaseList);
    }

    protected void doSetReceiveqtycase_InScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        regINS(CK_INS, cTL(receiveqtycaseList), xgetCValueReceiveqtycase(), "RECEIVEQTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtycaseList The collection of receiveqtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtycase_NotInScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        doSetReceiveqtycase_NotInScope(receiveqtycaseList);
    }

    protected void doSetReceiveqtycase_NotInScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        regINS(CK_NINS, cTL(receiveqtycaseList), xgetCValueReceiveqtycase(), "RECEIVEQTYCASE");
    }

    protected void regReceiveqtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveqtycase(), "RECEIVEQTYCASE"); }
    protected abstract ConditionValue xgetCValueReceiveqtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowl The value of receiveqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_Equal(java.math.BigDecimal receiveqtybowl) {
        doSetReceiveqtybowl_Equal(receiveqtybowl);
    }

    protected void doSetReceiveqtybowl_Equal(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_EQ, receiveqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowl The value of receiveqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_NotEqual(java.math.BigDecimal receiveqtybowl) {
        doSetReceiveqtybowl_NotEqual(receiveqtybowl);
    }

    protected void doSetReceiveqtybowl_NotEqual(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_NES, receiveqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowl The value of receiveqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_GreaterThan(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_GT, receiveqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowl The value of receiveqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_LessThan(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_LT, receiveqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowl The value of receiveqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_GreaterEqual(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_GE, receiveqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowl The value of receiveqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_LessEqual(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_LE, receiveqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of receiveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveqtybowl(), "RECEIVEQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowlList The collection of receiveqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_InScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        doSetReceiveqtybowl_InScope(receiveqtybowlList);
    }

    protected void doSetReceiveqtybowl_InScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        regINS(CK_INS, cTL(receiveqtybowlList), xgetCValueReceiveqtybowl(), "RECEIVEQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtybowlList The collection of receiveqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_NotInScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        doSetReceiveqtybowl_NotInScope(receiveqtybowlList);
    }

    protected void doSetReceiveqtybowl_NotInScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        regINS(CK_NINS, cTL(receiveqtybowlList), xgetCValueReceiveqtybowl(), "RECEIVEQTYBOWL");
    }

    protected void regReceiveqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveqtybowl(), "RECEIVEQTYBOWL"); }
    protected abstract ConditionValue xgetCValueReceiveqtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqty The value of receiveqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_Equal(java.math.BigDecimal receiveqty) {
        doSetReceiveqty_Equal(receiveqty);
    }

    protected void doSetReceiveqty_Equal(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_EQ, receiveqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqty The value of receiveqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_NotEqual(java.math.BigDecimal receiveqty) {
        doSetReceiveqty_NotEqual(receiveqty);
    }

    protected void doSetReceiveqty_NotEqual(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_NES, receiveqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqty The value of receiveqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_GreaterThan(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_GT, receiveqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqty The value of receiveqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_LessThan(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_LT, receiveqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqty The value of receiveqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_GreaterEqual(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_GE, receiveqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqty The value of receiveqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_LessEqual(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_LE, receiveqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of receiveqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveqty(), "RECEIVEQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtyList The collection of receiveqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqty_InScope(Collection<java.math.BigDecimal> receiveqtyList) {
        doSetReceiveqty_InScope(receiveqtyList);
    }

    protected void doSetReceiveqty_InScope(Collection<java.math.BigDecimal> receiveqtyList) {
        regINS(CK_INS, cTL(receiveqtyList), xgetCValueReceiveqty(), "RECEIVEQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receiveqtyList The collection of receiveqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqty_NotInScope(Collection<java.math.BigDecimal> receiveqtyList) {
        doSetReceiveqty_NotInScope(receiveqtyList);
    }

    protected void doSetReceiveqty_NotInScope(Collection<java.math.BigDecimal> receiveqtyList) {
        regINS(CK_NINS, cTL(receiveqtyList), xgetCValueReceiveqty(), "RECEIVEQTY");
    }

    protected void regReceiveqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveqty(), "RECEIVEQTY"); }
    protected abstract ConditionValue xgetCValueReceiveqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycase The value of restqtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_Equal(java.math.BigDecimal restqtycase) {
        doSetRestqtycase_Equal(restqtycase);
    }

    protected void doSetRestqtycase_Equal(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_EQ, restqtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycase The value of restqtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_NotEqual(java.math.BigDecimal restqtycase) {
        doSetRestqtycase_NotEqual(restqtycase);
    }

    protected void doSetRestqtycase_NotEqual(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_NES, restqtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycase The value of restqtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_GreaterThan(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_GT, restqtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycase The value of restqtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_LessThan(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_LT, restqtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycase The value of restqtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_GreaterEqual(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_GE, restqtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycase The value of restqtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_LessEqual(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_LE, restqtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of restqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqtycase(), "RESTQTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycaseList The collection of restqtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtycase_InScope(Collection<java.math.BigDecimal> restqtycaseList) {
        doSetRestqtycase_InScope(restqtycaseList);
    }

    protected void doSetRestqtycase_InScope(Collection<java.math.BigDecimal> restqtycaseList) {
        regINS(CK_INS, cTL(restqtycaseList), xgetCValueRestqtycase(), "RESTQTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtycaseList The collection of restqtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtycase_NotInScope(Collection<java.math.BigDecimal> restqtycaseList) {
        doSetRestqtycase_NotInScope(restqtycaseList);
    }

    protected void doSetRestqtycase_NotInScope(Collection<java.math.BigDecimal> restqtycaseList) {
        regINS(CK_NINS, cTL(restqtycaseList), xgetCValueRestqtycase(), "RESTQTYCASE");
    }

    protected void regRestqtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqtycase(), "RESTQTYCASE"); }
    protected abstract ConditionValue xgetCValueRestqtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowl The value of restqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_Equal(java.math.BigDecimal restqtybowl) {
        doSetRestqtybowl_Equal(restqtybowl);
    }

    protected void doSetRestqtybowl_Equal(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_EQ, restqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowl The value of restqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_NotEqual(java.math.BigDecimal restqtybowl) {
        doSetRestqtybowl_NotEqual(restqtybowl);
    }

    protected void doSetRestqtybowl_NotEqual(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_NES, restqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowl The value of restqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_GreaterThan(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_GT, restqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowl The value of restqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_LessThan(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_LT, restqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowl The value of restqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_GreaterEqual(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_GE, restqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowl The value of restqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_LessEqual(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_LE, restqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of restqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqtybowl(), "RESTQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowlList The collection of restqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtybowl_InScope(Collection<java.math.BigDecimal> restqtybowlList) {
        doSetRestqtybowl_InScope(restqtybowlList);
    }

    protected void doSetRestqtybowl_InScope(Collection<java.math.BigDecimal> restqtybowlList) {
        regINS(CK_INS, cTL(restqtybowlList), xgetCValueRestqtybowl(), "RESTQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtybowlList The collection of restqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtybowl_NotInScope(Collection<java.math.BigDecimal> restqtybowlList) {
        doSetRestqtybowl_NotInScope(restqtybowlList);
    }

    protected void doSetRestqtybowl_NotInScope(Collection<java.math.BigDecimal> restqtybowlList) {
        regINS(CK_NINS, cTL(restqtybowlList), xgetCValueRestqtybowl(), "RESTQTYBOWL");
    }

    protected void regRestqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqtybowl(), "RESTQTYBOWL"); }
    protected abstract ConditionValue xgetCValueRestqtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqty The value of restqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_Equal(java.math.BigDecimal restqty) {
        doSetRestqty_Equal(restqty);
    }

    protected void doSetRestqty_Equal(java.math.BigDecimal restqty) {
        regRestqty(CK_EQ, restqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqty The value of restqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_NotEqual(java.math.BigDecimal restqty) {
        doSetRestqty_NotEqual(restqty);
    }

    protected void doSetRestqty_NotEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_NES, restqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqty The value of restqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_GreaterThan(java.math.BigDecimal restqty) {
        regRestqty(CK_GT, restqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqty The value of restqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_LessThan(java.math.BigDecimal restqty) {
        regRestqty(CK_LT, restqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqty The value of restqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_GreaterEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_GE, restqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqty The value of restqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_LessEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_LE, restqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of restqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqty(), "RESTQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtyList The collection of restqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqty_InScope(Collection<java.math.BigDecimal> restqtyList) {
        doSetRestqty_InScope(restqtyList);
    }

    protected void doSetRestqty_InScope(Collection<java.math.BigDecimal> restqtyList) {
        regINS(CK_INS, cTL(restqtyList), xgetCValueRestqty(), "RESTQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param restqtyList The collection of restqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqty_NotInScope(Collection<java.math.BigDecimal> restqtyList) {
        doSetRestqty_NotInScope(restqtyList);
    }

    protected void doSetRestqty_NotInScope(Collection<java.math.BigDecimal> restqtyList) {
        regINS(CK_NINS, cTL(restqtyList), xgetCValueRestqty(), "RESTQTY");
    }

    protected void regRestqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqty(), "RESTQTY"); }
    protected abstract ConditionValue xgetCValueRestqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_Equal(java.math.BigDecimal allocqty1) {
        doSetAllocqty1_Equal(allocqty1);
    }

    protected void doSetAllocqty1_Equal(java.math.BigDecimal allocqty1) {
        regAllocqty1(CK_EQ, allocqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_NotEqual(java.math.BigDecimal allocqty1) {
        doSetAllocqty1_NotEqual(allocqty1);
    }

    protected void doSetAllocqty1_NotEqual(java.math.BigDecimal allocqty1) {
        regAllocqty1(CK_NES, allocqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_GreaterThan(java.math.BigDecimal allocqty1) {
        regAllocqty1(CK_GT, allocqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_LessThan(java.math.BigDecimal allocqty1) {
        regAllocqty1(CK_LT, allocqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_GreaterEqual(java.math.BigDecimal allocqty1) {
        regAllocqty1(CK_GE, allocqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_LessEqual(java.math.BigDecimal allocqty1) {
        regAllocqty1(CK_LE, allocqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocqty1(), "ALLOCQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1List The collection of allocqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocqty1_InScope(Collection<java.math.BigDecimal> allocqty1List) {
        doSetAllocqty1_InScope(allocqty1List);
    }

    protected void doSetAllocqty1_InScope(Collection<java.math.BigDecimal> allocqty1List) {
        regINS(CK_INS, cTL(allocqty1List), xgetCValueAllocqty1(), "ALLOCQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocqty1List The collection of allocqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocqty1_NotInScope(Collection<java.math.BigDecimal> allocqty1List) {
        doSetAllocqty1_NotInScope(allocqty1List);
    }

    protected void doSetAllocqty1_NotInScope(Collection<java.math.BigDecimal> allocqty1List) {
        regINS(CK_NINS, cTL(allocqty1List), xgetCValueAllocqty1(), "ALLOCQTY1");
    }

    protected void regAllocqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocqty1(), "ALLOCQTY1"); }
    protected abstract ConditionValue xgetCValueAllocqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycase The value of tempallocqtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtycase_Equal(java.math.BigDecimal tempallocqtycase) {
        doSetTempallocqtycase_Equal(tempallocqtycase);
    }

    protected void doSetTempallocqtycase_Equal(java.math.BigDecimal tempallocqtycase) {
        regTempallocqtycase(CK_EQ, tempallocqtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycase The value of tempallocqtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtycase_NotEqual(java.math.BigDecimal tempallocqtycase) {
        doSetTempallocqtycase_NotEqual(tempallocqtycase);
    }

    protected void doSetTempallocqtycase_NotEqual(java.math.BigDecimal tempallocqtycase) {
        regTempallocqtycase(CK_NES, tempallocqtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycase The value of tempallocqtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtycase_GreaterThan(java.math.BigDecimal tempallocqtycase) {
        regTempallocqtycase(CK_GT, tempallocqtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycase The value of tempallocqtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtycase_LessThan(java.math.BigDecimal tempallocqtycase) {
        regTempallocqtycase(CK_LT, tempallocqtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycase The value of tempallocqtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtycase_GreaterEqual(java.math.BigDecimal tempallocqtycase) {
        regTempallocqtycase(CK_GE, tempallocqtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycase The value of tempallocqtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtycase_LessEqual(java.math.BigDecimal tempallocqtycase) {
        regTempallocqtycase(CK_LE, tempallocqtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of tempallocqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tempallocqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTempallocqtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTempallocqtycase(), "TEMPALLOCQTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycaseList The collection of tempallocqtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempallocqtycase_InScope(Collection<java.math.BigDecimal> tempallocqtycaseList) {
        doSetTempallocqtycase_InScope(tempallocqtycaseList);
    }

    protected void doSetTempallocqtycase_InScope(Collection<java.math.BigDecimal> tempallocqtycaseList) {
        regINS(CK_INS, cTL(tempallocqtycaseList), xgetCValueTempallocqtycase(), "TEMPALLOCQTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtycaseList The collection of tempallocqtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempallocqtycase_NotInScope(Collection<java.math.BigDecimal> tempallocqtycaseList) {
        doSetTempallocqtycase_NotInScope(tempallocqtycaseList);
    }

    protected void doSetTempallocqtycase_NotInScope(Collection<java.math.BigDecimal> tempallocqtycaseList) {
        regINS(CK_NINS, cTL(tempallocqtycaseList), xgetCValueTempallocqtycase(), "TEMPALLOCQTYCASE");
    }

    protected void regTempallocqtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTempallocqtycase(), "TEMPALLOCQTYCASE"); }
    protected abstract ConditionValue xgetCValueTempallocqtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowl The value of tempallocqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_Equal(java.math.BigDecimal tempallocqtybowl) {
        doSetTempallocqtybowl_Equal(tempallocqtybowl);
    }

    protected void doSetTempallocqtybowl_Equal(java.math.BigDecimal tempallocqtybowl) {
        regTempallocqtybowl(CK_EQ, tempallocqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowl The value of tempallocqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_NotEqual(java.math.BigDecimal tempallocqtybowl) {
        doSetTempallocqtybowl_NotEqual(tempallocqtybowl);
    }

    protected void doSetTempallocqtybowl_NotEqual(java.math.BigDecimal tempallocqtybowl) {
        regTempallocqtybowl(CK_NES, tempallocqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowl The value of tempallocqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_GreaterThan(java.math.BigDecimal tempallocqtybowl) {
        regTempallocqtybowl(CK_GT, tempallocqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowl The value of tempallocqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_LessThan(java.math.BigDecimal tempallocqtybowl) {
        regTempallocqtybowl(CK_LT, tempallocqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowl The value of tempallocqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_GreaterEqual(java.math.BigDecimal tempallocqtybowl) {
        regTempallocqtybowl(CK_GE, tempallocqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowl The value of tempallocqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_LessEqual(java.math.BigDecimal tempallocqtybowl) {
        regTempallocqtybowl(CK_LE, tempallocqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of tempallocqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tempallocqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTempallocqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTempallocqtybowl(), "TEMPALLOCQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowlList The collection of tempallocqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_InScope(Collection<java.math.BigDecimal> tempallocqtybowlList) {
        doSetTempallocqtybowl_InScope(tempallocqtybowlList);
    }

    protected void doSetTempallocqtybowl_InScope(Collection<java.math.BigDecimal> tempallocqtybowlList) {
        regINS(CK_INS, cTL(tempallocqtybowlList), xgetCValueTempallocqtybowl(), "TEMPALLOCQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tempallocqtybowlList The collection of tempallocqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempallocqtybowl_NotInScope(Collection<java.math.BigDecimal> tempallocqtybowlList) {
        doSetTempallocqtybowl_NotInScope(tempallocqtybowlList);
    }

    protected void doSetTempallocqtybowl_NotInScope(Collection<java.math.BigDecimal> tempallocqtybowlList) {
        regINS(CK_NINS, cTL(tempallocqtybowlList), xgetCValueTempallocqtybowl(), "TEMPALLOCQTYBOWL");
    }

    protected void regTempallocqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTempallocqtybowl(), "TEMPALLOCQTYBOWL"); }
    protected abstract ConditionValue xgetCValueTempallocqtybowl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_Equal(String fullpalletflg) {
        doSetFullpalletflg_Equal(fRES(fullpalletflg));
    }

    protected void doSetFullpalletflg_Equal(String fullpalletflg) {
        regFullpalletflg(CK_EQ, fullpalletflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_NotEqual(String fullpalletflg) {
        doSetFullpalletflg_NotEqual(fRES(fullpalletflg));
    }

    protected void doSetFullpalletflg_NotEqual(String fullpalletflg) {
        regFullpalletflg(CK_NES, fullpalletflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_GreaterThan(String fullpalletflg) {
        regFullpalletflg(CK_GT, fRES(fullpalletflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_LessThan(String fullpalletflg) {
        regFullpalletflg(CK_LT, fRES(fullpalletflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_GreaterEqual(String fullpalletflg) {
        regFullpalletflg(CK_GE, fRES(fullpalletflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_LessEqual(String fullpalletflg) {
        regFullpalletflg(CK_LE, fRES(fullpalletflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflgList The collection of fullpalletflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_InScope(Collection<String> fullpalletflgList) {
        doSetFullpalletflg_InScope(fullpalletflgList);
    }

    protected void doSetFullpalletflg_InScope(Collection<String> fullpalletflgList) {
        regINS(CK_INS, cTL(fullpalletflgList), xgetCValueFullpalletflg(), "FULLPALLETFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflgList The collection of fullpalletflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_NotInScope(Collection<String> fullpalletflgList) {
        doSetFullpalletflg_NotInScope(fullpalletflgList);
    }

    protected void doSetFullpalletflg_NotInScope(Collection<String> fullpalletflgList) {
        regINS(CK_NINS, cTL(fullpalletflgList), xgetCValueFullpalletflg(), "FULLPALLETFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setFullpalletflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fullpalletflg The value of fullpalletflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFullpalletflg_LikeSearch(String fullpalletflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fullpalletflg), xgetCValueFullpalletflg(), "FULLPALLETFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFullpalletflg_NotLikeSearch(String fullpalletflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fullpalletflg), xgetCValueFullpalletflg(), "FULLPALLETFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_PrefixSearch(String fullpalletflg) {
        setFullpalletflg_LikeSearch(fullpalletflg, xcLSOPPre());
    }

    protected void regFullpalletflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFullpalletflg(), "FULLPALLETFLG"); }
    protected abstract ConditionValue xgetCValueFullpalletflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_Equal(String palletsts) {
        doSetPalletsts_Equal(fRES(palletsts));
    }

    protected void doSetPalletsts_Equal(String palletsts) {
        regPalletsts(CK_EQ, palletsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_NotEqual(String palletsts) {
        doSetPalletsts_NotEqual(fRES(palletsts));
    }

    protected void doSetPalletsts_NotEqual(String palletsts) {
        regPalletsts(CK_NES, palletsts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_GreaterThan(String palletsts) {
        regPalletsts(CK_GT, fRES(palletsts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_LessThan(String palletsts) {
        regPalletsts(CK_LT, fRES(palletsts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_GreaterEqual(String palletsts) {
        regPalletsts(CK_GE, fRES(palletsts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_LessEqual(String palletsts) {
        regPalletsts(CK_LE, fRES(palletsts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletstsList The collection of palletsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_InScope(Collection<String> palletstsList) {
        doSetPalletsts_InScope(palletstsList);
    }

    protected void doSetPalletsts_InScope(Collection<String> palletstsList) {
        regINS(CK_INS, cTL(palletstsList), xgetCValuePalletsts(), "PALLETSTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletstsList The collection of palletsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_NotInScope(Collection<String> palletstsList) {
        doSetPalletsts_NotInScope(palletstsList);
    }

    protected void doSetPalletsts_NotInScope(Collection<String> palletstsList) {
        regINS(CK_NINS, cTL(palletstsList), xgetCValuePalletsts(), "PALLETSTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setPalletsts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletsts The value of palletsts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletsts_LikeSearch(String palletsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletsts), xgetCValuePalletsts(), "PALLETSTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletsts_NotLikeSearch(String palletsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletsts), xgetCValuePalletsts(), "PALLETSTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
     * @param palletsts The value of palletsts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_PrefixSearch(String palletsts) {
        setPalletsts_LikeSearch(palletsts, xcLSOPPre());
    }

    protected void regPalletsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletsts(), "PALLETSTS"); }
    protected abstract ConditionValue xgetCValuePalletsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_Equal(String pluralproductionkbn) {
        doSetPluralproductionkbn_Equal(fRES(pluralproductionkbn));
    }

    protected void doSetPluralproductionkbn_Equal(String pluralproductionkbn) {
        regPluralproductionkbn(CK_EQ, pluralproductionkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_NotEqual(String pluralproductionkbn) {
        doSetPluralproductionkbn_NotEqual(fRES(pluralproductionkbn));
    }

    protected void doSetPluralproductionkbn_NotEqual(String pluralproductionkbn) {
        regPluralproductionkbn(CK_NES, pluralproductionkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_GreaterThan(String pluralproductionkbn) {
        regPluralproductionkbn(CK_GT, fRES(pluralproductionkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_LessThan(String pluralproductionkbn) {
        regPluralproductionkbn(CK_LT, fRES(pluralproductionkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_GreaterEqual(String pluralproductionkbn) {
        regPluralproductionkbn(CK_GE, fRES(pluralproductionkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_LessEqual(String pluralproductionkbn) {
        regPluralproductionkbn(CK_LE, fRES(pluralproductionkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbnList The collection of pluralproductionkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_InScope(Collection<String> pluralproductionkbnList) {
        doSetPluralproductionkbn_InScope(pluralproductionkbnList);
    }

    protected void doSetPluralproductionkbn_InScope(Collection<String> pluralproductionkbnList) {
        regINS(CK_INS, cTL(pluralproductionkbnList), xgetCValuePluralproductionkbn(), "PLURALPRODUCTIONKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbnList The collection of pluralproductionkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_NotInScope(Collection<String> pluralproductionkbnList) {
        doSetPluralproductionkbn_NotInScope(pluralproductionkbnList);
    }

    protected void doSetPluralproductionkbn_NotInScope(Collection<String> pluralproductionkbnList) {
        regINS(CK_NINS, cTL(pluralproductionkbnList), xgetCValuePluralproductionkbn(), "PLURALPRODUCTIONKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setPluralproductionkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pluralproductionkbn The value of pluralproductionkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPluralproductionkbn_LikeSearch(String pluralproductionkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pluralproductionkbn), xgetCValuePluralproductionkbn(), "PLURALPRODUCTIONKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPluralproductionkbn_NotLikeSearch(String pluralproductionkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pluralproductionkbn), xgetCValuePluralproductionkbn(), "PLURALPRODUCTIONKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @param pluralproductionkbn The value of pluralproductionkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_PrefixSearch(String pluralproductionkbn) {
        setPluralproductionkbn_LikeSearch(pluralproductionkbn, xcLSOPPre());
    }

    protected void regPluralproductionkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePluralproductionkbn(), "PLURALPRODUCTIONKBN"); }
    protected abstract ConditionValue xgetCValuePluralproductionkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_Equal(String palletcuttingkbn) {
        doSetPalletcuttingkbn_Equal(fRES(palletcuttingkbn));
    }

    protected void doSetPalletcuttingkbn_Equal(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_EQ, palletcuttingkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_NotEqual(String palletcuttingkbn) {
        doSetPalletcuttingkbn_NotEqual(fRES(palletcuttingkbn));
    }

    protected void doSetPalletcuttingkbn_NotEqual(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_NES, palletcuttingkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_GreaterThan(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_GT, fRES(palletcuttingkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_LessThan(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_LT, fRES(palletcuttingkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_GreaterEqual(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_GE, fRES(palletcuttingkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_LessEqual(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_LE, fRES(palletcuttingkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbnList The collection of palletcuttingkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_InScope(Collection<String> palletcuttingkbnList) {
        doSetPalletcuttingkbn_InScope(palletcuttingkbnList);
    }

    protected void doSetPalletcuttingkbn_InScope(Collection<String> palletcuttingkbnList) {
        regINS(CK_INS, cTL(palletcuttingkbnList), xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbnList The collection of palletcuttingkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_NotInScope(Collection<String> palletcuttingkbnList) {
        doSetPalletcuttingkbn_NotInScope(palletcuttingkbnList);
    }

    protected void doSetPalletcuttingkbn_NotInScope(Collection<String> palletcuttingkbnList) {
        regINS(CK_NINS, cTL(palletcuttingkbnList), xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setPalletcuttingkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletcuttingkbn The value of palletcuttingkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletcuttingkbn_LikeSearch(String palletcuttingkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletcuttingkbn), xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletcuttingkbn_NotLikeSearch(String palletcuttingkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletcuttingkbn), xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @param palletcuttingkbn The value of palletcuttingkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_PrefixSearch(String palletcuttingkbn) {
        setPalletcuttingkbn_LikeSearch(palletcuttingkbn, xcLSOPPre());
    }

    protected void regPalletcuttingkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN"); }
    protected abstract ConditionValue xgetCValuePalletcuttingkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_Equal(String rcvpalletno) {
        doSetRcvpalletno_Equal(fRES(rcvpalletno));
    }

    protected void doSetRcvpalletno_Equal(String rcvpalletno) {
        regRcvpalletno(CK_EQ, rcvpalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotEqual(String rcvpalletno) {
        doSetRcvpalletno_NotEqual(fRES(rcvpalletno));
    }

    protected void doSetRcvpalletno_NotEqual(String rcvpalletno) {
        regRcvpalletno(CK_NES, rcvpalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterThan(String rcvpalletno) {
        regRcvpalletno(CK_GT, fRES(rcvpalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessThan(String rcvpalletno) {
        regRcvpalletno(CK_LT, fRES(rcvpalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterEqual(String rcvpalletno) {
        regRcvpalletno(CK_GE, fRES(rcvpalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessEqual(String rcvpalletno) {
        regRcvpalletno(CK_LE, fRES(rcvpalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_InScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        regINS(CK_INS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RCVPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_NotInScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        regINS(CK_NINS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RCVPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)} <br>
     * <pre>e.g. setRcvpalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvpalletno The value of rcvpalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvpalletno_LikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RCVPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvpalletno_NotLikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RCVPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_PrefixSearch(String rcvpalletno) {
        setRcvpalletno_LikeSearch(rcvpalletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNull() { regRcvpalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNullOrEmpty() { regRcvpalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNotNull() { regRcvpalletno(CK_ISNN, DOBJ); }

    protected void regRcvpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvpalletno(), "RCVPALLETNO"); }
    protected abstract ConditionValue xgetCValueRcvpalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_Equal(String palletaddflg) {
        doSetPalletaddflg_Equal(fRES(palletaddflg));
    }

    protected void doSetPalletaddflg_Equal(String palletaddflg) {
        regPalletaddflg(CK_EQ, palletaddflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_NotEqual(String palletaddflg) {
        doSetPalletaddflg_NotEqual(fRES(palletaddflg));
    }

    protected void doSetPalletaddflg_NotEqual(String palletaddflg) {
        regPalletaddflg(CK_NES, palletaddflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_GreaterThan(String palletaddflg) {
        regPalletaddflg(CK_GT, fRES(palletaddflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_LessThan(String palletaddflg) {
        regPalletaddflg(CK_LT, fRES(palletaddflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_GreaterEqual(String palletaddflg) {
        regPalletaddflg(CK_GE, fRES(palletaddflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_LessEqual(String palletaddflg) {
        regPalletaddflg(CK_LE, fRES(palletaddflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflgList The collection of palletaddflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_InScope(Collection<String> palletaddflgList) {
        doSetPalletaddflg_InScope(palletaddflgList);
    }

    protected void doSetPalletaddflg_InScope(Collection<String> palletaddflgList) {
        regINS(CK_INS, cTL(palletaddflgList), xgetCValuePalletaddflg(), "PALLETADDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflgList The collection of palletaddflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_NotInScope(Collection<String> palletaddflgList) {
        doSetPalletaddflg_NotInScope(palletaddflgList);
    }

    protected void doSetPalletaddflg_NotInScope(Collection<String> palletaddflgList) {
        regINS(CK_NINS, cTL(palletaddflgList), xgetCValuePalletaddflg(), "PALLETADDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]} <br>
     * <pre>e.g. setPalletaddflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletaddflg The value of palletaddflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletaddflg_LikeSearch(String palletaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletaddflg), xgetCValuePalletaddflg(), "PALLETADDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletaddflg_NotLikeSearch(String palletaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletaddflg), xgetCValuePalletaddflg(), "PALLETADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     * @param palletaddflg The value of palletaddflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletaddflg_PrefixSearch(String palletaddflg) {
        setPalletaddflg_LikeSearch(palletaddflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     */
    public void setPalletaddflg_IsNull() { regPalletaddflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETADDFLG: {char(1), default=[(2)]}
     */
    public void setPalletaddflg_IsNotNull() { regPalletaddflg(CK_ISNN, DOBJ); }

    protected void regPalletaddflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletaddflg(), "PALLETADDFLG"); }
    protected abstract ConditionValue xgetCValuePalletaddflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_Equal(String acceptusercd) {
        doSetAcceptusercd_Equal(fRES(acceptusercd));
    }

    protected void doSetAcceptusercd_Equal(String acceptusercd) {
        regAcceptusercd(CK_EQ, acceptusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_NotEqual(String acceptusercd) {
        doSetAcceptusercd_NotEqual(fRES(acceptusercd));
    }

    protected void doSetAcceptusercd_NotEqual(String acceptusercd) {
        regAcceptusercd(CK_NES, acceptusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_GreaterThan(String acceptusercd) {
        regAcceptusercd(CK_GT, fRES(acceptusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_LessThan(String acceptusercd) {
        regAcceptusercd(CK_LT, fRES(acceptusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_GreaterEqual(String acceptusercd) {
        regAcceptusercd(CK_GE, fRES(acceptusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_LessEqual(String acceptusercd) {
        regAcceptusercd(CK_LE, fRES(acceptusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercdList The collection of acceptusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_InScope(Collection<String> acceptusercdList) {
        doSetAcceptusercd_InScope(acceptusercdList);
    }

    protected void doSetAcceptusercd_InScope(Collection<String> acceptusercdList) {
        regINS(CK_INS, cTL(acceptusercdList), xgetCValueAcceptusercd(), "ACCEPTUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercdList The collection of acceptusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_NotInScope(Collection<String> acceptusercdList) {
        doSetAcceptusercd_NotInScope(acceptusercdList);
    }

    protected void doSetAcceptusercd_NotInScope(Collection<String> acceptusercdList) {
        regINS(CK_NINS, cTL(acceptusercdList), xgetCValueAcceptusercd(), "ACCEPTUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)} <br>
     * <pre>e.g. setAcceptusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param acceptusercd The value of acceptusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptusercd_LikeSearch(String acceptusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(acceptusercd), xgetCValueAcceptusercd(), "ACCEPTUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAcceptusercd_NotLikeSearch(String acceptusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(acceptusercd), xgetCValueAcceptusercd(), "ACCEPTUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_PrefixSearch(String acceptusercd) {
        setAcceptusercd_LikeSearch(acceptusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     */
    public void setAcceptusercd_IsNull() { regAcceptusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     */
    public void setAcceptusercd_IsNullOrEmpty() { regAcceptusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     */
    public void setAcceptusercd_IsNotNull() { regAcceptusercd(CK_ISNN, DOBJ); }

    protected void regAcceptusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptusercd(), "ACCEPTUSERCD"); }
    protected abstract ConditionValue xgetCValueAcceptusercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @param acceptdate The value of acceptdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptdate_Equal(java.sql.Timestamp acceptdate) {
        regAcceptdate(CK_EQ,  acceptdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @param acceptdate The value of acceptdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptdate_GreaterThan(java.sql.Timestamp acceptdate) {
        regAcceptdate(CK_GT,  acceptdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @param acceptdate The value of acceptdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptdate_LessThan(java.sql.Timestamp acceptdate) {
        regAcceptdate(CK_LT,  acceptdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @param acceptdate The value of acceptdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptdate_GreaterEqual(java.sql.Timestamp acceptdate) {
        regAcceptdate(CK_GE,  acceptdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @param acceptdate The value of acceptdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptdate_LessEqual(java.sql.Timestamp acceptdate) {
        regAcceptdate(CK_LE, acceptdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * <pre>e.g. setAcceptdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of acceptdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of acceptdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAcceptdate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueAcceptdate(), "ACCEPTDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of acceptdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of acceptdate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setAcceptdate_DateFromTo(Date fromDate, Date toDate) {
        setAcceptdate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     */
    public void setAcceptdate_IsNull() { regAcceptdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     */
    public void setAcceptdate_IsNotNull() { regAcceptdate(CK_ISNN, DOBJ); }

    protected void regAcceptdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptdate(), "ACCEPTDATE"); }
    protected abstract ConditionValue xgetCValueAcceptdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

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
    public HpSLCFunction<WWkpalletsoallocCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkpalletsoallocCB.class);
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
    public HpSLCFunction<WWkpalletsoallocCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkpalletsoallocCB.class);
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
    public HpSLCFunction<WWkpalletsoallocCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkpalletsoallocCB.class);
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
    public HpSLCFunction<WWkpalletsoallocCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkpalletsoallocCB.class);
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
    public HpSLCFunction<WWkpalletsoallocCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkpalletsoallocCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkpalletsoallocCB&gt;() {
     *     public void query(WWkpalletsoallocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkpalletsoallocCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkpalletsoallocCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletsoallocCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkpalletsoallocCQ sq);

    protected WWkpalletsoallocCB xcreateScalarConditionCB() {
        WWkpalletsoallocCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkpalletsoallocCB xcreateScalarConditionPartitionByCB() {
        WWkpalletsoallocCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WWkpalletsoallocCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletsoallocCB cb = new WWkpalletsoallocCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WKPALLETSOALLOC_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WWkpalletsoallocCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WWkpalletsoallocCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WWkpalletsoallocCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletsoallocCB cb = new WWkpalletsoallocCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WKPALLETSOALLOC_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WWkpalletsoallocCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WWkpalletsoallocCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WWkpalletsoallocCB cb = new WWkpalletsoallocCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WWkpalletsoallocCQ sq);

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
    protected WWkpalletsoallocCB newMyCB() {
        return new WWkpalletsoallocCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkpalletsoallocCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

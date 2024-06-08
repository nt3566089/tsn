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
 * The abstract condition-query of W_WKPALLET.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkpalletCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkpalletCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKPALLET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletId The value of wkpalletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletId_Equal(Long wkpalletId) {
        doSetWkpalletId_Equal(wkpalletId);
    }

    protected void doSetWkpalletId_Equal(Long wkpalletId) {
        regWkpalletId(CK_EQ, wkpalletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletId The value of wkpalletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletId_NotEqual(Long wkpalletId) {
        doSetWkpalletId_NotEqual(wkpalletId);
    }

    protected void doSetWkpalletId_NotEqual(Long wkpalletId) {
        regWkpalletId(CK_NES, wkpalletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletId The value of wkpalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletId_GreaterThan(Long wkpalletId) {
        regWkpalletId(CK_GT, wkpalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletId The value of wkpalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletId_LessThan(Long wkpalletId) {
        regWkpalletId(CK_LT, wkpalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletId The value of wkpalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletId_GreaterEqual(Long wkpalletId) {
        regWkpalletId(CK_GE, wkpalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletId The value of wkpalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWkpalletId_LessEqual(Long wkpalletId) {
        regWkpalletId(CK_LE, wkpalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of wkpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wkpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWkpalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWkpalletId(), "WKPALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletIdList The collection of wkpalletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWkpalletId_InScope(Collection<Long> wkpalletIdList) {
        doSetWkpalletId_InScope(wkpalletIdList);
    }

    protected void doSetWkpalletId_InScope(Collection<Long> wkpalletIdList) {
        regINS(CK_INS, cTL(wkpalletIdList), xgetCValueWkpalletId(), "WKPALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wkpalletIdList The collection of wkpalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWkpalletId_NotInScope(Collection<Long> wkpalletIdList) {
        doSetWkpalletId_NotInScope(wkpalletIdList);
    }

    protected void doSetWkpalletId_NotInScope(Collection<Long> wkpalletIdList) {
        regINS(CK_NINS, cTL(wkpalletIdList), xgetCValueWkpalletId(), "WKPALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWkpalletId_IsNull() { regWkpalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWkpalletId_IsNotNull() { regWkpalletId(CK_ISNN, DOBJ); }

    protected void regWkpalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWkpalletId(), "WKPALLET_ID"); }
    protected abstract ConditionValue xgetCValueWkpalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_Equal(java.math.BigDecimal palletno) {
        doSetPalletno_Equal(palletno);
    }

    protected void doSetPalletno_Equal(java.math.BigDecimal palletno) {
        regPalletno(CK_EQ, palletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_NotEqual(java.math.BigDecimal palletno) {
        doSetPalletno_NotEqual(palletno);
    }

    protected void doSetPalletno_NotEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_NES, palletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterThan(java.math.BigDecimal palletno) {
        regPalletno(CK_GT, palletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessThan(java.math.BigDecimal palletno) {
        regPalletno(CK_LT, palletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_GE, palletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_LE, palletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletno(), "PALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletnoList The collection of palletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_InScope(Collection<java.math.BigDecimal> palletnoList) {
        doSetPalletno_InScope(palletnoList);
    }

    protected void doSetPalletno_InScope(Collection<java.math.BigDecimal> palletnoList) {
        regINS(CK_INS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletnoList The collection of palletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotInScope(Collection<java.math.BigDecimal> palletnoList) {
        doSetPalletno_NotInScope(palletnoList);
    }

    protected void doSetPalletno_NotInScope(Collection<java.math.BigDecimal> palletnoList) {
        regINS(CK_NINS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    protected void regPalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletno(), "PALLETNO"); }
    protected abstract ConditionValue xgetCValuePalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkey The value of printkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_Equal(Long printkey) {
        doSetPrintkey_Equal(printkey);
    }

    protected void doSetPrintkey_Equal(Long printkey) {
        regPrintkey(CK_EQ, printkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkey The value of printkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_NotEqual(Long printkey) {
        doSetPrintkey_NotEqual(printkey);
    }

    protected void doSetPrintkey_NotEqual(Long printkey) {
        regPrintkey(CK_NES, printkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkey The value of printkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterThan(Long printkey) {
        regPrintkey(CK_GT, printkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkey The value of printkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessThan(Long printkey) {
        regPrintkey(CK_LT, printkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkey The value of printkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterEqual(Long printkey) {
        regPrintkey(CK_GE, printkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkey The value of printkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessEqual(Long printkey) {
        regPrintkey(CK_LE, printkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintkey(), "PRINTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkeyList The collection of printkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_InScope(Collection<Long> printkeyList) {
        doSetPrintkey_InScope(printkeyList);
    }

    protected void doSetPrintkey_InScope(Collection<Long> printkeyList) {
        regINS(CK_INS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @param printkeyList The collection of printkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_NotInScope(Collection<Long> printkeyList) {
        doSetPrintkey_NotInScope(printkeyList);
    }

    protected void doSetPrintkey_NotInScope(Collection<Long> printkeyList) {
        regINS(CK_NINS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    protected void regPrintkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintkey(), "PRINTKEY"); }
    protected abstract ConditionValue xgetCValuePrintkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
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
     * LotKey: {bigint(19)}
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
     * LotKey: {bigint(19)}
     * @param lotkey The value of lotkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterThan(Long lotkey) {
        regLotkey(CK_GT, lotkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
     * @param lotkey The value of lotkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessThan(Long lotkey) {
        regLotkey(CK_LT, lotkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
     * @param lotkey The value of lotkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterEqual(Long lotkey) {
        regLotkey(CK_GE, lotkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
     * @param lotkey The value of lotkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessEqual(Long lotkey) {
        regLotkey(CK_LE, lotkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
     * @param minNumber The min number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotkey(), "LotKey", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LotKey: {bigint(19)}
     * @param lotkeyList The collection of lotkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_InScope(Collection<Long> lotkeyList) {
        doSetLotkey_InScope(lotkeyList);
    }

    protected void doSetLotkey_InScope(Collection<Long> lotkeyList) {
        regINS(CK_INS, cTL(lotkeyList), xgetCValueLotkey(), "LotKey");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LotKey: {bigint(19)}
     * @param lotkeyList The collection of lotkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_NotInScope(Collection<Long> lotkeyList) {
        doSetLotkey_NotInScope(lotkeyList);
    }

    protected void doSetLotkey_NotInScope(Collection<Long> lotkeyList) {
        regINS(CK_NINS, cTL(lotkeyList), xgetCValueLotkey(), "LotKey");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
     */
    public void setLotkey_IsNull() { regLotkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LotKey: {bigint(19)}
     */
    public void setLotkey_IsNotNull() { regLotkey(CK_ISNN, DOBJ); }

    protected void regLotkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotkey(), "LotKey"); }
    protected abstract ConditionValue xgetCValueLotkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(java.math.BigDecimal rcvkey) {
        doSetRcvkey_Equal(rcvkey);
    }

    protected void doSetRcvkey_Equal(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        doSetRcvkey_NotEqual(rcvkey);
    }

    protected void doSetRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RcvKey", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RcvKey");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RcvKey");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RcvKey: {decimal(16, 6)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RcvKey"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
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
     * RcvLineNo: {bigint(19)}
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
     * RcvLineNo: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(Long rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(Long rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(Long rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(Long rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RcvLineNo", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RcvLineNo: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_InScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        regINS(CK_INS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RcvLineNo");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RcvLineNo: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RcvLineNo");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
     */
    public void setRcvlineno_IsNull() { regRcvlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RcvLineNo: {bigint(19)}
     */
    public void setRcvlineno_IsNotNull() { regRcvlineno(CK_ISNN, DOBJ); }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RcvLineNo"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)} <br>
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
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     */
    public void setPrintedflg_IsNull() { regPrintedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     */
    public void setPrintedflg_IsNotNull() { regPrintedflg(CK_ISNN, DOBJ); }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
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
     * PrintingDate: {varchar(8)}
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
     * PrintingDate: {varchar(8)}
     * @param printingdate The value of printingdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_GreaterThan(String printingdate) {
        regPrintingdate(CK_GT, fRES(printingdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdate The value of printingdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_LessThan(String printingdate) {
        regPrintingdate(CK_LT, fRES(printingdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdate The value of printingdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_GreaterEqual(String printingdate) {
        regPrintingdate(CK_GE, fRES(printingdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdate The value of printingdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_LessEqual(String printingdate) {
        regPrintingdate(CK_LE, fRES(printingdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdateList The collection of printingdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_InScope(Collection<String> printingdateList) {
        doSetPrintingdate_InScope(printingdateList);
    }

    protected void doSetPrintingdate_InScope(Collection<String> printingdateList) {
        regINS(CK_INS, cTL(printingdateList), xgetCValuePrintingdate(), "PrintingDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdateList The collection of printingdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_NotInScope(Collection<String> printingdateList) {
        doSetPrintingdate_NotInScope(printingdateList);
    }

    protected void doSetPrintingdate_NotInScope(Collection<String> printingdateList) {
        regINS(CK_NINS, cTL(printingdateList), xgetCValuePrintingdate(), "PrintingDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PrintingDate: {varchar(8)} <br>
     * <pre>e.g. setPrintingdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printingdate The value of printingdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintingdate_LikeSearch(String printingdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printingdate), xgetCValuePrintingdate(), "PrintingDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdate The value of printingdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintingdate_NotLikeSearch(String printingdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printingdate), xgetCValuePrintingdate(), "PrintingDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PrintingDate: {varchar(8)}
     * @param printingdate The value of printingdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_PrefixSearch(String printingdate) {
        setPrintingdate_LikeSearch(printingdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
     */
    public void setPrintingdate_IsNull() { regPrintingdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
     */
    public void setPrintingdate_IsNullOrEmpty() { regPrintingdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PrintingDate: {varchar(8)}
     */
    public void setPrintingdate_IsNotNull() { regPrintingdate(CK_ISNN, DOBJ); }

    protected void regPrintingdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintingdate(), "PrintingDate"); }
    protected abstract ConditionValue xgetCValuePrintingdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)} <br>
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
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

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
     * SourceCd: {varchar(30)}
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
     * SourceCd: {varchar(30)}
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
     * SourceCd: {varchar(30)}
     * @param sourcecd The value of sourcecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_GreaterThan(String sourcecd) {
        regSourcecd(CK_GT, fRES(sourcecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecd The value of sourcecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_LessThan(String sourcecd) {
        regSourcecd(CK_LT, fRES(sourcecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecd The value of sourcecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_GreaterEqual(String sourcecd) {
        regSourcecd(CK_GE, fRES(sourcecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecd The value of sourcecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_LessEqual(String sourcecd) {
        regSourcecd(CK_LE, fRES(sourcecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecdList The collection of sourcecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_InScope(Collection<String> sourcecdList) {
        doSetSourcecd_InScope(sourcecdList);
    }

    protected void doSetSourcecd_InScope(Collection<String> sourcecdList) {
        regINS(CK_INS, cTL(sourcecdList), xgetCValueSourcecd(), "SourceCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecdList The collection of sourcecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_NotInScope(Collection<String> sourcecdList) {
        doSetSourcecd_NotInScope(sourcecdList);
    }

    protected void doSetSourcecd_NotInScope(Collection<String> sourcecdList) {
        regINS(CK_NINS, cTL(sourcecdList), xgetCValueSourcecd(), "SourceCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SourceCd: {varchar(30)} <br>
     * <pre>e.g. setSourcecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourcecd The value of sourcecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcecd_LikeSearch(String sourcecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcecd), xgetCValueSourcecd(), "SourceCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecd The value of sourcecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcecd_NotLikeSearch(String sourcecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcecd), xgetCValueSourcecd(), "SourceCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SourceCd: {varchar(30)}
     * @param sourcecd The value of sourcecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecd_PrefixSearch(String sourcecd) {
        setSourcecd_LikeSearch(sourcecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SourceCd: {varchar(30)}
     */
    public void setSourcecd_IsNull() { regSourcecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SourceCd: {varchar(30)}
     */
    public void setSourcecd_IsNullOrEmpty() { regSourcecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SourceCd: {varchar(30)}
     */
    public void setSourcecd_IsNotNull() { regSourcecd(CK_ISNN, DOBJ); }

    protected void regSourcecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourcecd(), "SourceCd"); }
    protected abstract ConditionValue xgetCValueSourcecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
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
     * SchDate: {varchar(8)}
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
     * SchDate: {varchar(8)}
     * @param schdate The value of schdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterThan(String schdate) {
        regSchdate(CK_GT, fRES(schdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdate The value of schdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessThan(String schdate) {
        regSchdate(CK_LT, fRES(schdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdate The value of schdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterEqual(String schdate) {
        regSchdate(CK_GE, fRES(schdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdate The value of schdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessEqual(String schdate) {
        regSchdate(CK_LE, fRES(schdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdateList The collection of schdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_InScope(Collection<String> schdateList) {
        doSetSchdate_InScope(schdateList);
    }

    protected void doSetSchdate_InScope(Collection<String> schdateList) {
        regINS(CK_INS, cTL(schdateList), xgetCValueSchdate(), "SchDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdateList The collection of schdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotInScope(Collection<String> schdateList) {
        doSetSchdate_NotInScope(schdateList);
    }

    protected void doSetSchdate_NotInScope(Collection<String> schdateList) {
        regINS(CK_NINS, cTL(schdateList), xgetCValueSchdate(), "SchDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SchDate: {varchar(8)} <br>
     * <pre>e.g. setSchdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schdate The value of schdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchdate_LikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schdate), xgetCValueSchdate(), "SchDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdate The value of schdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchdate_NotLikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schdate), xgetCValueSchdate(), "SchDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SchDate: {varchar(8)}
     * @param schdate The value of schdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_PrefixSearch(String schdate) {
        setSchdate_LikeSearch(schdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
     */
    public void setSchdate_IsNull() { regSchdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
     */
    public void setSchdate_IsNullOrEmpty() { regSchdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SchDate: {varchar(8)}
     */
    public void setSchdate_IsNotNull() { regSchdate(CK_ISNN, DOBJ); }

    protected void regSchdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchdate(), "SchDate"); }
    protected abstract ConditionValue xgetCValueSchdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
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
     * ReceiveCd: {varchar(30)}
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
     * ReceiveCd: {varchar(30)}
     * @param receivecd The value of receivecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_GreaterThan(String receivecd) {
        regReceivecd(CK_GT, fRES(receivecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecd The value of receivecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_LessThan(String receivecd) {
        regReceivecd(CK_LT, fRES(receivecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecd The value of receivecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_GreaterEqual(String receivecd) {
        regReceivecd(CK_GE, fRES(receivecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecd The value of receivecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_LessEqual(String receivecd) {
        regReceivecd(CK_LE, fRES(receivecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecdList The collection of receivecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_InScope(Collection<String> receivecdList) {
        doSetReceivecd_InScope(receivecdList);
    }

    protected void doSetReceivecd_InScope(Collection<String> receivecdList) {
        regINS(CK_INS, cTL(receivecdList), xgetCValueReceivecd(), "ReceiveCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecdList The collection of receivecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_NotInScope(Collection<String> receivecdList) {
        doSetReceivecd_NotInScope(receivecdList);
    }

    protected void doSetReceivecd_NotInScope(Collection<String> receivecdList) {
        regINS(CK_NINS, cTL(receivecdList), xgetCValueReceivecd(), "ReceiveCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceiveCd: {varchar(30)} <br>
     * <pre>e.g. setReceivecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivecd The value of receivecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivecd_LikeSearch(String receivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivecd), xgetCValueReceivecd(), "ReceiveCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecd The value of receivecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivecd_NotLikeSearch(String receivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivecd), xgetCValueReceivecd(), "ReceiveCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceiveCd: {varchar(30)}
     * @param receivecd The value of receivecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_PrefixSearch(String receivecd) {
        setReceivecd_LikeSearch(receivecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
     */
    public void setReceivecd_IsNull() { regReceivecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
     */
    public void setReceivecd_IsNullOrEmpty() { regReceivecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReceiveCd: {varchar(30)}
     */
    public void setReceivecd_IsNotNull() { regReceivecd(CK_ISNN, DOBJ); }

    protected void regReceivecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivecd(), "ReceiveCd"); }
    protected abstract ConditionValue xgetCValueReceivecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
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
     * RcvDate: {varchar(8)}
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
     * RcvDate: {varchar(8)}
     * @param rcvdate The value of rcvdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterThan(String rcvdate) {
        regRcvdate(CK_GT, fRES(rcvdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdate The value of rcvdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessThan(String rcvdate) {
        regRcvdate(CK_LT, fRES(rcvdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdate The value of rcvdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterEqual(String rcvdate) {
        regRcvdate(CK_GE, fRES(rcvdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdate The value of rcvdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessEqual(String rcvdate) {
        regRcvdate(CK_LE, fRES(rcvdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdateList The collection of rcvdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_InScope(Collection<String> rcvdateList) {
        doSetRcvdate_InScope(rcvdateList);
    }

    protected void doSetRcvdate_InScope(Collection<String> rcvdateList) {
        regINS(CK_INS, cTL(rcvdateList), xgetCValueRcvdate(), "RcvDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdateList The collection of rcvdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotInScope(Collection<String> rcvdateList) {
        doSetRcvdate_NotInScope(rcvdateList);
    }

    protected void doSetRcvdate_NotInScope(Collection<String> rcvdateList) {
        regINS(CK_NINS, cTL(rcvdateList), xgetCValueRcvdate(), "RcvDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RcvDate: {varchar(8)} <br>
     * <pre>e.g. setRcvdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvdate The value of rcvdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvdate_LikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvdate), xgetCValueRcvdate(), "RcvDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdate The value of rcvdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvdate_NotLikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvdate), xgetCValueRcvdate(), "RcvDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RcvDate: {varchar(8)}
     * @param rcvdate The value of rcvdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_PrefixSearch(String rcvdate) {
        setRcvdate_LikeSearch(rcvdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
     */
    public void setRcvdate_IsNull() { regRcvdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
     */
    public void setRcvdate_IsNullOrEmpty() { regRcvdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RcvDate: {varchar(8)}
     */
    public void setRcvdate_IsNotNull() { regRcvdate(CK_ISNN, DOBJ); }

    protected void regRcvdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvdate(), "RcvDate"); }
    protected abstract ConditionValue xgetCValueRcvdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
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
     * ReceiveDate: {varchar(8)}
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
     * ReceiveDate: {varchar(8)}
     * @param receivedate The value of receivedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterThan(String receivedate) {
        regReceivedate(CK_GT, fRES(receivedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedate The value of receivedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessThan(String receivedate) {
        regReceivedate(CK_LT, fRES(receivedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedate The value of receivedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterEqual(String receivedate) {
        regReceivedate(CK_GE, fRES(receivedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedate The value of receivedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessEqual(String receivedate) {
        regReceivedate(CK_LE, fRES(receivedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedateList The collection of receivedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_InScope(Collection<String> receivedateList) {
        doSetReceivedate_InScope(receivedateList);
    }

    protected void doSetReceivedate_InScope(Collection<String> receivedateList) {
        regINS(CK_INS, cTL(receivedateList), xgetCValueReceivedate(), "ReceiveDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedateList The collection of receivedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotInScope(Collection<String> receivedateList) {
        doSetReceivedate_NotInScope(receivedateList);
    }

    protected void doSetReceivedate_NotInScope(Collection<String> receivedateList) {
        regINS(CK_NINS, cTL(receivedateList), xgetCValueReceivedate(), "ReceiveDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceiveDate: {varchar(8)} <br>
     * <pre>e.g. setReceivedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedate The value of receivedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedate_LikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedate), xgetCValueReceivedate(), "ReceiveDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedate The value of receivedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedate_NotLikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedate), xgetCValueReceivedate(), "ReceiveDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceiveDate: {varchar(8)}
     * @param receivedate The value of receivedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_PrefixSearch(String receivedate) {
        setReceivedate_LikeSearch(receivedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
     */
    public void setReceivedate_IsNull() { regReceivedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
     */
    public void setReceivedate_IsNullOrEmpty() { regReceivedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReceiveDate: {varchar(8)}
     */
    public void setReceivedate_IsNotNull() { regReceivedate(CK_ISNN, DOBJ); }

    protected void regReceivedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedate(), "ReceiveDate"); }
    protected abstract ConditionValue xgetCValueReceivedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)} <br>
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
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)} <br>
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
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
     * LOT3: {varchar(30)}
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
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)}
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
     * LOT3: {varchar(30)}
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
     * LOT3: {varchar(30)} <br>
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
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
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
     * LOT4: {varchar(8)}
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
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
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
     * LOT4: {varchar(8)}
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
     * LOT4: {varchar(8)} <br>
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
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)} <br>
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
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
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
     * ReceiveQtyCase: {decimal(16, 6)}
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
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param receiveqtycase The value of receiveqtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_GreaterThan(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_GT, receiveqtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param receiveqtycase The value of receiveqtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_LessThan(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_LT, receiveqtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param receiveqtycase The value of receiveqtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_GreaterEqual(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_GE, receiveqtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param receiveqtycase The value of receiveqtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtycase_LessEqual(java.math.BigDecimal receiveqtycase) {
        regReceiveqtycase(CK_LE, receiveqtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param minNumber The min number of receiveqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveqtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveqtycase(), "ReceiveQtyCase", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param receiveqtycaseList The collection of receiveqtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtycase_InScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        doSetReceiveqtycase_InScope(receiveqtycaseList);
    }

    protected void doSetReceiveqtycase_InScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        regINS(CK_INS, cTL(receiveqtycaseList), xgetCValueReceiveqtycase(), "ReceiveQtyCase");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @param receiveqtycaseList The collection of receiveqtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtycase_NotInScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        doSetReceiveqtycase_NotInScope(receiveqtycaseList);
    }

    protected void doSetReceiveqtycase_NotInScope(Collection<java.math.BigDecimal> receiveqtycaseList) {
        regINS(CK_NINS, cTL(receiveqtycaseList), xgetCValueReceiveqtycase(), "ReceiveQtyCase");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     */
    public void setReceiveqtycase_IsNull() { regReceiveqtycase(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     */
    public void setReceiveqtycase_IsNotNull() { regReceiveqtycase(CK_ISNN, DOBJ); }

    protected void regReceiveqtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveqtycase(), "ReceiveQtyCase"); }
    protected abstract ConditionValue xgetCValueReceiveqtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
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
     * ReceiveQtyBowl: {decimal(16, 6)}
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
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param receiveqtybowl The value of receiveqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_GreaterThan(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_GT, receiveqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param receiveqtybowl The value of receiveqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_LessThan(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_LT, receiveqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param receiveqtybowl The value of receiveqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_GreaterEqual(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_GE, receiveqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param receiveqtybowl The value of receiveqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_LessEqual(java.math.BigDecimal receiveqtybowl) {
        regReceiveqtybowl(CK_LE, receiveqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param minNumber The min number of receiveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveqtybowl(), "ReceiveQtyBowl", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param receiveqtybowlList The collection of receiveqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_InScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        doSetReceiveqtybowl_InScope(receiveqtybowlList);
    }

    protected void doSetReceiveqtybowl_InScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        regINS(CK_INS, cTL(receiveqtybowlList), xgetCValueReceiveqtybowl(), "ReceiveQtyBowl");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @param receiveqtybowlList The collection of receiveqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqtybowl_NotInScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        doSetReceiveqtybowl_NotInScope(receiveqtybowlList);
    }

    protected void doSetReceiveqtybowl_NotInScope(Collection<java.math.BigDecimal> receiveqtybowlList) {
        regINS(CK_NINS, cTL(receiveqtybowlList), xgetCValueReceiveqtybowl(), "ReceiveQtyBowl");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     */
    public void setReceiveqtybowl_IsNull() { regReceiveqtybowl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     */
    public void setReceiveqtybowl_IsNotNull() { regReceiveqtybowl(CK_ISNN, DOBJ); }

    protected void regReceiveqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveqtybowl(), "ReceiveQtyBowl"); }
    protected abstract ConditionValue xgetCValueReceiveqtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
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
     * ReceiveQty: {decimal(16, 6)}
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
     * ReceiveQty: {decimal(16, 6)}
     * @param receiveqty The value of receiveqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_GreaterThan(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_GT, receiveqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @param receiveqty The value of receiveqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_LessThan(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_LT, receiveqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @param receiveqty The value of receiveqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_GreaterEqual(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_GE, receiveqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @param receiveqty The value of receiveqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveqty_LessEqual(java.math.BigDecimal receiveqty) {
        regReceiveqty(CK_LE, receiveqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @param minNumber The min number of receiveqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveqty(), "ReceiveQty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @param receiveqtyList The collection of receiveqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqty_InScope(Collection<java.math.BigDecimal> receiveqtyList) {
        doSetReceiveqty_InScope(receiveqtyList);
    }

    protected void doSetReceiveqty_InScope(Collection<java.math.BigDecimal> receiveqtyList) {
        regINS(CK_INS, cTL(receiveqtyList), xgetCValueReceiveqty(), "ReceiveQty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @param receiveqtyList The collection of receiveqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveqty_NotInScope(Collection<java.math.BigDecimal> receiveqtyList) {
        doSetReceiveqty_NotInScope(receiveqtyList);
    }

    protected void doSetReceiveqty_NotInScope(Collection<java.math.BigDecimal> receiveqtyList) {
        regINS(CK_NINS, cTL(receiveqtyList), xgetCValueReceiveqty(), "ReceiveQty");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     */
    public void setReceiveqty_IsNull() { regReceiveqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReceiveQty: {decimal(16, 6)}
     */
    public void setReceiveqty_IsNotNull() { regReceiveqty(CK_ISNN, DOBJ); }

    protected void regReceiveqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveqty(), "ReceiveQty"); }
    protected abstract ConditionValue xgetCValueReceiveqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
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
     * RestQtyCase: {decimal(16, 6)}
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
     * RestQtyCase: {decimal(16, 6)}
     * @param restqtycase The value of restqtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_GreaterThan(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_GT, restqtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @param restqtycase The value of restqtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_LessThan(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_LT, restqtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @param restqtycase The value of restqtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_GreaterEqual(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_GE, restqtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @param restqtycase The value of restqtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtycase_LessEqual(java.math.BigDecimal restqtycase) {
        regRestqtycase(CK_LE, restqtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @param minNumber The min number of restqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqtycase(), "RestQtyCase", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @param restqtycaseList The collection of restqtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtycase_InScope(Collection<java.math.BigDecimal> restqtycaseList) {
        doSetRestqtycase_InScope(restqtycaseList);
    }

    protected void doSetRestqtycase_InScope(Collection<java.math.BigDecimal> restqtycaseList) {
        regINS(CK_INS, cTL(restqtycaseList), xgetCValueRestqtycase(), "RestQtyCase");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @param restqtycaseList The collection of restqtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtycase_NotInScope(Collection<java.math.BigDecimal> restqtycaseList) {
        doSetRestqtycase_NotInScope(restqtycaseList);
    }

    protected void doSetRestqtycase_NotInScope(Collection<java.math.BigDecimal> restqtycaseList) {
        regINS(CK_NINS, cTL(restqtycaseList), xgetCValueRestqtycase(), "RestQtyCase");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     */
    public void setRestqtycase_IsNull() { regRestqtycase(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RestQtyCase: {decimal(16, 6)}
     */
    public void setRestqtycase_IsNotNull() { regRestqtycase(CK_ISNN, DOBJ); }

    protected void regRestqtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqtycase(), "RestQtyCase"); }
    protected abstract ConditionValue xgetCValueRestqtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
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
     * RestQtyBowl: {decimal(16, 6)}
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
     * RestQtyBowl: {decimal(16, 6)}
     * @param restqtybowl The value of restqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_GreaterThan(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_GT, restqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @param restqtybowl The value of restqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_LessThan(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_LT, restqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @param restqtybowl The value of restqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_GreaterEqual(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_GE, restqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @param restqtybowl The value of restqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqtybowl_LessEqual(java.math.BigDecimal restqtybowl) {
        regRestqtybowl(CK_LE, restqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @param minNumber The min number of restqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqtybowl(), "RestQtyBowl", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @param restqtybowlList The collection of restqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtybowl_InScope(Collection<java.math.BigDecimal> restqtybowlList) {
        doSetRestqtybowl_InScope(restqtybowlList);
    }

    protected void doSetRestqtybowl_InScope(Collection<java.math.BigDecimal> restqtybowlList) {
        regINS(CK_INS, cTL(restqtybowlList), xgetCValueRestqtybowl(), "RestQtyBowl");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @param restqtybowlList The collection of restqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqtybowl_NotInScope(Collection<java.math.BigDecimal> restqtybowlList) {
        doSetRestqtybowl_NotInScope(restqtybowlList);
    }

    protected void doSetRestqtybowl_NotInScope(Collection<java.math.BigDecimal> restqtybowlList) {
        regINS(CK_NINS, cTL(restqtybowlList), xgetCValueRestqtybowl(), "RestQtyBowl");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     */
    public void setRestqtybowl_IsNull() { regRestqtybowl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RestQtyBowl: {decimal(16, 6)}
     */
    public void setRestqtybowl_IsNotNull() { regRestqtybowl(CK_ISNN, DOBJ); }

    protected void regRestqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqtybowl(), "RestQtyBowl"); }
    protected abstract ConditionValue xgetCValueRestqtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
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
     * RestQty: {decimal(16, 6)}
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
     * RestQty: {decimal(16, 6)}
     * @param restqty The value of restqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_GreaterThan(java.math.BigDecimal restqty) {
        regRestqty(CK_GT, restqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
     * @param restqty The value of restqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_LessThan(java.math.BigDecimal restqty) {
        regRestqty(CK_LT, restqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
     * @param restqty The value of restqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_GreaterEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_GE, restqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
     * @param restqty The value of restqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_LessEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_LE, restqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
     * @param minNumber The min number of restqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqty(), "RestQty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RestQty: {decimal(16, 6)}
     * @param restqtyList The collection of restqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqty_InScope(Collection<java.math.BigDecimal> restqtyList) {
        doSetRestqty_InScope(restqtyList);
    }

    protected void doSetRestqty_InScope(Collection<java.math.BigDecimal> restqtyList) {
        regINS(CK_INS, cTL(restqtyList), xgetCValueRestqty(), "RestQty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RestQty: {decimal(16, 6)}
     * @param restqtyList The collection of restqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqty_NotInScope(Collection<java.math.BigDecimal> restqtyList) {
        doSetRestqty_NotInScope(restqtyList);
    }

    protected void doSetRestqty_NotInScope(Collection<java.math.BigDecimal> restqtyList) {
        regINS(CK_NINS, cTL(restqtyList), xgetCValueRestqty(), "RestQty");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
     */
    public void setRestqty_IsNull() { regRestqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RestQty: {decimal(16, 6)}
     */
    public void setRestqty_IsNotNull() { regRestqty(CK_ISNN, DOBJ); }

    protected void regRestqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqty(), "RestQty"); }
    protected abstract ConditionValue xgetCValueRestqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletSts: {char(1)}
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
     * PalletSts: {char(1)}
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
     * PalletSts: {char(1)}
     * @param palletsts The value of palletsts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_GreaterThan(String palletsts) {
        regPalletsts(CK_GT, fRES(palletsts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletsts The value of palletsts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_LessThan(String palletsts) {
        regPalletsts(CK_LT, fRES(palletsts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletsts The value of palletsts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_GreaterEqual(String palletsts) {
        regPalletsts(CK_GE, fRES(palletsts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletsts The value of palletsts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_LessEqual(String palletsts) {
        regPalletsts(CK_LE, fRES(palletsts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletstsList The collection of palletsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_InScope(Collection<String> palletstsList) {
        doSetPalletsts_InScope(palletstsList);
    }

    protected void doSetPalletsts_InScope(Collection<String> palletstsList) {
        regINS(CK_INS, cTL(palletstsList), xgetCValuePalletsts(), "PalletSts");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletstsList The collection of palletsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_NotInScope(Collection<String> palletstsList) {
        doSetPalletsts_NotInScope(palletstsList);
    }

    protected void doSetPalletsts_NotInScope(Collection<String> palletstsList) {
        regINS(CK_NINS, cTL(palletstsList), xgetCValuePalletsts(), "PalletSts");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletSts: {char(1)} <br>
     * <pre>e.g. setPalletsts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletsts The value of palletsts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletsts_LikeSearch(String palletsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletsts), xgetCValuePalletsts(), "PalletSts", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletsts The value of palletsts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletsts_NotLikeSearch(String palletsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletsts), xgetCValuePalletsts(), "PalletSts", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletSts: {char(1)}
     * @param palletsts The value of palletsts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsts_PrefixSearch(String palletsts) {
        setPalletsts_LikeSearch(palletsts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PalletSts: {char(1)}
     */
    public void setPalletsts_IsNull() { regPalletsts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PalletSts: {char(1)}
     */
    public void setPalletsts_IsNotNull() { regPalletsts(CK_ISNN, DOBJ); }

    protected void regPalletsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletsts(), "PalletSts"); }
    protected abstract ConditionValue xgetCValuePalletsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PluralproductionKBN: {char(1)}
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
     * PluralproductionKBN: {char(1)}
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
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbn The value of pluralproductionkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_GreaterThan(String pluralproductionkbn) {
        regPluralproductionkbn(CK_GT, fRES(pluralproductionkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbn The value of pluralproductionkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_LessThan(String pluralproductionkbn) {
        regPluralproductionkbn(CK_LT, fRES(pluralproductionkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbn The value of pluralproductionkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_GreaterEqual(String pluralproductionkbn) {
        regPluralproductionkbn(CK_GE, fRES(pluralproductionkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbn The value of pluralproductionkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_LessEqual(String pluralproductionkbn) {
        regPluralproductionkbn(CK_LE, fRES(pluralproductionkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbnList The collection of pluralproductionkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_InScope(Collection<String> pluralproductionkbnList) {
        doSetPluralproductionkbn_InScope(pluralproductionkbnList);
    }

    protected void doSetPluralproductionkbn_InScope(Collection<String> pluralproductionkbnList) {
        regINS(CK_INS, cTL(pluralproductionkbnList), xgetCValuePluralproductionkbn(), "PluralproductionKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbnList The collection of pluralproductionkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_NotInScope(Collection<String> pluralproductionkbnList) {
        doSetPluralproductionkbn_NotInScope(pluralproductionkbnList);
    }

    protected void doSetPluralproductionkbn_NotInScope(Collection<String> pluralproductionkbnList) {
        regINS(CK_NINS, cTL(pluralproductionkbnList), xgetCValuePluralproductionkbn(), "PluralproductionKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PluralproductionKBN: {char(1)} <br>
     * <pre>e.g. setPluralproductionkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pluralproductionkbn The value of pluralproductionkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPluralproductionkbn_LikeSearch(String pluralproductionkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pluralproductionkbn), xgetCValuePluralproductionkbn(), "PluralproductionKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbn The value of pluralproductionkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPluralproductionkbn_NotLikeSearch(String pluralproductionkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pluralproductionkbn), xgetCValuePluralproductionkbn(), "PluralproductionKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PluralproductionKBN: {char(1)}
     * @param pluralproductionkbn The value of pluralproductionkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPluralproductionkbn_PrefixSearch(String pluralproductionkbn) {
        setPluralproductionkbn_LikeSearch(pluralproductionkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PluralproductionKBN: {char(1)}
     */
    public void setPluralproductionkbn_IsNull() { regPluralproductionkbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PluralproductionKBN: {char(1)}
     */
    public void setPluralproductionkbn_IsNotNull() { regPluralproductionkbn(CK_ISNN, DOBJ); }

    protected void regPluralproductionkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePluralproductionkbn(), "PluralproductionKBN"); }
    protected abstract ConditionValue xgetCValuePluralproductionkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_Equal(String rtnrcvkbn) {
        doSetRtnrcvkbn_Equal(fRES(rtnrcvkbn));
    }

    protected void doSetRtnrcvkbn_Equal(String rtnrcvkbn) {
        regRtnrcvkbn(CK_EQ, rtnrcvkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_NotEqual(String rtnrcvkbn) {
        doSetRtnrcvkbn_NotEqual(fRES(rtnrcvkbn));
    }

    protected void doSetRtnrcvkbn_NotEqual(String rtnrcvkbn) {
        regRtnrcvkbn(CK_NES, rtnrcvkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_GreaterThan(String rtnrcvkbn) {
        regRtnrcvkbn(CK_GT, fRES(rtnrcvkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_LessThan(String rtnrcvkbn) {
        regRtnrcvkbn(CK_LT, fRES(rtnrcvkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_GreaterEqual(String rtnrcvkbn) {
        regRtnrcvkbn(CK_GE, fRES(rtnrcvkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_LessEqual(String rtnrcvkbn) {
        regRtnrcvkbn(CK_LE, fRES(rtnrcvkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbnList The collection of rtnrcvkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_InScope(Collection<String> rtnrcvkbnList) {
        doSetRtnrcvkbn_InScope(rtnrcvkbnList);
    }

    protected void doSetRtnrcvkbn_InScope(Collection<String> rtnrcvkbnList) {
        regINS(CK_INS, cTL(rtnrcvkbnList), xgetCValueRtnrcvkbn(), "RtnRcvKbn");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbnList The collection of rtnrcvkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_NotInScope(Collection<String> rtnrcvkbnList) {
        doSetRtnrcvkbn_NotInScope(rtnrcvkbnList);
    }

    protected void doSetRtnrcvkbn_NotInScope(Collection<String> rtnrcvkbnList) {
        regINS(CK_NINS, cTL(rtnrcvkbnList), xgetCValueRtnrcvkbn(), "RtnRcvKbn");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RtnRcvKbn: {char(1)} <br>
     * <pre>e.g. setRtnrcvkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rtnrcvkbn The value of rtnrcvkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRtnrcvkbn_LikeSearch(String rtnrcvkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rtnrcvkbn), xgetCValueRtnrcvkbn(), "RtnRcvKbn", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRtnrcvkbn_NotLikeSearch(String rtnrcvkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rtnrcvkbn), xgetCValueRtnrcvkbn(), "RtnRcvKbn", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RtnRcvKbn: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_PrefixSearch(String rtnrcvkbn) {
        setRtnrcvkbn_LikeSearch(rtnrcvkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     */
    public void setRtnrcvkbn_IsNull() { regRtnrcvkbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RtnRcvKbn: {char(1)}
     */
    public void setRtnrcvkbn_IsNotNull() { regRtnrcvkbn(CK_ISNN, DOBJ); }

    protected void regRtnrcvkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRtnrcvkbn(), "RtnRcvKbn"); }
    protected abstract ConditionValue xgetCValueRtnrcvkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_Equal(String shtypecd) {
        doSetShtypecd_Equal(fRES(shtypecd));
    }

    protected void doSetShtypecd_Equal(String shtypecd) {
        regShtypecd(CK_EQ, shtypecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_NotEqual(String shtypecd) {
        doSetShtypecd_NotEqual(fRES(shtypecd));
    }

    protected void doSetShtypecd_NotEqual(String shtypecd) {
        regShtypecd(CK_NES, shtypecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_GreaterThan(String shtypecd) {
        regShtypecd(CK_GT, fRES(shtypecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_LessThan(String shtypecd) {
        regShtypecd(CK_LT, fRES(shtypecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_GreaterEqual(String shtypecd) {
        regShtypecd(CK_GE, fRES(shtypecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_LessEqual(String shtypecd) {
        regShtypecd(CK_LE, fRES(shtypecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecdList The collection of shtypecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_InScope(Collection<String> shtypecdList) {
        doSetShtypecd_InScope(shtypecdList);
    }

    protected void doSetShtypecd_InScope(Collection<String> shtypecdList) {
        regINS(CK_INS, cTL(shtypecdList), xgetCValueShtypecd(), "ShTypeCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecdList The collection of shtypecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_NotInScope(Collection<String> shtypecdList) {
        doSetShtypecd_NotInScope(shtypecdList);
    }

    protected void doSetShtypecd_NotInScope(Collection<String> shtypecdList) {
        regINS(CK_NINS, cTL(shtypecdList), xgetCValueShtypecd(), "ShTypeCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(30)} <br>
     * <pre>e.g. setShtypecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shtypecd The value of shtypecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShtypecd_LikeSearch(String shtypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shtypecd), xgetCValueShtypecd(), "ShTypeCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShtypecd_NotLikeSearch(String shtypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shtypecd), xgetCValueShtypecd(), "ShTypeCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(30)}
     * @param shtypecd The value of shtypecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_PrefixSearch(String shtypecd) {
        setShtypecd_LikeSearch(shtypecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     */
    public void setShtypecd_IsNull() { regShtypecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     */
    public void setShtypecd_IsNullOrEmpty() { regShtypecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(30)}
     */
    public void setShtypecd_IsNotNull() { regShtypecd(CK_ISNN, DOBJ); }

    protected void regShtypecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShtypecd(), "ShTypeCd"); }
    protected abstract ConditionValue xgetCValueShtypecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
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
     * PALLETCUTTINGKBN: {char(1)}
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
     * PALLETCUTTINGKBN: {char(1)}
     * @param palletcuttingkbn The value of palletcuttingkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_GreaterThan(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_GT, fRES(palletcuttingkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
     * @param palletcuttingkbn The value of palletcuttingkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_LessThan(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_LT, fRES(palletcuttingkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
     * @param palletcuttingkbn The value of palletcuttingkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_GreaterEqual(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_GE, fRES(palletcuttingkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
     * @param palletcuttingkbn The value of palletcuttingkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_LessEqual(String palletcuttingkbn) {
        regPalletcuttingkbn(CK_LE, fRES(palletcuttingkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
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
     * PALLETCUTTINGKBN: {char(1)}
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
     * PALLETCUTTINGKBN: {char(1)} <br>
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
     * PALLETCUTTINGKBN: {char(1)}
     * @param palletcuttingkbn The value of palletcuttingkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletcuttingkbn_NotLikeSearch(String palletcuttingkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletcuttingkbn), xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
     * @param palletcuttingkbn The value of palletcuttingkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcuttingkbn_PrefixSearch(String palletcuttingkbn) {
        setPalletcuttingkbn_LikeSearch(palletcuttingkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
     */
    public void setPalletcuttingkbn_IsNull() { regPalletcuttingkbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETCUTTINGKBN: {char(1)}
     */
    public void setPalletcuttingkbn_IsNotNull() { regPalletcuttingkbn(CK_ISNN, DOBJ); }

    protected void regPalletcuttingkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletcuttingkbn(), "PALLETCUTTINGKBN"); }
    protected abstract ConditionValue xgetCValuePalletcuttingkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_Equal(String loccd) {
        doSetLoccd_Equal(fRES(loccd));
    }

    protected void doSetLoccd_Equal(String loccd) {
        regLoccd(CK_EQ, loccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotEqual(String loccd) {
        doSetLoccd_NotEqual(fRES(loccd));
    }

    protected void doSetLoccd_NotEqual(String loccd) {
        regLoccd(CK_NES, loccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_InScope(Collection<String> loccdList) {
        doSetLoccd_InScope(loccdList);
    }

    protected void doSetLoccd_InScope(Collection<String> loccdList) {
        regINS(CK_INS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotInScope(Collection<String> loccdList) {
        doSetLoccd_NotInScope(loccdList);
    }

    protected void doSetLoccd_NotInScope(Collection<String> loccdList) {
        regINS(CK_NINS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)} <br>
     * <pre>e.g. setLoccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loccd The value of loccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoccd_LikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNull() { regLoccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNullOrEmpty() { regLoccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNotNull() { regLoccd(CK_ISNN, DOBJ); }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
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
     * RcvPalletNo: {varchar(30)}
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
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterThan(String rcvpalletno) {
        regRcvpalletno(CK_GT, fRES(rcvpalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessThan(String rcvpalletno) {
        regRcvpalletno(CK_LT, fRES(rcvpalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterEqual(String rcvpalletno) {
        regRcvpalletno(CK_GE, fRES(rcvpalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessEqual(String rcvpalletno) {
        regRcvpalletno(CK_LE, fRES(rcvpalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_InScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        regINS(CK_INS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RcvPalletNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_NotInScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        regINS(CK_NINS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RcvPalletNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RcvPalletNo: {varchar(30)} <br>
     * <pre>e.g. setRcvpalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvpalletno The value of rcvpalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvpalletno_LikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RcvPalletNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvpalletno_NotLikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RcvPalletNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_PrefixSearch(String rcvpalletno) {
        setRcvpalletno_LikeSearch(rcvpalletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     */
    public void setRcvpalletno_IsNull() { regRcvpalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     */
    public void setRcvpalletno_IsNullOrEmpty() { regRcvpalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RcvPalletNo: {varchar(30)}
     */
    public void setRcvpalletno_IsNotNull() { regRcvpalletno(CK_ISNN, DOBJ); }

    protected void regRcvpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvpalletno(), "RcvPalletNo"); }
    protected abstract ConditionValue xgetCValueRcvpalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_Equal(String imagename1) {
        doSetImagename1_Equal(fRES(imagename1));
    }

    protected void doSetImagename1_Equal(String imagename1) {
        regImagename1(CK_EQ, imagename1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_NotEqual(String imagename1) {
        doSetImagename1_NotEqual(fRES(imagename1));
    }

    protected void doSetImagename1_NotEqual(String imagename1) {
        regImagename1(CK_NES, imagename1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_GreaterThan(String imagename1) {
        regImagename1(CK_GT, fRES(imagename1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_LessThan(String imagename1) {
        regImagename1(CK_LT, fRES(imagename1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_GreaterEqual(String imagename1) {
        regImagename1(CK_GE, fRES(imagename1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_LessEqual(String imagename1) {
        regImagename1(CK_LE, fRES(imagename1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1List The collection of imagename1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_InScope(Collection<String> imagename1List) {
        doSetImagename1_InScope(imagename1List);
    }

    protected void doSetImagename1_InScope(Collection<String> imagename1List) {
        regINS(CK_INS, cTL(imagename1List), xgetCValueImagename1(), "IMAGENAME1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1List The collection of imagename1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_NotInScope(Collection<String> imagename1List) {
        doSetImagename1_NotInScope(imagename1List);
    }

    protected void doSetImagename1_NotInScope(Collection<String> imagename1List) {
        regINS(CK_NINS, cTL(imagename1List), xgetCValueImagename1(), "IMAGENAME1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME1: {varchar(4000)} <br>
     * <pre>e.g. setImagename1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param imagename1 The value of imagename1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImagename1_LikeSearch(String imagename1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(imagename1), xgetCValueImagename1(), "IMAGENAME1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImagename1_NotLikeSearch(String imagename1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(imagename1), xgetCValueImagename1(), "IMAGENAME1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     * @param imagename1 The value of imagename1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename1_PrefixSearch(String imagename1) {
        setImagename1_LikeSearch(imagename1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     */
    public void setImagename1_IsNull() { regImagename1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     */
    public void setImagename1_IsNullOrEmpty() { regImagename1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMAGENAME1: {varchar(4000)}
     */
    public void setImagename1_IsNotNull() { regImagename1(CK_ISNN, DOBJ); }

    protected void regImagename1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImagename1(), "IMAGENAME1"); }
    protected abstract ConditionValue xgetCValueImagename1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_Equal(String imagename2) {
        doSetImagename2_Equal(fRES(imagename2));
    }

    protected void doSetImagename2_Equal(String imagename2) {
        regImagename2(CK_EQ, imagename2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_NotEqual(String imagename2) {
        doSetImagename2_NotEqual(fRES(imagename2));
    }

    protected void doSetImagename2_NotEqual(String imagename2) {
        regImagename2(CK_NES, imagename2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_GreaterThan(String imagename2) {
        regImagename2(CK_GT, fRES(imagename2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_LessThan(String imagename2) {
        regImagename2(CK_LT, fRES(imagename2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_GreaterEqual(String imagename2) {
        regImagename2(CK_GE, fRES(imagename2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_LessEqual(String imagename2) {
        regImagename2(CK_LE, fRES(imagename2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2List The collection of imagename2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_InScope(Collection<String> imagename2List) {
        doSetImagename2_InScope(imagename2List);
    }

    protected void doSetImagename2_InScope(Collection<String> imagename2List) {
        regINS(CK_INS, cTL(imagename2List), xgetCValueImagename2(), "IMAGENAME2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2List The collection of imagename2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_NotInScope(Collection<String> imagename2List) {
        doSetImagename2_NotInScope(imagename2List);
    }

    protected void doSetImagename2_NotInScope(Collection<String> imagename2List) {
        regINS(CK_NINS, cTL(imagename2List), xgetCValueImagename2(), "IMAGENAME2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME2: {varchar(4000)} <br>
     * <pre>e.g. setImagename2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param imagename2 The value of imagename2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImagename2_LikeSearch(String imagename2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(imagename2), xgetCValueImagename2(), "IMAGENAME2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImagename2_NotLikeSearch(String imagename2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(imagename2), xgetCValueImagename2(), "IMAGENAME2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     * @param imagename2 The value of imagename2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename2_PrefixSearch(String imagename2) {
        setImagename2_LikeSearch(imagename2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     */
    public void setImagename2_IsNull() { regImagename2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     */
    public void setImagename2_IsNullOrEmpty() { regImagename2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMAGENAME2: {varchar(4000)}
     */
    public void setImagename2_IsNotNull() { regImagename2(CK_ISNN, DOBJ); }

    protected void regImagename2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImagename2(), "IMAGENAME2"); }
    protected abstract ConditionValue xgetCValueImagename2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_Equal(String imagename3) {
        doSetImagename3_Equal(fRES(imagename3));
    }

    protected void doSetImagename3_Equal(String imagename3) {
        regImagename3(CK_EQ, imagename3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_NotEqual(String imagename3) {
        doSetImagename3_NotEqual(fRES(imagename3));
    }

    protected void doSetImagename3_NotEqual(String imagename3) {
        regImagename3(CK_NES, imagename3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_GreaterThan(String imagename3) {
        regImagename3(CK_GT, fRES(imagename3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_LessThan(String imagename3) {
        regImagename3(CK_LT, fRES(imagename3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_GreaterEqual(String imagename3) {
        regImagename3(CK_GE, fRES(imagename3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_LessEqual(String imagename3) {
        regImagename3(CK_LE, fRES(imagename3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3List The collection of imagename3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_InScope(Collection<String> imagename3List) {
        doSetImagename3_InScope(imagename3List);
    }

    protected void doSetImagename3_InScope(Collection<String> imagename3List) {
        regINS(CK_INS, cTL(imagename3List), xgetCValueImagename3(), "IMAGENAME3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3List The collection of imagename3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_NotInScope(Collection<String> imagename3List) {
        doSetImagename3_NotInScope(imagename3List);
    }

    protected void doSetImagename3_NotInScope(Collection<String> imagename3List) {
        regINS(CK_NINS, cTL(imagename3List), xgetCValueImagename3(), "IMAGENAME3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME3: {varchar(4000)} <br>
     * <pre>e.g. setImagename3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param imagename3 The value of imagename3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImagename3_LikeSearch(String imagename3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(imagename3), xgetCValueImagename3(), "IMAGENAME3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImagename3_NotLikeSearch(String imagename3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(imagename3), xgetCValueImagename3(), "IMAGENAME3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     * @param imagename3 The value of imagename3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImagename3_PrefixSearch(String imagename3) {
        setImagename3_LikeSearch(imagename3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     */
    public void setImagename3_IsNull() { regImagename3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     */
    public void setImagename3_IsNullOrEmpty() { regImagename3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMAGENAME3: {varchar(4000)}
     */
    public void setImagename3_IsNotNull() { regImagename3(CK_ISNN, DOBJ); }

    protected void regImagename3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImagename3(), "IMAGENAME3"); }
    protected abstract ConditionValue xgetCValueImagename3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_Equal(String warehouseSname) {
        doSetWarehouseSname_Equal(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_Equal(String warehouseSname) {
        regWarehouseSname(CK_EQ, warehouseSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotEqual(String warehouseSname) {
        doSetWarehouseSname_NotEqual(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_NotEqual(String warehouseSname) {
        regWarehouseSname(CK_NES, warehouseSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterThan(String warehouseSname) {
        regWarehouseSname(CK_GT, fRES(warehouseSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessThan(String warehouseSname) {
        regWarehouseSname(CK_LT, fRES(warehouseSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterEqual(String warehouseSname) {
        regWarehouseSname(CK_GE, fRES(warehouseSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessEqual(String warehouseSname) {
        regWarehouseSname(CK_LE, fRES(warehouseSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSnameList The collection of warehouseSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_InScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        regINS(CK_INS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSnameList The collection of warehouseSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_NotInScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        regINS(CK_NINS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)} <br>
     * <pre>e.g. setWarehouseSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseSname The value of warehouseSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseSname_LikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseSname_NotLikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @param warehouseSname The value of warehouseSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_PrefixSearch(String warehouseSname) {
        setWarehouseSname_LikeSearch(warehouseSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     */
    public void setWarehouseSname_IsNull() { regWarehouseSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     */
    public void setWarehouseSname_IsNullOrEmpty() { regWarehouseSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     */
    public void setWarehouseSname_IsNotNull() { regWarehouseSname(CK_ISNN, DOBJ); }

    protected void regWarehouseSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseSname(), "WAREHOUSE_SNAME"); }
    protected abstract ConditionValue xgetCValueWarehouseSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_Equal(String itemSname) {
        doSetItemSname_Equal(fRES(itemSname));
    }

    protected void doSetItemSname_Equal(String itemSname) {
        regItemSname(CK_EQ, itemSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_NotEqual(String itemSname) {
        doSetItemSname_NotEqual(fRES(itemSname));
    }

    protected void doSetItemSname_NotEqual(String itemSname) {
        regItemSname(CK_NES, itemSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_GreaterThan(String itemSname) {
        regItemSname(CK_GT, fRES(itemSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_LessThan(String itemSname) {
        regItemSname(CK_LT, fRES(itemSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_GreaterEqual(String itemSname) {
        regItemSname(CK_GE, fRES(itemSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_LessEqual(String itemSname) {
        regItemSname(CK_LE, fRES(itemSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSnameList The collection of itemSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_InScope(Collection<String> itemSnameList) {
        doSetItemSname_InScope(itemSnameList);
    }

    protected void doSetItemSname_InScope(Collection<String> itemSnameList) {
        regINS(CK_INS, cTL(itemSnameList), xgetCValueItemSname(), "ITEM_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSnameList The collection of itemSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_NotInScope(Collection<String> itemSnameList) {
        doSetItemSname_NotInScope(itemSnameList);
    }

    protected void doSetItemSname_NotInScope(Collection<String> itemSnameList) {
        regINS(CK_NINS, cTL(itemSnameList), xgetCValueItemSname(), "ITEM_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {varchar(100)} <br>
     * <pre>e.g. setItemSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemSname The value of itemSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemSname_LikeSearch(String itemSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemSname), xgetCValueItemSname(), "ITEM_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemSname_NotLikeSearch(String itemSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemSname), xgetCValueItemSname(), "ITEM_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     * @param itemSname The value of itemSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_PrefixSearch(String itemSname) {
        setItemSname_LikeSearch(itemSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     */
    public void setItemSname_IsNull() { regItemSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     */
    public void setItemSname_IsNullOrEmpty() { regItemSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME: {varchar(100)}
     */
    public void setItemSname_IsNotNull() { regItemSname(CK_ISNN, DOBJ); }

    protected void regItemSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSname(), "ITEM_SNAME"); }
    protected abstract ConditionValue xgetCValueItemSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_Equal(String foreigncargocd) {
        doSetForeigncargocd_Equal(fRES(foreigncargocd));
    }

    protected void doSetForeigncargocd_Equal(String foreigncargocd) {
        regForeigncargocd(CK_EQ, foreigncargocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_NotEqual(String foreigncargocd) {
        doSetForeigncargocd_NotEqual(fRES(foreigncargocd));
    }

    protected void doSetForeigncargocd_NotEqual(String foreigncargocd) {
        regForeigncargocd(CK_NES, foreigncargocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_GreaterThan(String foreigncargocd) {
        regForeigncargocd(CK_GT, fRES(foreigncargocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_LessThan(String foreigncargocd) {
        regForeigncargocd(CK_LT, fRES(foreigncargocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_GreaterEqual(String foreigncargocd) {
        regForeigncargocd(CK_GE, fRES(foreigncargocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_LessEqual(String foreigncargocd) {
        regForeigncargocd(CK_LE, fRES(foreigncargocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocdList The collection of foreigncargocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_InScope(Collection<String> foreigncargocdList) {
        doSetForeigncargocd_InScope(foreigncargocdList);
    }

    protected void doSetForeigncargocd_InScope(Collection<String> foreigncargocdList) {
        regINS(CK_INS, cTL(foreigncargocdList), xgetCValueForeigncargocd(), "FOREIGNCARGOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocdList The collection of foreigncargocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_NotInScope(Collection<String> foreigncargocdList) {
        doSetForeigncargocd_NotInScope(foreigncargocdList);
    }

    protected void doSetForeigncargocd_NotInScope(Collection<String> foreigncargocdList) {
        regINS(CK_NINS, cTL(foreigncargocdList), xgetCValueForeigncargocd(), "FOREIGNCARGOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOCD: {char(1)} <br>
     * <pre>e.g. setForeigncargocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foreigncargocd The value of foreigncargocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setForeigncargocd_LikeSearch(String foreigncargocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foreigncargocd), xgetCValueForeigncargocd(), "FOREIGNCARGOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setForeigncargocd_NotLikeSearch(String foreigncargocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foreigncargocd), xgetCValueForeigncargocd(), "FOREIGNCARGOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @param foreigncargocd The value of foreigncargocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargocd_PrefixSearch(String foreigncargocd) {
        setForeigncargocd_LikeSearch(foreigncargocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     */
    public void setForeigncargocd_IsNull() { regForeigncargocd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOCD: {char(1)}
     */
    public void setForeigncargocd_IsNotNull() { regForeigncargocd(CK_ISNN, DOBJ); }

    protected void regForeigncargocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargocd(), "FOREIGNCARGOCD"); }
    protected abstract ConditionValue xgetCValueForeigncargocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_Equal(String carrierseq) {
        doSetCarrierseq_Equal(fRES(carrierseq));
    }

    protected void doSetCarrierseq_Equal(String carrierseq) {
        regCarrierseq(CK_EQ, carrierseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_NotEqual(String carrierseq) {
        doSetCarrierseq_NotEqual(fRES(carrierseq));
    }

    protected void doSetCarrierseq_NotEqual(String carrierseq) {
        regCarrierseq(CK_NES, carrierseq);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_GreaterThan(String carrierseq) {
        regCarrierseq(CK_GT, fRES(carrierseq));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_LessThan(String carrierseq) {
        regCarrierseq(CK_LT, fRES(carrierseq));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_GreaterEqual(String carrierseq) {
        regCarrierseq(CK_GE, fRES(carrierseq));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_LessEqual(String carrierseq) {
        regCarrierseq(CK_LE, fRES(carrierseq));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseqList The collection of carrierseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_InScope(Collection<String> carrierseqList) {
        doSetCarrierseq_InScope(carrierseqList);
    }

    protected void doSetCarrierseq_InScope(Collection<String> carrierseqList) {
        regINS(CK_INS, cTL(carrierseqList), xgetCValueCarrierseq(), "CARRIERSEQ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseqList The collection of carrierseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_NotInScope(Collection<String> carrierseqList) {
        doSetCarrierseq_NotInScope(carrierseqList);
    }

    protected void doSetCarrierseq_NotInScope(Collection<String> carrierseqList) {
        regINS(CK_NINS, cTL(carrierseqList), xgetCValueCarrierseq(), "CARRIERSEQ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {varchar(30)} <br>
     * <pre>e.g. setCarrierseq_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierseq The value of carrierseq as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierseq_LikeSearch(String carrierseq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierseq), xgetCValueCarrierseq(), "CARRIERSEQ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierseq_NotLikeSearch(String carrierseq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierseq), xgetCValueCarrierseq(), "CARRIERSEQ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     * @param carrierseq The value of carrierseq as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_PrefixSearch(String carrierseq) {
        setCarrierseq_LikeSearch(carrierseq, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     */
    public void setCarrierseq_IsNull() { regCarrierseq(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     */
    public void setCarrierseq_IsNullOrEmpty() { regCarrierseq(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {varchar(30)}
     */
    public void setCarrierseq_IsNotNull() { regCarrierseq(CK_ISNN, DOBJ); }

    protected void regCarrierseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierseq(), "CARRIERSEQ"); }
    protected abstract ConditionValue xgetCValueCarrierseq();

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
     * USERNUM3: {bigint(19)}
     * @param usernum3 The value of usernum3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_Equal(Long usernum3) {
        doSetUsernum3_Equal(usernum3);
    }

    protected void doSetUsernum3_Equal(Long usernum3) {
        regUsernum3(CK_EQ, usernum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3 The value of usernum3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_NotEqual(Long usernum3) {
        doSetUsernum3_NotEqual(usernum3);
    }

    protected void doSetUsernum3_NotEqual(Long usernum3) {
        regUsernum3(CK_NES, usernum3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3 The value of usernum3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterThan(Long usernum3) {
        regUsernum3(CK_GT, usernum3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3 The value of usernum3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_LessThan(Long usernum3) {
        regUsernum3(CK_LT, usernum3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3 The value of usernum3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterEqual(Long usernum3) {
        regUsernum3(CK_GE, usernum3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3 The value of usernum3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_LessEqual(Long usernum3) {
        regUsernum3(CK_LE, usernum3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param minNumber The min number of usernum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum3(), "USERNUM3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3List The collection of usernum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_InScope(Collection<Long> usernum3List) {
        doSetUsernum3_InScope(usernum3List);
    }

    protected void doSetUsernum3_InScope(Collection<Long> usernum3List) {
        regINS(CK_INS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {bigint(19)}
     * @param usernum3List The collection of usernum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotInScope(Collection<Long> usernum3List) {
        doSetUsernum3_NotInScope(usernum3List);
    }

    protected void doSetUsernum3_NotInScope(Collection<Long> usernum3List) {
        regINS(CK_NINS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     */
    public void setUsernum3_IsNull() { regUsernum3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19)}
     */
    public void setUsernum3_IsNotNull() { regUsernum3(CK_ISNN, DOBJ); }

    protected void regUsernum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum3(), "USERNUM3"); }
    protected abstract ConditionValue xgetCValueUsernum3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
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
     * AcceptUserCd: {varchar(30)}
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
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_GreaterThan(String acceptusercd) {
        regAcceptusercd(CK_GT, fRES(acceptusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_LessThan(String acceptusercd) {
        regAcceptusercd(CK_LT, fRES(acceptusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_GreaterEqual(String acceptusercd) {
        regAcceptusercd(CK_GE, fRES(acceptusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_LessEqual(String acceptusercd) {
        regAcceptusercd(CK_LE, fRES(acceptusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercdList The collection of acceptusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_InScope(Collection<String> acceptusercdList) {
        doSetAcceptusercd_InScope(acceptusercdList);
    }

    protected void doSetAcceptusercd_InScope(Collection<String> acceptusercdList) {
        regINS(CK_INS, cTL(acceptusercdList), xgetCValueAcceptusercd(), "AcceptUserCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercdList The collection of acceptusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_NotInScope(Collection<String> acceptusercdList) {
        doSetAcceptusercd_NotInScope(acceptusercdList);
    }

    protected void doSetAcceptusercd_NotInScope(Collection<String> acceptusercdList) {
        regINS(CK_NINS, cTL(acceptusercdList), xgetCValueAcceptusercd(), "AcceptUserCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AcceptUserCd: {varchar(30)} <br>
     * <pre>e.g. setAcceptusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param acceptusercd The value of acceptusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptusercd_LikeSearch(String acceptusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(acceptusercd), xgetCValueAcceptusercd(), "AcceptUserCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAcceptusercd_NotLikeSearch(String acceptusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(acceptusercd), xgetCValueAcceptusercd(), "AcceptUserCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_PrefixSearch(String acceptusercd) {
        setAcceptusercd_LikeSearch(acceptusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     */
    public void setAcceptusercd_IsNull() { regAcceptusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     */
    public void setAcceptusercd_IsNullOrEmpty() { regAcceptusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AcceptUserCd: {varchar(30)}
     */
    public void setAcceptusercd_IsNotNull() { regAcceptusercd(CK_ISNN, DOBJ); }

    protected void regAcceptusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptusercd(), "AcceptUserCd"); }
    protected abstract ConditionValue xgetCValueAcceptusercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_Equal(String acceptdate) {
        doSetAcceptdate_Equal(fRES(acceptdate));
    }

    protected void doSetAcceptdate_Equal(String acceptdate) {
        regAcceptdate(CK_EQ, acceptdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_NotEqual(String acceptdate) {
        doSetAcceptdate_NotEqual(fRES(acceptdate));
    }

    protected void doSetAcceptdate_NotEqual(String acceptdate) {
        regAcceptdate(CK_NES, acceptdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_GreaterThan(String acceptdate) {
        regAcceptdate(CK_GT, fRES(acceptdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_LessThan(String acceptdate) {
        regAcceptdate(CK_LT, fRES(acceptdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_GreaterEqual(String acceptdate) {
        regAcceptdate(CK_GE, fRES(acceptdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_LessEqual(String acceptdate) {
        regAcceptdate(CK_LE, fRES(acceptdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdateList The collection of acceptdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_InScope(Collection<String> acceptdateList) {
        doSetAcceptdate_InScope(acceptdateList);
    }

    protected void doSetAcceptdate_InScope(Collection<String> acceptdateList) {
        regINS(CK_INS, cTL(acceptdateList), xgetCValueAcceptdate(), "AcceptDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdateList The collection of acceptdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_NotInScope(Collection<String> acceptdateList) {
        doSetAcceptdate_NotInScope(acceptdateList);
    }

    protected void doSetAcceptdate_NotInScope(Collection<String> acceptdateList) {
        regINS(CK_NINS, cTL(acceptdateList), xgetCValueAcceptdate(), "AcceptDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AcceptDate: {varchar(8)} <br>
     * <pre>e.g. setAcceptdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param acceptdate The value of acceptdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptdate_LikeSearch(String acceptdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(acceptdate), xgetCValueAcceptdate(), "AcceptDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAcceptdate_NotLikeSearch(String acceptdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(acceptdate), xgetCValueAcceptdate(), "AcceptDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AcceptDate: {varchar(8)}
     * @param acceptdate The value of acceptdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptdate_PrefixSearch(String acceptdate) {
        setAcceptdate_LikeSearch(acceptdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     */
    public void setAcceptdate_IsNull() { regAcceptdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     */
    public void setAcceptdate_IsNullOrEmpty() { regAcceptdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AcceptDate: {varchar(8)}
     */
    public void setAcceptdate_IsNotNull() { regAcceptdate(CK_ISNN, DOBJ); }

    protected void regAcceptdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptdate(), "AcceptDate"); }
    protected abstract ConditionValue xgetCValueAcceptdate();

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
    public HpSLCFunction<WWkpalletCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkpalletCB.class);
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
    public HpSLCFunction<WWkpalletCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkpalletCB.class);
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
    public HpSLCFunction<WWkpalletCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkpalletCB.class);
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
    public HpSLCFunction<WWkpalletCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkpalletCB.class);
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
    public HpSLCFunction<WWkpalletCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkpalletCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkpalletCB&gt;() {
     *     public void query(WWkpalletCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkpalletCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkpalletCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkpalletCQ sq);

    protected WWkpalletCB xcreateScalarConditionCB() {
        WWkpalletCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkpalletCB xcreateScalarConditionPartitionByCB() {
        WWkpalletCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WWkpalletCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletCB cb = new WWkpalletCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WKPALLET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WWkpalletCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WWkpalletCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WWkpalletCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletCB cb = new WWkpalletCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WKPALLET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WWkpalletCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WWkpalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WWkpalletCB cb = new WWkpalletCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WWkpalletCQ sq);

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
    protected WWkpalletCB newMyCB() {
        return new WWkpalletCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkpalletCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

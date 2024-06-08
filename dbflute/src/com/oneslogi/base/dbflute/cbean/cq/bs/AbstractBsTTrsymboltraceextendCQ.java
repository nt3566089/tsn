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
 * The abstract condition-query of T_TRSYMBOLTRACEEXTEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsymboltraceextendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsymboltraceextendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSYMBOLTRACEEXTEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendId The value of trsymboltraceextendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_Equal(Long trsymboltraceextendId) {
        doSetTrsymboltraceextendId_Equal(trsymboltraceextendId);
    }

    protected void doSetTrsymboltraceextendId_Equal(Long trsymboltraceextendId) {
        regTrsymboltraceextendId(CK_EQ, trsymboltraceextendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendId The value of trsymboltraceextendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_NotEqual(Long trsymboltraceextendId) {
        doSetTrsymboltraceextendId_NotEqual(trsymboltraceextendId);
    }

    protected void doSetTrsymboltraceextendId_NotEqual(Long trsymboltraceextendId) {
        regTrsymboltraceextendId(CK_NES, trsymboltraceextendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendId The value of trsymboltraceextendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_GreaterThan(Long trsymboltraceextendId) {
        regTrsymboltraceextendId(CK_GT, trsymboltraceextendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendId The value of trsymboltraceextendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_LessThan(Long trsymboltraceextendId) {
        regTrsymboltraceextendId(CK_LT, trsymboltraceextendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendId The value of trsymboltraceextendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_GreaterEqual(Long trsymboltraceextendId) {
        regTrsymboltraceextendId(CK_GE, trsymboltraceextendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendId The value of trsymboltraceextendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_LessEqual(Long trsymboltraceextendId) {
        regTrsymboltraceextendId(CK_LE, trsymboltraceextendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsymboltraceextendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymboltraceextendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymboltraceextendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymboltraceextendId(), "TRSYMBOLTRACEEXTEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendIdList The collection of trsymboltraceextendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_InScope(Collection<Long> trsymboltraceextendIdList) {
        doSetTrsymboltraceextendId_InScope(trsymboltraceextendIdList);
    }

    protected void doSetTrsymboltraceextendId_InScope(Collection<Long> trsymboltraceextendIdList) {
        regINS(CK_INS, cTL(trsymboltraceextendIdList), xgetCValueTrsymboltraceextendId(), "TRSYMBOLTRACEEXTEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsymboltraceextendIdList The collection of trsymboltraceextendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymboltraceextendId_NotInScope(Collection<Long> trsymboltraceextendIdList) {
        doSetTrsymboltraceextendId_NotInScope(trsymboltraceextendIdList);
    }

    protected void doSetTrsymboltraceextendId_NotInScope(Collection<Long> trsymboltraceextendIdList) {
        regINS(CK_NINS, cTL(trsymboltraceextendIdList), xgetCValueTrsymboltraceextendId(), "TRSYMBOLTRACEEXTEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsymboltraceextendId_IsNull() { regTrsymboltraceextendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsymboltraceextendId_IsNotNull() { regTrsymboltraceextendId(CK_ISNN, DOBJ); }

    protected void regTrsymboltraceextendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymboltraceextendId(), "TRSYMBOLTRACEEXTEND_ID"); }
    protected abstract ConditionValue xgetCValueTrsymboltraceextendId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_Equal(java.math.BigDecimal symboltracekey) {
        doSetSymboltracekey_Equal(symboltracekey);
    }

    protected void doSetSymboltracekey_Equal(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_EQ, symboltracekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_NotEqual(java.math.BigDecimal symboltracekey) {
        doSetSymboltracekey_NotEqual(symboltracekey);
    }

    protected void doSetSymboltracekey_NotEqual(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_NES, symboltracekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_GreaterThan(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_GT, symboltracekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_LessThan(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_LT, symboltracekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_GreaterEqual(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_GE, symboltracekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_LessEqual(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_LE, symboltracekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of symboltracekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symboltracekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymboltracekey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymboltracekey(), "SYMBOLTRACEKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekeyList The collection of symboltracekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboltracekey_InScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        doSetSymboltracekey_InScope(symboltracekeyList);
    }

    protected void doSetSymboltracekey_InScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        regINS(CK_INS, cTL(symboltracekeyList), xgetCValueSymboltracekey(), "SYMBOLTRACEKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekeyList The collection of symboltracekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboltracekey_NotInScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        doSetSymboltracekey_NotInScope(symboltracekeyList);
    }

    protected void doSetSymboltracekey_NotInScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        regINS(CK_NINS, cTL(symboltracekeyList), xgetCValueSymboltracekey(), "SYMBOLTRACEKEY");
    }

    protected void regSymboltracekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymboltracekey(), "SYMBOLTRACEKEY"); }
    protected abstract ConditionValue xgetCValueSymboltracekey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_Equal(Long trsymbolId) {
        doSetTrsymbolId_Equal(trsymbolId);
    }

    protected void doSetTrsymbolId_Equal(Long trsymbolId) {
        regTrsymbolId(CK_EQ, trsymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotEqual(Long trsymbolId) {
        doSetTrsymbolId_NotEqual(trsymbolId);
    }

    protected void doSetTrsymbolId_NotEqual(Long trsymbolId) {
        regTrsymbolId(CK_NES, trsymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_InScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        regINS(CK_INS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
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
     * TRPALLET_ID: {bigint(19)}
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
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterThan(Long trpalletId) {
        regTrpalletId(CK_GT, trpalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessThan(Long trpalletId) {
        regTrpalletId(CK_LT, trpalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterEqual(Long trpalletId) {
        regTrpalletId(CK_GE, trpalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessEqual(Long trpalletId) {
        regTrpalletId(CK_LE, trpalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param minNumber The min number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletId(), "TRPALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
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
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletIdList The collection of trpalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_NotInScope(trpalletIdList);
    }

    protected void doSetTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        regINS(CK_NINS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     */
    public void setTrpalletId_IsNull() { regTrpalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     */
    public void setTrpalletId_IsNotNull() { regTrpalletId(CK_ISNN, DOBJ); }

    protected void regTrpalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpalletId(), "TRPALLET_ID"); }
    protected abstract ConditionValue xgetCValueTrpalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflg The value of assortflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortflg_Equal(java.math.BigDecimal assortflg) {
        doSetAssortflg_Equal(assortflg);
    }

    protected void doSetAssortflg_Equal(java.math.BigDecimal assortflg) {
        regAssortflg(CK_EQ, assortflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflg The value of assortflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortflg_NotEqual(java.math.BigDecimal assortflg) {
        doSetAssortflg_NotEqual(assortflg);
    }

    protected void doSetAssortflg_NotEqual(java.math.BigDecimal assortflg) {
        regAssortflg(CK_NES, assortflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflg The value of assortflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortflg_GreaterThan(java.math.BigDecimal assortflg) {
        regAssortflg(CK_GT, assortflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflg The value of assortflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortflg_LessThan(java.math.BigDecimal assortflg) {
        regAssortflg(CK_LT, assortflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflg The value of assortflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortflg_GreaterEqual(java.math.BigDecimal assortflg) {
        regAssortflg(CK_GE, assortflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflg The value of assortflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortflg_LessEqual(java.math.BigDecimal assortflg) {
        regAssortflg(CK_LE, assortflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param minNumber The min number of assortflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortflg(), "ASSORTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflgList The collection of assortflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortflg_InScope(Collection<java.math.BigDecimal> assortflgList) {
        doSetAssortflg_InScope(assortflgList);
    }

    protected void doSetAssortflg_InScope(Collection<java.math.BigDecimal> assortflgList) {
        regINS(CK_INS, cTL(assortflgList), xgetCValueAssortflg(), "ASSORTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     * @param assortflgList The collection of assortflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortflg_NotInScope(Collection<java.math.BigDecimal> assortflgList) {
        doSetAssortflg_NotInScope(assortflgList);
    }

    protected void doSetAssortflg_NotInScope(Collection<java.math.BigDecimal> assortflgList) {
        regINS(CK_NINS, cTL(assortflgList), xgetCValueAssortflg(), "ASSORTFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     */
    public void setAssortflg_IsNull() { regAssortflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTFLG: {decimal(16, 6)}
     */
    public void setAssortflg_IsNotNull() { regAssortflg(CK_ISNN, DOBJ); }

    protected void regAssortflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortflg(), "ASSORTFLG"); }
    protected abstract ConditionValue xgetCValueAssortflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFrom The value of trsymbolIdFrom as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_Equal(Long trsymbolIdFrom) {
        doSetTrsymbolIdFrom_Equal(trsymbolIdFrom);
    }

    protected void doSetTrsymbolIdFrom_Equal(Long trsymbolIdFrom) {
        regTrsymbolIdFrom(CK_EQ, trsymbolIdFrom);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFrom The value of trsymbolIdFrom as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_NotEqual(Long trsymbolIdFrom) {
        doSetTrsymbolIdFrom_NotEqual(trsymbolIdFrom);
    }

    protected void doSetTrsymbolIdFrom_NotEqual(Long trsymbolIdFrom) {
        regTrsymbolIdFrom(CK_NES, trsymbolIdFrom);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFrom The value of trsymbolIdFrom as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_GreaterThan(Long trsymbolIdFrom) {
        regTrsymbolIdFrom(CK_GT, trsymbolIdFrom);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFrom The value of trsymbolIdFrom as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_LessThan(Long trsymbolIdFrom) {
        regTrsymbolIdFrom(CK_LT, trsymbolIdFrom);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFrom The value of trsymbolIdFrom as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_GreaterEqual(Long trsymbolIdFrom) {
        regTrsymbolIdFrom(CK_GE, trsymbolIdFrom);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFrom The value of trsymbolIdFrom as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_LessEqual(Long trsymbolIdFrom) {
        regTrsymbolIdFrom(CK_LE, trsymbolIdFrom);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param minNumber The min number of trsymbolIdFrom. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolIdFrom. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolIdFrom_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolIdFrom(), "TRSYMBOL_ID_FROM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFromList The collection of trsymbolIdFrom as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_InScope(Collection<Long> trsymbolIdFromList) {
        doSetTrsymbolIdFrom_InScope(trsymbolIdFromList);
    }

    protected void doSetTrsymbolIdFrom_InScope(Collection<Long> trsymbolIdFromList) {
        regINS(CK_INS, cTL(trsymbolIdFromList), xgetCValueTrsymbolIdFrom(), "TRSYMBOL_ID_FROM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @param trsymbolIdFromList The collection of trsymbolIdFrom as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolIdFrom_NotInScope(Collection<Long> trsymbolIdFromList) {
        doSetTrsymbolIdFrom_NotInScope(trsymbolIdFromList);
    }

    protected void doSetTrsymbolIdFrom_NotInScope(Collection<Long> trsymbolIdFromList) {
        regINS(CK_NINS, cTL(trsymbolIdFromList), xgetCValueTrsymbolIdFrom(), "TRSYMBOL_ID_FROM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     */
    public void setTrsymbolIdFrom_IsNull() { regTrsymbolIdFrom(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_FROM: {bigint(19)}
     */
    public void setTrsymbolIdFrom_IsNotNull() { regTrsymbolIdFrom(CK_ISNN, DOBJ); }

    protected void regTrsymbolIdFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolIdFrom(), "TRSYMBOL_ID_FROM"); }
    protected abstract ConditionValue xgetCValueTrsymbolIdFrom();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdTo The value of trsymbolIdTo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_Equal(Long trsymbolIdTo) {
        doSetTrsymbolIdTo_Equal(trsymbolIdTo);
    }

    protected void doSetTrsymbolIdTo_Equal(Long trsymbolIdTo) {
        regTrsymbolIdTo(CK_EQ, trsymbolIdTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdTo The value of trsymbolIdTo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_NotEqual(Long trsymbolIdTo) {
        doSetTrsymbolIdTo_NotEqual(trsymbolIdTo);
    }

    protected void doSetTrsymbolIdTo_NotEqual(Long trsymbolIdTo) {
        regTrsymbolIdTo(CK_NES, trsymbolIdTo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdTo The value of trsymbolIdTo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_GreaterThan(Long trsymbolIdTo) {
        regTrsymbolIdTo(CK_GT, trsymbolIdTo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdTo The value of trsymbolIdTo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_LessThan(Long trsymbolIdTo) {
        regTrsymbolIdTo(CK_LT, trsymbolIdTo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdTo The value of trsymbolIdTo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_GreaterEqual(Long trsymbolIdTo) {
        regTrsymbolIdTo(CK_GE, trsymbolIdTo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdTo The value of trsymbolIdTo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_LessEqual(Long trsymbolIdTo) {
        regTrsymbolIdTo(CK_LE, trsymbolIdTo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param minNumber The min number of trsymbolIdTo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolIdTo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolIdTo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolIdTo(), "TRSYMBOL_ID_TO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdToList The collection of trsymbolIdTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_InScope(Collection<Long> trsymbolIdToList) {
        doSetTrsymbolIdTo_InScope(trsymbolIdToList);
    }

    protected void doSetTrsymbolIdTo_InScope(Collection<Long> trsymbolIdToList) {
        regINS(CK_INS, cTL(trsymbolIdToList), xgetCValueTrsymbolIdTo(), "TRSYMBOL_ID_TO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @param trsymbolIdToList The collection of trsymbolIdTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolIdTo_NotInScope(Collection<Long> trsymbolIdToList) {
        doSetTrsymbolIdTo_NotInScope(trsymbolIdToList);
    }

    protected void doSetTrsymbolIdTo_NotInScope(Collection<Long> trsymbolIdToList) {
        regINS(CK_NINS, cTL(trsymbolIdToList), xgetCValueTrsymbolIdTo(), "TRSYMBOL_ID_TO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     */
    public void setTrsymbolIdTo_IsNull() { regTrsymbolIdTo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID_TO: {bigint(19)}
     */
    public void setTrsymbolIdTo_IsNotNull() { regTrsymbolIdTo(CK_ISNN, DOBJ); }

    protected void regTrsymbolIdTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolIdTo(), "TRSYMBOL_ID_TO"); }
    protected abstract ConditionValue xgetCValueTrsymbolIdTo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_Equal(java.math.BigDecimal qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(java.math.BigDecimal qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_NotEqual(java.math.BigDecimal qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(java.math.BigDecimal qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(java.math.BigDecimal qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(java.math.BigDecimal qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(java.math.BigDecimal qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(java.math.BigDecimal qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<java.math.BigDecimal> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<java.math.BigDecimal> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<java.math.BigDecimal> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<java.math.BigDecimal> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     */
    public void setQty_IsNull() { regQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     */
    public void setQty_IsNotNull() { regQty(CK_ISNN, DOBJ); }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

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
    public HpSLCFunction<TTrsymboltraceextendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsymboltraceextendCB.class);
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
    public HpSLCFunction<TTrsymboltraceextendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsymboltraceextendCB.class);
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
    public HpSLCFunction<TTrsymboltraceextendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsymboltraceextendCB.class);
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
    public HpSLCFunction<TTrsymboltraceextendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsymboltraceextendCB.class);
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
    public HpSLCFunction<TTrsymboltraceextendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsymboltraceextendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsymboltraceextendCB&gt;() {
     *     public void query(TTrsymboltraceextendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsymboltraceextendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsymboltraceextendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceextendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsymboltraceextendCQ sq);

    protected TTrsymboltraceextendCB xcreateScalarConditionCB() {
        TTrsymboltraceextendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsymboltraceextendCB xcreateScalarConditionPartitionByCB() {
        TTrsymboltraceextendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsymboltraceextendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSYMBOLTRACEEXTEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsymboltraceextendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsymboltraceextendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsymboltraceextendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSYMBOLTRACEEXTEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsymboltraceextendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsymboltraceextendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsymboltraceextendCQ sq);

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
    protected TTrsymboltraceextendCB newMyCB() {
        return new TTrsymboltraceextendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsymboltraceextendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

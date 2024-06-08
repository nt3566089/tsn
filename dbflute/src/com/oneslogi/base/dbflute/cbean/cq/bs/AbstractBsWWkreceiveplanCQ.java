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
 * The abstract condition-query of W_WKRECEIVEPLAN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkreceiveplanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkreceiveplanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKRECEIVEPLAN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanId The value of wWkreceiveplanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_Equal(Long wWkreceiveplanId) {
        doSetWWkreceiveplanId_Equal(wWkreceiveplanId);
    }

    protected void doSetWWkreceiveplanId_Equal(Long wWkreceiveplanId) {
        regWWkreceiveplanId(CK_EQ, wWkreceiveplanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanId The value of wWkreceiveplanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_NotEqual(Long wWkreceiveplanId) {
        doSetWWkreceiveplanId_NotEqual(wWkreceiveplanId);
    }

    protected void doSetWWkreceiveplanId_NotEqual(Long wWkreceiveplanId) {
        regWWkreceiveplanId(CK_NES, wWkreceiveplanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanId The value of wWkreceiveplanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_GreaterThan(Long wWkreceiveplanId) {
        regWWkreceiveplanId(CK_GT, wWkreceiveplanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanId The value of wWkreceiveplanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_LessThan(Long wWkreceiveplanId) {
        regWWkreceiveplanId(CK_LT, wWkreceiveplanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanId The value of wWkreceiveplanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_GreaterEqual(Long wWkreceiveplanId) {
        regWWkreceiveplanId(CK_GE, wWkreceiveplanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanId The value of wWkreceiveplanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_LessEqual(Long wWkreceiveplanId) {
        regWWkreceiveplanId(CK_LE, wWkreceiveplanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of wWkreceiveplanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wWkreceiveplanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWWkreceiveplanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWWkreceiveplanId(), "W_WKRECEIVEPLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanIdList The collection of wWkreceiveplanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_InScope(Collection<Long> wWkreceiveplanIdList) {
        doSetWWkreceiveplanId_InScope(wWkreceiveplanIdList);
    }

    protected void doSetWWkreceiveplanId_InScope(Collection<Long> wWkreceiveplanIdList) {
        regINS(CK_INS, cTL(wWkreceiveplanIdList), xgetCValueWWkreceiveplanId(), "W_WKRECEIVEPLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @param wWkreceiveplanIdList The collection of wWkreceiveplanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWWkreceiveplanId_NotInScope(Collection<Long> wWkreceiveplanIdList) {
        doSetWWkreceiveplanId_NotInScope(wWkreceiveplanIdList);
    }

    protected void doSetWWkreceiveplanId_NotInScope(Collection<Long> wWkreceiveplanIdList) {
        regINS(CK_NINS, cTL(wWkreceiveplanIdList), xgetCValueWWkreceiveplanId(), "W_WKRECEIVEPLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     */
    public void setWWkreceiveplanId_IsNull() { regWWkreceiveplanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     */
    public void setWWkreceiveplanId_IsNotNull() { regWWkreceiveplanId(CK_ISNN, DOBJ); }

    protected void regWWkreceiveplanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWWkreceiveplanId(), "W_WKRECEIVEPLAN_ID"); }
    protected abstract ConditionValue xgetCValueWWkreceiveplanId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_Equal(java.math.BigDecimal printkey) {
        doSetPrintkey_Equal(printkey);
    }

    protected void doSetPrintkey_Equal(java.math.BigDecimal printkey) {
        regPrintkey(CK_EQ, printkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_NotEqual(java.math.BigDecimal printkey) {
        doSetPrintkey_NotEqual(printkey);
    }

    protected void doSetPrintkey_NotEqual(java.math.BigDecimal printkey) {
        regPrintkey(CK_NES, printkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterThan(java.math.BigDecimal printkey) {
        regPrintkey(CK_GT, printkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessThan(java.math.BigDecimal printkey) {
        regPrintkey(CK_LT, printkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterEqual(java.math.BigDecimal printkey) {
        regPrintkey(CK_GE, printkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessEqual(java.math.BigDecimal printkey) {
        regPrintkey(CK_LE, printkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintkey(), "PRINTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkeyList The collection of printkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_InScope(Collection<java.math.BigDecimal> printkeyList) {
        doSetPrintkey_InScope(printkeyList);
    }

    protected void doSetPrintkey_InScope(Collection<java.math.BigDecimal> printkeyList) {
        regINS(CK_INS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @param printkeyList The collection of printkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_NotInScope(Collection<java.math.BigDecimal> printkeyList) {
        doSetPrintkey_NotInScope(printkeyList);
    }

    protected void doSetPrintkey_NotInScope(Collection<java.math.BigDecimal> printkeyList) {
        regINS(CK_NINS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    protected void regPrintkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintkey(), "PRINTKEY"); }
    protected abstract ConditionValue xgetCValuePrintkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_Equal(Long lineNo) {
        doSetLineNo_Equal(lineNo);
    }

    protected void doSetLineNo_Equal(Long lineNo) {
        regLineNo(CK_EQ, lineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_NotEqual(Long lineNo) {
        doSetLineNo_NotEqual(lineNo);
    }

    protected void doSetLineNo_NotEqual(Long lineNo) {
        regLineNo(CK_NES, lineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterThan(Long lineNo) {
        regLineNo(CK_GT, lineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessThan(Long lineNo) {
        regLineNo(CK_LT, lineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterEqual(Long lineNo) {
        regLineNo(CK_GE, lineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessEqual(Long lineNo) {
        regLineNo(CK_LE, lineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineNo(), "LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNoList The collection of lineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_InScope(Collection<Long> lineNoList) {
        doSetLineNo_InScope(lineNoList);
    }

    protected void doSetLineNo_InScope(Collection<Long> lineNoList) {
        regINS(CK_INS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNoList The collection of lineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_NotInScope(Collection<Long> lineNoList) {
        doSetLineNo_NotInScope(lineNoList);
    }

    protected void doSetLineNo_NotInScope(Collection<Long> lineNoList) {
        regINS(CK_NINS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    protected void regLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineNo(), "LINE_NO"); }
    protected abstract ConditionValue xgetCValueLineNo();

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
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlineno The value of rcvlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_Equal(java.math.BigDecimal rcvlineno) {
        doSetRcvlineno_Equal(rcvlineno);
    }

    protected void doSetRcvlineno_Equal(java.math.BigDecimal rcvlineno) {
        regRcvlineno(CK_EQ, rcvlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlineno The value of rcvlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_NotEqual(java.math.BigDecimal rcvlineno) {
        doSetRcvlineno_NotEqual(rcvlineno);
    }

    protected void doSetRcvlineno_NotEqual(java.math.BigDecimal rcvlineno) {
        regRcvlineno(CK_NES, rcvlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(java.math.BigDecimal rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(java.math.BigDecimal rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(java.math.BigDecimal rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(java.math.BigDecimal rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlinenoList The collection of rcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_InScope(Collection<java.math.BigDecimal> rcvlinenoList) {
        doSetRcvlineno_InScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_InScope(Collection<java.math.BigDecimal> rcvlinenoList) {
        regINS(CK_INS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<java.math.BigDecimal> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<java.math.BigDecimal> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     */
    public void setRcvlineno_IsNull() { regRcvlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {decimal(16, 6)}
     */
    public void setRcvlineno_IsNotNull() { regRcvlineno(CK_ISNN, DOBJ); }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RCVLINENO"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

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
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_Equal(String slotlocname) {
        doSetSlotlocname_Equal(fRES(slotlocname));
    }

    protected void doSetSlotlocname_Equal(String slotlocname) {
        regSlotlocname(CK_EQ, slotlocname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_NotEqual(String slotlocname) {
        doSetSlotlocname_NotEqual(fRES(slotlocname));
    }

    protected void doSetSlotlocname_NotEqual(String slotlocname) {
        regSlotlocname(CK_NES, slotlocname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_GreaterThan(String slotlocname) {
        regSlotlocname(CK_GT, fRES(slotlocname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_LessThan(String slotlocname) {
        regSlotlocname(CK_LT, fRES(slotlocname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_GreaterEqual(String slotlocname) {
        regSlotlocname(CK_GE, fRES(slotlocname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_LessEqual(String slotlocname) {
        regSlotlocname(CK_LE, fRES(slotlocname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocnameList The collection of slotlocname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_InScope(Collection<String> slotlocnameList) {
        doSetSlotlocname_InScope(slotlocnameList);
    }

    protected void doSetSlotlocname_InScope(Collection<String> slotlocnameList) {
        regINS(CK_INS, cTL(slotlocnameList), xgetCValueSlotlocname(), "SLOTLOCNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocnameList The collection of slotlocname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_NotInScope(Collection<String> slotlocnameList) {
        doSetSlotlocname_NotInScope(slotlocnameList);
    }

    protected void doSetSlotlocname_NotInScope(Collection<String> slotlocnameList) {
        regINS(CK_NINS, cTL(slotlocnameList), xgetCValueSlotlocname(), "SLOTLOCNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)} <br>
     * <pre>e.g. setSlotlocname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slotlocname The value of slotlocname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlotlocname_LikeSearch(String slotlocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slotlocname), xgetCValueSlotlocname(), "SLOTLOCNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlotlocname_NotLikeSearch(String slotlocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slotlocname), xgetCValueSlotlocname(), "SLOTLOCNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_PrefixSearch(String slotlocname) {
        setSlotlocname_LikeSearch(slotlocname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     */
    public void setSlotlocname_IsNull() { regSlotlocname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     */
    public void setSlotlocname_IsNullOrEmpty() { regSlotlocname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     */
    public void setSlotlocname_IsNotNull() { regSlotlocname(CK_ISNN, DOBJ); }

    protected void regSlotlocname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlotlocname(), "SLOTLOCNAME"); }
    protected abstract ConditionValue xgetCValueSlotlocname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_Equal(String rcvschdate) {
        doSetRcvschdate_Equal(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_Equal(String rcvschdate) {
        regRcvschdate(CK_EQ, rcvschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotEqual(String rcvschdate) {
        doSetRcvschdate_NotEqual(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_NotEqual(String rcvschdate) {
        regRcvschdate(CK_NES, rcvschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterThan(String rcvschdate) {
        regRcvschdate(CK_GT, fRES(rcvschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessThan(String rcvschdate) {
        regRcvschdate(CK_LT, fRES(rcvschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterEqual(String rcvschdate) {
        regRcvschdate(CK_GE, fRES(rcvschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessEqual(String rcvschdate) {
        regRcvschdate(CK_LE, fRES(rcvschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdateList The collection of rcvschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_InScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_InScope(rcvschdateList);
    }

    protected void doSetRcvschdate_InScope(Collection<String> rcvschdateList) {
        regINS(CK_INS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdateList The collection of rcvschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_NotInScope(rcvschdateList);
    }

    protected void doSetRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        regINS(CK_NINS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)} <br>
     * <pre>e.g. setRcvschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvschdate The value of rcvschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvschdate_LikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvschdate_NotLikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_PrefixSearch(String rcvschdate) {
        setRcvschdate_LikeSearch(rcvschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     */
    public void setRcvschdate_IsNull() { regRcvschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     */
    public void setRcvschdate_IsNullOrEmpty() { regRcvschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     */
    public void setRcvschdate_IsNotNull() { regRcvschdate(CK_ISNN, DOBJ); }

    protected void regRcvschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvschdate(), "RCVSCHDATE"); }
    protected abstract ConditionValue xgetCValueRcvschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_Equal(String receiveLot4) {
        doSetReceiveLot4_Equal(fRES(receiveLot4));
    }

    protected void doSetReceiveLot4_Equal(String receiveLot4) {
        regReceiveLot4(CK_EQ, receiveLot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_NotEqual(String receiveLot4) {
        doSetReceiveLot4_NotEqual(fRES(receiveLot4));
    }

    protected void doSetReceiveLot4_NotEqual(String receiveLot4) {
        regReceiveLot4(CK_NES, receiveLot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_GreaterThan(String receiveLot4) {
        regReceiveLot4(CK_GT, fRES(receiveLot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_LessThan(String receiveLot4) {
        regReceiveLot4(CK_LT, fRES(receiveLot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_GreaterEqual(String receiveLot4) {
        regReceiveLot4(CK_GE, fRES(receiveLot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_LessEqual(String receiveLot4) {
        regReceiveLot4(CK_LE, fRES(receiveLot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4List The collection of receiveLot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_InScope(Collection<String> receiveLot4List) {
        doSetReceiveLot4_InScope(receiveLot4List);
    }

    protected void doSetReceiveLot4_InScope(Collection<String> receiveLot4List) {
        regINS(CK_INS, cTL(receiveLot4List), xgetCValueReceiveLot4(), "RECEIVE_LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4List The collection of receiveLot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_NotInScope(Collection<String> receiveLot4List) {
        doSetReceiveLot4_NotInScope(receiveLot4List);
    }

    protected void doSetReceiveLot4_NotInScope(Collection<String> receiveLot4List) {
        regINS(CK_NINS, cTL(receiveLot4List), xgetCValueReceiveLot4(), "RECEIVE_LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)} <br>
     * <pre>e.g. setReceiveLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveLot4 The value of receiveLot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveLot4_LikeSearch(String receiveLot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveLot4), xgetCValueReceiveLot4(), "RECEIVE_LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveLot4_NotLikeSearch(String receiveLot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveLot4), xgetCValueReceiveLot4(), "RECEIVE_LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @param receiveLot4 The value of receiveLot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot4_PrefixSearch(String receiveLot4) {
        setReceiveLot4_LikeSearch(receiveLot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     */
    public void setReceiveLot4_IsNull() { regReceiveLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     */
    public void setReceiveLot4_IsNullOrEmpty() { regReceiveLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LOT4: {varchar(8)}
     */
    public void setReceiveLot4_IsNotNull() { regReceiveLot4(CK_ISNN, DOBJ); }

    protected void regReceiveLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLot4(), "RECEIVE_LOT4"); }
    protected abstract ConditionValue xgetCValueReceiveLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_Equal(String receiveLot3) {
        doSetReceiveLot3_Equal(fRES(receiveLot3));
    }

    protected void doSetReceiveLot3_Equal(String receiveLot3) {
        regReceiveLot3(CK_EQ, receiveLot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_NotEqual(String receiveLot3) {
        doSetReceiveLot3_NotEqual(fRES(receiveLot3));
    }

    protected void doSetReceiveLot3_NotEqual(String receiveLot3) {
        regReceiveLot3(CK_NES, receiveLot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_GreaterThan(String receiveLot3) {
        regReceiveLot3(CK_GT, fRES(receiveLot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_LessThan(String receiveLot3) {
        regReceiveLot3(CK_LT, fRES(receiveLot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_GreaterEqual(String receiveLot3) {
        regReceiveLot3(CK_GE, fRES(receiveLot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_LessEqual(String receiveLot3) {
        regReceiveLot3(CK_LE, fRES(receiveLot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3List The collection of receiveLot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_InScope(Collection<String> receiveLot3List) {
        doSetReceiveLot3_InScope(receiveLot3List);
    }

    protected void doSetReceiveLot3_InScope(Collection<String> receiveLot3List) {
        regINS(CK_INS, cTL(receiveLot3List), xgetCValueReceiveLot3(), "RECEIVE_LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3List The collection of receiveLot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_NotInScope(Collection<String> receiveLot3List) {
        doSetReceiveLot3_NotInScope(receiveLot3List);
    }

    protected void doSetReceiveLot3_NotInScope(Collection<String> receiveLot3List) {
        regINS(CK_NINS, cTL(receiveLot3List), xgetCValueReceiveLot3(), "RECEIVE_LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)} <br>
     * <pre>e.g. setReceiveLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveLot3 The value of receiveLot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveLot3_LikeSearch(String receiveLot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveLot3), xgetCValueReceiveLot3(), "RECEIVE_LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveLot3_NotLikeSearch(String receiveLot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveLot3), xgetCValueReceiveLot3(), "RECEIVE_LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @param receiveLot3 The value of receiveLot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLot3_PrefixSearch(String receiveLot3) {
        setReceiveLot3_LikeSearch(receiveLot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     */
    public void setReceiveLot3_IsNull() { regReceiveLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     */
    public void setReceiveLot3_IsNullOrEmpty() { regReceiveLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LOT3: {varchar(60)}
     */
    public void setReceiveLot3_IsNotNull() { regReceiveLot3(CK_ISNN, DOBJ); }

    protected void regReceiveLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLot3(), "RECEIVE_LOT3"); }
    protected abstract ConditionValue xgetCValueReceiveLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacity The value of caseqtyCapacity as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_Equal(Long caseqtyCapacity) {
        doSetCaseqtyCapacity_Equal(caseqtyCapacity);
    }

    protected void doSetCaseqtyCapacity_Equal(Long caseqtyCapacity) {
        regCaseqtyCapacity(CK_EQ, caseqtyCapacity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacity The value of caseqtyCapacity as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_NotEqual(Long caseqtyCapacity) {
        doSetCaseqtyCapacity_NotEqual(caseqtyCapacity);
    }

    protected void doSetCaseqtyCapacity_NotEqual(Long caseqtyCapacity) {
        regCaseqtyCapacity(CK_NES, caseqtyCapacity);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacity The value of caseqtyCapacity as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_GreaterThan(Long caseqtyCapacity) {
        regCaseqtyCapacity(CK_GT, caseqtyCapacity);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacity The value of caseqtyCapacity as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_LessThan(Long caseqtyCapacity) {
        regCaseqtyCapacity(CK_LT, caseqtyCapacity);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacity The value of caseqtyCapacity as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_GreaterEqual(Long caseqtyCapacity) {
        regCaseqtyCapacity(CK_GE, caseqtyCapacity);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacity The value of caseqtyCapacity as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_LessEqual(Long caseqtyCapacity) {
        regCaseqtyCapacity(CK_LE, caseqtyCapacity);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param minNumber The min number of caseqtyCapacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseqtyCapacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseqtyCapacity_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseqtyCapacity(), "CASEQTY_CAPACITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacityList The collection of caseqtyCapacity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_InScope(Collection<Long> caseqtyCapacityList) {
        doSetCaseqtyCapacity_InScope(caseqtyCapacityList);
    }

    protected void doSetCaseqtyCapacity_InScope(Collection<Long> caseqtyCapacityList) {
        regINS(CK_INS, cTL(caseqtyCapacityList), xgetCValueCaseqtyCapacity(), "CASEQTY_CAPACITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @param caseqtyCapacityList The collection of caseqtyCapacity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqtyCapacity_NotInScope(Collection<Long> caseqtyCapacityList) {
        doSetCaseqtyCapacity_NotInScope(caseqtyCapacityList);
    }

    protected void doSetCaseqtyCapacity_NotInScope(Collection<Long> caseqtyCapacityList) {
        regINS(CK_NINS, cTL(caseqtyCapacityList), xgetCValueCaseqtyCapacity(), "CASEQTY_CAPACITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     */
    public void setCaseqtyCapacity_IsNull() { regCaseqtyCapacity(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     */
    public void setCaseqtyCapacity_IsNotNull() { regCaseqtyCapacity(CK_ISNN, DOBJ); }

    protected void regCaseqtyCapacity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseqtyCapacity(), "CASEQTY_CAPACITY"); }
    protected abstract ConditionValue xgetCValueCaseqtyCapacity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_Equal(String floor) {
        doSetFloor_Equal(fRES(floor));
    }

    protected void doSetFloor_Equal(String floor) {
        regFloor(CK_EQ, floor);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_NotEqual(String floor) {
        doSetFloor_NotEqual(fRES(floor));
    }

    protected void doSetFloor_NotEqual(String floor) {
        regFloor(CK_NES, floor);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterThan(String floor) {
        regFloor(CK_GT, fRES(floor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessThan(String floor) {
        regFloor(CK_LT, fRES(floor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterEqual(String floor) {
        regFloor(CK_GE, fRES(floor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessEqual(String floor) {
        regFloor(CK_LE, fRES(floor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floorList The collection of floor as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_InScope(Collection<String> floorList) {
        doSetFloor_InScope(floorList);
    }

    protected void doSetFloor_InScope(Collection<String> floorList) {
        regINS(CK_INS, cTL(floorList), xgetCValueFloor(), "FLOOR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floorList The collection of floor as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_NotInScope(Collection<String> floorList) {
        doSetFloor_NotInScope(floorList);
    }

    protected void doSetFloor_NotInScope(Collection<String> floorList) {
        regINS(CK_NINS, cTL(floorList), xgetCValueFloor(), "FLOOR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(60)} <br>
     * <pre>e.g. setFloor_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floor The value of floor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloor_LikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloor_NotLikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(60)}
     * @param floor The value of floor as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_PrefixSearch(String floor) {
        setFloor_LikeSearch(floor, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     */
    public void setFloor_IsNull() { regFloor(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     */
    public void setFloor_IsNullOrEmpty() { regFloor(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(60)}
     */
    public void setFloor_IsNotNull() { regFloor(CK_ISNN, DOBJ); }

    protected void regFloor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloor(), "FLOOR"); }
    protected abstract ConditionValue xgetCValueFloor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_Equal(String fromfax) {
        doSetFromfax_Equal(fRES(fromfax));
    }

    protected void doSetFromfax_Equal(String fromfax) {
        regFromfax(CK_EQ, fromfax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotEqual(String fromfax) {
        doSetFromfax_NotEqual(fRES(fromfax));
    }

    protected void doSetFromfax_NotEqual(String fromfax) {
        regFromfax(CK_NES, fromfax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterThan(String fromfax) {
        regFromfax(CK_GT, fRES(fromfax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessThan(String fromfax) {
        regFromfax(CK_LT, fRES(fromfax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterEqual(String fromfax) {
        regFromfax(CK_GE, fRES(fromfax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessEqual(String fromfax) {
        regFromfax(CK_LE, fRES(fromfax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfaxList The collection of fromfax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_InScope(Collection<String> fromfaxList) {
        doSetFromfax_InScope(fromfaxList);
    }

    protected void doSetFromfax_InScope(Collection<String> fromfaxList) {
        regINS(CK_INS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfaxList The collection of fromfax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotInScope(Collection<String> fromfaxList) {
        doSetFromfax_NotInScope(fromfaxList);
    }

    protected void doSetFromfax_NotInScope(Collection<String> fromfaxList) {
        regINS(CK_NINS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)} <br>
     * <pre>e.g. setFromfax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromfax The value of fromfax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromfax_LikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromfax_NotLikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_PrefixSearch(String fromfax) {
        setFromfax_LikeSearch(fromfax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     */
    public void setFromfax_IsNull() { regFromfax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     */
    public void setFromfax_IsNullOrEmpty() { regFromfax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     */
    public void setFromfax_IsNotNull() { regFromfax(CK_ISNN, DOBJ); }

    protected void regFromfax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromfax(), "FROMFAX"); }
    protected abstract ConditionValue xgetCValueFromfax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_Equal(String fromphone) {
        doSetFromphone_Equal(fRES(fromphone));
    }

    protected void doSetFromphone_Equal(String fromphone) {
        regFromphone(CK_EQ, fromphone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_NotEqual(String fromphone) {
        doSetFromphone_NotEqual(fRES(fromphone));
    }

    protected void doSetFromphone_NotEqual(String fromphone) {
        regFromphone(CK_NES, fromphone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_GreaterThan(String fromphone) {
        regFromphone(CK_GT, fRES(fromphone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_LessThan(String fromphone) {
        regFromphone(CK_LT, fRES(fromphone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_GreaterEqual(String fromphone) {
        regFromphone(CK_GE, fRES(fromphone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_LessEqual(String fromphone) {
        regFromphone(CK_LE, fRES(fromphone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphoneList The collection of fromphone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_InScope(Collection<String> fromphoneList) {
        doSetFromphone_InScope(fromphoneList);
    }

    protected void doSetFromphone_InScope(Collection<String> fromphoneList) {
        regINS(CK_INS, cTL(fromphoneList), xgetCValueFromphone(), "FROMPHONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphoneList The collection of fromphone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_NotInScope(Collection<String> fromphoneList) {
        doSetFromphone_NotInScope(fromphoneList);
    }

    protected void doSetFromphone_NotInScope(Collection<String> fromphoneList) {
        regINS(CK_NINS, cTL(fromphoneList), xgetCValueFromphone(), "FROMPHONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)} <br>
     * <pre>e.g. setFromphone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromphone The value of fromphone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromphone_LikeSearch(String fromphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromphone), xgetCValueFromphone(), "FROMPHONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromphone_NotLikeSearch(String fromphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromphone), xgetCValueFromphone(), "FROMPHONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_PrefixSearch(String fromphone) {
        setFromphone_LikeSearch(fromphone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     */
    public void setFromphone_IsNull() { regFromphone(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     */
    public void setFromphone_IsNullOrEmpty() { regFromphone(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     */
    public void setFromphone_IsNotNull() { regFromphone(CK_ISNN, DOBJ); }

    protected void regFromphone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromphone(), "FROMPHONE"); }
    protected abstract ConditionValue xgetCValueFromphone();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_Equal(String supplierrcvno) {
        doSetSupplierrcvno_Equal(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_Equal(String supplierrcvno) {
        regSupplierrcvno(CK_EQ, supplierrcvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotEqual(String supplierrcvno) {
        doSetSupplierrcvno_NotEqual(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_NotEqual(String supplierrcvno) {
        regSupplierrcvno(CK_NES, supplierrcvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterThan(String supplierrcvno) {
        regSupplierrcvno(CK_GT, fRES(supplierrcvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessThan(String supplierrcvno) {
        regSupplierrcvno(CK_LT, fRES(supplierrcvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterEqual(String supplierrcvno) {
        regSupplierrcvno(CK_GE, fRES(supplierrcvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessEqual(String supplierrcvno) {
        regSupplierrcvno(CK_LE, fRES(supplierrcvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_InScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        regINS(CK_INS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_NotInScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        regINS(CK_NINS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)} <br>
     * <pre>e.g. setSupplierrcvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierrcvno The value of supplierrcvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierrcvno_LikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierrcvno_NotLikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_PrefixSearch(String supplierrcvno) {
        setSupplierrcvno_LikeSearch(supplierrcvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNull() { regSupplierrcvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNullOrEmpty() { regSupplierrcvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNotNull() { regSupplierrcvno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvno(), "SUPPLIERRCVNO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvno();

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
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_Equal(String itemname) {
        doSetItemname_Equal(fRES(itemname));
    }

    protected void doSetItemname_Equal(String itemname) {
        regItemname(CK_EQ, itemname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_NotEqual(String itemname) {
        doSetItemname_NotEqual(fRES(itemname));
    }

    protected void doSetItemname_NotEqual(String itemname) {
        regItemname(CK_NES, itemname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_GreaterThan(String itemname) {
        regItemname(CK_GT, fRES(itemname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_LessThan(String itemname) {
        regItemname(CK_LT, fRES(itemname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_GreaterEqual(String itemname) {
        regItemname(CK_GE, fRES(itemname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_LessEqual(String itemname) {
        regItemname(CK_LE, fRES(itemname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemnameList The collection of itemname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_InScope(Collection<String> itemnameList) {
        doSetItemname_InScope(itemnameList);
    }

    protected void doSetItemname_InScope(Collection<String> itemnameList) {
        regINS(CK_INS, cTL(itemnameList), xgetCValueItemname(), "ITEMNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemnameList The collection of itemname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_NotInScope(Collection<String> itemnameList) {
        doSetItemname_NotInScope(itemnameList);
    }

    protected void doSetItemname_NotInScope(Collection<String> itemnameList) {
        regINS(CK_NINS, cTL(itemnameList), xgetCValueItemname(), "ITEMNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)} <br>
     * <pre>e.g. setItemname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemname The value of itemname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemname_LikeSearch(String itemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemname), xgetCValueItemname(), "ITEMNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemname_NotLikeSearch(String itemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemname), xgetCValueItemname(), "ITEMNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_PrefixSearch(String itemname) {
        setItemname_LikeSearch(itemname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     */
    public void setItemname_IsNull() { regItemname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     */
    public void setItemname_IsNullOrEmpty() { regItemname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     */
    public void setItemname_IsNotNull() { regItemname(CK_ISNN, DOBJ); }

    protected void regItemname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemname(), "ITEMNAME"); }
    protected abstract ConditionValue xgetCValueItemname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_Equal(String zone) {
        doSetZone_Equal(fRES(zone));
    }

    protected void doSetZone_Equal(String zone) {
        regZone(CK_EQ, zone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_NotEqual(String zone) {
        doSetZone_NotEqual(fRES(zone));
    }

    protected void doSetZone_NotEqual(String zone) {
        regZone(CK_NES, zone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_GreaterThan(String zone) {
        regZone(CK_GT, fRES(zone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_LessThan(String zone) {
        regZone(CK_LT, fRES(zone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_GreaterEqual(String zone) {
        regZone(CK_GE, fRES(zone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_LessEqual(String zone) {
        regZone(CK_LE, fRES(zone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zoneList The collection of zone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_InScope(Collection<String> zoneList) {
        doSetZone_InScope(zoneList);
    }

    protected void doSetZone_InScope(Collection<String> zoneList) {
        regINS(CK_INS, cTL(zoneList), xgetCValueZone(), "ZONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zoneList The collection of zone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_NotInScope(Collection<String> zoneList) {
        doSetZone_NotInScope(zoneList);
    }

    protected void doSetZone_NotInScope(Collection<String> zoneList) {
        regINS(CK_NINS, cTL(zoneList), xgetCValueZone(), "ZONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE: {varchar(60)} <br>
     * <pre>e.g. setZone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zone The value of zone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZone_LikeSearch(String zone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zone), xgetCValueZone(), "ZONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZone_NotLikeSearch(String zone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zone), xgetCValueZone(), "ZONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE: {varchar(60)}
     * @param zone The value of zone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_PrefixSearch(String zone) {
        setZone_LikeSearch(zone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     */
    public void setZone_IsNull() { regZone(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     */
    public void setZone_IsNullOrEmpty() { regZone(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE: {varchar(60)}
     */
    public void setZone_IsNotNull() { regZone(CK_ISNN, DOBJ); }

    protected void regZone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZone(), "ZONE"); }
    protected abstract ConditionValue xgetCValueZone();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqty The value of expectqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_Equal(java.math.BigDecimal expectqty) {
        doSetExpectqty_Equal(expectqty);
    }

    protected void doSetExpectqty_Equal(java.math.BigDecimal expectqty) {
        regExpectqty(CK_EQ, expectqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqty The value of expectqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_NotEqual(java.math.BigDecimal expectqty) {
        doSetExpectqty_NotEqual(expectqty);
    }

    protected void doSetExpectqty_NotEqual(java.math.BigDecimal expectqty) {
        regExpectqty(CK_NES, expectqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqty The value of expectqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_GreaterThan(java.math.BigDecimal expectqty) {
        regExpectqty(CK_GT, expectqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqty The value of expectqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_LessThan(java.math.BigDecimal expectqty) {
        regExpectqty(CK_LT, expectqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqty The value of expectqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_GreaterEqual(java.math.BigDecimal expectqty) {
        regExpectqty(CK_GE, expectqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqty The value of expectqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_LessEqual(java.math.BigDecimal expectqty) {
        regExpectqty(CK_LE, expectqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param minNumber The min number of expectqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty(), "EXPECTQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqtyList The collection of expectqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty_InScope(Collection<java.math.BigDecimal> expectqtyList) {
        doSetExpectqty_InScope(expectqtyList);
    }

    protected void doSetExpectqty_InScope(Collection<java.math.BigDecimal> expectqtyList) {
        regINS(CK_INS, cTL(expectqtyList), xgetCValueExpectqty(), "EXPECTQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @param expectqtyList The collection of expectqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty_NotInScope(Collection<java.math.BigDecimal> expectqtyList) {
        doSetExpectqty_NotInScope(expectqtyList);
    }

    protected void doSetExpectqty_NotInScope(Collection<java.math.BigDecimal> expectqtyList) {
        regINS(CK_NINS, cTL(expectqtyList), xgetCValueExpectqty(), "EXPECTQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     */
    public void setExpectqty_IsNull() { regExpectqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY: {decimal(16, 6)}
     */
    public void setExpectqty_IsNotNull() { regExpectqty(CK_ISNN, DOBJ); }

    protected void regExpectqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty(), "EXPECTQTY"); }
    protected abstract ConditionValue xgetCValueExpectqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpal The value of rcvpal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvpal_Equal(java.math.BigDecimal rcvpal) {
        doSetRcvpal_Equal(rcvpal);
    }

    protected void doSetRcvpal_Equal(java.math.BigDecimal rcvpal) {
        regRcvpal(CK_EQ, rcvpal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpal The value of rcvpal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvpal_NotEqual(java.math.BigDecimal rcvpal) {
        doSetRcvpal_NotEqual(rcvpal);
    }

    protected void doSetRcvpal_NotEqual(java.math.BigDecimal rcvpal) {
        regRcvpal(CK_NES, rcvpal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpal The value of rcvpal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvpal_GreaterThan(java.math.BigDecimal rcvpal) {
        regRcvpal(CK_GT, rcvpal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpal The value of rcvpal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvpal_LessThan(java.math.BigDecimal rcvpal) {
        regRcvpal(CK_LT, rcvpal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpal The value of rcvpal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvpal_GreaterEqual(java.math.BigDecimal rcvpal) {
        regRcvpal(CK_GE, rcvpal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpal The value of rcvpal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvpal_LessEqual(java.math.BigDecimal rcvpal) {
        regRcvpal(CK_LE, rcvpal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param minNumber The min number of rcvpal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvpal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvpal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvpal(), "RCVPAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpalList The collection of rcvpal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpal_InScope(Collection<java.math.BigDecimal> rcvpalList) {
        doSetRcvpal_InScope(rcvpalList);
    }

    protected void doSetRcvpal_InScope(Collection<java.math.BigDecimal> rcvpalList) {
        regINS(CK_INS, cTL(rcvpalList), xgetCValueRcvpal(), "RCVPAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     * @param rcvpalList The collection of rcvpal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpal_NotInScope(Collection<java.math.BigDecimal> rcvpalList) {
        doSetRcvpal_NotInScope(rcvpalList);
    }

    protected void doSetRcvpal_NotInScope(Collection<java.math.BigDecimal> rcvpalList) {
        regINS(CK_NINS, cTL(rcvpalList), xgetCValueRcvpal(), "RCVPAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     */
    public void setRcvpal_IsNull() { regRcvpal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVPAL: {decimal(16, 6)}
     */
    public void setRcvpal_IsNotNull() { regRcvpal(CK_ISNN, DOBJ); }

    protected void regRcvpal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvpal(), "RCVPAL"); }
    protected abstract ConditionValue xgetCValueRcvpal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcase The value of rcvcase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvcase_Equal(java.math.BigDecimal rcvcase) {
        doSetRcvcase_Equal(rcvcase);
    }

    protected void doSetRcvcase_Equal(java.math.BigDecimal rcvcase) {
        regRcvcase(CK_EQ, rcvcase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcase The value of rcvcase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvcase_NotEqual(java.math.BigDecimal rcvcase) {
        doSetRcvcase_NotEqual(rcvcase);
    }

    protected void doSetRcvcase_NotEqual(java.math.BigDecimal rcvcase) {
        regRcvcase(CK_NES, rcvcase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcase The value of rcvcase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvcase_GreaterThan(java.math.BigDecimal rcvcase) {
        regRcvcase(CK_GT, rcvcase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcase The value of rcvcase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvcase_LessThan(java.math.BigDecimal rcvcase) {
        regRcvcase(CK_LT, rcvcase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcase The value of rcvcase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvcase_GreaterEqual(java.math.BigDecimal rcvcase) {
        regRcvcase(CK_GE, rcvcase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcase The value of rcvcase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvcase_LessEqual(java.math.BigDecimal rcvcase) {
        regRcvcase(CK_LE, rcvcase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param minNumber The min number of rcvcase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvcase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvcase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvcase(), "RCVCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcaseList The collection of rcvcase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvcase_InScope(Collection<java.math.BigDecimal> rcvcaseList) {
        doSetRcvcase_InScope(rcvcaseList);
    }

    protected void doSetRcvcase_InScope(Collection<java.math.BigDecimal> rcvcaseList) {
        regINS(CK_INS, cTL(rcvcaseList), xgetCValueRcvcase(), "RCVCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     * @param rcvcaseList The collection of rcvcase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvcase_NotInScope(Collection<java.math.BigDecimal> rcvcaseList) {
        doSetRcvcase_NotInScope(rcvcaseList);
    }

    protected void doSetRcvcase_NotInScope(Collection<java.math.BigDecimal> rcvcaseList) {
        regINS(CK_NINS, cTL(rcvcaseList), xgetCValueRcvcase(), "RCVCASE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     */
    public void setRcvcase_IsNull() { regRcvcase(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVCASE: {decimal(16, 6)}
     */
    public void setRcvcase_IsNotNull() { regRcvcase(CK_ISNN, DOBJ); }

    protected void regRcvcase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvcase(), "RCVCASE"); }
    protected abstract ConditionValue xgetCValueRcvcase();

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
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)} <br>
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
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycase The value of qtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_Equal(java.math.BigDecimal qtycase) {
        doSetQtycase_Equal(qtycase);
    }

    protected void doSetQtycase_Equal(java.math.BigDecimal qtycase) {
        regQtycase(CK_EQ, qtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycase The value of qtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_NotEqual(java.math.BigDecimal qtycase) {
        doSetQtycase_NotEqual(qtycase);
    }

    protected void doSetQtycase_NotEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_NES, qtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_GT, qtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycase The value of qtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_LT, qtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_GE, qtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycase The value of qtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_LE, qtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param minNumber The min number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtycase(), "QTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_InScope(qtycaseList);
    }

    protected void doSetQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_INS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_NotInScope(qtycaseList);
    }

    protected void doSetQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_NINS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     */
    public void setQtycase_IsNull() { regQtycase(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTYCASE: {decimal(16, 6)}
     */
    public void setQtycase_IsNotNull() { regQtycase(CK_ISNN, DOBJ); }

    protected void regQtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtycase(), "QTYCASE"); }
    protected abstract ConditionValue xgetCValueQtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowl The value of qtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_Equal(java.math.BigDecimal qtybowl) {
        doSetQtybowl_Equal(qtybowl);
    }

    protected void doSetQtybowl_Equal(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_EQ, qtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowl The value of qtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        doSetQtybowl_NotEqual(qtybowl);
    }

    protected void doSetQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_NES, qtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GT, qtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LT, qtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GE, qtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LE, qtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param minNumber The min number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtybowl(), "QTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_InScope(qtybowlList);
    }

    protected void doSetQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_INS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_NotInScope(qtybowlList);
    }

    protected void doSetQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_NINS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     */
    public void setQtybowl_IsNull() { regQtybowl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTYBOWL: {decimal(16, 6)}
     */
    public void setQtybowl_IsNotNull() { regQtybowl(CK_ISNN, DOBJ); }

    protected void regQtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtybowl(), "QTYBOWL"); }
    protected abstract ConditionValue xgetCValueQtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypal The value of qtypal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtypal_Equal(java.math.BigDecimal qtypal) {
        doSetQtypal_Equal(qtypal);
    }

    protected void doSetQtypal_Equal(java.math.BigDecimal qtypal) {
        regQtypal(CK_EQ, qtypal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypal The value of qtypal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtypal_NotEqual(java.math.BigDecimal qtypal) {
        doSetQtypal_NotEqual(qtypal);
    }

    protected void doSetQtypal_NotEqual(java.math.BigDecimal qtypal) {
        regQtypal(CK_NES, qtypal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypal The value of qtypal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtypal_GreaterThan(java.math.BigDecimal qtypal) {
        regQtypal(CK_GT, qtypal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypal The value of qtypal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtypal_LessThan(java.math.BigDecimal qtypal) {
        regQtypal(CK_LT, qtypal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypal The value of qtypal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtypal_GreaterEqual(java.math.BigDecimal qtypal) {
        regQtypal(CK_GE, qtypal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypal The value of qtypal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtypal_LessEqual(java.math.BigDecimal qtypal) {
        regQtypal(CK_LE, qtypal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param minNumber The min number of qtypal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtypal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtypal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtypal(), "QTYPAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypalList The collection of qtypal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtypal_InScope(Collection<java.math.BigDecimal> qtypalList) {
        doSetQtypal_InScope(qtypalList);
    }

    protected void doSetQtypal_InScope(Collection<java.math.BigDecimal> qtypalList) {
        regINS(CK_INS, cTL(qtypalList), xgetCValueQtypal(), "QTYPAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     * @param qtypalList The collection of qtypal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtypal_NotInScope(Collection<java.math.BigDecimal> qtypalList) {
        doSetQtypal_NotInScope(qtypalList);
    }

    protected void doSetQtypal_NotInScope(Collection<java.math.BigDecimal> qtypalList) {
        regINS(CK_NINS, cTL(qtypalList), xgetCValueQtypal(), "QTYPAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     */
    public void setQtypal_IsNull() { regQtypal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTYPAL: {decimal(16, 6)}
     */
    public void setQtypal_IsNotNull() { regQtypal(CK_ISNN, DOBJ); }

    protected void regQtypal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtypal(), "QTYPAL"); }
    protected abstract ConditionValue xgetCValueQtypal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
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
     * INOUTKBN: {varchar(30)}
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
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterThan(String inoutkbn) {
        regInoutkbn(CK_GT, fRES(inoutkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessThan(String inoutkbn) {
        regInoutkbn(CK_LT, fRES(inoutkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterEqual(String inoutkbn) {
        regInoutkbn(CK_GE, fRES(inoutkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessEqual(String inoutkbn) {
        regInoutkbn(CK_LE, fRES(inoutkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)}
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
     * INOUTKBN: {varchar(30)}
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
     * INOUTKBN: {varchar(30)} <br>
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
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutkbn_NotLikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutkbn), xgetCValueInoutkbn(), "INOUTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_PrefixSearch(String inoutkbn) {
        setInoutkbn_LikeSearch(inoutkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     */
    public void setInoutkbn_IsNull() { regInoutkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     */
    public void setInoutkbn_IsNullOrEmpty() { regInoutkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     */
    public void setInoutkbn_IsNotNull() { regInoutkbn(CK_ISNN, DOBJ); }

    protected void regInoutkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutkbn(), "INOUTKBN"); }
    protected abstract ConditionValue xgetCValueInoutkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_Equal(Long itemOrderby) {
        doSetItemOrderby_Equal(itemOrderby);
    }

    protected void doSetItemOrderby_Equal(Long itemOrderby) {
        regItemOrderby(CK_EQ, itemOrderby);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_NotEqual(Long itemOrderby) {
        doSetItemOrderby_NotEqual(itemOrderby);
    }

    protected void doSetItemOrderby_NotEqual(Long itemOrderby) {
        regItemOrderby(CK_NES, itemOrderby);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_GreaterThan(Long itemOrderby) {
        regItemOrderby(CK_GT, itemOrderby);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_LessThan(Long itemOrderby) {
        regItemOrderby(CK_LT, itemOrderby);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_GreaterEqual(Long itemOrderby) {
        regItemOrderby(CK_GE, itemOrderby);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_LessEqual(Long itemOrderby) {
        regItemOrderby(CK_LE, itemOrderby);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param minNumber The min number of itemOrderby. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemOrderby. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemOrderby_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemOrderby(), "ITEM_ORDERBY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderbyList The collection of itemOrderby as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_InScope(Collection<Long> itemOrderbyList) {
        doSetItemOrderby_InScope(itemOrderbyList);
    }

    protected void doSetItemOrderby_InScope(Collection<Long> itemOrderbyList) {
        regINS(CK_INS, cTL(itemOrderbyList), xgetCValueItemOrderby(), "ITEM_ORDERBY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderbyList The collection of itemOrderby as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_NotInScope(Collection<Long> itemOrderbyList) {
        doSetItemOrderby_NotInScope(itemOrderbyList);
    }

    protected void doSetItemOrderby_NotInScope(Collection<Long> itemOrderbyList) {
        regINS(CK_NINS, cTL(itemOrderbyList), xgetCValueItemOrderby(), "ITEM_ORDERBY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     */
    public void setItemOrderby_IsNull() { regItemOrderby(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     */
    public void setItemOrderby_IsNotNull() { regItemOrderby(CK_ISNN, DOBJ); }

    protected void regItemOrderby(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemOrderby(), "ITEM_ORDERBY"); }
    protected abstract ConditionValue xgetCValueItemOrderby();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_Equal(Long printpageno) {
        doSetPrintpageno_Equal(printpageno);
    }

    protected void doSetPrintpageno_Equal(Long printpageno) {
        regPrintpageno(CK_EQ, printpageno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_NotEqual(Long printpageno) {
        doSetPrintpageno_NotEqual(printpageno);
    }

    protected void doSetPrintpageno_NotEqual(Long printpageno) {
        regPrintpageno(CK_NES, printpageno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_GreaterThan(Long printpageno) {
        regPrintpageno(CK_GT, printpageno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_LessThan(Long printpageno) {
        regPrintpageno(CK_LT, printpageno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_GreaterEqual(Long printpageno) {
        regPrintpageno(CK_GE, printpageno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_LessEqual(Long printpageno) {
        regPrintpageno(CK_LE, printpageno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param minNumber The min number of printpageno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printpageno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintpageno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintpageno(), "PRINTPAGENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpagenoList The collection of printpageno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintpageno_InScope(Collection<Long> printpagenoList) {
        doSetPrintpageno_InScope(printpagenoList);
    }

    protected void doSetPrintpageno_InScope(Collection<Long> printpagenoList) {
        regINS(CK_INS, cTL(printpagenoList), xgetCValuePrintpageno(), "PRINTPAGENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpagenoList The collection of printpageno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintpageno_NotInScope(Collection<Long> printpagenoList) {
        doSetPrintpageno_NotInScope(printpagenoList);
    }

    protected void doSetPrintpageno_NotInScope(Collection<Long> printpagenoList) {
        regINS(CK_NINS, cTL(printpagenoList), xgetCValuePrintpageno(), "PRINTPAGENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     */
    public void setPrintpageno_IsNull() { regPrintpageno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     */
    public void setPrintpageno_IsNotNull() { regPrintpageno(CK_ISNN, DOBJ); }

    protected void regPrintpageno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintpageno(), "PRINTPAGENO"); }
    protected abstract ConditionValue xgetCValuePrintpageno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_Equal(java.math.BigDecimal seqsortkey) {
        doSetSeqsortkey_Equal(seqsortkey);
    }

    protected void doSetSeqsortkey_Equal(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_EQ, seqsortkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_NotEqual(java.math.BigDecimal seqsortkey) {
        doSetSeqsortkey_NotEqual(seqsortkey);
    }

    protected void doSetSeqsortkey_NotEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_NES, seqsortkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_GreaterThan(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_GT, seqsortkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_LessThan(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_LT, seqsortkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_GreaterEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_GE, seqsortkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_LessEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_LE, seqsortkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param minNumber The min number of seqsortkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqsortkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqsortkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqsortkey(), "SEQSORTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkeyList The collection of seqsortkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqsortkey_InScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        doSetSeqsortkey_InScope(seqsortkeyList);
    }

    protected void doSetSeqsortkey_InScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        regINS(CK_INS, cTL(seqsortkeyList), xgetCValueSeqsortkey(), "SEQSORTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkeyList The collection of seqsortkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqsortkey_NotInScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        doSetSeqsortkey_NotInScope(seqsortkeyList);
    }

    protected void doSetSeqsortkey_NotInScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        regINS(CK_NINS, cTL(seqsortkeyList), xgetCValueSeqsortkey(), "SEQSORTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     */
    public void setSeqsortkey_IsNull() { regSeqsortkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     */
    public void setSeqsortkey_IsNotNull() { regSeqsortkey(CK_ISNN, DOBJ); }

    protected void regSeqsortkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqsortkey(), "SEQSORTKEY"); }
    protected abstract ConditionValue xgetCValueSeqsortkey();

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
    public HpSLCFunction<WWkreceiveplanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkreceiveplanCB.class);
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
    public HpSLCFunction<WWkreceiveplanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkreceiveplanCB.class);
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
    public HpSLCFunction<WWkreceiveplanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkreceiveplanCB.class);
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
    public HpSLCFunction<WWkreceiveplanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkreceiveplanCB.class);
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
    public HpSLCFunction<WWkreceiveplanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkreceiveplanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkreceiveplanCB&gt;() {
     *     public void query(WWkreceiveplanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkreceiveplanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkreceiveplanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkreceiveplanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkreceiveplanCQ sq);

    protected WWkreceiveplanCB xcreateScalarConditionCB() {
        WWkreceiveplanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkreceiveplanCB xcreateScalarConditionPartitionByCB() {
        WWkreceiveplanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WWkreceiveplanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkreceiveplanCB cb = new WWkreceiveplanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "W_WKRECEIVEPLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WWkreceiveplanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WWkreceiveplanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WWkreceiveplanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkreceiveplanCB cb = new WWkreceiveplanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "W_WKRECEIVEPLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WWkreceiveplanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WWkreceiveplanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WWkreceiveplanCB cb = new WWkreceiveplanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WWkreceiveplanCQ sq);

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
    protected WWkreceiveplanCB newMyCB() {
        return new WWkreceiveplanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkreceiveplanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

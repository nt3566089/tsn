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
 * The abstract condition-query of T_TRINVCORRECT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrinvcorrectCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrinvcorrectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRINVCORRECT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectId The value of trinvcorrectId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_Equal(Long trinvcorrectId) {
        doSetTrinvcorrectId_Equal(trinvcorrectId);
    }

    protected void doSetTrinvcorrectId_Equal(Long trinvcorrectId) {
        regTrinvcorrectId(CK_EQ, trinvcorrectId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectId The value of trinvcorrectId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_NotEqual(Long trinvcorrectId) {
        doSetTrinvcorrectId_NotEqual(trinvcorrectId);
    }

    protected void doSetTrinvcorrectId_NotEqual(Long trinvcorrectId) {
        regTrinvcorrectId(CK_NES, trinvcorrectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectId The value of trinvcorrectId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_GreaterThan(Long trinvcorrectId) {
        regTrinvcorrectId(CK_GT, trinvcorrectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectId The value of trinvcorrectId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_LessThan(Long trinvcorrectId) {
        regTrinvcorrectId(CK_LT, trinvcorrectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectId The value of trinvcorrectId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_GreaterEqual(Long trinvcorrectId) {
        regTrinvcorrectId(CK_GE, trinvcorrectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectId The value of trinvcorrectId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_LessEqual(Long trinvcorrectId) {
        regTrinvcorrectId(CK_LE, trinvcorrectId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trinvcorrectId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trinvcorrectId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrinvcorrectId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrinvcorrectId(), "TRINVCORRECT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectIdList The collection of trinvcorrectId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_InScope(Collection<Long> trinvcorrectIdList) {
        doSetTrinvcorrectId_InScope(trinvcorrectIdList);
    }

    protected void doSetTrinvcorrectId_InScope(Collection<Long> trinvcorrectIdList) {
        regINS(CK_INS, cTL(trinvcorrectIdList), xgetCValueTrinvcorrectId(), "TRINVCORRECT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcorrectIdList The collection of trinvcorrectId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrinvcorrectId_NotInScope(Collection<Long> trinvcorrectIdList) {
        doSetTrinvcorrectId_NotInScope(trinvcorrectIdList);
    }

    protected void doSetTrinvcorrectId_NotInScope(Collection<Long> trinvcorrectIdList) {
        regINS(CK_NINS, cTL(trinvcorrectIdList), xgetCValueTrinvcorrectId(), "TRINVCORRECT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrinvcorrectId_IsNull() { regTrinvcorrectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrinvcorrectId_IsNotNull() { regTrinvcorrectId(CK_ISNN, DOBJ); }

    protected void regTrinvcorrectId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrinvcorrectId(), "TRINVCORRECT_ID"); }
    protected abstract ConditionValue xgetCValueTrinvcorrectId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_Equal(java.math.BigDecimal caseinventoryno) {
        doSetCaseinventoryno_Equal(caseinventoryno);
    }

    protected void doSetCaseinventoryno_Equal(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_EQ, caseinventoryno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_NotEqual(java.math.BigDecimal caseinventoryno) {
        doSetCaseinventoryno_NotEqual(caseinventoryno);
    }

    protected void doSetCaseinventoryno_NotEqual(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_NES, caseinventoryno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_GreaterThan(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_GT, caseinventoryno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_LessThan(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_LT, caseinventoryno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_GreaterEqual(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_GE, caseinventoryno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_LessEqual(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_LE, caseinventoryno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of caseinventoryno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinventoryno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinventoryno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinventoryno(), "CASEINVENTORYNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventorynoList The collection of caseinventoryno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinventoryno_InScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        doSetCaseinventoryno_InScope(caseinventorynoList);
    }

    protected void doSetCaseinventoryno_InScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        regINS(CK_INS, cTL(caseinventorynoList), xgetCValueCaseinventoryno(), "CASEINVENTORYNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventorynoList The collection of caseinventoryno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinventoryno_NotInScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        doSetCaseinventoryno_NotInScope(caseinventorynoList);
    }

    protected void doSetCaseinventoryno_NotInScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        regINS(CK_NINS, cTL(caseinventorynoList), xgetCValueCaseinventoryno(), "CASEINVENTORYNO");
    }

    protected void regCaseinventoryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinventoryno(), "CASEINVENTORYNO"); }
    protected abstract ConditionValue xgetCValueCaseinventoryno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqty The value of correctqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectqty_Equal(java.math.BigDecimal correctqty) {
        doSetCorrectqty_Equal(correctqty);
    }

    protected void doSetCorrectqty_Equal(java.math.BigDecimal correctqty) {
        regCorrectqty(CK_EQ, correctqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqty The value of correctqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectqty_NotEqual(java.math.BigDecimal correctqty) {
        doSetCorrectqty_NotEqual(correctqty);
    }

    protected void doSetCorrectqty_NotEqual(java.math.BigDecimal correctqty) {
        regCorrectqty(CK_NES, correctqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqty The value of correctqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectqty_GreaterThan(java.math.BigDecimal correctqty) {
        regCorrectqty(CK_GT, correctqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqty The value of correctqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectqty_LessThan(java.math.BigDecimal correctqty) {
        regCorrectqty(CK_LT, correctqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqty The value of correctqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectqty_GreaterEqual(java.math.BigDecimal correctqty) {
        regCorrectqty(CK_GE, correctqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqty The value of correctqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectqty_LessEqual(java.math.BigDecimal correctqty) {
        regCorrectqty(CK_LE, correctqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param minNumber The min number of correctqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of correctqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCorrectqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCorrectqty(), "CORRECTQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqtyList The collection of correctqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectqty_InScope(Collection<java.math.BigDecimal> correctqtyList) {
        doSetCorrectqty_InScope(correctqtyList);
    }

    protected void doSetCorrectqty_InScope(Collection<java.math.BigDecimal> correctqtyList) {
        regINS(CK_INS, cTL(correctqtyList), xgetCValueCorrectqty(), "CORRECTQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     * @param correctqtyList The collection of correctqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectqty_NotInScope(Collection<java.math.BigDecimal> correctqtyList) {
        doSetCorrectqty_NotInScope(correctqtyList);
    }

    protected void doSetCorrectqty_NotInScope(Collection<java.math.BigDecimal> correctqtyList) {
        regINS(CK_NINS, cTL(correctqtyList), xgetCValueCorrectqty(), "CORRECTQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     */
    public void setCorrectqty_IsNull() { regCorrectqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CORRECTQTY: {decimal(16, 6)}
     */
    public void setCorrectqty_IsNotNull() { regCorrectqty(CK_ISNN, DOBJ); }

    protected void regCorrectqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorrectqty(), "CORRECTQTY"); }
    protected abstract ConditionValue xgetCValueCorrectqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecd The value of putdmycasecd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasecd_Equal(java.math.BigDecimal putdmycasecd) {
        doSetPutdmycasecd_Equal(putdmycasecd);
    }

    protected void doSetPutdmycasecd_Equal(java.math.BigDecimal putdmycasecd) {
        regPutdmycasecd(CK_EQ, putdmycasecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecd The value of putdmycasecd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasecd_NotEqual(java.math.BigDecimal putdmycasecd) {
        doSetPutdmycasecd_NotEqual(putdmycasecd);
    }

    protected void doSetPutdmycasecd_NotEqual(java.math.BigDecimal putdmycasecd) {
        regPutdmycasecd(CK_NES, putdmycasecd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecd The value of putdmycasecd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasecd_GreaterThan(java.math.BigDecimal putdmycasecd) {
        regPutdmycasecd(CK_GT, putdmycasecd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecd The value of putdmycasecd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasecd_LessThan(java.math.BigDecimal putdmycasecd) {
        regPutdmycasecd(CK_LT, putdmycasecd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecd The value of putdmycasecd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasecd_GreaterEqual(java.math.BigDecimal putdmycasecd) {
        regPutdmycasecd(CK_GE, putdmycasecd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecd The value of putdmycasecd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasecd_LessEqual(java.math.BigDecimal putdmycasecd) {
        regPutdmycasecd(CK_LE, putdmycasecd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param minNumber The min number of putdmycasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of putdmycasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPutdmycasecd_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePutdmycasecd(), "PUTDMYCASECD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecdList The collection of putdmycasecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmycasecd_InScope(Collection<java.math.BigDecimal> putdmycasecdList) {
        doSetPutdmycasecd_InScope(putdmycasecdList);
    }

    protected void doSetPutdmycasecd_InScope(Collection<java.math.BigDecimal> putdmycasecdList) {
        regINS(CK_INS, cTL(putdmycasecdList), xgetCValuePutdmycasecd(), "PUTDMYCASECD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     * @param putdmycasecdList The collection of putdmycasecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmycasecd_NotInScope(Collection<java.math.BigDecimal> putdmycasecdList) {
        doSetPutdmycasecd_NotInScope(putdmycasecdList);
    }

    protected void doSetPutdmycasecd_NotInScope(Collection<java.math.BigDecimal> putdmycasecdList) {
        regINS(CK_NINS, cTL(putdmycasecdList), xgetCValuePutdmycasecd(), "PUTDMYCASECD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     */
    public void setPutdmycasecd_IsNull() { regPutdmycasecd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PUTDMYCASECD: {decimal(16, 6)}
     */
    public void setPutdmycasecd_IsNotNull() { regPutdmycasecd(CK_ISNN, DOBJ); }

    protected void regPutdmycasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePutdmycasecd(), "PUTDMYCASECD"); }
    protected abstract ConditionValue xgetCValuePutdmycasecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecd The value of putdmycutcasecd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_Equal(java.math.BigDecimal putdmycutcasecd) {
        doSetPutdmycutcasecd_Equal(putdmycutcasecd);
    }

    protected void doSetPutdmycutcasecd_Equal(java.math.BigDecimal putdmycutcasecd) {
        regPutdmycutcasecd(CK_EQ, putdmycutcasecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecd The value of putdmycutcasecd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_NotEqual(java.math.BigDecimal putdmycutcasecd) {
        doSetPutdmycutcasecd_NotEqual(putdmycutcasecd);
    }

    protected void doSetPutdmycutcasecd_NotEqual(java.math.BigDecimal putdmycutcasecd) {
        regPutdmycutcasecd(CK_NES, putdmycutcasecd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecd The value of putdmycutcasecd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_GreaterThan(java.math.BigDecimal putdmycutcasecd) {
        regPutdmycutcasecd(CK_GT, putdmycutcasecd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecd The value of putdmycutcasecd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_LessThan(java.math.BigDecimal putdmycutcasecd) {
        regPutdmycutcasecd(CK_LT, putdmycutcasecd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecd The value of putdmycutcasecd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_GreaterEqual(java.math.BigDecimal putdmycutcasecd) {
        regPutdmycutcasecd(CK_GE, putdmycutcasecd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecd The value of putdmycutcasecd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_LessEqual(java.math.BigDecimal putdmycutcasecd) {
        regPutdmycutcasecd(CK_LE, putdmycutcasecd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param minNumber The min number of putdmycutcasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of putdmycutcasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPutdmycutcasecd_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePutdmycutcasecd(), "PUTDMYCUTCASECD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecdList The collection of putdmycutcasecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_InScope(Collection<java.math.BigDecimal> putdmycutcasecdList) {
        doSetPutdmycutcasecd_InScope(putdmycutcasecdList);
    }

    protected void doSetPutdmycutcasecd_InScope(Collection<java.math.BigDecimal> putdmycutcasecdList) {
        regINS(CK_INS, cTL(putdmycutcasecdList), xgetCValuePutdmycutcasecd(), "PUTDMYCUTCASECD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @param putdmycutcasecdList The collection of putdmycutcasecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmycutcasecd_NotInScope(Collection<java.math.BigDecimal> putdmycutcasecdList) {
        doSetPutdmycutcasecd_NotInScope(putdmycutcasecdList);
    }

    protected void doSetPutdmycutcasecd_NotInScope(Collection<java.math.BigDecimal> putdmycutcasecdList) {
        regINS(CK_NINS, cTL(putdmycutcasecdList), xgetCValuePutdmycutcasecd(), "PUTDMYCUTCASECD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     */
    public void setPutdmycutcasecd_IsNull() { regPutdmycutcasecd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     */
    public void setPutdmycutcasecd_IsNotNull() { regPutdmycutcasecd(CK_ISNN, DOBJ); }

    protected void regPutdmycutcasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePutdmycutcasecd(), "PUTDMYCUTCASECD"); }
    protected abstract ConditionValue xgetCValuePutdmycutcasecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailno The value of putdmycasedetailno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_Equal(Long putdmycasedetailno) {
        doSetPutdmycasedetailno_Equal(putdmycasedetailno);
    }

    protected void doSetPutdmycasedetailno_Equal(Long putdmycasedetailno) {
        regPutdmycasedetailno(CK_EQ, putdmycasedetailno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailno The value of putdmycasedetailno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_NotEqual(Long putdmycasedetailno) {
        doSetPutdmycasedetailno_NotEqual(putdmycasedetailno);
    }

    protected void doSetPutdmycasedetailno_NotEqual(Long putdmycasedetailno) {
        regPutdmycasedetailno(CK_NES, putdmycasedetailno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailno The value of putdmycasedetailno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_GreaterThan(Long putdmycasedetailno) {
        regPutdmycasedetailno(CK_GT, putdmycasedetailno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailno The value of putdmycasedetailno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_LessThan(Long putdmycasedetailno) {
        regPutdmycasedetailno(CK_LT, putdmycasedetailno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailno The value of putdmycasedetailno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_GreaterEqual(Long putdmycasedetailno) {
        regPutdmycasedetailno(CK_GE, putdmycasedetailno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailno The value of putdmycasedetailno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_LessEqual(Long putdmycasedetailno) {
        regPutdmycasedetailno(CK_LE, putdmycasedetailno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param minNumber The min number of putdmycasedetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of putdmycasedetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPutdmycasedetailno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePutdmycasedetailno(), "PUTDMYCASEDETAILNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailnoList The collection of putdmycasedetailno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_InScope(Collection<Long> putdmycasedetailnoList) {
        doSetPutdmycasedetailno_InScope(putdmycasedetailnoList);
    }

    protected void doSetPutdmycasedetailno_InScope(Collection<Long> putdmycasedetailnoList) {
        regINS(CK_INS, cTL(putdmycasedetailnoList), xgetCValuePutdmycasedetailno(), "PUTDMYCASEDETAILNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @param putdmycasedetailnoList The collection of putdmycasedetailno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmycasedetailno_NotInScope(Collection<Long> putdmycasedetailnoList) {
        doSetPutdmycasedetailno_NotInScope(putdmycasedetailnoList);
    }

    protected void doSetPutdmycasedetailno_NotInScope(Collection<Long> putdmycasedetailnoList) {
        regINS(CK_NINS, cTL(putdmycasedetailnoList), xgetCValuePutdmycasedetailno(), "PUTDMYCASEDETAILNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     */
    public void setPutdmycasedetailno_IsNull() { regPutdmycasedetailno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PUTDMYCASEDETAILNO: {bigint(19)}
     */
    public void setPutdmycasedetailno_IsNotNull() { regPutdmycasedetailno(CK_ISNN, DOBJ); }

    protected void regPutdmycasedetailno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePutdmycasedetailno(), "PUTDMYCASEDETAILNO"); }
    protected abstract ConditionValue xgetCValuePutdmycasedetailno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionno The value of putdmydirectionno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_Equal(Long putdmydirectionno) {
        doSetPutdmydirectionno_Equal(putdmydirectionno);
    }

    protected void doSetPutdmydirectionno_Equal(Long putdmydirectionno) {
        regPutdmydirectionno(CK_EQ, putdmydirectionno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionno The value of putdmydirectionno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_NotEqual(Long putdmydirectionno) {
        doSetPutdmydirectionno_NotEqual(putdmydirectionno);
    }

    protected void doSetPutdmydirectionno_NotEqual(Long putdmydirectionno) {
        regPutdmydirectionno(CK_NES, putdmydirectionno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionno The value of putdmydirectionno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_GreaterThan(Long putdmydirectionno) {
        regPutdmydirectionno(CK_GT, putdmydirectionno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionno The value of putdmydirectionno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_LessThan(Long putdmydirectionno) {
        regPutdmydirectionno(CK_LT, putdmydirectionno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionno The value of putdmydirectionno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_GreaterEqual(Long putdmydirectionno) {
        regPutdmydirectionno(CK_GE, putdmydirectionno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionno The value of putdmydirectionno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_LessEqual(Long putdmydirectionno) {
        regPutdmydirectionno(CK_LE, putdmydirectionno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param minNumber The min number of putdmydirectionno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of putdmydirectionno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPutdmydirectionno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePutdmydirectionno(), "PUTDMYDIRECTIONNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionnoList The collection of putdmydirectionno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_InScope(Collection<Long> putdmydirectionnoList) {
        doSetPutdmydirectionno_InScope(putdmydirectionnoList);
    }

    protected void doSetPutdmydirectionno_InScope(Collection<Long> putdmydirectionnoList) {
        regINS(CK_INS, cTL(putdmydirectionnoList), xgetCValuePutdmydirectionno(), "PUTDMYDIRECTIONNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @param putdmydirectionnoList The collection of putdmydirectionno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmydirectionno_NotInScope(Collection<Long> putdmydirectionnoList) {
        doSetPutdmydirectionno_NotInScope(putdmydirectionnoList);
    }

    protected void doSetPutdmydirectionno_NotInScope(Collection<Long> putdmydirectionnoList) {
        regINS(CK_NINS, cTL(putdmydirectionnoList), xgetCValuePutdmydirectionno(), "PUTDMYDIRECTIONNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     */
    public void setPutdmydirectionno_IsNull() { regPutdmydirectionno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONNO: {bigint(19)}
     */
    public void setPutdmydirectionno_IsNotNull() { regPutdmydirectionno(CK_ISNN, DOBJ); }

    protected void regPutdmydirectionno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePutdmydirectionno(), "PUTDMYDIRECTIONNO"); }
    protected abstract ConditionValue xgetCValuePutdmydirectionno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergno The value of putdmydirectionordergno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_Equal(Long putdmydirectionordergno) {
        doSetPutdmydirectionordergno_Equal(putdmydirectionordergno);
    }

    protected void doSetPutdmydirectionordergno_Equal(Long putdmydirectionordergno) {
        regPutdmydirectionordergno(CK_EQ, putdmydirectionordergno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergno The value of putdmydirectionordergno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_NotEqual(Long putdmydirectionordergno) {
        doSetPutdmydirectionordergno_NotEqual(putdmydirectionordergno);
    }

    protected void doSetPutdmydirectionordergno_NotEqual(Long putdmydirectionordergno) {
        regPutdmydirectionordergno(CK_NES, putdmydirectionordergno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergno The value of putdmydirectionordergno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_GreaterThan(Long putdmydirectionordergno) {
        regPutdmydirectionordergno(CK_GT, putdmydirectionordergno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergno The value of putdmydirectionordergno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_LessThan(Long putdmydirectionordergno) {
        regPutdmydirectionordergno(CK_LT, putdmydirectionordergno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergno The value of putdmydirectionordergno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_GreaterEqual(Long putdmydirectionordergno) {
        regPutdmydirectionordergno(CK_GE, putdmydirectionordergno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergno The value of putdmydirectionordergno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_LessEqual(Long putdmydirectionordergno) {
        regPutdmydirectionordergno(CK_LE, putdmydirectionordergno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param minNumber The min number of putdmydirectionordergno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of putdmydirectionordergno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPutdmydirectionordergno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePutdmydirectionordergno(), "PUTDMYDIRECTIONORDERGNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergnoList The collection of putdmydirectionordergno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_InScope(Collection<Long> putdmydirectionordergnoList) {
        doSetPutdmydirectionordergno_InScope(putdmydirectionordergnoList);
    }

    protected void doSetPutdmydirectionordergno_InScope(Collection<Long> putdmydirectionordergnoList) {
        regINS(CK_INS, cTL(putdmydirectionordergnoList), xgetCValuePutdmydirectionordergno(), "PUTDMYDIRECTIONORDERGNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @param putdmydirectionordergnoList The collection of putdmydirectionordergno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPutdmydirectionordergno_NotInScope(Collection<Long> putdmydirectionordergnoList) {
        doSetPutdmydirectionordergno_NotInScope(putdmydirectionordergnoList);
    }

    protected void doSetPutdmydirectionordergno_NotInScope(Collection<Long> putdmydirectionordergnoList) {
        regINS(CK_NINS, cTL(putdmydirectionordergnoList), xgetCValuePutdmydirectionordergno(), "PUTDMYDIRECTIONORDERGNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     */
    public void setPutdmydirectionordergno_IsNull() { regPutdmydirectionordergno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     */
    public void setPutdmydirectionordergno_IsNotNull() { regPutdmydirectionordergno(CK_ISNN, DOBJ); }

    protected void regPutdmydirectionordergno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePutdmydirectionordergno(), "PUTDMYDIRECTIONORDERGNO"); }
    protected abstract ConditionValue xgetCValuePutdmydirectionordergno();

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
    public HpSLCFunction<TTrinvcorrectCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrinvcorrectCB.class);
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
    public HpSLCFunction<TTrinvcorrectCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrinvcorrectCB.class);
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
    public HpSLCFunction<TTrinvcorrectCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrinvcorrectCB.class);
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
    public HpSLCFunction<TTrinvcorrectCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrinvcorrectCB.class);
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
    public HpSLCFunction<TTrinvcorrectCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrinvcorrectCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrinvcorrectCB&gt;() {
     *     public void query(TTrinvcorrectCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrinvcorrectCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrinvcorrectCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcorrectCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrinvcorrectCQ sq);

    protected TTrinvcorrectCB xcreateScalarConditionCB() {
        TTrinvcorrectCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrinvcorrectCB xcreateScalarConditionPartitionByCB() {
        TTrinvcorrectCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrinvcorrectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRINVCORRECT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrinvcorrectCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrinvcorrectCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrinvcorrectCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRINVCORRECT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrinvcorrectCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrinvcorrectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrinvcorrectCQ sq);

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
    protected TTrinvcorrectCB newMyCB() {
        return new TTrinvcorrectCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrinvcorrectCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

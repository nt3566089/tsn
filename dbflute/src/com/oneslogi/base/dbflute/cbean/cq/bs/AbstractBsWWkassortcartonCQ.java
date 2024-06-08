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
 * The abstract condition-query of W_WKASSORTCARTON.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkassortcartonCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkassortcartonCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKASSORTCARTON";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqno The value of seqno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_Equal(java.math.BigDecimal seqno) {
        doSetSeqno_Equal(seqno);
    }

    protected void doSetSeqno_Equal(java.math.BigDecimal seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqno The value of seqno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_NotEqual(java.math.BigDecimal seqno) {
        doSetSeqno_NotEqual(seqno);
    }

    protected void doSetSeqno_NotEqual(java.math.BigDecimal seqno) {
        regSeqno(CK_NES, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqno The value of seqno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterThan(java.math.BigDecimal seqno) {
        regSeqno(CK_GT, seqno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqno The value of seqno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessThan(java.math.BigDecimal seqno) {
        regSeqno(CK_LT, seqno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqno The value of seqno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterEqual(java.math.BigDecimal seqno) {
        regSeqno(CK_GE, seqno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqno The value of seqno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessEqual(java.math.BigDecimal seqno) {
        regSeqno(CK_LE, seqno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqno(), "SEQNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqnoList The collection of seqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_InScope(Collection<java.math.BigDecimal> seqnoList) {
        doSetSeqno_InScope(seqnoList);
    }

    protected void doSetSeqno_InScope(Collection<java.math.BigDecimal> seqnoList) {
        regINS(CK_INS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @param seqnoList The collection of seqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotInScope(Collection<java.math.BigDecimal> seqnoList) {
        doSetSeqno_NotInScope(seqnoList);
    }

    protected void doSetSeqno_NotInScope(Collection<java.math.BigDecimal> seqnoList) {
        regINS(CK_NINS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setSeqno_IsNull() { regSeqno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setSeqno_IsNotNull() { regSeqno(CK_ISNN, DOBJ); }

    protected void regSeqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqno(), "SEQNO"); }
    protected abstract ConditionValue xgetCValueSeqno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_Equal(java.math.BigDecimal symbolno) {
        doSetSymbolno_Equal(symbolno);
    }

    protected void doSetSymbolno_Equal(java.math.BigDecimal symbolno) {
        regSymbolno(CK_EQ, symbolno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_NotEqual(java.math.BigDecimal symbolno) {
        doSetSymbolno_NotEqual(symbolno);
    }

    protected void doSetSymbolno_NotEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_NES, symbolno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterThan(java.math.BigDecimal symbolno) {
        regSymbolno(CK_GT, symbolno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessThan(java.math.BigDecimal symbolno) {
        regSymbolno(CK_LT, symbolno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_GE, symbolno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_LE, symbolno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolno(), "SYMBOLNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolnoList The collection of symbolno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolno_InScope(Collection<java.math.BigDecimal> symbolnoList) {
        doSetSymbolno_InScope(symbolnoList);
    }

    protected void doSetSymbolno_InScope(Collection<java.math.BigDecimal> symbolnoList) {
        regINS(CK_INS, cTL(symbolnoList), xgetCValueSymbolno(), "SYMBOLNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolnoList The collection of symbolno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolno_NotInScope(Collection<java.math.BigDecimal> symbolnoList) {
        doSetSymbolno_NotInScope(symbolnoList);
    }

    protected void doSetSymbolno_NotInScope(Collection<java.math.BigDecimal> symbolnoList) {
        regINS(CK_NINS, cTL(symbolnoList), xgetCValueSymbolno(), "SYMBOLNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setSymbolno_IsNull() { regSymbolno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setSymbolno_IsNotNull() { regSymbolno(CK_ISNN, DOBJ); }

    protected void regSymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolno(), "SYMBOLNO"); }
    protected abstract ConditionValue xgetCValueSymbolno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqty The value of moveqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqty_Equal(java.math.BigDecimal moveqty) {
        doSetMoveqty_Equal(moveqty);
    }

    protected void doSetMoveqty_Equal(java.math.BigDecimal moveqty) {
        regMoveqty(CK_EQ, moveqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqty The value of moveqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqty_NotEqual(java.math.BigDecimal moveqty) {
        doSetMoveqty_NotEqual(moveqty);
    }

    protected void doSetMoveqty_NotEqual(java.math.BigDecimal moveqty) {
        regMoveqty(CK_NES, moveqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqty The value of moveqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqty_GreaterThan(java.math.BigDecimal moveqty) {
        regMoveqty(CK_GT, moveqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqty The value of moveqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqty_LessThan(java.math.BigDecimal moveqty) {
        regMoveqty(CK_LT, moveqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqty The value of moveqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqty_GreaterEqual(java.math.BigDecimal moveqty) {
        regMoveqty(CK_GE, moveqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqty The value of moveqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqty_LessEqual(java.math.BigDecimal moveqty) {
        regMoveqty(CK_LE, moveqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of moveqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveqty(), "MOVEQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqtyList The collection of moveqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveqty_InScope(Collection<java.math.BigDecimal> moveqtyList) {
        doSetMoveqty_InScope(moveqtyList);
    }

    protected void doSetMoveqty_InScope(Collection<java.math.BigDecimal> moveqtyList) {
        regINS(CK_INS, cTL(moveqtyList), xgetCValueMoveqty(), "MOVEQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEQTY: {NotNull, decimal(16, 6)}
     * @param moveqtyList The collection of moveqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveqty_NotInScope(Collection<java.math.BigDecimal> moveqtyList) {
        doSetMoveqty_NotInScope(moveqtyList);
    }

    protected void doSetMoveqty_NotInScope(Collection<java.math.BigDecimal> moveqtyList) {
        regINS(CK_NINS, cTL(moveqtyList), xgetCValueMoveqty(), "MOVEQTY");
    }

    protected void regMoveqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveqty(), "MOVEQTY"); }
    protected abstract ConditionValue xgetCValueMoveqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowl The value of moveqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_Equal(java.math.BigDecimal moveqtybowl) {
        doSetMoveqtybowl_Equal(moveqtybowl);
    }

    protected void doSetMoveqtybowl_Equal(java.math.BigDecimal moveqtybowl) {
        regMoveqtybowl(CK_EQ, moveqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowl The value of moveqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_NotEqual(java.math.BigDecimal moveqtybowl) {
        doSetMoveqtybowl_NotEqual(moveqtybowl);
    }

    protected void doSetMoveqtybowl_NotEqual(java.math.BigDecimal moveqtybowl) {
        regMoveqtybowl(CK_NES, moveqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowl The value of moveqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_GreaterThan(java.math.BigDecimal moveqtybowl) {
        regMoveqtybowl(CK_GT, moveqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowl The value of moveqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_LessThan(java.math.BigDecimal moveqtybowl) {
        regMoveqtybowl(CK_LT, moveqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowl The value of moveqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_GreaterEqual(java.math.BigDecimal moveqtybowl) {
        regMoveqtybowl(CK_GE, moveqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowl The value of moveqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_LessEqual(java.math.BigDecimal moveqtybowl) {
        regMoveqtybowl(CK_LE, moveqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of moveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveqtybowl(), "MOVEQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowlList The collection of moveqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveqtybowl_InScope(Collection<java.math.BigDecimal> moveqtybowlList) {
        doSetMoveqtybowl_InScope(moveqtybowlList);
    }

    protected void doSetMoveqtybowl_InScope(Collection<java.math.BigDecimal> moveqtybowlList) {
        regINS(CK_INS, cTL(moveqtybowlList), xgetCValueMoveqtybowl(), "MOVEQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEQTYBOWL: {NotNull, decimal(16, 6)}
     * @param moveqtybowlList The collection of moveqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveqtybowl_NotInScope(Collection<java.math.BigDecimal> moveqtybowlList) {
        doSetMoveqtybowl_NotInScope(moveqtybowlList);
    }

    protected void doSetMoveqtybowl_NotInScope(Collection<java.math.BigDecimal> moveqtybowlList) {
        regINS(CK_NINS, cTL(moveqtybowlList), xgetCValueMoveqtybowl(), "MOVEQTYBOWL");
    }

    protected void regMoveqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveqtybowl(), "MOVEQTYBOWL"); }
    protected abstract ConditionValue xgetCValueMoveqtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolno The value of tosymbolno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosymbolno_Equal(java.math.BigDecimal tosymbolno) {
        doSetTosymbolno_Equal(tosymbolno);
    }

    protected void doSetTosymbolno_Equal(java.math.BigDecimal tosymbolno) {
        regTosymbolno(CK_EQ, tosymbolno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolno The value of tosymbolno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosymbolno_NotEqual(java.math.BigDecimal tosymbolno) {
        doSetTosymbolno_NotEqual(tosymbolno);
    }

    protected void doSetTosymbolno_NotEqual(java.math.BigDecimal tosymbolno) {
        regTosymbolno(CK_NES, tosymbolno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolno The value of tosymbolno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosymbolno_GreaterThan(java.math.BigDecimal tosymbolno) {
        regTosymbolno(CK_GT, tosymbolno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolno The value of tosymbolno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosymbolno_LessThan(java.math.BigDecimal tosymbolno) {
        regTosymbolno(CK_LT, tosymbolno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolno The value of tosymbolno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosymbolno_GreaterEqual(java.math.BigDecimal tosymbolno) {
        regTosymbolno(CK_GE, tosymbolno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolno The value of tosymbolno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosymbolno_LessEqual(java.math.BigDecimal tosymbolno) {
        regTosymbolno(CK_LE, tosymbolno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of tosymbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tosymbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTosymbolno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTosymbolno(), "TOSYMBOLNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolnoList The collection of tosymbolno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosymbolno_InScope(Collection<java.math.BigDecimal> tosymbolnoList) {
        doSetTosymbolno_InScope(tosymbolnoList);
    }

    protected void doSetTosymbolno_InScope(Collection<java.math.BigDecimal> tosymbolnoList) {
        regINS(CK_INS, cTL(tosymbolnoList), xgetCValueTosymbolno(), "TOSYMBOLNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSYMBOLNO: {NotNull, decimal(16, 6)}
     * @param tosymbolnoList The collection of tosymbolno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosymbolno_NotInScope(Collection<java.math.BigDecimal> tosymbolnoList) {
        doSetTosymbolno_NotInScope(tosymbolnoList);
    }

    protected void doSetTosymbolno_NotInScope(Collection<java.math.BigDecimal> tosymbolnoList) {
        regINS(CK_NINS, cTL(tosymbolnoList), xgetCValueTosymbolno(), "TOSYMBOLNO");
    }

    protected void regTosymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTosymbolno(), "TOSYMBOLNO"); }
    protected abstract ConditionValue xgetCValueTosymbolno();

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
    public HpSLCFunction<WWkassortcartonCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkassortcartonCB.class);
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
    public HpSLCFunction<WWkassortcartonCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkassortcartonCB.class);
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
    public HpSLCFunction<WWkassortcartonCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkassortcartonCB.class);
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
    public HpSLCFunction<WWkassortcartonCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkassortcartonCB.class);
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
    public HpSLCFunction<WWkassortcartonCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkassortcartonCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkassortcartonCB&gt;() {
     *     public void query(WWkassortcartonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkassortcartonCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkassortcartonCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkassortcartonCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkassortcartonCQ sq);

    protected WWkassortcartonCB xcreateScalarConditionCB() {
        WWkassortcartonCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkassortcartonCB xcreateScalarConditionPartitionByCB() {
        WWkassortcartonCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WWkassortcartonCB newMyCB() {
        return new WWkassortcartonCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkassortcartonCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of T_INVENTORY_INP_HIST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTInventoryInpHistCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTInventoryInpHistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_INVENTORY_INP_HIST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistId The value of inventoryInpHistId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_Equal(Long inventoryInpHistId) {
        doSetInventoryInpHistId_Equal(inventoryInpHistId);
    }

    protected void doSetInventoryInpHistId_Equal(Long inventoryInpHistId) {
        regInventoryInpHistId(CK_EQ, inventoryInpHistId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistId The value of inventoryInpHistId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_NotEqual(Long inventoryInpHistId) {
        doSetInventoryInpHistId_NotEqual(inventoryInpHistId);
    }

    protected void doSetInventoryInpHistId_NotEqual(Long inventoryInpHistId) {
        regInventoryInpHistId(CK_NES, inventoryInpHistId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistId The value of inventoryInpHistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_GreaterThan(Long inventoryInpHistId) {
        regInventoryInpHistId(CK_GT, inventoryInpHistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistId The value of inventoryInpHistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_LessThan(Long inventoryInpHistId) {
        regInventoryInpHistId(CK_LT, inventoryInpHistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistId The value of inventoryInpHistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_GreaterEqual(Long inventoryInpHistId) {
        regInventoryInpHistId(CK_GE, inventoryInpHistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistId The value of inventoryInpHistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_LessEqual(Long inventoryInpHistId) {
        regInventoryInpHistId(CK_LE, inventoryInpHistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of inventoryInpHistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryInpHistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryInpHistId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryInpHistId(), "INVENTORY_INP_HIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistIdList The collection of inventoryInpHistId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_InScope(Collection<Long> inventoryInpHistIdList) {
        doSetInventoryInpHistId_InScope(inventoryInpHistIdList);
    }

    protected void doSetInventoryInpHistId_InScope(Collection<Long> inventoryInpHistIdList) {
        regINS(CK_INS, cTL(inventoryInpHistIdList), xgetCValueInventoryInpHistId(), "INVENTORY_INP_HIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInpHistIdList The collection of inventoryInpHistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInpHistId_NotInScope(Collection<Long> inventoryInpHistIdList) {
        doSetInventoryInpHistId_NotInScope(inventoryInpHistIdList);
    }

    protected void doSetInventoryInpHistId_NotInScope(Collection<Long> inventoryInpHistIdList) {
        regINS(CK_NINS, cTL(inventoryInpHistIdList), xgetCValueInventoryInpHistId(), "INVENTORY_INP_HIST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryInpHistId_IsNull() { regInventoryInpHistId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryInpHistId_IsNotNull() { regInventoryInpHistId(CK_ISNN, DOBJ); }

    protected void regInventoryInpHistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryInpHistId(), "INVENTORY_INP_HIST_ID"); }
    protected abstract ConditionValue xgetCValueInventoryInpHistId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @param inputDt The value of inputDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInputDt_Equal(java.sql.Timestamp inputDt) {
        regInputDt(CK_EQ,  inputDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @param inputDt The value of inputDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInputDt_GreaterThan(java.sql.Timestamp inputDt) {
        regInputDt(CK_GT,  inputDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @param inputDt The value of inputDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInputDt_LessThan(java.sql.Timestamp inputDt) {
        regInputDt(CK_LT,  inputDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @param inputDt The value of inputDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInputDt_GreaterEqual(java.sql.Timestamp inputDt) {
        regInputDt(CK_GE,  inputDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @param inputDt The value of inputDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInputDt_LessEqual(java.sql.Timestamp inputDt) {
        regInputDt(CK_LE, inputDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setInputDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inputDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inputDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInputDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInputDt(), "INPUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of inputDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of inputDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInputDt_DateFromTo(Date fromDate, Date toDate) {
        setInputDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regInputDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputDt(), "INPUT_DT"); }
    protected abstract ConditionValue xgetCValueInputDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBId The value of inventoryBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_Equal(Long inventoryBId) {
        doSetInventoryBId_Equal(inventoryBId);
    }

    protected void doSetInventoryBId_Equal(Long inventoryBId) {
        regInventoryBId(CK_EQ, inventoryBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBId The value of inventoryBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_NotEqual(Long inventoryBId) {
        doSetInventoryBId_NotEqual(inventoryBId);
    }

    protected void doSetInventoryBId_NotEqual(Long inventoryBId) {
        regInventoryBId(CK_NES, inventoryBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBId The value of inventoryBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterThan(Long inventoryBId) {
        regInventoryBId(CK_GT, inventoryBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBId The value of inventoryBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessThan(Long inventoryBId) {
        regInventoryBId(CK_LT, inventoryBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBId The value of inventoryBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterEqual(Long inventoryBId) {
        regInventoryBId(CK_GE, inventoryBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBId The value of inventoryBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessEqual(Long inventoryBId) {
        regInventoryBId(CK_LE, inventoryBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param minNumber The min number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryBId(), "INVENTORY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBIdList The collection of inventoryBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_InScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        regINS(CK_INS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @param inventoryBIdList The collection of inventoryBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_NotInScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        regINS(CK_NINS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_B_ID from T_INVENTORY_B where ...)} <br />
     * T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'.
     * @param subCBLambda The callback for sub-query of TInventoryB for 'in-scope'. (NotNull)
     */
    public void inScopeTInventoryB(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryBId_InScopeRelation_TInventoryB(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryB", false);
    }
    public abstract String keepInventoryBId_InScopeRelation_TInventoryB(TInventoryBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_B_ID from T_INVENTORY_B where ...)} <br />
     * T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'.
     * @param subCBLambda The callback for sub-query of TInventoryB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTInventoryB(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryBId_NotInScopeRelation_TInventoryB(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryB", true);
    }
    public abstract String keepInventoryBId_NotInScopeRelation_TInventoryB(TInventoryBCQ sq);

    protected void regInventoryBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryBId(), "INVENTORY_B_ID"); }
    protected abstract ConditionValue xgetCValueInventoryBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_Equal(java.math.BigDecimal inventoryNum) {
        doSetInventoryNum_Equal(inventoryNum);
    }

    protected void doSetInventoryNum_Equal(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_EQ, inventoryNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_NotEqual(java.math.BigDecimal inventoryNum) {
        doSetInventoryNum_NotEqual(inventoryNum);
    }

    protected void doSetInventoryNum_NotEqual(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_NES, inventoryNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_GreaterThan(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_GT, inventoryNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_LessThan(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_LT, inventoryNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_GreaterEqual(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_GE, inventoryNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_LessEqual(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_LE, inventoryNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of inventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryNum(), "INVENTORY_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNumList The collection of inventoryNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryNum_InScope(Collection<java.math.BigDecimal> inventoryNumList) {
        doSetInventoryNum_InScope(inventoryNumList);
    }

    protected void doSetInventoryNum_InScope(Collection<java.math.BigDecimal> inventoryNumList) {
        regINS(CK_INS, cTL(inventoryNumList), xgetCValueInventoryNum(), "INVENTORY_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNumList The collection of inventoryNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryNum_NotInScope(Collection<java.math.BigDecimal> inventoryNumList) {
        doSetInventoryNum_NotInScope(inventoryNumList);
    }

    protected void doSetInventoryNum_NotInScope(Collection<java.math.BigDecimal> inventoryNumList) {
        regINS(CK_NINS, cTL(inventoryNumList), xgetCValueInventoryNum(), "INVENTORY_NUM");
    }

    protected void regInventoryNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryNum(), "INVENTORY_NUM"); }
    protected abstract ConditionValue xgetCValueInventoryNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @param lastFlg The value of lastFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastFlg_Equal(String lastFlg) {
        doSetLastFlg_Equal(fRES(lastFlg));
    }

    /**
     * Equal(=). As LastFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFlg_Equal_AsLastFlg(CDef.LastFlg cdef) {
        doSetLastFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 最新でない
     */
    public void setLastFlg_Equal_$0() {
        setLastFlg_Equal_AsLastFlg(CDef.LastFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最新
     */
    public void setLastFlg_Equal_$1() {
        setLastFlg_Equal_AsLastFlg(CDef.LastFlg.$1);
    }

    protected void doSetLastFlg_Equal(String lastFlg) {
        regLastFlg(CK_EQ, lastFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @param lastFlg The value of lastFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastFlg_NotEqual(String lastFlg) {
        doSetLastFlg_NotEqual(fRES(lastFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LastFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFlg_NotEqual_AsLastFlg(CDef.LastFlg cdef) {
        doSetLastFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 最新でない
     */
    public void setLastFlg_NotEqual_$0() {
        setLastFlg_NotEqual_AsLastFlg(CDef.LastFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最新
     */
    public void setLastFlg_NotEqual_$1() {
        setLastFlg_NotEqual_AsLastFlg(CDef.LastFlg.$1);
    }

    protected void doSetLastFlg_NotEqual(String lastFlg) {
        regLastFlg(CK_NES, lastFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @param lastFlgList The collection of lastFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastFlg_InScope(Collection<String> lastFlgList) {
        doSetLastFlg_InScope(lastFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LastFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastFlg_InScope_AsLastFlg(Collection<CDef.LastFlg> cdefList) {
        doSetLastFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLastFlg_InScope(Collection<String> lastFlgList) {
        regINS(CK_INS, cTL(lastFlgList), xgetCValueLastFlg(), "LAST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @param lastFlgList The collection of lastFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastFlg_NotInScope(Collection<String> lastFlgList) {
        doSetLastFlg_NotInScope(lastFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LastFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastFlg_NotInScope_AsLastFlg(Collection<CDef.LastFlg> cdefList) {
        doSetLastFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLastFlg_NotInScope(Collection<String> lastFlgList) {
        regINS(CK_NINS, cTL(lastFlgList), xgetCValueLastFlg(), "LAST_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     */
    public void setLastFlg_IsNull() { regLastFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     */
    public void setLastFlg_IsNotNull() { regLastFlg(CK_ISNN, DOBJ); }

    protected void regLastFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastFlg(), "LAST_FLG"); }
    protected abstract ConditionValue xgetCValueLastFlg();

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
    public HpSLCFunction<TInventoryInpHistCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TInventoryInpHistCB.class);
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
    public HpSLCFunction<TInventoryInpHistCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TInventoryInpHistCB.class);
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
    public HpSLCFunction<TInventoryInpHistCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TInventoryInpHistCB.class);
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
    public HpSLCFunction<TInventoryInpHistCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TInventoryInpHistCB.class);
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
    public HpSLCFunction<TInventoryInpHistCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TInventoryInpHistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TInventoryInpHistCB&gt;() {
     *     public void query(TInventoryInpHistCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TInventoryInpHistCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TInventoryInpHistCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInpHistCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TInventoryInpHistCQ sq);

    protected TInventoryInpHistCB xcreateScalarConditionCB() {
        TInventoryInpHistCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TInventoryInpHistCB xcreateScalarConditionPartitionByCB() {
        TInventoryInpHistCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TInventoryInpHistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_INP_HIST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TInventoryInpHistCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TInventoryInpHistCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TInventoryInpHistCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_INP_HIST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TInventoryInpHistCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TInventoryInpHistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TInventoryInpHistCQ sq);

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
    protected TInventoryInpHistCB newMyCB() {
        return new TInventoryInpHistCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TInventoryInpHistCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

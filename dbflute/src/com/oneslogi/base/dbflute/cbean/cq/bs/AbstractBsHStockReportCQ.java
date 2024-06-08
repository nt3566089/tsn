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
 * The abstract condition-query of H_STOCK_REPORT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHStockReportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHStockReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_STOCK_REPORT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportId The value of stockReportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockReportId_Equal(Long stockReportId) {
        doSetStockReportId_Equal(stockReportId);
    }

    protected void doSetStockReportId_Equal(Long stockReportId) {
        regStockReportId(CK_EQ, stockReportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportId The value of stockReportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockReportId_NotEqual(Long stockReportId) {
        doSetStockReportId_NotEqual(stockReportId);
    }

    protected void doSetStockReportId_NotEqual(Long stockReportId) {
        regStockReportId(CK_NES, stockReportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportId The value of stockReportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockReportId_GreaterThan(Long stockReportId) {
        regStockReportId(CK_GT, stockReportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportId The value of stockReportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockReportId_LessThan(Long stockReportId) {
        regStockReportId(CK_LT, stockReportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportId The value of stockReportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockReportId_GreaterEqual(Long stockReportId) {
        regStockReportId(CK_GE, stockReportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportId The value of stockReportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockReportId_LessEqual(Long stockReportId) {
        regStockReportId(CK_LE, stockReportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of stockReportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockReportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockReportId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockReportId(), "STOCK_REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportIdList The collection of stockReportId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockReportId_InScope(Collection<Long> stockReportIdList) {
        doSetStockReportId_InScope(stockReportIdList);
    }

    protected void doSetStockReportId_InScope(Collection<Long> stockReportIdList) {
        regINS(CK_INS, cTL(stockReportIdList), xgetCValueStockReportId(), "STOCK_REPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockReportIdList The collection of stockReportId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockReportId_NotInScope(Collection<Long> stockReportIdList) {
        doSetStockReportId_NotInScope(stockReportIdList);
    }

    protected void doSetStockReportId_NotInScope(Collection<Long> stockReportIdList) {
        regINS(CK_NINS, cTL(stockReportIdList), xgetCValueStockReportId(), "STOCK_REPORT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockReportId_IsNull() { regStockReportId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockReportId_IsNotNull() { regStockReportId(CK_ISNN, DOBJ); }

    protected void regStockReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockReportId(), "STOCK_REPORT_ID"); }
    protected abstract ConditionValue xgetCValueStockReportId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_Equal(String histDt) {
        doSetHistDt_Equal(fRES(histDt));
    }

    protected void doSetHistDt_Equal(String histDt) {
        regHistDt(CK_EQ, histDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_NotEqual(String histDt) {
        doSetHistDt_NotEqual(fRES(histDt));
    }

    protected void doSetHistDt_NotEqual(String histDt) {
        regHistDt(CK_NES, histDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterThan(String histDt) {
        regHistDt(CK_GT, fRES(histDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessThan(String histDt) {
        regHistDt(CK_LT, fRES(histDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterEqual(String histDt) {
        regHistDt(CK_GE, fRES(histDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessEqual(String histDt) {
        regHistDt(CK_LE, fRES(histDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDtList The collection of histDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_InScope(Collection<String> histDtList) {
        doSetHistDt_InScope(histDtList);
    }

    protected void doSetHistDt_InScope(Collection<String> histDtList) {
        regINS(CK_INS, cTL(histDtList), xgetCValueHistDt(), "HIST_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDtList The collection of histDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_NotInScope(Collection<String> histDtList) {
        doSetHistDt_NotInScope(histDtList);
    }

    protected void doSetHistDt_NotInScope(Collection<String> histDtList) {
        regINS(CK_NINS, cTL(histDtList), xgetCValueHistDt(), "HIST_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setHistDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histDt The value of histDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistDt_LikeSearch(String histDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histDt), xgetCValueHistDt(), "HIST_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistDt_NotLikeSearch(String histDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histDt), xgetCValueHistDt(), "HIST_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @param histDt The value of histDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_PrefixSearch(String histDt) {
        setHistDt_LikeSearch(histDt, xcLSOPPre());
    }

    protected void regHistDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistDt(), "HIST_DT"); }
    protected abstract ConditionValue xgetCValueHistDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from H_STOCK where ...)} <br />
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @param subCBLambda The callback for sub-query of HStock for 'in-scope'. (NotNull)
     */
    public void inScopeHStock(SubQuery<HStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockCB cb = new HStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_HStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "hStock", false);
    }
    public abstract String keepStockId_InScopeRelation_HStock(HStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from H_STOCK where ...)} <br />
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @param subCBLambda The callback for sub-query of HStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeHStock(SubQuery<HStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockCB cb = new HStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_HStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "hStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_HStock(HStockCQ sq);

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_Equal(java.math.BigDecimal chargeNum) {
        doSetChargeNum_Equal(chargeNum);
    }

    protected void doSetChargeNum_Equal(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_EQ, chargeNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_NotEqual(java.math.BigDecimal chargeNum) {
        doSetChargeNum_NotEqual(chargeNum);
    }

    protected void doSetChargeNum_NotEqual(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_NES, chargeNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_GreaterThan(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_GT, chargeNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_LessThan(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_LT, chargeNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_GreaterEqual(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_GE, chargeNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_LessEqual(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_LE, chargeNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of chargeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of chargeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChargeNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChargeNum(), "CHARGE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNumList The collection of chargeNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum_InScope(Collection<java.math.BigDecimal> chargeNumList) {
        doSetChargeNum_InScope(chargeNumList);
    }

    protected void doSetChargeNum_InScope(Collection<java.math.BigDecimal> chargeNumList) {
        regINS(CK_INS, cTL(chargeNumList), xgetCValueChargeNum(), "CHARGE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNumList The collection of chargeNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum_NotInScope(Collection<java.math.BigDecimal> chargeNumList) {
        doSetChargeNum_NotInScope(chargeNumList);
    }

    protected void doSetChargeNum_NotInScope(Collection<java.math.BigDecimal> chargeNumList) {
        regINS(CK_NINS, cTL(chargeNumList), xgetCValueChargeNum(), "CHARGE_NUM");
    }

    protected void regChargeNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChargeNum(), "CHARGE_NUM"); }
    protected abstract ConditionValue xgetCValueChargeNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_Equal(java.math.BigDecimal allocNum) {
        doSetAllocNum_Equal(allocNum);
    }

    protected void doSetAllocNum_Equal(java.math.BigDecimal allocNum) {
        regAllocNum(CK_EQ, allocNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_NotEqual(java.math.BigDecimal allocNum) {
        doSetAllocNum_NotEqual(allocNum);
    }

    protected void doSetAllocNum_NotEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_NES, allocNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_GreaterThan(java.math.BigDecimal allocNum) {
        regAllocNum(CK_GT, allocNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_LessThan(java.math.BigDecimal allocNum) {
        regAllocNum(CK_LT, allocNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_GreaterEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_GE, allocNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_LessEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_LE, allocNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNum(), "ALLOC_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNumList The collection of allocNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum_InScope(Collection<java.math.BigDecimal> allocNumList) {
        doSetAllocNum_InScope(allocNumList);
    }

    protected void doSetAllocNum_InScope(Collection<java.math.BigDecimal> allocNumList) {
        regINS(CK_INS, cTL(allocNumList), xgetCValueAllocNum(), "ALLOC_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNumList The collection of allocNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum_NotInScope(Collection<java.math.BigDecimal> allocNumList) {
        doSetAllocNum_NotInScope(allocNumList);
    }

    protected void doSetAllocNum_NotInScope(Collection<java.math.BigDecimal> allocNumList) {
        regINS(CK_NINS, cTL(allocNumList), xgetCValueAllocNum(), "ALLOC_NUM");
    }

    protected void regAllocNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNum(), "ALLOC_NUM"); }
    protected abstract ConditionValue xgetCValueAllocNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_Equal(java.math.BigDecimal moveNum) {
        doSetMoveNum_Equal(moveNum);
    }

    protected void doSetMoveNum_Equal(java.math.BigDecimal moveNum) {
        regMoveNum(CK_EQ, moveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_NotEqual(java.math.BigDecimal moveNum) {
        doSetMoveNum_NotEqual(moveNum);
    }

    protected void doSetMoveNum_NotEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_NES, moveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_GreaterThan(java.math.BigDecimal moveNum) {
        regMoveNum(CK_GT, moveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_LessThan(java.math.BigDecimal moveNum) {
        regMoveNum(CK_LT, moveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_GreaterEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_GE, moveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_LessEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_LE, moveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNum(), "MOVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNumList The collection of moveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum_InScope(Collection<java.math.BigDecimal> moveNumList) {
        doSetMoveNum_InScope(moveNumList);
    }

    protected void doSetMoveNum_InScope(Collection<java.math.BigDecimal> moveNumList) {
        regINS(CK_INS, cTL(moveNumList), xgetCValueMoveNum(), "MOVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNumList The collection of moveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum_NotInScope(Collection<java.math.BigDecimal> moveNumList) {
        doSetMoveNum_NotInScope(moveNumList);
    }

    protected void doSetMoveNum_NotInScope(Collection<java.math.BigDecimal> moveNumList) {
        regINS(CK_NINS, cTL(moveNumList), xgetCValueMoveNum(), "MOVE_NUM");
    }

    protected void regMoveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNum(), "MOVE_NUM"); }
    protected abstract ConditionValue xgetCValueMoveNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_Equal(java.math.BigDecimal transitNum) {
        doSetTransitNum_Equal(transitNum);
    }

    protected void doSetTransitNum_Equal(java.math.BigDecimal transitNum) {
        regTransitNum(CK_EQ, transitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_NotEqual(java.math.BigDecimal transitNum) {
        doSetTransitNum_NotEqual(transitNum);
    }

    protected void doSetTransitNum_NotEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_NES, transitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_GreaterThan(java.math.BigDecimal transitNum) {
        regTransitNum(CK_GT, transitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_LessThan(java.math.BigDecimal transitNum) {
        regTransitNum(CK_LT, transitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_GreaterEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_GE, transitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_LessEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_LE, transitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNum(), "TRANSIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNumList The collection of transitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum_InScope(Collection<java.math.BigDecimal> transitNumList) {
        doSetTransitNum_InScope(transitNumList);
    }

    protected void doSetTransitNum_InScope(Collection<java.math.BigDecimal> transitNumList) {
        regINS(CK_INS, cTL(transitNumList), xgetCValueTransitNum(), "TRANSIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNumList The collection of transitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum_NotInScope(Collection<java.math.BigDecimal> transitNumList) {
        doSetTransitNum_NotInScope(transitNumList);
    }

    protected void doSetTransitNum_NotInScope(Collection<java.math.BigDecimal> transitNumList) {
        regINS(CK_NINS, cTL(transitNumList), xgetCValueTransitNum(), "TRANSIT_NUM");
    }

    protected void regTransitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNum(), "TRANSIT_NUM"); }
    protected abstract ConditionValue xgetCValueTransitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDay The value of storeNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumDay_Equal(java.math.BigDecimal storeNumDay) {
        doSetStoreNumDay_Equal(storeNumDay);
    }

    protected void doSetStoreNumDay_Equal(java.math.BigDecimal storeNumDay) {
        regStoreNumDay(CK_EQ, storeNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDay The value of storeNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumDay_NotEqual(java.math.BigDecimal storeNumDay) {
        doSetStoreNumDay_NotEqual(storeNumDay);
    }

    protected void doSetStoreNumDay_NotEqual(java.math.BigDecimal storeNumDay) {
        regStoreNumDay(CK_NES, storeNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDay The value of storeNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumDay_GreaterThan(java.math.BigDecimal storeNumDay) {
        regStoreNumDay(CK_GT, storeNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDay The value of storeNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumDay_LessThan(java.math.BigDecimal storeNumDay) {
        regStoreNumDay(CK_LT, storeNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDay The value of storeNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumDay_GreaterEqual(java.math.BigDecimal storeNumDay) {
        regStoreNumDay(CK_GE, storeNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDay The value of storeNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumDay_LessEqual(java.math.BigDecimal storeNumDay) {
        regStoreNumDay(CK_LE, storeNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of storeNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNumDay(), "STORE_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDayList The collection of storeNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNumDay_InScope(Collection<java.math.BigDecimal> storeNumDayList) {
        doSetStoreNumDay_InScope(storeNumDayList);
    }

    protected void doSetStoreNumDay_InScope(Collection<java.math.BigDecimal> storeNumDayList) {
        regINS(CK_INS, cTL(storeNumDayList), xgetCValueStoreNumDay(), "STORE_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param storeNumDayList The collection of storeNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNumDay_NotInScope(Collection<java.math.BigDecimal> storeNumDayList) {
        doSetStoreNumDay_NotInScope(storeNumDayList);
    }

    protected void doSetStoreNumDay_NotInScope(Collection<java.math.BigDecimal> storeNumDayList) {
        regINS(CK_NINS, cTL(storeNumDayList), xgetCValueStoreNumDay(), "STORE_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setStoreNumDay_IsNull() { regStoreNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setStoreNumDay_IsNotNull() { regStoreNumDay(CK_ISNN, DOBJ); }

    protected void regStoreNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNumDay(), "STORE_NUM_DAY"); }
    protected abstract ConditionValue xgetCValueStoreNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDay The value of pickingNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumDay_Equal(java.math.BigDecimal pickingNumDay) {
        doSetPickingNumDay_Equal(pickingNumDay);
    }

    protected void doSetPickingNumDay_Equal(java.math.BigDecimal pickingNumDay) {
        regPickingNumDay(CK_EQ, pickingNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDay The value of pickingNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumDay_NotEqual(java.math.BigDecimal pickingNumDay) {
        doSetPickingNumDay_NotEqual(pickingNumDay);
    }

    protected void doSetPickingNumDay_NotEqual(java.math.BigDecimal pickingNumDay) {
        regPickingNumDay(CK_NES, pickingNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDay The value of pickingNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumDay_GreaterThan(java.math.BigDecimal pickingNumDay) {
        regPickingNumDay(CK_GT, pickingNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDay The value of pickingNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumDay_LessThan(java.math.BigDecimal pickingNumDay) {
        regPickingNumDay(CK_LT, pickingNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDay The value of pickingNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumDay_GreaterEqual(java.math.BigDecimal pickingNumDay) {
        regPickingNumDay(CK_GE, pickingNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDay The value of pickingNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumDay_LessEqual(java.math.BigDecimal pickingNumDay) {
        regPickingNumDay(CK_LE, pickingNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pickingNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingNumDay(), "PICKING_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDayList The collection of pickingNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNumDay_InScope(Collection<java.math.BigDecimal> pickingNumDayList) {
        doSetPickingNumDay_InScope(pickingNumDayList);
    }

    protected void doSetPickingNumDay_InScope(Collection<java.math.BigDecimal> pickingNumDayList) {
        regINS(CK_INS, cTL(pickingNumDayList), xgetCValuePickingNumDay(), "PICKING_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pickingNumDayList The collection of pickingNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNumDay_NotInScope(Collection<java.math.BigDecimal> pickingNumDayList) {
        doSetPickingNumDay_NotInScope(pickingNumDayList);
    }

    protected void doSetPickingNumDay_NotInScope(Collection<java.math.BigDecimal> pickingNumDayList) {
        regINS(CK_NINS, cTL(pickingNumDayList), xgetCValuePickingNumDay(), "PICKING_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPickingNumDay_IsNull() { regPickingNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPickingNumDay_IsNotNull() { regPickingNumDay(CK_ISNN, DOBJ); }

    protected void regPickingNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingNumDay(), "PICKING_NUM_DAY"); }
    protected abstract ConditionValue xgetCValuePickingNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDay The value of movePlsNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_Equal(java.math.BigDecimal movePlsNumDay) {
        doSetMovePlsNumDay_Equal(movePlsNumDay);
    }

    protected void doSetMovePlsNumDay_Equal(java.math.BigDecimal movePlsNumDay) {
        regMovePlsNumDay(CK_EQ, movePlsNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDay The value of movePlsNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_NotEqual(java.math.BigDecimal movePlsNumDay) {
        doSetMovePlsNumDay_NotEqual(movePlsNumDay);
    }

    protected void doSetMovePlsNumDay_NotEqual(java.math.BigDecimal movePlsNumDay) {
        regMovePlsNumDay(CK_NES, movePlsNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDay The value of movePlsNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_GreaterThan(java.math.BigDecimal movePlsNumDay) {
        regMovePlsNumDay(CK_GT, movePlsNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDay The value of movePlsNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_LessThan(java.math.BigDecimal movePlsNumDay) {
        regMovePlsNumDay(CK_LT, movePlsNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDay The value of movePlsNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_GreaterEqual(java.math.BigDecimal movePlsNumDay) {
        regMovePlsNumDay(CK_GE, movePlsNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDay The value of movePlsNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_LessEqual(java.math.BigDecimal movePlsNumDay) {
        regMovePlsNumDay(CK_LE, movePlsNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of movePlsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of movePlsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMovePlsNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMovePlsNumDay(), "MOVE_PLS_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDayList The collection of movePlsNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_InScope(Collection<java.math.BigDecimal> movePlsNumDayList) {
        doSetMovePlsNumDay_InScope(movePlsNumDayList);
    }

    protected void doSetMovePlsNumDay_InScope(Collection<java.math.BigDecimal> movePlsNumDayList) {
        regINS(CK_INS, cTL(movePlsNumDayList), xgetCValueMovePlsNumDay(), "MOVE_PLS_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumDayList The collection of movePlsNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovePlsNumDay_NotInScope(Collection<java.math.BigDecimal> movePlsNumDayList) {
        doSetMovePlsNumDay_NotInScope(movePlsNumDayList);
    }

    protected void doSetMovePlsNumDay_NotInScope(Collection<java.math.BigDecimal> movePlsNumDayList) {
        regINS(CK_NINS, cTL(movePlsNumDayList), xgetCValueMovePlsNumDay(), "MOVE_PLS_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setMovePlsNumDay_IsNull() { regMovePlsNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setMovePlsNumDay_IsNotNull() { regMovePlsNumDay(CK_ISNN, DOBJ); }

    protected void regMovePlsNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMovePlsNumDay(), "MOVE_PLS_NUM_DAY"); }
    protected abstract ConditionValue xgetCValueMovePlsNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDay The value of moveMnsNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_Equal(java.math.BigDecimal moveMnsNumDay) {
        doSetMoveMnsNumDay_Equal(moveMnsNumDay);
    }

    protected void doSetMoveMnsNumDay_Equal(java.math.BigDecimal moveMnsNumDay) {
        regMoveMnsNumDay(CK_EQ, moveMnsNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDay The value of moveMnsNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_NotEqual(java.math.BigDecimal moveMnsNumDay) {
        doSetMoveMnsNumDay_NotEqual(moveMnsNumDay);
    }

    protected void doSetMoveMnsNumDay_NotEqual(java.math.BigDecimal moveMnsNumDay) {
        regMoveMnsNumDay(CK_NES, moveMnsNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDay The value of moveMnsNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_GreaterThan(java.math.BigDecimal moveMnsNumDay) {
        regMoveMnsNumDay(CK_GT, moveMnsNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDay The value of moveMnsNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_LessThan(java.math.BigDecimal moveMnsNumDay) {
        regMoveMnsNumDay(CK_LT, moveMnsNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDay The value of moveMnsNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_GreaterEqual(java.math.BigDecimal moveMnsNumDay) {
        regMoveMnsNumDay(CK_GE, moveMnsNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDay The value of moveMnsNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_LessEqual(java.math.BigDecimal moveMnsNumDay) {
        regMoveMnsNumDay(CK_LE, moveMnsNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveMnsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveMnsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveMnsNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveMnsNumDay(), "MOVE_MNS_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDayList The collection of moveMnsNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_InScope(Collection<java.math.BigDecimal> moveMnsNumDayList) {
        doSetMoveMnsNumDay_InScope(moveMnsNumDayList);
    }

    protected void doSetMoveMnsNumDay_InScope(Collection<java.math.BigDecimal> moveMnsNumDayList) {
        regINS(CK_INS, cTL(moveMnsNumDayList), xgetCValueMoveMnsNumDay(), "MOVE_MNS_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumDayList The collection of moveMnsNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveMnsNumDay_NotInScope(Collection<java.math.BigDecimal> moveMnsNumDayList) {
        doSetMoveMnsNumDay_NotInScope(moveMnsNumDayList);
    }

    protected void doSetMoveMnsNumDay_NotInScope(Collection<java.math.BigDecimal> moveMnsNumDayList) {
        regINS(CK_NINS, cTL(moveMnsNumDayList), xgetCValueMoveMnsNumDay(), "MOVE_MNS_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveMnsNumDay_IsNull() { regMoveMnsNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveMnsNumDay_IsNotNull() { regMoveMnsNumDay(CK_ISNN, DOBJ); }

    protected void regMoveMnsNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveMnsNumDay(), "MOVE_MNS_NUM_DAY"); }
    protected abstract ConditionValue xgetCValueMoveMnsNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDay The value of adjPlsNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_Equal(java.math.BigDecimal adjPlsNumDay) {
        doSetAdjPlsNumDay_Equal(adjPlsNumDay);
    }

    protected void doSetAdjPlsNumDay_Equal(java.math.BigDecimal adjPlsNumDay) {
        regAdjPlsNumDay(CK_EQ, adjPlsNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDay The value of adjPlsNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_NotEqual(java.math.BigDecimal adjPlsNumDay) {
        doSetAdjPlsNumDay_NotEqual(adjPlsNumDay);
    }

    protected void doSetAdjPlsNumDay_NotEqual(java.math.BigDecimal adjPlsNumDay) {
        regAdjPlsNumDay(CK_NES, adjPlsNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDay The value of adjPlsNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_GreaterThan(java.math.BigDecimal adjPlsNumDay) {
        regAdjPlsNumDay(CK_GT, adjPlsNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDay The value of adjPlsNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_LessThan(java.math.BigDecimal adjPlsNumDay) {
        regAdjPlsNumDay(CK_LT, adjPlsNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDay The value of adjPlsNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_GreaterEqual(java.math.BigDecimal adjPlsNumDay) {
        regAdjPlsNumDay(CK_GE, adjPlsNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDay The value of adjPlsNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_LessEqual(java.math.BigDecimal adjPlsNumDay) {
        regAdjPlsNumDay(CK_LE, adjPlsNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of adjPlsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjPlsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjPlsNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjPlsNumDay(), "ADJ_PLS_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDayList The collection of adjPlsNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_InScope(Collection<java.math.BigDecimal> adjPlsNumDayList) {
        doSetAdjPlsNumDay_InScope(adjPlsNumDayList);
    }

    protected void doSetAdjPlsNumDay_InScope(Collection<java.math.BigDecimal> adjPlsNumDayList) {
        regINS(CK_INS, cTL(adjPlsNumDayList), xgetCValueAdjPlsNumDay(), "ADJ_PLS_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumDayList The collection of adjPlsNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjPlsNumDay_NotInScope(Collection<java.math.BigDecimal> adjPlsNumDayList) {
        doSetAdjPlsNumDay_NotInScope(adjPlsNumDayList);
    }

    protected void doSetAdjPlsNumDay_NotInScope(Collection<java.math.BigDecimal> adjPlsNumDayList) {
        regINS(CK_NINS, cTL(adjPlsNumDayList), xgetCValueAdjPlsNumDay(), "ADJ_PLS_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjPlsNumDay_IsNull() { regAdjPlsNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjPlsNumDay_IsNotNull() { regAdjPlsNumDay(CK_ISNN, DOBJ); }

    protected void regAdjPlsNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjPlsNumDay(), "ADJ_PLS_NUM_DAY"); }
    protected abstract ConditionValue xgetCValueAdjPlsNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDay The value of adjMnsNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_Equal(java.math.BigDecimal adjMnsNumDay) {
        doSetAdjMnsNumDay_Equal(adjMnsNumDay);
    }

    protected void doSetAdjMnsNumDay_Equal(java.math.BigDecimal adjMnsNumDay) {
        regAdjMnsNumDay(CK_EQ, adjMnsNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDay The value of adjMnsNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_NotEqual(java.math.BigDecimal adjMnsNumDay) {
        doSetAdjMnsNumDay_NotEqual(adjMnsNumDay);
    }

    protected void doSetAdjMnsNumDay_NotEqual(java.math.BigDecimal adjMnsNumDay) {
        regAdjMnsNumDay(CK_NES, adjMnsNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDay The value of adjMnsNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_GreaterThan(java.math.BigDecimal adjMnsNumDay) {
        regAdjMnsNumDay(CK_GT, adjMnsNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDay The value of adjMnsNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_LessThan(java.math.BigDecimal adjMnsNumDay) {
        regAdjMnsNumDay(CK_LT, adjMnsNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDay The value of adjMnsNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_GreaterEqual(java.math.BigDecimal adjMnsNumDay) {
        regAdjMnsNumDay(CK_GE, adjMnsNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDay The value of adjMnsNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_LessEqual(java.math.BigDecimal adjMnsNumDay) {
        regAdjMnsNumDay(CK_LE, adjMnsNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of adjMnsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjMnsNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjMnsNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjMnsNumDay(), "ADJ_MNS_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDayList The collection of adjMnsNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_InScope(Collection<java.math.BigDecimal> adjMnsNumDayList) {
        doSetAdjMnsNumDay_InScope(adjMnsNumDayList);
    }

    protected void doSetAdjMnsNumDay_InScope(Collection<java.math.BigDecimal> adjMnsNumDayList) {
        regINS(CK_INS, cTL(adjMnsNumDayList), xgetCValueAdjMnsNumDay(), "ADJ_MNS_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumDayList The collection of adjMnsNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjMnsNumDay_NotInScope(Collection<java.math.BigDecimal> adjMnsNumDayList) {
        doSetAdjMnsNumDay_NotInScope(adjMnsNumDayList);
    }

    protected void doSetAdjMnsNumDay_NotInScope(Collection<java.math.BigDecimal> adjMnsNumDayList) {
        regINS(CK_NINS, cTL(adjMnsNumDayList), xgetCValueAdjMnsNumDay(), "ADJ_MNS_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjMnsNumDay_IsNull() { regAdjMnsNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjMnsNumDay_IsNotNull() { regAdjMnsNumDay(CK_ISNN, DOBJ); }

    protected void regAdjMnsNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjMnsNumDay(), "ADJ_MNS_NUM_DAY"); }
    protected abstract ConditionValue xgetCValueAdjMnsNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDay The value of pChargeNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumDay_Equal(java.math.BigDecimal pChargeNumDay) {
        doSetPChargeNumDay_Equal(pChargeNumDay);
    }

    protected void doSetPChargeNumDay_Equal(java.math.BigDecimal pChargeNumDay) {
        regPChargeNumDay(CK_EQ, pChargeNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDay The value of pChargeNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumDay_NotEqual(java.math.BigDecimal pChargeNumDay) {
        doSetPChargeNumDay_NotEqual(pChargeNumDay);
    }

    protected void doSetPChargeNumDay_NotEqual(java.math.BigDecimal pChargeNumDay) {
        regPChargeNumDay(CK_NES, pChargeNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDay The value of pChargeNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumDay_GreaterThan(java.math.BigDecimal pChargeNumDay) {
        regPChargeNumDay(CK_GT, pChargeNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDay The value of pChargeNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumDay_LessThan(java.math.BigDecimal pChargeNumDay) {
        regPChargeNumDay(CK_LT, pChargeNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDay The value of pChargeNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumDay_GreaterEqual(java.math.BigDecimal pChargeNumDay) {
        regPChargeNumDay(CK_GE, pChargeNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDay The value of pChargeNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumDay_LessEqual(java.math.BigDecimal pChargeNumDay) {
        regPChargeNumDay(CK_LE, pChargeNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pChargeNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pChargeNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPChargeNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePChargeNumDay(), "P_CHARGE_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDayList The collection of pChargeNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPChargeNumDay_InScope(Collection<java.math.BigDecimal> pChargeNumDayList) {
        doSetPChargeNumDay_InScope(pChargeNumDayList);
    }

    protected void doSetPChargeNumDay_InScope(Collection<java.math.BigDecimal> pChargeNumDayList) {
        regINS(CK_INS, cTL(pChargeNumDayList), xgetCValuePChargeNumDay(), "P_CHARGE_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumDayList The collection of pChargeNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPChargeNumDay_NotInScope(Collection<java.math.BigDecimal> pChargeNumDayList) {
        doSetPChargeNumDay_NotInScope(pChargeNumDayList);
    }

    protected void doSetPChargeNumDay_NotInScope(Collection<java.math.BigDecimal> pChargeNumDayList) {
        regINS(CK_NINS, cTL(pChargeNumDayList), xgetCValuePChargeNumDay(), "P_CHARGE_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPChargeNumDay_IsNull() { regPChargeNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPChargeNumDay_IsNotNull() { regPChargeNumDay(CK_ISNN, DOBJ); }

    protected void regPChargeNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePChargeNumDay(), "P_CHARGE_NUM_DAY"); }
    protected abstract ConditionValue xgetCValuePChargeNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDay The value of pAllocNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumDay_Equal(java.math.BigDecimal pAllocNumDay) {
        doSetPAllocNumDay_Equal(pAllocNumDay);
    }

    protected void doSetPAllocNumDay_Equal(java.math.BigDecimal pAllocNumDay) {
        regPAllocNumDay(CK_EQ, pAllocNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDay The value of pAllocNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumDay_NotEqual(java.math.BigDecimal pAllocNumDay) {
        doSetPAllocNumDay_NotEqual(pAllocNumDay);
    }

    protected void doSetPAllocNumDay_NotEqual(java.math.BigDecimal pAllocNumDay) {
        regPAllocNumDay(CK_NES, pAllocNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDay The value of pAllocNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumDay_GreaterThan(java.math.BigDecimal pAllocNumDay) {
        regPAllocNumDay(CK_GT, pAllocNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDay The value of pAllocNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumDay_LessThan(java.math.BigDecimal pAllocNumDay) {
        regPAllocNumDay(CK_LT, pAllocNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDay The value of pAllocNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumDay_GreaterEqual(java.math.BigDecimal pAllocNumDay) {
        regPAllocNumDay(CK_GE, pAllocNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDay The value of pAllocNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumDay_LessEqual(java.math.BigDecimal pAllocNumDay) {
        regPAllocNumDay(CK_LE, pAllocNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pAllocNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pAllocNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPAllocNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePAllocNumDay(), "P_ALLOC_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDayList The collection of pAllocNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPAllocNumDay_InScope(Collection<java.math.BigDecimal> pAllocNumDayList) {
        doSetPAllocNumDay_InScope(pAllocNumDayList);
    }

    protected void doSetPAllocNumDay_InScope(Collection<java.math.BigDecimal> pAllocNumDayList) {
        regINS(CK_INS, cTL(pAllocNumDayList), xgetCValuePAllocNumDay(), "P_ALLOC_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumDayList The collection of pAllocNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPAllocNumDay_NotInScope(Collection<java.math.BigDecimal> pAllocNumDayList) {
        doSetPAllocNumDay_NotInScope(pAllocNumDayList);
    }

    protected void doSetPAllocNumDay_NotInScope(Collection<java.math.BigDecimal> pAllocNumDayList) {
        regINS(CK_NINS, cTL(pAllocNumDayList), xgetCValuePAllocNumDay(), "P_ALLOC_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPAllocNumDay_IsNull() { regPAllocNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPAllocNumDay_IsNotNull() { regPAllocNumDay(CK_ISNN, DOBJ); }

    protected void regPAllocNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePAllocNumDay(), "P_ALLOC_NUM_DAY"); }
    protected abstract ConditionValue xgetCValuePAllocNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDay The value of pMoveNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumDay_Equal(java.math.BigDecimal pMoveNumDay) {
        doSetPMoveNumDay_Equal(pMoveNumDay);
    }

    protected void doSetPMoveNumDay_Equal(java.math.BigDecimal pMoveNumDay) {
        regPMoveNumDay(CK_EQ, pMoveNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDay The value of pMoveNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumDay_NotEqual(java.math.BigDecimal pMoveNumDay) {
        doSetPMoveNumDay_NotEqual(pMoveNumDay);
    }

    protected void doSetPMoveNumDay_NotEqual(java.math.BigDecimal pMoveNumDay) {
        regPMoveNumDay(CK_NES, pMoveNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDay The value of pMoveNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumDay_GreaterThan(java.math.BigDecimal pMoveNumDay) {
        regPMoveNumDay(CK_GT, pMoveNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDay The value of pMoveNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumDay_LessThan(java.math.BigDecimal pMoveNumDay) {
        regPMoveNumDay(CK_LT, pMoveNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDay The value of pMoveNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumDay_GreaterEqual(java.math.BigDecimal pMoveNumDay) {
        regPMoveNumDay(CK_GE, pMoveNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDay The value of pMoveNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumDay_LessEqual(java.math.BigDecimal pMoveNumDay) {
        regPMoveNumDay(CK_LE, pMoveNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pMoveNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pMoveNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPMoveNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePMoveNumDay(), "P_MOVE_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDayList The collection of pMoveNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPMoveNumDay_InScope(Collection<java.math.BigDecimal> pMoveNumDayList) {
        doSetPMoveNumDay_InScope(pMoveNumDayList);
    }

    protected void doSetPMoveNumDay_InScope(Collection<java.math.BigDecimal> pMoveNumDayList) {
        regINS(CK_INS, cTL(pMoveNumDayList), xgetCValuePMoveNumDay(), "P_MOVE_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumDayList The collection of pMoveNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPMoveNumDay_NotInScope(Collection<java.math.BigDecimal> pMoveNumDayList) {
        doSetPMoveNumDay_NotInScope(pMoveNumDayList);
    }

    protected void doSetPMoveNumDay_NotInScope(Collection<java.math.BigDecimal> pMoveNumDayList) {
        regINS(CK_NINS, cTL(pMoveNumDayList), xgetCValuePMoveNumDay(), "P_MOVE_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPMoveNumDay_IsNull() { regPMoveNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPMoveNumDay_IsNotNull() { regPMoveNumDay(CK_ISNN, DOBJ); }

    protected void regPMoveNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePMoveNumDay(), "P_MOVE_NUM_DAY"); }
    protected abstract ConditionValue xgetCValuePMoveNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDay The value of pTransitNumDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumDay_Equal(java.math.BigDecimal pTransitNumDay) {
        doSetPTransitNumDay_Equal(pTransitNumDay);
    }

    protected void doSetPTransitNumDay_Equal(java.math.BigDecimal pTransitNumDay) {
        regPTransitNumDay(CK_EQ, pTransitNumDay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDay The value of pTransitNumDay as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumDay_NotEqual(java.math.BigDecimal pTransitNumDay) {
        doSetPTransitNumDay_NotEqual(pTransitNumDay);
    }

    protected void doSetPTransitNumDay_NotEqual(java.math.BigDecimal pTransitNumDay) {
        regPTransitNumDay(CK_NES, pTransitNumDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDay The value of pTransitNumDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumDay_GreaterThan(java.math.BigDecimal pTransitNumDay) {
        regPTransitNumDay(CK_GT, pTransitNumDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDay The value of pTransitNumDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumDay_LessThan(java.math.BigDecimal pTransitNumDay) {
        regPTransitNumDay(CK_LT, pTransitNumDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDay The value of pTransitNumDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumDay_GreaterEqual(java.math.BigDecimal pTransitNumDay) {
        regPTransitNumDay(CK_GE, pTransitNumDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDay The value of pTransitNumDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumDay_LessEqual(java.math.BigDecimal pTransitNumDay) {
        regPTransitNumDay(CK_LE, pTransitNumDay);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pTransitNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pTransitNumDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPTransitNumDay_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePTransitNumDay(), "P_TRANSIT_NUM_DAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDayList The collection of pTransitNumDay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTransitNumDay_InScope(Collection<java.math.BigDecimal> pTransitNumDayList) {
        doSetPTransitNumDay_InScope(pTransitNumDayList);
    }

    protected void doSetPTransitNumDay_InScope(Collection<java.math.BigDecimal> pTransitNumDayList) {
        regINS(CK_INS, cTL(pTransitNumDayList), xgetCValuePTransitNumDay(), "P_TRANSIT_NUM_DAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumDayList The collection of pTransitNumDay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTransitNumDay_NotInScope(Collection<java.math.BigDecimal> pTransitNumDayList) {
        doSetPTransitNumDay_NotInScope(pTransitNumDayList);
    }

    protected void doSetPTransitNumDay_NotInScope(Collection<java.math.BigDecimal> pTransitNumDayList) {
        regINS(CK_NINS, cTL(pTransitNumDayList), xgetCValuePTransitNumDay(), "P_TRANSIT_NUM_DAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPTransitNumDay_IsNull() { regPTransitNumDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     */
    public void setPTransitNumDay_IsNotNull() { regPTransitNumDay(CK_ISNN, DOBJ); }

    protected void regPTransitNumDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePTransitNumDay(), "P_TRANSIT_NUM_DAY"); }
    protected abstract ConditionValue xgetCValuePTransitNumDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonth The value of storeNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumMonth_Equal(java.math.BigDecimal storeNumMonth) {
        doSetStoreNumMonth_Equal(storeNumMonth);
    }

    protected void doSetStoreNumMonth_Equal(java.math.BigDecimal storeNumMonth) {
        regStoreNumMonth(CK_EQ, storeNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonth The value of storeNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumMonth_NotEqual(java.math.BigDecimal storeNumMonth) {
        doSetStoreNumMonth_NotEqual(storeNumMonth);
    }

    protected void doSetStoreNumMonth_NotEqual(java.math.BigDecimal storeNumMonth) {
        regStoreNumMonth(CK_NES, storeNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonth The value of storeNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumMonth_GreaterThan(java.math.BigDecimal storeNumMonth) {
        regStoreNumMonth(CK_GT, storeNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonth The value of storeNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumMonth_LessThan(java.math.BigDecimal storeNumMonth) {
        regStoreNumMonth(CK_LT, storeNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonth The value of storeNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumMonth_GreaterEqual(java.math.BigDecimal storeNumMonth) {
        regStoreNumMonth(CK_GE, storeNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonth The value of storeNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNumMonth_LessEqual(java.math.BigDecimal storeNumMonth) {
        regStoreNumMonth(CK_LE, storeNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of storeNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNumMonth(), "STORE_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonthList The collection of storeNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNumMonth_InScope(Collection<java.math.BigDecimal> storeNumMonthList) {
        doSetStoreNumMonth_InScope(storeNumMonthList);
    }

    protected void doSetStoreNumMonth_InScope(Collection<java.math.BigDecimal> storeNumMonthList) {
        regINS(CK_INS, cTL(storeNumMonthList), xgetCValueStoreNumMonth(), "STORE_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param storeNumMonthList The collection of storeNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNumMonth_NotInScope(Collection<java.math.BigDecimal> storeNumMonthList) {
        doSetStoreNumMonth_NotInScope(storeNumMonthList);
    }

    protected void doSetStoreNumMonth_NotInScope(Collection<java.math.BigDecimal> storeNumMonthList) {
        regINS(CK_NINS, cTL(storeNumMonthList), xgetCValueStoreNumMonth(), "STORE_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setStoreNumMonth_IsNull() { regStoreNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setStoreNumMonth_IsNotNull() { regStoreNumMonth(CK_ISNN, DOBJ); }

    protected void regStoreNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNumMonth(), "STORE_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValueStoreNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonth The value of pickingNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumMonth_Equal(java.math.BigDecimal pickingNumMonth) {
        doSetPickingNumMonth_Equal(pickingNumMonth);
    }

    protected void doSetPickingNumMonth_Equal(java.math.BigDecimal pickingNumMonth) {
        regPickingNumMonth(CK_EQ, pickingNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonth The value of pickingNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumMonth_NotEqual(java.math.BigDecimal pickingNumMonth) {
        doSetPickingNumMonth_NotEqual(pickingNumMonth);
    }

    protected void doSetPickingNumMonth_NotEqual(java.math.BigDecimal pickingNumMonth) {
        regPickingNumMonth(CK_NES, pickingNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonth The value of pickingNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumMonth_GreaterThan(java.math.BigDecimal pickingNumMonth) {
        regPickingNumMonth(CK_GT, pickingNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonth The value of pickingNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumMonth_LessThan(java.math.BigDecimal pickingNumMonth) {
        regPickingNumMonth(CK_LT, pickingNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonth The value of pickingNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumMonth_GreaterEqual(java.math.BigDecimal pickingNumMonth) {
        regPickingNumMonth(CK_GE, pickingNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonth The value of pickingNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNumMonth_LessEqual(java.math.BigDecimal pickingNumMonth) {
        regPickingNumMonth(CK_LE, pickingNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pickingNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingNumMonth(), "PICKING_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonthList The collection of pickingNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNumMonth_InScope(Collection<java.math.BigDecimal> pickingNumMonthList) {
        doSetPickingNumMonth_InScope(pickingNumMonthList);
    }

    protected void doSetPickingNumMonth_InScope(Collection<java.math.BigDecimal> pickingNumMonthList) {
        regINS(CK_INS, cTL(pickingNumMonthList), xgetCValuePickingNumMonth(), "PICKING_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pickingNumMonthList The collection of pickingNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNumMonth_NotInScope(Collection<java.math.BigDecimal> pickingNumMonthList) {
        doSetPickingNumMonth_NotInScope(pickingNumMonthList);
    }

    protected void doSetPickingNumMonth_NotInScope(Collection<java.math.BigDecimal> pickingNumMonthList) {
        regINS(CK_NINS, cTL(pickingNumMonthList), xgetCValuePickingNumMonth(), "PICKING_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPickingNumMonth_IsNull() { regPickingNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPickingNumMonth_IsNotNull() { regPickingNumMonth(CK_ISNN, DOBJ); }

    protected void regPickingNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingNumMonth(), "PICKING_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValuePickingNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonth The value of movePlsNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_Equal(java.math.BigDecimal movePlsNumMonth) {
        doSetMovePlsNumMonth_Equal(movePlsNumMonth);
    }

    protected void doSetMovePlsNumMonth_Equal(java.math.BigDecimal movePlsNumMonth) {
        regMovePlsNumMonth(CK_EQ, movePlsNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonth The value of movePlsNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_NotEqual(java.math.BigDecimal movePlsNumMonth) {
        doSetMovePlsNumMonth_NotEqual(movePlsNumMonth);
    }

    protected void doSetMovePlsNumMonth_NotEqual(java.math.BigDecimal movePlsNumMonth) {
        regMovePlsNumMonth(CK_NES, movePlsNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonth The value of movePlsNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_GreaterThan(java.math.BigDecimal movePlsNumMonth) {
        regMovePlsNumMonth(CK_GT, movePlsNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonth The value of movePlsNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_LessThan(java.math.BigDecimal movePlsNumMonth) {
        regMovePlsNumMonth(CK_LT, movePlsNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonth The value of movePlsNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_GreaterEqual(java.math.BigDecimal movePlsNumMonth) {
        regMovePlsNumMonth(CK_GE, movePlsNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonth The value of movePlsNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_LessEqual(java.math.BigDecimal movePlsNumMonth) {
        regMovePlsNumMonth(CK_LE, movePlsNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of movePlsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of movePlsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMovePlsNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMovePlsNumMonth(), "MOVE_PLS_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonthList The collection of movePlsNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_InScope(Collection<java.math.BigDecimal> movePlsNumMonthList) {
        doSetMovePlsNumMonth_InScope(movePlsNumMonthList);
    }

    protected void doSetMovePlsNumMonth_InScope(Collection<java.math.BigDecimal> movePlsNumMonthList) {
        regINS(CK_INS, cTL(movePlsNumMonthList), xgetCValueMovePlsNumMonth(), "MOVE_PLS_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param movePlsNumMonthList The collection of movePlsNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovePlsNumMonth_NotInScope(Collection<java.math.BigDecimal> movePlsNumMonthList) {
        doSetMovePlsNumMonth_NotInScope(movePlsNumMonthList);
    }

    protected void doSetMovePlsNumMonth_NotInScope(Collection<java.math.BigDecimal> movePlsNumMonthList) {
        regINS(CK_NINS, cTL(movePlsNumMonthList), xgetCValueMovePlsNumMonth(), "MOVE_PLS_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setMovePlsNumMonth_IsNull() { regMovePlsNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setMovePlsNumMonth_IsNotNull() { regMovePlsNumMonth(CK_ISNN, DOBJ); }

    protected void regMovePlsNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMovePlsNumMonth(), "MOVE_PLS_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValueMovePlsNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonth The value of moveMnsNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_Equal(java.math.BigDecimal moveMnsNumMonth) {
        doSetMoveMnsNumMonth_Equal(moveMnsNumMonth);
    }

    protected void doSetMoveMnsNumMonth_Equal(java.math.BigDecimal moveMnsNumMonth) {
        regMoveMnsNumMonth(CK_EQ, moveMnsNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonth The value of moveMnsNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_NotEqual(java.math.BigDecimal moveMnsNumMonth) {
        doSetMoveMnsNumMonth_NotEqual(moveMnsNumMonth);
    }

    protected void doSetMoveMnsNumMonth_NotEqual(java.math.BigDecimal moveMnsNumMonth) {
        regMoveMnsNumMonth(CK_NES, moveMnsNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonth The value of moveMnsNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_GreaterThan(java.math.BigDecimal moveMnsNumMonth) {
        regMoveMnsNumMonth(CK_GT, moveMnsNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonth The value of moveMnsNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_LessThan(java.math.BigDecimal moveMnsNumMonth) {
        regMoveMnsNumMonth(CK_LT, moveMnsNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonth The value of moveMnsNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_GreaterEqual(java.math.BigDecimal moveMnsNumMonth) {
        regMoveMnsNumMonth(CK_GE, moveMnsNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonth The value of moveMnsNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_LessEqual(java.math.BigDecimal moveMnsNumMonth) {
        regMoveMnsNumMonth(CK_LE, moveMnsNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveMnsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveMnsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveMnsNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveMnsNumMonth(), "MOVE_MNS_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonthList The collection of moveMnsNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_InScope(Collection<java.math.BigDecimal> moveMnsNumMonthList) {
        doSetMoveMnsNumMonth_InScope(moveMnsNumMonthList);
    }

    protected void doSetMoveMnsNumMonth_InScope(Collection<java.math.BigDecimal> moveMnsNumMonthList) {
        regINS(CK_INS, cTL(moveMnsNumMonthList), xgetCValueMoveMnsNumMonth(), "MOVE_MNS_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param moveMnsNumMonthList The collection of moveMnsNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveMnsNumMonth_NotInScope(Collection<java.math.BigDecimal> moveMnsNumMonthList) {
        doSetMoveMnsNumMonth_NotInScope(moveMnsNumMonthList);
    }

    protected void doSetMoveMnsNumMonth_NotInScope(Collection<java.math.BigDecimal> moveMnsNumMonthList) {
        regINS(CK_NINS, cTL(moveMnsNumMonthList), xgetCValueMoveMnsNumMonth(), "MOVE_MNS_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveMnsNumMonth_IsNull() { regMoveMnsNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveMnsNumMonth_IsNotNull() { regMoveMnsNumMonth(CK_ISNN, DOBJ); }

    protected void regMoveMnsNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveMnsNumMonth(), "MOVE_MNS_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValueMoveMnsNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonth The value of adjPlsNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_Equal(java.math.BigDecimal adjPlsNumMonth) {
        doSetAdjPlsNumMonth_Equal(adjPlsNumMonth);
    }

    protected void doSetAdjPlsNumMonth_Equal(java.math.BigDecimal adjPlsNumMonth) {
        regAdjPlsNumMonth(CK_EQ, adjPlsNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonth The value of adjPlsNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_NotEqual(java.math.BigDecimal adjPlsNumMonth) {
        doSetAdjPlsNumMonth_NotEqual(adjPlsNumMonth);
    }

    protected void doSetAdjPlsNumMonth_NotEqual(java.math.BigDecimal adjPlsNumMonth) {
        regAdjPlsNumMonth(CK_NES, adjPlsNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonth The value of adjPlsNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_GreaterThan(java.math.BigDecimal adjPlsNumMonth) {
        regAdjPlsNumMonth(CK_GT, adjPlsNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonth The value of adjPlsNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_LessThan(java.math.BigDecimal adjPlsNumMonth) {
        regAdjPlsNumMonth(CK_LT, adjPlsNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonth The value of adjPlsNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_GreaterEqual(java.math.BigDecimal adjPlsNumMonth) {
        regAdjPlsNumMonth(CK_GE, adjPlsNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonth The value of adjPlsNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_LessEqual(java.math.BigDecimal adjPlsNumMonth) {
        regAdjPlsNumMonth(CK_LE, adjPlsNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of adjPlsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjPlsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjPlsNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjPlsNumMonth(), "ADJ_PLS_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonthList The collection of adjPlsNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_InScope(Collection<java.math.BigDecimal> adjPlsNumMonthList) {
        doSetAdjPlsNumMonth_InScope(adjPlsNumMonthList);
    }

    protected void doSetAdjPlsNumMonth_InScope(Collection<java.math.BigDecimal> adjPlsNumMonthList) {
        regINS(CK_INS, cTL(adjPlsNumMonthList), xgetCValueAdjPlsNumMonth(), "ADJ_PLS_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjPlsNumMonthList The collection of adjPlsNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjPlsNumMonth_NotInScope(Collection<java.math.BigDecimal> adjPlsNumMonthList) {
        doSetAdjPlsNumMonth_NotInScope(adjPlsNumMonthList);
    }

    protected void doSetAdjPlsNumMonth_NotInScope(Collection<java.math.BigDecimal> adjPlsNumMonthList) {
        regINS(CK_NINS, cTL(adjPlsNumMonthList), xgetCValueAdjPlsNumMonth(), "ADJ_PLS_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjPlsNumMonth_IsNull() { regAdjPlsNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjPlsNumMonth_IsNotNull() { regAdjPlsNumMonth(CK_ISNN, DOBJ); }

    protected void regAdjPlsNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjPlsNumMonth(), "ADJ_PLS_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValueAdjPlsNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonth The value of adjMnsNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_Equal(java.math.BigDecimal adjMnsNumMonth) {
        doSetAdjMnsNumMonth_Equal(adjMnsNumMonth);
    }

    protected void doSetAdjMnsNumMonth_Equal(java.math.BigDecimal adjMnsNumMonth) {
        regAdjMnsNumMonth(CK_EQ, adjMnsNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonth The value of adjMnsNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_NotEqual(java.math.BigDecimal adjMnsNumMonth) {
        doSetAdjMnsNumMonth_NotEqual(adjMnsNumMonth);
    }

    protected void doSetAdjMnsNumMonth_NotEqual(java.math.BigDecimal adjMnsNumMonth) {
        regAdjMnsNumMonth(CK_NES, adjMnsNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonth The value of adjMnsNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_GreaterThan(java.math.BigDecimal adjMnsNumMonth) {
        regAdjMnsNumMonth(CK_GT, adjMnsNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonth The value of adjMnsNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_LessThan(java.math.BigDecimal adjMnsNumMonth) {
        regAdjMnsNumMonth(CK_LT, adjMnsNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonth The value of adjMnsNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_GreaterEqual(java.math.BigDecimal adjMnsNumMonth) {
        regAdjMnsNumMonth(CK_GE, adjMnsNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonth The value of adjMnsNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_LessEqual(java.math.BigDecimal adjMnsNumMonth) {
        regAdjMnsNumMonth(CK_LE, adjMnsNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of adjMnsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjMnsNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjMnsNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjMnsNumMonth(), "ADJ_MNS_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonthList The collection of adjMnsNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_InScope(Collection<java.math.BigDecimal> adjMnsNumMonthList) {
        doSetAdjMnsNumMonth_InScope(adjMnsNumMonthList);
    }

    protected void doSetAdjMnsNumMonth_InScope(Collection<java.math.BigDecimal> adjMnsNumMonthList) {
        regINS(CK_INS, cTL(adjMnsNumMonthList), xgetCValueAdjMnsNumMonth(), "ADJ_MNS_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param adjMnsNumMonthList The collection of adjMnsNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjMnsNumMonth_NotInScope(Collection<java.math.BigDecimal> adjMnsNumMonthList) {
        doSetAdjMnsNumMonth_NotInScope(adjMnsNumMonthList);
    }

    protected void doSetAdjMnsNumMonth_NotInScope(Collection<java.math.BigDecimal> adjMnsNumMonthList) {
        regINS(CK_NINS, cTL(adjMnsNumMonthList), xgetCValueAdjMnsNumMonth(), "ADJ_MNS_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjMnsNumMonth_IsNull() { regAdjMnsNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setAdjMnsNumMonth_IsNotNull() { regAdjMnsNumMonth(CK_ISNN, DOBJ); }

    protected void regAdjMnsNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjMnsNumMonth(), "ADJ_MNS_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValueAdjMnsNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonth The value of pChargeNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_Equal(java.math.BigDecimal pChargeNumMonth) {
        doSetPChargeNumMonth_Equal(pChargeNumMonth);
    }

    protected void doSetPChargeNumMonth_Equal(java.math.BigDecimal pChargeNumMonth) {
        regPChargeNumMonth(CK_EQ, pChargeNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonth The value of pChargeNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_NotEqual(java.math.BigDecimal pChargeNumMonth) {
        doSetPChargeNumMonth_NotEqual(pChargeNumMonth);
    }

    protected void doSetPChargeNumMonth_NotEqual(java.math.BigDecimal pChargeNumMonth) {
        regPChargeNumMonth(CK_NES, pChargeNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonth The value of pChargeNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_GreaterThan(java.math.BigDecimal pChargeNumMonth) {
        regPChargeNumMonth(CK_GT, pChargeNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonth The value of pChargeNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_LessThan(java.math.BigDecimal pChargeNumMonth) {
        regPChargeNumMonth(CK_LT, pChargeNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonth The value of pChargeNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_GreaterEqual(java.math.BigDecimal pChargeNumMonth) {
        regPChargeNumMonth(CK_GE, pChargeNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonth The value of pChargeNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_LessEqual(java.math.BigDecimal pChargeNumMonth) {
        regPChargeNumMonth(CK_LE, pChargeNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pChargeNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pChargeNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPChargeNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePChargeNumMonth(), "P_CHARGE_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonthList The collection of pChargeNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_InScope(Collection<java.math.BigDecimal> pChargeNumMonthList) {
        doSetPChargeNumMonth_InScope(pChargeNumMonthList);
    }

    protected void doSetPChargeNumMonth_InScope(Collection<java.math.BigDecimal> pChargeNumMonthList) {
        regINS(CK_INS, cTL(pChargeNumMonthList), xgetCValuePChargeNumMonth(), "P_CHARGE_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pChargeNumMonthList The collection of pChargeNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPChargeNumMonth_NotInScope(Collection<java.math.BigDecimal> pChargeNumMonthList) {
        doSetPChargeNumMonth_NotInScope(pChargeNumMonthList);
    }

    protected void doSetPChargeNumMonth_NotInScope(Collection<java.math.BigDecimal> pChargeNumMonthList) {
        regINS(CK_NINS, cTL(pChargeNumMonthList), xgetCValuePChargeNumMonth(), "P_CHARGE_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPChargeNumMonth_IsNull() { regPChargeNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPChargeNumMonth_IsNotNull() { regPChargeNumMonth(CK_ISNN, DOBJ); }

    protected void regPChargeNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePChargeNumMonth(), "P_CHARGE_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValuePChargeNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonth The value of pAllocNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_Equal(java.math.BigDecimal pAllocNumMonth) {
        doSetPAllocNumMonth_Equal(pAllocNumMonth);
    }

    protected void doSetPAllocNumMonth_Equal(java.math.BigDecimal pAllocNumMonth) {
        regPAllocNumMonth(CK_EQ, pAllocNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonth The value of pAllocNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_NotEqual(java.math.BigDecimal pAllocNumMonth) {
        doSetPAllocNumMonth_NotEqual(pAllocNumMonth);
    }

    protected void doSetPAllocNumMonth_NotEqual(java.math.BigDecimal pAllocNumMonth) {
        regPAllocNumMonth(CK_NES, pAllocNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonth The value of pAllocNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_GreaterThan(java.math.BigDecimal pAllocNumMonth) {
        regPAllocNumMonth(CK_GT, pAllocNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonth The value of pAllocNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_LessThan(java.math.BigDecimal pAllocNumMonth) {
        regPAllocNumMonth(CK_LT, pAllocNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonth The value of pAllocNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_GreaterEqual(java.math.BigDecimal pAllocNumMonth) {
        regPAllocNumMonth(CK_GE, pAllocNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonth The value of pAllocNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_LessEqual(java.math.BigDecimal pAllocNumMonth) {
        regPAllocNumMonth(CK_LE, pAllocNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pAllocNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pAllocNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPAllocNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePAllocNumMonth(), "P_ALLOC_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonthList The collection of pAllocNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_InScope(Collection<java.math.BigDecimal> pAllocNumMonthList) {
        doSetPAllocNumMonth_InScope(pAllocNumMonthList);
    }

    protected void doSetPAllocNumMonth_InScope(Collection<java.math.BigDecimal> pAllocNumMonthList) {
        regINS(CK_INS, cTL(pAllocNumMonthList), xgetCValuePAllocNumMonth(), "P_ALLOC_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pAllocNumMonthList The collection of pAllocNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPAllocNumMonth_NotInScope(Collection<java.math.BigDecimal> pAllocNumMonthList) {
        doSetPAllocNumMonth_NotInScope(pAllocNumMonthList);
    }

    protected void doSetPAllocNumMonth_NotInScope(Collection<java.math.BigDecimal> pAllocNumMonthList) {
        regINS(CK_NINS, cTL(pAllocNumMonthList), xgetCValuePAllocNumMonth(), "P_ALLOC_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPAllocNumMonth_IsNull() { regPAllocNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPAllocNumMonth_IsNotNull() { regPAllocNumMonth(CK_ISNN, DOBJ); }

    protected void regPAllocNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePAllocNumMonth(), "P_ALLOC_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValuePAllocNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonth The value of pMoveNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_Equal(java.math.BigDecimal pMoveNumMonth) {
        doSetPMoveNumMonth_Equal(pMoveNumMonth);
    }

    protected void doSetPMoveNumMonth_Equal(java.math.BigDecimal pMoveNumMonth) {
        regPMoveNumMonth(CK_EQ, pMoveNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonth The value of pMoveNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_NotEqual(java.math.BigDecimal pMoveNumMonth) {
        doSetPMoveNumMonth_NotEqual(pMoveNumMonth);
    }

    protected void doSetPMoveNumMonth_NotEqual(java.math.BigDecimal pMoveNumMonth) {
        regPMoveNumMonth(CK_NES, pMoveNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonth The value of pMoveNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_GreaterThan(java.math.BigDecimal pMoveNumMonth) {
        regPMoveNumMonth(CK_GT, pMoveNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonth The value of pMoveNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_LessThan(java.math.BigDecimal pMoveNumMonth) {
        regPMoveNumMonth(CK_LT, pMoveNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonth The value of pMoveNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_GreaterEqual(java.math.BigDecimal pMoveNumMonth) {
        regPMoveNumMonth(CK_GE, pMoveNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonth The value of pMoveNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_LessEqual(java.math.BigDecimal pMoveNumMonth) {
        regPMoveNumMonth(CK_LE, pMoveNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pMoveNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pMoveNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPMoveNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePMoveNumMonth(), "P_MOVE_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonthList The collection of pMoveNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_InScope(Collection<java.math.BigDecimal> pMoveNumMonthList) {
        doSetPMoveNumMonth_InScope(pMoveNumMonthList);
    }

    protected void doSetPMoveNumMonth_InScope(Collection<java.math.BigDecimal> pMoveNumMonthList) {
        regINS(CK_INS, cTL(pMoveNumMonthList), xgetCValuePMoveNumMonth(), "P_MOVE_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pMoveNumMonthList The collection of pMoveNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPMoveNumMonth_NotInScope(Collection<java.math.BigDecimal> pMoveNumMonthList) {
        doSetPMoveNumMonth_NotInScope(pMoveNumMonthList);
    }

    protected void doSetPMoveNumMonth_NotInScope(Collection<java.math.BigDecimal> pMoveNumMonthList) {
        regINS(CK_NINS, cTL(pMoveNumMonthList), xgetCValuePMoveNumMonth(), "P_MOVE_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPMoveNumMonth_IsNull() { regPMoveNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPMoveNumMonth_IsNotNull() { regPMoveNumMonth(CK_ISNN, DOBJ); }

    protected void regPMoveNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePMoveNumMonth(), "P_MOVE_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValuePMoveNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonth The value of pTransitNumMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_Equal(java.math.BigDecimal pTransitNumMonth) {
        doSetPTransitNumMonth_Equal(pTransitNumMonth);
    }

    protected void doSetPTransitNumMonth_Equal(java.math.BigDecimal pTransitNumMonth) {
        regPTransitNumMonth(CK_EQ, pTransitNumMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonth The value of pTransitNumMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_NotEqual(java.math.BigDecimal pTransitNumMonth) {
        doSetPTransitNumMonth_NotEqual(pTransitNumMonth);
    }

    protected void doSetPTransitNumMonth_NotEqual(java.math.BigDecimal pTransitNumMonth) {
        regPTransitNumMonth(CK_NES, pTransitNumMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonth The value of pTransitNumMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_GreaterThan(java.math.BigDecimal pTransitNumMonth) {
        regPTransitNumMonth(CK_GT, pTransitNumMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonth The value of pTransitNumMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_LessThan(java.math.BigDecimal pTransitNumMonth) {
        regPTransitNumMonth(CK_LT, pTransitNumMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonth The value of pTransitNumMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_GreaterEqual(java.math.BigDecimal pTransitNumMonth) {
        regPTransitNumMonth(CK_GE, pTransitNumMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonth The value of pTransitNumMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_LessEqual(java.math.BigDecimal pTransitNumMonth) {
        regPTransitNumMonth(CK_LE, pTransitNumMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pTransitNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pTransitNumMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPTransitNumMonth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePTransitNumMonth(), "P_TRANSIT_NUM_MONTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonthList The collection of pTransitNumMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_InScope(Collection<java.math.BigDecimal> pTransitNumMonthList) {
        doSetPTransitNumMonth_InScope(pTransitNumMonthList);
    }

    protected void doSetPTransitNumMonth_InScope(Collection<java.math.BigDecimal> pTransitNumMonthList) {
        regINS(CK_INS, cTL(pTransitNumMonthList), xgetCValuePTransitNumMonth(), "P_TRANSIT_NUM_MONTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @param pTransitNumMonthList The collection of pTransitNumMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTransitNumMonth_NotInScope(Collection<java.math.BigDecimal> pTransitNumMonthList) {
        doSetPTransitNumMonth_NotInScope(pTransitNumMonthList);
    }

    protected void doSetPTransitNumMonth_NotInScope(Collection<java.math.BigDecimal> pTransitNumMonthList) {
        regINS(CK_NINS, cTL(pTransitNumMonthList), xgetCValuePTransitNumMonth(), "P_TRANSIT_NUM_MONTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPTransitNumMonth_IsNull() { regPTransitNumMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     */
    public void setPTransitNumMonth_IsNotNull() { regPTransitNumMonth(CK_ISNN, DOBJ); }

    protected void regPTransitNumMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePTransitNumMonth(), "P_TRANSIT_NUM_MONTH"); }
    protected abstract ConditionValue xgetCValuePTransitNumMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10 The value of chargeNum10 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum10_Equal(java.math.BigDecimal chargeNum10) {
        doSetChargeNum10_Equal(chargeNum10);
    }

    protected void doSetChargeNum10_Equal(java.math.BigDecimal chargeNum10) {
        regChargeNum10(CK_EQ, chargeNum10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10 The value of chargeNum10 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum10_NotEqual(java.math.BigDecimal chargeNum10) {
        doSetChargeNum10_NotEqual(chargeNum10);
    }

    protected void doSetChargeNum10_NotEqual(java.math.BigDecimal chargeNum10) {
        regChargeNum10(CK_NES, chargeNum10);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10 The value of chargeNum10 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum10_GreaterThan(java.math.BigDecimal chargeNum10) {
        regChargeNum10(CK_GT, chargeNum10);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10 The value of chargeNum10 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum10_LessThan(java.math.BigDecimal chargeNum10) {
        regChargeNum10(CK_LT, chargeNum10);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10 The value of chargeNum10 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum10_GreaterEqual(java.math.BigDecimal chargeNum10) {
        regChargeNum10(CK_GE, chargeNum10);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10 The value of chargeNum10 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum10_LessEqual(java.math.BigDecimal chargeNum10) {
        regChargeNum10(CK_LE, chargeNum10);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of chargeNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of chargeNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChargeNum10_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChargeNum10(), "CHARGE_NUM_10", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10List The collection of chargeNum10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum10_InScope(Collection<java.math.BigDecimal> chargeNum10List) {
        doSetChargeNum10_InScope(chargeNum10List);
    }

    protected void doSetChargeNum10_InScope(Collection<java.math.BigDecimal> chargeNum10List) {
        regINS(CK_INS, cTL(chargeNum10List), xgetCValueChargeNum10(), "CHARGE_NUM_10");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param chargeNum10List The collection of chargeNum10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum10_NotInScope(Collection<java.math.BigDecimal> chargeNum10List) {
        doSetChargeNum10_NotInScope(chargeNum10List);
    }

    protected void doSetChargeNum10_NotInScope(Collection<java.math.BigDecimal> chargeNum10List) {
        regINS(CK_NINS, cTL(chargeNum10List), xgetCValueChargeNum10(), "CHARGE_NUM_10");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNum10_IsNull() { regChargeNum10(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNum10_IsNotNull() { regChargeNum10(CK_ISNN, DOBJ); }

    protected void regChargeNum10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChargeNum10(), "CHARGE_NUM_10"); }
    protected abstract ConditionValue xgetCValueChargeNum10();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10 The value of allocNum10 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum10_Equal(java.math.BigDecimal allocNum10) {
        doSetAllocNum10_Equal(allocNum10);
    }

    protected void doSetAllocNum10_Equal(java.math.BigDecimal allocNum10) {
        regAllocNum10(CK_EQ, allocNum10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10 The value of allocNum10 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum10_NotEqual(java.math.BigDecimal allocNum10) {
        doSetAllocNum10_NotEqual(allocNum10);
    }

    protected void doSetAllocNum10_NotEqual(java.math.BigDecimal allocNum10) {
        regAllocNum10(CK_NES, allocNum10);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10 The value of allocNum10 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum10_GreaterThan(java.math.BigDecimal allocNum10) {
        regAllocNum10(CK_GT, allocNum10);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10 The value of allocNum10 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum10_LessThan(java.math.BigDecimal allocNum10) {
        regAllocNum10(CK_LT, allocNum10);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10 The value of allocNum10 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum10_GreaterEqual(java.math.BigDecimal allocNum10) {
        regAllocNum10(CK_GE, allocNum10);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10 The value of allocNum10 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum10_LessEqual(java.math.BigDecimal allocNum10) {
        regAllocNum10(CK_LE, allocNum10);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNum10_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNum10(), "ALLOC_NUM_10", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10List The collection of allocNum10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum10_InScope(Collection<java.math.BigDecimal> allocNum10List) {
        doSetAllocNum10_InScope(allocNum10List);
    }

    protected void doSetAllocNum10_InScope(Collection<java.math.BigDecimal> allocNum10List) {
        regINS(CK_INS, cTL(allocNum10List), xgetCValueAllocNum10(), "ALLOC_NUM_10");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param allocNum10List The collection of allocNum10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum10_NotInScope(Collection<java.math.BigDecimal> allocNum10List) {
        doSetAllocNum10_NotInScope(allocNum10List);
    }

    protected void doSetAllocNum10_NotInScope(Collection<java.math.BigDecimal> allocNum10List) {
        regINS(CK_NINS, cTL(allocNum10List), xgetCValueAllocNum10(), "ALLOC_NUM_10");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNum10_IsNull() { regAllocNum10(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNum10_IsNotNull() { regAllocNum10(CK_ISNN, DOBJ); }

    protected void regAllocNum10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNum10(), "ALLOC_NUM_10"); }
    protected abstract ConditionValue xgetCValueAllocNum10();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10 The value of moveNum10 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum10_Equal(java.math.BigDecimal moveNum10) {
        doSetMoveNum10_Equal(moveNum10);
    }

    protected void doSetMoveNum10_Equal(java.math.BigDecimal moveNum10) {
        regMoveNum10(CK_EQ, moveNum10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10 The value of moveNum10 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum10_NotEqual(java.math.BigDecimal moveNum10) {
        doSetMoveNum10_NotEqual(moveNum10);
    }

    protected void doSetMoveNum10_NotEqual(java.math.BigDecimal moveNum10) {
        regMoveNum10(CK_NES, moveNum10);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10 The value of moveNum10 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum10_GreaterThan(java.math.BigDecimal moveNum10) {
        regMoveNum10(CK_GT, moveNum10);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10 The value of moveNum10 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum10_LessThan(java.math.BigDecimal moveNum10) {
        regMoveNum10(CK_LT, moveNum10);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10 The value of moveNum10 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum10_GreaterEqual(java.math.BigDecimal moveNum10) {
        regMoveNum10(CK_GE, moveNum10);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10 The value of moveNum10 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum10_LessEqual(java.math.BigDecimal moveNum10) {
        regMoveNum10(CK_LE, moveNum10);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNum10_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNum10(), "MOVE_NUM_10", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10List The collection of moveNum10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum10_InScope(Collection<java.math.BigDecimal> moveNum10List) {
        doSetMoveNum10_InScope(moveNum10List);
    }

    protected void doSetMoveNum10_InScope(Collection<java.math.BigDecimal> moveNum10List) {
        regINS(CK_INS, cTL(moveNum10List), xgetCValueMoveNum10(), "MOVE_NUM_10");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param moveNum10List The collection of moveNum10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum10_NotInScope(Collection<java.math.BigDecimal> moveNum10List) {
        doSetMoveNum10_NotInScope(moveNum10List);
    }

    protected void doSetMoveNum10_NotInScope(Collection<java.math.BigDecimal> moveNum10List) {
        regINS(CK_NINS, cTL(moveNum10List), xgetCValueMoveNum10(), "MOVE_NUM_10");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNum10_IsNull() { regMoveNum10(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNum10_IsNotNull() { regMoveNum10(CK_ISNN, DOBJ); }

    protected void regMoveNum10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNum10(), "MOVE_NUM_10"); }
    protected abstract ConditionValue xgetCValueMoveNum10();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10 The value of transitNum10 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum10_Equal(java.math.BigDecimal transitNum10) {
        doSetTransitNum10_Equal(transitNum10);
    }

    protected void doSetTransitNum10_Equal(java.math.BigDecimal transitNum10) {
        regTransitNum10(CK_EQ, transitNum10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10 The value of transitNum10 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum10_NotEqual(java.math.BigDecimal transitNum10) {
        doSetTransitNum10_NotEqual(transitNum10);
    }

    protected void doSetTransitNum10_NotEqual(java.math.BigDecimal transitNum10) {
        regTransitNum10(CK_NES, transitNum10);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10 The value of transitNum10 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum10_GreaterThan(java.math.BigDecimal transitNum10) {
        regTransitNum10(CK_GT, transitNum10);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10 The value of transitNum10 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum10_LessThan(java.math.BigDecimal transitNum10) {
        regTransitNum10(CK_LT, transitNum10);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10 The value of transitNum10 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum10_GreaterEqual(java.math.BigDecimal transitNum10) {
        regTransitNum10(CK_GE, transitNum10);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10 The value of transitNum10 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum10_LessEqual(java.math.BigDecimal transitNum10) {
        regTransitNum10(CK_LE, transitNum10);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transitNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNum10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNum10_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNum10(), "TRANSIT_NUM_10", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10List The collection of transitNum10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum10_InScope(Collection<java.math.BigDecimal> transitNum10List) {
        doSetTransitNum10_InScope(transitNum10List);
    }

    protected void doSetTransitNum10_InScope(Collection<java.math.BigDecimal> transitNum10List) {
        regINS(CK_INS, cTL(transitNum10List), xgetCValueTransitNum10(), "TRANSIT_NUM_10");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @param transitNum10List The collection of transitNum10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum10_NotInScope(Collection<java.math.BigDecimal> transitNum10List) {
        doSetTransitNum10_NotInScope(transitNum10List);
    }

    protected void doSetTransitNum10_NotInScope(Collection<java.math.BigDecimal> transitNum10List) {
        regINS(CK_NINS, cTL(transitNum10List), xgetCValueTransitNum10(), "TRANSIT_NUM_10");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNum10_IsNull() { regTransitNum10(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNum10_IsNotNull() { regTransitNum10(CK_ISNN, DOBJ); }

    protected void regTransitNum10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNum10(), "TRANSIT_NUM_10"); }
    protected abstract ConditionValue xgetCValueTransitNum10();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15 The value of chargeNum15 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum15_Equal(java.math.BigDecimal chargeNum15) {
        doSetChargeNum15_Equal(chargeNum15);
    }

    protected void doSetChargeNum15_Equal(java.math.BigDecimal chargeNum15) {
        regChargeNum15(CK_EQ, chargeNum15);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15 The value of chargeNum15 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum15_NotEqual(java.math.BigDecimal chargeNum15) {
        doSetChargeNum15_NotEqual(chargeNum15);
    }

    protected void doSetChargeNum15_NotEqual(java.math.BigDecimal chargeNum15) {
        regChargeNum15(CK_NES, chargeNum15);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15 The value of chargeNum15 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum15_GreaterThan(java.math.BigDecimal chargeNum15) {
        regChargeNum15(CK_GT, chargeNum15);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15 The value of chargeNum15 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum15_LessThan(java.math.BigDecimal chargeNum15) {
        regChargeNum15(CK_LT, chargeNum15);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15 The value of chargeNum15 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum15_GreaterEqual(java.math.BigDecimal chargeNum15) {
        regChargeNum15(CK_GE, chargeNum15);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15 The value of chargeNum15 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum15_LessEqual(java.math.BigDecimal chargeNum15) {
        regChargeNum15(CK_LE, chargeNum15);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of chargeNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of chargeNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChargeNum15_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChargeNum15(), "CHARGE_NUM_15", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15List The collection of chargeNum15 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum15_InScope(Collection<java.math.BigDecimal> chargeNum15List) {
        doSetChargeNum15_InScope(chargeNum15List);
    }

    protected void doSetChargeNum15_InScope(Collection<java.math.BigDecimal> chargeNum15List) {
        regINS(CK_INS, cTL(chargeNum15List), xgetCValueChargeNum15(), "CHARGE_NUM_15");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param chargeNum15List The collection of chargeNum15 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum15_NotInScope(Collection<java.math.BigDecimal> chargeNum15List) {
        doSetChargeNum15_NotInScope(chargeNum15List);
    }

    protected void doSetChargeNum15_NotInScope(Collection<java.math.BigDecimal> chargeNum15List) {
        regINS(CK_NINS, cTL(chargeNum15List), xgetCValueChargeNum15(), "CHARGE_NUM_15");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNum15_IsNull() { regChargeNum15(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNum15_IsNotNull() { regChargeNum15(CK_ISNN, DOBJ); }

    protected void regChargeNum15(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChargeNum15(), "CHARGE_NUM_15"); }
    protected abstract ConditionValue xgetCValueChargeNum15();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15 The value of allocNum15 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum15_Equal(java.math.BigDecimal allocNum15) {
        doSetAllocNum15_Equal(allocNum15);
    }

    protected void doSetAllocNum15_Equal(java.math.BigDecimal allocNum15) {
        regAllocNum15(CK_EQ, allocNum15);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15 The value of allocNum15 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum15_NotEqual(java.math.BigDecimal allocNum15) {
        doSetAllocNum15_NotEqual(allocNum15);
    }

    protected void doSetAllocNum15_NotEqual(java.math.BigDecimal allocNum15) {
        regAllocNum15(CK_NES, allocNum15);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15 The value of allocNum15 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum15_GreaterThan(java.math.BigDecimal allocNum15) {
        regAllocNum15(CK_GT, allocNum15);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15 The value of allocNum15 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum15_LessThan(java.math.BigDecimal allocNum15) {
        regAllocNum15(CK_LT, allocNum15);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15 The value of allocNum15 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum15_GreaterEqual(java.math.BigDecimal allocNum15) {
        regAllocNum15(CK_GE, allocNum15);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15 The value of allocNum15 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum15_LessEqual(java.math.BigDecimal allocNum15) {
        regAllocNum15(CK_LE, allocNum15);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNum15_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNum15(), "ALLOC_NUM_15", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15List The collection of allocNum15 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum15_InScope(Collection<java.math.BigDecimal> allocNum15List) {
        doSetAllocNum15_InScope(allocNum15List);
    }

    protected void doSetAllocNum15_InScope(Collection<java.math.BigDecimal> allocNum15List) {
        regINS(CK_INS, cTL(allocNum15List), xgetCValueAllocNum15(), "ALLOC_NUM_15");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param allocNum15List The collection of allocNum15 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum15_NotInScope(Collection<java.math.BigDecimal> allocNum15List) {
        doSetAllocNum15_NotInScope(allocNum15List);
    }

    protected void doSetAllocNum15_NotInScope(Collection<java.math.BigDecimal> allocNum15List) {
        regINS(CK_NINS, cTL(allocNum15List), xgetCValueAllocNum15(), "ALLOC_NUM_15");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNum15_IsNull() { regAllocNum15(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNum15_IsNotNull() { regAllocNum15(CK_ISNN, DOBJ); }

    protected void regAllocNum15(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNum15(), "ALLOC_NUM_15"); }
    protected abstract ConditionValue xgetCValueAllocNum15();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15 The value of moveNum15 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum15_Equal(java.math.BigDecimal moveNum15) {
        doSetMoveNum15_Equal(moveNum15);
    }

    protected void doSetMoveNum15_Equal(java.math.BigDecimal moveNum15) {
        regMoveNum15(CK_EQ, moveNum15);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15 The value of moveNum15 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum15_NotEqual(java.math.BigDecimal moveNum15) {
        doSetMoveNum15_NotEqual(moveNum15);
    }

    protected void doSetMoveNum15_NotEqual(java.math.BigDecimal moveNum15) {
        regMoveNum15(CK_NES, moveNum15);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15 The value of moveNum15 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum15_GreaterThan(java.math.BigDecimal moveNum15) {
        regMoveNum15(CK_GT, moveNum15);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15 The value of moveNum15 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum15_LessThan(java.math.BigDecimal moveNum15) {
        regMoveNum15(CK_LT, moveNum15);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15 The value of moveNum15 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum15_GreaterEqual(java.math.BigDecimal moveNum15) {
        regMoveNum15(CK_GE, moveNum15);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15 The value of moveNum15 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum15_LessEqual(java.math.BigDecimal moveNum15) {
        regMoveNum15(CK_LE, moveNum15);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNum15_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNum15(), "MOVE_NUM_15", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15List The collection of moveNum15 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum15_InScope(Collection<java.math.BigDecimal> moveNum15List) {
        doSetMoveNum15_InScope(moveNum15List);
    }

    protected void doSetMoveNum15_InScope(Collection<java.math.BigDecimal> moveNum15List) {
        regINS(CK_INS, cTL(moveNum15List), xgetCValueMoveNum15(), "MOVE_NUM_15");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param moveNum15List The collection of moveNum15 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum15_NotInScope(Collection<java.math.BigDecimal> moveNum15List) {
        doSetMoveNum15_NotInScope(moveNum15List);
    }

    protected void doSetMoveNum15_NotInScope(Collection<java.math.BigDecimal> moveNum15List) {
        regINS(CK_NINS, cTL(moveNum15List), xgetCValueMoveNum15(), "MOVE_NUM_15");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNum15_IsNull() { regMoveNum15(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNum15_IsNotNull() { regMoveNum15(CK_ISNN, DOBJ); }

    protected void regMoveNum15(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNum15(), "MOVE_NUM_15"); }
    protected abstract ConditionValue xgetCValueMoveNum15();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15 The value of transitNum15 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum15_Equal(java.math.BigDecimal transitNum15) {
        doSetTransitNum15_Equal(transitNum15);
    }

    protected void doSetTransitNum15_Equal(java.math.BigDecimal transitNum15) {
        regTransitNum15(CK_EQ, transitNum15);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15 The value of transitNum15 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum15_NotEqual(java.math.BigDecimal transitNum15) {
        doSetTransitNum15_NotEqual(transitNum15);
    }

    protected void doSetTransitNum15_NotEqual(java.math.BigDecimal transitNum15) {
        regTransitNum15(CK_NES, transitNum15);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15 The value of transitNum15 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum15_GreaterThan(java.math.BigDecimal transitNum15) {
        regTransitNum15(CK_GT, transitNum15);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15 The value of transitNum15 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum15_LessThan(java.math.BigDecimal transitNum15) {
        regTransitNum15(CK_LT, transitNum15);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15 The value of transitNum15 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum15_GreaterEqual(java.math.BigDecimal transitNum15) {
        regTransitNum15(CK_GE, transitNum15);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15 The value of transitNum15 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum15_LessEqual(java.math.BigDecimal transitNum15) {
        regTransitNum15(CK_LE, transitNum15);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transitNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNum15. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNum15_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNum15(), "TRANSIT_NUM_15", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15List The collection of transitNum15 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum15_InScope(Collection<java.math.BigDecimal> transitNum15List) {
        doSetTransitNum15_InScope(transitNum15List);
    }

    protected void doSetTransitNum15_InScope(Collection<java.math.BigDecimal> transitNum15List) {
        regINS(CK_INS, cTL(transitNum15List), xgetCValueTransitNum15(), "TRANSIT_NUM_15");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @param transitNum15List The collection of transitNum15 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum15_NotInScope(Collection<java.math.BigDecimal> transitNum15List) {
        doSetTransitNum15_NotInScope(transitNum15List);
    }

    protected void doSetTransitNum15_NotInScope(Collection<java.math.BigDecimal> transitNum15List) {
        regINS(CK_NINS, cTL(transitNum15List), xgetCValueTransitNum15(), "TRANSIT_NUM_15");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNum15_IsNull() { regTransitNum15(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNum15_IsNotNull() { regTransitNum15(CK_ISNN, DOBJ); }

    protected void regTransitNum15(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNum15(), "TRANSIT_NUM_15"); }
    protected abstract ConditionValue xgetCValueTransitNum15();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20 The value of chargeNum20 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum20_Equal(java.math.BigDecimal chargeNum20) {
        doSetChargeNum20_Equal(chargeNum20);
    }

    protected void doSetChargeNum20_Equal(java.math.BigDecimal chargeNum20) {
        regChargeNum20(CK_EQ, chargeNum20);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20 The value of chargeNum20 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum20_NotEqual(java.math.BigDecimal chargeNum20) {
        doSetChargeNum20_NotEqual(chargeNum20);
    }

    protected void doSetChargeNum20_NotEqual(java.math.BigDecimal chargeNum20) {
        regChargeNum20(CK_NES, chargeNum20);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20 The value of chargeNum20 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum20_GreaterThan(java.math.BigDecimal chargeNum20) {
        regChargeNum20(CK_GT, chargeNum20);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20 The value of chargeNum20 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum20_LessThan(java.math.BigDecimal chargeNum20) {
        regChargeNum20(CK_LT, chargeNum20);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20 The value of chargeNum20 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum20_GreaterEqual(java.math.BigDecimal chargeNum20) {
        regChargeNum20(CK_GE, chargeNum20);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20 The value of chargeNum20 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum20_LessEqual(java.math.BigDecimal chargeNum20) {
        regChargeNum20(CK_LE, chargeNum20);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of chargeNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of chargeNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChargeNum20_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChargeNum20(), "CHARGE_NUM_20", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20List The collection of chargeNum20 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum20_InScope(Collection<java.math.BigDecimal> chargeNum20List) {
        doSetChargeNum20_InScope(chargeNum20List);
    }

    protected void doSetChargeNum20_InScope(Collection<java.math.BigDecimal> chargeNum20List) {
        regINS(CK_INS, cTL(chargeNum20List), xgetCValueChargeNum20(), "CHARGE_NUM_20");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param chargeNum20List The collection of chargeNum20 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum20_NotInScope(Collection<java.math.BigDecimal> chargeNum20List) {
        doSetChargeNum20_NotInScope(chargeNum20List);
    }

    protected void doSetChargeNum20_NotInScope(Collection<java.math.BigDecimal> chargeNum20List) {
        regINS(CK_NINS, cTL(chargeNum20List), xgetCValueChargeNum20(), "CHARGE_NUM_20");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNum20_IsNull() { regChargeNum20(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNum20_IsNotNull() { regChargeNum20(CK_ISNN, DOBJ); }

    protected void regChargeNum20(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChargeNum20(), "CHARGE_NUM_20"); }
    protected abstract ConditionValue xgetCValueChargeNum20();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20 The value of allocNum20 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum20_Equal(java.math.BigDecimal allocNum20) {
        doSetAllocNum20_Equal(allocNum20);
    }

    protected void doSetAllocNum20_Equal(java.math.BigDecimal allocNum20) {
        regAllocNum20(CK_EQ, allocNum20);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20 The value of allocNum20 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum20_NotEqual(java.math.BigDecimal allocNum20) {
        doSetAllocNum20_NotEqual(allocNum20);
    }

    protected void doSetAllocNum20_NotEqual(java.math.BigDecimal allocNum20) {
        regAllocNum20(CK_NES, allocNum20);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20 The value of allocNum20 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum20_GreaterThan(java.math.BigDecimal allocNum20) {
        regAllocNum20(CK_GT, allocNum20);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20 The value of allocNum20 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum20_LessThan(java.math.BigDecimal allocNum20) {
        regAllocNum20(CK_LT, allocNum20);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20 The value of allocNum20 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum20_GreaterEqual(java.math.BigDecimal allocNum20) {
        regAllocNum20(CK_GE, allocNum20);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20 The value of allocNum20 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum20_LessEqual(java.math.BigDecimal allocNum20) {
        regAllocNum20(CK_LE, allocNum20);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNum20_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNum20(), "ALLOC_NUM_20", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20List The collection of allocNum20 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum20_InScope(Collection<java.math.BigDecimal> allocNum20List) {
        doSetAllocNum20_InScope(allocNum20List);
    }

    protected void doSetAllocNum20_InScope(Collection<java.math.BigDecimal> allocNum20List) {
        regINS(CK_INS, cTL(allocNum20List), xgetCValueAllocNum20(), "ALLOC_NUM_20");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param allocNum20List The collection of allocNum20 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum20_NotInScope(Collection<java.math.BigDecimal> allocNum20List) {
        doSetAllocNum20_NotInScope(allocNum20List);
    }

    protected void doSetAllocNum20_NotInScope(Collection<java.math.BigDecimal> allocNum20List) {
        regINS(CK_NINS, cTL(allocNum20List), xgetCValueAllocNum20(), "ALLOC_NUM_20");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNum20_IsNull() { regAllocNum20(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNum20_IsNotNull() { regAllocNum20(CK_ISNN, DOBJ); }

    protected void regAllocNum20(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNum20(), "ALLOC_NUM_20"); }
    protected abstract ConditionValue xgetCValueAllocNum20();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20 The value of moveNum20 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum20_Equal(java.math.BigDecimal moveNum20) {
        doSetMoveNum20_Equal(moveNum20);
    }

    protected void doSetMoveNum20_Equal(java.math.BigDecimal moveNum20) {
        regMoveNum20(CK_EQ, moveNum20);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20 The value of moveNum20 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum20_NotEqual(java.math.BigDecimal moveNum20) {
        doSetMoveNum20_NotEqual(moveNum20);
    }

    protected void doSetMoveNum20_NotEqual(java.math.BigDecimal moveNum20) {
        regMoveNum20(CK_NES, moveNum20);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20 The value of moveNum20 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum20_GreaterThan(java.math.BigDecimal moveNum20) {
        regMoveNum20(CK_GT, moveNum20);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20 The value of moveNum20 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum20_LessThan(java.math.BigDecimal moveNum20) {
        regMoveNum20(CK_LT, moveNum20);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20 The value of moveNum20 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum20_GreaterEqual(java.math.BigDecimal moveNum20) {
        regMoveNum20(CK_GE, moveNum20);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20 The value of moveNum20 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum20_LessEqual(java.math.BigDecimal moveNum20) {
        regMoveNum20(CK_LE, moveNum20);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNum20_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNum20(), "MOVE_NUM_20", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20List The collection of moveNum20 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum20_InScope(Collection<java.math.BigDecimal> moveNum20List) {
        doSetMoveNum20_InScope(moveNum20List);
    }

    protected void doSetMoveNum20_InScope(Collection<java.math.BigDecimal> moveNum20List) {
        regINS(CK_INS, cTL(moveNum20List), xgetCValueMoveNum20(), "MOVE_NUM_20");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param moveNum20List The collection of moveNum20 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum20_NotInScope(Collection<java.math.BigDecimal> moveNum20List) {
        doSetMoveNum20_NotInScope(moveNum20List);
    }

    protected void doSetMoveNum20_NotInScope(Collection<java.math.BigDecimal> moveNum20List) {
        regINS(CK_NINS, cTL(moveNum20List), xgetCValueMoveNum20(), "MOVE_NUM_20");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNum20_IsNull() { regMoveNum20(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNum20_IsNotNull() { regMoveNum20(CK_ISNN, DOBJ); }

    protected void regMoveNum20(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNum20(), "MOVE_NUM_20"); }
    protected abstract ConditionValue xgetCValueMoveNum20();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20 The value of transitNum20 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum20_Equal(java.math.BigDecimal transitNum20) {
        doSetTransitNum20_Equal(transitNum20);
    }

    protected void doSetTransitNum20_Equal(java.math.BigDecimal transitNum20) {
        regTransitNum20(CK_EQ, transitNum20);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20 The value of transitNum20 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum20_NotEqual(java.math.BigDecimal transitNum20) {
        doSetTransitNum20_NotEqual(transitNum20);
    }

    protected void doSetTransitNum20_NotEqual(java.math.BigDecimal transitNum20) {
        regTransitNum20(CK_NES, transitNum20);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20 The value of transitNum20 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum20_GreaterThan(java.math.BigDecimal transitNum20) {
        regTransitNum20(CK_GT, transitNum20);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20 The value of transitNum20 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum20_LessThan(java.math.BigDecimal transitNum20) {
        regTransitNum20(CK_LT, transitNum20);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20 The value of transitNum20 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum20_GreaterEqual(java.math.BigDecimal transitNum20) {
        regTransitNum20(CK_GE, transitNum20);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20 The value of transitNum20 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum20_LessEqual(java.math.BigDecimal transitNum20) {
        regTransitNum20(CK_LE, transitNum20);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transitNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNum20. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNum20_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNum20(), "TRANSIT_NUM_20", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20List The collection of transitNum20 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum20_InScope(Collection<java.math.BigDecimal> transitNum20List) {
        doSetTransitNum20_InScope(transitNum20List);
    }

    protected void doSetTransitNum20_InScope(Collection<java.math.BigDecimal> transitNum20List) {
        regINS(CK_INS, cTL(transitNum20List), xgetCValueTransitNum20(), "TRANSIT_NUM_20");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @param transitNum20List The collection of transitNum20 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum20_NotInScope(Collection<java.math.BigDecimal> transitNum20List) {
        doSetTransitNum20_NotInScope(transitNum20List);
    }

    protected void doSetTransitNum20_NotInScope(Collection<java.math.BigDecimal> transitNum20List) {
        regINS(CK_NINS, cTL(transitNum20List), xgetCValueTransitNum20(), "TRANSIT_NUM_20");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNum20_IsNull() { regTransitNum20(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNum20_IsNotNull() { regTransitNum20(CK_ISNN, DOBJ); }

    protected void regTransitNum20(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNum20(), "TRANSIT_NUM_20"); }
    protected abstract ConditionValue xgetCValueTransitNum20();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLast The value of chargeNumLast as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNumLast_Equal(java.math.BigDecimal chargeNumLast) {
        doSetChargeNumLast_Equal(chargeNumLast);
    }

    protected void doSetChargeNumLast_Equal(java.math.BigDecimal chargeNumLast) {
        regChargeNumLast(CK_EQ, chargeNumLast);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLast The value of chargeNumLast as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNumLast_NotEqual(java.math.BigDecimal chargeNumLast) {
        doSetChargeNumLast_NotEqual(chargeNumLast);
    }

    protected void doSetChargeNumLast_NotEqual(java.math.BigDecimal chargeNumLast) {
        regChargeNumLast(CK_NES, chargeNumLast);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLast The value of chargeNumLast as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNumLast_GreaterThan(java.math.BigDecimal chargeNumLast) {
        regChargeNumLast(CK_GT, chargeNumLast);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLast The value of chargeNumLast as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNumLast_LessThan(java.math.BigDecimal chargeNumLast) {
        regChargeNumLast(CK_LT, chargeNumLast);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLast The value of chargeNumLast as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNumLast_GreaterEqual(java.math.BigDecimal chargeNumLast) {
        regChargeNumLast(CK_GE, chargeNumLast);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLast The value of chargeNumLast as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNumLast_LessEqual(java.math.BigDecimal chargeNumLast) {
        regChargeNumLast(CK_LE, chargeNumLast);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of chargeNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of chargeNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChargeNumLast_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChargeNumLast(), "CHARGE_NUM_LAST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLastList The collection of chargeNumLast as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNumLast_InScope(Collection<java.math.BigDecimal> chargeNumLastList) {
        doSetChargeNumLast_InScope(chargeNumLastList);
    }

    protected void doSetChargeNumLast_InScope(Collection<java.math.BigDecimal> chargeNumLastList) {
        regINS(CK_INS, cTL(chargeNumLastList), xgetCValueChargeNumLast(), "CHARGE_NUM_LAST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param chargeNumLastList The collection of chargeNumLast as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNumLast_NotInScope(Collection<java.math.BigDecimal> chargeNumLastList) {
        doSetChargeNumLast_NotInScope(chargeNumLastList);
    }

    protected void doSetChargeNumLast_NotInScope(Collection<java.math.BigDecimal> chargeNumLastList) {
        regINS(CK_NINS, cTL(chargeNumLastList), xgetCValueChargeNumLast(), "CHARGE_NUM_LAST");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNumLast_IsNull() { regChargeNumLast(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setChargeNumLast_IsNotNull() { regChargeNumLast(CK_ISNN, DOBJ); }

    protected void regChargeNumLast(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChargeNumLast(), "CHARGE_NUM_LAST"); }
    protected abstract ConditionValue xgetCValueChargeNumLast();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLast The value of allocNumLast as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNumLast_Equal(java.math.BigDecimal allocNumLast) {
        doSetAllocNumLast_Equal(allocNumLast);
    }

    protected void doSetAllocNumLast_Equal(java.math.BigDecimal allocNumLast) {
        regAllocNumLast(CK_EQ, allocNumLast);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLast The value of allocNumLast as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNumLast_NotEqual(java.math.BigDecimal allocNumLast) {
        doSetAllocNumLast_NotEqual(allocNumLast);
    }

    protected void doSetAllocNumLast_NotEqual(java.math.BigDecimal allocNumLast) {
        regAllocNumLast(CK_NES, allocNumLast);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLast The value of allocNumLast as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNumLast_GreaterThan(java.math.BigDecimal allocNumLast) {
        regAllocNumLast(CK_GT, allocNumLast);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLast The value of allocNumLast as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNumLast_LessThan(java.math.BigDecimal allocNumLast) {
        regAllocNumLast(CK_LT, allocNumLast);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLast The value of allocNumLast as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNumLast_GreaterEqual(java.math.BigDecimal allocNumLast) {
        regAllocNumLast(CK_GE, allocNumLast);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLast The value of allocNumLast as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNumLast_LessEqual(java.math.BigDecimal allocNumLast) {
        regAllocNumLast(CK_LE, allocNumLast);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNumLast_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNumLast(), "ALLOC_NUM_LAST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLastList The collection of allocNumLast as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNumLast_InScope(Collection<java.math.BigDecimal> allocNumLastList) {
        doSetAllocNumLast_InScope(allocNumLastList);
    }

    protected void doSetAllocNumLast_InScope(Collection<java.math.BigDecimal> allocNumLastList) {
        regINS(CK_INS, cTL(allocNumLastList), xgetCValueAllocNumLast(), "ALLOC_NUM_LAST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param allocNumLastList The collection of allocNumLast as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNumLast_NotInScope(Collection<java.math.BigDecimal> allocNumLastList) {
        doSetAllocNumLast_NotInScope(allocNumLastList);
    }

    protected void doSetAllocNumLast_NotInScope(Collection<java.math.BigDecimal> allocNumLastList) {
        regINS(CK_NINS, cTL(allocNumLastList), xgetCValueAllocNumLast(), "ALLOC_NUM_LAST");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNumLast_IsNull() { regAllocNumLast(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setAllocNumLast_IsNotNull() { regAllocNumLast(CK_ISNN, DOBJ); }

    protected void regAllocNumLast(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNumLast(), "ALLOC_NUM_LAST"); }
    protected abstract ConditionValue xgetCValueAllocNumLast();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLast The value of moveNumLast as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNumLast_Equal(java.math.BigDecimal moveNumLast) {
        doSetMoveNumLast_Equal(moveNumLast);
    }

    protected void doSetMoveNumLast_Equal(java.math.BigDecimal moveNumLast) {
        regMoveNumLast(CK_EQ, moveNumLast);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLast The value of moveNumLast as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNumLast_NotEqual(java.math.BigDecimal moveNumLast) {
        doSetMoveNumLast_NotEqual(moveNumLast);
    }

    protected void doSetMoveNumLast_NotEqual(java.math.BigDecimal moveNumLast) {
        regMoveNumLast(CK_NES, moveNumLast);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLast The value of moveNumLast as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNumLast_GreaterThan(java.math.BigDecimal moveNumLast) {
        regMoveNumLast(CK_GT, moveNumLast);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLast The value of moveNumLast as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNumLast_LessThan(java.math.BigDecimal moveNumLast) {
        regMoveNumLast(CK_LT, moveNumLast);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLast The value of moveNumLast as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNumLast_GreaterEqual(java.math.BigDecimal moveNumLast) {
        regMoveNumLast(CK_GE, moveNumLast);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLast The value of moveNumLast as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNumLast_LessEqual(java.math.BigDecimal moveNumLast) {
        regMoveNumLast(CK_LE, moveNumLast);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNumLast_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNumLast(), "MOVE_NUM_LAST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLastList The collection of moveNumLast as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNumLast_InScope(Collection<java.math.BigDecimal> moveNumLastList) {
        doSetMoveNumLast_InScope(moveNumLastList);
    }

    protected void doSetMoveNumLast_InScope(Collection<java.math.BigDecimal> moveNumLastList) {
        regINS(CK_INS, cTL(moveNumLastList), xgetCValueMoveNumLast(), "MOVE_NUM_LAST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param moveNumLastList The collection of moveNumLast as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNumLast_NotInScope(Collection<java.math.BigDecimal> moveNumLastList) {
        doSetMoveNumLast_NotInScope(moveNumLastList);
    }

    protected void doSetMoveNumLast_NotInScope(Collection<java.math.BigDecimal> moveNumLastList) {
        regINS(CK_NINS, cTL(moveNumLastList), xgetCValueMoveNumLast(), "MOVE_NUM_LAST");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNumLast_IsNull() { regMoveNumLast(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setMoveNumLast_IsNotNull() { regMoveNumLast(CK_ISNN, DOBJ); }

    protected void regMoveNumLast(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNumLast(), "MOVE_NUM_LAST"); }
    protected abstract ConditionValue xgetCValueMoveNumLast();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLast The value of transitNumLast as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNumLast_Equal(java.math.BigDecimal transitNumLast) {
        doSetTransitNumLast_Equal(transitNumLast);
    }

    protected void doSetTransitNumLast_Equal(java.math.BigDecimal transitNumLast) {
        regTransitNumLast(CK_EQ, transitNumLast);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLast The value of transitNumLast as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNumLast_NotEqual(java.math.BigDecimal transitNumLast) {
        doSetTransitNumLast_NotEqual(transitNumLast);
    }

    protected void doSetTransitNumLast_NotEqual(java.math.BigDecimal transitNumLast) {
        regTransitNumLast(CK_NES, transitNumLast);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLast The value of transitNumLast as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNumLast_GreaterThan(java.math.BigDecimal transitNumLast) {
        regTransitNumLast(CK_GT, transitNumLast);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLast The value of transitNumLast as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNumLast_LessThan(java.math.BigDecimal transitNumLast) {
        regTransitNumLast(CK_LT, transitNumLast);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLast The value of transitNumLast as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNumLast_GreaterEqual(java.math.BigDecimal transitNumLast) {
        regTransitNumLast(CK_GE, transitNumLast);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLast The value of transitNumLast as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNumLast_LessEqual(java.math.BigDecimal transitNumLast) {
        regTransitNumLast(CK_LE, transitNumLast);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transitNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNumLast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNumLast_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNumLast(), "TRANSIT_NUM_LAST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLastList The collection of transitNumLast as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNumLast_InScope(Collection<java.math.BigDecimal> transitNumLastList) {
        doSetTransitNumLast_InScope(transitNumLastList);
    }

    protected void doSetTransitNumLast_InScope(Collection<java.math.BigDecimal> transitNumLastList) {
        regINS(CK_INS, cTL(transitNumLastList), xgetCValueTransitNumLast(), "TRANSIT_NUM_LAST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @param transitNumLastList The collection of transitNumLast as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNumLast_NotInScope(Collection<java.math.BigDecimal> transitNumLastList) {
        doSetTransitNumLast_NotInScope(transitNumLastList);
    }

    protected void doSetTransitNumLast_NotInScope(Collection<java.math.BigDecimal> transitNumLastList) {
        regINS(CK_NINS, cTL(transitNumLastList), xgetCValueTransitNumLast(), "TRANSIT_NUM_LAST");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNumLast_IsNull() { regTransitNumLast(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     */
    public void setTransitNumLast_IsNotNull() { regTransitNumLast(CK_ISNN, DOBJ); }

    protected void regTransitNumLast(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNumLast(), "TRANSIT_NUM_LAST"); }
    protected abstract ConditionValue xgetCValueTransitNumLast();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_Equal(String lastStoreDt) {
        doSetLastStoreDt_Equal(fRES(lastStoreDt));
    }

    protected void doSetLastStoreDt_Equal(String lastStoreDt) {
        regLastStoreDt(CK_EQ, lastStoreDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_NotEqual(String lastStoreDt) {
        doSetLastStoreDt_NotEqual(fRES(lastStoreDt));
    }

    protected void doSetLastStoreDt_NotEqual(String lastStoreDt) {
        regLastStoreDt(CK_NES, lastStoreDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_GreaterThan(String lastStoreDt) {
        regLastStoreDt(CK_GT, fRES(lastStoreDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_LessThan(String lastStoreDt) {
        regLastStoreDt(CK_LT, fRES(lastStoreDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_GreaterEqual(String lastStoreDt) {
        regLastStoreDt(CK_GE, fRES(lastStoreDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_LessEqual(String lastStoreDt) {
        regLastStoreDt(CK_LE, fRES(lastStoreDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDtList The collection of lastStoreDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_InScope(Collection<String> lastStoreDtList) {
        doSetLastStoreDt_InScope(lastStoreDtList);
    }

    protected void doSetLastStoreDt_InScope(Collection<String> lastStoreDtList) {
        regINS(CK_INS, cTL(lastStoreDtList), xgetCValueLastStoreDt(), "LAST_STORE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDtList The collection of lastStoreDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_NotInScope(Collection<String> lastStoreDtList) {
        doSetLastStoreDt_NotInScope(lastStoreDtList);
    }

    protected void doSetLastStoreDt_NotInScope(Collection<String> lastStoreDtList) {
        regINS(CK_NINS, cTL(lastStoreDtList), xgetCValueLastStoreDt(), "LAST_STORE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_STORE_DT: {varchar(8)} <br>
     * <pre>e.g. setLastStoreDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastStoreDt The value of lastStoreDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLastStoreDt_LikeSearch(String lastStoreDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastStoreDt), xgetCValueLastStoreDt(), "LAST_STORE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLastStoreDt_NotLikeSearch(String lastStoreDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastStoreDt), xgetCValueLastStoreDt(), "LAST_STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @param lastStoreDt The value of lastStoreDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastStoreDt_PrefixSearch(String lastStoreDt) {
        setLastStoreDt_LikeSearch(lastStoreDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     */
    public void setLastStoreDt_IsNull() { regLastStoreDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     */
    public void setLastStoreDt_IsNullOrEmpty() { regLastStoreDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_STORE_DT: {varchar(8)}
     */
    public void setLastStoreDt_IsNotNull() { regLastStoreDt(CK_ISNN, DOBJ); }

    protected void regLastStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastStoreDt(), "LAST_STORE_DT"); }
    protected abstract ConditionValue xgetCValueLastStoreDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_Equal(String lastPickingDt) {
        doSetLastPickingDt_Equal(fRES(lastPickingDt));
    }

    protected void doSetLastPickingDt_Equal(String lastPickingDt) {
        regLastPickingDt(CK_EQ, lastPickingDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_NotEqual(String lastPickingDt) {
        doSetLastPickingDt_NotEqual(fRES(lastPickingDt));
    }

    protected void doSetLastPickingDt_NotEqual(String lastPickingDt) {
        regLastPickingDt(CK_NES, lastPickingDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_GreaterThan(String lastPickingDt) {
        regLastPickingDt(CK_GT, fRES(lastPickingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_LessThan(String lastPickingDt) {
        regLastPickingDt(CK_LT, fRES(lastPickingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_GreaterEqual(String lastPickingDt) {
        regLastPickingDt(CK_GE, fRES(lastPickingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_LessEqual(String lastPickingDt) {
        regLastPickingDt(CK_LE, fRES(lastPickingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDtList The collection of lastPickingDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_InScope(Collection<String> lastPickingDtList) {
        doSetLastPickingDt_InScope(lastPickingDtList);
    }

    protected void doSetLastPickingDt_InScope(Collection<String> lastPickingDtList) {
        regINS(CK_INS, cTL(lastPickingDtList), xgetCValueLastPickingDt(), "LAST_PICKING_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDtList The collection of lastPickingDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_NotInScope(Collection<String> lastPickingDtList) {
        doSetLastPickingDt_NotInScope(lastPickingDtList);
    }

    protected void doSetLastPickingDt_NotInScope(Collection<String> lastPickingDtList) {
        regINS(CK_NINS, cTL(lastPickingDtList), xgetCValueLastPickingDt(), "LAST_PICKING_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)} <br>
     * <pre>e.g. setLastPickingDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastPickingDt The value of lastPickingDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLastPickingDt_LikeSearch(String lastPickingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastPickingDt), xgetCValueLastPickingDt(), "LAST_PICKING_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLastPickingDt_NotLikeSearch(String lastPickingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastPickingDt), xgetCValueLastPickingDt(), "LAST_PICKING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @param lastPickingDt The value of lastPickingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastPickingDt_PrefixSearch(String lastPickingDt) {
        setLastPickingDt_LikeSearch(lastPickingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     */
    public void setLastPickingDt_IsNull() { regLastPickingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     */
    public void setLastPickingDt_IsNullOrEmpty() { regLastPickingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_PICKING_DT: {varchar(8)}
     */
    public void setLastPickingDt_IsNotNull() { regLastPickingDt(CK_ISNN, DOBJ); }

    protected void regLastPickingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastPickingDt(), "LAST_PICKING_DT"); }
    protected abstract ConditionValue xgetCValueLastPickingDt();

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
    public HpSLCFunction<HStockReportCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HStockReportCB.class);
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
    public HpSLCFunction<HStockReportCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HStockReportCB.class);
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
    public HpSLCFunction<HStockReportCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HStockReportCB.class);
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
    public HpSLCFunction<HStockReportCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HStockReportCB.class);
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
    public HpSLCFunction<HStockReportCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HStockReportCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HStockReportCB&gt;() {
     *     public void query(HStockReportCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HStockReportCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HStockReportCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockReportCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HStockReportCQ sq);

    protected HStockReportCB xcreateScalarConditionCB() {
        HStockReportCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HStockReportCB xcreateScalarConditionPartitionByCB() {
        HStockReportCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HStockReportCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockReportCB cb = new HStockReportCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STOCK_REPORT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HStockReportCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HStockReportCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HStockReportCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockReportCB cb = new HStockReportCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STOCK_REPORT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HStockReportCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HStockReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockReportCB cb = new HStockReportCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HStockReportCQ sq);

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
    protected HStockReportCB newMyCB() {
        return new HStockReportCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HStockReportCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

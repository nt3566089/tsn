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
 * The abstract condition-query of H_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHStockInoutCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHStockInoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_STOCK_INOUT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_Equal(Long stockInoutId) {
        doSetStockInoutId_Equal(stockInoutId);
    }

    protected void doSetStockInoutId_Equal(Long stockInoutId) {
        regStockInoutId(CK_EQ, stockInoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_NotEqual(Long stockInoutId) {
        doSetStockInoutId_NotEqual(stockInoutId);
    }

    protected void doSetStockInoutId_NotEqual(Long stockInoutId) {
        regStockInoutId(CK_NES, stockInoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_GreaterThan(Long stockInoutId) {
        regStockInoutId(CK_GT, stockInoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_LessThan(Long stockInoutId) {
        regStockInoutId(CK_LT, stockInoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_GreaterEqual(Long stockInoutId) {
        regStockInoutId(CK_GE, stockInoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_LessEqual(Long stockInoutId) {
        regStockInoutId(CK_LE, stockInoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of stockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockInoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockInoutId(), "STOCK_INOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutIdList The collection of stockInoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutId_InScope(Collection<Long> stockInoutIdList) {
        doSetStockInoutId_InScope(stockInoutIdList);
    }

    protected void doSetStockInoutId_InScope(Collection<Long> stockInoutIdList) {
        regINS(CK_INS, cTL(stockInoutIdList), xgetCValueStockInoutId(), "STOCK_INOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutIdList The collection of stockInoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutId_NotInScope(Collection<Long> stockInoutIdList) {
        doSetStockInoutId_NotInScope(stockInoutIdList);
    }

    protected void doSetStockInoutId_NotInScope(Collection<Long> stockInoutIdList) {
        regINS(CK_NINS, cTL(stockInoutIdList), xgetCValueStockInoutId(), "STOCK_INOUT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockInoutId_IsNull() { regStockInoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockInoutId_IsNotNull() { regStockInoutId(CK_ISNN, DOBJ); }

    protected void regStockInoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockInoutId(), "STOCK_INOUT_ID"); }
    protected abstract ConditionValue xgetCValueStockInoutId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
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
     * HIST_DT: {NotNull, varchar(8)}
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
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterThan(String histDt) {
        regHistDt(CK_GT, fRES(histDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessThan(String histDt) {
        regHistDt(CK_LT, fRES(histDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterEqual(String histDt) {
        regHistDt(CK_GE, fRES(histDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessEqual(String histDt) {
        regHistDt(CK_LE, fRES(histDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
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
     * HIST_DT: {NotNull, varchar(8)}
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
     * HIST_DT: {NotNull, varchar(8)} <br>
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
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistDt_NotLikeSearch(String histDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histDt), xgetCValueHistDt(), "HIST_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_PrefixSearch(String histDt) {
        setHistDt_LikeSearch(histDt, xcLSOPPre());
    }

    protected void regHistDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistDt(), "HIST_DT"); }
    protected abstract ConditionValue xgetCValueHistDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutId The value of fsStockInoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_Equal(Long fsStockInoutId) {
        doSetFsStockInoutId_Equal(fsStockInoutId);
    }

    protected void doSetFsStockInoutId_Equal(Long fsStockInoutId) {
        regFsStockInoutId(CK_EQ, fsStockInoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutId The value of fsStockInoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_NotEqual(Long fsStockInoutId) {
        doSetFsStockInoutId_NotEqual(fsStockInoutId);
    }

    protected void doSetFsStockInoutId_NotEqual(Long fsStockInoutId) {
        regFsStockInoutId(CK_NES, fsStockInoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutId The value of fsStockInoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_GreaterThan(Long fsStockInoutId) {
        regFsStockInoutId(CK_GT, fsStockInoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutId The value of fsStockInoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_LessThan(Long fsStockInoutId) {
        regFsStockInoutId(CK_LT, fsStockInoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutId The value of fsStockInoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_GreaterEqual(Long fsStockInoutId) {
        regFsStockInoutId(CK_GE, fsStockInoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutId The value of fsStockInoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_LessEqual(Long fsStockInoutId) {
        regFsStockInoutId(CK_LE, fsStockInoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param minNumber The min number of fsStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fsStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFsStockInoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutIdList The collection of fsStockInoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFsStockInoutId_InScope(Collection<Long> fsStockInoutIdList) {
        doSetFsStockInoutId_InScope(fsStockInoutIdList);
    }

    protected void doSetFsStockInoutId_InScope(Collection<Long> fsStockInoutIdList) {
        regINS(CK_INS, cTL(fsStockInoutIdList), xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @param fsStockInoutIdList The collection of fsStockInoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFsStockInoutId_NotInScope(Collection<Long> fsStockInoutIdList) {
        doSetFsStockInoutId_NotInScope(fsStockInoutIdList);
    }

    protected void doSetFsStockInoutId_NotInScope(Collection<Long> fsStockInoutIdList) {
        regINS(CK_NINS, cTL(fsStockInoutIdList), xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     */
    public void setFsStockInoutId_IsNull() { regFsStockInoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     */
    public void setFsStockInoutId_IsNotNull() { regFsStockInoutId(CK_ISNN, DOBJ); }

    protected void regFsStockInoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID"); }
    protected abstract ConditionValue xgetCValueFsStockInoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutId The value of bfStockInoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_Equal(Long bfStockInoutId) {
        doSetBfStockInoutId_Equal(bfStockInoutId);
    }

    protected void doSetBfStockInoutId_Equal(Long bfStockInoutId) {
        regBfStockInoutId(CK_EQ, bfStockInoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutId The value of bfStockInoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_NotEqual(Long bfStockInoutId) {
        doSetBfStockInoutId_NotEqual(bfStockInoutId);
    }

    protected void doSetBfStockInoutId_NotEqual(Long bfStockInoutId) {
        regBfStockInoutId(CK_NES, bfStockInoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutId The value of bfStockInoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_GreaterThan(Long bfStockInoutId) {
        regBfStockInoutId(CK_GT, bfStockInoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutId The value of bfStockInoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_LessThan(Long bfStockInoutId) {
        regBfStockInoutId(CK_LT, bfStockInoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutId The value of bfStockInoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_GreaterEqual(Long bfStockInoutId) {
        regBfStockInoutId(CK_GE, bfStockInoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutId The value of bfStockInoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_LessEqual(Long bfStockInoutId) {
        regBfStockInoutId(CK_LE, bfStockInoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param minNumber The min number of bfStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bfStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBfStockInoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutIdList The collection of bfStockInoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfStockInoutId_InScope(Collection<Long> bfStockInoutIdList) {
        doSetBfStockInoutId_InScope(bfStockInoutIdList);
    }

    protected void doSetBfStockInoutId_InScope(Collection<Long> bfStockInoutIdList) {
        regINS(CK_INS, cTL(bfStockInoutIdList), xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @param bfStockInoutIdList The collection of bfStockInoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfStockInoutId_NotInScope(Collection<Long> bfStockInoutIdList) {
        doSetBfStockInoutId_NotInScope(bfStockInoutIdList);
    }

    protected void doSetBfStockInoutId_NotInScope(Collection<Long> bfStockInoutIdList) {
        regINS(CK_NINS, cTL(bfStockInoutIdList), xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     */
    public void setBfStockInoutId_IsNull() { regBfStockInoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     */
    public void setBfStockInoutId_IsNotNull() { regBfStockInoutId(CK_ISNN, DOBJ); }

    protected void regBfStockInoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID"); }
    protected abstract ConditionValue xgetCValueBfStockInoutId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_Equal(String processDt) {
        doSetProcessDt_Equal(fRES(processDt));
    }

    protected void doSetProcessDt_Equal(String processDt) {
        regProcessDt(CK_EQ, processDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_NotEqual(String processDt) {
        doSetProcessDt_NotEqual(fRES(processDt));
    }

    protected void doSetProcessDt_NotEqual(String processDt) {
        regProcessDt(CK_NES, processDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterThan(String processDt) {
        regProcessDt(CK_GT, fRES(processDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_LessThan(String processDt) {
        regProcessDt(CK_LT, fRES(processDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterEqual(String processDt) {
        regProcessDt(CK_GE, fRES(processDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_LessEqual(String processDt) {
        regProcessDt(CK_LE, fRES(processDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDtList The collection of processDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_InScope(Collection<String> processDtList) {
        doSetProcessDt_InScope(processDtList);
    }

    protected void doSetProcessDt_InScope(Collection<String> processDtList) {
        regINS(CK_INS, cTL(processDtList), xgetCValueProcessDt(), "PROCESS_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDtList The collection of processDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_NotInScope(Collection<String> processDtList) {
        doSetProcessDt_NotInScope(processDtList);
    }

    protected void doSetProcessDt_NotInScope(Collection<String> processDtList) {
        regINS(CK_NINS, cTL(processDtList), xgetCValueProcessDt(), "PROCESS_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setProcessDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processDt The value of processDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessDt_LikeSearch(String processDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processDt), xgetCValueProcessDt(), "PROCESS_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessDt_NotLikeSearch(String processDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processDt), xgetCValueProcessDt(), "PROCESS_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_PrefixSearch(String processDt) {
        setProcessDt_LikeSearch(processDt, xcLSOPPre());
    }

    protected void regProcessDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessDt(), "PROCESS_DT"); }
    protected abstract ConditionValue xgetCValueProcessDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PROCESS_TYPE_ID from M_PROCESS_TYPE where ...)} <br />
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'in-scope'. (NotNull)
     */
    public void inScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_InScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", false);
    }
    public abstract String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PROCESS_TYPE_ID from M_PROCESS_TYPE where ...)} <br />
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_NotInScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", true);
    }
    public abstract String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq);

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_Equal(String processNo) {
        doSetProcessNo_Equal(fRES(processNo));
    }

    protected void doSetProcessNo_Equal(String processNo) {
        regProcessNo(CK_EQ, processNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotEqual(String processNo) {
        doSetProcessNo_NotEqual(fRES(processNo));
    }

    protected void doSetProcessNo_NotEqual(String processNo) {
        regProcessNo(CK_NES, processNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterThan(String processNo) {
        regProcessNo(CK_GT, fRES(processNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessThan(String processNo) {
        regProcessNo(CK_LT, fRES(processNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterEqual(String processNo) {
        regProcessNo(CK_GE, fRES(processNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessEqual(String processNo) {
        regProcessNo(CK_LE, fRES(processNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNoList The collection of processNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_InScope(Collection<String> processNoList) {
        doSetProcessNo_InScope(processNoList);
    }

    protected void doSetProcessNo_InScope(Collection<String> processNoList) {
        regINS(CK_INS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNoList The collection of processNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotInScope(Collection<String> processNoList) {
        doSetProcessNo_NotInScope(processNoList);
    }

    protected void doSetProcessNo_NotInScope(Collection<String> processNoList) {
        regINS(CK_NINS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setProcessNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processNo The value of processNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessNo_LikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessNo_NotLikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_PrefixSearch(String processNo) {
        setProcessNo_LikeSearch(processNo, xcLSOPPre());
    }

    protected void regProcessNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessNo(), "PROCESS_NO"); }
    protected abstract ConditionValue xgetCValueProcessNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctType The value of correctType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_Equal(String correctType) {
        doSetCorrectType_Equal(fRES(correctType));
    }

    /**
     * Equal(=). As CorrectType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectType_Equal_AsCorrectType(CDef.CorrectType cdef) {
        doSetCorrectType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 黒
     */
    public void setCorrectType_Equal_$0() {
        setCorrectType_Equal_AsCorrectType(CDef.CorrectType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 赤
     */
    public void setCorrectType_Equal_$1() {
        setCorrectType_Equal_AsCorrectType(CDef.CorrectType.$1);
    }

    protected void doSetCorrectType_Equal(String correctType) {
        regCorrectType(CK_EQ, correctType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctType The value of correctType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_NotEqual(String correctType) {
        doSetCorrectType_NotEqual(fRES(correctType));
    }

    /**
     * NotEqual(&lt;&gt;). As CorrectType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectType_NotEqual_AsCorrectType(CDef.CorrectType cdef) {
        doSetCorrectType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 黒
     */
    public void setCorrectType_NotEqual_$0() {
        setCorrectType_NotEqual_AsCorrectType(CDef.CorrectType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 赤
     */
    public void setCorrectType_NotEqual_$1() {
        setCorrectType_NotEqual_AsCorrectType(CDef.CorrectType.$1);
    }

    protected void doSetCorrectType_NotEqual(String correctType) {
        regCorrectType(CK_NES, correctType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctTypeList The collection of correctType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_InScope(Collection<String> correctTypeList) {
        doSetCorrectType_InScope(correctTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CorrectType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_InScope_AsCorrectType(Collection<CDef.CorrectType> cdefList) {
        doSetCorrectType_InScope(cTStrL(cdefList));
    }

    protected void doSetCorrectType_InScope(Collection<String> correctTypeList) {
        regINS(CK_INS, cTL(correctTypeList), xgetCValueCorrectType(), "CORRECT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctTypeList The collection of correctType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_NotInScope(Collection<String> correctTypeList) {
        doSetCorrectType_NotInScope(correctTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CorrectType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_NotInScope_AsCorrectType(Collection<CDef.CorrectType> cdefList) {
        doSetCorrectType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCorrectType_NotInScope(Collection<String> correctTypeList) {
        regINS(CK_NINS, cTL(correctTypeList), xgetCValueCorrectType(), "CORRECT_TYPE");
    }

    protected void regCorrectType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorrectType(), "CORRECT_TYPE"); }
    protected abstract ConditionValue xgetCValueCorrectType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutType The value of inoutType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_Equal(String inoutType) {
        doSetInoutType_Equal(fRES(inoutType));
    }

    /**
     * Equal(=). As InoutType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInoutType_Equal_AsInoutType(CDef.InoutType cdef) {
        doSetInoutType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入庫
     */
    public void setInoutType_Equal_$0() {
        setInoutType_Equal_AsInoutType(CDef.InoutType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫
     */
    public void setInoutType_Equal_$1() {
        setInoutType_Equal_AsInoutType(CDef.InoutType.$1);
    }

    protected void doSetInoutType_Equal(String inoutType) {
        regInoutType(CK_EQ, inoutType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutType The value of inoutType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual(String inoutType) {
        doSetInoutType_NotEqual(fRES(inoutType));
    }

    /**
     * NotEqual(&lt;&gt;). As InoutType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual_AsInoutType(CDef.InoutType cdef) {
        doSetInoutType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入庫
     */
    public void setInoutType_NotEqual_$0() {
        setInoutType_NotEqual_AsInoutType(CDef.InoutType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫
     */
    public void setInoutType_NotEqual_$1() {
        setInoutType_NotEqual_AsInoutType(CDef.InoutType.$1);
    }

    protected void doSetInoutType_NotEqual(String inoutType) {
        regInoutType(CK_NES, inoutType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutTypeList The collection of inoutType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope(Collection<String> inoutTypeList) {
        doSetInoutType_InScope(inoutTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InoutType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope_AsInoutType(Collection<CDef.InoutType> cdefList) {
        doSetInoutType_InScope(cTStrL(cdefList));
    }

    protected void doSetInoutType_InScope(Collection<String> inoutTypeList) {
        regINS(CK_INS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutTypeList The collection of inoutType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope(Collection<String> inoutTypeList) {
        doSetInoutType_NotInScope(inoutTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InoutType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope_AsInoutType(Collection<CDef.InoutType> cdefList) {
        doSetInoutType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInoutType_NotInScope(Collection<String> inoutTypeList) {
        regINS(CK_NINS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    protected void regInoutType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutType(), "INOUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInoutType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNum The value of stockInoutNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_Equal(java.math.BigDecimal stockInoutNum) {
        doSetStockInoutNum_Equal(stockInoutNum);
    }

    protected void doSetStockInoutNum_Equal(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_EQ, stockInoutNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNum The value of stockInoutNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_NotEqual(java.math.BigDecimal stockInoutNum) {
        doSetStockInoutNum_NotEqual(stockInoutNum);
    }

    protected void doSetStockInoutNum_NotEqual(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_NES, stockInoutNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNum The value of stockInoutNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_GreaterThan(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_GT, stockInoutNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNum The value of stockInoutNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_LessThan(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_LT, stockInoutNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNum The value of stockInoutNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_GreaterEqual(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_GE, stockInoutNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNum The value of stockInoutNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_LessEqual(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_LE, stockInoutNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of stockInoutNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockInoutNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockInoutNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockInoutNum(), "STOCK_INOUT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNumList The collection of stockInoutNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutNum_InScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        doSetStockInoutNum_InScope(stockInoutNumList);
    }

    protected void doSetStockInoutNum_InScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        regINS(CK_INS, cTL(stockInoutNumList), xgetCValueStockInoutNum(), "STOCK_INOUT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @param stockInoutNumList The collection of stockInoutNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutNum_NotInScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        doSetStockInoutNum_NotInScope(stockInoutNumList);
    }

    protected void doSetStockInoutNum_NotInScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        regINS(CK_NINS, cTL(stockInoutNumList), xgetCValueStockInoutNum(), "STOCK_INOUT_NUM");
    }

    protected void regStockInoutNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockInoutNum(), "STOCK_INOUT_NUM"); }
    protected abstract ConditionValue xgetCValueStockInoutNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_Equal(String logicflg1) {
        doSetLogicflg1_Equal(fRES(logicflg1));
    }

    protected void doSetLogicflg1_Equal(String logicflg1) {
        regLogicflg1(CK_EQ, logicflg1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotEqual(String logicflg1) {
        doSetLogicflg1_NotEqual(fRES(logicflg1));
    }

    protected void doSetLogicflg1_NotEqual(String logicflg1) {
        regLogicflg1(CK_NES, logicflg1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterThan(String logicflg1) {
        regLogicflg1(CK_GT, fRES(logicflg1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_LessThan(String logicflg1) {
        regLogicflg1(CK_LT, fRES(logicflg1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterEqual(String logicflg1) {
        regLogicflg1(CK_GE, fRES(logicflg1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_LessEqual(String logicflg1) {
        regLogicflg1(CK_LE, fRES(logicflg1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1List The collection of logicflg1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_InScope(Collection<String> logicflg1List) {
        doSetLogicflg1_InScope(logicflg1List);
    }

    protected void doSetLogicflg1_InScope(Collection<String> logicflg1List) {
        regINS(CK_INS, cTL(logicflg1List), xgetCValueLogicflg1(), "LogicFlg1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1List The collection of logicflg1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotInScope(Collection<String> logicflg1List) {
        doSetLogicflg1_NotInScope(logicflg1List);
    }

    protected void doSetLogicflg1_NotInScope(Collection<String> logicflg1List) {
        regINS(CK_NINS, cTL(logicflg1List), xgetCValueLogicflg1(), "LogicFlg1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setLogicflg1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg1 The value of logicflg1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg1_LikeSearch(String logicflg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg1), xgetCValueLogicflg1(), "LogicFlg1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg1_NotLikeSearch(String logicflg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg1), xgetCValueLogicflg1(), "LogicFlg1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @param logicflg1 The value of logicflg1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_PrefixSearch(String logicflg1) {
        setLogicflg1_LikeSearch(logicflg1, xcLSOPPre());
    }

    protected void regLogicflg1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg1(), "LogicFlg1"); }
    protected abstract ConditionValue xgetCValueLogicflg1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_Equal(String logicflg2) {
        doSetLogicflg2_Equal(fRES(logicflg2));
    }

    protected void doSetLogicflg2_Equal(String logicflg2) {
        regLogicflg2(CK_EQ, logicflg2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotEqual(String logicflg2) {
        doSetLogicflg2_NotEqual(fRES(logicflg2));
    }

    protected void doSetLogicflg2_NotEqual(String logicflg2) {
        regLogicflg2(CK_NES, logicflg2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterThan(String logicflg2) {
        regLogicflg2(CK_GT, fRES(logicflg2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_LessThan(String logicflg2) {
        regLogicflg2(CK_LT, fRES(logicflg2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterEqual(String logicflg2) {
        regLogicflg2(CK_GE, fRES(logicflg2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_LessEqual(String logicflg2) {
        regLogicflg2(CK_LE, fRES(logicflg2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2List The collection of logicflg2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_InScope(Collection<String> logicflg2List) {
        doSetLogicflg2_InScope(logicflg2List);
    }

    protected void doSetLogicflg2_InScope(Collection<String> logicflg2List) {
        regINS(CK_INS, cTL(logicflg2List), xgetCValueLogicflg2(), "LogicFlg2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2List The collection of logicflg2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotInScope(Collection<String> logicflg2List) {
        doSetLogicflg2_NotInScope(logicflg2List);
    }

    protected void doSetLogicflg2_NotInScope(Collection<String> logicflg2List) {
        regINS(CK_NINS, cTL(logicflg2List), xgetCValueLogicflg2(), "LogicFlg2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setLogicflg2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg2 The value of logicflg2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg2_LikeSearch(String logicflg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg2), xgetCValueLogicflg2(), "LogicFlg2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg2_NotLikeSearch(String logicflg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg2), xgetCValueLogicflg2(), "LogicFlg2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @param logicflg2 The value of logicflg2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_PrefixSearch(String logicflg2) {
        setLogicflg2_LikeSearch(logicflg2, xcLSOPPre());
    }

    protected void regLogicflg2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg2(), "LogicFlg2"); }
    protected abstract ConditionValue xgetCValueLogicflg2();

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
    public HpSLCFunction<HStockInoutCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HStockInoutCB.class);
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
    public HpSLCFunction<HStockInoutCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HStockInoutCB.class);
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
    public HpSLCFunction<HStockInoutCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HStockInoutCB.class);
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
    public HpSLCFunction<HStockInoutCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HStockInoutCB.class);
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
    public HpSLCFunction<HStockInoutCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HStockInoutCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HStockInoutCB&gt;() {
     *     public void query(HStockInoutCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HStockInoutCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HStockInoutCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockInoutCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HStockInoutCQ sq);

    protected HStockInoutCB xcreateScalarConditionCB() {
        HStockInoutCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HStockInoutCB xcreateScalarConditionPartitionByCB() {
        HStockInoutCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STOCK_INOUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HStockInoutCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HStockInoutCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HStockInoutCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STOCK_INOUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HStockInoutCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HStockInoutCQ sq);

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
    protected HStockInoutCB newMyCB() {
        return new HStockInoutCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HStockInoutCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

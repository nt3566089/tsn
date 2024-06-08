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
 * The abstract condition-query of E_STOCK_RECORD_RECEIVE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEStockRecordReceiveCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEStockRecordReceiveCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_STOCK_RECORD_RECEIVE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveId The value of stockRecordReceiveId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_Equal(Long stockRecordReceiveId) {
        doSetStockRecordReceiveId_Equal(stockRecordReceiveId);
    }

    protected void doSetStockRecordReceiveId_Equal(Long stockRecordReceiveId) {
        regStockRecordReceiveId(CK_EQ, stockRecordReceiveId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveId The value of stockRecordReceiveId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_NotEqual(Long stockRecordReceiveId) {
        doSetStockRecordReceiveId_NotEqual(stockRecordReceiveId);
    }

    protected void doSetStockRecordReceiveId_NotEqual(Long stockRecordReceiveId) {
        regStockRecordReceiveId(CK_NES, stockRecordReceiveId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveId The value of stockRecordReceiveId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_GreaterThan(Long stockRecordReceiveId) {
        regStockRecordReceiveId(CK_GT, stockRecordReceiveId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveId The value of stockRecordReceiveId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_LessThan(Long stockRecordReceiveId) {
        regStockRecordReceiveId(CK_LT, stockRecordReceiveId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveId The value of stockRecordReceiveId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_GreaterEqual(Long stockRecordReceiveId) {
        regStockRecordReceiveId(CK_GE, stockRecordReceiveId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveId The value of stockRecordReceiveId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_LessEqual(Long stockRecordReceiveId) {
        regStockRecordReceiveId(CK_LE, stockRecordReceiveId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of stockRecordReceiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockRecordReceiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockRecordReceiveId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockRecordReceiveId(), "STOCK_RECORD_RECEIVE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveIdList The collection of stockRecordReceiveId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_InScope(Collection<Long> stockRecordReceiveIdList) {
        doSetStockRecordReceiveId_InScope(stockRecordReceiveIdList);
    }

    protected void doSetStockRecordReceiveId_InScope(Collection<Long> stockRecordReceiveIdList) {
        regINS(CK_INS, cTL(stockRecordReceiveIdList), xgetCValueStockRecordReceiveId(), "STOCK_RECORD_RECEIVE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockRecordReceiveIdList The collection of stockRecordReceiveId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockRecordReceiveId_NotInScope(Collection<Long> stockRecordReceiveIdList) {
        doSetStockRecordReceiveId_NotInScope(stockRecordReceiveIdList);
    }

    protected void doSetStockRecordReceiveId_NotInScope(Collection<Long> stockRecordReceiveIdList) {
        regINS(CK_NINS, cTL(stockRecordReceiveIdList), xgetCValueStockRecordReceiveId(), "STOCK_RECORD_RECEIVE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockRecordReceiveId_IsNull() { regStockRecordReceiveId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockRecordReceiveId_IsNotNull() { regStockRecordReceiveId(CK_ISNN, DOBJ); }

    protected void regStockRecordReceiveId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockRecordReceiveId(), "STOCK_RECORD_RECEIVE_ID"); }
    protected abstract ConditionValue xgetCValueStockRecordReceiveId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_Equal(String receiveCd) {
        doSetReceiveCd_Equal(fRES(receiveCd));
    }

    protected void doSetReceiveCd_Equal(String receiveCd) {
        regReceiveCd(CK_EQ, receiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotEqual(String receiveCd) {
        doSetReceiveCd_NotEqual(fRES(receiveCd));
    }

    protected void doSetReceiveCd_NotEqual(String receiveCd) {
        regReceiveCd(CK_NES, receiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_InScope(Collection<String> receiveCdList) {
        doSetReceiveCd_InScope(receiveCdList);
    }

    protected void doSetReceiveCd_InScope(Collection<String> receiveCdList) {
        regINS(CK_INS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotInScope(Collection<String> receiveCdList) {
        doSetReceiveCd_NotInScope(receiveCdList);
    }

    protected void doSetReceiveCd_NotInScope(Collection<String> receiveCdList) {
        regINS(CK_NINS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveCd The value of receiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveCd_LikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_Equal(Long receiveRowId) {
        doSetReceiveRowId_Equal(receiveRowId);
    }

    protected void doSetReceiveRowId_Equal(Long receiveRowId) {
        regReceiveRowId(CK_EQ, receiveRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotEqual(Long receiveRowId) {
        doSetReceiveRowId_NotEqual(receiveRowId);
    }

    protected void doSetReceiveRowId_NotEqual(Long receiveRowId) {
        regReceiveRowId(CK_NES, receiveRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_InScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        regINS(CK_INS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_NotInScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        regINS(CK_NINS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    protected void regReceiveRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_Equal(String stockDate) {
        doSetStockDate_Equal(fRES(stockDate));
    }

    protected void doSetStockDate_Equal(String stockDate) {
        regStockDate(CK_EQ, stockDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_NotEqual(String stockDate) {
        doSetStockDate_NotEqual(fRES(stockDate));
    }

    protected void doSetStockDate_NotEqual(String stockDate) {
        regStockDate(CK_NES, stockDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_GreaterThan(String stockDate) {
        regStockDate(CK_GT, fRES(stockDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_LessThan(String stockDate) {
        regStockDate(CK_LT, fRES(stockDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_GreaterEqual(String stockDate) {
        regStockDate(CK_GE, fRES(stockDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_LessEqual(String stockDate) {
        regStockDate(CK_LE, fRES(stockDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDateList The collection of stockDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_InScope(Collection<String> stockDateList) {
        doSetStockDate_InScope(stockDateList);
    }

    protected void doSetStockDate_InScope(Collection<String> stockDateList) {
        regINS(CK_INS, cTL(stockDateList), xgetCValueStockDate(), "STOCK_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDateList The collection of stockDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_NotInScope(Collection<String> stockDateList) {
        doSetStockDate_NotInScope(stockDateList);
    }

    protected void doSetStockDate_NotInScope(Collection<String> stockDateList) {
        regINS(CK_NINS, cTL(stockDateList), xgetCValueStockDate(), "STOCK_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_DATE: {varchar(255)} <br>
     * <pre>e.g. setStockDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockDate The value of stockDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockDate_LikeSearch(String stockDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockDate), xgetCValueStockDate(), "STOCK_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockDate_NotLikeSearch(String stockDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockDate), xgetCValueStockDate(), "STOCK_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     * @param stockDate The value of stockDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDate_PrefixSearch(String stockDate) {
        setStockDate_LikeSearch(stockDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     */
    public void setStockDate_IsNull() { regStockDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     */
    public void setStockDate_IsNullOrEmpty() { regStockDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_DATE: {varchar(255)}
     */
    public void setStockDate_IsNotNull() { regStockDate(CK_ISNN, DOBJ); }

    protected void regStockDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockDate(), "STOCK_DATE"); }
    protected abstract ConditionValue xgetCValueStockDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)} <br>
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_Equal(String companyCd) {
        doSetCompanyCd_Equal(fRES(companyCd));
    }

    protected void doSetCompanyCd_Equal(String companyCd) {
        regCompanyCd(CK_EQ, companyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotEqual(String companyCd) {
        doSetCompanyCd_NotEqual(fRES(companyCd));
    }

    protected void doSetCompanyCd_NotEqual(String companyCd) {
        regCompanyCd(CK_NES, companyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterThan(String companyCd) {
        regCompanyCd(CK_GT, fRES(companyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessThan(String companyCd) {
        regCompanyCd(CK_LT, fRES(companyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterEqual(String companyCd) {
        regCompanyCd(CK_GE, fRES(companyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessEqual(String companyCd) {
        regCompanyCd(CK_LE, fRES(companyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCdList The collection of companyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_InScope(Collection<String> companyCdList) {
        doSetCompanyCd_InScope(companyCdList);
    }

    protected void doSetCompanyCd_InScope(Collection<String> companyCdList) {
        regINS(CK_INS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCdList The collection of companyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotInScope(Collection<String> companyCdList) {
        doSetCompanyCd_NotInScope(companyCdList);
    }

    protected void doSetCompanyCd_NotInScope(Collection<String> companyCdList) {
        regINS(CK_NINS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyCd The value of companyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyCd_LikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyCd_NotLikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_PrefixSearch(String companyCd) {
        setCompanyCd_LikeSearch(companyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     */
    public void setCompanyCd_IsNull() { regCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     */
    public void setCompanyCd_IsNullOrEmpty() { regCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     */
    public void setCompanyCd_IsNotNull() { regCompanyCd(CK_ISNN, DOBJ); }

    protected void regCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyCd(), "COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_Equal(String stockQtySign) {
        doSetStockQtySign_Equal(fRES(stockQtySign));
    }

    protected void doSetStockQtySign_Equal(String stockQtySign) {
        regStockQtySign(CK_EQ, stockQtySign);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_NotEqual(String stockQtySign) {
        doSetStockQtySign_NotEqual(fRES(stockQtySign));
    }

    protected void doSetStockQtySign_NotEqual(String stockQtySign) {
        regStockQtySign(CK_NES, stockQtySign);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_GreaterThan(String stockQtySign) {
        regStockQtySign(CK_GT, fRES(stockQtySign));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_LessThan(String stockQtySign) {
        regStockQtySign(CK_LT, fRES(stockQtySign));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_GreaterEqual(String stockQtySign) {
        regStockQtySign(CK_GE, fRES(stockQtySign));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_LessEqual(String stockQtySign) {
        regStockQtySign(CK_LE, fRES(stockQtySign));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySignList The collection of stockQtySign as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_InScope(Collection<String> stockQtySignList) {
        doSetStockQtySign_InScope(stockQtySignList);
    }

    protected void doSetStockQtySign_InScope(Collection<String> stockQtySignList) {
        regINS(CK_INS, cTL(stockQtySignList), xgetCValueStockQtySign(), "STOCK_QTY_SIGN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySignList The collection of stockQtySign as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_NotInScope(Collection<String> stockQtySignList) {
        doSetStockQtySign_NotInScope(stockQtySignList);
    }

    protected void doSetStockQtySign_NotInScope(Collection<String> stockQtySignList) {
        regINS(CK_NINS, cTL(stockQtySignList), xgetCValueStockQtySign(), "STOCK_QTY_SIGN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)} <br>
     * <pre>e.g. setStockQtySign_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockQtySign The value of stockQtySign as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockQtySign_LikeSearch(String stockQtySign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockQtySign), xgetCValueStockQtySign(), "STOCK_QTY_SIGN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockQtySign_NotLikeSearch(String stockQtySign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockQtySign), xgetCValueStockQtySign(), "STOCK_QTY_SIGN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @param stockQtySign The value of stockQtySign as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQtySign_PrefixSearch(String stockQtySign) {
        setStockQtySign_LikeSearch(stockQtySign, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     */
    public void setStockQtySign_IsNull() { regStockQtySign(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     */
    public void setStockQtySign_IsNullOrEmpty() { regStockQtySign(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     */
    public void setStockQtySign_IsNotNull() { regStockQtySign(CK_ISNN, DOBJ); }

    protected void regStockQtySign(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockQtySign(), "STOCK_QTY_SIGN"); }
    protected abstract ConditionValue xgetCValueStockQtySign();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_Equal(String stockQty) {
        doSetStockQty_Equal(fRES(stockQty));
    }

    protected void doSetStockQty_Equal(String stockQty) {
        regStockQty(CK_EQ, stockQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_NotEqual(String stockQty) {
        doSetStockQty_NotEqual(fRES(stockQty));
    }

    protected void doSetStockQty_NotEqual(String stockQty) {
        regStockQty(CK_NES, stockQty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_GreaterThan(String stockQty) {
        regStockQty(CK_GT, fRES(stockQty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_LessThan(String stockQty) {
        regStockQty(CK_LT, fRES(stockQty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_GreaterEqual(String stockQty) {
        regStockQty(CK_GE, fRES(stockQty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_LessEqual(String stockQty) {
        regStockQty(CK_LE, fRES(stockQty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQtyList The collection of stockQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_InScope(Collection<String> stockQtyList) {
        doSetStockQty_InScope(stockQtyList);
    }

    protected void doSetStockQty_InScope(Collection<String> stockQtyList) {
        regINS(CK_INS, cTL(stockQtyList), xgetCValueStockQty(), "STOCK_QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQtyList The collection of stockQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_NotInScope(Collection<String> stockQtyList) {
        doSetStockQty_NotInScope(stockQtyList);
    }

    protected void doSetStockQty_NotInScope(Collection<String> stockQtyList) {
        regINS(CK_NINS, cTL(stockQtyList), xgetCValueStockQty(), "STOCK_QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_QTY: {varchar(255)} <br>
     * <pre>e.g. setStockQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockQty The value of stockQty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockQty_LikeSearch(String stockQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockQty), xgetCValueStockQty(), "STOCK_QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockQty_NotLikeSearch(String stockQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockQty), xgetCValueStockQty(), "STOCK_QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     * @param stockQty The value of stockQty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockQty_PrefixSearch(String stockQty) {
        setStockQty_LikeSearch(stockQty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     */
    public void setStockQty_IsNull() { regStockQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     */
    public void setStockQty_IsNullOrEmpty() { regStockQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_QTY: {varchar(255)}
     */
    public void setStockQty_IsNotNull() { regStockQty(CK_ISNN, DOBJ); }

    protected void regStockQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockQty(), "STOCK_QTY"); }
    protected abstract ConditionValue xgetCValueStockQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_Equal(String damageItemQtySign) {
        doSetDamageItemQtySign_Equal(fRES(damageItemQtySign));
    }

    protected void doSetDamageItemQtySign_Equal(String damageItemQtySign) {
        regDamageItemQtySign(CK_EQ, damageItemQtySign);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_NotEqual(String damageItemQtySign) {
        doSetDamageItemQtySign_NotEqual(fRES(damageItemQtySign));
    }

    protected void doSetDamageItemQtySign_NotEqual(String damageItemQtySign) {
        regDamageItemQtySign(CK_NES, damageItemQtySign);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_GreaterThan(String damageItemQtySign) {
        regDamageItemQtySign(CK_GT, fRES(damageItemQtySign));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_LessThan(String damageItemQtySign) {
        regDamageItemQtySign(CK_LT, fRES(damageItemQtySign));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_GreaterEqual(String damageItemQtySign) {
        regDamageItemQtySign(CK_GE, fRES(damageItemQtySign));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_LessEqual(String damageItemQtySign) {
        regDamageItemQtySign(CK_LE, fRES(damageItemQtySign));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySignList The collection of damageItemQtySign as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_InScope(Collection<String> damageItemQtySignList) {
        doSetDamageItemQtySign_InScope(damageItemQtySignList);
    }

    protected void doSetDamageItemQtySign_InScope(Collection<String> damageItemQtySignList) {
        regINS(CK_INS, cTL(damageItemQtySignList), xgetCValueDamageItemQtySign(), "DAMAGE_ITEM_QTY_SIGN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySignList The collection of damageItemQtySign as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_NotInScope(Collection<String> damageItemQtySignList) {
        doSetDamageItemQtySign_NotInScope(damageItemQtySignList);
    }

    protected void doSetDamageItemQtySign_NotInScope(Collection<String> damageItemQtySignList) {
        regINS(CK_NINS, cTL(damageItemQtySignList), xgetCValueDamageItemQtySign(), "DAMAGE_ITEM_QTY_SIGN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)} <br>
     * <pre>e.g. setDamageItemQtySign_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param damageItemQtySign The value of damageItemQtySign as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDamageItemQtySign_LikeSearch(String damageItemQtySign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(damageItemQtySign), xgetCValueDamageItemQtySign(), "DAMAGE_ITEM_QTY_SIGN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDamageItemQtySign_NotLikeSearch(String damageItemQtySign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(damageItemQtySign), xgetCValueDamageItemQtySign(), "DAMAGE_ITEM_QTY_SIGN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @param damageItemQtySign The value of damageItemQtySign as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQtySign_PrefixSearch(String damageItemQtySign) {
        setDamageItemQtySign_LikeSearch(damageItemQtySign, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     */
    public void setDamageItemQtySign_IsNull() { regDamageItemQtySign(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     */
    public void setDamageItemQtySign_IsNullOrEmpty() { regDamageItemQtySign(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     */
    public void setDamageItemQtySign_IsNotNull() { regDamageItemQtySign(CK_ISNN, DOBJ); }

    protected void regDamageItemQtySign(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageItemQtySign(), "DAMAGE_ITEM_QTY_SIGN"); }
    protected abstract ConditionValue xgetCValueDamageItemQtySign();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_Equal(String damageItemQty) {
        doSetDamageItemQty_Equal(fRES(damageItemQty));
    }

    protected void doSetDamageItemQty_Equal(String damageItemQty) {
        regDamageItemQty(CK_EQ, damageItemQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_NotEqual(String damageItemQty) {
        doSetDamageItemQty_NotEqual(fRES(damageItemQty));
    }

    protected void doSetDamageItemQty_NotEqual(String damageItemQty) {
        regDamageItemQty(CK_NES, damageItemQty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_GreaterThan(String damageItemQty) {
        regDamageItemQty(CK_GT, fRES(damageItemQty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_LessThan(String damageItemQty) {
        regDamageItemQty(CK_LT, fRES(damageItemQty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_GreaterEqual(String damageItemQty) {
        regDamageItemQty(CK_GE, fRES(damageItemQty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_LessEqual(String damageItemQty) {
        regDamageItemQty(CK_LE, fRES(damageItemQty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQtyList The collection of damageItemQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_InScope(Collection<String> damageItemQtyList) {
        doSetDamageItemQty_InScope(damageItemQtyList);
    }

    protected void doSetDamageItemQty_InScope(Collection<String> damageItemQtyList) {
        regINS(CK_INS, cTL(damageItemQtyList), xgetCValueDamageItemQty(), "DAMAGE_ITEM_QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQtyList The collection of damageItemQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_NotInScope(Collection<String> damageItemQtyList) {
        doSetDamageItemQty_NotInScope(damageItemQtyList);
    }

    protected void doSetDamageItemQty_NotInScope(Collection<String> damageItemQtyList) {
        regINS(CK_NINS, cTL(damageItemQtyList), xgetCValueDamageItemQty(), "DAMAGE_ITEM_QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)} <br>
     * <pre>e.g. setDamageItemQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param damageItemQty The value of damageItemQty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDamageItemQty_LikeSearch(String damageItemQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(damageItemQty), xgetCValueDamageItemQty(), "DAMAGE_ITEM_QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDamageItemQty_NotLikeSearch(String damageItemQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(damageItemQty), xgetCValueDamageItemQty(), "DAMAGE_ITEM_QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @param damageItemQty The value of damageItemQty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageItemQty_PrefixSearch(String damageItemQty) {
        setDamageItemQty_LikeSearch(damageItemQty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     */
    public void setDamageItemQty_IsNull() { regDamageItemQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     */
    public void setDamageItemQty_IsNullOrEmpty() { regDamageItemQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     */
    public void setDamageItemQty_IsNotNull() { regDamageItemQty(CK_ISNN, DOBJ); }

    protected void regDamageItemQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageItemQty(), "DAMAGE_ITEM_QTY"); }
    protected abstract ConditionValue xgetCValueDamageItemQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_Equal(String refundItemQtySign) {
        doSetRefundItemQtySign_Equal(fRES(refundItemQtySign));
    }

    protected void doSetRefundItemQtySign_Equal(String refundItemQtySign) {
        regRefundItemQtySign(CK_EQ, refundItemQtySign);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_NotEqual(String refundItemQtySign) {
        doSetRefundItemQtySign_NotEqual(fRES(refundItemQtySign));
    }

    protected void doSetRefundItemQtySign_NotEqual(String refundItemQtySign) {
        regRefundItemQtySign(CK_NES, refundItemQtySign);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_GreaterThan(String refundItemQtySign) {
        regRefundItemQtySign(CK_GT, fRES(refundItemQtySign));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_LessThan(String refundItemQtySign) {
        regRefundItemQtySign(CK_LT, fRES(refundItemQtySign));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_GreaterEqual(String refundItemQtySign) {
        regRefundItemQtySign(CK_GE, fRES(refundItemQtySign));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_LessEqual(String refundItemQtySign) {
        regRefundItemQtySign(CK_LE, fRES(refundItemQtySign));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySignList The collection of refundItemQtySign as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_InScope(Collection<String> refundItemQtySignList) {
        doSetRefundItemQtySign_InScope(refundItemQtySignList);
    }

    protected void doSetRefundItemQtySign_InScope(Collection<String> refundItemQtySignList) {
        regINS(CK_INS, cTL(refundItemQtySignList), xgetCValueRefundItemQtySign(), "REFUND_ITEM_QTY_SIGN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySignList The collection of refundItemQtySign as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_NotInScope(Collection<String> refundItemQtySignList) {
        doSetRefundItemQtySign_NotInScope(refundItemQtySignList);
    }

    protected void doSetRefundItemQtySign_NotInScope(Collection<String> refundItemQtySignList) {
        regINS(CK_NINS, cTL(refundItemQtySignList), xgetCValueRefundItemQtySign(), "REFUND_ITEM_QTY_SIGN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)} <br>
     * <pre>e.g. setRefundItemQtySign_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refundItemQtySign The value of refundItemQtySign as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefundItemQtySign_LikeSearch(String refundItemQtySign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refundItemQtySign), xgetCValueRefundItemQtySign(), "REFUND_ITEM_QTY_SIGN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefundItemQtySign_NotLikeSearch(String refundItemQtySign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refundItemQtySign), xgetCValueRefundItemQtySign(), "REFUND_ITEM_QTY_SIGN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @param refundItemQtySign The value of refundItemQtySign as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQtySign_PrefixSearch(String refundItemQtySign) {
        setRefundItemQtySign_LikeSearch(refundItemQtySign, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     */
    public void setRefundItemQtySign_IsNull() { regRefundItemQtySign(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     */
    public void setRefundItemQtySign_IsNullOrEmpty() { regRefundItemQtySign(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     */
    public void setRefundItemQtySign_IsNotNull() { regRefundItemQtySign(CK_ISNN, DOBJ); }

    protected void regRefundItemQtySign(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefundItemQtySign(), "REFUND_ITEM_QTY_SIGN"); }
    protected abstract ConditionValue xgetCValueRefundItemQtySign();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_Equal(String refundItemQty) {
        doSetRefundItemQty_Equal(fRES(refundItemQty));
    }

    protected void doSetRefundItemQty_Equal(String refundItemQty) {
        regRefundItemQty(CK_EQ, refundItemQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_NotEqual(String refundItemQty) {
        doSetRefundItemQty_NotEqual(fRES(refundItemQty));
    }

    protected void doSetRefundItemQty_NotEqual(String refundItemQty) {
        regRefundItemQty(CK_NES, refundItemQty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_GreaterThan(String refundItemQty) {
        regRefundItemQty(CK_GT, fRES(refundItemQty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_LessThan(String refundItemQty) {
        regRefundItemQty(CK_LT, fRES(refundItemQty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_GreaterEqual(String refundItemQty) {
        regRefundItemQty(CK_GE, fRES(refundItemQty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_LessEqual(String refundItemQty) {
        regRefundItemQty(CK_LE, fRES(refundItemQty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQtyList The collection of refundItemQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_InScope(Collection<String> refundItemQtyList) {
        doSetRefundItemQty_InScope(refundItemQtyList);
    }

    protected void doSetRefundItemQty_InScope(Collection<String> refundItemQtyList) {
        regINS(CK_INS, cTL(refundItemQtyList), xgetCValueRefundItemQty(), "REFUND_ITEM_QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQtyList The collection of refundItemQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_NotInScope(Collection<String> refundItemQtyList) {
        doSetRefundItemQty_NotInScope(refundItemQtyList);
    }

    protected void doSetRefundItemQty_NotInScope(Collection<String> refundItemQtyList) {
        regINS(CK_NINS, cTL(refundItemQtyList), xgetCValueRefundItemQty(), "REFUND_ITEM_QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)} <br>
     * <pre>e.g. setRefundItemQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refundItemQty The value of refundItemQty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefundItemQty_LikeSearch(String refundItemQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refundItemQty), xgetCValueRefundItemQty(), "REFUND_ITEM_QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefundItemQty_NotLikeSearch(String refundItemQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refundItemQty), xgetCValueRefundItemQty(), "REFUND_ITEM_QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @param refundItemQty The value of refundItemQty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefundItemQty_PrefixSearch(String refundItemQty) {
        setRefundItemQty_LikeSearch(refundItemQty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     */
    public void setRefundItemQty_IsNull() { regRefundItemQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     */
    public void setRefundItemQty_IsNullOrEmpty() { regRefundItemQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     */
    public void setRefundItemQty_IsNotNull() { regRefundItemQty(CK_ISNN, DOBJ); }

    protected void regRefundItemQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefundItemQty(), "REFUND_ITEM_QTY"); }
    protected abstract ConditionValue xgetCValueRefundItemQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_Equal(String storageLocation) {
        doSetStorageLocation_Equal(fRES(storageLocation));
    }

    protected void doSetStorageLocation_Equal(String storageLocation) {
        regStorageLocation(CK_EQ, storageLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_NotEqual(String storageLocation) {
        doSetStorageLocation_NotEqual(fRES(storageLocation));
    }

    protected void doSetStorageLocation_NotEqual(String storageLocation) {
        regStorageLocation(CK_NES, storageLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_GreaterThan(String storageLocation) {
        regStorageLocation(CK_GT, fRES(storageLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_LessThan(String storageLocation) {
        regStorageLocation(CK_LT, fRES(storageLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_GreaterEqual(String storageLocation) {
        regStorageLocation(CK_GE, fRES(storageLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_LessEqual(String storageLocation) {
        regStorageLocation(CK_LE, fRES(storageLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocationList The collection of storageLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_InScope(Collection<String> storageLocationList) {
        doSetStorageLocation_InScope(storageLocationList);
    }

    protected void doSetStorageLocation_InScope(Collection<String> storageLocationList) {
        regINS(CK_INS, cTL(storageLocationList), xgetCValueStorageLocation(), "STORAGE_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocationList The collection of storageLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_NotInScope(Collection<String> storageLocationList) {
        doSetStorageLocation_NotInScope(storageLocationList);
    }

    protected void doSetStorageLocation_NotInScope(Collection<String> storageLocationList) {
        regINS(CK_NINS, cTL(storageLocationList), xgetCValueStorageLocation(), "STORAGE_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)} <br>
     * <pre>e.g. setStorageLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageLocation The value of storageLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageLocation_LikeSearch(String storageLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageLocation), xgetCValueStorageLocation(), "STORAGE_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageLocation_NotLikeSearch(String storageLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageLocation), xgetCValueStorageLocation(), "STORAGE_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @param storageLocation The value of storageLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocation_PrefixSearch(String storageLocation) {
        setStorageLocation_LikeSearch(storageLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     */
    public void setStorageLocation_IsNull() { regStorageLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     */
    public void setStorageLocation_IsNullOrEmpty() { regStorageLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_LOCATION: {varchar(255)}
     */
    public void setStorageLocation_IsNotNull() { regStorageLocation(CK_ISNN, DOBJ); }

    protected void regStorageLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageLocation(), "STORAGE_LOCATION"); }
    protected abstract ConditionValue xgetCValueStorageLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_Equal(String skuCd) {
        doSetSkuCd_Equal(fRES(skuCd));
    }

    protected void doSetSkuCd_Equal(String skuCd) {
        regSkuCd(CK_EQ, skuCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_NotEqual(String skuCd) {
        doSetSkuCd_NotEqual(fRES(skuCd));
    }

    protected void doSetSkuCd_NotEqual(String skuCd) {
        regSkuCd(CK_NES, skuCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_GreaterThan(String skuCd) {
        regSkuCd(CK_GT, fRES(skuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_LessThan(String skuCd) {
        regSkuCd(CK_LT, fRES(skuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_GreaterEqual(String skuCd) {
        regSkuCd(CK_GE, fRES(skuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_LessEqual(String skuCd) {
        regSkuCd(CK_LE, fRES(skuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCdList The collection of skuCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_InScope(Collection<String> skuCdList) {
        doSetSkuCd_InScope(skuCdList);
    }

    protected void doSetSkuCd_InScope(Collection<String> skuCdList) {
        regINS(CK_INS, cTL(skuCdList), xgetCValueSkuCd(), "SKU_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCdList The collection of skuCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_NotInScope(Collection<String> skuCdList) {
        doSetSkuCd_NotInScope(skuCdList);
    }

    protected void doSetSkuCd_NotInScope(Collection<String> skuCdList) {
        regINS(CK_NINS, cTL(skuCdList), xgetCValueSkuCd(), "SKU_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU_CD: {varchar(255)} <br>
     * <pre>e.g. setSkuCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skuCd The value of skuCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkuCd_LikeSearch(String skuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skuCd), xgetCValueSkuCd(), "SKU_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkuCd_NotLikeSearch(String skuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skuCd), xgetCValueSkuCd(), "SKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU_CD: {varchar(255)}
     * @param skuCd The value of skuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCd_PrefixSearch(String skuCd) {
        setSkuCd_LikeSearch(skuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     */
    public void setSkuCd_IsNull() { regSkuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     */
    public void setSkuCd_IsNullOrEmpty() { regSkuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKU_CD: {varchar(255)}
     */
    public void setSkuCd_IsNotNull() { regSkuCd(CK_ISNN, DOBJ); }

    protected void regSkuCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkuCd(), "SKU_CD"); }
    protected abstract ConditionValue xgetCValueSkuCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_Equal(String quantityUnit) {
        doSetQuantityUnit_Equal(fRES(quantityUnit));
    }

    protected void doSetQuantityUnit_Equal(String quantityUnit) {
        regQuantityUnit(CK_EQ, quantityUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_NotEqual(String quantityUnit) {
        doSetQuantityUnit_NotEqual(fRES(quantityUnit));
    }

    protected void doSetQuantityUnit_NotEqual(String quantityUnit) {
        regQuantityUnit(CK_NES, quantityUnit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_GreaterThan(String quantityUnit) {
        regQuantityUnit(CK_GT, fRES(quantityUnit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_LessThan(String quantityUnit) {
        regQuantityUnit(CK_LT, fRES(quantityUnit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_GreaterEqual(String quantityUnit) {
        regQuantityUnit(CK_GE, fRES(quantityUnit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_LessEqual(String quantityUnit) {
        regQuantityUnit(CK_LE, fRES(quantityUnit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnitList The collection of quantityUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_InScope(Collection<String> quantityUnitList) {
        doSetQuantityUnit_InScope(quantityUnitList);
    }

    protected void doSetQuantityUnit_InScope(Collection<String> quantityUnitList) {
        regINS(CK_INS, cTL(quantityUnitList), xgetCValueQuantityUnit(), "QUANTITY_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnitList The collection of quantityUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_NotInScope(Collection<String> quantityUnitList) {
        doSetQuantityUnit_NotInScope(quantityUnitList);
    }

    protected void doSetQuantityUnit_NotInScope(Collection<String> quantityUnitList) {
        regINS(CK_NINS, cTL(quantityUnitList), xgetCValueQuantityUnit(), "QUANTITY_UNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)} <br>
     * <pre>e.g. setQuantityUnit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param quantityUnit The value of quantityUnit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQuantityUnit_LikeSearch(String quantityUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(quantityUnit), xgetCValueQuantityUnit(), "QUANTITY_UNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQuantityUnit_NotLikeSearch(String quantityUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(quantityUnit), xgetCValueQuantityUnit(), "QUANTITY_UNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @param quantityUnit The value of quantityUnit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityUnit_PrefixSearch(String quantityUnit) {
        setQuantityUnit_LikeSearch(quantityUnit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     */
    public void setQuantityUnit_IsNull() { regQuantityUnit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     */
    public void setQuantityUnit_IsNullOrEmpty() { regQuantityUnit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUANTITY_UNIT: {varchar(255)}
     */
    public void setQuantityUnit_IsNotNull() { regQuantityUnit(CK_ISNN, DOBJ); }

    protected void regQuantityUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuantityUnit(), "QUANTITY_UNIT"); }
    protected abstract ConditionValue xgetCValueQuantityUnit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_Equal(String batNo) {
        doSetBatNo_Equal(fRES(batNo));
    }

    protected void doSetBatNo_Equal(String batNo) {
        regBatNo(CK_EQ, batNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_NotEqual(String batNo) {
        doSetBatNo_NotEqual(fRES(batNo));
    }

    protected void doSetBatNo_NotEqual(String batNo) {
        regBatNo(CK_NES, batNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_GreaterThan(String batNo) {
        regBatNo(CK_GT, fRES(batNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_LessThan(String batNo) {
        regBatNo(CK_LT, fRES(batNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_GreaterEqual(String batNo) {
        regBatNo(CK_GE, fRES(batNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_LessEqual(String batNo) {
        regBatNo(CK_LE, fRES(batNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNoList The collection of batNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_InScope(Collection<String> batNoList) {
        doSetBatNo_InScope(batNoList);
    }

    protected void doSetBatNo_InScope(Collection<String> batNoList) {
        regINS(CK_INS, cTL(batNoList), xgetCValueBatNo(), "BAT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNoList The collection of batNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_NotInScope(Collection<String> batNoList) {
        doSetBatNo_NotInScope(batNoList);
    }

    protected void doSetBatNo_NotInScope(Collection<String> batNoList) {
        regINS(CK_NINS, cTL(batNoList), xgetCValueBatNo(), "BAT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAT_NO: {varchar(255)} <br>
     * <pre>e.g. setBatNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batNo The value of batNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatNo_LikeSearch(String batNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batNo), xgetCValueBatNo(), "BAT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatNo_NotLikeSearch(String batNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batNo), xgetCValueBatNo(), "BAT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAT_NO: {varchar(255)}
     * @param batNo The value of batNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatNo_PrefixSearch(String batNo) {
        setBatNo_LikeSearch(batNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     */
    public void setBatNo_IsNull() { regBatNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     */
    public void setBatNo_IsNullOrEmpty() { regBatNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BAT_NO: {varchar(255)}
     */
    public void setBatNo_IsNotNull() { regBatNo(CK_ISNN, DOBJ); }

    protected void regBatNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatNo(), "BAT_NO"); }
    protected abstract ConditionValue xgetCValueBatNo();

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
    public HpSLCFunction<EStockRecordReceiveCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EStockRecordReceiveCB.class);
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
    public HpSLCFunction<EStockRecordReceiveCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EStockRecordReceiveCB.class);
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
    public HpSLCFunction<EStockRecordReceiveCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EStockRecordReceiveCB.class);
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
    public HpSLCFunction<EStockRecordReceiveCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EStockRecordReceiveCB.class);
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
    public HpSLCFunction<EStockRecordReceiveCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EStockRecordReceiveCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EStockRecordReceiveCB&gt;() {
     *     public void query(EStockRecordReceiveCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EStockRecordReceiveCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EStockRecordReceiveCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EStockRecordReceiveCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EStockRecordReceiveCQ sq);

    protected EStockRecordReceiveCB xcreateScalarConditionCB() {
        EStockRecordReceiveCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EStockRecordReceiveCB xcreateScalarConditionPartitionByCB() {
        EStockRecordReceiveCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EStockRecordReceiveCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EStockRecordReceiveCB cb = new EStockRecordReceiveCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STOCK_RECORD_RECEIVE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EStockRecordReceiveCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EStockRecordReceiveCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EStockRecordReceiveCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EStockRecordReceiveCB cb = new EStockRecordReceiveCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STOCK_RECORD_RECEIVE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EStockRecordReceiveCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EStockRecordReceiveCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EStockRecordReceiveCB cb = new EStockRecordReceiveCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EStockRecordReceiveCQ sq);

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
    protected EStockRecordReceiveCB newMyCB() {
        return new EStockRecordReceiveCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EStockRecordReceiveCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

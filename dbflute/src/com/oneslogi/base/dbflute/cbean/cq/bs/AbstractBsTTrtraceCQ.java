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
 * The abstract condition-query of T_TRTRACE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrtraceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrtraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRTRACE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceId The value of trtraceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrtraceId_Equal(Long trtraceId) {
        doSetTrtraceId_Equal(trtraceId);
    }

    protected void doSetTrtraceId_Equal(Long trtraceId) {
        regTrtraceId(CK_EQ, trtraceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceId The value of trtraceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrtraceId_NotEqual(Long trtraceId) {
        doSetTrtraceId_NotEqual(trtraceId);
    }

    protected void doSetTrtraceId_NotEqual(Long trtraceId) {
        regTrtraceId(CK_NES, trtraceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceId The value of trtraceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrtraceId_GreaterThan(Long trtraceId) {
        regTrtraceId(CK_GT, trtraceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceId The value of trtraceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrtraceId_LessThan(Long trtraceId) {
        regTrtraceId(CK_LT, trtraceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceId The value of trtraceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrtraceId_GreaterEqual(Long trtraceId) {
        regTrtraceId(CK_GE, trtraceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceId The value of trtraceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrtraceId_LessEqual(Long trtraceId) {
        regTrtraceId(CK_LE, trtraceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trtraceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trtraceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrtraceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrtraceId(), "TRTRACE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceIdList The collection of trtraceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrtraceId_InScope(Collection<Long> trtraceIdList) {
        doSetTrtraceId_InScope(trtraceIdList);
    }

    protected void doSetTrtraceId_InScope(Collection<Long> trtraceIdList) {
        regINS(CK_INS, cTL(trtraceIdList), xgetCValueTrtraceId(), "TRTRACE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trtraceIdList The collection of trtraceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrtraceId_NotInScope(Collection<Long> trtraceIdList) {
        doSetTrtraceId_NotInScope(trtraceIdList);
    }

    protected void doSetTrtraceId_NotInScope(Collection<Long> trtraceIdList) {
        regINS(CK_NINS, cTL(trtraceIdList), xgetCValueTrtraceId(), "TRTRACE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrtraceId_IsNull() { regTrtraceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrtraceId_IsNotNull() { regTrtraceId(CK_ISNN, DOBJ); }

    protected void regTrtraceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrtraceId(), "TRTRACE_ID"); }
    protected abstract ConditionValue xgetCValueTrtraceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekey The value of tracekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracekey_Equal(Long tracekey) {
        doSetTracekey_Equal(tracekey);
    }

    protected void doSetTracekey_Equal(Long tracekey) {
        regTracekey(CK_EQ, tracekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekey The value of tracekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracekey_NotEqual(Long tracekey) {
        doSetTracekey_NotEqual(tracekey);
    }

    protected void doSetTracekey_NotEqual(Long tracekey) {
        regTracekey(CK_NES, tracekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekey The value of tracekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracekey_GreaterThan(Long tracekey) {
        regTracekey(CK_GT, tracekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekey The value of tracekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracekey_LessThan(Long tracekey) {
        regTracekey(CK_LT, tracekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekey The value of tracekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracekey_GreaterEqual(Long tracekey) {
        regTracekey(CK_GE, tracekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekey The value of tracekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracekey_LessEqual(Long tracekey) {
        regTracekey(CK_LE, tracekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of tracekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tracekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTracekey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTracekey(), "TRACEKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekeyList The collection of tracekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_InScope(Collection<Long> tracekeyList) {
        doSetTracekey_InScope(tracekeyList);
    }

    protected void doSetTracekey_InScope(Collection<Long> tracekeyList) {
        regINS(CK_INS, cTL(tracekeyList), xgetCValueTracekey(), "TRACEKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @param tracekeyList The collection of tracekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_NotInScope(Collection<Long> tracekeyList) {
        doSetTracekey_NotInScope(tracekeyList);
    }

    protected void doSetTracekey_NotInScope(Collection<Long> tracekeyList) {
        regINS(CK_NINS, cTL(tracekeyList), xgetCValueTracekey(), "TRACEKEY");
    }

    protected void regTracekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracekey(), "TRACEKEY"); }
    protected abstract ConditionValue xgetCValueTracekey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_Equal(String sndrcvdatetime) {
        doSetSndrcvdatetime_Equal(fRES(sndrcvdatetime));
    }

    protected void doSetSndrcvdatetime_Equal(String sndrcvdatetime) {
        regSndrcvdatetime(CK_EQ, sndrcvdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_NotEqual(String sndrcvdatetime) {
        doSetSndrcvdatetime_NotEqual(fRES(sndrcvdatetime));
    }

    protected void doSetSndrcvdatetime_NotEqual(String sndrcvdatetime) {
        regSndrcvdatetime(CK_NES, sndrcvdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_GreaterThan(String sndrcvdatetime) {
        regSndrcvdatetime(CK_GT, fRES(sndrcvdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_LessThan(String sndrcvdatetime) {
        regSndrcvdatetime(CK_LT, fRES(sndrcvdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_GreaterEqual(String sndrcvdatetime) {
        regSndrcvdatetime(CK_GE, fRES(sndrcvdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_LessEqual(String sndrcvdatetime) {
        regSndrcvdatetime(CK_LE, fRES(sndrcvdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetimeList The collection of sndrcvdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_InScope(Collection<String> sndrcvdatetimeList) {
        doSetSndrcvdatetime_InScope(sndrcvdatetimeList);
    }

    protected void doSetSndrcvdatetime_InScope(Collection<String> sndrcvdatetimeList) {
        regINS(CK_INS, cTL(sndrcvdatetimeList), xgetCValueSndrcvdatetime(), "SNDRCVDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetimeList The collection of sndrcvdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_NotInScope(Collection<String> sndrcvdatetimeList) {
        doSetSndrcvdatetime_NotInScope(sndrcvdatetimeList);
    }

    protected void doSetSndrcvdatetime_NotInScope(Collection<String> sndrcvdatetimeList) {
        regINS(CK_NINS, cTL(sndrcvdatetimeList), xgetCValueSndrcvdatetime(), "SNDRCVDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)} <br>
     * <pre>e.g. setSndrcvdatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sndrcvdatetime The value of sndrcvdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSndrcvdatetime_LikeSearch(String sndrcvdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sndrcvdatetime), xgetCValueSndrcvdatetime(), "SNDRCVDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSndrcvdatetime_NotLikeSearch(String sndrcvdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sndrcvdatetime), xgetCValueSndrcvdatetime(), "SNDRCVDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @param sndrcvdatetime The value of sndrcvdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSndrcvdatetime_PrefixSearch(String sndrcvdatetime) {
        setSndrcvdatetime_LikeSearch(sndrcvdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     */
    public void setSndrcvdatetime_IsNull() { regSndrcvdatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     */
    public void setSndrcvdatetime_IsNullOrEmpty() { regSndrcvdatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SNDRCVDATETIME: {varchar(8)}
     */
    public void setSndrcvdatetime_IsNotNull() { regSndrcvdatetime(CK_ISNN, DOBJ); }

    protected void regSndrcvdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSndrcvdatetime(), "SNDRCVDATETIME"); }
    protected abstract ConditionValue xgetCValueSndrcvdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
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
     * WAREHOUSECD: {IX, varchar(30)}
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
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
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
     * WAREHOUSECD: {IX, varchar(30)}
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
     * WAREHOUSECD: {IX, varchar(30)} <br>
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
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_Equal(String factorycd) {
        doSetFactorycd_Equal(fRES(factorycd));
    }

    protected void doSetFactorycd_Equal(String factorycd) {
        regFactorycd(CK_EQ, factorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotEqual(String factorycd) {
        doSetFactorycd_NotEqual(fRES(factorycd));
    }

    protected void doSetFactorycd_NotEqual(String factorycd) {
        regFactorycd(CK_NES, factorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterThan(String factorycd) {
        regFactorycd(CK_GT, fRES(factorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessThan(String factorycd) {
        regFactorycd(CK_LT, fRES(factorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterEqual(String factorycd) {
        regFactorycd(CK_GE, fRES(factorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessEqual(String factorycd) {
        regFactorycd(CK_LE, fRES(factorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycdList The collection of factorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_InScope(Collection<String> factorycdList) {
        doSetFactorycd_InScope(factorycdList);
    }

    protected void doSetFactorycd_InScope(Collection<String> factorycdList) {
        regINS(CK_INS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycdList The collection of factorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotInScope(Collection<String> factorycdList) {
        doSetFactorycd_NotInScope(factorycdList);
    }

    protected void doSetFactorycd_NotInScope(Collection<String> factorycdList) {
        regINS(CK_NINS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)} <br>
     * <pre>e.g. setFactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorycd The value of factorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorycd_LikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorycd_NotLikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_PrefixSearch(String factorycd) {
        setFactorycd_LikeSearch(factorycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     */
    public void setFactorycd_IsNull() { regFactorycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     */
    public void setFactorycd_IsNullOrEmpty() { regFactorycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     */
    public void setFactorycd_IsNotNull() { regFactorycd(CK_ISNN, DOBJ); }

    protected void regFactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorycd(), "FACTORYCD"); }
    protected abstract ConditionValue xgetCValueFactorycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_Equal(String itemcdCase) {
        doSetItemcdCase_Equal(fRES(itemcdCase));
    }

    protected void doSetItemcdCase_Equal(String itemcdCase) {
        regItemcdCase(CK_EQ, itemcdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_NotEqual(String itemcdCase) {
        doSetItemcdCase_NotEqual(fRES(itemcdCase));
    }

    protected void doSetItemcdCase_NotEqual(String itemcdCase) {
        regItemcdCase(CK_NES, itemcdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_GreaterThan(String itemcdCase) {
        regItemcdCase(CK_GT, fRES(itemcdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_LessThan(String itemcdCase) {
        regItemcdCase(CK_LT, fRES(itemcdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_GreaterEqual(String itemcdCase) {
        regItemcdCase(CK_GE, fRES(itemcdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_LessEqual(String itemcdCase) {
        regItemcdCase(CK_LE, fRES(itemcdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCaseList The collection of itemcdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_InScope(Collection<String> itemcdCaseList) {
        doSetItemcdCase_InScope(itemcdCaseList);
    }

    protected void doSetItemcdCase_InScope(Collection<String> itemcdCaseList) {
        regINS(CK_INS, cTL(itemcdCaseList), xgetCValueItemcdCase(), "ITEMCD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCaseList The collection of itemcdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_NotInScope(Collection<String> itemcdCaseList) {
        doSetItemcdCase_NotInScope(itemcdCaseList);
    }

    protected void doSetItemcdCase_NotInScope(Collection<String> itemcdCaseList) {
        regINS(CK_NINS, cTL(itemcdCaseList), xgetCValueItemcdCase(), "ITEMCD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)} <br>
     * <pre>e.g. setItemcdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdCase The value of itemcdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdCase_LikeSearch(String itemcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdCase), xgetCValueItemcdCase(), "ITEMCD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdCase_NotLikeSearch(String itemcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdCase), xgetCValueItemcdCase(), "ITEMCD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_PrefixSearch(String itemcdCase) {
        setItemcdCase_LikeSearch(itemcdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     */
    public void setItemcdCase_IsNull() { regItemcdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     */
    public void setItemcdCase_IsNullOrEmpty() { regItemcdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     */
    public void setItemcdCase_IsNotNull() { regItemcdCase(CK_ISNN, DOBJ); }

    protected void regItemcdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdCase(), "ITEMCD_CASE"); }
    protected abstract ConditionValue xgetCValueItemcdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_Equal(String skucd) {
        doSetSkucd_Equal(fRES(skucd));
    }

    protected void doSetSkucd_Equal(String skucd) {
        regSkucd(CK_EQ, skucd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotEqual(String skucd) {
        doSetSkucd_NotEqual(fRES(skucd));
    }

    protected void doSetSkucd_NotEqual(String skucd) {
        regSkucd(CK_NES, skucd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterThan(String skucd) {
        regSkucd(CK_GT, fRES(skucd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessThan(String skucd) {
        regSkucd(CK_LT, fRES(skucd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterEqual(String skucd) {
        regSkucd(CK_GE, fRES(skucd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessEqual(String skucd) {
        regSkucd(CK_LE, fRES(skucd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucdList The collection of skucd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_InScope(Collection<String> skucdList) {
        doSetSkucd_InScope(skucdList);
    }

    protected void doSetSkucd_InScope(Collection<String> skucdList) {
        regINS(CK_INS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucdList The collection of skucd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotInScope(Collection<String> skucdList) {
        doSetSkucd_NotInScope(skucdList);
    }

    protected void doSetSkucd_NotInScope(Collection<String> skucdList) {
        regINS(CK_NINS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)} <br>
     * <pre>e.g. setSkucd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skucd The value of skucd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkucd_LikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkucd_NotLikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_PrefixSearch(String skucd) {
        setSkucd_LikeSearch(skucd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     */
    public void setSkucd_IsNull() { regSkucd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     */
    public void setSkucd_IsNullOrEmpty() { regSkucd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     */
    public void setSkucd_IsNotNull() { regSkucd(CK_ISNN, DOBJ); }

    protected void regSkucd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkucd(), "SKUCD"); }
    protected abstract ConditionValue xgetCValueSkucd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_Equal(String destinationcd) {
        doSetDestinationcd_Equal(fRES(destinationcd));
    }

    protected void doSetDestinationcd_Equal(String destinationcd) {
        regDestinationcd(CK_EQ, destinationcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotEqual(String destinationcd) {
        doSetDestinationcd_NotEqual(fRES(destinationcd));
    }

    protected void doSetDestinationcd_NotEqual(String destinationcd) {
        regDestinationcd(CK_NES, destinationcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterThan(String destinationcd) {
        regDestinationcd(CK_GT, fRES(destinationcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessThan(String destinationcd) {
        regDestinationcd(CK_LT, fRES(destinationcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterEqual(String destinationcd) {
        regDestinationcd(CK_GE, fRES(destinationcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessEqual(String destinationcd) {
        regDestinationcd(CK_LE, fRES(destinationcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcdList The collection of destinationcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_InScope(Collection<String> destinationcdList) {
        doSetDestinationcd_InScope(destinationcdList);
    }

    protected void doSetDestinationcd_InScope(Collection<String> destinationcdList) {
        regINS(CK_INS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcdList The collection of destinationcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotInScope(Collection<String> destinationcdList) {
        doSetDestinationcd_NotInScope(destinationcdList);
    }

    protected void doSetDestinationcd_NotInScope(Collection<String> destinationcdList) {
        regINS(CK_NINS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)} <br>
     * <pre>e.g. setDestinationcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationcd The value of destinationcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationcd_LikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationcd_NotLikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_PrefixSearch(String destinationcd) {
        setDestinationcd_LikeSearch(destinationcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     */
    public void setDestinationcd_IsNull() { regDestinationcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     */
    public void setDestinationcd_IsNullOrEmpty() { regDestinationcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     */
    public void setDestinationcd_IsNotNull() { regDestinationcd(CK_ISNN, DOBJ); }

    protected void regDestinationcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationcd(), "DESTINATIONCD"); }
    protected abstract ConditionValue xgetCValueDestinationcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_Equal(String manufacturecd) {
        doSetManufacturecd_Equal(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_Equal(String manufacturecd) {
        regManufacturecd(CK_EQ, manufacturecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotEqual(String manufacturecd) {
        doSetManufacturecd_NotEqual(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_NotEqual(String manufacturecd) {
        regManufacturecd(CK_NES, manufacturecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterThan(String manufacturecd) {
        regManufacturecd(CK_GT, fRES(manufacturecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessThan(String manufacturecd) {
        regManufacturecd(CK_LT, fRES(manufacturecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterEqual(String manufacturecd) {
        regManufacturecd(CK_GE, fRES(manufacturecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessEqual(String manufacturecd) {
        regManufacturecd(CK_LE, fRES(manufacturecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecdList The collection of manufacturecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_InScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_InScope(manufacturecdList);
    }

    protected void doSetManufacturecd_InScope(Collection<String> manufacturecdList) {
        regINS(CK_INS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecdList The collection of manufacturecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_NotInScope(manufacturecdList);
    }

    protected void doSetManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        regINS(CK_NINS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)} <br>
     * <pre>e.g. setManufacturecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturecd The value of manufacturecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturecd_LikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturecd_NotLikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_PrefixSearch(String manufacturecd) {
        setManufacturecd_LikeSearch(manufacturecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     */
    public void setManufacturecd_IsNull() { regManufacturecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     */
    public void setManufacturecd_IsNullOrEmpty() { regManufacturecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     */
    public void setManufacturecd_IsNotNull() { regManufacturecd(CK_ISNN, DOBJ); }

    protected void regManufacturecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturecd(), "MANUFACTURECD"); }
    protected abstract ConditionValue xgetCValueManufacturecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_Equal(String orderno) {
        doSetOrderno_Equal(fRES(orderno));
    }

    protected void doSetOrderno_Equal(String orderno) {
        regOrderno(CK_EQ, orderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotEqual(String orderno) {
        doSetOrderno_NotEqual(fRES(orderno));
    }

    protected void doSetOrderno_NotEqual(String orderno) {
        regOrderno(CK_NES, orderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterThan(String orderno) {
        regOrderno(CK_GT, fRES(orderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessThan(String orderno) {
        regOrderno(CK_LT, fRES(orderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterEqual(String orderno) {
        regOrderno(CK_GE, fRES(orderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessEqual(String orderno) {
        regOrderno(CK_LE, fRES(orderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param ordernoList The collection of orderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_InScope(Collection<String> ordernoList) {
        doSetOrderno_InScope(ordernoList);
    }

    protected void doSetOrderno_InScope(Collection<String> ordernoList) {
        regINS(CK_INS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param ordernoList The collection of orderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotInScope(Collection<String> ordernoList) {
        doSetOrderno_NotInScope(ordernoList);
    }

    protected void doSetOrderno_NotInScope(Collection<String> ordernoList) {
        regINS(CK_NINS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)} <br>
     * <pre>e.g. setOrderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderno The value of orderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderno_LikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderno_NotLikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_PrefixSearch(String orderno) {
        setOrderno_LikeSearch(orderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     */
    public void setOrderno_IsNull() { regOrderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     */
    public void setOrderno_IsNullOrEmpty() { regOrderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     */
    public void setOrderno_IsNotNull() { regOrderno(CK_ISNN, DOBJ); }

    protected void regOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderno(), "ORDERNO"); }
    protected abstract ConditionValue xgetCValueOrderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_Equal(String machineno) {
        doSetMachineno_Equal(fRES(machineno));
    }

    protected void doSetMachineno_Equal(String machineno) {
        regMachineno(CK_EQ, machineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotEqual(String machineno) {
        doSetMachineno_NotEqual(fRES(machineno));
    }

    protected void doSetMachineno_NotEqual(String machineno) {
        regMachineno(CK_NES, machineno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterThan(String machineno) {
        regMachineno(CK_GT, fRES(machineno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessThan(String machineno) {
        regMachineno(CK_LT, fRES(machineno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterEqual(String machineno) {
        regMachineno(CK_GE, fRES(machineno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessEqual(String machineno) {
        regMachineno(CK_LE, fRES(machineno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machinenoList The collection of machineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_InScope(Collection<String> machinenoList) {
        doSetMachineno_InScope(machinenoList);
    }

    protected void doSetMachineno_InScope(Collection<String> machinenoList) {
        regINS(CK_INS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machinenoList The collection of machineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotInScope(Collection<String> machinenoList) {
        doSetMachineno_NotInScope(machinenoList);
    }

    protected void doSetMachineno_NotInScope(Collection<String> machinenoList) {
        regINS(CK_NINS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)} <br>
     * <pre>e.g. setMachineno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machineno The value of machineno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachineno_LikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachineno_NotLikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_PrefixSearch(String machineno) {
        setMachineno_LikeSearch(machineno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     */
    public void setMachineno_IsNull() { regMachineno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     */
    public void setMachineno_IsNullOrEmpty() { regMachineno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     */
    public void setMachineno_IsNotNull() { regMachineno(CK_ISNN, DOBJ); }

    protected void regMachineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachineno(), "MACHINENO"); }
    protected abstract ConditionValue xgetCValueMachineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_Equal(String createno) {
        doSetCreateno_Equal(fRES(createno));
    }

    protected void doSetCreateno_Equal(String createno) {
        regCreateno(CK_EQ, createno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotEqual(String createno) {
        doSetCreateno_NotEqual(fRES(createno));
    }

    protected void doSetCreateno_NotEqual(String createno) {
        regCreateno(CK_NES, createno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterThan(String createno) {
        regCreateno(CK_GT, fRES(createno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessThan(String createno) {
        regCreateno(CK_LT, fRES(createno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterEqual(String createno) {
        regCreateno(CK_GE, fRES(createno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessEqual(String createno) {
        regCreateno(CK_LE, fRES(createno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createnoList The collection of createno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_InScope(Collection<String> createnoList) {
        doSetCreateno_InScope(createnoList);
    }

    protected void doSetCreateno_InScope(Collection<String> createnoList) {
        regINS(CK_INS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createnoList The collection of createno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotInScope(Collection<String> createnoList) {
        doSetCreateno_NotInScope(createnoList);
    }

    protected void doSetCreateno_NotInScope(Collection<String> createnoList) {
        regINS(CK_NINS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)} <br>
     * <pre>e.g. setCreateno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createno The value of createno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateno_LikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateno_NotLikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_PrefixSearch(String createno) {
        setCreateno_LikeSearch(createno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     */
    public void setCreateno_IsNull() { regCreateno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     */
    public void setCreateno_IsNullOrEmpty() { regCreateno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     */
    public void setCreateno_IsNotNull() { regCreateno(CK_ISNN, DOBJ); }

    protected void regCreateno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateno(), "CREATENO"); }
    protected abstract ConditionValue xgetCValueCreateno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
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
     * LIMITDATE: {varchar(8)}
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
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterThan(String limitdate) {
        regLimitdate(CK_GT, fRES(limitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessThan(String limitdate) {
        regLimitdate(CK_LT, fRES(limitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterEqual(String limitdate) {
        regLimitdate(CK_GE, fRES(limitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessEqual(String limitdate) {
        regLimitdate(CK_LE, fRES(limitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)}
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
     * LIMITDATE: {varchar(8)}
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
     * LIMITDATE: {varchar(8)} <br>
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
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdate_NotLikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_PrefixSearch(String limitdate) {
        setLimitdate_LikeSearch(limitdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     */
    public void setLimitdate_IsNull() { regLimitdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     */
    public void setLimitdate_IsNullOrEmpty() { regLimitdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     */
    public void setLimitdate_IsNotNull() { regLimitdate(CK_ISNN, DOBJ); }

    protected void regLimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdate(), "LIMITDATE"); }
    protected abstract ConditionValue xgetCValueLimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_Equal(String datetime) {
        doSetDatetime_Equal(fRES(datetime));
    }

    protected void doSetDatetime_Equal(String datetime) {
        regDatetime(CK_EQ, datetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_NotEqual(String datetime) {
        doSetDatetime_NotEqual(fRES(datetime));
    }

    protected void doSetDatetime_NotEqual(String datetime) {
        regDatetime(CK_NES, datetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_GreaterThan(String datetime) {
        regDatetime(CK_GT, fRES(datetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_LessThan(String datetime) {
        regDatetime(CK_LT, fRES(datetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_GreaterEqual(String datetime) {
        regDatetime(CK_GE, fRES(datetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_LessEqual(String datetime) {
        regDatetime(CK_LE, fRES(datetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetimeList The collection of datetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_InScope(Collection<String> datetimeList) {
        doSetDatetime_InScope(datetimeList);
    }

    protected void doSetDatetime_InScope(Collection<String> datetimeList) {
        regINS(CK_INS, cTL(datetimeList), xgetCValueDatetime(), "DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetimeList The collection of datetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_NotInScope(Collection<String> datetimeList) {
        doSetDatetime_NotInScope(datetimeList);
    }

    protected void doSetDatetime_NotInScope(Collection<String> datetimeList) {
        regINS(CK_NINS, cTL(datetimeList), xgetCValueDatetime(), "DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)} <br>
     * <pre>e.g. setDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param datetime The value of datetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDatetime_LikeSearch(String datetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(datetime), xgetCValueDatetime(), "DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDatetime_NotLikeSearch(String datetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(datetime), xgetCValueDatetime(), "DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_PrefixSearch(String datetime) {
        setDatetime_LikeSearch(datetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     */
    public void setDatetime_IsNull() { regDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     */
    public void setDatetime_IsNullOrEmpty() { regDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     */
    public void setDatetime_IsNotNull() { regDatetime(CK_ISNN, DOBJ); }

    protected void regDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDatetime(), "DATETIME"); }
    protected abstract ConditionValue xgetCValueDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_Equal(String distributioncd) {
        doSetDistributioncd_Equal(fRES(distributioncd));
    }

    protected void doSetDistributioncd_Equal(String distributioncd) {
        regDistributioncd(CK_EQ, distributioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotEqual(String distributioncd) {
        doSetDistributioncd_NotEqual(fRES(distributioncd));
    }

    protected void doSetDistributioncd_NotEqual(String distributioncd) {
        regDistributioncd(CK_NES, distributioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterThan(String distributioncd) {
        regDistributioncd(CK_GT, fRES(distributioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessThan(String distributioncd) {
        regDistributioncd(CK_LT, fRES(distributioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterEqual(String distributioncd) {
        regDistributioncd(CK_GE, fRES(distributioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessEqual(String distributioncd) {
        regDistributioncd(CK_LE, fRES(distributioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncdList The collection of distributioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_InScope(Collection<String> distributioncdList) {
        doSetDistributioncd_InScope(distributioncdList);
    }

    protected void doSetDistributioncd_InScope(Collection<String> distributioncdList) {
        regINS(CK_INS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncdList The collection of distributioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotInScope(Collection<String> distributioncdList) {
        doSetDistributioncd_NotInScope(distributioncdList);
    }

    protected void doSetDistributioncd_NotInScope(Collection<String> distributioncdList) {
        regINS(CK_NINS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)} <br>
     * <pre>e.g. setDistributioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distributioncd The value of distributioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistributioncd_LikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistributioncd_NotLikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_PrefixSearch(String distributioncd) {
        setDistributioncd_LikeSearch(distributioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     */
    public void setDistributioncd_IsNull() { regDistributioncd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     */
    public void setDistributioncd_IsNotNull() { regDistributioncd(CK_ISNN, DOBJ); }

    protected void regDistributioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistributioncd(), "DISTRIBUTIONCD"); }
    protected abstract ConditionValue xgetCValueDistributioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_Equal(String transportcd) {
        doSetTransportcd_Equal(fRES(transportcd));
    }

    protected void doSetTransportcd_Equal(String transportcd) {
        regTransportcd(CK_EQ, transportcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotEqual(String transportcd) {
        doSetTransportcd_NotEqual(fRES(transportcd));
    }

    protected void doSetTransportcd_NotEqual(String transportcd) {
        regTransportcd(CK_NES, transportcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterThan(String transportcd) {
        regTransportcd(CK_GT, fRES(transportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessThan(String transportcd) {
        regTransportcd(CK_LT, fRES(transportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterEqual(String transportcd) {
        regTransportcd(CK_GE, fRES(transportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessEqual(String transportcd) {
        regTransportcd(CK_LE, fRES(transportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcdList The collection of transportcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_InScope(Collection<String> transportcdList) {
        doSetTransportcd_InScope(transportcdList);
    }

    protected void doSetTransportcd_InScope(Collection<String> transportcdList) {
        regINS(CK_INS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcdList The collection of transportcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotInScope(Collection<String> transportcdList) {
        doSetTransportcd_NotInScope(transportcdList);
    }

    protected void doSetTransportcd_NotInScope(Collection<String> transportcdList) {
        regINS(CK_NINS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)} <br>
     * <pre>e.g. setTransportcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportcd The value of transportcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportcd_LikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportcd_NotLikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_PrefixSearch(String transportcd) {
        setTransportcd_LikeSearch(transportcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     */
    public void setTransportcd_IsNull() { regTransportcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     */
    public void setTransportcd_IsNullOrEmpty() { regTransportcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     */
    public void setTransportcd_IsNotNull() { regTransportcd(CK_ISNN, DOBJ); }

    protected void regTransportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportcd(), "TRANSPORTCD"); }
    protected abstract ConditionValue xgetCValueTransportcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_Equal(String palletid) {
        doSetPalletid_Equal(fRES(palletid));
    }

    protected void doSetPalletid_Equal(String palletid) {
        regPalletid(CK_EQ, palletid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotEqual(String palletid) {
        doSetPalletid_NotEqual(fRES(palletid));
    }

    protected void doSetPalletid_NotEqual(String palletid) {
        regPalletid(CK_NES, palletid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterThan(String palletid) {
        regPalletid(CK_GT, fRES(palletid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessThan(String palletid) {
        regPalletid(CK_LT, fRES(palletid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterEqual(String palletid) {
        regPalletid(CK_GE, fRES(palletid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessEqual(String palletid) {
        regPalletid(CK_LE, fRES(palletid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletidList The collection of palletid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_InScope(Collection<String> palletidList) {
        doSetPalletid_InScope(palletidList);
    }

    protected void doSetPalletid_InScope(Collection<String> palletidList) {
        regINS(CK_INS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletidList The collection of palletid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotInScope(Collection<String> palletidList) {
        doSetPalletid_NotInScope(palletidList);
    }

    protected void doSetPalletid_NotInScope(Collection<String> palletidList) {
        regINS(CK_NINS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)} <br>
     * <pre>e.g. setPalletid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletid The value of palletid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletid_LikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletid_NotLikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_PrefixSearch(String palletid) {
        setPalletid_LikeSearch(palletid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     */
    public void setPalletid_IsNull() { regPalletid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     */
    public void setPalletid_IsNullOrEmpty() { regPalletid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     */
    public void setPalletid_IsNotNull() { regPalletid(CK_ISNN, DOBJ); }

    protected void regPalletid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletid(), "PALLETID"); }
    protected abstract ConditionValue xgetCValuePalletid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_Equal(Long initnum) {
        doSetInitnum_Equal(initnum);
    }

    protected void doSetInitnum_Equal(Long initnum) {
        regInitnum(CK_EQ, initnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_NotEqual(Long initnum) {
        doSetInitnum_NotEqual(initnum);
    }

    protected void doSetInitnum_NotEqual(Long initnum) {
        regInitnum(CK_NES, initnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterThan(Long initnum) {
        regInitnum(CK_GT, initnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessThan(Long initnum) {
        regInitnum(CK_LT, initnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterEqual(Long initnum) {
        regInitnum(CK_GE, initnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessEqual(Long initnum) {
        regInitnum(CK_LE, initnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param minNumber The min number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInitnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInitnum(), "INITNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnumList The collection of initnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_InScope(Collection<Long> initnumList) {
        doSetInitnum_InScope(initnumList);
    }

    protected void doSetInitnum_InScope(Collection<Long> initnumList) {
        regINS(CK_INS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnumList The collection of initnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotInScope(Collection<Long> initnumList) {
        doSetInitnum_NotInScope(initnumList);
    }

    protected void doSetInitnum_NotInScope(Collection<Long> initnumList) {
        regINS(CK_NINS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     */
    public void setInitnum_IsNull() { regInitnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     */
    public void setInitnum_IsNotNull() { regInitnum(CK_ISNN, DOBJ); }

    protected void regInitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitnum(), "INITNUM"); }
    protected abstract ConditionValue xgetCValueInitnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(String createdatetime) {
        doSetCreatedatetime_Equal(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_Equal(String createdatetime) {
        regCreatedatetime(CK_EQ, createdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotEqual(String createdatetime) {
        doSetCreatedatetime_NotEqual(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_NotEqual(String createdatetime) {
        regCreatedatetime(CK_NES, createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(String createdatetime) {
        regCreatedatetime(CK_GT, fRES(createdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(String createdatetime) {
        regCreatedatetime(CK_LT, fRES(createdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(String createdatetime) {
        regCreatedatetime(CK_GE, fRES(createdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(String createdatetime) {
        regCreatedatetime(CK_LE, fRES(createdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetimeList The collection of createdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_InScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_InScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_InScope(Collection<String> createdatetimeList) {
        regINS(CK_INS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetimeList The collection of createdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_NotInScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        regINS(CK_NINS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)} <br>
     * <pre>e.g. setCreatedatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdatetime The value of createdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreatedatetime_LikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreatedatetime_NotLikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_PrefixSearch(String createdatetime) {
        setCreatedatetime_LikeSearch(createdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     */
    public void setCreatedatetime_IsNull() { regCreatedatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     */
    public void setCreatedatetime_IsNullOrEmpty() { regCreatedatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     */
    public void setCreatedatetime_IsNotNull() { regCreatedatetime(CK_ISNN, DOBJ); }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_Equal(String assortdatetime) {
        doSetAssortdatetime_Equal(fRES(assortdatetime));
    }

    protected void doSetAssortdatetime_Equal(String assortdatetime) {
        regAssortdatetime(CK_EQ, assortdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_NotEqual(String assortdatetime) {
        doSetAssortdatetime_NotEqual(fRES(assortdatetime));
    }

    protected void doSetAssortdatetime_NotEqual(String assortdatetime) {
        regAssortdatetime(CK_NES, assortdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_GreaterThan(String assortdatetime) {
        regAssortdatetime(CK_GT, fRES(assortdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_LessThan(String assortdatetime) {
        regAssortdatetime(CK_LT, fRES(assortdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_GreaterEqual(String assortdatetime) {
        regAssortdatetime(CK_GE, fRES(assortdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_LessEqual(String assortdatetime) {
        regAssortdatetime(CK_LE, fRES(assortdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetimeList The collection of assortdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_InScope(Collection<String> assortdatetimeList) {
        doSetAssortdatetime_InScope(assortdatetimeList);
    }

    protected void doSetAssortdatetime_InScope(Collection<String> assortdatetimeList) {
        regINS(CK_INS, cTL(assortdatetimeList), xgetCValueAssortdatetime(), "ASSORTDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetimeList The collection of assortdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_NotInScope(Collection<String> assortdatetimeList) {
        doSetAssortdatetime_NotInScope(assortdatetimeList);
    }

    protected void doSetAssortdatetime_NotInScope(Collection<String> assortdatetimeList) {
        regINS(CK_NINS, cTL(assortdatetimeList), xgetCValueAssortdatetime(), "ASSORTDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(8)} <br>
     * <pre>e.g. setAssortdatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortdatetime The value of assortdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortdatetime_LikeSearch(String assortdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortdatetime), xgetCValueAssortdatetime(), "ASSORTDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortdatetime_NotLikeSearch(String assortdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortdatetime), xgetCValueAssortdatetime(), "ASSORTDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @param assortdatetime The value of assortdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_PrefixSearch(String assortdatetime) {
        setAssortdatetime_LikeSearch(assortdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     */
    public void setAssortdatetime_IsNull() { regAssortdatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     */
    public void setAssortdatetime_IsNullOrEmpty() { regAssortdatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(8)}
     */
    public void setAssortdatetime_IsNotNull() { regAssortdatetime(CK_ISNN, DOBJ); }

    protected void regAssortdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdatetime(), "ASSORTDATETIME"); }
    protected abstract ConditionValue xgetCValueAssortdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_Equal(String tracetype) {
        doSetTracetype_Equal(fRES(tracetype));
    }

    protected void doSetTracetype_Equal(String tracetype) {
        regTracetype(CK_EQ, tracetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotEqual(String tracetype) {
        doSetTracetype_NotEqual(fRES(tracetype));
    }

    protected void doSetTracetype_NotEqual(String tracetype) {
        regTracetype(CK_NES, tracetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterThan(String tracetype) {
        regTracetype(CK_GT, fRES(tracetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessThan(String tracetype) {
        regTracetype(CK_LT, fRES(tracetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterEqual(String tracetype) {
        regTracetype(CK_GE, fRES(tracetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessEqual(String tracetype) {
        regTracetype(CK_LE, fRES(tracetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetypeList The collection of tracetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_InScope(Collection<String> tracetypeList) {
        doSetTracetype_InScope(tracetypeList);
    }

    protected void doSetTracetype_InScope(Collection<String> tracetypeList) {
        regINS(CK_INS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetypeList The collection of tracetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotInScope(Collection<String> tracetypeList) {
        doSetTracetype_NotInScope(tracetypeList);
    }

    protected void doSetTracetype_NotInScope(Collection<String> tracetypeList) {
        regINS(CK_NINS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)} <br>
     * <pre>e.g. setTracetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetype The value of tracetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetype_LikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetype_NotLikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_PrefixSearch(String tracetype) {
        setTracetype_LikeSearch(tracetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNull() { regTracetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNullOrEmpty() { regTracetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNotNull() { regTracetype(CK_ISNN, DOBJ); }

    protected void regTracetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetype(), "TRACETYPE"); }
    protected abstract ConditionValue xgetCValueTracetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_Equal(String lineblock) {
        doSetLineblock_Equal(fRES(lineblock));
    }

    protected void doSetLineblock_Equal(String lineblock) {
        regLineblock(CK_EQ, lineblock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_NotEqual(String lineblock) {
        doSetLineblock_NotEqual(fRES(lineblock));
    }

    protected void doSetLineblock_NotEqual(String lineblock) {
        regLineblock(CK_NES, lineblock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_GreaterThan(String lineblock) {
        regLineblock(CK_GT, fRES(lineblock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_LessThan(String lineblock) {
        regLineblock(CK_LT, fRES(lineblock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_GreaterEqual(String lineblock) {
        regLineblock(CK_GE, fRES(lineblock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_LessEqual(String lineblock) {
        regLineblock(CK_LE, fRES(lineblock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblockList The collection of lineblock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_InScope(Collection<String> lineblockList) {
        doSetLineblock_InScope(lineblockList);
    }

    protected void doSetLineblock_InScope(Collection<String> lineblockList) {
        regINS(CK_INS, cTL(lineblockList), xgetCValueLineblock(), "LINEBLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblockList The collection of lineblock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_NotInScope(Collection<String> lineblockList) {
        doSetLineblock_NotInScope(lineblockList);
    }

    protected void doSetLineblock_NotInScope(Collection<String> lineblockList) {
        regINS(CK_NINS, cTL(lineblockList), xgetCValueLineblock(), "LINEBLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(30)} <br>
     * <pre>e.g. setLineblock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineblock The value of lineblock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineblock_LikeSearch(String lineblock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineblock), xgetCValueLineblock(), "LINEBLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineblock_NotLikeSearch(String lineblock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineblock), xgetCValueLineblock(), "LINEBLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     * @param lineblock The value of lineblock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_PrefixSearch(String lineblock) {
        setLineblock_LikeSearch(lineblock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     */
    public void setLineblock_IsNull() { regLineblock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     */
    public void setLineblock_IsNullOrEmpty() { regLineblock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(30)}
     */
    public void setLineblock_IsNotNull() { regLineblock(CK_ISNN, DOBJ); }

    protected void regLineblock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineblock(), "LINEBLOCK"); }
    protected abstract ConditionValue xgetCValueLineblock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_Equal(String assortedunit) {
        doSetAssortedunit_Equal(fRES(assortedunit));
    }

    protected void doSetAssortedunit_Equal(String assortedunit) {
        regAssortedunit(CK_EQ, assortedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotEqual(String assortedunit) {
        doSetAssortedunit_NotEqual(fRES(assortedunit));
    }

    protected void doSetAssortedunit_NotEqual(String assortedunit) {
        regAssortedunit(CK_NES, assortedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterThan(String assortedunit) {
        regAssortedunit(CK_GT, fRES(assortedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessThan(String assortedunit) {
        regAssortedunit(CK_LT, fRES(assortedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterEqual(String assortedunit) {
        regAssortedunit(CK_GE, fRES(assortedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessEqual(String assortedunit) {
        regAssortedunit(CK_LE, fRES(assortedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_InScope(Collection<String> assortedunitList) {
        doSetAssortedunit_InScope(assortedunitList);
    }

    protected void doSetAssortedunit_InScope(Collection<String> assortedunitList) {
        regINS(CK_INS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotInScope(Collection<String> assortedunitList) {
        doSetAssortedunit_NotInScope(assortedunitList);
    }

    protected void doSetAssortedunit_NotInScope(Collection<String> assortedunitList) {
        regINS(CK_NINS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)} <br>
     * <pre>e.g. setAssortedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedunit The value of assortedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedunit_LikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedunit_NotLikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_PrefixSearch(String assortedunit) {
        setAssortedunit_LikeSearch(assortedunit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNull() { regAssortedunit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNullOrEmpty() { regAssortedunit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNotNull() { regAssortedunit(CK_ISNN, DOBJ); }

    protected void regAssortedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedunit(), "ASSORTEDUNIT"); }
    protected abstract ConditionValue xgetCValueAssortedunit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_Equal(Long assortedindex) {
        doSetAssortedindex_Equal(assortedindex);
    }

    protected void doSetAssortedindex_Equal(Long assortedindex) {
        regAssortedindex(CK_EQ, assortedindex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_NotEqual(Long assortedindex) {
        doSetAssortedindex_NotEqual(assortedindex);
    }

    protected void doSetAssortedindex_NotEqual(Long assortedindex) {
        regAssortedindex(CK_NES, assortedindex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterThan(Long assortedindex) {
        regAssortedindex(CK_GT, assortedindex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_LessThan(Long assortedindex) {
        regAssortedindex(CK_LT, assortedindex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterEqual(Long assortedindex) {
        regAssortedindex(CK_GE, assortedindex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_LessEqual(Long assortedindex) {
        regAssortedindex(CK_LE, assortedindex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param minNumber The min number of assortedindex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortedindex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortedindex_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortedindex(), "ASSORTEDINDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindexList The collection of assortedindex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_InScope(Collection<Long> assortedindexList) {
        doSetAssortedindex_InScope(assortedindexList);
    }

    protected void doSetAssortedindex_InScope(Collection<Long> assortedindexList) {
        regINS(CK_INS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindexList The collection of assortedindex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotInScope(Collection<Long> assortedindexList) {
        doSetAssortedindex_NotInScope(assortedindexList);
    }

    protected void doSetAssortedindex_NotInScope(Collection<Long> assortedindexList) {
        regINS(CK_NINS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     */
    public void setAssortedindex_IsNull() { regAssortedindex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     */
    public void setAssortedindex_IsNotNull() { regAssortedindex(CK_ISNN, DOBJ); }

    protected void regAssortedindex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedindex(), "ASSORTEDINDEX"); }
    protected abstract ConditionValue xgetCValueAssortedindex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_Equal(String operationcode) {
        doSetOperationcode_Equal(fRES(operationcode));
    }

    protected void doSetOperationcode_Equal(String operationcode) {
        regOperationcode(CK_EQ, operationcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_NotEqual(String operationcode) {
        doSetOperationcode_NotEqual(fRES(operationcode));
    }

    protected void doSetOperationcode_NotEqual(String operationcode) {
        regOperationcode(CK_NES, operationcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_GreaterThan(String operationcode) {
        regOperationcode(CK_GT, fRES(operationcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_LessThan(String operationcode) {
        regOperationcode(CK_LT, fRES(operationcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_GreaterEqual(String operationcode) {
        regOperationcode(CK_GE, fRES(operationcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_LessEqual(String operationcode) {
        regOperationcode(CK_LE, fRES(operationcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcodeList The collection of operationcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_InScope(Collection<String> operationcodeList) {
        doSetOperationcode_InScope(operationcodeList);
    }

    protected void doSetOperationcode_InScope(Collection<String> operationcodeList) {
        regINS(CK_INS, cTL(operationcodeList), xgetCValueOperationcode(), "OPERATIONCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcodeList The collection of operationcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_NotInScope(Collection<String> operationcodeList) {
        doSetOperationcode_NotInScope(operationcodeList);
    }

    protected void doSetOperationcode_NotInScope(Collection<String> operationcodeList) {
        regINS(CK_NINS, cTL(operationcodeList), xgetCValueOperationcode(), "OPERATIONCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {char(1)} <br>
     * <pre>e.g. setOperationcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operationcode The value of operationcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperationcode_LikeSearch(String operationcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operationcode), xgetCValueOperationcode(), "OPERATIONCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperationcode_NotLikeSearch(String operationcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operationcode), xgetCValueOperationcode(), "OPERATIONCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {char(1)}
     * @param operationcode The value of operationcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_PrefixSearch(String operationcode) {
        setOperationcode_LikeSearch(operationcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     */
    public void setOperationcode_IsNull() { regOperationcode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {char(1)}
     */
    public void setOperationcode_IsNotNull() { regOperationcode(CK_ISNN, DOBJ); }

    protected void regOperationcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationcode(), "OPERATIONCODE"); }
    protected abstract ConditionValue xgetCValueOperationcode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_Equal(Long caseinnum) {
        doSetCaseinnum_Equal(caseinnum);
    }

    protected void doSetCaseinnum_Equal(Long caseinnum) {
        regCaseinnum(CK_EQ, caseinnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_NotEqual(Long caseinnum) {
        doSetCaseinnum_NotEqual(caseinnum);
    }

    protected void doSetCaseinnum_NotEqual(Long caseinnum) {
        regCaseinnum(CK_NES, caseinnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterThan(Long caseinnum) {
        regCaseinnum(CK_GT, caseinnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_LessThan(Long caseinnum) {
        regCaseinnum(CK_LT, caseinnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterEqual(Long caseinnum) {
        regCaseinnum(CK_GE, caseinnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_LessEqual(Long caseinnum) {
        regCaseinnum(CK_LE, caseinnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param minNumber The min number of caseinnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinnum(), "CASEINNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnumList The collection of caseinnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_InScope(Collection<Long> caseinnumList) {
        doSetCaseinnum_InScope(caseinnumList);
    }

    protected void doSetCaseinnum_InScope(Collection<Long> caseinnumList) {
        regINS(CK_INS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnumList The collection of caseinnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_NotInScope(Collection<Long> caseinnumList) {
        doSetCaseinnum_NotInScope(caseinnumList);
    }

    protected void doSetCaseinnum_NotInScope(Collection<Long> caseinnumList) {
        regINS(CK_NINS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     */
    public void setCaseinnum_IsNull() { regCaseinnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     */
    public void setCaseinnum_IsNotNull() { regCaseinnum(CK_ISNN, DOBJ); }

    protected void regCaseinnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinnum(), "CASEINNUM"); }
    protected abstract ConditionValue xgetCValueCaseinnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_Equal(Long assortnum) {
        doSetAssortnum_Equal(assortnum);
    }

    protected void doSetAssortnum_Equal(Long assortnum) {
        regAssortnum(CK_EQ, assortnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_NotEqual(Long assortnum) {
        doSetAssortnum_NotEqual(assortnum);
    }

    protected void doSetAssortnum_NotEqual(Long assortnum) {
        regAssortnum(CK_NES, assortnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterThan(Long assortnum) {
        regAssortnum(CK_GT, assortnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_LessThan(Long assortnum) {
        regAssortnum(CK_LT, assortnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterEqual(Long assortnum) {
        regAssortnum(CK_GE, assortnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_LessEqual(Long assortnum) {
        regAssortnum(CK_LE, assortnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param minNumber The min number of assortnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortnum(), "ASSORTNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnumList The collection of assortnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_InScope(Collection<Long> assortnumList) {
        doSetAssortnum_InScope(assortnumList);
    }

    protected void doSetAssortnum_InScope(Collection<Long> assortnumList) {
        regINS(CK_INS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnumList The collection of assortnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotInScope(Collection<Long> assortnumList) {
        doSetAssortnum_NotInScope(assortnumList);
    }

    protected void doSetAssortnum_NotInScope(Collection<Long> assortnumList) {
        regINS(CK_NINS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     */
    public void setAssortnum_IsNull() { regAssortnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     */
    public void setAssortnum_IsNotNull() { regAssortnum(CK_ISNN, DOBJ); }

    protected void regAssortnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortnum(), "ASSORTNUM"); }
    protected abstract ConditionValue xgetCValueAssortnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_Equal(Long assortdifnum) {
        doSetAssortdifnum_Equal(assortdifnum);
    }

    protected void doSetAssortdifnum_Equal(Long assortdifnum) {
        regAssortdifnum(CK_EQ, assortdifnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotEqual(Long assortdifnum) {
        doSetAssortdifnum_NotEqual(assortdifnum);
    }

    protected void doSetAssortdifnum_NotEqual(Long assortdifnum) {
        regAssortdifnum(CK_NES, assortdifnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterThan(Long assortdifnum) {
        regAssortdifnum(CK_GT, assortdifnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessThan(Long assortdifnum) {
        regAssortdifnum(CK_LT, assortdifnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterEqual(Long assortdifnum) {
        regAssortdifnum(CK_GE, assortdifnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessEqual(Long assortdifnum) {
        regAssortdifnum(CK_LE, assortdifnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param minNumber The min number of assortdifnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortdifnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortdifnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortdifnum(), "ASSORTDIFNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnumList The collection of assortdifnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_InScope(Collection<Long> assortdifnumList) {
        doSetAssortdifnum_InScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_InScope(Collection<Long> assortdifnumList) {
        regINS(CK_INS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnumList The collection of assortdifnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotInScope(Collection<Long> assortdifnumList) {
        doSetAssortdifnum_NotInScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_NotInScope(Collection<Long> assortdifnumList) {
        regINS(CK_NINS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     */
    public void setAssortdifnum_IsNull() { regAssortdifnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     */
    public void setAssortdifnum_IsNotNull() { regAssortdifnum(CK_ISNN, DOBJ); }

    protected void regAssortdifnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdifnum(), "ASSORTDIFNUM"); }
    protected abstract ConditionValue xgetCValueAssortdifnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_Equal(String directioncd) {
        doSetDirectioncd_Equal(fRES(directioncd));
    }

    protected void doSetDirectioncd_Equal(String directioncd) {
        regDirectioncd(CK_EQ, directioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotEqual(String directioncd) {
        doSetDirectioncd_NotEqual(fRES(directioncd));
    }

    protected void doSetDirectioncd_NotEqual(String directioncd) {
        regDirectioncd(CK_NES, directioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterThan(String directioncd) {
        regDirectioncd(CK_GT, fRES(directioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessThan(String directioncd) {
        regDirectioncd(CK_LT, fRES(directioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterEqual(String directioncd) {
        regDirectioncd(CK_GE, fRES(directioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessEqual(String directioncd) {
        regDirectioncd(CK_LE, fRES(directioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncdList The collection of directioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_InScope(Collection<String> directioncdList) {
        doSetDirectioncd_InScope(directioncdList);
    }

    protected void doSetDirectioncd_InScope(Collection<String> directioncdList) {
        regINS(CK_INS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncdList The collection of directioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotInScope(Collection<String> directioncdList) {
        doSetDirectioncd_NotInScope(directioncdList);
    }

    protected void doSetDirectioncd_NotInScope(Collection<String> directioncdList) {
        regINS(CK_NINS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)} <br>
     * <pre>e.g. setDirectioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directioncd The value of directioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectioncd_LikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectioncd_NotLikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_PrefixSearch(String directioncd) {
        setDirectioncd_LikeSearch(directioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNull() { regDirectioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNullOrEmpty() { regDirectioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNotNull() { regDirectioncd(CK_ISNN, DOBJ); }

    protected void regDirectioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectioncd(), "DIRECTIONCD"); }
    protected abstract ConditionValue xgetCValueDirectioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_Equal(String pistontype) {
        doSetPistontype_Equal(fRES(pistontype));
    }

    protected void doSetPistontype_Equal(String pistontype) {
        regPistontype(CK_EQ, pistontype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotEqual(String pistontype) {
        doSetPistontype_NotEqual(fRES(pistontype));
    }

    protected void doSetPistontype_NotEqual(String pistontype) {
        regPistontype(CK_NES, pistontype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterThan(String pistontype) {
        regPistontype(CK_GT, fRES(pistontype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessThan(String pistontype) {
        regPistontype(CK_LT, fRES(pistontype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterEqual(String pistontype) {
        regPistontype(CK_GE, fRES(pistontype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessEqual(String pistontype) {
        regPistontype(CK_LE, fRES(pistontype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontypeList The collection of pistontype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_InScope(Collection<String> pistontypeList) {
        doSetPistontype_InScope(pistontypeList);
    }

    protected void doSetPistontype_InScope(Collection<String> pistontypeList) {
        regINS(CK_INS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontypeList The collection of pistontype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotInScope(Collection<String> pistontypeList) {
        doSetPistontype_NotInScope(pistontypeList);
    }

    protected void doSetPistontype_NotInScope(Collection<String> pistontypeList) {
        regINS(CK_NINS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)} <br>
     * <pre>e.g. setPistontype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistontype The value of pistontype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistontype_LikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistontype_NotLikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_PrefixSearch(String pistontype) {
        setPistontype_LikeSearch(pistontype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     */
    public void setPistontype_IsNull() { regPistontype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     */
    public void setPistontype_IsNotNull() { regPistontype(CK_ISNN, DOBJ); }

    protected void regPistontype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistontype(), "PISTONTYPE"); }
    protected abstract ConditionValue xgetCValuePistontype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_Equal(String customercd) {
        doSetCustomercd_Equal(fRES(customercd));
    }

    protected void doSetCustomercd_Equal(String customercd) {
        regCustomercd(CK_EQ, customercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotEqual(String customercd) {
        doSetCustomercd_NotEqual(fRES(customercd));
    }

    protected void doSetCustomercd_NotEqual(String customercd) {
        regCustomercd(CK_NES, customercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterThan(String customercd) {
        regCustomercd(CK_GT, fRES(customercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessThan(String customercd) {
        regCustomercd(CK_LT, fRES(customercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterEqual(String customercd) {
        regCustomercd(CK_GE, fRES(customercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessEqual(String customercd) {
        regCustomercd(CK_LE, fRES(customercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercdList The collection of customercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_InScope(Collection<String> customercdList) {
        doSetCustomercd_InScope(customercdList);
    }

    protected void doSetCustomercd_InScope(Collection<String> customercdList) {
        regINS(CK_INS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercdList The collection of customercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotInScope(Collection<String> customercdList) {
        doSetCustomercd_NotInScope(customercdList);
    }

    protected void doSetCustomercd_NotInScope(Collection<String> customercdList) {
        regINS(CK_NINS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)} <br>
     * <pre>e.g. setCustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customercd The value of customercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomercd_LikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomercd_NotLikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_PrefixSearch(String customercd) {
        setCustomercd_LikeSearch(customercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNull() { regCustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNullOrEmpty() { regCustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNotNull() { regCustomercd(CK_ISNN, DOBJ); }

    protected void regCustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomercd(), "CUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueCustomercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_Equal(Long directionnum) {
        doSetDirectionnum_Equal(directionnum);
    }

    protected void doSetDirectionnum_Equal(Long directionnum) {
        regDirectionnum(CK_EQ, directionnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_NotEqual(Long directionnum) {
        doSetDirectionnum_NotEqual(directionnum);
    }

    protected void doSetDirectionnum_NotEqual(Long directionnum) {
        regDirectionnum(CK_NES, directionnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterThan(Long directionnum) {
        regDirectionnum(CK_GT, directionnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessThan(Long directionnum) {
        regDirectionnum(CK_LT, directionnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterEqual(Long directionnum) {
        regDirectionnum(CK_GE, directionnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessEqual(Long directionnum) {
        regDirectionnum(CK_LE, directionnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param minNumber The min number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDirectionnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectionnum(), "DIRECTIONNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_InScope(Collection<Long> directionnumList) {
        doSetDirectionnum_InScope(directionnumList);
    }

    protected void doSetDirectionnum_InScope(Collection<Long> directionnumList) {
        regINS(CK_INS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotInScope(Collection<Long> directionnumList) {
        doSetDirectionnum_NotInScope(directionnumList);
    }

    protected void doSetDirectionnum_NotInScope(Collection<Long> directionnumList) {
        regINS(CK_NINS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNull() { regDirectionnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNotNull() { regDirectionnum(CK_ISNN, DOBJ); }

    protected void regDirectionnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionnum(), "DIRECTIONNUM"); }
    protected abstract ConditionValue xgetCValueDirectionnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_Equal(String distwarehousecd) {
        doSetDistwarehousecd_Equal(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_Equal(String distwarehousecd) {
        regDistwarehousecd(CK_EQ, distwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotEqual(String distwarehousecd) {
        doSetDistwarehousecd_NotEqual(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_NotEqual(String distwarehousecd) {
        regDistwarehousecd(CK_NES, distwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterThan(String distwarehousecd) {
        regDistwarehousecd(CK_GT, fRES(distwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessThan(String distwarehousecd) {
        regDistwarehousecd(CK_LT, fRES(distwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterEqual(String distwarehousecd) {
        regDistwarehousecd(CK_GE, fRES(distwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessEqual(String distwarehousecd) {
        regDistwarehousecd(CK_LE, fRES(distwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecdList The collection of distwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_InScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        regINS(CK_INS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecdList The collection of distwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_NotInScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        regINS(CK_NINS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setDistwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distwarehousecd The value of distwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistwarehousecd_LikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistwarehousecd_NotLikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_PrefixSearch(String distwarehousecd) {
        setDistwarehousecd_LikeSearch(distwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNull() { regDistwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNullOrEmpty() { regDistwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNotNull() { regDistwarehousecd(CK_ISNN, DOBJ); }

    protected void regDistwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistwarehousecd(), "DISTWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueDistwarehousecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
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
     * RCVKEY: {decimal(16, 6)}
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
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

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
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_Equal(String itemcdIn) {
        doSetItemcdIn_Equal(fRES(itemcdIn));
    }

    protected void doSetItemcdIn_Equal(String itemcdIn) {
        regItemcdIn(CK_EQ, itemcdIn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_NotEqual(String itemcdIn) {
        doSetItemcdIn_NotEqual(fRES(itemcdIn));
    }

    protected void doSetItemcdIn_NotEqual(String itemcdIn) {
        regItemcdIn(CK_NES, itemcdIn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_GreaterThan(String itemcdIn) {
        regItemcdIn(CK_GT, fRES(itemcdIn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_LessThan(String itemcdIn) {
        regItemcdIn(CK_LT, fRES(itemcdIn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_GreaterEqual(String itemcdIn) {
        regItemcdIn(CK_GE, fRES(itemcdIn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_LessEqual(String itemcdIn) {
        regItemcdIn(CK_LE, fRES(itemcdIn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdInList The collection of itemcdIn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_InScope(Collection<String> itemcdInList) {
        doSetItemcdIn_InScope(itemcdInList);
    }

    protected void doSetItemcdIn_InScope(Collection<String> itemcdInList) {
        regINS(CK_INS, cTL(itemcdInList), xgetCValueItemcdIn(), "ITEMCD_IN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdInList The collection of itemcdIn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_NotInScope(Collection<String> itemcdInList) {
        doSetItemcdIn_NotInScope(itemcdInList);
    }

    protected void doSetItemcdIn_NotInScope(Collection<String> itemcdInList) {
        regINS(CK_NINS, cTL(itemcdInList), xgetCValueItemcdIn(), "ITEMCD_IN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)} <br>
     * <pre>e.g. setItemcdIn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdIn The value of itemcdIn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdIn_LikeSearch(String itemcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdIn), xgetCValueItemcdIn(), "ITEMCD_IN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdIn_NotLikeSearch(String itemcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdIn), xgetCValueItemcdIn(), "ITEMCD_IN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_PrefixSearch(String itemcdIn) {
        setItemcdIn_LikeSearch(itemcdIn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     */
    public void setItemcdIn_IsNull() { regItemcdIn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     */
    public void setItemcdIn_IsNullOrEmpty() { regItemcdIn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     */
    public void setItemcdIn_IsNotNull() { regItemcdIn(CK_ISNN, DOBJ); }

    protected void regItemcdIn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdIn(), "ITEMCD_IN"); }
    protected abstract ConditionValue xgetCValueItemcdIn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_Equal(String itemcdWh) {
        doSetItemcdWh_Equal(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_Equal(String itemcdWh) {
        regItemcdWh(CK_EQ, itemcdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotEqual(String itemcdWh) {
        doSetItemcdWh_NotEqual(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_NotEqual(String itemcdWh) {
        regItemcdWh(CK_NES, itemcdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterThan(String itemcdWh) {
        regItemcdWh(CK_GT, fRES(itemcdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessThan(String itemcdWh) {
        regItemcdWh(CK_LT, fRES(itemcdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterEqual(String itemcdWh) {
        regItemcdWh(CK_GE, fRES(itemcdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessEqual(String itemcdWh) {
        regItemcdWh(CK_LE, fRES(itemcdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWhList The collection of itemcdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_InScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_InScope(itemcdWhList);
    }

    protected void doSetItemcdWh_InScope(Collection<String> itemcdWhList) {
        regINS(CK_INS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWhList The collection of itemcdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_NotInScope(itemcdWhList);
    }

    protected void doSetItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        regINS(CK_NINS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)} <br>
     * <pre>e.g. setItemcdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdWh The value of itemcdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdWh_LikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdWh_NotLikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_PrefixSearch(String itemcdWh) {
        setItemcdWh_LikeSearch(itemcdWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     */
    public void setItemcdWh_IsNull() { regItemcdWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     */
    public void setItemcdWh_IsNullOrEmpty() { regItemcdWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     */
    public void setItemcdWh_IsNotNull() { regItemcdWh(CK_ISNN, DOBJ); }

    protected void regItemcdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdWh(), "ITEMCD_WH"); }
    protected abstract ConditionValue xgetCValueItemcdWh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_Equal(String designcdCase) {
        doSetDesigncdCase_Equal(fRES(designcdCase));
    }

    protected void doSetDesigncdCase_Equal(String designcdCase) {
        regDesigncdCase(CK_EQ, designcdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_NotEqual(String designcdCase) {
        doSetDesigncdCase_NotEqual(fRES(designcdCase));
    }

    protected void doSetDesigncdCase_NotEqual(String designcdCase) {
        regDesigncdCase(CK_NES, designcdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_GreaterThan(String designcdCase) {
        regDesigncdCase(CK_GT, fRES(designcdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_LessThan(String designcdCase) {
        regDesigncdCase(CK_LT, fRES(designcdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_GreaterEqual(String designcdCase) {
        regDesigncdCase(CK_GE, fRES(designcdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_LessEqual(String designcdCase) {
        regDesigncdCase(CK_LE, fRES(designcdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCaseList The collection of designcdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_InScope(Collection<String> designcdCaseList) {
        doSetDesigncdCase_InScope(designcdCaseList);
    }

    protected void doSetDesigncdCase_InScope(Collection<String> designcdCaseList) {
        regINS(CK_INS, cTL(designcdCaseList), xgetCValueDesigncdCase(), "DESIGNCD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCaseList The collection of designcdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_NotInScope(Collection<String> designcdCaseList) {
        doSetDesigncdCase_NotInScope(designcdCaseList);
    }

    protected void doSetDesigncdCase_NotInScope(Collection<String> designcdCaseList) {
        regINS(CK_NINS, cTL(designcdCaseList), xgetCValueDesigncdCase(), "DESIGNCD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)} <br>
     * <pre>e.g. setDesigncdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdCase The value of designcdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdCase_LikeSearch(String designcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdCase), xgetCValueDesigncdCase(), "DESIGNCD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdCase_NotLikeSearch(String designcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdCase), xgetCValueDesigncdCase(), "DESIGNCD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_PrefixSearch(String designcdCase) {
        setDesigncdCase_LikeSearch(designcdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     */
    public void setDesigncdCase_IsNull() { regDesigncdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     */
    public void setDesigncdCase_IsNullOrEmpty() { regDesigncdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     */
    public void setDesigncdCase_IsNotNull() { regDesigncdCase(CK_ISNN, DOBJ); }

    protected void regDesigncdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdCase(), "DESIGNCD_CASE"); }
    protected abstract ConditionValue xgetCValueDesigncdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_Equal(String designcdIn) {
        doSetDesigncdIn_Equal(fRES(designcdIn));
    }

    protected void doSetDesigncdIn_Equal(String designcdIn) {
        regDesigncdIn(CK_EQ, designcdIn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_NotEqual(String designcdIn) {
        doSetDesigncdIn_NotEqual(fRES(designcdIn));
    }

    protected void doSetDesigncdIn_NotEqual(String designcdIn) {
        regDesigncdIn(CK_NES, designcdIn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_GreaterThan(String designcdIn) {
        regDesigncdIn(CK_GT, fRES(designcdIn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_LessThan(String designcdIn) {
        regDesigncdIn(CK_LT, fRES(designcdIn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_GreaterEqual(String designcdIn) {
        regDesigncdIn(CK_GE, fRES(designcdIn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_LessEqual(String designcdIn) {
        regDesigncdIn(CK_LE, fRES(designcdIn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdInList The collection of designcdIn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_InScope(Collection<String> designcdInList) {
        doSetDesigncdIn_InScope(designcdInList);
    }

    protected void doSetDesigncdIn_InScope(Collection<String> designcdInList) {
        regINS(CK_INS, cTL(designcdInList), xgetCValueDesigncdIn(), "DESIGNCD_IN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdInList The collection of designcdIn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_NotInScope(Collection<String> designcdInList) {
        doSetDesigncdIn_NotInScope(designcdInList);
    }

    protected void doSetDesigncdIn_NotInScope(Collection<String> designcdInList) {
        regINS(CK_NINS, cTL(designcdInList), xgetCValueDesigncdIn(), "DESIGNCD_IN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)} <br>
     * <pre>e.g. setDesigncdIn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdIn The value of designcdIn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdIn_LikeSearch(String designcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdIn), xgetCValueDesigncdIn(), "DESIGNCD_IN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdIn_NotLikeSearch(String designcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdIn), xgetCValueDesigncdIn(), "DESIGNCD_IN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_PrefixSearch(String designcdIn) {
        setDesigncdIn_LikeSearch(designcdIn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     */
    public void setDesigncdIn_IsNull() { regDesigncdIn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     */
    public void setDesigncdIn_IsNullOrEmpty() { regDesigncdIn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     */
    public void setDesigncdIn_IsNotNull() { regDesigncdIn(CK_ISNN, DOBJ); }

    protected void regDesigncdIn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdIn(), "DESIGNCD_IN"); }
    protected abstract ConditionValue xgetCValueDesigncdIn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_Equal(String designcdWh) {
        doSetDesigncdWh_Equal(fRES(designcdWh));
    }

    protected void doSetDesigncdWh_Equal(String designcdWh) {
        regDesigncdWh(CK_EQ, designcdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_NotEqual(String designcdWh) {
        doSetDesigncdWh_NotEqual(fRES(designcdWh));
    }

    protected void doSetDesigncdWh_NotEqual(String designcdWh) {
        regDesigncdWh(CK_NES, designcdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_GreaterThan(String designcdWh) {
        regDesigncdWh(CK_GT, fRES(designcdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_LessThan(String designcdWh) {
        regDesigncdWh(CK_LT, fRES(designcdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_GreaterEqual(String designcdWh) {
        regDesigncdWh(CK_GE, fRES(designcdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_LessEqual(String designcdWh) {
        regDesigncdWh(CK_LE, fRES(designcdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWhList The collection of designcdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_InScope(Collection<String> designcdWhList) {
        doSetDesigncdWh_InScope(designcdWhList);
    }

    protected void doSetDesigncdWh_InScope(Collection<String> designcdWhList) {
        regINS(CK_INS, cTL(designcdWhList), xgetCValueDesigncdWh(), "DESIGNCD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWhList The collection of designcdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_NotInScope(Collection<String> designcdWhList) {
        doSetDesigncdWh_NotInScope(designcdWhList);
    }

    protected void doSetDesigncdWh_NotInScope(Collection<String> designcdWhList) {
        regINS(CK_NINS, cTL(designcdWhList), xgetCValueDesigncdWh(), "DESIGNCD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)} <br>
     * <pre>e.g. setDesigncdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdWh The value of designcdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdWh_LikeSearch(String designcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdWh), xgetCValueDesigncdWh(), "DESIGNCD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdWh_NotLikeSearch(String designcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdWh), xgetCValueDesigncdWh(), "DESIGNCD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_PrefixSearch(String designcdWh) {
        setDesigncdWh_LikeSearch(designcdWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     */
    public void setDesigncdWh_IsNull() { regDesigncdWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     */
    public void setDesigncdWh_IsNullOrEmpty() { regDesigncdWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     */
    public void setDesigncdWh_IsNotNull() { regDesigncdWh(CK_ISNN, DOBJ); }

    protected void regDesigncdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdWh(), "DESIGNCD_WH"); }
    protected abstract ConditionValue xgetCValueDesigncdWh();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecd The value of sourcecasecd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourcecasecd_Equal(java.math.BigDecimal sourcecasecd) {
        doSetSourcecasecd_Equal(sourcecasecd);
    }

    protected void doSetSourcecasecd_Equal(java.math.BigDecimal sourcecasecd) {
        regSourcecasecd(CK_EQ, sourcecasecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecd The value of sourcecasecd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourcecasecd_NotEqual(java.math.BigDecimal sourcecasecd) {
        doSetSourcecasecd_NotEqual(sourcecasecd);
    }

    protected void doSetSourcecasecd_NotEqual(java.math.BigDecimal sourcecasecd) {
        regSourcecasecd(CK_NES, sourcecasecd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecd The value of sourcecasecd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourcecasecd_GreaterThan(java.math.BigDecimal sourcecasecd) {
        regSourcecasecd(CK_GT, sourcecasecd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecd The value of sourcecasecd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourcecasecd_LessThan(java.math.BigDecimal sourcecasecd) {
        regSourcecasecd(CK_LT, sourcecasecd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecd The value of sourcecasecd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourcecasecd_GreaterEqual(java.math.BigDecimal sourcecasecd) {
        regSourcecasecd(CK_GE, sourcecasecd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecd The value of sourcecasecd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourcecasecd_LessEqual(java.math.BigDecimal sourcecasecd) {
        regSourcecasecd(CK_LE, sourcecasecd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param minNumber The min number of sourcecasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sourcecasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSourcecasecd_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSourcecasecd(), "SOURCECASECD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecdList The collection of sourcecasecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecasecd_InScope(Collection<java.math.BigDecimal> sourcecasecdList) {
        doSetSourcecasecd_InScope(sourcecasecdList);
    }

    protected void doSetSourcecasecd_InScope(Collection<java.math.BigDecimal> sourcecasecdList) {
        regINS(CK_INS, cTL(sourcecasecdList), xgetCValueSourcecasecd(), "SOURCECASECD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @param sourcecasecdList The collection of sourcecasecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourcecasecd_NotInScope(Collection<java.math.BigDecimal> sourcecasecdList) {
        doSetSourcecasecd_NotInScope(sourcecasecdList);
    }

    protected void doSetSourcecasecd_NotInScope(Collection<java.math.BigDecimal> sourcecasecdList) {
        regINS(CK_NINS, cTL(sourcecasecdList), xgetCValueSourcecasecd(), "SOURCECASECD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     */
    public void setSourcecasecd_IsNull() { regSourcecasecd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCECASECD: {decimal(16, 6)}
     */
    public void setSourcecasecd_IsNotNull() { regSourcecasecd(CK_ISNN, DOBJ); }

    protected void regSourcecasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourcecasecd(), "SOURCECASECD"); }
    protected abstract ConditionValue xgetCValueSourcecasecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflg The value of sendflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_Equal(java.math.BigDecimal sendflg) {
        doSetSendflg_Equal(sendflg);
    }

    protected void doSetSendflg_Equal(java.math.BigDecimal sendflg) {
        regSendflg(CK_EQ, sendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflg The value of sendflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_NotEqual(java.math.BigDecimal sendflg) {
        doSetSendflg_NotEqual(sendflg);
    }

    protected void doSetSendflg_NotEqual(java.math.BigDecimal sendflg) {
        regSendflg(CK_NES, sendflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflg The value of sendflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_GreaterThan(java.math.BigDecimal sendflg) {
        regSendflg(CK_GT, sendflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflg The value of sendflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_LessThan(java.math.BigDecimal sendflg) {
        regSendflg(CK_LT, sendflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflg The value of sendflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_GreaterEqual(java.math.BigDecimal sendflg) {
        regSendflg(CK_GE, sendflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflg The value of sendflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_LessEqual(java.math.BigDecimal sendflg) {
        regSendflg(CK_LE, sendflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param minNumber The min number of sendflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendflg(), "SENDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflgList The collection of sendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_InScope(Collection<java.math.BigDecimal> sendflgList) {
        doSetSendflg_InScope(sendflgList);
    }

    protected void doSetSendflg_InScope(Collection<java.math.BigDecimal> sendflgList) {
        regINS(CK_INS, cTL(sendflgList), xgetCValueSendflg(), "SENDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     * @param sendflgList The collection of sendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_NotInScope(Collection<java.math.BigDecimal> sendflgList) {
        doSetSendflg_NotInScope(sendflgList);
    }

    protected void doSetSendflg_NotInScope(Collection<java.math.BigDecimal> sendflgList) {
        regINS(CK_NINS, cTL(sendflgList), xgetCValueSendflg(), "SENDFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     */
    public void setSendflg_IsNull() { regSendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDFLG: {decimal(16, 6)}
     */
    public void setSendflg_IsNotNull() { regSendflg(CK_ISNN, DOBJ); }

    protected void regSendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendflg(), "SENDFLG"); }
    protected abstract ConditionValue xgetCValueSendflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_Equal(String fromflg) {
        doSetFromflg_Equal(fRES(fromflg));
    }

    protected void doSetFromflg_Equal(String fromflg) {
        regFromflg(CK_EQ, fromflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_NotEqual(String fromflg) {
        doSetFromflg_NotEqual(fRES(fromflg));
    }

    protected void doSetFromflg_NotEqual(String fromflg) {
        regFromflg(CK_NES, fromflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_GreaterThan(String fromflg) {
        regFromflg(CK_GT, fRES(fromflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_LessThan(String fromflg) {
        regFromflg(CK_LT, fRES(fromflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_GreaterEqual(String fromflg) {
        regFromflg(CK_GE, fRES(fromflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_LessEqual(String fromflg) {
        regFromflg(CK_LE, fRES(fromflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflgList The collection of fromflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_InScope(Collection<String> fromflgList) {
        doSetFromflg_InScope(fromflgList);
    }

    protected void doSetFromflg_InScope(Collection<String> fromflgList) {
        regINS(CK_INS, cTL(fromflgList), xgetCValueFromflg(), "FROMFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflgList The collection of fromflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_NotInScope(Collection<String> fromflgList) {
        doSetFromflg_NotInScope(fromflgList);
    }

    protected void doSetFromflg_NotInScope(Collection<String> fromflgList) {
        regINS(CK_NINS, cTL(fromflgList), xgetCValueFromflg(), "FROMFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFLG: {char(1)} <br>
     * <pre>e.g. setFromflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromflg The value of fromflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromflg_LikeSearch(String fromflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromflg), xgetCValueFromflg(), "FROMFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromflg_NotLikeSearch(String fromflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromflg), xgetCValueFromflg(), "FROMFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFLG: {char(1)}
     * @param fromflg The value of fromflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromflg_PrefixSearch(String fromflg) {
        setFromflg_LikeSearch(fromflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     */
    public void setFromflg_IsNull() { regFromflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMFLG: {char(1)}
     */
    public void setFromflg_IsNotNull() { regFromflg(CK_ISNN, DOBJ); }

    protected void regFromflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromflg(), "FROMFLG"); }
    protected abstract ConditionValue xgetCValueFromflg();

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
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_Equal(String mixedflg) {
        doSetMixedflg_Equal(fRES(mixedflg));
    }

    protected void doSetMixedflg_Equal(String mixedflg) {
        regMixedflg(CK_EQ, mixedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotEqual(String mixedflg) {
        doSetMixedflg_NotEqual(fRES(mixedflg));
    }

    protected void doSetMixedflg_NotEqual(String mixedflg) {
        regMixedflg(CK_NES, mixedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterThan(String mixedflg) {
        regMixedflg(CK_GT, fRES(mixedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessThan(String mixedflg) {
        regMixedflg(CK_LT, fRES(mixedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterEqual(String mixedflg) {
        regMixedflg(CK_GE, fRES(mixedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessEqual(String mixedflg) {
        regMixedflg(CK_LE, fRES(mixedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflgList The collection of mixedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_InScope(Collection<String> mixedflgList) {
        doSetMixedflg_InScope(mixedflgList);
    }

    protected void doSetMixedflg_InScope(Collection<String> mixedflgList) {
        regINS(CK_INS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflgList The collection of mixedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotInScope(Collection<String> mixedflgList) {
        doSetMixedflg_NotInScope(mixedflgList);
    }

    protected void doSetMixedflg_NotInScope(Collection<String> mixedflgList) {
        regINS(CK_NINS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)} <br>
     * <pre>e.g. setMixedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mixedflg The value of mixedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMixedflg_LikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMixedflg_NotLikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_PrefixSearch(String mixedflg) {
        setMixedflg_LikeSearch(mixedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     */
    public void setMixedflg_IsNull() { regMixedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     */
    public void setMixedflg_IsNotNull() { regMixedflg(CK_ISNN, DOBJ); }

    protected void regMixedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMixedflg(), "MIXEDFLG"); }
    protected abstract ConditionValue xgetCValueMixedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_Equal(String symbolpastdate) {
        doSetSymbolpastdate_Equal(fRES(symbolpastdate));
    }

    protected void doSetSymbolpastdate_Equal(String symbolpastdate) {
        regSymbolpastdate(CK_EQ, symbolpastdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_NotEqual(String symbolpastdate) {
        doSetSymbolpastdate_NotEqual(fRES(symbolpastdate));
    }

    protected void doSetSymbolpastdate_NotEqual(String symbolpastdate) {
        regSymbolpastdate(CK_NES, symbolpastdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_GreaterThan(String symbolpastdate) {
        regSymbolpastdate(CK_GT, fRES(symbolpastdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_LessThan(String symbolpastdate) {
        regSymbolpastdate(CK_LT, fRES(symbolpastdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_GreaterEqual(String symbolpastdate) {
        regSymbolpastdate(CK_GE, fRES(symbolpastdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_LessEqual(String symbolpastdate) {
        regSymbolpastdate(CK_LE, fRES(symbolpastdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdateList The collection of symbolpastdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_InScope(Collection<String> symbolpastdateList) {
        doSetSymbolpastdate_InScope(symbolpastdateList);
    }

    protected void doSetSymbolpastdate_InScope(Collection<String> symbolpastdateList) {
        regINS(CK_INS, cTL(symbolpastdateList), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdateList The collection of symbolpastdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_NotInScope(Collection<String> symbolpastdateList) {
        doSetSymbolpastdate_NotInScope(symbolpastdateList);
    }

    protected void doSetSymbolpastdate_NotInScope(Collection<String> symbolpastdateList) {
        regINS(CK_NINS, cTL(symbolpastdateList), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)} <br>
     * <pre>e.g. setSymbolpastdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolpastdate The value of symbolpastdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolpastdate_LikeSearch(String symbolpastdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolpastdate), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolpastdate_NotLikeSearch(String symbolpastdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolpastdate), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_PrefixSearch(String symbolpastdate) {
        setSymbolpastdate_LikeSearch(symbolpastdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     */
    public void setSymbolpastdate_IsNull() { regSymbolpastdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     */
    public void setSymbolpastdate_IsNullOrEmpty() { regSymbolpastdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     */
    public void setSymbolpastdate_IsNotNull() { regSymbolpastdate(CK_ISNN, DOBJ); }

    protected void regSymbolpastdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolpastdate(), "SYMBOLPASTDATE"); }
    protected abstract ConditionValue xgetCValueSymbolpastdate();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_Equal(String makercaseno) {
        doSetMakercaseno_Equal(fRES(makercaseno));
    }

    protected void doSetMakercaseno_Equal(String makercaseno) {
        regMakercaseno(CK_EQ, makercaseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotEqual(String makercaseno) {
        doSetMakercaseno_NotEqual(fRES(makercaseno));
    }

    protected void doSetMakercaseno_NotEqual(String makercaseno) {
        regMakercaseno(CK_NES, makercaseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterThan(String makercaseno) {
        regMakercaseno(CK_GT, fRES(makercaseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessThan(String makercaseno) {
        regMakercaseno(CK_LT, fRES(makercaseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterEqual(String makercaseno) {
        regMakercaseno(CK_GE, fRES(makercaseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessEqual(String makercaseno) {
        regMakercaseno(CK_LE, fRES(makercaseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_InScope(Collection<String> makercasenoList) {
        doSetMakercaseno_InScope(makercasenoList);
    }

    protected void doSetMakercaseno_InScope(Collection<String> makercasenoList) {
        regINS(CK_INS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotInScope(Collection<String> makercasenoList) {
        doSetMakercaseno_NotInScope(makercasenoList);
    }

    protected void doSetMakercaseno_NotInScope(Collection<String> makercasenoList) {
        regINS(CK_NINS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)} <br>
     * <pre>e.g. setMakercaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makercaseno The value of makercaseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakercaseno_LikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakercaseno_NotLikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_PrefixSearch(String makercaseno) {
        setMakercaseno_LikeSearch(makercaseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNull() { regMakercaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNullOrEmpty() { regMakercaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNotNull() { regMakercaseno(CK_ISNN, DOBJ); }

    protected void regMakercaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakercaseno(), "MAKERCASENO"); }
    protected abstract ConditionValue xgetCValueMakercaseno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_Equal(String lendflg) {
        doSetLendflg_Equal(fRES(lendflg));
    }

    protected void doSetLendflg_Equal(String lendflg) {
        regLendflg(CK_EQ, lendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_NotEqual(String lendflg) {
        doSetLendflg_NotEqual(fRES(lendflg));
    }

    protected void doSetLendflg_NotEqual(String lendflg) {
        regLendflg(CK_NES, lendflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_GreaterThan(String lendflg) {
        regLendflg(CK_GT, fRES(lendflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_LessThan(String lendflg) {
        regLendflg(CK_LT, fRES(lendflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_GreaterEqual(String lendflg) {
        regLendflg(CK_GE, fRES(lendflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_LessEqual(String lendflg) {
        regLendflg(CK_LE, fRES(lendflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflgList The collection of lendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_InScope(Collection<String> lendflgList) {
        doSetLendflg_InScope(lendflgList);
    }

    protected void doSetLendflg_InScope(Collection<String> lendflgList) {
        regINS(CK_INS, cTL(lendflgList), xgetCValueLendflg(), "LENDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflgList The collection of lendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_NotInScope(Collection<String> lendflgList) {
        doSetLendflg_NotInScope(lendflgList);
    }

    protected void doSetLendflg_NotInScope(Collection<String> lendflgList) {
        regINS(CK_NINS, cTL(lendflgList), xgetCValueLendflg(), "LENDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)} <br>
     * <pre>e.g. setLendflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lendflg The value of lendflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLendflg_LikeSearch(String lendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lendflg), xgetCValueLendflg(), "LENDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLendflg_NotLikeSearch(String lendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lendflg), xgetCValueLendflg(), "LENDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_PrefixSearch(String lendflg) {
        setLendflg_LikeSearch(lendflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     */
    public void setLendflg_IsNull() { regLendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     */
    public void setLendflg_IsNotNull() { regLendflg(CK_ISNN, DOBJ); }

    protected void regLendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLendflg(), "LENDFLG"); }
    protected abstract ConditionValue xgetCValueLendflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalc The value of caseinnumcalc as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_Equal(Long caseinnumcalc) {
        doSetCaseinnumcalc_Equal(caseinnumcalc);
    }

    protected void doSetCaseinnumcalc_Equal(Long caseinnumcalc) {
        regCaseinnumcalc(CK_EQ, caseinnumcalc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalc The value of caseinnumcalc as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_NotEqual(Long caseinnumcalc) {
        doSetCaseinnumcalc_NotEqual(caseinnumcalc);
    }

    protected void doSetCaseinnumcalc_NotEqual(Long caseinnumcalc) {
        regCaseinnumcalc(CK_NES, caseinnumcalc);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalc The value of caseinnumcalc as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_GreaterThan(Long caseinnumcalc) {
        regCaseinnumcalc(CK_GT, caseinnumcalc);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalc The value of caseinnumcalc as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_LessThan(Long caseinnumcalc) {
        regCaseinnumcalc(CK_LT, caseinnumcalc);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalc The value of caseinnumcalc as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_GreaterEqual(Long caseinnumcalc) {
        regCaseinnumcalc(CK_GE, caseinnumcalc);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalc The value of caseinnumcalc as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_LessEqual(Long caseinnumcalc) {
        regCaseinnumcalc(CK_LE, caseinnumcalc);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param minNumber The min number of caseinnumcalc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinnumcalc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinnumcalc_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinnumcalc(), "CASEINNUMCALC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalcList The collection of caseinnumcalc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_InScope(Collection<Long> caseinnumcalcList) {
        doSetCaseinnumcalc_InScope(caseinnumcalcList);
    }

    protected void doSetCaseinnumcalc_InScope(Collection<Long> caseinnumcalcList) {
        regINS(CK_INS, cTL(caseinnumcalcList), xgetCValueCaseinnumcalc(), "CASEINNUMCALC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @param caseinnumcalcList The collection of caseinnumcalc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnumcalc_NotInScope(Collection<Long> caseinnumcalcList) {
        doSetCaseinnumcalc_NotInScope(caseinnumcalcList);
    }

    protected void doSetCaseinnumcalc_NotInScope(Collection<Long> caseinnumcalcList) {
        regINS(CK_NINS, cTL(caseinnumcalcList), xgetCValueCaseinnumcalc(), "CASEINNUMCALC");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     */
    public void setCaseinnumcalc_IsNull() { regCaseinnumcalc(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINNUMCALC: {bigint(19)}
     */
    public void setCaseinnumcalc_IsNotNull() { regCaseinnumcalc(CK_ISNN, DOBJ); }

    protected void regCaseinnumcalc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinnumcalc(), "CASEINNUMCALC"); }
    protected abstract ConditionValue xgetCValueCaseinnumcalc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_Equal(String caseitfno) {
        doSetCaseitfno_Equal(fRES(caseitfno));
    }

    protected void doSetCaseitfno_Equal(String caseitfno) {
        regCaseitfno(CK_EQ, caseitfno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_NotEqual(String caseitfno) {
        doSetCaseitfno_NotEqual(fRES(caseitfno));
    }

    protected void doSetCaseitfno_NotEqual(String caseitfno) {
        regCaseitfno(CK_NES, caseitfno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_GreaterThan(String caseitfno) {
        regCaseitfno(CK_GT, fRES(caseitfno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_LessThan(String caseitfno) {
        regCaseitfno(CK_LT, fRES(caseitfno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_GreaterEqual(String caseitfno) {
        regCaseitfno(CK_GE, fRES(caseitfno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_LessEqual(String caseitfno) {
        regCaseitfno(CK_LE, fRES(caseitfno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfnoList The collection of caseitfno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_InScope(Collection<String> caseitfnoList) {
        doSetCaseitfno_InScope(caseitfnoList);
    }

    protected void doSetCaseitfno_InScope(Collection<String> caseitfnoList) {
        regINS(CK_INS, cTL(caseitfnoList), xgetCValueCaseitfno(), "CASEITFNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfnoList The collection of caseitfno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_NotInScope(Collection<String> caseitfnoList) {
        doSetCaseitfno_NotInScope(caseitfnoList);
    }

    protected void doSetCaseitfno_NotInScope(Collection<String> caseitfnoList) {
        regINS(CK_NINS, cTL(caseitfnoList), xgetCValueCaseitfno(), "CASEITFNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)} <br>
     * <pre>e.g. setCaseitfno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseitfno The value of caseitfno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseitfno_LikeSearch(String caseitfno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseitfno), xgetCValueCaseitfno(), "CASEITFNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseitfno_NotLikeSearch(String caseitfno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseitfno), xgetCValueCaseitfno(), "CASEITFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_PrefixSearch(String caseitfno) {
        setCaseitfno_LikeSearch(caseitfno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNull() { regCaseitfno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNullOrEmpty() { regCaseitfno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNotNull() { regCaseitfno(CK_ISNN, DOBJ); }

    protected void regCaseitfno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseitfno(), "CASEITFNO"); }
    protected abstract ConditionValue xgetCValueCaseitfno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_Equal(String casebarcodevaliant) {
        doSetCasebarcodevaliant_Equal(fRES(casebarcodevaliant));
    }

    protected void doSetCasebarcodevaliant_Equal(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_EQ, casebarcodevaliant);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_NotEqual(String casebarcodevaliant) {
        doSetCasebarcodevaliant_NotEqual(fRES(casebarcodevaliant));
    }

    protected void doSetCasebarcodevaliant_NotEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_NES, casebarcodevaliant);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_GreaterThan(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_GT, fRES(casebarcodevaliant));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_LessThan(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_LT, fRES(casebarcodevaliant));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_GreaterEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_GE, fRES(casebarcodevaliant));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_LessEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_LE, fRES(casebarcodevaliant));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliantList The collection of casebarcodevaliant as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_InScope(Collection<String> casebarcodevaliantList) {
        doSetCasebarcodevaliant_InScope(casebarcodevaliantList);
    }

    protected void doSetCasebarcodevaliant_InScope(Collection<String> casebarcodevaliantList) {
        regINS(CK_INS, cTL(casebarcodevaliantList), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliantList The collection of casebarcodevaliant as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_NotInScope(Collection<String> casebarcodevaliantList) {
        doSetCasebarcodevaliant_NotInScope(casebarcodevaliantList);
    }

    protected void doSetCasebarcodevaliant_NotInScope(Collection<String> casebarcodevaliantList) {
        regINS(CK_NINS, cTL(casebarcodevaliantList), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)} <br>
     * <pre>e.g. setCasebarcodevaliant_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casebarcodevaliant The value of casebarcodevaliant as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasebarcodevaliant_LikeSearch(String casebarcodevaliant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casebarcodevaliant), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasebarcodevaliant_NotLikeSearch(String casebarcodevaliant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casebarcodevaliant), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_PrefixSearch(String casebarcodevaliant) {
        setCasebarcodevaliant_LikeSearch(casebarcodevaliant, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNull() { regCasebarcodevaliant(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNullOrEmpty() { regCasebarcodevaliant(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNotNull() { regCasebarcodevaliant(CK_ISNN, DOBJ); }

    protected void regCasebarcodevaliant(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT"); }
    protected abstract ConditionValue xgetCValueCasebarcodevaliant();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_Equal(String caselot4) {
        doSetCaselot4_Equal(fRES(caselot4));
    }

    protected void doSetCaselot4_Equal(String caselot4) {
        regCaselot4(CK_EQ, caselot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotEqual(String caselot4) {
        doSetCaselot4_NotEqual(fRES(caselot4));
    }

    protected void doSetCaselot4_NotEqual(String caselot4) {
        regCaselot4(CK_NES, caselot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterThan(String caselot4) {
        regCaselot4(CK_GT, fRES(caselot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessThan(String caselot4) {
        regCaselot4(CK_LT, fRES(caselot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterEqual(String caselot4) {
        regCaselot4(CK_GE, fRES(caselot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessEqual(String caselot4) {
        regCaselot4(CK_LE, fRES(caselot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4List The collection of caselot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_InScope(Collection<String> caselot4List) {
        doSetCaselot4_InScope(caselot4List);
    }

    protected void doSetCaselot4_InScope(Collection<String> caselot4List) {
        regINS(CK_INS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4List The collection of caselot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotInScope(Collection<String> caselot4List) {
        doSetCaselot4_NotInScope(caselot4List);
    }

    protected void doSetCaselot4_NotInScope(Collection<String> caselot4List) {
        regINS(CK_NINS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)} <br>
     * <pre>e.g. setCaselot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caselot4 The value of caselot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaselot4_LikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaselot4_NotLikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_PrefixSearch(String caselot4) {
        setCaselot4_LikeSearch(caselot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNull() { regCaselot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNullOrEmpty() { regCaselot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNotNull() { regCaselot4(CK_ISNN, DOBJ); }

    protected void regCaselot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaselot4(), "CASELOT4"); }
    protected abstract ConditionValue xgetCValueCaselot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_Equal(String casecenterno) {
        doSetCasecenterno_Equal(fRES(casecenterno));
    }

    protected void doSetCasecenterno_Equal(String casecenterno) {
        regCasecenterno(CK_EQ, casecenterno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_NotEqual(String casecenterno) {
        doSetCasecenterno_NotEqual(fRES(casecenterno));
    }

    protected void doSetCasecenterno_NotEqual(String casecenterno) {
        regCasecenterno(CK_NES, casecenterno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_GreaterThan(String casecenterno) {
        regCasecenterno(CK_GT, fRES(casecenterno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_LessThan(String casecenterno) {
        regCasecenterno(CK_LT, fRES(casecenterno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_GreaterEqual(String casecenterno) {
        regCasecenterno(CK_GE, fRES(casecenterno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_LessEqual(String casecenterno) {
        regCasecenterno(CK_LE, fRES(casecenterno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenternoList The collection of casecenterno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_InScope(Collection<String> casecenternoList) {
        doSetCasecenterno_InScope(casecenternoList);
    }

    protected void doSetCasecenterno_InScope(Collection<String> casecenternoList) {
        regINS(CK_INS, cTL(casecenternoList), xgetCValueCasecenterno(), "CASECENTERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenternoList The collection of casecenterno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_NotInScope(Collection<String> casecenternoList) {
        doSetCasecenterno_NotInScope(casecenternoList);
    }

    protected void doSetCasecenterno_NotInScope(Collection<String> casecenternoList) {
        regINS(CK_NINS, cTL(casecenternoList), xgetCValueCasecenterno(), "CASECENTERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)} <br>
     * <pre>e.g. setCasecenterno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecenterno The value of casecenterno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecenterno_LikeSearch(String casecenterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecenterno), xgetCValueCasecenterno(), "CASECENTERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecenterno_NotLikeSearch(String casecenterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecenterno), xgetCValueCasecenterno(), "CASECENTERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_PrefixSearch(String casecenterno) {
        setCasecenterno_LikeSearch(casecenterno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNull() { regCasecenterno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNullOrEmpty() { regCasecenterno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNotNull() { regCasecenterno(CK_ISNN, DOBJ); }

    protected void regCasecenterno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecenterno(), "CASECENTERNO"); }
    protected abstract ConditionValue xgetCValueCasecenterno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_Equal(String casepackno) {
        doSetCasepackno_Equal(fRES(casepackno));
    }

    protected void doSetCasepackno_Equal(String casepackno) {
        regCasepackno(CK_EQ, casepackno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_NotEqual(String casepackno) {
        doSetCasepackno_NotEqual(fRES(casepackno));
    }

    protected void doSetCasepackno_NotEqual(String casepackno) {
        regCasepackno(CK_NES, casepackno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_GreaterThan(String casepackno) {
        regCasepackno(CK_GT, fRES(casepackno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_LessThan(String casepackno) {
        regCasepackno(CK_LT, fRES(casepackno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_GreaterEqual(String casepackno) {
        regCasepackno(CK_GE, fRES(casepackno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_LessEqual(String casepackno) {
        regCasepackno(CK_LE, fRES(casepackno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepacknoList The collection of casepackno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_InScope(Collection<String> casepacknoList) {
        doSetCasepackno_InScope(casepacknoList);
    }

    protected void doSetCasepackno_InScope(Collection<String> casepacknoList) {
        regINS(CK_INS, cTL(casepacknoList), xgetCValueCasepackno(), "CASEPACKNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepacknoList The collection of casepackno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_NotInScope(Collection<String> casepacknoList) {
        doSetCasepackno_NotInScope(casepacknoList);
    }

    protected void doSetCasepackno_NotInScope(Collection<String> casepacknoList) {
        regINS(CK_NINS, cTL(casepacknoList), xgetCValueCasepackno(), "CASEPACKNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)} <br>
     * <pre>e.g. setCasepackno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casepackno The value of casepackno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasepackno_LikeSearch(String casepackno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casepackno), xgetCValueCasepackno(), "CASEPACKNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasepackno_NotLikeSearch(String casepackno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casepackno), xgetCValueCasepackno(), "CASEPACKNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_PrefixSearch(String casepackno) {
        setCasepackno_LikeSearch(casepackno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNull() { regCasepackno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNullOrEmpty() { regCasepackno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNotNull() { regCasepackno(CK_ISNN, DOBJ); }

    protected void regCasepackno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasepackno(), "CASEPACKNO"); }
    protected abstract ConditionValue xgetCValueCasepackno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_Equal(String casepacktime) {
        doSetCasepacktime_Equal(fRES(casepacktime));
    }

    protected void doSetCasepacktime_Equal(String casepacktime) {
        regCasepacktime(CK_EQ, casepacktime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_NotEqual(String casepacktime) {
        doSetCasepacktime_NotEqual(fRES(casepacktime));
    }

    protected void doSetCasepacktime_NotEqual(String casepacktime) {
        regCasepacktime(CK_NES, casepacktime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_GreaterThan(String casepacktime) {
        regCasepacktime(CK_GT, fRES(casepacktime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_LessThan(String casepacktime) {
        regCasepacktime(CK_LT, fRES(casepacktime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_GreaterEqual(String casepacktime) {
        regCasepacktime(CK_GE, fRES(casepacktime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_LessEqual(String casepacktime) {
        regCasepacktime(CK_LE, fRES(casepacktime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktimeList The collection of casepacktime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_InScope(Collection<String> casepacktimeList) {
        doSetCasepacktime_InScope(casepacktimeList);
    }

    protected void doSetCasepacktime_InScope(Collection<String> casepacktimeList) {
        regINS(CK_INS, cTL(casepacktimeList), xgetCValueCasepacktime(), "CASEPACKTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktimeList The collection of casepacktime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_NotInScope(Collection<String> casepacktimeList) {
        doSetCasepacktime_NotInScope(casepacktimeList);
    }

    protected void doSetCasepacktime_NotInScope(Collection<String> casepacktimeList) {
        regINS(CK_NINS, cTL(casepacktimeList), xgetCValueCasepacktime(), "CASEPACKTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)} <br>
     * <pre>e.g. setCasepacktime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casepacktime The value of casepacktime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasepacktime_LikeSearch(String casepacktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casepacktime), xgetCValueCasepacktime(), "CASEPACKTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasepacktime_NotLikeSearch(String casepacktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casepacktime), xgetCValueCasepacktime(), "CASEPACKTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_PrefixSearch(String casepacktime) {
        setCasepacktime_LikeSearch(casepacktime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNull() { regCasepacktime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNullOrEmpty() { regCasepacktime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNotNull() { regCasepacktime(CK_ISNN, DOBJ); }

    protected void regCasepacktime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasepacktime(), "CASEPACKTIME"); }
    protected abstract ConditionValue xgetCValueCasepacktime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_Equal(String casebarcode) {
        doSetCasebarcode_Equal(fRES(casebarcode));
    }

    protected void doSetCasebarcode_Equal(String casebarcode) {
        regCasebarcode(CK_EQ, casebarcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_NotEqual(String casebarcode) {
        doSetCasebarcode_NotEqual(fRES(casebarcode));
    }

    protected void doSetCasebarcode_NotEqual(String casebarcode) {
        regCasebarcode(CK_NES, casebarcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_GreaterThan(String casebarcode) {
        regCasebarcode(CK_GT, fRES(casebarcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_LessThan(String casebarcode) {
        regCasebarcode(CK_LT, fRES(casebarcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_GreaterEqual(String casebarcode) {
        regCasebarcode(CK_GE, fRES(casebarcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_LessEqual(String casebarcode) {
        regCasebarcode(CK_LE, fRES(casebarcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcodeList The collection of casebarcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_InScope(Collection<String> casebarcodeList) {
        doSetCasebarcode_InScope(casebarcodeList);
    }

    protected void doSetCasebarcode_InScope(Collection<String> casebarcodeList) {
        regINS(CK_INS, cTL(casebarcodeList), xgetCValueCasebarcode(), "CASEBARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcodeList The collection of casebarcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_NotInScope(Collection<String> casebarcodeList) {
        doSetCasebarcode_NotInScope(casebarcodeList);
    }

    protected void doSetCasebarcode_NotInScope(Collection<String> casebarcodeList) {
        regINS(CK_NINS, cTL(casebarcodeList), xgetCValueCasebarcode(), "CASEBARCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {varchar(100)} <br>
     * <pre>e.g. setCasebarcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casebarcode The value of casebarcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasebarcode_LikeSearch(String casebarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casebarcode), xgetCValueCasebarcode(), "CASEBARCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasebarcode_NotLikeSearch(String casebarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casebarcode), xgetCValueCasebarcode(), "CASEBARCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     * @param casebarcode The value of casebarcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_PrefixSearch(String casebarcode) {
        setCasebarcode_LikeSearch(casebarcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     */
    public void setCasebarcode_IsNull() { regCasebarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     */
    public void setCasebarcode_IsNullOrEmpty() { regCasebarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEBARCODE: {varchar(100)}
     */
    public void setCasebarcode_IsNotNull() { regCasebarcode(CK_ISNN, DOBJ); }

    protected void regCasebarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasebarcode(), "CASEBARCODE"); }
    protected abstract ConditionValue xgetCValueCasebarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_Equal(String otherrefno2) {
        doSetOtherrefno2_Equal(fRES(otherrefno2));
    }

    protected void doSetOtherrefno2_Equal(String otherrefno2) {
        regOtherrefno2(CK_EQ, otherrefno2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_NotEqual(String otherrefno2) {
        doSetOtherrefno2_NotEqual(fRES(otherrefno2));
    }

    protected void doSetOtherrefno2_NotEqual(String otherrefno2) {
        regOtherrefno2(CK_NES, otherrefno2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_GreaterThan(String otherrefno2) {
        regOtherrefno2(CK_GT, fRES(otherrefno2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_LessThan(String otherrefno2) {
        regOtherrefno2(CK_LT, fRES(otherrefno2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_GreaterEqual(String otherrefno2) {
        regOtherrefno2(CK_GE, fRES(otherrefno2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_LessEqual(String otherrefno2) {
        regOtherrefno2(CK_LE, fRES(otherrefno2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2List The collection of otherrefno2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_InScope(Collection<String> otherrefno2List) {
        doSetOtherrefno2_InScope(otherrefno2List);
    }

    protected void doSetOtherrefno2_InScope(Collection<String> otherrefno2List) {
        regINS(CK_INS, cTL(otherrefno2List), xgetCValueOtherrefno2(), "OTHERREFNO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2List The collection of otherrefno2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_NotInScope(Collection<String> otherrefno2List) {
        doSetOtherrefno2_NotInScope(otherrefno2List);
    }

    protected void doSetOtherrefno2_NotInScope(Collection<String> otherrefno2List) {
        regINS(CK_NINS, cTL(otherrefno2List), xgetCValueOtherrefno2(), "OTHERREFNO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)} <br>
     * <pre>e.g. setOtherrefno2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno2 The value of otherrefno2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno2_LikeSearch(String otherrefno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno2), xgetCValueOtherrefno2(), "OTHERREFNO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno2_NotLikeSearch(String otherrefno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno2), xgetCValueOtherrefno2(), "OTHERREFNO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_PrefixSearch(String otherrefno2) {
        setOtherrefno2_LikeSearch(otherrefno2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     */
    public void setOtherrefno2_IsNull() { regOtherrefno2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     */
    public void setOtherrefno2_IsNullOrEmpty() { regOtherrefno2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     */
    public void setOtherrefno2_IsNotNull() { regOtherrefno2(CK_ISNN, DOBJ); }

    protected void regOtherrefno2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno2(), "OTHERREFNO2"); }
    protected abstract ConditionValue xgetCValueOtherrefno2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_Equal(String ordertype) {
        doSetOrdertype_Equal(fRES(ordertype));
    }

    protected void doSetOrdertype_Equal(String ordertype) {
        regOrdertype(CK_EQ, ordertype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotEqual(String ordertype) {
        doSetOrdertype_NotEqual(fRES(ordertype));
    }

    protected void doSetOrdertype_NotEqual(String ordertype) {
        regOrdertype(CK_NES, ordertype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterThan(String ordertype) {
        regOrdertype(CK_GT, fRES(ordertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessThan(String ordertype) {
        regOrdertype(CK_LT, fRES(ordertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterEqual(String ordertype) {
        regOrdertype(CK_GE, fRES(ordertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessEqual(String ordertype) {
        regOrdertype(CK_LE, fRES(ordertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertypeList The collection of ordertype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_InScope(Collection<String> ordertypeList) {
        doSetOrdertype_InScope(ordertypeList);
    }

    protected void doSetOrdertype_InScope(Collection<String> ordertypeList) {
        regINS(CK_INS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertypeList The collection of ordertype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotInScope(Collection<String> ordertypeList) {
        doSetOrdertype_NotInScope(ordertypeList);
    }

    protected void doSetOrdertype_NotInScope(Collection<String> ordertypeList) {
        regINS(CK_NINS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)} <br>
     * <pre>e.g. setOrdertype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordertype The value of ordertype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdertype_LikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdertype_NotLikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_PrefixSearch(String ordertype) {
        setOrdertype_LikeSearch(ordertype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNull() { regOrdertype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNullOrEmpty() { regOrdertype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNotNull() { regOrdertype(CK_ISNN, DOBJ); }

    protected void regOrdertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdertype(), "ORDERTYPE"); }
    protected abstract ConditionValue xgetCValueOrdertype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_Equal(String limitdatenow) {
        doSetLimitdatenow_Equal(fRES(limitdatenow));
    }

    protected void doSetLimitdatenow_Equal(String limitdatenow) {
        regLimitdatenow(CK_EQ, limitdatenow);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_NotEqual(String limitdatenow) {
        doSetLimitdatenow_NotEqual(fRES(limitdatenow));
    }

    protected void doSetLimitdatenow_NotEqual(String limitdatenow) {
        regLimitdatenow(CK_NES, limitdatenow);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_GreaterThan(String limitdatenow) {
        regLimitdatenow(CK_GT, fRES(limitdatenow));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_LessThan(String limitdatenow) {
        regLimitdatenow(CK_LT, fRES(limitdatenow));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_GreaterEqual(String limitdatenow) {
        regLimitdatenow(CK_GE, fRES(limitdatenow));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_LessEqual(String limitdatenow) {
        regLimitdatenow(CK_LE, fRES(limitdatenow));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenowList The collection of limitdatenow as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_InScope(Collection<String> limitdatenowList) {
        doSetLimitdatenow_InScope(limitdatenowList);
    }

    protected void doSetLimitdatenow_InScope(Collection<String> limitdatenowList) {
        regINS(CK_INS, cTL(limitdatenowList), xgetCValueLimitdatenow(), "LIMITDATENOW");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenowList The collection of limitdatenow as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_NotInScope(Collection<String> limitdatenowList) {
        doSetLimitdatenow_NotInScope(limitdatenowList);
    }

    protected void doSetLimitdatenow_NotInScope(Collection<String> limitdatenowList) {
        regINS(CK_NINS, cTL(limitdatenowList), xgetCValueLimitdatenow(), "LIMITDATENOW");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {varchar(8)} <br>
     * <pre>e.g. setLimitdatenow_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitdatenow The value of limitdatenow as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitdatenow_LikeSearch(String limitdatenow, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitdatenow), xgetCValueLimitdatenow(), "LIMITDATENOW", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdatenow_NotLikeSearch(String limitdatenow, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdatenow), xgetCValueLimitdatenow(), "LIMITDATENOW", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     * @param limitdatenow The value of limitdatenow as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_PrefixSearch(String limitdatenow) {
        setLimitdatenow_LikeSearch(limitdatenow, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     */
    public void setLimitdatenow_IsNull() { regLimitdatenow(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     */
    public void setLimitdatenow_IsNullOrEmpty() { regLimitdatenow(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITDATENOW: {varchar(8)}
     */
    public void setLimitdatenow_IsNotNull() { regLimitdatenow(CK_ISNN, DOBJ); }

    protected void regLimitdatenow(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdatenow(), "LIMITDATENOW"); }
    protected abstract ConditionValue xgetCValueLimitdatenow();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_Equal(String casecreatetype) {
        doSetCasecreatetype_Equal(fRES(casecreatetype));
    }

    protected void doSetCasecreatetype_Equal(String casecreatetype) {
        regCasecreatetype(CK_EQ, casecreatetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_NotEqual(String casecreatetype) {
        doSetCasecreatetype_NotEqual(fRES(casecreatetype));
    }

    protected void doSetCasecreatetype_NotEqual(String casecreatetype) {
        regCasecreatetype(CK_NES, casecreatetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_GreaterThan(String casecreatetype) {
        regCasecreatetype(CK_GT, fRES(casecreatetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_LessThan(String casecreatetype) {
        regCasecreatetype(CK_LT, fRES(casecreatetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_GreaterEqual(String casecreatetype) {
        regCasecreatetype(CK_GE, fRES(casecreatetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_LessEqual(String casecreatetype) {
        regCasecreatetype(CK_LE, fRES(casecreatetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetypeList The collection of casecreatetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_InScope(Collection<String> casecreatetypeList) {
        doSetCasecreatetype_InScope(casecreatetypeList);
    }

    protected void doSetCasecreatetype_InScope(Collection<String> casecreatetypeList) {
        regINS(CK_INS, cTL(casecreatetypeList), xgetCValueCasecreatetype(), "CASECREATETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetypeList The collection of casecreatetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_NotInScope(Collection<String> casecreatetypeList) {
        doSetCasecreatetype_NotInScope(casecreatetypeList);
    }

    protected void doSetCasecreatetype_NotInScope(Collection<String> casecreatetypeList) {
        regINS(CK_NINS, cTL(casecreatetypeList), xgetCValueCasecreatetype(), "CASECREATETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)} <br>
     * <pre>e.g. setCasecreatetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecreatetype The value of casecreatetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecreatetype_LikeSearch(String casecreatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecreatetype), xgetCValueCasecreatetype(), "CASECREATETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecreatetype_NotLikeSearch(String casecreatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecreatetype), xgetCValueCasecreatetype(), "CASECREATETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_PrefixSearch(String casecreatetype) {
        setCasecreatetype_LikeSearch(casecreatetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     */
    public void setCasecreatetype_IsNull() { regCasecreatetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     */
    public void setCasecreatetype_IsNullOrEmpty() { regCasecreatetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     */
    public void setCasecreatetype_IsNotNull() { regCasecreatetype(CK_ISNN, DOBJ); }

    protected void regCasecreatetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecreatetype(), "CASECREATETYPE"); }
    protected abstract ConditionValue xgetCValueCasecreatetype();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_Equal(String arrivalportdate) {
        doSetArrivalportdate_Equal(fRES(arrivalportdate));
    }

    protected void doSetArrivalportdate_Equal(String arrivalportdate) {
        regArrivalportdate(CK_EQ, arrivalportdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_NotEqual(String arrivalportdate) {
        doSetArrivalportdate_NotEqual(fRES(arrivalportdate));
    }

    protected void doSetArrivalportdate_NotEqual(String arrivalportdate) {
        regArrivalportdate(CK_NES, arrivalportdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_GreaterThan(String arrivalportdate) {
        regArrivalportdate(CK_GT, fRES(arrivalportdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_LessThan(String arrivalportdate) {
        regArrivalportdate(CK_LT, fRES(arrivalportdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_GreaterEqual(String arrivalportdate) {
        regArrivalportdate(CK_GE, fRES(arrivalportdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_LessEqual(String arrivalportdate) {
        regArrivalportdate(CK_LE, fRES(arrivalportdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdateList The collection of arrivalportdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_InScope(Collection<String> arrivalportdateList) {
        doSetArrivalportdate_InScope(arrivalportdateList);
    }

    protected void doSetArrivalportdate_InScope(Collection<String> arrivalportdateList) {
        regINS(CK_INS, cTL(arrivalportdateList), xgetCValueArrivalportdate(), "ARRIVALPORTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdateList The collection of arrivalportdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_NotInScope(Collection<String> arrivalportdateList) {
        doSetArrivalportdate_NotInScope(arrivalportdateList);
    }

    protected void doSetArrivalportdate_NotInScope(Collection<String> arrivalportdateList) {
        regINS(CK_NINS, cTL(arrivalportdateList), xgetCValueArrivalportdate(), "ARRIVALPORTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)} <br>
     * <pre>e.g. setArrivalportdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalportdate The value of arrivalportdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalportdate_LikeSearch(String arrivalportdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalportdate), xgetCValueArrivalportdate(), "ARRIVALPORTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalportdate_NotLikeSearch(String arrivalportdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalportdate), xgetCValueArrivalportdate(), "ARRIVALPORTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_PrefixSearch(String arrivalportdate) {
        setArrivalportdate_LikeSearch(arrivalportdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     */
    public void setArrivalportdate_IsNull() { regArrivalportdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     */
    public void setArrivalportdate_IsNullOrEmpty() { regArrivalportdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     */
    public void setArrivalportdate_IsNotNull() { regArrivalportdate(CK_ISNN, DOBJ); }

    protected void regArrivalportdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalportdate(), "ARRIVALPORTDATE"); }
    protected abstract ConditionValue xgetCValueArrivalportdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_Equal(String shipname) {
        doSetShipname_Equal(fRES(shipname));
    }

    protected void doSetShipname_Equal(String shipname) {
        regShipname(CK_EQ, shipname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_NotEqual(String shipname) {
        doSetShipname_NotEqual(fRES(shipname));
    }

    protected void doSetShipname_NotEqual(String shipname) {
        regShipname(CK_NES, shipname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_GreaterThan(String shipname) {
        regShipname(CK_GT, fRES(shipname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_LessThan(String shipname) {
        regShipname(CK_LT, fRES(shipname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_GreaterEqual(String shipname) {
        regShipname(CK_GE, fRES(shipname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_LessEqual(String shipname) {
        regShipname(CK_LE, fRES(shipname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipnameList The collection of shipname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_InScope(Collection<String> shipnameList) {
        doSetShipname_InScope(shipnameList);
    }

    protected void doSetShipname_InScope(Collection<String> shipnameList) {
        regINS(CK_INS, cTL(shipnameList), xgetCValueShipname(), "SHIPNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipnameList The collection of shipname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_NotInScope(Collection<String> shipnameList) {
        doSetShipname_NotInScope(shipnameList);
    }

    protected void doSetShipname_NotInScope(Collection<String> shipnameList) {
        regINS(CK_NINS, cTL(shipnameList), xgetCValueShipname(), "SHIPNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)} <br>
     * <pre>e.g. setShipname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipname The value of shipname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipname_LikeSearch(String shipname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipname), xgetCValueShipname(), "SHIPNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipname_NotLikeSearch(String shipname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipname), xgetCValueShipname(), "SHIPNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_PrefixSearch(String shipname) {
        setShipname_LikeSearch(shipname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     */
    public void setShipname_IsNull() { regShipname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     */
    public void setShipname_IsNullOrEmpty() { regShipname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     */
    public void setShipname_IsNotNull() { regShipname(CK_ISNN, DOBJ); }

    protected void regShipname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipname(), "SHIPNAME"); }
    protected abstract ConditionValue xgetCValueShipname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_Equal(String locgroup) {
        doSetLocgroup_Equal(fRES(locgroup));
    }

    protected void doSetLocgroup_Equal(String locgroup) {
        regLocgroup(CK_EQ, locgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotEqual(String locgroup) {
        doSetLocgroup_NotEqual(fRES(locgroup));
    }

    protected void doSetLocgroup_NotEqual(String locgroup) {
        regLocgroup(CK_NES, locgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterThan(String locgroup) {
        regLocgroup(CK_GT, fRES(locgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessThan(String locgroup) {
        regLocgroup(CK_LT, fRES(locgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterEqual(String locgroup) {
        regLocgroup(CK_GE, fRES(locgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessEqual(String locgroup) {
        regLocgroup(CK_LE, fRES(locgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroupList The collection of locgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_InScope(Collection<String> locgroupList) {
        doSetLocgroup_InScope(locgroupList);
    }

    protected void doSetLocgroup_InScope(Collection<String> locgroupList) {
        regINS(CK_INS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroupList The collection of locgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotInScope(Collection<String> locgroupList) {
        doSetLocgroup_NotInScope(locgroupList);
    }

    protected void doSetLocgroup_NotInScope(Collection<String> locgroupList) {
        regINS(CK_NINS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)} <br>
     * <pre>e.g. setLocgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locgroup The value of locgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocgroup_LikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocgroup_NotLikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_PrefixSearch(String locgroup) {
        setLocgroup_LikeSearch(locgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     */
    public void setLocgroup_IsNull() { regLocgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     */
    public void setLocgroup_IsNullOrEmpty() { regLocgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     */
    public void setLocgroup_IsNotNull() { regLocgroup(CK_ISNN, DOBJ); }

    protected void regLocgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocgroup(), "LOCGROUP"); }
    protected abstract ConditionValue xgetCValueLocgroup();

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
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_Equal(String shipdate) {
        doSetShipdate_Equal(fRES(shipdate));
    }

    protected void doSetShipdate_Equal(String shipdate) {
        regShipdate(CK_EQ, shipdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotEqual(String shipdate) {
        doSetShipdate_NotEqual(fRES(shipdate));
    }

    protected void doSetShipdate_NotEqual(String shipdate) {
        regShipdate(CK_NES, shipdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterThan(String shipdate) {
        regShipdate(CK_GT, fRES(shipdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessThan(String shipdate) {
        regShipdate(CK_LT, fRES(shipdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterEqual(String shipdate) {
        regShipdate(CK_GE, fRES(shipdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessEqual(String shipdate) {
        regShipdate(CK_LE, fRES(shipdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdateList The collection of shipdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_InScope(Collection<String> shipdateList) {
        doSetShipdate_InScope(shipdateList);
    }

    protected void doSetShipdate_InScope(Collection<String> shipdateList) {
        regINS(CK_INS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdateList The collection of shipdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotInScope(Collection<String> shipdateList) {
        doSetShipdate_NotInScope(shipdateList);
    }

    protected void doSetShipdate_NotInScope(Collection<String> shipdateList) {
        regINS(CK_NINS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)} <br>
     * <pre>e.g. setShipdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipdate The value of shipdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipdate_LikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipdate_NotLikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_PrefixSearch(String shipdate) {
        setShipdate_LikeSearch(shipdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNull() { regShipdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNullOrEmpty() { regShipdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNotNull() { regShipdate(CK_ISNN, DOBJ); }

    protected void regShipdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipdate(), "SHIPDATE"); }
    protected abstract ConditionValue xgetCValueShipdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_Equal(String shiptocd) {
        doSetShiptocd_Equal(fRES(shiptocd));
    }

    protected void doSetShiptocd_Equal(String shiptocd) {
        regShiptocd(CK_EQ, shiptocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotEqual(String shiptocd) {
        doSetShiptocd_NotEqual(fRES(shiptocd));
    }

    protected void doSetShiptocd_NotEqual(String shiptocd) {
        regShiptocd(CK_NES, shiptocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocdList The collection of shiptocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_InScope(Collection<String> shiptocdList) {
        doSetShiptocd_InScope(shiptocdList);
    }

    protected void doSetShiptocd_InScope(Collection<String> shiptocdList) {
        regINS(CK_INS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocdList The collection of shiptocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotInScope(Collection<String> shiptocdList) {
        doSetShiptocd_NotInScope(shiptocdList);
    }

    protected void doSetShiptocd_NotInScope(Collection<String> shiptocdList) {
        regINS(CK_NINS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)} <br>
     * <pre>e.g. setShiptocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocd The value of shiptocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocd_LikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_Equal(Long examsts) {
        doSetExamsts_Equal(examsts);
    }

    protected void doSetExamsts_Equal(Long examsts) {
        regExamsts(CK_EQ, examsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_NotEqual(Long examsts) {
        doSetExamsts_NotEqual(examsts);
    }

    protected void doSetExamsts_NotEqual(Long examsts) {
        regExamsts(CK_NES, examsts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_GreaterThan(Long examsts) {
        regExamsts(CK_GT, examsts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_LessThan(Long examsts) {
        regExamsts(CK_LT, examsts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_GreaterEqual(Long examsts) {
        regExamsts(CK_GE, examsts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_LessEqual(Long examsts) {
        regExamsts(CK_LE, examsts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param minNumber The min number of examsts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of examsts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExamsts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExamsts(), "EXAMSTS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examstsList The collection of examsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_InScope(Collection<Long> examstsList) {
        doSetExamsts_InScope(examstsList);
    }

    protected void doSetExamsts_InScope(Collection<Long> examstsList) {
        regINS(CK_INS, cTL(examstsList), xgetCValueExamsts(), "EXAMSTS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examstsList The collection of examsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_NotInScope(Collection<Long> examstsList) {
        doSetExamsts_NotInScope(examstsList);
    }

    protected void doSetExamsts_NotInScope(Collection<Long> examstsList) {
        regINS(CK_NINS, cTL(examstsList), xgetCValueExamsts(), "EXAMSTS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     */
    public void setExamsts_IsNull() { regExamsts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     */
    public void setExamsts_IsNotNull() { regExamsts(CK_ISNN, DOBJ); }

    protected void regExamsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamsts(), "EXAMSTS"); }
    protected abstract ConditionValue xgetCValueExamsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_Equal(String tokuhancd) {
        doSetTokuhancd_Equal(fRES(tokuhancd));
    }

    protected void doSetTokuhancd_Equal(String tokuhancd) {
        regTokuhancd(CK_EQ, tokuhancd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_NotEqual(String tokuhancd) {
        doSetTokuhancd_NotEqual(fRES(tokuhancd));
    }

    protected void doSetTokuhancd_NotEqual(String tokuhancd) {
        regTokuhancd(CK_NES, tokuhancd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_GreaterThan(String tokuhancd) {
        regTokuhancd(CK_GT, fRES(tokuhancd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_LessThan(String tokuhancd) {
        regTokuhancd(CK_LT, fRES(tokuhancd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_GreaterEqual(String tokuhancd) {
        regTokuhancd(CK_GE, fRES(tokuhancd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_LessEqual(String tokuhancd) {
        regTokuhancd(CK_LE, fRES(tokuhancd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancdList The collection of tokuhancd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_InScope(Collection<String> tokuhancdList) {
        doSetTokuhancd_InScope(tokuhancdList);
    }

    protected void doSetTokuhancd_InScope(Collection<String> tokuhancdList) {
        regINS(CK_INS, cTL(tokuhancdList), xgetCValueTokuhancd(), "TOKUHANCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancdList The collection of tokuhancd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_NotInScope(Collection<String> tokuhancdList) {
        doSetTokuhancd_NotInScope(tokuhancdList);
    }

    protected void doSetTokuhancd_NotInScope(Collection<String> tokuhancdList) {
        regINS(CK_NINS, cTL(tokuhancdList), xgetCValueTokuhancd(), "TOKUHANCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)} <br>
     * <pre>e.g. setTokuhancd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tokuhancd The value of tokuhancd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTokuhancd_LikeSearch(String tokuhancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tokuhancd), xgetCValueTokuhancd(), "TOKUHANCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTokuhancd_NotLikeSearch(String tokuhancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tokuhancd), xgetCValueTokuhancd(), "TOKUHANCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_PrefixSearch(String tokuhancd) {
        setTokuhancd_LikeSearch(tokuhancd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     */
    public void setTokuhancd_IsNull() { regTokuhancd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     */
    public void setTokuhancd_IsNullOrEmpty() { regTokuhancd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     */
    public void setTokuhancd_IsNotNull() { regTokuhancd(CK_ISNN, DOBJ); }

    protected void regTokuhancd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTokuhancd(), "TOKUHANCD"); }
    protected abstract ConditionValue xgetCValueTokuhancd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_Equal(String senderLocation) {
        doSetSenderLocation_Equal(fRES(senderLocation));
    }

    protected void doSetSenderLocation_Equal(String senderLocation) {
        regSenderLocation(CK_EQ, senderLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotEqual(String senderLocation) {
        doSetSenderLocation_NotEqual(fRES(senderLocation));
    }

    protected void doSetSenderLocation_NotEqual(String senderLocation) {
        regSenderLocation(CK_NES, senderLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterThan(String senderLocation) {
        regSenderLocation(CK_GT, fRES(senderLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessThan(String senderLocation) {
        regSenderLocation(CK_LT, fRES(senderLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterEqual(String senderLocation) {
        regSenderLocation(CK_GE, fRES(senderLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessEqual(String senderLocation) {
        regSenderLocation(CK_LE, fRES(senderLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocationList The collection of senderLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_InScope(Collection<String> senderLocationList) {
        doSetSenderLocation_InScope(senderLocationList);
    }

    protected void doSetSenderLocation_InScope(Collection<String> senderLocationList) {
        regINS(CK_INS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocationList The collection of senderLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotInScope(Collection<String> senderLocationList) {
        doSetSenderLocation_NotInScope(senderLocationList);
    }

    protected void doSetSenderLocation_NotInScope(Collection<String> senderLocationList) {
        regINS(CK_NINS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)} <br>
     * <pre>e.g. setSenderLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param senderLocation The value of senderLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSenderLocation_LikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSenderLocation_NotLikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_PrefixSearch(String senderLocation) {
        setSenderLocation_LikeSearch(senderLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNull() { regSenderLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNullOrEmpty() { regSenderLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNotNull() { regSenderLocation(CK_ISNN, DOBJ); }

    protected void regSenderLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSenderLocation(), "SENDER_LOCATION"); }
    protected abstract ConditionValue xgetCValueSenderLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_Equal(String receiverLocation) {
        doSetReceiverLocation_Equal(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_Equal(String receiverLocation) {
        regReceiverLocation(CK_EQ, receiverLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotEqual(String receiverLocation) {
        doSetReceiverLocation_NotEqual(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_NotEqual(String receiverLocation) {
        regReceiverLocation(CK_NES, receiverLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterThan(String receiverLocation) {
        regReceiverLocation(CK_GT, fRES(receiverLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessThan(String receiverLocation) {
        regReceiverLocation(CK_LT, fRES(receiverLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterEqual(String receiverLocation) {
        regReceiverLocation(CK_GE, fRES(receiverLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessEqual(String receiverLocation) {
        regReceiverLocation(CK_LE, fRES(receiverLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocationList The collection of receiverLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_InScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_InScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_InScope(Collection<String> receiverLocationList) {
        regINS(CK_INS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocationList The collection of receiverLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_NotInScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        regINS(CK_NINS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)} <br>
     * <pre>e.g. setReceiverLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiverLocation The value of receiverLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiverLocation_LikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiverLocation_NotLikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_PrefixSearch(String receiverLocation) {
        setReceiverLocation_LikeSearch(receiverLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNull() { regReceiverLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNullOrEmpty() { regReceiverLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNotNull() { regReceiverLocation(CK_ISNN, DOBJ); }

    protected void regReceiverLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiverLocation(), "RECEIVER_LOCATION"); }
    protected abstract ConditionValue xgetCValueReceiverLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_Equal(String shipmentId) {
        doSetShipmentId_Equal(fRES(shipmentId));
    }

    protected void doSetShipmentId_Equal(String shipmentId) {
        regShipmentId(CK_EQ, shipmentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotEqual(String shipmentId) {
        doSetShipmentId_NotEqual(fRES(shipmentId));
    }

    protected void doSetShipmentId_NotEqual(String shipmentId) {
        regShipmentId(CK_NES, shipmentId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterThan(String shipmentId) {
        regShipmentId(CK_GT, fRES(shipmentId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessThan(String shipmentId) {
        regShipmentId(CK_LT, fRES(shipmentId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterEqual(String shipmentId) {
        regShipmentId(CK_GE, fRES(shipmentId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessEqual(String shipmentId) {
        regShipmentId(CK_LE, fRES(shipmentId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentIdList The collection of shipmentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_InScope(Collection<String> shipmentIdList) {
        doSetShipmentId_InScope(shipmentIdList);
    }

    protected void doSetShipmentId_InScope(Collection<String> shipmentIdList) {
        regINS(CK_INS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentIdList The collection of shipmentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotInScope(Collection<String> shipmentIdList) {
        doSetShipmentId_NotInScope(shipmentIdList);
    }

    protected void doSetShipmentId_NotInScope(Collection<String> shipmentIdList) {
        regINS(CK_NINS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)} <br>
     * <pre>e.g. setShipmentId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentId The value of shipmentId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentId_LikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentId_NotLikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_PrefixSearch(String shipmentId) {
        setShipmentId_LikeSearch(shipmentId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNull() { regShipmentId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNullOrEmpty() { regShipmentId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNotNull() { regShipmentId(CK_ISNN, DOBJ); }

    protected void regShipmentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentId(), "SHIPMENT_ID"); }
    protected abstract ConditionValue xgetCValueShipmentId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_Equal(String shipmentDate) {
        doSetShipmentDate_Equal(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_Equal(String shipmentDate) {
        regShipmentDate(CK_EQ, shipmentDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotEqual(String shipmentDate) {
        doSetShipmentDate_NotEqual(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_NotEqual(String shipmentDate) {
        regShipmentDate(CK_NES, shipmentDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterThan(String shipmentDate) {
        regShipmentDate(CK_GT, fRES(shipmentDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessThan(String shipmentDate) {
        regShipmentDate(CK_LT, fRES(shipmentDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterEqual(String shipmentDate) {
        regShipmentDate(CK_GE, fRES(shipmentDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessEqual(String shipmentDate) {
        regShipmentDate(CK_LE, fRES(shipmentDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDateList The collection of shipmentDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_InScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_InScope(shipmentDateList);
    }

    protected void doSetShipmentDate_InScope(Collection<String> shipmentDateList) {
        regINS(CK_INS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDateList The collection of shipmentDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_NotInScope(shipmentDateList);
    }

    protected void doSetShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        regINS(CK_NINS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)} <br>
     * <pre>e.g. setShipmentDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentDate The value of shipmentDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentDate_LikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentDate_NotLikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_PrefixSearch(String shipmentDate) {
        setShipmentDate_LikeSearch(shipmentDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNull() { regShipmentDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNullOrEmpty() { regShipmentDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNotNull() { regShipmentDate(CK_ISNN, DOBJ); }

    protected void regShipmentDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentDate(), "SHIPMENT_DATE"); }
    protected abstract ConditionValue xgetCValueShipmentDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_Equal(String numberOfPallets) {
        doSetNumberOfPallets_Equal(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_Equal(String numberOfPallets) {
        regNumberOfPallets(CK_EQ, numberOfPallets);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotEqual(String numberOfPallets) {
        doSetNumberOfPallets_NotEqual(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_NotEqual(String numberOfPallets) {
        regNumberOfPallets(CK_NES, numberOfPallets);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterThan(String numberOfPallets) {
        regNumberOfPallets(CK_GT, fRES(numberOfPallets));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessThan(String numberOfPallets) {
        regNumberOfPallets(CK_LT, fRES(numberOfPallets));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterEqual(String numberOfPallets) {
        regNumberOfPallets(CK_GE, fRES(numberOfPallets));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessEqual(String numberOfPallets) {
        regNumberOfPallets(CK_LE, fRES(numberOfPallets));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPalletsList The collection of numberOfPallets as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_InScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        regINS(CK_INS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPalletsList The collection of numberOfPallets as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_NotInScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        regINS(CK_NINS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)} <br>
     * <pre>e.g. setNumberOfPallets_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberOfPallets The value of numberOfPallets as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberOfPallets_LikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberOfPallets_NotLikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_PrefixSearch(String numberOfPallets) {
        setNumberOfPallets_LikeSearch(numberOfPallets, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNull() { regNumberOfPallets(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNullOrEmpty() { regNumberOfPallets(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNotNull() { regNumberOfPallets(CK_ISNN, DOBJ); }

    protected void regNumberOfPallets(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS"); }
    protected abstract ConditionValue xgetCValueNumberOfPallets();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_Equal(String tkhnorderno) {
        doSetTkhnorderno_Equal(fRES(tkhnorderno));
    }

    protected void doSetTkhnorderno_Equal(String tkhnorderno) {
        regTkhnorderno(CK_EQ, tkhnorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_NotEqual(String tkhnorderno) {
        doSetTkhnorderno_NotEqual(fRES(tkhnorderno));
    }

    protected void doSetTkhnorderno_NotEqual(String tkhnorderno) {
        regTkhnorderno(CK_NES, tkhnorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_GreaterThan(String tkhnorderno) {
        regTkhnorderno(CK_GT, fRES(tkhnorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_LessThan(String tkhnorderno) {
        regTkhnorderno(CK_LT, fRES(tkhnorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_GreaterEqual(String tkhnorderno) {
        regTkhnorderno(CK_GE, fRES(tkhnorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_LessEqual(String tkhnorderno) {
        regTkhnorderno(CK_LE, fRES(tkhnorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnordernoList The collection of tkhnorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_InScope(Collection<String> tkhnordernoList) {
        doSetTkhnorderno_InScope(tkhnordernoList);
    }

    protected void doSetTkhnorderno_InScope(Collection<String> tkhnordernoList) {
        regINS(CK_INS, cTL(tkhnordernoList), xgetCValueTkhnorderno(), "TKHNORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnordernoList The collection of tkhnorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_NotInScope(Collection<String> tkhnordernoList) {
        doSetTkhnorderno_NotInScope(tkhnordernoList);
    }

    protected void doSetTkhnorderno_NotInScope(Collection<String> tkhnordernoList) {
        regINS(CK_NINS, cTL(tkhnordernoList), xgetCValueTkhnorderno(), "TKHNORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)} <br>
     * <pre>e.g. setTkhnorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tkhnorderno The value of tkhnorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTkhnorderno_LikeSearch(String tkhnorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tkhnorderno), xgetCValueTkhnorderno(), "TKHNORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTkhnorderno_NotLikeSearch(String tkhnorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tkhnorderno), xgetCValueTkhnorderno(), "TKHNORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_PrefixSearch(String tkhnorderno) {
        setTkhnorderno_LikeSearch(tkhnorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     */
    public void setTkhnorderno_IsNull() { regTkhnorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     */
    public void setTkhnorderno_IsNullOrEmpty() { regTkhnorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     */
    public void setTkhnorderno_IsNotNull() { regTkhnorderno(CK_ISNN, DOBJ); }

    protected void regTkhnorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTkhnorderno(), "TKHNORDERNO"); }
    protected abstract ConditionValue xgetCValueTkhnorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_Equal(String srccd) {
        doSetSrccd_Equal(fRES(srccd));
    }

    protected void doSetSrccd_Equal(String srccd) {
        regSrccd(CK_EQ, srccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_NotEqual(String srccd) {
        doSetSrccd_NotEqual(fRES(srccd));
    }

    protected void doSetSrccd_NotEqual(String srccd) {
        regSrccd(CK_NES, srccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_GreaterThan(String srccd) {
        regSrccd(CK_GT, fRES(srccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_LessThan(String srccd) {
        regSrccd(CK_LT, fRES(srccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_GreaterEqual(String srccd) {
        regSrccd(CK_GE, fRES(srccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_LessEqual(String srccd) {
        regSrccd(CK_LE, fRES(srccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccdList The collection of srccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_InScope(Collection<String> srccdList) {
        doSetSrccd_InScope(srccdList);
    }

    protected void doSetSrccd_InScope(Collection<String> srccdList) {
        regINS(CK_INS, cTL(srccdList), xgetCValueSrccd(), "SRCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccdList The collection of srccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_NotInScope(Collection<String> srccdList) {
        doSetSrccd_NotInScope(srccdList);
    }

    protected void doSetSrccd_NotInScope(Collection<String> srccdList) {
        regINS(CK_NINS, cTL(srccdList), xgetCValueSrccd(), "SRCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)} <br>
     * <pre>e.g. setSrccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srccd The value of srccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrccd_LikeSearch(String srccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srccd), xgetCValueSrccd(), "SRCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrccd_NotLikeSearch(String srccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srccd), xgetCValueSrccd(), "SRCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_PrefixSearch(String srccd) {
        setSrccd_LikeSearch(srccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     */
    public void setSrccd_IsNull() { regSrccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     */
    public void setSrccd_IsNullOrEmpty() { regSrccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     */
    public void setSrccd_IsNotNull() { regSrccd(CK_ISNN, DOBJ); }

    protected void regSrccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrccd(), "SRCCD"); }
    protected abstract ConditionValue xgetCValueSrccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_Equal(String blno) {
        doSetBlno_Equal(fRES(blno));
    }

    protected void doSetBlno_Equal(String blno) {
        regBlno(CK_EQ, blno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_NotEqual(String blno) {
        doSetBlno_NotEqual(fRES(blno));
    }

    protected void doSetBlno_NotEqual(String blno) {
        regBlno(CK_NES, blno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_GreaterThan(String blno) {
        regBlno(CK_GT, fRES(blno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_LessThan(String blno) {
        regBlno(CK_LT, fRES(blno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_GreaterEqual(String blno) {
        regBlno(CK_GE, fRES(blno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_LessEqual(String blno) {
        regBlno(CK_LE, fRES(blno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blnoList The collection of blno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_InScope(Collection<String> blnoList) {
        doSetBlno_InScope(blnoList);
    }

    protected void doSetBlno_InScope(Collection<String> blnoList) {
        regINS(CK_INS, cTL(blnoList), xgetCValueBlno(), "BLNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blnoList The collection of blno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_NotInScope(Collection<String> blnoList) {
        doSetBlno_NotInScope(blnoList);
    }

    protected void doSetBlno_NotInScope(Collection<String> blnoList) {
        regINS(CK_NINS, cTL(blnoList), xgetCValueBlno(), "BLNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)} <br>
     * <pre>e.g. setBlno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blno The value of blno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlno_LikeSearch(String blno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blno), xgetCValueBlno(), "BLNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlno_NotLikeSearch(String blno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blno), xgetCValueBlno(), "BLNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_PrefixSearch(String blno) {
        setBlno_LikeSearch(blno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     */
    public void setBlno_IsNull() { regBlno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     */
    public void setBlno_IsNullOrEmpty() { regBlno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     */
    public void setBlno_IsNotNull() { regBlno(CK_ISNN, DOBJ); }

    protected void regBlno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlno(), "BLNO"); }
    protected abstract ConditionValue xgetCValueBlno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_Equal(String invoiceno) {
        doSetInvoiceno_Equal(fRES(invoiceno));
    }

    protected void doSetInvoiceno_Equal(String invoiceno) {
        regInvoiceno(CK_EQ, invoiceno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_NotEqual(String invoiceno) {
        doSetInvoiceno_NotEqual(fRES(invoiceno));
    }

    protected void doSetInvoiceno_NotEqual(String invoiceno) {
        regInvoiceno(CK_NES, invoiceno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_GreaterThan(String invoiceno) {
        regInvoiceno(CK_GT, fRES(invoiceno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_LessThan(String invoiceno) {
        regInvoiceno(CK_LT, fRES(invoiceno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_GreaterEqual(String invoiceno) {
        regInvoiceno(CK_GE, fRES(invoiceno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_LessEqual(String invoiceno) {
        regInvoiceno(CK_LE, fRES(invoiceno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoicenoList The collection of invoiceno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_InScope(Collection<String> invoicenoList) {
        doSetInvoiceno_InScope(invoicenoList);
    }

    protected void doSetInvoiceno_InScope(Collection<String> invoicenoList) {
        regINS(CK_INS, cTL(invoicenoList), xgetCValueInvoiceno(), "INVOICENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoicenoList The collection of invoiceno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_NotInScope(Collection<String> invoicenoList) {
        doSetInvoiceno_NotInScope(invoicenoList);
    }

    protected void doSetInvoiceno_NotInScope(Collection<String> invoicenoList) {
        regINS(CK_NINS, cTL(invoicenoList), xgetCValueInvoiceno(), "INVOICENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)} <br>
     * <pre>e.g. setInvoiceno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceno The value of invoiceno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceno_LikeSearch(String invoiceno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceno), xgetCValueInvoiceno(), "INVOICENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceno_NotLikeSearch(String invoiceno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceno), xgetCValueInvoiceno(), "INVOICENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_PrefixSearch(String invoiceno) {
        setInvoiceno_LikeSearch(invoiceno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     */
    public void setInvoiceno_IsNull() { regInvoiceno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     */
    public void setInvoiceno_IsNullOrEmpty() { regInvoiceno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     */
    public void setInvoiceno_IsNotNull() { regInvoiceno(CK_ISNN, DOBJ); }

    protected void regInvoiceno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceno(), "INVOICENO"); }
    protected abstract ConditionValue xgetCValueInvoiceno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_Equal(String sscc) {
        doSetSscc_Equal(fRES(sscc));
    }

    protected void doSetSscc_Equal(String sscc) {
        regSscc(CK_EQ, sscc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotEqual(String sscc) {
        doSetSscc_NotEqual(fRES(sscc));
    }

    protected void doSetSscc_NotEqual(String sscc) {
        regSscc(CK_NES, sscc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterThan(String sscc) {
        regSscc(CK_GT, fRES(sscc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessThan(String sscc) {
        regSscc(CK_LT, fRES(sscc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterEqual(String sscc) {
        regSscc(CK_GE, fRES(sscc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessEqual(String sscc) {
        regSscc(CK_LE, fRES(sscc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param ssccList The collection of sscc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_InScope(Collection<String> ssccList) {
        doSetSscc_InScope(ssccList);
    }

    protected void doSetSscc_InScope(Collection<String> ssccList) {
        regINS(CK_INS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param ssccList The collection of sscc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotInScope(Collection<String> ssccList) {
        doSetSscc_NotInScope(ssccList);
    }

    protected void doSetSscc_NotInScope(Collection<String> ssccList) {
        regINS(CK_NINS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)} <br>
     * <pre>e.g. setSscc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscc The value of sscc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscc_LikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscc_NotLikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_PrefixSearch(String sscc) {
        setSscc_LikeSearch(sscc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNull() { regSscc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNullOrEmpty() { regSscc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNotNull() { regSscc(CK_ISNN, DOBJ); }

    protected void regSscc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscc(), "SSCC"); }
    protected abstract ConditionValue xgetCValueSscc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_Equal(String caseno) {
        doSetCaseno_Equal(fRES(caseno));
    }

    protected void doSetCaseno_Equal(String caseno) {
        regCaseno(CK_EQ, caseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_NotEqual(String caseno) {
        doSetCaseno_NotEqual(fRES(caseno));
    }

    protected void doSetCaseno_NotEqual(String caseno) {
        regCaseno(CK_NES, caseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_GreaterThan(String caseno) {
        regCaseno(CK_GT, fRES(caseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_LessThan(String caseno) {
        regCaseno(CK_LT, fRES(caseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_GreaterEqual(String caseno) {
        regCaseno(CK_GE, fRES(caseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_LessEqual(String caseno) {
        regCaseno(CK_LE, fRES(caseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param casenoList The collection of caseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_InScope(Collection<String> casenoList) {
        doSetCaseno_InScope(casenoList);
    }

    protected void doSetCaseno_InScope(Collection<String> casenoList) {
        regINS(CK_INS, cTL(casenoList), xgetCValueCaseno(), "CASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param casenoList The collection of caseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_NotInScope(Collection<String> casenoList) {
        doSetCaseno_NotInScope(casenoList);
    }

    protected void doSetCaseno_NotInScope(Collection<String> casenoList) {
        regINS(CK_NINS, cTL(casenoList), xgetCValueCaseno(), "CASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)} <br>
     * <pre>e.g. setCaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseno The value of caseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseno_LikeSearch(String caseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseno), xgetCValueCaseno(), "CASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseno_NotLikeSearch(String caseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseno), xgetCValueCaseno(), "CASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_PrefixSearch(String caseno) {
        setCaseno_LikeSearch(caseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNull() { regCaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNullOrEmpty() { regCaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNotNull() { regCaseno(CK_ISNN, DOBJ); }

    protected void regCaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseno(), "CASENO"); }
    protected abstract ConditionValue xgetCValueCaseno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_Equal(Long invNum) {
        doSetInvNum_Equal(invNum);
    }

    protected void doSetInvNum_Equal(Long invNum) {
        regInvNum(CK_EQ, invNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_NotEqual(Long invNum) {
        doSetInvNum_NotEqual(invNum);
    }

    protected void doSetInvNum_NotEqual(Long invNum) {
        regInvNum(CK_NES, invNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_GreaterThan(Long invNum) {
        regInvNum(CK_GT, invNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_LessThan(Long invNum) {
        regInvNum(CK_LT, invNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_GreaterEqual(Long invNum) {
        regInvNum(CK_GE, invNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_LessEqual(Long invNum) {
        regInvNum(CK_LE, invNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param minNumber The min number of invNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvNum(), "INV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNumList The collection of invNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_InScope(Collection<Long> invNumList) {
        doSetInvNum_InScope(invNumList);
    }

    protected void doSetInvNum_InScope(Collection<Long> invNumList) {
        regINS(CK_INS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNumList The collection of invNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotInScope(Collection<Long> invNumList) {
        doSetInvNum_NotInScope(invNumList);
    }

    protected void doSetInvNum_NotInScope(Collection<Long> invNumList) {
        regINS(CK_NINS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     */
    public void setInvNum_IsNull() { regInvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     */
    public void setInvNum_IsNotNull() { regInvNum(CK_ISNN, DOBJ); }

    protected void regInvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvNum(), "INV_NUM"); }
    protected abstract ConditionValue xgetCValueInvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_Equal(Long sortNum) {
        doSetSortNum_Equal(sortNum);
    }

    protected void doSetSortNum_Equal(Long sortNum) {
        regSortNum(CK_EQ, sortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_NotEqual(Long sortNum) {
        doSetSortNum_NotEqual(sortNum);
    }

    protected void doSetSortNum_NotEqual(Long sortNum) {
        regSortNum(CK_NES, sortNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_GreaterThan(Long sortNum) {
        regSortNum(CK_GT, sortNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_LessThan(Long sortNum) {
        regSortNum(CK_LT, sortNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_GreaterEqual(Long sortNum) {
        regSortNum(CK_GE, sortNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_LessEqual(Long sortNum) {
        regSortNum(CK_LE, sortNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param minNumber The min number of sortNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortNum(), "SORT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNumList The collection of sortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_InScope(Collection<Long> sortNumList) {
        doSetSortNum_InScope(sortNumList);
    }

    protected void doSetSortNum_InScope(Collection<Long> sortNumList) {
        regINS(CK_INS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNumList The collection of sortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_NotInScope(Collection<Long> sortNumList) {
        doSetSortNum_NotInScope(sortNumList);
    }

    protected void doSetSortNum_NotInScope(Collection<Long> sortNumList) {
        regINS(CK_NINS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     */
    public void setSortNum_IsNull() { regSortNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     */
    public void setSortNum_IsNotNull() { regSortNum(CK_ISNN, DOBJ); }

    protected void regSortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortNum(), "SORT_NUM"); }
    protected abstract ConditionValue xgetCValueSortNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_Equal(Long adoptNum) {
        doSetAdoptNum_Equal(adoptNum);
    }

    protected void doSetAdoptNum_Equal(Long adoptNum) {
        regAdoptNum(CK_EQ, adoptNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_NotEqual(Long adoptNum) {
        doSetAdoptNum_NotEqual(adoptNum);
    }

    protected void doSetAdoptNum_NotEqual(Long adoptNum) {
        regAdoptNum(CK_NES, adoptNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterThan(Long adoptNum) {
        regAdoptNum(CK_GT, adoptNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_LessThan(Long adoptNum) {
        regAdoptNum(CK_LT, adoptNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterEqual(Long adoptNum) {
        regAdoptNum(CK_GE, adoptNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_LessEqual(Long adoptNum) {
        regAdoptNum(CK_LE, adoptNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param minNumber The min number of adoptNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adoptNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdoptNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdoptNum(), "ADOPT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNumList The collection of adoptNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_InScope(Collection<Long> adoptNumList) {
        doSetAdoptNum_InScope(adoptNumList);
    }

    protected void doSetAdoptNum_InScope(Collection<Long> adoptNumList) {
        regINS(CK_INS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNumList The collection of adoptNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_NotInScope(Collection<Long> adoptNumList) {
        doSetAdoptNum_NotInScope(adoptNumList);
    }

    protected void doSetAdoptNum_NotInScope(Collection<Long> adoptNumList) {
        regINS(CK_NINS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     */
    public void setAdoptNum_IsNull() { regAdoptNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     */
    public void setAdoptNum_IsNotNull() { regAdoptNum(CK_ISNN, DOBJ); }

    protected void regAdoptNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdoptNum(), "ADOPT_NUM"); }
    protected abstract ConditionValue xgetCValueAdoptNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_Equal(String reservearea) {
        doSetReservearea_Equal(fRES(reservearea));
    }

    protected void doSetReservearea_Equal(String reservearea) {
        regReservearea(CK_EQ, reservearea);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_NotEqual(String reservearea) {
        doSetReservearea_NotEqual(fRES(reservearea));
    }

    protected void doSetReservearea_NotEqual(String reservearea) {
        regReservearea(CK_NES, reservearea);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_GreaterThan(String reservearea) {
        regReservearea(CK_GT, fRES(reservearea));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_LessThan(String reservearea) {
        regReservearea(CK_LT, fRES(reservearea));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_GreaterEqual(String reservearea) {
        regReservearea(CK_GE, fRES(reservearea));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_LessEqual(String reservearea) {
        regReservearea(CK_LE, fRES(reservearea));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reserveareaList The collection of reservearea as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_InScope(Collection<String> reserveareaList) {
        doSetReservearea_InScope(reserveareaList);
    }

    protected void doSetReservearea_InScope(Collection<String> reserveareaList) {
        regINS(CK_INS, cTL(reserveareaList), xgetCValueReservearea(), "RESERVEAREA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reserveareaList The collection of reservearea as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_NotInScope(Collection<String> reserveareaList) {
        doSetReservearea_NotInScope(reserveareaList);
    }

    protected void doSetReservearea_NotInScope(Collection<String> reserveareaList) {
        regINS(CK_NINS, cTL(reserveareaList), xgetCValueReservearea(), "RESERVEAREA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(100)} <br>
     * <pre>e.g. setReservearea_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reservearea The value of reservearea as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReservearea_LikeSearch(String reservearea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reservearea), xgetCValueReservearea(), "RESERVEAREA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReservearea_NotLikeSearch(String reservearea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reservearea), xgetCValueReservearea(), "RESERVEAREA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     * @param reservearea The value of reservearea as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_PrefixSearch(String reservearea) {
        setReservearea_LikeSearch(reservearea, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     */
    public void setReservearea_IsNull() { regReservearea(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     */
    public void setReservearea_IsNullOrEmpty() { regReservearea(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(100)}
     */
    public void setReservearea_IsNotNull() { regReservearea(CK_ISNN, DOBJ); }

    protected void regReservearea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservearea(), "RESERVEAREA"); }
    protected abstract ConditionValue xgetCValueReservearea();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_Equal(String vaExtdata1) {
        doSetVaExtdata1_Equal(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_Equal(String vaExtdata1) {
        regVaExtdata1(CK_EQ, vaExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotEqual(String vaExtdata1) {
        doSetVaExtdata1_NotEqual(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_NotEqual(String vaExtdata1) {
        regVaExtdata1(CK_NES, vaExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterThan(String vaExtdata1) {
        regVaExtdata1(CK_GT, fRES(vaExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessThan(String vaExtdata1) {
        regVaExtdata1(CK_LT, fRES(vaExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterEqual(String vaExtdata1) {
        regVaExtdata1(CK_GE, fRES(vaExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessEqual(String vaExtdata1) {
        regVaExtdata1(CK_LE, fRES(vaExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_InScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        regINS(CK_INS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_NotInScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        regINS(CK_NINS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata1 The value of vaExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata1_LikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata1_NotLikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_PrefixSearch(String vaExtdata1) {
        setVaExtdata1_LikeSearch(vaExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNull() { regVaExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNullOrEmpty() { regVaExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNotNull() { regVaExtdata1(CK_ISNN, DOBJ); }

    protected void regVaExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata1(), "VA_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueVaExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_Equal(String vaExtdata2) {
        doSetVaExtdata2_Equal(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_Equal(String vaExtdata2) {
        regVaExtdata2(CK_EQ, vaExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotEqual(String vaExtdata2) {
        doSetVaExtdata2_NotEqual(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_NotEqual(String vaExtdata2) {
        regVaExtdata2(CK_NES, vaExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterThan(String vaExtdata2) {
        regVaExtdata2(CK_GT, fRES(vaExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessThan(String vaExtdata2) {
        regVaExtdata2(CK_LT, fRES(vaExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterEqual(String vaExtdata2) {
        regVaExtdata2(CK_GE, fRES(vaExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessEqual(String vaExtdata2) {
        regVaExtdata2(CK_LE, fRES(vaExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_InScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        regINS(CK_INS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_NotInScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        regINS(CK_NINS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata2 The value of vaExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata2_LikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata2_NotLikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_PrefixSearch(String vaExtdata2) {
        setVaExtdata2_LikeSearch(vaExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNull() { regVaExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNullOrEmpty() { regVaExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNotNull() { regVaExtdata2(CK_ISNN, DOBJ); }

    protected void regVaExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata2(), "VA_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueVaExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_Equal(String vaExtdata3) {
        doSetVaExtdata3_Equal(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_Equal(String vaExtdata3) {
        regVaExtdata3(CK_EQ, vaExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotEqual(String vaExtdata3) {
        doSetVaExtdata3_NotEqual(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_NotEqual(String vaExtdata3) {
        regVaExtdata3(CK_NES, vaExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterThan(String vaExtdata3) {
        regVaExtdata3(CK_GT, fRES(vaExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessThan(String vaExtdata3) {
        regVaExtdata3(CK_LT, fRES(vaExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterEqual(String vaExtdata3) {
        regVaExtdata3(CK_GE, fRES(vaExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessEqual(String vaExtdata3) {
        regVaExtdata3(CK_LE, fRES(vaExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_InScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        regINS(CK_INS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_NotInScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        regINS(CK_NINS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata3 The value of vaExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata3_LikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata3_NotLikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_PrefixSearch(String vaExtdata3) {
        setVaExtdata3_LikeSearch(vaExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNull() { regVaExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNullOrEmpty() { regVaExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNotNull() { regVaExtdata3(CK_ISNN, DOBJ); }

    protected void regVaExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata3(), "VA_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueVaExtdata3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(java.sql.Timestamp dtExtdata2) {
        regDtExtdata2(CK_EQ,  dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(java.sql.Timestamp dtExtdata2) {
        regDtExtdata2(CK_GT,  dtExtdata2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(java.sql.Timestamp dtExtdata2) {
        regDtExtdata2(CK_LT,  dtExtdata2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(java.sql.Timestamp dtExtdata2) {
        regDtExtdata2(CK_GE,  dtExtdata2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(java.sql.Timestamp dtExtdata2) {
        regDtExtdata2(CK_LE, dtExtdata2);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * <pre>e.g. setDtExtdata2_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dtExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dtExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDtExtdata2_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueDtExtdata2(), "DT_EXTDATA2", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of dtExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of dtExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setDtExtdata2_DateFromTo(Date fromDate, Date toDate) {
        setDtExtdata2_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_Equal(String palletNo) {
        doSetPalletNo_Equal(fRES(palletNo));
    }

    protected void doSetPalletNo_Equal(String palletNo) {
        regPalletNo(CK_EQ, palletNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_NotEqual(String palletNo) {
        doSetPalletNo_NotEqual(fRES(palletNo));
    }

    protected void doSetPalletNo_NotEqual(String palletNo) {
        regPalletNo(CK_NES, palletNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_GreaterThan(String palletNo) {
        regPalletNo(CK_GT, fRES(palletNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_LessThan(String palletNo) {
        regPalletNo(CK_LT, fRES(palletNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_GreaterEqual(String palletNo) {
        regPalletNo(CK_GE, fRES(palletNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_LessEqual(String palletNo) {
        regPalletNo(CK_LE, fRES(palletNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNoList The collection of palletNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_InScope(Collection<String> palletNoList) {
        doSetPalletNo_InScope(palletNoList);
    }

    protected void doSetPalletNo_InScope(Collection<String> palletNoList) {
        regINS(CK_INS, cTL(palletNoList), xgetCValuePalletNo(), "PALLET_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNoList The collection of palletNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_NotInScope(Collection<String> palletNoList) {
        doSetPalletNo_NotInScope(palletNoList);
    }

    protected void doSetPalletNo_NotInScope(Collection<String> palletNoList) {
        regINS(CK_NINS, cTL(palletNoList), xgetCValuePalletNo(), "PALLET_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLET_NO: {varchar(30)} <br>
     * <pre>e.g. setPalletNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletNo The value of palletNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletNo_LikeSearch(String palletNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletNo), xgetCValuePalletNo(), "PALLET_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletNo_NotLikeSearch(String palletNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletNo), xgetCValuePalletNo(), "PALLET_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLET_NO: {varchar(30)}
     * @param palletNo The value of palletNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_PrefixSearch(String palletNo) {
        setPalletNo_LikeSearch(palletNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     */
    public void setPalletNo_IsNull() { regPalletNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     */
    public void setPalletNo_IsNullOrEmpty() { regPalletNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_NO: {varchar(30)}
     */
    public void setPalletNo_IsNotNull() { regPalletNo(CK_ISNN, DOBJ); }

    protected void regPalletNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletNo(), "PALLET_NO"); }
    protected abstract ConditionValue xgetCValuePalletNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_Equal(String pickListKey) {
        doSetPickListKey_Equal(fRES(pickListKey));
    }

    protected void doSetPickListKey_Equal(String pickListKey) {
        regPickListKey(CK_EQ, pickListKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_NotEqual(String pickListKey) {
        doSetPickListKey_NotEqual(fRES(pickListKey));
    }

    protected void doSetPickListKey_NotEqual(String pickListKey) {
        regPickListKey(CK_NES, pickListKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_GreaterThan(String pickListKey) {
        regPickListKey(CK_GT, fRES(pickListKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_LessThan(String pickListKey) {
        regPickListKey(CK_LT, fRES(pickListKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_GreaterEqual(String pickListKey) {
        regPickListKey(CK_GE, fRES(pickListKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_LessEqual(String pickListKey) {
        regPickListKey(CK_LE, fRES(pickListKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKeyList The collection of pickListKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_InScope(Collection<String> pickListKeyList) {
        doSetPickListKey_InScope(pickListKeyList);
    }

    protected void doSetPickListKey_InScope(Collection<String> pickListKeyList) {
        regINS(CK_INS, cTL(pickListKeyList), xgetCValuePickListKey(), "PICK_LIST_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKeyList The collection of pickListKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_NotInScope(Collection<String> pickListKeyList) {
        doSetPickListKey_NotInScope(pickListKeyList);
    }

    protected void doSetPickListKey_NotInScope(Collection<String> pickListKeyList) {
        regINS(CK_NINS, cTL(pickListKeyList), xgetCValuePickListKey(), "PICK_LIST_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)} <br>
     * <pre>e.g. setPickListKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickListKey The value of pickListKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickListKey_LikeSearch(String pickListKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickListKey), xgetCValuePickListKey(), "PICK_LIST_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickListKey_NotLikeSearch(String pickListKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickListKey), xgetCValuePickListKey(), "PICK_LIST_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @param pickListKey The value of pickListKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_PrefixSearch(String pickListKey) {
        setPickListKey_LikeSearch(pickListKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     */
    public void setPickListKey_IsNull() { regPickListKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     */
    public void setPickListKey_IsNullOrEmpty() { regPickListKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {varchar(30)}
     */
    public void setPickListKey_IsNotNull() { regPickListKey(CK_ISNN, DOBJ); }

    protected void regPickListKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickListKey(), "PICK_LIST_KEY"); }
    protected abstract ConditionValue xgetCValuePickListKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_Equal(String frontBackCaseCd) {
        doSetFrontBackCaseCd_Equal(fRES(frontBackCaseCd));
    }

    protected void doSetFrontBackCaseCd_Equal(String frontBackCaseCd) {
        regFrontBackCaseCd(CK_EQ, frontBackCaseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_NotEqual(String frontBackCaseCd) {
        doSetFrontBackCaseCd_NotEqual(fRES(frontBackCaseCd));
    }

    protected void doSetFrontBackCaseCd_NotEqual(String frontBackCaseCd) {
        regFrontBackCaseCd(CK_NES, frontBackCaseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_GreaterThan(String frontBackCaseCd) {
        regFrontBackCaseCd(CK_GT, fRES(frontBackCaseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_LessThan(String frontBackCaseCd) {
        regFrontBackCaseCd(CK_LT, fRES(frontBackCaseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_GreaterEqual(String frontBackCaseCd) {
        regFrontBackCaseCd(CK_GE, fRES(frontBackCaseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_LessEqual(String frontBackCaseCd) {
        regFrontBackCaseCd(CK_LE, fRES(frontBackCaseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCdList The collection of frontBackCaseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_InScope(Collection<String> frontBackCaseCdList) {
        doSetFrontBackCaseCd_InScope(frontBackCaseCdList);
    }

    protected void doSetFrontBackCaseCd_InScope(Collection<String> frontBackCaseCdList) {
        regINS(CK_INS, cTL(frontBackCaseCdList), xgetCValueFrontBackCaseCd(), "FRONT_BACK_CASE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCdList The collection of frontBackCaseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_NotInScope(Collection<String> frontBackCaseCdList) {
        doSetFrontBackCaseCd_NotInScope(frontBackCaseCdList);
    }

    protected void doSetFrontBackCaseCd_NotInScope(Collection<String> frontBackCaseCdList) {
        regINS(CK_NINS, cTL(frontBackCaseCdList), xgetCValueFrontBackCaseCd(), "FRONT_BACK_CASE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)} <br>
     * <pre>e.g. setFrontBackCaseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param frontBackCaseCd The value of frontBackCaseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFrontBackCaseCd_LikeSearch(String frontBackCaseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(frontBackCaseCd), xgetCValueFrontBackCaseCd(), "FRONT_BACK_CASE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFrontBackCaseCd_NotLikeSearch(String frontBackCaseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(frontBackCaseCd), xgetCValueFrontBackCaseCd(), "FRONT_BACK_CASE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @param frontBackCaseCd The value of frontBackCaseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontBackCaseCd_PrefixSearch(String frontBackCaseCd) {
        setFrontBackCaseCd_LikeSearch(frontBackCaseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     */
    public void setFrontBackCaseCd_IsNull() { regFrontBackCaseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     */
    public void setFrontBackCaseCd_IsNullOrEmpty() { regFrontBackCaseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     */
    public void setFrontBackCaseCd_IsNotNull() { regFrontBackCaseCd(CK_ISNN, DOBJ); }

    protected void regFrontBackCaseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFrontBackCaseCd(), "FRONT_BACK_CASE_CD"); }
    protected abstract ConditionValue xgetCValueFrontBackCaseCd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriority The value of transportPriority as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_Equal(java.math.BigDecimal transportPriority) {
        doSetTransportPriority_Equal(transportPriority);
    }

    protected void doSetTransportPriority_Equal(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_EQ, transportPriority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriority The value of transportPriority as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_NotEqual(java.math.BigDecimal transportPriority) {
        doSetTransportPriority_NotEqual(transportPriority);
    }

    protected void doSetTransportPriority_NotEqual(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_NES, transportPriority);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriority The value of transportPriority as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_GreaterThan(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_GT, transportPriority);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriority The value of transportPriority as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_LessThan(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_LT, transportPriority);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriority The value of transportPriority as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_GreaterEqual(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_GE, transportPriority);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriority The value of transportPriority as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_LessEqual(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_LE, transportPriority);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param minNumber The min number of transportPriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transportPriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransportPriority_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransportPriority(), "TRANSPORT_PRIORITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriorityList The collection of transportPriority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_InScope(Collection<java.math.BigDecimal> transportPriorityList) {
        doSetTransportPriority_InScope(transportPriorityList);
    }

    protected void doSetTransportPriority_InScope(Collection<java.math.BigDecimal> transportPriorityList) {
        regINS(CK_INS, cTL(transportPriorityList), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @param transportPriorityList The collection of transportPriority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_NotInScope(Collection<java.math.BigDecimal> transportPriorityList) {
        doSetTransportPriority_NotInScope(transportPriorityList);
    }

    protected void doSetTransportPriority_NotInScope(Collection<java.math.BigDecimal> transportPriorityList) {
        regINS(CK_NINS, cTL(transportPriorityList), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     */
    public void setTransportPriority_IsNull() { regTransportPriority(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     */
    public void setTransportPriority_IsNotNull() { regTransportPriority(CK_ISNN, DOBJ); }

    protected void regTransportPriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportPriority(), "TRANSPORT_PRIORITY"); }
    protected abstract ConditionValue xgetCValueTransportPriority();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useType The value of useType as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_Equal(java.math.BigDecimal useType) {
        doSetUseType_Equal(useType);
    }

    protected void doSetUseType_Equal(java.math.BigDecimal useType) {
        regUseType(CK_EQ, useType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useType The value of useType as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_NotEqual(java.math.BigDecimal useType) {
        doSetUseType_NotEqual(useType);
    }

    protected void doSetUseType_NotEqual(java.math.BigDecimal useType) {
        regUseType(CK_NES, useType);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useType The value of useType as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_GreaterThan(java.math.BigDecimal useType) {
        regUseType(CK_GT, useType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useType The value of useType as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_LessThan(java.math.BigDecimal useType) {
        regUseType(CK_LT, useType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useType The value of useType as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_GreaterEqual(java.math.BigDecimal useType) {
        regUseType(CK_GE, useType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useType The value of useType as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_LessEqual(java.math.BigDecimal useType) {
        regUseType(CK_LE, useType);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param minNumber The min number of useType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of useType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUseType_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUseType(), "USE_TYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useTypeList The collection of useType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseType_InScope(Collection<java.math.BigDecimal> useTypeList) {
        doSetUseType_InScope(useTypeList);
    }

    protected void doSetUseType_InScope(Collection<java.math.BigDecimal> useTypeList) {
        regINS(CK_INS, cTL(useTypeList), xgetCValueUseType(), "USE_TYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @param useTypeList The collection of useType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseType_NotInScope(Collection<java.math.BigDecimal> useTypeList) {
        doSetUseType_NotInScope(useTypeList);
    }

    protected void doSetUseType_NotInScope(Collection<java.math.BigDecimal> useTypeList) {
        regINS(CK_NINS, cTL(useTypeList), xgetCValueUseType(), "USE_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     */
    public void setUseType_IsNull() { regUseType(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USE_TYPE: {decimal(16, 6)}
     */
    public void setUseType_IsNotNull() { regUseType(CK_ISNN, DOBJ); }

    protected void regUseType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseType(), "USE_TYPE"); }
    protected abstract ConditionValue xgetCValueUseType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_Equal(String outputOrder) {
        doSetOutputOrder_Equal(fRES(outputOrder));
    }

    protected void doSetOutputOrder_Equal(String outputOrder) {
        regOutputOrder(CK_EQ, outputOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_NotEqual(String outputOrder) {
        doSetOutputOrder_NotEqual(fRES(outputOrder));
    }

    protected void doSetOutputOrder_NotEqual(String outputOrder) {
        regOutputOrder(CK_NES, outputOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_GreaterThan(String outputOrder) {
        regOutputOrder(CK_GT, fRES(outputOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_LessThan(String outputOrder) {
        regOutputOrder(CK_LT, fRES(outputOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_GreaterEqual(String outputOrder) {
        regOutputOrder(CK_GE, fRES(outputOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_LessEqual(String outputOrder) {
        regOutputOrder(CK_LE, fRES(outputOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrderList The collection of outputOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_InScope(Collection<String> outputOrderList) {
        doSetOutputOrder_InScope(outputOrderList);
    }

    protected void doSetOutputOrder_InScope(Collection<String> outputOrderList) {
        regINS(CK_INS, cTL(outputOrderList), xgetCValueOutputOrder(), "OUTPUT_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrderList The collection of outputOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_NotInScope(Collection<String> outputOrderList) {
        doSetOutputOrder_NotInScope(outputOrderList);
    }

    protected void doSetOutputOrder_NotInScope(Collection<String> outputOrderList) {
        regINS(CK_NINS, cTL(outputOrderList), xgetCValueOutputOrder(), "OUTPUT_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)} <br>
     * <pre>e.g. setOutputOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param outputOrder The value of outputOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOutputOrder_LikeSearch(String outputOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(outputOrder), xgetCValueOutputOrder(), "OUTPUT_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOutputOrder_NotLikeSearch(String outputOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(outputOrder), xgetCValueOutputOrder(), "OUTPUT_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @param outputOrder The value of outputOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputOrder_PrefixSearch(String outputOrder) {
        setOutputOrder_LikeSearch(outputOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     */
    public void setOutputOrder_IsNull() { regOutputOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     */
    public void setOutputOrder_IsNullOrEmpty() { regOutputOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OUTPUT_ORDER: {varchar(255)}
     */
    public void setOutputOrder_IsNotNull() { regOutputOrder(CK_ISNN, DOBJ); }

    protected void regOutputOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOutputOrder(), "OUTPUT_ORDER"); }
    protected abstract ConditionValue xgetCValueOutputOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_Equal(String factoryOrder) {
        doSetFactoryOrder_Equal(fRES(factoryOrder));
    }

    protected void doSetFactoryOrder_Equal(String factoryOrder) {
        regFactoryOrder(CK_EQ, factoryOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_NotEqual(String factoryOrder) {
        doSetFactoryOrder_NotEqual(fRES(factoryOrder));
    }

    protected void doSetFactoryOrder_NotEqual(String factoryOrder) {
        regFactoryOrder(CK_NES, factoryOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_GreaterThan(String factoryOrder) {
        regFactoryOrder(CK_GT, fRES(factoryOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_LessThan(String factoryOrder) {
        regFactoryOrder(CK_LT, fRES(factoryOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_GreaterEqual(String factoryOrder) {
        regFactoryOrder(CK_GE, fRES(factoryOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_LessEqual(String factoryOrder) {
        regFactoryOrder(CK_LE, fRES(factoryOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrderList The collection of factoryOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_InScope(Collection<String> factoryOrderList) {
        doSetFactoryOrder_InScope(factoryOrderList);
    }

    protected void doSetFactoryOrder_InScope(Collection<String> factoryOrderList) {
        regINS(CK_INS, cTL(factoryOrderList), xgetCValueFactoryOrder(), "FACTORY_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrderList The collection of factoryOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_NotInScope(Collection<String> factoryOrderList) {
        doSetFactoryOrder_NotInScope(factoryOrderList);
    }

    protected void doSetFactoryOrder_NotInScope(Collection<String> factoryOrderList) {
        regINS(CK_NINS, cTL(factoryOrderList), xgetCValueFactoryOrder(), "FACTORY_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_ORDER: {varchar(255)} <br>
     * <pre>e.g. setFactoryOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factoryOrder The value of factoryOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactoryOrder_LikeSearch(String factoryOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factoryOrder), xgetCValueFactoryOrder(), "FACTORY_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactoryOrder_NotLikeSearch(String factoryOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factoryOrder), xgetCValueFactoryOrder(), "FACTORY_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @param factoryOrder The value of factoryOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryOrder_PrefixSearch(String factoryOrder) {
        setFactoryOrder_LikeSearch(factoryOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     */
    public void setFactoryOrder_IsNull() { regFactoryOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     */
    public void setFactoryOrder_IsNullOrEmpty() { regFactoryOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORY_ORDER: {varchar(255)}
     */
    public void setFactoryOrder_IsNotNull() { regFactoryOrder(CK_ISNN, DOBJ); }

    protected void regFactoryOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactoryOrder(), "FACTORY_ORDER"); }
    protected abstract ConditionValue xgetCValueFactoryOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_Equal(String warehouseOrder) {
        doSetWarehouseOrder_Equal(fRES(warehouseOrder));
    }

    protected void doSetWarehouseOrder_Equal(String warehouseOrder) {
        regWarehouseOrder(CK_EQ, warehouseOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_NotEqual(String warehouseOrder) {
        doSetWarehouseOrder_NotEqual(fRES(warehouseOrder));
    }

    protected void doSetWarehouseOrder_NotEqual(String warehouseOrder) {
        regWarehouseOrder(CK_NES, warehouseOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_GreaterThan(String warehouseOrder) {
        regWarehouseOrder(CK_GT, fRES(warehouseOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_LessThan(String warehouseOrder) {
        regWarehouseOrder(CK_LT, fRES(warehouseOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_GreaterEqual(String warehouseOrder) {
        regWarehouseOrder(CK_GE, fRES(warehouseOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_LessEqual(String warehouseOrder) {
        regWarehouseOrder(CK_LE, fRES(warehouseOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrderList The collection of warehouseOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_InScope(Collection<String> warehouseOrderList) {
        doSetWarehouseOrder_InScope(warehouseOrderList);
    }

    protected void doSetWarehouseOrder_InScope(Collection<String> warehouseOrderList) {
        regINS(CK_INS, cTL(warehouseOrderList), xgetCValueWarehouseOrder(), "WAREHOUSE_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrderList The collection of warehouseOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_NotInScope(Collection<String> warehouseOrderList) {
        doSetWarehouseOrder_NotInScope(warehouseOrderList);
    }

    protected void doSetWarehouseOrder_NotInScope(Collection<String> warehouseOrderList) {
        regINS(CK_NINS, cTL(warehouseOrderList), xgetCValueWarehouseOrder(), "WAREHOUSE_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)} <br>
     * <pre>e.g. setWarehouseOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseOrder The value of warehouseOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseOrder_LikeSearch(String warehouseOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseOrder), xgetCValueWarehouseOrder(), "WAREHOUSE_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseOrder_NotLikeSearch(String warehouseOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseOrder), xgetCValueWarehouseOrder(), "WAREHOUSE_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @param warehouseOrder The value of warehouseOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseOrder_PrefixSearch(String warehouseOrder) {
        setWarehouseOrder_LikeSearch(warehouseOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     */
    public void setWarehouseOrder_IsNull() { regWarehouseOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     */
    public void setWarehouseOrder_IsNullOrEmpty() { regWarehouseOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     */
    public void setWarehouseOrder_IsNotNull() { regWarehouseOrder(CK_ISNN, DOBJ); }

    protected void regWarehouseOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseOrder(), "WAREHOUSE_ORDER"); }
    protected abstract ConditionValue xgetCValueWarehouseOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_Equal(String lineblockOrder) {
        doSetLineblockOrder_Equal(fRES(lineblockOrder));
    }

    protected void doSetLineblockOrder_Equal(String lineblockOrder) {
        regLineblockOrder(CK_EQ, lineblockOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_NotEqual(String lineblockOrder) {
        doSetLineblockOrder_NotEqual(fRES(lineblockOrder));
    }

    protected void doSetLineblockOrder_NotEqual(String lineblockOrder) {
        regLineblockOrder(CK_NES, lineblockOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_GreaterThan(String lineblockOrder) {
        regLineblockOrder(CK_GT, fRES(lineblockOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_LessThan(String lineblockOrder) {
        regLineblockOrder(CK_LT, fRES(lineblockOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_GreaterEqual(String lineblockOrder) {
        regLineblockOrder(CK_GE, fRES(lineblockOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_LessEqual(String lineblockOrder) {
        regLineblockOrder(CK_LE, fRES(lineblockOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrderList The collection of lineblockOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_InScope(Collection<String> lineblockOrderList) {
        doSetLineblockOrder_InScope(lineblockOrderList);
    }

    protected void doSetLineblockOrder_InScope(Collection<String> lineblockOrderList) {
        regINS(CK_INS, cTL(lineblockOrderList), xgetCValueLineblockOrder(), "LINEBLOCK_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrderList The collection of lineblockOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_NotInScope(Collection<String> lineblockOrderList) {
        doSetLineblockOrder_NotInScope(lineblockOrderList);
    }

    protected void doSetLineblockOrder_NotInScope(Collection<String> lineblockOrderList) {
        regINS(CK_NINS, cTL(lineblockOrderList), xgetCValueLineblockOrder(), "LINEBLOCK_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)} <br>
     * <pre>e.g. setLineblockOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineblockOrder The value of lineblockOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineblockOrder_LikeSearch(String lineblockOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineblockOrder), xgetCValueLineblockOrder(), "LINEBLOCK_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineblockOrder_NotLikeSearch(String lineblockOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineblockOrder), xgetCValueLineblockOrder(), "LINEBLOCK_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @param lineblockOrder The value of lineblockOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblockOrder_PrefixSearch(String lineblockOrder) {
        setLineblockOrder_LikeSearch(lineblockOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     */
    public void setLineblockOrder_IsNull() { regLineblockOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     */
    public void setLineblockOrder_IsNullOrEmpty() { regLineblockOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     */
    public void setLineblockOrder_IsNotNull() { regLineblockOrder(CK_ISNN, DOBJ); }

    protected void regLineblockOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineblockOrder(), "LINEBLOCK_ORDER"); }
    protected abstract ConditionValue xgetCValueLineblockOrder();

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
    public HpSLCFunction<TTrtraceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrtraceCB.class);
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
    public HpSLCFunction<TTrtraceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrtraceCB.class);
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
    public HpSLCFunction<TTrtraceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrtraceCB.class);
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
    public HpSLCFunction<TTrtraceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrtraceCB.class);
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
    public HpSLCFunction<TTrtraceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrtraceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrtraceCB&gt;() {
     *     public void query(TTrtraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrtraceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrtraceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtraceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrtraceCQ sq);

    protected TTrtraceCB xcreateScalarConditionCB() {
        TTrtraceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrtraceCB xcreateScalarConditionPartitionByCB() {
        TTrtraceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrtraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRTRACE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrtraceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrtraceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrtraceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRTRACE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrtraceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrtraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrtraceCQ sq);

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
    protected TTrtraceCB newMyCB() {
        return new TTrtraceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrtraceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

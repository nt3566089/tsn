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
 * The abstract condition-query of T_TRFLEXIBILITYBREAKDOWN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrflexibilitybreakdownCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrflexibilitybreakdownCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRFLEXIBILITYBREAKDOWN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoId The value of flexibleBreakdownInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_Equal(Long flexibleBreakdownInfoId) {
        doSetFlexibleBreakdownInfoId_Equal(flexibleBreakdownInfoId);
    }

    protected void doSetFlexibleBreakdownInfoId_Equal(Long flexibleBreakdownInfoId) {
        regFlexibleBreakdownInfoId(CK_EQ, flexibleBreakdownInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoId The value of flexibleBreakdownInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_NotEqual(Long flexibleBreakdownInfoId) {
        doSetFlexibleBreakdownInfoId_NotEqual(flexibleBreakdownInfoId);
    }

    protected void doSetFlexibleBreakdownInfoId_NotEqual(Long flexibleBreakdownInfoId) {
        regFlexibleBreakdownInfoId(CK_NES, flexibleBreakdownInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoId The value of flexibleBreakdownInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_GreaterThan(Long flexibleBreakdownInfoId) {
        regFlexibleBreakdownInfoId(CK_GT, flexibleBreakdownInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoId The value of flexibleBreakdownInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_LessThan(Long flexibleBreakdownInfoId) {
        regFlexibleBreakdownInfoId(CK_LT, flexibleBreakdownInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoId The value of flexibleBreakdownInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_GreaterEqual(Long flexibleBreakdownInfoId) {
        regFlexibleBreakdownInfoId(CK_GE, flexibleBreakdownInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoId The value of flexibleBreakdownInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_LessEqual(Long flexibleBreakdownInfoId) {
        regFlexibleBreakdownInfoId(CK_LE, flexibleBreakdownInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of flexibleBreakdownInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of flexibleBreakdownInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFlexibleBreakdownInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFlexibleBreakdownInfoId(), "FLEXIBLE_BREAKDOWN_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoIdList The collection of flexibleBreakdownInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_InScope(Collection<Long> flexibleBreakdownInfoIdList) {
        doSetFlexibleBreakdownInfoId_InScope(flexibleBreakdownInfoIdList);
    }

    protected void doSetFlexibleBreakdownInfoId_InScope(Collection<Long> flexibleBreakdownInfoIdList) {
        regINS(CK_INS, cTL(flexibleBreakdownInfoIdList), xgetCValueFlexibleBreakdownInfoId(), "FLEXIBLE_BREAKDOWN_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleBreakdownInfoIdList The collection of flexibleBreakdownInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibleBreakdownInfoId_NotInScope(Collection<Long> flexibleBreakdownInfoIdList) {
        doSetFlexibleBreakdownInfoId_NotInScope(flexibleBreakdownInfoIdList);
    }

    protected void doSetFlexibleBreakdownInfoId_NotInScope(Collection<Long> flexibleBreakdownInfoIdList) {
        regINS(CK_NINS, cTL(flexibleBreakdownInfoIdList), xgetCValueFlexibleBreakdownInfoId(), "FLEXIBLE_BREAKDOWN_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setFlexibleBreakdownInfoId_IsNull() { regFlexibleBreakdownInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLEXIBLE_BREAKDOWN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setFlexibleBreakdownInfoId_IsNotNull() { regFlexibleBreakdownInfoId(CK_ISNN, DOBJ); }

    protected void regFlexibleBreakdownInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlexibleBreakdownInfoId(), "FLEXIBLE_BREAKDOWN_INFO_ID"); }
    protected abstract ConditionValue xgetCValueFlexibleBreakdownInfoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkey The value of breakdownkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBreakdownkey_Equal(java.math.BigDecimal breakdownkey) {
        doSetBreakdownkey_Equal(breakdownkey);
    }

    protected void doSetBreakdownkey_Equal(java.math.BigDecimal breakdownkey) {
        regBreakdownkey(CK_EQ, breakdownkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkey The value of breakdownkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBreakdownkey_NotEqual(java.math.BigDecimal breakdownkey) {
        doSetBreakdownkey_NotEqual(breakdownkey);
    }

    protected void doSetBreakdownkey_NotEqual(java.math.BigDecimal breakdownkey) {
        regBreakdownkey(CK_NES, breakdownkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkey The value of breakdownkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBreakdownkey_GreaterThan(java.math.BigDecimal breakdownkey) {
        regBreakdownkey(CK_GT, breakdownkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkey The value of breakdownkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBreakdownkey_LessThan(java.math.BigDecimal breakdownkey) {
        regBreakdownkey(CK_LT, breakdownkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkey The value of breakdownkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBreakdownkey_GreaterEqual(java.math.BigDecimal breakdownkey) {
        regBreakdownkey(CK_GE, breakdownkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkey The value of breakdownkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBreakdownkey_LessEqual(java.math.BigDecimal breakdownkey) {
        regBreakdownkey(CK_LE, breakdownkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of breakdownkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of breakdownkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBreakdownkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBreakdownkey(), "BREAKDOWNKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkeyList The collection of breakdownkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakdownkey_InScope(Collection<java.math.BigDecimal> breakdownkeyList) {
        doSetBreakdownkey_InScope(breakdownkeyList);
    }

    protected void doSetBreakdownkey_InScope(Collection<java.math.BigDecimal> breakdownkeyList) {
        regINS(CK_INS, cTL(breakdownkeyList), xgetCValueBreakdownkey(), "BREAKDOWNKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BREAKDOWNKEY: {NotNull, decimal(16, 6)}
     * @param breakdownkeyList The collection of breakdownkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakdownkey_NotInScope(Collection<java.math.BigDecimal> breakdownkeyList) {
        doSetBreakdownkey_NotInScope(breakdownkeyList);
    }

    protected void doSetBreakdownkey_NotInScope(Collection<java.math.BigDecimal> breakdownkeyList) {
        regINS(CK_NINS, cTL(breakdownkeyList), xgetCValueBreakdownkey(), "BREAKDOWNKEY");
    }

    protected void regBreakdownkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBreakdownkey(), "BREAKDOWNKEY"); }
    protected abstract ConditionValue xgetCValueBreakdownkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_Equal(String refno) {
        doSetRefno_Equal(fRES(refno));
    }

    protected void doSetRefno_Equal(String refno) {
        regRefno(CK_EQ, refno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotEqual(String refno) {
        doSetRefno_NotEqual(fRES(refno));
    }

    protected void doSetRefno_NotEqual(String refno) {
        regRefno(CK_NES, refno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterThan(String refno) {
        regRefno(CK_GT, fRES(refno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessThan(String refno) {
        regRefno(CK_LT, fRES(refno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterEqual(String refno) {
        regRefno(CK_GE, fRES(refno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessEqual(String refno) {
        regRefno(CK_LE, fRES(refno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refnoList The collection of refno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_InScope(Collection<String> refnoList) {
        doSetRefno_InScope(refnoList);
    }

    protected void doSetRefno_InScope(Collection<String> refnoList) {
        regINS(CK_INS, cTL(refnoList), xgetCValueRefno(), "REFNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refnoList The collection of refno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotInScope(Collection<String> refnoList) {
        doSetRefno_NotInScope(refnoList);
    }

    protected void doSetRefno_NotInScope(Collection<String> refnoList) {
        regINS(CK_NINS, cTL(refnoList), xgetCValueRefno(), "REFNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {IX, varchar(30)} <br>
     * <pre>e.g. setRefno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refno The value of refno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefno_LikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefno_NotLikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {IX, varchar(30)}
     * @param refno The value of refno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_PrefixSearch(String refno) {
        setRefno_LikeSearch(refno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     */
    public void setRefno_IsNull() { regRefno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     */
    public void setRefno_IsNullOrEmpty() { regRefno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFNO: {IX, varchar(30)}
     */
    public void setRefno_IsNotNull() { regRefno(CK_ISNN, DOBJ); }

    protected void regRefno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefno(), "REFNO"); }
    protected abstract ConditionValue xgetCValueRefno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_Equal(String shipcd) {
        doSetShipcd_Equal(fRES(shipcd));
    }

    protected void doSetShipcd_Equal(String shipcd) {
        regShipcd(CK_EQ, shipcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_NotEqual(String shipcd) {
        doSetShipcd_NotEqual(fRES(shipcd));
    }

    protected void doSetShipcd_NotEqual(String shipcd) {
        regShipcd(CK_NES, shipcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterThan(String shipcd) {
        regShipcd(CK_GT, fRES(shipcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessThan(String shipcd) {
        regShipcd(CK_LT, fRES(shipcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterEqual(String shipcd) {
        regShipcd(CK_GE, fRES(shipcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessEqual(String shipcd) {
        regShipcd(CK_LE, fRES(shipcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcdList The collection of shipcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_InScope(Collection<String> shipcdList) {
        doSetShipcd_InScope(shipcdList);
    }

    protected void doSetShipcd_InScope(Collection<String> shipcdList) {
        regINS(CK_INS, cTL(shipcdList), xgetCValueShipcd(), "SHIPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcdList The collection of shipcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_NotInScope(Collection<String> shipcdList) {
        doSetShipcd_NotInScope(shipcdList);
    }

    protected void doSetShipcd_NotInScope(Collection<String> shipcdList) {
        regINS(CK_NINS, cTL(shipcdList), xgetCValueShipcd(), "SHIPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(30)} <br>
     * <pre>e.g. setShipcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipcd The value of shipcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipcd_LikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipcd_NotLikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(30)}
     * @param shipcd The value of shipcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_PrefixSearch(String shipcd) {
        setShipcd_LikeSearch(shipcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     */
    public void setShipcd_IsNull() { regShipcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     */
    public void setShipcd_IsNullOrEmpty() { regShipcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(30)}
     */
    public void setShipcd_IsNotNull() { regShipcd(CK_ISNN, DOBJ); }

    protected void regShipcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipcd(), "SHIPCD"); }
    protected abstract ConditionValue xgetCValueShipcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_Equal(String shipschdate) {
        doSetShipschdate_Equal(fRES(shipschdate));
    }

    protected void doSetShipschdate_Equal(String shipschdate) {
        regShipschdate(CK_EQ, shipschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotEqual(String shipschdate) {
        doSetShipschdate_NotEqual(fRES(shipschdate));
    }

    protected void doSetShipschdate_NotEqual(String shipschdate) {
        regShipschdate(CK_NES, shipschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterThan(String shipschdate) {
        regShipschdate(CK_GT, fRES(shipschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessThan(String shipschdate) {
        regShipschdate(CK_LT, fRES(shipschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterEqual(String shipschdate) {
        regShipschdate(CK_GE, fRES(shipschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessEqual(String shipschdate) {
        regShipschdate(CK_LE, fRES(shipschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdateList The collection of shipschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_InScope(Collection<String> shipschdateList) {
        doSetShipschdate_InScope(shipschdateList);
    }

    protected void doSetShipschdate_InScope(Collection<String> shipschdateList) {
        regINS(CK_INS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdateList The collection of shipschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotInScope(Collection<String> shipschdateList) {
        doSetShipschdate_NotInScope(shipschdateList);
    }

    protected void doSetShipschdate_NotInScope(Collection<String> shipschdateList) {
        regINS(CK_NINS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)} <br>
     * <pre>e.g. setShipschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipschdate The value of shipschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipschdate_LikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipschdate_NotLikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_PrefixSearch(String shipschdate) {
        setShipschdate_LikeSearch(shipschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     */
    public void setShipschdate_IsNull() { regShipschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     */
    public void setShipschdate_IsNullOrEmpty() { regShipschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     */
    public void setShipschdate_IsNotNull() { regShipschdate(CK_ISNN, DOBJ); }

    protected void regShipschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipschdate(), "SHIPSCHDATE"); }
    protected abstract ConditionValue xgetCValueShipschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
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
     * SHIPTOCD: {IX, varchar(30)}
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
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
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
     * SHIPTOCD: {IX, varchar(30)}
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
     * SHIPTOCD: {IX, varchar(30)} <br>
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
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_Equal(String shiptoschdate) {
        doSetShiptoschdate_Equal(fRES(shiptoschdate));
    }

    protected void doSetShiptoschdate_Equal(String shiptoschdate) {
        regShiptoschdate(CK_EQ, shiptoschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_NotEqual(String shiptoschdate) {
        doSetShiptoschdate_NotEqual(fRES(shiptoschdate));
    }

    protected void doSetShiptoschdate_NotEqual(String shiptoschdate) {
        regShiptoschdate(CK_NES, shiptoschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_GreaterThan(String shiptoschdate) {
        regShiptoschdate(CK_GT, fRES(shiptoschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_LessThan(String shiptoschdate) {
        regShiptoschdate(CK_LT, fRES(shiptoschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_GreaterEqual(String shiptoschdate) {
        regShiptoschdate(CK_GE, fRES(shiptoschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_LessEqual(String shiptoschdate) {
        regShiptoschdate(CK_LE, fRES(shiptoschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdateList The collection of shiptoschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_InScope(Collection<String> shiptoschdateList) {
        doSetShiptoschdate_InScope(shiptoschdateList);
    }

    protected void doSetShiptoschdate_InScope(Collection<String> shiptoschdateList) {
        regINS(CK_INS, cTL(shiptoschdateList), xgetCValueShiptoschdate(), "SHIPTOSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdateList The collection of shiptoschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_NotInScope(Collection<String> shiptoschdateList) {
        doSetShiptoschdate_NotInScope(shiptoschdateList);
    }

    protected void doSetShiptoschdate_NotInScope(Collection<String> shiptoschdateList) {
        regINS(CK_NINS, cTL(shiptoschdateList), xgetCValueShiptoschdate(), "SHIPTOSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)} <br>
     * <pre>e.g. setShiptoschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptoschdate The value of shiptoschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptoschdate_LikeSearch(String shiptoschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptoschdate), xgetCValueShiptoschdate(), "SHIPTOSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptoschdate_NotLikeSearch(String shiptoschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptoschdate), xgetCValueShiptoschdate(), "SHIPTOSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     * @param shiptoschdate The value of shiptoschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_PrefixSearch(String shiptoschdate) {
        setShiptoschdate_LikeSearch(shiptoschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     */
    public void setShiptoschdate_IsNull() { regShiptoschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     */
    public void setShiptoschdate_IsNullOrEmpty() { regShiptoschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {varchar(8)}
     */
    public void setShiptoschdate_IsNotNull() { regShiptoschdate(CK_ISNN, DOBJ); }

    protected void regShiptoschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptoschdate(), "SHIPTOSCHDATE"); }
    protected abstract ConditionValue xgetCValueShiptoschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_Equal(String productId) {
        doSetProductId_Equal(fRES(productId));
    }

    protected void doSetProductId_Equal(String productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(String productId) {
        doSetProductId_NotEqual(fRES(productId));
    }

    protected void doSetProductId_NotEqual(String productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(String productId) {
        regProductId(CK_GT, fRES(productId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_LessThan(String productId) {
        regProductId(CK_LT, fRES(productId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(String productId) {
        regProductId(CK_GE, fRES(productId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(String productId) {
        regProductId(CK_LE, fRES(productId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<String> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<String> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<String> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<String> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)} <br>
     * <pre>e.g. setProductId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productId The value of productId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductId_LikeSearch(String productId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productId), xgetCValueProductId(), "PRODUCT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductId_NotLikeSearch(String productId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productId), xgetCValueProductId(), "PRODUCT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_PrefixSearch(String productId) {
        setProductId_LikeSearch(productId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     */
    public void setProductId_IsNullOrEmpty() { regProductId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_Equal(Long qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(Long qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_NotEqual(Long qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(Long qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(Long qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(Long qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(Long qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(Long qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {bigint(19)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<Long> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<Long> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {bigint(19)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<Long> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<Long> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     */
    public void setQty_IsNull() { regQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     */
    public void setQty_IsNotNull() { regQty(CK_ISNN, DOBJ); }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_Equal(String manufacturedate) {
        doSetManufacturedate_Equal(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_Equal(String manufacturedate) {
        regManufacturedate(CK_EQ, manufacturedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotEqual(String manufacturedate) {
        doSetManufacturedate_NotEqual(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_NotEqual(String manufacturedate) {
        regManufacturedate(CK_NES, manufacturedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterThan(String manufacturedate) {
        regManufacturedate(CK_GT, fRES(manufacturedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessThan(String manufacturedate) {
        regManufacturedate(CK_LT, fRES(manufacturedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterEqual(String manufacturedate) {
        regManufacturedate(CK_GE, fRES(manufacturedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessEqual(String manufacturedate) {
        regManufacturedate(CK_LE, fRES(manufacturedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_InScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_InScope(manufacturedateList);
    }

    protected void doSetManufacturedate_InScope(Collection<String> manufacturedateList) {
        regINS(CK_INS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_NotInScope(manufacturedateList);
    }

    protected void doSetManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        regINS(CK_NINS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)} <br>
     * <pre>e.g. setManufacturedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturedate The value of manufacturedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturedate_LikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturedate_NotLikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_PrefixSearch(String manufacturedate) {
        setManufacturedate_LikeSearch(manufacturedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNull() { regManufacturedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNullOrEmpty() { regManufacturedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNotNull() { regManufacturedate(CK_ISNN, DOBJ); }

    protected void regManufacturedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturedate(), "MANUFACTUREDATE"); }
    protected abstract ConditionValue xgetCValueManufacturedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_Equal(String designcd) {
        doSetDesigncd_Equal(fRES(designcd));
    }

    protected void doSetDesigncd_Equal(String designcd) {
        regDesigncd(CK_EQ, designcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotEqual(String designcd) {
        doSetDesigncd_NotEqual(fRES(designcd));
    }

    protected void doSetDesigncd_NotEqual(String designcd) {
        regDesigncd(CK_NES, designcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcdList The collection of designcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_InScope(Collection<String> designcdList) {
        doSetDesigncd_InScope(designcdList);
    }

    protected void doSetDesigncd_InScope(Collection<String> designcdList) {
        regINS(CK_INS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcdList The collection of designcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotInScope(Collection<String> designcdList) {
        doSetDesigncd_NotInScope(designcdList);
    }

    protected void doSetDesigncd_NotInScope(Collection<String> designcdList) {
        regINS(CK_NINS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)} <br>
     * <pre>e.g. setDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcd The value of designcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncd_LikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNull() { regDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNullOrEmpty() { regDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNotNull() { regDesigncd(CK_ISNN, DOBJ); }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DESIGNCD"); }
    protected abstract ConditionValue xgetCValueDesigncd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
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
     * CENTER_ID: {bigint(19)}
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
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19)}
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
     * CENTER_ID: {bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
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
     * CLIENT_ID: {bigint(19)}
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
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19)}
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
     * CLIENT_ID: {bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

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
    public HpSLCFunction<TTrflexibilitybreakdownCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrflexibilitybreakdownCB.class);
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
    public HpSLCFunction<TTrflexibilitybreakdownCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrflexibilitybreakdownCB.class);
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
    public HpSLCFunction<TTrflexibilitybreakdownCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrflexibilitybreakdownCB.class);
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
    public HpSLCFunction<TTrflexibilitybreakdownCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrflexibilitybreakdownCB.class);
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
    public HpSLCFunction<TTrflexibilitybreakdownCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrflexibilitybreakdownCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrflexibilitybreakdownCB&gt;() {
     *     public void query(TTrflexibilitybreakdownCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrflexibilitybreakdownCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrflexibilitybreakdownCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilitybreakdownCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrflexibilitybreakdownCQ sq);

    protected TTrflexibilitybreakdownCB xcreateScalarConditionCB() {
        TTrflexibilitybreakdownCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrflexibilitybreakdownCB xcreateScalarConditionPartitionByCB() {
        TTrflexibilitybreakdownCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrflexibilitybreakdownCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilitybreakdownCB cb = new TTrflexibilitybreakdownCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FLEXIBLE_BREAKDOWN_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrflexibilitybreakdownCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrflexibilitybreakdownCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrflexibilitybreakdownCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilitybreakdownCB cb = new TTrflexibilitybreakdownCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FLEXIBLE_BREAKDOWN_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrflexibilitybreakdownCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrflexibilitybreakdownCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrflexibilitybreakdownCB cb = new TTrflexibilitybreakdownCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrflexibilitybreakdownCQ sq);

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
    protected TTrflexibilitybreakdownCB newMyCB() {
        return new TTrflexibilitybreakdownCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrflexibilitybreakdownCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
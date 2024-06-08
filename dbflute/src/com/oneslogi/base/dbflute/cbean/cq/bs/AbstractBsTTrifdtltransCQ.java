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
 * The abstract condition-query of T_TRIFDTLTRANS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrifdtltransCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrifdtltransCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRIFDTLTRANS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransId The value of trifdtltransId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrifdtltransId_Equal(Long trifdtltransId) {
        doSetTrifdtltransId_Equal(trifdtltransId);
    }

    protected void doSetTrifdtltransId_Equal(Long trifdtltransId) {
        regTrifdtltransId(CK_EQ, trifdtltransId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransId The value of trifdtltransId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrifdtltransId_NotEqual(Long trifdtltransId) {
        doSetTrifdtltransId_NotEqual(trifdtltransId);
    }

    protected void doSetTrifdtltransId_NotEqual(Long trifdtltransId) {
        regTrifdtltransId(CK_NES, trifdtltransId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransId The value of trifdtltransId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrifdtltransId_GreaterThan(Long trifdtltransId) {
        regTrifdtltransId(CK_GT, trifdtltransId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransId The value of trifdtltransId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrifdtltransId_LessThan(Long trifdtltransId) {
        regTrifdtltransId(CK_LT, trifdtltransId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransId The value of trifdtltransId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrifdtltransId_GreaterEqual(Long trifdtltransId) {
        regTrifdtltransId(CK_GE, trifdtltransId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransId The value of trifdtltransId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrifdtltransId_LessEqual(Long trifdtltransId) {
        regTrifdtltransId(CK_LE, trifdtltransId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trifdtltransId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trifdtltransId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrifdtltransId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrifdtltransId(), "TRIFDTLTRANS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransIdList The collection of trifdtltransId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrifdtltransId_InScope(Collection<Long> trifdtltransIdList) {
        doSetTrifdtltransId_InScope(trifdtltransIdList);
    }

    protected void doSetTrifdtltransId_InScope(Collection<Long> trifdtltransIdList) {
        regINS(CK_INS, cTL(trifdtltransIdList), xgetCValueTrifdtltransId(), "TRIFDTLTRANS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trifdtltransIdList The collection of trifdtltransId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrifdtltransId_NotInScope(Collection<Long> trifdtltransIdList) {
        doSetTrifdtltransId_NotInScope(trifdtltransIdList);
    }

    protected void doSetTrifdtltransId_NotInScope(Collection<Long> trifdtltransIdList) {
        regINS(CK_NINS, cTL(trifdtltransIdList), xgetCValueTrifdtltransId(), "TRIFDTLTRANS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrifdtltransId_IsNull() { regTrifdtltransId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrifdtltransId_IsNotNull() { regTrifdtltransId(CK_ISNN, DOBJ); }

    protected void regTrifdtltransId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrifdtltransId(), "TRIFDTLTRANS_ID"); }
    protected abstract ConditionValue xgetCValueTrifdtltransId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
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
     * REFNO: {NotNull, varchar(30)}
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
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterThan(String refno) {
        regRefno(CK_GT, fRES(refno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessThan(String refno) {
        regRefno(CK_LT, fRES(refno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterEqual(String refno) {
        regRefno(CK_GE, fRES(refno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessEqual(String refno) {
        regRefno(CK_LE, fRES(refno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
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
     * REFNO: {NotNull, varchar(30)}
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
     * REFNO: {NotNull, varchar(30)} <br>
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
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefno_NotLikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_PrefixSearch(String refno) {
        setRefno_LikeSearch(refno, xcLSOPPre());
    }

    protected void regRefno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefno(), "REFNO"); }
    protected abstract ConditionValue xgetCValueRefno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_Equal(Long reflineno) {
        doSetReflineno_Equal(reflineno);
    }

    protected void doSetReflineno_Equal(Long reflineno) {
        regReflineno(CK_EQ, reflineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_NotEqual(Long reflineno) {
        doSetReflineno_NotEqual(reflineno);
    }

    protected void doSetReflineno_NotEqual(Long reflineno) {
        regReflineno(CK_NES, reflineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_GreaterThan(Long reflineno) {
        regReflineno(CK_GT, reflineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_LessThan(Long reflineno) {
        regReflineno(CK_LT, reflineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_GreaterEqual(Long reflineno) {
        regReflineno(CK_GE, reflineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_LessEqual(Long reflineno) {
        regReflineno(CK_LE, reflineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of reflineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reflineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReflineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReflineno(), "REFLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflinenoList The collection of reflineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReflineno_InScope(Collection<Long> reflinenoList) {
        doSetReflineno_InScope(reflinenoList);
    }

    protected void doSetReflineno_InScope(Collection<Long> reflinenoList) {
        regINS(CK_INS, cTL(reflinenoList), xgetCValueReflineno(), "REFLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflinenoList The collection of reflineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReflineno_NotInScope(Collection<Long> reflinenoList) {
        doSetReflineno_NotInScope(reflinenoList);
    }

    protected void doSetReflineno_NotInScope(Collection<Long> reflinenoList) {
        regINS(CK_NINS, cTL(reflinenoList), xgetCValueReflineno(), "REFLINENO");
    }

    protected void regReflineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReflineno(), "REFLINENO"); }
    protected abstract ConditionValue xgetCValueReflineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
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
     * SHIPCD: {NotNull, varchar(30)}
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
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterThan(String shipcd) {
        regShipcd(CK_GT, fRES(shipcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessThan(String shipcd) {
        regShipcd(CK_LT, fRES(shipcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterEqual(String shipcd) {
        regShipcd(CK_GE, fRES(shipcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessEqual(String shipcd) {
        regShipcd(CK_LE, fRES(shipcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
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
     * SHIPCD: {NotNull, varchar(30)}
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
     * SHIPCD: {NotNull, varchar(30)} <br>
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
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipcd_NotLikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_PrefixSearch(String shipcd) {
        setShipcd_LikeSearch(shipcd, xcLSOPPre());
    }

    protected void regShipcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipcd(), "SHIPCD"); }
    protected abstract ConditionValue xgetCValueShipcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {NotNull, varchar(30)}
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
     * SHIPSCHDATE: {NotNull, varchar(30)}
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
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @param shipschdate The value of shipschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterThan(String shipschdate) {
        regShipschdate(CK_GT, fRES(shipschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @param shipschdate The value of shipschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessThan(String shipschdate) {
        regShipschdate(CK_LT, fRES(shipschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @param shipschdate The value of shipschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterEqual(String shipschdate) {
        regShipschdate(CK_GE, fRES(shipschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @param shipschdate The value of shipschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessEqual(String shipschdate) {
        regShipschdate(CK_LE, fRES(shipschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {NotNull, varchar(30)}
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
     * SHIPSCHDATE: {NotNull, varchar(30)}
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
     * SHIPSCHDATE: {NotNull, varchar(30)} <br>
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
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @param shipschdate The value of shipschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipschdate_NotLikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @param shipschdate The value of shipschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_PrefixSearch(String shipschdate) {
        setShipschdate_LikeSearch(shipschdate, xcLSOPPre());
    }

    protected void regShipschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipschdate(), "SHIPSCHDATE"); }
    protected abstract ConditionValue xgetCValueShipschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
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
     * SHIPTOCD: {NotNull, varchar(30)}
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
     * SHIPTOCD: {NotNull, varchar(30)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
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
     * SHIPTOCD: {NotNull, varchar(30)}
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
     * SHIPTOCD: {NotNull, varchar(30)} <br>
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
     * SHIPTOCD: {NotNull, varchar(30)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
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
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
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
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @param shiptoschdate The value of shiptoschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_GreaterThan(String shiptoschdate) {
        regShiptoschdate(CK_GT, fRES(shiptoschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @param shiptoschdate The value of shiptoschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_LessThan(String shiptoschdate) {
        regShiptoschdate(CK_LT, fRES(shiptoschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @param shiptoschdate The value of shiptoschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_GreaterEqual(String shiptoschdate) {
        regShiptoschdate(CK_GE, fRES(shiptoschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @param shiptoschdate The value of shiptoschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_LessEqual(String shiptoschdate) {
        regShiptoschdate(CK_LE, fRES(shiptoschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
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
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
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
     * SHIPTOSCHDATE: {NotNull, varchar(30)} <br>
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
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @param shiptoschdate The value of shiptoschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptoschdate_NotLikeSearch(String shiptoschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptoschdate), xgetCValueShiptoschdate(), "SHIPTOSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @param shiptoschdate The value of shiptoschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoschdate_PrefixSearch(String shiptoschdate) {
        setShiptoschdate_LikeSearch(shiptoschdate, xcLSOPPre());
    }

    protected void regShiptoschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptoschdate(), "SHIPTOSCHDATE"); }
    protected abstract ConditionValue xgetCValueShiptoschdate();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
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
     * QTY: {NotNull, bigint(19), default=[(0)]}
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
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(Long qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(Long qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(Long qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(Long qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
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
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<Long> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<Long> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_Equal(String productionym) {
        doSetProductionym_Equal(fRES(productionym));
    }

    protected void doSetProductionym_Equal(String productionym) {
        regProductionym(CK_EQ, productionym);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_NotEqual(String productionym) {
        doSetProductionym_NotEqual(fRES(productionym));
    }

    protected void doSetProductionym_NotEqual(String productionym) {
        regProductionym(CK_NES, productionym);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_GreaterThan(String productionym) {
        regProductionym(CK_GT, fRES(productionym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_LessThan(String productionym) {
        regProductionym(CK_LT, fRES(productionym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_GreaterEqual(String productionym) {
        regProductionym(CK_GE, fRES(productionym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_LessEqual(String productionym) {
        regProductionym(CK_LE, fRES(productionym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionymList The collection of productionym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_InScope(Collection<String> productionymList) {
        doSetProductionym_InScope(productionymList);
    }

    protected void doSetProductionym_InScope(Collection<String> productionymList) {
        regINS(CK_INS, cTL(productionymList), xgetCValueProductionym(), "PRODUCTIONYM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionymList The collection of productionym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_NotInScope(Collection<String> productionymList) {
        doSetProductionym_NotInScope(productionymList);
    }

    protected void doSetProductionym_NotInScope(Collection<String> productionymList) {
        regINS(CK_NINS, cTL(productionymList), xgetCValueProductionym(), "PRODUCTIONYM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTIONYM: {varchar(30)} <br>
     * <pre>e.g. setProductionym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productionym The value of productionym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductionym_LikeSearch(String productionym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productionym), xgetCValueProductionym(), "PRODUCTIONYM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductionym_NotLikeSearch(String productionym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productionym), xgetCValueProductionym(), "PRODUCTIONYM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     * @param productionym The value of productionym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductionym_PrefixSearch(String productionym) {
        setProductionym_LikeSearch(productionym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     */
    public void setProductionym_IsNull() { regProductionym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     */
    public void setProductionym_IsNullOrEmpty() { regProductionym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCTIONYM: {varchar(30)}
     */
    public void setProductionym_IsNotNull() { regProductionym(CK_ISNN, DOBJ); }

    protected void regProductionym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductionym(), "PRODUCTIONYM"); }
    protected abstract ConditionValue xgetCValueProductionym();

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
     * QANO: {varchar(30)}
     * @param qano The value of qano as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_Equal(String qano) {
        doSetQano_Equal(fRES(qano));
    }

    protected void doSetQano_Equal(String qano) {
        regQano(CK_EQ, qano);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_NotEqual(String qano) {
        doSetQano_NotEqual(fRES(qano));
    }

    protected void doSetQano_NotEqual(String qano) {
        regQano(CK_NES, qano);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_GreaterThan(String qano) {
        regQano(CK_GT, fRES(qano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_LessThan(String qano) {
        regQano(CK_LT, fRES(qano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_GreaterEqual(String qano) {
        regQano(CK_GE, fRES(qano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_LessEqual(String qano) {
        regQano(CK_LE, fRES(qano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QANO: {varchar(30)}
     * @param qanoList The collection of qano as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_InScope(Collection<String> qanoList) {
        doSetQano_InScope(qanoList);
    }

    protected void doSetQano_InScope(Collection<String> qanoList) {
        regINS(CK_INS, cTL(qanoList), xgetCValueQano(), "QANO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QANO: {varchar(30)}
     * @param qanoList The collection of qano as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_NotInScope(Collection<String> qanoList) {
        doSetQano_NotInScope(qanoList);
    }

    protected void doSetQano_NotInScope(Collection<String> qanoList) {
        regINS(CK_NINS, cTL(qanoList), xgetCValueQano(), "QANO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QANO: {varchar(30)} <br>
     * <pre>e.g. setQano_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qano The value of qano as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQano_LikeSearch(String qano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qano), xgetCValueQano(), "QANO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQano_NotLikeSearch(String qano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qano), xgetCValueQano(), "QANO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QANO: {varchar(30)}
     * @param qano The value of qano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQano_PrefixSearch(String qano) {
        setQano_LikeSearch(qano, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     */
    public void setQano_IsNull() { regQano(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     */
    public void setQano_IsNullOrEmpty() { regQano(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QANO: {varchar(30)}
     */
    public void setQano_IsNotNull() { regQano(CK_ISNN, DOBJ); }

    protected void regQano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQano(), "QANO"); }
    protected abstract ConditionValue xgetCValueQano();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_Equal(String rcvpalletno) {
        doSetRcvpalletno_Equal(fRES(rcvpalletno));
    }

    protected void doSetRcvpalletno_Equal(String rcvpalletno) {
        regRcvpalletno(CK_EQ, rcvpalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotEqual(String rcvpalletno) {
        doSetRcvpalletno_NotEqual(fRES(rcvpalletno));
    }

    protected void doSetRcvpalletno_NotEqual(String rcvpalletno) {
        regRcvpalletno(CK_NES, rcvpalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterThan(String rcvpalletno) {
        regRcvpalletno(CK_GT, fRES(rcvpalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessThan(String rcvpalletno) {
        regRcvpalletno(CK_LT, fRES(rcvpalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterEqual(String rcvpalletno) {
        regRcvpalletno(CK_GE, fRES(rcvpalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessEqual(String rcvpalletno) {
        regRcvpalletno(CK_LE, fRES(rcvpalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_InScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        regINS(CK_INS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RCVPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_NotInScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        regINS(CK_NINS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RCVPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)} <br>
     * <pre>e.g. setRcvpalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvpalletno The value of rcvpalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvpalletno_LikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RCVPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvpalletno_NotLikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RCVPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_PrefixSearch(String rcvpalletno) {
        setRcvpalletno_LikeSearch(rcvpalletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNull() { regRcvpalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNullOrEmpty() { regRcvpalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNotNull() { regRcvpalletno(CK_ISNN, DOBJ); }

    protected void regRcvpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvpalletno(), "RCVPALLETNO"); }
    protected abstract ConditionValue xgetCValueRcvpalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_Equal(String firmcarryno) {
        doSetFirmcarryno_Equal(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_Equal(String firmcarryno) {
        regFirmcarryno(CK_EQ, firmcarryno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotEqual(String firmcarryno) {
        doSetFirmcarryno_NotEqual(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_NotEqual(String firmcarryno) {
        regFirmcarryno(CK_NES, firmcarryno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterThan(String firmcarryno) {
        regFirmcarryno(CK_GT, fRES(firmcarryno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessThan(String firmcarryno) {
        regFirmcarryno(CK_LT, fRES(firmcarryno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterEqual(String firmcarryno) {
        regFirmcarryno(CK_GE, fRES(firmcarryno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessEqual(String firmcarryno) {
        regFirmcarryno(CK_LE, fRES(firmcarryno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarrynoList The collection of firmcarryno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_InScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        regINS(CK_INS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FIRMCARRYNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarrynoList The collection of firmcarryno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_NotInScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        regINS(CK_NINS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FIRMCARRYNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)} <br>
     * <pre>e.g. setFirmcarryno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmcarryno The value of firmcarryno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmcarryno_LikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmcarryno_NotLikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_PrefixSearch(String firmcarryno) {
        setFirmcarryno_LikeSearch(firmcarryno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNull() { regFirmcarryno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNullOrEmpty() { regFirmcarryno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNotNull() { regFirmcarryno(CK_ISNN, DOBJ); }

    protected void regFirmcarryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmcarryno(), "FIRMCARRYNO"); }
    protected abstract ConditionValue xgetCValueFirmcarryno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_Equal(String batjproductionym) {
        doSetBatjproductionym_Equal(fRES(batjproductionym));
    }

    protected void doSetBatjproductionym_Equal(String batjproductionym) {
        regBatjproductionym(CK_EQ, batjproductionym);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_NotEqual(String batjproductionym) {
        doSetBatjproductionym_NotEqual(fRES(batjproductionym));
    }

    protected void doSetBatjproductionym_NotEqual(String batjproductionym) {
        regBatjproductionym(CK_NES, batjproductionym);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_GreaterThan(String batjproductionym) {
        regBatjproductionym(CK_GT, fRES(batjproductionym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_LessThan(String batjproductionym) {
        regBatjproductionym(CK_LT, fRES(batjproductionym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_GreaterEqual(String batjproductionym) {
        regBatjproductionym(CK_GE, fRES(batjproductionym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_LessEqual(String batjproductionym) {
        regBatjproductionym(CK_LE, fRES(batjproductionym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionymList The collection of batjproductionym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_InScope(Collection<String> batjproductionymList) {
        doSetBatjproductionym_InScope(batjproductionymList);
    }

    protected void doSetBatjproductionym_InScope(Collection<String> batjproductionymList) {
        regINS(CK_INS, cTL(batjproductionymList), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionymList The collection of batjproductionym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_NotInScope(Collection<String> batjproductionymList) {
        doSetBatjproductionym_NotInScope(batjproductionymList);
    }

    protected void doSetBatjproductionym_NotInScope(Collection<String> batjproductionymList) {
        regINS(CK_NINS, cTL(batjproductionymList), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)} <br>
     * <pre>e.g. setBatjproductionym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batjproductionym The value of batjproductionym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatjproductionym_LikeSearch(String batjproductionym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batjproductionym), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatjproductionym_NotLikeSearch(String batjproductionym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batjproductionym), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_PrefixSearch(String batjproductionym) {
        setBatjproductionym_LikeSearch(batjproductionym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     */
    public void setBatjproductionym_IsNull() { regBatjproductionym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     */
    public void setBatjproductionym_IsNullOrEmpty() { regBatjproductionym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     */
    public void setBatjproductionym_IsNotNull() { regBatjproductionym(CK_ISNN, DOBJ); }

    protected void regBatjproductionym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatjproductionym(), "BATJPRODUCTIONYM"); }
    protected abstract ConditionValue xgetCValueBatjproductionym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_Equal(String subwarehousecd) {
        doSetSubwarehousecd_Equal(fRES(subwarehousecd));
    }

    protected void doSetSubwarehousecd_Equal(String subwarehousecd) {
        regSubwarehousecd(CK_EQ, subwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_NotEqual(String subwarehousecd) {
        doSetSubwarehousecd_NotEqual(fRES(subwarehousecd));
    }

    protected void doSetSubwarehousecd_NotEqual(String subwarehousecd) {
        regSubwarehousecd(CK_NES, subwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_GreaterThan(String subwarehousecd) {
        regSubwarehousecd(CK_GT, fRES(subwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_LessThan(String subwarehousecd) {
        regSubwarehousecd(CK_LT, fRES(subwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_GreaterEqual(String subwarehousecd) {
        regSubwarehousecd(CK_GE, fRES(subwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_LessEqual(String subwarehousecd) {
        regSubwarehousecd(CK_LE, fRES(subwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecdList The collection of subwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_InScope(Collection<String> subwarehousecdList) {
        doSetSubwarehousecd_InScope(subwarehousecdList);
    }

    protected void doSetSubwarehousecd_InScope(Collection<String> subwarehousecdList) {
        regINS(CK_INS, cTL(subwarehousecdList), xgetCValueSubwarehousecd(), "SUBWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecdList The collection of subwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_NotInScope(Collection<String> subwarehousecdList) {
        doSetSubwarehousecd_NotInScope(subwarehousecdList);
    }

    protected void doSetSubwarehousecd_NotInScope(Collection<String> subwarehousecdList) {
        regINS(CK_NINS, cTL(subwarehousecdList), xgetCValueSubwarehousecd(), "SUBWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setSubwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subwarehousecd The value of subwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSubwarehousecd_LikeSearch(String subwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subwarehousecd), xgetCValueSubwarehousecd(), "SUBWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSubwarehousecd_NotLikeSearch(String subwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subwarehousecd), xgetCValueSubwarehousecd(), "SUBWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @param subwarehousecd The value of subwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubwarehousecd_PrefixSearch(String subwarehousecd) {
        setSubwarehousecd_LikeSearch(subwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     */
    public void setSubwarehousecd_IsNull() { regSubwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     */
    public void setSubwarehousecd_IsNullOrEmpty() { regSubwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     */
    public void setSubwarehousecd_IsNotNull() { regSubwarehousecd(CK_ISNN, DOBJ); }

    protected void regSubwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubwarehousecd(), "SUBWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueSubwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_Equal(String resultflg) {
        doSetResultflg_Equal(fRES(resultflg));
    }

    protected void doSetResultflg_Equal(String resultflg) {
        regResultflg(CK_EQ, resultflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_NotEqual(String resultflg) {
        doSetResultflg_NotEqual(fRES(resultflg));
    }

    protected void doSetResultflg_NotEqual(String resultflg) {
        regResultflg(CK_NES, resultflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_GreaterThan(String resultflg) {
        regResultflg(CK_GT, fRES(resultflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_LessThan(String resultflg) {
        regResultflg(CK_LT, fRES(resultflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_GreaterEqual(String resultflg) {
        regResultflg(CK_GE, fRES(resultflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_LessEqual(String resultflg) {
        regResultflg(CK_LE, fRES(resultflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflgList The collection of resultflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_InScope(Collection<String> resultflgList) {
        doSetResultflg_InScope(resultflgList);
    }

    protected void doSetResultflg_InScope(Collection<String> resultflgList) {
        regINS(CK_INS, cTL(resultflgList), xgetCValueResultflg(), "RESULTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflgList The collection of resultflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_NotInScope(Collection<String> resultflgList) {
        doSetResultflg_NotInScope(resultflgList);
    }

    protected void doSetResultflg_NotInScope(Collection<String> resultflgList) {
        regINS(CK_NINS, cTL(resultflgList), xgetCValueResultflg(), "RESULTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESULTFLG: {char(1), default=[0]} <br>
     * <pre>e.g. setResultflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param resultflg The value of resultflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResultflg_LikeSearch(String resultflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(resultflg), xgetCValueResultflg(), "RESULTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setResultflg_NotLikeSearch(String resultflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(resultflg), xgetCValueResultflg(), "RESULTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     * @param resultflg The value of resultflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_PrefixSearch(String resultflg) {
        setResultflg_LikeSearch(resultflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     */
    public void setResultflg_IsNull() { regResultflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESULTFLG: {char(1), default=[0]}
     */
    public void setResultflg_IsNotNull() { regResultflg(CK_ISNN, DOBJ); }

    protected void regResultflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResultflg(), "RESULTFLG"); }
    protected abstract ConditionValue xgetCValueResultflg();

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
    public HpSLCFunction<TTrifdtltransCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrifdtltransCB.class);
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
    public HpSLCFunction<TTrifdtltransCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrifdtltransCB.class);
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
    public HpSLCFunction<TTrifdtltransCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrifdtltransCB.class);
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
    public HpSLCFunction<TTrifdtltransCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrifdtltransCB.class);
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
    public HpSLCFunction<TTrifdtltransCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrifdtltransCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrifdtltransCB&gt;() {
     *     public void query(TTrifdtltransCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrifdtltransCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrifdtltransCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrifdtltransCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrifdtltransCQ sq);

    protected TTrifdtltransCB xcreateScalarConditionCB() {
        TTrifdtltransCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrifdtltransCB xcreateScalarConditionPartitionByCB() {
        TTrifdtltransCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrifdtltransCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrifdtltransCB cb = new TTrifdtltransCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRIFDTLTRANS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrifdtltransCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrifdtltransCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrifdtltransCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrifdtltransCB cb = new TTrifdtltransCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRIFDTLTRANS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrifdtltransCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrifdtltransCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrifdtltransCB cb = new TTrifdtltransCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrifdtltransCQ sq);

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
    protected TTrifdtltransCB newMyCB() {
        return new TTrifdtltransCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrifdtltransCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

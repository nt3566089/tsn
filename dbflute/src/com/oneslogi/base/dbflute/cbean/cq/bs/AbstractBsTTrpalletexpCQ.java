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
 * The abstract condition-query of T_TRPALLETEXP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpalletexpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpalletexpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPALLETEXP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpId The value of trpalletexpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletexpId_Equal(Long trpalletexpId) {
        doSetTrpalletexpId_Equal(trpalletexpId);
    }

    protected void doSetTrpalletexpId_Equal(Long trpalletexpId) {
        regTrpalletexpId(CK_EQ, trpalletexpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpId The value of trpalletexpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletexpId_NotEqual(Long trpalletexpId) {
        doSetTrpalletexpId_NotEqual(trpalletexpId);
    }

    protected void doSetTrpalletexpId_NotEqual(Long trpalletexpId) {
        regTrpalletexpId(CK_NES, trpalletexpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpId The value of trpalletexpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletexpId_GreaterThan(Long trpalletexpId) {
        regTrpalletexpId(CK_GT, trpalletexpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpId The value of trpalletexpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletexpId_LessThan(Long trpalletexpId) {
        regTrpalletexpId(CK_LT, trpalletexpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpId The value of trpalletexpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletexpId_GreaterEqual(Long trpalletexpId) {
        regTrpalletexpId(CK_GE, trpalletexpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpId The value of trpalletexpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletexpId_LessEqual(Long trpalletexpId) {
        regTrpalletexpId(CK_LE, trpalletexpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trpalletexpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletexpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletexpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletexpId(), "TRPALLETEXP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpIdList The collection of trpalletexpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletexpId_InScope(Collection<Long> trpalletexpIdList) {
        doSetTrpalletexpId_InScope(trpalletexpIdList);
    }

    protected void doSetTrpalletexpId_InScope(Collection<Long> trpalletexpIdList) {
        regINS(CK_INS, cTL(trpalletexpIdList), xgetCValueTrpalletexpId(), "TRPALLETEXP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletexpIdList The collection of trpalletexpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletexpId_NotInScope(Collection<Long> trpalletexpIdList) {
        doSetTrpalletexpId_NotInScope(trpalletexpIdList);
    }

    protected void doSetTrpalletexpId_NotInScope(Collection<Long> trpalletexpIdList) {
        regINS(CK_NINS, cTL(trpalletexpIdList), xgetCValueTrpalletexpId(), "TRPALLETEXP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpalletexpId_IsNull() { regTrpalletexpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpalletexpId_IsNotNull() { regTrpalletexpId(CK_ISNN, DOBJ); }

    protected void regTrpalletexpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpalletexpId(), "TRPALLETEXP_ID"); }
    protected abstract ConditionValue xgetCValueTrpalletexpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_Equal(Long palletno) {
        doSetPalletno_Equal(palletno);
    }

    protected void doSetPalletno_Equal(Long palletno) {
        regPalletno(CK_EQ, palletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_NotEqual(Long palletno) {
        doSetPalletno_NotEqual(palletno);
    }

    protected void doSetPalletno_NotEqual(Long palletno) {
        regPalletno(CK_NES, palletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterThan(Long palletno) {
        regPalletno(CK_GT, palletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessThan(Long palletno) {
        regPalletno(CK_LT, palletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterEqual(Long palletno) {
        regPalletno(CK_GE, palletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletno The value of palletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessEqual(Long palletno) {
        regPalletno(CK_LE, palletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param minNumber The min number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletno(), "PALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletnoList The collection of palletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_InScope(Collection<Long> palletnoList) {
        doSetPalletno_InScope(palletnoList);
    }

    protected void doSetPalletno_InScope(Collection<Long> palletnoList) {
        regINS(CK_INS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, bigint(19)}
     * @param palletnoList The collection of palletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotInScope(Collection<Long> palletnoList) {
        doSetPalletno_NotInScope(palletnoList);
    }

    protected void doSetPalletno_NotInScope(Collection<Long> palletnoList) {
        regINS(CK_NINS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    protected void regPalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletno(), "PALLETNO"); }
    protected abstract ConditionValue xgetCValuePalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_Equal(String rtnrcvkbn) {
        doSetRtnrcvkbn_Equal(fRES(rtnrcvkbn));
    }

    protected void doSetRtnrcvkbn_Equal(String rtnrcvkbn) {
        regRtnrcvkbn(CK_EQ, rtnrcvkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_NotEqual(String rtnrcvkbn) {
        doSetRtnrcvkbn_NotEqual(fRES(rtnrcvkbn));
    }

    protected void doSetRtnrcvkbn_NotEqual(String rtnrcvkbn) {
        regRtnrcvkbn(CK_NES, rtnrcvkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_GreaterThan(String rtnrcvkbn) {
        regRtnrcvkbn(CK_GT, fRES(rtnrcvkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_LessThan(String rtnrcvkbn) {
        regRtnrcvkbn(CK_LT, fRES(rtnrcvkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_GreaterEqual(String rtnrcvkbn) {
        regRtnrcvkbn(CK_GE, fRES(rtnrcvkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_LessEqual(String rtnrcvkbn) {
        regRtnrcvkbn(CK_LE, fRES(rtnrcvkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbnList The collection of rtnrcvkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_InScope(Collection<String> rtnrcvkbnList) {
        doSetRtnrcvkbn_InScope(rtnrcvkbnList);
    }

    protected void doSetRtnrcvkbn_InScope(Collection<String> rtnrcvkbnList) {
        regINS(CK_INS, cTL(rtnrcvkbnList), xgetCValueRtnrcvkbn(), "RTNRCVKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbnList The collection of rtnrcvkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_NotInScope(Collection<String> rtnrcvkbnList) {
        doSetRtnrcvkbn_NotInScope(rtnrcvkbnList);
    }

    protected void doSetRtnrcvkbn_NotInScope(Collection<String> rtnrcvkbnList) {
        regINS(CK_NINS, cTL(rtnrcvkbnList), xgetCValueRtnrcvkbn(), "RTNRCVKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RTNRCVKBN: {char(1)} <br>
     * <pre>e.g. setRtnrcvkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rtnrcvkbn The value of rtnrcvkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRtnrcvkbn_LikeSearch(String rtnrcvkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rtnrcvkbn), xgetCValueRtnrcvkbn(), "RTNRCVKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRtnrcvkbn_NotLikeSearch(String rtnrcvkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rtnrcvkbn), xgetCValueRtnrcvkbn(), "RTNRCVKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RTNRCVKBN: {char(1)}
     * @param rtnrcvkbn The value of rtnrcvkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRtnrcvkbn_PrefixSearch(String rtnrcvkbn) {
        setRtnrcvkbn_LikeSearch(rtnrcvkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     */
    public void setRtnrcvkbn_IsNull() { regRtnrcvkbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RTNRCVKBN: {char(1)}
     */
    public void setRtnrcvkbn_IsNotNull() { regRtnrcvkbn(CK_ISNN, DOBJ); }

    protected void regRtnrcvkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRtnrcvkbn(), "RTNRCVKBN"); }
    protected abstract ConditionValue xgetCValueRtnrcvkbn();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_Equal(String nvExtdata1) {
        doSetNvExtdata1_Equal(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_Equal(String nvExtdata1) {
        regNvExtdata1(CK_EQ, nvExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotEqual(String nvExtdata1) {
        doSetNvExtdata1_NotEqual(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_NotEqual(String nvExtdata1) {
        regNvExtdata1(CK_NES, nvExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterThan(String nvExtdata1) {
        regNvExtdata1(CK_GT, fRES(nvExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessThan(String nvExtdata1) {
        regNvExtdata1(CK_LT, fRES(nvExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterEqual(String nvExtdata1) {
        regNvExtdata1(CK_GE, fRES(nvExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessEqual(String nvExtdata1) {
        regNvExtdata1(CK_LE, fRES(nvExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_InScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        regINS(CK_INS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_NotInScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        regINS(CK_NINS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata1 The value of nvExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata1_LikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata1_NotLikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_PrefixSearch(String nvExtdata1) {
        setNvExtdata1_LikeSearch(nvExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNull() { regNvExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNullOrEmpty() { regNvExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNotNull() { regNvExtdata1(CK_ISNN, DOBJ); }

    protected void regNvExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata1(), "NV_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNvExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_Equal(String nvExtdata2) {
        doSetNvExtdata2_Equal(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_Equal(String nvExtdata2) {
        regNvExtdata2(CK_EQ, nvExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotEqual(String nvExtdata2) {
        doSetNvExtdata2_NotEqual(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_NotEqual(String nvExtdata2) {
        regNvExtdata2(CK_NES, nvExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterThan(String nvExtdata2) {
        regNvExtdata2(CK_GT, fRES(nvExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessThan(String nvExtdata2) {
        regNvExtdata2(CK_LT, fRES(nvExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterEqual(String nvExtdata2) {
        regNvExtdata2(CK_GE, fRES(nvExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessEqual(String nvExtdata2) {
        regNvExtdata2(CK_LE, fRES(nvExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_InScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        regINS(CK_INS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_NotInScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        regINS(CK_NINS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata2 The value of nvExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata2_LikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata2_NotLikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_PrefixSearch(String nvExtdata2) {
        setNvExtdata2_LikeSearch(nvExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNull() { regNvExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNullOrEmpty() { regNvExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNotNull() { regNvExtdata2(CK_ISNN, DOBJ); }

    protected void regNvExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata2(), "NV_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNvExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_Equal(String nvExtdata3) {
        doSetNvExtdata3_Equal(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_Equal(String nvExtdata3) {
        regNvExtdata3(CK_EQ, nvExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotEqual(String nvExtdata3) {
        doSetNvExtdata3_NotEqual(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_NotEqual(String nvExtdata3) {
        regNvExtdata3(CK_NES, nvExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterThan(String nvExtdata3) {
        regNvExtdata3(CK_GT, fRES(nvExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessThan(String nvExtdata3) {
        regNvExtdata3(CK_LT, fRES(nvExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterEqual(String nvExtdata3) {
        regNvExtdata3(CK_GE, fRES(nvExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessEqual(String nvExtdata3) {
        regNvExtdata3(CK_LE, fRES(nvExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_InScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        regINS(CK_INS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_NotInScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        regINS(CK_NINS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata3 The value of nvExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata3_LikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata3_NotLikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_PrefixSearch(String nvExtdata3) {
        setNvExtdata3_LikeSearch(nvExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNull() { regNvExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNullOrEmpty() { regNvExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNotNull() { regNvExtdata3(CK_ISNN, DOBJ); }

    protected void regNvExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata3(), "NV_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNvExtdata3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_Equal(Long nmExtdata1) {
        doSetNmExtdata1_Equal(nmExtdata1);
    }

    protected void doSetNmExtdata1_Equal(Long nmExtdata1) {
        regNmExtdata1(CK_EQ, nmExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotEqual(Long nmExtdata1) {
        doSetNmExtdata1_NotEqual(nmExtdata1);
    }

    protected void doSetNmExtdata1_NotEqual(Long nmExtdata1) {
        regNmExtdata1(CK_NES, nmExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterThan(Long nmExtdata1) {
        regNmExtdata1(CK_GT, nmExtdata1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessThan(Long nmExtdata1) {
        regNmExtdata1(CK_LT, nmExtdata1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterEqual(Long nmExtdata1) {
        regNmExtdata1(CK_GE, nmExtdata1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessEqual(Long nmExtdata1) {
        regNmExtdata1(CK_LE, nmExtdata1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param minNumber The min number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata1(), "NM_EXTDATA1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_InScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        regINS(CK_INS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_NotInScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        regINS(CK_NINS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNull() { regNmExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNotNull() { regNmExtdata1(CK_ISNN, DOBJ); }

    protected void regNmExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata1(), "NM_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNmExtdata1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_Equal(Long nmExtdata2) {
        doSetNmExtdata2_Equal(nmExtdata2);
    }

    protected void doSetNmExtdata2_Equal(Long nmExtdata2) {
        regNmExtdata2(CK_EQ, nmExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotEqual(Long nmExtdata2) {
        doSetNmExtdata2_NotEqual(nmExtdata2);
    }

    protected void doSetNmExtdata2_NotEqual(Long nmExtdata2) {
        regNmExtdata2(CK_NES, nmExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterThan(Long nmExtdata2) {
        regNmExtdata2(CK_GT, nmExtdata2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessThan(Long nmExtdata2) {
        regNmExtdata2(CK_LT, nmExtdata2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterEqual(Long nmExtdata2) {
        regNmExtdata2(CK_GE, nmExtdata2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessEqual(Long nmExtdata2) {
        regNmExtdata2(CK_LE, nmExtdata2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param minNumber The min number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata2(), "NM_EXTDATA2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_InScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        regINS(CK_INS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_NotInScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        regINS(CK_NINS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNull() { regNmExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNotNull() { regNmExtdata2(CK_ISNN, DOBJ); }

    protected void regNmExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata2(), "NM_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNmExtdata2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_Equal(Long nmExtdata3) {
        doSetNmExtdata3_Equal(nmExtdata3);
    }

    protected void doSetNmExtdata3_Equal(Long nmExtdata3) {
        regNmExtdata3(CK_EQ, nmExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotEqual(Long nmExtdata3) {
        doSetNmExtdata3_NotEqual(nmExtdata3);
    }

    protected void doSetNmExtdata3_NotEqual(Long nmExtdata3) {
        regNmExtdata3(CK_NES, nmExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterThan(Long nmExtdata3) {
        regNmExtdata3(CK_GT, nmExtdata3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessThan(Long nmExtdata3) {
        regNmExtdata3(CK_LT, nmExtdata3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterEqual(Long nmExtdata3) {
        regNmExtdata3(CK_GE, nmExtdata3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessEqual(Long nmExtdata3) {
        regNmExtdata3(CK_LE, nmExtdata3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param minNumber The min number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata3(), "NM_EXTDATA3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_InScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        regINS(CK_INS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_NotInScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        regINS(CK_NINS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNull() { regNmExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNotNull() { regNmExtdata3(CK_ISNN, DOBJ); }

    protected void regNmExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata3(), "NM_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNmExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_Equal(String dtExtdata1) {
        doSetDtExtdata1_Equal(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_Equal(String dtExtdata1) {
        regDtExtdata1(CK_EQ, dtExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotEqual(String dtExtdata1) {
        doSetDtExtdata1_NotEqual(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_NotEqual(String dtExtdata1) {
        regDtExtdata1(CK_NES, dtExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterThan(String dtExtdata1) {
        regDtExtdata1(CK_GT, fRES(dtExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessThan(String dtExtdata1) {
        regDtExtdata1(CK_LT, fRES(dtExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterEqual(String dtExtdata1) {
        regDtExtdata1(CK_GE, fRES(dtExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessEqual(String dtExtdata1) {
        regDtExtdata1(CK_LE, fRES(dtExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_InScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        regINS(CK_INS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_NotInScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        regINS(CK_NINS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata1 The value of dtExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata1_LikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata1_NotLikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_PrefixSearch(String dtExtdata1) {
        setDtExtdata1_LikeSearch(dtExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNull() { regDtExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNullOrEmpty() { regDtExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNotNull() { regDtExtdata1(CK_ISNN, DOBJ); }

    protected void regDtExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata1(), "DT_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueDtExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(String dtExtdata2) {
        doSetDtExtdata2_Equal(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_Equal(String dtExtdata2) {
        regDtExtdata2(CK_EQ, dtExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotEqual(String dtExtdata2) {
        doSetDtExtdata2_NotEqual(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_NotEqual(String dtExtdata2) {
        regDtExtdata2(CK_NES, dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(String dtExtdata2) {
        regDtExtdata2(CK_GT, fRES(dtExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(String dtExtdata2) {
        regDtExtdata2(CK_LT, fRES(dtExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(String dtExtdata2) {
        regDtExtdata2(CK_GE, fRES(dtExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(String dtExtdata2) {
        regDtExtdata2(CK_LE, fRES(dtExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_InScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        regINS(CK_INS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_NotInScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        regINS(CK_NINS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata2 The value of dtExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata2_LikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata2_NotLikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_PrefixSearch(String dtExtdata2) {
        setDtExtdata2_LikeSearch(dtExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNullOrEmpty() { regDtExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_Equal(String dtExtdata3) {
        doSetDtExtdata3_Equal(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_Equal(String dtExtdata3) {
        regDtExtdata3(CK_EQ, dtExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotEqual(String dtExtdata3) {
        doSetDtExtdata3_NotEqual(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_NotEqual(String dtExtdata3) {
        regDtExtdata3(CK_NES, dtExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterThan(String dtExtdata3) {
        regDtExtdata3(CK_GT, fRES(dtExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessThan(String dtExtdata3) {
        regDtExtdata3(CK_LT, fRES(dtExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterEqual(String dtExtdata3) {
        regDtExtdata3(CK_GE, fRES(dtExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessEqual(String dtExtdata3) {
        regDtExtdata3(CK_LE, fRES(dtExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_InScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        regINS(CK_INS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_NotInScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        regINS(CK_NINS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata3 The value of dtExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata3_LikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata3_NotLikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_PrefixSearch(String dtExtdata3) {
        setDtExtdata3_LikeSearch(dtExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNull() { regDtExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNullOrEmpty() { regDtExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNotNull() { regDtExtdata3(CK_ISNN, DOBJ); }

    protected void regDtExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata3(), "DT_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueDtExtdata3();

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
    public HpSLCFunction<TTrpalletexpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpalletexpCB.class);
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
    public HpSLCFunction<TTrpalletexpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpalletexpCB.class);
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
    public HpSLCFunction<TTrpalletexpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpalletexpCB.class);
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
    public HpSLCFunction<TTrpalletexpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpalletexpCB.class);
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
    public HpSLCFunction<TTrpalletexpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpalletexpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpalletexpCB&gt;() {
     *     public void query(TTrpalletexpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpalletexpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpalletexpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpalletexpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpalletexpCQ sq);

    protected TTrpalletexpCB xcreateScalarConditionCB() {
        TTrpalletexpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpalletexpCB xcreateScalarConditionPartitionByCB() {
        TTrpalletexpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpalletexpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpalletexpCB cb = new TTrpalletexpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRPALLETEXP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpalletexpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpalletexpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpalletexpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpalletexpCB cb = new TTrpalletexpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRPALLETEXP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpalletexpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpalletexpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpalletexpCB cb = new TTrpalletexpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpalletexpCQ sq);

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
    protected TTrpalletexpCB newMyCB() {
        return new TTrpalletexpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpalletexpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

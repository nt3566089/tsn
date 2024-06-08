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
 * The abstract condition-query of W_WKSORTSUB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWksortsubCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWksortsubCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKSORTSUB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkey The value of sortsubkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsubkey_Equal(java.math.BigDecimal sortsubkey) {
        doSetSortsubkey_Equal(sortsubkey);
    }

    protected void doSetSortsubkey_Equal(java.math.BigDecimal sortsubkey) {
        regSortsubkey(CK_EQ, sortsubkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkey The value of sortsubkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsubkey_NotEqual(java.math.BigDecimal sortsubkey) {
        doSetSortsubkey_NotEqual(sortsubkey);
    }

    protected void doSetSortsubkey_NotEqual(java.math.BigDecimal sortsubkey) {
        regSortsubkey(CK_NES, sortsubkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkey The value of sortsubkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsubkey_GreaterThan(java.math.BigDecimal sortsubkey) {
        regSortsubkey(CK_GT, sortsubkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkey The value of sortsubkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsubkey_LessThan(java.math.BigDecimal sortsubkey) {
        regSortsubkey(CK_LT, sortsubkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkey The value of sortsubkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsubkey_GreaterEqual(java.math.BigDecimal sortsubkey) {
        regSortsubkey(CK_GE, sortsubkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkey The value of sortsubkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsubkey_LessEqual(java.math.BigDecimal sortsubkey) {
        regSortsubkey(CK_LE, sortsubkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of sortsubkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortsubkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortsubkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortsubkey(), "SORTSUBKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkeyList The collection of sortsubkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortsubkey_InScope(Collection<java.math.BigDecimal> sortsubkeyList) {
        doSetSortsubkey_InScope(sortsubkeyList);
    }

    protected void doSetSortsubkey_InScope(Collection<java.math.BigDecimal> sortsubkeyList) {
        regINS(CK_INS, cTL(sortsubkeyList), xgetCValueSortsubkey(), "SORTSUBKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @param sortsubkeyList The collection of sortsubkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortsubkey_NotInScope(Collection<java.math.BigDecimal> sortsubkeyList) {
        doSetSortsubkey_NotInScope(sortsubkeyList);
    }

    protected void doSetSortsubkey_NotInScope(Collection<java.math.BigDecimal> sortsubkeyList) {
        regINS(CK_NINS, cTL(sortsubkeyList), xgetCValueSortsubkey(), "SORTSUBKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setSortsubkey_IsNull() { regSortsubkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setSortsubkey_IsNotNull() { regSortsubkey(CK_ISNN, DOBJ); }

    protected void regSortsubkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortsubkey(), "SORTSUBKEY"); }
    protected abstract ConditionValue xgetCValueSortsubkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublineno The value of sortsublineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsublineno_Equal(Long sortsublineno) {
        doSetSortsublineno_Equal(sortsublineno);
    }

    protected void doSetSortsublineno_Equal(Long sortsublineno) {
        regSortsublineno(CK_EQ, sortsublineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublineno The value of sortsublineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsublineno_NotEqual(Long sortsublineno) {
        doSetSortsublineno_NotEqual(sortsublineno);
    }

    protected void doSetSortsublineno_NotEqual(Long sortsublineno) {
        regSortsublineno(CK_NES, sortsublineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublineno The value of sortsublineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsublineno_GreaterThan(Long sortsublineno) {
        regSortsublineno(CK_GT, sortsublineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublineno The value of sortsublineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsublineno_LessThan(Long sortsublineno) {
        regSortsublineno(CK_LT, sortsublineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublineno The value of sortsublineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsublineno_GreaterEqual(Long sortsublineno) {
        regSortsublineno(CK_GE, sortsublineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublineno The value of sortsublineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortsublineno_LessEqual(Long sortsublineno) {
        regSortsublineno(CK_LE, sortsublineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of sortsublineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortsublineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortsublineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortsublineno(), "SORTSUBLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublinenoList The collection of sortsublineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortsublineno_InScope(Collection<Long> sortsublinenoList) {
        doSetSortsublineno_InScope(sortsublinenoList);
    }

    protected void doSetSortsublineno_InScope(Collection<Long> sortsublinenoList) {
        regINS(CK_INS, cTL(sortsublinenoList), xgetCValueSortsublineno(), "SORTSUBLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @param sortsublinenoList The collection of sortsublineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortsublineno_NotInScope(Collection<Long> sortsublinenoList) {
        doSetSortsublineno_NotInScope(sortsublinenoList);
    }

    protected void doSetSortsublineno_NotInScope(Collection<Long> sortsublinenoList) {
        regINS(CK_NINS, cTL(sortsublinenoList), xgetCValueSortsublineno(), "SORTSUBLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     */
    public void setSortsublineno_IsNull() { regSortsublineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     */
    public void setSortsublineno_IsNotNull() { regSortsublineno(CK_ISNN, DOBJ); }

    protected void regSortsublineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortsublineno(), "SORTSUBLINENO"); }
    protected abstract ConditionValue xgetCValueSortsublineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_Equal(java.math.BigDecimal sokey) {
        doSetSokey_Equal(sokey);
    }

    protected void doSetSokey_Equal(java.math.BigDecimal sokey) {
        regSokey(CK_EQ, sokey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_NotEqual(java.math.BigDecimal sokey) {
        doSetSokey_NotEqual(sokey);
    }

    protected void doSetSokey_NotEqual(java.math.BigDecimal sokey) {
        regSokey(CK_NES, sokey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterThan(java.math.BigDecimal sokey) {
        regSokey(CK_GT, sokey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessThan(java.math.BigDecimal sokey) {
        regSokey(CK_LT, sokey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterEqual(java.math.BigDecimal sokey) {
        regSokey(CK_GE, sokey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessEqual(java.math.BigDecimal sokey) {
        regSokey(CK_LE, sokey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param minNumber The min number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSokey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSokey(), "SOKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokeyList The collection of sokey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_InScope(sokeyList);
    }

    protected void doSetSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_INS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokeyList The collection of sokey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_NotInScope(sokeyList);
    }

    protected void doSetSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_NINS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     */
    public void setSokey_IsNull() { regSokey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     */
    public void setSokey_IsNotNull() { regSokey(CK_ISNN, DOBJ); }

    protected void regSokey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSokey(), "SOKEY"); }
    protected abstract ConditionValue xgetCValueSokey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_Equal(String plno) {
        doSetPlno_Equal(fRES(plno));
    }

    protected void doSetPlno_Equal(String plno) {
        regPlno(CK_EQ, plno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_NotEqual(String plno) {
        doSetPlno_NotEqual(fRES(plno));
    }

    protected void doSetPlno_NotEqual(String plno) {
        regPlno(CK_NES, plno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_GreaterThan(String plno) {
        regPlno(CK_GT, fRES(plno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_LessThan(String plno) {
        regPlno(CK_LT, fRES(plno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_GreaterEqual(String plno) {
        regPlno(CK_GE, fRES(plno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_LessEqual(String plno) {
        regPlno(CK_LE, fRES(plno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plnoList The collection of plno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_InScope(Collection<String> plnoList) {
        doSetPlno_InScope(plnoList);
    }

    protected void doSetPlno_InScope(Collection<String> plnoList) {
        regINS(CK_INS, cTL(plnoList), xgetCValuePlno(), "PLNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plnoList The collection of plno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_NotInScope(Collection<String> plnoList) {
        doSetPlno_NotInScope(plnoList);
    }

    protected void doSetPlno_NotInScope(Collection<String> plnoList) {
        regINS(CK_NINS, cTL(plnoList), xgetCValuePlno(), "PLNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLNO: {varchar(30)} <br>
     * <pre>e.g. setPlno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plno The value of plno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlno_LikeSearch(String plno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plno), xgetCValuePlno(), "PLNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlno_NotLikeSearch(String plno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plno), xgetCValuePlno(), "PLNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLNO: {varchar(30)}
     * @param plno The value of plno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlno_PrefixSearch(String plno) {
        setPlno_LikeSearch(plno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     */
    public void setPlno_IsNull() { regPlno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     */
    public void setPlno_IsNullOrEmpty() { regPlno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLNO: {varchar(30)}
     */
    public void setPlno_IsNotNull() { regPlno(CK_ISNN, DOBJ); }

    protected void regPlno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlno(), "PLNO"); }
    protected abstract ConditionValue xgetCValuePlno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
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
     * SYMBOLNO: {decimal(16, 6)}
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
     * SYMBOLNO: {decimal(16, 6)}
     * @param symbolno The value of symbolno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterThan(java.math.BigDecimal symbolno) {
        regSymbolno(CK_GT, symbolno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
     * @param symbolno The value of symbolno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessThan(java.math.BigDecimal symbolno) {
        regSymbolno(CK_LT, symbolno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
     * @param symbolno The value of symbolno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_GE, symbolno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
     * @param symbolno The value of symbolno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_LE, symbolno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
     * @param minNumber The min number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolno(), "SYMBOLNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
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
     * SYMBOLNO: {decimal(16, 6)}
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
     * SYMBOLNO: {decimal(16, 6)}
     */
    public void setSymbolno_IsNull() { regSymbolno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLNO: {decimal(16, 6)}
     */
    public void setSymbolno_IsNotNull() { regSymbolno(CK_ISNN, DOBJ); }

    protected void regSymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolno(), "SYMBOLNO"); }
    protected abstract ConditionValue xgetCValueSymbolno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkey The value of lotkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_Equal(java.math.BigDecimal lotkey) {
        doSetLotkey_Equal(lotkey);
    }

    protected void doSetLotkey_Equal(java.math.BigDecimal lotkey) {
        regLotkey(CK_EQ, lotkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkey The value of lotkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_NotEqual(java.math.BigDecimal lotkey) {
        doSetLotkey_NotEqual(lotkey);
    }

    protected void doSetLotkey_NotEqual(java.math.BigDecimal lotkey) {
        regLotkey(CK_NES, lotkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkey The value of lotkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterThan(java.math.BigDecimal lotkey) {
        regLotkey(CK_GT, lotkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkey The value of lotkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessThan(java.math.BigDecimal lotkey) {
        regLotkey(CK_LT, lotkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkey The value of lotkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterEqual(java.math.BigDecimal lotkey) {
        regLotkey(CK_GE, lotkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkey The value of lotkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessEqual(java.math.BigDecimal lotkey) {
        regLotkey(CK_LE, lotkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param minNumber The min number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotkey(), "LOTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkeyList The collection of lotkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_InScope(Collection<java.math.BigDecimal> lotkeyList) {
        doSetLotkey_InScope(lotkeyList);
    }

    protected void doSetLotkey_InScope(Collection<java.math.BigDecimal> lotkeyList) {
        regINS(CK_INS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     * @param lotkeyList The collection of lotkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_NotInScope(Collection<java.math.BigDecimal> lotkeyList) {
        doSetLotkey_NotInScope(lotkeyList);
    }

    protected void doSetLotkey_NotInScope(Collection<java.math.BigDecimal> lotkeyList) {
        regINS(CK_NINS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     */
    public void setLotkey_IsNull() { regLotkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTKEY: {decimal(16, 6)}
     */
    public void setLotkey_IsNotNull() { regLotkey(CK_ISNN, DOBJ); }

    protected void regLotkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotkey(), "LOTKEY"); }
    protected abstract ConditionValue xgetCValueLotkey();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_Equal(java.math.BigDecimal qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(java.math.BigDecimal qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_NotEqual(java.math.BigDecimal qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(java.math.BigDecimal qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(java.math.BigDecimal qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(java.math.BigDecimal qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(java.math.BigDecimal qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(java.math.BigDecimal qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<java.math.BigDecimal> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<java.math.BigDecimal> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {decimal(16, 6)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<java.math.BigDecimal> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<java.math.BigDecimal> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     */
    public void setQty_IsNull() { regQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY: {decimal(16, 6)}
     */
    public void setQty_IsNotNull() { regQty(CK_ISNN, DOBJ); }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflg The value of pickedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedflg_Equal(java.math.BigDecimal pickedflg) {
        doSetPickedflg_Equal(pickedflg);
    }

    protected void doSetPickedflg_Equal(java.math.BigDecimal pickedflg) {
        regPickedflg(CK_EQ, pickedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflg The value of pickedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedflg_NotEqual(java.math.BigDecimal pickedflg) {
        doSetPickedflg_NotEqual(pickedflg);
    }

    protected void doSetPickedflg_NotEqual(java.math.BigDecimal pickedflg) {
        regPickedflg(CK_NES, pickedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflg The value of pickedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedflg_GreaterThan(java.math.BigDecimal pickedflg) {
        regPickedflg(CK_GT, pickedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflg The value of pickedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedflg_LessThan(java.math.BigDecimal pickedflg) {
        regPickedflg(CK_LT, pickedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflg The value of pickedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedflg_GreaterEqual(java.math.BigDecimal pickedflg) {
        regPickedflg(CK_GE, pickedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflg The value of pickedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedflg_LessEqual(java.math.BigDecimal pickedflg) {
        regPickedflg(CK_LE, pickedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param minNumber The min number of pickedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedflg(), "PICKEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflgList The collection of pickedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedflg_InScope(Collection<java.math.BigDecimal> pickedflgList) {
        doSetPickedflg_InScope(pickedflgList);
    }

    protected void doSetPickedflg_InScope(Collection<java.math.BigDecimal> pickedflgList) {
        regINS(CK_INS, cTL(pickedflgList), xgetCValuePickedflg(), "PICKEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @param pickedflgList The collection of pickedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedflg_NotInScope(Collection<java.math.BigDecimal> pickedflgList) {
        doSetPickedflg_NotInScope(pickedflgList);
    }

    protected void doSetPickedflg_NotInScope(Collection<java.math.BigDecimal> pickedflgList) {
        regINS(CK_NINS, cTL(pickedflgList), xgetCValuePickedflg(), "PICKEDFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     */
    public void setPickedflg_IsNull() { regPickedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKEDFLG: {decimal(16, 6)}
     */
    public void setPickedflg_IsNotNull() { regPickedflg(CK_ISNN, DOBJ); }

    protected void regPickedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedflg(), "PICKEDFLG"); }
    protected abstract ConditionValue xgetCValuePickedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflg The value of sortedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedflg_Equal(java.math.BigDecimal sortedflg) {
        doSetSortedflg_Equal(sortedflg);
    }

    protected void doSetSortedflg_Equal(java.math.BigDecimal sortedflg) {
        regSortedflg(CK_EQ, sortedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflg The value of sortedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedflg_NotEqual(java.math.BigDecimal sortedflg) {
        doSetSortedflg_NotEqual(sortedflg);
    }

    protected void doSetSortedflg_NotEqual(java.math.BigDecimal sortedflg) {
        regSortedflg(CK_NES, sortedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflg The value of sortedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedflg_GreaterThan(java.math.BigDecimal sortedflg) {
        regSortedflg(CK_GT, sortedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflg The value of sortedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedflg_LessThan(java.math.BigDecimal sortedflg) {
        regSortedflg(CK_LT, sortedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflg The value of sortedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedflg_GreaterEqual(java.math.BigDecimal sortedflg) {
        regSortedflg(CK_GE, sortedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflg The value of sortedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedflg_LessEqual(java.math.BigDecimal sortedflg) {
        regSortedflg(CK_LE, sortedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param minNumber The min number of sortedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedflg(), "SORTEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflgList The collection of sortedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedflg_InScope(Collection<java.math.BigDecimal> sortedflgList) {
        doSetSortedflg_InScope(sortedflgList);
    }

    protected void doSetSortedflg_InScope(Collection<java.math.BigDecimal> sortedflgList) {
        regINS(CK_INS, cTL(sortedflgList), xgetCValueSortedflg(), "SORTEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @param sortedflgList The collection of sortedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedflg_NotInScope(Collection<java.math.BigDecimal> sortedflgList) {
        doSetSortedflg_NotInScope(sortedflgList);
    }

    protected void doSetSortedflg_NotInScope(Collection<java.math.BigDecimal> sortedflgList) {
        regINS(CK_NINS, cTL(sortedflgList), xgetCValueSortedflg(), "SORTEDFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     */
    public void setSortedflg_IsNull() { regSortedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTEDFLG: {decimal(16, 6)}
     */
    public void setSortedflg_IsNotNull() { regSortedflg(CK_ISNN, DOBJ); }

    protected void regSortedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedflg(), "SORTEDFLG"); }
    protected abstract ConditionValue xgetCValueSortedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_Equal(String manualsymbolno) {
        doSetManualsymbolno_Equal(fRES(manualsymbolno));
    }

    protected void doSetManualsymbolno_Equal(String manualsymbolno) {
        regManualsymbolno(CK_EQ, manualsymbolno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_NotEqual(String manualsymbolno) {
        doSetManualsymbolno_NotEqual(fRES(manualsymbolno));
    }

    protected void doSetManualsymbolno_NotEqual(String manualsymbolno) {
        regManualsymbolno(CK_NES, manualsymbolno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_GreaterThan(String manualsymbolno) {
        regManualsymbolno(CK_GT, fRES(manualsymbolno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_LessThan(String manualsymbolno) {
        regManualsymbolno(CK_LT, fRES(manualsymbolno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_GreaterEqual(String manualsymbolno) {
        regManualsymbolno(CK_GE, fRES(manualsymbolno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_LessEqual(String manualsymbolno) {
        regManualsymbolno(CK_LE, fRES(manualsymbolno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolnoList The collection of manualsymbolno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_InScope(Collection<String> manualsymbolnoList) {
        doSetManualsymbolno_InScope(manualsymbolnoList);
    }

    protected void doSetManualsymbolno_InScope(Collection<String> manualsymbolnoList) {
        regINS(CK_INS, cTL(manualsymbolnoList), xgetCValueManualsymbolno(), "MANUALSYMBOLNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolnoList The collection of manualsymbolno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_NotInScope(Collection<String> manualsymbolnoList) {
        doSetManualsymbolno_NotInScope(manualsymbolnoList);
    }

    protected void doSetManualsymbolno_NotInScope(Collection<String> manualsymbolnoList) {
        regINS(CK_NINS, cTL(manualsymbolnoList), xgetCValueManualsymbolno(), "MANUALSYMBOLNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)} <br>
     * <pre>e.g. setManualsymbolno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manualsymbolno The value of manualsymbolno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManualsymbolno_LikeSearch(String manualsymbolno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manualsymbolno), xgetCValueManualsymbolno(), "MANUALSYMBOLNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManualsymbolno_NotLikeSearch(String manualsymbolno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manualsymbolno), xgetCValueManualsymbolno(), "MANUALSYMBOLNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @param manualsymbolno The value of manualsymbolno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManualsymbolno_PrefixSearch(String manualsymbolno) {
        setManualsymbolno_LikeSearch(manualsymbolno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     */
    public void setManualsymbolno_IsNull() { regManualsymbolno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     */
    public void setManualsymbolno_IsNullOrEmpty() { regManualsymbolno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     */
    public void setManualsymbolno_IsNotNull() { regManualsymbolno(CK_ISNN, DOBJ); }

    protected void regManualsymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManualsymbolno(), "MANUALSYMBOLNO"); }
    protected abstract ConditionValue xgetCValueManualsymbolno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseq The value of assortseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortseq_Equal(Long assortseq) {
        doSetAssortseq_Equal(assortseq);
    }

    protected void doSetAssortseq_Equal(Long assortseq) {
        regAssortseq(CK_EQ, assortseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseq The value of assortseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortseq_NotEqual(Long assortseq) {
        doSetAssortseq_NotEqual(assortseq);
    }

    protected void doSetAssortseq_NotEqual(Long assortseq) {
        regAssortseq(CK_NES, assortseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseq The value of assortseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortseq_GreaterThan(Long assortseq) {
        regAssortseq(CK_GT, assortseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseq The value of assortseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortseq_LessThan(Long assortseq) {
        regAssortseq(CK_LT, assortseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseq The value of assortseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortseq_GreaterEqual(Long assortseq) {
        regAssortseq(CK_GE, assortseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseq The value of assortseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortseq_LessEqual(Long assortseq) {
        regAssortseq(CK_LE, assortseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param minNumber The min number of assortseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortseq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortseq(), "ASSORTSEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseqList The collection of assortseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortseq_InScope(Collection<Long> assortseqList) {
        doSetAssortseq_InScope(assortseqList);
    }

    protected void doSetAssortseq_InScope(Collection<Long> assortseqList) {
        regINS(CK_INS, cTL(assortseqList), xgetCValueAssortseq(), "ASSORTSEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     * @param assortseqList The collection of assortseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortseq_NotInScope(Collection<Long> assortseqList) {
        doSetAssortseq_NotInScope(assortseqList);
    }

    protected void doSetAssortseq_NotInScope(Collection<Long> assortseqList) {
        regINS(CK_NINS, cTL(assortseqList), xgetCValueAssortseq(), "ASSORTSEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     */
    public void setAssortseq_IsNull() { regAssortseq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTSEQ: {bigint(19)}
     */
    public void setAssortseq_IsNotNull() { regAssortseq(CK_ISNN, DOBJ); }

    protected void regAssortseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortseq(), "ASSORTSEQ"); }
    protected abstract ConditionValue xgetCValueAssortseq();

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
    public HpSLCFunction<WWksortsubCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWksortsubCB.class);
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
    public HpSLCFunction<WWksortsubCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWksortsubCB.class);
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
    public HpSLCFunction<WWksortsubCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWksortsubCB.class);
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
    public HpSLCFunction<WWksortsubCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWksortsubCB.class);
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
    public HpSLCFunction<WWksortsubCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWksortsubCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWksortsubCB&gt;() {
     *     public void query(WWksortsubCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWksortsubCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWksortsubCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWksortsubCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWksortsubCQ sq);

    protected WWksortsubCB xcreateScalarConditionCB() {
        WWksortsubCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWksortsubCB xcreateScalarConditionPartitionByCB() {
        WWksortsubCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WWksortsubCB newMyCB() {
        return new WWksortsubCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWksortsubCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

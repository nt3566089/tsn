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
 * The abstract condition-query of E_TRIFTRNODR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETriftrnodrCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETriftrnodrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TRIFTRNODR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakey The value of ifdatakey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfdatakey_Equal(java.math.BigDecimal ifdatakey) {
        doSetIfdatakey_Equal(ifdatakey);
    }

    protected void doSetIfdatakey_Equal(java.math.BigDecimal ifdatakey) {
        regIfdatakey(CK_EQ, ifdatakey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakey The value of ifdatakey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfdatakey_NotEqual(java.math.BigDecimal ifdatakey) {
        doSetIfdatakey_NotEqual(ifdatakey);
    }

    protected void doSetIfdatakey_NotEqual(java.math.BigDecimal ifdatakey) {
        regIfdatakey(CK_NES, ifdatakey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakey The value of ifdatakey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfdatakey_GreaterThan(java.math.BigDecimal ifdatakey) {
        regIfdatakey(CK_GT, ifdatakey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakey The value of ifdatakey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfdatakey_LessThan(java.math.BigDecimal ifdatakey) {
        regIfdatakey(CK_LT, ifdatakey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakey The value of ifdatakey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfdatakey_GreaterEqual(java.math.BigDecimal ifdatakey) {
        regIfdatakey(CK_GE, ifdatakey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakey The value of ifdatakey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfdatakey_LessEqual(java.math.BigDecimal ifdatakey) {
        regIfdatakey(CK_LE, ifdatakey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of ifdatakey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ifdatakey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIfdatakey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIfdatakey(), "IFDATAKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakeyList The collection of ifdatakey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfdatakey_InScope(Collection<java.math.BigDecimal> ifdatakeyList) {
        doSetIfdatakey_InScope(ifdatakeyList);
    }

    protected void doSetIfdatakey_InScope(Collection<java.math.BigDecimal> ifdatakeyList) {
        regINS(CK_INS, cTL(ifdatakeyList), xgetCValueIfdatakey(), "IFDATAKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @param ifdatakeyList The collection of ifdatakey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfdatakey_NotInScope(Collection<java.math.BigDecimal> ifdatakeyList) {
        doSetIfdatakey_NotInScope(ifdatakeyList);
    }

    protected void doSetIfdatakey_NotInScope(Collection<java.math.BigDecimal> ifdatakeyList) {
        regINS(CK_NINS, cTL(ifdatakeyList), xgetCValueIfdatakey(), "IFDATAKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setIfdatakey_IsNull() { regIfdatakey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setIfdatakey_IsNotNull() { regIfdatakey(CK_ISNN, DOBJ); }

    protected void regIfdatakey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfdatakey(), "IFDATAKEY"); }
    protected abstract ConditionValue xgetCValueIfdatakey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_Equal(String segname) {
        doSetSegname_Equal(fRES(segname));
    }

    protected void doSetSegname_Equal(String segname) {
        regSegname(CK_EQ, segname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_NotEqual(String segname) {
        doSetSegname_NotEqual(fRES(segname));
    }

    protected void doSetSegname_NotEqual(String segname) {
        regSegname(CK_NES, segname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_GreaterThan(String segname) {
        regSegname(CK_GT, fRES(segname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_LessThan(String segname) {
        regSegname(CK_LT, fRES(segname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_GreaterEqual(String segname) {
        regSegname(CK_GE, fRES(segname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_LessEqual(String segname) {
        regSegname(CK_LE, fRES(segname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segnameList The collection of segname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_InScope(Collection<String> segnameList) {
        doSetSegname_InScope(segnameList);
    }

    protected void doSetSegname_InScope(Collection<String> segnameList) {
        regINS(CK_INS, cTL(segnameList), xgetCValueSegname(), "SEGNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segnameList The collection of segname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_NotInScope(Collection<String> segnameList) {
        doSetSegname_NotInScope(segnameList);
    }

    protected void doSetSegname_NotInScope(Collection<String> segnameList) {
        regINS(CK_NINS, cTL(segnameList), xgetCValueSegname(), "SEGNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSegname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param segname The value of segname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSegname_LikeSearch(String segname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(segname), xgetCValueSegname(), "SEGNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSegname_NotLikeSearch(String segname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(segname), xgetCValueSegname(), "SEGNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @param segname The value of segname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSegname_PrefixSearch(String segname) {
        setSegname_LikeSearch(segname, xcLSOPPre());
    }

    protected void regSegname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSegname(), "SEGNAME"); }
    protected abstract ConditionValue xgetCValueSegname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(60)}
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
     * REFNO: {NotNull, varchar(60)}
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
     * REFNO: {NotNull, varchar(60)}
     * @param refno The value of refno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterThan(String refno) {
        regRefno(CK_GT, fRES(refno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(60)}
     * @param refno The value of refno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessThan(String refno) {
        regRefno(CK_LT, fRES(refno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(60)}
     * @param refno The value of refno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterEqual(String refno) {
        regRefno(CK_GE, fRES(refno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(60)}
     * @param refno The value of refno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessEqual(String refno) {
        regRefno(CK_LE, fRES(refno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(60)}
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
     * REFNO: {NotNull, varchar(60)}
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
     * REFNO: {NotNull, varchar(60)} <br>
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
     * REFNO: {NotNull, varchar(60)}
     * @param refno The value of refno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefno_NotLikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(60)}
     * @param refno The value of refno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_PrefixSearch(String refno) {
        setRefno_LikeSearch(refno, xcLSOPPre());
    }

    protected void regRefno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefno(), "REFNO"); }
    protected abstract ConditionValue xgetCValueRefno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_Equal(String nexuspkey) {
        doSetNexuspkey_Equal(fRES(nexuspkey));
    }

    protected void doSetNexuspkey_Equal(String nexuspkey) {
        regNexuspkey(CK_EQ, nexuspkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_NotEqual(String nexuspkey) {
        doSetNexuspkey_NotEqual(fRES(nexuspkey));
    }

    protected void doSetNexuspkey_NotEqual(String nexuspkey) {
        regNexuspkey(CK_NES, nexuspkey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_GreaterThan(String nexuspkey) {
        regNexuspkey(CK_GT, fRES(nexuspkey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_LessThan(String nexuspkey) {
        regNexuspkey(CK_LT, fRES(nexuspkey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_GreaterEqual(String nexuspkey) {
        regNexuspkey(CK_GE, fRES(nexuspkey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_LessEqual(String nexuspkey) {
        regNexuspkey(CK_LE, fRES(nexuspkey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkeyList The collection of nexuspkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_InScope(Collection<String> nexuspkeyList) {
        doSetNexuspkey_InScope(nexuspkeyList);
    }

    protected void doSetNexuspkey_InScope(Collection<String> nexuspkeyList) {
        regINS(CK_INS, cTL(nexuspkeyList), xgetCValueNexuspkey(), "NEXUSPKEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkeyList The collection of nexuspkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_NotInScope(Collection<String> nexuspkeyList) {
        doSetNexuspkey_NotInScope(nexuspkeyList);
    }

    protected void doSetNexuspkey_NotInScope(Collection<String> nexuspkeyList) {
        regINS(CK_NINS, cTL(nexuspkeyList), xgetCValueNexuspkey(), "NEXUSPKEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)} <br>
     * <pre>e.g. setNexuspkey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nexuspkey The value of nexuspkey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNexuspkey_LikeSearch(String nexuspkey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nexuspkey), xgetCValueNexuspkey(), "NEXUSPKEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNexuspkey_NotLikeSearch(String nexuspkey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nexuspkey), xgetCValueNexuspkey(), "NEXUSPKEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @param nexuspkey The value of nexuspkey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNexuspkey_PrefixSearch(String nexuspkey) {
        setNexuspkey_LikeSearch(nexuspkey, xcLSOPPre());
    }

    protected void regNexuspkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNexuspkey(), "NEXUSPKEY"); }
    protected abstract ConditionValue xgetCValueNexuspkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {NotNull, varchar(30)}
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
     * ORDERNO: {NotNull, varchar(30)}
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
     * ORDERNO: {NotNull, varchar(30)}
     * @param orderno The value of orderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterThan(String orderno) {
        regOrderno(CK_GT, fRES(orderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {NotNull, varchar(30)}
     * @param orderno The value of orderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessThan(String orderno) {
        regOrderno(CK_LT, fRES(orderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {NotNull, varchar(30)}
     * @param orderno The value of orderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterEqual(String orderno) {
        regOrderno(CK_GE, fRES(orderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {NotNull, varchar(30)}
     * @param orderno The value of orderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessEqual(String orderno) {
        regOrderno(CK_LE, fRES(orderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {NotNull, varchar(30)}
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
     * ORDERNO: {NotNull, varchar(30)}
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
     * ORDERNO: {NotNull, varchar(30)} <br>
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
     * ORDERNO: {NotNull, varchar(30)}
     * @param orderno The value of orderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderno_NotLikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {NotNull, varchar(30)}
     * @param orderno The value of orderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_PrefixSearch(String orderno) {
        setOrderno_LikeSearch(orderno, xcLSOPPre());
    }

    protected void regOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderno(), "ORDERNO"); }
    protected abstract ConditionValue xgetCValueOrderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
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
     * ORDERTYPE: {NotNull, varchar(30)}
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
     * ORDERTYPE: {NotNull, varchar(30)}
     * @param ordertype The value of ordertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterThan(String ordertype) {
        regOrdertype(CK_GT, fRES(ordertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
     * @param ordertype The value of ordertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessThan(String ordertype) {
        regOrdertype(CK_LT, fRES(ordertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
     * @param ordertype The value of ordertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterEqual(String ordertype) {
        regOrdertype(CK_GE, fRES(ordertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
     * @param ordertype The value of ordertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessEqual(String ordertype) {
        regOrdertype(CK_LE, fRES(ordertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
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
     * ORDERTYPE: {NotNull, varchar(30)}
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
     * ORDERTYPE: {NotNull, varchar(30)} <br>
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
     * ORDERTYPE: {NotNull, varchar(30)}
     * @param ordertype The value of ordertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdertype_NotLikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
     * @param ordertype The value of ordertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_PrefixSearch(String ordertype) {
        setOrdertype_LikeSearch(ordertype, xcLSOPPre());
    }

    protected void regOrdertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdertype(), "ORDERTYPE"); }
    protected abstract ConditionValue xgetCValueOrdertype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_Equal(String custorderno) {
        doSetCustorderno_Equal(fRES(custorderno));
    }

    protected void doSetCustorderno_Equal(String custorderno) {
        regCustorderno(CK_EQ, custorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotEqual(String custorderno) {
        doSetCustorderno_NotEqual(fRES(custorderno));
    }

    protected void doSetCustorderno_NotEqual(String custorderno) {
        regCustorderno(CK_NES, custorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterThan(String custorderno) {
        regCustorderno(CK_GT, fRES(custorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessThan(String custorderno) {
        regCustorderno(CK_LT, fRES(custorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterEqual(String custorderno) {
        regCustorderno(CK_GE, fRES(custorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessEqual(String custorderno) {
        regCustorderno(CK_LE, fRES(custorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custordernoList The collection of custorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_InScope(Collection<String> custordernoList) {
        doSetCustorderno_InScope(custordernoList);
    }

    protected void doSetCustorderno_InScope(Collection<String> custordernoList) {
        regINS(CK_INS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custordernoList The collection of custorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotInScope(Collection<String> custordernoList) {
        doSetCustorderno_NotInScope(custordernoList);
    }

    protected void doSetCustorderno_NotInScope(Collection<String> custordernoList) {
        regINS(CK_NINS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setCustorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param custorderno The value of custorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustorderno_LikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustorderno_NotLikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @param custorderno The value of custorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_PrefixSearch(String custorderno) {
        setCustorderno_LikeSearch(custorderno, xcLSOPPre());
    }

    protected void regCustorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustorderno(), "CUSTORDERNO"); }
    protected abstract ConditionValue xgetCValueCustorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_Equal(String trantype) {
        doSetTrantype_Equal(fRES(trantype));
    }

    protected void doSetTrantype_Equal(String trantype) {
        regTrantype(CK_EQ, trantype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_NotEqual(String trantype) {
        doSetTrantype_NotEqual(fRES(trantype));
    }

    protected void doSetTrantype_NotEqual(String trantype) {
        regTrantype(CK_NES, trantype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_GreaterThan(String trantype) {
        regTrantype(CK_GT, fRES(trantype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_LessThan(String trantype) {
        regTrantype(CK_LT, fRES(trantype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_GreaterEqual(String trantype) {
        regTrantype(CK_GE, fRES(trantype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_LessEqual(String trantype) {
        regTrantype(CK_LE, fRES(trantype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantypeList The collection of trantype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_InScope(Collection<String> trantypeList) {
        doSetTrantype_InScope(trantypeList);
    }

    protected void doSetTrantype_InScope(Collection<String> trantypeList) {
        regINS(CK_INS, cTL(trantypeList), xgetCValueTrantype(), "TRANTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantypeList The collection of trantype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_NotInScope(Collection<String> trantypeList) {
        doSetTrantype_NotInScope(trantypeList);
    }

    protected void doSetTrantype_NotInScope(Collection<String> trantypeList) {
        regINS(CK_NINS, cTL(trantypeList), xgetCValueTrantype(), "TRANTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setTrantype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trantype The value of trantype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrantype_LikeSearch(String trantype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trantype), xgetCValueTrantype(), "TRANTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrantype_NotLikeSearch(String trantype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trantype), xgetCValueTrantype(), "TRANTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @param trantype The value of trantype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrantype_PrefixSearch(String trantype) {
        setTrantype_LikeSearch(trantype, xcLSOPPre());
    }

    protected void regTrantype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrantype(), "TRANTYPE"); }
    protected abstract ConditionValue xgetCValueTrantype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_Equal(String rmano) {
        doSetRmano_Equal(fRES(rmano));
    }

    protected void doSetRmano_Equal(String rmano) {
        regRmano(CK_EQ, rmano);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotEqual(String rmano) {
        doSetRmano_NotEqual(fRES(rmano));
    }

    protected void doSetRmano_NotEqual(String rmano) {
        regRmano(CK_NES, rmano);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterThan(String rmano) {
        regRmano(CK_GT, fRES(rmano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessThan(String rmano) {
        regRmano(CK_LT, fRES(rmano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterEqual(String rmano) {
        regRmano(CK_GE, fRES(rmano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessEqual(String rmano) {
        regRmano(CK_LE, fRES(rmano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmanoList The collection of rmano as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_InScope(Collection<String> rmanoList) {
        doSetRmano_InScope(rmanoList);
    }

    protected void doSetRmano_InScope(Collection<String> rmanoList) {
        regINS(CK_INS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmanoList The collection of rmano as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotInScope(Collection<String> rmanoList) {
        doSetRmano_NotInScope(rmanoList);
    }

    protected void doSetRmano_NotInScope(Collection<String> rmanoList) {
        regINS(CK_NINS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRmano_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rmano The value of rmano as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRmano_LikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmano_NotLikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {NotNull, varchar(30)}
     * @param rmano The value of rmano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_PrefixSearch(String rmano) {
        setRmano_LikeSearch(rmano, xcLSOPPre());
    }

    protected void regRmano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmano(), "RMANO"); }
    protected abstract ConditionValue xgetCValueRmano();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_Equal(String transdetailtype) {
        doSetTransdetailtype_Equal(fRES(transdetailtype));
    }

    protected void doSetTransdetailtype_Equal(String transdetailtype) {
        regTransdetailtype(CK_EQ, transdetailtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_NotEqual(String transdetailtype) {
        doSetTransdetailtype_NotEqual(fRES(transdetailtype));
    }

    protected void doSetTransdetailtype_NotEqual(String transdetailtype) {
        regTransdetailtype(CK_NES, transdetailtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_GreaterThan(String transdetailtype) {
        regTransdetailtype(CK_GT, fRES(transdetailtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_LessThan(String transdetailtype) {
        regTransdetailtype(CK_LT, fRES(transdetailtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_GreaterEqual(String transdetailtype) {
        regTransdetailtype(CK_GE, fRES(transdetailtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_LessEqual(String transdetailtype) {
        regTransdetailtype(CK_LE, fRES(transdetailtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtypeList The collection of transdetailtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_InScope(Collection<String> transdetailtypeList) {
        doSetTransdetailtype_InScope(transdetailtypeList);
    }

    protected void doSetTransdetailtype_InScope(Collection<String> transdetailtypeList) {
        regINS(CK_INS, cTL(transdetailtypeList), xgetCValueTransdetailtype(), "TRANSDETAILTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtypeList The collection of transdetailtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_NotInScope(Collection<String> transdetailtypeList) {
        doSetTransdetailtype_NotInScope(transdetailtypeList);
    }

    protected void doSetTransdetailtype_NotInScope(Collection<String> transdetailtypeList) {
        regINS(CK_NINS, cTL(transdetailtypeList), xgetCValueTransdetailtype(), "TRANSDETAILTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setTransdetailtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transdetailtype The value of transdetailtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransdetailtype_LikeSearch(String transdetailtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transdetailtype), xgetCValueTransdetailtype(), "TRANSDETAILTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransdetailtype_NotLikeSearch(String transdetailtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transdetailtype), xgetCValueTransdetailtype(), "TRANSDETAILTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @param transdetailtype The value of transdetailtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransdetailtype_PrefixSearch(String transdetailtype) {
        setTransdetailtype_LikeSearch(transdetailtype, xcLSOPPre());
    }

    protected void regTransdetailtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransdetailtype(), "TRANSDETAILTYPE"); }
    protected abstract ConditionValue xgetCValueTransdetailtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_Equal(String schdate) {
        doSetSchdate_Equal(fRES(schdate));
    }

    protected void doSetSchdate_Equal(String schdate) {
        regSchdate(CK_EQ, schdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotEqual(String schdate) {
        doSetSchdate_NotEqual(fRES(schdate));
    }

    protected void doSetSchdate_NotEqual(String schdate) {
        regSchdate(CK_NES, schdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterThan(String schdate) {
        regSchdate(CK_GT, fRES(schdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessThan(String schdate) {
        regSchdate(CK_LT, fRES(schdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterEqual(String schdate) {
        regSchdate(CK_GE, fRES(schdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessEqual(String schdate) {
        regSchdate(CK_LE, fRES(schdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdateList The collection of schdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_InScope(Collection<String> schdateList) {
        doSetSchdate_InScope(schdateList);
    }

    protected void doSetSchdate_InScope(Collection<String> schdateList) {
        regINS(CK_INS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdateList The collection of schdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotInScope(Collection<String> schdateList) {
        doSetSchdate_NotInScope(schdateList);
    }

    protected void doSetSchdate_NotInScope(Collection<String> schdateList) {
        regINS(CK_NINS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSchdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schdate The value of schdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchdate_LikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchdate_NotLikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @param schdate The value of schdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_PrefixSearch(String schdate) {
        setSchdate_LikeSearch(schdate, xcLSOPPre());
    }

    protected void regSchdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchdate(), "SCHDATE"); }
    protected abstract ConditionValue xgetCValueSchdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_Equal(String schtime) {
        doSetSchtime_Equal(fRES(schtime));
    }

    protected void doSetSchtime_Equal(String schtime) {
        regSchtime(CK_EQ, schtime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_NotEqual(String schtime) {
        doSetSchtime_NotEqual(fRES(schtime));
    }

    protected void doSetSchtime_NotEqual(String schtime) {
        regSchtime(CK_NES, schtime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_GreaterThan(String schtime) {
        regSchtime(CK_GT, fRES(schtime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_LessThan(String schtime) {
        regSchtime(CK_LT, fRES(schtime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_GreaterEqual(String schtime) {
        regSchtime(CK_GE, fRES(schtime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_LessEqual(String schtime) {
        regSchtime(CK_LE, fRES(schtime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtimeList The collection of schtime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_InScope(Collection<String> schtimeList) {
        doSetSchtime_InScope(schtimeList);
    }

    protected void doSetSchtime_InScope(Collection<String> schtimeList) {
        regINS(CK_INS, cTL(schtimeList), xgetCValueSchtime(), "SCHTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtimeList The collection of schtime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_NotInScope(Collection<String> schtimeList) {
        doSetSchtime_NotInScope(schtimeList);
    }

    protected void doSetSchtime_NotInScope(Collection<String> schtimeList) {
        regINS(CK_NINS, cTL(schtimeList), xgetCValueSchtime(), "SCHTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSchtime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schtime The value of schtime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchtime_LikeSearch(String schtime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schtime), xgetCValueSchtime(), "SCHTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchtime_NotLikeSearch(String schtime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schtime), xgetCValueSchtime(), "SCHTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @param schtime The value of schtime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchtime_PrefixSearch(String schtime) {
        setSchtime_LikeSearch(schtime, xcLSOPPre());
    }

    protected void regSchtime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchtime(), "SCHTIME"); }
    protected abstract ConditionValue xgetCValueSchtime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_Equal(String actualdate) {
        doSetActualdate_Equal(fRES(actualdate));
    }

    protected void doSetActualdate_Equal(String actualdate) {
        regActualdate(CK_EQ, actualdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_NotEqual(String actualdate) {
        doSetActualdate_NotEqual(fRES(actualdate));
    }

    protected void doSetActualdate_NotEqual(String actualdate) {
        regActualdate(CK_NES, actualdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_GreaterThan(String actualdate) {
        regActualdate(CK_GT, fRES(actualdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_LessThan(String actualdate) {
        regActualdate(CK_LT, fRES(actualdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_GreaterEqual(String actualdate) {
        regActualdate(CK_GE, fRES(actualdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_LessEqual(String actualdate) {
        regActualdate(CK_LE, fRES(actualdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdateList The collection of actualdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_InScope(Collection<String> actualdateList) {
        doSetActualdate_InScope(actualdateList);
    }

    protected void doSetActualdate_InScope(Collection<String> actualdateList) {
        regINS(CK_INS, cTL(actualdateList), xgetCValueActualdate(), "ACTUALDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdateList The collection of actualdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_NotInScope(Collection<String> actualdateList) {
        doSetActualdate_NotInScope(actualdateList);
    }

    protected void doSetActualdate_NotInScope(Collection<String> actualdateList) {
        regINS(CK_NINS, cTL(actualdateList), xgetCValueActualdate(), "ACTUALDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setActualdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param actualdate The value of actualdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActualdate_LikeSearch(String actualdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(actualdate), xgetCValueActualdate(), "ACTUALDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setActualdate_NotLikeSearch(String actualdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(actualdate), xgetCValueActualdate(), "ACTUALDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @param actualdate The value of actualdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualdate_PrefixSearch(String actualdate) {
        setActualdate_LikeSearch(actualdate, xcLSOPPre());
    }

    protected void regActualdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActualdate(), "ACTUALDATE"); }
    protected abstract ConditionValue xgetCValueActualdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_Equal(String actualtime) {
        doSetActualtime_Equal(fRES(actualtime));
    }

    protected void doSetActualtime_Equal(String actualtime) {
        regActualtime(CK_EQ, actualtime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_NotEqual(String actualtime) {
        doSetActualtime_NotEqual(fRES(actualtime));
    }

    protected void doSetActualtime_NotEqual(String actualtime) {
        regActualtime(CK_NES, actualtime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_GreaterThan(String actualtime) {
        regActualtime(CK_GT, fRES(actualtime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_LessThan(String actualtime) {
        regActualtime(CK_LT, fRES(actualtime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_GreaterEqual(String actualtime) {
        regActualtime(CK_GE, fRES(actualtime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_LessEqual(String actualtime) {
        regActualtime(CK_LE, fRES(actualtime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtimeList The collection of actualtime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_InScope(Collection<String> actualtimeList) {
        doSetActualtime_InScope(actualtimeList);
    }

    protected void doSetActualtime_InScope(Collection<String> actualtimeList) {
        regINS(CK_INS, cTL(actualtimeList), xgetCValueActualtime(), "ACTUALTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtimeList The collection of actualtime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_NotInScope(Collection<String> actualtimeList) {
        doSetActualtime_NotInScope(actualtimeList);
    }

    protected void doSetActualtime_NotInScope(Collection<String> actualtimeList) {
        regINS(CK_NINS, cTL(actualtimeList), xgetCValueActualtime(), "ACTUALTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)} <br>
     * <pre>e.g. setActualtime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param actualtime The value of actualtime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActualtime_LikeSearch(String actualtime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(actualtime), xgetCValueActualtime(), "ACTUALTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setActualtime_NotLikeSearch(String actualtime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(actualtime), xgetCValueActualtime(), "ACTUALTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @param actualtime The value of actualtime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtime_PrefixSearch(String actualtime) {
        setActualtime_LikeSearch(actualtime, xcLSOPPre());
    }

    protected void regActualtime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActualtime(), "ACTUALTIME"); }
    protected abstract ConditionValue xgetCValueActualtime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)} <br>
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_Equal(String fromcompanycd) {
        doSetFromcompanycd_Equal(fRES(fromcompanycd));
    }

    protected void doSetFromcompanycd_Equal(String fromcompanycd) {
        regFromcompanycd(CK_EQ, fromcompanycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_NotEqual(String fromcompanycd) {
        doSetFromcompanycd_NotEqual(fRES(fromcompanycd));
    }

    protected void doSetFromcompanycd_NotEqual(String fromcompanycd) {
        regFromcompanycd(CK_NES, fromcompanycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_GreaterThan(String fromcompanycd) {
        regFromcompanycd(CK_GT, fRES(fromcompanycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_LessThan(String fromcompanycd) {
        regFromcompanycd(CK_LT, fRES(fromcompanycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_GreaterEqual(String fromcompanycd) {
        regFromcompanycd(CK_GE, fRES(fromcompanycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_LessEqual(String fromcompanycd) {
        regFromcompanycd(CK_LE, fRES(fromcompanycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycdList The collection of fromcompanycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_InScope(Collection<String> fromcompanycdList) {
        doSetFromcompanycd_InScope(fromcompanycdList);
    }

    protected void doSetFromcompanycd_InScope(Collection<String> fromcompanycdList) {
        regINS(CK_INS, cTL(fromcompanycdList), xgetCValueFromcompanycd(), "FROMCOMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycdList The collection of fromcompanycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_NotInScope(Collection<String> fromcompanycdList) {
        doSetFromcompanycd_NotInScope(fromcompanycdList);
    }

    protected void doSetFromcompanycd_NotInScope(Collection<String> fromcompanycdList) {
        regINS(CK_NINS, cTL(fromcompanycdList), xgetCValueFromcompanycd(), "FROMCOMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setFromcompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromcompanycd The value of fromcompanycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromcompanycd_LikeSearch(String fromcompanycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromcompanycd), xgetCValueFromcompanycd(), "FROMCOMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromcompanycd_NotLikeSearch(String fromcompanycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromcompanycd), xgetCValueFromcompanycd(), "FROMCOMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @param fromcompanycd The value of fromcompanycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcompanycd_PrefixSearch(String fromcompanycd) {
        setFromcompanycd_LikeSearch(fromcompanycd, xcLSOPPre());
    }

    protected void regFromcompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromcompanycd(), "FROMCOMPANYCD"); }
    protected abstract ConditionValue xgetCValueFromcompanycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_Equal(String fromownercd) {
        doSetFromownercd_Equal(fRES(fromownercd));
    }

    protected void doSetFromownercd_Equal(String fromownercd) {
        regFromownercd(CK_EQ, fromownercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_NotEqual(String fromownercd) {
        doSetFromownercd_NotEqual(fRES(fromownercd));
    }

    protected void doSetFromownercd_NotEqual(String fromownercd) {
        regFromownercd(CK_NES, fromownercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_GreaterThan(String fromownercd) {
        regFromownercd(CK_GT, fRES(fromownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_LessThan(String fromownercd) {
        regFromownercd(CK_LT, fRES(fromownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_GreaterEqual(String fromownercd) {
        regFromownercd(CK_GE, fRES(fromownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_LessEqual(String fromownercd) {
        regFromownercd(CK_LE, fRES(fromownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercdList The collection of fromownercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_InScope(Collection<String> fromownercdList) {
        doSetFromownercd_InScope(fromownercdList);
    }

    protected void doSetFromownercd_InScope(Collection<String> fromownercdList) {
        regINS(CK_INS, cTL(fromownercdList), xgetCValueFromownercd(), "FROMOWNERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercdList The collection of fromownercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_NotInScope(Collection<String> fromownercdList) {
        doSetFromownercd_NotInScope(fromownercdList);
    }

    protected void doSetFromownercd_NotInScope(Collection<String> fromownercdList) {
        regINS(CK_NINS, cTL(fromownercdList), xgetCValueFromownercd(), "FROMOWNERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setFromownercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromownercd The value of fromownercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromownercd_LikeSearch(String fromownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromownercd), xgetCValueFromownercd(), "FROMOWNERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromownercd_NotLikeSearch(String fromownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromownercd), xgetCValueFromownercd(), "FROMOWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @param fromownercd The value of fromownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromownercd_PrefixSearch(String fromownercd) {
        setFromownercd_LikeSearch(fromownercd, xcLSOPPre());
    }

    protected void regFromownercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromownercd(), "FROMOWNERCD"); }
    protected abstract ConditionValue xgetCValueFromownercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_Equal(String tocompanycd) {
        doSetTocompanycd_Equal(fRES(tocompanycd));
    }

    protected void doSetTocompanycd_Equal(String tocompanycd) {
        regTocompanycd(CK_EQ, tocompanycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_NotEqual(String tocompanycd) {
        doSetTocompanycd_NotEqual(fRES(tocompanycd));
    }

    protected void doSetTocompanycd_NotEqual(String tocompanycd) {
        regTocompanycd(CK_NES, tocompanycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_GreaterThan(String tocompanycd) {
        regTocompanycd(CK_GT, fRES(tocompanycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_LessThan(String tocompanycd) {
        regTocompanycd(CK_LT, fRES(tocompanycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_GreaterEqual(String tocompanycd) {
        regTocompanycd(CK_GE, fRES(tocompanycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_LessEqual(String tocompanycd) {
        regTocompanycd(CK_LE, fRES(tocompanycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycdList The collection of tocompanycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_InScope(Collection<String> tocompanycdList) {
        doSetTocompanycd_InScope(tocompanycdList);
    }

    protected void doSetTocompanycd_InScope(Collection<String> tocompanycdList) {
        regINS(CK_INS, cTL(tocompanycdList), xgetCValueTocompanycd(), "TOCOMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycdList The collection of tocompanycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_NotInScope(Collection<String> tocompanycdList) {
        doSetTocompanycd_NotInScope(tocompanycdList);
    }

    protected void doSetTocompanycd_NotInScope(Collection<String> tocompanycdList) {
        regINS(CK_NINS, cTL(tocompanycdList), xgetCValueTocompanycd(), "TOCOMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setTocompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tocompanycd The value of tocompanycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTocompanycd_LikeSearch(String tocompanycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tocompanycd), xgetCValueTocompanycd(), "TOCOMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTocompanycd_NotLikeSearch(String tocompanycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tocompanycd), xgetCValueTocompanycd(), "TOCOMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @param tocompanycd The value of tocompanycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTocompanycd_PrefixSearch(String tocompanycd) {
        setTocompanycd_LikeSearch(tocompanycd, xcLSOPPre());
    }

    protected void regTocompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTocompanycd(), "TOCOMPANYCD"); }
    protected abstract ConditionValue xgetCValueTocompanycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_Equal(String toownercd) {
        doSetToownercd_Equal(fRES(toownercd));
    }

    protected void doSetToownercd_Equal(String toownercd) {
        regToownercd(CK_EQ, toownercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_NotEqual(String toownercd) {
        doSetToownercd_NotEqual(fRES(toownercd));
    }

    protected void doSetToownercd_NotEqual(String toownercd) {
        regToownercd(CK_NES, toownercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_GreaterThan(String toownercd) {
        regToownercd(CK_GT, fRES(toownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_LessThan(String toownercd) {
        regToownercd(CK_LT, fRES(toownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_GreaterEqual(String toownercd) {
        regToownercd(CK_GE, fRES(toownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_LessEqual(String toownercd) {
        regToownercd(CK_LE, fRES(toownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercdList The collection of toownercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_InScope(Collection<String> toownercdList) {
        doSetToownercd_InScope(toownercdList);
    }

    protected void doSetToownercd_InScope(Collection<String> toownercdList) {
        regINS(CK_INS, cTL(toownercdList), xgetCValueToownercd(), "TOOWNERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercdList The collection of toownercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_NotInScope(Collection<String> toownercdList) {
        doSetToownercd_NotInScope(toownercdList);
    }

    protected void doSetToownercd_NotInScope(Collection<String> toownercdList) {
        regINS(CK_NINS, cTL(toownercdList), xgetCValueToownercd(), "TOOWNERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setToownercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param toownercd The value of toownercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToownercd_LikeSearch(String toownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(toownercd), xgetCValueToownercd(), "TOOWNERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setToownercd_NotLikeSearch(String toownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(toownercd), xgetCValueToownercd(), "TOOWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @param toownercd The value of toownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToownercd_PrefixSearch(String toownercd) {
        setToownercd_LikeSearch(toownercd, xcLSOPPre());
    }

    protected void regToownercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToownercd(), "TOOWNERCD"); }
    protected abstract ConditionValue xgetCValueToownercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {NotNull, varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_Equal(String otherrefno1) {
        doSetOtherrefno1_Equal(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_Equal(String otherrefno1) {
        regOtherrefno1(CK_EQ, otherrefno1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotEqual(String otherrefno1) {
        doSetOtherrefno1_NotEqual(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_NotEqual(String otherrefno1) {
        regOtherrefno1(CK_NES, otherrefno1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterThan(String otherrefno1) {
        regOtherrefno1(CK_GT, fRES(otherrefno1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessThan(String otherrefno1) {
        regOtherrefno1(CK_LT, fRES(otherrefno1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterEqual(String otherrefno1) {
        regOtherrefno1(CK_GE, fRES(otherrefno1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessEqual(String otherrefno1) {
        regOtherrefno1(CK_LE, fRES(otherrefno1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1List The collection of otherrefno1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_InScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_InScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_InScope(Collection<String> otherrefno1List) {
        regINS(CK_INS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1List The collection of otherrefno1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_NotInScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        regINS(CK_NINS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)} <br>
     * <pre>e.g. setOtherrefno1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno1 The value of otherrefno1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno1_LikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno1_NotLikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_PrefixSearch(String otherrefno1) {
        setOtherrefno1_LikeSearch(otherrefno1, xcLSOPPre());
    }

    protected void regOtherrefno1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno1(), "OTHERREFNO1"); }
    protected abstract ConditionValue xgetCValueOtherrefno1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
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
     * OTHERREFNO2: {NotNull, varchar(60)}
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
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_GreaterThan(String otherrefno2) {
        regOtherrefno2(CK_GT, fRES(otherrefno2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_LessThan(String otherrefno2) {
        regOtherrefno2(CK_LT, fRES(otherrefno2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_GreaterEqual(String otherrefno2) {
        regOtherrefno2(CK_GE, fRES(otherrefno2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_LessEqual(String otherrefno2) {
        regOtherrefno2(CK_LE, fRES(otherrefno2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
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
     * OTHERREFNO2: {NotNull, varchar(60)}
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
     * OTHERREFNO2: {NotNull, varchar(60)} <br>
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
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno2_NotLikeSearch(String otherrefno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno2), xgetCValueOtherrefno2(), "OTHERREFNO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_PrefixSearch(String otherrefno2) {
        setOtherrefno2_LikeSearch(otherrefno2, xcLSOPPre());
    }

    protected void regOtherrefno2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno2(), "OTHERREFNO2"); }
    protected abstract ConditionValue xgetCValueOtherrefno2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_Equal(String otherrefno3) {
        doSetOtherrefno3_Equal(fRES(otherrefno3));
    }

    protected void doSetOtherrefno3_Equal(String otherrefno3) {
        regOtherrefno3(CK_EQ, otherrefno3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_NotEqual(String otherrefno3) {
        doSetOtherrefno3_NotEqual(fRES(otherrefno3));
    }

    protected void doSetOtherrefno3_NotEqual(String otherrefno3) {
        regOtherrefno3(CK_NES, otherrefno3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_GreaterThan(String otherrefno3) {
        regOtherrefno3(CK_GT, fRES(otherrefno3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_LessThan(String otherrefno3) {
        regOtherrefno3(CK_LT, fRES(otherrefno3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_GreaterEqual(String otherrefno3) {
        regOtherrefno3(CK_GE, fRES(otherrefno3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_LessEqual(String otherrefno3) {
        regOtherrefno3(CK_LE, fRES(otherrefno3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3List The collection of otherrefno3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_InScope(Collection<String> otherrefno3List) {
        doSetOtherrefno3_InScope(otherrefno3List);
    }

    protected void doSetOtherrefno3_InScope(Collection<String> otherrefno3List) {
        regINS(CK_INS, cTL(otherrefno3List), xgetCValueOtherrefno3(), "OTHERREFNO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3List The collection of otherrefno3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_NotInScope(Collection<String> otherrefno3List) {
        doSetOtherrefno3_NotInScope(otherrefno3List);
    }

    protected void doSetOtherrefno3_NotInScope(Collection<String> otherrefno3List) {
        regINS(CK_NINS, cTL(otherrefno3List), xgetCValueOtherrefno3(), "OTHERREFNO3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)} <br>
     * <pre>e.g. setOtherrefno3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno3 The value of otherrefno3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno3_LikeSearch(String otherrefno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno3), xgetCValueOtherrefno3(), "OTHERREFNO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno3_NotLikeSearch(String otherrefno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno3), xgetCValueOtherrefno3(), "OTHERREFNO3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_PrefixSearch(String otherrefno3) {
        setOtherrefno3_LikeSearch(otherrefno3, xcLSOPPre());
    }

    protected void regOtherrefno3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno3(), "OTHERREFNO3"); }
    protected abstract ConditionValue xgetCValueOtherrefno3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_Equal(String priority) {
        doSetPriority_Equal(fRES(priority));
    }

    protected void doSetPriority_Equal(String priority) {
        regPriority(CK_EQ, priority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_NotEqual(String priority) {
        doSetPriority_NotEqual(fRES(priority));
    }

    protected void doSetPriority_NotEqual(String priority) {
        regPriority(CK_NES, priority);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_GreaterThan(String priority) {
        regPriority(CK_GT, fRES(priority));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_LessThan(String priority) {
        regPriority(CK_LT, fRES(priority));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_GreaterEqual(String priority) {
        regPriority(CK_GE, fRES(priority));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_LessEqual(String priority) {
        regPriority(CK_LE, fRES(priority));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priorityList The collection of priority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_InScope(Collection<String> priorityList) {
        doSetPriority_InScope(priorityList);
    }

    protected void doSetPriority_InScope(Collection<String> priorityList) {
        regINS(CK_INS, cTL(priorityList), xgetCValuePriority(), "PRIORITY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priorityList The collection of priority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_NotInScope(Collection<String> priorityList) {
        doSetPriority_NotInScope(priorityList);
    }

    protected void doSetPriority_NotInScope(Collection<String> priorityList) {
        regINS(CK_NINS, cTL(priorityList), xgetCValuePriority(), "PRIORITY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPriority_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priority The value of priority as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriority_LikeSearch(String priority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priority), xgetCValuePriority(), "PRIORITY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriority_NotLikeSearch(String priority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priority), xgetCValuePriority(), "PRIORITY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @param priority The value of priority as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriority_PrefixSearch(String priority) {
        setPriority_LikeSearch(priority, xcLSOPPre());
    }

    protected void regPriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriority(), "PRIORITY"); }
    protected abstract ConditionValue xgetCValuePriority();

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
    public HpSLCFunction<ETriftrnodrCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETriftrnodrCB.class);
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
    public HpSLCFunction<ETriftrnodrCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETriftrnodrCB.class);
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
    public HpSLCFunction<ETriftrnodrCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETriftrnodrCB.class);
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
    public HpSLCFunction<ETriftrnodrCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETriftrnodrCB.class);
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
    public HpSLCFunction<ETriftrnodrCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETriftrnodrCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETriftrnodrCB&gt;() {
     *     public void query(ETriftrnodrCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETriftrnodrCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETriftrnodrCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETriftrnodrCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETriftrnodrCQ sq);

    protected ETriftrnodrCB xcreateScalarConditionCB() {
        ETriftrnodrCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETriftrnodrCB xcreateScalarConditionPartitionByCB() {
        ETriftrnodrCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETriftrnodrCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETriftrnodrCB cb = new ETriftrnodrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "IFDATAKEY";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETriftrnodrCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETriftrnodrCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETriftrnodrCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETriftrnodrCB cb = new ETriftrnodrCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IFDATAKEY";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETriftrnodrCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETriftrnodrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETriftrnodrCB cb = new ETriftrnodrCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETriftrnodrCQ sq);

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
    protected ETriftrnodrCB newMyCB() {
        return new ETriftrnodrCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETriftrnodrCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

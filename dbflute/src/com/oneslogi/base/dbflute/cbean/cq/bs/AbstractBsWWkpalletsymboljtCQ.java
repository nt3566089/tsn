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
 * The abstract condition-query of W_WKPALLETSYMBOLJT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkpalletsymboljtCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkpalletsymboljtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKPALLETSYMBOLJT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkey The value of wksojtkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_Equal(java.math.BigDecimal wksojtkey) {
        doSetWksojtkey_Equal(wksojtkey);
    }

    protected void doSetWksojtkey_Equal(java.math.BigDecimal wksojtkey) {
        regWksojtkey(CK_EQ, wksojtkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkey The value of wksojtkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_NotEqual(java.math.BigDecimal wksojtkey) {
        doSetWksojtkey_NotEqual(wksojtkey);
    }

    protected void doSetWksojtkey_NotEqual(java.math.BigDecimal wksojtkey) {
        regWksojtkey(CK_NES, wksojtkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkey The value of wksojtkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_GreaterThan(java.math.BigDecimal wksojtkey) {
        regWksojtkey(CK_GT, wksojtkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkey The value of wksojtkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_LessThan(java.math.BigDecimal wksojtkey) {
        regWksojtkey(CK_LT, wksojtkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkey The value of wksojtkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_GreaterEqual(java.math.BigDecimal wksojtkey) {
        regWksojtkey(CK_GE, wksojtkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkey The value of wksojtkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_LessEqual(java.math.BigDecimal wksojtkey) {
        regWksojtkey(CK_LE, wksojtkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of wksojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wksojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWksojtkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWksojtkey(), "WKSOJTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkeyList The collection of wksojtkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWksojtkey_InScope(Collection<java.math.BigDecimal> wksojtkeyList) {
        doSetWksojtkey_InScope(wksojtkeyList);
    }

    protected void doSetWksojtkey_InScope(Collection<java.math.BigDecimal> wksojtkeyList) {
        regINS(CK_INS, cTL(wksojtkeyList), xgetCValueWksojtkey(), "WKSOJTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @param wksojtkeyList The collection of wksojtkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWksojtkey_NotInScope(Collection<java.math.BigDecimal> wksojtkeyList) {
        doSetWksojtkey_NotInScope(wksojtkeyList);
    }

    protected void doSetWksojtkey_NotInScope(Collection<java.math.BigDecimal> wksojtkeyList) {
        regINS(CK_NINS, cTL(wksojtkeyList), xgetCValueWksojtkey(), "WKSOJTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setWksojtkey_IsNull() { regWksojtkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setWksojtkey_IsNotNull() { regWksojtkey(CK_ISNN, DOBJ); }

    protected void regWksojtkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWksojtkey(), "WKSOJTKEY"); }
    protected abstract ConditionValue xgetCValueWksojtkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_Equal(java.math.BigDecimal palletno) {
        doSetPalletno_Equal(palletno);
    }

    protected void doSetPalletno_Equal(java.math.BigDecimal palletno) {
        regPalletno(CK_EQ, palletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_NotEqual(java.math.BigDecimal palletno) {
        doSetPalletno_NotEqual(palletno);
    }

    protected void doSetPalletno_NotEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_NES, palletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterThan(java.math.BigDecimal palletno) {
        regPalletno(CK_GT, palletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessThan(java.math.BigDecimal palletno) {
        regPalletno(CK_LT, palletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_GE, palletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletno The value of palletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_LE, palletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletno(), "PALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletnoList The collection of palletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_InScope(Collection<java.math.BigDecimal> palletnoList) {
        doSetPalletno_InScope(palletnoList);
    }

    protected void doSetPalletno_InScope(Collection<java.math.BigDecimal> palletnoList) {
        regINS(CK_INS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @param palletnoList The collection of palletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotInScope(Collection<java.math.BigDecimal> palletnoList) {
        doSetPalletno_NotInScope(palletnoList);
    }

    protected void doSetPalletno_NotInScope(Collection<java.math.BigDecimal> palletnoList) {
        regINS(CK_NINS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    protected void regPalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletno(), "PALLETNO"); }
    protected abstract ConditionValue xgetCValuePalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_Equal(String ownersono) {
        doSetOwnersono_Equal(fRES(ownersono));
    }

    protected void doSetOwnersono_Equal(String ownersono) {
        regOwnersono(CK_EQ, ownersono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotEqual(String ownersono) {
        doSetOwnersono_NotEqual(fRES(ownersono));
    }

    protected void doSetOwnersono_NotEqual(String ownersono) {
        regOwnersono(CK_NES, ownersono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterThan(String ownersono) {
        regOwnersono(CK_GT, fRES(ownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessThan(String ownersono) {
        regOwnersono(CK_LT, fRES(ownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterEqual(String ownersono) {
        regOwnersono(CK_GE, fRES(ownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessEqual(String ownersono) {
        regOwnersono(CK_LE, fRES(ownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersonoList The collection of ownersono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_InScope(Collection<String> ownersonoList) {
        doSetOwnersono_InScope(ownersonoList);
    }

    protected void doSetOwnersono_InScope(Collection<String> ownersonoList) {
        regINS(CK_INS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersonoList The collection of ownersono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotInScope(Collection<String> ownersonoList) {
        doSetOwnersono_NotInScope(ownersonoList);
    }

    protected void doSetOwnersono_NotInScope(Collection<String> ownersonoList) {
        regINS(CK_NINS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)} <br>
     * <pre>e.g. setOwnersono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownersono The value of ownersono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnersono_LikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersono_NotLikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_PrefixSearch(String ownersono) {
        setOwnersono_LikeSearch(ownersono, xcLSOPPre());
    }

    protected void regOwnersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersono(), "OWNERSONO"); }
    protected abstract ConditionValue xgetCValueOwnersono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_Equal(String sopalletno) {
        doSetSopalletno_Equal(fRES(sopalletno));
    }

    protected void doSetSopalletno_Equal(String sopalletno) {
        regSopalletno(CK_EQ, sopalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_NotEqual(String sopalletno) {
        doSetSopalletno_NotEqual(fRES(sopalletno));
    }

    protected void doSetSopalletno_NotEqual(String sopalletno) {
        regSopalletno(CK_NES, sopalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_GreaterThan(String sopalletno) {
        regSopalletno(CK_GT, fRES(sopalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_LessThan(String sopalletno) {
        regSopalletno(CK_LT, fRES(sopalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_GreaterEqual(String sopalletno) {
        regSopalletno(CK_GE, fRES(sopalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_LessEqual(String sopalletno) {
        regSopalletno(CK_LE, fRES(sopalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletnoList The collection of sopalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_InScope(Collection<String> sopalletnoList) {
        doSetSopalletno_InScope(sopalletnoList);
    }

    protected void doSetSopalletno_InScope(Collection<String> sopalletnoList) {
        regINS(CK_INS, cTL(sopalletnoList), xgetCValueSopalletno(), "SOPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletnoList The collection of sopalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_NotInScope(Collection<String> sopalletnoList) {
        doSetSopalletno_NotInScope(sopalletnoList);
    }

    protected void doSetSopalletno_NotInScope(Collection<String> sopalletnoList) {
        regINS(CK_NINS, cTL(sopalletnoList), xgetCValueSopalletno(), "SOPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSopalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sopalletno The value of sopalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSopalletno_LikeSearch(String sopalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sopalletno), xgetCValueSopalletno(), "SOPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSopalletno_NotLikeSearch(String sopalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sopalletno), xgetCValueSopalletno(), "SOPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_PrefixSearch(String sopalletno) {
        setSopalletno_LikeSearch(sopalletno, xcLSOPPre());
    }

    protected void regSopalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSopalletno(), "SOPALLETNO"); }
    protected abstract ConditionValue xgetCValueSopalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
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
     * RCVKEY: {NotNull, decimal(16, 6)}
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
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
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
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
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
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
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
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterThan(java.math.BigDecimal symbolno) {
        regSymbolno(CK_GT, symbolno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessThan(java.math.BigDecimal symbolno) {
        regSymbolno(CK_LT, symbolno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_GE, symbolno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param symbolno The value of symbolno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessEqual(java.math.BigDecimal symbolno) {
        regSymbolno(CK_LE, symbolno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolno(), "SYMBOLNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
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
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
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
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setSymbolno_IsNull() { regSymbolno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setSymbolno_IsNotNull() { regSymbolno(CK_ISNN, DOBJ); }

    protected void regSymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolno(), "SYMBOLNO"); }
    protected abstract ConditionValue xgetCValueSymbolno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_Equal(java.math.BigDecimal sortedqty1) {
        doSetSortedqty1_Equal(sortedqty1);
    }

    protected void doSetSortedqty1_Equal(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_EQ, sortedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_NotEqual(java.math.BigDecimal sortedqty1) {
        doSetSortedqty1_NotEqual(sortedqty1);
    }

    protected void doSetSortedqty1_NotEqual(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_NES, sortedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterThan(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_GT, sortedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessThan(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_LT, sortedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterEqual(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_GE, sortedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessEqual(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_LE, sortedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedqty1(), "SORTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1List The collection of sortedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_InScope(Collection<java.math.BigDecimal> sortedqty1List) {
        doSetSortedqty1_InScope(sortedqty1List);
    }

    protected void doSetSortedqty1_InScope(Collection<java.math.BigDecimal> sortedqty1List) {
        regINS(CK_INS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1List The collection of sortedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_NotInScope(Collection<java.math.BigDecimal> sortedqty1List) {
        doSetSortedqty1_NotInScope(sortedqty1List);
    }

    protected void doSetSortedqty1_NotInScope(Collection<java.math.BigDecimal> sortedqty1List) {
        regINS(CK_NINS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    protected void regSortedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedqty1(), "SORTEDQTY1"); }
    protected abstract ConditionValue xgetCValueSortedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkey The value of lotkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_Equal(Long lotkey) {
        doSetLotkey_Equal(lotkey);
    }

    protected void doSetLotkey_Equal(Long lotkey) {
        regLotkey(CK_EQ, lotkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkey The value of lotkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_NotEqual(Long lotkey) {
        doSetLotkey_NotEqual(lotkey);
    }

    protected void doSetLotkey_NotEqual(Long lotkey) {
        regLotkey(CK_NES, lotkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkey The value of lotkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterThan(Long lotkey) {
        regLotkey(CK_GT, lotkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkey The value of lotkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessThan(Long lotkey) {
        regLotkey(CK_LT, lotkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkey The value of lotkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterEqual(Long lotkey) {
        regLotkey(CK_GE, lotkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkey The value of lotkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessEqual(Long lotkey) {
        regLotkey(CK_LE, lotkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotkey(), "LOTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkeyList The collection of lotkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_InScope(Collection<Long> lotkeyList) {
        doSetLotkey_InScope(lotkeyList);
    }

    protected void doSetLotkey_InScope(Collection<Long> lotkeyList) {
        regINS(CK_INS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @param lotkeyList The collection of lotkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_NotInScope(Collection<Long> lotkeyList) {
        doSetLotkey_NotInScope(lotkeyList);
    }

    protected void doSetLotkey_NotInScope(Collection<Long> lotkeyList) {
        regINS(CK_NINS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    protected void regLotkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotkey(), "LOTKEY"); }
    protected abstract ConditionValue xgetCValueLotkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_Equal(String packedflg) {
        doSetPackedflg_Equal(fRES(packedflg));
    }

    protected void doSetPackedflg_Equal(String packedflg) {
        regPackedflg(CK_EQ, packedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_NotEqual(String packedflg) {
        doSetPackedflg_NotEqual(fRES(packedflg));
    }

    protected void doSetPackedflg_NotEqual(String packedflg) {
        regPackedflg(CK_NES, packedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_GreaterThan(String packedflg) {
        regPackedflg(CK_GT, fRES(packedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_LessThan(String packedflg) {
        regPackedflg(CK_LT, fRES(packedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_GreaterEqual(String packedflg) {
        regPackedflg(CK_GE, fRES(packedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_LessEqual(String packedflg) {
        regPackedflg(CK_LE, fRES(packedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflgList The collection of packedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_InScope(Collection<String> packedflgList) {
        doSetPackedflg_InScope(packedflgList);
    }

    protected void doSetPackedflg_InScope(Collection<String> packedflgList) {
        regINS(CK_INS, cTL(packedflgList), xgetCValuePackedflg(), "PACKEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflgList The collection of packedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_NotInScope(Collection<String> packedflgList) {
        doSetPackedflg_NotInScope(packedflgList);
    }

    protected void doSetPackedflg_NotInScope(Collection<String> packedflgList) {
        regINS(CK_NINS, cTL(packedflgList), xgetCValuePackedflg(), "PACKEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPackedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param packedflg The value of packedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackedflg_LikeSearch(String packedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packedflg), xgetCValuePackedflg(), "PACKEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackedflg_NotLikeSearch(String packedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packedflg), xgetCValuePackedflg(), "PACKEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_PrefixSearch(String packedflg) {
        setPackedflg_LikeSearch(packedflg, xcLSOPPre());
    }

    protected void regPackedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackedflg(), "PACKEDFLG"); }
    protected abstract ConditionValue xgetCValuePackedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflg The value of enterflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEnterflg_Equal(java.math.BigDecimal enterflg) {
        doSetEnterflg_Equal(enterflg);
    }

    protected void doSetEnterflg_Equal(java.math.BigDecimal enterflg) {
        regEnterflg(CK_EQ, enterflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflg The value of enterflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEnterflg_NotEqual(java.math.BigDecimal enterflg) {
        doSetEnterflg_NotEqual(enterflg);
    }

    protected void doSetEnterflg_NotEqual(java.math.BigDecimal enterflg) {
        regEnterflg(CK_NES, enterflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflg The value of enterflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEnterflg_GreaterThan(java.math.BigDecimal enterflg) {
        regEnterflg(CK_GT, enterflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflg The value of enterflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEnterflg_LessThan(java.math.BigDecimal enterflg) {
        regEnterflg(CK_LT, enterflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflg The value of enterflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEnterflg_GreaterEqual(java.math.BigDecimal enterflg) {
        regEnterflg(CK_GE, enterflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflg The value of enterflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEnterflg_LessEqual(java.math.BigDecimal enterflg) {
        regEnterflg(CK_LE, enterflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of enterflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of enterflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEnterflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEnterflg(), "ENTERFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflgList The collection of enterflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterflg_InScope(Collection<java.math.BigDecimal> enterflgList) {
        doSetEnterflg_InScope(enterflgList);
    }

    protected void doSetEnterflg_InScope(Collection<java.math.BigDecimal> enterflgList) {
        regINS(CK_INS, cTL(enterflgList), xgetCValueEnterflg(), "ENTERFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @param enterflgList The collection of enterflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterflg_NotInScope(Collection<java.math.BigDecimal> enterflgList) {
        doSetEnterflg_NotInScope(enterflgList);
    }

    protected void doSetEnterflg_NotInScope(Collection<java.math.BigDecimal> enterflgList) {
        regINS(CK_NINS, cTL(enterflgList), xgetCValueEnterflg(), "ENTERFLG");
    }

    protected void regEnterflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEnterflg(), "ENTERFLG"); }
    protected abstract ConditionValue xgetCValueEnterflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_Equal(java.math.BigDecimal actflg) {
        doSetActflg_Equal(actflg);
    }

    protected void doSetActflg_Equal(java.math.BigDecimal actflg) {
        regActflg(CK_EQ, actflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_NotEqual(java.math.BigDecimal actflg) {
        doSetActflg_NotEqual(actflg);
    }

    protected void doSetActflg_NotEqual(java.math.BigDecimal actflg) {
        regActflg(CK_NES, actflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(java.math.BigDecimal actflg) {
        regActflg(CK_GT, actflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessThan(java.math.BigDecimal actflg) {
        regActflg(CK_LT, actflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(java.math.BigDecimal actflg) {
        regActflg(CK_GE, actflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(java.math.BigDecimal actflg) {
        regActflg(CK_LE, actflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setActflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueActflg(), "ACTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflgList The collection of actflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_InScope(actflgList);
    }

    protected void doSetActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_INS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflgList The collection of actflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_NotInScope(actflgList);
    }

    protected void doSetActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_NINS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    protected void regActflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActflg(), "ACTFLG"); }
    protected abstract ConditionValue xgetCValueActflg();

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
    public HpSLCFunction<WWkpalletsymboljtCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkpalletsymboljtCB.class);
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
    public HpSLCFunction<WWkpalletsymboljtCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkpalletsymboljtCB.class);
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
    public HpSLCFunction<WWkpalletsymboljtCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkpalletsymboljtCB.class);
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
    public HpSLCFunction<WWkpalletsymboljtCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkpalletsymboljtCB.class);
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
    public HpSLCFunction<WWkpalletsymboljtCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkpalletsymboljtCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkpalletsymboljtCB&gt;() {
     *     public void query(WWkpalletsymboljtCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkpalletsymboljtCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkpalletsymboljtCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkpalletsymboljtCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkpalletsymboljtCQ sq);

    protected WWkpalletsymboljtCB xcreateScalarConditionCB() {
        WWkpalletsymboljtCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkpalletsymboljtCB xcreateScalarConditionPartitionByCB() {
        WWkpalletsymboljtCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WWkpalletsymboljtCB newMyCB() {
        return new WWkpalletsymboljtCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkpalletsymboljtCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

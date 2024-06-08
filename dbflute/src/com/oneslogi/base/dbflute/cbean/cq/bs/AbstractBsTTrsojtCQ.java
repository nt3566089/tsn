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
 * The abstract condition-query of T_TRSOJT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsojtCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsojtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSOJT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtid The value of sojtid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_Equal(Long sojtid) {
        doSetSojtid_Equal(sojtid);
    }

    protected void doSetSojtid_Equal(Long sojtid) {
        regSojtid(CK_EQ, sojtid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtid The value of sojtid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_NotEqual(Long sojtid) {
        doSetSojtid_NotEqual(sojtid);
    }

    protected void doSetSojtid_NotEqual(Long sojtid) {
        regSojtid(CK_NES, sojtid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtid The value of sojtid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_GreaterThan(Long sojtid) {
        regSojtid(CK_GT, sojtid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtid The value of sojtid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_LessThan(Long sojtid) {
        regSojtid(CK_LT, sojtid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtid The value of sojtid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_GreaterEqual(Long sojtid) {
        regSojtid(CK_GE, sojtid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtid The value of sojtid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_LessEqual(Long sojtid) {
        regSojtid(CK_LE, sojtid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sojtid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtid(), "SOJTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtidList The collection of sojtid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtid_InScope(Collection<Long> sojtidList) {
        doSetSojtid_InScope(sojtidList);
    }

    protected void doSetSojtid_InScope(Collection<Long> sojtidList) {
        regINS(CK_INS, cTL(sojtidList), xgetCValueSojtid(), "SOJTID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtidList The collection of sojtid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtid_NotInScope(Collection<Long> sojtidList) {
        doSetSojtid_NotInScope(sojtidList);
    }

    protected void doSetSojtid_NotInScope(Collection<Long> sojtidList) {
        regINS(CK_NINS, cTL(sojtidList), xgetCValueSojtid(), "SOJTID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSojtid_IsNull() { regSojtid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSojtid_IsNotNull() { regSojtid(CK_ISNN, DOBJ); }

    protected void regSojtid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtid(), "SOJTID"); }
    protected abstract ConditionValue xgetCValueSojtid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_Equal(java.math.BigDecimal sojtkey) {
        doSetSojtkey_Equal(sojtkey);
    }

    protected void doSetSojtkey_Equal(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_EQ, sojtkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_NotEqual(java.math.BigDecimal sojtkey) {
        doSetSojtkey_NotEqual(sojtkey);
    }

    protected void doSetSojtkey_NotEqual(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_NES, sojtkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_GreaterThan(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_GT, sojtkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_LessThan(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_LT, sojtkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_GreaterEqual(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_GE, sojtkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_LessEqual(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_LE, sojtkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of sojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtkey(), "SOJTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkeyList The collection of sojtkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtkey_InScope(Collection<java.math.BigDecimal> sojtkeyList) {
        doSetSojtkey_InScope(sojtkeyList);
    }

    protected void doSetSojtkey_InScope(Collection<java.math.BigDecimal> sojtkeyList) {
        regINS(CK_INS, cTL(sojtkeyList), xgetCValueSojtkey(), "SOJTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkeyList The collection of sojtkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtkey_NotInScope(Collection<java.math.BigDecimal> sojtkeyList) {
        doSetSojtkey_NotInScope(sojtkeyList);
    }

    protected void doSetSojtkey_NotInScope(Collection<java.math.BigDecimal> sojtkeyList) {
        regINS(CK_NINS, cTL(sojtkeyList), xgetCValueSojtkey(), "SOJTKEY");
    }

    protected void regSojtkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtkey(), "SOJTKEY"); }
    protected abstract ConditionValue xgetCValueSojtkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
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
     * OWNERSONO: {varchar(60)}
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
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterThan(String ownersono) {
        regOwnersono(CK_GT, fRES(ownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessThan(String ownersono) {
        regOwnersono(CK_LT, fRES(ownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterEqual(String ownersono) {
        regOwnersono(CK_GE, fRES(ownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessEqual(String ownersono) {
        regOwnersono(CK_LE, fRES(ownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
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
     * OWNERSONO: {varchar(60)}
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
     * OWNERSONO: {varchar(60)} <br>
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
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersono_NotLikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_PrefixSearch(String ownersono) {
        setOwnersono_LikeSearch(ownersono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNull() { regOwnersono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNullOrEmpty() { regOwnersono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNotNull() { regOwnersono(CK_ISNN, DOBJ); }

    protected void regOwnersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersono(), "OWNERSONO"); }
    protected abstract ConditionValue xgetCValueOwnersono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     */
    public void setCustomerCd_IsNull() { regCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     */
    public void setCustomerCd_IsNullOrEmpty() { regCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     */
    public void setCustomerCd_IsNotNull() { regCustomerCd(CK_ISNN, DOBJ); }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_Equal(String orderdate) {
        doSetOrderdate_Equal(fRES(orderdate));
    }

    protected void doSetOrderdate_Equal(String orderdate) {
        regOrderdate(CK_EQ, orderdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_NotEqual(String orderdate) {
        doSetOrderdate_NotEqual(fRES(orderdate));
    }

    protected void doSetOrderdate_NotEqual(String orderdate) {
        regOrderdate(CK_NES, orderdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_GreaterThan(String orderdate) {
        regOrderdate(CK_GT, fRES(orderdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_LessThan(String orderdate) {
        regOrderdate(CK_LT, fRES(orderdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_GreaterEqual(String orderdate) {
        regOrderdate(CK_GE, fRES(orderdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_LessEqual(String orderdate) {
        regOrderdate(CK_LE, fRES(orderdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdateList The collection of orderdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_InScope(Collection<String> orderdateList) {
        doSetOrderdate_InScope(orderdateList);
    }

    protected void doSetOrderdate_InScope(Collection<String> orderdateList) {
        regINS(CK_INS, cTL(orderdateList), xgetCValueOrderdate(), "ORDERDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdateList The collection of orderdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_NotInScope(Collection<String> orderdateList) {
        doSetOrderdate_NotInScope(orderdateList);
    }

    protected void doSetOrderdate_NotInScope(Collection<String> orderdateList) {
        regINS(CK_NINS, cTL(orderdateList), xgetCValueOrderdate(), "ORDERDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)} <br>
     * <pre>e.g. setOrderdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderdate The value of orderdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderdate_LikeSearch(String orderdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderdate), xgetCValueOrderdate(), "ORDERDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderdate_NotLikeSearch(String orderdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderdate), xgetCValueOrderdate(), "ORDERDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_PrefixSearch(String orderdate) {
        setOrderdate_LikeSearch(orderdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     */
    public void setOrderdate_IsNull() { regOrderdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     */
    public void setOrderdate_IsNullOrEmpty() { regOrderdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     */
    public void setOrderdate_IsNotNull() { regOrderdate(CK_ISNN, DOBJ); }

    protected void regOrderdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderdate(), "ORDERDATE"); }
    protected abstract ConditionValue xgetCValueOrderdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_Equal(Long planseq) {
        doSetPlanseq_Equal(planseq);
    }

    protected void doSetPlanseq_Equal(Long planseq) {
        regPlanseq(CK_EQ, planseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_NotEqual(Long planseq) {
        doSetPlanseq_NotEqual(planseq);
    }

    protected void doSetPlanseq_NotEqual(Long planseq) {
        regPlanseq(CK_NES, planseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_GreaterThan(Long planseq) {
        regPlanseq(CK_GT, planseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_LessThan(Long planseq) {
        regPlanseq(CK_LT, planseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_GreaterEqual(Long planseq) {
        regPlanseq(CK_GE, planseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_LessEqual(Long planseq) {
        regPlanseq(CK_LE, planseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param minNumber The min number of planseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanseq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanseq(), "PLANSEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseqList The collection of planseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanseq_InScope(Collection<Long> planseqList) {
        doSetPlanseq_InScope(planseqList);
    }

    protected void doSetPlanseq_InScope(Collection<Long> planseqList) {
        regINS(CK_INS, cTL(planseqList), xgetCValuePlanseq(), "PLANSEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseqList The collection of planseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanseq_NotInScope(Collection<Long> planseqList) {
        doSetPlanseq_NotInScope(planseqList);
    }

    protected void doSetPlanseq_NotInScope(Collection<Long> planseqList) {
        regINS(CK_NINS, cTL(planseqList), xgetCValuePlanseq(), "PLANSEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     */
    public void setPlanseq_IsNull() { regPlanseq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     */
    public void setPlanseq_IsNotNull() { regPlanseq(CK_ISNN, DOBJ); }

    protected void regPlanseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanseq(), "PLANSEQ"); }
    protected abstract ConditionValue xgetCValuePlanseq();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @param planrcvdatetime The value of planrcvdatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanrcvdatetime_Equal(java.sql.Timestamp planrcvdatetime) {
        regPlanrcvdatetime(CK_EQ,  planrcvdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @param planrcvdatetime The value of planrcvdatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanrcvdatetime_GreaterThan(java.sql.Timestamp planrcvdatetime) {
        regPlanrcvdatetime(CK_GT,  planrcvdatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @param planrcvdatetime The value of planrcvdatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanrcvdatetime_LessThan(java.sql.Timestamp planrcvdatetime) {
        regPlanrcvdatetime(CK_LT,  planrcvdatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @param planrcvdatetime The value of planrcvdatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanrcvdatetime_GreaterEqual(java.sql.Timestamp planrcvdatetime) {
        regPlanrcvdatetime(CK_GE,  planrcvdatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @param planrcvdatetime The value of planrcvdatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanrcvdatetime_LessEqual(java.sql.Timestamp planrcvdatetime) {
        regPlanrcvdatetime(CK_LE, planrcvdatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * <pre>e.g. setPlanrcvdatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of planrcvdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of planrcvdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPlanrcvdatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePlanrcvdatetime(), "PLANRCVDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of planrcvdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of planrcvdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPlanrcvdatetime_DateFromTo(Date fromDate, Date toDate) {
        setPlanrcvdatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     */
    public void setPlanrcvdatetime_IsNull() { regPlanrcvdatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     */
    public void setPlanrcvdatetime_IsNotNull() { regPlanrcvdatetime(CK_ISNN, DOBJ); }

    protected void regPlanrcvdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanrcvdatetime(), "PLANRCVDATETIME"); }
    protected abstract ConditionValue xgetCValuePlanrcvdatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseq The value of beforeplanseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeforeplanseq_Equal(Long beforeplanseq) {
        doSetBeforeplanseq_Equal(beforeplanseq);
    }

    protected void doSetBeforeplanseq_Equal(Long beforeplanseq) {
        regBeforeplanseq(CK_EQ, beforeplanseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseq The value of beforeplanseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeforeplanseq_NotEqual(Long beforeplanseq) {
        doSetBeforeplanseq_NotEqual(beforeplanseq);
    }

    protected void doSetBeforeplanseq_NotEqual(Long beforeplanseq) {
        regBeforeplanseq(CK_NES, beforeplanseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseq The value of beforeplanseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeforeplanseq_GreaterThan(Long beforeplanseq) {
        regBeforeplanseq(CK_GT, beforeplanseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseq The value of beforeplanseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeforeplanseq_LessThan(Long beforeplanseq) {
        regBeforeplanseq(CK_LT, beforeplanseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseq The value of beforeplanseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeforeplanseq_GreaterEqual(Long beforeplanseq) {
        regBeforeplanseq(CK_GE, beforeplanseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseq The value of beforeplanseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeforeplanseq_LessEqual(Long beforeplanseq) {
        regBeforeplanseq(CK_LE, beforeplanseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param minNumber The min number of beforeplanseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of beforeplanseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBeforeplanseq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBeforeplanseq(), "BEFOREPLANSEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseqList The collection of beforeplanseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeplanseq_InScope(Collection<Long> beforeplanseqList) {
        doSetBeforeplanseq_InScope(beforeplanseqList);
    }

    protected void doSetBeforeplanseq_InScope(Collection<Long> beforeplanseqList) {
        regINS(CK_INS, cTL(beforeplanseqList), xgetCValueBeforeplanseq(), "BEFOREPLANSEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @param beforeplanseqList The collection of beforeplanseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeplanseq_NotInScope(Collection<Long> beforeplanseqList) {
        doSetBeforeplanseq_NotInScope(beforeplanseqList);
    }

    protected void doSetBeforeplanseq_NotInScope(Collection<Long> beforeplanseqList) {
        regINS(CK_NINS, cTL(beforeplanseqList), xgetCValueBeforeplanseq(), "BEFOREPLANSEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     */
    public void setBeforeplanseq_IsNull() { regBeforeplanseq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     */
    public void setBeforeplanseq_IsNotNull() { regBeforeplanseq(CK_ISNN, DOBJ); }

    protected void regBeforeplanseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeforeplanseq(), "BEFOREPLANSEQ"); }
    protected abstract ConditionValue xgetCValueBeforeplanseq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_Equal(String planrcvflg) {
        doSetPlanrcvflg_Equal(fRES(planrcvflg));
    }

    protected void doSetPlanrcvflg_Equal(String planrcvflg) {
        regPlanrcvflg(CK_EQ, planrcvflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_NotEqual(String planrcvflg) {
        doSetPlanrcvflg_NotEqual(fRES(planrcvflg));
    }

    protected void doSetPlanrcvflg_NotEqual(String planrcvflg) {
        regPlanrcvflg(CK_NES, planrcvflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_GreaterThan(String planrcvflg) {
        regPlanrcvflg(CK_GT, fRES(planrcvflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_LessThan(String planrcvflg) {
        regPlanrcvflg(CK_LT, fRES(planrcvflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_GreaterEqual(String planrcvflg) {
        regPlanrcvflg(CK_GE, fRES(planrcvflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_LessEqual(String planrcvflg) {
        regPlanrcvflg(CK_LE, fRES(planrcvflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflgList The collection of planrcvflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_InScope(Collection<String> planrcvflgList) {
        doSetPlanrcvflg_InScope(planrcvflgList);
    }

    protected void doSetPlanrcvflg_InScope(Collection<String> planrcvflgList) {
        regINS(CK_INS, cTL(planrcvflgList), xgetCValuePlanrcvflg(), "PLANRCVFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflgList The collection of planrcvflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_NotInScope(Collection<String> planrcvflgList) {
        doSetPlanrcvflg_NotInScope(planrcvflgList);
    }

    protected void doSetPlanrcvflg_NotInScope(Collection<String> planrcvflgList) {
        regINS(CK_NINS, cTL(planrcvflgList), xgetCValuePlanrcvflg(), "PLANRCVFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)} <br>
     * <pre>e.g. setPlanrcvflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planrcvflg The value of planrcvflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanrcvflg_LikeSearch(String planrcvflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planrcvflg), xgetCValuePlanrcvflg(), "PLANRCVFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanrcvflg_NotLikeSearch(String planrcvflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planrcvflg), xgetCValuePlanrcvflg(), "PLANRCVFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_PrefixSearch(String planrcvflg) {
        setPlanrcvflg_LikeSearch(planrcvflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     */
    public void setPlanrcvflg_IsNull() { regPlanrcvflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     */
    public void setPlanrcvflg_IsNotNull() { regPlanrcvflg(CK_ISNN, DOBJ); }

    protected void regPlanrcvflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanrcvflg(), "PLANRCVFLG"); }
    protected abstract ConditionValue xgetCValuePlanrcvflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_Equal(String htopeflg) {
        doSetHtopeflg_Equal(fRES(htopeflg));
    }

    protected void doSetHtopeflg_Equal(String htopeflg) {
        regHtopeflg(CK_EQ, htopeflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_NotEqual(String htopeflg) {
        doSetHtopeflg_NotEqual(fRES(htopeflg));
    }

    protected void doSetHtopeflg_NotEqual(String htopeflg) {
        regHtopeflg(CK_NES, htopeflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_GreaterThan(String htopeflg) {
        regHtopeflg(CK_GT, fRES(htopeflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_LessThan(String htopeflg) {
        regHtopeflg(CK_LT, fRES(htopeflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_GreaterEqual(String htopeflg) {
        regHtopeflg(CK_GE, fRES(htopeflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_LessEqual(String htopeflg) {
        regHtopeflg(CK_LE, fRES(htopeflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflgList The collection of htopeflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_InScope(Collection<String> htopeflgList) {
        doSetHtopeflg_InScope(htopeflgList);
    }

    protected void doSetHtopeflg_InScope(Collection<String> htopeflgList) {
        regINS(CK_INS, cTL(htopeflgList), xgetCValueHtopeflg(), "HTOPEFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflgList The collection of htopeflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_NotInScope(Collection<String> htopeflgList) {
        doSetHtopeflg_NotInScope(htopeflgList);
    }

    protected void doSetHtopeflg_NotInScope(Collection<String> htopeflgList) {
        regINS(CK_NINS, cTL(htopeflgList), xgetCValueHtopeflg(), "HTOPEFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTOPEFLG: {char(1)} <br>
     * <pre>e.g. setHtopeflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htopeflg The value of htopeflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtopeflg_LikeSearch(String htopeflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htopeflg), xgetCValueHtopeflg(), "HTOPEFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtopeflg_NotLikeSearch(String htopeflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htopeflg), xgetCValueHtopeflg(), "HTOPEFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTOPEFLG: {char(1)}
     * @param htopeflg The value of htopeflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtopeflg_PrefixSearch(String htopeflg) {
        setHtopeflg_LikeSearch(htopeflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     */
    public void setHtopeflg_IsNull() { regHtopeflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HTOPEFLG: {char(1)}
     */
    public void setHtopeflg_IsNotNull() { regHtopeflg(CK_ISNN, DOBJ); }

    protected void regHtopeflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtopeflg(), "HTOPEFLG"); }
    protected abstract ConditionValue xgetCValueHtopeflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @param trsoadddate The value of trsoadddate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoadddate_Equal(java.sql.Timestamp trsoadddate) {
        regTrsoadddate(CK_EQ,  trsoadddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @param trsoadddate The value of trsoadddate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoadddate_GreaterThan(java.sql.Timestamp trsoadddate) {
        regTrsoadddate(CK_GT,  trsoadddate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @param trsoadddate The value of trsoadddate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoadddate_LessThan(java.sql.Timestamp trsoadddate) {
        regTrsoadddate(CK_LT,  trsoadddate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @param trsoadddate The value of trsoadddate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoadddate_GreaterEqual(java.sql.Timestamp trsoadddate) {
        regTrsoadddate(CK_GE,  trsoadddate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @param trsoadddate The value of trsoadddate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoadddate_LessEqual(java.sql.Timestamp trsoadddate) {
        regTrsoadddate(CK_LE, trsoadddate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * <pre>e.g. setTrsoadddate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of trsoadddate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of trsoadddate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTrsoadddate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTrsoadddate(), "TRSOADDDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of trsoadddate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of trsoadddate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTrsoadddate_DateFromTo(Date fromDate, Date toDate) {
        setTrsoadddate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     */
    public void setTrsoadddate_IsNull() { regTrsoadddate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     */
    public void setTrsoadddate_IsNotNull() { regTrsoadddate(CK_ISNN, DOBJ); }

    protected void regTrsoadddate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsoadddate(), "TRSOADDDATE"); }
    protected abstract ConditionValue xgetCValueTrsoadddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_Equal(String trsoaddflg) {
        doSetTrsoaddflg_Equal(fRES(trsoaddflg));
    }

    protected void doSetTrsoaddflg_Equal(String trsoaddflg) {
        regTrsoaddflg(CK_EQ, trsoaddflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_NotEqual(String trsoaddflg) {
        doSetTrsoaddflg_NotEqual(fRES(trsoaddflg));
    }

    protected void doSetTrsoaddflg_NotEqual(String trsoaddflg) {
        regTrsoaddflg(CK_NES, trsoaddflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_GreaterThan(String trsoaddflg) {
        regTrsoaddflg(CK_GT, fRES(trsoaddflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_LessThan(String trsoaddflg) {
        regTrsoaddflg(CK_LT, fRES(trsoaddflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_GreaterEqual(String trsoaddflg) {
        regTrsoaddflg(CK_GE, fRES(trsoaddflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_LessEqual(String trsoaddflg) {
        regTrsoaddflg(CK_LE, fRES(trsoaddflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflgList The collection of trsoaddflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_InScope(Collection<String> trsoaddflgList) {
        doSetTrsoaddflg_InScope(trsoaddflgList);
    }

    protected void doSetTrsoaddflg_InScope(Collection<String> trsoaddflgList) {
        regINS(CK_INS, cTL(trsoaddflgList), xgetCValueTrsoaddflg(), "TRSOADDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflgList The collection of trsoaddflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_NotInScope(Collection<String> trsoaddflgList) {
        doSetTrsoaddflg_NotInScope(trsoaddflgList);
    }

    protected void doSetTrsoaddflg_NotInScope(Collection<String> trsoaddflgList) {
        regINS(CK_NINS, cTL(trsoaddflgList), xgetCValueTrsoaddflg(), "TRSOADDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)} <br>
     * <pre>e.g. setTrsoaddflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trsoaddflg The value of trsoaddflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrsoaddflg_LikeSearch(String trsoaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trsoaddflg), xgetCValueTrsoaddflg(), "TRSOADDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrsoaddflg_NotLikeSearch(String trsoaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trsoaddflg), xgetCValueTrsoaddflg(), "TRSOADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_PrefixSearch(String trsoaddflg) {
        setTrsoaddflg_LikeSearch(trsoaddflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     */
    public void setTrsoaddflg_IsNull() { regTrsoaddflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     */
    public void setTrsoaddflg_IsNotNull() { regTrsoaddflg(CK_ISNN, DOBJ); }

    protected void regTrsoaddflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsoaddflg(), "TRSOADDFLG"); }
    protected abstract ConditionValue xgetCValueTrsoaddflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_Equal(Long soid) {
        doSetSoid_Equal(soid);
    }

    protected void doSetSoid_Equal(Long soid) {
        regSoid(CK_EQ, soid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_NotEqual(Long soid) {
        doSetSoid_NotEqual(soid);
    }

    protected void doSetSoid_NotEqual(Long soid) {
        regSoid(CK_NES, soid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterThan(Long soid) {
        regSoid(CK_GT, soid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessThan(Long soid) {
        regSoid(CK_LT, soid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterEqual(Long soid) {
        regSoid(CK_GE, soid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessEqual(Long soid) {
        regSoid(CK_LE, soid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param minNumber The min number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoid(), "SOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {bigint(19)}
     * @param soidList The collection of soid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_InScope(Collection<Long> soidList) {
        doSetSoid_InScope(soidList);
    }

    protected void doSetSoid_InScope(Collection<Long> soidList) {
        regINS(CK_INS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {bigint(19)}
     * @param soidList The collection of soid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_NotInScope(Collection<Long> soidList) {
        doSetSoid_NotInScope(soidList);
    }

    protected void doSetSoid_NotInScope(Collection<Long> soidList) {
        regINS(CK_NINS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     */
    public void setSoid_IsNull() { regSoid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     */
    public void setSoid_IsNotNull() { regSoid(CK_ISNN, DOBJ); }

    protected void regSoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoid(), "SOID"); }
    protected abstract ConditionValue xgetCValueSoid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_Equal(String planname) {
        doSetPlanname_Equal(fRES(planname));
    }

    protected void doSetPlanname_Equal(String planname) {
        regPlanname(CK_EQ, planname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_NotEqual(String planname) {
        doSetPlanname_NotEqual(fRES(planname));
    }

    protected void doSetPlanname_NotEqual(String planname) {
        regPlanname(CK_NES, planname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_GreaterThan(String planname) {
        regPlanname(CK_GT, fRES(planname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_LessThan(String planname) {
        regPlanname(CK_LT, fRES(planname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_GreaterEqual(String planname) {
        regPlanname(CK_GE, fRES(planname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_LessEqual(String planname) {
        regPlanname(CK_LE, fRES(planname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param plannameList The collection of planname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_InScope(Collection<String> plannameList) {
        doSetPlanname_InScope(plannameList);
    }

    protected void doSetPlanname_InScope(Collection<String> plannameList) {
        regINS(CK_INS, cTL(plannameList), xgetCValuePlanname(), "PLANNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param plannameList The collection of planname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_NotInScope(Collection<String> plannameList) {
        doSetPlanname_NotInScope(plannameList);
    }

    protected void doSetPlanname_NotInScope(Collection<String> plannameList) {
        regINS(CK_NINS, cTL(plannameList), xgetCValuePlanname(), "PLANNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANNAME: {varchar(60)} <br>
     * <pre>e.g. setPlanname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planname The value of planname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanname_LikeSearch(String planname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planname), xgetCValuePlanname(), "PLANNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanname_NotLikeSearch(String planname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planname), xgetCValuePlanname(), "PLANNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANNAME: {varchar(60)}
     * @param planname The value of planname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_PrefixSearch(String planname) {
        setPlanname_LikeSearch(planname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     */
    public void setPlanname_IsNull() { regPlanname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     */
    public void setPlanname_IsNullOrEmpty() { regPlanname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANNAME: {varchar(60)}
     */
    public void setPlanname_IsNotNull() { regPlanname(CK_ISNN, DOBJ); }

    protected void regPlanname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanname(), "PLANNAME"); }
    protected abstract ConditionValue xgetCValuePlanname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_Equal(String planpost) {
        doSetPlanpost_Equal(fRES(planpost));
    }

    protected void doSetPlanpost_Equal(String planpost) {
        regPlanpost(CK_EQ, planpost);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_NotEqual(String planpost) {
        doSetPlanpost_NotEqual(fRES(planpost));
    }

    protected void doSetPlanpost_NotEqual(String planpost) {
        regPlanpost(CK_NES, planpost);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_GreaterThan(String planpost) {
        regPlanpost(CK_GT, fRES(planpost));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_LessThan(String planpost) {
        regPlanpost(CK_LT, fRES(planpost));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_GreaterEqual(String planpost) {
        regPlanpost(CK_GE, fRES(planpost));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_LessEqual(String planpost) {
        regPlanpost(CK_LE, fRES(planpost));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpostList The collection of planpost as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_InScope(Collection<String> planpostList) {
        doSetPlanpost_InScope(planpostList);
    }

    protected void doSetPlanpost_InScope(Collection<String> planpostList) {
        regINS(CK_INS, cTL(planpostList), xgetCValuePlanpost(), "PLANPOST");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpostList The collection of planpost as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_NotInScope(Collection<String> planpostList) {
        doSetPlanpost_NotInScope(planpostList);
    }

    protected void doSetPlanpost_NotInScope(Collection<String> planpostList) {
        regINS(CK_NINS, cTL(planpostList), xgetCValuePlanpost(), "PLANPOST");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(30)} <br>
     * <pre>e.g. setPlanpost_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planpost The value of planpost as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanpost_LikeSearch(String planpost, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planpost), xgetCValuePlanpost(), "PLANPOST", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanpost_NotLikeSearch(String planpost, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planpost), xgetCValuePlanpost(), "PLANPOST", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(30)}
     * @param planpost The value of planpost as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_PrefixSearch(String planpost) {
        setPlanpost_LikeSearch(planpost, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     */
    public void setPlanpost_IsNull() { regPlanpost(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     */
    public void setPlanpost_IsNullOrEmpty() { regPlanpost(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(30)}
     */
    public void setPlanpost_IsNotNull() { regPlanpost(CK_ISNN, DOBJ); }

    protected void regPlanpost(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanpost(), "PLANPOST"); }
    protected abstract ConditionValue xgetCValuePlanpost();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_Equal(String planaddress) {
        doSetPlanaddress_Equal(fRES(planaddress));
    }

    protected void doSetPlanaddress_Equal(String planaddress) {
        regPlanaddress(CK_EQ, planaddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_NotEqual(String planaddress) {
        doSetPlanaddress_NotEqual(fRES(planaddress));
    }

    protected void doSetPlanaddress_NotEqual(String planaddress) {
        regPlanaddress(CK_NES, planaddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_GreaterThan(String planaddress) {
        regPlanaddress(CK_GT, fRES(planaddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_LessThan(String planaddress) {
        regPlanaddress(CK_LT, fRES(planaddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_GreaterEqual(String planaddress) {
        regPlanaddress(CK_GE, fRES(planaddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_LessEqual(String planaddress) {
        regPlanaddress(CK_LE, fRES(planaddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddressList The collection of planaddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_InScope(Collection<String> planaddressList) {
        doSetPlanaddress_InScope(planaddressList);
    }

    protected void doSetPlanaddress_InScope(Collection<String> planaddressList) {
        regINS(CK_INS, cTL(planaddressList), xgetCValuePlanaddress(), "PLANADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddressList The collection of planaddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_NotInScope(Collection<String> planaddressList) {
        doSetPlanaddress_NotInScope(planaddressList);
    }

    protected void doSetPlanaddress_NotInScope(Collection<String> planaddressList) {
        regINS(CK_NINS, cTL(planaddressList), xgetCValuePlanaddress(), "PLANADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANADDRESS: {varchar(100)} <br>
     * <pre>e.g. setPlanaddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planaddress The value of planaddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanaddress_LikeSearch(String planaddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planaddress), xgetCValuePlanaddress(), "PLANADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanaddress_NotLikeSearch(String planaddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planaddress), xgetCValuePlanaddress(), "PLANADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     * @param planaddress The value of planaddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress_PrefixSearch(String planaddress) {
        setPlanaddress_LikeSearch(planaddress, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     */
    public void setPlanaddress_IsNull() { regPlanaddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     */
    public void setPlanaddress_IsNullOrEmpty() { regPlanaddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANADDRESS: {varchar(100)}
     */
    public void setPlanaddress_IsNotNull() { regPlanaddress(CK_ISNN, DOBJ); }

    protected void regPlanaddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanaddress(), "PLANADDRESS"); }
    protected abstract ConditionValue xgetCValuePlanaddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_Equal(String planwarehousename) {
        doSetPlanwarehousename_Equal(fRES(planwarehousename));
    }

    protected void doSetPlanwarehousename_Equal(String planwarehousename) {
        regPlanwarehousename(CK_EQ, planwarehousename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_NotEqual(String planwarehousename) {
        doSetPlanwarehousename_NotEqual(fRES(planwarehousename));
    }

    protected void doSetPlanwarehousename_NotEqual(String planwarehousename) {
        regPlanwarehousename(CK_NES, planwarehousename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_GreaterThan(String planwarehousename) {
        regPlanwarehousename(CK_GT, fRES(planwarehousename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_LessThan(String planwarehousename) {
        regPlanwarehousename(CK_LT, fRES(planwarehousename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_GreaterEqual(String planwarehousename) {
        regPlanwarehousename(CK_GE, fRES(planwarehousename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_LessEqual(String planwarehousename) {
        regPlanwarehousename(CK_LE, fRES(planwarehousename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousenameList The collection of planwarehousename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_InScope(Collection<String> planwarehousenameList) {
        doSetPlanwarehousename_InScope(planwarehousenameList);
    }

    protected void doSetPlanwarehousename_InScope(Collection<String> planwarehousenameList) {
        regINS(CK_INS, cTL(planwarehousenameList), xgetCValuePlanwarehousename(), "PLANWAREHOUSENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousenameList The collection of planwarehousename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_NotInScope(Collection<String> planwarehousenameList) {
        doSetPlanwarehousename_NotInScope(planwarehousenameList);
    }

    protected void doSetPlanwarehousename_NotInScope(Collection<String> planwarehousenameList) {
        regINS(CK_NINS, cTL(planwarehousenameList), xgetCValuePlanwarehousename(), "PLANWAREHOUSENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)} <br>
     * <pre>e.g. setPlanwarehousename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planwarehousename The value of planwarehousename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanwarehousename_LikeSearch(String planwarehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planwarehousename), xgetCValuePlanwarehousename(), "PLANWAREHOUSENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanwarehousename_NotLikeSearch(String planwarehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planwarehousename), xgetCValuePlanwarehousename(), "PLANWAREHOUSENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @param planwarehousename The value of planwarehousename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanwarehousename_PrefixSearch(String planwarehousename) {
        setPlanwarehousename_LikeSearch(planwarehousename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     */
    public void setPlanwarehousename_IsNull() { regPlanwarehousename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     */
    public void setPlanwarehousename_IsNullOrEmpty() { regPlanwarehousename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     */
    public void setPlanwarehousename_IsNotNull() { regPlanwarehousename(CK_ISNN, DOBJ); }

    protected void regPlanwarehousename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanwarehousename(), "PLANWAREHOUSENAME"); }
    protected abstract ConditionValue xgetCValuePlanwarehousename();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

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
    public HpSLCFunction<TTrsojtCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsojtCB.class);
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
    public HpSLCFunction<TTrsojtCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsojtCB.class);
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
    public HpSLCFunction<TTrsojtCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsojtCB.class);
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
    public HpSLCFunction<TTrsojtCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsojtCB.class);
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
    public HpSLCFunction<TTrsojtCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsojtCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsojtCB&gt;() {
     *     public void query(TTrsojtCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsojtCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsojtCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsojtCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsojtCQ sq);

    protected TTrsojtCB xcreateScalarConditionCB() {
        TTrsojtCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsojtCB xcreateScalarConditionPartitionByCB() {
        TTrsojtCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsojtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsojtCB cb = new TTrsojtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOJTID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsojtCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsojtCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsojtCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsojtCB cb = new TTrsojtCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOJTID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsojtCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsojtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsojtCB cb = new TTrsojtCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsojtCQ sq);

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
    protected TTrsojtCB newMyCB() {
        return new TTrsojtCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsojtCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

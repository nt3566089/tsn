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
 * The abstract condition-query of T_TRITEMCONVRESULT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTritemconvresultCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTritemconvresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRITEMCONVRESULT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultId The value of tritemconvresultId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTritemconvresultId_Equal(Long tritemconvresultId) {
        doSetTritemconvresultId_Equal(tritemconvresultId);
    }

    protected void doSetTritemconvresultId_Equal(Long tritemconvresultId) {
        regTritemconvresultId(CK_EQ, tritemconvresultId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultId The value of tritemconvresultId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTritemconvresultId_NotEqual(Long tritemconvresultId) {
        doSetTritemconvresultId_NotEqual(tritemconvresultId);
    }

    protected void doSetTritemconvresultId_NotEqual(Long tritemconvresultId) {
        regTritemconvresultId(CK_NES, tritemconvresultId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultId The value of tritemconvresultId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTritemconvresultId_GreaterThan(Long tritemconvresultId) {
        regTritemconvresultId(CK_GT, tritemconvresultId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultId The value of tritemconvresultId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTritemconvresultId_LessThan(Long tritemconvresultId) {
        regTritemconvresultId(CK_LT, tritemconvresultId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultId The value of tritemconvresultId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTritemconvresultId_GreaterEqual(Long tritemconvresultId) {
        regTritemconvresultId(CK_GE, tritemconvresultId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultId The value of tritemconvresultId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTritemconvresultId_LessEqual(Long tritemconvresultId) {
        regTritemconvresultId(CK_LE, tritemconvresultId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tritemconvresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tritemconvresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTritemconvresultId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTritemconvresultId(), "TRITEMCONVRESULT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultIdList The collection of tritemconvresultId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTritemconvresultId_InScope(Collection<Long> tritemconvresultIdList) {
        doSetTritemconvresultId_InScope(tritemconvresultIdList);
    }

    protected void doSetTritemconvresultId_InScope(Collection<Long> tritemconvresultIdList) {
        regINS(CK_INS, cTL(tritemconvresultIdList), xgetCValueTritemconvresultId(), "TRITEMCONVRESULT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tritemconvresultIdList The collection of tritemconvresultId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTritemconvresultId_NotInScope(Collection<Long> tritemconvresultIdList) {
        doSetTritemconvresultId_NotInScope(tritemconvresultIdList);
    }

    protected void doSetTritemconvresultId_NotInScope(Collection<Long> tritemconvresultIdList) {
        regINS(CK_NINS, cTL(tritemconvresultIdList), xgetCValueTritemconvresultId(), "TRITEMCONVRESULT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTritemconvresultId_IsNull() { regTritemconvresultId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTritemconvresultId_IsNotNull() { regTritemconvresultId(CK_ISNN, DOBJ); }

    protected void regTritemconvresultId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTritemconvresultId(), "TRITEMCONVRESULT_ID"); }
    protected abstract ConditionValue xgetCValueTritemconvresultId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkey The value of itemchginstkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstkey_Equal(java.math.BigDecimal itemchginstkey) {
        doSetItemchginstkey_Equal(itemchginstkey);
    }

    protected void doSetItemchginstkey_Equal(java.math.BigDecimal itemchginstkey) {
        regItemchginstkey(CK_EQ, itemchginstkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkey The value of itemchginstkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstkey_NotEqual(java.math.BigDecimal itemchginstkey) {
        doSetItemchginstkey_NotEqual(itemchginstkey);
    }

    protected void doSetItemchginstkey_NotEqual(java.math.BigDecimal itemchginstkey) {
        regItemchginstkey(CK_NES, itemchginstkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkey The value of itemchginstkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstkey_GreaterThan(java.math.BigDecimal itemchginstkey) {
        regItemchginstkey(CK_GT, itemchginstkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkey The value of itemchginstkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstkey_LessThan(java.math.BigDecimal itemchginstkey) {
        regItemchginstkey(CK_LT, itemchginstkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkey The value of itemchginstkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstkey_GreaterEqual(java.math.BigDecimal itemchginstkey) {
        regItemchginstkey(CK_GE, itemchginstkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkey The value of itemchginstkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstkey_LessEqual(java.math.BigDecimal itemchginstkey) {
        regItemchginstkey(CK_LE, itemchginstkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of itemchginstkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemchginstkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemchginstkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemchginstkey(), "ITEMCHGINSTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkeyList The collection of itemchginstkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstkey_InScope(Collection<java.math.BigDecimal> itemchginstkeyList) {
        doSetItemchginstkey_InScope(itemchginstkeyList);
    }

    protected void doSetItemchginstkey_InScope(Collection<java.math.BigDecimal> itemchginstkeyList) {
        regINS(CK_INS, cTL(itemchginstkeyList), xgetCValueItemchginstkey(), "ITEMCHGINSTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @param itemchginstkeyList The collection of itemchginstkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstkey_NotInScope(Collection<java.math.BigDecimal> itemchginstkeyList) {
        doSetItemchginstkey_NotInScope(itemchginstkeyList);
    }

    protected void doSetItemchginstkey_NotInScope(Collection<java.math.BigDecimal> itemchginstkeyList) {
        regINS(CK_NINS, cTL(itemchginstkeyList), xgetCValueItemchginstkey(), "ITEMCHGINSTKEY");
    }

    protected void regItemchginstkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemchginstkey(), "ITEMCHGINSTKEY"); }
    protected abstract ConditionValue xgetCValueItemchginstkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_Equal(String jttsflg) {
        doSetJttsflg_Equal(fRES(jttsflg));
    }

    protected void doSetJttsflg_Equal(String jttsflg) {
        regJttsflg(CK_EQ, jttsflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_NotEqual(String jttsflg) {
        doSetJttsflg_NotEqual(fRES(jttsflg));
    }

    protected void doSetJttsflg_NotEqual(String jttsflg) {
        regJttsflg(CK_NES, jttsflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_GreaterThan(String jttsflg) {
        regJttsflg(CK_GT, fRES(jttsflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_LessThan(String jttsflg) {
        regJttsflg(CK_LT, fRES(jttsflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_GreaterEqual(String jttsflg) {
        regJttsflg(CK_GE, fRES(jttsflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_LessEqual(String jttsflg) {
        regJttsflg(CK_LE, fRES(jttsflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflgList The collection of jttsflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_InScope(Collection<String> jttsflgList) {
        doSetJttsflg_InScope(jttsflgList);
    }

    protected void doSetJttsflg_InScope(Collection<String> jttsflgList) {
        regINS(CK_INS, cTL(jttsflgList), xgetCValueJttsflg(), "JTTSFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflgList The collection of jttsflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_NotInScope(Collection<String> jttsflgList) {
        doSetJttsflg_NotInScope(jttsflgList);
    }

    protected void doSetJttsflg_NotInScope(Collection<String> jttsflgList) {
        regINS(CK_NINS, cTL(jttsflgList), xgetCValueJttsflg(), "JTTSFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTTSFLG: {char(1)} <br>
     * <pre>e.g. setJttsflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jttsflg The value of jttsflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJttsflg_LikeSearch(String jttsflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jttsflg), xgetCValueJttsflg(), "JTTSFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJttsflg_NotLikeSearch(String jttsflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jttsflg), xgetCValueJttsflg(), "JTTSFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTTSFLG: {char(1)}
     * @param jttsflg The value of jttsflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_PrefixSearch(String jttsflg) {
        setJttsflg_LikeSearch(jttsflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     */
    public void setJttsflg_IsNull() { regJttsflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTTSFLG: {char(1)}
     */
    public void setJttsflg_IsNotNull() { regJttsflg(CK_ISNN, DOBJ); }

    protected void regJttsflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJttsflg(), "JTTSFLG"); }
    protected abstract ConditionValue xgetCValueJttsflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_Equal(String companycd) {
        doSetCompanycd_Equal(fRES(companycd));
    }

    protected void doSetCompanycd_Equal(String companycd) {
        regCompanycd(CK_EQ, companycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotEqual(String companycd) {
        doSetCompanycd_NotEqual(fRES(companycd));
    }

    protected void doSetCompanycd_NotEqual(String companycd) {
        regCompanycd(CK_NES, companycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterThan(String companycd) {
        regCompanycd(CK_GT, fRES(companycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessThan(String companycd) {
        regCompanycd(CK_LT, fRES(companycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterEqual(String companycd) {
        regCompanycd(CK_GE, fRES(companycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessEqual(String companycd) {
        regCompanycd(CK_LE, fRES(companycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_InScope(Collection<String> companycdList) {
        doSetCompanycd_InScope(companycdList);
    }

    protected void doSetCompanycd_InScope(Collection<String> companycdList) {
        regINS(CK_INS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotInScope(Collection<String> companycdList) {
        doSetCompanycd_NotInScope(companycdList);
    }

    protected void doSetCompanycd_NotInScope(Collection<String> companycdList) {
        regINS(CK_NINS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)} <br>
     * <pre>e.g. setCompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companycd The value of companycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanycd_LikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanycd_NotLikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_PrefixSearch(String companycd) {
        setCompanycd_LikeSearch(companycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNull() { regCompanycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNullOrEmpty() { regCompanycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNotNull() { regCompanycd(CK_ISNN, DOBJ); }

    protected void regCompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanycd(), "COMPANYCD"); }
    protected abstract ConditionValue xgetCValueCompanycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_Equal(String productCdFrom) {
        doSetProductCdFrom_Equal(fRES(productCdFrom));
    }

    protected void doSetProductCdFrom_Equal(String productCdFrom) {
        regProductCdFrom(CK_EQ, productCdFrom);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_NotEqual(String productCdFrom) {
        doSetProductCdFrom_NotEqual(fRES(productCdFrom));
    }

    protected void doSetProductCdFrom_NotEqual(String productCdFrom) {
        regProductCdFrom(CK_NES, productCdFrom);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_GreaterThan(String productCdFrom) {
        regProductCdFrom(CK_GT, fRES(productCdFrom));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_LessThan(String productCdFrom) {
        regProductCdFrom(CK_LT, fRES(productCdFrom));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_GreaterEqual(String productCdFrom) {
        regProductCdFrom(CK_GE, fRES(productCdFrom));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_LessEqual(String productCdFrom) {
        regProductCdFrom(CK_LE, fRES(productCdFrom));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFromList The collection of productCdFrom as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_InScope(Collection<String> productCdFromList) {
        doSetProductCdFrom_InScope(productCdFromList);
    }

    protected void doSetProductCdFrom_InScope(Collection<String> productCdFromList) {
        regINS(CK_INS, cTL(productCdFromList), xgetCValueProductCdFrom(), "PRODUCT_CD_FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFromList The collection of productCdFrom as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_NotInScope(Collection<String> productCdFromList) {
        doSetProductCdFrom_NotInScope(productCdFromList);
    }

    protected void doSetProductCdFrom_NotInScope(Collection<String> productCdFromList) {
        regINS(CK_NINS, cTL(productCdFromList), xgetCValueProductCdFrom(), "PRODUCT_CD_FROM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setProductCdFrom_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCdFrom The value of productCdFrom as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCdFrom_LikeSearch(String productCdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCdFrom), xgetCValueProductCdFrom(), "PRODUCT_CD_FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCdFrom_NotLikeSearch(String productCdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCdFrom), xgetCValueProductCdFrom(), "PRODUCT_CD_FROM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @param productCdFrom The value of productCdFrom as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdFrom_PrefixSearch(String productCdFrom) {
        setProductCdFrom_LikeSearch(productCdFrom, xcLSOPPre());
    }

    protected void regProductCdFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCdFrom(), "PRODUCT_CD_FROM"); }
    protected abstract ConditionValue xgetCValueProductCdFrom();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_Equal(String productCdTo) {
        doSetProductCdTo_Equal(fRES(productCdTo));
    }

    protected void doSetProductCdTo_Equal(String productCdTo) {
        regProductCdTo(CK_EQ, productCdTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_NotEqual(String productCdTo) {
        doSetProductCdTo_NotEqual(fRES(productCdTo));
    }

    protected void doSetProductCdTo_NotEqual(String productCdTo) {
        regProductCdTo(CK_NES, productCdTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_GreaterThan(String productCdTo) {
        regProductCdTo(CK_GT, fRES(productCdTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_LessThan(String productCdTo) {
        regProductCdTo(CK_LT, fRES(productCdTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_GreaterEqual(String productCdTo) {
        regProductCdTo(CK_GE, fRES(productCdTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_LessEqual(String productCdTo) {
        regProductCdTo(CK_LE, fRES(productCdTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdToList The collection of productCdTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_InScope(Collection<String> productCdToList) {
        doSetProductCdTo_InScope(productCdToList);
    }

    protected void doSetProductCdTo_InScope(Collection<String> productCdToList) {
        regINS(CK_INS, cTL(productCdToList), xgetCValueProductCdTo(), "PRODUCT_CD_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdToList The collection of productCdTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_NotInScope(Collection<String> productCdToList) {
        doSetProductCdTo_NotInScope(productCdToList);
    }

    protected void doSetProductCdTo_NotInScope(Collection<String> productCdToList) {
        regINS(CK_NINS, cTL(productCdToList), xgetCValueProductCdTo(), "PRODUCT_CD_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)} <br>
     * <pre>e.g. setProductCdTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCdTo The value of productCdTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCdTo_LikeSearch(String productCdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCdTo), xgetCValueProductCdTo(), "PRODUCT_CD_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCdTo_NotLikeSearch(String productCdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCdTo), xgetCValueProductCdTo(), "PRODUCT_CD_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @param productCdTo The value of productCdTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdTo_PrefixSearch(String productCdTo) {
        setProductCdTo_LikeSearch(productCdTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     */
    public void setProductCdTo_IsNull() { regProductCdTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     */
    public void setProductCdTo_IsNullOrEmpty() { regProductCdTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     */
    public void setProductCdTo_IsNotNull() { regProductCdTo(CK_ISNN, DOBJ); }

    protected void regProductCdTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCdTo(), "PRODUCT_CD_TO"); }
    protected abstract ConditionValue xgetCValueProductCdTo();

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
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_Equal(Long palletId) {
        doSetPalletId_Equal(palletId);
    }

    protected void doSetPalletId_Equal(Long palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(Long palletId) {
        doSetPalletId_NotEqual(palletId);
    }

    protected void doSetPalletId_NotEqual(Long palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(Long palletId) {
        regPalletId(CK_GT, palletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(Long palletId) {
        regPalletId(CK_LT, palletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(Long palletId) {
        regPalletId(CK_GE, palletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(Long palletId) {
        regPalletId(CK_LE, palletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param minNumber The min number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletId(), "PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<Long> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<Long> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<Long> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<Long> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     */
    public void setPalletId_IsNull() { regPalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     */
    public void setPalletId_IsNotNull() { regPalletId(CK_ISNN, DOBJ); }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_Equal(String itemchginstflg) {
        doSetItemchginstflg_Equal(fRES(itemchginstflg));
    }

    protected void doSetItemchginstflg_Equal(String itemchginstflg) {
        regItemchginstflg(CK_EQ, itemchginstflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_NotEqual(String itemchginstflg) {
        doSetItemchginstflg_NotEqual(fRES(itemchginstflg));
    }

    protected void doSetItemchginstflg_NotEqual(String itemchginstflg) {
        regItemchginstflg(CK_NES, itemchginstflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_GreaterThan(String itemchginstflg) {
        regItemchginstflg(CK_GT, fRES(itemchginstflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_LessThan(String itemchginstflg) {
        regItemchginstflg(CK_LT, fRES(itemchginstflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_GreaterEqual(String itemchginstflg) {
        regItemchginstflg(CK_GE, fRES(itemchginstflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_LessEqual(String itemchginstflg) {
        regItemchginstflg(CK_LE, fRES(itemchginstflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflgList The collection of itemchginstflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_InScope(Collection<String> itemchginstflgList) {
        doSetItemchginstflg_InScope(itemchginstflgList);
    }

    protected void doSetItemchginstflg_InScope(Collection<String> itemchginstflgList) {
        regINS(CK_INS, cTL(itemchginstflgList), xgetCValueItemchginstflg(), "ITEMCHGINSTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflgList The collection of itemchginstflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_NotInScope(Collection<String> itemchginstflgList) {
        doSetItemchginstflg_NotInScope(itemchginstflgList);
    }

    protected void doSetItemchginstflg_NotInScope(Collection<String> itemchginstflgList) {
        regINS(CK_NINS, cTL(itemchginstflgList), xgetCValueItemchginstflg(), "ITEMCHGINSTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemchginstflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemchginstflg The value of itemchginstflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemchginstflg_LikeSearch(String itemchginstflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemchginstflg), xgetCValueItemchginstflg(), "ITEMCHGINSTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemchginstflg_NotLikeSearch(String itemchginstflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemchginstflg), xgetCValueItemchginstflg(), "ITEMCHGINSTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @param itemchginstflg The value of itemchginstflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemchginstflg_PrefixSearch(String itemchginstflg) {
        setItemchginstflg_LikeSearch(itemchginstflg, xcLSOPPre());
    }

    protected void regItemchginstflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemchginstflg(), "ITEMCHGINSTFLG"); }
    protected abstract ConditionValue xgetCValueItemchginstflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @param itemchginstdate The value of itemchginstdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstdate_Equal(java.sql.Timestamp itemchginstdate) {
        regItemchginstdate(CK_EQ,  itemchginstdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @param itemchginstdate The value of itemchginstdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstdate_GreaterThan(java.sql.Timestamp itemchginstdate) {
        regItemchginstdate(CK_GT,  itemchginstdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @param itemchginstdate The value of itemchginstdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstdate_LessThan(java.sql.Timestamp itemchginstdate) {
        regItemchginstdate(CK_LT,  itemchginstdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @param itemchginstdate The value of itemchginstdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstdate_GreaterEqual(java.sql.Timestamp itemchginstdate) {
        regItemchginstdate(CK_GE,  itemchginstdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @param itemchginstdate The value of itemchginstdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemchginstdate_LessEqual(java.sql.Timestamp itemchginstdate) {
        regItemchginstdate(CK_LE, itemchginstdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * <pre>e.g. setItemchginstdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of itemchginstdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of itemchginstdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setItemchginstdate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueItemchginstdate(), "ITEMCHGINSTDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of itemchginstdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of itemchginstdate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setItemchginstdate_DateFromTo(Date fromDate, Date toDate) {
        setItemchginstdate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     */
    public void setItemchginstdate_IsNull() { regItemchginstdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     */
    public void setItemchginstdate_IsNotNull() { regItemchginstdate(CK_ISNN, DOBJ); }

    protected void regItemchginstdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemchginstdate(), "ITEMCHGINSTDATE"); }
    protected abstract ConditionValue xgetCValueItemchginstdate();

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
    public HpSLCFunction<TTritemconvresultCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTritemconvresultCB.class);
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
    public HpSLCFunction<TTritemconvresultCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTritemconvresultCB.class);
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
    public HpSLCFunction<TTritemconvresultCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTritemconvresultCB.class);
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
    public HpSLCFunction<TTritemconvresultCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTritemconvresultCB.class);
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
    public HpSLCFunction<TTritemconvresultCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTritemconvresultCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTritemconvresultCB&gt;() {
     *     public void query(TTritemconvresultCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTritemconvresultCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTritemconvresultCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTritemconvresultCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTritemconvresultCQ sq);

    protected TTritemconvresultCB xcreateScalarConditionCB() {
        TTritemconvresultCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTritemconvresultCB xcreateScalarConditionPartitionByCB() {
        TTritemconvresultCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTritemconvresultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRITEMCONVRESULT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTritemconvresultCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTritemconvresultCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTritemconvresultCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRITEMCONVRESULT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTritemconvresultCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTritemconvresultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTritemconvresultCQ sq);

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
    protected TTritemconvresultCB newMyCB() {
        return new TTritemconvresultCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTritemconvresultCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of T_TRCASEINVENTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrcaseinventoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrcaseinventoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRCASEINVENTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryId The value of trcaseinventoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_Equal(Long trcaseinventoryId) {
        doSetTrcaseinventoryId_Equal(trcaseinventoryId);
    }

    protected void doSetTrcaseinventoryId_Equal(Long trcaseinventoryId) {
        regTrcaseinventoryId(CK_EQ, trcaseinventoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryId The value of trcaseinventoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_NotEqual(Long trcaseinventoryId) {
        doSetTrcaseinventoryId_NotEqual(trcaseinventoryId);
    }

    protected void doSetTrcaseinventoryId_NotEqual(Long trcaseinventoryId) {
        regTrcaseinventoryId(CK_NES, trcaseinventoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryId The value of trcaseinventoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_GreaterThan(Long trcaseinventoryId) {
        regTrcaseinventoryId(CK_GT, trcaseinventoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryId The value of trcaseinventoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_LessThan(Long trcaseinventoryId) {
        regTrcaseinventoryId(CK_LT, trcaseinventoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryId The value of trcaseinventoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_GreaterEqual(Long trcaseinventoryId) {
        regTrcaseinventoryId(CK_GE, trcaseinventoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryId The value of trcaseinventoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_LessEqual(Long trcaseinventoryId) {
        regTrcaseinventoryId(CK_LE, trcaseinventoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trcaseinventoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trcaseinventoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrcaseinventoryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrcaseinventoryId(), "TRCASEINVENTORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryIdList The collection of trcaseinventoryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_InScope(Collection<Long> trcaseinventoryIdList) {
        doSetTrcaseinventoryId_InScope(trcaseinventoryIdList);
    }

    protected void doSetTrcaseinventoryId_InScope(Collection<Long> trcaseinventoryIdList) {
        regINS(CK_INS, cTL(trcaseinventoryIdList), xgetCValueTrcaseinventoryId(), "TRCASEINVENTORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcaseinventoryIdList The collection of trcaseinventoryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcaseinventoryId_NotInScope(Collection<Long> trcaseinventoryIdList) {
        doSetTrcaseinventoryId_NotInScope(trcaseinventoryIdList);
    }

    protected void doSetTrcaseinventoryId_NotInScope(Collection<Long> trcaseinventoryIdList) {
        regINS(CK_NINS, cTL(trcaseinventoryIdList), xgetCValueTrcaseinventoryId(), "TRCASEINVENTORY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrcaseinventoryId_IsNull() { regTrcaseinventoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrcaseinventoryId_IsNotNull() { regTrcaseinventoryId(CK_ISNN, DOBJ); }

    protected void regTrcaseinventoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrcaseinventoryId(), "TRCASEINVENTORY_ID"); }
    protected abstract ConditionValue xgetCValueTrcaseinventoryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_Equal(java.math.BigDecimal caseinventoryno) {
        doSetCaseinventoryno_Equal(caseinventoryno);
    }

    protected void doSetCaseinventoryno_Equal(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_EQ, caseinventoryno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_NotEqual(java.math.BigDecimal caseinventoryno) {
        doSetCaseinventoryno_NotEqual(caseinventoryno);
    }

    protected void doSetCaseinventoryno_NotEqual(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_NES, caseinventoryno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_GreaterThan(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_GT, caseinventoryno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_LessThan(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_LT, caseinventoryno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_GreaterEqual(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_GE, caseinventoryno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventoryno The value of caseinventoryno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinventoryno_LessEqual(java.math.BigDecimal caseinventoryno) {
        regCaseinventoryno(CK_LE, caseinventoryno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of caseinventoryno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinventoryno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinventoryno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinventoryno(), "CASEINVENTORYNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventorynoList The collection of caseinventoryno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinventoryno_InScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        doSetCaseinventoryno_InScope(caseinventorynoList);
    }

    protected void doSetCaseinventoryno_InScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        regINS(CK_INS, cTL(caseinventorynoList), xgetCValueCaseinventoryno(), "CASEINVENTORYNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @param caseinventorynoList The collection of caseinventoryno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinventoryno_NotInScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        doSetCaseinventoryno_NotInScope(caseinventorynoList);
    }

    protected void doSetCaseinventoryno_NotInScope(Collection<java.math.BigDecimal> caseinventorynoList) {
        regINS(CK_NINS, cTL(caseinventorynoList), xgetCValueCaseinventoryno(), "CASEINVENTORYNO");
    }

    protected void regCaseinventoryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinventoryno(), "CASEINVENTORYNO"); }
    protected abstract ConditionValue xgetCValueCaseinventoryno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecd The value of casecd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_Equal(java.math.BigDecimal casecd) {
        doSetCasecd_Equal(casecd);
    }

    protected void doSetCasecd_Equal(java.math.BigDecimal casecd) {
        regCasecd(CK_EQ, casecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecd The value of casecd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_NotEqual(java.math.BigDecimal casecd) {
        doSetCasecd_NotEqual(casecd);
    }

    protected void doSetCasecd_NotEqual(java.math.BigDecimal casecd) {
        regCasecd(CK_NES, casecd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecd The value of casecd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_GreaterThan(java.math.BigDecimal casecd) {
        regCasecd(CK_GT, casecd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecd The value of casecd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_LessThan(java.math.BigDecimal casecd) {
        regCasecd(CK_LT, casecd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecd The value of casecd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_GreaterEqual(java.math.BigDecimal casecd) {
        regCasecd(CK_GE, casecd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecd The value of casecd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_LessEqual(java.math.BigDecimal casecd) {
        regCasecd(CK_LE, casecd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of casecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of casecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCasecd_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCasecd(), "CASECD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecdList The collection of casecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecd_InScope(Collection<java.math.BigDecimal> casecdList) {
        doSetCasecd_InScope(casecdList);
    }

    protected void doSetCasecd_InScope(Collection<java.math.BigDecimal> casecdList) {
        regINS(CK_INS, cTL(casecdList), xgetCValueCasecd(), "CASECD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASECD: {NotNull, decimal(16, 6)}
     * @param casecdList The collection of casecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecd_NotInScope(Collection<java.math.BigDecimal> casecdList) {
        doSetCasecd_NotInScope(casecdList);
    }

    protected void doSetCasecd_NotInScope(Collection<java.math.BigDecimal> casecdList) {
        regINS(CK_NINS, cTL(casecdList), xgetCValueCasecd(), "CASECD");
    }

    protected void regCasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecd(), "CASECD"); }
    protected abstract ConditionValue xgetCValueCasecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_Equal(String inventorykey) {
        doSetInventorykey_Equal(fRES(inventorykey));
    }

    protected void doSetInventorykey_Equal(String inventorykey) {
        regInventorykey(CK_EQ, inventorykey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_NotEqual(String inventorykey) {
        doSetInventorykey_NotEqual(fRES(inventorykey));
    }

    protected void doSetInventorykey_NotEqual(String inventorykey) {
        regInventorykey(CK_NES, inventorykey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_GreaterThan(String inventorykey) {
        regInventorykey(CK_GT, fRES(inventorykey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_LessThan(String inventorykey) {
        regInventorykey(CK_LT, fRES(inventorykey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_GreaterEqual(String inventorykey) {
        regInventorykey(CK_GE, fRES(inventorykey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_LessEqual(String inventorykey) {
        regInventorykey(CK_LE, fRES(inventorykey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykeyList The collection of inventorykey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_InScope(Collection<String> inventorykeyList) {
        doSetInventorykey_InScope(inventorykeyList);
    }

    protected void doSetInventorykey_InScope(Collection<String> inventorykeyList) {
        regINS(CK_INS, cTL(inventorykeyList), xgetCValueInventorykey(), "INVENTORYKEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykeyList The collection of inventorykey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_NotInScope(Collection<String> inventorykeyList) {
        doSetInventorykey_NotInScope(inventorykeyList);
    }

    protected void doSetInventorykey_NotInScope(Collection<String> inventorykeyList) {
        regINS(CK_NINS, cTL(inventorykeyList), xgetCValueInventorykey(), "INVENTORYKEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInventorykey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventorykey The value of inventorykey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventorykey_LikeSearch(String inventorykey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventorykey), xgetCValueInventorykey(), "INVENTORYKEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventorykey_NotLikeSearch(String inventorykey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventorykey), xgetCValueInventorykey(), "INVENTORYKEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @param inventorykey The value of inventorykey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorykey_PrefixSearch(String inventorykey) {
        setInventorykey_LikeSearch(inventorykey, xcLSOPPre());
    }

    protected void regInventorykey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventorykey(), "INVENTORYKEY"); }
    protected abstract ConditionValue xgetCValueInventorykey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_Equal(Long inventoryBId) {
        doSetInventoryBId_Equal(inventoryBId);
    }

    protected void doSetInventoryBId_Equal(Long inventoryBId) {
        regInventoryBId(CK_EQ, inventoryBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_NotEqual(Long inventoryBId) {
        doSetInventoryBId_NotEqual(inventoryBId);
    }

    protected void doSetInventoryBId_NotEqual(Long inventoryBId) {
        regInventoryBId(CK_NES, inventoryBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterThan(Long inventoryBId) {
        regInventoryBId(CK_GT, inventoryBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessThan(Long inventoryBId) {
        regInventoryBId(CK_LT, inventoryBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterEqual(Long inventoryBId) {
        regInventoryBId(CK_GE, inventoryBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessEqual(Long inventoryBId) {
        regInventoryBId(CK_LE, inventoryBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryBId(), "INVENTORY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBIdList The collection of inventoryBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_InScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        regINS(CK_INS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBIdList The collection of inventoryBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_NotInScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        regINS(CK_NINS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    protected void regInventoryBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryBId(), "INVENTORY_B_ID"); }
    protected abstract ConditionValue xgetCValueInventoryBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqty The value of caseinvqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinvqty_Equal(Long caseinvqty) {
        doSetCaseinvqty_Equal(caseinvqty);
    }

    protected void doSetCaseinvqty_Equal(Long caseinvqty) {
        regCaseinvqty(CK_EQ, caseinvqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqty The value of caseinvqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinvqty_NotEqual(Long caseinvqty) {
        doSetCaseinvqty_NotEqual(caseinvqty);
    }

    protected void doSetCaseinvqty_NotEqual(Long caseinvqty) {
        regCaseinvqty(CK_NES, caseinvqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqty The value of caseinvqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinvqty_GreaterThan(Long caseinvqty) {
        regCaseinvqty(CK_GT, caseinvqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqty The value of caseinvqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinvqty_LessThan(Long caseinvqty) {
        regCaseinvqty(CK_LT, caseinvqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqty The value of caseinvqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinvqty_GreaterEqual(Long caseinvqty) {
        regCaseinvqty(CK_GE, caseinvqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqty The value of caseinvqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinvqty_LessEqual(Long caseinvqty) {
        regCaseinvqty(CK_LE, caseinvqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param minNumber The min number of caseinvqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinvqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinvqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinvqty(), "CASEINVQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqtyList The collection of caseinvqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinvqty_InScope(Collection<Long> caseinvqtyList) {
        doSetCaseinvqty_InScope(caseinvqtyList);
    }

    protected void doSetCaseinvqty_InScope(Collection<Long> caseinvqtyList) {
        regINS(CK_INS, cTL(caseinvqtyList), xgetCValueCaseinvqty(), "CASEINVQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINVQTY: {NotNull, bigint(19)}
     * @param caseinvqtyList The collection of caseinvqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinvqty_NotInScope(Collection<Long> caseinvqtyList) {
        doSetCaseinvqty_NotInScope(caseinvqtyList);
    }

    protected void doSetCaseinvqty_NotInScope(Collection<Long> caseinvqtyList) {
        regINS(CK_NINS, cTL(caseinvqtyList), xgetCValueCaseinvqty(), "CASEINVQTY");
    }

    protected void regCaseinvqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinvqty(), "CASEINVQTY"); }
    protected abstract ConditionValue xgetCValueCaseinvqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenum The value of defectivenum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefectivenum_Equal(Long defectivenum) {
        doSetDefectivenum_Equal(defectivenum);
    }

    protected void doSetDefectivenum_Equal(Long defectivenum) {
        regDefectivenum(CK_EQ, defectivenum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenum The value of defectivenum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefectivenum_NotEqual(Long defectivenum) {
        doSetDefectivenum_NotEqual(defectivenum);
    }

    protected void doSetDefectivenum_NotEqual(Long defectivenum) {
        regDefectivenum(CK_NES, defectivenum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenum The value of defectivenum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefectivenum_GreaterThan(Long defectivenum) {
        regDefectivenum(CK_GT, defectivenum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenum The value of defectivenum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefectivenum_LessThan(Long defectivenum) {
        regDefectivenum(CK_LT, defectivenum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenum The value of defectivenum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefectivenum_GreaterEqual(Long defectivenum) {
        regDefectivenum(CK_GE, defectivenum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenum The value of defectivenum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefectivenum_LessEqual(Long defectivenum) {
        regDefectivenum(CK_LE, defectivenum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param minNumber The min number of defectivenum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defectivenum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefectivenum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefectivenum(), "DEFECTIVENUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenumList The collection of defectivenum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefectivenum_InScope(Collection<Long> defectivenumList) {
        doSetDefectivenum_InScope(defectivenumList);
    }

    protected void doSetDefectivenum_InScope(Collection<Long> defectivenumList) {
        regINS(CK_INS, cTL(defectivenumList), xgetCValueDefectivenum(), "DEFECTIVENUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     * @param defectivenumList The collection of defectivenum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefectivenum_NotInScope(Collection<Long> defectivenumList) {
        doSetDefectivenum_NotInScope(defectivenumList);
    }

    protected void doSetDefectivenum_NotInScope(Collection<Long> defectivenumList) {
        regINS(CK_NINS, cTL(defectivenumList), xgetCValueDefectivenum(), "DEFECTIVENUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     */
    public void setDefectivenum_IsNull() { regDefectivenum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEFECTIVENUM: {bigint(19)}
     */
    public void setDefectivenum_IsNotNull() { regDefectivenum(CK_ISNN, DOBJ); }

    protected void regDefectivenum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefectivenum(), "DEFECTIVENUM"); }
    protected abstract ConditionValue xgetCValueDefectivenum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednum The value of totalsortednum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalsortednum_Equal(java.math.BigDecimal totalsortednum) {
        doSetTotalsortednum_Equal(totalsortednum);
    }

    protected void doSetTotalsortednum_Equal(java.math.BigDecimal totalsortednum) {
        regTotalsortednum(CK_EQ, totalsortednum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednum The value of totalsortednum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalsortednum_NotEqual(java.math.BigDecimal totalsortednum) {
        doSetTotalsortednum_NotEqual(totalsortednum);
    }

    protected void doSetTotalsortednum_NotEqual(java.math.BigDecimal totalsortednum) {
        regTotalsortednum(CK_NES, totalsortednum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednum The value of totalsortednum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalsortednum_GreaterThan(java.math.BigDecimal totalsortednum) {
        regTotalsortednum(CK_GT, totalsortednum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednum The value of totalsortednum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalsortednum_LessThan(java.math.BigDecimal totalsortednum) {
        regTotalsortednum(CK_LT, totalsortednum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednum The value of totalsortednum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalsortednum_GreaterEqual(java.math.BigDecimal totalsortednum) {
        regTotalsortednum(CK_GE, totalsortednum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednum The value of totalsortednum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalsortednum_LessEqual(java.math.BigDecimal totalsortednum) {
        regTotalsortednum(CK_LE, totalsortednum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param minNumber The min number of totalsortednum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalsortednum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalsortednum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalsortednum(), "TOTALSORTEDNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednumList The collection of totalsortednum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalsortednum_InScope(Collection<java.math.BigDecimal> totalsortednumList) {
        doSetTotalsortednum_InScope(totalsortednumList);
    }

    protected void doSetTotalsortednum_InScope(Collection<java.math.BigDecimal> totalsortednumList) {
        regINS(CK_INS, cTL(totalsortednumList), xgetCValueTotalsortednum(), "TOTALSORTEDNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @param totalsortednumList The collection of totalsortednum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalsortednum_NotInScope(Collection<java.math.BigDecimal> totalsortednumList) {
        doSetTotalsortednum_NotInScope(totalsortednumList);
    }

    protected void doSetTotalsortednum_NotInScope(Collection<java.math.BigDecimal> totalsortednumList) {
        regINS(CK_NINS, cTL(totalsortednumList), xgetCValueTotalsortednum(), "TOTALSORTEDNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     */
    public void setTotalsortednum_IsNull() { regTotalsortednum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTALSORTEDNUM: {decimal(16, 6)}
     */
    public void setTotalsortednum_IsNotNull() { regTotalsortednum(CK_ISNN, DOBJ); }

    protected void regTotalsortednum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalsortednum(), "TOTALSORTEDNUM"); }
    protected abstract ConditionValue xgetCValueTotalsortednum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnum The value of sorteddifnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorteddifnum_Equal(Long sorteddifnum) {
        doSetSorteddifnum_Equal(sorteddifnum);
    }

    protected void doSetSorteddifnum_Equal(Long sorteddifnum) {
        regSorteddifnum(CK_EQ, sorteddifnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnum The value of sorteddifnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorteddifnum_NotEqual(Long sorteddifnum) {
        doSetSorteddifnum_NotEqual(sorteddifnum);
    }

    protected void doSetSorteddifnum_NotEqual(Long sorteddifnum) {
        regSorteddifnum(CK_NES, sorteddifnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnum The value of sorteddifnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorteddifnum_GreaterThan(Long sorteddifnum) {
        regSorteddifnum(CK_GT, sorteddifnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnum The value of sorteddifnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorteddifnum_LessThan(Long sorteddifnum) {
        regSorteddifnum(CK_LT, sorteddifnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnum The value of sorteddifnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorteddifnum_GreaterEqual(Long sorteddifnum) {
        regSorteddifnum(CK_GE, sorteddifnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnum The value of sorteddifnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorteddifnum_LessEqual(Long sorteddifnum) {
        regSorteddifnum(CK_LE, sorteddifnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param minNumber The min number of sorteddifnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sorteddifnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSorteddifnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSorteddifnum(), "SORTEDDIFNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnumList The collection of sorteddifnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSorteddifnum_InScope(Collection<Long> sorteddifnumList) {
        doSetSorteddifnum_InScope(sorteddifnumList);
    }

    protected void doSetSorteddifnum_InScope(Collection<Long> sorteddifnumList) {
        regINS(CK_INS, cTL(sorteddifnumList), xgetCValueSorteddifnum(), "SORTEDDIFNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     * @param sorteddifnumList The collection of sorteddifnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSorteddifnum_NotInScope(Collection<Long> sorteddifnumList) {
        doSetSorteddifnum_NotInScope(sorteddifnumList);
    }

    protected void doSetSorteddifnum_NotInScope(Collection<Long> sorteddifnumList) {
        regINS(CK_NINS, cTL(sorteddifnumList), xgetCValueSorteddifnum(), "SORTEDDIFNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     */
    public void setSorteddifnum_IsNull() { regSorteddifnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTEDDIFNUM: {bigint(19)}
     */
    public void setSorteddifnum_IsNotNull() { regSorteddifnum(CK_ISNN, DOBJ); }

    protected void regSorteddifnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSorteddifnum(), "SORTEDDIFNUM"); }
    protected abstract ConditionValue xgetCValueSorteddifnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_Equal(String inventorydatetime) {
        doSetInventorydatetime_Equal(fRES(inventorydatetime));
    }

    protected void doSetInventorydatetime_Equal(String inventorydatetime) {
        regInventorydatetime(CK_EQ, inventorydatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_NotEqual(String inventorydatetime) {
        doSetInventorydatetime_NotEqual(fRES(inventorydatetime));
    }

    protected void doSetInventorydatetime_NotEqual(String inventorydatetime) {
        regInventorydatetime(CK_NES, inventorydatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_GreaterThan(String inventorydatetime) {
        regInventorydatetime(CK_GT, fRES(inventorydatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_LessThan(String inventorydatetime) {
        regInventorydatetime(CK_LT, fRES(inventorydatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_GreaterEqual(String inventorydatetime) {
        regInventorydatetime(CK_GE, fRES(inventorydatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_LessEqual(String inventorydatetime) {
        regInventorydatetime(CK_LE, fRES(inventorydatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetimeList The collection of inventorydatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_InScope(Collection<String> inventorydatetimeList) {
        doSetInventorydatetime_InScope(inventorydatetimeList);
    }

    protected void doSetInventorydatetime_InScope(Collection<String> inventorydatetimeList) {
        regINS(CK_INS, cTL(inventorydatetimeList), xgetCValueInventorydatetime(), "INVENTORYDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetimeList The collection of inventorydatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_NotInScope(Collection<String> inventorydatetimeList) {
        doSetInventorydatetime_NotInScope(inventorydatetimeList);
    }

    protected void doSetInventorydatetime_NotInScope(Collection<String> inventorydatetimeList) {
        regINS(CK_NINS, cTL(inventorydatetimeList), xgetCValueInventorydatetime(), "INVENTORYDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)} <br>
     * <pre>e.g. setInventorydatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventorydatetime The value of inventorydatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventorydatetime_LikeSearch(String inventorydatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventorydatetime), xgetCValueInventorydatetime(), "INVENTORYDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventorydatetime_NotLikeSearch(String inventorydatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventorydatetime), xgetCValueInventorydatetime(), "INVENTORYDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @param inventorydatetime The value of inventorydatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorydatetime_PrefixSearch(String inventorydatetime) {
        setInventorydatetime_LikeSearch(inventorydatetime, xcLSOPPre());
    }

    protected void regInventorydatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventorydatetime(), "INVENTORYDATETIME"); }
    protected abstract ConditionValue xgetCValueInventorydatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatests The value of tracecreatests as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracecreatests_Equal(java.math.BigDecimal tracecreatests) {
        doSetTracecreatests_Equal(tracecreatests);
    }

    protected void doSetTracecreatests_Equal(java.math.BigDecimal tracecreatests) {
        regTracecreatests(CK_EQ, tracecreatests);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatests The value of tracecreatests as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracecreatests_NotEqual(java.math.BigDecimal tracecreatests) {
        doSetTracecreatests_NotEqual(tracecreatests);
    }

    protected void doSetTracecreatests_NotEqual(java.math.BigDecimal tracecreatests) {
        regTracecreatests(CK_NES, tracecreatests);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatests The value of tracecreatests as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracecreatests_GreaterThan(java.math.BigDecimal tracecreatests) {
        regTracecreatests(CK_GT, tracecreatests);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatests The value of tracecreatests as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracecreatests_LessThan(java.math.BigDecimal tracecreatests) {
        regTracecreatests(CK_LT, tracecreatests);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatests The value of tracecreatests as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracecreatests_GreaterEqual(java.math.BigDecimal tracecreatests) {
        regTracecreatests(CK_GE, tracecreatests);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatests The value of tracecreatests as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracecreatests_LessEqual(java.math.BigDecimal tracecreatests) {
        regTracecreatests(CK_LE, tracecreatests);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of tracecreatests. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tracecreatests. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTracecreatests_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTracecreatests(), "TRACECREATESTS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatestsList The collection of tracecreatests as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracecreatests_InScope(Collection<java.math.BigDecimal> tracecreatestsList) {
        doSetTracecreatests_InScope(tracecreatestsList);
    }

    protected void doSetTracecreatests_InScope(Collection<java.math.BigDecimal> tracecreatestsList) {
        regINS(CK_INS, cTL(tracecreatestsList), xgetCValueTracecreatests(), "TRACECREATESTS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @param tracecreatestsList The collection of tracecreatests as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracecreatests_NotInScope(Collection<java.math.BigDecimal> tracecreatestsList) {
        doSetTracecreatests_NotInScope(tracecreatestsList);
    }

    protected void doSetTracecreatests_NotInScope(Collection<java.math.BigDecimal> tracecreatestsList) {
        regINS(CK_NINS, cTL(tracecreatestsList), xgetCValueTracecreatests(), "TRACECREATESTS");
    }

    protected void regTracecreatests(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracecreatests(), "TRACECREATESTS"); }
    protected abstract ConditionValue xgetCValueTracecreatests();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
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
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
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
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(java.math.BigDecimal actflg) {
        regActflg(CK_GT, actflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessThan(java.math.BigDecimal actflg) {
        regActflg(CK_LT, actflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(java.math.BigDecimal actflg) {
        regActflg(CK_GE, actflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(java.math.BigDecimal actflg) {
        regActflg(CK_LE, actflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param minNumber The min number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setActflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueActflg(), "ACTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
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
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
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
    public HpSLCFunction<TTrcaseinventoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrcaseinventoryCB.class);
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
    public HpSLCFunction<TTrcaseinventoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrcaseinventoryCB.class);
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
    public HpSLCFunction<TTrcaseinventoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrcaseinventoryCB.class);
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
    public HpSLCFunction<TTrcaseinventoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrcaseinventoryCB.class);
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
    public HpSLCFunction<TTrcaseinventoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrcaseinventoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrcaseinventoryCB&gt;() {
     *     public void query(TTrcaseinventoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrcaseinventoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrcaseinventoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseinventoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrcaseinventoryCQ sq);

    protected TTrcaseinventoryCB xcreateScalarConditionCB() {
        TTrcaseinventoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrcaseinventoryCB xcreateScalarConditionPartitionByCB() {
        TTrcaseinventoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrcaseinventoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRCASEINVENTORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrcaseinventoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrcaseinventoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrcaseinventoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRCASEINVENTORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrcaseinventoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrcaseinventoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrcaseinventoryCQ sq);

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
    protected TTrcaseinventoryCB newMyCB() {
        return new TTrcaseinventoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrcaseinventoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

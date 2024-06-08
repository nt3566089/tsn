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
 * The abstract condition-query of T_TRCASESTOCK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrcasestockCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrcasestockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRCASESTOCK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockId The value of trcasestockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockId_Equal(Long trcasestockId) {
        doSetTrcasestockId_Equal(trcasestockId);
    }

    protected void doSetTrcasestockId_Equal(Long trcasestockId) {
        regTrcasestockId(CK_EQ, trcasestockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockId The value of trcasestockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockId_NotEqual(Long trcasestockId) {
        doSetTrcasestockId_NotEqual(trcasestockId);
    }

    protected void doSetTrcasestockId_NotEqual(Long trcasestockId) {
        regTrcasestockId(CK_NES, trcasestockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockId The value of trcasestockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockId_GreaterThan(Long trcasestockId) {
        regTrcasestockId(CK_GT, trcasestockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockId The value of trcasestockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockId_LessThan(Long trcasestockId) {
        regTrcasestockId(CK_LT, trcasestockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockId The value of trcasestockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockId_GreaterEqual(Long trcasestockId) {
        regTrcasestockId(CK_GE, trcasestockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockId The value of trcasestockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockId_LessEqual(Long trcasestockId) {
        regTrcasestockId(CK_LE, trcasestockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trcasestockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trcasestockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrcasestockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrcasestockId(), "TRCASESTOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockIdList The collection of trcasestockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcasestockId_InScope(Collection<Long> trcasestockIdList) {
        doSetTrcasestockId_InScope(trcasestockIdList);
    }

    protected void doSetTrcasestockId_InScope(Collection<Long> trcasestockIdList) {
        regINS(CK_INS, cTL(trcasestockIdList), xgetCValueTrcasestockId(), "TRCASESTOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockIdList The collection of trcasestockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcasestockId_NotInScope(Collection<Long> trcasestockIdList) {
        doSetTrcasestockId_NotInScope(trcasestockIdList);
    }

    protected void doSetTrcasestockId_NotInScope(Collection<Long> trcasestockIdList) {
        regINS(CK_NINS, cTL(trcasestockIdList), xgetCValueTrcasestockId(), "TRCASESTOCK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrcasestockId_IsNull() { regTrcasestockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRCASESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrcasestockId_IsNotNull() { regTrcasestockId(CK_ISNN, DOBJ); }

    protected void regTrcasestockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrcasestockId(), "TRCASESTOCK_ID"); }
    protected abstract ConditionValue xgetCValueTrcasestockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_Equal(java.math.BigDecimal centerSymbolId) {
        doSetCenterSymbolId_Equal(centerSymbolId);
    }

    protected void doSetCenterSymbolId_Equal(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_EQ, centerSymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotEqual(java.math.BigDecimal centerSymbolId) {
        doSetCenterSymbolId_NotEqual(centerSymbolId);
    }

    protected void doSetCenterSymbolId_NotEqual(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_NES, centerSymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterThan(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_GT, centerSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessThan(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_LT, centerSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterEqual(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_GE, centerSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessEqual(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_LE, centerSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterSymbolId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolIdList The collection of centerSymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_InScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        doSetCenterSymbolId_InScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_InScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        regINS(CK_INS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {NotNull, decimal(16, 6)}
     * @param centerSymbolIdList The collection of centerSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotInScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        doSetCenterSymbolId_NotInScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_NotInScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        regINS(CK_NINS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    protected void regCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueCenterSymbolId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_Equal(String sotedunit) {
        doSetSotedunit_Equal(fRES(sotedunit));
    }

    protected void doSetSotedunit_Equal(String sotedunit) {
        regSotedunit(CK_EQ, sotedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotEqual(String sotedunit) {
        doSetSotedunit_NotEqual(fRES(sotedunit));
    }

    protected void doSetSotedunit_NotEqual(String sotedunit) {
        regSotedunit(CK_NES, sotedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterThan(String sotedunit) {
        regSotedunit(CK_GT, fRES(sotedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessThan(String sotedunit) {
        regSotedunit(CK_LT, fRES(sotedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterEqual(String sotedunit) {
        regSotedunit(CK_GE, fRES(sotedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessEqual(String sotedunit) {
        regSotedunit(CK_LE, fRES(sotedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunitList The collection of sotedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_InScope(Collection<String> sotedunitList) {
        doSetSotedunit_InScope(sotedunitList);
    }

    protected void doSetSotedunit_InScope(Collection<String> sotedunitList) {
        regINS(CK_INS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunitList The collection of sotedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotInScope(Collection<String> sotedunitList) {
        doSetSotedunit_NotInScope(sotedunitList);
    }

    protected void doSetSotedunit_NotInScope(Collection<String> sotedunitList) {
        regINS(CK_NINS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSotedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedunit The value of sotedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedunit_LikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedunit_NotLikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_PrefixSearch(String sotedunit) {
        setSotedunit_LikeSearch(sotedunit, xcLSOPPre());
    }

    protected void regSotedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedunit(), "SOTEDUNIT"); }
    protected abstract ConditionValue xgetCValueSotedunit();

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
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindex The value of assortedindex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_Equal(java.math.BigDecimal assortedindex) {
        doSetAssortedindex_Equal(assortedindex);
    }

    protected void doSetAssortedindex_Equal(java.math.BigDecimal assortedindex) {
        regAssortedindex(CK_EQ, assortedindex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindex The value of assortedindex as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_NotEqual(java.math.BigDecimal assortedindex) {
        doSetAssortedindex_NotEqual(assortedindex);
    }

    protected void doSetAssortedindex_NotEqual(java.math.BigDecimal assortedindex) {
        regAssortedindex(CK_NES, assortedindex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindex The value of assortedindex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterThan(java.math.BigDecimal assortedindex) {
        regAssortedindex(CK_GT, assortedindex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindex The value of assortedindex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_LessThan(java.math.BigDecimal assortedindex) {
        regAssortedindex(CK_LT, assortedindex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindex The value of assortedindex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterEqual(java.math.BigDecimal assortedindex) {
        regAssortedindex(CK_GE, assortedindex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindex The value of assortedindex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_LessEqual(java.math.BigDecimal assortedindex) {
        regAssortedindex(CK_LE, assortedindex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param minNumber The min number of assortedindex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortedindex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortedindex_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortedindex(), "ASSORTEDINDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindexList The collection of assortedindex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_InScope(Collection<java.math.BigDecimal> assortedindexList) {
        doSetAssortedindex_InScope(assortedindexList);
    }

    protected void doSetAssortedindex_InScope(Collection<java.math.BigDecimal> assortedindexList) {
        regINS(CK_INS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     * @param assortedindexList The collection of assortedindex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotInScope(Collection<java.math.BigDecimal> assortedindexList) {
        doSetAssortedindex_NotInScope(assortedindexList);
    }

    protected void doSetAssortedindex_NotInScope(Collection<java.math.BigDecimal> assortedindexList) {
        regINS(CK_NINS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     */
    public void setAssortedindex_IsNull() { regAssortedindex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {decimal(16, 6)}
     */
    public void setAssortedindex_IsNotNull() { regAssortedindex(CK_ISNN, DOBJ); }

    protected void regAssortedindex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedindex(), "ASSORTEDINDEX"); }
    protected abstract ConditionValue xgetCValueAssortedindex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltype The value of pulltype as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPulltype_Equal(java.math.BigDecimal pulltype) {
        doSetPulltype_Equal(pulltype);
    }

    protected void doSetPulltype_Equal(java.math.BigDecimal pulltype) {
        regPulltype(CK_EQ, pulltype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltype The value of pulltype as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPulltype_NotEqual(java.math.BigDecimal pulltype) {
        doSetPulltype_NotEqual(pulltype);
    }

    protected void doSetPulltype_NotEqual(java.math.BigDecimal pulltype) {
        regPulltype(CK_NES, pulltype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltype The value of pulltype as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPulltype_GreaterThan(java.math.BigDecimal pulltype) {
        regPulltype(CK_GT, pulltype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltype The value of pulltype as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPulltype_LessThan(java.math.BigDecimal pulltype) {
        regPulltype(CK_LT, pulltype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltype The value of pulltype as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPulltype_GreaterEqual(java.math.BigDecimal pulltype) {
        regPulltype(CK_GE, pulltype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltype The value of pulltype as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPulltype_LessEqual(java.math.BigDecimal pulltype) {
        regPulltype(CK_LE, pulltype);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pulltype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pulltype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPulltype_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePulltype(), "PULLTYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltypeList The collection of pulltype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPulltype_InScope(Collection<java.math.BigDecimal> pulltypeList) {
        doSetPulltype_InScope(pulltypeList);
    }

    protected void doSetPulltype_InScope(Collection<java.math.BigDecimal> pulltypeList) {
        regINS(CK_INS, cTL(pulltypeList), xgetCValuePulltype(), "PULLTYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PULLTYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pulltypeList The collection of pulltype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPulltype_NotInScope(Collection<java.math.BigDecimal> pulltypeList) {
        doSetPulltype_NotInScope(pulltypeList);
    }

    protected void doSetPulltype_NotInScope(Collection<java.math.BigDecimal> pulltypeList) {
        regINS(CK_NINS, cTL(pulltypeList), xgetCValuePulltype(), "PULLTYPE");
    }

    protected void regPulltype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePulltype(), "PULLTYPE"); }
    protected abstract ConditionValue xgetCValuePulltype();

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
    public HpSLCFunction<TTrcasestockCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrcasestockCB.class);
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
    public HpSLCFunction<TTrcasestockCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrcasestockCB.class);
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
    public HpSLCFunction<TTrcasestockCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrcasestockCB.class);
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
    public HpSLCFunction<TTrcasestockCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrcasestockCB.class);
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
    public HpSLCFunction<TTrcasestockCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrcasestockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrcasestockCB&gt;() {
     *     public void query(TTrcasestockCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrcasestockCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrcasestockCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrcasestockCQ sq);

    protected TTrcasestockCB xcreateScalarConditionCB() {
        TTrcasestockCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrcasestockCB xcreateScalarConditionPartitionByCB() {
        TTrcasestockCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrcasestockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRCASESTOCK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrcasestockCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrcasestockCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrcasestockCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRCASESTOCK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrcasestockCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrcasestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrcasestockCQ sq);

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
    protected TTrcasestockCB newMyCB() {
        return new TTrcasestockCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrcasestockCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

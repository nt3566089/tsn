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
 * The abstract condition-query of P_PRINT_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrintServiceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrintServiceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINT_SERVICE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceId The value of printServiceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceId_Equal(Long printServiceId) {
        doSetPrintServiceId_Equal(printServiceId);
    }

    protected void doSetPrintServiceId_Equal(Long printServiceId) {
        regPrintServiceId(CK_EQ, printServiceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceId The value of printServiceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceId_NotEqual(Long printServiceId) {
        doSetPrintServiceId_NotEqual(printServiceId);
    }

    protected void doSetPrintServiceId_NotEqual(Long printServiceId) {
        regPrintServiceId(CK_NES, printServiceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceId The value of printServiceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceId_GreaterThan(Long printServiceId) {
        regPrintServiceId(CK_GT, printServiceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceId The value of printServiceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceId_LessThan(Long printServiceId) {
        regPrintServiceId(CK_LT, printServiceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceId The value of printServiceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceId_GreaterEqual(Long printServiceId) {
        regPrintServiceId(CK_GE, printServiceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceId The value of printServiceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceId_LessEqual(Long printServiceId) {
        regPrintServiceId(CK_LE, printServiceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printServiceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printServiceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintServiceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintServiceId(), "PRINT_SERVICE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceIdList The collection of printServiceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceId_InScope(Collection<Long> printServiceIdList) {
        doSetPrintServiceId_InScope(printServiceIdList);
    }

    protected void doSetPrintServiceId_InScope(Collection<Long> printServiceIdList) {
        regINS(CK_INS, cTL(printServiceIdList), xgetCValuePrintServiceId(), "PRINT_SERVICE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printServiceIdList The collection of printServiceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceId_NotInScope(Collection<Long> printServiceIdList) {
        doSetPrintServiceId_NotInScope(printServiceIdList);
    }

    protected void doSetPrintServiceId_NotInScope(Collection<Long> printServiceIdList) {
        regINS(CK_NINS, cTL(printServiceIdList), xgetCValuePrintServiceId(), "PRINT_SERVICE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintServiceId_IsNull() { regPrintServiceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintServiceId_IsNotNull() { regPrintServiceId(CK_ISNN, DOBJ); }

    protected void regPrintServiceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintServiceId(), "PRINT_SERVICE_ID"); }
    protected abstract ConditionValue xgetCValuePrintServiceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_Equal(String printServiceNm) {
        doSetPrintServiceNm_Equal(fRES(printServiceNm));
    }

    protected void doSetPrintServiceNm_Equal(String printServiceNm) {
        regPrintServiceNm(CK_EQ, printServiceNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_NotEqual(String printServiceNm) {
        doSetPrintServiceNm_NotEqual(fRES(printServiceNm));
    }

    protected void doSetPrintServiceNm_NotEqual(String printServiceNm) {
        regPrintServiceNm(CK_NES, printServiceNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_GreaterThan(String printServiceNm) {
        regPrintServiceNm(CK_GT, fRES(printServiceNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_LessThan(String printServiceNm) {
        regPrintServiceNm(CK_LT, fRES(printServiceNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_GreaterEqual(String printServiceNm) {
        regPrintServiceNm(CK_GE, fRES(printServiceNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_LessEqual(String printServiceNm) {
        regPrintServiceNm(CK_LE, fRES(printServiceNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNmList The collection of printServiceNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_InScope(Collection<String> printServiceNmList) {
        doSetPrintServiceNm_InScope(printServiceNmList);
    }

    protected void doSetPrintServiceNm_InScope(Collection<String> printServiceNmList) {
        regINS(CK_INS, cTL(printServiceNmList), xgetCValuePrintServiceNm(), "PRINT_SERVICE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNmList The collection of printServiceNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_NotInScope(Collection<String> printServiceNmList) {
        doSetPrintServiceNm_NotInScope(printServiceNmList);
    }

    protected void doSetPrintServiceNm_NotInScope(Collection<String> printServiceNmList) {
        regINS(CK_NINS, cTL(printServiceNmList), xgetCValuePrintServiceNm(), "PRINT_SERVICE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setPrintServiceNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printServiceNm The value of printServiceNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintServiceNm_LikeSearch(String printServiceNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printServiceNm), xgetCValuePrintServiceNm(), "PRINT_SERVICE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintServiceNm_NotLikeSearch(String printServiceNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printServiceNm), xgetCValuePrintServiceNm(), "PRINT_SERVICE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @param printServiceNm The value of printServiceNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceNm_PrefixSearch(String printServiceNm) {
        setPrintServiceNm_LikeSearch(printServiceNm, xcLSOPPre());
    }

    protected void regPrintServiceNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintServiceNm(), "PRINT_SERVICE_NM"); }
    protected abstract ConditionValue xgetCValuePrintServiceNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_Equal(String terminalNm) {
        doSetTerminalNm_Equal(fRES(terminalNm));
    }

    protected void doSetTerminalNm_Equal(String terminalNm) {
        regTerminalNm(CK_EQ, terminalNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_NotEqual(String terminalNm) {
        doSetTerminalNm_NotEqual(fRES(terminalNm));
    }

    protected void doSetTerminalNm_NotEqual(String terminalNm) {
        regTerminalNm(CK_NES, terminalNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_GreaterThan(String terminalNm) {
        regTerminalNm(CK_GT, fRES(terminalNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_LessThan(String terminalNm) {
        regTerminalNm(CK_LT, fRES(terminalNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_GreaterEqual(String terminalNm) {
        regTerminalNm(CK_GE, fRES(terminalNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_LessEqual(String terminalNm) {
        regTerminalNm(CK_LE, fRES(terminalNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNmList The collection of terminalNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_InScope(Collection<String> terminalNmList) {
        doSetTerminalNm_InScope(terminalNmList);
    }

    protected void doSetTerminalNm_InScope(Collection<String> terminalNmList) {
        regINS(CK_INS, cTL(terminalNmList), xgetCValueTerminalNm(), "TERMINAL_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNmList The collection of terminalNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_NotInScope(Collection<String> terminalNmList) {
        doSetTerminalNm_NotInScope(terminalNmList);
    }

    protected void doSetTerminalNm_NotInScope(Collection<String> terminalNmList) {
        regINS(CK_NINS, cTL(terminalNmList), xgetCValueTerminalNm(), "TERMINAL_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setTerminalNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param terminalNm The value of terminalNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerminalNm_LikeSearch(String terminalNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(terminalNm), xgetCValueTerminalNm(), "TERMINAL_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTerminalNm_NotLikeSearch(String terminalNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(terminalNm), xgetCValueTerminalNm(), "TERMINAL_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @param terminalNm The value of terminalNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_PrefixSearch(String terminalNm) {
        setTerminalNm_LikeSearch(terminalNm, xcLSOPPre());
    }

    protected void regTerminalNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalNm(), "TERMINAL_NM"); }
    protected abstract ConditionValue xgetCValueTerminalNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_Equal(String macAddress) {
        doSetMacAddress_Equal(fRES(macAddress));
    }

    protected void doSetMacAddress_Equal(String macAddress) {
        regMacAddress(CK_EQ, macAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_NotEqual(String macAddress) {
        doSetMacAddress_NotEqual(fRES(macAddress));
    }

    protected void doSetMacAddress_NotEqual(String macAddress) {
        regMacAddress(CK_NES, macAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_GreaterThan(String macAddress) {
        regMacAddress(CK_GT, fRES(macAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_LessThan(String macAddress) {
        regMacAddress(CK_LT, fRES(macAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_GreaterEqual(String macAddress) {
        regMacAddress(CK_GE, fRES(macAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_LessEqual(String macAddress) {
        regMacAddress(CK_LE, fRES(macAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddressList The collection of macAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_InScope(Collection<String> macAddressList) {
        doSetMacAddress_InScope(macAddressList);
    }

    protected void doSetMacAddress_InScope(Collection<String> macAddressList) {
        regINS(CK_INS, cTL(macAddressList), xgetCValueMacAddress(), "MAC_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddressList The collection of macAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_NotInScope(Collection<String> macAddressList) {
        doSetMacAddress_NotInScope(macAddressList);
    }

    protected void doSetMacAddress_NotInScope(Collection<String> macAddressList) {
        regINS(CK_NINS, cTL(macAddressList), xgetCValueMacAddress(), "MAC_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setMacAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param macAddress The value of macAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMacAddress_LikeSearch(String macAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(macAddress), xgetCValueMacAddress(), "MAC_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMacAddress_NotLikeSearch(String macAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(macAddress), xgetCValueMacAddress(), "MAC_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_PrefixSearch(String macAddress) {
        setMacAddress_LikeSearch(macAddress, xcLSOPPre());
    }

    protected void regMacAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMacAddress(), "MAC_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMacAddress();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_Equal(Long printerGroupId) {
        doSetPrinterGroupId_Equal(printerGroupId);
    }

    protected void doSetPrinterGroupId_Equal(Long printerGroupId) {
        regPrinterGroupId(CK_EQ, printerGroupId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotEqual(Long printerGroupId) {
        doSetPrinterGroupId_NotEqual(printerGroupId);
    }

    protected void doSetPrinterGroupId_NotEqual(Long printerGroupId) {
        regPrinterGroupId(CK_NES, printerGroupId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterThan(Long printerGroupId) {
        regPrinterGroupId(CK_GT, printerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessThan(Long printerGroupId) {
        regPrinterGroupId(CK_LT, printerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterEqual(Long printerGroupId) {
        regPrinterGroupId(CK_GE, printerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessEqual(Long printerGroupId) {
        regPrinterGroupId(CK_LE, printerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param minNumber The min number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupIdList The collection of printerGroupId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_InScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_InScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_InScope(Collection<Long> printerGroupIdList) {
        regINS(CK_INS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupIdList The collection of printerGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_NotInScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        regINS(CK_NINS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     */
    public void setPrinterGroupId_IsNull() { regPrinterGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     */
    public void setPrinterGroupId_IsNotNull() { regPrinterGroupId(CK_ISNN, DOBJ); }

    protected void regPrinterGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID"); }
    protected abstract ConditionValue xgetCValuePrinterGroupId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus}
     * @param printServiceStatus The value of printServiceStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_Equal(String printServiceStatus) {
        doSetPrintServiceStatus_Equal(fRES(printServiceStatus));
    }

    /**
     * Equal(=). As PrintServiceStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_Equal_AsPrintServiceStatus(CDef.PrintServiceStatus cdef) {
        doSetPrintServiceStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: サービス中
     */
    public void setPrintServiceStatus_Equal_$0() {
        setPrintServiceStatus_Equal_AsPrintServiceStatus(CDef.PrintServiceStatus.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: サービス停止中
     */
    public void setPrintServiceStatus_Equal_$1() {
        setPrintServiceStatus_Equal_AsPrintServiceStatus(CDef.PrintServiceStatus.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: シャットダウン中
     */
    public void setPrintServiceStatus_Equal_$2() {
        setPrintServiceStatus_Equal_AsPrintServiceStatus(CDef.PrintServiceStatus.$2);
    }

    protected void doSetPrintServiceStatus_Equal(String printServiceStatus) {
        regPrintServiceStatus(CK_EQ, printServiceStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus}
     * @param printServiceStatus The value of printServiceStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_NotEqual(String printServiceStatus) {
        doSetPrintServiceStatus_NotEqual(fRES(printServiceStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As PrintServiceStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_NotEqual_AsPrintServiceStatus(CDef.PrintServiceStatus cdef) {
        doSetPrintServiceStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: サービス中
     */
    public void setPrintServiceStatus_NotEqual_$0() {
        setPrintServiceStatus_NotEqual_AsPrintServiceStatus(CDef.PrintServiceStatus.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: サービス停止中
     */
    public void setPrintServiceStatus_NotEqual_$1() {
        setPrintServiceStatus_NotEqual_AsPrintServiceStatus(CDef.PrintServiceStatus.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: シャットダウン中
     */
    public void setPrintServiceStatus_NotEqual_$2() {
        setPrintServiceStatus_NotEqual_AsPrintServiceStatus(CDef.PrintServiceStatus.$2);
    }

    protected void doSetPrintServiceStatus_NotEqual(String printServiceStatus) {
        regPrintServiceStatus(CK_NES, printServiceStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus}
     * @param printServiceStatusList The collection of printServiceStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_InScope(Collection<String> printServiceStatusList) {
        doSetPrintServiceStatus_InScope(printServiceStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As PrintServiceStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_InScope_AsPrintServiceStatus(Collection<CDef.PrintServiceStatus> cdefList) {
        doSetPrintServiceStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetPrintServiceStatus_InScope(Collection<String> printServiceStatusList) {
        regINS(CK_INS, cTL(printServiceStatusList), xgetCValuePrintServiceStatus(), "PRINT_SERVICE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus}
     * @param printServiceStatusList The collection of printServiceStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_NotInScope(Collection<String> printServiceStatusList) {
        doSetPrintServiceStatus_NotInScope(printServiceStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PrintServiceStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintServiceStatus_NotInScope_AsPrintServiceStatus(Collection<CDef.PrintServiceStatus> cdefList) {
        doSetPrintServiceStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPrintServiceStatus_NotInScope(Collection<String> printServiceStatusList) {
        regINS(CK_NINS, cTL(printServiceStatusList), xgetCValuePrintServiceStatus(), "PRINT_SERVICE_STATUS");
    }

    protected void regPrintServiceStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintServiceStatus(), "PRINT_SERVICE_STATUS"); }
    protected abstract ConditionValue xgetCValuePrintServiceStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * @param startDt The value of startDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartDt_Equal(java.sql.Timestamp startDt) {
        regStartDt(CK_EQ,  startDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * @param startDt The value of startDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartDt_GreaterThan(java.sql.Timestamp startDt) {
        regStartDt(CK_GT,  startDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * @param startDt The value of startDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartDt_LessThan(java.sql.Timestamp startDt) {
        regStartDt(CK_LT,  startDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * @param startDt The value of startDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartDt_GreaterEqual(java.sql.Timestamp startDt) {
        regStartDt(CK_GE,  startDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * @param startDt The value of startDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartDt_LessEqual(java.sql.Timestamp startDt) {
        regStartDt(CK_LE, startDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * <pre>e.g. setStartDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStartDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueStartDt(), "START_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of startDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of startDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setStartDt_DateFromTo(Date fromDate, Date toDate) {
        setStartDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     */
    public void setStartDt_IsNull() { regStartDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * START_DT: {datetime2(26, 6)}
     */
    public void setStartDt_IsNotNull() { regStartDt(CK_ISNN, DOBJ); }

    protected void regStartDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartDt(), "START_DT"); }
    protected abstract ConditionValue xgetCValueStartDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * @param endDt The value of endDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDt_Equal(java.sql.Timestamp endDt) {
        regEndDt(CK_EQ,  endDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * @param endDt The value of endDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDt_GreaterThan(java.sql.Timestamp endDt) {
        regEndDt(CK_GT,  endDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * @param endDt The value of endDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDt_LessThan(java.sql.Timestamp endDt) {
        regEndDt(CK_LT,  endDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * @param endDt The value of endDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDt_GreaterEqual(java.sql.Timestamp endDt) {
        regEndDt(CK_GE,  endDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * @param endDt The value of endDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDt_LessEqual(java.sql.Timestamp endDt) {
        regEndDt(CK_LE, endDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * <pre>e.g. setEndDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setEndDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueEndDt(), "END_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of endDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of endDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setEndDt_DateFromTo(Date fromDate, Date toDate) {
        setEndDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     */
    public void setEndDt_IsNull() { regEndDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * END_DT: {datetime2(26, 6)}
     */
    public void setEndDt_IsNotNull() { regEndDt(CK_ISNN, DOBJ); }

    protected void regEndDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndDt(), "END_DT"); }
    protected abstract ConditionValue xgetCValueEndDt();

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
    public HpSLCFunction<PPrintServiceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrintServiceCB.class);
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
    public HpSLCFunction<PPrintServiceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrintServiceCB.class);
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
    public HpSLCFunction<PPrintServiceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrintServiceCB.class);
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
    public HpSLCFunction<PPrintServiceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrintServiceCB.class);
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
    public HpSLCFunction<PPrintServiceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrintServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrintServiceCB&gt;() {
     *     public void query(PPrintServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrintServiceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrintServiceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintServiceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrintServiceCQ sq);

    protected PPrintServiceCB xcreateScalarConditionCB() {
        PPrintServiceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrintServiceCB xcreateScalarConditionPartitionByCB() {
        PPrintServiceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrintServiceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintServiceCB cb = new PPrintServiceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINT_SERVICE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrintServiceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrintServiceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrintServiceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintServiceCB cb = new PPrintServiceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINT_SERVICE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrintServiceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrintServiceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintServiceCB cb = new PPrintServiceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrintServiceCQ sq);

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
    protected PPrintServiceCB newMyCB() {
        return new PPrintServiceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrintServiceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

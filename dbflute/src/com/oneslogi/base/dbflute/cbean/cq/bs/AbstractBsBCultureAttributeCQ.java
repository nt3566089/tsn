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
 * The abstract condition-query of B_CULTURE_ATTRIBUTE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBCultureAttributeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBCultureAttributeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_CULTURE_ATTRIBUTE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_Equal(Long cultureId) {
        doSetCultureId_Equal(cultureId);
    }

    protected void doSetCultureId_Equal(Long cultureId) {
        regCultureId(CK_EQ, cultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_NotEqual(Long cultureId) {
        doSetCultureId_NotEqual(cultureId);
    }

    protected void doSetCultureId_NotEqual(Long cultureId) {
        regCultureId(CK_NES, cultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureIdList The collection of cultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_InScope(Collection<Long> cultureIdList) {
        doSetCultureId_InScope(cultureIdList);
    }

    protected void doSetCultureId_InScope(Collection<Long> cultureIdList) {
        regINS(CK_INS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @param cultureIdList The collection of cultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_NotInScope(Collection<Long> cultureIdList) {
        doSetCultureId_NotInScope(cultureIdList);
    }

    protected void doSetCultureId_NotInScope(Collection<Long> cultureIdList) {
        regINS(CK_NINS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'in-scope'. (NotNull)
     */
    public void inScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_InScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", false);
    }
    public abstract String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'not in-scope'. (NotNull)
     */
    public void notInScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_NotInScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", true);
    }
    public abstract String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     */
    public void setCultureId_IsNull() { regCultureId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     */
    public void setCultureId_IsNotNull() { regCultureId(CK_ISNN, DOBJ); }

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_Equal(String dateTimeFormatDisplay) {
        doSetDateTimeFormatDisplay_Equal(fRES(dateTimeFormatDisplay));
    }

    protected void doSetDateTimeFormatDisplay_Equal(String dateTimeFormatDisplay) {
        regDateTimeFormatDisplay(CK_EQ, dateTimeFormatDisplay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_NotEqual(String dateTimeFormatDisplay) {
        doSetDateTimeFormatDisplay_NotEqual(fRES(dateTimeFormatDisplay));
    }

    protected void doSetDateTimeFormatDisplay_NotEqual(String dateTimeFormatDisplay) {
        regDateTimeFormatDisplay(CK_NES, dateTimeFormatDisplay);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_GreaterThan(String dateTimeFormatDisplay) {
        regDateTimeFormatDisplay(CK_GT, fRES(dateTimeFormatDisplay));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_LessThan(String dateTimeFormatDisplay) {
        regDateTimeFormatDisplay(CK_LT, fRES(dateTimeFormatDisplay));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_GreaterEqual(String dateTimeFormatDisplay) {
        regDateTimeFormatDisplay(CK_GE, fRES(dateTimeFormatDisplay));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_LessEqual(String dateTimeFormatDisplay) {
        regDateTimeFormatDisplay(CK_LE, fRES(dateTimeFormatDisplay));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplayList The collection of dateTimeFormatDisplay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_InScope(Collection<String> dateTimeFormatDisplayList) {
        doSetDateTimeFormatDisplay_InScope(dateTimeFormatDisplayList);
    }

    protected void doSetDateTimeFormatDisplay_InScope(Collection<String> dateTimeFormatDisplayList) {
        regINS(CK_INS, cTL(dateTimeFormatDisplayList), xgetCValueDateTimeFormatDisplay(), "DATE_TIME_FORMAT_DISPLAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplayList The collection of dateTimeFormatDisplay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_NotInScope(Collection<String> dateTimeFormatDisplayList) {
        doSetDateTimeFormatDisplay_NotInScope(dateTimeFormatDisplayList);
    }

    protected void doSetDateTimeFormatDisplay_NotInScope(Collection<String> dateTimeFormatDisplayList) {
        regINS(CK_NINS, cTL(dateTimeFormatDisplayList), xgetCValueDateTimeFormatDisplay(), "DATE_TIME_FORMAT_DISPLAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * <pre>e.g. setDateTimeFormatDisplay_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateTimeFormatDisplay_LikeSearch(String dateTimeFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTimeFormatDisplay), xgetCValueDateTimeFormatDisplay(), "DATE_TIME_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateTimeFormatDisplay_NotLikeSearch(String dateTimeFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTimeFormatDisplay), xgetCValueDateTimeFormatDisplay(), "DATE_TIME_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param dateTimeFormatDisplay The value of dateTimeFormatDisplay as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatDisplay_PrefixSearch(String dateTimeFormatDisplay) {
        setDateTimeFormatDisplay_LikeSearch(dateTimeFormatDisplay, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setDateTimeFormatDisplay_IsNull() { regDateTimeFormatDisplay(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setDateTimeFormatDisplay_IsNullOrEmpty() { regDateTimeFormatDisplay(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setDateTimeFormatDisplay_IsNotNull() { regDateTimeFormatDisplay(CK_ISNN, DOBJ); }

    protected void regDateTimeFormatDisplay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTimeFormatDisplay(), "DATE_TIME_FORMAT_DISPLAY"); }
    protected abstract ConditionValue xgetCValueDateTimeFormatDisplay();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_Equal(String dateTimeFormatReport) {
        doSetDateTimeFormatReport_Equal(fRES(dateTimeFormatReport));
    }

    protected void doSetDateTimeFormatReport_Equal(String dateTimeFormatReport) {
        regDateTimeFormatReport(CK_EQ, dateTimeFormatReport);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_NotEqual(String dateTimeFormatReport) {
        doSetDateTimeFormatReport_NotEqual(fRES(dateTimeFormatReport));
    }

    protected void doSetDateTimeFormatReport_NotEqual(String dateTimeFormatReport) {
        regDateTimeFormatReport(CK_NES, dateTimeFormatReport);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_GreaterThan(String dateTimeFormatReport) {
        regDateTimeFormatReport(CK_GT, fRES(dateTimeFormatReport));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_LessThan(String dateTimeFormatReport) {
        regDateTimeFormatReport(CK_LT, fRES(dateTimeFormatReport));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_GreaterEqual(String dateTimeFormatReport) {
        regDateTimeFormatReport(CK_GE, fRES(dateTimeFormatReport));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_LessEqual(String dateTimeFormatReport) {
        regDateTimeFormatReport(CK_LE, fRES(dateTimeFormatReport));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReportList The collection of dateTimeFormatReport as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_InScope(Collection<String> dateTimeFormatReportList) {
        doSetDateTimeFormatReport_InScope(dateTimeFormatReportList);
    }

    protected void doSetDateTimeFormatReport_InScope(Collection<String> dateTimeFormatReportList) {
        regINS(CK_INS, cTL(dateTimeFormatReportList), xgetCValueDateTimeFormatReport(), "DATE_TIME_FORMAT_REPORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReportList The collection of dateTimeFormatReport as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_NotInScope(Collection<String> dateTimeFormatReportList) {
        doSetDateTimeFormatReport_NotInScope(dateTimeFormatReportList);
    }

    protected void doSetDateTimeFormatReport_NotInScope(Collection<String> dateTimeFormatReportList) {
        regINS(CK_NINS, cTL(dateTimeFormatReportList), xgetCValueDateTimeFormatReport(), "DATE_TIME_FORMAT_REPORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)} <br>
     * <pre>e.g. setDateTimeFormatReport_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTimeFormatReport The value of dateTimeFormatReport as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateTimeFormatReport_LikeSearch(String dateTimeFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTimeFormatReport), xgetCValueDateTimeFormatReport(), "DATE_TIME_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateTimeFormatReport_NotLikeSearch(String dateTimeFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTimeFormatReport), xgetCValueDateTimeFormatReport(), "DATE_TIME_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @param dateTimeFormatReport The value of dateTimeFormatReport as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatReport_PrefixSearch(String dateTimeFormatReport) {
        setDateTimeFormatReport_LikeSearch(dateTimeFormatReport, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     */
    public void setDateTimeFormatReport_IsNull() { regDateTimeFormatReport(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     */
    public void setDateTimeFormatReport_IsNullOrEmpty() { regDateTimeFormatReport(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     */
    public void setDateTimeFormatReport_IsNotNull() { regDateTimeFormatReport(CK_ISNN, DOBJ); }

    protected void regDateTimeFormatReport(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTimeFormatReport(), "DATE_TIME_FORMAT_REPORT"); }
    protected abstract ConditionValue xgetCValueDateTimeFormatReport();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_Equal(String dateTimeFormatExcel) {
        doSetDateTimeFormatExcel_Equal(fRES(dateTimeFormatExcel));
    }

    protected void doSetDateTimeFormatExcel_Equal(String dateTimeFormatExcel) {
        regDateTimeFormatExcel(CK_EQ, dateTimeFormatExcel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_NotEqual(String dateTimeFormatExcel) {
        doSetDateTimeFormatExcel_NotEqual(fRES(dateTimeFormatExcel));
    }

    protected void doSetDateTimeFormatExcel_NotEqual(String dateTimeFormatExcel) {
        regDateTimeFormatExcel(CK_NES, dateTimeFormatExcel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_GreaterThan(String dateTimeFormatExcel) {
        regDateTimeFormatExcel(CK_GT, fRES(dateTimeFormatExcel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_LessThan(String dateTimeFormatExcel) {
        regDateTimeFormatExcel(CK_LT, fRES(dateTimeFormatExcel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_GreaterEqual(String dateTimeFormatExcel) {
        regDateTimeFormatExcel(CK_GE, fRES(dateTimeFormatExcel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_LessEqual(String dateTimeFormatExcel) {
        regDateTimeFormatExcel(CK_LE, fRES(dateTimeFormatExcel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcelList The collection of dateTimeFormatExcel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_InScope(Collection<String> dateTimeFormatExcelList) {
        doSetDateTimeFormatExcel_InScope(dateTimeFormatExcelList);
    }

    protected void doSetDateTimeFormatExcel_InScope(Collection<String> dateTimeFormatExcelList) {
        regINS(CK_INS, cTL(dateTimeFormatExcelList), xgetCValueDateTimeFormatExcel(), "DATE_TIME_FORMAT_EXCEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcelList The collection of dateTimeFormatExcel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_NotInScope(Collection<String> dateTimeFormatExcelList) {
        doSetDateTimeFormatExcel_NotInScope(dateTimeFormatExcelList);
    }

    protected void doSetDateTimeFormatExcel_NotInScope(Collection<String> dateTimeFormatExcelList) {
        regINS(CK_NINS, cTL(dateTimeFormatExcelList), xgetCValueDateTimeFormatExcel(), "DATE_TIME_FORMAT_EXCEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * <pre>e.g. setDateTimeFormatExcel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateTimeFormatExcel_LikeSearch(String dateTimeFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTimeFormatExcel), xgetCValueDateTimeFormatExcel(), "DATE_TIME_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateTimeFormatExcel_NotLikeSearch(String dateTimeFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTimeFormatExcel), xgetCValueDateTimeFormatExcel(), "DATE_TIME_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @param dateTimeFormatExcel The value of dateTimeFormatExcel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatExcel_PrefixSearch(String dateTimeFormatExcel) {
        setDateTimeFormatExcel_LikeSearch(dateTimeFormatExcel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     */
    public void setDateTimeFormatExcel_IsNull() { regDateTimeFormatExcel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     */
    public void setDateTimeFormatExcel_IsNullOrEmpty() { regDateTimeFormatExcel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     */
    public void setDateTimeFormatExcel_IsNotNull() { regDateTimeFormatExcel(CK_ISNN, DOBJ); }

    protected void regDateTimeFormatExcel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTimeFormatExcel(), "DATE_TIME_FORMAT_EXCEL"); }
    protected abstract ConditionValue xgetCValueDateTimeFormatExcel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_Equal(String dateTimeFormatText) {
        doSetDateTimeFormatText_Equal(fRES(dateTimeFormatText));
    }

    protected void doSetDateTimeFormatText_Equal(String dateTimeFormatText) {
        regDateTimeFormatText(CK_EQ, dateTimeFormatText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_NotEqual(String dateTimeFormatText) {
        doSetDateTimeFormatText_NotEqual(fRES(dateTimeFormatText));
    }

    protected void doSetDateTimeFormatText_NotEqual(String dateTimeFormatText) {
        regDateTimeFormatText(CK_NES, dateTimeFormatText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_GreaterThan(String dateTimeFormatText) {
        regDateTimeFormatText(CK_GT, fRES(dateTimeFormatText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_LessThan(String dateTimeFormatText) {
        regDateTimeFormatText(CK_LT, fRES(dateTimeFormatText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_GreaterEqual(String dateTimeFormatText) {
        regDateTimeFormatText(CK_GE, fRES(dateTimeFormatText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_LessEqual(String dateTimeFormatText) {
        regDateTimeFormatText(CK_LE, fRES(dateTimeFormatText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatTextList The collection of dateTimeFormatText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_InScope(Collection<String> dateTimeFormatTextList) {
        doSetDateTimeFormatText_InScope(dateTimeFormatTextList);
    }

    protected void doSetDateTimeFormatText_InScope(Collection<String> dateTimeFormatTextList) {
        regINS(CK_INS, cTL(dateTimeFormatTextList), xgetCValueDateTimeFormatText(), "DATE_TIME_FORMAT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatTextList The collection of dateTimeFormatText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_NotInScope(Collection<String> dateTimeFormatTextList) {
        doSetDateTimeFormatText_NotInScope(dateTimeFormatTextList);
    }

    protected void doSetDateTimeFormatText_NotInScope(Collection<String> dateTimeFormatTextList) {
        regINS(CK_NINS, cTL(dateTimeFormatTextList), xgetCValueDateTimeFormatText(), "DATE_TIME_FORMAT_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)} <br>
     * <pre>e.g. setDateTimeFormatText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTimeFormatText The value of dateTimeFormatText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateTimeFormatText_LikeSearch(String dateTimeFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTimeFormatText), xgetCValueDateTimeFormatText(), "DATE_TIME_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateTimeFormatText_NotLikeSearch(String dateTimeFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTimeFormatText), xgetCValueDateTimeFormatText(), "DATE_TIME_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @param dateTimeFormatText The value of dateTimeFormatText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormatText_PrefixSearch(String dateTimeFormatText) {
        setDateTimeFormatText_LikeSearch(dateTimeFormatText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     */
    public void setDateTimeFormatText_IsNull() { regDateTimeFormatText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     */
    public void setDateTimeFormatText_IsNullOrEmpty() { regDateTimeFormatText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     */
    public void setDateTimeFormatText_IsNotNull() { regDateTimeFormatText(CK_ISNN, DOBJ); }

    protected void regDateTimeFormatText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTimeFormatText(), "DATE_TIME_FORMAT_TEXT"); }
    protected abstract ConditionValue xgetCValueDateTimeFormatText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_Equal(String dateFormatDisplay) {
        doSetDateFormatDisplay_Equal(fRES(dateFormatDisplay));
    }

    protected void doSetDateFormatDisplay_Equal(String dateFormatDisplay) {
        regDateFormatDisplay(CK_EQ, dateFormatDisplay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_NotEqual(String dateFormatDisplay) {
        doSetDateFormatDisplay_NotEqual(fRES(dateFormatDisplay));
    }

    protected void doSetDateFormatDisplay_NotEqual(String dateFormatDisplay) {
        regDateFormatDisplay(CK_NES, dateFormatDisplay);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_GreaterThan(String dateFormatDisplay) {
        regDateFormatDisplay(CK_GT, fRES(dateFormatDisplay));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_LessThan(String dateFormatDisplay) {
        regDateFormatDisplay(CK_LT, fRES(dateFormatDisplay));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_GreaterEqual(String dateFormatDisplay) {
        regDateFormatDisplay(CK_GE, fRES(dateFormatDisplay));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_LessEqual(String dateFormatDisplay) {
        regDateFormatDisplay(CK_LE, fRES(dateFormatDisplay));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplayList The collection of dateFormatDisplay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_InScope(Collection<String> dateFormatDisplayList) {
        doSetDateFormatDisplay_InScope(dateFormatDisplayList);
    }

    protected void doSetDateFormatDisplay_InScope(Collection<String> dateFormatDisplayList) {
        regINS(CK_INS, cTL(dateFormatDisplayList), xgetCValueDateFormatDisplay(), "DATE_FORMAT_DISPLAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplayList The collection of dateFormatDisplay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_NotInScope(Collection<String> dateFormatDisplayList) {
        doSetDateFormatDisplay_NotInScope(dateFormatDisplayList);
    }

    protected void doSetDateFormatDisplay_NotInScope(Collection<String> dateFormatDisplayList) {
        regINS(CK_NINS, cTL(dateFormatDisplayList), xgetCValueDateFormatDisplay(), "DATE_FORMAT_DISPLAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)} <br>
     * <pre>e.g. setDateFormatDisplay_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateFormatDisplay The value of dateFormatDisplay as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateFormatDisplay_LikeSearch(String dateFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateFormatDisplay), xgetCValueDateFormatDisplay(), "DATE_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateFormatDisplay_NotLikeSearch(String dateFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateFormatDisplay), xgetCValueDateFormatDisplay(), "DATE_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @param dateFormatDisplay The value of dateFormatDisplay as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatDisplay_PrefixSearch(String dateFormatDisplay) {
        setDateFormatDisplay_LikeSearch(dateFormatDisplay, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setDateFormatDisplay_IsNull() { regDateFormatDisplay(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setDateFormatDisplay_IsNullOrEmpty() { regDateFormatDisplay(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setDateFormatDisplay_IsNotNull() { regDateFormatDisplay(CK_ISNN, DOBJ); }

    protected void regDateFormatDisplay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateFormatDisplay(), "DATE_FORMAT_DISPLAY"); }
    protected abstract ConditionValue xgetCValueDateFormatDisplay();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_Equal(String dateFormatReport) {
        doSetDateFormatReport_Equal(fRES(dateFormatReport));
    }

    protected void doSetDateFormatReport_Equal(String dateFormatReport) {
        regDateFormatReport(CK_EQ, dateFormatReport);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_NotEqual(String dateFormatReport) {
        doSetDateFormatReport_NotEqual(fRES(dateFormatReport));
    }

    protected void doSetDateFormatReport_NotEqual(String dateFormatReport) {
        regDateFormatReport(CK_NES, dateFormatReport);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_GreaterThan(String dateFormatReport) {
        regDateFormatReport(CK_GT, fRES(dateFormatReport));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_LessThan(String dateFormatReport) {
        regDateFormatReport(CK_LT, fRES(dateFormatReport));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_GreaterEqual(String dateFormatReport) {
        regDateFormatReport(CK_GE, fRES(dateFormatReport));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_LessEqual(String dateFormatReport) {
        regDateFormatReport(CK_LE, fRES(dateFormatReport));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReportList The collection of dateFormatReport as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_InScope(Collection<String> dateFormatReportList) {
        doSetDateFormatReport_InScope(dateFormatReportList);
    }

    protected void doSetDateFormatReport_InScope(Collection<String> dateFormatReportList) {
        regINS(CK_INS, cTL(dateFormatReportList), xgetCValueDateFormatReport(), "DATE_FORMAT_REPORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReportList The collection of dateFormatReport as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_NotInScope(Collection<String> dateFormatReportList) {
        doSetDateFormatReport_NotInScope(dateFormatReportList);
    }

    protected void doSetDateFormatReport_NotInScope(Collection<String> dateFormatReportList) {
        regINS(CK_NINS, cTL(dateFormatReportList), xgetCValueDateFormatReport(), "DATE_FORMAT_REPORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)} <br>
     * <pre>e.g. setDateFormatReport_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateFormatReport The value of dateFormatReport as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateFormatReport_LikeSearch(String dateFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateFormatReport), xgetCValueDateFormatReport(), "DATE_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateFormatReport_NotLikeSearch(String dateFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateFormatReport), xgetCValueDateFormatReport(), "DATE_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @param dateFormatReport The value of dateFormatReport as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatReport_PrefixSearch(String dateFormatReport) {
        setDateFormatReport_LikeSearch(dateFormatReport, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     */
    public void setDateFormatReport_IsNull() { regDateFormatReport(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     */
    public void setDateFormatReport_IsNullOrEmpty() { regDateFormatReport(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     */
    public void setDateFormatReport_IsNotNull() { regDateFormatReport(CK_ISNN, DOBJ); }

    protected void regDateFormatReport(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateFormatReport(), "DATE_FORMAT_REPORT"); }
    protected abstract ConditionValue xgetCValueDateFormatReport();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_Equal(String dateFormatExcel) {
        doSetDateFormatExcel_Equal(fRES(dateFormatExcel));
    }

    protected void doSetDateFormatExcel_Equal(String dateFormatExcel) {
        regDateFormatExcel(CK_EQ, dateFormatExcel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_NotEqual(String dateFormatExcel) {
        doSetDateFormatExcel_NotEqual(fRES(dateFormatExcel));
    }

    protected void doSetDateFormatExcel_NotEqual(String dateFormatExcel) {
        regDateFormatExcel(CK_NES, dateFormatExcel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_GreaterThan(String dateFormatExcel) {
        regDateFormatExcel(CK_GT, fRES(dateFormatExcel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_LessThan(String dateFormatExcel) {
        regDateFormatExcel(CK_LT, fRES(dateFormatExcel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_GreaterEqual(String dateFormatExcel) {
        regDateFormatExcel(CK_GE, fRES(dateFormatExcel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_LessEqual(String dateFormatExcel) {
        regDateFormatExcel(CK_LE, fRES(dateFormatExcel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcelList The collection of dateFormatExcel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_InScope(Collection<String> dateFormatExcelList) {
        doSetDateFormatExcel_InScope(dateFormatExcelList);
    }

    protected void doSetDateFormatExcel_InScope(Collection<String> dateFormatExcelList) {
        regINS(CK_INS, cTL(dateFormatExcelList), xgetCValueDateFormatExcel(), "DATE_FORMAT_EXCEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcelList The collection of dateFormatExcel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_NotInScope(Collection<String> dateFormatExcelList) {
        doSetDateFormatExcel_NotInScope(dateFormatExcelList);
    }

    protected void doSetDateFormatExcel_NotInScope(Collection<String> dateFormatExcelList) {
        regINS(CK_NINS, cTL(dateFormatExcelList), xgetCValueDateFormatExcel(), "DATE_FORMAT_EXCEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)} <br>
     * <pre>e.g. setDateFormatExcel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateFormatExcel The value of dateFormatExcel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateFormatExcel_LikeSearch(String dateFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateFormatExcel), xgetCValueDateFormatExcel(), "DATE_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateFormatExcel_NotLikeSearch(String dateFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateFormatExcel), xgetCValueDateFormatExcel(), "DATE_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @param dateFormatExcel The value of dateFormatExcel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatExcel_PrefixSearch(String dateFormatExcel) {
        setDateFormatExcel_LikeSearch(dateFormatExcel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     */
    public void setDateFormatExcel_IsNull() { regDateFormatExcel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     */
    public void setDateFormatExcel_IsNullOrEmpty() { regDateFormatExcel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     */
    public void setDateFormatExcel_IsNotNull() { regDateFormatExcel(CK_ISNN, DOBJ); }

    protected void regDateFormatExcel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateFormatExcel(), "DATE_FORMAT_EXCEL"); }
    protected abstract ConditionValue xgetCValueDateFormatExcel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_Equal(String dateFormatText) {
        doSetDateFormatText_Equal(fRES(dateFormatText));
    }

    protected void doSetDateFormatText_Equal(String dateFormatText) {
        regDateFormatText(CK_EQ, dateFormatText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_NotEqual(String dateFormatText) {
        doSetDateFormatText_NotEqual(fRES(dateFormatText));
    }

    protected void doSetDateFormatText_NotEqual(String dateFormatText) {
        regDateFormatText(CK_NES, dateFormatText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_GreaterThan(String dateFormatText) {
        regDateFormatText(CK_GT, fRES(dateFormatText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_LessThan(String dateFormatText) {
        regDateFormatText(CK_LT, fRES(dateFormatText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_GreaterEqual(String dateFormatText) {
        regDateFormatText(CK_GE, fRES(dateFormatText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_LessEqual(String dateFormatText) {
        regDateFormatText(CK_LE, fRES(dateFormatText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatTextList The collection of dateFormatText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_InScope(Collection<String> dateFormatTextList) {
        doSetDateFormatText_InScope(dateFormatTextList);
    }

    protected void doSetDateFormatText_InScope(Collection<String> dateFormatTextList) {
        regINS(CK_INS, cTL(dateFormatTextList), xgetCValueDateFormatText(), "DATE_FORMAT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatTextList The collection of dateFormatText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_NotInScope(Collection<String> dateFormatTextList) {
        doSetDateFormatText_NotInScope(dateFormatTextList);
    }

    protected void doSetDateFormatText_NotInScope(Collection<String> dateFormatTextList) {
        regINS(CK_NINS, cTL(dateFormatTextList), xgetCValueDateFormatText(), "DATE_FORMAT_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)} <br>
     * <pre>e.g. setDateFormatText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateFormatText The value of dateFormatText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateFormatText_LikeSearch(String dateFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateFormatText), xgetCValueDateFormatText(), "DATE_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateFormatText_NotLikeSearch(String dateFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateFormatText), xgetCValueDateFormatText(), "DATE_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @param dateFormatText The value of dateFormatText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormatText_PrefixSearch(String dateFormatText) {
        setDateFormatText_LikeSearch(dateFormatText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     */
    public void setDateFormatText_IsNull() { regDateFormatText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     */
    public void setDateFormatText_IsNullOrEmpty() { regDateFormatText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     */
    public void setDateFormatText_IsNotNull() { regDateFormatText(CK_ISNN, DOBJ); }

    protected void regDateFormatText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateFormatText(), "DATE_FORMAT_TEXT"); }
    protected abstract ConditionValue xgetCValueDateFormatText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_Equal(String timeFormatDisplay) {
        doSetTimeFormatDisplay_Equal(fRES(timeFormatDisplay));
    }

    protected void doSetTimeFormatDisplay_Equal(String timeFormatDisplay) {
        regTimeFormatDisplay(CK_EQ, timeFormatDisplay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_NotEqual(String timeFormatDisplay) {
        doSetTimeFormatDisplay_NotEqual(fRES(timeFormatDisplay));
    }

    protected void doSetTimeFormatDisplay_NotEqual(String timeFormatDisplay) {
        regTimeFormatDisplay(CK_NES, timeFormatDisplay);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_GreaterThan(String timeFormatDisplay) {
        regTimeFormatDisplay(CK_GT, fRES(timeFormatDisplay));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_LessThan(String timeFormatDisplay) {
        regTimeFormatDisplay(CK_LT, fRES(timeFormatDisplay));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_GreaterEqual(String timeFormatDisplay) {
        regTimeFormatDisplay(CK_GE, fRES(timeFormatDisplay));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_LessEqual(String timeFormatDisplay) {
        regTimeFormatDisplay(CK_LE, fRES(timeFormatDisplay));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplayList The collection of timeFormatDisplay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_InScope(Collection<String> timeFormatDisplayList) {
        doSetTimeFormatDisplay_InScope(timeFormatDisplayList);
    }

    protected void doSetTimeFormatDisplay_InScope(Collection<String> timeFormatDisplayList) {
        regINS(CK_INS, cTL(timeFormatDisplayList), xgetCValueTimeFormatDisplay(), "TIME_FORMAT_DISPLAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplayList The collection of timeFormatDisplay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_NotInScope(Collection<String> timeFormatDisplayList) {
        doSetTimeFormatDisplay_NotInScope(timeFormatDisplayList);
    }

    protected void doSetTimeFormatDisplay_NotInScope(Collection<String> timeFormatDisplayList) {
        regINS(CK_NINS, cTL(timeFormatDisplayList), xgetCValueTimeFormatDisplay(), "TIME_FORMAT_DISPLAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * <pre>e.g. setTimeFormatDisplay_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeFormatDisplay The value of timeFormatDisplay as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeFormatDisplay_LikeSearch(String timeFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeFormatDisplay), xgetCValueTimeFormatDisplay(), "TIME_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeFormatDisplay_NotLikeSearch(String timeFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeFormatDisplay), xgetCValueTimeFormatDisplay(), "TIME_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @param timeFormatDisplay The value of timeFormatDisplay as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatDisplay_PrefixSearch(String timeFormatDisplay) {
        setTimeFormatDisplay_LikeSearch(timeFormatDisplay, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setTimeFormatDisplay_IsNull() { regTimeFormatDisplay(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setTimeFormatDisplay_IsNullOrEmpty() { regTimeFormatDisplay(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setTimeFormatDisplay_IsNotNull() { regTimeFormatDisplay(CK_ISNN, DOBJ); }

    protected void regTimeFormatDisplay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeFormatDisplay(), "TIME_FORMAT_DISPLAY"); }
    protected abstract ConditionValue xgetCValueTimeFormatDisplay();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_Equal(String timeFormatReport) {
        doSetTimeFormatReport_Equal(fRES(timeFormatReport));
    }

    protected void doSetTimeFormatReport_Equal(String timeFormatReport) {
        regTimeFormatReport(CK_EQ, timeFormatReport);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_NotEqual(String timeFormatReport) {
        doSetTimeFormatReport_NotEqual(fRES(timeFormatReport));
    }

    protected void doSetTimeFormatReport_NotEqual(String timeFormatReport) {
        regTimeFormatReport(CK_NES, timeFormatReport);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_GreaterThan(String timeFormatReport) {
        regTimeFormatReport(CK_GT, fRES(timeFormatReport));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_LessThan(String timeFormatReport) {
        regTimeFormatReport(CK_LT, fRES(timeFormatReport));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_GreaterEqual(String timeFormatReport) {
        regTimeFormatReport(CK_GE, fRES(timeFormatReport));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_LessEqual(String timeFormatReport) {
        regTimeFormatReport(CK_LE, fRES(timeFormatReport));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReportList The collection of timeFormatReport as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_InScope(Collection<String> timeFormatReportList) {
        doSetTimeFormatReport_InScope(timeFormatReportList);
    }

    protected void doSetTimeFormatReport_InScope(Collection<String> timeFormatReportList) {
        regINS(CK_INS, cTL(timeFormatReportList), xgetCValueTimeFormatReport(), "TIME_FORMAT_REPORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReportList The collection of timeFormatReport as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_NotInScope(Collection<String> timeFormatReportList) {
        doSetTimeFormatReport_NotInScope(timeFormatReportList);
    }

    protected void doSetTimeFormatReport_NotInScope(Collection<String> timeFormatReportList) {
        regINS(CK_NINS, cTL(timeFormatReportList), xgetCValueTimeFormatReport(), "TIME_FORMAT_REPORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)} <br>
     * <pre>e.g. setTimeFormatReport_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeFormatReport The value of timeFormatReport as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeFormatReport_LikeSearch(String timeFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeFormatReport), xgetCValueTimeFormatReport(), "TIME_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeFormatReport_NotLikeSearch(String timeFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeFormatReport), xgetCValueTimeFormatReport(), "TIME_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @param timeFormatReport The value of timeFormatReport as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatReport_PrefixSearch(String timeFormatReport) {
        setTimeFormatReport_LikeSearch(timeFormatReport, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     */
    public void setTimeFormatReport_IsNull() { regTimeFormatReport(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     */
    public void setTimeFormatReport_IsNullOrEmpty() { regTimeFormatReport(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     */
    public void setTimeFormatReport_IsNotNull() { regTimeFormatReport(CK_ISNN, DOBJ); }

    protected void regTimeFormatReport(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeFormatReport(), "TIME_FORMAT_REPORT"); }
    protected abstract ConditionValue xgetCValueTimeFormatReport();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_Equal(String timeFormatExcel) {
        doSetTimeFormatExcel_Equal(fRES(timeFormatExcel));
    }

    protected void doSetTimeFormatExcel_Equal(String timeFormatExcel) {
        regTimeFormatExcel(CK_EQ, timeFormatExcel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_NotEqual(String timeFormatExcel) {
        doSetTimeFormatExcel_NotEqual(fRES(timeFormatExcel));
    }

    protected void doSetTimeFormatExcel_NotEqual(String timeFormatExcel) {
        regTimeFormatExcel(CK_NES, timeFormatExcel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_GreaterThan(String timeFormatExcel) {
        regTimeFormatExcel(CK_GT, fRES(timeFormatExcel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_LessThan(String timeFormatExcel) {
        regTimeFormatExcel(CK_LT, fRES(timeFormatExcel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_GreaterEqual(String timeFormatExcel) {
        regTimeFormatExcel(CK_GE, fRES(timeFormatExcel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_LessEqual(String timeFormatExcel) {
        regTimeFormatExcel(CK_LE, fRES(timeFormatExcel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcelList The collection of timeFormatExcel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_InScope(Collection<String> timeFormatExcelList) {
        doSetTimeFormatExcel_InScope(timeFormatExcelList);
    }

    protected void doSetTimeFormatExcel_InScope(Collection<String> timeFormatExcelList) {
        regINS(CK_INS, cTL(timeFormatExcelList), xgetCValueTimeFormatExcel(), "TIME_FORMAT_EXCEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcelList The collection of timeFormatExcel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_NotInScope(Collection<String> timeFormatExcelList) {
        doSetTimeFormatExcel_NotInScope(timeFormatExcelList);
    }

    protected void doSetTimeFormatExcel_NotInScope(Collection<String> timeFormatExcelList) {
        regINS(CK_NINS, cTL(timeFormatExcelList), xgetCValueTimeFormatExcel(), "TIME_FORMAT_EXCEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * <pre>e.g. setTimeFormatExcel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeFormatExcel The value of timeFormatExcel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeFormatExcel_LikeSearch(String timeFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeFormatExcel), xgetCValueTimeFormatExcel(), "TIME_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeFormatExcel_NotLikeSearch(String timeFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeFormatExcel), xgetCValueTimeFormatExcel(), "TIME_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @param timeFormatExcel The value of timeFormatExcel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatExcel_PrefixSearch(String timeFormatExcel) {
        setTimeFormatExcel_LikeSearch(timeFormatExcel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     */
    public void setTimeFormatExcel_IsNull() { regTimeFormatExcel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     */
    public void setTimeFormatExcel_IsNullOrEmpty() { regTimeFormatExcel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     */
    public void setTimeFormatExcel_IsNotNull() { regTimeFormatExcel(CK_ISNN, DOBJ); }

    protected void regTimeFormatExcel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeFormatExcel(), "TIME_FORMAT_EXCEL"); }
    protected abstract ConditionValue xgetCValueTimeFormatExcel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_Equal(String timeFormatText) {
        doSetTimeFormatText_Equal(fRES(timeFormatText));
    }

    protected void doSetTimeFormatText_Equal(String timeFormatText) {
        regTimeFormatText(CK_EQ, timeFormatText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_NotEqual(String timeFormatText) {
        doSetTimeFormatText_NotEqual(fRES(timeFormatText));
    }

    protected void doSetTimeFormatText_NotEqual(String timeFormatText) {
        regTimeFormatText(CK_NES, timeFormatText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_GreaterThan(String timeFormatText) {
        regTimeFormatText(CK_GT, fRES(timeFormatText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_LessThan(String timeFormatText) {
        regTimeFormatText(CK_LT, fRES(timeFormatText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_GreaterEqual(String timeFormatText) {
        regTimeFormatText(CK_GE, fRES(timeFormatText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_LessEqual(String timeFormatText) {
        regTimeFormatText(CK_LE, fRES(timeFormatText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatTextList The collection of timeFormatText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_InScope(Collection<String> timeFormatTextList) {
        doSetTimeFormatText_InScope(timeFormatTextList);
    }

    protected void doSetTimeFormatText_InScope(Collection<String> timeFormatTextList) {
        regINS(CK_INS, cTL(timeFormatTextList), xgetCValueTimeFormatText(), "TIME_FORMAT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatTextList The collection of timeFormatText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_NotInScope(Collection<String> timeFormatTextList) {
        doSetTimeFormatText_NotInScope(timeFormatTextList);
    }

    protected void doSetTimeFormatText_NotInScope(Collection<String> timeFormatTextList) {
        regINS(CK_NINS, cTL(timeFormatTextList), xgetCValueTimeFormatText(), "TIME_FORMAT_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)} <br>
     * <pre>e.g. setTimeFormatText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeFormatText The value of timeFormatText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeFormatText_LikeSearch(String timeFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeFormatText), xgetCValueTimeFormatText(), "TIME_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeFormatText_NotLikeSearch(String timeFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeFormatText), xgetCValueTimeFormatText(), "TIME_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @param timeFormatText The value of timeFormatText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormatText_PrefixSearch(String timeFormatText) {
        setTimeFormatText_LikeSearch(timeFormatText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     */
    public void setTimeFormatText_IsNull() { regTimeFormatText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     */
    public void setTimeFormatText_IsNullOrEmpty() { regTimeFormatText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     */
    public void setTimeFormatText_IsNotNull() { regTimeFormatText(CK_ISNN, DOBJ); }

    protected void regTimeFormatText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeFormatText(), "TIME_FORMAT_TEXT"); }
    protected abstract ConditionValue xgetCValueTimeFormatText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_Equal(String numberFormatDisplay) {
        doSetNumberFormatDisplay_Equal(fRES(numberFormatDisplay));
    }

    protected void doSetNumberFormatDisplay_Equal(String numberFormatDisplay) {
        regNumberFormatDisplay(CK_EQ, numberFormatDisplay);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_NotEqual(String numberFormatDisplay) {
        doSetNumberFormatDisplay_NotEqual(fRES(numberFormatDisplay));
    }

    protected void doSetNumberFormatDisplay_NotEqual(String numberFormatDisplay) {
        regNumberFormatDisplay(CK_NES, numberFormatDisplay);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_GreaterThan(String numberFormatDisplay) {
        regNumberFormatDisplay(CK_GT, fRES(numberFormatDisplay));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_LessThan(String numberFormatDisplay) {
        regNumberFormatDisplay(CK_LT, fRES(numberFormatDisplay));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_GreaterEqual(String numberFormatDisplay) {
        regNumberFormatDisplay(CK_GE, fRES(numberFormatDisplay));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_LessEqual(String numberFormatDisplay) {
        regNumberFormatDisplay(CK_LE, fRES(numberFormatDisplay));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplayList The collection of numberFormatDisplay as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_InScope(Collection<String> numberFormatDisplayList) {
        doSetNumberFormatDisplay_InScope(numberFormatDisplayList);
    }

    protected void doSetNumberFormatDisplay_InScope(Collection<String> numberFormatDisplayList) {
        regINS(CK_INS, cTL(numberFormatDisplayList), xgetCValueNumberFormatDisplay(), "NUMBER_FORMAT_DISPLAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplayList The collection of numberFormatDisplay as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_NotInScope(Collection<String> numberFormatDisplayList) {
        doSetNumberFormatDisplay_NotInScope(numberFormatDisplayList);
    }

    protected void doSetNumberFormatDisplay_NotInScope(Collection<String> numberFormatDisplayList) {
        regINS(CK_NINS, cTL(numberFormatDisplayList), xgetCValueNumberFormatDisplay(), "NUMBER_FORMAT_DISPLAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)} <br>
     * <pre>e.g. setNumberFormatDisplay_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberFormatDisplay The value of numberFormatDisplay as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberFormatDisplay_LikeSearch(String numberFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberFormatDisplay), xgetCValueNumberFormatDisplay(), "NUMBER_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberFormatDisplay_NotLikeSearch(String numberFormatDisplay, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberFormatDisplay), xgetCValueNumberFormatDisplay(), "NUMBER_FORMAT_DISPLAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @param numberFormatDisplay The value of numberFormatDisplay as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatDisplay_PrefixSearch(String numberFormatDisplay) {
        setNumberFormatDisplay_LikeSearch(numberFormatDisplay, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setNumberFormatDisplay_IsNull() { regNumberFormatDisplay(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setNumberFormatDisplay_IsNullOrEmpty() { regNumberFormatDisplay(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     */
    public void setNumberFormatDisplay_IsNotNull() { regNumberFormatDisplay(CK_ISNN, DOBJ); }

    protected void regNumberFormatDisplay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberFormatDisplay(), "NUMBER_FORMAT_DISPLAY"); }
    protected abstract ConditionValue xgetCValueNumberFormatDisplay();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_Equal(String numberFormatReport) {
        doSetNumberFormatReport_Equal(fRES(numberFormatReport));
    }

    protected void doSetNumberFormatReport_Equal(String numberFormatReport) {
        regNumberFormatReport(CK_EQ, numberFormatReport);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_NotEqual(String numberFormatReport) {
        doSetNumberFormatReport_NotEqual(fRES(numberFormatReport));
    }

    protected void doSetNumberFormatReport_NotEqual(String numberFormatReport) {
        regNumberFormatReport(CK_NES, numberFormatReport);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_GreaterThan(String numberFormatReport) {
        regNumberFormatReport(CK_GT, fRES(numberFormatReport));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_LessThan(String numberFormatReport) {
        regNumberFormatReport(CK_LT, fRES(numberFormatReport));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_GreaterEqual(String numberFormatReport) {
        regNumberFormatReport(CK_GE, fRES(numberFormatReport));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_LessEqual(String numberFormatReport) {
        regNumberFormatReport(CK_LE, fRES(numberFormatReport));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReportList The collection of numberFormatReport as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_InScope(Collection<String> numberFormatReportList) {
        doSetNumberFormatReport_InScope(numberFormatReportList);
    }

    protected void doSetNumberFormatReport_InScope(Collection<String> numberFormatReportList) {
        regINS(CK_INS, cTL(numberFormatReportList), xgetCValueNumberFormatReport(), "NUMBER_FORMAT_REPORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReportList The collection of numberFormatReport as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_NotInScope(Collection<String> numberFormatReportList) {
        doSetNumberFormatReport_NotInScope(numberFormatReportList);
    }

    protected void doSetNumberFormatReport_NotInScope(Collection<String> numberFormatReportList) {
        regINS(CK_NINS, cTL(numberFormatReportList), xgetCValueNumberFormatReport(), "NUMBER_FORMAT_REPORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)} <br>
     * <pre>e.g. setNumberFormatReport_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberFormatReport The value of numberFormatReport as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberFormatReport_LikeSearch(String numberFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberFormatReport), xgetCValueNumberFormatReport(), "NUMBER_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberFormatReport_NotLikeSearch(String numberFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberFormatReport), xgetCValueNumberFormatReport(), "NUMBER_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @param numberFormatReport The value of numberFormatReport as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatReport_PrefixSearch(String numberFormatReport) {
        setNumberFormatReport_LikeSearch(numberFormatReport, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     */
    public void setNumberFormatReport_IsNull() { regNumberFormatReport(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     */
    public void setNumberFormatReport_IsNullOrEmpty() { regNumberFormatReport(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     */
    public void setNumberFormatReport_IsNotNull() { regNumberFormatReport(CK_ISNN, DOBJ); }

    protected void regNumberFormatReport(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberFormatReport(), "NUMBER_FORMAT_REPORT"); }
    protected abstract ConditionValue xgetCValueNumberFormatReport();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_Equal(String numberFormatExcel) {
        doSetNumberFormatExcel_Equal(fRES(numberFormatExcel));
    }

    protected void doSetNumberFormatExcel_Equal(String numberFormatExcel) {
        regNumberFormatExcel(CK_EQ, numberFormatExcel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_NotEqual(String numberFormatExcel) {
        doSetNumberFormatExcel_NotEqual(fRES(numberFormatExcel));
    }

    protected void doSetNumberFormatExcel_NotEqual(String numberFormatExcel) {
        regNumberFormatExcel(CK_NES, numberFormatExcel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_GreaterThan(String numberFormatExcel) {
        regNumberFormatExcel(CK_GT, fRES(numberFormatExcel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_LessThan(String numberFormatExcel) {
        regNumberFormatExcel(CK_LT, fRES(numberFormatExcel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_GreaterEqual(String numberFormatExcel) {
        regNumberFormatExcel(CK_GE, fRES(numberFormatExcel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_LessEqual(String numberFormatExcel) {
        regNumberFormatExcel(CK_LE, fRES(numberFormatExcel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcelList The collection of numberFormatExcel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_InScope(Collection<String> numberFormatExcelList) {
        doSetNumberFormatExcel_InScope(numberFormatExcelList);
    }

    protected void doSetNumberFormatExcel_InScope(Collection<String> numberFormatExcelList) {
        regINS(CK_INS, cTL(numberFormatExcelList), xgetCValueNumberFormatExcel(), "NUMBER_FORMAT_EXCEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcelList The collection of numberFormatExcel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_NotInScope(Collection<String> numberFormatExcelList) {
        doSetNumberFormatExcel_NotInScope(numberFormatExcelList);
    }

    protected void doSetNumberFormatExcel_NotInScope(Collection<String> numberFormatExcelList) {
        regINS(CK_NINS, cTL(numberFormatExcelList), xgetCValueNumberFormatExcel(), "NUMBER_FORMAT_EXCEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)} <br>
     * <pre>e.g. setNumberFormatExcel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberFormatExcel The value of numberFormatExcel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberFormatExcel_LikeSearch(String numberFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberFormatExcel), xgetCValueNumberFormatExcel(), "NUMBER_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberFormatExcel_NotLikeSearch(String numberFormatExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberFormatExcel), xgetCValueNumberFormatExcel(), "NUMBER_FORMAT_EXCEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @param numberFormatExcel The value of numberFormatExcel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatExcel_PrefixSearch(String numberFormatExcel) {
        setNumberFormatExcel_LikeSearch(numberFormatExcel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     */
    public void setNumberFormatExcel_IsNull() { regNumberFormatExcel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     */
    public void setNumberFormatExcel_IsNullOrEmpty() { regNumberFormatExcel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     */
    public void setNumberFormatExcel_IsNotNull() { regNumberFormatExcel(CK_ISNN, DOBJ); }

    protected void regNumberFormatExcel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberFormatExcel(), "NUMBER_FORMAT_EXCEL"); }
    protected abstract ConditionValue xgetCValueNumberFormatExcel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_Equal(String numberFormatText) {
        doSetNumberFormatText_Equal(fRES(numberFormatText));
    }

    protected void doSetNumberFormatText_Equal(String numberFormatText) {
        regNumberFormatText(CK_EQ, numberFormatText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_NotEqual(String numberFormatText) {
        doSetNumberFormatText_NotEqual(fRES(numberFormatText));
    }

    protected void doSetNumberFormatText_NotEqual(String numberFormatText) {
        regNumberFormatText(CK_NES, numberFormatText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_GreaterThan(String numberFormatText) {
        regNumberFormatText(CK_GT, fRES(numberFormatText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_LessThan(String numberFormatText) {
        regNumberFormatText(CK_LT, fRES(numberFormatText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_GreaterEqual(String numberFormatText) {
        regNumberFormatText(CK_GE, fRES(numberFormatText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_LessEqual(String numberFormatText) {
        regNumberFormatText(CK_LE, fRES(numberFormatText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatTextList The collection of numberFormatText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_InScope(Collection<String> numberFormatTextList) {
        doSetNumberFormatText_InScope(numberFormatTextList);
    }

    protected void doSetNumberFormatText_InScope(Collection<String> numberFormatTextList) {
        regINS(CK_INS, cTL(numberFormatTextList), xgetCValueNumberFormatText(), "NUMBER_FORMAT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatTextList The collection of numberFormatText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_NotInScope(Collection<String> numberFormatTextList) {
        doSetNumberFormatText_NotInScope(numberFormatTextList);
    }

    protected void doSetNumberFormatText_NotInScope(Collection<String> numberFormatTextList) {
        regINS(CK_NINS, cTL(numberFormatTextList), xgetCValueNumberFormatText(), "NUMBER_FORMAT_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)} <br>
     * <pre>e.g. setNumberFormatText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberFormatText The value of numberFormatText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberFormatText_LikeSearch(String numberFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberFormatText), xgetCValueNumberFormatText(), "NUMBER_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberFormatText_NotLikeSearch(String numberFormatText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberFormatText), xgetCValueNumberFormatText(), "NUMBER_FORMAT_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @param numberFormatText The value of numberFormatText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormatText_PrefixSearch(String numberFormatText) {
        setNumberFormatText_LikeSearch(numberFormatText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     */
    public void setNumberFormatText_IsNull() { regNumberFormatText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     */
    public void setNumberFormatText_IsNullOrEmpty() { regNumberFormatText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     */
    public void setNumberFormatText_IsNotNull() { regNumberFormatText(CK_ISNN, DOBJ); }

    protected void regNumberFormatText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberFormatText(), "NUMBER_FORMAT_TEXT"); }
    protected abstract ConditionValue xgetCValueNumberFormatText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_Equal(String currencyFormatReport) {
        doSetCurrencyFormatReport_Equal(fRES(currencyFormatReport));
    }

    protected void doSetCurrencyFormatReport_Equal(String currencyFormatReport) {
        regCurrencyFormatReport(CK_EQ, currencyFormatReport);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_NotEqual(String currencyFormatReport) {
        doSetCurrencyFormatReport_NotEqual(fRES(currencyFormatReport));
    }

    protected void doSetCurrencyFormatReport_NotEqual(String currencyFormatReport) {
        regCurrencyFormatReport(CK_NES, currencyFormatReport);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_GreaterThan(String currencyFormatReport) {
        regCurrencyFormatReport(CK_GT, fRES(currencyFormatReport));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_LessThan(String currencyFormatReport) {
        regCurrencyFormatReport(CK_LT, fRES(currencyFormatReport));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_GreaterEqual(String currencyFormatReport) {
        regCurrencyFormatReport(CK_GE, fRES(currencyFormatReport));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_LessEqual(String currencyFormatReport) {
        regCurrencyFormatReport(CK_LE, fRES(currencyFormatReport));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReportList The collection of currencyFormatReport as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_InScope(Collection<String> currencyFormatReportList) {
        doSetCurrencyFormatReport_InScope(currencyFormatReportList);
    }

    protected void doSetCurrencyFormatReport_InScope(Collection<String> currencyFormatReportList) {
        regINS(CK_INS, cTL(currencyFormatReportList), xgetCValueCurrencyFormatReport(), "CURRENCY_FORMAT_REPORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReportList The collection of currencyFormatReport as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_NotInScope(Collection<String> currencyFormatReportList) {
        doSetCurrencyFormatReport_NotInScope(currencyFormatReportList);
    }

    protected void doSetCurrencyFormatReport_NotInScope(Collection<String> currencyFormatReportList) {
        regINS(CK_NINS, cTL(currencyFormatReportList), xgetCValueCurrencyFormatReport(), "CURRENCY_FORMAT_REPORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)} <br>
     * <pre>e.g. setCurrencyFormatReport_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currencyFormatReport The value of currencyFormatReport as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrencyFormatReport_LikeSearch(String currencyFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currencyFormatReport), xgetCValueCurrencyFormatReport(), "CURRENCY_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrencyFormatReport_NotLikeSearch(String currencyFormatReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currencyFormatReport), xgetCValueCurrencyFormatReport(), "CURRENCY_FORMAT_REPORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @param currencyFormatReport The value of currencyFormatReport as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormatReport_PrefixSearch(String currencyFormatReport) {
        setCurrencyFormatReport_LikeSearch(currencyFormatReport, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     */
    public void setCurrencyFormatReport_IsNull() { regCurrencyFormatReport(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     */
    public void setCurrencyFormatReport_IsNullOrEmpty() { regCurrencyFormatReport(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     */
    public void setCurrencyFormatReport_IsNotNull() { regCurrencyFormatReport(CK_ISNN, DOBJ); }

    protected void regCurrencyFormatReport(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrencyFormatReport(), "CURRENCY_FORMAT_REPORT"); }
    protected abstract ConditionValue xgetCValueCurrencyFormatReport();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_Equal(String fontNameExcel) {
        doSetFontNameExcel_Equal(fRES(fontNameExcel));
    }

    protected void doSetFontNameExcel_Equal(String fontNameExcel) {
        regFontNameExcel(CK_EQ, fontNameExcel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_NotEqual(String fontNameExcel) {
        doSetFontNameExcel_NotEqual(fRES(fontNameExcel));
    }

    protected void doSetFontNameExcel_NotEqual(String fontNameExcel) {
        regFontNameExcel(CK_NES, fontNameExcel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_GreaterThan(String fontNameExcel) {
        regFontNameExcel(CK_GT, fRES(fontNameExcel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_LessThan(String fontNameExcel) {
        regFontNameExcel(CK_LT, fRES(fontNameExcel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_GreaterEqual(String fontNameExcel) {
        regFontNameExcel(CK_GE, fRES(fontNameExcel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_LessEqual(String fontNameExcel) {
        regFontNameExcel(CK_LE, fRES(fontNameExcel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcelList The collection of fontNameExcel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_InScope(Collection<String> fontNameExcelList) {
        doSetFontNameExcel_InScope(fontNameExcelList);
    }

    protected void doSetFontNameExcel_InScope(Collection<String> fontNameExcelList) {
        regINS(CK_INS, cTL(fontNameExcelList), xgetCValueFontNameExcel(), "FONT_NAME_EXCEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcelList The collection of fontNameExcel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_NotInScope(Collection<String> fontNameExcelList) {
        doSetFontNameExcel_NotInScope(fontNameExcelList);
    }

    protected void doSetFontNameExcel_NotInScope(Collection<String> fontNameExcelList) {
        regINS(CK_NINS, cTL(fontNameExcelList), xgetCValueFontNameExcel(), "FONT_NAME_EXCEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)} <br>
     * <pre>e.g. setFontNameExcel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fontNameExcel The value of fontNameExcel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFontNameExcel_LikeSearch(String fontNameExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fontNameExcel), xgetCValueFontNameExcel(), "FONT_NAME_EXCEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFontNameExcel_NotLikeSearch(String fontNameExcel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fontNameExcel), xgetCValueFontNameExcel(), "FONT_NAME_EXCEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @param fontNameExcel The value of fontNameExcel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontNameExcel_PrefixSearch(String fontNameExcel) {
        setFontNameExcel_LikeSearch(fontNameExcel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     */
    public void setFontNameExcel_IsNull() { regFontNameExcel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     */
    public void setFontNameExcel_IsNullOrEmpty() { regFontNameExcel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     */
    public void setFontNameExcel_IsNotNull() { regFontNameExcel(CK_ISNN, DOBJ); }

    protected void regFontNameExcel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFontNameExcel(), "FONT_NAME_EXCEL"); }
    protected abstract ConditionValue xgetCValueFontNameExcel();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcel The value of fontSizeExcel as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFontSizeExcel_Equal(java.math.BigDecimal fontSizeExcel) {
        doSetFontSizeExcel_Equal(fontSizeExcel);
    }

    protected void doSetFontSizeExcel_Equal(java.math.BigDecimal fontSizeExcel) {
        regFontSizeExcel(CK_EQ, fontSizeExcel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcel The value of fontSizeExcel as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFontSizeExcel_NotEqual(java.math.BigDecimal fontSizeExcel) {
        doSetFontSizeExcel_NotEqual(fontSizeExcel);
    }

    protected void doSetFontSizeExcel_NotEqual(java.math.BigDecimal fontSizeExcel) {
        regFontSizeExcel(CK_NES, fontSizeExcel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcel The value of fontSizeExcel as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFontSizeExcel_GreaterThan(java.math.BigDecimal fontSizeExcel) {
        regFontSizeExcel(CK_GT, fontSizeExcel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcel The value of fontSizeExcel as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFontSizeExcel_LessThan(java.math.BigDecimal fontSizeExcel) {
        regFontSizeExcel(CK_LT, fontSizeExcel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcel The value of fontSizeExcel as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFontSizeExcel_GreaterEqual(java.math.BigDecimal fontSizeExcel) {
        regFontSizeExcel(CK_GE, fontSizeExcel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcel The value of fontSizeExcel as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFontSizeExcel_LessEqual(java.math.BigDecimal fontSizeExcel) {
        regFontSizeExcel(CK_LE, fontSizeExcel);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param minNumber The min number of fontSizeExcel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fontSizeExcel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFontSizeExcel_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFontSizeExcel(), "FONT_SIZE_EXCEL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcelList The collection of fontSizeExcel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontSizeExcel_InScope(Collection<java.math.BigDecimal> fontSizeExcelList) {
        doSetFontSizeExcel_InScope(fontSizeExcelList);
    }

    protected void doSetFontSizeExcel_InScope(Collection<java.math.BigDecimal> fontSizeExcelList) {
        regINS(CK_INS, cTL(fontSizeExcelList), xgetCValueFontSizeExcel(), "FONT_SIZE_EXCEL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @param fontSizeExcelList The collection of fontSizeExcel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFontSizeExcel_NotInScope(Collection<java.math.BigDecimal> fontSizeExcelList) {
        doSetFontSizeExcel_NotInScope(fontSizeExcelList);
    }

    protected void doSetFontSizeExcel_NotInScope(Collection<java.math.BigDecimal> fontSizeExcelList) {
        regINS(CK_NINS, cTL(fontSizeExcelList), xgetCValueFontSizeExcel(), "FONT_SIZE_EXCEL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     */
    public void setFontSizeExcel_IsNull() { regFontSizeExcel(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     */
    public void setFontSizeExcel_IsNotNull() { regFontSizeExcel(CK_ISNN, DOBJ); }

    protected void regFontSizeExcel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFontSizeExcel(), "FONT_SIZE_EXCEL"); }
    protected abstract ConditionValue xgetCValueFontSizeExcel();

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
    public HpSLCFunction<BCultureAttributeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BCultureAttributeCB.class);
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
    public HpSLCFunction<BCultureAttributeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BCultureAttributeCB.class);
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
    public HpSLCFunction<BCultureAttributeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BCultureAttributeCB.class);
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
    public HpSLCFunction<BCultureAttributeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BCultureAttributeCB.class);
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
    public HpSLCFunction<BCultureAttributeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BCultureAttributeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BCultureAttributeCB&gt;() {
     *     public void query(BCultureAttributeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BCultureAttributeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BCultureAttributeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureAttributeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BCultureAttributeCQ sq);

    protected BCultureAttributeCB xcreateScalarConditionCB() {
        BCultureAttributeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BCultureAttributeCB xcreateScalarConditionPartitionByCB() {
        BCultureAttributeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BCultureAttributeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureAttributeCB cb = new BCultureAttributeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CULTURE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BCultureAttributeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BCultureAttributeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BCultureAttributeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureAttributeCB cb = new BCultureAttributeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CULTURE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BCultureAttributeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BCultureAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureAttributeCB cb = new BCultureAttributeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BCultureAttributeCQ sq);

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
    protected BCultureAttributeCB newMyCB() {
        return new BCultureAttributeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BCultureAttributeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

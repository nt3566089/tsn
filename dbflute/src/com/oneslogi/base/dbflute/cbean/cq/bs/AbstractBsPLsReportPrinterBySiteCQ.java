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
 * The abstract condition-query of P_LS_REPORT_PRINTER_BY_SITE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPLsReportPrinterBySiteCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPLsReportPrinterBySiteCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_LS_REPORT_PRINTER_BY_SITE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(Long warehouseCd) {
        doSetWarehouseCd_Equal(warehouseCd);
    }

    protected void doSetWarehouseCd_Equal(Long warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(Long warehouseCd) {
        doSetWarehouseCd_NotEqual(warehouseCd);
    }

    protected void doSetWarehouseCd_NotEqual(Long warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(Long warehouseCd) {
        regWarehouseCd(CK_GT, warehouseCd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(Long warehouseCd) {
        regWarehouseCd(CK_LT, warehouseCd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(Long warehouseCd) {
        regWarehouseCd(CK_GE, warehouseCd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(Long warehouseCd) {
        regWarehouseCd(CK_LE, warehouseCd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of warehouseCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseCd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseCd(), "WAREHOUSE_CD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<Long> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<Long> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<Long> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<Long> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_Equal(String reportFormName) {
        doSetReportFormName_Equal(fRES(reportFormName));
    }

    protected void doSetReportFormName_Equal(String reportFormName) {
        regReportFormName(CK_EQ, reportFormName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_NotEqual(String reportFormName) {
        doSetReportFormName_NotEqual(fRES(reportFormName));
    }

    protected void doSetReportFormName_NotEqual(String reportFormName) {
        regReportFormName(CK_NES, reportFormName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_GreaterThan(String reportFormName) {
        regReportFormName(CK_GT, fRES(reportFormName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_LessThan(String reportFormName) {
        regReportFormName(CK_LT, fRES(reportFormName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_GreaterEqual(String reportFormName) {
        regReportFormName(CK_GE, fRES(reportFormName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_LessEqual(String reportFormName) {
        regReportFormName(CK_LE, fRES(reportFormName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormNameList The collection of reportFormName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_InScope(Collection<String> reportFormNameList) {
        doSetReportFormName_InScope(reportFormNameList);
    }

    protected void doSetReportFormName_InScope(Collection<String> reportFormNameList) {
        regINS(CK_INS, cTL(reportFormNameList), xgetCValueReportFormName(), "REPORT_FORM_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormNameList The collection of reportFormName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_NotInScope(Collection<String> reportFormNameList) {
        doSetReportFormName_NotInScope(reportFormNameList);
    }

    protected void doSetReportFormName_NotInScope(Collection<String> reportFormNameList) {
        regINS(CK_NINS, cTL(reportFormNameList), xgetCValueReportFormName(), "REPORT_FORM_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)} <br>
     * <pre>e.g. setReportFormName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportFormName The value of reportFormName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportFormName_LikeSearch(String reportFormName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportFormName), xgetCValueReportFormName(), "REPORT_FORM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportFormName_NotLikeSearch(String reportFormName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportFormName), xgetCValueReportFormName(), "REPORT_FORM_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @param reportFormName The value of reportFormName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportFormName_PrefixSearch(String reportFormName) {
        setReportFormName_LikeSearch(reportFormName, xcLSOPPre());
    }

    protected void regReportFormName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportFormName(), "REPORT_FORM_NAME"); }
    protected abstract ConditionValue xgetCValueReportFormName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_Equal(String printerGroup) {
        doSetPrinterGroup_Equal(fRES(printerGroup));
    }

    protected void doSetPrinterGroup_Equal(String printerGroup) {
        regPrinterGroup(CK_EQ, printerGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_NotEqual(String printerGroup) {
        doSetPrinterGroup_NotEqual(fRES(printerGroup));
    }

    protected void doSetPrinterGroup_NotEqual(String printerGroup) {
        regPrinterGroup(CK_NES, printerGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_GreaterThan(String printerGroup) {
        regPrinterGroup(CK_GT, fRES(printerGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_LessThan(String printerGroup) {
        regPrinterGroup(CK_LT, fRES(printerGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_GreaterEqual(String printerGroup) {
        regPrinterGroup(CK_GE, fRES(printerGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_LessEqual(String printerGroup) {
        regPrinterGroup(CK_LE, fRES(printerGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroupList The collection of printerGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_InScope(Collection<String> printerGroupList) {
        doSetPrinterGroup_InScope(printerGroupList);
    }

    protected void doSetPrinterGroup_InScope(Collection<String> printerGroupList) {
        regINS(CK_INS, cTL(printerGroupList), xgetCValuePrinterGroup(), "PRINTER_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroupList The collection of printerGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_NotInScope(Collection<String> printerGroupList) {
        doSetPrinterGroup_NotInScope(printerGroupList);
    }

    protected void doSetPrinterGroup_NotInScope(Collection<String> printerGroupList) {
        regINS(CK_NINS, cTL(printerGroupList), xgetCValuePrinterGroup(), "PRINTER_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)} <br>
     * <pre>e.g. setPrinterGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printerGroup The value of printerGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrinterGroup_LikeSearch(String printerGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printerGroup), xgetCValuePrinterGroup(), "PRINTER_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrinterGroup_NotLikeSearch(String printerGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printerGroup), xgetCValuePrinterGroup(), "PRINTER_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @param printerGroup The value of printerGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroup_PrefixSearch(String printerGroup) {
        setPrinterGroup_LikeSearch(printerGroup, xcLSOPPre());
    }

    protected void regPrinterGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroup(), "PRINTER_GROUP"); }
    protected abstract ConditionValue xgetCValuePrinterGroup();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_Equal(Long lineNo) {
        doSetLineNo_Equal(lineNo);
    }

    protected void doSetLineNo_Equal(Long lineNo) {
        regLineNo(CK_EQ, lineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_NotEqual(Long lineNo) {
        doSetLineNo_NotEqual(lineNo);
    }

    protected void doSetLineNo_NotEqual(Long lineNo) {
        regLineNo(CK_NES, lineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterThan(Long lineNo) {
        regLineNo(CK_GT, lineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessThan(Long lineNo) {
        regLineNo(CK_LT, lineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterEqual(Long lineNo) {
        regLineNo(CK_GE, lineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessEqual(Long lineNo) {
        regLineNo(CK_LE, lineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineNo(), "LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNoList The collection of lineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_InScope(Collection<Long> lineNoList) {
        doSetLineNo_InScope(lineNoList);
    }

    protected void doSetLineNo_InScope(Collection<Long> lineNoList) {
        regINS(CK_INS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNoList The collection of lineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_NotInScope(Collection<Long> lineNoList) {
        doSetLineNo_NotInScope(lineNoList);
    }

    protected void doSetLineNo_NotInScope(Collection<Long> lineNoList) {
        regINS(CK_NINS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    protected void regLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineNo(), "LINE_NO"); }
    protected abstract ConditionValue xgetCValueLineNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_Equal(String reportServerName) {
        doSetReportServerName_Equal(fRES(reportServerName));
    }

    protected void doSetReportServerName_Equal(String reportServerName) {
        regReportServerName(CK_EQ, reportServerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_NotEqual(String reportServerName) {
        doSetReportServerName_NotEqual(fRES(reportServerName));
    }

    protected void doSetReportServerName_NotEqual(String reportServerName) {
        regReportServerName(CK_NES, reportServerName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_GreaterThan(String reportServerName) {
        regReportServerName(CK_GT, fRES(reportServerName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_LessThan(String reportServerName) {
        regReportServerName(CK_LT, fRES(reportServerName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_GreaterEqual(String reportServerName) {
        regReportServerName(CK_GE, fRES(reportServerName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_LessEqual(String reportServerName) {
        regReportServerName(CK_LE, fRES(reportServerName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerNameList The collection of reportServerName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_InScope(Collection<String> reportServerNameList) {
        doSetReportServerName_InScope(reportServerNameList);
    }

    protected void doSetReportServerName_InScope(Collection<String> reportServerNameList) {
        regINS(CK_INS, cTL(reportServerNameList), xgetCValueReportServerName(), "REPORT_SERVER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerNameList The collection of reportServerName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_NotInScope(Collection<String> reportServerNameList) {
        doSetReportServerName_NotInScope(reportServerNameList);
    }

    protected void doSetReportServerName_NotInScope(Collection<String> reportServerNameList) {
        regINS(CK_NINS, cTL(reportServerNameList), xgetCValueReportServerName(), "REPORT_SERVER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)} <br>
     * <pre>e.g. setReportServerName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportServerName The value of reportServerName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportServerName_LikeSearch(String reportServerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportServerName), xgetCValueReportServerName(), "REPORT_SERVER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportServerName_NotLikeSearch(String reportServerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportServerName), xgetCValueReportServerName(), "REPORT_SERVER_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @param reportServerName The value of reportServerName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportServerName_PrefixSearch(String reportServerName) {
        setReportServerName_LikeSearch(reportServerName, xcLSOPPre());
    }

    protected void regReportServerName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportServerName(), "REPORT_SERVER_NAME"); }
    protected abstract ConditionValue xgetCValueReportServerName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_Equal(String reportPrinterName) {
        doSetReportPrinterName_Equal(fRES(reportPrinterName));
    }

    protected void doSetReportPrinterName_Equal(String reportPrinterName) {
        regReportPrinterName(CK_EQ, reportPrinterName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_NotEqual(String reportPrinterName) {
        doSetReportPrinterName_NotEqual(fRES(reportPrinterName));
    }

    protected void doSetReportPrinterName_NotEqual(String reportPrinterName) {
        regReportPrinterName(CK_NES, reportPrinterName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_GreaterThan(String reportPrinterName) {
        regReportPrinterName(CK_GT, fRES(reportPrinterName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_LessThan(String reportPrinterName) {
        regReportPrinterName(CK_LT, fRES(reportPrinterName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_GreaterEqual(String reportPrinterName) {
        regReportPrinterName(CK_GE, fRES(reportPrinterName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_LessEqual(String reportPrinterName) {
        regReportPrinterName(CK_LE, fRES(reportPrinterName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterNameList The collection of reportPrinterName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_InScope(Collection<String> reportPrinterNameList) {
        doSetReportPrinterName_InScope(reportPrinterNameList);
    }

    protected void doSetReportPrinterName_InScope(Collection<String> reportPrinterNameList) {
        regINS(CK_INS, cTL(reportPrinterNameList), xgetCValueReportPrinterName(), "REPORT_PRINTER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterNameList The collection of reportPrinterName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_NotInScope(Collection<String> reportPrinterNameList) {
        doSetReportPrinterName_NotInScope(reportPrinterNameList);
    }

    protected void doSetReportPrinterName_NotInScope(Collection<String> reportPrinterNameList) {
        regINS(CK_NINS, cTL(reportPrinterNameList), xgetCValueReportPrinterName(), "REPORT_PRINTER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)} <br>
     * <pre>e.g. setReportPrinterName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportPrinterName The value of reportPrinterName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportPrinterName_LikeSearch(String reportPrinterName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportPrinterName), xgetCValueReportPrinterName(), "REPORT_PRINTER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportPrinterName_NotLikeSearch(String reportPrinterName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportPrinterName), xgetCValueReportPrinterName(), "REPORT_PRINTER_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @param reportPrinterName The value of reportPrinterName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportPrinterName_PrefixSearch(String reportPrinterName) {
        setReportPrinterName_LikeSearch(reportPrinterName, xcLSOPPre());
    }

    protected void regReportPrinterName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportPrinterName(), "REPORT_PRINTER_NAME"); }
    protected abstract ConditionValue xgetCValueReportPrinterName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_Equal(String floor) {
        doSetFloor_Equal(fRES(floor));
    }

    protected void doSetFloor_Equal(String floor) {
        regFloor(CK_EQ, floor);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_NotEqual(String floor) {
        doSetFloor_NotEqual(fRES(floor));
    }

    protected void doSetFloor_NotEqual(String floor) {
        regFloor(CK_NES, floor);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterThan(String floor) {
        regFloor(CK_GT, fRES(floor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessThan(String floor) {
        regFloor(CK_LT, fRES(floor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterEqual(String floor) {
        regFloor(CK_GE, fRES(floor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessEqual(String floor) {
        regFloor(CK_LE, fRES(floor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floorList The collection of floor as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_InScope(Collection<String> floorList) {
        doSetFloor_InScope(floorList);
    }

    protected void doSetFloor_InScope(Collection<String> floorList) {
        regINS(CK_INS, cTL(floorList), xgetCValueFloor(), "FLOOR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floorList The collection of floor as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_NotInScope(Collection<String> floorList) {
        doSetFloor_NotInScope(floorList);
    }

    protected void doSetFloor_NotInScope(Collection<String> floorList) {
        regINS(CK_NINS, cTL(floorList), xgetCValueFloor(), "FLOOR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(255)} <br>
     * <pre>e.g. setFloor_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floor The value of floor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloor_LikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloor_NotLikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(255)}
     * @param floor The value of floor as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_PrefixSearch(String floor) {
        setFloor_LikeSearch(floor, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     */
    public void setFloor_IsNull() { regFloor(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     */
    public void setFloor_IsNullOrEmpty() { regFloor(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(255)}
     */
    public void setFloor_IsNotNull() { regFloor(CK_ISNN, DOBJ); }

    protected void regFloor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloor(), "FLOOR"); }
    protected abstract ConditionValue xgetCValueFloor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_Equal(String autoFlg) {
        doSetAutoFlg_Equal(fRES(autoFlg));
    }

    protected void doSetAutoFlg_Equal(String autoFlg) {
        regAutoFlg(CK_EQ, autoFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_NotEqual(String autoFlg) {
        doSetAutoFlg_NotEqual(fRES(autoFlg));
    }

    protected void doSetAutoFlg_NotEqual(String autoFlg) {
        regAutoFlg(CK_NES, autoFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_GreaterThan(String autoFlg) {
        regAutoFlg(CK_GT, fRES(autoFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_LessThan(String autoFlg) {
        regAutoFlg(CK_LT, fRES(autoFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_GreaterEqual(String autoFlg) {
        regAutoFlg(CK_GE, fRES(autoFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_LessEqual(String autoFlg) {
        regAutoFlg(CK_LE, fRES(autoFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlgList The collection of autoFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_InScope(Collection<String> autoFlgList) {
        doSetAutoFlg_InScope(autoFlgList);
    }

    protected void doSetAutoFlg_InScope(Collection<String> autoFlgList) {
        regINS(CK_INS, cTL(autoFlgList), xgetCValueAutoFlg(), "AUTO_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlgList The collection of autoFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_NotInScope(Collection<String> autoFlgList) {
        doSetAutoFlg_NotInScope(autoFlgList);
    }

    protected void doSetAutoFlg_NotInScope(Collection<String> autoFlgList) {
        regINS(CK_NINS, cTL(autoFlgList), xgetCValueAutoFlg(), "AUTO_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setAutoFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param autoFlg The value of autoFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAutoFlg_LikeSearch(String autoFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(autoFlg), xgetCValueAutoFlg(), "AUTO_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAutoFlg_NotLikeSearch(String autoFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(autoFlg), xgetCValueAutoFlg(), "AUTO_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @param autoFlg The value of autoFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoFlg_PrefixSearch(String autoFlg) {
        setAutoFlg_LikeSearch(autoFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     */
    public void setAutoFlg_IsNull() { regAutoFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUTO_FLG: {char(1), default=[0]}
     */
    public void setAutoFlg_IsNotNull() { regAutoFlg(CK_ISNN, DOBJ); }

    protected void regAutoFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAutoFlg(), "AUTO_FLG"); }
    protected abstract ConditionValue xgetCValueAutoFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_Equal(String terminalCd) {
        doSetTerminalCd_Equal(fRES(terminalCd));
    }

    protected void doSetTerminalCd_Equal(String terminalCd) {
        regTerminalCd(CK_EQ, terminalCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_NotEqual(String terminalCd) {
        doSetTerminalCd_NotEqual(fRES(terminalCd));
    }

    protected void doSetTerminalCd_NotEqual(String terminalCd) {
        regTerminalCd(CK_NES, terminalCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_GreaterThan(String terminalCd) {
        regTerminalCd(CK_GT, fRES(terminalCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_LessThan(String terminalCd) {
        regTerminalCd(CK_LT, fRES(terminalCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_GreaterEqual(String terminalCd) {
        regTerminalCd(CK_GE, fRES(terminalCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_LessEqual(String terminalCd) {
        regTerminalCd(CK_LE, fRES(terminalCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCdList The collection of terminalCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_InScope(Collection<String> terminalCdList) {
        doSetTerminalCd_InScope(terminalCdList);
    }

    protected void doSetTerminalCd_InScope(Collection<String> terminalCdList) {
        regINS(CK_INS, cTL(terminalCdList), xgetCValueTerminalCd(), "TERMINAL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCdList The collection of terminalCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_NotInScope(Collection<String> terminalCdList) {
        doSetTerminalCd_NotInScope(terminalCdList);
    }

    protected void doSetTerminalCd_NotInScope(Collection<String> terminalCdList) {
        regINS(CK_NINS, cTL(terminalCdList), xgetCValueTerminalCd(), "TERMINAL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {varchar(255)} <br>
     * <pre>e.g. setTerminalCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param terminalCd The value of terminalCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerminalCd_LikeSearch(String terminalCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(terminalCd), xgetCValueTerminalCd(), "TERMINAL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTerminalCd_NotLikeSearch(String terminalCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(terminalCd), xgetCValueTerminalCd(), "TERMINAL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     * @param terminalCd The value of terminalCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_PrefixSearch(String terminalCd) {
        setTerminalCd_LikeSearch(terminalCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     */
    public void setTerminalCd_IsNull() { regTerminalCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     */
    public void setTerminalCd_IsNullOrEmpty() { regTerminalCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMINAL_CD: {varchar(255)}
     */
    public void setTerminalCd_IsNotNull() { regTerminalCd(CK_ISNN, DOBJ); }

    protected void regTerminalCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalCd(), "TERMINAL_CD"); }
    protected abstract ConditionValue xgetCValueTerminalCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_Equal(String priterNo) {
        doSetPriterNo_Equal(fRES(priterNo));
    }

    protected void doSetPriterNo_Equal(String priterNo) {
        regPriterNo(CK_EQ, priterNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_NotEqual(String priterNo) {
        doSetPriterNo_NotEqual(fRES(priterNo));
    }

    protected void doSetPriterNo_NotEqual(String priterNo) {
        regPriterNo(CK_NES, priterNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_GreaterThan(String priterNo) {
        regPriterNo(CK_GT, fRES(priterNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_LessThan(String priterNo) {
        regPriterNo(CK_LT, fRES(priterNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_GreaterEqual(String priterNo) {
        regPriterNo(CK_GE, fRES(priterNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_LessEqual(String priterNo) {
        regPriterNo(CK_LE, fRES(priterNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNoList The collection of priterNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_InScope(Collection<String> priterNoList) {
        doSetPriterNo_InScope(priterNoList);
    }

    protected void doSetPriterNo_InScope(Collection<String> priterNoList) {
        regINS(CK_INS, cTL(priterNoList), xgetCValuePriterNo(), "PRITER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNoList The collection of priterNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_NotInScope(Collection<String> priterNoList) {
        doSetPriterNo_NotInScope(priterNoList);
    }

    protected void doSetPriterNo_NotInScope(Collection<String> priterNoList) {
        regINS(CK_NINS, cTL(priterNoList), xgetCValuePriterNo(), "PRITER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRITER_NO: {varchar(255)} <br>
     * <pre>e.g. setPriterNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priterNo The value of priterNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriterNo_LikeSearch(String priterNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priterNo), xgetCValuePriterNo(), "PRITER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriterNo_NotLikeSearch(String priterNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priterNo), xgetCValuePriterNo(), "PRITER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRITER_NO: {varchar(255)}
     * @param priterNo The value of priterNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriterNo_PrefixSearch(String priterNo) {
        setPriterNo_LikeSearch(priterNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     */
    public void setPriterNo_IsNull() { regPriterNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     */
    public void setPriterNo_IsNullOrEmpty() { regPriterNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRITER_NO: {varchar(255)}
     */
    public void setPriterNo_IsNotNull() { regPriterNo(CK_ISNN, DOBJ); }

    protected void regPriterNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriterNo(), "PRITER_NO"); }
    protected abstract ConditionValue xgetCValuePriterNo();

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
    public HpSLCFunction<PLsReportPrinterBySiteCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PLsReportPrinterBySiteCB.class);
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
    public HpSLCFunction<PLsReportPrinterBySiteCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PLsReportPrinterBySiteCB.class);
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
    public HpSLCFunction<PLsReportPrinterBySiteCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PLsReportPrinterBySiteCB.class);
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
    public HpSLCFunction<PLsReportPrinterBySiteCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PLsReportPrinterBySiteCB.class);
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
    public HpSLCFunction<PLsReportPrinterBySiteCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PLsReportPrinterBySiteCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PLsReportPrinterBySiteCB&gt;() {
     *     public void query(PLsReportPrinterBySiteCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PLsReportPrinterBySiteCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PLsReportPrinterBySiteCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PLsReportPrinterBySiteCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PLsReportPrinterBySiteCQ sq);

    protected PLsReportPrinterBySiteCB xcreateScalarConditionCB() {
        PLsReportPrinterBySiteCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PLsReportPrinterBySiteCB xcreateScalarConditionPartitionByCB() {
        PLsReportPrinterBySiteCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PLsReportPrinterBySiteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLsReportPrinterBySiteCB cb = new PLsReportPrinterBySiteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WAREHOUSE_CD";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PLsReportPrinterBySiteCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PLsReportPrinterBySiteCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PLsReportPrinterBySiteCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLsReportPrinterBySiteCB cb = new PLsReportPrinterBySiteCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WAREHOUSE_CD";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PLsReportPrinterBySiteCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PLsReportPrinterBySiteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLsReportPrinterBySiteCB cb = new PLsReportPrinterBySiteCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PLsReportPrinterBySiteCQ sq);

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
    protected PLsReportPrinterBySiteCB newMyCB() {
        return new PLsReportPrinterBySiteCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PLsReportPrinterBySiteCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

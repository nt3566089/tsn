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
 * The abstract condition-query of P_REPORT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPReportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_REPORT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportId The value of reportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_Equal(Long reportId) {
        doSetReportId_Equal(reportId);
    }

    protected void doSetReportId_Equal(Long reportId) {
        regReportId(CK_EQ, reportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportId The value of reportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_NotEqual(Long reportId) {
        doSetReportId_NotEqual(reportId);
    }

    protected void doSetReportId_NotEqual(Long reportId) {
        regReportId(CK_NES, reportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportId The value of reportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterThan(Long reportId) {
        regReportId(CK_GT, reportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportId The value of reportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessThan(Long reportId) {
        regReportId(CK_LT, reportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportId The value of reportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterEqual(Long reportId) {
        regReportId(CK_GE, reportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportId The value of reportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessEqual(Long reportId) {
        regReportId(CK_LE, reportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of reportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportId(), "REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportIdList The collection of reportId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportId_InScope(Collection<Long> reportIdList) {
        doSetReportId_InScope(reportIdList);
    }

    protected void doSetReportId_InScope(Collection<Long> reportIdList) {
        regINS(CK_INS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportIdList The collection of reportId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportId_NotInScope(Collection<Long> reportIdList) {
        doSetReportId_NotInScope(reportIdList);
    }

    protected void doSetReportId_NotInScope(Collection<Long> reportIdList) {
        regINS(CK_NINS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_ID from P_REPORT_LAYOUT where ...)} <br>
     * P_REPORT_LAYOUT by REPORT_ID, named 'PReportLayoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPReportLayoutList</span>(layoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     layoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PReportLayoutList for 'exists'. (NotNull)
     */
    public void existsPReportLayoutList(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportId_ExistsReferrer_PReportLayoutList(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_ID", "REPORT_ID", pp, "pReportLayoutList");
    }
    public abstract String keepReportId_ExistsReferrer_PReportLayoutList(PReportLayoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_ID from P_REPORT_LAYOUT where ...)} <br>
     * P_REPORT_LAYOUT by REPORT_ID, named 'PReportLayoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPReportLayoutList</span>(layoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     layoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportId_NotExistsReferrer_PReportLayoutList for 'not exists'. (NotNull)
     */
    public void notExistsPReportLayoutList(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportId_NotExistsReferrer_PReportLayoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_ID", "REPORT_ID", pp, "pReportLayoutList");
    }
    public abstract String keepReportId_NotExistsReferrer_PReportLayoutList(PReportLayoutCQ sq);

    public void xsderivePReportLayoutList(String fn, SubQuery<PReportLayoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReportId_SpecifyDerivedReferrer_PReportLayoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REPORT_ID", "REPORT_ID", pp, "pReportLayoutList", al, op);
    }
    public abstract String keepReportId_SpecifyDerivedReferrer_PReportLayoutList(PReportLayoutCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_REPORT_LAYOUT where ...)} <br>
     * P_REPORT_LAYOUT by REPORT_ID, named 'PReportLayoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPReportLayoutList()</span>.<span style="color: #CC4747">max</span>(layoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     layoutCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     layoutCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PReportLayoutCB> derivedPReportLayoutList() {
        return xcreateQDRFunctionPReportLayoutList();
    }
    protected HpQDRFunction<PReportLayoutCB> xcreateQDRFunctionPReportLayoutList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePReportLayoutList(fn, sq, rd, vl, op));
    }
    public void xqderivePReportLayoutList(String fn, SubQuery<PReportLayoutCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReportId_QueryDerivedReferrer_PReportLayoutList(cb.query()); String prpp = keepReportId_QueryDerivedReferrer_PReportLayoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REPORT_ID", "REPORT_ID", sqpp, "pReportLayoutList", rd, vl, prpp, op);
    }
    public abstract String keepReportId_QueryDerivedReferrer_PReportLayoutList(PReportLayoutCQ sq);
    public abstract String keepReportId_QueryDerivedReferrer_PReportLayoutListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReportId_IsNull() { regReportId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReportId_IsNotNull() { regReportId(CK_ISNN, DOBJ); }

    protected void regReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportId(), "REPORT_ID"); }
    protected abstract ConditionValue xgetCValueReportId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_Equal(String reportCd) {
        doSetReportCd_Equal(fRES(reportCd));
    }

    protected void doSetReportCd_Equal(String reportCd) {
        regReportCd(CK_EQ, reportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_NotEqual(String reportCd) {
        doSetReportCd_NotEqual(fRES(reportCd));
    }

    protected void doSetReportCd_NotEqual(String reportCd) {
        regReportCd(CK_NES, reportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_GreaterThan(String reportCd) {
        regReportCd(CK_GT, fRES(reportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_LessThan(String reportCd) {
        regReportCd(CK_LT, fRES(reportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_GreaterEqual(String reportCd) {
        regReportCd(CK_GE, fRES(reportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_LessEqual(String reportCd) {
        regReportCd(CK_LE, fRES(reportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCdList The collection of reportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_InScope(Collection<String> reportCdList) {
        doSetReportCd_InScope(reportCdList);
    }

    protected void doSetReportCd_InScope(Collection<String> reportCdList) {
        regINS(CK_INS, cTL(reportCdList), xgetCValueReportCd(), "REPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCdList The collection of reportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_NotInScope(Collection<String> reportCdList) {
        doSetReportCd_NotInScope(reportCdList);
    }

    protected void doSetReportCd_NotInScope(Collection<String> reportCdList) {
        regINS(CK_NINS, cTL(reportCdList), xgetCValueReportCd(), "REPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setReportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportCd The value of reportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportCd_LikeSearch(String reportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportCd), xgetCValueReportCd(), "REPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportCd_NotLikeSearch(String reportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportCd), xgetCValueReportCd(), "REPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_CD: {UQ, NotNull, varchar(100)}
     * @param reportCd The value of reportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_PrefixSearch(String reportCd) {
        setReportCd_LikeSearch(reportCd, xcLSOPPre());
    }

    protected void regReportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportCd(), "REPORT_CD"); }
    protected abstract ConditionValue xgetCValueReportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_Equal(String reportNm) {
        doSetReportNm_Equal(fRES(reportNm));
    }

    protected void doSetReportNm_Equal(String reportNm) {
        regReportNm(CK_EQ, reportNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_NotEqual(String reportNm) {
        doSetReportNm_NotEqual(fRES(reportNm));
    }

    protected void doSetReportNm_NotEqual(String reportNm) {
        regReportNm(CK_NES, reportNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_GreaterThan(String reportNm) {
        regReportNm(CK_GT, fRES(reportNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_LessThan(String reportNm) {
        regReportNm(CK_LT, fRES(reportNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_GreaterEqual(String reportNm) {
        regReportNm(CK_GE, fRES(reportNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_LessEqual(String reportNm) {
        regReportNm(CK_LE, fRES(reportNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNmList The collection of reportNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_InScope(Collection<String> reportNmList) {
        doSetReportNm_InScope(reportNmList);
    }

    protected void doSetReportNm_InScope(Collection<String> reportNmList) {
        regINS(CK_INS, cTL(reportNmList), xgetCValueReportNm(), "REPORT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNmList The collection of reportNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_NotInScope(Collection<String> reportNmList) {
        doSetReportNm_NotInScope(reportNmList);
    }

    protected void doSetReportNm_NotInScope(Collection<String> reportNmList) {
        regINS(CK_NINS, cTL(reportNmList), xgetCValueReportNm(), "REPORT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setReportNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportNm The value of reportNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportNm_LikeSearch(String reportNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportNm), xgetCValueReportNm(), "REPORT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportNm_NotLikeSearch(String reportNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportNm), xgetCValueReportNm(), "REPORT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_PrefixSearch(String reportNm) {
        setReportNm_LikeSearch(reportNm, xcLSOPPre());
    }

    protected void regReportNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportNm(), "REPORT_NM"); }
    protected abstract ConditionValue xgetCValueReportNm();

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
    public HpSLCFunction<PReportCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PReportCB.class);
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
    public HpSLCFunction<PReportCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PReportCB.class);
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
    public HpSLCFunction<PReportCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PReportCB.class);
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
    public HpSLCFunction<PReportCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PReportCB.class);
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
    public HpSLCFunction<PReportCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PReportCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PReportCB&gt;() {
     *     public void query(PReportCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PReportCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PReportCQ sq);

    protected PReportCB xcreateScalarConditionCB() {
        PReportCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PReportCB xcreateScalarConditionPartitionByCB() {
        PReportCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PReportCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportCB cb = new PReportCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REPORT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PReportCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PReportCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PReportCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportCB cb = new PReportCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REPORT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PReportCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportCB cb = new PReportCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PReportCQ sq);

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
    protected PReportCB newMyCB() {
        return new PReportCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PReportCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

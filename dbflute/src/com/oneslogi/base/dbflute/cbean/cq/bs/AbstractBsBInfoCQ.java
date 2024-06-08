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
 * The abstract condition-query of B_INFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBInfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_INFO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoId The value of infoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInfoId_Equal(Long infoId) {
        doSetInfoId_Equal(infoId);
    }

    protected void doSetInfoId_Equal(Long infoId) {
        regInfoId(CK_EQ, infoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoId The value of infoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInfoId_NotEqual(Long infoId) {
        doSetInfoId_NotEqual(infoId);
    }

    protected void doSetInfoId_NotEqual(Long infoId) {
        regInfoId(CK_NES, infoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoId The value of infoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInfoId_GreaterThan(Long infoId) {
        regInfoId(CK_GT, infoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoId The value of infoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInfoId_LessThan(Long infoId) {
        regInfoId(CK_LT, infoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoId The value of infoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInfoId_GreaterEqual(Long infoId) {
        regInfoId(CK_GE, infoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoId The value of infoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInfoId_LessEqual(Long infoId) {
        regInfoId(CK_LE, infoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of infoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of infoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInfoId(), "INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoIdList The collection of infoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoId_InScope(Collection<Long> infoIdList) {
        doSetInfoId_InScope(infoIdList);
    }

    protected void doSetInfoId_InScope(Collection<Long> infoIdList) {
        regINS(CK_INS, cTL(infoIdList), xgetCValueInfoId(), "INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param infoIdList The collection of infoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoId_NotInScope(Collection<Long> infoIdList) {
        doSetInfoId_NotInScope(infoIdList);
    }

    protected void doSetInfoId_NotInScope(Collection<Long> infoIdList) {
        regINS(CK_NINS, cTL(infoIdList), xgetCValueInfoId(), "INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInfoId_IsNull() { regInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInfoId_IsNotNull() { regInfoId(CK_ISNN, DOBJ); }

    protected void regInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInfoId(), "INFO_ID"); }
    protected abstract ConditionValue xgetCValueInfoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
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
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
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
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
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
     * CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE}
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

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_Equal(String infoNm) {
        doSetInfoNm_Equal(fRES(infoNm));
    }

    protected void doSetInfoNm_Equal(String infoNm) {
        regInfoNm(CK_EQ, infoNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_NotEqual(String infoNm) {
        doSetInfoNm_NotEqual(fRES(infoNm));
    }

    protected void doSetInfoNm_NotEqual(String infoNm) {
        regInfoNm(CK_NES, infoNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_GreaterThan(String infoNm) {
        regInfoNm(CK_GT, fRES(infoNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_LessThan(String infoNm) {
        regInfoNm(CK_LT, fRES(infoNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_GreaterEqual(String infoNm) {
        regInfoNm(CK_GE, fRES(infoNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_LessEqual(String infoNm) {
        regInfoNm(CK_LE, fRES(infoNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNmList The collection of infoNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_InScope(Collection<String> infoNmList) {
        doSetInfoNm_InScope(infoNmList);
    }

    protected void doSetInfoNm_InScope(Collection<String> infoNmList) {
        regINS(CK_INS, cTL(infoNmList), xgetCValueInfoNm(), "INFO_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNmList The collection of infoNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_NotInScope(Collection<String> infoNmList) {
        doSetInfoNm_NotInScope(infoNmList);
    }

    protected void doSetInfoNm_NotInScope(Collection<String> infoNmList) {
        regINS(CK_NINS, cTL(infoNmList), xgetCValueInfoNm(), "INFO_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_NM: {varchar(255)} <br>
     * <pre>e.g. setInfoNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param infoNm The value of infoNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInfoNm_LikeSearch(String infoNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(infoNm), xgetCValueInfoNm(), "INFO_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInfoNm_NotLikeSearch(String infoNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(infoNm), xgetCValueInfoNm(), "INFO_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_NM: {varchar(255)}
     * @param infoNm The value of infoNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoNm_PrefixSearch(String infoNm) {
        setInfoNm_LikeSearch(infoNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     */
    public void setInfoNm_IsNull() { regInfoNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     */
    public void setInfoNm_IsNullOrEmpty() { regInfoNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INFO_NM: {varchar(255)}
     */
    public void setInfoNm_IsNotNull() { regInfoNm(CK_ISNN, DOBJ); }

    protected void regInfoNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInfoNm(), "INFO_NM"); }
    protected abstract ConditionValue xgetCValueInfoNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_Equal(String infoStartDt) {
        doSetInfoStartDt_Equal(fRES(infoStartDt));
    }

    protected void doSetInfoStartDt_Equal(String infoStartDt) {
        regInfoStartDt(CK_EQ, infoStartDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_NotEqual(String infoStartDt) {
        doSetInfoStartDt_NotEqual(fRES(infoStartDt));
    }

    protected void doSetInfoStartDt_NotEqual(String infoStartDt) {
        regInfoStartDt(CK_NES, infoStartDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_GreaterThan(String infoStartDt) {
        regInfoStartDt(CK_GT, fRES(infoStartDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_LessThan(String infoStartDt) {
        regInfoStartDt(CK_LT, fRES(infoStartDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_GreaterEqual(String infoStartDt) {
        regInfoStartDt(CK_GE, fRES(infoStartDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_LessEqual(String infoStartDt) {
        regInfoStartDt(CK_LE, fRES(infoStartDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDtList The collection of infoStartDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_InScope(Collection<String> infoStartDtList) {
        doSetInfoStartDt_InScope(infoStartDtList);
    }

    protected void doSetInfoStartDt_InScope(Collection<String> infoStartDtList) {
        regINS(CK_INS, cTL(infoStartDtList), xgetCValueInfoStartDt(), "INFO_START_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDtList The collection of infoStartDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_NotInScope(Collection<String> infoStartDtList) {
        doSetInfoStartDt_NotInScope(infoStartDtList);
    }

    protected void doSetInfoStartDt_NotInScope(Collection<String> infoStartDtList) {
        regINS(CK_NINS, cTL(infoStartDtList), xgetCValueInfoStartDt(), "INFO_START_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_START_DT: {varchar(8)} <br>
     * <pre>e.g. setInfoStartDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param infoStartDt The value of infoStartDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInfoStartDt_LikeSearch(String infoStartDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(infoStartDt), xgetCValueInfoStartDt(), "INFO_START_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInfoStartDt_NotLikeSearch(String infoStartDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(infoStartDt), xgetCValueInfoStartDt(), "INFO_START_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     * @param infoStartDt The value of infoStartDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoStartDt_PrefixSearch(String infoStartDt) {
        setInfoStartDt_LikeSearch(infoStartDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     */
    public void setInfoStartDt_IsNull() { regInfoStartDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     */
    public void setInfoStartDt_IsNullOrEmpty() { regInfoStartDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INFO_START_DT: {varchar(8)}
     */
    public void setInfoStartDt_IsNotNull() { regInfoStartDt(CK_ISNN, DOBJ); }

    protected void regInfoStartDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInfoStartDt(), "INFO_START_DT"); }
    protected abstract ConditionValue xgetCValueInfoStartDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_Equal(String infoEndDt) {
        doSetInfoEndDt_Equal(fRES(infoEndDt));
    }

    protected void doSetInfoEndDt_Equal(String infoEndDt) {
        regInfoEndDt(CK_EQ, infoEndDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_NotEqual(String infoEndDt) {
        doSetInfoEndDt_NotEqual(fRES(infoEndDt));
    }

    protected void doSetInfoEndDt_NotEqual(String infoEndDt) {
        regInfoEndDt(CK_NES, infoEndDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_GreaterThan(String infoEndDt) {
        regInfoEndDt(CK_GT, fRES(infoEndDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_LessThan(String infoEndDt) {
        regInfoEndDt(CK_LT, fRES(infoEndDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_GreaterEqual(String infoEndDt) {
        regInfoEndDt(CK_GE, fRES(infoEndDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_LessEqual(String infoEndDt) {
        regInfoEndDt(CK_LE, fRES(infoEndDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDtList The collection of infoEndDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_InScope(Collection<String> infoEndDtList) {
        doSetInfoEndDt_InScope(infoEndDtList);
    }

    protected void doSetInfoEndDt_InScope(Collection<String> infoEndDtList) {
        regINS(CK_INS, cTL(infoEndDtList), xgetCValueInfoEndDt(), "INFO_END_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDtList The collection of infoEndDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_NotInScope(Collection<String> infoEndDtList) {
        doSetInfoEndDt_NotInScope(infoEndDtList);
    }

    protected void doSetInfoEndDt_NotInScope(Collection<String> infoEndDtList) {
        regINS(CK_NINS, cTL(infoEndDtList), xgetCValueInfoEndDt(), "INFO_END_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_END_DT: {varchar(8)} <br>
     * <pre>e.g. setInfoEndDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param infoEndDt The value of infoEndDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInfoEndDt_LikeSearch(String infoEndDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(infoEndDt), xgetCValueInfoEndDt(), "INFO_END_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInfoEndDt_NotLikeSearch(String infoEndDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(infoEndDt), xgetCValueInfoEndDt(), "INFO_END_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     * @param infoEndDt The value of infoEndDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInfoEndDt_PrefixSearch(String infoEndDt) {
        setInfoEndDt_LikeSearch(infoEndDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     */
    public void setInfoEndDt_IsNull() { regInfoEndDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     */
    public void setInfoEndDt_IsNullOrEmpty() { regInfoEndDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INFO_END_DT: {varchar(8)}
     */
    public void setInfoEndDt_IsNotNull() { regInfoEndDt(CK_ISNN, DOBJ); }

    protected void regInfoEndDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInfoEndDt(), "INFO_END_DT"); }
    protected abstract ConditionValue xgetCValueInfoEndDt();

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
    public HpSLCFunction<BInfoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BInfoCB.class);
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
    public HpSLCFunction<BInfoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BInfoCB.class);
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
    public HpSLCFunction<BInfoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BInfoCB.class);
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
    public HpSLCFunction<BInfoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BInfoCB.class);
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
    public HpSLCFunction<BInfoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BInfoCB&gt;() {
     *     public void query(BInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BInfoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BInfoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BInfoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BInfoCQ sq);

    protected BInfoCB xcreateScalarConditionCB() {
        BInfoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BInfoCB xcreateScalarConditionPartitionByCB() {
        BInfoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BInfoCB cb = new BInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BInfoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BInfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BInfoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BInfoCB cb = new BInfoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BInfoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BInfoCB cb = new BInfoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BInfoCQ sq);

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
    protected BInfoCB newMyCB() {
        return new BInfoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BInfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

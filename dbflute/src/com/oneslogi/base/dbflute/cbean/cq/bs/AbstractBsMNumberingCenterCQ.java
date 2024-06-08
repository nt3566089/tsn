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
 * The abstract condition-query of M_NUMBERING_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMNumberingCenterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMNumberingCenterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_NUMBERING_CENTER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterId The value of numberingCenterId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberingCenterId_Equal(Long numberingCenterId) {
        doSetNumberingCenterId_Equal(numberingCenterId);
    }

    protected void doSetNumberingCenterId_Equal(Long numberingCenterId) {
        regNumberingCenterId(CK_EQ, numberingCenterId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterId The value of numberingCenterId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberingCenterId_NotEqual(Long numberingCenterId) {
        doSetNumberingCenterId_NotEqual(numberingCenterId);
    }

    protected void doSetNumberingCenterId_NotEqual(Long numberingCenterId) {
        regNumberingCenterId(CK_NES, numberingCenterId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterId The value of numberingCenterId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberingCenterId_GreaterThan(Long numberingCenterId) {
        regNumberingCenterId(CK_GT, numberingCenterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterId The value of numberingCenterId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberingCenterId_LessThan(Long numberingCenterId) {
        regNumberingCenterId(CK_LT, numberingCenterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterId The value of numberingCenterId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberingCenterId_GreaterEqual(Long numberingCenterId) {
        regNumberingCenterId(CK_GE, numberingCenterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterId The value of numberingCenterId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberingCenterId_LessEqual(Long numberingCenterId) {
        regNumberingCenterId(CK_LE, numberingCenterId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of numberingCenterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numberingCenterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumberingCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumberingCenterId(), "NUMBERING_CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterIdList The collection of numberingCenterId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberingCenterId_InScope(Collection<Long> numberingCenterIdList) {
        doSetNumberingCenterId_InScope(numberingCenterIdList);
    }

    protected void doSetNumberingCenterId_InScope(Collection<Long> numberingCenterIdList) {
        regINS(CK_INS, cTL(numberingCenterIdList), xgetCValueNumberingCenterId(), "NUMBERING_CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param numberingCenterIdList The collection of numberingCenterId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberingCenterId_NotInScope(Collection<Long> numberingCenterIdList) {
        doSetNumberingCenterId_NotInScope(numberingCenterIdList);
    }

    protected void doSetNumberingCenterId_NotInScope(Collection<Long> numberingCenterIdList) {
        regINS(CK_NINS, cTL(numberingCenterIdList), xgetCValueNumberingCenterId(), "NUMBERING_CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setNumberingCenterId_IsNull() { regNumberingCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setNumberingCenterId_IsNotNull() { regNumberingCenterId(CK_ISNN, DOBJ); }

    protected void regNumberingCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberingCenterId(), "NUMBERING_CENTER_ID"); }
    protected abstract ConditionValue xgetCValueNumberingCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_Equal(String bizCd) {
        doSetBizCd_Equal(fRES(bizCd));
    }

    protected void doSetBizCd_Equal(String bizCd) {
        regBizCd(CK_EQ, bizCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_NotEqual(String bizCd) {
        doSetBizCd_NotEqual(fRES(bizCd));
    }

    protected void doSetBizCd_NotEqual(String bizCd) {
        regBizCd(CK_NES, bizCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_GreaterThan(String bizCd) {
        regBizCd(CK_GT, fRES(bizCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_LessThan(String bizCd) {
        regBizCd(CK_LT, fRES(bizCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_GreaterEqual(String bizCd) {
        regBizCd(CK_GE, fRES(bizCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_LessEqual(String bizCd) {
        regBizCd(CK_LE, fRES(bizCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCdList The collection of bizCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_InScope(Collection<String> bizCdList) {
        doSetBizCd_InScope(bizCdList);
    }

    protected void doSetBizCd_InScope(Collection<String> bizCdList) {
        regINS(CK_INS, cTL(bizCdList), xgetCValueBizCd(), "BIZ_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCdList The collection of bizCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_NotInScope(Collection<String> bizCdList) {
        doSetBizCd_NotInScope(bizCdList);
    }

    protected void doSetBizCd_NotInScope(Collection<String> bizCdList) {
        regINS(CK_NINS, cTL(bizCdList), xgetCValueBizCd(), "BIZ_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setBizCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bizCd The value of bizCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBizCd_LikeSearch(String bizCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bizCd), xgetCValueBizCd(), "BIZ_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBizCd_NotLikeSearch(String bizCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bizCd), xgetCValueBizCd(), "BIZ_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @param bizCd The value of bizCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizCd_PrefixSearch(String bizCd) {
        setBizCd_LikeSearch(bizCd, xcLSOPPre());
    }

    protected void regBizCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBizCd(), "BIZ_CD"); }
    protected abstract ConditionValue xgetCValueBizCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_Equal(String bizNm) {
        doSetBizNm_Equal(fRES(bizNm));
    }

    protected void doSetBizNm_Equal(String bizNm) {
        regBizNm(CK_EQ, bizNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_NotEqual(String bizNm) {
        doSetBizNm_NotEqual(fRES(bizNm));
    }

    protected void doSetBizNm_NotEqual(String bizNm) {
        regBizNm(CK_NES, bizNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_GreaterThan(String bizNm) {
        regBizNm(CK_GT, fRES(bizNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_LessThan(String bizNm) {
        regBizNm(CK_LT, fRES(bizNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_GreaterEqual(String bizNm) {
        regBizNm(CK_GE, fRES(bizNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_LessEqual(String bizNm) {
        regBizNm(CK_LE, fRES(bizNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNmList The collection of bizNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_InScope(Collection<String> bizNmList) {
        doSetBizNm_InScope(bizNmList);
    }

    protected void doSetBizNm_InScope(Collection<String> bizNmList) {
        regINS(CK_INS, cTL(bizNmList), xgetCValueBizNm(), "BIZ_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNmList The collection of bizNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_NotInScope(Collection<String> bizNmList) {
        doSetBizNm_NotInScope(bizNmList);
    }

    protected void doSetBizNm_NotInScope(Collection<String> bizNmList) {
        regINS(CK_NINS, cTL(bizNmList), xgetCValueBizNm(), "BIZ_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setBizNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bizNm The value of bizNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBizNm_LikeSearch(String bizNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bizNm), xgetCValueBizNm(), "BIZ_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBizNm_NotLikeSearch(String bizNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bizNm), xgetCValueBizNm(), "BIZ_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @param bizNm The value of bizNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizNm_PrefixSearch(String bizNm) {
        setBizNm_LikeSearch(bizNm, xcLSOPPre());
    }

    protected void regBizNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBizNm(), "BIZ_NM"); }
    protected abstract ConditionValue xgetCValueBizNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param length The value of length as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_Equal(Long length) {
        doSetLength_Equal(length);
    }

    protected void doSetLength_Equal(Long length) {
        regLength(CK_EQ, length);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param length The value of length as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_NotEqual(Long length) {
        doSetLength_NotEqual(length);
    }

    protected void doSetLength_NotEqual(Long length) {
        regLength(CK_NES, length);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param length The value of length as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_GreaterThan(Long length) {
        regLength(CK_GT, length);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param length The value of length as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_LessThan(Long length) {
        regLength(CK_LT, length);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param length The value of length as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_GreaterEqual(Long length) {
        regLength(CK_GE, length);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param length The value of length as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_LessEqual(Long length) {
        regLength(CK_LE, length);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param minNumber The min number of length. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength(), "LENGTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param lengthList The collection of length as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_InScope(Collection<Long> lengthList) {
        doSetLength_InScope(lengthList);
    }

    protected void doSetLength_InScope(Collection<Long> lengthList) {
        regINS(CK_INS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @param lengthList The collection of length as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_NotInScope(Collection<Long> lengthList) {
        doSetLength_NotInScope(lengthList);
    }

    protected void doSetLength_NotInScope(Collection<Long> lengthList) {
        regINS(CK_NINS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    protected void regLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength(), "LENGTH"); }
    protected abstract ConditionValue xgetCValueLength();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_Equal(String fixedValue) {
        doSetFixedValue_Equal(fRES(fixedValue));
    }

    protected void doSetFixedValue_Equal(String fixedValue) {
        regFixedValue(CK_EQ, fixedValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_NotEqual(String fixedValue) {
        doSetFixedValue_NotEqual(fRES(fixedValue));
    }

    protected void doSetFixedValue_NotEqual(String fixedValue) {
        regFixedValue(CK_NES, fixedValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_GreaterThan(String fixedValue) {
        regFixedValue(CK_GT, fRES(fixedValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_LessThan(String fixedValue) {
        regFixedValue(CK_LT, fRES(fixedValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_GreaterEqual(String fixedValue) {
        regFixedValue(CK_GE, fRES(fixedValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_LessEqual(String fixedValue) {
        regFixedValue(CK_LE, fRES(fixedValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValueList The collection of fixedValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_InScope(Collection<String> fixedValueList) {
        doSetFixedValue_InScope(fixedValueList);
    }

    protected void doSetFixedValue_InScope(Collection<String> fixedValueList) {
        regINS(CK_INS, cTL(fixedValueList), xgetCValueFixedValue(), "FIXED_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValueList The collection of fixedValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_NotInScope(Collection<String> fixedValueList) {
        doSetFixedValue_NotInScope(fixedValueList);
    }

    protected void doSetFixedValue_NotInScope(Collection<String> fixedValueList) {
        regINS(CK_NINS, cTL(fixedValueList), xgetCValueFixedValue(), "FIXED_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIXED_VALUE: {varchar(30)} <br>
     * <pre>e.g. setFixedValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fixedValue The value of fixedValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFixedValue_LikeSearch(String fixedValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fixedValue), xgetCValueFixedValue(), "FIXED_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFixedValue_NotLikeSearch(String fixedValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fixedValue), xgetCValueFixedValue(), "FIXED_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     * @param fixedValue The value of fixedValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedValue_PrefixSearch(String fixedValue) {
        setFixedValue_LikeSearch(fixedValue, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     */
    public void setFixedValue_IsNull() { regFixedValue(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     */
    public void setFixedValue_IsNullOrEmpty() { regFixedValue(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIXED_VALUE: {varchar(30)}
     */
    public void setFixedValue_IsNotNull() { regFixedValue(CK_ISNN, DOBJ); }

    protected void regFixedValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFixedValue(), "FIXED_VALUE"); }
    protected abstract ConditionValue xgetCValueFixedValue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_Equal(String fixedDtFormat) {
        doSetFixedDtFormat_Equal(fRES(fixedDtFormat));
    }

    protected void doSetFixedDtFormat_Equal(String fixedDtFormat) {
        regFixedDtFormat(CK_EQ, fixedDtFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_NotEqual(String fixedDtFormat) {
        doSetFixedDtFormat_NotEqual(fRES(fixedDtFormat));
    }

    protected void doSetFixedDtFormat_NotEqual(String fixedDtFormat) {
        regFixedDtFormat(CK_NES, fixedDtFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_GreaterThan(String fixedDtFormat) {
        regFixedDtFormat(CK_GT, fRES(fixedDtFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_LessThan(String fixedDtFormat) {
        regFixedDtFormat(CK_LT, fRES(fixedDtFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_GreaterEqual(String fixedDtFormat) {
        regFixedDtFormat(CK_GE, fRES(fixedDtFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_LessEqual(String fixedDtFormat) {
        regFixedDtFormat(CK_LE, fRES(fixedDtFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormatList The collection of fixedDtFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_InScope(Collection<String> fixedDtFormatList) {
        doSetFixedDtFormat_InScope(fixedDtFormatList);
    }

    protected void doSetFixedDtFormat_InScope(Collection<String> fixedDtFormatList) {
        regINS(CK_INS, cTL(fixedDtFormatList), xgetCValueFixedDtFormat(), "FIXED_DT_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormatList The collection of fixedDtFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_NotInScope(Collection<String> fixedDtFormatList) {
        doSetFixedDtFormat_NotInScope(fixedDtFormatList);
    }

    protected void doSetFixedDtFormat_NotInScope(Collection<String> fixedDtFormatList) {
        regINS(CK_NINS, cTL(fixedDtFormatList), xgetCValueFixedDtFormat(), "FIXED_DT_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setFixedDtFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fixedDtFormat The value of fixedDtFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFixedDtFormat_LikeSearch(String fixedDtFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fixedDtFormat), xgetCValueFixedDtFormat(), "FIXED_DT_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFixedDtFormat_NotLikeSearch(String fixedDtFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fixedDtFormat), xgetCValueFixedDtFormat(), "FIXED_DT_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @param fixedDtFormat The value of fixedDtFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedDtFormat_PrefixSearch(String fixedDtFormat) {
        setFixedDtFormat_LikeSearch(fixedDtFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     */
    public void setFixedDtFormat_IsNull() { regFixedDtFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     */
    public void setFixedDtFormat_IsNullOrEmpty() { regFixedDtFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     */
    public void setFixedDtFormat_IsNotNull() { regFixedDtFormat(CK_ISNN, DOBJ); }

    protected void regFixedDtFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFixedDtFormat(), "FIXED_DT_FORMAT"); }
    protected abstract ConditionValue xgetCValueFixedDtFormat();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumber The value of presentNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresentNumber_Equal(Long presentNumber) {
        doSetPresentNumber_Equal(presentNumber);
    }

    protected void doSetPresentNumber_Equal(Long presentNumber) {
        regPresentNumber(CK_EQ, presentNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumber The value of presentNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresentNumber_NotEqual(Long presentNumber) {
        doSetPresentNumber_NotEqual(presentNumber);
    }

    protected void doSetPresentNumber_NotEqual(Long presentNumber) {
        regPresentNumber(CK_NES, presentNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumber The value of presentNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresentNumber_GreaterThan(Long presentNumber) {
        regPresentNumber(CK_GT, presentNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumber The value of presentNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresentNumber_LessThan(Long presentNumber) {
        regPresentNumber(CK_LT, presentNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumber The value of presentNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresentNumber_GreaterEqual(Long presentNumber) {
        regPresentNumber(CK_GE, presentNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumber The value of presentNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresentNumber_LessEqual(Long presentNumber) {
        regPresentNumber(CK_LE, presentNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The min number of presentNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presentNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresentNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresentNumber(), "PRESENT_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumberList The collection of presentNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresentNumber_InScope(Collection<Long> presentNumberList) {
        doSetPresentNumber_InScope(presentNumberList);
    }

    protected void doSetPresentNumber_InScope(Collection<Long> presentNumberList) {
        regINS(CK_INS, cTL(presentNumberList), xgetCValuePresentNumber(), "PRESENT_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @param presentNumberList The collection of presentNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresentNumber_NotInScope(Collection<Long> presentNumberList) {
        doSetPresentNumber_NotInScope(presentNumberList);
    }

    protected void doSetPresentNumber_NotInScope(Collection<Long> presentNumberList) {
        regINS(CK_NINS, cTL(presentNumberList), xgetCValuePresentNumber(), "PRESENT_NUMBER");
    }

    protected void regPresentNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresentNumber(), "PRESENT_NUMBER"); }
    protected abstract ConditionValue xgetCValuePresentNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumber The value of incNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncNumber_Equal(Long incNumber) {
        doSetIncNumber_Equal(incNumber);
    }

    protected void doSetIncNumber_Equal(Long incNumber) {
        regIncNumber(CK_EQ, incNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumber The value of incNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncNumber_NotEqual(Long incNumber) {
        doSetIncNumber_NotEqual(incNumber);
    }

    protected void doSetIncNumber_NotEqual(Long incNumber) {
        regIncNumber(CK_NES, incNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumber The value of incNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncNumber_GreaterThan(Long incNumber) {
        regIncNumber(CK_GT, incNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumber The value of incNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncNumber_LessThan(Long incNumber) {
        regIncNumber(CK_LT, incNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumber The value of incNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncNumber_GreaterEqual(Long incNumber) {
        regIncNumber(CK_GE, incNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumber The value of incNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncNumber_LessEqual(Long incNumber) {
        regIncNumber(CK_LE, incNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The min number of incNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of incNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIncNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIncNumber(), "INC_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumberList The collection of incNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIncNumber_InScope(Collection<Long> incNumberList) {
        doSetIncNumber_InScope(incNumberList);
    }

    protected void doSetIncNumber_InScope(Collection<Long> incNumberList) {
        regINS(CK_INS, cTL(incNumberList), xgetCValueIncNumber(), "INC_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @param incNumberList The collection of incNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIncNumber_NotInScope(Collection<Long> incNumberList) {
        doSetIncNumber_NotInScope(incNumberList);
    }

    protected void doSetIncNumber_NotInScope(Collection<Long> incNumberList) {
        regINS(CK_NINS, cTL(incNumberList), xgetCValueIncNumber(), "INC_NUMBER");
    }

    protected void regIncNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncNumber(), "INC_NUMBER"); }
    protected abstract ConditionValue xgetCValueIncNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The value of minNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_Equal(Long minNumber) {
        doSetMinNumber_Equal(minNumber);
    }

    protected void doSetMinNumber_Equal(Long minNumber) {
        regMinNumber(CK_EQ, minNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The value of minNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_NotEqual(Long minNumber) {
        doSetMinNumber_NotEqual(minNumber);
    }

    protected void doSetMinNumber_NotEqual(Long minNumber) {
        regMinNumber(CK_NES, minNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The value of minNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_GreaterThan(Long minNumber) {
        regMinNumber(CK_GT, minNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The value of minNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_LessThan(Long minNumber) {
        regMinNumber(CK_LT, minNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The value of minNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_GreaterEqual(Long minNumber) {
        regMinNumber(CK_GE, minNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The value of minNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_LessEqual(Long minNumber) {
        regMinNumber(CK_LE, minNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The min number of minNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinNumber(), "MIN_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumberList The collection of minNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinNumber_InScope(Collection<Long> minNumberList) {
        doSetMinNumber_InScope(minNumberList);
    }

    protected void doSetMinNumber_InScope(Collection<Long> minNumberList) {
        regINS(CK_INS, cTL(minNumberList), xgetCValueMinNumber(), "MIN_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @param minNumberList The collection of minNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinNumber_NotInScope(Collection<Long> minNumberList) {
        doSetMinNumber_NotInScope(minNumberList);
    }

    protected void doSetMinNumber_NotInScope(Collection<Long> minNumberList) {
        regINS(CK_NINS, cTL(minNumberList), xgetCValueMinNumber(), "MIN_NUMBER");
    }

    protected void regMinNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinNumber(), "MIN_NUMBER"); }
    protected abstract ConditionValue xgetCValueMinNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumber The value of maxNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_Equal(Long maxNumber) {
        doSetMaxNumber_Equal(maxNumber);
    }

    protected void doSetMaxNumber_Equal(Long maxNumber) {
        regMaxNumber(CK_EQ, maxNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumber The value of maxNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_NotEqual(Long maxNumber) {
        doSetMaxNumber_NotEqual(maxNumber);
    }

    protected void doSetMaxNumber_NotEqual(Long maxNumber) {
        regMaxNumber(CK_NES, maxNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumber The value of maxNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_GreaterThan(Long maxNumber) {
        regMaxNumber(CK_GT, maxNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumber The value of maxNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_LessThan(Long maxNumber) {
        regMaxNumber(CK_LT, maxNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumber The value of maxNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_GreaterEqual(Long maxNumber) {
        regMaxNumber(CK_GE, maxNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumber The value of maxNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_LessEqual(Long maxNumber) {
        regMaxNumber(CK_LE, maxNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param minNumber The min number of maxNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxNumber(), "MAX_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumberList The collection of maxNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxNumber_InScope(Collection<Long> maxNumberList) {
        doSetMaxNumber_InScope(maxNumberList);
    }

    protected void doSetMaxNumber_InScope(Collection<Long> maxNumberList) {
        regINS(CK_INS, cTL(maxNumberList), xgetCValueMaxNumber(), "MAX_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @param maxNumberList The collection of maxNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxNumber_NotInScope(Collection<Long> maxNumberList) {
        doSetMaxNumber_NotInScope(maxNumberList);
    }

    protected void doSetMaxNumber_NotInScope(Collection<Long> maxNumberList) {
        regINS(CK_NINS, cTL(maxNumberList), xgetCValueMaxNumber(), "MAX_NUMBER");
    }

    protected void regMaxNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxNumber(), "MAX_NUMBER"); }
    protected abstract ConditionValue xgetCValueMaxNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @param checkDigit The value of checkDigit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCheckDigit_Equal(String checkDigit) {
        doSetCheckDigit_Equal(fRES(checkDigit));
    }

    /**
     * Equal(=). As CheckDigit. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCheckDigit_Equal_AsCheckDigit(CDef.CheckDigit cdef) {
        doSetCheckDigit_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: チェックディジット無
     */
    public void setCheckDigit_Equal_$0() {
        setCheckDigit_Equal_AsCheckDigit(CDef.CheckDigit.$0);
    }

    /**
     * Equal(=). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 7DR方式
     */
    public void setCheckDigit_Equal_$7() {
        setCheckDigit_Equal_AsCheckDigit(CDef.CheckDigit.$7);
    }

    protected void doSetCheckDigit_Equal(String checkDigit) {
        regCheckDigit(CK_EQ, checkDigit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @param checkDigit The value of checkDigit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCheckDigit_NotEqual(String checkDigit) {
        doSetCheckDigit_NotEqual(fRES(checkDigit));
    }

    /**
     * NotEqual(&lt;&gt;). As CheckDigit. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCheckDigit_NotEqual_AsCheckDigit(CDef.CheckDigit cdef) {
        doSetCheckDigit_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: チェックディジット無
     */
    public void setCheckDigit_NotEqual_$0() {
        setCheckDigit_NotEqual_AsCheckDigit(CDef.CheckDigit.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 7DR方式
     */
    public void setCheckDigit_NotEqual_$7() {
        setCheckDigit_NotEqual_AsCheckDigit(CDef.CheckDigit.$7);
    }

    protected void doSetCheckDigit_NotEqual(String checkDigit) {
        regCheckDigit(CK_NES, checkDigit);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @param checkDigitList The collection of checkDigit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCheckDigit_InScope(Collection<String> checkDigitList) {
        doSetCheckDigit_InScope(checkDigitList);
    }

    /**
     * InScope {in ('a', 'b')}. As CheckDigit. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCheckDigit_InScope_AsCheckDigit(Collection<CDef.CheckDigit> cdefList) {
        doSetCheckDigit_InScope(cTStrL(cdefList));
    }

    protected void doSetCheckDigit_InScope(Collection<String> checkDigitList) {
        regINS(CK_INS, cTL(checkDigitList), xgetCValueCheckDigit(), "CHECK_DIGIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @param checkDigitList The collection of checkDigit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCheckDigit_NotInScope(Collection<String> checkDigitList) {
        doSetCheckDigit_NotInScope(checkDigitList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CheckDigit. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCheckDigit_NotInScope_AsCheckDigit(Collection<CDef.CheckDigit> cdefList) {
        doSetCheckDigit_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCheckDigit_NotInScope(Collection<String> checkDigitList) {
        regINS(CK_NINS, cTL(checkDigitList), xgetCValueCheckDigit(), "CHECK_DIGIT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     */
    public void setCheckDigit_IsNull() { regCheckDigit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     */
    public void setCheckDigit_IsNullOrEmpty() { regCheckDigit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     */
    public void setCheckDigit_IsNotNull() { regCheckDigit(CK_ISNN, DOBJ); }

    protected void regCheckDigit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCheckDigit(), "CHECK_DIGIT"); }
    protected abstract ConditionValue xgetCValueCheckDigit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCount The value of cashCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCashCount_Equal(Long cashCount) {
        doSetCashCount_Equal(cashCount);
    }

    protected void doSetCashCount_Equal(Long cashCount) {
        regCashCount(CK_EQ, cashCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCount The value of cashCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCashCount_NotEqual(Long cashCount) {
        doSetCashCount_NotEqual(cashCount);
    }

    protected void doSetCashCount_NotEqual(Long cashCount) {
        regCashCount(CK_NES, cashCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCount The value of cashCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCashCount_GreaterThan(Long cashCount) {
        regCashCount(CK_GT, cashCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCount The value of cashCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCashCount_LessThan(Long cashCount) {
        regCashCount(CK_LT, cashCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCount The value of cashCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCashCount_GreaterEqual(Long cashCount) {
        regCashCount(CK_GE, cashCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCount The value of cashCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCashCount_LessEqual(Long cashCount) {
        regCashCount(CK_LE, cashCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param minNumber The min number of cashCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cashCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCashCount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCashCount(), "CASH_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCountList The collection of cashCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCashCount_InScope(Collection<Long> cashCountList) {
        doSetCashCount_InScope(cashCountList);
    }

    protected void doSetCashCount_InScope(Collection<Long> cashCountList) {
        regINS(CK_INS, cTL(cashCountList), xgetCValueCashCount(), "CASH_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @param cashCountList The collection of cashCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCashCount_NotInScope(Collection<Long> cashCountList) {
        doSetCashCount_NotInScope(cashCountList);
    }

    protected void doSetCashCount_NotInScope(Collection<Long> cashCountList) {
        regINS(CK_NINS, cTL(cashCountList), xgetCValueCashCount(), "CASH_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     */
    public void setCashCount_IsNull() { regCashCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     */
    public void setCashCount_IsNotNull() { regCashCount(CK_ISNN, DOBJ); }

    protected void regCashCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCashCount(), "CASH_COUNT"); }
    protected abstract ConditionValue xgetCValueCashCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     * @param userEditable The value of userEditable as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserEditable_Equal(String userEditable) {
        doSetUserEditable_Equal(fRES(userEditable));
    }

    /**
     * Equal(=). As UserEditable. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable} <br>
     * ユーザ編集可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUserEditable_Equal_AsUserEditable(CDef.UserEditable cdef) {
        doSetUserEditable_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 否
     */
    public void setUserEditable_Equal_$0() {
        setUserEditable_Equal_AsUserEditable(CDef.UserEditable.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可
     */
    public void setUserEditable_Equal_$1() {
        setUserEditable_Equal_AsUserEditable(CDef.UserEditable.$1);
    }

    protected void doSetUserEditable_Equal(String userEditable) {
        regUserEditable(CK_EQ, userEditable);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     * @param userEditable The value of userEditable as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserEditable_NotEqual(String userEditable) {
        doSetUserEditable_NotEqual(fRES(userEditable));
    }

    /**
     * NotEqual(&lt;&gt;). As UserEditable. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable} <br>
     * ユーザ編集可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUserEditable_NotEqual_AsUserEditable(CDef.UserEditable cdef) {
        doSetUserEditable_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 否
     */
    public void setUserEditable_NotEqual_$0() {
        setUserEditable_NotEqual_AsUserEditable(CDef.UserEditable.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可
     */
    public void setUserEditable_NotEqual_$1() {
        setUserEditable_NotEqual_AsUserEditable(CDef.UserEditable.$1);
    }

    protected void doSetUserEditable_NotEqual(String userEditable) {
        regUserEditable(CK_NES, userEditable);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     * @param userEditableList The collection of userEditable as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserEditable_InScope(Collection<String> userEditableList) {
        doSetUserEditable_InScope(userEditableList);
    }

    /**
     * InScope {in ('a', 'b')}. As UserEditable. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable} <br>
     * ユーザ編集可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserEditable_InScope_AsUserEditable(Collection<CDef.UserEditable> cdefList) {
        doSetUserEditable_InScope(cTStrL(cdefList));
    }

    protected void doSetUserEditable_InScope(Collection<String> userEditableList) {
        regINS(CK_INS, cTL(userEditableList), xgetCValueUserEditable(), "USER_EDITABLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     * @param userEditableList The collection of userEditable as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserEditable_NotInScope(Collection<String> userEditableList) {
        doSetUserEditable_NotInScope(userEditableList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UserEditable. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable} <br>
     * ユーザ編集可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserEditable_NotInScope_AsUserEditable(Collection<CDef.UserEditable> cdefList) {
        doSetUserEditable_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUserEditable_NotInScope(Collection<String> userEditableList) {
        regINS(CK_NINS, cTL(userEditableList), xgetCValueUserEditable(), "USER_EDITABLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     */
    public void setUserEditable_IsNull() { regUserEditable(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     */
    public void setUserEditable_IsNotNull() { regUserEditable(CK_ISNN, DOBJ); }

    protected void regUserEditable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserEditable(), "USER_EDITABLE"); }
    protected abstract ConditionValue xgetCValueUserEditable();

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
    public HpSLCFunction<MNumberingCenterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MNumberingCenterCB.class);
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
    public HpSLCFunction<MNumberingCenterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MNumberingCenterCB.class);
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
    public HpSLCFunction<MNumberingCenterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MNumberingCenterCB.class);
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
    public HpSLCFunction<MNumberingCenterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MNumberingCenterCB.class);
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
    public HpSLCFunction<MNumberingCenterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MNumberingCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MNumberingCenterCB&gt;() {
     *     public void query(MNumberingCenterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MNumberingCenterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MNumberingCenterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MNumberingCenterCQ sq);

    protected MNumberingCenterCB xcreateScalarConditionCB() {
        MNumberingCenterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MNumberingCenterCB xcreateScalarConditionPartitionByCB() {
        MNumberingCenterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MNumberingCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NUMBERING_CENTER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MNumberingCenterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MNumberingCenterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MNumberingCenterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NUMBERING_CENTER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MNumberingCenterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MNumberingCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MNumberingCenterCQ sq);

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
    protected MNumberingCenterCB newMyCB() {
        return new MNumberingCenterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MNumberingCenterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

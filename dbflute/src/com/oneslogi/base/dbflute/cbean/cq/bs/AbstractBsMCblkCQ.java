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
 * The abstract condition-query of M_CBLK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCblkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCblkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CBLK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkId The value of cblkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCblkId_Equal(Long cblkId) {
        doSetCblkId_Equal(cblkId);
    }

    protected void doSetCblkId_Equal(Long cblkId) {
        regCblkId(CK_EQ, cblkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkId The value of cblkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCblkId_NotEqual(Long cblkId) {
        doSetCblkId_NotEqual(cblkId);
    }

    protected void doSetCblkId_NotEqual(Long cblkId) {
        regCblkId(CK_NES, cblkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkId The value of cblkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCblkId_GreaterThan(Long cblkId) {
        regCblkId(CK_GT, cblkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkId The value of cblkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCblkId_LessThan(Long cblkId) {
        regCblkId(CK_LT, cblkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkId The value of cblkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCblkId_GreaterEqual(Long cblkId) {
        regCblkId(CK_GE, cblkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkId The value of cblkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCblkId_LessEqual(Long cblkId) {
        regCblkId(CK_LE, cblkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of cblkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cblkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCblkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCblkId(), "CBLK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkIdList The collection of cblkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCblkId_InScope(Collection<Long> cblkIdList) {
        doSetCblkId_InScope(cblkIdList);
    }

    protected void doSetCblkId_InScope(Collection<Long> cblkIdList) {
        regINS(CK_INS, cTL(cblkIdList), xgetCValueCblkId(), "CBLK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cblkIdList The collection of cblkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCblkId_NotInScope(Collection<Long> cblkIdList) {
        doSetCblkId_NotInScope(cblkIdList);
    }

    protected void doSetCblkId_NotInScope(Collection<Long> cblkIdList) {
        regINS(CK_NINS, cTL(cblkIdList), xgetCValueCblkId(), "CBLK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCblkId_IsNull() { regCblkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCblkId_IsNotNull() { regCblkId(CK_ISNN, DOBJ); }

    protected void regCblkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCblkId(), "CBLK_ID"); }
    protected abstract ConditionValue xgetCValueCblkId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_Equal(String blkcd) {
        doSetBlkcd_Equal(fRES(blkcd));
    }

    protected void doSetBlkcd_Equal(String blkcd) {
        regBlkcd(CK_EQ, blkcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_NotEqual(String blkcd) {
        doSetBlkcd_NotEqual(fRES(blkcd));
    }

    protected void doSetBlkcd_NotEqual(String blkcd) {
        regBlkcd(CK_NES, blkcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_GreaterThan(String blkcd) {
        regBlkcd(CK_GT, fRES(blkcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_LessThan(String blkcd) {
        regBlkcd(CK_LT, fRES(blkcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_GreaterEqual(String blkcd) {
        regBlkcd(CK_GE, fRES(blkcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_LessEqual(String blkcd) {
        regBlkcd(CK_LE, fRES(blkcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcdList The collection of blkcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_InScope(Collection<String> blkcdList) {
        doSetBlkcd_InScope(blkcdList);
    }

    protected void doSetBlkcd_InScope(Collection<String> blkcdList) {
        regINS(CK_INS, cTL(blkcdList), xgetCValueBlkcd(), "BLKCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcdList The collection of blkcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_NotInScope(Collection<String> blkcdList) {
        doSetBlkcd_NotInScope(blkcdList);
    }

    protected void doSetBlkcd_NotInScope(Collection<String> blkcdList) {
        regINS(CK_NINS, cTL(blkcdList), xgetCValueBlkcd(), "BLKCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setBlkcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blkcd The value of blkcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlkcd_LikeSearch(String blkcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blkcd), xgetCValueBlkcd(), "BLKCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlkcd_NotLikeSearch(String blkcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blkcd), xgetCValueBlkcd(), "BLKCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_PrefixSearch(String blkcd) {
        setBlkcd_LikeSearch(blkcd, xcLSOPPre());
    }

    protected void regBlkcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlkcd(), "BLKCD"); }
    protected abstract ConditionValue xgetCValueBlkcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_Equal(String blknm) {
        doSetBlknm_Equal(fRES(blknm));
    }

    protected void doSetBlknm_Equal(String blknm) {
        regBlknm(CK_EQ, blknm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_NotEqual(String blknm) {
        doSetBlknm_NotEqual(fRES(blknm));
    }

    protected void doSetBlknm_NotEqual(String blknm) {
        regBlknm(CK_NES, blknm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_GreaterThan(String blknm) {
        regBlknm(CK_GT, fRES(blknm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_LessThan(String blknm) {
        regBlknm(CK_LT, fRES(blknm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_GreaterEqual(String blknm) {
        regBlknm(CK_GE, fRES(blknm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_LessEqual(String blknm) {
        regBlknm(CK_LE, fRES(blknm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknmList The collection of blknm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_InScope(Collection<String> blknmList) {
        doSetBlknm_InScope(blknmList);
    }

    protected void doSetBlknm_InScope(Collection<String> blknmList) {
        regINS(CK_INS, cTL(blknmList), xgetCValueBlknm(), "BLKNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknmList The collection of blknm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_NotInScope(Collection<String> blknmList) {
        doSetBlknm_NotInScope(blknmList);
    }

    protected void doSetBlknm_NotInScope(Collection<String> blknmList) {
        regINS(CK_NINS, cTL(blknmList), xgetCValueBlknm(), "BLKNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKNM: {varchar(30)} <br>
     * <pre>e.g. setBlknm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blknm The value of blknm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlknm_LikeSearch(String blknm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blknm), xgetCValueBlknm(), "BLKNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlknm_NotLikeSearch(String blknm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blknm), xgetCValueBlknm(), "BLKNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKNM: {varchar(30)}
     * @param blknm The value of blknm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlknm_PrefixSearch(String blknm) {
        setBlknm_LikeSearch(blknm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     */
    public void setBlknm_IsNull() { regBlknm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     */
    public void setBlknm_IsNullOrEmpty() { regBlknm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLKNM: {varchar(30)}
     */
    public void setBlknm_IsNotNull() { regBlknm(CK_ISNN, DOBJ); }

    protected void regBlknm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlknm(), "BLKNM"); }
    protected abstract ConditionValue xgetCValueBlknm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_Equal(String srdtlmkfg) {
        doSetSrdtlmkfg_Equal(fRES(srdtlmkfg));
    }

    protected void doSetSrdtlmkfg_Equal(String srdtlmkfg) {
        regSrdtlmkfg(CK_EQ, srdtlmkfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_NotEqual(String srdtlmkfg) {
        doSetSrdtlmkfg_NotEqual(fRES(srdtlmkfg));
    }

    protected void doSetSrdtlmkfg_NotEqual(String srdtlmkfg) {
        regSrdtlmkfg(CK_NES, srdtlmkfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_GreaterThan(String srdtlmkfg) {
        regSrdtlmkfg(CK_GT, fRES(srdtlmkfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_LessThan(String srdtlmkfg) {
        regSrdtlmkfg(CK_LT, fRES(srdtlmkfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_GreaterEqual(String srdtlmkfg) {
        regSrdtlmkfg(CK_GE, fRES(srdtlmkfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_LessEqual(String srdtlmkfg) {
        regSrdtlmkfg(CK_LE, fRES(srdtlmkfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfgList The collection of srdtlmkfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_InScope(Collection<String> srdtlmkfgList) {
        doSetSrdtlmkfg_InScope(srdtlmkfgList);
    }

    protected void doSetSrdtlmkfg_InScope(Collection<String> srdtlmkfgList) {
        regINS(CK_INS, cTL(srdtlmkfgList), xgetCValueSrdtlmkfg(), "SRDTLMKFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfgList The collection of srdtlmkfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_NotInScope(Collection<String> srdtlmkfgList) {
        doSetSrdtlmkfg_NotInScope(srdtlmkfgList);
    }

    protected void doSetSrdtlmkfg_NotInScope(Collection<String> srdtlmkfgList) {
        regINS(CK_NINS, cTL(srdtlmkfgList), xgetCValueSrdtlmkfg(), "SRDTLMKFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDTLMKFG: {char(1)} <br>
     * <pre>e.g. setSrdtlmkfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srdtlmkfg The value of srdtlmkfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrdtlmkfg_LikeSearch(String srdtlmkfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srdtlmkfg), xgetCValueSrdtlmkfg(), "SRDTLMKFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrdtlmkfg_NotLikeSearch(String srdtlmkfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srdtlmkfg), xgetCValueSrdtlmkfg(), "SRDTLMKFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDTLMKFG: {char(1)}
     * @param srdtlmkfg The value of srdtlmkfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdtlmkfg_PrefixSearch(String srdtlmkfg) {
        setSrdtlmkfg_LikeSearch(srdtlmkfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     */
    public void setSrdtlmkfg_IsNull() { regSrdtlmkfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDTLMKFG: {char(1)}
     */
    public void setSrdtlmkfg_IsNotNull() { regSrdtlmkfg(CK_ISNN, DOBJ); }

    protected void regSrdtlmkfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrdtlmkfg(), "SRDTLMKFG"); }
    protected abstract ConditionValue xgetCValueSrdtlmkfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_Equal(String aminpfg) {
        doSetAminpfg_Equal(fRES(aminpfg));
    }

    protected void doSetAminpfg_Equal(String aminpfg) {
        regAminpfg(CK_EQ, aminpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_NotEqual(String aminpfg) {
        doSetAminpfg_NotEqual(fRES(aminpfg));
    }

    protected void doSetAminpfg_NotEqual(String aminpfg) {
        regAminpfg(CK_NES, aminpfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_GreaterThan(String aminpfg) {
        regAminpfg(CK_GT, fRES(aminpfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_LessThan(String aminpfg) {
        regAminpfg(CK_LT, fRES(aminpfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_GreaterEqual(String aminpfg) {
        regAminpfg(CK_GE, fRES(aminpfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_LessEqual(String aminpfg) {
        regAminpfg(CK_LE, fRES(aminpfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfgList The collection of aminpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_InScope(Collection<String> aminpfgList) {
        doSetAminpfg_InScope(aminpfgList);
    }

    protected void doSetAminpfg_InScope(Collection<String> aminpfgList) {
        regINS(CK_INS, cTL(aminpfgList), xgetCValueAminpfg(), "AMINPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfgList The collection of aminpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_NotInScope(Collection<String> aminpfgList) {
        doSetAminpfg_NotInScope(aminpfgList);
    }

    protected void doSetAminpfg_NotInScope(Collection<String> aminpfgList) {
        regINS(CK_NINS, cTL(aminpfgList), xgetCValueAminpfg(), "AMINPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMINPFG: {char(1)} <br>
     * <pre>e.g. setAminpfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aminpfg The value of aminpfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAminpfg_LikeSearch(String aminpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aminpfg), xgetCValueAminpfg(), "AMINPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAminpfg_NotLikeSearch(String aminpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aminpfg), xgetCValueAminpfg(), "AMINPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMINPFG: {char(1)}
     * @param aminpfg The value of aminpfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAminpfg_PrefixSearch(String aminpfg) {
        setAminpfg_LikeSearch(aminpfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     */
    public void setAminpfg_IsNull() { regAminpfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMINPFG: {char(1)}
     */
    public void setAminpfg_IsNotNull() { regAminpfg(CK_ISNN, DOBJ); }

    protected void regAminpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAminpfg(), "AMINPFG"); }
    protected abstract ConditionValue xgetCValueAminpfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_Equal(String lblmkfg) {
        doSetLblmkfg_Equal(fRES(lblmkfg));
    }

    protected void doSetLblmkfg_Equal(String lblmkfg) {
        regLblmkfg(CK_EQ, lblmkfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_NotEqual(String lblmkfg) {
        doSetLblmkfg_NotEqual(fRES(lblmkfg));
    }

    protected void doSetLblmkfg_NotEqual(String lblmkfg) {
        regLblmkfg(CK_NES, lblmkfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_GreaterThan(String lblmkfg) {
        regLblmkfg(CK_GT, fRES(lblmkfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_LessThan(String lblmkfg) {
        regLblmkfg(CK_LT, fRES(lblmkfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_GreaterEqual(String lblmkfg) {
        regLblmkfg(CK_GE, fRES(lblmkfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_LessEqual(String lblmkfg) {
        regLblmkfg(CK_LE, fRES(lblmkfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfgList The collection of lblmkfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_InScope(Collection<String> lblmkfgList) {
        doSetLblmkfg_InScope(lblmkfgList);
    }

    protected void doSetLblmkfg_InScope(Collection<String> lblmkfgList) {
        regINS(CK_INS, cTL(lblmkfgList), xgetCValueLblmkfg(), "LBLMKFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfgList The collection of lblmkfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_NotInScope(Collection<String> lblmkfgList) {
        doSetLblmkfg_NotInScope(lblmkfgList);
    }

    protected void doSetLblmkfg_NotInScope(Collection<String> lblmkfgList) {
        regINS(CK_NINS, cTL(lblmkfgList), xgetCValueLblmkfg(), "LBLMKFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LBLMKFG: {char(1)} <br>
     * <pre>e.g. setLblmkfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lblmkfg The value of lblmkfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLblmkfg_LikeSearch(String lblmkfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lblmkfg), xgetCValueLblmkfg(), "LBLMKFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLblmkfg_NotLikeSearch(String lblmkfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lblmkfg), xgetCValueLblmkfg(), "LBLMKFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LBLMKFG: {char(1)}
     * @param lblmkfg The value of lblmkfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLblmkfg_PrefixSearch(String lblmkfg) {
        setLblmkfg_LikeSearch(lblmkfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     */
    public void setLblmkfg_IsNull() { regLblmkfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBLMKFG: {char(1)}
     */
    public void setLblmkfg_IsNotNull() { regLblmkfg(CK_ISNN, DOBJ); }

    protected void regLblmkfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLblmkfg(), "LBLMKFG"); }
    protected abstract ConditionValue xgetCValueLblmkfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_Equal(String lbldfg) {
        doSetLbldfg_Equal(fRES(lbldfg));
    }

    protected void doSetLbldfg_Equal(String lbldfg) {
        regLbldfg(CK_EQ, lbldfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_NotEqual(String lbldfg) {
        doSetLbldfg_NotEqual(fRES(lbldfg));
    }

    protected void doSetLbldfg_NotEqual(String lbldfg) {
        regLbldfg(CK_NES, lbldfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_GreaterThan(String lbldfg) {
        regLbldfg(CK_GT, fRES(lbldfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_LessThan(String lbldfg) {
        regLbldfg(CK_LT, fRES(lbldfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_GreaterEqual(String lbldfg) {
        regLbldfg(CK_GE, fRES(lbldfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_LessEqual(String lbldfg) {
        regLbldfg(CK_LE, fRES(lbldfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfgList The collection of lbldfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_InScope(Collection<String> lbldfgList) {
        doSetLbldfg_InScope(lbldfgList);
    }

    protected void doSetLbldfg_InScope(Collection<String> lbldfgList) {
        regINS(CK_INS, cTL(lbldfgList), xgetCValueLbldfg(), "LBLDFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfgList The collection of lbldfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_NotInScope(Collection<String> lbldfgList) {
        doSetLbldfg_NotInScope(lbldfgList);
    }

    protected void doSetLbldfg_NotInScope(Collection<String> lbldfgList) {
        regINS(CK_NINS, cTL(lbldfgList), xgetCValueLbldfg(), "LBLDFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LBLDFG: {char(1)} <br>
     * <pre>e.g. setLbldfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lbldfg The value of lbldfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLbldfg_LikeSearch(String lbldfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lbldfg), xgetCValueLbldfg(), "LBLDFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLbldfg_NotLikeSearch(String lbldfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lbldfg), xgetCValueLbldfg(), "LBLDFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LBLDFG: {char(1)}
     * @param lbldfg The value of lbldfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbldfg_PrefixSearch(String lbldfg) {
        setLbldfg_LikeSearch(lbldfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     */
    public void setLbldfg_IsNull() { regLbldfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBLDFG: {char(1)}
     */
    public void setLbldfg_IsNotNull() { regLbldfg(CK_ISNN, DOBJ); }

    protected void regLbldfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbldfg(), "LBLDFG"); }
    protected abstract ConditionValue xgetCValueLbldfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_Equal(String bcddfg) {
        doSetBcddfg_Equal(fRES(bcddfg));
    }

    protected void doSetBcddfg_Equal(String bcddfg) {
        regBcddfg(CK_EQ, bcddfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_NotEqual(String bcddfg) {
        doSetBcddfg_NotEqual(fRES(bcddfg));
    }

    protected void doSetBcddfg_NotEqual(String bcddfg) {
        regBcddfg(CK_NES, bcddfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_GreaterThan(String bcddfg) {
        regBcddfg(CK_GT, fRES(bcddfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_LessThan(String bcddfg) {
        regBcddfg(CK_LT, fRES(bcddfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_GreaterEqual(String bcddfg) {
        regBcddfg(CK_GE, fRES(bcddfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_LessEqual(String bcddfg) {
        regBcddfg(CK_LE, fRES(bcddfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfgList The collection of bcddfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_InScope(Collection<String> bcddfgList) {
        doSetBcddfg_InScope(bcddfgList);
    }

    protected void doSetBcddfg_InScope(Collection<String> bcddfgList) {
        regINS(CK_INS, cTL(bcddfgList), xgetCValueBcddfg(), "BCDDFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfgList The collection of bcddfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_NotInScope(Collection<String> bcddfgList) {
        doSetBcddfg_NotInScope(bcddfgList);
    }

    protected void doSetBcddfg_NotInScope(Collection<String> bcddfgList) {
        regINS(CK_NINS, cTL(bcddfgList), xgetCValueBcddfg(), "BCDDFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCDDFG: {char(1)} <br>
     * <pre>e.g. setBcddfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bcddfg The value of bcddfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBcddfg_LikeSearch(String bcddfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bcddfg), xgetCValueBcddfg(), "BCDDFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBcddfg_NotLikeSearch(String bcddfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bcddfg), xgetCValueBcddfg(), "BCDDFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCDDFG: {char(1)}
     * @param bcddfg The value of bcddfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBcddfg_PrefixSearch(String bcddfg) {
        setBcddfg_LikeSearch(bcddfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     */
    public void setBcddfg_IsNull() { regBcddfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BCDDFG: {char(1)}
     */
    public void setBcddfg_IsNotNull() { regBcddfg(CK_ISNN, DOBJ); }

    protected void regBcddfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBcddfg(), "BCDDFG"); }
    protected abstract ConditionValue xgetCValueBcddfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_Equal(String locidfrnk) {
        doSetLocidfrnk_Equal(fRES(locidfrnk));
    }

    protected void doSetLocidfrnk_Equal(String locidfrnk) {
        regLocidfrnk(CK_EQ, locidfrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_NotEqual(String locidfrnk) {
        doSetLocidfrnk_NotEqual(fRES(locidfrnk));
    }

    protected void doSetLocidfrnk_NotEqual(String locidfrnk) {
        regLocidfrnk(CK_NES, locidfrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_GreaterThan(String locidfrnk) {
        regLocidfrnk(CK_GT, fRES(locidfrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_LessThan(String locidfrnk) {
        regLocidfrnk(CK_LT, fRES(locidfrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_GreaterEqual(String locidfrnk) {
        regLocidfrnk(CK_GE, fRES(locidfrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_LessEqual(String locidfrnk) {
        regLocidfrnk(CK_LE, fRES(locidfrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnkList The collection of locidfrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_InScope(Collection<String> locidfrnkList) {
        doSetLocidfrnk_InScope(locidfrnkList);
    }

    protected void doSetLocidfrnk_InScope(Collection<String> locidfrnkList) {
        regINS(CK_INS, cTL(locidfrnkList), xgetCValueLocidfrnk(), "LOCIDFRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnkList The collection of locidfrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_NotInScope(Collection<String> locidfrnkList) {
        doSetLocidfrnk_NotInScope(locidfrnkList);
    }

    protected void doSetLocidfrnk_NotInScope(Collection<String> locidfrnkList) {
        regINS(CK_NINS, cTL(locidfrnkList), xgetCValueLocidfrnk(), "LOCIDFRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {char(1)} <br>
     * <pre>e.g. setLocidfrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locidfrnk The value of locidfrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocidfrnk_LikeSearch(String locidfrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locidfrnk), xgetCValueLocidfrnk(), "LOCIDFRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocidfrnk_NotLikeSearch(String locidfrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locidfrnk), xgetCValueLocidfrnk(), "LOCIDFRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {char(1)}
     * @param locidfrnk The value of locidfrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_PrefixSearch(String locidfrnk) {
        setLocidfrnk_LikeSearch(locidfrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     */
    public void setLocidfrnk_IsNull() { regLocidfrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFRNK: {char(1)}
     */
    public void setLocidfrnk_IsNotNull() { regLocidfrnk(CK_ISNN, DOBJ); }

    protected void regLocidfrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfrnk(), "LOCIDFRNK"); }
    protected abstract ConditionValue xgetCValueLocidfrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1 The value of locidfbrctg1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_Equal(Long locidfbrctg1) {
        doSetLocidfbrctg1_Equal(locidfbrctg1);
    }

    protected void doSetLocidfbrctg1_Equal(Long locidfbrctg1) {
        regLocidfbrctg1(CK_EQ, locidfbrctg1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1 The value of locidfbrctg1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_NotEqual(Long locidfbrctg1) {
        doSetLocidfbrctg1_NotEqual(locidfbrctg1);
    }

    protected void doSetLocidfbrctg1_NotEqual(Long locidfbrctg1) {
        regLocidfbrctg1(CK_NES, locidfbrctg1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1 The value of locidfbrctg1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_GreaterThan(Long locidfbrctg1) {
        regLocidfbrctg1(CK_GT, locidfbrctg1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1 The value of locidfbrctg1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_LessThan(Long locidfbrctg1) {
        regLocidfbrctg1(CK_LT, locidfbrctg1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1 The value of locidfbrctg1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_GreaterEqual(Long locidfbrctg1) {
        regLocidfbrctg1(CK_GE, locidfbrctg1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1 The value of locidfbrctg1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_LessEqual(Long locidfbrctg1) {
        regLocidfbrctg1(CK_LE, locidfbrctg1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param minNumber The min number of locidfbrctg1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg1(), "LOCIDFBRCTG1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1List The collection of locidfbrctg1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_InScope(Collection<Long> locidfbrctg1List) {
        doSetLocidfbrctg1_InScope(locidfbrctg1List);
    }

    protected void doSetLocidfbrctg1_InScope(Collection<Long> locidfbrctg1List) {
        regINS(CK_INS, cTL(locidfbrctg1List), xgetCValueLocidfbrctg1(), "LOCIDFBRCTG1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @param locidfbrctg1List The collection of locidfbrctg1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg1_NotInScope(Collection<Long> locidfbrctg1List) {
        doSetLocidfbrctg1_NotInScope(locidfbrctg1List);
    }

    protected void doSetLocidfbrctg1_NotInScope(Collection<Long> locidfbrctg1List) {
        regINS(CK_NINS, cTL(locidfbrctg1List), xgetCValueLocidfbrctg1(), "LOCIDFBRCTG1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     */
    public void setLocidfbrctg1_IsNull() { regLocidfbrctg1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     */
    public void setLocidfbrctg1_IsNotNull() { regLocidfbrctg1(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg1(), "LOCIDFBRCTG1"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2 The value of locidfbrctg2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_Equal(Long locidfbrctg2) {
        doSetLocidfbrctg2_Equal(locidfbrctg2);
    }

    protected void doSetLocidfbrctg2_Equal(Long locidfbrctg2) {
        regLocidfbrctg2(CK_EQ, locidfbrctg2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2 The value of locidfbrctg2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_NotEqual(Long locidfbrctg2) {
        doSetLocidfbrctg2_NotEqual(locidfbrctg2);
    }

    protected void doSetLocidfbrctg2_NotEqual(Long locidfbrctg2) {
        regLocidfbrctg2(CK_NES, locidfbrctg2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2 The value of locidfbrctg2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_GreaterThan(Long locidfbrctg2) {
        regLocidfbrctg2(CK_GT, locidfbrctg2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2 The value of locidfbrctg2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_LessThan(Long locidfbrctg2) {
        regLocidfbrctg2(CK_LT, locidfbrctg2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2 The value of locidfbrctg2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_GreaterEqual(Long locidfbrctg2) {
        regLocidfbrctg2(CK_GE, locidfbrctg2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2 The value of locidfbrctg2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_LessEqual(Long locidfbrctg2) {
        regLocidfbrctg2(CK_LE, locidfbrctg2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param minNumber The min number of locidfbrctg2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg2(), "LOCIDFBRCTG2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2List The collection of locidfbrctg2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_InScope(Collection<Long> locidfbrctg2List) {
        doSetLocidfbrctg2_InScope(locidfbrctg2List);
    }

    protected void doSetLocidfbrctg2_InScope(Collection<Long> locidfbrctg2List) {
        regINS(CK_INS, cTL(locidfbrctg2List), xgetCValueLocidfbrctg2(), "LOCIDFBRCTG2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @param locidfbrctg2List The collection of locidfbrctg2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg2_NotInScope(Collection<Long> locidfbrctg2List) {
        doSetLocidfbrctg2_NotInScope(locidfbrctg2List);
    }

    protected void doSetLocidfbrctg2_NotInScope(Collection<Long> locidfbrctg2List) {
        regINS(CK_NINS, cTL(locidfbrctg2List), xgetCValueLocidfbrctg2(), "LOCIDFBRCTG2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     */
    public void setLocidfbrctg2_IsNull() { regLocidfbrctg2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     */
    public void setLocidfbrctg2_IsNotNull() { regLocidfbrctg2(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg2(), "LOCIDFBRCTG2"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3 The value of locidfbrctg3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_Equal(Long locidfbrctg3) {
        doSetLocidfbrctg3_Equal(locidfbrctg3);
    }

    protected void doSetLocidfbrctg3_Equal(Long locidfbrctg3) {
        regLocidfbrctg3(CK_EQ, locidfbrctg3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3 The value of locidfbrctg3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_NotEqual(Long locidfbrctg3) {
        doSetLocidfbrctg3_NotEqual(locidfbrctg3);
    }

    protected void doSetLocidfbrctg3_NotEqual(Long locidfbrctg3) {
        regLocidfbrctg3(CK_NES, locidfbrctg3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3 The value of locidfbrctg3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_GreaterThan(Long locidfbrctg3) {
        regLocidfbrctg3(CK_GT, locidfbrctg3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3 The value of locidfbrctg3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_LessThan(Long locidfbrctg3) {
        regLocidfbrctg3(CK_LT, locidfbrctg3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3 The value of locidfbrctg3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_GreaterEqual(Long locidfbrctg3) {
        regLocidfbrctg3(CK_GE, locidfbrctg3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3 The value of locidfbrctg3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_LessEqual(Long locidfbrctg3) {
        regLocidfbrctg3(CK_LE, locidfbrctg3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param minNumber The min number of locidfbrctg3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg3(), "LOCIDFBRCTG3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3List The collection of locidfbrctg3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_InScope(Collection<Long> locidfbrctg3List) {
        doSetLocidfbrctg3_InScope(locidfbrctg3List);
    }

    protected void doSetLocidfbrctg3_InScope(Collection<Long> locidfbrctg3List) {
        regINS(CK_INS, cTL(locidfbrctg3List), xgetCValueLocidfbrctg3(), "LOCIDFBRCTG3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @param locidfbrctg3List The collection of locidfbrctg3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg3_NotInScope(Collection<Long> locidfbrctg3List) {
        doSetLocidfbrctg3_NotInScope(locidfbrctg3List);
    }

    protected void doSetLocidfbrctg3_NotInScope(Collection<Long> locidfbrctg3List) {
        regINS(CK_NINS, cTL(locidfbrctg3List), xgetCValueLocidfbrctg3(), "LOCIDFBRCTG3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     */
    public void setLocidfbrctg3_IsNull() { regLocidfbrctg3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     */
    public void setLocidfbrctg3_IsNotNull() { regLocidfbrctg3(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg3(), "LOCIDFBRCTG3"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4 The value of locidfbrctg4 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_Equal(Long locidfbrctg4) {
        doSetLocidfbrctg4_Equal(locidfbrctg4);
    }

    protected void doSetLocidfbrctg4_Equal(Long locidfbrctg4) {
        regLocidfbrctg4(CK_EQ, locidfbrctg4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4 The value of locidfbrctg4 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_NotEqual(Long locidfbrctg4) {
        doSetLocidfbrctg4_NotEqual(locidfbrctg4);
    }

    protected void doSetLocidfbrctg4_NotEqual(Long locidfbrctg4) {
        regLocidfbrctg4(CK_NES, locidfbrctg4);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4 The value of locidfbrctg4 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_GreaterThan(Long locidfbrctg4) {
        regLocidfbrctg4(CK_GT, locidfbrctg4);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4 The value of locidfbrctg4 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_LessThan(Long locidfbrctg4) {
        regLocidfbrctg4(CK_LT, locidfbrctg4);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4 The value of locidfbrctg4 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_GreaterEqual(Long locidfbrctg4) {
        regLocidfbrctg4(CK_GE, locidfbrctg4);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4 The value of locidfbrctg4 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_LessEqual(Long locidfbrctg4) {
        regLocidfbrctg4(CK_LE, locidfbrctg4);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param minNumber The min number of locidfbrctg4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg4_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg4(), "LOCIDFBRCTG4", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4List The collection of locidfbrctg4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_InScope(Collection<Long> locidfbrctg4List) {
        doSetLocidfbrctg4_InScope(locidfbrctg4List);
    }

    protected void doSetLocidfbrctg4_InScope(Collection<Long> locidfbrctg4List) {
        regINS(CK_INS, cTL(locidfbrctg4List), xgetCValueLocidfbrctg4(), "LOCIDFBRCTG4");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @param locidfbrctg4List The collection of locidfbrctg4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg4_NotInScope(Collection<Long> locidfbrctg4List) {
        doSetLocidfbrctg4_NotInScope(locidfbrctg4List);
    }

    protected void doSetLocidfbrctg4_NotInScope(Collection<Long> locidfbrctg4List) {
        regINS(CK_NINS, cTL(locidfbrctg4List), xgetCValueLocidfbrctg4(), "LOCIDFBRCTG4");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     */
    public void setLocidfbrctg4_IsNull() { regLocidfbrctg4(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     */
    public void setLocidfbrctg4_IsNotNull() { regLocidfbrctg4(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg4(), "LOCIDFBRCTG4"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5 The value of locidfbrctg5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_Equal(Long locidfbrctg5) {
        doSetLocidfbrctg5_Equal(locidfbrctg5);
    }

    protected void doSetLocidfbrctg5_Equal(Long locidfbrctg5) {
        regLocidfbrctg5(CK_EQ, locidfbrctg5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5 The value of locidfbrctg5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_NotEqual(Long locidfbrctg5) {
        doSetLocidfbrctg5_NotEqual(locidfbrctg5);
    }

    protected void doSetLocidfbrctg5_NotEqual(Long locidfbrctg5) {
        regLocidfbrctg5(CK_NES, locidfbrctg5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5 The value of locidfbrctg5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_GreaterThan(Long locidfbrctg5) {
        regLocidfbrctg5(CK_GT, locidfbrctg5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5 The value of locidfbrctg5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_LessThan(Long locidfbrctg5) {
        regLocidfbrctg5(CK_LT, locidfbrctg5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5 The value of locidfbrctg5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_GreaterEqual(Long locidfbrctg5) {
        regLocidfbrctg5(CK_GE, locidfbrctg5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5 The value of locidfbrctg5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_LessEqual(Long locidfbrctg5) {
        regLocidfbrctg5(CK_LE, locidfbrctg5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param minNumber The min number of locidfbrctg5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg5_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg5(), "LOCIDFBRCTG5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5List The collection of locidfbrctg5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_InScope(Collection<Long> locidfbrctg5List) {
        doSetLocidfbrctg5_InScope(locidfbrctg5List);
    }

    protected void doSetLocidfbrctg5_InScope(Collection<Long> locidfbrctg5List) {
        regINS(CK_INS, cTL(locidfbrctg5List), xgetCValueLocidfbrctg5(), "LOCIDFBRCTG5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @param locidfbrctg5List The collection of locidfbrctg5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg5_NotInScope(Collection<Long> locidfbrctg5List) {
        doSetLocidfbrctg5_NotInScope(locidfbrctg5List);
    }

    protected void doSetLocidfbrctg5_NotInScope(Collection<Long> locidfbrctg5List) {
        regINS(CK_NINS, cTL(locidfbrctg5List), xgetCValueLocidfbrctg5(), "LOCIDFBRCTG5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     */
    public void setLocidfbrctg5_IsNull() { regLocidfbrctg5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     */
    public void setLocidfbrctg5_IsNotNull() { regLocidfbrctg5(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg5(), "LOCIDFBRCTG5"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6 The value of locidfbrctg6 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_Equal(Long locidfbrctg6) {
        doSetLocidfbrctg6_Equal(locidfbrctg6);
    }

    protected void doSetLocidfbrctg6_Equal(Long locidfbrctg6) {
        regLocidfbrctg6(CK_EQ, locidfbrctg6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6 The value of locidfbrctg6 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_NotEqual(Long locidfbrctg6) {
        doSetLocidfbrctg6_NotEqual(locidfbrctg6);
    }

    protected void doSetLocidfbrctg6_NotEqual(Long locidfbrctg6) {
        regLocidfbrctg6(CK_NES, locidfbrctg6);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6 The value of locidfbrctg6 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_GreaterThan(Long locidfbrctg6) {
        regLocidfbrctg6(CK_GT, locidfbrctg6);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6 The value of locidfbrctg6 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_LessThan(Long locidfbrctg6) {
        regLocidfbrctg6(CK_LT, locidfbrctg6);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6 The value of locidfbrctg6 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_GreaterEqual(Long locidfbrctg6) {
        regLocidfbrctg6(CK_GE, locidfbrctg6);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6 The value of locidfbrctg6 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_LessEqual(Long locidfbrctg6) {
        regLocidfbrctg6(CK_LE, locidfbrctg6);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param minNumber The min number of locidfbrctg6. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg6. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg6_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg6(), "LOCIDFBRCTG6", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6List The collection of locidfbrctg6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_InScope(Collection<Long> locidfbrctg6List) {
        doSetLocidfbrctg6_InScope(locidfbrctg6List);
    }

    protected void doSetLocidfbrctg6_InScope(Collection<Long> locidfbrctg6List) {
        regINS(CK_INS, cTL(locidfbrctg6List), xgetCValueLocidfbrctg6(), "LOCIDFBRCTG6");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @param locidfbrctg6List The collection of locidfbrctg6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg6_NotInScope(Collection<Long> locidfbrctg6List) {
        doSetLocidfbrctg6_NotInScope(locidfbrctg6List);
    }

    protected void doSetLocidfbrctg6_NotInScope(Collection<Long> locidfbrctg6List) {
        regINS(CK_NINS, cTL(locidfbrctg6List), xgetCValueLocidfbrctg6(), "LOCIDFBRCTG6");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     */
    public void setLocidfbrctg6_IsNull() { regLocidfbrctg6(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     */
    public void setLocidfbrctg6_IsNotNull() { regLocidfbrctg6(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg6(), "LOCIDFBRCTG6"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg6();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7 The value of locidfbrctg7 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_Equal(Long locidfbrctg7) {
        doSetLocidfbrctg7_Equal(locidfbrctg7);
    }

    protected void doSetLocidfbrctg7_Equal(Long locidfbrctg7) {
        regLocidfbrctg7(CK_EQ, locidfbrctg7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7 The value of locidfbrctg7 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_NotEqual(Long locidfbrctg7) {
        doSetLocidfbrctg7_NotEqual(locidfbrctg7);
    }

    protected void doSetLocidfbrctg7_NotEqual(Long locidfbrctg7) {
        regLocidfbrctg7(CK_NES, locidfbrctg7);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7 The value of locidfbrctg7 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_GreaterThan(Long locidfbrctg7) {
        regLocidfbrctg7(CK_GT, locidfbrctg7);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7 The value of locidfbrctg7 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_LessThan(Long locidfbrctg7) {
        regLocidfbrctg7(CK_LT, locidfbrctg7);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7 The value of locidfbrctg7 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_GreaterEqual(Long locidfbrctg7) {
        regLocidfbrctg7(CK_GE, locidfbrctg7);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7 The value of locidfbrctg7 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_LessEqual(Long locidfbrctg7) {
        regLocidfbrctg7(CK_LE, locidfbrctg7);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param minNumber The min number of locidfbrctg7. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg7. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg7_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg7(), "LOCIDFBRCTG7", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7List The collection of locidfbrctg7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_InScope(Collection<Long> locidfbrctg7List) {
        doSetLocidfbrctg7_InScope(locidfbrctg7List);
    }

    protected void doSetLocidfbrctg7_InScope(Collection<Long> locidfbrctg7List) {
        regINS(CK_INS, cTL(locidfbrctg7List), xgetCValueLocidfbrctg7(), "LOCIDFBRCTG7");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @param locidfbrctg7List The collection of locidfbrctg7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg7_NotInScope(Collection<Long> locidfbrctg7List) {
        doSetLocidfbrctg7_NotInScope(locidfbrctg7List);
    }

    protected void doSetLocidfbrctg7_NotInScope(Collection<Long> locidfbrctg7List) {
        regINS(CK_NINS, cTL(locidfbrctg7List), xgetCValueLocidfbrctg7(), "LOCIDFBRCTG7");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     */
    public void setLocidfbrctg7_IsNull() { regLocidfbrctg7(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     */
    public void setLocidfbrctg7_IsNotNull() { regLocidfbrctg7(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg7(), "LOCIDFBRCTG7"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg7();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8 The value of locidfbrctg8 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_Equal(Long locidfbrctg8) {
        doSetLocidfbrctg8_Equal(locidfbrctg8);
    }

    protected void doSetLocidfbrctg8_Equal(Long locidfbrctg8) {
        regLocidfbrctg8(CK_EQ, locidfbrctg8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8 The value of locidfbrctg8 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_NotEqual(Long locidfbrctg8) {
        doSetLocidfbrctg8_NotEqual(locidfbrctg8);
    }

    protected void doSetLocidfbrctg8_NotEqual(Long locidfbrctg8) {
        regLocidfbrctg8(CK_NES, locidfbrctg8);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8 The value of locidfbrctg8 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_GreaterThan(Long locidfbrctg8) {
        regLocidfbrctg8(CK_GT, locidfbrctg8);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8 The value of locidfbrctg8 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_LessThan(Long locidfbrctg8) {
        regLocidfbrctg8(CK_LT, locidfbrctg8);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8 The value of locidfbrctg8 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_GreaterEqual(Long locidfbrctg8) {
        regLocidfbrctg8(CK_GE, locidfbrctg8);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8 The value of locidfbrctg8 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_LessEqual(Long locidfbrctg8) {
        regLocidfbrctg8(CK_LE, locidfbrctg8);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param minNumber The min number of locidfbrctg8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg8_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg8(), "LOCIDFBRCTG8", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8List The collection of locidfbrctg8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_InScope(Collection<Long> locidfbrctg8List) {
        doSetLocidfbrctg8_InScope(locidfbrctg8List);
    }

    protected void doSetLocidfbrctg8_InScope(Collection<Long> locidfbrctg8List) {
        regINS(CK_INS, cTL(locidfbrctg8List), xgetCValueLocidfbrctg8(), "LOCIDFBRCTG8");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @param locidfbrctg8List The collection of locidfbrctg8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg8_NotInScope(Collection<Long> locidfbrctg8List) {
        doSetLocidfbrctg8_NotInScope(locidfbrctg8List);
    }

    protected void doSetLocidfbrctg8_NotInScope(Collection<Long> locidfbrctg8List) {
        regINS(CK_NINS, cTL(locidfbrctg8List), xgetCValueLocidfbrctg8(), "LOCIDFBRCTG8");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     */
    public void setLocidfbrctg8_IsNull() { regLocidfbrctg8(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     */
    public void setLocidfbrctg8_IsNotNull() { regLocidfbrctg8(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg8(), "LOCIDFBRCTG8"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg8();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9 The value of locidfbrctg9 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_Equal(Long locidfbrctg9) {
        doSetLocidfbrctg9_Equal(locidfbrctg9);
    }

    protected void doSetLocidfbrctg9_Equal(Long locidfbrctg9) {
        regLocidfbrctg9(CK_EQ, locidfbrctg9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9 The value of locidfbrctg9 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_NotEqual(Long locidfbrctg9) {
        doSetLocidfbrctg9_NotEqual(locidfbrctg9);
    }

    protected void doSetLocidfbrctg9_NotEqual(Long locidfbrctg9) {
        regLocidfbrctg9(CK_NES, locidfbrctg9);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9 The value of locidfbrctg9 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_GreaterThan(Long locidfbrctg9) {
        regLocidfbrctg9(CK_GT, locidfbrctg9);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9 The value of locidfbrctg9 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_LessThan(Long locidfbrctg9) {
        regLocidfbrctg9(CK_LT, locidfbrctg9);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9 The value of locidfbrctg9 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_GreaterEqual(Long locidfbrctg9) {
        regLocidfbrctg9(CK_GE, locidfbrctg9);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9 The value of locidfbrctg9 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_LessEqual(Long locidfbrctg9) {
        regLocidfbrctg9(CK_LE, locidfbrctg9);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param minNumber The min number of locidfbrctg9. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg9. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg9_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg9(), "LOCIDFBRCTG9", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9List The collection of locidfbrctg9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_InScope(Collection<Long> locidfbrctg9List) {
        doSetLocidfbrctg9_InScope(locidfbrctg9List);
    }

    protected void doSetLocidfbrctg9_InScope(Collection<Long> locidfbrctg9List) {
        regINS(CK_INS, cTL(locidfbrctg9List), xgetCValueLocidfbrctg9(), "LOCIDFBRCTG9");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @param locidfbrctg9List The collection of locidfbrctg9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg9_NotInScope(Collection<Long> locidfbrctg9List) {
        doSetLocidfbrctg9_NotInScope(locidfbrctg9List);
    }

    protected void doSetLocidfbrctg9_NotInScope(Collection<Long> locidfbrctg9List) {
        regINS(CK_NINS, cTL(locidfbrctg9List), xgetCValueLocidfbrctg9(), "LOCIDFBRCTG9");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     */
    public void setLocidfbrctg9_IsNull() { regLocidfbrctg9(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     */
    public void setLocidfbrctg9_IsNotNull() { regLocidfbrctg9(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg9(), "LOCIDFBRCTG9"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg9();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10 The value of locidfbrctg10 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_Equal(Long locidfbrctg10) {
        doSetLocidfbrctg10_Equal(locidfbrctg10);
    }

    protected void doSetLocidfbrctg10_Equal(Long locidfbrctg10) {
        regLocidfbrctg10(CK_EQ, locidfbrctg10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10 The value of locidfbrctg10 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_NotEqual(Long locidfbrctg10) {
        doSetLocidfbrctg10_NotEqual(locidfbrctg10);
    }

    protected void doSetLocidfbrctg10_NotEqual(Long locidfbrctg10) {
        regLocidfbrctg10(CK_NES, locidfbrctg10);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10 The value of locidfbrctg10 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_GreaterThan(Long locidfbrctg10) {
        regLocidfbrctg10(CK_GT, locidfbrctg10);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10 The value of locidfbrctg10 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_LessThan(Long locidfbrctg10) {
        regLocidfbrctg10(CK_LT, locidfbrctg10);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10 The value of locidfbrctg10 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_GreaterEqual(Long locidfbrctg10) {
        regLocidfbrctg10(CK_GE, locidfbrctg10);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10 The value of locidfbrctg10 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_LessEqual(Long locidfbrctg10) {
        regLocidfbrctg10(CK_LE, locidfbrctg10);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param minNumber The min number of locidfbrctg10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locidfbrctg10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocidfbrctg10_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocidfbrctg10(), "LOCIDFBRCTG10", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10List The collection of locidfbrctg10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_InScope(Collection<Long> locidfbrctg10List) {
        doSetLocidfbrctg10_InScope(locidfbrctg10List);
    }

    protected void doSetLocidfbrctg10_InScope(Collection<Long> locidfbrctg10List) {
        regINS(CK_INS, cTL(locidfbrctg10List), xgetCValueLocidfbrctg10(), "LOCIDFBRCTG10");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @param locidfbrctg10List The collection of locidfbrctg10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfbrctg10_NotInScope(Collection<Long> locidfbrctg10List) {
        doSetLocidfbrctg10_NotInScope(locidfbrctg10List);
    }

    protected void doSetLocidfbrctg10_NotInScope(Collection<Long> locidfbrctg10List) {
        regINS(CK_NINS, cTL(locidfbrctg10List), xgetCValueLocidfbrctg10(), "LOCIDFBRCTG10");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     */
    public void setLocidfbrctg10_IsNull() { regLocidfbrctg10(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     */
    public void setLocidfbrctg10_IsNotNull() { regLocidfbrctg10(CK_ISNN, DOBJ); }

    protected void regLocidfbrctg10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocidfbrctg10(), "LOCIDFBRCTG10"); }
    protected abstract ConditionValue xgetCValueLocidfbrctg10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_Equal(String sftpclrsfid) {
        doSetSftpclrsfid_Equal(fRES(sftpclrsfid));
    }

    protected void doSetSftpclrsfid_Equal(String sftpclrsfid) {
        regSftpclrsfid(CK_EQ, sftpclrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_NotEqual(String sftpclrsfid) {
        doSetSftpclrsfid_NotEqual(fRES(sftpclrsfid));
    }

    protected void doSetSftpclrsfid_NotEqual(String sftpclrsfid) {
        regSftpclrsfid(CK_NES, sftpclrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_GreaterThan(String sftpclrsfid) {
        regSftpclrsfid(CK_GT, fRES(sftpclrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_LessThan(String sftpclrsfid) {
        regSftpclrsfid(CK_LT, fRES(sftpclrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_GreaterEqual(String sftpclrsfid) {
        regSftpclrsfid(CK_GE, fRES(sftpclrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_LessEqual(String sftpclrsfid) {
        regSftpclrsfid(CK_LE, fRES(sftpclrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfidList The collection of sftpclrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_InScope(Collection<String> sftpclrsfidList) {
        doSetSftpclrsfid_InScope(sftpclrsfidList);
    }

    protected void doSetSftpclrsfid_InScope(Collection<String> sftpclrsfidList) {
        regINS(CK_INS, cTL(sftpclrsfidList), xgetCValueSftpclrsfid(), "SFTPCLRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfidList The collection of sftpclrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_NotInScope(Collection<String> sftpclrsfidList) {
        doSetSftpclrsfid_NotInScope(sftpclrsfidList);
    }

    protected void doSetSftpclrsfid_NotInScope(Collection<String> sftpclrsfidList) {
        regINS(CK_NINS, cTL(sftpclrsfidList), xgetCValueSftpclrsfid(), "SFTPCLRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)} <br>
     * <pre>e.g. setSftpclrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sftpclrsfid The value of sftpclrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSftpclrsfid_LikeSearch(String sftpclrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sftpclrsfid), xgetCValueSftpclrsfid(), "SFTPCLRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSftpclrsfid_NotLikeSearch(String sftpclrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sftpclrsfid), xgetCValueSftpclrsfid(), "SFTPCLRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_PrefixSearch(String sftpclrsfid) {
        setSftpclrsfid_LikeSearch(sftpclrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     */
    public void setSftpclrsfid_IsNull() { regSftpclrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     */
    public void setSftpclrsfid_IsNotNull() { regSftpclrsfid(CK_ISNN, DOBJ); }

    protected void regSftpclrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSftpclrsfid(), "SFTPCLRSFID"); }
    protected abstract ConditionValue xgetCValueSftpclrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_Equal(String tsnboxrsfid) {
        doSetTsnboxrsfid_Equal(fRES(tsnboxrsfid));
    }

    protected void doSetTsnboxrsfid_Equal(String tsnboxrsfid) {
        regTsnboxrsfid(CK_EQ, tsnboxrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_NotEqual(String tsnboxrsfid) {
        doSetTsnboxrsfid_NotEqual(fRES(tsnboxrsfid));
    }

    protected void doSetTsnboxrsfid_NotEqual(String tsnboxrsfid) {
        regTsnboxrsfid(CK_NES, tsnboxrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_GreaterThan(String tsnboxrsfid) {
        regTsnboxrsfid(CK_GT, fRES(tsnboxrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_LessThan(String tsnboxrsfid) {
        regTsnboxrsfid(CK_LT, fRES(tsnboxrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_GreaterEqual(String tsnboxrsfid) {
        regTsnboxrsfid(CK_GE, fRES(tsnboxrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_LessEqual(String tsnboxrsfid) {
        regTsnboxrsfid(CK_LE, fRES(tsnboxrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfidList The collection of tsnboxrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_InScope(Collection<String> tsnboxrsfidList) {
        doSetTsnboxrsfid_InScope(tsnboxrsfidList);
    }

    protected void doSetTsnboxrsfid_InScope(Collection<String> tsnboxrsfidList) {
        regINS(CK_INS, cTL(tsnboxrsfidList), xgetCValueTsnboxrsfid(), "TSNBOXRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfidList The collection of tsnboxrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_NotInScope(Collection<String> tsnboxrsfidList) {
        doSetTsnboxrsfid_NotInScope(tsnboxrsfidList);
    }

    protected void doSetTsnboxrsfid_NotInScope(Collection<String> tsnboxrsfidList) {
        regINS(CK_NINS, cTL(tsnboxrsfidList), xgetCValueTsnboxrsfid(), "TSNBOXRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)} <br>
     * <pre>e.g. setTsnboxrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tsnboxrsfid The value of tsnboxrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTsnboxrsfid_LikeSearch(String tsnboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tsnboxrsfid), xgetCValueTsnboxrsfid(), "TSNBOXRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTsnboxrsfid_NotLikeSearch(String tsnboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tsnboxrsfid), xgetCValueTsnboxrsfid(), "TSNBOXRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_PrefixSearch(String tsnboxrsfid) {
        setTsnboxrsfid_LikeSearch(tsnboxrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     */
    public void setTsnboxrsfid_IsNull() { regTsnboxrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     */
    public void setTsnboxrsfid_IsNotNull() { regTsnboxrsfid(CK_ISNN, DOBJ); }

    protected void regTsnboxrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsnboxrsfid(), "TSNBOXRSFID"); }
    protected abstract ConditionValue xgetCValueTsnboxrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_Equal(String jtboxrsfid) {
        doSetJtboxrsfid_Equal(fRES(jtboxrsfid));
    }

    protected void doSetJtboxrsfid_Equal(String jtboxrsfid) {
        regJtboxrsfid(CK_EQ, jtboxrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_NotEqual(String jtboxrsfid) {
        doSetJtboxrsfid_NotEqual(fRES(jtboxrsfid));
    }

    protected void doSetJtboxrsfid_NotEqual(String jtboxrsfid) {
        regJtboxrsfid(CK_NES, jtboxrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_GreaterThan(String jtboxrsfid) {
        regJtboxrsfid(CK_GT, fRES(jtboxrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_LessThan(String jtboxrsfid) {
        regJtboxrsfid(CK_LT, fRES(jtboxrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_GreaterEqual(String jtboxrsfid) {
        regJtboxrsfid(CK_GE, fRES(jtboxrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_LessEqual(String jtboxrsfid) {
        regJtboxrsfid(CK_LE, fRES(jtboxrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfidList The collection of jtboxrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_InScope(Collection<String> jtboxrsfidList) {
        doSetJtboxrsfid_InScope(jtboxrsfidList);
    }

    protected void doSetJtboxrsfid_InScope(Collection<String> jtboxrsfidList) {
        regINS(CK_INS, cTL(jtboxrsfidList), xgetCValueJtboxrsfid(), "JTBOXRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfidList The collection of jtboxrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_NotInScope(Collection<String> jtboxrsfidList) {
        doSetJtboxrsfid_NotInScope(jtboxrsfidList);
    }

    protected void doSetJtboxrsfid_NotInScope(Collection<String> jtboxrsfidList) {
        regINS(CK_NINS, cTL(jtboxrsfidList), xgetCValueJtboxrsfid(), "JTBOXRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)} <br>
     * <pre>e.g. setJtboxrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jtboxrsfid The value of jtboxrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJtboxrsfid_LikeSearch(String jtboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jtboxrsfid), xgetCValueJtboxrsfid(), "JTBOXRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJtboxrsfid_NotLikeSearch(String jtboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jtboxrsfid), xgetCValueJtboxrsfid(), "JTBOXRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_PrefixSearch(String jtboxrsfid) {
        setJtboxrsfid_LikeSearch(jtboxrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     */
    public void setJtboxrsfid_IsNull() { regJtboxrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     */
    public void setJtboxrsfid_IsNotNull() { regJtboxrsfid(CK_ISNN, DOBJ); }

    protected void regJtboxrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtboxrsfid(), "JTBOXRSFID"); }
    protected abstract ConditionValue xgetCValueJtboxrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_Equal(String hdrdboxrsfid) {
        doSetHdrdboxrsfid_Equal(fRES(hdrdboxrsfid));
    }

    protected void doSetHdrdboxrsfid_Equal(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_EQ, hdrdboxrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_NotEqual(String hdrdboxrsfid) {
        doSetHdrdboxrsfid_NotEqual(fRES(hdrdboxrsfid));
    }

    protected void doSetHdrdboxrsfid_NotEqual(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_NES, hdrdboxrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_GreaterThan(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_GT, fRES(hdrdboxrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_LessThan(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_LT, fRES(hdrdboxrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_GreaterEqual(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_GE, fRES(hdrdboxrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_LessEqual(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_LE, fRES(hdrdboxrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfidList The collection of hdrdboxrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_InScope(Collection<String> hdrdboxrsfidList) {
        doSetHdrdboxrsfid_InScope(hdrdboxrsfidList);
    }

    protected void doSetHdrdboxrsfid_InScope(Collection<String> hdrdboxrsfidList) {
        regINS(CK_INS, cTL(hdrdboxrsfidList), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfidList The collection of hdrdboxrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_NotInScope(Collection<String> hdrdboxrsfidList) {
        doSetHdrdboxrsfid_NotInScope(hdrdboxrsfidList);
    }

    protected void doSetHdrdboxrsfid_NotInScope(Collection<String> hdrdboxrsfidList) {
        regINS(CK_NINS, cTL(hdrdboxrsfidList), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)} <br>
     * <pre>e.g. setHdrdboxrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrdboxrsfid The value of hdrdboxrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrdboxrsfid_LikeSearch(String hdrdboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrdboxrsfid), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrdboxrsfid_NotLikeSearch(String hdrdboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrdboxrsfid), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_PrefixSearch(String hdrdboxrsfid) {
        setHdrdboxrsfid_LikeSearch(hdrdboxrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     */
    public void setHdrdboxrsfid_IsNull() { regHdrdboxrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     */
    public void setHdrdboxrsfid_IsNotNull() { regHdrdboxrsfid(CK_ISNN, DOBJ); }

    protected void regHdrdboxrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID"); }
    protected abstract ConditionValue xgetCValueHdrdboxrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_Equal(String odrdvrsfid) {
        doSetOdrdvrsfid_Equal(fRES(odrdvrsfid));
    }

    protected void doSetOdrdvrsfid_Equal(String odrdvrsfid) {
        regOdrdvrsfid(CK_EQ, odrdvrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_NotEqual(String odrdvrsfid) {
        doSetOdrdvrsfid_NotEqual(fRES(odrdvrsfid));
    }

    protected void doSetOdrdvrsfid_NotEqual(String odrdvrsfid) {
        regOdrdvrsfid(CK_NES, odrdvrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_GreaterThan(String odrdvrsfid) {
        regOdrdvrsfid(CK_GT, fRES(odrdvrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_LessThan(String odrdvrsfid) {
        regOdrdvrsfid(CK_LT, fRES(odrdvrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_GreaterEqual(String odrdvrsfid) {
        regOdrdvrsfid(CK_GE, fRES(odrdvrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_LessEqual(String odrdvrsfid) {
        regOdrdvrsfid(CK_LE, fRES(odrdvrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfidList The collection of odrdvrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_InScope(Collection<String> odrdvrsfidList) {
        doSetOdrdvrsfid_InScope(odrdvrsfidList);
    }

    protected void doSetOdrdvrsfid_InScope(Collection<String> odrdvrsfidList) {
        regINS(CK_INS, cTL(odrdvrsfidList), xgetCValueOdrdvrsfid(), "ODRDVRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfidList The collection of odrdvrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_NotInScope(Collection<String> odrdvrsfidList) {
        doSetOdrdvrsfid_NotInScope(odrdvrsfidList);
    }

    protected void doSetOdrdvrsfid_NotInScope(Collection<String> odrdvrsfidList) {
        regINS(CK_NINS, cTL(odrdvrsfidList), xgetCValueOdrdvrsfid(), "ODRDVRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)} <br>
     * <pre>e.g. setOdrdvrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param odrdvrsfid The value of odrdvrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOdrdvrsfid_LikeSearch(String odrdvrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(odrdvrsfid), xgetCValueOdrdvrsfid(), "ODRDVRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOdrdvrsfid_NotLikeSearch(String odrdvrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(odrdvrsfid), xgetCValueOdrdvrsfid(), "ODRDVRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_PrefixSearch(String odrdvrsfid) {
        setOdrdvrsfid_LikeSearch(odrdvrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     */
    public void setOdrdvrsfid_IsNull() { regOdrdvrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     */
    public void setOdrdvrsfid_IsNotNull() { regOdrdvrsfid(CK_ISNN, DOBJ); }

    protected void regOdrdvrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOdrdvrsfid(), "ODRDVRSFID"); }
    protected abstract ConditionValue xgetCValueOdrdvrsfid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_Equal(Long pkgrt) {
        doSetPkgrt_Equal(pkgrt);
    }

    protected void doSetPkgrt_Equal(Long pkgrt) {
        regPkgrt(CK_EQ, pkgrt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_NotEqual(Long pkgrt) {
        doSetPkgrt_NotEqual(pkgrt);
    }

    protected void doSetPkgrt_NotEqual(Long pkgrt) {
        regPkgrt(CK_NES, pkgrt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_GreaterThan(Long pkgrt) {
        regPkgrt(CK_GT, pkgrt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_LessThan(Long pkgrt) {
        regPkgrt(CK_LT, pkgrt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_GreaterEqual(Long pkgrt) {
        regPkgrt(CK_GE, pkgrt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_LessEqual(Long pkgrt) {
        regPkgrt(CK_LE, pkgrt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param minNumber The min number of pkgrt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkgrt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkgrt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePkgrt(), "PKGRT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrtList The collection of pkgrt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkgrt_InScope(Collection<Long> pkgrtList) {
        doSetPkgrt_InScope(pkgrtList);
    }

    protected void doSetPkgrt_InScope(Collection<Long> pkgrtList) {
        regINS(CK_INS, cTL(pkgrtList), xgetCValuePkgrt(), "PKGRT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrtList The collection of pkgrt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkgrt_NotInScope(Collection<Long> pkgrtList) {
        doSetPkgrt_NotInScope(pkgrtList);
    }

    protected void doSetPkgrt_NotInScope(Collection<Long> pkgrtList) {
        regINS(CK_NINS, cTL(pkgrtList), xgetCValuePkgrt(), "PKGRT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     */
    public void setPkgrt_IsNull() { regPkgrt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     */
    public void setPkgrt_IsNotNull() { regPkgrt(CK_ISNN, DOBJ); }

    protected void regPkgrt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkgrt(), "PKGRT"); }
    protected abstract ConditionValue xgetCValuePkgrt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_Equal(String sprprsid) {
        doSetSprprsid_Equal(fRES(sprprsid));
    }

    protected void doSetSprprsid_Equal(String sprprsid) {
        regSprprsid(CK_EQ, sprprsid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_NotEqual(String sprprsid) {
        doSetSprprsid_NotEqual(fRES(sprprsid));
    }

    protected void doSetSprprsid_NotEqual(String sprprsid) {
        regSprprsid(CK_NES, sprprsid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_GreaterThan(String sprprsid) {
        regSprprsid(CK_GT, fRES(sprprsid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_LessThan(String sprprsid) {
        regSprprsid(CK_LT, fRES(sprprsid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_GreaterEqual(String sprprsid) {
        regSprprsid(CK_GE, fRES(sprprsid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_LessEqual(String sprprsid) {
        regSprprsid(CK_LE, fRES(sprprsid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsidList The collection of sprprsid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_InScope(Collection<String> sprprsidList) {
        doSetSprprsid_InScope(sprprsidList);
    }

    protected void doSetSprprsid_InScope(Collection<String> sprprsidList) {
        regINS(CK_INS, cTL(sprprsidList), xgetCValueSprprsid(), "SPRPRSID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsidList The collection of sprprsid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_NotInScope(Collection<String> sprprsidList) {
        doSetSprprsid_NotInScope(sprprsidList);
    }

    protected void doSetSprprsid_NotInScope(Collection<String> sprprsidList) {
        regINS(CK_NINS, cTL(sprprsidList), xgetCValueSprprsid(), "SPRPRSID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)} <br>
     * <pre>e.g. setSprprsid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprprsid The value of sprprsid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprprsid_LikeSearch(String sprprsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprprsid), xgetCValueSprprsid(), "SPRPRSID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprprsid_NotLikeSearch(String sprprsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprprsid), xgetCValueSprprsid(), "SPRPRSID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_PrefixSearch(String sprprsid) {
        setSprprsid_LikeSearch(sprprsid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     */
    public void setSprprsid_IsNull() { regSprprsid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     */
    public void setSprprsid_IsNullOrEmpty() { regSprprsid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     */
    public void setSprprsid_IsNotNull() { regSprprsid(CK_ISNN, DOBJ); }

    protected void regSprprsid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprprsid(), "SPRPRSID"); }
    protected abstract ConditionValue xgetCValueSprprsid();

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
    public HpSLCFunction<MCblkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCblkCB.class);
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
    public HpSLCFunction<MCblkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCblkCB.class);
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
    public HpSLCFunction<MCblkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCblkCB.class);
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
    public HpSLCFunction<MCblkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCblkCB.class);
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
    public HpSLCFunction<MCblkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCblkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCblkCB&gt;() {
     *     public void query(MCblkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCblkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCblkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCblkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCblkCQ sq);

    protected MCblkCB xcreateScalarConditionCB() {
        MCblkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCblkCB xcreateScalarConditionPartitionByCB() {
        MCblkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCblkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCblkCB cb = new MCblkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CBLK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCblkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCblkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCblkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCblkCB cb = new MCblkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CBLK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCblkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCblkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCblkCB cb = new MCblkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCblkCQ sq);

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
    protected MCblkCB newMyCB() {
        return new MCblkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCblkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

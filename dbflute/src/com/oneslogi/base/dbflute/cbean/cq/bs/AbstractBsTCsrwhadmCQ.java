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
 * The abstract condition-query of T_CSRWHADM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCsrwhadmCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCsrwhadmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CSRWHADM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageId The value of sortPlaceManageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_Equal(Long sortPlaceManageId) {
        doSetSortPlaceManageId_Equal(sortPlaceManageId);
    }

    protected void doSetSortPlaceManageId_Equal(Long sortPlaceManageId) {
        regSortPlaceManageId(CK_EQ, sortPlaceManageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageId The value of sortPlaceManageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_NotEqual(Long sortPlaceManageId) {
        doSetSortPlaceManageId_NotEqual(sortPlaceManageId);
    }

    protected void doSetSortPlaceManageId_NotEqual(Long sortPlaceManageId) {
        regSortPlaceManageId(CK_NES, sortPlaceManageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageId The value of sortPlaceManageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_GreaterThan(Long sortPlaceManageId) {
        regSortPlaceManageId(CK_GT, sortPlaceManageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageId The value of sortPlaceManageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_LessThan(Long sortPlaceManageId) {
        regSortPlaceManageId(CK_LT, sortPlaceManageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageId The value of sortPlaceManageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_GreaterEqual(Long sortPlaceManageId) {
        regSortPlaceManageId(CK_GE, sortPlaceManageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageId The value of sortPlaceManageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_LessEqual(Long sortPlaceManageId) {
        regSortPlaceManageId(CK_LE, sortPlaceManageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sortPlaceManageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortPlaceManageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortPlaceManageId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortPlaceManageId(), "SORT_PLACE_MANAGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageIdList The collection of sortPlaceManageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_InScope(Collection<Long> sortPlaceManageIdList) {
        doSetSortPlaceManageId_InScope(sortPlaceManageIdList);
    }

    protected void doSetSortPlaceManageId_InScope(Collection<Long> sortPlaceManageIdList) {
        regINS(CK_INS, cTL(sortPlaceManageIdList), xgetCValueSortPlaceManageId(), "SORT_PLACE_MANAGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceManageIdList The collection of sortPlaceManageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortPlaceManageId_NotInScope(Collection<Long> sortPlaceManageIdList) {
        doSetSortPlaceManageId_NotInScope(sortPlaceManageIdList);
    }

    protected void doSetSortPlaceManageId_NotInScope(Collection<Long> sortPlaceManageIdList) {
        regINS(CK_NINS, cTL(sortPlaceManageIdList), xgetCValueSortPlaceManageId(), "SORT_PLACE_MANAGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSortPlaceManageId_IsNull() { regSortPlaceManageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSortPlaceManageId_IsNotNull() { regSortPlaceManageId(CK_ISNN, DOBJ); }

    protected void regSortPlaceManageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortPlaceManageId(), "SORT_PLACE_MANAGE_ID"); }
    protected abstract ConditionValue xgetCValueSortPlaceManageId();

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
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_Equal(String zzorgncd) {
        doSetZzorgncd_Equal(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_Equal(String zzorgncd) {
        regZzorgncd(CK_EQ, zzorgncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotEqual(String zzorgncd) {
        doSetZzorgncd_NotEqual(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_NotEqual(String zzorgncd) {
        regZzorgncd(CK_NES, zzorgncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterThan(String zzorgncd) {
        regZzorgncd(CK_GT, fRES(zzorgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessThan(String zzorgncd) {
        regZzorgncd(CK_LT, fRES(zzorgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterEqual(String zzorgncd) {
        regZzorgncd(CK_GE, fRES(zzorgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessEqual(String zzorgncd) {
        regZzorgncd(CK_LE, fRES(zzorgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_InScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_InScope(zzorgncdList);
    }

    protected void doSetZzorgncd_InScope(Collection<String> zzorgncdList) {
        regINS(CK_INS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_NotInScope(zzorgncdList);
    }

    protected void doSetZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        regINS(CK_NINS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZzorgncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgncd The value of zzorgncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgncd_LikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgncd_NotLikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_PrefixSearch(String zzorgncd) {
        setZzorgncd_LikeSearch(zzorgncd, xcLSOPPre());
    }

    protected void regZzorgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgncd(), "ZZORGNCD"); }
    protected abstract ConditionValue xgetCValueZzorgncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_Equal(String srymd) {
        doSetSrymd_Equal(fRES(srymd));
    }

    protected void doSetSrymd_Equal(String srymd) {
        regSrymd(CK_EQ, srymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotEqual(String srymd) {
        doSetSrymd_NotEqual(fRES(srymd));
    }

    protected void doSetSrymd_NotEqual(String srymd) {
        regSrymd(CK_NES, srymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterThan(String srymd) {
        regSrymd(CK_GT, fRES(srymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessThan(String srymd) {
        regSrymd(CK_LT, fRES(srymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterEqual(String srymd) {
        regSrymd(CK_GE, fRES(srymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessEqual(String srymd) {
        regSrymd(CK_LE, fRES(srymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymdList The collection of srymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_InScope(Collection<String> srymdList) {
        doSetSrymd_InScope(srymdList);
    }

    protected void doSetSrymd_InScope(Collection<String> srymdList) {
        regINS(CK_INS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymdList The collection of srymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotInScope(Collection<String> srymdList) {
        doSetSrymd_NotInScope(srymdList);
    }

    protected void doSetSrymd_NotInScope(Collection<String> srymdList) {
        regINS(CK_NINS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)} <br>
     * <pre>e.g. setSrymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srymd The value of srymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrymd_LikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrymd_NotLikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_PrefixSearch(String srymd) {
        setSrymd_LikeSearch(srymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     */
    public void setSrymd_IsNull() { regSrymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     */
    public void setSrymd_IsNullOrEmpty() { regSrymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     */
    public void setSrymd_IsNotNull() { regSrymd(CK_ISNN, DOBJ); }

    protected void regSrymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrymd(), "SRYMD"); }
    protected abstract ConditionValue xgetCValueSrymd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_Equal(Long sroprtcnt) {
        doSetSroprtcnt_Equal(sroprtcnt);
    }

    protected void doSetSroprtcnt_Equal(Long sroprtcnt) {
        regSroprtcnt(CK_EQ, sroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotEqual(Long sroprtcnt) {
        doSetSroprtcnt_NotEqual(sroprtcnt);
    }

    protected void doSetSroprtcnt_NotEqual(Long sroprtcnt) {
        regSroprtcnt(CK_NES, sroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_InScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        regINS(CK_INS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNull() { regSroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNotNull() { regSroprtcnt(CK_ISNN, DOBJ); }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcnt The value of presplcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcnt_Equal(Long presplcnt) {
        doSetPresplcnt_Equal(presplcnt);
    }

    protected void doSetPresplcnt_Equal(Long presplcnt) {
        regPresplcnt(CK_EQ, presplcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcnt The value of presplcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcnt_NotEqual(Long presplcnt) {
        doSetPresplcnt_NotEqual(presplcnt);
    }

    protected void doSetPresplcnt_NotEqual(Long presplcnt) {
        regPresplcnt(CK_NES, presplcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcnt The value of presplcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcnt_GreaterThan(Long presplcnt) {
        regPresplcnt(CK_GT, presplcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcnt The value of presplcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcnt_LessThan(Long presplcnt) {
        regPresplcnt(CK_LT, presplcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcnt The value of presplcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcnt_GreaterEqual(Long presplcnt) {
        regPresplcnt(CK_GE, presplcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcnt The value of presplcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcnt_LessEqual(Long presplcnt) {
        regPresplcnt(CK_LE, presplcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param minNumber The min number of presplcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presplcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresplcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresplcnt(), "PRESPLCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcntList The collection of presplcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplcnt_InScope(Collection<Long> presplcntList) {
        doSetPresplcnt_InScope(presplcntList);
    }

    protected void doSetPresplcnt_InScope(Collection<Long> presplcntList) {
        regINS(CK_INS, cTL(presplcntList), xgetCValuePresplcnt(), "PRESPLCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     * @param presplcntList The collection of presplcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplcnt_NotInScope(Collection<Long> presplcntList) {
        doSetPresplcnt_NotInScope(presplcntList);
    }

    protected void doSetPresplcnt_NotInScope(Collection<Long> presplcntList) {
        regINS(CK_NINS, cTL(presplcntList), xgetCValuePresplcnt(), "PRESPLCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     */
    public void setPresplcnt_IsNull() { regPresplcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESPLCNT: {bigint(19)}
     */
    public void setPresplcnt_IsNotNull() { regPresplcnt(CK_ISNN, DOBJ); }

    protected void regPresplcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresplcnt(), "PRESPLCNT"); }
    protected abstract ConditionValue xgetCValuePresplcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_Equal(String srpmtfg) {
        doSetSrpmtfg_Equal(fRES(srpmtfg));
    }

    protected void doSetSrpmtfg_Equal(String srpmtfg) {
        regSrpmtfg(CK_EQ, srpmtfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_NotEqual(String srpmtfg) {
        doSetSrpmtfg_NotEqual(fRES(srpmtfg));
    }

    protected void doSetSrpmtfg_NotEqual(String srpmtfg) {
        regSrpmtfg(CK_NES, srpmtfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_GreaterThan(String srpmtfg) {
        regSrpmtfg(CK_GT, fRES(srpmtfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_LessThan(String srpmtfg) {
        regSrpmtfg(CK_LT, fRES(srpmtfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_GreaterEqual(String srpmtfg) {
        regSrpmtfg(CK_GE, fRES(srpmtfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_LessEqual(String srpmtfg) {
        regSrpmtfg(CK_LE, fRES(srpmtfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfgList The collection of srpmtfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_InScope(Collection<String> srpmtfgList) {
        doSetSrpmtfg_InScope(srpmtfgList);
    }

    protected void doSetSrpmtfg_InScope(Collection<String> srpmtfgList) {
        regINS(CK_INS, cTL(srpmtfgList), xgetCValueSrpmtfg(), "SRPMTFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfgList The collection of srpmtfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_NotInScope(Collection<String> srpmtfgList) {
        doSetSrpmtfg_NotInScope(srpmtfgList);
    }

    protected void doSetSrpmtfg_NotInScope(Collection<String> srpmtfgList) {
        regINS(CK_NINS, cTL(srpmtfgList), xgetCValueSrpmtfg(), "SRPMTFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPMTFG: {char(1)} <br>
     * <pre>e.g. setSrpmtfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srpmtfg The value of srpmtfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrpmtfg_LikeSearch(String srpmtfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srpmtfg), xgetCValueSrpmtfg(), "SRPMTFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrpmtfg_NotLikeSearch(String srpmtfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srpmtfg), xgetCValueSrpmtfg(), "SRPMTFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPMTFG: {char(1)}
     * @param srpmtfg The value of srpmtfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpmtfg_PrefixSearch(String srpmtfg) {
        setSrpmtfg_LikeSearch(srpmtfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     */
    public void setSrpmtfg_IsNull() { regSrpmtfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRPMTFG: {char(1)}
     */
    public void setSrpmtfg_IsNotNull() { regSrpmtfg(CK_ISNN, DOBJ); }

    protected void regSrpmtfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrpmtfg(), "SRPMTFG"); }
    protected abstract ConditionValue xgetCValueSrpmtfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_Equal(String mntpmtfg) {
        doSetMntpmtfg_Equal(fRES(mntpmtfg));
    }

    protected void doSetMntpmtfg_Equal(String mntpmtfg) {
        regMntpmtfg(CK_EQ, mntpmtfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_NotEqual(String mntpmtfg) {
        doSetMntpmtfg_NotEqual(fRES(mntpmtfg));
    }

    protected void doSetMntpmtfg_NotEqual(String mntpmtfg) {
        regMntpmtfg(CK_NES, mntpmtfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_GreaterThan(String mntpmtfg) {
        regMntpmtfg(CK_GT, fRES(mntpmtfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_LessThan(String mntpmtfg) {
        regMntpmtfg(CK_LT, fRES(mntpmtfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_GreaterEqual(String mntpmtfg) {
        regMntpmtfg(CK_GE, fRES(mntpmtfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_LessEqual(String mntpmtfg) {
        regMntpmtfg(CK_LE, fRES(mntpmtfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfgList The collection of mntpmtfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_InScope(Collection<String> mntpmtfgList) {
        doSetMntpmtfg_InScope(mntpmtfgList);
    }

    protected void doSetMntpmtfg_InScope(Collection<String> mntpmtfgList) {
        regINS(CK_INS, cTL(mntpmtfgList), xgetCValueMntpmtfg(), "MNTPMTFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfgList The collection of mntpmtfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_NotInScope(Collection<String> mntpmtfgList) {
        doSetMntpmtfg_NotInScope(mntpmtfgList);
    }

    protected void doSetMntpmtfg_NotInScope(Collection<String> mntpmtfgList) {
        regINS(CK_NINS, cTL(mntpmtfgList), xgetCValueMntpmtfg(), "MNTPMTFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MNTPMTFG: {char(1)} <br>
     * <pre>e.g. setMntpmtfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mntpmtfg The value of mntpmtfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMntpmtfg_LikeSearch(String mntpmtfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mntpmtfg), xgetCValueMntpmtfg(), "MNTPMTFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMntpmtfg_NotLikeSearch(String mntpmtfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mntpmtfg), xgetCValueMntpmtfg(), "MNTPMTFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MNTPMTFG: {char(1)}
     * @param mntpmtfg The value of mntpmtfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMntpmtfg_PrefixSearch(String mntpmtfg) {
        setMntpmtfg_LikeSearch(mntpmtfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     */
    public void setMntpmtfg_IsNull() { regMntpmtfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MNTPMTFG: {char(1)}
     */
    public void setMntpmtfg_IsNotNull() { regMntpmtfg(CK_ISNN, DOBJ); }

    protected void regMntpmtfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMntpmtfg(), "MNTPMTFG"); }
    protected abstract ConditionValue xgetCValueMntpmtfg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_Equal(Long cordrcvcnt) {
        doSetCordrcvcnt_Equal(cordrcvcnt);
    }

    protected void doSetCordrcvcnt_Equal(Long cordrcvcnt) {
        regCordrcvcnt(CK_EQ, cordrcvcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_NotEqual(Long cordrcvcnt) {
        doSetCordrcvcnt_NotEqual(cordrcvcnt);
    }

    protected void doSetCordrcvcnt_NotEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_NES, cordrcvcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_GreaterThan(Long cordrcvcnt) {
        regCordrcvcnt(CK_GT, cordrcvcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_LessThan(Long cordrcvcnt) {
        regCordrcvcnt(CK_LT, cordrcvcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_GreaterEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_GE, cordrcvcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_LessEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_LE, cordrcvcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param minNumber The min number of cordrcvcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cordrcvcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCordrcvcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCordrcvcnt(), "CORDRCVCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcntList The collection of cordrcvcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCordrcvcnt_InScope(Collection<Long> cordrcvcntList) {
        doSetCordrcvcnt_InScope(cordrcvcntList);
    }

    protected void doSetCordrcvcnt_InScope(Collection<Long> cordrcvcntList) {
        regINS(CK_INS, cTL(cordrcvcntList), xgetCValueCordrcvcnt(), "CORDRCVCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcntList The collection of cordrcvcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCordrcvcnt_NotInScope(Collection<Long> cordrcvcntList) {
        doSetCordrcvcnt_NotInScope(cordrcvcntList);
    }

    protected void doSetCordrcvcnt_NotInScope(Collection<Long> cordrcvcntList) {
        regINS(CK_NINS, cTL(cordrcvcntList), xgetCValueCordrcvcnt(), "CORDRCVCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     */
    public void setCordrcvcnt_IsNull() { regCordrcvcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     */
    public void setCordrcvcnt_IsNotNull() { regCordrcvcnt(CK_ISNN, DOBJ); }

    protected void regCordrcvcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCordrcvcnt(), "CORDRCVCNT"); }
    protected abstract ConditionValue xgetCValueCordrcvcnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalue The value of refvalue as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefvalue_Equal(Long refvalue) {
        doSetRefvalue_Equal(refvalue);
    }

    protected void doSetRefvalue_Equal(Long refvalue) {
        regRefvalue(CK_EQ, refvalue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalue The value of refvalue as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefvalue_NotEqual(Long refvalue) {
        doSetRefvalue_NotEqual(refvalue);
    }

    protected void doSetRefvalue_NotEqual(Long refvalue) {
        regRefvalue(CK_NES, refvalue);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalue The value of refvalue as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefvalue_GreaterThan(Long refvalue) {
        regRefvalue(CK_GT, refvalue);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalue The value of refvalue as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefvalue_LessThan(Long refvalue) {
        regRefvalue(CK_LT, refvalue);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalue The value of refvalue as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefvalue_GreaterEqual(Long refvalue) {
        regRefvalue(CK_GE, refvalue);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalue The value of refvalue as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefvalue_LessEqual(Long refvalue) {
        regRefvalue(CK_LE, refvalue);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param minNumber The min number of refvalue. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refvalue. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefvalue_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefvalue(), "REFVALUE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalueList The collection of refvalue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefvalue_InScope(Collection<Long> refvalueList) {
        doSetRefvalue_InScope(refvalueList);
    }

    protected void doSetRefvalue_InScope(Collection<Long> refvalueList) {
        regINS(CK_INS, cTL(refvalueList), xgetCValueRefvalue(), "REFVALUE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFVALUE: {bigint(19)}
     * @param refvalueList The collection of refvalue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefvalue_NotInScope(Collection<Long> refvalueList) {
        doSetRefvalue_NotInScope(refvalueList);
    }

    protected void doSetRefvalue_NotInScope(Collection<Long> refvalueList) {
        regINS(CK_NINS, cTL(refvalueList), xgetCValueRefvalue(), "REFVALUE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     */
    public void setRefvalue_IsNull() { regRefvalue(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFVALUE: {bigint(19)}
     */
    public void setRefvalue_IsNotNull() { regRefvalue(CK_ISNN, DOBJ); }

    protected void regRefvalue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefvalue(), "REFVALUE"); }
    protected abstract ConditionValue xgetCValueRefvalue();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgn The value of sftpclmgn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSftpclmgn_Equal(Long sftpclmgn) {
        doSetSftpclmgn_Equal(sftpclmgn);
    }

    protected void doSetSftpclmgn_Equal(Long sftpclmgn) {
        regSftpclmgn(CK_EQ, sftpclmgn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgn The value of sftpclmgn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSftpclmgn_NotEqual(Long sftpclmgn) {
        doSetSftpclmgn_NotEqual(sftpclmgn);
    }

    protected void doSetSftpclmgn_NotEqual(Long sftpclmgn) {
        regSftpclmgn(CK_NES, sftpclmgn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgn The value of sftpclmgn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSftpclmgn_GreaterThan(Long sftpclmgn) {
        regSftpclmgn(CK_GT, sftpclmgn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgn The value of sftpclmgn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSftpclmgn_LessThan(Long sftpclmgn) {
        regSftpclmgn(CK_LT, sftpclmgn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgn The value of sftpclmgn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSftpclmgn_GreaterEqual(Long sftpclmgn) {
        regSftpclmgn(CK_GE, sftpclmgn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgn The value of sftpclmgn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSftpclmgn_LessEqual(Long sftpclmgn) {
        regSftpclmgn(CK_LE, sftpclmgn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param minNumber The min number of sftpclmgn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sftpclmgn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSftpclmgn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSftpclmgn(), "SFTPCLMGN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgnList The collection of sftpclmgn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclmgn_InScope(Collection<Long> sftpclmgnList) {
        doSetSftpclmgn_InScope(sftpclmgnList);
    }

    protected void doSetSftpclmgn_InScope(Collection<Long> sftpclmgnList) {
        regINS(CK_INS, cTL(sftpclmgnList), xgetCValueSftpclmgn(), "SFTPCLMGN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     * @param sftpclmgnList The collection of sftpclmgn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclmgn_NotInScope(Collection<Long> sftpclmgnList) {
        doSetSftpclmgn_NotInScope(sftpclmgnList);
    }

    protected void doSetSftpclmgn_NotInScope(Collection<Long> sftpclmgnList) {
        regINS(CK_NINS, cTL(sftpclmgnList), xgetCValueSftpclmgn(), "SFTPCLMGN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     */
    public void setSftpclmgn_IsNull() { regSftpclmgn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFTPCLMGN: {bigint(19)}
     */
    public void setSftpclmgn_IsNotNull() { regSftpclmgn(CK_ISNN, DOBJ); }

    protected void regSftpclmgn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSftpclmgn(), "SFTPCLMGN"); }
    protected abstract ConditionValue xgetCValueSftpclmgn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_Equal(String tdayesrcompfg) {
        doSetTdayesrcompfg_Equal(fRES(tdayesrcompfg));
    }

    protected void doSetTdayesrcompfg_Equal(String tdayesrcompfg) {
        regTdayesrcompfg(CK_EQ, tdayesrcompfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_NotEqual(String tdayesrcompfg) {
        doSetTdayesrcompfg_NotEqual(fRES(tdayesrcompfg));
    }

    protected void doSetTdayesrcompfg_NotEqual(String tdayesrcompfg) {
        regTdayesrcompfg(CK_NES, tdayesrcompfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_GreaterThan(String tdayesrcompfg) {
        regTdayesrcompfg(CK_GT, fRES(tdayesrcompfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_LessThan(String tdayesrcompfg) {
        regTdayesrcompfg(CK_LT, fRES(tdayesrcompfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_GreaterEqual(String tdayesrcompfg) {
        regTdayesrcompfg(CK_GE, fRES(tdayesrcompfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_LessEqual(String tdayesrcompfg) {
        regTdayesrcompfg(CK_LE, fRES(tdayesrcompfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfgList The collection of tdayesrcompfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_InScope(Collection<String> tdayesrcompfgList) {
        doSetTdayesrcompfg_InScope(tdayesrcompfgList);
    }

    protected void doSetTdayesrcompfg_InScope(Collection<String> tdayesrcompfgList) {
        regINS(CK_INS, cTL(tdayesrcompfgList), xgetCValueTdayesrcompfg(), "TDAYESRCOMPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfgList The collection of tdayesrcompfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_NotInScope(Collection<String> tdayesrcompfgList) {
        doSetTdayesrcompfg_NotInScope(tdayesrcompfgList);
    }

    protected void doSetTdayesrcompfg_NotInScope(Collection<String> tdayesrcompfgList) {
        regINS(CK_NINS, cTL(tdayesrcompfgList), xgetCValueTdayesrcompfg(), "TDAYESRCOMPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TDAYESRCOMPFG: {char(1)} <br>
     * <pre>e.g. setTdayesrcompfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tdayesrcompfg The value of tdayesrcompfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTdayesrcompfg_LikeSearch(String tdayesrcompfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tdayesrcompfg), xgetCValueTdayesrcompfg(), "TDAYESRCOMPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTdayesrcompfg_NotLikeSearch(String tdayesrcompfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tdayesrcompfg), xgetCValueTdayesrcompfg(), "TDAYESRCOMPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @param tdayesrcompfg The value of tdayesrcompfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayesrcompfg_PrefixSearch(String tdayesrcompfg) {
        setTdayesrcompfg_LikeSearch(tdayesrcompfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     */
    public void setTdayesrcompfg_IsNull() { regTdayesrcompfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYESRCOMPFG: {char(1)}
     */
    public void setTdayesrcompfg_IsNotNull() { regTdayesrcompfg(CK_ISNN, DOBJ); }

    protected void regTdayesrcompfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayesrcompfg(), "TDAYESRCOMPFG"); }
    protected abstract ConditionValue xgetCValueTdayesrcompfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
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
     * LOCIDFRNK: {varchar(30)}
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
     * LOCIDFRNK: {varchar(30)}
     * @param locidfrnk The value of locidfrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_GreaterThan(String locidfrnk) {
        regLocidfrnk(CK_GT, fRES(locidfrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
     * @param locidfrnk The value of locidfrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_LessThan(String locidfrnk) {
        regLocidfrnk(CK_LT, fRES(locidfrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
     * @param locidfrnk The value of locidfrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_GreaterEqual(String locidfrnk) {
        regLocidfrnk(CK_GE, fRES(locidfrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
     * @param locidfrnk The value of locidfrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_LessEqual(String locidfrnk) {
        regLocidfrnk(CK_LE, fRES(locidfrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
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
     * LOCIDFRNK: {varchar(30)}
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
     * LOCIDFRNK: {varchar(30)} <br>
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
     * LOCIDFRNK: {varchar(30)}
     * @param locidfrnk The value of locidfrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocidfrnk_NotLikeSearch(String locidfrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locidfrnk), xgetCValueLocidfrnk(), "LOCIDFRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
     * @param locidfrnk The value of locidfrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocidfrnk_PrefixSearch(String locidfrnk) {
        setLocidfrnk_LikeSearch(locidfrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
     */
    public void setLocidfrnk_IsNull() { regLocidfrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
     */
    public void setLocidfrnk_IsNullOrEmpty() { regLocidfrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCIDFRNK: {varchar(30)}
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
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_Equal(String sortingFlg) {
        doSetSortingFlg_Equal(fRES(sortingFlg));
    }

    protected void doSetSortingFlg_Equal(String sortingFlg) {
        regSortingFlg(CK_EQ, sortingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_NotEqual(String sortingFlg) {
        doSetSortingFlg_NotEqual(fRES(sortingFlg));
    }

    protected void doSetSortingFlg_NotEqual(String sortingFlg) {
        regSortingFlg(CK_NES, sortingFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_GreaterThan(String sortingFlg) {
        regSortingFlg(CK_GT, fRES(sortingFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_LessThan(String sortingFlg) {
        regSortingFlg(CK_LT, fRES(sortingFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_GreaterEqual(String sortingFlg) {
        regSortingFlg(CK_GE, fRES(sortingFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_LessEqual(String sortingFlg) {
        regSortingFlg(CK_LE, fRES(sortingFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlgList The collection of sortingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_InScope(Collection<String> sortingFlgList) {
        doSetSortingFlg_InScope(sortingFlgList);
    }

    protected void doSetSortingFlg_InScope(Collection<String> sortingFlgList) {
        regINS(CK_INS, cTL(sortingFlgList), xgetCValueSortingFlg(), "SORTING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlgList The collection of sortingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_NotInScope(Collection<String> sortingFlgList) {
        doSetSortingFlg_NotInScope(sortingFlgList);
    }

    protected void doSetSortingFlg_NotInScope(Collection<String> sortingFlgList) {
        regINS(CK_NINS, cTL(sortingFlgList), xgetCValueSortingFlg(), "SORTING_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_FLG: {char(1)} <br>
     * <pre>e.g. setSortingFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortingFlg The value of sortingFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortingFlg_LikeSearch(String sortingFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortingFlg), xgetCValueSortingFlg(), "SORTING_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortingFlg_NotLikeSearch(String sortingFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortingFlg), xgetCValueSortingFlg(), "SORTING_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_FLG: {char(1)}
     * @param sortingFlg The value of sortingFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingFlg_PrefixSearch(String sortingFlg) {
        setSortingFlg_LikeSearch(sortingFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     */
    public void setSortingFlg_IsNull() { regSortingFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTING_FLG: {char(1)}
     */
    public void setSortingFlg_IsNotNull() { regSortingFlg(CK_ISNN, DOBJ); }

    protected void regSortingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortingFlg(), "SORTING_FLG"); }
    protected abstract ConditionValue xgetCValueSortingFlg();

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
    public HpSLCFunction<TCsrwhadmCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCsrwhadmCB.class);
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
    public HpSLCFunction<TCsrwhadmCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCsrwhadmCB.class);
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
    public HpSLCFunction<TCsrwhadmCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCsrwhadmCB.class);
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
    public HpSLCFunction<TCsrwhadmCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCsrwhadmCB.class);
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
    public HpSLCFunction<TCsrwhadmCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCsrwhadmCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCsrwhadmCB&gt;() {
     *     public void query(TCsrwhadmCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCsrwhadmCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCsrwhadmCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrwhadmCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCsrwhadmCQ sq);

    protected TCsrwhadmCB xcreateScalarConditionCB() {
        TCsrwhadmCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCsrwhadmCB xcreateScalarConditionPartitionByCB() {
        TCsrwhadmCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCsrwhadmCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SORT_PLACE_MANAGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCsrwhadmCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCsrwhadmCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCsrwhadmCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SORT_PLACE_MANAGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCsrwhadmCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCsrwhadmCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCsrwhadmCQ sq);

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
    protected TCsrwhadmCB newMyCB() {
        return new TCsrwhadmCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCsrwhadmCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

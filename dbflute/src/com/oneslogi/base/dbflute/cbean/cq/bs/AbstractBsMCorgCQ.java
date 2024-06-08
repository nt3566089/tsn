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
 * The abstract condition-query of M_CORG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCorgCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCorgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CORG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgId The value of corgId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgId_Equal(Long corgId) {
        doSetCorgId_Equal(corgId);
    }

    protected void doSetCorgId_Equal(Long corgId) {
        regCorgId(CK_EQ, corgId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgId The value of corgId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgId_NotEqual(Long corgId) {
        doSetCorgId_NotEqual(corgId);
    }

    protected void doSetCorgId_NotEqual(Long corgId) {
        regCorgId(CK_NES, corgId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgId The value of corgId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgId_GreaterThan(Long corgId) {
        regCorgId(CK_GT, corgId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgId The value of corgId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgId_LessThan(Long corgId) {
        regCorgId(CK_LT, corgId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgId The value of corgId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgId_GreaterEqual(Long corgId) {
        regCorgId(CK_GE, corgId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgId The value of corgId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgId_LessEqual(Long corgId) {
        regCorgId(CK_LE, corgId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of corgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of corgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCorgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCorgId(), "CORG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgIdList The collection of corgId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorgId_InScope(Collection<Long> corgIdList) {
        doSetCorgId_InScope(corgIdList);
    }

    protected void doSetCorgId_InScope(Collection<Long> corgIdList) {
        regINS(CK_INS, cTL(corgIdList), xgetCValueCorgId(), "CORG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corgIdList The collection of corgId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorgId_NotInScope(Collection<Long> corgIdList) {
        doSetCorgId_NotInScope(corgIdList);
    }

    protected void doSetCorgId_NotInScope(Collection<Long> corgIdList) {
        regINS(CK_NINS, cTL(corgIdList), xgetCValueCorgId(), "CORG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCorgId_IsNull() { regCorgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCorgId_IsNotNull() { regCorgId(CK_ISNN, DOBJ); }

    protected void regCorgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorgId(), "CORG_ID"); }
    protected abstract ConditionValue xgetCValueCorgId();

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
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_Equal(String orgid) {
        doSetOrgid_Equal(fRES(orgid));
    }

    protected void doSetOrgid_Equal(String orgid) {
        regOrgid(CK_EQ, orgid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_NotEqual(String orgid) {
        doSetOrgid_NotEqual(fRES(orgid));
    }

    protected void doSetOrgid_NotEqual(String orgid) {
        regOrgid(CK_NES, orgid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_GreaterThan(String orgid) {
        regOrgid(CK_GT, fRES(orgid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_LessThan(String orgid) {
        regOrgid(CK_LT, fRES(orgid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_GreaterEqual(String orgid) {
        regOrgid(CK_GE, fRES(orgid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_LessEqual(String orgid) {
        regOrgid(CK_LE, fRES(orgid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgidList The collection of orgid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_InScope(Collection<String> orgidList) {
        doSetOrgid_InScope(orgidList);
    }

    protected void doSetOrgid_InScope(Collection<String> orgidList) {
        regINS(CK_INS, cTL(orgidList), xgetCValueOrgid(), "ORGID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgidList The collection of orgid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_NotInScope(Collection<String> orgidList) {
        doSetOrgid_NotInScope(orgidList);
    }

    protected void doSetOrgid_NotInScope(Collection<String> orgidList) {
        regINS(CK_NINS, cTL(orgidList), xgetCValueOrgid(), "ORGID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGID: {varchar(30)} <br>
     * <pre>e.g. setOrgid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgid The value of orgid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgid_LikeSearch(String orgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgid), xgetCValueOrgid(), "ORGID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgid_NotLikeSearch(String orgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgid), xgetCValueOrgid(), "ORGID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGID: {varchar(30)}
     * @param orgid The value of orgid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgid_PrefixSearch(String orgid) {
        setOrgid_LikeSearch(orgid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     */
    public void setOrgid_IsNull() { regOrgid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     */
    public void setOrgid_IsNullOrEmpty() { regOrgid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGID: {varchar(30)}
     */
    public void setOrgid_IsNotNull() { regOrgid(CK_ISNN, DOBJ); }

    protected void regOrgid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgid(), "ORGID"); }
    protected abstract ConditionValue xgetCValueOrgid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_Equal(String orgnmkjf) {
        doSetOrgnmkjf_Equal(fRES(orgnmkjf));
    }

    protected void doSetOrgnmkjf_Equal(String orgnmkjf) {
        regOrgnmkjf(CK_EQ, orgnmkjf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_NotEqual(String orgnmkjf) {
        doSetOrgnmkjf_NotEqual(fRES(orgnmkjf));
    }

    protected void doSetOrgnmkjf_NotEqual(String orgnmkjf) {
        regOrgnmkjf(CK_NES, orgnmkjf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_GreaterThan(String orgnmkjf) {
        regOrgnmkjf(CK_GT, fRES(orgnmkjf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_LessThan(String orgnmkjf) {
        regOrgnmkjf(CK_LT, fRES(orgnmkjf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_GreaterEqual(String orgnmkjf) {
        regOrgnmkjf(CK_GE, fRES(orgnmkjf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_LessEqual(String orgnmkjf) {
        regOrgnmkjf(CK_LE, fRES(orgnmkjf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjfList The collection of orgnmkjf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_InScope(Collection<String> orgnmkjfList) {
        doSetOrgnmkjf_InScope(orgnmkjfList);
    }

    protected void doSetOrgnmkjf_InScope(Collection<String> orgnmkjfList) {
        regINS(CK_INS, cTL(orgnmkjfList), xgetCValueOrgnmkjf(), "ORGNMKJF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjfList The collection of orgnmkjf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_NotInScope(Collection<String> orgnmkjfList) {
        doSetOrgnmkjf_NotInScope(orgnmkjfList);
    }

    protected void doSetOrgnmkjf_NotInScope(Collection<String> orgnmkjfList) {
        regINS(CK_NINS, cTL(orgnmkjfList), xgetCValueOrgnmkjf(), "ORGNMKJF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(60)} <br>
     * <pre>e.g. setOrgnmkjf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgnmkjf The value of orgnmkjf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgnmkjf_LikeSearch(String orgnmkjf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgnmkjf), xgetCValueOrgnmkjf(), "ORGNMKJF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgnmkjf_NotLikeSearch(String orgnmkjf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgnmkjf), xgetCValueOrgnmkjf(), "ORGNMKJF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     * @param orgnmkjf The value of orgnmkjf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_PrefixSearch(String orgnmkjf) {
        setOrgnmkjf_LikeSearch(orgnmkjf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     */
    public void setOrgnmkjf_IsNull() { regOrgnmkjf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     */
    public void setOrgnmkjf_IsNullOrEmpty() { regOrgnmkjf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(60)}
     */
    public void setOrgnmkjf_IsNotNull() { regOrgnmkjf(CK_ISNN, DOBJ); }

    protected void regOrgnmkjf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgnmkjf(), "ORGNMKJF"); }
    protected abstract ConditionValue xgetCValueOrgnmkjf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_Equal(String orgnmknf) {
        doSetOrgnmknf_Equal(fRES(orgnmknf));
    }

    protected void doSetOrgnmknf_Equal(String orgnmknf) {
        regOrgnmknf(CK_EQ, orgnmknf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_NotEqual(String orgnmknf) {
        doSetOrgnmknf_NotEqual(fRES(orgnmknf));
    }

    protected void doSetOrgnmknf_NotEqual(String orgnmknf) {
        regOrgnmknf(CK_NES, orgnmknf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_GreaterThan(String orgnmknf) {
        regOrgnmknf(CK_GT, fRES(orgnmknf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_LessThan(String orgnmknf) {
        regOrgnmknf(CK_LT, fRES(orgnmknf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_GreaterEqual(String orgnmknf) {
        regOrgnmknf(CK_GE, fRES(orgnmknf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_LessEqual(String orgnmknf) {
        regOrgnmknf(CK_LE, fRES(orgnmknf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknfList The collection of orgnmknf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_InScope(Collection<String> orgnmknfList) {
        doSetOrgnmknf_InScope(orgnmknfList);
    }

    protected void doSetOrgnmknf_InScope(Collection<String> orgnmknfList) {
        regINS(CK_INS, cTL(orgnmknfList), xgetCValueOrgnmknf(), "ORGNMKNF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknfList The collection of orgnmknf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_NotInScope(Collection<String> orgnmknfList) {
        doSetOrgnmknf_NotInScope(orgnmknfList);
    }

    protected void doSetOrgnmknf_NotInScope(Collection<String> orgnmknfList) {
        regINS(CK_NINS, cTL(orgnmknfList), xgetCValueOrgnmknf(), "ORGNMKNF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKNF: {varchar(60)} <br>
     * <pre>e.g. setOrgnmknf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgnmknf The value of orgnmknf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgnmknf_LikeSearch(String orgnmknf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgnmknf), xgetCValueOrgnmknf(), "ORGNMKNF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgnmknf_NotLikeSearch(String orgnmknf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgnmknf), xgetCValueOrgnmknf(), "ORGNMKNF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     * @param orgnmknf The value of orgnmknf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmknf_PrefixSearch(String orgnmknf) {
        setOrgnmknf_LikeSearch(orgnmknf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     */
    public void setOrgnmknf_IsNull() { regOrgnmknf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     */
    public void setOrgnmknf_IsNullOrEmpty() { regOrgnmknf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGNMKNF: {varchar(60)}
     */
    public void setOrgnmknf_IsNotNull() { regOrgnmknf(CK_ISNN, DOBJ); }

    protected void regOrgnmknf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgnmknf(), "ORGNMKNF"); }
    protected abstract ConditionValue xgetCValueOrgnmknf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_Equal(String orgnmkj) {
        doSetOrgnmkj_Equal(fRES(orgnmkj));
    }

    protected void doSetOrgnmkj_Equal(String orgnmkj) {
        regOrgnmkj(CK_EQ, orgnmkj);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_NotEqual(String orgnmkj) {
        doSetOrgnmkj_NotEqual(fRES(orgnmkj));
    }

    protected void doSetOrgnmkj_NotEqual(String orgnmkj) {
        regOrgnmkj(CK_NES, orgnmkj);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_GreaterThan(String orgnmkj) {
        regOrgnmkj(CK_GT, fRES(orgnmkj));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_LessThan(String orgnmkj) {
        regOrgnmkj(CK_LT, fRES(orgnmkj));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_GreaterEqual(String orgnmkj) {
        regOrgnmkj(CK_GE, fRES(orgnmkj));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_LessEqual(String orgnmkj) {
        regOrgnmkj(CK_LE, fRES(orgnmkj));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkjList The collection of orgnmkj as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_InScope(Collection<String> orgnmkjList) {
        doSetOrgnmkj_InScope(orgnmkjList);
    }

    protected void doSetOrgnmkj_InScope(Collection<String> orgnmkjList) {
        regINS(CK_INS, cTL(orgnmkjList), xgetCValueOrgnmkj(), "ORGNMKJ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkjList The collection of orgnmkj as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_NotInScope(Collection<String> orgnmkjList) {
        doSetOrgnmkj_NotInScope(orgnmkjList);
    }

    protected void doSetOrgnmkj_NotInScope(Collection<String> orgnmkjList) {
        regINS(CK_NINS, cTL(orgnmkjList), xgetCValueOrgnmkj(), "ORGNMKJ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJ: {varchar(30)} <br>
     * <pre>e.g. setOrgnmkj_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgnmkj The value of orgnmkj as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgnmkj_LikeSearch(String orgnmkj, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgnmkj), xgetCValueOrgnmkj(), "ORGNMKJ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgnmkj_NotLikeSearch(String orgnmkj, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgnmkj), xgetCValueOrgnmkj(), "ORGNMKJ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     * @param orgnmkj The value of orgnmkj as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkj_PrefixSearch(String orgnmkj) {
        setOrgnmkj_LikeSearch(orgnmkj, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     */
    public void setOrgnmkj_IsNull() { regOrgnmkj(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     */
    public void setOrgnmkj_IsNullOrEmpty() { regOrgnmkj(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGNMKJ: {varchar(30)}
     */
    public void setOrgnmkj_IsNotNull() { regOrgnmkj(CK_ISNN, DOBJ); }

    protected void regOrgnmkj(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgnmkj(), "ORGNMKJ"); }
    protected abstract ConditionValue xgetCValueOrgnmkj();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_Equal(String orgnmkn) {
        doSetOrgnmkn_Equal(fRES(orgnmkn));
    }

    protected void doSetOrgnmkn_Equal(String orgnmkn) {
        regOrgnmkn(CK_EQ, orgnmkn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_NotEqual(String orgnmkn) {
        doSetOrgnmkn_NotEqual(fRES(orgnmkn));
    }

    protected void doSetOrgnmkn_NotEqual(String orgnmkn) {
        regOrgnmkn(CK_NES, orgnmkn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_GreaterThan(String orgnmkn) {
        regOrgnmkn(CK_GT, fRES(orgnmkn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_LessThan(String orgnmkn) {
        regOrgnmkn(CK_LT, fRES(orgnmkn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_GreaterEqual(String orgnmkn) {
        regOrgnmkn(CK_GE, fRES(orgnmkn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_LessEqual(String orgnmkn) {
        regOrgnmkn(CK_LE, fRES(orgnmkn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmknList The collection of orgnmkn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_InScope(Collection<String> orgnmknList) {
        doSetOrgnmkn_InScope(orgnmknList);
    }

    protected void doSetOrgnmkn_InScope(Collection<String> orgnmknList) {
        regINS(CK_INS, cTL(orgnmknList), xgetCValueOrgnmkn(), "ORGNMKN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmknList The collection of orgnmkn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_NotInScope(Collection<String> orgnmknList) {
        doSetOrgnmkn_NotInScope(orgnmknList);
    }

    protected void doSetOrgnmkn_NotInScope(Collection<String> orgnmknList) {
        regINS(CK_NINS, cTL(orgnmknList), xgetCValueOrgnmkn(), "ORGNMKN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKN: {varchar(30)} <br>
     * <pre>e.g. setOrgnmkn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgnmkn The value of orgnmkn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgnmkn_LikeSearch(String orgnmkn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgnmkn), xgetCValueOrgnmkn(), "ORGNMKN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgnmkn_NotLikeSearch(String orgnmkn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgnmkn), xgetCValueOrgnmkn(), "ORGNMKN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKN: {varchar(30)}
     * @param orgnmkn The value of orgnmkn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkn_PrefixSearch(String orgnmkn) {
        setOrgnmkn_LikeSearch(orgnmkn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     */
    public void setOrgnmkn_IsNull() { regOrgnmkn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     */
    public void setOrgnmkn_IsNullOrEmpty() { regOrgnmkn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGNMKN: {varchar(30)}
     */
    public void setOrgnmkn_IsNotNull() { regOrgnmkn(CK_ISNN, DOBJ); }

    protected void regOrgnmkn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgnmkn(), "ORGNMKN"); }
    protected abstract ConditionValue xgetCValueOrgnmkn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_Equal(String uporgncd) {
        doSetUporgncd_Equal(fRES(uporgncd));
    }

    protected void doSetUporgncd_Equal(String uporgncd) {
        regUporgncd(CK_EQ, uporgncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_NotEqual(String uporgncd) {
        doSetUporgncd_NotEqual(fRES(uporgncd));
    }

    protected void doSetUporgncd_NotEqual(String uporgncd) {
        regUporgncd(CK_NES, uporgncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_GreaterThan(String uporgncd) {
        regUporgncd(CK_GT, fRES(uporgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_LessThan(String uporgncd) {
        regUporgncd(CK_LT, fRES(uporgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_GreaterEqual(String uporgncd) {
        regUporgncd(CK_GE, fRES(uporgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_LessEqual(String uporgncd) {
        regUporgncd(CK_LE, fRES(uporgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncdList The collection of uporgncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_InScope(Collection<String> uporgncdList) {
        doSetUporgncd_InScope(uporgncdList);
    }

    protected void doSetUporgncd_InScope(Collection<String> uporgncdList) {
        regINS(CK_INS, cTL(uporgncdList), xgetCValueUporgncd(), "UPORGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncdList The collection of uporgncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_NotInScope(Collection<String> uporgncdList) {
        doSetUporgncd_NotInScope(uporgncdList);
    }

    protected void doSetUporgncd_NotInScope(Collection<String> uporgncdList) {
        regINS(CK_NINS, cTL(uporgncdList), xgetCValueUporgncd(), "UPORGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPORGNCD: {varchar(30)} <br>
     * <pre>e.g. setUporgncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uporgncd The value of uporgncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUporgncd_LikeSearch(String uporgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uporgncd), xgetCValueUporgncd(), "UPORGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUporgncd_NotLikeSearch(String uporgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uporgncd), xgetCValueUporgncd(), "UPORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPORGNCD: {varchar(30)}
     * @param uporgncd The value of uporgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUporgncd_PrefixSearch(String uporgncd) {
        setUporgncd_LikeSearch(uporgncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     */
    public void setUporgncd_IsNull() { regUporgncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     */
    public void setUporgncd_IsNullOrEmpty() { regUporgncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPORGNCD: {varchar(30)}
     */
    public void setUporgncd_IsNotNull() { regUporgncd(CK_ISNN, DOBJ); }

    protected void regUporgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUporgncd(), "UPORGNCD"); }
    protected abstract ConditionValue xgetCValueUporgncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_Equal(String zzbasecd) {
        doSetZzbasecd_Equal(fRES(zzbasecd));
    }

    protected void doSetZzbasecd_Equal(String zzbasecd) {
        regZzbasecd(CK_EQ, zzbasecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_NotEqual(String zzbasecd) {
        doSetZzbasecd_NotEqual(fRES(zzbasecd));
    }

    protected void doSetZzbasecd_NotEqual(String zzbasecd) {
        regZzbasecd(CK_NES, zzbasecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_GreaterThan(String zzbasecd) {
        regZzbasecd(CK_GT, fRES(zzbasecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_LessThan(String zzbasecd) {
        regZzbasecd(CK_LT, fRES(zzbasecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_GreaterEqual(String zzbasecd) {
        regZzbasecd(CK_GE, fRES(zzbasecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_LessEqual(String zzbasecd) {
        regZzbasecd(CK_LE, fRES(zzbasecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecdList The collection of zzbasecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_InScope(Collection<String> zzbasecdList) {
        doSetZzbasecd_InScope(zzbasecdList);
    }

    protected void doSetZzbasecd_InScope(Collection<String> zzbasecdList) {
        regINS(CK_INS, cTL(zzbasecdList), xgetCValueZzbasecd(), "ZZBASECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecdList The collection of zzbasecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_NotInScope(Collection<String> zzbasecdList) {
        doSetZzbasecd_NotInScope(zzbasecdList);
    }

    protected void doSetZzbasecd_NotInScope(Collection<String> zzbasecdList) {
        regINS(CK_NINS, cTL(zzbasecdList), xgetCValueZzbasecd(), "ZZBASECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(30)} <br>
     * <pre>e.g. setZzbasecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzbasecd The value of zzbasecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzbasecd_LikeSearch(String zzbasecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzbasecd), xgetCValueZzbasecd(), "ZZBASECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzbasecd_NotLikeSearch(String zzbasecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzbasecd), xgetCValueZzbasecd(), "ZZBASECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(30)}
     * @param zzbasecd The value of zzbasecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_PrefixSearch(String zzbasecd) {
        setZzbasecd_LikeSearch(zzbasecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     */
    public void setZzbasecd_IsNull() { regZzbasecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     */
    public void setZzbasecd_IsNullOrEmpty() { regZzbasecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(30)}
     */
    public void setZzbasecd_IsNotNull() { regZzbasecd(CK_ISNN, DOBJ); }

    protected void regZzbasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzbasecd(), "ZZBASECD"); }
    protected abstract ConditionValue xgetCValueZzbasecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_Equal(String zzcomacd) {
        doSetZzcomacd_Equal(fRES(zzcomacd));
    }

    protected void doSetZzcomacd_Equal(String zzcomacd) {
        regZzcomacd(CK_EQ, zzcomacd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_NotEqual(String zzcomacd) {
        doSetZzcomacd_NotEqual(fRES(zzcomacd));
    }

    protected void doSetZzcomacd_NotEqual(String zzcomacd) {
        regZzcomacd(CK_NES, zzcomacd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_GreaterThan(String zzcomacd) {
        regZzcomacd(CK_GT, fRES(zzcomacd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_LessThan(String zzcomacd) {
        regZzcomacd(CK_LT, fRES(zzcomacd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_GreaterEqual(String zzcomacd) {
        regZzcomacd(CK_GE, fRES(zzcomacd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_LessEqual(String zzcomacd) {
        regZzcomacd(CK_LE, fRES(zzcomacd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacdList The collection of zzcomacd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_InScope(Collection<String> zzcomacdList) {
        doSetZzcomacd_InScope(zzcomacdList);
    }

    protected void doSetZzcomacd_InScope(Collection<String> zzcomacdList) {
        regINS(CK_INS, cTL(zzcomacdList), xgetCValueZzcomacd(), "ZZCOMACD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacdList The collection of zzcomacd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_NotInScope(Collection<String> zzcomacdList) {
        doSetZzcomacd_NotInScope(zzcomacdList);
    }

    protected void doSetZzcomacd_NotInScope(Collection<String> zzcomacdList) {
        regINS(CK_NINS, cTL(zzcomacdList), xgetCValueZzcomacd(), "ZZCOMACD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZCOMACD: {varchar(30)} <br>
     * <pre>e.g. setZzcomacd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzcomacd The value of zzcomacd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzcomacd_LikeSearch(String zzcomacd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzcomacd), xgetCValueZzcomacd(), "ZZCOMACD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzcomacd_NotLikeSearch(String zzcomacd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzcomacd), xgetCValueZzcomacd(), "ZZCOMACD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     * @param zzcomacd The value of zzcomacd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcomacd_PrefixSearch(String zzcomacd) {
        setZzcomacd_LikeSearch(zzcomacd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     */
    public void setZzcomacd_IsNull() { regZzcomacd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     */
    public void setZzcomacd_IsNullOrEmpty() { regZzcomacd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZCOMACD: {varchar(30)}
     */
    public void setZzcomacd_IsNotNull() { regZzcomacd(CK_ISNN, DOBJ); }

    protected void regZzcomacd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzcomacd(), "ZZCOMACD"); }
    protected abstract ConditionValue xgetCValueZzcomacd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_Equal(String zzwhmgid) {
        doSetZzwhmgid_Equal(fRES(zzwhmgid));
    }

    protected void doSetZzwhmgid_Equal(String zzwhmgid) {
        regZzwhmgid(CK_EQ, zzwhmgid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_NotEqual(String zzwhmgid) {
        doSetZzwhmgid_NotEqual(fRES(zzwhmgid));
    }

    protected void doSetZzwhmgid_NotEqual(String zzwhmgid) {
        regZzwhmgid(CK_NES, zzwhmgid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_GreaterThan(String zzwhmgid) {
        regZzwhmgid(CK_GT, fRES(zzwhmgid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_LessThan(String zzwhmgid) {
        regZzwhmgid(CK_LT, fRES(zzwhmgid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_GreaterEqual(String zzwhmgid) {
        regZzwhmgid(CK_GE, fRES(zzwhmgid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_LessEqual(String zzwhmgid) {
        regZzwhmgid(CK_LE, fRES(zzwhmgid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgidList The collection of zzwhmgid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_InScope(Collection<String> zzwhmgidList) {
        doSetZzwhmgid_InScope(zzwhmgidList);
    }

    protected void doSetZzwhmgid_InScope(Collection<String> zzwhmgidList) {
        regINS(CK_INS, cTL(zzwhmgidList), xgetCValueZzwhmgid(), "ZZWHMGID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgidList The collection of zzwhmgid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_NotInScope(Collection<String> zzwhmgidList) {
        doSetZzwhmgid_NotInScope(zzwhmgidList);
    }

    protected void doSetZzwhmgid_NotInScope(Collection<String> zzwhmgidList) {
        regINS(CK_NINS, cTL(zzwhmgidList), xgetCValueZzwhmgid(), "ZZWHMGID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(30)} <br>
     * <pre>e.g. setZzwhmgid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzwhmgid The value of zzwhmgid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzwhmgid_LikeSearch(String zzwhmgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzwhmgid), xgetCValueZzwhmgid(), "ZZWHMGID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzwhmgid_NotLikeSearch(String zzwhmgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzwhmgid), xgetCValueZzwhmgid(), "ZZWHMGID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     * @param zzwhmgid The value of zzwhmgid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_PrefixSearch(String zzwhmgid) {
        setZzwhmgid_LikeSearch(zzwhmgid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     */
    public void setZzwhmgid_IsNull() { regZzwhmgid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     */
    public void setZzwhmgid_IsNullOrEmpty() { regZzwhmgid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(30)}
     */
    public void setZzwhmgid_IsNotNull() { regZzwhmgid(CK_ISNN, DOBJ); }

    protected void regZzwhmgid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzwhmgid(), "ZZWHMGID"); }
    protected abstract ConditionValue xgetCValueZzwhmgid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_Equal(Long otrnk) {
        doSetOtrnk_Equal(otrnk);
    }

    protected void doSetOtrnk_Equal(Long otrnk) {
        regOtrnk(CK_EQ, otrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_NotEqual(Long otrnk) {
        doSetOtrnk_NotEqual(otrnk);
    }

    protected void doSetOtrnk_NotEqual(Long otrnk) {
        regOtrnk(CK_NES, otrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_GreaterThan(Long otrnk) {
        regOtrnk(CK_GT, otrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_LessThan(Long otrnk) {
        regOtrnk(CK_LT, otrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_GreaterEqual(Long otrnk) {
        regOtrnk(CK_GE, otrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_LessEqual(Long otrnk) {
        regOtrnk(CK_LE, otrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param minNumber The min number of otrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtrnk(), "OTRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnkList The collection of otrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_InScope(Collection<Long> otrnkList) {
        doSetOtrnk_InScope(otrnkList);
    }

    protected void doSetOtrnk_InScope(Collection<Long> otrnkList) {
        regINS(CK_INS, cTL(otrnkList), xgetCValueOtrnk(), "OTRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnkList The collection of otrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_NotInScope(Collection<Long> otrnkList) {
        doSetOtrnk_NotInScope(otrnkList);
    }

    protected void doSetOtrnk_NotInScope(Collection<Long> otrnkList) {
        regINS(CK_NINS, cTL(otrnkList), xgetCValueOtrnk(), "OTRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     */
    public void setOtrnk_IsNull() { regOtrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     */
    public void setOtrnk_IsNotNull() { regOtrnk(CK_ISNN, DOBJ); }

    protected void regOtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtrnk(), "OTRNK"); }
    protected abstract ConditionValue xgetCValueOtrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_Equal(String rdvdid) {
        doSetRdvdid_Equal(fRES(rdvdid));
    }

    protected void doSetRdvdid_Equal(String rdvdid) {
        regRdvdid(CK_EQ, rdvdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_NotEqual(String rdvdid) {
        doSetRdvdid_NotEqual(fRES(rdvdid));
    }

    protected void doSetRdvdid_NotEqual(String rdvdid) {
        regRdvdid(CK_NES, rdvdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_GreaterThan(String rdvdid) {
        regRdvdid(CK_GT, fRES(rdvdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_LessThan(String rdvdid) {
        regRdvdid(CK_LT, fRES(rdvdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_GreaterEqual(String rdvdid) {
        regRdvdid(CK_GE, fRES(rdvdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_LessEqual(String rdvdid) {
        regRdvdid(CK_LE, fRES(rdvdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdidList The collection of rdvdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_InScope(Collection<String> rdvdidList) {
        doSetRdvdid_InScope(rdvdidList);
    }

    protected void doSetRdvdid_InScope(Collection<String> rdvdidList) {
        regINS(CK_INS, cTL(rdvdidList), xgetCValueRdvdid(), "RDVDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdidList The collection of rdvdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_NotInScope(Collection<String> rdvdidList) {
        doSetRdvdid_NotInScope(rdvdidList);
    }

    protected void doSetRdvdid_NotInScope(Collection<String> rdvdidList) {
        regINS(CK_NINS, cTL(rdvdidList), xgetCValueRdvdid(), "RDVDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(30)} <br>
     * <pre>e.g. setRdvdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rdvdid The value of rdvdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRdvdid_LikeSearch(String rdvdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rdvdid), xgetCValueRdvdid(), "RDVDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRdvdid_NotLikeSearch(String rdvdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rdvdid), xgetCValueRdvdid(), "RDVDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(30)}
     * @param rdvdid The value of rdvdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_PrefixSearch(String rdvdid) {
        setRdvdid_LikeSearch(rdvdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     */
    public void setRdvdid_IsNull() { regRdvdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     */
    public void setRdvdid_IsNullOrEmpty() { regRdvdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RDVDID: {varchar(30)}
     */
    public void setRdvdid_IsNotNull() { regRdvdid(CK_ISNN, DOBJ); }

    protected void regRdvdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRdvdid(), "RDVDID"); }
    protected abstract ConditionValue xgetCValueRdvdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_Equal(String zzablymd) {
        doSetZzablymd_Equal(fRES(zzablymd));
    }

    protected void doSetZzablymd_Equal(String zzablymd) {
        regZzablymd(CK_EQ, zzablymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_NotEqual(String zzablymd) {
        doSetZzablymd_NotEqual(fRES(zzablymd));
    }

    protected void doSetZzablymd_NotEqual(String zzablymd) {
        regZzablymd(CK_NES, zzablymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_GreaterThan(String zzablymd) {
        regZzablymd(CK_GT, fRES(zzablymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_LessThan(String zzablymd) {
        regZzablymd(CK_LT, fRES(zzablymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_GreaterEqual(String zzablymd) {
        regZzablymd(CK_GE, fRES(zzablymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_LessEqual(String zzablymd) {
        regZzablymd(CK_LE, fRES(zzablymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymdList The collection of zzablymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_InScope(Collection<String> zzablymdList) {
        doSetZzablymd_InScope(zzablymdList);
    }

    protected void doSetZzablymd_InScope(Collection<String> zzablymdList) {
        regINS(CK_INS, cTL(zzablymdList), xgetCValueZzablymd(), "ZZABLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymdList The collection of zzablymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_NotInScope(Collection<String> zzablymdList) {
        doSetZzablymd_NotInScope(zzablymdList);
    }

    protected void doSetZzablymd_NotInScope(Collection<String> zzablymdList) {
        regINS(CK_NINS, cTL(zzablymdList), xgetCValueZzablymd(), "ZZABLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(8)} <br>
     * <pre>e.g. setZzablymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzablymd The value of zzablymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzablymd_LikeSearch(String zzablymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzablymd), xgetCValueZzablymd(), "ZZABLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzablymd_NotLikeSearch(String zzablymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzablymd), xgetCValueZzablymd(), "ZZABLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     * @param zzablymd The value of zzablymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_PrefixSearch(String zzablymd) {
        setZzablymd_LikeSearch(zzablymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     */
    public void setZzablymd_IsNull() { regZzablymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     */
    public void setZzablymd_IsNullOrEmpty() { regZzablymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(8)}
     */
    public void setZzablymd_IsNotNull() { regZzablymd(CK_ISNN, DOBJ); }

    protected void regZzablymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzablymd(), "ZZABLYMD"); }
    protected abstract ConditionValue xgetCValueZzablymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_Equal(String zzfrdateh) {
        doSetZzfrdateh_Equal(fRES(zzfrdateh));
    }

    protected void doSetZzfrdateh_Equal(String zzfrdateh) {
        regZzfrdateh(CK_EQ, zzfrdateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_NotEqual(String zzfrdateh) {
        doSetZzfrdateh_NotEqual(fRES(zzfrdateh));
    }

    protected void doSetZzfrdateh_NotEqual(String zzfrdateh) {
        regZzfrdateh(CK_NES, zzfrdateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterThan(String zzfrdateh) {
        regZzfrdateh(CK_GT, fRES(zzfrdateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessThan(String zzfrdateh) {
        regZzfrdateh(CK_LT, fRES(zzfrdateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterEqual(String zzfrdateh) {
        regZzfrdateh(CK_GE, fRES(zzfrdateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessEqual(String zzfrdateh) {
        regZzfrdateh(CK_LE, fRES(zzfrdateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdatehList The collection of zzfrdateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_InScope(Collection<String> zzfrdatehList) {
        doSetZzfrdateh_InScope(zzfrdatehList);
    }

    protected void doSetZzfrdateh_InScope(Collection<String> zzfrdatehList) {
        regINS(CK_INS, cTL(zzfrdatehList), xgetCValueZzfrdateh(), "ZZFRDATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdatehList The collection of zzfrdateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_NotInScope(Collection<String> zzfrdatehList) {
        doSetZzfrdateh_NotInScope(zzfrdatehList);
    }

    protected void doSetZzfrdateh_NotInScope(Collection<String> zzfrdatehList) {
        regINS(CK_NINS, cTL(zzfrdatehList), xgetCValueZzfrdateh(), "ZZFRDATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)} <br>
     * <pre>e.g. setZzfrdateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzfrdateh The value of zzfrdateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzfrdateh_LikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzfrdateh_NotLikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_PrefixSearch(String zzfrdateh) {
        setZzfrdateh_LikeSearch(zzfrdateh, xcLSOPPre());
    }

    protected void regZzfrdateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzfrdateh(), "ZZFRDATEH"); }
    protected abstract ConditionValue xgetCValueZzfrdateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_Equal(String zztodateh) {
        doSetZztodateh_Equal(fRES(zztodateh));
    }

    protected void doSetZztodateh_Equal(String zztodateh) {
        regZztodateh(CK_EQ, zztodateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_NotEqual(String zztodateh) {
        doSetZztodateh_NotEqual(fRES(zztodateh));
    }

    protected void doSetZztodateh_NotEqual(String zztodateh) {
        regZztodateh(CK_NES, zztodateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterThan(String zztodateh) {
        regZztodateh(CK_GT, fRES(zztodateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessThan(String zztodateh) {
        regZztodateh(CK_LT, fRES(zztodateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterEqual(String zztodateh) {
        regZztodateh(CK_GE, fRES(zztodateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessEqual(String zztodateh) {
        regZztodateh(CK_LE, fRES(zztodateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodatehList The collection of zztodateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_InScope(Collection<String> zztodatehList) {
        doSetZztodateh_InScope(zztodatehList);
    }

    protected void doSetZztodateh_InScope(Collection<String> zztodatehList) {
        regINS(CK_INS, cTL(zztodatehList), xgetCValueZztodateh(), "ZZTODATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodatehList The collection of zztodateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_NotInScope(Collection<String> zztodatehList) {
        doSetZztodateh_NotInScope(zztodatehList);
    }

    protected void doSetZztodateh_NotInScope(Collection<String> zztodatehList) {
        regINS(CK_NINS, cTL(zztodatehList), xgetCValueZztodateh(), "ZZTODATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)} <br>
     * <pre>e.g. setZztodateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zztodateh The value of zztodateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZztodateh_LikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZztodateh_NotLikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_PrefixSearch(String zztodateh) {
        setZztodateh_LikeSearch(zztodateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     */
    public void setZztodateh_IsNull() { regZztodateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     */
    public void setZztodateh_IsNullOrEmpty() { regZztodateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     */
    public void setZztodateh_IsNotNull() { regZztodateh(CK_ISNN, DOBJ); }

    protected void regZztodateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZztodateh(), "ZZTODATEH"); }
    protected abstract ConditionValue xgetCValueZztodateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_Equal(String sasasid) {
        doSetSasasid_Equal(fRES(sasasid));
    }

    protected void doSetSasasid_Equal(String sasasid) {
        regSasasid(CK_EQ, sasasid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_NotEqual(String sasasid) {
        doSetSasasid_NotEqual(fRES(sasasid));
    }

    protected void doSetSasasid_NotEqual(String sasasid) {
        regSasasid(CK_NES, sasasid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_GreaterThan(String sasasid) {
        regSasasid(CK_GT, fRES(sasasid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_LessThan(String sasasid) {
        regSasasid(CK_LT, fRES(sasasid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_GreaterEqual(String sasasid) {
        regSasasid(CK_GE, fRES(sasasid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_LessEqual(String sasasid) {
        regSasasid(CK_LE, fRES(sasasid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasidList The collection of sasasid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_InScope(Collection<String> sasasidList) {
        doSetSasasid_InScope(sasasidList);
    }

    protected void doSetSasasid_InScope(Collection<String> sasasidList) {
        regINS(CK_INS, cTL(sasasidList), xgetCValueSasasid(), "SASASID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasidList The collection of sasasid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_NotInScope(Collection<String> sasasidList) {
        doSetSasasid_NotInScope(sasasidList);
    }

    protected void doSetSasasid_NotInScope(Collection<String> sasasidList) {
        regINS(CK_NINS, cTL(sasasidList), xgetCValueSasasid(), "SASASID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SASASID: {char(1)} <br>
     * <pre>e.g. setSasasid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sasasid The value of sasasid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSasasid_LikeSearch(String sasasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sasasid), xgetCValueSasasid(), "SASASID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSasasid_NotLikeSearch(String sasasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sasasid), xgetCValueSasasid(), "SASASID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SASASID: {char(1)}
     * @param sasasid The value of sasasid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_PrefixSearch(String sasasid) {
        setSasasid_LikeSearch(sasasid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     */
    public void setSasasid_IsNull() { regSasasid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SASASID: {char(1)}
     */
    public void setSasasid_IsNotNull() { regSasasid(CK_ISNN, DOBJ); }

    protected void regSasasid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSasasid(), "SASASID"); }
    protected abstract ConditionValue xgetCValueSasasid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_Equal(String cmlrasid) {
        doSetCmlrasid_Equal(fRES(cmlrasid));
    }

    protected void doSetCmlrasid_Equal(String cmlrasid) {
        regCmlrasid(CK_EQ, cmlrasid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_NotEqual(String cmlrasid) {
        doSetCmlrasid_NotEqual(fRES(cmlrasid));
    }

    protected void doSetCmlrasid_NotEqual(String cmlrasid) {
        regCmlrasid(CK_NES, cmlrasid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_GreaterThan(String cmlrasid) {
        regCmlrasid(CK_GT, fRES(cmlrasid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_LessThan(String cmlrasid) {
        regCmlrasid(CK_LT, fRES(cmlrasid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_GreaterEqual(String cmlrasid) {
        regCmlrasid(CK_GE, fRES(cmlrasid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_LessEqual(String cmlrasid) {
        regCmlrasid(CK_LE, fRES(cmlrasid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasidList The collection of cmlrasid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_InScope(Collection<String> cmlrasidList) {
        doSetCmlrasid_InScope(cmlrasidList);
    }

    protected void doSetCmlrasid_InScope(Collection<String> cmlrasidList) {
        regINS(CK_INS, cTL(cmlrasidList), xgetCValueCmlrasid(), "CMLRASID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasidList The collection of cmlrasid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_NotInScope(Collection<String> cmlrasidList) {
        doSetCmlrasid_NotInScope(cmlrasidList);
    }

    protected void doSetCmlrasid_NotInScope(Collection<String> cmlrasidList) {
        regINS(CK_NINS, cTL(cmlrasidList), xgetCValueCmlrasid(), "CMLRASID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {char(1)} <br>
     * <pre>e.g. setCmlrasid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmlrasid The value of cmlrasid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmlrasid_LikeSearch(String cmlrasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmlrasid), xgetCValueCmlrasid(), "CMLRASID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmlrasid_NotLikeSearch(String cmlrasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmlrasid), xgetCValueCmlrasid(), "CMLRASID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {char(1)}
     * @param cmlrasid The value of cmlrasid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_PrefixSearch(String cmlrasid) {
        setCmlrasid_LikeSearch(cmlrasid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     */
    public void setCmlrasid_IsNull() { regCmlrasid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CMLRASID: {char(1)}
     */
    public void setCmlrasid_IsNotNull() { regCmlrasid(CK_ISNN, DOBJ); }

    protected void regCmlrasid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmlrasid(), "CMLRASID"); }
    protected abstract ConditionValue xgetCValueCmlrasid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_Equal(String anwhnm) {
        doSetAnwhnm_Equal(fRES(anwhnm));
    }

    protected void doSetAnwhnm_Equal(String anwhnm) {
        regAnwhnm(CK_EQ, anwhnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_NotEqual(String anwhnm) {
        doSetAnwhnm_NotEqual(fRES(anwhnm));
    }

    protected void doSetAnwhnm_NotEqual(String anwhnm) {
        regAnwhnm(CK_NES, anwhnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_GreaterThan(String anwhnm) {
        regAnwhnm(CK_GT, fRES(anwhnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_LessThan(String anwhnm) {
        regAnwhnm(CK_LT, fRES(anwhnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_GreaterEqual(String anwhnm) {
        regAnwhnm(CK_GE, fRES(anwhnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_LessEqual(String anwhnm) {
        regAnwhnm(CK_LE, fRES(anwhnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnmList The collection of anwhnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_InScope(Collection<String> anwhnmList) {
        doSetAnwhnm_InScope(anwhnmList);
    }

    protected void doSetAnwhnm_InScope(Collection<String> anwhnmList) {
        regINS(CK_INS, cTL(anwhnmList), xgetCValueAnwhnm(), "ANWHNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnmList The collection of anwhnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_NotInScope(Collection<String> anwhnmList) {
        doSetAnwhnm_NotInScope(anwhnmList);
    }

    protected void doSetAnwhnm_NotInScope(Collection<String> anwhnmList) {
        regINS(CK_NINS, cTL(anwhnmList), xgetCValueAnwhnm(), "ANWHNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(30)} <br>
     * <pre>e.g. setAnwhnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param anwhnm The value of anwhnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAnwhnm_LikeSearch(String anwhnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(anwhnm), xgetCValueAnwhnm(), "ANWHNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAnwhnm_NotLikeSearch(String anwhnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(anwhnm), xgetCValueAnwhnm(), "ANWHNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(30)}
     * @param anwhnm The value of anwhnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_PrefixSearch(String anwhnm) {
        setAnwhnm_LikeSearch(anwhnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     */
    public void setAnwhnm_IsNull() { regAnwhnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     */
    public void setAnwhnm_IsNullOrEmpty() { regAnwhnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(30)}
     */
    public void setAnwhnm_IsNotNull() { regAnwhnm(CK_ISNN, DOBJ); }

    protected void regAnwhnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAnwhnm(), "ANWHNM"); }
    protected abstract ConditionValue xgetCValueAnwhnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_Equal(String odtscd) {
        doSetOdtscd_Equal(fRES(odtscd));
    }

    protected void doSetOdtscd_Equal(String odtscd) {
        regOdtscd(CK_EQ, odtscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_NotEqual(String odtscd) {
        doSetOdtscd_NotEqual(fRES(odtscd));
    }

    protected void doSetOdtscd_NotEqual(String odtscd) {
        regOdtscd(CK_NES, odtscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_GreaterThan(String odtscd) {
        regOdtscd(CK_GT, fRES(odtscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_LessThan(String odtscd) {
        regOdtscd(CK_LT, fRES(odtscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_GreaterEqual(String odtscd) {
        regOdtscd(CK_GE, fRES(odtscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_LessEqual(String odtscd) {
        regOdtscd(CK_LE, fRES(odtscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscdList The collection of odtscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_InScope(Collection<String> odtscdList) {
        doSetOdtscd_InScope(odtscdList);
    }

    protected void doSetOdtscd_InScope(Collection<String> odtscdList) {
        regINS(CK_INS, cTL(odtscdList), xgetCValueOdtscd(), "ODTSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscdList The collection of odtscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_NotInScope(Collection<String> odtscdList) {
        doSetOdtscd_NotInScope(odtscdList);
    }

    protected void doSetOdtscd_NotInScope(Collection<String> odtscdList) {
        regINS(CK_NINS, cTL(odtscdList), xgetCValueOdtscd(), "ODTSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODTSCD: {char(1)} <br>
     * <pre>e.g. setOdtscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param odtscd The value of odtscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOdtscd_LikeSearch(String odtscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(odtscd), xgetCValueOdtscd(), "ODTSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOdtscd_NotLikeSearch(String odtscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(odtscd), xgetCValueOdtscd(), "ODTSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODTSCD: {char(1)}
     * @param odtscd The value of odtscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_PrefixSearch(String odtscd) {
        setOdtscd_LikeSearch(odtscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     */
    public void setOdtscd_IsNull() { regOdtscd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ODTSCD: {char(1)}
     */
    public void setOdtscd_IsNotNull() { regOdtscd(CK_ISNN, DOBJ); }

    protected void regOdtscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOdtscd(), "ODTSCD"); }
    protected abstract ConditionValue xgetCValueOdtscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_Equal(String lnarcd) {
        doSetLnarcd_Equal(fRES(lnarcd));
    }

    protected void doSetLnarcd_Equal(String lnarcd) {
        regLnarcd(CK_EQ, lnarcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_NotEqual(String lnarcd) {
        doSetLnarcd_NotEqual(fRES(lnarcd));
    }

    protected void doSetLnarcd_NotEqual(String lnarcd) {
        regLnarcd(CK_NES, lnarcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_GreaterThan(String lnarcd) {
        regLnarcd(CK_GT, fRES(lnarcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_LessThan(String lnarcd) {
        regLnarcd(CK_LT, fRES(lnarcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_GreaterEqual(String lnarcd) {
        regLnarcd(CK_GE, fRES(lnarcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_LessEqual(String lnarcd) {
        regLnarcd(CK_LE, fRES(lnarcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcdList The collection of lnarcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_InScope(Collection<String> lnarcdList) {
        doSetLnarcd_InScope(lnarcdList);
    }

    protected void doSetLnarcd_InScope(Collection<String> lnarcdList) {
        regINS(CK_INS, cTL(lnarcdList), xgetCValueLnarcd(), "LNARCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcdList The collection of lnarcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_NotInScope(Collection<String> lnarcdList) {
        doSetLnarcd_NotInScope(lnarcdList);
    }

    protected void doSetLnarcd_NotInScope(Collection<String> lnarcdList) {
        regINS(CK_NINS, cTL(lnarcdList), xgetCValueLnarcd(), "LNARCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LNARCD: {char(1)} <br>
     * <pre>e.g. setLnarcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lnarcd The value of lnarcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLnarcd_LikeSearch(String lnarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lnarcd), xgetCValueLnarcd(), "LNARCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLnarcd_NotLikeSearch(String lnarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lnarcd), xgetCValueLnarcd(), "LNARCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LNARCD: {char(1)}
     * @param lnarcd The value of lnarcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_PrefixSearch(String lnarcd) {
        setLnarcd_LikeSearch(lnarcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     */
    public void setLnarcd_IsNull() { regLnarcd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LNARCD: {char(1)}
     */
    public void setLnarcd_IsNotNull() { regLnarcd(CK_ISNN, DOBJ); }

    protected void regLnarcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLnarcd(), "LNARCD"); }
    protected abstract ConditionValue xgetCValueLnarcd();

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
    public HpSLCFunction<MCorgCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCorgCB.class);
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
    public HpSLCFunction<MCorgCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCorgCB.class);
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
    public HpSLCFunction<MCorgCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCorgCB.class);
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
    public HpSLCFunction<MCorgCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCorgCB.class);
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
    public HpSLCFunction<MCorgCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCorgCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCorgCB&gt;() {
     *     public void query(MCorgCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCorgCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCorgCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCorgCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCorgCQ sq);

    protected MCorgCB xcreateScalarConditionCB() {
        MCorgCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCorgCB xcreateScalarConditionPartitionByCB() {
        MCorgCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCorgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCorgCB cb = new MCorgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CORG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCorgCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCorgCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCorgCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCorgCB cb = new MCorgCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CORG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCorgCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCorgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCorgCB cb = new MCorgCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCorgCQ sq);

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
    protected MCorgCB newMyCB() {
        return new MCorgCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCorgCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

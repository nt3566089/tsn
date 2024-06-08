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
 * The abstract condition-query of M_CDRCATT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCdrcattCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCdrcattCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CDRCATT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattid The value of cdrcattid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCdrcattid_Equal(Long cdrcattid) {
        doSetCdrcattid_Equal(cdrcattid);
    }

    protected void doSetCdrcattid_Equal(Long cdrcattid) {
        regCdrcattid(CK_EQ, cdrcattid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattid The value of cdrcattid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCdrcattid_NotEqual(Long cdrcattid) {
        doSetCdrcattid_NotEqual(cdrcattid);
    }

    protected void doSetCdrcattid_NotEqual(Long cdrcattid) {
        regCdrcattid(CK_NES, cdrcattid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattid The value of cdrcattid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCdrcattid_GreaterThan(Long cdrcattid) {
        regCdrcattid(CK_GT, cdrcattid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattid The value of cdrcattid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCdrcattid_LessThan(Long cdrcattid) {
        regCdrcattid(CK_LT, cdrcattid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattid The value of cdrcattid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCdrcattid_GreaterEqual(Long cdrcattid) {
        regCdrcattid(CK_GE, cdrcattid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattid The value of cdrcattid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCdrcattid_LessEqual(Long cdrcattid) {
        regCdrcattid(CK_LE, cdrcattid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of cdrcattid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cdrcattid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCdrcattid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCdrcattid(), "CDRCATTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattidList The collection of cdrcattid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCdrcattid_InScope(Collection<Long> cdrcattidList) {
        doSetCdrcattid_InScope(cdrcattidList);
    }

    protected void doSetCdrcattid_InScope(Collection<Long> cdrcattidList) {
        regINS(CK_INS, cTL(cdrcattidList), xgetCValueCdrcattid(), "CDRCATTID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @param cdrcattidList The collection of cdrcattid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCdrcattid_NotInScope(Collection<Long> cdrcattidList) {
        doSetCdrcattid_NotInScope(cdrcattidList);
    }

    protected void doSetCdrcattid_NotInScope(Collection<Long> cdrcattidList) {
        regINS(CK_NINS, cTL(cdrcattidList), xgetCValueCdrcattid(), "CDRCATTID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCdrcattid_IsNull() { regCdrcattid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCdrcattid_IsNotNull() { regCdrcattid(CK_ISNN, DOBJ); }

    protected void regCdrcattid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCdrcattid(), "CDRCATTID"); }
    protected abstract ConditionValue xgetCValueCdrcattid();

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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_Equal(String dpcd) {
        doSetDpcd_Equal(fRES(dpcd));
    }

    protected void doSetDpcd_Equal(String dpcd) {
        regDpcd(CK_EQ, dpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotEqual(String dpcd) {
        doSetDpcd_NotEqual(fRES(dpcd));
    }

    protected void doSetDpcd_NotEqual(String dpcd) {
        regDpcd(CK_NES, dpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcdList The collection of dpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_InScope(Collection<String> dpcdList) {
        doSetDpcd_InScope(dpcdList);
    }

    protected void doSetDpcd_InScope(Collection<String> dpcdList) {
        regINS(CK_INS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcdList The collection of dpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotInScope(Collection<String> dpcdList) {
        doSetDpcd_NotInScope(dpcdList);
    }

    protected void doSetDpcd_NotInScope(Collection<String> dpcdList) {
        regINS(CK_NINS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpcd The value of dpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpcd_LikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_Equal(String drccd) {
        doSetDrccd_Equal(fRES(drccd));
    }

    protected void doSetDrccd_Equal(String drccd) {
        regDrccd(CK_EQ, drccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_NotEqual(String drccd) {
        doSetDrccd_NotEqual(fRES(drccd));
    }

    protected void doSetDrccd_NotEqual(String drccd) {
        regDrccd(CK_NES, drccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_GreaterThan(String drccd) {
        regDrccd(CK_GT, fRES(drccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_LessThan(String drccd) {
        regDrccd(CK_LT, fRES(drccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_GreaterEqual(String drccd) {
        regDrccd(CK_GE, fRES(drccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_LessEqual(String drccd) {
        regDrccd(CK_LE, fRES(drccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccdList The collection of drccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_InScope(Collection<String> drccdList) {
        doSetDrccd_InScope(drccdList);
    }

    protected void doSetDrccd_InScope(Collection<String> drccdList) {
        regINS(CK_INS, cTL(drccdList), xgetCValueDrccd(), "DRCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccdList The collection of drccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_NotInScope(Collection<String> drccdList) {
        doSetDrccd_NotInScope(drccdList);
    }

    protected void doSetDrccd_NotInScope(Collection<String> drccdList) {
        regINS(CK_NINS, cTL(drccdList), xgetCValueDrccd(), "DRCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDrccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param drccd The value of drccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDrccd_LikeSearch(String drccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(drccd), xgetCValueDrccd(), "DRCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDrccd_NotLikeSearch(String drccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(drccd), xgetCValueDrccd(), "DRCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_PrefixSearch(String drccd) {
        setDrccd_LikeSearch(drccd, xcLSOPPre());
    }

    protected void regDrccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDrccd(), "DRCCD"); }
    protected abstract ConditionValue xgetCValueDrccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_Equal(String zzpstnid) {
        doSetZzpstnid_Equal(fRES(zzpstnid));
    }

    protected void doSetZzpstnid_Equal(String zzpstnid) {
        regZzpstnid(CK_EQ, zzpstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_NotEqual(String zzpstnid) {
        doSetZzpstnid_NotEqual(fRES(zzpstnid));
    }

    protected void doSetZzpstnid_NotEqual(String zzpstnid) {
        regZzpstnid(CK_NES, zzpstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_GreaterThan(String zzpstnid) {
        regZzpstnid(CK_GT, fRES(zzpstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_LessThan(String zzpstnid) {
        regZzpstnid(CK_LT, fRES(zzpstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_GreaterEqual(String zzpstnid) {
        regZzpstnid(CK_GE, fRES(zzpstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_LessEqual(String zzpstnid) {
        regZzpstnid(CK_LE, fRES(zzpstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnidList The collection of zzpstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_InScope(Collection<String> zzpstnidList) {
        doSetZzpstnid_InScope(zzpstnidList);
    }

    protected void doSetZzpstnid_InScope(Collection<String> zzpstnidList) {
        regINS(CK_INS, cTL(zzpstnidList), xgetCValueZzpstnid(), "ZZPSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnidList The collection of zzpstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_NotInScope(Collection<String> zzpstnidList) {
        doSetZzpstnid_NotInScope(zzpstnidList);
    }

    protected void doSetZzpstnid_NotInScope(Collection<String> zzpstnidList) {
        regINS(CK_NINS, cTL(zzpstnidList), xgetCValueZzpstnid(), "ZZPSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)} <br>
     * <pre>e.g. setZzpstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzpstnid The value of zzpstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzpstnid_LikeSearch(String zzpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzpstnid), xgetCValueZzpstnid(), "ZZPSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzpstnid_NotLikeSearch(String zzpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzpstnid), xgetCValueZzpstnid(), "ZZPSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, char(1)}
     * @param zzpstnid The value of zzpstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_PrefixSearch(String zzpstnid) {
        setZzpstnid_LikeSearch(zzpstnid, xcLSOPPre());
    }

    protected void regZzpstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzpstnid(), "ZZPSTNID"); }
    protected abstract ConditionValue xgetCValueZzpstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_Equal(String srlin) {
        doSetSrlin_Equal(fRES(srlin));
    }

    protected void doSetSrlin_Equal(String srlin) {
        regSrlin(CK_EQ, srlin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_NotEqual(String srlin) {
        doSetSrlin_NotEqual(fRES(srlin));
    }

    protected void doSetSrlin_NotEqual(String srlin) {
        regSrlin(CK_NES, srlin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_GreaterThan(String srlin) {
        regSrlin(CK_GT, fRES(srlin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_LessThan(String srlin) {
        regSrlin(CK_LT, fRES(srlin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_GreaterEqual(String srlin) {
        regSrlin(CK_GE, fRES(srlin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_LessEqual(String srlin) {
        regSrlin(CK_LE, fRES(srlin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlinList The collection of srlin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_InScope(Collection<String> srlinList) {
        doSetSrlin_InScope(srlinList);
    }

    protected void doSetSrlin_InScope(Collection<String> srlinList) {
        regINS(CK_INS, cTL(srlinList), xgetCValueSrlin(), "SRLIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlinList The collection of srlin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_NotInScope(Collection<String> srlinList) {
        doSetSrlin_NotInScope(srlinList);
    }

    protected void doSetSrlin_NotInScope(Collection<String> srlinList) {
        regINS(CK_NINS, cTL(srlinList), xgetCValueSrlin(), "SRLIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)} <br>
     * <pre>e.g. setSrlin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srlin The value of srlin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrlin_LikeSearch(String srlin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srlin), xgetCValueSrlin(), "SRLIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrlin_NotLikeSearch(String srlin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srlin), xgetCValueSrlin(), "SRLIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_PrefixSearch(String srlin) {
        setSrlin_LikeSearch(srlin, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     */
    public void setSrlin_IsNull() { regSrlin(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     */
    public void setSrlin_IsNullOrEmpty() { regSrlin(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     */
    public void setSrlin_IsNotNull() { regSrlin(CK_ISNN, DOBJ); }

    protected void regSrlin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrlin(), "SRLIN"); }
    protected abstract ConditionValue xgetCValueSrlin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_Equal(Long srrnk) {
        doSetSrrnk_Equal(srrnk);
    }

    protected void doSetSrrnk_Equal(Long srrnk) {
        regSrrnk(CK_EQ, srrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_NotEqual(Long srrnk) {
        doSetSrrnk_NotEqual(srrnk);
    }

    protected void doSetSrrnk_NotEqual(Long srrnk) {
        regSrrnk(CK_NES, srrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterThan(Long srrnk) {
        regSrrnk(CK_GT, srrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessThan(Long srrnk) {
        regSrrnk(CK_LT, srrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterEqual(Long srrnk) {
        regSrrnk(CK_GE, srrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessEqual(Long srrnk) {
        regSrrnk(CK_LE, srrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param minNumber The min number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrrnk(), "SRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_InScope(Collection<Long> srrnkList) {
        doSetSrrnk_InScope(srrnkList);
    }

    protected void doSetSrrnk_InScope(Collection<Long> srrnkList) {
        regINS(CK_INS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotInScope(Collection<Long> srrnkList) {
        doSetSrrnk_NotInScope(srrnkList);
    }

    protected void doSetSrrnk_NotInScope(Collection<Long> srrnkList) {
        regINS(CK_NINS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNull() { regSrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNotNull() { regSrrnk(CK_ISNN, DOBJ); }

    protected void regSrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrrnk(), "SRRNK"); }
    protected abstract ConditionValue xgetCValueSrrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_Equal(String snmprtrnkad) {
        doSetSnmprtrnkad_Equal(fRES(snmprtrnkad));
    }

    protected void doSetSnmprtrnkad_Equal(String snmprtrnkad) {
        regSnmprtrnkad(CK_EQ, snmprtrnkad);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_NotEqual(String snmprtrnkad) {
        doSetSnmprtrnkad_NotEqual(fRES(snmprtrnkad));
    }

    protected void doSetSnmprtrnkad_NotEqual(String snmprtrnkad) {
        regSnmprtrnkad(CK_NES, snmprtrnkad);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_GreaterThan(String snmprtrnkad) {
        regSnmprtrnkad(CK_GT, fRES(snmprtrnkad));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_LessThan(String snmprtrnkad) {
        regSnmprtrnkad(CK_LT, fRES(snmprtrnkad));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_GreaterEqual(String snmprtrnkad) {
        regSnmprtrnkad(CK_GE, fRES(snmprtrnkad));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_LessEqual(String snmprtrnkad) {
        regSnmprtrnkad(CK_LE, fRES(snmprtrnkad));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkadList The collection of snmprtrnkad as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_InScope(Collection<String> snmprtrnkadList) {
        doSetSnmprtrnkad_InScope(snmprtrnkadList);
    }

    protected void doSetSnmprtrnkad_InScope(Collection<String> snmprtrnkadList) {
        regINS(CK_INS, cTL(snmprtrnkadList), xgetCValueSnmprtrnkad(), "SNMPRTRNKAD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkadList The collection of snmprtrnkad as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_NotInScope(Collection<String> snmprtrnkadList) {
        doSetSnmprtrnkad_NotInScope(snmprtrnkadList);
    }

    protected void doSetSnmprtrnkad_NotInScope(Collection<String> snmprtrnkadList) {
        regINS(CK_NINS, cTL(snmprtrnkadList), xgetCValueSnmprtrnkad(), "SNMPRTRNKAD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNMPRTRNKAD: {char(1)} <br>
     * <pre>e.g. setSnmprtrnkad_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param snmprtrnkad The value of snmprtrnkad as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnmprtrnkad_LikeSearch(String snmprtrnkad, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snmprtrnkad), xgetCValueSnmprtrnkad(), "SNMPRTRNKAD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnmprtrnkad_NotLikeSearch(String snmprtrnkad, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snmprtrnkad), xgetCValueSnmprtrnkad(), "SNMPRTRNKAD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     * @param snmprtrnkad The value of snmprtrnkad as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnmprtrnkad_PrefixSearch(String snmprtrnkad) {
        setSnmprtrnkad_LikeSearch(snmprtrnkad, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     */
    public void setSnmprtrnkad_IsNull() { regSnmprtrnkad(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SNMPRTRNKAD: {char(1)}
     */
    public void setSnmprtrnkad_IsNotNull() { regSnmprtrnkad(CK_ISNN, DOBJ); }

    protected void regSnmprtrnkad(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSnmprtrnkad(), "SNMPRTRNKAD"); }
    protected abstract ConditionValue xgetCValueSnmprtrnkad();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdy The value of srwkdy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrwkdy_Equal(java.math.BigDecimal srwkdy) {
        doSetSrwkdy_Equal(srwkdy);
    }

    protected void doSetSrwkdy_Equal(java.math.BigDecimal srwkdy) {
        regSrwkdy(CK_EQ, srwkdy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdy The value of srwkdy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrwkdy_NotEqual(java.math.BigDecimal srwkdy) {
        doSetSrwkdy_NotEqual(srwkdy);
    }

    protected void doSetSrwkdy_NotEqual(java.math.BigDecimal srwkdy) {
        regSrwkdy(CK_NES, srwkdy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdy The value of srwkdy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrwkdy_GreaterThan(java.math.BigDecimal srwkdy) {
        regSrwkdy(CK_GT, srwkdy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdy The value of srwkdy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrwkdy_LessThan(java.math.BigDecimal srwkdy) {
        regSrwkdy(CK_LT, srwkdy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdy The value of srwkdy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrwkdy_GreaterEqual(java.math.BigDecimal srwkdy) {
        regSrwkdy(CK_GE, srwkdy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdy The value of srwkdy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrwkdy_LessEqual(java.math.BigDecimal srwkdy) {
        regSrwkdy(CK_LE, srwkdy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of srwkdy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srwkdy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrwkdy_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrwkdy(), "SRWKDY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdyList The collection of srwkdy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwkdy_InScope(Collection<java.math.BigDecimal> srwkdyList) {
        doSetSrwkdy_InScope(srwkdyList);
    }

    protected void doSetSrwkdy_InScope(Collection<java.math.BigDecimal> srwkdyList) {
        regINS(CK_INS, cTL(srwkdyList), xgetCValueSrwkdy(), "SRWKDY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @param srwkdyList The collection of srwkdy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwkdy_NotInScope(Collection<java.math.BigDecimal> srwkdyList) {
        doSetSrwkdy_NotInScope(srwkdyList);
    }

    protected void doSetSrwkdy_NotInScope(Collection<java.math.BigDecimal> srwkdyList) {
        regINS(CK_NINS, cTL(srwkdyList), xgetCValueSrwkdy(), "SRWKDY");
    }

    protected void regSrwkdy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrwkdy(), "SRWKDY"); }
    protected abstract ConditionValue xgetCValueSrwkdy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_Equal(String comt) {
        doSetComt_Equal(fRES(comt));
    }

    protected void doSetComt_Equal(String comt) {
        regComt(CK_EQ, comt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_NotEqual(String comt) {
        doSetComt_NotEqual(fRES(comt));
    }

    protected void doSetComt_NotEqual(String comt) {
        regComt(CK_NES, comt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_GreaterThan(String comt) {
        regComt(CK_GT, fRES(comt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_LessThan(String comt) {
        regComt(CK_LT, fRES(comt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_GreaterEqual(String comt) {
        regComt(CK_GE, fRES(comt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_LessEqual(String comt) {
        regComt(CK_LE, fRES(comt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comtList The collection of comt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_InScope(Collection<String> comtList) {
        doSetComt_InScope(comtList);
    }

    protected void doSetComt_InScope(Collection<String> comtList) {
        regINS(CK_INS, cTL(comtList), xgetCValueComt(), "COMT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comtList The collection of comt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_NotInScope(Collection<String> comtList) {
        doSetComt_NotInScope(comtList);
    }

    protected void doSetComt_NotInScope(Collection<String> comtList) {
        regINS(CK_NINS, cTL(comtList), xgetCValueComt(), "COMT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)} <br>
     * <pre>e.g. setComt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comt The value of comt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComt_LikeSearch(String comt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comt), xgetCValueComt(), "COMT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComt_NotLikeSearch(String comt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comt), xgetCValueComt(), "COMT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_PrefixSearch(String comt) {
        setComt_LikeSearch(comt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     */
    public void setComt_IsNull() { regComt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     */
    public void setComt_IsNullOrEmpty() { regComt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     */
    public void setComt_IsNotNull() { regComt(CK_ISNN, DOBJ); }

    protected void regComt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComt(), "COMT"); }
    protected abstract ConditionValue xgetCValueComt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {char(1)}
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
     * SPRPRSID: {char(1)}
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
     * SPRPRSID: {char(1)}
     * @param sprprsid The value of sprprsid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_GreaterThan(String sprprsid) {
        regSprprsid(CK_GT, fRES(sprprsid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {char(1)}
     * @param sprprsid The value of sprprsid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_LessThan(String sprprsid) {
        regSprprsid(CK_LT, fRES(sprprsid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {char(1)}
     * @param sprprsid The value of sprprsid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_GreaterEqual(String sprprsid) {
        regSprprsid(CK_GE, fRES(sprprsid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {char(1)}
     * @param sprprsid The value of sprprsid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_LessEqual(String sprprsid) {
        regSprprsid(CK_LE, fRES(sprprsid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRPRSID: {char(1)}
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
     * SPRPRSID: {char(1)}
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
     * SPRPRSID: {char(1)} <br>
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
     * SPRPRSID: {char(1)}
     * @param sprprsid The value of sprprsid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprprsid_NotLikeSearch(String sprprsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprprsid), xgetCValueSprprsid(), "SPRPRSID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {char(1)}
     * @param sprprsid The value of sprprsid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_PrefixSearch(String sprprsid) {
        setSprprsid_LikeSearch(sprprsid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {char(1)}
     */
    public void setSprprsid_IsNull() { regSprprsid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {char(1)}
     */
    public void setSprprsid_IsNotNull() { regSprprsid(CK_ISNN, DOBJ); }

    protected void regSprprsid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprprsid(), "SPRPRSID"); }
    protected abstract ConditionValue xgetCValueSprprsid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_Equal(String oddvid) {
        doSetOddvid_Equal(fRES(oddvid));
    }

    protected void doSetOddvid_Equal(String oddvid) {
        regOddvid(CK_EQ, oddvid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_NotEqual(String oddvid) {
        doSetOddvid_NotEqual(fRES(oddvid));
    }

    protected void doSetOddvid_NotEqual(String oddvid) {
        regOddvid(CK_NES, oddvid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_GreaterThan(String oddvid) {
        regOddvid(CK_GT, fRES(oddvid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_LessThan(String oddvid) {
        regOddvid(CK_LT, fRES(oddvid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_GreaterEqual(String oddvid) {
        regOddvid(CK_GE, fRES(oddvid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_LessEqual(String oddvid) {
        regOddvid(CK_LE, fRES(oddvid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvidList The collection of oddvid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_InScope(Collection<String> oddvidList) {
        doSetOddvid_InScope(oddvidList);
    }

    protected void doSetOddvid_InScope(Collection<String> oddvidList) {
        regINS(CK_INS, cTL(oddvidList), xgetCValueOddvid(), "ODDVID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvidList The collection of oddvid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_NotInScope(Collection<String> oddvidList) {
        doSetOddvid_NotInScope(oddvidList);
    }

    protected void doSetOddvid_NotInScope(Collection<String> oddvidList) {
        regINS(CK_NINS, cTL(oddvidList), xgetCValueOddvid(), "ODDVID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODDVID: {char(1)} <br>
     * <pre>e.g. setOddvid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oddvid The value of oddvid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOddvid_LikeSearch(String oddvid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oddvid), xgetCValueOddvid(), "ODDVID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOddvid_NotLikeSearch(String oddvid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oddvid), xgetCValueOddvid(), "ODDVID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODDVID: {char(1)}
     * @param oddvid The value of oddvid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddvid_PrefixSearch(String oddvid) {
        setOddvid_LikeSearch(oddvid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     */
    public void setOddvid_IsNull() { regOddvid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ODDVID: {char(1)}
     */
    public void setOddvid_IsNotNull() { regOddvid(CK_ISNN, DOBJ); }

    protected void regOddvid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOddvid(), "ODDVID"); }
    protected abstract ConditionValue xgetCValueOddvid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_Equal(String hdrdbxusid) {
        doSetHdrdbxusid_Equal(fRES(hdrdbxusid));
    }

    protected void doSetHdrdbxusid_Equal(String hdrdbxusid) {
        regHdrdbxusid(CK_EQ, hdrdbxusid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_NotEqual(String hdrdbxusid) {
        doSetHdrdbxusid_NotEqual(fRES(hdrdbxusid));
    }

    protected void doSetHdrdbxusid_NotEqual(String hdrdbxusid) {
        regHdrdbxusid(CK_NES, hdrdbxusid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_GreaterThan(String hdrdbxusid) {
        regHdrdbxusid(CK_GT, fRES(hdrdbxusid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_LessThan(String hdrdbxusid) {
        regHdrdbxusid(CK_LT, fRES(hdrdbxusid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_GreaterEqual(String hdrdbxusid) {
        regHdrdbxusid(CK_GE, fRES(hdrdbxusid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_LessEqual(String hdrdbxusid) {
        regHdrdbxusid(CK_LE, fRES(hdrdbxusid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusidList The collection of hdrdbxusid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_InScope(Collection<String> hdrdbxusidList) {
        doSetHdrdbxusid_InScope(hdrdbxusidList);
    }

    protected void doSetHdrdbxusid_InScope(Collection<String> hdrdbxusidList) {
        regINS(CK_INS, cTL(hdrdbxusidList), xgetCValueHdrdbxusid(), "HDRDBXUSID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusidList The collection of hdrdbxusid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_NotInScope(Collection<String> hdrdbxusidList) {
        doSetHdrdbxusid_NotInScope(hdrdbxusidList);
    }

    protected void doSetHdrdbxusid_NotInScope(Collection<String> hdrdbxusidList) {
        regINS(CK_NINS, cTL(hdrdbxusidList), xgetCValueHdrdbxusid(), "HDRDBXUSID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXUSID: {char(1)} <br>
     * <pre>e.g. setHdrdbxusid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrdbxusid The value of hdrdbxusid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrdbxusid_LikeSearch(String hdrdbxusid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrdbxusid), xgetCValueHdrdbxusid(), "HDRDBXUSID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrdbxusid_NotLikeSearch(String hdrdbxusid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrdbxusid), xgetCValueHdrdbxusid(), "HDRDBXUSID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXUSID: {char(1)}
     * @param hdrdbxusid The value of hdrdbxusid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxusid_PrefixSearch(String hdrdbxusid) {
        setHdrdbxusid_LikeSearch(hdrdbxusid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     */
    public void setHdrdbxusid_IsNull() { regHdrdbxusid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRDBXUSID: {char(1)}
     */
    public void setHdrdbxusid_IsNotNull() { regHdrdbxusid(CK_ISNN, DOBJ); }

    protected void regHdrdbxusid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrdbxusid(), "HDRDBXUSID"); }
    protected abstract ConditionValue xgetCValueHdrdbxusid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterThan(String zzfrdateh) {
        regZzfrdateh(CK_GT, fRES(zzfrdateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessThan(String zzfrdateh) {
        regZzfrdateh(CK_LT, fRES(zzfrdateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterEqual(String zzfrdateh) {
        regZzfrdateh(CK_GE, fRES(zzfrdateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessEqual(String zzfrdateh) {
        regZzfrdateh(CK_LE, fRES(zzfrdateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)} <br>
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
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzfrdateh_NotLikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_PrefixSearch(String zzfrdateh) {
        setZzfrdateh_LikeSearch(zzfrdateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     */
    public void setZzfrdateh_IsNull() { regZzfrdateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     */
    public void setZzfrdateh_IsNullOrEmpty() { regZzfrdateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     */
    public void setZzfrdateh_IsNotNull() { regZzfrdateh(CK_ISNN, DOBJ); }

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
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_Equal(String grtnid) {
        doSetGrtnid_Equal(fRES(grtnid));
    }

    protected void doSetGrtnid_Equal(String grtnid) {
        regGrtnid(CK_EQ, grtnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_NotEqual(String grtnid) {
        doSetGrtnid_NotEqual(fRES(grtnid));
    }

    protected void doSetGrtnid_NotEqual(String grtnid) {
        regGrtnid(CK_NES, grtnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_GreaterThan(String grtnid) {
        regGrtnid(CK_GT, fRES(grtnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_LessThan(String grtnid) {
        regGrtnid(CK_LT, fRES(grtnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_GreaterEqual(String grtnid) {
        regGrtnid(CK_GE, fRES(grtnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_LessEqual(String grtnid) {
        regGrtnid(CK_LE, fRES(grtnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnidList The collection of grtnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_InScope(Collection<String> grtnidList) {
        doSetGrtnid_InScope(grtnidList);
    }

    protected void doSetGrtnid_InScope(Collection<String> grtnidList) {
        regINS(CK_INS, cTL(grtnidList), xgetCValueGrtnid(), "GRTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnidList The collection of grtnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_NotInScope(Collection<String> grtnidList) {
        doSetGrtnid_NotInScope(grtnidList);
    }

    protected void doSetGrtnid_NotInScope(Collection<String> grtnidList) {
        regINS(CK_NINS, cTL(grtnidList), xgetCValueGrtnid(), "GRTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GRTNID: {NotNull, char(1)} <br>
     * <pre>e.g. setGrtnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grtnid The value of grtnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGrtnid_LikeSearch(String grtnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grtnid), xgetCValueGrtnid(), "GRTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGrtnid_NotLikeSearch(String grtnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grtnid), xgetCValueGrtnid(), "GRTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GRTNID: {NotNull, char(1)}
     * @param grtnid The value of grtnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrtnid_PrefixSearch(String grtnid) {
        setGrtnid_LikeSearch(grtnid, xcLSOPPre());
    }

    protected void regGrtnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrtnid(), "GRTNID"); }
    protected abstract ConditionValue xgetCValueGrtnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_Equal(String ikeiincldflg) {
        doSetIkeiincldflg_Equal(fRES(ikeiincldflg));
    }

    protected void doSetIkeiincldflg_Equal(String ikeiincldflg) {
        regIkeiincldflg(CK_EQ, ikeiincldflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_NotEqual(String ikeiincldflg) {
        doSetIkeiincldflg_NotEqual(fRES(ikeiincldflg));
    }

    protected void doSetIkeiincldflg_NotEqual(String ikeiincldflg) {
        regIkeiincldflg(CK_NES, ikeiincldflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_GreaterThan(String ikeiincldflg) {
        regIkeiincldflg(CK_GT, fRES(ikeiincldflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_LessThan(String ikeiincldflg) {
        regIkeiincldflg(CK_LT, fRES(ikeiincldflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_GreaterEqual(String ikeiincldflg) {
        regIkeiincldflg(CK_GE, fRES(ikeiincldflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_LessEqual(String ikeiincldflg) {
        regIkeiincldflg(CK_LE, fRES(ikeiincldflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflgList The collection of ikeiincldflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_InScope(Collection<String> ikeiincldflgList) {
        doSetIkeiincldflg_InScope(ikeiincldflgList);
    }

    protected void doSetIkeiincldflg_InScope(Collection<String> ikeiincldflgList) {
        regINS(CK_INS, cTL(ikeiincldflgList), xgetCValueIkeiincldflg(), "IKEIINCLDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflgList The collection of ikeiincldflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_NotInScope(Collection<String> ikeiincldflgList) {
        doSetIkeiincldflg_NotInScope(ikeiincldflgList);
    }

    protected void doSetIkeiincldflg_NotInScope(Collection<String> ikeiincldflgList) {
        regINS(CK_NINS, cTL(ikeiincldflgList), xgetCValueIkeiincldflg(), "IKEIINCLDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1)} <br>
     * <pre>e.g. setIkeiincldflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ikeiincldflg The value of ikeiincldflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIkeiincldflg_LikeSearch(String ikeiincldflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ikeiincldflg), xgetCValueIkeiincldflg(), "IKEIINCLDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIkeiincldflg_NotLikeSearch(String ikeiincldflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ikeiincldflg), xgetCValueIkeiincldflg(), "IKEIINCLDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     * @param ikeiincldflg The value of ikeiincldflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_PrefixSearch(String ikeiincldflg) {
        setIkeiincldflg_LikeSearch(ikeiincldflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     */
    public void setIkeiincldflg_IsNull() { regIkeiincldflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1)}
     */
    public void setIkeiincldflg_IsNotNull() { regIkeiincldflg(CK_ISNN, DOBJ); }

    protected void regIkeiincldflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIkeiincldflg(), "IKEIINCLDFLG"); }
    protected abstract ConditionValue xgetCValueIkeiincldflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_Equal(String remoteisland) {
        doSetRemoteisland_Equal(fRES(remoteisland));
    }

    protected void doSetRemoteisland_Equal(String remoteisland) {
        regRemoteisland(CK_EQ, remoteisland);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_NotEqual(String remoteisland) {
        doSetRemoteisland_NotEqual(fRES(remoteisland));
    }

    protected void doSetRemoteisland_NotEqual(String remoteisland) {
        regRemoteisland(CK_NES, remoteisland);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_GreaterThan(String remoteisland) {
        regRemoteisland(CK_GT, fRES(remoteisland));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_LessThan(String remoteisland) {
        regRemoteisland(CK_LT, fRES(remoteisland));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_GreaterEqual(String remoteisland) {
        regRemoteisland(CK_GE, fRES(remoteisland));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_LessEqual(String remoteisland) {
        regRemoteisland(CK_LE, fRES(remoteisland));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteislandList The collection of remoteisland as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_InScope(Collection<String> remoteislandList) {
        doSetRemoteisland_InScope(remoteislandList);
    }

    protected void doSetRemoteisland_InScope(Collection<String> remoteislandList) {
        regINS(CK_INS, cTL(remoteislandList), xgetCValueRemoteisland(), "REMOTEISLAND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteislandList The collection of remoteisland as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_NotInScope(Collection<String> remoteislandList) {
        doSetRemoteisland_NotInScope(remoteislandList);
    }

    protected void doSetRemoteisland_NotInScope(Collection<String> remoteislandList) {
        regINS(CK_NINS, cTL(remoteislandList), xgetCValueRemoteisland(), "REMOTEISLAND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMOTEISLAND: {varchar(30)} <br>
     * <pre>e.g. setRemoteisland_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remoteisland The value of remoteisland as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRemoteisland_LikeSearch(String remoteisland, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remoteisland), xgetCValueRemoteisland(), "REMOTEISLAND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRemoteisland_NotLikeSearch(String remoteisland, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remoteisland), xgetCValueRemoteisland(), "REMOTEISLAND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     * @param remoteisland The value of remoteisland as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemoteisland_PrefixSearch(String remoteisland) {
        setRemoteisland_LikeSearch(remoteisland, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     */
    public void setRemoteisland_IsNull() { regRemoteisland(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     */
    public void setRemoteisland_IsNullOrEmpty() { regRemoteisland(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMOTEISLAND: {varchar(30)}
     */
    public void setRemoteisland_IsNotNull() { regRemoteisland(CK_ISNN, DOBJ); }

    protected void regRemoteisland(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemoteisland(), "REMOTEISLAND"); }
    protected abstract ConditionValue xgetCValueRemoteisland();

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
    public HpSLCFunction<MCdrcattCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCdrcattCB.class);
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
    public HpSLCFunction<MCdrcattCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCdrcattCB.class);
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
    public HpSLCFunction<MCdrcattCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCdrcattCB.class);
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
    public HpSLCFunction<MCdrcattCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCdrcattCB.class);
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
    public HpSLCFunction<MCdrcattCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCdrcattCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCdrcattCB&gt;() {
     *     public void query(MCdrcattCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCdrcattCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCdrcattCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCdrcattCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCdrcattCQ sq);

    protected MCdrcattCB xcreateScalarConditionCB() {
        MCdrcattCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCdrcattCB xcreateScalarConditionPartitionByCB() {
        MCdrcattCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCdrcattCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CDRCATTID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCdrcattCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCdrcattCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCdrcattCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CDRCATTID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCdrcattCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCdrcattCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCdrcattCQ sq);

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
    protected MCdrcattCB newMyCB() {
        return new MCdrcattCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCdrcattCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

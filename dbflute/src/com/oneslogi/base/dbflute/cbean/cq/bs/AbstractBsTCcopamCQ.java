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
 * The abstract condition-query of T_CCOPAM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCcopamCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCcopamCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CCOPAM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamId The value of ccopamId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCcopamId_Equal(Long ccopamId) {
        doSetCcopamId_Equal(ccopamId);
    }

    protected void doSetCcopamId_Equal(Long ccopamId) {
        regCcopamId(CK_EQ, ccopamId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamId The value of ccopamId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCcopamId_NotEqual(Long ccopamId) {
        doSetCcopamId_NotEqual(ccopamId);
    }

    protected void doSetCcopamId_NotEqual(Long ccopamId) {
        regCcopamId(CK_NES, ccopamId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamId The value of ccopamId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCcopamId_GreaterThan(Long ccopamId) {
        regCcopamId(CK_GT, ccopamId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamId The value of ccopamId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCcopamId_LessThan(Long ccopamId) {
        regCcopamId(CK_LT, ccopamId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamId The value of ccopamId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCcopamId_GreaterEqual(Long ccopamId) {
        regCcopamId(CK_GE, ccopamId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamId The value of ccopamId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCcopamId_LessEqual(Long ccopamId) {
        regCcopamId(CK_LE, ccopamId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of ccopamId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ccopamId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCcopamId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCcopamId(), "CCOPAM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamIdList The collection of ccopamId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCcopamId_InScope(Collection<Long> ccopamIdList) {
        doSetCcopamId_InScope(ccopamIdList);
    }

    protected void doSetCcopamId_InScope(Collection<Long> ccopamIdList) {
        regINS(CK_INS, cTL(ccopamIdList), xgetCValueCcopamId(), "CCOPAM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ccopamIdList The collection of ccopamId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCcopamId_NotInScope(Collection<Long> ccopamIdList) {
        doSetCcopamId_NotInScope(ccopamIdList);
    }

    protected void doSetCcopamId_NotInScope(Collection<Long> ccopamIdList) {
        regINS(CK_NINS, cTL(ccopamIdList), xgetCValueCcopamId(), "CCOPAM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCcopamId_IsNull() { regCcopamId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCcopamId_IsNotNull() { regCcopamId(CK_ISNN, DOBJ); }

    protected void regCcopamId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCcopamId(), "CCOPAM_ID"); }
    protected abstract ConditionValue xgetCValueCcopamId();

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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_Equal(String snno1) {
        doSetSnno1_Equal(fRES(snno1));
    }

    protected void doSetSnno1_Equal(String snno1) {
        regSnno1(CK_EQ, snno1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_NotEqual(String snno1) {
        doSetSnno1_NotEqual(fRES(snno1));
    }

    protected void doSetSnno1_NotEqual(String snno1) {
        regSnno1(CK_NES, snno1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_GreaterThan(String snno1) {
        regSnno1(CK_GT, fRES(snno1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_LessThan(String snno1) {
        regSnno1(CK_LT, fRES(snno1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_GreaterEqual(String snno1) {
        regSnno1(CK_GE, fRES(snno1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_LessEqual(String snno1) {
        regSnno1(CK_LE, fRES(snno1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1List The collection of snno1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_InScope(Collection<String> snno1List) {
        doSetSnno1_InScope(snno1List);
    }

    protected void doSetSnno1_InScope(Collection<String> snno1List) {
        regINS(CK_INS, cTL(snno1List), xgetCValueSnno1(), "SNNO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1List The collection of snno1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_NotInScope(Collection<String> snno1List) {
        doSetSnno1_NotInScope(snno1List);
    }

    protected void doSetSnno1_NotInScope(Collection<String> snno1List) {
        regINS(CK_NINS, cTL(snno1List), xgetCValueSnno1(), "SNNO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO1: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSnno1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param snno1 The value of snno1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnno1_LikeSearch(String snno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snno1), xgetCValueSnno1(), "SNNO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnno1_NotLikeSearch(String snno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snno1), xgetCValueSnno1(), "SNNO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @param snno1 The value of snno1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno1_PrefixSearch(String snno1) {
        setSnno1_LikeSearch(snno1, xcLSOPPre());
    }

    protected void regSnno1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSnno1(), "SNNO1"); }
    protected abstract ConditionValue xgetCValueSnno1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_Equal(String snno2) {
        doSetSnno2_Equal(fRES(snno2));
    }

    protected void doSetSnno2_Equal(String snno2) {
        regSnno2(CK_EQ, snno2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_NotEqual(String snno2) {
        doSetSnno2_NotEqual(fRES(snno2));
    }

    protected void doSetSnno2_NotEqual(String snno2) {
        regSnno2(CK_NES, snno2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_GreaterThan(String snno2) {
        regSnno2(CK_GT, fRES(snno2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_LessThan(String snno2) {
        regSnno2(CK_LT, fRES(snno2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_GreaterEqual(String snno2) {
        regSnno2(CK_GE, fRES(snno2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_LessEqual(String snno2) {
        regSnno2(CK_LE, fRES(snno2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2List The collection of snno2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_InScope(Collection<String> snno2List) {
        doSetSnno2_InScope(snno2List);
    }

    protected void doSetSnno2_InScope(Collection<String> snno2List) {
        regINS(CK_INS, cTL(snno2List), xgetCValueSnno2(), "SNNO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2List The collection of snno2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_NotInScope(Collection<String> snno2List) {
        doSetSnno2_NotInScope(snno2List);
    }

    protected void doSetSnno2_NotInScope(Collection<String> snno2List) {
        regINS(CK_NINS, cTL(snno2List), xgetCValueSnno2(), "SNNO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO2: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSnno2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param snno2 The value of snno2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnno2_LikeSearch(String snno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snno2), xgetCValueSnno2(), "SNNO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnno2_NotLikeSearch(String snno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snno2), xgetCValueSnno2(), "SNNO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @param snno2 The value of snno2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno2_PrefixSearch(String snno2) {
        setSnno2_LikeSearch(snno2, xcLSOPPre());
    }

    protected void regSnno2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSnno2(), "SNNO2"); }
    protected abstract ConditionValue xgetCValueSnno2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_Equal(String snno3) {
        doSetSnno3_Equal(fRES(snno3));
    }

    protected void doSetSnno3_Equal(String snno3) {
        regSnno3(CK_EQ, snno3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_NotEqual(String snno3) {
        doSetSnno3_NotEqual(fRES(snno3));
    }

    protected void doSetSnno3_NotEqual(String snno3) {
        regSnno3(CK_NES, snno3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_GreaterThan(String snno3) {
        regSnno3(CK_GT, fRES(snno3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_LessThan(String snno3) {
        regSnno3(CK_LT, fRES(snno3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_GreaterEqual(String snno3) {
        regSnno3(CK_GE, fRES(snno3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_LessEqual(String snno3) {
        regSnno3(CK_LE, fRES(snno3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3List The collection of snno3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_InScope(Collection<String> snno3List) {
        doSetSnno3_InScope(snno3List);
    }

    protected void doSetSnno3_InScope(Collection<String> snno3List) {
        regINS(CK_INS, cTL(snno3List), xgetCValueSnno3(), "SNNO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3List The collection of snno3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_NotInScope(Collection<String> snno3List) {
        doSetSnno3_NotInScope(snno3List);
    }

    protected void doSetSnno3_NotInScope(Collection<String> snno3List) {
        regINS(CK_NINS, cTL(snno3List), xgetCValueSnno3(), "SNNO3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO3: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSnno3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param snno3 The value of snno3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnno3_LikeSearch(String snno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snno3), xgetCValueSnno3(), "SNNO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnno3_NotLikeSearch(String snno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snno3), xgetCValueSnno3(), "SNNO3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @param snno3 The value of snno3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnno3_PrefixSearch(String snno3) {
        setSnno3_LikeSearch(snno3, xcLSOPPre());
    }

    protected void regSnno3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSnno3(), "SNNO3"); }
    protected abstract ConditionValue xgetCValueSnno3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_Equal(String carno) {
        doSetCarno_Equal(fRES(carno));
    }

    protected void doSetCarno_Equal(String carno) {
        regCarno(CK_EQ, carno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_NotEqual(String carno) {
        doSetCarno_NotEqual(fRES(carno));
    }

    protected void doSetCarno_NotEqual(String carno) {
        regCarno(CK_NES, carno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_GreaterThan(String carno) {
        regCarno(CK_GT, fRES(carno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_LessThan(String carno) {
        regCarno(CK_LT, fRES(carno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_GreaterEqual(String carno) {
        regCarno(CK_GE, fRES(carno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_LessEqual(String carno) {
        regCarno(CK_LE, fRES(carno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carnoList The collection of carno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_InScope(Collection<String> carnoList) {
        doSetCarno_InScope(carnoList);
    }

    protected void doSetCarno_InScope(Collection<String> carnoList) {
        regINS(CK_INS, cTL(carnoList), xgetCValueCarno(), "CARNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carnoList The collection of carno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_NotInScope(Collection<String> carnoList) {
        doSetCarno_NotInScope(carnoList);
    }

    protected void doSetCarno_NotInScope(Collection<String> carnoList) {
        regINS(CK_NINS, cTL(carnoList), xgetCValueCarno(), "CARNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARNO: {varchar(30)} <br>
     * <pre>e.g. setCarno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carno The value of carno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarno_LikeSearch(String carno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carno), xgetCValueCarno(), "CARNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarno_NotLikeSearch(String carno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carno), xgetCValueCarno(), "CARNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARNO: {varchar(30)}
     * @param carno The value of carno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarno_PrefixSearch(String carno) {
        setCarno_LikeSearch(carno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     */
    public void setCarno_IsNull() { regCarno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     */
    public void setCarno_IsNullOrEmpty() { regCarno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARNO: {varchar(30)}
     */
    public void setCarno_IsNotNull() { regCarno(CK_ISNN, DOBJ); }

    protected void regCarno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarno(), "CARNO"); }
    protected abstract ConditionValue xgetCValueCarno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_Equal(String snymd) {
        doSetSnymd_Equal(fRES(snymd));
    }

    protected void doSetSnymd_Equal(String snymd) {
        regSnymd(CK_EQ, snymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_NotEqual(String snymd) {
        doSetSnymd_NotEqual(fRES(snymd));
    }

    protected void doSetSnymd_NotEqual(String snymd) {
        regSnymd(CK_NES, snymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_GreaterThan(String snymd) {
        regSnymd(CK_GT, fRES(snymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_LessThan(String snymd) {
        regSnymd(CK_LT, fRES(snymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_GreaterEqual(String snymd) {
        regSnymd(CK_GE, fRES(snymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_LessEqual(String snymd) {
        regSnymd(CK_LE, fRES(snymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymdList The collection of snymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_InScope(Collection<String> snymdList) {
        doSetSnymd_InScope(snymdList);
    }

    protected void doSetSnymd_InScope(Collection<String> snymdList) {
        regINS(CK_INS, cTL(snymdList), xgetCValueSnymd(), "SNYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymdList The collection of snymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_NotInScope(Collection<String> snymdList) {
        doSetSnymd_NotInScope(snymdList);
    }

    protected void doSetSnymd_NotInScope(Collection<String> snymdList) {
        regINS(CK_NINS, cTL(snymdList), xgetCValueSnymd(), "SNYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNYMD: {varchar(8)} <br>
     * <pre>e.g. setSnymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param snymd The value of snymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnymd_LikeSearch(String snymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snymd), xgetCValueSnymd(), "SNYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnymd_NotLikeSearch(String snymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snymd), xgetCValueSnymd(), "SNYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNYMD: {varchar(8)}
     * @param snymd The value of snymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnymd_PrefixSearch(String snymd) {
        setSnymd_LikeSearch(snymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     */
    public void setSnymd_IsNull() { regSnymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     */
    public void setSnymd_IsNullOrEmpty() { regSnymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SNYMD: {varchar(8)}
     */
    public void setSnymd_IsNotNull() { regSnymd(CK_ISNN, DOBJ); }

    protected void regSnymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSnymd(), "SNYMD"); }
    protected abstract ConditionValue xgetCValueSnymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_Equal(String arvymd) {
        doSetArvymd_Equal(fRES(arvymd));
    }

    protected void doSetArvymd_Equal(String arvymd) {
        regArvymd(CK_EQ, arvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_NotEqual(String arvymd) {
        doSetArvymd_NotEqual(fRES(arvymd));
    }

    protected void doSetArvymd_NotEqual(String arvymd) {
        regArvymd(CK_NES, arvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_GreaterThan(String arvymd) {
        regArvymd(CK_GT, fRES(arvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_LessThan(String arvymd) {
        regArvymd(CK_LT, fRES(arvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_GreaterEqual(String arvymd) {
        regArvymd(CK_GE, fRES(arvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_LessEqual(String arvymd) {
        regArvymd(CK_LE, fRES(arvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymdList The collection of arvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_InScope(Collection<String> arvymdList) {
        doSetArvymd_InScope(arvymdList);
    }

    protected void doSetArvymd_InScope(Collection<String> arvymdList) {
        regINS(CK_INS, cTL(arvymdList), xgetCValueArvymd(), "ARVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymdList The collection of arvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_NotInScope(Collection<String> arvymdList) {
        doSetArvymd_NotInScope(arvymdList);
    }

    protected void doSetArvymd_NotInScope(Collection<String> arvymdList) {
        regINS(CK_NINS, cTL(arvymdList), xgetCValueArvymd(), "ARVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARVYMD: {varchar(8)} <br>
     * <pre>e.g. setArvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arvymd The value of arvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArvymd_LikeSearch(String arvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arvymd), xgetCValueArvymd(), "ARVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArvymd_NotLikeSearch(String arvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arvymd), xgetCValueArvymd(), "ARVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARVYMD: {varchar(8)}
     * @param arvymd The value of arvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArvymd_PrefixSearch(String arvymd) {
        setArvymd_LikeSearch(arvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     */
    public void setArvymd_IsNull() { regArvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     */
    public void setArvymd_IsNullOrEmpty() { regArvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARVYMD: {varchar(8)}
     */
    public void setArvymd_IsNotNull() { regArvymd(CK_ISNN, DOBJ); }

    protected void regArvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArvymd(), "ARVYMD"); }
    protected abstract ConditionValue xgetCValueArvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_Equal(String sfcd) {
        doSetSfcd_Equal(fRES(sfcd));
    }

    protected void doSetSfcd_Equal(String sfcd) {
        regSfcd(CK_EQ, sfcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_NotEqual(String sfcd) {
        doSetSfcd_NotEqual(fRES(sfcd));
    }

    protected void doSetSfcd_NotEqual(String sfcd) {
        regSfcd(CK_NES, sfcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_GreaterThan(String sfcd) {
        regSfcd(CK_GT, fRES(sfcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_LessThan(String sfcd) {
        regSfcd(CK_LT, fRES(sfcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_GreaterEqual(String sfcd) {
        regSfcd(CK_GE, fRES(sfcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_LessEqual(String sfcd) {
        regSfcd(CK_LE, fRES(sfcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcdList The collection of sfcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_InScope(Collection<String> sfcdList) {
        doSetSfcd_InScope(sfcdList);
    }

    protected void doSetSfcd_InScope(Collection<String> sfcdList) {
        regINS(CK_INS, cTL(sfcdList), xgetCValueSfcd(), "SFCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcdList The collection of sfcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_NotInScope(Collection<String> sfcdList) {
        doSetSfcd_NotInScope(sfcdList);
    }

    protected void doSetSfcd_NotInScope(Collection<String> sfcdList) {
        regINS(CK_NINS, cTL(sfcdList), xgetCValueSfcd(), "SFCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFCD: {varchar(30)} <br>
     * <pre>e.g. setSfcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sfcd The value of sfcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSfcd_LikeSearch(String sfcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sfcd), xgetCValueSfcd(), "SFCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSfcd_NotLikeSearch(String sfcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sfcd), xgetCValueSfcd(), "SFCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFCD: {varchar(30)}
     * @param sfcd The value of sfcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcd_PrefixSearch(String sfcd) {
        setSfcd_LikeSearch(sfcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     */
    public void setSfcd_IsNull() { regSfcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     */
    public void setSfcd_IsNullOrEmpty() { regSfcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFCD: {varchar(30)}
     */
    public void setSfcd_IsNotNull() { regSfcd(CK_ISNN, DOBJ); }

    protected void regSfcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSfcd(), "SFCD"); }
    protected abstract ConditionValue xgetCValueSfcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_Equal(String stcd) {
        doSetStcd_Equal(fRES(stcd));
    }

    protected void doSetStcd_Equal(String stcd) {
        regStcd(CK_EQ, stcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_NotEqual(String stcd) {
        doSetStcd_NotEqual(fRES(stcd));
    }

    protected void doSetStcd_NotEqual(String stcd) {
        regStcd(CK_NES, stcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_GreaterThan(String stcd) {
        regStcd(CK_GT, fRES(stcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_LessThan(String stcd) {
        regStcd(CK_LT, fRES(stcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_GreaterEqual(String stcd) {
        regStcd(CK_GE, fRES(stcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_LessEqual(String stcd) {
        regStcd(CK_LE, fRES(stcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcdList The collection of stcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_InScope(Collection<String> stcdList) {
        doSetStcd_InScope(stcdList);
    }

    protected void doSetStcd_InScope(Collection<String> stcdList) {
        regINS(CK_INS, cTL(stcdList), xgetCValueStcd(), "STCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcdList The collection of stcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_NotInScope(Collection<String> stcdList) {
        doSetStcd_NotInScope(stcdList);
    }

    protected void doSetStcd_NotInScope(Collection<String> stcdList) {
        regINS(CK_NINS, cTL(stcdList), xgetCValueStcd(), "STCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STCD: {varchar(30)} <br>
     * <pre>e.g. setStcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stcd The value of stcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStcd_LikeSearch(String stcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stcd), xgetCValueStcd(), "STCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStcd_NotLikeSearch(String stcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stcd), xgetCValueStcd(), "STCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STCD: {varchar(30)}
     * @param stcd The value of stcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStcd_PrefixSearch(String stcd) {
        setStcd_LikeSearch(stcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     */
    public void setStcd_IsNull() { regStcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     */
    public void setStcd_IsNullOrEmpty() { regStcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STCD: {varchar(30)}
     */
    public void setStcd_IsNotNull() { regStcd(CK_ISNN, DOBJ); }

    protected void regStcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStcd(), "STCD"); }
    protected abstract ConditionValue xgetCValueStcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqa The value of gnlpltqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGnlpltqa_Equal(Long gnlpltqa) {
        doSetGnlpltqa_Equal(gnlpltqa);
    }

    protected void doSetGnlpltqa_Equal(Long gnlpltqa) {
        regGnlpltqa(CK_EQ, gnlpltqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqa The value of gnlpltqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGnlpltqa_NotEqual(Long gnlpltqa) {
        doSetGnlpltqa_NotEqual(gnlpltqa);
    }

    protected void doSetGnlpltqa_NotEqual(Long gnlpltqa) {
        regGnlpltqa(CK_NES, gnlpltqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqa The value of gnlpltqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGnlpltqa_GreaterThan(Long gnlpltqa) {
        regGnlpltqa(CK_GT, gnlpltqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqa The value of gnlpltqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGnlpltqa_LessThan(Long gnlpltqa) {
        regGnlpltqa(CK_LT, gnlpltqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqa The value of gnlpltqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGnlpltqa_GreaterEqual(Long gnlpltqa) {
        regGnlpltqa(CK_GE, gnlpltqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqa The value of gnlpltqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGnlpltqa_LessEqual(Long gnlpltqa) {
        regGnlpltqa(CK_LE, gnlpltqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param minNumber The min number of gnlpltqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gnlpltqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGnlpltqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGnlpltqa(), "GNLPLTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqaList The collection of gnlpltqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlpltqa_InScope(Collection<Long> gnlpltqaList) {
        doSetGnlpltqa_InScope(gnlpltqaList);
    }

    protected void doSetGnlpltqa_InScope(Collection<Long> gnlpltqaList) {
        regINS(CK_INS, cTL(gnlpltqaList), xgetCValueGnlpltqa(), "GNLPLTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     * @param gnlpltqaList The collection of gnlpltqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlpltqa_NotInScope(Collection<Long> gnlpltqaList) {
        doSetGnlpltqa_NotInScope(gnlpltqaList);
    }

    protected void doSetGnlpltqa_NotInScope(Collection<Long> gnlpltqaList) {
        regINS(CK_NINS, cTL(gnlpltqaList), xgetCValueGnlpltqa(), "GNLPLTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     */
    public void setGnlpltqa_IsNull() { regGnlpltqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GNLPLTQA: {bigint(19)}
     */
    public void setGnlpltqa_IsNotNull() { regGnlpltqa(CK_ISNN, DOBJ); }

    protected void regGnlpltqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGnlpltqa(), "GNLPLTQA"); }
    protected abstract ConditionValue xgetCValueGnlpltqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqa The value of otpltqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtpltqa_Equal(Long otpltqa) {
        doSetOtpltqa_Equal(otpltqa);
    }

    protected void doSetOtpltqa_Equal(Long otpltqa) {
        regOtpltqa(CK_EQ, otpltqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqa The value of otpltqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtpltqa_NotEqual(Long otpltqa) {
        doSetOtpltqa_NotEqual(otpltqa);
    }

    protected void doSetOtpltqa_NotEqual(Long otpltqa) {
        regOtpltqa(CK_NES, otpltqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqa The value of otpltqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtpltqa_GreaterThan(Long otpltqa) {
        regOtpltqa(CK_GT, otpltqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqa The value of otpltqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtpltqa_LessThan(Long otpltqa) {
        regOtpltqa(CK_LT, otpltqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqa The value of otpltqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtpltqa_GreaterEqual(Long otpltqa) {
        regOtpltqa(CK_GE, otpltqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqa The value of otpltqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtpltqa_LessEqual(Long otpltqa) {
        regOtpltqa(CK_LE, otpltqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param minNumber The min number of otpltqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otpltqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtpltqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtpltqa(), "OTPLTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqaList The collection of otpltqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtpltqa_InScope(Collection<Long> otpltqaList) {
        doSetOtpltqa_InScope(otpltqaList);
    }

    protected void doSetOtpltqa_InScope(Collection<Long> otpltqaList) {
        regINS(CK_INS, cTL(otpltqaList), xgetCValueOtpltqa(), "OTPLTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTPLTQA: {bigint(19)}
     * @param otpltqaList The collection of otpltqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtpltqa_NotInScope(Collection<Long> otpltqaList) {
        doSetOtpltqa_NotInScope(otpltqaList);
    }

    protected void doSetOtpltqa_NotInScope(Collection<Long> otpltqaList) {
        regINS(CK_NINS, cTL(otpltqaList), xgetCValueOtpltqa(), "OTPLTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     */
    public void setOtpltqa_IsNull() { regOtpltqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTPLTQA: {bigint(19)}
     */
    public void setOtpltqa_IsNotNull() { regOtpltqa(CK_ISNN, DOBJ); }

    protected void regOtpltqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtpltqa(), "OTPLTQA"); }
    protected abstract ConditionValue xgetCValueOtpltqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_Equal(String plncarknd) {
        doSetPlncarknd_Equal(fRES(plncarknd));
    }

    protected void doSetPlncarknd_Equal(String plncarknd) {
        regPlncarknd(CK_EQ, plncarknd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_NotEqual(String plncarknd) {
        doSetPlncarknd_NotEqual(fRES(plncarknd));
    }

    protected void doSetPlncarknd_NotEqual(String plncarknd) {
        regPlncarknd(CK_NES, plncarknd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_GreaterThan(String plncarknd) {
        regPlncarknd(CK_GT, fRES(plncarknd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_LessThan(String plncarknd) {
        regPlncarknd(CK_LT, fRES(plncarknd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_GreaterEqual(String plncarknd) {
        regPlncarknd(CK_GE, fRES(plncarknd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_LessEqual(String plncarknd) {
        regPlncarknd(CK_LE, fRES(plncarknd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarkndList The collection of plncarknd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_InScope(Collection<String> plncarkndList) {
        doSetPlncarknd_InScope(plncarkndList);
    }

    protected void doSetPlncarknd_InScope(Collection<String> plncarkndList) {
        regINS(CK_INS, cTL(plncarkndList), xgetCValuePlncarknd(), "PLNCARKND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarkndList The collection of plncarknd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_NotInScope(Collection<String> plncarkndList) {
        doSetPlncarknd_NotInScope(plncarkndList);
    }

    protected void doSetPlncarknd_NotInScope(Collection<String> plncarkndList) {
        regINS(CK_NINS, cTL(plncarkndList), xgetCValuePlncarknd(), "PLNCARKND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLNCARKND: {varchar(255)} <br>
     * <pre>e.g. setPlncarknd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plncarknd The value of plncarknd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlncarknd_LikeSearch(String plncarknd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plncarknd), xgetCValuePlncarknd(), "PLNCARKND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlncarknd_NotLikeSearch(String plncarknd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plncarknd), xgetCValuePlncarknd(), "PLNCARKND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLNCARKND: {varchar(255)}
     * @param plncarknd The value of plncarknd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlncarknd_PrefixSearch(String plncarknd) {
        setPlncarknd_LikeSearch(plncarknd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     */
    public void setPlncarknd_IsNull() { regPlncarknd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     */
    public void setPlncarknd_IsNullOrEmpty() { regPlncarknd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLNCARKND: {varchar(255)}
     */
    public void setPlncarknd_IsNotNull() { regPlncarknd(CK_ISNN, DOBJ); }

    protected void regPlncarknd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlncarknd(), "PLNCARKND"); }
    protected abstract ConditionValue xgetCValuePlncarknd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_Equal(String amcarknd) {
        doSetAmcarknd_Equal(fRES(amcarknd));
    }

    protected void doSetAmcarknd_Equal(String amcarknd) {
        regAmcarknd(CK_EQ, amcarknd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_NotEqual(String amcarknd) {
        doSetAmcarknd_NotEqual(fRES(amcarknd));
    }

    protected void doSetAmcarknd_NotEqual(String amcarknd) {
        regAmcarknd(CK_NES, amcarknd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_GreaterThan(String amcarknd) {
        regAmcarknd(CK_GT, fRES(amcarknd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_LessThan(String amcarknd) {
        regAmcarknd(CK_LT, fRES(amcarknd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_GreaterEqual(String amcarknd) {
        regAmcarknd(CK_GE, fRES(amcarknd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_LessEqual(String amcarknd) {
        regAmcarknd(CK_LE, fRES(amcarknd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarkndList The collection of amcarknd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_InScope(Collection<String> amcarkndList) {
        doSetAmcarknd_InScope(amcarkndList);
    }

    protected void doSetAmcarknd_InScope(Collection<String> amcarkndList) {
        regINS(CK_INS, cTL(amcarkndList), xgetCValueAmcarknd(), "AMCARKND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarkndList The collection of amcarknd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_NotInScope(Collection<String> amcarkndList) {
        doSetAmcarknd_NotInScope(amcarkndList);
    }

    protected void doSetAmcarknd_NotInScope(Collection<String> amcarkndList) {
        regINS(CK_NINS, cTL(amcarkndList), xgetCValueAmcarknd(), "AMCARKND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMCARKND: {varchar(255)} <br>
     * <pre>e.g. setAmcarknd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param amcarknd The value of amcarknd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAmcarknd_LikeSearch(String amcarknd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(amcarknd), xgetCValueAmcarknd(), "AMCARKND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAmcarknd_NotLikeSearch(String amcarknd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(amcarknd), xgetCValueAmcarknd(), "AMCARKND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMCARKND: {varchar(255)}
     * @param amcarknd The value of amcarknd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmcarknd_PrefixSearch(String amcarknd) {
        setAmcarknd_LikeSearch(amcarknd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     */
    public void setAmcarknd_IsNull() { regAmcarknd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     */
    public void setAmcarknd_IsNullOrEmpty() { regAmcarknd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMCARKND: {varchar(255)}
     */
    public void setAmcarknd_IsNotNull() { regAmcarknd(CK_ISNN, DOBJ); }

    protected void regAmcarknd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmcarknd(), "AMCARKND"); }
    protected abstract ConditionValue xgetCValueAmcarknd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_Equal(String selno1) {
        doSetSelno1_Equal(fRES(selno1));
    }

    protected void doSetSelno1_Equal(String selno1) {
        regSelno1(CK_EQ, selno1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_NotEqual(String selno1) {
        doSetSelno1_NotEqual(fRES(selno1));
    }

    protected void doSetSelno1_NotEqual(String selno1) {
        regSelno1(CK_NES, selno1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_GreaterThan(String selno1) {
        regSelno1(CK_GT, fRES(selno1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_LessThan(String selno1) {
        regSelno1(CK_LT, fRES(selno1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_GreaterEqual(String selno1) {
        regSelno1(CK_GE, fRES(selno1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_LessEqual(String selno1) {
        regSelno1(CK_LE, fRES(selno1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1List The collection of selno1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_InScope(Collection<String> selno1List) {
        doSetSelno1_InScope(selno1List);
    }

    protected void doSetSelno1_InScope(Collection<String> selno1List) {
        regINS(CK_INS, cTL(selno1List), xgetCValueSelno1(), "SELNO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1List The collection of selno1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_NotInScope(Collection<String> selno1List) {
        doSetSelno1_NotInScope(selno1List);
    }

    protected void doSetSelno1_NotInScope(Collection<String> selno1List) {
        regINS(CK_NINS, cTL(selno1List), xgetCValueSelno1(), "SELNO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO1: {varchar(30)} <br>
     * <pre>e.g. setSelno1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selno1 The value of selno1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSelno1_LikeSearch(String selno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selno1), xgetCValueSelno1(), "SELNO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSelno1_NotLikeSearch(String selno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selno1), xgetCValueSelno1(), "SELNO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO1: {varchar(30)}
     * @param selno1 The value of selno1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno1_PrefixSearch(String selno1) {
        setSelno1_LikeSearch(selno1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     */
    public void setSelno1_IsNull() { regSelno1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     */
    public void setSelno1_IsNullOrEmpty() { regSelno1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SELNO1: {varchar(30)}
     */
    public void setSelno1_IsNotNull() { regSelno1(CK_ISNN, DOBJ); }

    protected void regSelno1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelno1(), "SELNO1"); }
    protected abstract ConditionValue xgetCValueSelno1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_Equal(String selno2) {
        doSetSelno2_Equal(fRES(selno2));
    }

    protected void doSetSelno2_Equal(String selno2) {
        regSelno2(CK_EQ, selno2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_NotEqual(String selno2) {
        doSetSelno2_NotEqual(fRES(selno2));
    }

    protected void doSetSelno2_NotEqual(String selno2) {
        regSelno2(CK_NES, selno2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_GreaterThan(String selno2) {
        regSelno2(CK_GT, fRES(selno2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_LessThan(String selno2) {
        regSelno2(CK_LT, fRES(selno2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_GreaterEqual(String selno2) {
        regSelno2(CK_GE, fRES(selno2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_LessEqual(String selno2) {
        regSelno2(CK_LE, fRES(selno2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2List The collection of selno2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_InScope(Collection<String> selno2List) {
        doSetSelno2_InScope(selno2List);
    }

    protected void doSetSelno2_InScope(Collection<String> selno2List) {
        regINS(CK_INS, cTL(selno2List), xgetCValueSelno2(), "SELNO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2List The collection of selno2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_NotInScope(Collection<String> selno2List) {
        doSetSelno2_NotInScope(selno2List);
    }

    protected void doSetSelno2_NotInScope(Collection<String> selno2List) {
        regINS(CK_NINS, cTL(selno2List), xgetCValueSelno2(), "SELNO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO2: {varchar(30)} <br>
     * <pre>e.g. setSelno2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selno2 The value of selno2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSelno2_LikeSearch(String selno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selno2), xgetCValueSelno2(), "SELNO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSelno2_NotLikeSearch(String selno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selno2), xgetCValueSelno2(), "SELNO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO2: {varchar(30)}
     * @param selno2 The value of selno2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno2_PrefixSearch(String selno2) {
        setSelno2_LikeSearch(selno2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     */
    public void setSelno2_IsNull() { regSelno2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     */
    public void setSelno2_IsNullOrEmpty() { regSelno2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SELNO2: {varchar(30)}
     */
    public void setSelno2_IsNotNull() { regSelno2(CK_ISNN, DOBJ); }

    protected void regSelno2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelno2(), "SELNO2"); }
    protected abstract ConditionValue xgetCValueSelno2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_Equal(String selno3) {
        doSetSelno3_Equal(fRES(selno3));
    }

    protected void doSetSelno3_Equal(String selno3) {
        regSelno3(CK_EQ, selno3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_NotEqual(String selno3) {
        doSetSelno3_NotEqual(fRES(selno3));
    }

    protected void doSetSelno3_NotEqual(String selno3) {
        regSelno3(CK_NES, selno3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_GreaterThan(String selno3) {
        regSelno3(CK_GT, fRES(selno3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_LessThan(String selno3) {
        regSelno3(CK_LT, fRES(selno3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_GreaterEqual(String selno3) {
        regSelno3(CK_GE, fRES(selno3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_LessEqual(String selno3) {
        regSelno3(CK_LE, fRES(selno3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3List The collection of selno3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_InScope(Collection<String> selno3List) {
        doSetSelno3_InScope(selno3List);
    }

    protected void doSetSelno3_InScope(Collection<String> selno3List) {
        regINS(CK_INS, cTL(selno3List), xgetCValueSelno3(), "SELNO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3List The collection of selno3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_NotInScope(Collection<String> selno3List) {
        doSetSelno3_NotInScope(selno3List);
    }

    protected void doSetSelno3_NotInScope(Collection<String> selno3List) {
        regINS(CK_NINS, cTL(selno3List), xgetCValueSelno3(), "SELNO3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO3: {varchar(30)} <br>
     * <pre>e.g. setSelno3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selno3 The value of selno3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSelno3_LikeSearch(String selno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selno3), xgetCValueSelno3(), "SELNO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSelno3_NotLikeSearch(String selno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selno3), xgetCValueSelno3(), "SELNO3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELNO3: {varchar(30)}
     * @param selno3 The value of selno3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelno3_PrefixSearch(String selno3) {
        setSelno3_LikeSearch(selno3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     */
    public void setSelno3_IsNull() { regSelno3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     */
    public void setSelno3_IsNullOrEmpty() { regSelno3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SELNO3: {varchar(30)}
     */
    public void setSelno3_IsNotNull() { regSelno3(CK_ISNN, DOBJ); }

    protected void regSelno3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelno3(), "SELNO3"); }
    protected abstract ConditionValue xgetCValueSelno3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_Equal(String trannm) {
        doSetTrannm_Equal(fRES(trannm));
    }

    protected void doSetTrannm_Equal(String trannm) {
        regTrannm(CK_EQ, trannm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_NotEqual(String trannm) {
        doSetTrannm_NotEqual(fRES(trannm));
    }

    protected void doSetTrannm_NotEqual(String trannm) {
        regTrannm(CK_NES, trannm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_GreaterThan(String trannm) {
        regTrannm(CK_GT, fRES(trannm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_LessThan(String trannm) {
        regTrannm(CK_LT, fRES(trannm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_GreaterEqual(String trannm) {
        regTrannm(CK_GE, fRES(trannm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_LessEqual(String trannm) {
        regTrannm(CK_LE, fRES(trannm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannmList The collection of trannm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_InScope(Collection<String> trannmList) {
        doSetTrannm_InScope(trannmList);
    }

    protected void doSetTrannm_InScope(Collection<String> trannmList) {
        regINS(CK_INS, cTL(trannmList), xgetCValueTrannm(), "TRANNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannmList The collection of trannm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_NotInScope(Collection<String> trannmList) {
        doSetTrannm_NotInScope(trannmList);
    }

    protected void doSetTrannm_NotInScope(Collection<String> trannmList) {
        regINS(CK_NINS, cTL(trannmList), xgetCValueTrannm(), "TRANNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANNM: {varchar(60)} <br>
     * <pre>e.g. setTrannm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trannm The value of trannm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrannm_LikeSearch(String trannm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trannm), xgetCValueTrannm(), "TRANNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrannm_NotLikeSearch(String trannm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trannm), xgetCValueTrannm(), "TRANNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANNM: {varchar(60)}
     * @param trannm The value of trannm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrannm_PrefixSearch(String trannm) {
        setTrannm_LikeSearch(trannm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     */
    public void setTrannm_IsNull() { regTrannm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     */
    public void setTrannm_IsNullOrEmpty() { regTrannm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANNM: {varchar(60)}
     */
    public void setTrannm_IsNotNull() { regTrannm(CK_ISNN, DOBJ); }

    protected void regTrannm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrannm(), "TRANNM"); }
    protected abstract ConditionValue xgetCValueTrannm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_Equal(String chgid) {
        doSetChgid_Equal(fRES(chgid));
    }

    protected void doSetChgid_Equal(String chgid) {
        regChgid(CK_EQ, chgid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_NotEqual(String chgid) {
        doSetChgid_NotEqual(fRES(chgid));
    }

    protected void doSetChgid_NotEqual(String chgid) {
        regChgid(CK_NES, chgid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_GreaterThan(String chgid) {
        regChgid(CK_GT, fRES(chgid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_LessThan(String chgid) {
        regChgid(CK_LT, fRES(chgid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_GreaterEqual(String chgid) {
        regChgid(CK_GE, fRES(chgid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_LessEqual(String chgid) {
        regChgid(CK_LE, fRES(chgid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHGID: {char(1)}
     * @param chgidList The collection of chgid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_InScope(Collection<String> chgidList) {
        doSetChgid_InScope(chgidList);
    }

    protected void doSetChgid_InScope(Collection<String> chgidList) {
        regINS(CK_INS, cTL(chgidList), xgetCValueChgid(), "CHGID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHGID: {char(1)}
     * @param chgidList The collection of chgid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_NotInScope(Collection<String> chgidList) {
        doSetChgid_NotInScope(chgidList);
    }

    protected void doSetChgid_NotInScope(Collection<String> chgidList) {
        regINS(CK_NINS, cTL(chgidList), xgetCValueChgid(), "CHGID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHGID: {char(1)} <br>
     * <pre>e.g. setChgid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param chgid The value of chgid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setChgid_LikeSearch(String chgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(chgid), xgetCValueChgid(), "CHGID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setChgid_NotLikeSearch(String chgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(chgid), xgetCValueChgid(), "CHGID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHGID: {char(1)}
     * @param chgid The value of chgid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChgid_PrefixSearch(String chgid) {
        setChgid_LikeSearch(chgid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     */
    public void setChgid_IsNull() { regChgid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHGID: {char(1)}
     */
    public void setChgid_IsNotNull() { regChgid(CK_ISNN, DOBJ); }

    protected void regChgid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChgid(), "CHGID"); }
    protected abstract ConditionValue xgetCValueChgid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_Equal(String tdrelayid) {
        doSetTdrelayid_Equal(fRES(tdrelayid));
    }

    protected void doSetTdrelayid_Equal(String tdrelayid) {
        regTdrelayid(CK_EQ, tdrelayid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_NotEqual(String tdrelayid) {
        doSetTdrelayid_NotEqual(fRES(tdrelayid));
    }

    protected void doSetTdrelayid_NotEqual(String tdrelayid) {
        regTdrelayid(CK_NES, tdrelayid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_GreaterThan(String tdrelayid) {
        regTdrelayid(CK_GT, fRES(tdrelayid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_LessThan(String tdrelayid) {
        regTdrelayid(CK_LT, fRES(tdrelayid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_GreaterEqual(String tdrelayid) {
        regTdrelayid(CK_GE, fRES(tdrelayid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_LessEqual(String tdrelayid) {
        regTdrelayid(CK_LE, fRES(tdrelayid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayidList The collection of tdrelayid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_InScope(Collection<String> tdrelayidList) {
        doSetTdrelayid_InScope(tdrelayidList);
    }

    protected void doSetTdrelayid_InScope(Collection<String> tdrelayidList) {
        regINS(CK_INS, cTL(tdrelayidList), xgetCValueTdrelayid(), "TDRELAYID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayidList The collection of tdrelayid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_NotInScope(Collection<String> tdrelayidList) {
        doSetTdrelayid_NotInScope(tdrelayidList);
    }

    protected void doSetTdrelayid_NotInScope(Collection<String> tdrelayidList) {
        regINS(CK_NINS, cTL(tdrelayidList), xgetCValueTdrelayid(), "TDRELAYID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TDRELAYID: {char(1)} <br>
     * <pre>e.g. setTdrelayid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tdrelayid The value of tdrelayid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTdrelayid_LikeSearch(String tdrelayid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tdrelayid), xgetCValueTdrelayid(), "TDRELAYID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTdrelayid_NotLikeSearch(String tdrelayid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tdrelayid), xgetCValueTdrelayid(), "TDRELAYID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TDRELAYID: {char(1)}
     * @param tdrelayid The value of tdrelayid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdrelayid_PrefixSearch(String tdrelayid) {
        setTdrelayid_LikeSearch(tdrelayid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     */
    public void setTdrelayid_IsNull() { regTdrelayid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDRELAYID: {char(1)}
     */
    public void setTdrelayid_IsNotNull() { regTdrelayid(CK_ISNN, DOBJ); }

    protected void regTdrelayid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdrelayid(), "TDRELAYID"); }
    protected abstract ConditionValue xgetCValueTdrelayid();

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
    public HpSLCFunction<TCcopamCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCcopamCB.class);
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
    public HpSLCFunction<TCcopamCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCcopamCB.class);
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
    public HpSLCFunction<TCcopamCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCcopamCB.class);
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
    public HpSLCFunction<TCcopamCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCcopamCB.class);
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
    public HpSLCFunction<TCcopamCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCcopamCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCcopamCB&gt;() {
     *     public void query(TCcopamCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCcopamCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCcopamCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcopamCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCcopamCQ sq);

    protected TCcopamCB xcreateScalarConditionCB() {
        TCcopamCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCcopamCB xcreateScalarConditionPartitionByCB() {
        TCcopamCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCcopamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CCOPAM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCcopamCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCcopamCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCcopamCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CCOPAM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCcopamCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCcopamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCcopamCQ sq);

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
    protected TCcopamCB newMyCB() {
        return new TCcopamCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCcopamCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

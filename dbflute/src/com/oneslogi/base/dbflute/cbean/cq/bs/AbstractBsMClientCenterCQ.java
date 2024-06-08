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
 * The abstract condition-query of M_CLIENT_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMClientCenterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMClientCenterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CLIENT_CENTER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterId The value of clientCenterId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_Equal(Long clientCenterId) {
        doSetClientCenterId_Equal(clientCenterId);
    }

    protected void doSetClientCenterId_Equal(Long clientCenterId) {
        regClientCenterId(CK_EQ, clientCenterId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterId The value of clientCenterId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_NotEqual(Long clientCenterId) {
        doSetClientCenterId_NotEqual(clientCenterId);
    }

    protected void doSetClientCenterId_NotEqual(Long clientCenterId) {
        regClientCenterId(CK_NES, clientCenterId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterId The value of clientCenterId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_GreaterThan(Long clientCenterId) {
        regClientCenterId(CK_GT, clientCenterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterId The value of clientCenterId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_LessThan(Long clientCenterId) {
        regClientCenterId(CK_LT, clientCenterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterId The value of clientCenterId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_GreaterEqual(Long clientCenterId) {
        regClientCenterId(CK_GE, clientCenterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterId The value of clientCenterId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_LessEqual(Long clientCenterId) {
        regClientCenterId(CK_LE, clientCenterId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of clientCenterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientCenterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientCenterId(), "CLIENT_CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterIdList The collection of clientCenterId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCenterId_InScope(Collection<Long> clientCenterIdList) {
        doSetClientCenterId_InScope(clientCenterIdList);
    }

    protected void doSetClientCenterId_InScope(Collection<Long> clientCenterIdList) {
        regINS(CK_INS, cTL(clientCenterIdList), xgetCValueClientCenterId(), "CLIENT_CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientCenterIdList The collection of clientCenterId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCenterId_NotInScope(Collection<Long> clientCenterIdList) {
        doSetClientCenterId_NotInScope(clientCenterIdList);
    }

    protected void doSetClientCenterId_NotInScope(Collection<Long> clientCenterIdList) {
        regINS(CK_NINS, cTL(clientCenterIdList), xgetCValueClientCenterId(), "CLIENT_CENTER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_CENTER_ID from M_PARAM where ...)} <br>
     * M_PARAM by CLIENT_CENTER_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMParamAsOne</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MParamAsOne for 'exists'. (NotNull)
     */
    public void existsMParamAsOne(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientCenterId_ExistsReferrer_MParamAsOne(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_CENTER_ID", "CLIENT_CENTER_ID", pp, "mParamAsOne");
    }
    public abstract String keepClientCenterId_ExistsReferrer_MParamAsOne(MParamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_CENTER_ID from M_PARAM where ...)} <br>
     * M_PARAM by CLIENT_CENTER_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMParamAsOne</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientCenterId_NotExistsReferrer_MParamAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMParamAsOne(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientCenterId_NotExistsReferrer_MParamAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_CENTER_ID", "CLIENT_CENTER_ID", pp, "mParamAsOne");
    }
    public abstract String keepClientCenterId_NotExistsReferrer_MParamAsOne(MParamCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClientCenterId_IsNull() { regClientCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClientCenterId_IsNotNull() { regClientCenterId(CK_ISNN, DOBJ); }

    protected void regClientCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCenterId(), "CLIENT_CENTER_ID"); }
    protected abstract ConditionValue xgetCValueClientCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_Equal(String systemDt) {
        doSetSystemDt_Equal(fRES(systemDt));
    }

    protected void doSetSystemDt_Equal(String systemDt) {
        regSystemDt(CK_EQ, systemDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_NotEqual(String systemDt) {
        doSetSystemDt_NotEqual(fRES(systemDt));
    }

    protected void doSetSystemDt_NotEqual(String systemDt) {
        regSystemDt(CK_NES, systemDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_GreaterThan(String systemDt) {
        regSystemDt(CK_GT, fRES(systemDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_LessThan(String systemDt) {
        regSystemDt(CK_LT, fRES(systemDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_GreaterEqual(String systemDt) {
        regSystemDt(CK_GE, fRES(systemDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_LessEqual(String systemDt) {
        regSystemDt(CK_LE, fRES(systemDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDtList The collection of systemDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_InScope(Collection<String> systemDtList) {
        doSetSystemDt_InScope(systemDtList);
    }

    protected void doSetSystemDt_InScope(Collection<String> systemDtList) {
        regINS(CK_INS, cTL(systemDtList), xgetCValueSystemDt(), "SYSTEM_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDtList The collection of systemDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_NotInScope(Collection<String> systemDtList) {
        doSetSystemDt_NotInScope(systemDtList);
    }

    protected void doSetSystemDt_NotInScope(Collection<String> systemDtList) {
        regINS(CK_NINS, cTL(systemDtList), xgetCValueSystemDt(), "SYSTEM_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSystemDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param systemDt The value of systemDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSystemDt_LikeSearch(String systemDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(systemDt), xgetCValueSystemDt(), "SYSTEM_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSystemDt_NotLikeSearch(String systemDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(systemDt), xgetCValueSystemDt(), "SYSTEM_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @param systemDt The value of systemDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemDt_PrefixSearch(String systemDt) {
        setSystemDt_LikeSearch(systemDt, xcLSOPPre());
    }

    protected void regSystemDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemDt(), "SYSTEM_DT"); }
    protected abstract ConditionValue xgetCValueSystemDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg}
     * @param batchProgressFlg The value of batchProgressFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_Equal(String batchProgressFlg) {
        doSetBatchProgressFlg_Equal(fRES(batchProgressFlg));
    }

    /**
     * Equal(=). As BatchProgressFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_Equal_AsBatchProgressFlg(CDef.BatchProgressFlg cdef) {
        doSetBatchProgressFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非処理中
     */
    public void setBatchProgressFlg_Equal_$0() {
        setBatchProgressFlg_Equal_AsBatchProgressFlg(CDef.BatchProgressFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 処理中
     */
    public void setBatchProgressFlg_Equal_$1() {
        setBatchProgressFlg_Equal_AsBatchProgressFlg(CDef.BatchProgressFlg.$1);
    }

    protected void doSetBatchProgressFlg_Equal(String batchProgressFlg) {
        regBatchProgressFlg(CK_EQ, batchProgressFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg}
     * @param batchProgressFlg The value of batchProgressFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_NotEqual(String batchProgressFlg) {
        doSetBatchProgressFlg_NotEqual(fRES(batchProgressFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As BatchProgressFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_NotEqual_AsBatchProgressFlg(CDef.BatchProgressFlg cdef) {
        doSetBatchProgressFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非処理中
     */
    public void setBatchProgressFlg_NotEqual_$0() {
        setBatchProgressFlg_NotEqual_AsBatchProgressFlg(CDef.BatchProgressFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 処理中
     */
    public void setBatchProgressFlg_NotEqual_$1() {
        setBatchProgressFlg_NotEqual_AsBatchProgressFlg(CDef.BatchProgressFlg.$1);
    }

    protected void doSetBatchProgressFlg_NotEqual(String batchProgressFlg) {
        regBatchProgressFlg(CK_NES, batchProgressFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg}
     * @param batchProgressFlgList The collection of batchProgressFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_InScope(Collection<String> batchProgressFlgList) {
        doSetBatchProgressFlg_InScope(batchProgressFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As BatchProgressFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_InScope_AsBatchProgressFlg(Collection<CDef.BatchProgressFlg> cdefList) {
        doSetBatchProgressFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetBatchProgressFlg_InScope(Collection<String> batchProgressFlgList) {
        regINS(CK_INS, cTL(batchProgressFlgList), xgetCValueBatchProgressFlg(), "BATCH_PROGRESS_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg}
     * @param batchProgressFlgList The collection of batchProgressFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_NotInScope(Collection<String> batchProgressFlgList) {
        doSetBatchProgressFlg_NotInScope(batchProgressFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As BatchProgressFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchProgressFlg_NotInScope_AsBatchProgressFlg(Collection<CDef.BatchProgressFlg> cdefList) {
        doSetBatchProgressFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBatchProgressFlg_NotInScope(Collection<String> batchProgressFlgList) {
        regINS(CK_NINS, cTL(batchProgressFlgList), xgetCValueBatchProgressFlg(), "BATCH_PROGRESS_FLG");
    }

    protected void regBatchProgressFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatchProgressFlg(), "BATCH_PROGRESS_FLG"); }
    protected abstract ConditionValue xgetCValueBatchProgressFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_Equal(String beforeSystemDt) {
        doSetBeforeSystemDt_Equal(fRES(beforeSystemDt));
    }

    protected void doSetBeforeSystemDt_Equal(String beforeSystemDt) {
        regBeforeSystemDt(CK_EQ, beforeSystemDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_NotEqual(String beforeSystemDt) {
        doSetBeforeSystemDt_NotEqual(fRES(beforeSystemDt));
    }

    protected void doSetBeforeSystemDt_NotEqual(String beforeSystemDt) {
        regBeforeSystemDt(CK_NES, beforeSystemDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_GreaterThan(String beforeSystemDt) {
        regBeforeSystemDt(CK_GT, fRES(beforeSystemDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_LessThan(String beforeSystemDt) {
        regBeforeSystemDt(CK_LT, fRES(beforeSystemDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_GreaterEqual(String beforeSystemDt) {
        regBeforeSystemDt(CK_GE, fRES(beforeSystemDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_LessEqual(String beforeSystemDt) {
        regBeforeSystemDt(CK_LE, fRES(beforeSystemDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDtList The collection of beforeSystemDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_InScope(Collection<String> beforeSystemDtList) {
        doSetBeforeSystemDt_InScope(beforeSystemDtList);
    }

    protected void doSetBeforeSystemDt_InScope(Collection<String> beforeSystemDtList) {
        regINS(CK_INS, cTL(beforeSystemDtList), xgetCValueBeforeSystemDt(), "BEFORE_SYSTEM_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDtList The collection of beforeSystemDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_NotInScope(Collection<String> beforeSystemDtList) {
        doSetBeforeSystemDt_NotInScope(beforeSystemDtList);
    }

    protected void doSetBeforeSystemDt_NotInScope(Collection<String> beforeSystemDtList) {
        regINS(CK_NINS, cTL(beforeSystemDtList), xgetCValueBeforeSystemDt(), "BEFORE_SYSTEM_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)} <br>
     * <pre>e.g. setBeforeSystemDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param beforeSystemDt The value of beforeSystemDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBeforeSystemDt_LikeSearch(String beforeSystemDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(beforeSystemDt), xgetCValueBeforeSystemDt(), "BEFORE_SYSTEM_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBeforeSystemDt_NotLikeSearch(String beforeSystemDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(beforeSystemDt), xgetCValueBeforeSystemDt(), "BEFORE_SYSTEM_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @param beforeSystemDt The value of beforeSystemDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeforeSystemDt_PrefixSearch(String beforeSystemDt) {
        setBeforeSystemDt_LikeSearch(beforeSystemDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     */
    public void setBeforeSystemDt_IsNull() { regBeforeSystemDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     */
    public void setBeforeSystemDt_IsNullOrEmpty() { regBeforeSystemDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BEFORE_SYSTEM_DT: {varchar(8)}
     */
    public void setBeforeSystemDt_IsNotNull() { regBeforeSystemDt(CK_ISNN, DOBJ); }

    protected void regBeforeSystemDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeforeSystemDt(), "BEFORE_SYSTEM_DT"); }
    protected abstract ConditionValue xgetCValueBeforeSystemDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(Long customerId) {
        doSetCustomerId_Equal(customerId);
    }

    protected void doSetCustomerId_Equal(Long customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(Long customerId) {
        doSetCustomerId_NotEqual(customerId);
    }

    protected void doSetCustomerId_NotEqual(Long customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(Long customerId) {
        regCustomerId(CK_GT, customerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(Long customerId) {
        regCustomerId(CK_LT, customerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(Long customerId) {
        regCustomerId(CK_GE, customerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(Long customerId) {
        regCustomerId(CK_LE, customerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomerId(), "CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<Long> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<Long> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<Long> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<Long> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MClientCenterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MClientCenterCB.class);
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
    public HpSLCFunction<MClientCenterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MClientCenterCB.class);
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
    public HpSLCFunction<MClientCenterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MClientCenterCB.class);
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
    public HpSLCFunction<MClientCenterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MClientCenterCB.class);
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
    public HpSLCFunction<MClientCenterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MClientCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MClientCenterCB&gt;() {
     *     public void query(MClientCenterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MClientCenterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MClientCenterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MClientCenterCQ sq);

    protected MClientCenterCB xcreateScalarConditionCB() {
        MClientCenterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MClientCenterCB xcreateScalarConditionPartitionByCB() {
        MClientCenterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MClientCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLIENT_CENTER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MClientCenterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MClientCenterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MClientCenterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLIENT_CENTER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MClientCenterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MClientCenterCQ sq);

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
    protected MClientCenterCB newMyCB() {
        return new MClientCenterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MClientCenterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

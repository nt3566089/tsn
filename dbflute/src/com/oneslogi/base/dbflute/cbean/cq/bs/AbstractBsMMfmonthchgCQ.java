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
 * The abstract condition-query of M_MFMONTHCHG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMMfmonthchgCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMMfmonthchgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_MFMONTHCHG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgId The value of mfmonthchgId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfmonthchgId_Equal(Long mfmonthchgId) {
        doSetMfmonthchgId_Equal(mfmonthchgId);
    }

    protected void doSetMfmonthchgId_Equal(Long mfmonthchgId) {
        regMfmonthchgId(CK_EQ, mfmonthchgId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgId The value of mfmonthchgId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfmonthchgId_NotEqual(Long mfmonthchgId) {
        doSetMfmonthchgId_NotEqual(mfmonthchgId);
    }

    protected void doSetMfmonthchgId_NotEqual(Long mfmonthchgId) {
        regMfmonthchgId(CK_NES, mfmonthchgId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgId The value of mfmonthchgId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfmonthchgId_GreaterThan(Long mfmonthchgId) {
        regMfmonthchgId(CK_GT, mfmonthchgId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgId The value of mfmonthchgId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfmonthchgId_LessThan(Long mfmonthchgId) {
        regMfmonthchgId(CK_LT, mfmonthchgId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgId The value of mfmonthchgId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfmonthchgId_GreaterEqual(Long mfmonthchgId) {
        regMfmonthchgId(CK_GE, mfmonthchgId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgId The value of mfmonthchgId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfmonthchgId_LessEqual(Long mfmonthchgId) {
        regMfmonthchgId(CK_LE, mfmonthchgId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of mfmonthchgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mfmonthchgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMfmonthchgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMfmonthchgId(), "MFMONTHCHG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgIdList The collection of mfmonthchgId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfmonthchgId_InScope(Collection<Long> mfmonthchgIdList) {
        doSetMfmonthchgId_InScope(mfmonthchgIdList);
    }

    protected void doSetMfmonthchgId_InScope(Collection<Long> mfmonthchgIdList) {
        regINS(CK_INS, cTL(mfmonthchgIdList), xgetCValueMfmonthchgId(), "MFMONTHCHG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfmonthchgIdList The collection of mfmonthchgId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfmonthchgId_NotInScope(Collection<Long> mfmonthchgIdList) {
        doSetMfmonthchgId_NotInScope(mfmonthchgIdList);
    }

    protected void doSetMfmonthchgId_NotInScope(Collection<Long> mfmonthchgIdList) {
        regINS(CK_NINS, cTL(mfmonthchgIdList), xgetCValueMfmonthchgId(), "MFMONTHCHG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMfmonthchgId_IsNull() { regMfmonthchgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMfmonthchgId_IsNotNull() { regMfmonthchgId(CK_ISNN, DOBJ); }

    protected void regMfmonthchgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMfmonthchgId(), "MFMONTHCHG_ID"); }
    protected abstract ConditionValue xgetCValueMfmonthchgId();

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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_Equal(String sotedunit) {
        doSetSotedunit_Equal(fRES(sotedunit));
    }

    protected void doSetSotedunit_Equal(String sotedunit) {
        regSotedunit(CK_EQ, sotedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotEqual(String sotedunit) {
        doSetSotedunit_NotEqual(fRES(sotedunit));
    }

    protected void doSetSotedunit_NotEqual(String sotedunit) {
        regSotedunit(CK_NES, sotedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterThan(String sotedunit) {
        regSotedunit(CK_GT, fRES(sotedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessThan(String sotedunit) {
        regSotedunit(CK_LT, fRES(sotedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterEqual(String sotedunit) {
        regSotedunit(CK_GE, fRES(sotedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessEqual(String sotedunit) {
        regSotedunit(CK_LE, fRES(sotedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunitList The collection of sotedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_InScope(Collection<String> sotedunitList) {
        doSetSotedunit_InScope(sotedunitList);
    }

    protected void doSetSotedunit_InScope(Collection<String> sotedunitList) {
        regINS(CK_INS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunitList The collection of sotedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotInScope(Collection<String> sotedunitList) {
        doSetSotedunit_NotInScope(sotedunitList);
    }

    protected void doSetSotedunit_NotInScope(Collection<String> sotedunitList) {
        regINS(CK_NINS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSotedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedunit The value of sotedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedunit_LikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedunit_NotLikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_PrefixSearch(String sotedunit) {
        setSotedunit_LikeSearch(sotedunit, xcLSOPPre());
    }

    protected void regSotedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedunit(), "SOTEDUNIT"); }
    protected abstract ConditionValue xgetCValueSotedunit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_Equal(String limitdate) {
        doSetLimitdate_Equal(fRES(limitdate));
    }

    protected void doSetLimitdate_Equal(String limitdate) {
        regLimitdate(CK_EQ, limitdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotEqual(String limitdate) {
        doSetLimitdate_NotEqual(fRES(limitdate));
    }

    protected void doSetLimitdate_NotEqual(String limitdate) {
        regLimitdate(CK_NES, limitdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterThan(String limitdate) {
        regLimitdate(CK_GT, fRES(limitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessThan(String limitdate) {
        regLimitdate(CK_LT, fRES(limitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterEqual(String limitdate) {
        regLimitdate(CK_GE, fRES(limitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessEqual(String limitdate) {
        regLimitdate(CK_LE, fRES(limitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdateList The collection of limitdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_InScope(Collection<String> limitdateList) {
        doSetLimitdate_InScope(limitdateList);
    }

    protected void doSetLimitdate_InScope(Collection<String> limitdateList) {
        regINS(CK_INS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdateList The collection of limitdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotInScope(Collection<String> limitdateList) {
        doSetLimitdate_NotInScope(limitdateList);
    }

    protected void doSetLimitdate_NotInScope(Collection<String> limitdateList) {
        regINS(CK_NINS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setLimitdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitdate The value of limitdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitdate_LikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdate_NotLikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @param limitdate The value of limitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_PrefixSearch(String limitdate) {
        setLimitdate_LikeSearch(limitdate, xcLSOPPre());
    }

    protected void regLimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdate(), "LIMITDATE"); }
    protected abstract ConditionValue xgetCValueLimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_Equal(String designflg) {
        doSetDesignflg_Equal(fRES(designflg));
    }

    protected void doSetDesignflg_Equal(String designflg) {
        regDesignflg(CK_EQ, designflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_NotEqual(String designflg) {
        doSetDesignflg_NotEqual(fRES(designflg));
    }

    protected void doSetDesignflg_NotEqual(String designflg) {
        regDesignflg(CK_NES, designflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_GreaterThan(String designflg) {
        regDesignflg(CK_GT, fRES(designflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_LessThan(String designflg) {
        regDesignflg(CK_LT, fRES(designflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_GreaterEqual(String designflg) {
        regDesignflg(CK_GE, fRES(designflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_LessEqual(String designflg) {
        regDesignflg(CK_LE, fRES(designflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflgList The collection of designflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_InScope(Collection<String> designflgList) {
        doSetDesignflg_InScope(designflgList);
    }

    protected void doSetDesignflg_InScope(Collection<String> designflgList) {
        regINS(CK_INS, cTL(designflgList), xgetCValueDesignflg(), "DESIGNFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflgList The collection of designflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_NotInScope(Collection<String> designflgList) {
        doSetDesignflg_NotInScope(designflgList);
    }

    protected void doSetDesignflg_NotInScope(Collection<String> designflgList) {
        regINS(CK_NINS, cTL(designflgList), xgetCValueDesignflg(), "DESIGNFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDesignflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designflg The value of designflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignflg_LikeSearch(String designflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designflg), xgetCValueDesignflg(), "DESIGNFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignflg_NotLikeSearch(String designflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designflg), xgetCValueDesignflg(), "DESIGNFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @param designflg The value of designflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignflg_PrefixSearch(String designflg) {
        setDesignflg_LikeSearch(designflg, xcLSOPPre());
    }

    protected void regDesignflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignflg(), "DESIGNFLG"); }
    protected abstract ConditionValue xgetCValueDesignflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_Equal(String picklisttype) {
        doSetPicklisttype_Equal(fRES(picklisttype));
    }

    protected void doSetPicklisttype_Equal(String picklisttype) {
        regPicklisttype(CK_EQ, picklisttype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_NotEqual(String picklisttype) {
        doSetPicklisttype_NotEqual(fRES(picklisttype));
    }

    protected void doSetPicklisttype_NotEqual(String picklisttype) {
        regPicklisttype(CK_NES, picklisttype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_GreaterThan(String picklisttype) {
        regPicklisttype(CK_GT, fRES(picklisttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_LessThan(String picklisttype) {
        regPicklisttype(CK_LT, fRES(picklisttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_GreaterEqual(String picklisttype) {
        regPicklisttype(CK_GE, fRES(picklisttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_LessEqual(String picklisttype) {
        regPicklisttype(CK_LE, fRES(picklisttype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttypeList The collection of picklisttype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_InScope(Collection<String> picklisttypeList) {
        doSetPicklisttype_InScope(picklisttypeList);
    }

    protected void doSetPicklisttype_InScope(Collection<String> picklisttypeList) {
        regINS(CK_INS, cTL(picklisttypeList), xgetCValuePicklisttype(), "PICKLISTTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttypeList The collection of picklisttype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_NotInScope(Collection<String> picklisttypeList) {
        doSetPicklisttype_NotInScope(picklisttypeList);
    }

    protected void doSetPicklisttype_NotInScope(Collection<String> picklisttypeList) {
        regINS(CK_NINS, cTL(picklisttypeList), xgetCValuePicklisttype(), "PICKLISTTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLISTTYPE: {varchar(30)} <br>
     * <pre>e.g. setPicklisttype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picklisttype The value of picklisttype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicklisttype_LikeSearch(String picklisttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picklisttype), xgetCValuePicklisttype(), "PICKLISTTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicklisttype_NotLikeSearch(String picklisttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picklisttype), xgetCValuePicklisttype(), "PICKLISTTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @param picklisttype The value of picklisttype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklisttype_PrefixSearch(String picklisttype) {
        setPicklisttype_LikeSearch(picklisttype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     */
    public void setPicklisttype_IsNull() { regPicklisttype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     */
    public void setPicklisttype_IsNullOrEmpty() { regPicklisttype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLISTTYPE: {varchar(30)}
     */
    public void setPicklisttype_IsNotNull() { regPicklisttype(CK_ISNN, DOBJ); }

    protected void regPicklisttype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklisttype(), "PICKLISTTYPE"); }
    protected abstract ConditionValue xgetCValuePicklisttype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_Equal(String sotedloc) {
        doSetSotedloc_Equal(fRES(sotedloc));
    }

    protected void doSetSotedloc_Equal(String sotedloc) {
        regSotedloc(CK_EQ, sotedloc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_NotEqual(String sotedloc) {
        doSetSotedloc_NotEqual(fRES(sotedloc));
    }

    protected void doSetSotedloc_NotEqual(String sotedloc) {
        regSotedloc(CK_NES, sotedloc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_GreaterThan(String sotedloc) {
        regSotedloc(CK_GT, fRES(sotedloc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_LessThan(String sotedloc) {
        regSotedloc(CK_LT, fRES(sotedloc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_GreaterEqual(String sotedloc) {
        regSotedloc(CK_GE, fRES(sotedloc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_LessEqual(String sotedloc) {
        regSotedloc(CK_LE, fRES(sotedloc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedlocList The collection of sotedloc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_InScope(Collection<String> sotedlocList) {
        doSetSotedloc_InScope(sotedlocList);
    }

    protected void doSetSotedloc_InScope(Collection<String> sotedlocList) {
        regINS(CK_INS, cTL(sotedlocList), xgetCValueSotedloc(), "SOTEDLOC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedlocList The collection of sotedloc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_NotInScope(Collection<String> sotedlocList) {
        doSetSotedloc_NotInScope(sotedlocList);
    }

    protected void doSetSotedloc_NotInScope(Collection<String> sotedlocList) {
        regINS(CK_NINS, cTL(sotedlocList), xgetCValueSotedloc(), "SOTEDLOC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(30)} <br>
     * <pre>e.g. setSotedloc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedloc The value of sotedloc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedloc_LikeSearch(String sotedloc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedloc), xgetCValueSotedloc(), "SOTEDLOC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedloc_NotLikeSearch(String sotedloc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedloc), xgetCValueSotedloc(), "SOTEDLOC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     * @param sotedloc The value of sotedloc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_PrefixSearch(String sotedloc) {
        setSotedloc_LikeSearch(sotedloc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     */
    public void setSotedloc_IsNull() { regSotedloc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     */
    public void setSotedloc_IsNullOrEmpty() { regSotedloc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(30)}
     */
    public void setSotedloc_IsNotNull() { regSotedloc(CK_ISNN, DOBJ); }

    protected void regSotedloc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedloc(), "SOTEDLOC"); }
    protected abstract ConditionValue xgetCValueSotedloc();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_Equal(Long picklistkey) {
        doSetPicklistkey_Equal(picklistkey);
    }

    protected void doSetPicklistkey_Equal(Long picklistkey) {
        regPicklistkey(CK_EQ, picklistkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_NotEqual(Long picklistkey) {
        doSetPicklistkey_NotEqual(picklistkey);
    }

    protected void doSetPicklistkey_NotEqual(Long picklistkey) {
        regPicklistkey(CK_NES, picklistkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_GreaterThan(Long picklistkey) {
        regPicklistkey(CK_GT, picklistkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_LessThan(Long picklistkey) {
        regPicklistkey(CK_LT, picklistkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_GreaterEqual(Long picklistkey) {
        regPicklistkey(CK_GE, picklistkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_LessEqual(Long picklistkey) {
        regPicklistkey(CK_LE, picklistkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param minNumber The min number of picklistkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistkey(), "PICKLISTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkeyList The collection of picklistkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistkey_InScope(Collection<Long> picklistkeyList) {
        doSetPicklistkey_InScope(picklistkeyList);
    }

    protected void doSetPicklistkey_InScope(Collection<Long> picklistkeyList) {
        regINS(CK_INS, cTL(picklistkeyList), xgetCValuePicklistkey(), "PICKLISTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkeyList The collection of picklistkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistkey_NotInScope(Collection<Long> picklistkeyList) {
        doSetPicklistkey_NotInScope(picklistkeyList);
    }

    protected void doSetPicklistkey_NotInScope(Collection<Long> picklistkeyList) {
        regINS(CK_NINS, cTL(picklistkeyList), xgetCValuePicklistkey(), "PICKLISTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     */
    public void setPicklistkey_IsNull() { regPicklistkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     */
    public void setPicklistkey_IsNotNull() { regPicklistkey(CK_ISNN, DOBJ); }

    protected void regPicklistkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistkey(), "PICKLISTKEY"); }
    protected abstract ConditionValue xgetCValuePicklistkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_Equal(Long picklistgno) {
        doSetPicklistgno_Equal(picklistgno);
    }

    protected void doSetPicklistgno_Equal(Long picklistgno) {
        regPicklistgno(CK_EQ, picklistgno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_NotEqual(Long picklistgno) {
        doSetPicklistgno_NotEqual(picklistgno);
    }

    protected void doSetPicklistgno_NotEqual(Long picklistgno) {
        regPicklistgno(CK_NES, picklistgno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_GreaterThan(Long picklistgno) {
        regPicklistgno(CK_GT, picklistgno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_LessThan(Long picklistgno) {
        regPicklistgno(CK_LT, picklistgno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_GreaterEqual(Long picklistgno) {
        regPicklistgno(CK_GE, picklistgno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_LessEqual(Long picklistgno) {
        regPicklistgno(CK_LE, picklistgno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param minNumber The min number of picklistgno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistgno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistgno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistgno(), "PICKLISTGNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgnoList The collection of picklistgno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistgno_InScope(Collection<Long> picklistgnoList) {
        doSetPicklistgno_InScope(picklistgnoList);
    }

    protected void doSetPicklistgno_InScope(Collection<Long> picklistgnoList) {
        regINS(CK_INS, cTL(picklistgnoList), xgetCValuePicklistgno(), "PICKLISTGNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgnoList The collection of picklistgno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistgno_NotInScope(Collection<Long> picklistgnoList) {
        doSetPicklistgno_NotInScope(picklistgnoList);
    }

    protected void doSetPicklistgno_NotInScope(Collection<Long> picklistgnoList) {
        regINS(CK_NINS, cTL(picklistgnoList), xgetCValuePicklistgno(), "PICKLISTGNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     */
    public void setPicklistgno_IsNull() { regPicklistgno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     */
    public void setPicklistgno_IsNotNull() { regPicklistgno(CK_ISNN, DOBJ); }

    protected void regPicklistgno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistgno(), "PICKLISTGNO"); }
    protected abstract ConditionValue xgetCValuePicklistgno();

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
    public HpSLCFunction<MMfmonthchgCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MMfmonthchgCB.class);
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
    public HpSLCFunction<MMfmonthchgCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MMfmonthchgCB.class);
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
    public HpSLCFunction<MMfmonthchgCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MMfmonthchgCB.class);
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
    public HpSLCFunction<MMfmonthchgCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MMfmonthchgCB.class);
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
    public HpSLCFunction<MMfmonthchgCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MMfmonthchgCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MMfmonthchgCB&gt;() {
     *     public void query(MMfmonthchgCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MMfmonthchgCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MMfmonthchgCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfmonthchgCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MMfmonthchgCQ sq);

    protected MMfmonthchgCB xcreateScalarConditionCB() {
        MMfmonthchgCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MMfmonthchgCB xcreateScalarConditionPartitionByCB() {
        MMfmonthchgCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MMfmonthchgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MFMONTHCHG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MMfmonthchgCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MMfmonthchgCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MMfmonthchgCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MFMONTHCHG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MMfmonthchgCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MMfmonthchgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MMfmonthchgCQ sq);

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
    protected MMfmonthchgCB newMyCB() {
        return new MMfmonthchgCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MMfmonthchgCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

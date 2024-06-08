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
 * The abstract condition-query of T_SPLINFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSplinfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSplinfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_SPLINFO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoId The value of splinfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplinfoId_Equal(Long splinfoId) {
        doSetSplinfoId_Equal(splinfoId);
    }

    protected void doSetSplinfoId_Equal(Long splinfoId) {
        regSplinfoId(CK_EQ, splinfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoId The value of splinfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplinfoId_NotEqual(Long splinfoId) {
        doSetSplinfoId_NotEqual(splinfoId);
    }

    protected void doSetSplinfoId_NotEqual(Long splinfoId) {
        regSplinfoId(CK_NES, splinfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoId The value of splinfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplinfoId_GreaterThan(Long splinfoId) {
        regSplinfoId(CK_GT, splinfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoId The value of splinfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplinfoId_LessThan(Long splinfoId) {
        regSplinfoId(CK_LT, splinfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoId The value of splinfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplinfoId_GreaterEqual(Long splinfoId) {
        regSplinfoId(CK_GE, splinfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoId The value of splinfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplinfoId_LessEqual(Long splinfoId) {
        regSplinfoId(CK_LE, splinfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of splinfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of splinfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSplinfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSplinfoId(), "SPLINFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoIdList The collection of splinfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplinfoId_InScope(Collection<Long> splinfoIdList) {
        doSetSplinfoId_InScope(splinfoIdList);
    }

    protected void doSetSplinfoId_InScope(Collection<Long> splinfoIdList) {
        regINS(CK_INS, cTL(splinfoIdList), xgetCValueSplinfoId(), "SPLINFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param splinfoIdList The collection of splinfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplinfoId_NotInScope(Collection<Long> splinfoIdList) {
        doSetSplinfoId_NotInScope(splinfoIdList);
    }

    protected void doSetSplinfoId_NotInScope(Collection<Long> splinfoIdList) {
        regINS(CK_NINS, cTL(splinfoIdList), xgetCValueSplinfoId(), "SPLINFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSplinfoId_IsNull() { regSplinfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSplinfoId_IsNotNull() { regSplinfoId(CK_ISNN, DOBJ); }

    protected void regSplinfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplinfoId(), "SPLINFO_ID"); }
    protected abstract ConditionValue xgetCValueSplinfoId();

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
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_Equal(String splymd) {
        doSetSplymd_Equal(fRES(splymd));
    }

    protected void doSetSplymd_Equal(String splymd) {
        regSplymd(CK_EQ, splymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_NotEqual(String splymd) {
        doSetSplymd_NotEqual(fRES(splymd));
    }

    protected void doSetSplymd_NotEqual(String splymd) {
        regSplymd(CK_NES, splymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_GreaterThan(String splymd) {
        regSplymd(CK_GT, fRES(splymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_LessThan(String splymd) {
        regSplymd(CK_LT, fRES(splymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_GreaterEqual(String splymd) {
        regSplymd(CK_GE, fRES(splymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_LessEqual(String splymd) {
        regSplymd(CK_LE, fRES(splymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymdList The collection of splymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_InScope(Collection<String> splymdList) {
        doSetSplymd_InScope(splymdList);
    }

    protected void doSetSplymd_InScope(Collection<String> splymdList) {
        regINS(CK_INS, cTL(splymdList), xgetCValueSplymd(), "SPLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymdList The collection of splymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_NotInScope(Collection<String> splymdList) {
        doSetSplymd_NotInScope(splymdList);
    }

    protected void doSetSplymd_NotInScope(Collection<String> splymdList) {
        regINS(CK_NINS, cTL(splymdList), xgetCValueSplymd(), "SPLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSplymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param splymd The value of splymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSplymd_LikeSearch(String splymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(splymd), xgetCValueSplymd(), "SPLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSplymd_NotLikeSearch(String splymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(splymd), xgetCValueSplymd(), "SPLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @param splymd The value of splymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplymd_PrefixSearch(String splymd) {
        setSplymd_LikeSearch(splymd, xcLSOPPre());
    }

    protected void regSplymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplymd(), "SPLYMD"); }
    protected abstract ConditionValue xgetCValueSplymd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @param upddtm The value of upddtm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpddtm_Equal(java.sql.Timestamp upddtm) {
        regUpddtm(CK_EQ,  upddtm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @param upddtm The value of upddtm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpddtm_GreaterThan(java.sql.Timestamp upddtm) {
        regUpddtm(CK_GT,  upddtm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @param upddtm The value of upddtm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpddtm_LessThan(java.sql.Timestamp upddtm) {
        regUpddtm(CK_LT,  upddtm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @param upddtm The value of upddtm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpddtm_GreaterEqual(java.sql.Timestamp upddtm) {
        regUpddtm(CK_GE,  upddtm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @param upddtm The value of upddtm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpddtm_LessEqual(java.sql.Timestamp upddtm) {
        regUpddtm(CK_LE, upddtm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * <pre>e.g. setUpddtm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of upddtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of upddtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpddtm_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueUpddtm(), "UPDDTM", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of upddtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of upddtm. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setUpddtm_DateFromTo(Date fromDate, Date toDate) {
        setUpddtm_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     */
    public void setUpddtm_IsNull() { regUpddtm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     */
    public void setUpddtm_IsNotNull() { regUpddtm(CK_ISNN, DOBJ); }

    protected void regUpddtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpddtm(), "UPDDTM"); }
    protected abstract ConditionValue xgetCValueUpddtm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnun The value of csplnun as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_Equal(Long csplnun) {
        doSetCsplnun_Equal(csplnun);
    }

    protected void doSetCsplnun_Equal(Long csplnun) {
        regCsplnun(CK_EQ, csplnun);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnun The value of csplnun as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_NotEqual(Long csplnun) {
        doSetCsplnun_NotEqual(csplnun);
    }

    protected void doSetCsplnun_NotEqual(Long csplnun) {
        regCsplnun(CK_NES, csplnun);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnun The value of csplnun as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_GreaterThan(Long csplnun) {
        regCsplnun(CK_GT, csplnun);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnun The value of csplnun as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_LessThan(Long csplnun) {
        regCsplnun(CK_LT, csplnun);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnun The value of csplnun as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_GreaterEqual(Long csplnun) {
        regCsplnun(CK_GE, csplnun);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnun The value of csplnun as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_LessEqual(Long csplnun) {
        regCsplnun(CK_LE, csplnun);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param minNumber The min number of csplnun. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of csplnun. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCsplnun_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCsplnun(), "CSPLNUN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnunList The collection of csplnun as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsplnun_InScope(Collection<Long> csplnunList) {
        doSetCsplnun_InScope(csplnunList);
    }

    protected void doSetCsplnun_InScope(Collection<Long> csplnunList) {
        regINS(CK_INS, cTL(csplnunList), xgetCValueCsplnun(), "CSPLNUN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @param csplnunList The collection of csplnun as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsplnun_NotInScope(Collection<Long> csplnunList) {
        doSetCsplnun_NotInScope(csplnunList);
    }

    protected void doSetCsplnun_NotInScope(Collection<Long> csplnunList) {
        regINS(CK_NINS, cTL(csplnunList), xgetCValueCsplnun(), "CSPLNUN");
    }

    protected void regCsplnun(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsplnun(), "CSPLNUN"); }
    protected abstract ConditionValue xgetCValueCsplnun();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_Equal(String linblk) {
        doSetLinblk_Equal(fRES(linblk));
    }

    protected void doSetLinblk_Equal(String linblk) {
        regLinblk(CK_EQ, linblk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotEqual(String linblk) {
        doSetLinblk_NotEqual(fRES(linblk));
    }

    protected void doSetLinblk_NotEqual(String linblk) {
        regLinblk(CK_NES, linblk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterThan(String linblk) {
        regLinblk(CK_GT, fRES(linblk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessThan(String linblk) {
        regLinblk(CK_LT, fRES(linblk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterEqual(String linblk) {
        regLinblk(CK_GE, fRES(linblk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessEqual(String linblk) {
        regLinblk(CK_LE, fRES(linblk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblkList The collection of linblk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_InScope(Collection<String> linblkList) {
        doSetLinblk_InScope(linblkList);
    }

    protected void doSetLinblk_InScope(Collection<String> linblkList) {
        regINS(CK_INS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblkList The collection of linblk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotInScope(Collection<String> linblkList) {
        doSetLinblk_NotInScope(linblkList);
    }

    protected void doSetLinblk_NotInScope(Collection<String> linblkList) {
        regINS(CK_NINS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLinblk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk The value of linblk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk_LikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk_NotLikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_PrefixSearch(String linblk) {
        setLinblk_LikeSearch(linblk, xcLSOPPre());
    }

    protected void regLinblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk(), "LINBLK"); }
    protected abstract ConditionValue xgetCValueLinblk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splid The value of splid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplid_Equal(java.math.BigDecimal splid) {
        doSetSplid_Equal(splid);
    }

    protected void doSetSplid_Equal(java.math.BigDecimal splid) {
        regSplid(CK_EQ, splid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splid The value of splid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplid_NotEqual(java.math.BigDecimal splid) {
        doSetSplid_NotEqual(splid);
    }

    protected void doSetSplid_NotEqual(java.math.BigDecimal splid) {
        regSplid(CK_NES, splid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splid The value of splid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplid_GreaterThan(java.math.BigDecimal splid) {
        regSplid(CK_GT, splid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splid The value of splid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplid_LessThan(java.math.BigDecimal splid) {
        regSplid(CK_LT, splid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splid The value of splid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplid_GreaterEqual(java.math.BigDecimal splid) {
        regSplid(CK_GE, splid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splid The value of splid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSplid_LessEqual(java.math.BigDecimal splid) {
        regSplid(CK_LE, splid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param minNumber The min number of splid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of splid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSplid_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSplid(), "SPLID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splidList The collection of splid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplid_InScope(Collection<java.math.BigDecimal> splidList) {
        doSetSplid_InScope(splidList);
    }

    protected void doSetSplid_InScope(Collection<java.math.BigDecimal> splidList) {
        regINS(CK_INS, cTL(splidList), xgetCValueSplid(), "SPLID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @param splidList The collection of splid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplid_NotInScope(Collection<java.math.BigDecimal> splidList) {
        doSetSplid_NotInScope(splidList);
    }

    protected void doSetSplid_NotInScope(Collection<java.math.BigDecimal> splidList) {
        regINS(CK_NINS, cTL(splidList), xgetCValueSplid(), "SPLID");
    }

    protected void regSplid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplid(), "SPLID"); }
    protected abstract ConditionValue xgetCValueSplid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)} <br>
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
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNull() { regDpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNullOrEmpty() { regDpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNotNull() { regDpcd(CK_ISNN, DOBJ); }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_Equal(String ded) {
        doSetDed_Equal(fRES(ded));
    }

    protected void doSetDed_Equal(String ded) {
        regDed(CK_EQ, ded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotEqual(String ded) {
        doSetDed_NotEqual(fRES(ded));
    }

    protected void doSetDed_NotEqual(String ded) {
        regDed(CK_NES, ded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param dedList The collection of ded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_InScope(Collection<String> dedList) {
        doSetDed_InScope(dedList);
    }

    protected void doSetDed_InScope(Collection<String> dedList) {
        regINS(CK_INS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param dedList The collection of ded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotInScope(Collection<String> dedList) {
        doSetDed_NotInScope(dedList);
    }

    protected void doSetDed_NotInScope(Collection<String> dedList) {
        regINS(CK_NINS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)} <br>
     * <pre>e.g. setDed_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ded The value of ded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDed_LikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNull() { regDed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNullOrEmpty() { regDed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNotNull() { regDed(CK_ISNN, DOBJ); }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_Equal(String locKbn) {
        doSetLocKbn_Equal(fRES(locKbn));
    }

    protected void doSetLocKbn_Equal(String locKbn) {
        regLocKbn(CK_EQ, locKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_NotEqual(String locKbn) {
        doSetLocKbn_NotEqual(fRES(locKbn));
    }

    protected void doSetLocKbn_NotEqual(String locKbn) {
        regLocKbn(CK_NES, locKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_GreaterThan(String locKbn) {
        regLocKbn(CK_GT, fRES(locKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_LessThan(String locKbn) {
        regLocKbn(CK_LT, fRES(locKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_GreaterEqual(String locKbn) {
        regLocKbn(CK_GE, fRES(locKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_LessEqual(String locKbn) {
        regLocKbn(CK_LE, fRES(locKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbnList The collection of locKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_InScope(Collection<String> locKbnList) {
        doSetLocKbn_InScope(locKbnList);
    }

    protected void doSetLocKbn_InScope(Collection<String> locKbnList) {
        regINS(CK_INS, cTL(locKbnList), xgetCValueLocKbn(), "LOC_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbnList The collection of locKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_NotInScope(Collection<String> locKbnList) {
        doSetLocKbn_NotInScope(locKbnList);
    }

    protected void doSetLocKbn_NotInScope(Collection<String> locKbnList) {
        regINS(CK_NINS, cTL(locKbnList), xgetCValueLocKbn(), "LOC_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setLocKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locKbn The value of locKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocKbn_LikeSearch(String locKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locKbn), xgetCValueLocKbn(), "LOC_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocKbn_NotLikeSearch(String locKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locKbn), xgetCValueLocKbn(), "LOC_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @param locKbn The value of locKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocKbn_PrefixSearch(String locKbn) {
        setLocKbn_LikeSearch(locKbn, xcLSOPPre());
    }

    protected void regLocKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocKbn(), "LOC_KBN"); }
    protected abstract ConditionValue xgetCValueLocKbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precb The value of precb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecb_Equal(Long precb) {
        doSetPrecb_Equal(precb);
    }

    protected void doSetPrecb_Equal(Long precb) {
        regPrecb(CK_EQ, precb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precb The value of precb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecb_NotEqual(Long precb) {
        doSetPrecb_NotEqual(precb);
    }

    protected void doSetPrecb_NotEqual(Long precb) {
        regPrecb(CK_NES, precb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precb The value of precb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecb_GreaterThan(Long precb) {
        regPrecb(CK_GT, precb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precb The value of precb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecb_LessThan(Long precb) {
        regPrecb(CK_LT, precb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precb The value of precb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecb_GreaterEqual(Long precb) {
        regPrecb(CK_GE, precb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precb The value of precb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecb_LessEqual(Long precb) {
        regPrecb(CK_LE, precb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param minNumber The min number of precb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of precb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrecb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrecb(), "PRECB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precbList The collection of precb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrecb_InScope(Collection<Long> precbList) {
        doSetPrecb_InScope(precbList);
    }

    protected void doSetPrecb_InScope(Collection<Long> precbList) {
        regINS(CK_INS, cTL(precbList), xgetCValuePrecb(), "PRECB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRECB: {NotNull, bigint(19)}
     * @param precbList The collection of precb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrecb_NotInScope(Collection<Long> precbList) {
        doSetPrecb_NotInScope(precbList);
    }

    protected void doSetPrecb_NotInScope(Collection<Long> precbList) {
        regINS(CK_NINS, cTL(precbList), xgetCValuePrecb(), "PRECB");
    }

    protected void regPrecb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrecb(), "PRECB"); }
    protected abstract ConditionValue xgetCValuePrecb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prect The value of prect as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrect_Equal(Long prect) {
        doSetPrect_Equal(prect);
    }

    protected void doSetPrect_Equal(Long prect) {
        regPrect(CK_EQ, prect);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prect The value of prect as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrect_NotEqual(Long prect) {
        doSetPrect_NotEqual(prect);
    }

    protected void doSetPrect_NotEqual(Long prect) {
        regPrect(CK_NES, prect);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prect The value of prect as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrect_GreaterThan(Long prect) {
        regPrect(CK_GT, prect);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prect The value of prect as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrect_LessThan(Long prect) {
        regPrect(CK_LT, prect);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prect The value of prect as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrect_GreaterEqual(Long prect) {
        regPrect(CK_GE, prect);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prect The value of prect as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrect_LessEqual(Long prect) {
        regPrect(CK_LE, prect);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param minNumber The min number of prect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrect_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrect(), "PRECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prectList The collection of prect as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrect_InScope(Collection<Long> prectList) {
        doSetPrect_InScope(prectList);
    }

    protected void doSetPrect_InScope(Collection<Long> prectList) {
        regINS(CK_INS, cTL(prectList), xgetCValuePrect(), "PRECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRECT: {NotNull, bigint(19)}
     * @param prectList The collection of prect as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrect_NotInScope(Collection<Long> prectList) {
        doSetPrect_NotInScope(prectList);
    }

    protected void doSetPrect_NotInScope(Collection<Long> prectList) {
        regINS(CK_NINS, cTL(prectList), xgetCValuePrect(), "PRECT");
    }

    protected void regPrect(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrect(), "PRECT"); }
    protected abstract ConditionValue xgetCValuePrect();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcb The value of calcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalcb_Equal(Long calcb) {
        doSetCalcb_Equal(calcb);
    }

    protected void doSetCalcb_Equal(Long calcb) {
        regCalcb(CK_EQ, calcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcb The value of calcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalcb_NotEqual(Long calcb) {
        doSetCalcb_NotEqual(calcb);
    }

    protected void doSetCalcb_NotEqual(Long calcb) {
        regCalcb(CK_NES, calcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcb The value of calcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalcb_GreaterThan(Long calcb) {
        regCalcb(CK_GT, calcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcb The value of calcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalcb_LessThan(Long calcb) {
        regCalcb(CK_LT, calcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcb The value of calcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalcb_GreaterEqual(Long calcb) {
        regCalcb(CK_GE, calcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcb The value of calcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalcb_LessEqual(Long calcb) {
        regCalcb(CK_LE, calcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param minNumber The min number of calcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of calcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCalcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCalcb(), "CALCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcbList The collection of calcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalcb_InScope(Collection<Long> calcbList) {
        doSetCalcb_InScope(calcbList);
    }

    protected void doSetCalcb_InScope(Collection<Long> calcbList) {
        regINS(CK_INS, cTL(calcbList), xgetCValueCalcb(), "CALCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CALCB: {NotNull, bigint(19)}
     * @param calcbList The collection of calcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalcb_NotInScope(Collection<Long> calcbList) {
        doSetCalcb_NotInScope(calcbList);
    }

    protected void doSetCalcb_NotInScope(Collection<Long> calcbList) {
        regINS(CK_NINS, cTL(calcbList), xgetCValueCalcb(), "CALCB");
    }

    protected void regCalcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCalcb(), "CALCB"); }
    protected abstract ConditionValue xgetCValueCalcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calct The value of calct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalct_Equal(Long calct) {
        doSetCalct_Equal(calct);
    }

    protected void doSetCalct_Equal(Long calct) {
        regCalct(CK_EQ, calct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calct The value of calct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalct_NotEqual(Long calct) {
        doSetCalct_NotEqual(calct);
    }

    protected void doSetCalct_NotEqual(Long calct) {
        regCalct(CK_NES, calct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calct The value of calct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalct_GreaterThan(Long calct) {
        regCalct(CK_GT, calct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calct The value of calct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalct_LessThan(Long calct) {
        regCalct(CK_LT, calct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calct The value of calct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalct_GreaterEqual(Long calct) {
        regCalct(CK_GE, calct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calct The value of calct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCalct_LessEqual(Long calct) {
        regCalct(CK_LE, calct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param minNumber The min number of calct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of calct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCalct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCalct(), "CALCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calctList The collection of calct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalct_InScope(Collection<Long> calctList) {
        doSetCalct_InScope(calctList);
    }

    protected void doSetCalct_InScope(Collection<Long> calctList) {
        regINS(CK_INS, cTL(calctList), xgetCValueCalct(), "CALCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CALCT: {NotNull, bigint(19)}
     * @param calctList The collection of calct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalct_NotInScope(Collection<Long> calctList) {
        doSetCalct_NotInScope(calctList);
    }

    protected void doSetCalct_NotInScope(Collection<Long> calctList) {
        regINS(CK_NINS, cTL(calctList), xgetCValueCalct(), "CALCT");
    }

    protected void regCalct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCalct(), "CALCT"); }
    protected abstract ConditionValue xgetCValueCalct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcb The value of reqcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqcb_Equal(Long reqcb) {
        doSetReqcb_Equal(reqcb);
    }

    protected void doSetReqcb_Equal(Long reqcb) {
        regReqcb(CK_EQ, reqcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcb The value of reqcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqcb_NotEqual(Long reqcb) {
        doSetReqcb_NotEqual(reqcb);
    }

    protected void doSetReqcb_NotEqual(Long reqcb) {
        regReqcb(CK_NES, reqcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcb The value of reqcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqcb_GreaterThan(Long reqcb) {
        regReqcb(CK_GT, reqcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcb The value of reqcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqcb_LessThan(Long reqcb) {
        regReqcb(CK_LT, reqcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcb The value of reqcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqcb_GreaterEqual(Long reqcb) {
        regReqcb(CK_GE, reqcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcb The value of reqcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqcb_LessEqual(Long reqcb) {
        regReqcb(CK_LE, reqcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of reqcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reqcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReqcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReqcb(), "REQCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcbList The collection of reqcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqcb_InScope(Collection<Long> reqcbList) {
        doSetReqcb_InScope(reqcbList);
    }

    protected void doSetReqcb_InScope(Collection<Long> reqcbList) {
        regINS(CK_INS, cTL(reqcbList), xgetCValueReqcb(), "REQCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @param reqcbList The collection of reqcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqcb_NotInScope(Collection<Long> reqcbList) {
        doSetReqcb_NotInScope(reqcbList);
    }

    protected void doSetReqcb_NotInScope(Collection<Long> reqcbList) {
        regINS(CK_NINS, cTL(reqcbList), xgetCValueReqcb(), "REQCB");
    }

    protected void regReqcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqcb(), "REQCB"); }
    protected abstract ConditionValue xgetCValueReqcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqct The value of reqct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqct_Equal(Long reqct) {
        doSetReqct_Equal(reqct);
    }

    protected void doSetReqct_Equal(Long reqct) {
        regReqct(CK_EQ, reqct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqct The value of reqct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqct_NotEqual(Long reqct) {
        doSetReqct_NotEqual(reqct);
    }

    protected void doSetReqct_NotEqual(Long reqct) {
        regReqct(CK_NES, reqct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqct The value of reqct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqct_GreaterThan(Long reqct) {
        regReqct(CK_GT, reqct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqct The value of reqct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqct_LessThan(Long reqct) {
        regReqct(CK_LT, reqct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqct The value of reqct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqct_GreaterEqual(Long reqct) {
        regReqct(CK_GE, reqct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqct The value of reqct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReqct_LessEqual(Long reqct) {
        regReqct(CK_LE, reqct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of reqct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reqct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReqct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReqct(), "REQCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqctList The collection of reqct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqct_InScope(Collection<Long> reqctList) {
        doSetReqct_InScope(reqctList);
    }

    protected void doSetReqct_InScope(Collection<Long> reqctList) {
        regINS(CK_INS, cTL(reqctList), xgetCValueReqct(), "REQCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @param reqctList The collection of reqct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqct_NotInScope(Collection<Long> reqctList) {
        doSetReqct_NotInScope(reqctList);
    }

    protected void doSetReqct_NotInScope(Collection<Long> reqctList) {
        regINS(CK_NINS, cTL(reqctList), xgetCValueReqct(), "REQCT");
    }

    protected void regReqct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqct(), "REQCT"); }
    protected abstract ConditionValue xgetCValueReqct();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_Equal(String status) {
        doSetStatus_Equal(fRES(status));
    }

    protected void doSetStatus_Equal(String status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotEqual(String status) {
        doSetStatus_NotEqual(fRES(status));
    }

    protected void doSetStatus_NotEqual(String status) {
        regStatus(CK_NES, status);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param statusList The collection of status as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_InScope(Collection<String> statusList) {
        doSetStatus_InScope(statusList);
    }

    protected void doSetStatus_InScope(Collection<String> statusList) {
        regINS(CK_INS, cTL(statusList), xgetCValueStatus(), "STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param statusList The collection of status as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotInScope(Collection<String> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    protected void doSetStatus_NotInScope(Collection<String> statusList) {
        regINS(CK_NINS, cTL(statusList), xgetCValueStatus(), "STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]} <br>
     * <pre>e.g. setStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param status The value of status as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), xgetCValueStatus(), "STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), xgetCValueStatus(), "STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @param status The value of status as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_PrefixSearch(String status) {
        setStatus_LikeSearch(status, xcLSOPPre());
    }

    protected void regStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatus(), "STATUS"); }
    protected abstract ConditionValue xgetCValueStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescb The value of rescb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescb_Equal(Long rescb) {
        doSetRescb_Equal(rescb);
    }

    protected void doSetRescb_Equal(Long rescb) {
        regRescb(CK_EQ, rescb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescb The value of rescb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescb_NotEqual(Long rescb) {
        doSetRescb_NotEqual(rescb);
    }

    protected void doSetRescb_NotEqual(Long rescb) {
        regRescb(CK_NES, rescb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescb The value of rescb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescb_GreaterThan(Long rescb) {
        regRescb(CK_GT, rescb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescb The value of rescb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescb_LessThan(Long rescb) {
        regRescb(CK_LT, rescb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescb The value of rescb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescb_GreaterEqual(Long rescb) {
        regRescb(CK_GE, rescb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescb The value of rescb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescb_LessEqual(Long rescb) {
        regRescb(CK_LE, rescb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of rescb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rescb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRescb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRescb(), "RESCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescbList The collection of rescb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRescb_InScope(Collection<Long> rescbList) {
        doSetRescb_InScope(rescbList);
    }

    protected void doSetRescb_InScope(Collection<Long> rescbList) {
        regINS(CK_INS, cTL(rescbList), xgetCValueRescb(), "RESCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @param rescbList The collection of rescb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRescb_NotInScope(Collection<Long> rescbList) {
        doSetRescb_NotInScope(rescbList);
    }

    protected void doSetRescb_NotInScope(Collection<Long> rescbList) {
        regINS(CK_NINS, cTL(rescbList), xgetCValueRescb(), "RESCB");
    }

    protected void regRescb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRescb(), "RESCB"); }
    protected abstract ConditionValue xgetCValueRescb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restb The value of restb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestb_Equal(Long restb) {
        doSetRestb_Equal(restb);
    }

    protected void doSetRestb_Equal(Long restb) {
        regRestb(CK_EQ, restb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restb The value of restb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestb_NotEqual(Long restb) {
        doSetRestb_NotEqual(restb);
    }

    protected void doSetRestb_NotEqual(Long restb) {
        regRestb(CK_NES, restb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restb The value of restb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestb_GreaterThan(Long restb) {
        regRestb(CK_GT, restb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restb The value of restb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestb_LessThan(Long restb) {
        regRestb(CK_LT, restb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restb The value of restb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestb_GreaterEqual(Long restb) {
        regRestb(CK_GE, restb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restb The value of restb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestb_LessEqual(Long restb) {
        regRestb(CK_LE, restb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of restb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestb(), "RESTB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restbList The collection of restb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestb_InScope(Collection<Long> restbList) {
        doSetRestb_InScope(restbList);
    }

    protected void doSetRestb_InScope(Collection<Long> restbList) {
        regINS(CK_INS, cTL(restbList), xgetCValueRestb(), "RESTB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @param restbList The collection of restb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestb_NotInScope(Collection<Long> restbList) {
        doSetRestb_NotInScope(restbList);
    }

    protected void doSetRestb_NotInScope(Collection<Long> restbList) {
        regINS(CK_NINS, cTL(restbList), xgetCValueRestb(), "RESTB");
    }

    protected void regRestb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestb(), "RESTB"); }
    protected abstract ConditionValue xgetCValueRestb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqa The value of abstosplcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_Equal(Long abstosplcbqa) {
        doSetAbstosplcbqa_Equal(abstosplcbqa);
    }

    protected void doSetAbstosplcbqa_Equal(Long abstosplcbqa) {
        regAbstosplcbqa(CK_EQ, abstosplcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqa The value of abstosplcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_NotEqual(Long abstosplcbqa) {
        doSetAbstosplcbqa_NotEqual(abstosplcbqa);
    }

    protected void doSetAbstosplcbqa_NotEqual(Long abstosplcbqa) {
        regAbstosplcbqa(CK_NES, abstosplcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqa The value of abstosplcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_GreaterThan(Long abstosplcbqa) {
        regAbstosplcbqa(CK_GT, abstosplcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqa The value of abstosplcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_LessThan(Long abstosplcbqa) {
        regAbstosplcbqa(CK_LT, abstosplcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqa The value of abstosplcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_GreaterEqual(Long abstosplcbqa) {
        regAbstosplcbqa(CK_GE, abstosplcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqa The value of abstosplcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_LessEqual(Long abstosplcbqa) {
        regAbstosplcbqa(CK_LE, abstosplcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param minNumber The min number of abstosplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of abstosplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAbstosplcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAbstosplcbqa(), "ABSTOSPLCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqaList The collection of abstosplcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_InScope(Collection<Long> abstosplcbqaList) {
        doSetAbstosplcbqa_InScope(abstosplcbqaList);
    }

    protected void doSetAbstosplcbqa_InScope(Collection<Long> abstosplcbqaList) {
        regINS(CK_INS, cTL(abstosplcbqaList), xgetCValueAbstosplcbqa(), "ABSTOSPLCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @param abstosplcbqaList The collection of abstosplcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbstosplcbqa_NotInScope(Collection<Long> abstosplcbqaList) {
        doSetAbstosplcbqa_NotInScope(abstosplcbqaList);
    }

    protected void doSetAbstosplcbqa_NotInScope(Collection<Long> abstosplcbqaList) {
        regINS(CK_NINS, cTL(abstosplcbqaList), xgetCValueAbstosplcbqa(), "ABSTOSPLCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     */
    public void setAbstosplcbqa_IsNull() { regAbstosplcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     */
    public void setAbstosplcbqa_IsNotNull() { regAbstosplcbqa(CK_ISNN, DOBJ); }

    protected void regAbstosplcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbstosplcbqa(), "ABSTOSPLCBQA"); }
    protected abstract ConditionValue xgetCValueAbstosplcbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqa The value of abstosplctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplctqa_Equal(Long abstosplctqa) {
        doSetAbstosplctqa_Equal(abstosplctqa);
    }

    protected void doSetAbstosplctqa_Equal(Long abstosplctqa) {
        regAbstosplctqa(CK_EQ, abstosplctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqa The value of abstosplctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplctqa_NotEqual(Long abstosplctqa) {
        doSetAbstosplctqa_NotEqual(abstosplctqa);
    }

    protected void doSetAbstosplctqa_NotEqual(Long abstosplctqa) {
        regAbstosplctqa(CK_NES, abstosplctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqa The value of abstosplctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplctqa_GreaterThan(Long abstosplctqa) {
        regAbstosplctqa(CK_GT, abstosplctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqa The value of abstosplctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplctqa_LessThan(Long abstosplctqa) {
        regAbstosplctqa(CK_LT, abstosplctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqa The value of abstosplctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplctqa_GreaterEqual(Long abstosplctqa) {
        regAbstosplctqa(CK_GE, abstosplctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqa The value of abstosplctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstosplctqa_LessEqual(Long abstosplctqa) {
        regAbstosplctqa(CK_LE, abstosplctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param minNumber The min number of abstosplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of abstosplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAbstosplctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAbstosplctqa(), "ABSTOSPLCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqaList The collection of abstosplctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbstosplctqa_InScope(Collection<Long> abstosplctqaList) {
        doSetAbstosplctqa_InScope(abstosplctqaList);
    }

    protected void doSetAbstosplctqa_InScope(Collection<Long> abstosplctqaList) {
        regINS(CK_INS, cTL(abstosplctqaList), xgetCValueAbstosplctqa(), "ABSTOSPLCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @param abstosplctqaList The collection of abstosplctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbstosplctqa_NotInScope(Collection<Long> abstosplctqaList) {
        doSetAbstosplctqa_NotInScope(abstosplctqaList);
    }

    protected void doSetAbstosplctqa_NotInScope(Collection<Long> abstosplctqaList) {
        regINS(CK_NINS, cTL(abstosplctqaList), xgetCValueAbstosplctqa(), "ABSTOSPLCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     */
    public void setAbstosplctqa_IsNull() { regAbstosplctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     */
    public void setAbstosplctqa_IsNotNull() { regAbstosplctqa(CK_ISNN, DOBJ); }

    protected void regAbstosplctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbstosplctqa(), "ABSTOSPLCTQA"); }
    protected abstract ConditionValue xgetCValueAbstosplctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqa The value of abscbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbscbqa_Equal(Long abscbqa) {
        doSetAbscbqa_Equal(abscbqa);
    }

    protected void doSetAbscbqa_Equal(Long abscbqa) {
        regAbscbqa(CK_EQ, abscbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqa The value of abscbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbscbqa_NotEqual(Long abscbqa) {
        doSetAbscbqa_NotEqual(abscbqa);
    }

    protected void doSetAbscbqa_NotEqual(Long abscbqa) {
        regAbscbqa(CK_NES, abscbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqa The value of abscbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbscbqa_GreaterThan(Long abscbqa) {
        regAbscbqa(CK_GT, abscbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqa The value of abscbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbscbqa_LessThan(Long abscbqa) {
        regAbscbqa(CK_LT, abscbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqa The value of abscbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbscbqa_GreaterEqual(Long abscbqa) {
        regAbscbqa(CK_GE, abscbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqa The value of abscbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbscbqa_LessEqual(Long abscbqa) {
        regAbscbqa(CK_LE, abscbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param minNumber The min number of abscbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of abscbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAbscbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAbscbqa(), "ABSCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqaList The collection of abscbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbscbqa_InScope(Collection<Long> abscbqaList) {
        doSetAbscbqa_InScope(abscbqaList);
    }

    protected void doSetAbscbqa_InScope(Collection<Long> abscbqaList) {
        regINS(CK_INS, cTL(abscbqaList), xgetCValueAbscbqa(), "ABSCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ABSCBQA: {bigint(19)}
     * @param abscbqaList The collection of abscbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbscbqa_NotInScope(Collection<Long> abscbqaList) {
        doSetAbscbqa_NotInScope(abscbqaList);
    }

    protected void doSetAbscbqa_NotInScope(Collection<Long> abscbqaList) {
        regINS(CK_NINS, cTL(abscbqaList), xgetCValueAbscbqa(), "ABSCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     */
    public void setAbscbqa_IsNull() { regAbscbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ABSCBQA: {bigint(19)}
     */
    public void setAbscbqa_IsNotNull() { regAbscbqa(CK_ISNN, DOBJ); }

    protected void regAbscbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbscbqa(), "ABSCBQA"); }
    protected abstract ConditionValue xgetCValueAbscbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqa The value of rescbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescbqa_Equal(Long rescbqa) {
        doSetRescbqa_Equal(rescbqa);
    }

    protected void doSetRescbqa_Equal(Long rescbqa) {
        regRescbqa(CK_EQ, rescbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqa The value of rescbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescbqa_NotEqual(Long rescbqa) {
        doSetRescbqa_NotEqual(rescbqa);
    }

    protected void doSetRescbqa_NotEqual(Long rescbqa) {
        regRescbqa(CK_NES, rescbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqa The value of rescbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescbqa_GreaterThan(Long rescbqa) {
        regRescbqa(CK_GT, rescbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqa The value of rescbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescbqa_LessThan(Long rescbqa) {
        regRescbqa(CK_LT, rescbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqa The value of rescbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescbqa_GreaterEqual(Long rescbqa) {
        regRescbqa(CK_GE, rescbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqa The value of rescbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRescbqa_LessEqual(Long rescbqa) {
        regRescbqa(CK_LE, rescbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param minNumber The min number of rescbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rescbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRescbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRescbqa(), "RESCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqaList The collection of rescbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRescbqa_InScope(Collection<Long> rescbqaList) {
        doSetRescbqa_InScope(rescbqaList);
    }

    protected void doSetRescbqa_InScope(Collection<Long> rescbqaList) {
        regINS(CK_INS, cTL(rescbqaList), xgetCValueRescbqa(), "RESCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESCBQA: {bigint(19)}
     * @param rescbqaList The collection of rescbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRescbqa_NotInScope(Collection<Long> rescbqaList) {
        doSetRescbqa_NotInScope(rescbqaList);
    }

    protected void doSetRescbqa_NotInScope(Collection<Long> rescbqaList) {
        regINS(CK_NINS, cTL(rescbqaList), xgetCValueRescbqa(), "RESCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     */
    public void setRescbqa_IsNull() { regRescbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESCBQA: {bigint(19)}
     */
    public void setRescbqa_IsNotNull() { regRescbqa(CK_ISNN, DOBJ); }

    protected void regRescbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRescbqa(), "RESCBQA"); }
    protected abstract ConditionValue xgetCValueRescbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbn The value of lbkbn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbkbn_Equal(Long lbkbn) {
        doSetLbkbn_Equal(lbkbn);
    }

    protected void doSetLbkbn_Equal(Long lbkbn) {
        regLbkbn(CK_EQ, lbkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbn The value of lbkbn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbkbn_NotEqual(Long lbkbn) {
        doSetLbkbn_NotEqual(lbkbn);
    }

    protected void doSetLbkbn_NotEqual(Long lbkbn) {
        regLbkbn(CK_NES, lbkbn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbn The value of lbkbn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbkbn_GreaterThan(Long lbkbn) {
        regLbkbn(CK_GT, lbkbn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbn The value of lbkbn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbkbn_LessThan(Long lbkbn) {
        regLbkbn(CK_LT, lbkbn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbn The value of lbkbn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbkbn_GreaterEqual(Long lbkbn) {
        regLbkbn(CK_GE, lbkbn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbn The value of lbkbn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbkbn_LessEqual(Long lbkbn) {
        regLbkbn(CK_LE, lbkbn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param minNumber The min number of lbkbn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lbkbn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbkbn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLbkbn(), "LBKBN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbnList The collection of lbkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbkbn_InScope(Collection<Long> lbkbnList) {
        doSetLbkbn_InScope(lbkbnList);
    }

    protected void doSetLbkbn_InScope(Collection<Long> lbkbnList) {
        regINS(CK_INS, cTL(lbkbnList), xgetCValueLbkbn(), "LBKBN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBKBN: {bigint(19)}
     * @param lbkbnList The collection of lbkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbkbn_NotInScope(Collection<Long> lbkbnList) {
        doSetLbkbn_NotInScope(lbkbnList);
    }

    protected void doSetLbkbn_NotInScope(Collection<Long> lbkbnList) {
        regINS(CK_NINS, cTL(lbkbnList), xgetCValueLbkbn(), "LBKBN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     */
    public void setLbkbn_IsNull() { regLbkbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBKBN: {bigint(19)}
     */
    public void setLbkbn_IsNotNull() { regLbkbn(CK_ISNN, DOBJ); }

    protected void regLbkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbkbn(), "LBKBN"); }
    protected abstract ConditionValue xgetCValueLbkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnk The value of prtrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrtrnk_Equal(Long prtrnk) {
        doSetPrtrnk_Equal(prtrnk);
    }

    protected void doSetPrtrnk_Equal(Long prtrnk) {
        regPrtrnk(CK_EQ, prtrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnk The value of prtrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrtrnk_NotEqual(Long prtrnk) {
        doSetPrtrnk_NotEqual(prtrnk);
    }

    protected void doSetPrtrnk_NotEqual(Long prtrnk) {
        regPrtrnk(CK_NES, prtrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnk The value of prtrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrtrnk_GreaterThan(Long prtrnk) {
        regPrtrnk(CK_GT, prtrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnk The value of prtrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrtrnk_LessThan(Long prtrnk) {
        regPrtrnk(CK_LT, prtrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnk The value of prtrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrtrnk_GreaterEqual(Long prtrnk) {
        regPrtrnk(CK_GE, prtrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnk The value of prtrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrtrnk_LessEqual(Long prtrnk) {
        regPrtrnk(CK_LE, prtrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param minNumber The min number of prtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrtrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrtrnk(), "PRTRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnkList The collection of prtrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrtrnk_InScope(Collection<Long> prtrnkList) {
        doSetPrtrnk_InScope(prtrnkList);
    }

    protected void doSetPrtrnk_InScope(Collection<Long> prtrnkList) {
        regINS(CK_INS, cTL(prtrnkList), xgetCValuePrtrnk(), "PRTRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRTRNK: {bigint(19)}
     * @param prtrnkList The collection of prtrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrtrnk_NotInScope(Collection<Long> prtrnkList) {
        doSetPrtrnk_NotInScope(prtrnkList);
    }

    protected void doSetPrtrnk_NotInScope(Collection<Long> prtrnkList) {
        regINS(CK_NINS, cTL(prtrnkList), xgetCValuePrtrnk(), "PRTRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     */
    public void setPrtrnk_IsNull() { regPrtrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRTRNK: {bigint(19)}
     */
    public void setPrtrnk_IsNotNull() { regPrtrnk(CK_ISNN, DOBJ); }

    protected void regPrtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrtrnk(), "PRTRNK"); }
    protected abstract ConditionValue xgetCValuePrtrnk();

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
    public HpSLCFunction<TSplinfoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TSplinfoCB.class);
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
    public HpSLCFunction<TSplinfoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TSplinfoCB.class);
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
    public HpSLCFunction<TSplinfoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TSplinfoCB.class);
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
    public HpSLCFunction<TSplinfoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TSplinfoCB.class);
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
    public HpSLCFunction<TSplinfoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TSplinfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TSplinfoCB&gt;() {
     *     public void query(TSplinfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TSplinfoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TSplinfoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TSplinfoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TSplinfoCQ sq);

    protected TSplinfoCB xcreateScalarConditionCB() {
        TSplinfoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TSplinfoCB xcreateScalarConditionPartitionByCB() {
        TSplinfoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TSplinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SPLINFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TSplinfoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TSplinfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TSplinfoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SPLINFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TSplinfoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TSplinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TSplinfoCQ sq);

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
    protected TSplinfoCB newMyCB() {
        return new TSplinfoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TSplinfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

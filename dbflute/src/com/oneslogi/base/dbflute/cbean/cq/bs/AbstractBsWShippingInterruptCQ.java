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
 * The abstract condition-query of W_SHIPPING_INTERRUPT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWShippingInterruptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWShippingInterruptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_SHIPPING_INTERRUPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_Equal(Long shippingInstHId) {
        doSetShippingInstHId_Equal(shippingInstHId);
    }

    protected void doSetShippingInstHId_Equal(Long shippingInstHId) {
        regShippingInstHId(CK_EQ, shippingInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotEqual(Long shippingInstHId) {
        doSetShippingInstHId_NotEqual(shippingInstHId);
    }

    protected void doSetShippingInstHId_NotEqual(Long shippingInstHId) {
        regShippingInstHId(CK_NES, shippingInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_InScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_INS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInstHId_IsNull() { regShippingInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInstHId_IsNotNull() { regShippingInstHId(CK_ISNN, DOBJ); }

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHId The value of allocInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_Equal(Long allocInstHId) {
        doSetAllocInstHId_Equal(allocInstHId);
    }

    protected void doSetAllocInstHId_Equal(Long allocInstHId) {
        regAllocInstHId(CK_EQ, allocInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHId The value of allocInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotEqual(Long allocInstHId) {
        doSetAllocInstHId_NotEqual(allocInstHId);
    }

    protected void doSetAllocInstHId_NotEqual(Long allocInstHId) {
        regAllocInstHId(CK_NES, allocInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHIdList The collection of allocInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_InScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        regINS(CK_INS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

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
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_Equal(String userCd) {
        doSetUserCd_Equal(fRES(userCd));
    }

    protected void doSetUserCd_Equal(String userCd) {
        regUserCd(CK_EQ, userCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotEqual(String userCd) {
        doSetUserCd_NotEqual(fRES(userCd));
    }

    protected void doSetUserCd_NotEqual(String userCd) {
        regUserCd(CK_NES, userCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterThan(String userCd) {
        regUserCd(CK_GT, fRES(userCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessThan(String userCd) {
        regUserCd(CK_LT, fRES(userCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterEqual(String userCd) {
        regUserCd(CK_GE, fRES(userCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessEqual(String userCd) {
        regUserCd(CK_LE, fRES(userCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCdList The collection of userCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_InScope(Collection<String> userCdList) {
        doSetUserCd_InScope(userCdList);
    }

    protected void doSetUserCd_InScope(Collection<String> userCdList) {
        regINS(CK_INS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCdList The collection of userCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotInScope(Collection<String> userCdList) {
        doSetUserCd_NotInScope(userCdList);
    }

    protected void doSetUserCd_NotInScope(Collection<String> userCdList) {
        regINS(CK_NINS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userCd The value of userCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserCd_LikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserCd_NotLikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, varchar(30)}
     * @param userCd The value of userCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_PrefixSearch(String userCd) {
        setUserCd_LikeSearch(userCd, xcLSOPPre());
    }

    protected void regUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserCd(), "USER_CD"); }
    protected abstract ConditionValue xgetCValueUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_Equal(String pickingWorkNo) {
        doSetPickingWorkNo_Equal(fRES(pickingWorkNo));
    }

    protected void doSetPickingWorkNo_Equal(String pickingWorkNo) {
        regPickingWorkNo(CK_EQ, pickingWorkNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_NotEqual(String pickingWorkNo) {
        doSetPickingWorkNo_NotEqual(fRES(pickingWorkNo));
    }

    protected void doSetPickingWorkNo_NotEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_NES, pickingWorkNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_GreaterThan(String pickingWorkNo) {
        regPickingWorkNo(CK_GT, fRES(pickingWorkNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_LessThan(String pickingWorkNo) {
        regPickingWorkNo(CK_LT, fRES(pickingWorkNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_GreaterEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_GE, fRES(pickingWorkNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_LessEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_LE, fRES(pickingWorkNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNoList The collection of pickingWorkNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_InScope(Collection<String> pickingWorkNoList) {
        doSetPickingWorkNo_InScope(pickingWorkNoList);
    }

    protected void doSetPickingWorkNo_InScope(Collection<String> pickingWorkNoList) {
        regINS(CK_INS, cTL(pickingWorkNoList), xgetCValuePickingWorkNo(), "PICKING_WORK_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNoList The collection of pickingWorkNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_NotInScope(Collection<String> pickingWorkNoList) {
        doSetPickingWorkNo_NotInScope(pickingWorkNoList);
    }

    protected void doSetPickingWorkNo_NotInScope(Collection<String> pickingWorkNoList) {
        regINS(CK_NINS, cTL(pickingWorkNoList), xgetCValuePickingWorkNo(), "PICKING_WORK_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPickingWorkNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingWorkNo The value of pickingWorkNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingWorkNo_LikeSearch(String pickingWorkNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingWorkNo), xgetCValuePickingWorkNo(), "PICKING_WORK_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingWorkNo_NotLikeSearch(String pickingWorkNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingWorkNo), xgetCValuePickingWorkNo(), "PICKING_WORK_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @param pickingWorkNo The value of pickingWorkNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_PrefixSearch(String pickingWorkNo) {
        setPickingWorkNo_LikeSearch(pickingWorkNo, xcLSOPPre());
    }

    protected void regPickingWorkNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingWorkNo(), "PICKING_WORK_NO"); }
    protected abstract ConditionValue xgetCValuePickingWorkNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNum The value of instNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_Equal(java.math.BigDecimal instNum) {
        doSetInstNum_Equal(instNum);
    }

    protected void doSetInstNum_Equal(java.math.BigDecimal instNum) {
        regInstNum(CK_EQ, instNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNum The value of instNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_NotEqual(java.math.BigDecimal instNum) {
        doSetInstNum_NotEqual(instNum);
    }

    protected void doSetInstNum_NotEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_NES, instNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNum The value of instNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterThan(java.math.BigDecimal instNum) {
        regInstNum(CK_GT, instNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNum The value of instNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessThan(java.math.BigDecimal instNum) {
        regInstNum(CK_LT, instNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNum The value of instNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_GE, instNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNum The value of instNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_LE, instNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstNum(), "INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNumList The collection of instNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_InScope(instNumList);
    }

    protected void doSetInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_INS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @param instNumList The collection of instNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_NotInScope(instNumList);
    }

    protected void doSetInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_NINS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    protected void regInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstNum(), "INST_NUM"); }
    protected abstract ConditionValue xgetCValueInstNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOns The value of spgQtyOns as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_Equal(java.math.BigDecimal spgQtyOns) {
        doSetSpgQtyOns_Equal(spgQtyOns);
    }

    protected void doSetSpgQtyOns_Equal(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_EQ, spgQtyOns);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOns The value of spgQtyOns as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_NotEqual(java.math.BigDecimal spgQtyOns) {
        doSetSpgQtyOns_NotEqual(spgQtyOns);
    }

    protected void doSetSpgQtyOns_NotEqual(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_NES, spgQtyOns);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOns The value of spgQtyOns as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_GreaterThan(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_GT, spgQtyOns);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOns The value of spgQtyOns as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_LessThan(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_LT, spgQtyOns);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOns The value of spgQtyOns as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_GreaterEqual(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_GE, spgQtyOns);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOns The value of spgQtyOns as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_LessEqual(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_LE, spgQtyOns);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param minNumber The min number of spgQtyOns. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spgQtyOns. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpgQtyOns_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpgQtyOns(), "SPG_QTY_ONS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOnsList The collection of spgQtyOns as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyOns_InScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        doSetSpgQtyOns_InScope(spgQtyOnsList);
    }

    protected void doSetSpgQtyOns_InScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        regINS(CK_INS, cTL(spgQtyOnsList), xgetCValueSpgQtyOns(), "SPG_QTY_ONS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @param spgQtyOnsList The collection of spgQtyOns as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyOns_NotInScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        doSetSpgQtyOns_NotInScope(spgQtyOnsList);
    }

    protected void doSetSpgQtyOns_NotInScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        regINS(CK_NINS, cTL(spgQtyOnsList), xgetCValueSpgQtyOns(), "SPG_QTY_ONS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     */
    public void setSpgQtyOns_IsNull() { regSpgQtyOns(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {decimal(16, 6)}
     */
    public void setSpgQtyOns_IsNotNull() { regSpgQtyOns(CK_ISNN, DOBJ); }

    protected void regSpgQtyOns(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpgQtyOns(), "SPG_QTY_ONS"); }
    protected abstract ConditionValue xgetCValueSpgQtyOns();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemain The value of spgQtyRemain as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_Equal(java.math.BigDecimal spgQtyRemain) {
        doSetSpgQtyRemain_Equal(spgQtyRemain);
    }

    protected void doSetSpgQtyRemain_Equal(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_EQ, spgQtyRemain);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemain The value of spgQtyRemain as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_NotEqual(java.math.BigDecimal spgQtyRemain) {
        doSetSpgQtyRemain_NotEqual(spgQtyRemain);
    }

    protected void doSetSpgQtyRemain_NotEqual(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_NES, spgQtyRemain);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemain The value of spgQtyRemain as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_GreaterThan(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_GT, spgQtyRemain);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemain The value of spgQtyRemain as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_LessThan(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_LT, spgQtyRemain);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemain The value of spgQtyRemain as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_GreaterEqual(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_GE, spgQtyRemain);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemain The value of spgQtyRemain as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_LessEqual(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_LE, spgQtyRemain);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param minNumber The min number of spgQtyRemain. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spgQtyRemain. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpgQtyRemain_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemainList The collection of spgQtyRemain as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_InScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        doSetSpgQtyRemain_InScope(spgQtyRemainList);
    }

    protected void doSetSpgQtyRemain_InScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        regINS(CK_INS, cTL(spgQtyRemainList), xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @param spgQtyRemainList The collection of spgQtyRemain as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_NotInScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        doSetSpgQtyRemain_NotInScope(spgQtyRemainList);
    }

    protected void doSetSpgQtyRemain_NotInScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        regINS(CK_NINS, cTL(spgQtyRemainList), xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     */
    public void setSpgQtyRemain_IsNull() { regSpgQtyRemain(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     */
    public void setSpgQtyRemain_IsNotNull() { regSpgQtyRemain(CK_ISNN, DOBJ); }

    protected void regSpgQtyRemain(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN"); }
    protected abstract ConditionValue xgetCValueSpgQtyRemain();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNo The value of pieceNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_Equal(Long pieceNo) {
        doSetPieceNo_Equal(pieceNo);
    }

    protected void doSetPieceNo_Equal(Long pieceNo) {
        regPieceNo(CK_EQ, pieceNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNo The value of pieceNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_NotEqual(Long pieceNo) {
        doSetPieceNo_NotEqual(pieceNo);
    }

    protected void doSetPieceNo_NotEqual(Long pieceNo) {
        regPieceNo(CK_NES, pieceNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNo The value of pieceNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_GreaterThan(Long pieceNo) {
        regPieceNo(CK_GT, pieceNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNo The value of pieceNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_LessThan(Long pieceNo) {
        regPieceNo(CK_LT, pieceNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNo The value of pieceNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_GreaterEqual(Long pieceNo) {
        regPieceNo(CK_GE, pieceNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNo The value of pieceNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_LessEqual(Long pieceNo) {
        regPieceNo(CK_LE, pieceNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param minNumber The min number of pieceNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pieceNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPieceNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePieceNo(), "PIECE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNoList The collection of pieceNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPieceNo_InScope(Collection<Long> pieceNoList) {
        doSetPieceNo_InScope(pieceNoList);
    }

    protected void doSetPieceNo_InScope(Collection<Long> pieceNoList) {
        regINS(CK_INS, cTL(pieceNoList), xgetCValuePieceNo(), "PIECE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIECE_NO: {bigint(19)}
     * @param pieceNoList The collection of pieceNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPieceNo_NotInScope(Collection<Long> pieceNoList) {
        doSetPieceNo_NotInScope(pieceNoList);
    }

    protected void doSetPieceNo_NotInScope(Collection<Long> pieceNoList) {
        regINS(CK_NINS, cTL(pieceNoList), xgetCValuePieceNo(), "PIECE_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     */
    public void setPieceNo_IsNull() { regPieceNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIECE_NO: {bigint(19)}
     */
    public void setPieceNo_IsNotNull() { regPieceNo(CK_ISNN, DOBJ); }

    protected void regPieceNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePieceNo(), "PIECE_NO"); }
    protected abstract ConditionValue xgetCValuePieceNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_Equal(Long boxId) {
        doSetBoxId_Equal(boxId);
    }

    protected void doSetBoxId_Equal(Long boxId) {
        regBoxId(CK_EQ, boxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_NotEqual(Long boxId) {
        doSetBoxId_NotEqual(boxId);
    }

    protected void doSetBoxId_NotEqual(Long boxId) {
        regBoxId(CK_NES, boxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxIdList The collection of boxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_InScope(Collection<Long> boxIdList) {
        doSetBoxId_InScope(boxIdList);
    }

    protected void doSetBoxId_InScope(Collection<Long> boxIdList) {
        regINS(CK_INS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxIdList The collection of boxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_NotInScope(Collection<Long> boxIdList) {
        doSetBoxId_NotInScope(boxIdList);
    }

    protected void doSetBoxId_NotInScope(Collection<Long> boxIdList) {
        regINS(CK_NINS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'in-scope'. (NotNull)
     */
    public void inScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_InScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", false);
    }
    public abstract String keepBoxId_InScopeRelation_MBox(MBoxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_NotInScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", true);
    }
    public abstract String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setBoxId_IsNull() { regBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setBoxId_IsNotNull() { regBoxId(CK_ISNN, DOBJ); }

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

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
    public HpSLCFunction<WShippingInterruptCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WShippingInterruptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WShippingInterruptCB&gt;() {
     *     public void query(WShippingInterruptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WShippingInterruptCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WShippingInterruptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WShippingInterruptCQ sq);

    protected WShippingInterruptCB xcreateScalarConditionCB() {
        WShippingInterruptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WShippingInterruptCB xcreateScalarConditionPartitionByCB() {
        WShippingInterruptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WShippingInterruptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WShippingInterruptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WShippingInterruptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WShippingInterruptCQ sq);

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
    protected WShippingInterruptCB newMyCB() {
        return new WShippingInterruptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WShippingInterruptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

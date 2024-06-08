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
 * The abstract condition-query of M_PARAM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMParamCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMParamCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_PARAM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
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
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
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
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param clientCenterId The value of clientCenterId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_GreaterThan(Long clientCenterId) {
        regClientCenterId(CK_GT, clientCenterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param clientCenterId The value of clientCenterId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_LessThan(Long clientCenterId) {
        regClientCenterId(CK_LT, clientCenterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param clientCenterId The value of clientCenterId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_GreaterEqual(Long clientCenterId) {
        regClientCenterId(CK_GE, clientCenterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param clientCenterId The value of clientCenterId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientCenterId_LessEqual(Long clientCenterId) {
        regClientCenterId(CK_LE, clientCenterId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param minNumber The min number of clientCenterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientCenterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientCenterId(), "CLIENT_CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
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
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param clientCenterIdList The collection of clientCenterId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCenterId_NotInScope(Collection<Long> clientCenterIdList) {
        doSetClientCenterId_NotInScope(clientCenterIdList);
    }

    protected void doSetClientCenterId_NotInScope(Collection<Long> clientCenterIdList) {
        regINS(CK_NINS, cTL(clientCenterIdList), xgetCValueClientCenterId(), "CLIENT_CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_CENTER_ID from M_CLIENT_CENTER where ...)} <br />
     * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * @param subCBLambda The callback for sub-query of MClientCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMClientCenter(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientCenterId_InScopeRelation_MClientCenter(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_CENTER_ID", "CLIENT_CENTER_ID", pp, "mClientCenter", false);
    }
    public abstract String keepClientCenterId_InScopeRelation_MClientCenter(MClientCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_CENTER_ID from M_CLIENT_CENTER where ...)} <br />
     * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * @param subCBLambda The callback for sub-query of MClientCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClientCenter(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientCenterId_NotInScopeRelation_MClientCenter(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_CENTER_ID", "CLIENT_CENTER_ID", pp, "mClientCenter", true);
    }
    public abstract String keepClientCenterId_NotInScopeRelation_MClientCenter(MClientCenterCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     */
    public void setClientCenterId_IsNull() { regClientCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     */
    public void setClientCenterId_IsNotNull() { regClientCenterId(CK_ISNN, DOBJ); }

    protected void regClientCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCenterId(), "CLIENT_CENTER_ID"); }
    protected abstract ConditionValue xgetCValueClientCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseId The value of deliveryCourseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_Equal(Long deliveryCourseId) {
        doSetDeliveryCourseId_Equal(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_Equal(Long deliveryCourseId) {
        regDeliveryCourseId(CK_EQ, deliveryCourseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseId The value of deliveryCourseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        doSetDeliveryCourseId_NotEqual(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_NES, deliveryCourseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseId The value of deliveryCourseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GT, deliveryCourseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseId The value of deliveryCourseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LT, deliveryCourseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseId The value of deliveryCourseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GE, deliveryCourseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseId The value of deliveryCourseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LE, deliveryCourseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param minNumber The min number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryCourseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseIdList The collection of deliveryCourseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_InScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_INS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @param deliveryCourseIdList The collection of deliveryCourseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_NotInScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_NINS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIVERY_COURSE_ID from M_DELIVERY_COURSE where ...)} <br />
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param subCBLambda The callback for sub-query of MDeliveryCourse for 'in-scope'. (NotNull)
     */
    public void inScopeMDeliveryCourse(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(cb.query());
        registerInScopeRelation(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mDeliveryCourse", false);
    }
    public abstract String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIVERY_COURSE_ID from M_DELIVERY_COURSE where ...)} <br />
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param subCBLambda The callback for sub-query of MDeliveryCourse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMDeliveryCourse(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(cb.query());
        registerInScopeRelation(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mDeliveryCourse", true);
    }
    public abstract String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     */
    public void setDeliveryCourseId_IsNull() { regDeliveryCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     */
    public void setDeliveryCourseId_IsNotNull() { regDeliveryCourseId(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @param storeDtFlg The value of storeDtFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDtFlg_Equal(String storeDtFlg) {
        doSetStoreDtFlg_Equal(fRES(storeDtFlg));
    }

    /**
     * Equal(=). As StoreDtFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreDtFlg_Equal_AsStoreDtFlg(CDef.StoreDtFlg cdef) {
        doSetStoreDtFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setStoreDtFlg_Equal_$0() {
        setStoreDtFlg_Equal_AsStoreDtFlg(CDef.StoreDtFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setStoreDtFlg_Equal_$1() {
        setStoreDtFlg_Equal_AsStoreDtFlg(CDef.StoreDtFlg.$1);
    }

    protected void doSetStoreDtFlg_Equal(String storeDtFlg) {
        regStoreDtFlg(CK_EQ, storeDtFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @param storeDtFlg The value of storeDtFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDtFlg_NotEqual(String storeDtFlg) {
        doSetStoreDtFlg_NotEqual(fRES(storeDtFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StoreDtFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreDtFlg_NotEqual_AsStoreDtFlg(CDef.StoreDtFlg cdef) {
        doSetStoreDtFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setStoreDtFlg_NotEqual_$0() {
        setStoreDtFlg_NotEqual_AsStoreDtFlg(CDef.StoreDtFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setStoreDtFlg_NotEqual_$1() {
        setStoreDtFlg_NotEqual_AsStoreDtFlg(CDef.StoreDtFlg.$1);
    }

    protected void doSetStoreDtFlg_NotEqual(String storeDtFlg) {
        regStoreDtFlg(CK_NES, storeDtFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @param storeDtFlgList The collection of storeDtFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDtFlg_InScope(Collection<String> storeDtFlgList) {
        doSetStoreDtFlg_InScope(storeDtFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StoreDtFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDtFlg_InScope_AsStoreDtFlg(Collection<CDef.StoreDtFlg> cdefList) {
        doSetStoreDtFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStoreDtFlg_InScope(Collection<String> storeDtFlgList) {
        regINS(CK_INS, cTL(storeDtFlgList), xgetCValueStoreDtFlg(), "STORE_DT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @param storeDtFlgList The collection of storeDtFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDtFlg_NotInScope(Collection<String> storeDtFlgList) {
        doSetStoreDtFlg_NotInScope(storeDtFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StoreDtFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDtFlg_NotInScope_AsStoreDtFlg(Collection<CDef.StoreDtFlg> cdefList) {
        doSetStoreDtFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStoreDtFlg_NotInScope(Collection<String> storeDtFlgList) {
        regINS(CK_NINS, cTL(storeDtFlgList), xgetCValueStoreDtFlg(), "STORE_DT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     */
    public void setStoreDtFlg_IsNull() { regStoreDtFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     */
    public void setStoreDtFlg_IsNotNull() { regStoreDtFlg(CK_ISNN, DOBJ); }

    protected void regStoreDtFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDtFlg(), "STORE_DT_FLG"); }
    protected abstract ConditionValue xgetCValueStoreDtFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @param storeNoFlg The value of storeNoFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoFlg_Equal(String storeNoFlg) {
        doSetStoreNoFlg_Equal(fRES(storeNoFlg));
    }

    /**
     * Equal(=). As StoreNoFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoFlg_Equal_AsStoreNoFlg(CDef.StoreNoFlg cdef) {
        doSetStoreNoFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setStoreNoFlg_Equal_$0() {
        setStoreNoFlg_Equal_AsStoreNoFlg(CDef.StoreNoFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setStoreNoFlg_Equal_$1() {
        setStoreNoFlg_Equal_AsStoreNoFlg(CDef.StoreNoFlg.$1);
    }

    protected void doSetStoreNoFlg_Equal(String storeNoFlg) {
        regStoreNoFlg(CK_EQ, storeNoFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @param storeNoFlg The value of storeNoFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoFlg_NotEqual(String storeNoFlg) {
        doSetStoreNoFlg_NotEqual(fRES(storeNoFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StoreNoFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoFlg_NotEqual_AsStoreNoFlg(CDef.StoreNoFlg cdef) {
        doSetStoreNoFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setStoreNoFlg_NotEqual_$0() {
        setStoreNoFlg_NotEqual_AsStoreNoFlg(CDef.StoreNoFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setStoreNoFlg_NotEqual_$1() {
        setStoreNoFlg_NotEqual_AsStoreNoFlg(CDef.StoreNoFlg.$1);
    }

    protected void doSetStoreNoFlg_NotEqual(String storeNoFlg) {
        regStoreNoFlg(CK_NES, storeNoFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @param storeNoFlgList The collection of storeNoFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoFlg_InScope(Collection<String> storeNoFlgList) {
        doSetStoreNoFlg_InScope(storeNoFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StoreNoFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoFlg_InScope_AsStoreNoFlg(Collection<CDef.StoreNoFlg> cdefList) {
        doSetStoreNoFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStoreNoFlg_InScope(Collection<String> storeNoFlgList) {
        regINS(CK_INS, cTL(storeNoFlgList), xgetCValueStoreNoFlg(), "STORE_NO_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @param storeNoFlgList The collection of storeNoFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoFlg_NotInScope(Collection<String> storeNoFlgList) {
        doSetStoreNoFlg_NotInScope(storeNoFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StoreNoFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoFlg_NotInScope_AsStoreNoFlg(Collection<CDef.StoreNoFlg> cdefList) {
        doSetStoreNoFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStoreNoFlg_NotInScope(Collection<String> storeNoFlgList) {
        regINS(CK_NINS, cTL(storeNoFlgList), xgetCValueStoreNoFlg(), "STORE_NO_FLG");
    }

    protected void regStoreNoFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNoFlg(), "STORE_NO_FLG"); }
    protected abstract ConditionValue xgetCValueStoreNoFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeCls The value of mergeCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_Equal(String mergeCls) {
        doSetMergeCls_Equal(fRES(mergeCls));
    }

    /**
     * Equal(=). As MergeCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCls_Equal_AsMergeCls(CDef.MergeCls cdef) {
        doSetMergeCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: マージしない
     */
    public void setMergeCls_Equal_$00() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_Equal_$01() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 自動マージ
     */
    public void setMergeCls_Equal_$02() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$02);
    }

    protected void doSetMergeCls_Equal(String mergeCls) {
        regMergeCls(CK_EQ, mergeCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeCls The value of mergeCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotEqual(String mergeCls) {
        doSetMergeCls_NotEqual(fRES(mergeCls));
    }

    /**
     * NotEqual(&lt;&gt;). As MergeCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls cdef) {
        doSetMergeCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: マージしない
     */
    public void setMergeCls_NotEqual_$00() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_NotEqual_$01() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 自動マージ
     */
    public void setMergeCls_NotEqual_$02() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$02);
    }

    protected void doSetMergeCls_NotEqual(String mergeCls) {
        regMergeCls(CK_NES, mergeCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeClsList The collection of mergeCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_InScope(Collection<String> mergeClsList) {
        doSetMergeCls_InScope(mergeClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As MergeCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_InScope_AsMergeCls(Collection<CDef.MergeCls> cdefList) {
        doSetMergeCls_InScope(cTStrL(cdefList));
    }

    protected void doSetMergeCls_InScope(Collection<String> mergeClsList) {
        regINS(CK_INS, cTL(mergeClsList), xgetCValueMergeCls(), "MERGE_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeClsList The collection of mergeCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotInScope(Collection<String> mergeClsList) {
        doSetMergeCls_NotInScope(mergeClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MergeCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotInScope_AsMergeCls(Collection<CDef.MergeCls> cdefList) {
        doSetMergeCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMergeCls_NotInScope(Collection<String> mergeClsList) {
        regINS(CK_NINS, cTL(mergeClsList), xgetCValueMergeCls(), "MERGE_CLS");
    }

    protected void regMergeCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeCls(), "MERGE_CLS"); }
    protected abstract ConditionValue xgetCValueMergeCls();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDays The value of tKeepingDays as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTKeepingDays_Equal(Long tKeepingDays) {
        doSetTKeepingDays_Equal(tKeepingDays);
    }

    protected void doSetTKeepingDays_Equal(Long tKeepingDays) {
        regTKeepingDays(CK_EQ, tKeepingDays);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDays The value of tKeepingDays as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTKeepingDays_NotEqual(Long tKeepingDays) {
        doSetTKeepingDays_NotEqual(tKeepingDays);
    }

    protected void doSetTKeepingDays_NotEqual(Long tKeepingDays) {
        regTKeepingDays(CK_NES, tKeepingDays);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDays The value of tKeepingDays as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTKeepingDays_GreaterThan(Long tKeepingDays) {
        regTKeepingDays(CK_GT, tKeepingDays);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDays The value of tKeepingDays as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTKeepingDays_LessThan(Long tKeepingDays) {
        regTKeepingDays(CK_LT, tKeepingDays);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDays The value of tKeepingDays as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTKeepingDays_GreaterEqual(Long tKeepingDays) {
        regTKeepingDays(CK_GE, tKeepingDays);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDays The value of tKeepingDays as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTKeepingDays_LessEqual(Long tKeepingDays) {
        regTKeepingDays(CK_LE, tKeepingDays);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of tKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTKeepingDays_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTKeepingDays(), "T_KEEPING_DAYS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDaysList The collection of tKeepingDays as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTKeepingDays_InScope(Collection<Long> tKeepingDaysList) {
        doSetTKeepingDays_InScope(tKeepingDaysList);
    }

    protected void doSetTKeepingDays_InScope(Collection<Long> tKeepingDaysList) {
        regINS(CK_INS, cTL(tKeepingDaysList), xgetCValueTKeepingDays(), "T_KEEPING_DAYS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param tKeepingDaysList The collection of tKeepingDays as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTKeepingDays_NotInScope(Collection<Long> tKeepingDaysList) {
        doSetTKeepingDays_NotInScope(tKeepingDaysList);
    }

    protected void doSetTKeepingDays_NotInScope(Collection<Long> tKeepingDaysList) {
        regINS(CK_NINS, cTL(tKeepingDaysList), xgetCValueTKeepingDays(), "T_KEEPING_DAYS");
    }

    protected void regTKeepingDays(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTKeepingDays(), "T_KEEPING_DAYS"); }
    protected abstract ConditionValue xgetCValueTKeepingDays();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDays The value of hKeepingDays as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHKeepingDays_Equal(Long hKeepingDays) {
        doSetHKeepingDays_Equal(hKeepingDays);
    }

    protected void doSetHKeepingDays_Equal(Long hKeepingDays) {
        regHKeepingDays(CK_EQ, hKeepingDays);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDays The value of hKeepingDays as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHKeepingDays_NotEqual(Long hKeepingDays) {
        doSetHKeepingDays_NotEqual(hKeepingDays);
    }

    protected void doSetHKeepingDays_NotEqual(Long hKeepingDays) {
        regHKeepingDays(CK_NES, hKeepingDays);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDays The value of hKeepingDays as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHKeepingDays_GreaterThan(Long hKeepingDays) {
        regHKeepingDays(CK_GT, hKeepingDays);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDays The value of hKeepingDays as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHKeepingDays_LessThan(Long hKeepingDays) {
        regHKeepingDays(CK_LT, hKeepingDays);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDays The value of hKeepingDays as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHKeepingDays_GreaterEqual(Long hKeepingDays) {
        regHKeepingDays(CK_GE, hKeepingDays);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDays The value of hKeepingDays as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHKeepingDays_LessEqual(Long hKeepingDays) {
        regHKeepingDays(CK_LE, hKeepingDays);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of hKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHKeepingDays_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHKeepingDays(), "H_KEEPING_DAYS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDaysList The collection of hKeepingDays as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHKeepingDays_InScope(Collection<Long> hKeepingDaysList) {
        doSetHKeepingDays_InScope(hKeepingDaysList);
    }

    protected void doSetHKeepingDays_InScope(Collection<Long> hKeepingDaysList) {
        regINS(CK_INS, cTL(hKeepingDaysList), xgetCValueHKeepingDays(), "H_KEEPING_DAYS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param hKeepingDaysList The collection of hKeepingDays as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHKeepingDays_NotInScope(Collection<Long> hKeepingDaysList) {
        doSetHKeepingDays_NotInScope(hKeepingDaysList);
    }

    protected void doSetHKeepingDays_NotInScope(Collection<Long> hKeepingDaysList) {
        regINS(CK_NINS, cTL(hKeepingDaysList), xgetCValueHKeepingDays(), "H_KEEPING_DAYS");
    }

    protected void regHKeepingDays(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHKeepingDays(), "H_KEEPING_DAYS"); }
    protected abstract ConditionValue xgetCValueHKeepingDays();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDays The value of dKeepingDays as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDKeepingDays_Equal(Long dKeepingDays) {
        doSetDKeepingDays_Equal(dKeepingDays);
    }

    protected void doSetDKeepingDays_Equal(Long dKeepingDays) {
        regDKeepingDays(CK_EQ, dKeepingDays);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDays The value of dKeepingDays as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDKeepingDays_NotEqual(Long dKeepingDays) {
        doSetDKeepingDays_NotEqual(dKeepingDays);
    }

    protected void doSetDKeepingDays_NotEqual(Long dKeepingDays) {
        regDKeepingDays(CK_NES, dKeepingDays);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDays The value of dKeepingDays as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDKeepingDays_GreaterThan(Long dKeepingDays) {
        regDKeepingDays(CK_GT, dKeepingDays);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDays The value of dKeepingDays as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDKeepingDays_LessThan(Long dKeepingDays) {
        regDKeepingDays(CK_LT, dKeepingDays);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDays The value of dKeepingDays as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDKeepingDays_GreaterEqual(Long dKeepingDays) {
        regDKeepingDays(CK_GE, dKeepingDays);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDays The value of dKeepingDays as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDKeepingDays_LessEqual(Long dKeepingDays) {
        regDKeepingDays(CK_LE, dKeepingDays);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of dKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDKeepingDays_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDKeepingDays(), "D_KEEPING_DAYS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDaysList The collection of dKeepingDays as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDKeepingDays_InScope(Collection<Long> dKeepingDaysList) {
        doSetDKeepingDays_InScope(dKeepingDaysList);
    }

    protected void doSetDKeepingDays_InScope(Collection<Long> dKeepingDaysList) {
        regINS(CK_INS, cTL(dKeepingDaysList), xgetCValueDKeepingDays(), "D_KEEPING_DAYS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @param dKeepingDaysList The collection of dKeepingDays as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDKeepingDays_NotInScope(Collection<Long> dKeepingDaysList) {
        doSetDKeepingDays_NotInScope(dKeepingDaysList);
    }

    protected void doSetDKeepingDays_NotInScope(Collection<Long> dKeepingDaysList) {
        regINS(CK_NINS, cTL(dKeepingDaysList), xgetCValueDKeepingDays(), "D_KEEPING_DAYS");
    }

    protected void regDKeepingDays(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDKeepingDays(), "D_KEEPING_DAYS"); }
    protected abstract ConditionValue xgetCValueDKeepingDays();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @param overStoreNumFlg The value of overStoreNumFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_Equal(String overStoreNumFlg) {
        doSetOverStoreNumFlg_Equal(fRES(overStoreNumFlg));
    }

    /**
     * Equal(=). As OverStoreNumFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_Equal_AsOverStoreNumFlg(CDef.OverStoreNumFlg cdef) {
        doSetOverStoreNumFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不可
     */
    public void setOverStoreNumFlg_Equal_$0() {
        setOverStoreNumFlg_Equal_AsOverStoreNumFlg(CDef.OverStoreNumFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可能
     */
    public void setOverStoreNumFlg_Equal_$1() {
        setOverStoreNumFlg_Equal_AsOverStoreNumFlg(CDef.OverStoreNumFlg.$1);
    }

    protected void doSetOverStoreNumFlg_Equal(String overStoreNumFlg) {
        regOverStoreNumFlg(CK_EQ, overStoreNumFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @param overStoreNumFlg The value of overStoreNumFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_NotEqual(String overStoreNumFlg) {
        doSetOverStoreNumFlg_NotEqual(fRES(overStoreNumFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As OverStoreNumFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_NotEqual_AsOverStoreNumFlg(CDef.OverStoreNumFlg cdef) {
        doSetOverStoreNumFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不可
     */
    public void setOverStoreNumFlg_NotEqual_$0() {
        setOverStoreNumFlg_NotEqual_AsOverStoreNumFlg(CDef.OverStoreNumFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可能
     */
    public void setOverStoreNumFlg_NotEqual_$1() {
        setOverStoreNumFlg_NotEqual_AsOverStoreNumFlg(CDef.OverStoreNumFlg.$1);
    }

    protected void doSetOverStoreNumFlg_NotEqual(String overStoreNumFlg) {
        regOverStoreNumFlg(CK_NES, overStoreNumFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @param overStoreNumFlgList The collection of overStoreNumFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_InScope(Collection<String> overStoreNumFlgList) {
        doSetOverStoreNumFlg_InScope(overStoreNumFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As OverStoreNumFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_InScope_AsOverStoreNumFlg(Collection<CDef.OverStoreNumFlg> cdefList) {
        doSetOverStoreNumFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetOverStoreNumFlg_InScope(Collection<String> overStoreNumFlgList) {
        regINS(CK_INS, cTL(overStoreNumFlgList), xgetCValueOverStoreNumFlg(), "OVER_STORE_NUM_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @param overStoreNumFlgList The collection of overStoreNumFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_NotInScope(Collection<String> overStoreNumFlgList) {
        doSetOverStoreNumFlg_NotInScope(overStoreNumFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As OverStoreNumFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverStoreNumFlg_NotInScope_AsOverStoreNumFlg(Collection<CDef.OverStoreNumFlg> cdefList) {
        doSetOverStoreNumFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOverStoreNumFlg_NotInScope(Collection<String> overStoreNumFlgList) {
        regINS(CK_NINS, cTL(overStoreNumFlgList), xgetCValueOverStoreNumFlg(), "OVER_STORE_NUM_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     */
    public void setOverStoreNumFlg_IsNull() { regOverStoreNumFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     */
    public void setOverStoreNumFlg_IsNotNull() { regOverStoreNumFlg(CK_ISNN, DOBJ); }

    protected void regOverStoreNumFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOverStoreNumFlg(), "OVER_STORE_NUM_FLG"); }
    protected abstract ConditionValue xgetCValueOverStoreNumFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @param pastStoreDtFlg The value of pastStoreDtFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_Equal(String pastStoreDtFlg) {
        doSetPastStoreDtFlg_Equal(fRES(pastStoreDtFlg));
    }

    /**
     * Equal(=). As PastStoreDtFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_Equal_AsPastStoreDtFlg(CDef.PastStoreDtFlg cdef) {
        doSetPastStoreDtFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不可
     */
    public void setPastStoreDtFlg_Equal_$0() {
        setPastStoreDtFlg_Equal_AsPastStoreDtFlg(CDef.PastStoreDtFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可能
     */
    public void setPastStoreDtFlg_Equal_$1() {
        setPastStoreDtFlg_Equal_AsPastStoreDtFlg(CDef.PastStoreDtFlg.$1);
    }

    protected void doSetPastStoreDtFlg_Equal(String pastStoreDtFlg) {
        regPastStoreDtFlg(CK_EQ, pastStoreDtFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @param pastStoreDtFlg The value of pastStoreDtFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_NotEqual(String pastStoreDtFlg) {
        doSetPastStoreDtFlg_NotEqual(fRES(pastStoreDtFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PastStoreDtFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_NotEqual_AsPastStoreDtFlg(CDef.PastStoreDtFlg cdef) {
        doSetPastStoreDtFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不可
     */
    public void setPastStoreDtFlg_NotEqual_$0() {
        setPastStoreDtFlg_NotEqual_AsPastStoreDtFlg(CDef.PastStoreDtFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可能
     */
    public void setPastStoreDtFlg_NotEqual_$1() {
        setPastStoreDtFlg_NotEqual_AsPastStoreDtFlg(CDef.PastStoreDtFlg.$1);
    }

    protected void doSetPastStoreDtFlg_NotEqual(String pastStoreDtFlg) {
        regPastStoreDtFlg(CK_NES, pastStoreDtFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @param pastStoreDtFlgList The collection of pastStoreDtFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_InScope(Collection<String> pastStoreDtFlgList) {
        doSetPastStoreDtFlg_InScope(pastStoreDtFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PastStoreDtFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_InScope_AsPastStoreDtFlg(Collection<CDef.PastStoreDtFlg> cdefList) {
        doSetPastStoreDtFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPastStoreDtFlg_InScope(Collection<String> pastStoreDtFlgList) {
        regINS(CK_INS, cTL(pastStoreDtFlgList), xgetCValuePastStoreDtFlg(), "PAST_STORE_DT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @param pastStoreDtFlgList The collection of pastStoreDtFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_NotInScope(Collection<String> pastStoreDtFlgList) {
        doSetPastStoreDtFlg_NotInScope(pastStoreDtFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PastStoreDtFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPastStoreDtFlg_NotInScope_AsPastStoreDtFlg(Collection<CDef.PastStoreDtFlg> cdefList) {
        doSetPastStoreDtFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPastStoreDtFlg_NotInScope(Collection<String> pastStoreDtFlgList) {
        regINS(CK_NINS, cTL(pastStoreDtFlgList), xgetCValuePastStoreDtFlg(), "PAST_STORE_DT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     */
    public void setPastStoreDtFlg_IsNull() { regPastStoreDtFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     */
    public void setPastStoreDtFlg_IsNotNull() { regPastStoreDtFlg(CK_ISNN, DOBJ); }

    protected void regPastStoreDtFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePastStoreDtFlg(), "PAST_STORE_DT_FLG"); }
    protected abstract ConditionValue xgetCValuePastStoreDtFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @param useHtShipFlg The value of useHtShipFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_Equal(String useHtShipFlg) {
        doSetUseHtShipFlg_Equal(fRES(useHtShipFlg));
    }

    /**
     * Equal(=). As UseHtShipFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * HT/SDケースピック使用フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_Equal_AsUseHtShipFlg(CDef.UseHtShipFlg cdef) {
        doSetUseHtShipFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setUseHtShipFlg_Equal_$0() {
        setUseHtShipFlg_Equal_AsUseHtShipFlg(CDef.UseHtShipFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setUseHtShipFlg_Equal_$1() {
        setUseHtShipFlg_Equal_AsUseHtShipFlg(CDef.UseHtShipFlg.$1);
    }

    protected void doSetUseHtShipFlg_Equal(String useHtShipFlg) {
        regUseHtShipFlg(CK_EQ, useHtShipFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @param useHtShipFlg The value of useHtShipFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_NotEqual(String useHtShipFlg) {
        doSetUseHtShipFlg_NotEqual(fRES(useHtShipFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As UseHtShipFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * HT/SDケースピック使用フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_NotEqual_AsUseHtShipFlg(CDef.UseHtShipFlg cdef) {
        doSetUseHtShipFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setUseHtShipFlg_NotEqual_$0() {
        setUseHtShipFlg_NotEqual_AsUseHtShipFlg(CDef.UseHtShipFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setUseHtShipFlg_NotEqual_$1() {
        setUseHtShipFlg_NotEqual_AsUseHtShipFlg(CDef.UseHtShipFlg.$1);
    }

    protected void doSetUseHtShipFlg_NotEqual(String useHtShipFlg) {
        regUseHtShipFlg(CK_NES, useHtShipFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @param useHtShipFlgList The collection of useHtShipFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_InScope(Collection<String> useHtShipFlgList) {
        doSetUseHtShipFlg_InScope(useHtShipFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As UseHtShipFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * HT/SDケースピック使用フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_InScope_AsUseHtShipFlg(Collection<CDef.UseHtShipFlg> cdefList) {
        doSetUseHtShipFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetUseHtShipFlg_InScope(Collection<String> useHtShipFlgList) {
        regINS(CK_INS, cTL(useHtShipFlgList), xgetCValueUseHtShipFlg(), "USE_HT_SHIP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @param useHtShipFlgList The collection of useHtShipFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_NotInScope(Collection<String> useHtShipFlgList) {
        doSetUseHtShipFlg_NotInScope(useHtShipFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UseHtShipFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * HT/SDケースピック使用フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseHtShipFlg_NotInScope_AsUseHtShipFlg(Collection<CDef.UseHtShipFlg> cdefList) {
        doSetUseHtShipFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUseHtShipFlg_NotInScope(Collection<String> useHtShipFlgList) {
        regINS(CK_NINS, cTL(useHtShipFlgList), xgetCValueUseHtShipFlg(), "USE_HT_SHIP_FLG");
    }

    protected void regUseHtShipFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseHtShipFlg(), "USE_HT_SHIP_FLG"); }
    protected abstract ConditionValue xgetCValueUseHtShipFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_Equal(String allocSortKey) {
        doSetAllocSortKey_Equal(fRES(allocSortKey));
    }

    protected void doSetAllocSortKey_Equal(String allocSortKey) {
        regAllocSortKey(CK_EQ, allocSortKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_NotEqual(String allocSortKey) {
        doSetAllocSortKey_NotEqual(fRES(allocSortKey));
    }

    protected void doSetAllocSortKey_NotEqual(String allocSortKey) {
        regAllocSortKey(CK_NES, allocSortKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_GreaterThan(String allocSortKey) {
        regAllocSortKey(CK_GT, fRES(allocSortKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_LessThan(String allocSortKey) {
        regAllocSortKey(CK_LT, fRES(allocSortKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_GreaterEqual(String allocSortKey) {
        regAllocSortKey(CK_GE, fRES(allocSortKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_LessEqual(String allocSortKey) {
        regAllocSortKey(CK_LE, fRES(allocSortKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKeyList The collection of allocSortKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_InScope(Collection<String> allocSortKeyList) {
        doSetAllocSortKey_InScope(allocSortKeyList);
    }

    protected void doSetAllocSortKey_InScope(Collection<String> allocSortKeyList) {
        regINS(CK_INS, cTL(allocSortKeyList), xgetCValueAllocSortKey(), "ALLOC_SORT_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKeyList The collection of allocSortKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_NotInScope(Collection<String> allocSortKeyList) {
        doSetAllocSortKey_NotInScope(allocSortKeyList);
    }

    protected void doSetAllocSortKey_NotInScope(Collection<String> allocSortKeyList) {
        regINS(CK_NINS, cTL(allocSortKeyList), xgetCValueAllocSortKey(), "ALLOC_SORT_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)} <br>
     * <pre>e.g. setAllocSortKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocSortKey The value of allocSortKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocSortKey_LikeSearch(String allocSortKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocSortKey), xgetCValueAllocSortKey(), "ALLOC_SORT_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocSortKey_NotLikeSearch(String allocSortKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocSortKey), xgetCValueAllocSortKey(), "ALLOC_SORT_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @param allocSortKey The value of allocSortKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocSortKey_PrefixSearch(String allocSortKey) {
        setAllocSortKey_LikeSearch(allocSortKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     */
    public void setAllocSortKey_IsNull() { regAllocSortKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     */
    public void setAllocSortKey_IsNullOrEmpty() { regAllocSortKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     */
    public void setAllocSortKey_IsNotNull() { regAllocSortKey(CK_ISNN, DOBJ); }

    protected void regAllocSortKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocSortKey(), "ALLOC_SORT_KEY"); }
    protected abstract ConditionValue xgetCValueAllocSortKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param rgReplenishUnitCls The value of rgReplenishUnitCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_Equal(String rgReplenishUnitCls) {
        doSetRgReplenishUnitCls_Equal(fRES(rgReplenishUnitCls));
    }

    /**
     * Equal(=). As ReplenishUnitCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_Equal_AsReplenishUnitCls(CDef.ReplenishUnitCls cdef) {
        doSetRgReplenishUnitCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 必要数
     */
    public void setRgReplenishUnitCls_Equal_$0() {
        setRgReplenishUnitCls_Equal_AsReplenishUnitCls(CDef.ReplenishUnitCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最大格納数荷姿切上
     */
    public void setRgReplenishUnitCls_Equal_$1() {
        setRgReplenishUnitCls_Equal_AsReplenishUnitCls(CDef.ReplenishUnitCls.$1);
    }

    protected void doSetRgReplenishUnitCls_Equal(String rgReplenishUnitCls) {
        regRgReplenishUnitCls(CK_EQ, rgReplenishUnitCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param rgReplenishUnitCls The value of rgReplenishUnitCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_NotEqual(String rgReplenishUnitCls) {
        doSetRgReplenishUnitCls_NotEqual(fRES(rgReplenishUnitCls));
    }

    /**
     * NotEqual(&lt;&gt;). As ReplenishUnitCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_NotEqual_AsReplenishUnitCls(CDef.ReplenishUnitCls cdef) {
        doSetRgReplenishUnitCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 必要数
     */
    public void setRgReplenishUnitCls_NotEqual_$0() {
        setRgReplenishUnitCls_NotEqual_AsReplenishUnitCls(CDef.ReplenishUnitCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最大格納数荷姿切上
     */
    public void setRgReplenishUnitCls_NotEqual_$1() {
        setRgReplenishUnitCls_NotEqual_AsReplenishUnitCls(CDef.ReplenishUnitCls.$1);
    }

    protected void doSetRgReplenishUnitCls_NotEqual(String rgReplenishUnitCls) {
        regRgReplenishUnitCls(CK_NES, rgReplenishUnitCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param rgReplenishUnitClsList The collection of rgReplenishUnitCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_InScope(Collection<String> rgReplenishUnitClsList) {
        doSetRgReplenishUnitCls_InScope(rgReplenishUnitClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As ReplenishUnitCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_InScope_AsReplenishUnitCls(Collection<CDef.ReplenishUnitCls> cdefList) {
        doSetRgReplenishUnitCls_InScope(cTStrL(cdefList));
    }

    protected void doSetRgReplenishUnitCls_InScope(Collection<String> rgReplenishUnitClsList) {
        regINS(CK_INS, cTL(rgReplenishUnitClsList), xgetCValueRgReplenishUnitCls(), "RG_REPLENISH_UNIT_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param rgReplenishUnitClsList The collection of rgReplenishUnitCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_NotInScope(Collection<String> rgReplenishUnitClsList) {
        doSetRgReplenishUnitCls_NotInScope(rgReplenishUnitClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ReplenishUnitCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRgReplenishUnitCls_NotInScope_AsReplenishUnitCls(Collection<CDef.ReplenishUnitCls> cdefList) {
        doSetRgReplenishUnitCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetRgReplenishUnitCls_NotInScope(Collection<String> rgReplenishUnitClsList) {
        regINS(CK_NINS, cTL(rgReplenishUnitClsList), xgetCValueRgReplenishUnitCls(), "RG_REPLENISH_UNIT_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     */
    public void setRgReplenishUnitCls_IsNull() { regRgReplenishUnitCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     */
    public void setRgReplenishUnitCls_IsNullOrEmpty() { regRgReplenishUnitCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     */
    public void setRgReplenishUnitCls_IsNotNull() { regRgReplenishUnitCls(CK_ISNN, DOBJ); }

    protected void regRgReplenishUnitCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRgReplenishUnitCls(), "RG_REPLENISH_UNIT_CLS"); }
    protected abstract ConditionValue xgetCValueRgReplenishUnitCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param emReplenishUnitCls The value of emReplenishUnitCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_Equal(String emReplenishUnitCls) {
        doSetEmReplenishUnitCls_Equal(fRES(emReplenishUnitCls));
    }

    /**
     * Equal(=). As ReplenishUnitCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_Equal_AsReplenishUnitCls(CDef.ReplenishUnitCls cdef) {
        doSetEmReplenishUnitCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 必要数
     */
    public void setEmReplenishUnitCls_Equal_$0() {
        setEmReplenishUnitCls_Equal_AsReplenishUnitCls(CDef.ReplenishUnitCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最大格納数荷姿切上
     */
    public void setEmReplenishUnitCls_Equal_$1() {
        setEmReplenishUnitCls_Equal_AsReplenishUnitCls(CDef.ReplenishUnitCls.$1);
    }

    protected void doSetEmReplenishUnitCls_Equal(String emReplenishUnitCls) {
        regEmReplenishUnitCls(CK_EQ, emReplenishUnitCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param emReplenishUnitCls The value of emReplenishUnitCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_NotEqual(String emReplenishUnitCls) {
        doSetEmReplenishUnitCls_NotEqual(fRES(emReplenishUnitCls));
    }

    /**
     * NotEqual(&lt;&gt;). As ReplenishUnitCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_NotEqual_AsReplenishUnitCls(CDef.ReplenishUnitCls cdef) {
        doSetEmReplenishUnitCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 必要数
     */
    public void setEmReplenishUnitCls_NotEqual_$0() {
        setEmReplenishUnitCls_NotEqual_AsReplenishUnitCls(CDef.ReplenishUnitCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最大格納数荷姿切上
     */
    public void setEmReplenishUnitCls_NotEqual_$1() {
        setEmReplenishUnitCls_NotEqual_AsReplenishUnitCls(CDef.ReplenishUnitCls.$1);
    }

    protected void doSetEmReplenishUnitCls_NotEqual(String emReplenishUnitCls) {
        regEmReplenishUnitCls(CK_NES, emReplenishUnitCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param emReplenishUnitClsList The collection of emReplenishUnitCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_InScope(Collection<String> emReplenishUnitClsList) {
        doSetEmReplenishUnitCls_InScope(emReplenishUnitClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As ReplenishUnitCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_InScope_AsReplenishUnitCls(Collection<CDef.ReplenishUnitCls> cdefList) {
        doSetEmReplenishUnitCls_InScope(cTStrL(cdefList));
    }

    protected void doSetEmReplenishUnitCls_InScope(Collection<String> emReplenishUnitClsList) {
        regINS(CK_INS, cTL(emReplenishUnitClsList), xgetCValueEmReplenishUnitCls(), "EM_REPLENISH_UNIT_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @param emReplenishUnitClsList The collection of emReplenishUnitCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_NotInScope(Collection<String> emReplenishUnitClsList) {
        doSetEmReplenishUnitCls_NotInScope(emReplenishUnitClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ReplenishUnitCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishUnitCls_NotInScope_AsReplenishUnitCls(Collection<CDef.ReplenishUnitCls> cdefList) {
        doSetEmReplenishUnitCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEmReplenishUnitCls_NotInScope(Collection<String> emReplenishUnitClsList) {
        regINS(CK_NINS, cTL(emReplenishUnitClsList), xgetCValueEmReplenishUnitCls(), "EM_REPLENISH_UNIT_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     */
    public void setEmReplenishUnitCls_IsNull() { regEmReplenishUnitCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     */
    public void setEmReplenishUnitCls_IsNullOrEmpty() { regEmReplenishUnitCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     */
    public void setEmReplenishUnitCls_IsNotNull() { regEmReplenishUnitCls(CK_ISNN, DOBJ); }

    protected void regEmReplenishUnitCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmReplenishUnitCls(), "EM_REPLENISH_UNIT_CLS"); }
    protected abstract ConditionValue xgetCValueEmReplenishUnitCls();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneId The value of emReplenishZoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_Equal(Long emReplenishZoneId) {
        doSetEmReplenishZoneId_Equal(emReplenishZoneId);
    }

    protected void doSetEmReplenishZoneId_Equal(Long emReplenishZoneId) {
        regEmReplenishZoneId(CK_EQ, emReplenishZoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneId The value of emReplenishZoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_NotEqual(Long emReplenishZoneId) {
        doSetEmReplenishZoneId_NotEqual(emReplenishZoneId);
    }

    protected void doSetEmReplenishZoneId_NotEqual(Long emReplenishZoneId) {
        regEmReplenishZoneId(CK_NES, emReplenishZoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneId The value of emReplenishZoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_GreaterThan(Long emReplenishZoneId) {
        regEmReplenishZoneId(CK_GT, emReplenishZoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneId The value of emReplenishZoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_LessThan(Long emReplenishZoneId) {
        regEmReplenishZoneId(CK_LT, emReplenishZoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneId The value of emReplenishZoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_GreaterEqual(Long emReplenishZoneId) {
        regEmReplenishZoneId(CK_GE, emReplenishZoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneId The value of emReplenishZoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_LessEqual(Long emReplenishZoneId) {
        regEmReplenishZoneId(CK_LE, emReplenishZoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param minNumber The min number of emReplenishZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of emReplenishZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEmReplenishZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEmReplenishZoneId(), "EM_REPLENISH_ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneIdList The collection of emReplenishZoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_InScope(Collection<Long> emReplenishZoneIdList) {
        doSetEmReplenishZoneId_InScope(emReplenishZoneIdList);
    }

    protected void doSetEmReplenishZoneId_InScope(Collection<Long> emReplenishZoneIdList) {
        regINS(CK_INS, cTL(emReplenishZoneIdList), xgetCValueEmReplenishZoneId(), "EM_REPLENISH_ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param emReplenishZoneIdList The collection of emReplenishZoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishZoneId_NotInScope(Collection<Long> emReplenishZoneIdList) {
        doSetEmReplenishZoneId_NotInScope(emReplenishZoneIdList);
    }

    protected void doSetEmReplenishZoneId_NotInScope(Collection<Long> emReplenishZoneIdList) {
        regINS(CK_NINS, cTL(emReplenishZoneIdList), xgetCValueEmReplenishZoneId(), "EM_REPLENISH_ZONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EM_REPLENISH_ZONE_ID from M_ZONE where ...)} <br />
     * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * @param subCBLambda The callback for sub-query of MZone for 'in-scope'. (NotNull)
     */
    public void inScopeMZone(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEmReplenishZoneId_InScopeRelation_MZone(cb.query());
        registerInScopeRelation(cb.query(), "EM_REPLENISH_ZONE_ID", "ZONE_ID", pp, "mZone", false);
    }
    public abstract String keepEmReplenishZoneId_InScopeRelation_MZone(MZoneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EM_REPLENISH_ZONE_ID from M_ZONE where ...)} <br />
     * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * @param subCBLambda The callback for sub-query of MZone for 'not in-scope'. (NotNull)
     */
    public void notInScopeMZone(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEmReplenishZoneId_NotInScopeRelation_MZone(cb.query());
        registerInScopeRelation(cb.query(), "EM_REPLENISH_ZONE_ID", "ZONE_ID", pp, "mZone", true);
    }
    public abstract String keepEmReplenishZoneId_NotInScopeRelation_MZone(MZoneCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     */
    public void setEmReplenishZoneId_IsNull() { regEmReplenishZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     */
    public void setEmReplenishZoneId_IsNotNull() { regEmReplenishZoneId(CK_ISNN, DOBJ); }

    protected void regEmReplenishZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmReplenishZoneId(), "EM_REPLENISH_ZONE_ID"); }
    protected abstract ConditionValue xgetCValueEmReplenishZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @param emReplenishAllocCls The value of emReplenishAllocCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_Equal(String emReplenishAllocCls) {
        doSetEmReplenishAllocCls_Equal(fRES(emReplenishAllocCls));
    }

    /**
     * Equal(=). As ReplenishAllocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 補充ロケ割付区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_Equal_AsReplenishAllocCls(CDef.ReplenishAllocCls cdef) {
        doSetEmReplenishAllocCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: バッチ毎同一SKUは同一ロケに割付
     */
    public void setEmReplenishAllocCls_Equal_$0() {
        setEmReplenishAllocCls_Equal_AsReplenishAllocCls(CDef.ReplenishAllocCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 補充毎に別ロケを割付
     */
    public void setEmReplenishAllocCls_Equal_$1() {
        setEmReplenishAllocCls_Equal_AsReplenishAllocCls(CDef.ReplenishAllocCls.$1);
    }

    protected void doSetEmReplenishAllocCls_Equal(String emReplenishAllocCls) {
        regEmReplenishAllocCls(CK_EQ, emReplenishAllocCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @param emReplenishAllocCls The value of emReplenishAllocCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_NotEqual(String emReplenishAllocCls) {
        doSetEmReplenishAllocCls_NotEqual(fRES(emReplenishAllocCls));
    }

    /**
     * NotEqual(&lt;&gt;). As ReplenishAllocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 補充ロケ割付区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_NotEqual_AsReplenishAllocCls(CDef.ReplenishAllocCls cdef) {
        doSetEmReplenishAllocCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: バッチ毎同一SKUは同一ロケに割付
     */
    public void setEmReplenishAllocCls_NotEqual_$0() {
        setEmReplenishAllocCls_NotEqual_AsReplenishAllocCls(CDef.ReplenishAllocCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 補充毎に別ロケを割付
     */
    public void setEmReplenishAllocCls_NotEqual_$1() {
        setEmReplenishAllocCls_NotEqual_AsReplenishAllocCls(CDef.ReplenishAllocCls.$1);
    }

    protected void doSetEmReplenishAllocCls_NotEqual(String emReplenishAllocCls) {
        regEmReplenishAllocCls(CK_NES, emReplenishAllocCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @param emReplenishAllocClsList The collection of emReplenishAllocCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_InScope(Collection<String> emReplenishAllocClsList) {
        doSetEmReplenishAllocCls_InScope(emReplenishAllocClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As ReplenishAllocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 補充ロケ割付区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_InScope_AsReplenishAllocCls(Collection<CDef.ReplenishAllocCls> cdefList) {
        doSetEmReplenishAllocCls_InScope(cTStrL(cdefList));
    }

    protected void doSetEmReplenishAllocCls_InScope(Collection<String> emReplenishAllocClsList) {
        regINS(CK_INS, cTL(emReplenishAllocClsList), xgetCValueEmReplenishAllocCls(), "EM_REPLENISH_ALLOC_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @param emReplenishAllocClsList The collection of emReplenishAllocCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_NotInScope(Collection<String> emReplenishAllocClsList) {
        doSetEmReplenishAllocCls_NotInScope(emReplenishAllocClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ReplenishAllocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 補充ロケ割付区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishAllocCls_NotInScope_AsReplenishAllocCls(Collection<CDef.ReplenishAllocCls> cdefList) {
        doSetEmReplenishAllocCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEmReplenishAllocCls_NotInScope(Collection<String> emReplenishAllocClsList) {
        regINS(CK_NINS, cTL(emReplenishAllocClsList), xgetCValueEmReplenishAllocCls(), "EM_REPLENISH_ALLOC_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     */
    public void setEmReplenishAllocCls_IsNull() { regEmReplenishAllocCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     */
    public void setEmReplenishAllocCls_IsNullOrEmpty() { regEmReplenishAllocCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     */
    public void setEmReplenishAllocCls_IsNotNull() { regEmReplenishAllocCls(CK_ISNN, DOBJ); }

    protected void regEmReplenishAllocCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmReplenishAllocCls(), "EM_REPLENISH_ALLOC_CLS"); }
    protected abstract ConditionValue xgetCValueEmReplenishAllocCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalCls The value of packingCalCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_Equal(String packingCalCls) {
        doSetPackingCalCls_Equal(fRES(packingCalCls));
    }

    /**
     * Equal(=). As PackingCalCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingCalCls_Equal_AsPackingCalCls(CDef.PackingCalCls cdef) {
        doSetPackingCalCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_Equal_$0() {
        setPackingCalCls_Equal_AsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_Equal_$1() {
        setPackingCalCls_Equal_AsPackingCalCls(CDef.PackingCalCls.$1);
    }

    protected void doSetPackingCalCls_Equal(String packingCalCls) {
        regPackingCalCls(CK_EQ, packingCalCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalCls The value of packingCalCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotEqual(String packingCalCls) {
        doSetPackingCalCls_NotEqual(fRES(packingCalCls));
    }

    /**
     * NotEqual(&lt;&gt;). As PackingCalCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotEqual_AsPackingCalCls(CDef.PackingCalCls cdef) {
        doSetPackingCalCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_NotEqual_$0() {
        setPackingCalCls_NotEqual_AsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_NotEqual_$1() {
        setPackingCalCls_NotEqual_AsPackingCalCls(CDef.PackingCalCls.$1);
    }

    protected void doSetPackingCalCls_NotEqual(String packingCalCls) {
        regPackingCalCls(CK_NES, packingCalCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalClsList The collection of packingCalCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_InScope(Collection<String> packingCalClsList) {
        doSetPackingCalCls_InScope(packingCalClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As PackingCalCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_InScope_AsPackingCalCls(Collection<CDef.PackingCalCls> cdefList) {
        doSetPackingCalCls_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingCalCls_InScope(Collection<String> packingCalClsList) {
        regINS(CK_INS, cTL(packingCalClsList), xgetCValuePackingCalCls(), "PACKING_CAL_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalClsList The collection of packingCalCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotInScope(Collection<String> packingCalClsList) {
        doSetPackingCalCls_NotInScope(packingCalClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PackingCalCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotInScope_AsPackingCalCls(Collection<CDef.PackingCalCls> cdefList) {
        doSetPackingCalCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingCalCls_NotInScope(Collection<String> packingCalClsList) {
        regINS(CK_NINS, cTL(packingCalClsList), xgetCValuePackingCalCls(), "PACKING_CAL_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     */
    public void setPackingCalCls_IsNull() { regPackingCalCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     */
    public void setPackingCalCls_IsNullOrEmpty() { regPackingCalCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     */
    public void setPackingCalCls_IsNotNull() { regPackingCalCls(CK_ISNN, DOBJ); }

    protected void regPackingCalCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingCalCls(), "PACKING_CAL_CLS"); }
    protected abstract ConditionValue xgetCValuePackingCalCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @param packingProcessCls The value of packingProcessCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingProcessCls_Equal(String packingProcessCls) {
        doSetPackingProcessCls_Equal(fRES(packingProcessCls));
    }

    /**
     * Equal(=). As PackingProcessCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 梱包方法
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingProcessCls_Equal_AsPackingProcessCls(CDef.PackingProcessCls cdef) {
        doSetPackingProcessCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 受取側考慮(出荷指示昇順)
     */
    public void setPackingProcessCls_Equal_$0() {
        setPackingProcessCls_Equal_AsPackingProcessCls(CDef.PackingProcessCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: なるべく詰める(容積降順)
     */
    public void setPackingProcessCls_Equal_$1() {
        setPackingProcessCls_Equal_AsPackingProcessCls(CDef.PackingProcessCls.$1);
    }

    protected void doSetPackingProcessCls_Equal(String packingProcessCls) {
        regPackingProcessCls(CK_EQ, packingProcessCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @param packingProcessCls The value of packingProcessCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingProcessCls_NotEqual(String packingProcessCls) {
        doSetPackingProcessCls_NotEqual(fRES(packingProcessCls));
    }

    /**
     * NotEqual(&lt;&gt;). As PackingProcessCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 梱包方法
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingProcessCls_NotEqual_AsPackingProcessCls(CDef.PackingProcessCls cdef) {
        doSetPackingProcessCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 受取側考慮(出荷指示昇順)
     */
    public void setPackingProcessCls_NotEqual_$0() {
        setPackingProcessCls_NotEqual_AsPackingProcessCls(CDef.PackingProcessCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: なるべく詰める(容積降順)
     */
    public void setPackingProcessCls_NotEqual_$1() {
        setPackingProcessCls_NotEqual_AsPackingProcessCls(CDef.PackingProcessCls.$1);
    }

    protected void doSetPackingProcessCls_NotEqual(String packingProcessCls) {
        regPackingProcessCls(CK_NES, packingProcessCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @param packingProcessClsList The collection of packingProcessCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingProcessCls_InScope(Collection<String> packingProcessClsList) {
        doSetPackingProcessCls_InScope(packingProcessClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As PackingProcessCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 梱包方法
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingProcessCls_InScope_AsPackingProcessCls(Collection<CDef.PackingProcessCls> cdefList) {
        doSetPackingProcessCls_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingProcessCls_InScope(Collection<String> packingProcessClsList) {
        regINS(CK_INS, cTL(packingProcessClsList), xgetCValuePackingProcessCls(), "PACKING_PROCESS_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @param packingProcessClsList The collection of packingProcessCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingProcessCls_NotInScope(Collection<String> packingProcessClsList) {
        doSetPackingProcessCls_NotInScope(packingProcessClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PackingProcessCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 梱包方法
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingProcessCls_NotInScope_AsPackingProcessCls(Collection<CDef.PackingProcessCls> cdefList) {
        doSetPackingProcessCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingProcessCls_NotInScope(Collection<String> packingProcessClsList) {
        regINS(CK_NINS, cTL(packingProcessClsList), xgetCValuePackingProcessCls(), "PACKING_PROCESS_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     */
    public void setPackingProcessCls_IsNull() { regPackingProcessCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     */
    public void setPackingProcessCls_IsNullOrEmpty() { regPackingProcessCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     */
    public void setPackingProcessCls_IsNotNull() { regPackingProcessCls(CK_ISNN, DOBJ); }

    protected void regPackingProcessCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingProcessCls(), "PACKING_PROCESS_CLS"); }
    protected abstract ConditionValue xgetCValuePackingProcessCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @param productPartPacking The value of productPartPacking as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductPartPacking_Equal(String productPartPacking) {
        doSetProductPartPacking_Equal(fRES(productPartPacking));
    }

    /**
     * Equal(=). As ProductPartPacking. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductPartPacking_Equal_AsProductPartPacking(CDef.ProductPartPacking cdef) {
        doSetProductPartPacking_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不可
     */
    public void setProductPartPacking_Equal_$0() {
        setProductPartPacking_Equal_AsProductPartPacking(CDef.ProductPartPacking.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可能
     */
    public void setProductPartPacking_Equal_$1() {
        setProductPartPacking_Equal_AsProductPartPacking(CDef.ProductPartPacking.$1);
    }

    protected void doSetProductPartPacking_Equal(String productPartPacking) {
        regProductPartPacking(CK_EQ, productPartPacking);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @param productPartPacking The value of productPartPacking as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductPartPacking_NotEqual(String productPartPacking) {
        doSetProductPartPacking_NotEqual(fRES(productPartPacking));
    }

    /**
     * NotEqual(&lt;&gt;). As ProductPartPacking. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductPartPacking_NotEqual_AsProductPartPacking(CDef.ProductPartPacking cdef) {
        doSetProductPartPacking_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不可
     */
    public void setProductPartPacking_NotEqual_$0() {
        setProductPartPacking_NotEqual_AsProductPartPacking(CDef.ProductPartPacking.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 可能
     */
    public void setProductPartPacking_NotEqual_$1() {
        setProductPartPacking_NotEqual_AsProductPartPacking(CDef.ProductPartPacking.$1);
    }

    protected void doSetProductPartPacking_NotEqual(String productPartPacking) {
        regProductPartPacking(CK_NES, productPartPacking);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @param productPartPackingList The collection of productPartPacking as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductPartPacking_InScope(Collection<String> productPartPackingList) {
        doSetProductPartPacking_InScope(productPartPackingList);
    }

    /**
     * InScope {in ('a', 'b')}. As ProductPartPacking. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductPartPacking_InScope_AsProductPartPacking(Collection<CDef.ProductPartPacking> cdefList) {
        doSetProductPartPacking_InScope(cTStrL(cdefList));
    }

    protected void doSetProductPartPacking_InScope(Collection<String> productPartPackingList) {
        regINS(CK_INS, cTL(productPartPackingList), xgetCValueProductPartPacking(), "PRODUCT_PART_PACKING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @param productPartPackingList The collection of productPartPacking as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductPartPacking_NotInScope(Collection<String> productPartPackingList) {
        doSetProductPartPacking_NotInScope(productPartPackingList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ProductPartPacking. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductPartPacking_NotInScope_AsProductPartPacking(Collection<CDef.ProductPartPacking> cdefList) {
        doSetProductPartPacking_NotInScope(cTStrL(cdefList));
    }

    protected void doSetProductPartPacking_NotInScope(Collection<String> productPartPackingList) {
        regINS(CK_NINS, cTL(productPartPackingList), xgetCValueProductPartPacking(), "PRODUCT_PART_PACKING");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     */
    public void setProductPartPacking_IsNull() { regProductPartPacking(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     */
    public void setProductPartPacking_IsNullOrEmpty() { regProductPartPacking(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     */
    public void setProductPartPacking_IsNotNull() { regProductPartPacking(CK_ISNN, DOBJ); }

    protected void regProductPartPacking(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductPartPacking(), "PRODUCT_PART_PACKING"); }
    protected abstract ConditionValue xgetCValueProductPartPacking();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @param decimalProductPacking The value of decimalProductPacking as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_Equal(String decimalProductPacking) {
        doSetDecimalProductPacking_Equal(fRES(decimalProductPacking));
    }

    /**
     * Equal(=). As DecimalProductPacking. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_Equal_AsDecimalProductPacking(CDef.DecimalProductPacking cdef) {
        doSetDecimalProductPacking_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 荷姿単位で1梱包
     */
    public void setDecimalProductPacking_Equal_$0() {
        setDecimalProductPacking_Equal_AsDecimalProductPacking(CDef.DecimalProductPacking.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 商品単位で1梱包
     */
    public void setDecimalProductPacking_Equal_$1() {
        setDecimalProductPacking_Equal_AsDecimalProductPacking(CDef.DecimalProductPacking.$1);
    }

    protected void doSetDecimalProductPacking_Equal(String decimalProductPacking) {
        regDecimalProductPacking(CK_EQ, decimalProductPacking);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @param decimalProductPacking The value of decimalProductPacking as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_NotEqual(String decimalProductPacking) {
        doSetDecimalProductPacking_NotEqual(fRES(decimalProductPacking));
    }

    /**
     * NotEqual(&lt;&gt;). As DecimalProductPacking. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_NotEqual_AsDecimalProductPacking(CDef.DecimalProductPacking cdef) {
        doSetDecimalProductPacking_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 荷姿単位で1梱包
     */
    public void setDecimalProductPacking_NotEqual_$0() {
        setDecimalProductPacking_NotEqual_AsDecimalProductPacking(CDef.DecimalProductPacking.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 商品単位で1梱包
     */
    public void setDecimalProductPacking_NotEqual_$1() {
        setDecimalProductPacking_NotEqual_AsDecimalProductPacking(CDef.DecimalProductPacking.$1);
    }

    protected void doSetDecimalProductPacking_NotEqual(String decimalProductPacking) {
        regDecimalProductPacking(CK_NES, decimalProductPacking);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @param decimalProductPackingList The collection of decimalProductPacking as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_InScope(Collection<String> decimalProductPackingList) {
        doSetDecimalProductPacking_InScope(decimalProductPackingList);
    }

    /**
     * InScope {in ('a', 'b')}. As DecimalProductPacking. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_InScope_AsDecimalProductPacking(Collection<CDef.DecimalProductPacking> cdefList) {
        doSetDecimalProductPacking_InScope(cTStrL(cdefList));
    }

    protected void doSetDecimalProductPacking_InScope(Collection<String> decimalProductPackingList) {
        regINS(CK_INS, cTL(decimalProductPackingList), xgetCValueDecimalProductPacking(), "DECIMAL_PRODUCT_PACKING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @param decimalProductPackingList The collection of decimalProductPacking as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_NotInScope(Collection<String> decimalProductPackingList) {
        doSetDecimalProductPacking_NotInScope(decimalProductPackingList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DecimalProductPacking. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalProductPacking_NotInScope_AsDecimalProductPacking(Collection<CDef.DecimalProductPacking> cdefList) {
        doSetDecimalProductPacking_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDecimalProductPacking_NotInScope(Collection<String> decimalProductPackingList) {
        regINS(CK_NINS, cTL(decimalProductPackingList), xgetCValueDecimalProductPacking(), "DECIMAL_PRODUCT_PACKING");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     */
    public void setDecimalProductPacking_IsNull() { regDecimalProductPacking(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     */
    public void setDecimalProductPacking_IsNullOrEmpty() { regDecimalProductPacking(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     */
    public void setDecimalProductPacking_IsNotNull() { regDecimalProductPacking(CK_ISNN, DOBJ); }

    protected void regDecimalProductPacking(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDecimalProductPacking(), "DECIMAL_PRODUCT_PACKING"); }
    protected abstract ConditionValue xgetCValueDecimalProductPacking();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupId The value of packingBoxGroupId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_Equal(Long packingBoxGroupId) {
        doSetPackingBoxGroupId_Equal(packingBoxGroupId);
    }

    protected void doSetPackingBoxGroupId_Equal(Long packingBoxGroupId) {
        regPackingBoxGroupId(CK_EQ, packingBoxGroupId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupId The value of packingBoxGroupId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_NotEqual(Long packingBoxGroupId) {
        doSetPackingBoxGroupId_NotEqual(packingBoxGroupId);
    }

    protected void doSetPackingBoxGroupId_NotEqual(Long packingBoxGroupId) {
        regPackingBoxGroupId(CK_NES, packingBoxGroupId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupId The value of packingBoxGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_GreaterThan(Long packingBoxGroupId) {
        regPackingBoxGroupId(CK_GT, packingBoxGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupId The value of packingBoxGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_LessThan(Long packingBoxGroupId) {
        regPackingBoxGroupId(CK_LT, packingBoxGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupId The value of packingBoxGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_GreaterEqual(Long packingBoxGroupId) {
        regPackingBoxGroupId(CK_GE, packingBoxGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupId The value of packingBoxGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_LessEqual(Long packingBoxGroupId) {
        regPackingBoxGroupId(CK_LE, packingBoxGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param minNumber The min number of packingBoxGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingBoxGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingBoxGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingBoxGroupId(), "PACKING_BOX_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupIdList The collection of packingBoxGroupId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_InScope(Collection<Long> packingBoxGroupIdList) {
        doSetPackingBoxGroupId_InScope(packingBoxGroupIdList);
    }

    protected void doSetPackingBoxGroupId_InScope(Collection<Long> packingBoxGroupIdList) {
        regINS(CK_INS, cTL(packingBoxGroupIdList), xgetCValuePackingBoxGroupId(), "PACKING_BOX_GROUP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @param packingBoxGroupIdList The collection of packingBoxGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingBoxGroupId_NotInScope(Collection<Long> packingBoxGroupIdList) {
        doSetPackingBoxGroupId_NotInScope(packingBoxGroupIdList);
    }

    protected void doSetPackingBoxGroupId_NotInScope(Collection<Long> packingBoxGroupIdList) {
        regINS(CK_NINS, cTL(packingBoxGroupIdList), xgetCValuePackingBoxGroupId(), "PACKING_BOX_GROUP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_BOX_GROUP_ID from M_BOX_GRP where ...)} <br />
     * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * @param subCBLambda The callback for sub-query of MBoxGrp for 'in-scope'. (NotNull)
     */
    public void inScopeMBoxGrp(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingBoxGroupId_InScopeRelation_MBoxGrp(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_BOX_GROUP_ID", "BOX_GRP_ID", pp, "mBoxGrp", false);
    }
    public abstract String keepPackingBoxGroupId_InScopeRelation_MBoxGrp(MBoxGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_BOX_GROUP_ID from M_BOX_GRP where ...)} <br />
     * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * @param subCBLambda The callback for sub-query of MBoxGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBoxGrp(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingBoxGroupId_NotInScopeRelation_MBoxGrp(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_BOX_GROUP_ID", "BOX_GRP_ID", pp, "mBoxGrp", true);
    }
    public abstract String keepPackingBoxGroupId_NotInScopeRelation_MBoxGrp(MBoxGrpCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     */
    public void setPackingBoxGroupId_IsNull() { regPackingBoxGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     */
    public void setPackingBoxGroupId_IsNotNull() { regPackingBoxGroupId(CK_ISNN, DOBJ); }

    protected void regPackingBoxGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingBoxGroupId(), "PACKING_BOX_GROUP_ID"); }
    protected abstract ConditionValue xgetCValuePackingBoxGroupId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @param totalPicFlg The value of totalPicFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPicFlg_Equal(String totalPicFlg) {
        doSetTotalPicFlg_Equal(fRES(totalPicFlg));
    }

    /**
     * Equal(=). As TotalPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPicFlg_Equal_AsTotalPicFlg(CDef.TotalPicFlg cdef) {
        doSetTotalPicFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: トータルピック無
     */
    public void setTotalPicFlg_Equal_$0() {
        setTotalPicFlg_Equal_AsTotalPicFlg(CDef.TotalPicFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: トータルピック有
     */
    public void setTotalPicFlg_Equal_$1() {
        setTotalPicFlg_Equal_AsTotalPicFlg(CDef.TotalPicFlg.$1);
    }

    protected void doSetTotalPicFlg_Equal(String totalPicFlg) {
        regTotalPicFlg(CK_EQ, totalPicFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @param totalPicFlg The value of totalPicFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPicFlg_NotEqual(String totalPicFlg) {
        doSetTotalPicFlg_NotEqual(fRES(totalPicFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As TotalPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPicFlg_NotEqual_AsTotalPicFlg(CDef.TotalPicFlg cdef) {
        doSetTotalPicFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: トータルピック無
     */
    public void setTotalPicFlg_NotEqual_$0() {
        setTotalPicFlg_NotEqual_AsTotalPicFlg(CDef.TotalPicFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: トータルピック有
     */
    public void setTotalPicFlg_NotEqual_$1() {
        setTotalPicFlg_NotEqual_AsTotalPicFlg(CDef.TotalPicFlg.$1);
    }

    protected void doSetTotalPicFlg_NotEqual(String totalPicFlg) {
        regTotalPicFlg(CK_NES, totalPicFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @param totalPicFlgList The collection of totalPicFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPicFlg_InScope(Collection<String> totalPicFlgList) {
        doSetTotalPicFlg_InScope(totalPicFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As TotalPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPicFlg_InScope_AsTotalPicFlg(Collection<CDef.TotalPicFlg> cdefList) {
        doSetTotalPicFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetTotalPicFlg_InScope(Collection<String> totalPicFlgList) {
        regINS(CK_INS, cTL(totalPicFlgList), xgetCValueTotalPicFlg(), "TOTAL_PIC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @param totalPicFlgList The collection of totalPicFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPicFlg_NotInScope(Collection<String> totalPicFlgList) {
        doSetTotalPicFlg_NotInScope(totalPicFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TotalPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPicFlg_NotInScope_AsTotalPicFlg(Collection<CDef.TotalPicFlg> cdefList) {
        doSetTotalPicFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTotalPicFlg_NotInScope(Collection<String> totalPicFlgList) {
        regINS(CK_NINS, cTL(totalPicFlgList), xgetCValueTotalPicFlg(), "TOTAL_PIC_FLG");
    }

    protected void regTotalPicFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPicFlg(), "TOTAL_PIC_FLG"); }
    protected abstract ConditionValue xgetCValueTotalPicFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @param multiPicCls The value of multiPicCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicCls_Equal(String multiPicCls) {
        doSetMultiPicCls_Equal(fRES(multiPicCls));
    }

    /**
     * Equal(=). As MultiPicCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMultiPicCls_Equal_AsMultiPicCls(CDef.MultiPicCls cdef) {
        doSetMultiPicCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: マルチピック計算無
     */
    public void setMultiPicCls_Equal_$0() {
        setMultiPicCls_Equal_AsMultiPicCls(CDef.MultiPicCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: マルチピック計算有
     */
    public void setMultiPicCls_Equal_$1() {
        setMultiPicCls_Equal_AsMultiPicCls(CDef.MultiPicCls.$1);
    }

    protected void doSetMultiPicCls_Equal(String multiPicCls) {
        regMultiPicCls(CK_EQ, multiPicCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @param multiPicCls The value of multiPicCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicCls_NotEqual(String multiPicCls) {
        doSetMultiPicCls_NotEqual(fRES(multiPicCls));
    }

    /**
     * NotEqual(&lt;&gt;). As MultiPicCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMultiPicCls_NotEqual_AsMultiPicCls(CDef.MultiPicCls cdef) {
        doSetMultiPicCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: マルチピック計算無
     */
    public void setMultiPicCls_NotEqual_$0() {
        setMultiPicCls_NotEqual_AsMultiPicCls(CDef.MultiPicCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: マルチピック計算有
     */
    public void setMultiPicCls_NotEqual_$1() {
        setMultiPicCls_NotEqual_AsMultiPicCls(CDef.MultiPicCls.$1);
    }

    protected void doSetMultiPicCls_NotEqual(String multiPicCls) {
        regMultiPicCls(CK_NES, multiPicCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @param multiPicClsList The collection of multiPicCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicCls_InScope(Collection<String> multiPicClsList) {
        doSetMultiPicCls_InScope(multiPicClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As MultiPicCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicCls_InScope_AsMultiPicCls(Collection<CDef.MultiPicCls> cdefList) {
        doSetMultiPicCls_InScope(cTStrL(cdefList));
    }

    protected void doSetMultiPicCls_InScope(Collection<String> multiPicClsList) {
        regINS(CK_INS, cTL(multiPicClsList), xgetCValueMultiPicCls(), "MULTI_PIC_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @param multiPicClsList The collection of multiPicCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicCls_NotInScope(Collection<String> multiPicClsList) {
        doSetMultiPicCls_NotInScope(multiPicClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MultiPicCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicCls_NotInScope_AsMultiPicCls(Collection<CDef.MultiPicCls> cdefList) {
        doSetMultiPicCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMultiPicCls_NotInScope(Collection<String> multiPicClsList) {
        regINS(CK_NINS, cTL(multiPicClsList), xgetCValueMultiPicCls(), "MULTI_PIC_CLS");
    }

    protected void regMultiPicCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultiPicCls(), "MULTI_PIC_CLS"); }
    protected abstract ConditionValue xgetCValueMultiPicCls();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNum The value of backetColNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketColNum_Equal(Long backetColNum) {
        doSetBacketColNum_Equal(backetColNum);
    }

    protected void doSetBacketColNum_Equal(Long backetColNum) {
        regBacketColNum(CK_EQ, backetColNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNum The value of backetColNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketColNum_NotEqual(Long backetColNum) {
        doSetBacketColNum_NotEqual(backetColNum);
    }

    protected void doSetBacketColNum_NotEqual(Long backetColNum) {
        regBacketColNum(CK_NES, backetColNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNum The value of backetColNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketColNum_GreaterThan(Long backetColNum) {
        regBacketColNum(CK_GT, backetColNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNum The value of backetColNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketColNum_LessThan(Long backetColNum) {
        regBacketColNum(CK_LT, backetColNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNum The value of backetColNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketColNum_GreaterEqual(Long backetColNum) {
        regBacketColNum(CK_GE, backetColNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNum The value of backetColNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketColNum_LessEqual(Long backetColNum) {
        regBacketColNum(CK_LE, backetColNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param minNumber The min number of backetColNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of backetColNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBacketColNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBacketColNum(), "BACKET_COL_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNumList The collection of backetColNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBacketColNum_InScope(Collection<Long> backetColNumList) {
        doSetBacketColNum_InScope(backetColNumList);
    }

    protected void doSetBacketColNum_InScope(Collection<Long> backetColNumList) {
        regINS(CK_INS, cTL(backetColNumList), xgetCValueBacketColNum(), "BACKET_COL_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @param backetColNumList The collection of backetColNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBacketColNum_NotInScope(Collection<Long> backetColNumList) {
        doSetBacketColNum_NotInScope(backetColNumList);
    }

    protected void doSetBacketColNum_NotInScope(Collection<Long> backetColNumList) {
        regINS(CK_NINS, cTL(backetColNumList), xgetCValueBacketColNum(), "BACKET_COL_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     */
    public void setBacketColNum_IsNull() { regBacketColNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     */
    public void setBacketColNum_IsNotNull() { regBacketColNum(CK_ISNN, DOBJ); }

    protected void regBacketColNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBacketColNum(), "BACKET_COL_NUM"); }
    protected abstract ConditionValue xgetCValueBacketColNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNum The value of backetRowNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketRowNum_Equal(Long backetRowNum) {
        doSetBacketRowNum_Equal(backetRowNum);
    }

    protected void doSetBacketRowNum_Equal(Long backetRowNum) {
        regBacketRowNum(CK_EQ, backetRowNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNum The value of backetRowNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketRowNum_NotEqual(Long backetRowNum) {
        doSetBacketRowNum_NotEqual(backetRowNum);
    }

    protected void doSetBacketRowNum_NotEqual(Long backetRowNum) {
        regBacketRowNum(CK_NES, backetRowNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNum The value of backetRowNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketRowNum_GreaterThan(Long backetRowNum) {
        regBacketRowNum(CK_GT, backetRowNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNum The value of backetRowNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketRowNum_LessThan(Long backetRowNum) {
        regBacketRowNum(CK_LT, backetRowNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNum The value of backetRowNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketRowNum_GreaterEqual(Long backetRowNum) {
        regBacketRowNum(CK_GE, backetRowNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNum The value of backetRowNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBacketRowNum_LessEqual(Long backetRowNum) {
        regBacketRowNum(CK_LE, backetRowNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param minNumber The min number of backetRowNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of backetRowNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBacketRowNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBacketRowNum(), "BACKET_ROW_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNumList The collection of backetRowNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBacketRowNum_InScope(Collection<Long> backetRowNumList) {
        doSetBacketRowNum_InScope(backetRowNumList);
    }

    protected void doSetBacketRowNum_InScope(Collection<Long> backetRowNumList) {
        regINS(CK_INS, cTL(backetRowNumList), xgetCValueBacketRowNum(), "BACKET_ROW_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @param backetRowNumList The collection of backetRowNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBacketRowNum_NotInScope(Collection<Long> backetRowNumList) {
        doSetBacketRowNum_NotInScope(backetRowNumList);
    }

    protected void doSetBacketRowNum_NotInScope(Collection<Long> backetRowNumList) {
        regINS(CK_NINS, cTL(backetRowNumList), xgetCValueBacketRowNum(), "BACKET_ROW_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     */
    public void setBacketRowNum_IsNull() { regBacketRowNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     */
    public void setBacketRowNum_IsNotNull() { regBacketRowNum(CK_ISNN, DOBJ); }

    protected void regBacketRowNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBacketRowNum(), "BACKET_ROW_NUM"); }
    protected abstract ConditionValue xgetCValueBacketRowNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @param casePicFlg The value of casePicFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePicFlg_Equal(String casePicFlg) {
        doSetCasePicFlg_Equal(fRES(casePicFlg));
    }

    /**
     * Equal(=). As CasePicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピッキングフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePicFlg_Equal_AsCasePicFlg(CDef.CasePicFlg cdef) {
        doSetCasePicFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ケースピック無
     */
    public void setCasePicFlg_Equal_$0() {
        setCasePicFlg_Equal_AsCasePicFlg(CDef.CasePicFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ケースピック有
     */
    public void setCasePicFlg_Equal_$1() {
        setCasePicFlg_Equal_AsCasePicFlg(CDef.CasePicFlg.$1);
    }

    protected void doSetCasePicFlg_Equal(String casePicFlg) {
        regCasePicFlg(CK_EQ, casePicFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @param casePicFlg The value of casePicFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePicFlg_NotEqual(String casePicFlg) {
        doSetCasePicFlg_NotEqual(fRES(casePicFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CasePicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピッキングフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePicFlg_NotEqual_AsCasePicFlg(CDef.CasePicFlg cdef) {
        doSetCasePicFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ケースピック無
     */
    public void setCasePicFlg_NotEqual_$0() {
        setCasePicFlg_NotEqual_AsCasePicFlg(CDef.CasePicFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ケースピック有
     */
    public void setCasePicFlg_NotEqual_$1() {
        setCasePicFlg_NotEqual_AsCasePicFlg(CDef.CasePicFlg.$1);
    }

    protected void doSetCasePicFlg_NotEqual(String casePicFlg) {
        regCasePicFlg(CK_NES, casePicFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @param casePicFlgList The collection of casePicFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePicFlg_InScope(Collection<String> casePicFlgList) {
        doSetCasePicFlg_InScope(casePicFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CasePicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピッキングフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePicFlg_InScope_AsCasePicFlg(Collection<CDef.CasePicFlg> cdefList) {
        doSetCasePicFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCasePicFlg_InScope(Collection<String> casePicFlgList) {
        regINS(CK_INS, cTL(casePicFlgList), xgetCValueCasePicFlg(), "CASE_PIC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @param casePicFlgList The collection of casePicFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePicFlg_NotInScope(Collection<String> casePicFlgList) {
        doSetCasePicFlg_NotInScope(casePicFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CasePicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピッキングフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePicFlg_NotInScope_AsCasePicFlg(Collection<CDef.CasePicFlg> cdefList) {
        doSetCasePicFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCasePicFlg_NotInScope(Collection<String> casePicFlgList) {
        regINS(CK_NINS, cTL(casePicFlgList), xgetCValueCasePicFlg(), "CASE_PIC_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     */
    public void setCasePicFlg_IsNull() { regCasePicFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     */
    public void setCasePicFlg_IsNotNull() { regCasePicFlg(CK_ISNN, DOBJ); }

    protected void regCasePicFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePicFlg(), "CASE_PIC_FLG"); }
    protected abstract ConditionValue xgetCValueCasePicFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlg The value of sglRowPicFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_Equal(String sglRowPicFlg) {
        doSetSglRowPicFlg_Equal(fRES(sglRowPicFlg));
    }

    /**
     * Equal(=). As SglRowPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_Equal_AsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        doSetSglRowPicFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_Equal_$0() {
        setSglRowPicFlg_Equal_AsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_Equal_$1() {
        setSglRowPicFlg_Equal_AsSglRowPicFlg(CDef.SglRowPicFlg.$1);
    }

    protected void doSetSglRowPicFlg_Equal(String sglRowPicFlg) {
        regSglRowPicFlg(CK_EQ, sglRowPicFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlg The value of sglRowPicFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotEqual(String sglRowPicFlg) {
        doSetSglRowPicFlg_NotEqual(fRES(sglRowPicFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SglRowPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotEqual_AsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        doSetSglRowPicFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_NotEqual_$0() {
        setSglRowPicFlg_NotEqual_AsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_NotEqual_$1() {
        setSglRowPicFlg_NotEqual_AsSglRowPicFlg(CDef.SglRowPicFlg.$1);
    }

    protected void doSetSglRowPicFlg_NotEqual(String sglRowPicFlg) {
        regSglRowPicFlg(CK_NES, sglRowPicFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlgList The collection of sglRowPicFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_InScope(Collection<String> sglRowPicFlgList) {
        doSetSglRowPicFlg_InScope(sglRowPicFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SglRowPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_InScope_AsSglRowPicFlg(Collection<CDef.SglRowPicFlg> cdefList) {
        doSetSglRowPicFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSglRowPicFlg_InScope(Collection<String> sglRowPicFlgList) {
        regINS(CK_INS, cTL(sglRowPicFlgList), xgetCValueSglRowPicFlg(), "SGL_ROW_PIC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlgList The collection of sglRowPicFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotInScope(Collection<String> sglRowPicFlgList) {
        doSetSglRowPicFlg_NotInScope(sglRowPicFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SglRowPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotInScope_AsSglRowPicFlg(Collection<CDef.SglRowPicFlg> cdefList) {
        doSetSglRowPicFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSglRowPicFlg_NotInScope(Collection<String> sglRowPicFlgList) {
        regINS(CK_NINS, cTL(sglRowPicFlgList), xgetCValueSglRowPicFlg(), "SGL_ROW_PIC_FLG");
    }

    protected void regSglRowPicFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowPicFlg(), "SGL_ROW_PIC_FLG"); }
    protected abstract ConditionValue xgetCValueSglRowPicFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNum The value of sglRowPicMaxInstNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_Equal(Long sglRowPicMaxInstNum) {
        doSetSglRowPicMaxInstNum_Equal(sglRowPicMaxInstNum);
    }

    protected void doSetSglRowPicMaxInstNum_Equal(Long sglRowPicMaxInstNum) {
        regSglRowPicMaxInstNum(CK_EQ, sglRowPicMaxInstNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNum The value of sglRowPicMaxInstNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_NotEqual(Long sglRowPicMaxInstNum) {
        doSetSglRowPicMaxInstNum_NotEqual(sglRowPicMaxInstNum);
    }

    protected void doSetSglRowPicMaxInstNum_NotEqual(Long sglRowPicMaxInstNum) {
        regSglRowPicMaxInstNum(CK_NES, sglRowPicMaxInstNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNum The value of sglRowPicMaxInstNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_GreaterThan(Long sglRowPicMaxInstNum) {
        regSglRowPicMaxInstNum(CK_GT, sglRowPicMaxInstNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNum The value of sglRowPicMaxInstNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_LessThan(Long sglRowPicMaxInstNum) {
        regSglRowPicMaxInstNum(CK_LT, sglRowPicMaxInstNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNum The value of sglRowPicMaxInstNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_GreaterEqual(Long sglRowPicMaxInstNum) {
        regSglRowPicMaxInstNum(CK_GE, sglRowPicMaxInstNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNum The value of sglRowPicMaxInstNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_LessEqual(Long sglRowPicMaxInstNum) {
        regSglRowPicMaxInstNum(CK_LE, sglRowPicMaxInstNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param minNumber The min number of sglRowPicMaxInstNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sglRowPicMaxInstNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSglRowPicMaxInstNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSglRowPicMaxInstNum(), "SGL_ROW_PIC_MAX_INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNumList The collection of sglRowPicMaxInstNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_InScope(Collection<Long> sglRowPicMaxInstNumList) {
        doSetSglRowPicMaxInstNum_InScope(sglRowPicMaxInstNumList);
    }

    protected void doSetSglRowPicMaxInstNum_InScope(Collection<Long> sglRowPicMaxInstNumList) {
        regINS(CK_INS, cTL(sglRowPicMaxInstNumList), xgetCValueSglRowPicMaxInstNum(), "SGL_ROW_PIC_MAX_INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @param sglRowPicMaxInstNumList The collection of sglRowPicMaxInstNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicMaxInstNum_NotInScope(Collection<Long> sglRowPicMaxInstNumList) {
        doSetSglRowPicMaxInstNum_NotInScope(sglRowPicMaxInstNumList);
    }

    protected void doSetSglRowPicMaxInstNum_NotInScope(Collection<Long> sglRowPicMaxInstNumList) {
        regINS(CK_NINS, cTL(sglRowPicMaxInstNumList), xgetCValueSglRowPicMaxInstNum(), "SGL_ROW_PIC_MAX_INST_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     */
    public void setSglRowPicMaxInstNum_IsNull() { regSglRowPicMaxInstNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     */
    public void setSglRowPicMaxInstNum_IsNotNull() { regSglRowPicMaxInstNum(CK_ISNN, DOBJ); }

    protected void regSglRowPicMaxInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowPicMaxInstNum(), "SGL_ROW_PIC_MAX_INST_NUM"); }
    protected abstract ConditionValue xgetCValueSglRowPicMaxInstNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @param picMthdRcmdFlg The value of picMthdRcmdFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_Equal(String picMthdRcmdFlg) {
        doSetPicMthdRcmdFlg_Equal(fRES(picMthdRcmdFlg));
    }

    /**
     * Equal(=). As PicMthdRcmdFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_Equal_AsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg cdef) {
        doSetPicMthdRcmdFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setPicMthdRcmdFlg_Equal_$0() {
        setPicMthdRcmdFlg_Equal_AsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setPicMthdRcmdFlg_Equal_$1() {
        setPicMthdRcmdFlg_Equal_AsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.$1);
    }

    protected void doSetPicMthdRcmdFlg_Equal(String picMthdRcmdFlg) {
        regPicMthdRcmdFlg(CK_EQ, picMthdRcmdFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @param picMthdRcmdFlg The value of picMthdRcmdFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_NotEqual(String picMthdRcmdFlg) {
        doSetPicMthdRcmdFlg_NotEqual(fRES(picMthdRcmdFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PicMthdRcmdFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_NotEqual_AsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg cdef) {
        doSetPicMthdRcmdFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setPicMthdRcmdFlg_NotEqual_$0() {
        setPicMthdRcmdFlg_NotEqual_AsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setPicMthdRcmdFlg_NotEqual_$1() {
        setPicMthdRcmdFlg_NotEqual_AsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.$1);
    }

    protected void doSetPicMthdRcmdFlg_NotEqual(String picMthdRcmdFlg) {
        regPicMthdRcmdFlg(CK_NES, picMthdRcmdFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @param picMthdRcmdFlgList The collection of picMthdRcmdFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_InScope(Collection<String> picMthdRcmdFlgList) {
        doSetPicMthdRcmdFlg_InScope(picMthdRcmdFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PicMthdRcmdFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_InScope_AsPicMthdRcmdFlg(Collection<CDef.PicMthdRcmdFlg> cdefList) {
        doSetPicMthdRcmdFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdFlg_InScope(Collection<String> picMthdRcmdFlgList) {
        regINS(CK_INS, cTL(picMthdRcmdFlgList), xgetCValuePicMthdRcmdFlg(), "PIC_MTHD_RCMD_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @param picMthdRcmdFlgList The collection of picMthdRcmdFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_NotInScope(Collection<String> picMthdRcmdFlgList) {
        doSetPicMthdRcmdFlg_NotInScope(picMthdRcmdFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PicMthdRcmdFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdFlg_NotInScope_AsPicMthdRcmdFlg(Collection<CDef.PicMthdRcmdFlg> cdefList) {
        doSetPicMthdRcmdFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdFlg_NotInScope(Collection<String> picMthdRcmdFlgList) {
        regINS(CK_NINS, cTL(picMthdRcmdFlgList), xgetCValuePicMthdRcmdFlg(), "PIC_MTHD_RCMD_FLG");
    }

    protected void regPicMthdRcmdFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdFlg(), "PIC_MTHD_RCMD_FLG"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @param picMthdRcmdBreakKey The value of picMthdRcmdBreakKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_Equal(String picMthdRcmdBreakKey) {
        doSetPicMthdRcmdBreakKey_Equal(fRES(picMthdRcmdBreakKey));
    }

    /**
     * Equal(=). As PicMthdRcmdBreakKey. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_Equal_AsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey cdef) {
        doSetPicMthdRcmdBreakKey_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 配送コース
     */
    public void setPicMthdRcmdBreakKey_Equal_$1() {
        setPicMthdRcmdBreakKey_Equal_AsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 運送業者
     */
    public void setPicMthdRcmdBreakKey_Equal_$2() {
        setPicMthdRcmdBreakKey_Equal_AsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.$2);
    }

    protected void doSetPicMthdRcmdBreakKey_Equal(String picMthdRcmdBreakKey) {
        regPicMthdRcmdBreakKey(CK_EQ, picMthdRcmdBreakKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @param picMthdRcmdBreakKey The value of picMthdRcmdBreakKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_NotEqual(String picMthdRcmdBreakKey) {
        doSetPicMthdRcmdBreakKey_NotEqual(fRES(picMthdRcmdBreakKey));
    }

    /**
     * NotEqual(&lt;&gt;). As PicMthdRcmdBreakKey. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_NotEqual_AsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey cdef) {
        doSetPicMthdRcmdBreakKey_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 配送コース
     */
    public void setPicMthdRcmdBreakKey_NotEqual_$1() {
        setPicMthdRcmdBreakKey_NotEqual_AsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 運送業者
     */
    public void setPicMthdRcmdBreakKey_NotEqual_$2() {
        setPicMthdRcmdBreakKey_NotEqual_AsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.$2);
    }

    protected void doSetPicMthdRcmdBreakKey_NotEqual(String picMthdRcmdBreakKey) {
        regPicMthdRcmdBreakKey(CK_NES, picMthdRcmdBreakKey);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @param picMthdRcmdBreakKeyList The collection of picMthdRcmdBreakKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_InScope(Collection<String> picMthdRcmdBreakKeyList) {
        doSetPicMthdRcmdBreakKey_InScope(picMthdRcmdBreakKeyList);
    }

    /**
     * InScope {in ('a', 'b')}. As PicMthdRcmdBreakKey. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_InScope_AsPicMthdRcmdBreakKey(Collection<CDef.PicMthdRcmdBreakKey> cdefList) {
        doSetPicMthdRcmdBreakKey_InScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdBreakKey_InScope(Collection<String> picMthdRcmdBreakKeyList) {
        regINS(CK_INS, cTL(picMthdRcmdBreakKeyList), xgetCValuePicMthdRcmdBreakKey(), "PIC_MTHD_RCMD_BREAK_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @param picMthdRcmdBreakKeyList The collection of picMthdRcmdBreakKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_NotInScope(Collection<String> picMthdRcmdBreakKeyList) {
        doSetPicMthdRcmdBreakKey_NotInScope(picMthdRcmdBreakKeyList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PicMthdRcmdBreakKey. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdBreakKey_NotInScope_AsPicMthdRcmdBreakKey(Collection<CDef.PicMthdRcmdBreakKey> cdefList) {
        doSetPicMthdRcmdBreakKey_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdBreakKey_NotInScope(Collection<String> picMthdRcmdBreakKeyList) {
        regINS(CK_NINS, cTL(picMthdRcmdBreakKeyList), xgetCValuePicMthdRcmdBreakKey(), "PIC_MTHD_RCMD_BREAK_KEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     */
    public void setPicMthdRcmdBreakKey_IsNull() { regPicMthdRcmdBreakKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     */
    public void setPicMthdRcmdBreakKey_IsNullOrEmpty() { regPicMthdRcmdBreakKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     */
    public void setPicMthdRcmdBreakKey_IsNotNull() { regPicMthdRcmdBreakKey(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdBreakKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdBreakKey(), "PIC_MTHD_RCMD_BREAK_KEY"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdBreakKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_Equal(String picMthdRcmdApiKey) {
        doSetPicMthdRcmdApiKey_Equal(fRES(picMthdRcmdApiKey));
    }

    protected void doSetPicMthdRcmdApiKey_Equal(String picMthdRcmdApiKey) {
        regPicMthdRcmdApiKey(CK_EQ, picMthdRcmdApiKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_NotEqual(String picMthdRcmdApiKey) {
        doSetPicMthdRcmdApiKey_NotEqual(fRES(picMthdRcmdApiKey));
    }

    protected void doSetPicMthdRcmdApiKey_NotEqual(String picMthdRcmdApiKey) {
        regPicMthdRcmdApiKey(CK_NES, picMthdRcmdApiKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_GreaterThan(String picMthdRcmdApiKey) {
        regPicMthdRcmdApiKey(CK_GT, fRES(picMthdRcmdApiKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_LessThan(String picMthdRcmdApiKey) {
        regPicMthdRcmdApiKey(CK_LT, fRES(picMthdRcmdApiKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_GreaterEqual(String picMthdRcmdApiKey) {
        regPicMthdRcmdApiKey(CK_GE, fRES(picMthdRcmdApiKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_LessEqual(String picMthdRcmdApiKey) {
        regPicMthdRcmdApiKey(CK_LE, fRES(picMthdRcmdApiKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKeyList The collection of picMthdRcmdApiKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_InScope(Collection<String> picMthdRcmdApiKeyList) {
        doSetPicMthdRcmdApiKey_InScope(picMthdRcmdApiKeyList);
    }

    protected void doSetPicMthdRcmdApiKey_InScope(Collection<String> picMthdRcmdApiKeyList) {
        regINS(CK_INS, cTL(picMthdRcmdApiKeyList), xgetCValuePicMthdRcmdApiKey(), "PIC_MTHD_RCMD_API_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKeyList The collection of picMthdRcmdApiKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_NotInScope(Collection<String> picMthdRcmdApiKeyList) {
        doSetPicMthdRcmdApiKey_NotInScope(picMthdRcmdApiKeyList);
    }

    protected void doSetPicMthdRcmdApiKey_NotInScope(Collection<String> picMthdRcmdApiKeyList) {
        regINS(CK_NINS, cTL(picMthdRcmdApiKeyList), xgetCValuePicMthdRcmdApiKey(), "PIC_MTHD_RCMD_API_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)} <br>
     * <pre>e.g. setPicMthdRcmdApiKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicMthdRcmdApiKey_LikeSearch(String picMthdRcmdApiKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picMthdRcmdApiKey), xgetCValuePicMthdRcmdApiKey(), "PIC_MTHD_RCMD_API_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicMthdRcmdApiKey_NotLikeSearch(String picMthdRcmdApiKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picMthdRcmdApiKey), xgetCValuePicMthdRcmdApiKey(), "PIC_MTHD_RCMD_API_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @param picMthdRcmdApiKey The value of picMthdRcmdApiKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdApiKey_PrefixSearch(String picMthdRcmdApiKey) {
        setPicMthdRcmdApiKey_LikeSearch(picMthdRcmdApiKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     */
    public void setPicMthdRcmdApiKey_IsNull() { regPicMthdRcmdApiKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     */
    public void setPicMthdRcmdApiKey_IsNullOrEmpty() { regPicMthdRcmdApiKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     */
    public void setPicMthdRcmdApiKey_IsNotNull() { regPicMthdRcmdApiKey(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdApiKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdApiKey(), "PIC_MTHD_RCMD_API_KEY"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdApiKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdMltPlOut The value of picMthdRcmdMltPlOut as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_Equal(String picMthdRcmdMltPlOut) {
        doSetPicMthdRcmdMltPlOut_Equal(fRES(picMthdRcmdMltPlOut));
    }

    /**
     * Equal(=). As PicMthdRcmdListOut. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_Equal_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut cdef) {
        doSetPicMthdRcmdMltPlOut_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setPicMthdRcmdMltPlOut_Equal_$0() {
        setPicMthdRcmdMltPlOut_Equal_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力する
     */
    public void setPicMthdRcmdMltPlOut_Equal_$1() {
        setPicMthdRcmdMltPlOut_Equal_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$1);
    }

    protected void doSetPicMthdRcmdMltPlOut_Equal(String picMthdRcmdMltPlOut) {
        regPicMthdRcmdMltPlOut(CK_EQ, picMthdRcmdMltPlOut);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdMltPlOut The value of picMthdRcmdMltPlOut as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_NotEqual(String picMthdRcmdMltPlOut) {
        doSetPicMthdRcmdMltPlOut_NotEqual(fRES(picMthdRcmdMltPlOut));
    }

    /**
     * NotEqual(&lt;&gt;). As PicMthdRcmdListOut. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_NotEqual_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut cdef) {
        doSetPicMthdRcmdMltPlOut_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setPicMthdRcmdMltPlOut_NotEqual_$0() {
        setPicMthdRcmdMltPlOut_NotEqual_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力する
     */
    public void setPicMthdRcmdMltPlOut_NotEqual_$1() {
        setPicMthdRcmdMltPlOut_NotEqual_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$1);
    }

    protected void doSetPicMthdRcmdMltPlOut_NotEqual(String picMthdRcmdMltPlOut) {
        regPicMthdRcmdMltPlOut(CK_NES, picMthdRcmdMltPlOut);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdMltPlOutList The collection of picMthdRcmdMltPlOut as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_InScope(Collection<String> picMthdRcmdMltPlOutList) {
        doSetPicMthdRcmdMltPlOut_InScope(picMthdRcmdMltPlOutList);
    }

    /**
     * InScope {in ('a', 'b')}. As PicMthdRcmdListOut. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_InScope_AsPicMthdRcmdListOut(Collection<CDef.PicMthdRcmdListOut> cdefList) {
        doSetPicMthdRcmdMltPlOut_InScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdMltPlOut_InScope(Collection<String> picMthdRcmdMltPlOutList) {
        regINS(CK_INS, cTL(picMthdRcmdMltPlOutList), xgetCValuePicMthdRcmdMltPlOut(), "PIC_MTHD_RCMD_MLT_PL_OUT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdMltPlOutList The collection of picMthdRcmdMltPlOut as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_NotInScope(Collection<String> picMthdRcmdMltPlOutList) {
        doSetPicMthdRcmdMltPlOut_NotInScope(picMthdRcmdMltPlOutList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PicMthdRcmdListOut. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdMltPlOut_NotInScope_AsPicMthdRcmdListOut(Collection<CDef.PicMthdRcmdListOut> cdefList) {
        doSetPicMthdRcmdMltPlOut_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdMltPlOut_NotInScope(Collection<String> picMthdRcmdMltPlOutList) {
        regINS(CK_NINS, cTL(picMthdRcmdMltPlOutList), xgetCValuePicMthdRcmdMltPlOut(), "PIC_MTHD_RCMD_MLT_PL_OUT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     */
    public void setPicMthdRcmdMltPlOut_IsNull() { regPicMthdRcmdMltPlOut(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     */
    public void setPicMthdRcmdMltPlOut_IsNotNull() { regPicMthdRcmdMltPlOut(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdMltPlOut(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdMltPlOut(), "PIC_MTHD_RCMD_MLT_PL_OUT"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdMltPlOut();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdSplSlOut The value of picMthdRcmdSplSlOut as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_Equal(String picMthdRcmdSplSlOut) {
        doSetPicMthdRcmdSplSlOut_Equal(fRES(picMthdRcmdSplSlOut));
    }

    /**
     * Equal(=). As PicMthdRcmdListOut. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_Equal_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut cdef) {
        doSetPicMthdRcmdSplSlOut_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setPicMthdRcmdSplSlOut_Equal_$0() {
        setPicMthdRcmdSplSlOut_Equal_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力する
     */
    public void setPicMthdRcmdSplSlOut_Equal_$1() {
        setPicMthdRcmdSplSlOut_Equal_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$1);
    }

    protected void doSetPicMthdRcmdSplSlOut_Equal(String picMthdRcmdSplSlOut) {
        regPicMthdRcmdSplSlOut(CK_EQ, picMthdRcmdSplSlOut);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdSplSlOut The value of picMthdRcmdSplSlOut as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_NotEqual(String picMthdRcmdSplSlOut) {
        doSetPicMthdRcmdSplSlOut_NotEqual(fRES(picMthdRcmdSplSlOut));
    }

    /**
     * NotEqual(&lt;&gt;). As PicMthdRcmdListOut. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_NotEqual_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut cdef) {
        doSetPicMthdRcmdSplSlOut_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setPicMthdRcmdSplSlOut_NotEqual_$0() {
        setPicMthdRcmdSplSlOut_NotEqual_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力する
     */
    public void setPicMthdRcmdSplSlOut_NotEqual_$1() {
        setPicMthdRcmdSplSlOut_NotEqual_AsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$1);
    }

    protected void doSetPicMthdRcmdSplSlOut_NotEqual(String picMthdRcmdSplSlOut) {
        regPicMthdRcmdSplSlOut(CK_NES, picMthdRcmdSplSlOut);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdSplSlOutList The collection of picMthdRcmdSplSlOut as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_InScope(Collection<String> picMthdRcmdSplSlOutList) {
        doSetPicMthdRcmdSplSlOut_InScope(picMthdRcmdSplSlOutList);
    }

    /**
     * InScope {in ('a', 'b')}. As PicMthdRcmdListOut. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_InScope_AsPicMthdRcmdListOut(Collection<CDef.PicMthdRcmdListOut> cdefList) {
        doSetPicMthdRcmdSplSlOut_InScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdSplSlOut_InScope(Collection<String> picMthdRcmdSplSlOutList) {
        regINS(CK_INS, cTL(picMthdRcmdSplSlOutList), xgetCValuePicMthdRcmdSplSlOut(), "PIC_MTHD_RCMD_SPL_SL_OUT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @param picMthdRcmdSplSlOutList The collection of picMthdRcmdSplSlOut as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_NotInScope(Collection<String> picMthdRcmdSplSlOutList) {
        doSetPicMthdRcmdSplSlOut_NotInScope(picMthdRcmdSplSlOutList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PicMthdRcmdListOut. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdSplSlOut_NotInScope_AsPicMthdRcmdListOut(Collection<CDef.PicMthdRcmdListOut> cdefList) {
        doSetPicMthdRcmdSplSlOut_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPicMthdRcmdSplSlOut_NotInScope(Collection<String> picMthdRcmdSplSlOutList) {
        regINS(CK_NINS, cTL(picMthdRcmdSplSlOutList), xgetCValuePicMthdRcmdSplSlOut(), "PIC_MTHD_RCMD_SPL_SL_OUT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     */
    public void setPicMthdRcmdSplSlOut_IsNull() { regPicMthdRcmdSplSlOut(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     */
    public void setPicMthdRcmdSplSlOut_IsNotNull() { regPicMthdRcmdSplSlOut(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdSplSlOut(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdSplSlOut(), "PIC_MTHD_RCMD_SPL_SL_OUT"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdSplSlOut();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @param productLabelOutUnit The value of productLabelOutUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_Equal(String productLabelOutUnit) {
        doSetProductLabelOutUnit_Equal(fRES(productLabelOutUnit));
    }

    /**
     * Equal(=). As ProductLabelOutUnit. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_Equal_AsProductLabelOutUnit(CDef.ProductLabelOutUnit cdef) {
        doSetProductLabelOutUnit_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 1明細1枚
     */
    public void setProductLabelOutUnit_Equal_$0() {
        setProductLabelOutUnit_Equal_AsProductLabelOutUnit(CDef.ProductLabelOutUnit.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 荷姿毎に1枚(在庫最小単位は全体で1枚)
     */
    public void setProductLabelOutUnit_Equal_$1() {
        setProductLabelOutUnit_Equal_AsProductLabelOutUnit(CDef.ProductLabelOutUnit.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 在庫最小単位毎に1枚
     */
    public void setProductLabelOutUnit_Equal_$2() {
        setProductLabelOutUnit_Equal_AsProductLabelOutUnit(CDef.ProductLabelOutUnit.$2);
    }

    protected void doSetProductLabelOutUnit_Equal(String productLabelOutUnit) {
        regProductLabelOutUnit(CK_EQ, productLabelOutUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @param productLabelOutUnit The value of productLabelOutUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_NotEqual(String productLabelOutUnit) {
        doSetProductLabelOutUnit_NotEqual(fRES(productLabelOutUnit));
    }

    /**
     * NotEqual(&lt;&gt;). As ProductLabelOutUnit. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_NotEqual_AsProductLabelOutUnit(CDef.ProductLabelOutUnit cdef) {
        doSetProductLabelOutUnit_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 1明細1枚
     */
    public void setProductLabelOutUnit_NotEqual_$0() {
        setProductLabelOutUnit_NotEqual_AsProductLabelOutUnit(CDef.ProductLabelOutUnit.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 荷姿毎に1枚(在庫最小単位は全体で1枚)
     */
    public void setProductLabelOutUnit_NotEqual_$1() {
        setProductLabelOutUnit_NotEqual_AsProductLabelOutUnit(CDef.ProductLabelOutUnit.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 在庫最小単位毎に1枚
     */
    public void setProductLabelOutUnit_NotEqual_$2() {
        setProductLabelOutUnit_NotEqual_AsProductLabelOutUnit(CDef.ProductLabelOutUnit.$2);
    }

    protected void doSetProductLabelOutUnit_NotEqual(String productLabelOutUnit) {
        regProductLabelOutUnit(CK_NES, productLabelOutUnit);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @param productLabelOutUnitList The collection of productLabelOutUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_InScope(Collection<String> productLabelOutUnitList) {
        doSetProductLabelOutUnit_InScope(productLabelOutUnitList);
    }

    /**
     * InScope {in ('a', 'b')}. As ProductLabelOutUnit. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_InScope_AsProductLabelOutUnit(Collection<CDef.ProductLabelOutUnit> cdefList) {
        doSetProductLabelOutUnit_InScope(cTStrL(cdefList));
    }

    protected void doSetProductLabelOutUnit_InScope(Collection<String> productLabelOutUnitList) {
        regINS(CK_INS, cTL(productLabelOutUnitList), xgetCValueProductLabelOutUnit(), "PRODUCT_LABEL_OUT_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @param productLabelOutUnitList The collection of productLabelOutUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_NotInScope(Collection<String> productLabelOutUnitList) {
        doSetProductLabelOutUnit_NotInScope(productLabelOutUnitList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ProductLabelOutUnit. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelOutUnit_NotInScope_AsProductLabelOutUnit(Collection<CDef.ProductLabelOutUnit> cdefList) {
        doSetProductLabelOutUnit_NotInScope(cTStrL(cdefList));
    }

    protected void doSetProductLabelOutUnit_NotInScope(Collection<String> productLabelOutUnitList) {
        regINS(CK_NINS, cTL(productLabelOutUnitList), xgetCValueProductLabelOutUnit(), "PRODUCT_LABEL_OUT_UNIT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     */
    public void setProductLabelOutUnit_IsNull() { regProductLabelOutUnit(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     */
    public void setProductLabelOutUnit_IsNotNull() { regProductLabelOutUnit(CK_ISNN, DOBJ); }

    protected void regProductLabelOutUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelOutUnit(), "PRODUCT_LABEL_OUT_UNIT"); }
    protected abstract ConditionValue xgetCValueProductLabelOutUnit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @param resultAfterProductLabel The value of resultAfterProductLabel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_Equal(String resultAfterProductLabel) {
        doSetResultAfterProductLabel_Equal(fRES(resultAfterProductLabel));
    }

    /**
     * Equal(=). As ResultAfterProductLabel. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_Equal_AsResultAfterProductLabel(CDef.ResultAfterProductLabel cdef) {
        doSetResultAfterProductLabel_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setResultAfterProductLabel_Equal_$0() {
        setResultAfterProductLabel_Equal_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 画面で実績入力後のみ出力
     */
    public void setResultAfterProductLabel_Equal_$1() {
        setResultAfterProductLabel_Equal_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: HT/SDで実績入力後のみ出力
     */
    public void setResultAfterProductLabel_Equal_$2() {
        setResultAfterProductLabel_Equal_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 出力する
     */
    public void setResultAfterProductLabel_Equal_$3() {
        setResultAfterProductLabel_Equal_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$3);
    }

    protected void doSetResultAfterProductLabel_Equal(String resultAfterProductLabel) {
        regResultAfterProductLabel(CK_EQ, resultAfterProductLabel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @param resultAfterProductLabel The value of resultAfterProductLabel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_NotEqual(String resultAfterProductLabel) {
        doSetResultAfterProductLabel_NotEqual(fRES(resultAfterProductLabel));
    }

    /**
     * NotEqual(&lt;&gt;). As ResultAfterProductLabel. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_NotEqual_AsResultAfterProductLabel(CDef.ResultAfterProductLabel cdef) {
        doSetResultAfterProductLabel_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setResultAfterProductLabel_NotEqual_$0() {
        setResultAfterProductLabel_NotEqual_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 画面で実績入力後のみ出力
     */
    public void setResultAfterProductLabel_NotEqual_$1() {
        setResultAfterProductLabel_NotEqual_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: HT/SDで実績入力後のみ出力
     */
    public void setResultAfterProductLabel_NotEqual_$2() {
        setResultAfterProductLabel_NotEqual_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 出力する
     */
    public void setResultAfterProductLabel_NotEqual_$3() {
        setResultAfterProductLabel_NotEqual_AsResultAfterProductLabel(CDef.ResultAfterProductLabel.$3);
    }

    protected void doSetResultAfterProductLabel_NotEqual(String resultAfterProductLabel) {
        regResultAfterProductLabel(CK_NES, resultAfterProductLabel);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @param resultAfterProductLabelList The collection of resultAfterProductLabel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_InScope(Collection<String> resultAfterProductLabelList) {
        doSetResultAfterProductLabel_InScope(resultAfterProductLabelList);
    }

    /**
     * InScope {in ('a', 'b')}. As ResultAfterProductLabel. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_InScope_AsResultAfterProductLabel(Collection<CDef.ResultAfterProductLabel> cdefList) {
        doSetResultAfterProductLabel_InScope(cTStrL(cdefList));
    }

    protected void doSetResultAfterProductLabel_InScope(Collection<String> resultAfterProductLabelList) {
        regINS(CK_INS, cTL(resultAfterProductLabelList), xgetCValueResultAfterProductLabel(), "RESULT_AFTER_PRODUCT_LABEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @param resultAfterProductLabelList The collection of resultAfterProductLabel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_NotInScope(Collection<String> resultAfterProductLabelList) {
        doSetResultAfterProductLabel_NotInScope(resultAfterProductLabelList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ResultAfterProductLabel. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductLabel_NotInScope_AsResultAfterProductLabel(Collection<CDef.ResultAfterProductLabel> cdefList) {
        doSetResultAfterProductLabel_NotInScope(cTStrL(cdefList));
    }

    protected void doSetResultAfterProductLabel_NotInScope(Collection<String> resultAfterProductLabelList) {
        regINS(CK_NINS, cTL(resultAfterProductLabelList), xgetCValueResultAfterProductLabel(), "RESULT_AFTER_PRODUCT_LABEL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     */
    public void setResultAfterProductLabel_IsNull() { regResultAfterProductLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     */
    public void setResultAfterProductLabel_IsNotNull() { regResultAfterProductLabel(CK_ISNN, DOBJ); }

    protected void regResultAfterProductLabel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResultAfterProductLabel(), "RESULT_AFTER_PRODUCT_LABEL"); }
    protected abstract ConditionValue xgetCValueResultAfterProductLabel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @param resultAfterProductTarget The value of resultAfterProductTarget as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_Equal(String resultAfterProductTarget) {
        doSetResultAfterProductTarget_Equal(fRES(resultAfterProductTarget));
    }

    /**
     * Equal(=). As ResultAfterProductTarget. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_Equal_AsResultAfterProductTarget(CDef.ResultAfterProductTarget cdef) {
        doSetResultAfterProductTarget_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 入庫ラベル
     */
    public void setResultAfterProductTarget_Equal_$1() {
        setResultAfterProductTarget_Equal_AsResultAfterProductTarget(CDef.ResultAfterProductTarget.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 商品ラベル
     */
    public void setResultAfterProductTarget_Equal_$2() {
        setResultAfterProductTarget_Equal_AsResultAfterProductTarget(CDef.ResultAfterProductTarget.$2);
    }

    protected void doSetResultAfterProductTarget_Equal(String resultAfterProductTarget) {
        regResultAfterProductTarget(CK_EQ, resultAfterProductTarget);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @param resultAfterProductTarget The value of resultAfterProductTarget as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_NotEqual(String resultAfterProductTarget) {
        doSetResultAfterProductTarget_NotEqual(fRES(resultAfterProductTarget));
    }

    /**
     * NotEqual(&lt;&gt;). As ResultAfterProductTarget. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_NotEqual_AsResultAfterProductTarget(CDef.ResultAfterProductTarget cdef) {
        doSetResultAfterProductTarget_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 入庫ラベル
     */
    public void setResultAfterProductTarget_NotEqual_$1() {
        setResultAfterProductTarget_NotEqual_AsResultAfterProductTarget(CDef.ResultAfterProductTarget.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 商品ラベル
     */
    public void setResultAfterProductTarget_NotEqual_$2() {
        setResultAfterProductTarget_NotEqual_AsResultAfterProductTarget(CDef.ResultAfterProductTarget.$2);
    }

    protected void doSetResultAfterProductTarget_NotEqual(String resultAfterProductTarget) {
        regResultAfterProductTarget(CK_NES, resultAfterProductTarget);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @param resultAfterProductTargetList The collection of resultAfterProductTarget as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_InScope(Collection<String> resultAfterProductTargetList) {
        doSetResultAfterProductTarget_InScope(resultAfterProductTargetList);
    }

    /**
     * InScope {in ('a', 'b')}. As ResultAfterProductTarget. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_InScope_AsResultAfterProductTarget(Collection<CDef.ResultAfterProductTarget> cdefList) {
        doSetResultAfterProductTarget_InScope(cTStrL(cdefList));
    }

    protected void doSetResultAfterProductTarget_InScope(Collection<String> resultAfterProductTargetList) {
        regINS(CK_INS, cTL(resultAfterProductTargetList), xgetCValueResultAfterProductTarget(), "RESULT_AFTER_PRODUCT_TARGET");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @param resultAfterProductTargetList The collection of resultAfterProductTarget as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_NotInScope(Collection<String> resultAfterProductTargetList) {
        doSetResultAfterProductTarget_NotInScope(resultAfterProductTargetList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ResultAfterProductTarget. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultAfterProductTarget_NotInScope_AsResultAfterProductTarget(Collection<CDef.ResultAfterProductTarget> cdefList) {
        doSetResultAfterProductTarget_NotInScope(cTStrL(cdefList));
    }

    protected void doSetResultAfterProductTarget_NotInScope(Collection<String> resultAfterProductTargetList) {
        regINS(CK_NINS, cTL(resultAfterProductTargetList), xgetCValueResultAfterProductTarget(), "RESULT_AFTER_PRODUCT_TARGET");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     */
    public void setResultAfterProductTarget_IsNull() { regResultAfterProductTarget(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     */
    public void setResultAfterProductTarget_IsNotNull() { regResultAfterProductTarget(CK_ISNN, DOBJ); }

    protected void regResultAfterProductTarget(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResultAfterProductTarget(), "RESULT_AFTER_PRODUCT_TARGET"); }
    protected abstract ConditionValue xgetCValueResultAfterProductTarget();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @param productLabelJanBarcode The value of productLabelJanBarcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_Equal(String productLabelJanBarcode) {
        doSetProductLabelJanBarcode_Equal(fRES(productLabelJanBarcode));
    }

    /**
     * Equal(=). As ProductLabelJanBarcode. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルソースCDバーコード種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_Equal_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode cdef) {
        doSetProductLabelJanBarcode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $CODABAR (CODABAR). And OnlyOnceRegistered. <br>
     * $CODABAR: CODABAR(NW-7)
     */
    public void setProductLabelJanBarcode_Equal_$CODABAR() {
        setProductLabelJanBarcode_Equal_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODABAR);
    }

    /**
     * Equal(=). As $CODE128 (CODE128). And OnlyOnceRegistered. <br>
     * $CODE128: CODE128
     */
    public void setProductLabelJanBarcode_Equal_$CODE128() {
        setProductLabelJanBarcode_Equal_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODE128);
    }

    /**
     * Equal(=). As $CODE39 (CODE39). And OnlyOnceRegistered. <br>
     * $CODE39: CODE39
     */
    public void setProductLabelJanBarcode_Equal_$CODE39() {
        setProductLabelJanBarcode_Equal_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODE39);
    }

    /**
     * Equal(=). As $ITF (ITF). And OnlyOnceRegistered. <br>
     * $ITF: ITF
     */
    public void setProductLabelJanBarcode_Equal_$ITF() {
        setProductLabelJanBarcode_Equal_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$ITF);
    }

    /**
     * Equal(=). As $JAN (JAN). And OnlyOnceRegistered. <br>
     * $JAN: JAN(8or13)
     */
    public void setProductLabelJanBarcode_Equal_$JAN() {
        setProductLabelJanBarcode_Equal_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$JAN);
    }

    protected void doSetProductLabelJanBarcode_Equal(String productLabelJanBarcode) {
        regProductLabelJanBarcode(CK_EQ, productLabelJanBarcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @param productLabelJanBarcode The value of productLabelJanBarcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_NotEqual(String productLabelJanBarcode) {
        doSetProductLabelJanBarcode_NotEqual(fRES(productLabelJanBarcode));
    }

    /**
     * NotEqual(&lt;&gt;). As ProductLabelJanBarcode. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルソースCDバーコード種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_NotEqual_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode cdef) {
        doSetProductLabelJanBarcode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $CODABAR (CODABAR). And OnlyOnceRegistered. <br>
     * $CODABAR: CODABAR(NW-7)
     */
    public void setProductLabelJanBarcode_NotEqual_$CODABAR() {
        setProductLabelJanBarcode_NotEqual_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODABAR);
    }

    /**
     * NotEqual(&lt;&gt;). As $CODE128 (CODE128). And OnlyOnceRegistered. <br>
     * $CODE128: CODE128
     */
    public void setProductLabelJanBarcode_NotEqual_$CODE128() {
        setProductLabelJanBarcode_NotEqual_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODE128);
    }

    /**
     * NotEqual(&lt;&gt;). As $CODE39 (CODE39). And OnlyOnceRegistered. <br>
     * $CODE39: CODE39
     */
    public void setProductLabelJanBarcode_NotEqual_$CODE39() {
        setProductLabelJanBarcode_NotEqual_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODE39);
    }

    /**
     * NotEqual(&lt;&gt;). As $ITF (ITF). And OnlyOnceRegistered. <br>
     * $ITF: ITF
     */
    public void setProductLabelJanBarcode_NotEqual_$ITF() {
        setProductLabelJanBarcode_NotEqual_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$ITF);
    }

    /**
     * NotEqual(&lt;&gt;). As $JAN (JAN). And OnlyOnceRegistered. <br>
     * $JAN: JAN(8or13)
     */
    public void setProductLabelJanBarcode_NotEqual_$JAN() {
        setProductLabelJanBarcode_NotEqual_AsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$JAN);
    }

    protected void doSetProductLabelJanBarcode_NotEqual(String productLabelJanBarcode) {
        regProductLabelJanBarcode(CK_NES, productLabelJanBarcode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @param productLabelJanBarcodeList The collection of productLabelJanBarcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_InScope(Collection<String> productLabelJanBarcodeList) {
        doSetProductLabelJanBarcode_InScope(productLabelJanBarcodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ProductLabelJanBarcode. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルソースCDバーコード種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_InScope_AsProductLabelJanBarcode(Collection<CDef.ProductLabelJanBarcode> cdefList) {
        doSetProductLabelJanBarcode_InScope(cTStrL(cdefList));
    }

    protected void doSetProductLabelJanBarcode_InScope(Collection<String> productLabelJanBarcodeList) {
        regINS(CK_INS, cTL(productLabelJanBarcodeList), xgetCValueProductLabelJanBarcode(), "PRODUCT_LABEL_JAN_BARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @param productLabelJanBarcodeList The collection of productLabelJanBarcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_NotInScope(Collection<String> productLabelJanBarcodeList) {
        doSetProductLabelJanBarcode_NotInScope(productLabelJanBarcodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ProductLabelJanBarcode. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルソースCDバーコード種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanBarcode_NotInScope_AsProductLabelJanBarcode(Collection<CDef.ProductLabelJanBarcode> cdefList) {
        doSetProductLabelJanBarcode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetProductLabelJanBarcode_NotInScope(Collection<String> productLabelJanBarcodeList) {
        regINS(CK_NINS, cTL(productLabelJanBarcodeList), xgetCValueProductLabelJanBarcode(), "PRODUCT_LABEL_JAN_BARCODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     */
    public void setProductLabelJanBarcode_IsNull() { regProductLabelJanBarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     */
    public void setProductLabelJanBarcode_IsNullOrEmpty() { regProductLabelJanBarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     */
    public void setProductLabelJanBarcode_IsNotNull() { regProductLabelJanBarcode(CK_ISNN, DOBJ); }

    protected void regProductLabelJanBarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelJanBarcode(), "PRODUCT_LABEL_JAN_BARCODE"); }
    protected abstract ConditionValue xgetCValueProductLabelJanBarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @param productLabelProdBarcode The value of productLabelProdBarcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_Equal(String productLabelProdBarcode) {
        doSetProductLabelProdBarcode_Equal(fRES(productLabelProdBarcode));
    }

    /**
     * Equal(=). As ProductLabelProdBarcode. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_Equal_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode cdef) {
        doSetProductLabelProdBarcode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $CODABAR (CODABAR). And OnlyOnceRegistered. <br>
     * $CODABAR: CODABAR(NW-7)
     */
    public void setProductLabelProdBarcode_Equal_$CODABAR() {
        setProductLabelProdBarcode_Equal_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODABAR);
    }

    /**
     * Equal(=). As $CODE128 (CODE128). And OnlyOnceRegistered. <br>
     * $CODE128: CODE128
     */
    public void setProductLabelProdBarcode_Equal_$CODE128() {
        setProductLabelProdBarcode_Equal_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODE128);
    }

    /**
     * Equal(=). As $CODE39 (CODE39). And OnlyOnceRegistered. <br>
     * $CODE39: CODE39
     */
    public void setProductLabelProdBarcode_Equal_$CODE39() {
        setProductLabelProdBarcode_Equal_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODE39);
    }

    /**
     * Equal(=). As $ITF (ITF). And OnlyOnceRegistered. <br>
     * $ITF: ITF
     */
    public void setProductLabelProdBarcode_Equal_$ITF() {
        setProductLabelProdBarcode_Equal_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$ITF);
    }

    /**
     * Equal(=). As $JAN (JAN). And OnlyOnceRegistered. <br>
     * $JAN: JAN(8or13)
     */
    public void setProductLabelProdBarcode_Equal_$JAN() {
        setProductLabelProdBarcode_Equal_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$JAN);
    }

    protected void doSetProductLabelProdBarcode_Equal(String productLabelProdBarcode) {
        regProductLabelProdBarcode(CK_EQ, productLabelProdBarcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @param productLabelProdBarcode The value of productLabelProdBarcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_NotEqual(String productLabelProdBarcode) {
        doSetProductLabelProdBarcode_NotEqual(fRES(productLabelProdBarcode));
    }

    /**
     * NotEqual(&lt;&gt;). As ProductLabelProdBarcode. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_NotEqual_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode cdef) {
        doSetProductLabelProdBarcode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $CODABAR (CODABAR). And OnlyOnceRegistered. <br>
     * $CODABAR: CODABAR(NW-7)
     */
    public void setProductLabelProdBarcode_NotEqual_$CODABAR() {
        setProductLabelProdBarcode_NotEqual_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODABAR);
    }

    /**
     * NotEqual(&lt;&gt;). As $CODE128 (CODE128). And OnlyOnceRegistered. <br>
     * $CODE128: CODE128
     */
    public void setProductLabelProdBarcode_NotEqual_$CODE128() {
        setProductLabelProdBarcode_NotEqual_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODE128);
    }

    /**
     * NotEqual(&lt;&gt;). As $CODE39 (CODE39). And OnlyOnceRegistered. <br>
     * $CODE39: CODE39
     */
    public void setProductLabelProdBarcode_NotEqual_$CODE39() {
        setProductLabelProdBarcode_NotEqual_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODE39);
    }

    /**
     * NotEqual(&lt;&gt;). As $ITF (ITF). And OnlyOnceRegistered. <br>
     * $ITF: ITF
     */
    public void setProductLabelProdBarcode_NotEqual_$ITF() {
        setProductLabelProdBarcode_NotEqual_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$ITF);
    }

    /**
     * NotEqual(&lt;&gt;). As $JAN (JAN). And OnlyOnceRegistered. <br>
     * $JAN: JAN(8or13)
     */
    public void setProductLabelProdBarcode_NotEqual_$JAN() {
        setProductLabelProdBarcode_NotEqual_AsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$JAN);
    }

    protected void doSetProductLabelProdBarcode_NotEqual(String productLabelProdBarcode) {
        regProductLabelProdBarcode(CK_NES, productLabelProdBarcode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @param productLabelProdBarcodeList The collection of productLabelProdBarcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_InScope(Collection<String> productLabelProdBarcodeList) {
        doSetProductLabelProdBarcode_InScope(productLabelProdBarcodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ProductLabelProdBarcode. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_InScope_AsProductLabelProdBarcode(Collection<CDef.ProductLabelProdBarcode> cdefList) {
        doSetProductLabelProdBarcode_InScope(cTStrL(cdefList));
    }

    protected void doSetProductLabelProdBarcode_InScope(Collection<String> productLabelProdBarcodeList) {
        regINS(CK_INS, cTL(productLabelProdBarcodeList), xgetCValueProductLabelProdBarcode(), "PRODUCT_LABEL_PROD_BARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @param productLabelProdBarcodeList The collection of productLabelProdBarcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_NotInScope(Collection<String> productLabelProdBarcodeList) {
        doSetProductLabelProdBarcode_NotInScope(productLabelProdBarcodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ProductLabelProdBarcode. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdBarcode_NotInScope_AsProductLabelProdBarcode(Collection<CDef.ProductLabelProdBarcode> cdefList) {
        doSetProductLabelProdBarcode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetProductLabelProdBarcode_NotInScope(Collection<String> productLabelProdBarcodeList) {
        regINS(CK_NINS, cTL(productLabelProdBarcodeList), xgetCValueProductLabelProdBarcode(), "PRODUCT_LABEL_PROD_BARCODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     */
    public void setProductLabelProdBarcode_IsNull() { regProductLabelProdBarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     */
    public void setProductLabelProdBarcode_IsNullOrEmpty() { regProductLabelProdBarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     */
    public void setProductLabelProdBarcode_IsNotNull() { regProductLabelProdBarcode(CK_ISNN, DOBJ); }

    protected void regProductLabelProdBarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelProdBarcode(), "PRODUCT_LABEL_PROD_BARCODE"); }
    protected abstract ConditionValue xgetCValueProductLabelProdBarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_Equal(String productLabelJanStartbit) {
        doSetProductLabelJanStartbit_Equal(fRES(productLabelJanStartbit));
    }

    protected void doSetProductLabelJanStartbit_Equal(String productLabelJanStartbit) {
        regProductLabelJanStartbit(CK_EQ, productLabelJanStartbit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_NotEqual(String productLabelJanStartbit) {
        doSetProductLabelJanStartbit_NotEqual(fRES(productLabelJanStartbit));
    }

    protected void doSetProductLabelJanStartbit_NotEqual(String productLabelJanStartbit) {
        regProductLabelJanStartbit(CK_NES, productLabelJanStartbit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_GreaterThan(String productLabelJanStartbit) {
        regProductLabelJanStartbit(CK_GT, fRES(productLabelJanStartbit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_LessThan(String productLabelJanStartbit) {
        regProductLabelJanStartbit(CK_LT, fRES(productLabelJanStartbit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_GreaterEqual(String productLabelJanStartbit) {
        regProductLabelJanStartbit(CK_GE, fRES(productLabelJanStartbit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_LessEqual(String productLabelJanStartbit) {
        regProductLabelJanStartbit(CK_LE, fRES(productLabelJanStartbit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbitList The collection of productLabelJanStartbit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_InScope(Collection<String> productLabelJanStartbitList) {
        doSetProductLabelJanStartbit_InScope(productLabelJanStartbitList);
    }

    protected void doSetProductLabelJanStartbit_InScope(Collection<String> productLabelJanStartbitList) {
        regINS(CK_INS, cTL(productLabelJanStartbitList), xgetCValueProductLabelJanStartbit(), "PRODUCT_LABEL_JAN_STARTBIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbitList The collection of productLabelJanStartbit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_NotInScope(Collection<String> productLabelJanStartbitList) {
        doSetProductLabelJanStartbit_NotInScope(productLabelJanStartbitList);
    }

    protected void doSetProductLabelJanStartbit_NotInScope(Collection<String> productLabelJanStartbitList) {
        regINS(CK_NINS, cTL(productLabelJanStartbitList), xgetCValueProductLabelJanStartbit(), "PRODUCT_LABEL_JAN_STARTBIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} <br>
     * <pre>e.g. setProductLabelJanStartbit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productLabelJanStartbit The value of productLabelJanStartbit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductLabelJanStartbit_LikeSearch(String productLabelJanStartbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productLabelJanStartbit), xgetCValueProductLabelJanStartbit(), "PRODUCT_LABEL_JAN_STARTBIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductLabelJanStartbit_NotLikeSearch(String productLabelJanStartbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productLabelJanStartbit), xgetCValueProductLabelJanStartbit(), "PRODUCT_LABEL_JAN_STARTBIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @param productLabelJanStartbit The value of productLabelJanStartbit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanStartbit_PrefixSearch(String productLabelJanStartbit) {
        setProductLabelJanStartbit_LikeSearch(productLabelJanStartbit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     */
    public void setProductLabelJanStartbit_IsNull() { regProductLabelJanStartbit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     */
    public void setProductLabelJanStartbit_IsNullOrEmpty() { regProductLabelJanStartbit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     */
    public void setProductLabelJanStartbit_IsNotNull() { regProductLabelJanStartbit(CK_ISNN, DOBJ); }

    protected void regProductLabelJanStartbit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelJanStartbit(), "PRODUCT_LABEL_JAN_STARTBIT"); }
    protected abstract ConditionValue xgetCValueProductLabelJanStartbit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_Equal(String productLabelJanEndbit) {
        doSetProductLabelJanEndbit_Equal(fRES(productLabelJanEndbit));
    }

    protected void doSetProductLabelJanEndbit_Equal(String productLabelJanEndbit) {
        regProductLabelJanEndbit(CK_EQ, productLabelJanEndbit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_NotEqual(String productLabelJanEndbit) {
        doSetProductLabelJanEndbit_NotEqual(fRES(productLabelJanEndbit));
    }

    protected void doSetProductLabelJanEndbit_NotEqual(String productLabelJanEndbit) {
        regProductLabelJanEndbit(CK_NES, productLabelJanEndbit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_GreaterThan(String productLabelJanEndbit) {
        regProductLabelJanEndbit(CK_GT, fRES(productLabelJanEndbit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_LessThan(String productLabelJanEndbit) {
        regProductLabelJanEndbit(CK_LT, fRES(productLabelJanEndbit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_GreaterEqual(String productLabelJanEndbit) {
        regProductLabelJanEndbit(CK_GE, fRES(productLabelJanEndbit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_LessEqual(String productLabelJanEndbit) {
        regProductLabelJanEndbit(CK_LE, fRES(productLabelJanEndbit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbitList The collection of productLabelJanEndbit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_InScope(Collection<String> productLabelJanEndbitList) {
        doSetProductLabelJanEndbit_InScope(productLabelJanEndbitList);
    }

    protected void doSetProductLabelJanEndbit_InScope(Collection<String> productLabelJanEndbitList) {
        regINS(CK_INS, cTL(productLabelJanEndbitList), xgetCValueProductLabelJanEndbit(), "PRODUCT_LABEL_JAN_ENDBIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbitList The collection of productLabelJanEndbit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_NotInScope(Collection<String> productLabelJanEndbitList) {
        doSetProductLabelJanEndbit_NotInScope(productLabelJanEndbitList);
    }

    protected void doSetProductLabelJanEndbit_NotInScope(Collection<String> productLabelJanEndbitList) {
        regINS(CK_NINS, cTL(productLabelJanEndbitList), xgetCValueProductLabelJanEndbit(), "PRODUCT_LABEL_JAN_ENDBIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} <br>
     * <pre>e.g. setProductLabelJanEndbit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productLabelJanEndbit The value of productLabelJanEndbit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductLabelJanEndbit_LikeSearch(String productLabelJanEndbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productLabelJanEndbit), xgetCValueProductLabelJanEndbit(), "PRODUCT_LABEL_JAN_ENDBIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductLabelJanEndbit_NotLikeSearch(String productLabelJanEndbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productLabelJanEndbit), xgetCValueProductLabelJanEndbit(), "PRODUCT_LABEL_JAN_ENDBIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @param productLabelJanEndbit The value of productLabelJanEndbit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelJanEndbit_PrefixSearch(String productLabelJanEndbit) {
        setProductLabelJanEndbit_LikeSearch(productLabelJanEndbit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     */
    public void setProductLabelJanEndbit_IsNull() { regProductLabelJanEndbit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     */
    public void setProductLabelJanEndbit_IsNullOrEmpty() { regProductLabelJanEndbit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     */
    public void setProductLabelJanEndbit_IsNotNull() { regProductLabelJanEndbit(CK_ISNN, DOBJ); }

    protected void regProductLabelJanEndbit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelJanEndbit(), "PRODUCT_LABEL_JAN_ENDBIT"); }
    protected abstract ConditionValue xgetCValueProductLabelJanEndbit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_Equal(String productLabelProdStartbit) {
        doSetProductLabelProdStartbit_Equal(fRES(productLabelProdStartbit));
    }

    protected void doSetProductLabelProdStartbit_Equal(String productLabelProdStartbit) {
        regProductLabelProdStartbit(CK_EQ, productLabelProdStartbit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_NotEqual(String productLabelProdStartbit) {
        doSetProductLabelProdStartbit_NotEqual(fRES(productLabelProdStartbit));
    }

    protected void doSetProductLabelProdStartbit_NotEqual(String productLabelProdStartbit) {
        regProductLabelProdStartbit(CK_NES, productLabelProdStartbit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_GreaterThan(String productLabelProdStartbit) {
        regProductLabelProdStartbit(CK_GT, fRES(productLabelProdStartbit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_LessThan(String productLabelProdStartbit) {
        regProductLabelProdStartbit(CK_LT, fRES(productLabelProdStartbit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_GreaterEqual(String productLabelProdStartbit) {
        regProductLabelProdStartbit(CK_GE, fRES(productLabelProdStartbit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_LessEqual(String productLabelProdStartbit) {
        regProductLabelProdStartbit(CK_LE, fRES(productLabelProdStartbit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbitList The collection of productLabelProdStartbit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_InScope(Collection<String> productLabelProdStartbitList) {
        doSetProductLabelProdStartbit_InScope(productLabelProdStartbitList);
    }

    protected void doSetProductLabelProdStartbit_InScope(Collection<String> productLabelProdStartbitList) {
        regINS(CK_INS, cTL(productLabelProdStartbitList), xgetCValueProductLabelProdStartbit(), "PRODUCT_LABEL_PROD_STARTBIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbitList The collection of productLabelProdStartbit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_NotInScope(Collection<String> productLabelProdStartbitList) {
        doSetProductLabelProdStartbit_NotInScope(productLabelProdStartbitList);
    }

    protected void doSetProductLabelProdStartbit_NotInScope(Collection<String> productLabelProdStartbitList) {
        regINS(CK_NINS, cTL(productLabelProdStartbitList), xgetCValueProductLabelProdStartbit(), "PRODUCT_LABEL_PROD_STARTBIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} <br>
     * <pre>e.g. setProductLabelProdStartbit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productLabelProdStartbit The value of productLabelProdStartbit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductLabelProdStartbit_LikeSearch(String productLabelProdStartbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productLabelProdStartbit), xgetCValueProductLabelProdStartbit(), "PRODUCT_LABEL_PROD_STARTBIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductLabelProdStartbit_NotLikeSearch(String productLabelProdStartbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productLabelProdStartbit), xgetCValueProductLabelProdStartbit(), "PRODUCT_LABEL_PROD_STARTBIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @param productLabelProdStartbit The value of productLabelProdStartbit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdStartbit_PrefixSearch(String productLabelProdStartbit) {
        setProductLabelProdStartbit_LikeSearch(productLabelProdStartbit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     */
    public void setProductLabelProdStartbit_IsNull() { regProductLabelProdStartbit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     */
    public void setProductLabelProdStartbit_IsNullOrEmpty() { regProductLabelProdStartbit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     */
    public void setProductLabelProdStartbit_IsNotNull() { regProductLabelProdStartbit(CK_ISNN, DOBJ); }

    protected void regProductLabelProdStartbit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelProdStartbit(), "PRODUCT_LABEL_PROD_STARTBIT"); }
    protected abstract ConditionValue xgetCValueProductLabelProdStartbit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_Equal(String productLabelProdEndbit) {
        doSetProductLabelProdEndbit_Equal(fRES(productLabelProdEndbit));
    }

    protected void doSetProductLabelProdEndbit_Equal(String productLabelProdEndbit) {
        regProductLabelProdEndbit(CK_EQ, productLabelProdEndbit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_NotEqual(String productLabelProdEndbit) {
        doSetProductLabelProdEndbit_NotEqual(fRES(productLabelProdEndbit));
    }

    protected void doSetProductLabelProdEndbit_NotEqual(String productLabelProdEndbit) {
        regProductLabelProdEndbit(CK_NES, productLabelProdEndbit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_GreaterThan(String productLabelProdEndbit) {
        regProductLabelProdEndbit(CK_GT, fRES(productLabelProdEndbit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_LessThan(String productLabelProdEndbit) {
        regProductLabelProdEndbit(CK_LT, fRES(productLabelProdEndbit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_GreaterEqual(String productLabelProdEndbit) {
        regProductLabelProdEndbit(CK_GE, fRES(productLabelProdEndbit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_LessEqual(String productLabelProdEndbit) {
        regProductLabelProdEndbit(CK_LE, fRES(productLabelProdEndbit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbitList The collection of productLabelProdEndbit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_InScope(Collection<String> productLabelProdEndbitList) {
        doSetProductLabelProdEndbit_InScope(productLabelProdEndbitList);
    }

    protected void doSetProductLabelProdEndbit_InScope(Collection<String> productLabelProdEndbitList) {
        regINS(CK_INS, cTL(productLabelProdEndbitList), xgetCValueProductLabelProdEndbit(), "PRODUCT_LABEL_PROD_ENDBIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbitList The collection of productLabelProdEndbit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_NotInScope(Collection<String> productLabelProdEndbitList) {
        doSetProductLabelProdEndbit_NotInScope(productLabelProdEndbitList);
    }

    protected void doSetProductLabelProdEndbit_NotInScope(Collection<String> productLabelProdEndbitList) {
        regINS(CK_NINS, cTL(productLabelProdEndbitList), xgetCValueProductLabelProdEndbit(), "PRODUCT_LABEL_PROD_ENDBIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} <br>
     * <pre>e.g. setProductLabelProdEndbit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productLabelProdEndbit The value of productLabelProdEndbit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductLabelProdEndbit_LikeSearch(String productLabelProdEndbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productLabelProdEndbit), xgetCValueProductLabelProdEndbit(), "PRODUCT_LABEL_PROD_ENDBIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductLabelProdEndbit_NotLikeSearch(String productLabelProdEndbit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productLabelProdEndbit), xgetCValueProductLabelProdEndbit(), "PRODUCT_LABEL_PROD_ENDBIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @param productLabelProdEndbit The value of productLabelProdEndbit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductLabelProdEndbit_PrefixSearch(String productLabelProdEndbit) {
        setProductLabelProdEndbit_LikeSearch(productLabelProdEndbit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     */
    public void setProductLabelProdEndbit_IsNull() { regProductLabelProdEndbit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     */
    public void setProductLabelProdEndbit_IsNullOrEmpty() { regProductLabelProdEndbit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     */
    public void setProductLabelProdEndbit_IsNotNull() { regProductLabelProdEndbit(CK_ISNN, DOBJ); }

    protected void regProductLabelProdEndbit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductLabelProdEndbit(), "PRODUCT_LABEL_PROD_ENDBIT"); }
    protected abstract ConditionValue xgetCValueProductLabelProdEndbit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @param boxSelectSkip The value of boxSelectSkip as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_Equal(String boxSelectSkip) {
        doSetBoxSelectSkip_Equal(fRES(boxSelectSkip));
    }

    /**
     * Equal(=). As BoxSelectSkip. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_Equal_AsBoxSelectSkip(CDef.BoxSelectSkip cdef) {
        doSetBoxSelectSkip_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: スキップしない
     */
    public void setBoxSelectSkip_Equal_$0() {
        setBoxSelectSkip_Equal_AsBoxSelectSkip(CDef.BoxSelectSkip.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: スキップする
     */
    public void setBoxSelectSkip_Equal_$1() {
        setBoxSelectSkip_Equal_AsBoxSelectSkip(CDef.BoxSelectSkip.$1);
    }

    protected void doSetBoxSelectSkip_Equal(String boxSelectSkip) {
        regBoxSelectSkip(CK_EQ, boxSelectSkip);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @param boxSelectSkip The value of boxSelectSkip as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_NotEqual(String boxSelectSkip) {
        doSetBoxSelectSkip_NotEqual(fRES(boxSelectSkip));
    }

    /**
     * NotEqual(&lt;&gt;). As BoxSelectSkip. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_NotEqual_AsBoxSelectSkip(CDef.BoxSelectSkip cdef) {
        doSetBoxSelectSkip_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: スキップしない
     */
    public void setBoxSelectSkip_NotEqual_$0() {
        setBoxSelectSkip_NotEqual_AsBoxSelectSkip(CDef.BoxSelectSkip.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: スキップする
     */
    public void setBoxSelectSkip_NotEqual_$1() {
        setBoxSelectSkip_NotEqual_AsBoxSelectSkip(CDef.BoxSelectSkip.$1);
    }

    protected void doSetBoxSelectSkip_NotEqual(String boxSelectSkip) {
        regBoxSelectSkip(CK_NES, boxSelectSkip);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @param boxSelectSkipList The collection of boxSelectSkip as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_InScope(Collection<String> boxSelectSkipList) {
        doSetBoxSelectSkip_InScope(boxSelectSkipList);
    }

    /**
     * InScope {in ('a', 'b')}. As BoxSelectSkip. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_InScope_AsBoxSelectSkip(Collection<CDef.BoxSelectSkip> cdefList) {
        doSetBoxSelectSkip_InScope(cTStrL(cdefList));
    }

    protected void doSetBoxSelectSkip_InScope(Collection<String> boxSelectSkipList) {
        regINS(CK_INS, cTL(boxSelectSkipList), xgetCValueBoxSelectSkip(), "BOX_SELECT_SKIP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @param boxSelectSkipList The collection of boxSelectSkip as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_NotInScope(Collection<String> boxSelectSkipList) {
        doSetBoxSelectSkip_NotInScope(boxSelectSkipList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As BoxSelectSkip. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSelectSkip_NotInScope_AsBoxSelectSkip(Collection<CDef.BoxSelectSkip> cdefList) {
        doSetBoxSelectSkip_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBoxSelectSkip_NotInScope(Collection<String> boxSelectSkipList) {
        regINS(CK_NINS, cTL(boxSelectSkipList), xgetCValueBoxSelectSkip(), "BOX_SELECT_SKIP");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     */
    public void setBoxSelectSkip_IsNull() { regBoxSelectSkip(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     */
    public void setBoxSelectSkip_IsNotNull() { regBoxSelectSkip(CK_ISNN, DOBJ); }

    protected void regBoxSelectSkip(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxSelectSkip(), "BOX_SELECT_SKIP"); }
    protected abstract ConditionValue xgetCValueBoxSelectSkip();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxId The value of defaultBoxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultBoxId_Equal(Long defaultBoxId) {
        doSetDefaultBoxId_Equal(defaultBoxId);
    }

    protected void doSetDefaultBoxId_Equal(Long defaultBoxId) {
        regDefaultBoxId(CK_EQ, defaultBoxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxId The value of defaultBoxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultBoxId_NotEqual(Long defaultBoxId) {
        doSetDefaultBoxId_NotEqual(defaultBoxId);
    }

    protected void doSetDefaultBoxId_NotEqual(Long defaultBoxId) {
        regDefaultBoxId(CK_NES, defaultBoxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxId The value of defaultBoxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultBoxId_GreaterThan(Long defaultBoxId) {
        regDefaultBoxId(CK_GT, defaultBoxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxId The value of defaultBoxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultBoxId_LessThan(Long defaultBoxId) {
        regDefaultBoxId(CK_LT, defaultBoxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxId The value of defaultBoxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultBoxId_GreaterEqual(Long defaultBoxId) {
        regDefaultBoxId(CK_GE, defaultBoxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxId The value of defaultBoxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultBoxId_LessEqual(Long defaultBoxId) {
        regDefaultBoxId(CK_LE, defaultBoxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param minNumber The min number of defaultBoxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultBoxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefaultBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefaultBoxId(), "DEFAULT_BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxIdList The collection of defaultBoxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultBoxId_InScope(Collection<Long> defaultBoxIdList) {
        doSetDefaultBoxId_InScope(defaultBoxIdList);
    }

    protected void doSetDefaultBoxId_InScope(Collection<Long> defaultBoxIdList) {
        regINS(CK_INS, cTL(defaultBoxIdList), xgetCValueDefaultBoxId(), "DEFAULT_BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param defaultBoxIdList The collection of defaultBoxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultBoxId_NotInScope(Collection<Long> defaultBoxIdList) {
        doSetDefaultBoxId_NotInScope(defaultBoxIdList);
    }

    protected void doSetDefaultBoxId_NotInScope(Collection<Long> defaultBoxIdList) {
        regINS(CK_NINS, cTL(defaultBoxIdList), xgetCValueDefaultBoxId(), "DEFAULT_BOX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DEFAULT_BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'in-scope'. (NotNull)
     */
    public void inScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDefaultBoxId_InScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "DEFAULT_BOX_ID", "BOX_ID", pp, "mBox", false);
    }
    public abstract String keepDefaultBoxId_InScopeRelation_MBox(MBoxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DEFAULT_BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDefaultBoxId_NotInScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "DEFAULT_BOX_ID", "BOX_ID", pp, "mBox", true);
    }
    public abstract String keepDefaultBoxId_NotInScopeRelation_MBox(MBoxCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setDefaultBoxId_IsNull() { regDefaultBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setDefaultBoxId_IsNotNull() { regDefaultBoxId(CK_ISNN, DOBJ); }

    protected void regDefaultBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultBoxId(), "DEFAULT_BOX_ID"); }
    protected abstract ConditionValue xgetCValueDefaultBoxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param errorSoundPlayFlg The value of errorSoundPlayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_Equal(String errorSoundPlayFlg) {
        doSetErrorSoundPlayFlg_Equal(fRES(errorSoundPlayFlg));
    }

    /**
     * Equal(=). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetErrorSoundPlayFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setErrorSoundPlayFlg_Equal_$0() {
        setErrorSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setErrorSoundPlayFlg_Equal_$1() {
        setErrorSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetErrorSoundPlayFlg_Equal(String errorSoundPlayFlg) {
        regErrorSoundPlayFlg(CK_EQ, errorSoundPlayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param errorSoundPlayFlg The value of errorSoundPlayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_NotEqual(String errorSoundPlayFlg) {
        doSetErrorSoundPlayFlg_NotEqual(fRES(errorSoundPlayFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetErrorSoundPlayFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setErrorSoundPlayFlg_NotEqual_$0() {
        setErrorSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setErrorSoundPlayFlg_NotEqual_$1() {
        setErrorSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetErrorSoundPlayFlg_NotEqual(String errorSoundPlayFlg) {
        regErrorSoundPlayFlg(CK_NES, errorSoundPlayFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param errorSoundPlayFlgList The collection of errorSoundPlayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_InScope(Collection<String> errorSoundPlayFlgList) {
        doSetErrorSoundPlayFlg_InScope(errorSoundPlayFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_InScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetErrorSoundPlayFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetErrorSoundPlayFlg_InScope(Collection<String> errorSoundPlayFlgList) {
        regINS(CK_INS, cTL(errorSoundPlayFlgList), xgetCValueErrorSoundPlayFlg(), "ERROR_SOUND_PLAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param errorSoundPlayFlgList The collection of errorSoundPlayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_NotInScope(Collection<String> errorSoundPlayFlgList) {
        doSetErrorSoundPlayFlg_NotInScope(errorSoundPlayFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorSoundPlayFlg_NotInScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetErrorSoundPlayFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetErrorSoundPlayFlg_NotInScope(Collection<String> errorSoundPlayFlgList) {
        regINS(CK_NINS, cTL(errorSoundPlayFlgList), xgetCValueErrorSoundPlayFlg(), "ERROR_SOUND_PLAY_FLG");
    }

    protected void regErrorSoundPlayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorSoundPlayFlg(), "ERROR_SOUND_PLAY_FLG"); }
    protected abstract ConditionValue xgetCValueErrorSoundPlayFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param warnSoundPlayFlg The value of warnSoundPlayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_Equal(String warnSoundPlayFlg) {
        doSetWarnSoundPlayFlg_Equal(fRES(warnSoundPlayFlg));
    }

    /**
     * Equal(=). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetWarnSoundPlayFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setWarnSoundPlayFlg_Equal_$0() {
        setWarnSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setWarnSoundPlayFlg_Equal_$1() {
        setWarnSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetWarnSoundPlayFlg_Equal(String warnSoundPlayFlg) {
        regWarnSoundPlayFlg(CK_EQ, warnSoundPlayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param warnSoundPlayFlg The value of warnSoundPlayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_NotEqual(String warnSoundPlayFlg) {
        doSetWarnSoundPlayFlg_NotEqual(fRES(warnSoundPlayFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetWarnSoundPlayFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setWarnSoundPlayFlg_NotEqual_$0() {
        setWarnSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setWarnSoundPlayFlg_NotEqual_$1() {
        setWarnSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetWarnSoundPlayFlg_NotEqual(String warnSoundPlayFlg) {
        regWarnSoundPlayFlg(CK_NES, warnSoundPlayFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param warnSoundPlayFlgList The collection of warnSoundPlayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_InScope(Collection<String> warnSoundPlayFlgList) {
        doSetWarnSoundPlayFlg_InScope(warnSoundPlayFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_InScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetWarnSoundPlayFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetWarnSoundPlayFlg_InScope(Collection<String> warnSoundPlayFlgList) {
        regINS(CK_INS, cTL(warnSoundPlayFlgList), xgetCValueWarnSoundPlayFlg(), "WARN_SOUND_PLAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param warnSoundPlayFlgList The collection of warnSoundPlayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_NotInScope(Collection<String> warnSoundPlayFlgList) {
        doSetWarnSoundPlayFlg_NotInScope(warnSoundPlayFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarnSoundPlayFlg_NotInScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetWarnSoundPlayFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetWarnSoundPlayFlg_NotInScope(Collection<String> warnSoundPlayFlgList) {
        regINS(CK_NINS, cTL(warnSoundPlayFlgList), xgetCValueWarnSoundPlayFlg(), "WARN_SOUND_PLAY_FLG");
    }

    protected void regWarnSoundPlayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarnSoundPlayFlg(), "WARN_SOUND_PLAY_FLG"); }
    protected abstract ConditionValue xgetCValueWarnSoundPlayFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspSoundPlayFlg The value of inspSoundPlayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_Equal(String inspSoundPlayFlg) {
        doSetInspSoundPlayFlg_Equal(fRES(inspSoundPlayFlg));
    }

    /**
     * Equal(=). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetInspSoundPlayFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setInspSoundPlayFlg_Equal_$0() {
        setInspSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setInspSoundPlayFlg_Equal_$1() {
        setInspSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetInspSoundPlayFlg_Equal(String inspSoundPlayFlg) {
        regInspSoundPlayFlg(CK_EQ, inspSoundPlayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspSoundPlayFlg The value of inspSoundPlayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_NotEqual(String inspSoundPlayFlg) {
        doSetInspSoundPlayFlg_NotEqual(fRES(inspSoundPlayFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetInspSoundPlayFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setInspSoundPlayFlg_NotEqual_$0() {
        setInspSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setInspSoundPlayFlg_NotEqual_$1() {
        setInspSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetInspSoundPlayFlg_NotEqual(String inspSoundPlayFlg) {
        regInspSoundPlayFlg(CK_NES, inspSoundPlayFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspSoundPlayFlgList The collection of inspSoundPlayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_InScope(Collection<String> inspSoundPlayFlgList) {
        doSetInspSoundPlayFlg_InScope(inspSoundPlayFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_InScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetInspSoundPlayFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInspSoundPlayFlg_InScope(Collection<String> inspSoundPlayFlgList) {
        regINS(CK_INS, cTL(inspSoundPlayFlgList), xgetCValueInspSoundPlayFlg(), "INSP_SOUND_PLAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspSoundPlayFlgList The collection of inspSoundPlayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_NotInScope(Collection<String> inspSoundPlayFlgList) {
        doSetInspSoundPlayFlg_NotInScope(inspSoundPlayFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspSoundPlayFlg_NotInScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetInspSoundPlayFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInspSoundPlayFlg_NotInScope(Collection<String> inspSoundPlayFlgList) {
        regINS(CK_NINS, cTL(inspSoundPlayFlgList), xgetCValueInspSoundPlayFlg(), "INSP_SOUND_PLAY_FLG");
    }

    protected void regInspSoundPlayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspSoundPlayFlg(), "INSP_SOUND_PLAY_FLG"); }
    protected abstract ConditionValue xgetCValueInspSoundPlayFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspCompSoundPlayFlg The value of inspCompSoundPlayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_Equal(String inspCompSoundPlayFlg) {
        doSetInspCompSoundPlayFlg_Equal(fRES(inspCompSoundPlayFlg));
    }

    /**
     * Equal(=). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetInspCompSoundPlayFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setInspCompSoundPlayFlg_Equal_$0() {
        setInspCompSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setInspCompSoundPlayFlg_Equal_$1() {
        setInspCompSoundPlayFlg_Equal_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetInspCompSoundPlayFlg_Equal(String inspCompSoundPlayFlg) {
        regInspCompSoundPlayFlg(CK_EQ, inspCompSoundPlayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspCompSoundPlayFlg The value of inspCompSoundPlayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_NotEqual(String inspCompSoundPlayFlg) {
        doSetInspCompSoundPlayFlg_NotEqual(fRES(inspCompSoundPlayFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SoundPlayFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        doSetInspCompSoundPlayFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 再生しない
     */
    public void setInspCompSoundPlayFlg_NotEqual_$0() {
        setInspCompSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 再生する
     */
    public void setInspCompSoundPlayFlg_NotEqual_$1() {
        setInspCompSoundPlayFlg_NotEqual_AsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    protected void doSetInspCompSoundPlayFlg_NotEqual(String inspCompSoundPlayFlg) {
        regInspCompSoundPlayFlg(CK_NES, inspCompSoundPlayFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspCompSoundPlayFlgList The collection of inspCompSoundPlayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_InScope(Collection<String> inspCompSoundPlayFlgList) {
        doSetInspCompSoundPlayFlg_InScope(inspCompSoundPlayFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_InScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetInspCompSoundPlayFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInspCompSoundPlayFlg_InScope(Collection<String> inspCompSoundPlayFlgList) {
        regINS(CK_INS, cTL(inspCompSoundPlayFlgList), xgetCValueInspCompSoundPlayFlg(), "INSP_COMP_SOUND_PLAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @param inspCompSoundPlayFlgList The collection of inspCompSoundPlayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_NotInScope(Collection<String> inspCompSoundPlayFlgList) {
        doSetInspCompSoundPlayFlg_NotInScope(inspCompSoundPlayFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SoundPlayFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspCompSoundPlayFlg_NotInScope_AsSoundPlayFlg(Collection<CDef.SoundPlayFlg> cdefList) {
        doSetInspCompSoundPlayFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInspCompSoundPlayFlg_NotInScope(Collection<String> inspCompSoundPlayFlgList) {
        regINS(CK_NINS, cTL(inspCompSoundPlayFlgList), xgetCValueInspCompSoundPlayFlg(), "INSP_COMP_SOUND_PLAY_FLG");
    }

    protected void regInspCompSoundPlayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspCompSoundPlayFlg(), "INSP_COMP_SOUND_PLAY_FLG"); }
    protected abstract ConditionValue xgetCValueInspCompSoundPlayFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterTagOutFlg The value of afterTagOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_Equal(String afterTagOutFlg) {
        doSetAfterTagOutFlg_Equal(fRES(afterTagOutFlg));
    }

    /**
     * Equal(=). As AfterTagOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg cdef) {
        doSetAfterTagOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setAfterTagOutFlg_Equal_$0() {
        setAfterTagOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: バラ出荷検品後に出力
     */
    public void setAfterTagOutFlg_Equal_$1() {
        setAfterTagOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ケース出荷検品後に出力
     */
    public void setAfterTagOutFlg_Equal_$2() {
        setAfterTagOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: バラ・ケース出荷検品後に出力
     */
    public void setAfterTagOutFlg_Equal_$3() {
        setAfterTagOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$3);
    }

    protected void doSetAfterTagOutFlg_Equal(String afterTagOutFlg) {
        regAfterTagOutFlg(CK_EQ, afterTagOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterTagOutFlg The value of afterTagOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_NotEqual(String afterTagOutFlg) {
        doSetAfterTagOutFlg_NotEqual(fRES(afterTagOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AfterTagOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg cdef) {
        doSetAfterTagOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setAfterTagOutFlg_NotEqual_$0() {
        setAfterTagOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: バラ出荷検品後に出力
     */
    public void setAfterTagOutFlg_NotEqual_$1() {
        setAfterTagOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ケース出荷検品後に出力
     */
    public void setAfterTagOutFlg_NotEqual_$2() {
        setAfterTagOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: バラ・ケース出荷検品後に出力
     */
    public void setAfterTagOutFlg_NotEqual_$3() {
        setAfterTagOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$3);
    }

    protected void doSetAfterTagOutFlg_NotEqual(String afterTagOutFlg) {
        regAfterTagOutFlg(CK_NES, afterTagOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterTagOutFlgList The collection of afterTagOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_InScope(Collection<String> afterTagOutFlgList) {
        doSetAfterTagOutFlg_InScope(afterTagOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AfterTagOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_InScope_AsAfterTagOutFlg(Collection<CDef.AfterTagOutFlg> cdefList) {
        doSetAfterTagOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAfterTagOutFlg_InScope(Collection<String> afterTagOutFlgList) {
        regINS(CK_INS, cTL(afterTagOutFlgList), xgetCValueAfterTagOutFlg(), "AFTER_TAG_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterTagOutFlgList The collection of afterTagOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_NotInScope(Collection<String> afterTagOutFlgList) {
        doSetAfterTagOutFlg_NotInScope(afterTagOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AfterTagOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterTagOutFlg_NotInScope_AsAfterTagOutFlg(Collection<CDef.AfterTagOutFlg> cdefList) {
        doSetAfterTagOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAfterTagOutFlg_NotInScope(Collection<String> afterTagOutFlgList) {
        regINS(CK_NINS, cTL(afterTagOutFlgList), xgetCValueAfterTagOutFlg(), "AFTER_TAG_OUT_FLG");
    }

    protected void regAfterTagOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAfterTagOutFlg(), "AFTER_TAG_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueAfterTagOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @param tagDeliveryOutFlg The value of tagDeliveryOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_Equal(String tagDeliveryOutFlg) {
        doSetTagDeliveryOutFlg_Equal(fRES(tagDeliveryOutFlg));
    }

    /**
     * Equal(=). As TagDeliveryOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_Equal_AsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg cdef) {
        doSetTagDeliveryOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setTagDeliveryOutFlg_Equal_$0() {
        setTagDeliveryOutFlg_Equal_AsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 1枚目のみ出力
     */
    public void setTagDeliveryOutFlg_Equal_$1() {
        setTagDeliveryOutFlg_Equal_AsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.$1);
    }

    protected void doSetTagDeliveryOutFlg_Equal(String tagDeliveryOutFlg) {
        regTagDeliveryOutFlg(CK_EQ, tagDeliveryOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @param tagDeliveryOutFlg The value of tagDeliveryOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_NotEqual(String tagDeliveryOutFlg) {
        doSetTagDeliveryOutFlg_NotEqual(fRES(tagDeliveryOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As TagDeliveryOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_NotEqual_AsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg cdef) {
        doSetTagDeliveryOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setTagDeliveryOutFlg_NotEqual_$0() {
        setTagDeliveryOutFlg_NotEqual_AsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 1枚目のみ出力
     */
    public void setTagDeliveryOutFlg_NotEqual_$1() {
        setTagDeliveryOutFlg_NotEqual_AsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.$1);
    }

    protected void doSetTagDeliveryOutFlg_NotEqual(String tagDeliveryOutFlg) {
        regTagDeliveryOutFlg(CK_NES, tagDeliveryOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @param tagDeliveryOutFlgList The collection of tagDeliveryOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_InScope(Collection<String> tagDeliveryOutFlgList) {
        doSetTagDeliveryOutFlg_InScope(tagDeliveryOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As TagDeliveryOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_InScope_AsTagDeliveryOutFlg(Collection<CDef.TagDeliveryOutFlg> cdefList) {
        doSetTagDeliveryOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetTagDeliveryOutFlg_InScope(Collection<String> tagDeliveryOutFlgList) {
        regINS(CK_INS, cTL(tagDeliveryOutFlgList), xgetCValueTagDeliveryOutFlg(), "TAG_DELIVERY_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @param tagDeliveryOutFlgList The collection of tagDeliveryOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_NotInScope(Collection<String> tagDeliveryOutFlgList) {
        doSetTagDeliveryOutFlg_NotInScope(tagDeliveryOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TagDeliveryOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDeliveryOutFlg_NotInScope_AsTagDeliveryOutFlg(Collection<CDef.TagDeliveryOutFlg> cdefList) {
        doSetTagDeliveryOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTagDeliveryOutFlg_NotInScope(Collection<String> tagDeliveryOutFlgList) {
        regINS(CK_NINS, cTL(tagDeliveryOutFlgList), xgetCValueTagDeliveryOutFlg(), "TAG_DELIVERY_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     */
    public void setTagDeliveryOutFlg_IsNull() { regTagDeliveryOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     */
    public void setTagDeliveryOutFlg_IsNotNull() { regTagDeliveryOutFlg(CK_ISNN, DOBJ); }

    protected void regTagDeliveryOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagDeliveryOutFlg(), "TAG_DELIVERY_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueTagDeliveryOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterDelivSlipOutFlg The value of afterDelivSlipOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_Equal(String afterDelivSlipOutFlg) {
        doSetAfterDelivSlipOutFlg_Equal(fRES(afterDelivSlipOutFlg));
    }

    /**
     * Equal(=). As AfterTagOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg cdef) {
        doSetAfterDelivSlipOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setAfterDelivSlipOutFlg_Equal_$0() {
        setAfterDelivSlipOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: バラ出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_Equal_$1() {
        setAfterDelivSlipOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ケース出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_Equal_$2() {
        setAfterDelivSlipOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: バラ・ケース出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_Equal_$3() {
        setAfterDelivSlipOutFlg_Equal_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$3);
    }

    protected void doSetAfterDelivSlipOutFlg_Equal(String afterDelivSlipOutFlg) {
        regAfterDelivSlipOutFlg(CK_EQ, afterDelivSlipOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterDelivSlipOutFlg The value of afterDelivSlipOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_NotEqual(String afterDelivSlipOutFlg) {
        doSetAfterDelivSlipOutFlg_NotEqual(fRES(afterDelivSlipOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AfterTagOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg cdef) {
        doSetAfterDelivSlipOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setAfterDelivSlipOutFlg_NotEqual_$0() {
        setAfterDelivSlipOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: バラ出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_NotEqual_$1() {
        setAfterDelivSlipOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ケース出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_NotEqual_$2() {
        setAfterDelivSlipOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: バラ・ケース出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_NotEqual_$3() {
        setAfterDelivSlipOutFlg_NotEqual_AsAfterTagOutFlg(CDef.AfterTagOutFlg.$3);
    }

    protected void doSetAfterDelivSlipOutFlg_NotEqual(String afterDelivSlipOutFlg) {
        regAfterDelivSlipOutFlg(CK_NES, afterDelivSlipOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterDelivSlipOutFlgList The collection of afterDelivSlipOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_InScope(Collection<String> afterDelivSlipOutFlgList) {
        doSetAfterDelivSlipOutFlg_InScope(afterDelivSlipOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AfterTagOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_InScope_AsAfterTagOutFlg(Collection<CDef.AfterTagOutFlg> cdefList) {
        doSetAfterDelivSlipOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAfterDelivSlipOutFlg_InScope(Collection<String> afterDelivSlipOutFlgList) {
        regINS(CK_INS, cTL(afterDelivSlipOutFlgList), xgetCValueAfterDelivSlipOutFlg(), "AFTER_DELIV_SLIP_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @param afterDelivSlipOutFlgList The collection of afterDelivSlipOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_NotInScope(Collection<String> afterDelivSlipOutFlgList) {
        doSetAfterDelivSlipOutFlg_NotInScope(afterDelivSlipOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AfterTagOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutFlg_NotInScope_AsAfterTagOutFlg(Collection<CDef.AfterTagOutFlg> cdefList) {
        doSetAfterDelivSlipOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAfterDelivSlipOutFlg_NotInScope(Collection<String> afterDelivSlipOutFlgList) {
        regINS(CK_NINS, cTL(afterDelivSlipOutFlgList), xgetCValueAfterDelivSlipOutFlg(), "AFTER_DELIV_SLIP_OUT_FLG");
    }

    protected void regAfterDelivSlipOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAfterDelivSlipOutFlg(), "AFTER_DELIV_SLIP_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueAfterDelivSlipOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @param afterDelivSlipOutTgt The value of afterDelivSlipOutTgt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_Equal(String afterDelivSlipOutTgt) {
        doSetAfterDelivSlipOutTgt_Equal(fRES(afterDelivSlipOutTgt));
    }

    /**
     * Equal(=). As AfterDelivSlipOutTgt. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_Equal_AsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt cdef) {
        doSetAfterDelivSlipOutTgt_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ECお買上明細
     */
    public void setAfterDelivSlipOutTgt_Equal_$1() {
        setAfterDelivSlipOutTgt_Equal_AsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 納品明細
     */
    public void setAfterDelivSlipOutTgt_Equal_$2() {
        setAfterDelivSlipOutTgt_Equal_AsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.$2);
    }

    protected void doSetAfterDelivSlipOutTgt_Equal(String afterDelivSlipOutTgt) {
        regAfterDelivSlipOutTgt(CK_EQ, afterDelivSlipOutTgt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @param afterDelivSlipOutTgt The value of afterDelivSlipOutTgt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_NotEqual(String afterDelivSlipOutTgt) {
        doSetAfterDelivSlipOutTgt_NotEqual(fRES(afterDelivSlipOutTgt));
    }

    /**
     * NotEqual(&lt;&gt;). As AfterDelivSlipOutTgt. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_NotEqual_AsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt cdef) {
        doSetAfterDelivSlipOutTgt_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ECお買上明細
     */
    public void setAfterDelivSlipOutTgt_NotEqual_$1() {
        setAfterDelivSlipOutTgt_NotEqual_AsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 納品明細
     */
    public void setAfterDelivSlipOutTgt_NotEqual_$2() {
        setAfterDelivSlipOutTgt_NotEqual_AsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.$2);
    }

    protected void doSetAfterDelivSlipOutTgt_NotEqual(String afterDelivSlipOutTgt) {
        regAfterDelivSlipOutTgt(CK_NES, afterDelivSlipOutTgt);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @param afterDelivSlipOutTgtList The collection of afterDelivSlipOutTgt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_InScope(Collection<String> afterDelivSlipOutTgtList) {
        doSetAfterDelivSlipOutTgt_InScope(afterDelivSlipOutTgtList);
    }

    /**
     * InScope {in ('a', 'b')}. As AfterDelivSlipOutTgt. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_InScope_AsAfterDelivSlipOutTgt(Collection<CDef.AfterDelivSlipOutTgt> cdefList) {
        doSetAfterDelivSlipOutTgt_InScope(cTStrL(cdefList));
    }

    protected void doSetAfterDelivSlipOutTgt_InScope(Collection<String> afterDelivSlipOutTgtList) {
        regINS(CK_INS, cTL(afterDelivSlipOutTgtList), xgetCValueAfterDelivSlipOutTgt(), "AFTER_DELIV_SLIP_OUT_TGT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @param afterDelivSlipOutTgtList The collection of afterDelivSlipOutTgt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_NotInScope(Collection<String> afterDelivSlipOutTgtList) {
        doSetAfterDelivSlipOutTgt_NotInScope(afterDelivSlipOutTgtList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AfterDelivSlipOutTgt. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfterDelivSlipOutTgt_NotInScope_AsAfterDelivSlipOutTgt(Collection<CDef.AfterDelivSlipOutTgt> cdefList) {
        doSetAfterDelivSlipOutTgt_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAfterDelivSlipOutTgt_NotInScope(Collection<String> afterDelivSlipOutTgtList) {
        regINS(CK_NINS, cTL(afterDelivSlipOutTgtList), xgetCValueAfterDelivSlipOutTgt(), "AFTER_DELIV_SLIP_OUT_TGT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     */
    public void setAfterDelivSlipOutTgt_IsNull() { regAfterDelivSlipOutTgt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     */
    public void setAfterDelivSlipOutTgt_IsNotNull() { regAfterDelivSlipOutTgt(CK_ISNN, DOBJ); }

    protected void regAfterDelivSlipOutTgt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAfterDelivSlipOutTgt(), "AFTER_DELIV_SLIP_OUT_TGT"); }
    protected abstract ConditionValue xgetCValueAfterDelivSlipOutTgt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @param sglRowInspAfterOutCls The value of sglRowInspAfterOutCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_Equal(String sglRowInspAfterOutCls) {
        doSetSglRowInspAfterOutCls_Equal(fRES(sglRowInspAfterOutCls));
    }

    /**
     * Equal(=). As SglRowInspAfterOutCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_Equal_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls cdef) {
        doSetSglRowInspAfterOutCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最初の商品検品後に出力
     */
    public void setSglRowInspAfterOutCls_Equal_$1() {
        setSglRowInspAfterOutCls_Equal_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 随時出力
     */
    public void setSglRowInspAfterOutCls_Equal_$2() {
        setSglRowInspAfterOutCls_Equal_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 最後の商品検品後に出力
     */
    public void setSglRowInspAfterOutCls_Equal_$3() {
        setSglRowInspAfterOutCls_Equal_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$3);
    }

    protected void doSetSglRowInspAfterOutCls_Equal(String sglRowInspAfterOutCls) {
        regSglRowInspAfterOutCls(CK_EQ, sglRowInspAfterOutCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @param sglRowInspAfterOutCls The value of sglRowInspAfterOutCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_NotEqual(String sglRowInspAfterOutCls) {
        doSetSglRowInspAfterOutCls_NotEqual(fRES(sglRowInspAfterOutCls));
    }

    /**
     * NotEqual(&lt;&gt;). As SglRowInspAfterOutCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_NotEqual_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls cdef) {
        doSetSglRowInspAfterOutCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 最初の商品検品後に出力
     */
    public void setSglRowInspAfterOutCls_NotEqual_$1() {
        setSglRowInspAfterOutCls_NotEqual_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 随時出力
     */
    public void setSglRowInspAfterOutCls_NotEqual_$2() {
        setSglRowInspAfterOutCls_NotEqual_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 最後の商品検品後に出力
     */
    public void setSglRowInspAfterOutCls_NotEqual_$3() {
        setSglRowInspAfterOutCls_NotEqual_AsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$3);
    }

    protected void doSetSglRowInspAfterOutCls_NotEqual(String sglRowInspAfterOutCls) {
        regSglRowInspAfterOutCls(CK_NES, sglRowInspAfterOutCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @param sglRowInspAfterOutClsList The collection of sglRowInspAfterOutCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_InScope(Collection<String> sglRowInspAfterOutClsList) {
        doSetSglRowInspAfterOutCls_InScope(sglRowInspAfterOutClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As SglRowInspAfterOutCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_InScope_AsSglRowInspAfterOutCls(Collection<CDef.SglRowInspAfterOutCls> cdefList) {
        doSetSglRowInspAfterOutCls_InScope(cTStrL(cdefList));
    }

    protected void doSetSglRowInspAfterOutCls_InScope(Collection<String> sglRowInspAfterOutClsList) {
        regINS(CK_INS, cTL(sglRowInspAfterOutClsList), xgetCValueSglRowInspAfterOutCls(), "SGL_ROW_INSP_AFTER_OUT_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @param sglRowInspAfterOutClsList The collection of sglRowInspAfterOutCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_NotInScope(Collection<String> sglRowInspAfterOutClsList) {
        doSetSglRowInspAfterOutCls_NotInScope(sglRowInspAfterOutClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SglRowInspAfterOutCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowInspAfterOutCls_NotInScope_AsSglRowInspAfterOutCls(Collection<CDef.SglRowInspAfterOutCls> cdefList) {
        doSetSglRowInspAfterOutCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSglRowInspAfterOutCls_NotInScope(Collection<String> sglRowInspAfterOutClsList) {
        regINS(CK_NINS, cTL(sglRowInspAfterOutClsList), xgetCValueSglRowInspAfterOutCls(), "SGL_ROW_INSP_AFTER_OUT_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     */
    public void setSglRowInspAfterOutCls_IsNull() { regSglRowInspAfterOutCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     */
    public void setSglRowInspAfterOutCls_IsNullOrEmpty() { regSglRowInspAfterOutCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     */
    public void setSglRowInspAfterOutCls_IsNotNull() { regSglRowInspAfterOutCls(CK_ISNN, DOBJ); }

    protected void regSglRowInspAfterOutCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowInspAfterOutCls(), "SGL_ROW_INSP_AFTER_OUT_CLS"); }
    protected abstract ConditionValue xgetCValueSglRowInspAfterOutCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @param htCharReadFlg The value of htCharReadFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_Equal(String htCharReadFlg) {
        doSetHtCharReadFlg_Equal(fRES(htCharReadFlg));
    }

    /**
     * Equal(=). As HtCharReadFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_Equal_AsHtCharReadFlg(CDef.HtCharReadFlg cdef) {
        doSetHtCharReadFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setHtCharReadFlg_Equal_$0() {
        setHtCharReadFlg_Equal_AsHtCharReadFlg(CDef.HtCharReadFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setHtCharReadFlg_Equal_$1() {
        setHtCharReadFlg_Equal_AsHtCharReadFlg(CDef.HtCharReadFlg.$1);
    }

    protected void doSetHtCharReadFlg_Equal(String htCharReadFlg) {
        regHtCharReadFlg(CK_EQ, htCharReadFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @param htCharReadFlg The value of htCharReadFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_NotEqual(String htCharReadFlg) {
        doSetHtCharReadFlg_NotEqual(fRES(htCharReadFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As HtCharReadFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_NotEqual_AsHtCharReadFlg(CDef.HtCharReadFlg cdef) {
        doSetHtCharReadFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setHtCharReadFlg_NotEqual_$0() {
        setHtCharReadFlg_NotEqual_AsHtCharReadFlg(CDef.HtCharReadFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setHtCharReadFlg_NotEqual_$1() {
        setHtCharReadFlg_NotEqual_AsHtCharReadFlg(CDef.HtCharReadFlg.$1);
    }

    protected void doSetHtCharReadFlg_NotEqual(String htCharReadFlg) {
        regHtCharReadFlg(CK_NES, htCharReadFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @param htCharReadFlgList The collection of htCharReadFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_InScope(Collection<String> htCharReadFlgList) {
        doSetHtCharReadFlg_InScope(htCharReadFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As HtCharReadFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_InScope_AsHtCharReadFlg(Collection<CDef.HtCharReadFlg> cdefList) {
        doSetHtCharReadFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetHtCharReadFlg_InScope(Collection<String> htCharReadFlgList) {
        regINS(CK_INS, cTL(htCharReadFlgList), xgetCValueHtCharReadFlg(), "HT_CHAR_READ_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @param htCharReadFlgList The collection of htCharReadFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_NotInScope(Collection<String> htCharReadFlgList) {
        doSetHtCharReadFlg_NotInScope(htCharReadFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As HtCharReadFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtCharReadFlg_NotInScope_AsHtCharReadFlg(Collection<CDef.HtCharReadFlg> cdefList) {
        doSetHtCharReadFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetHtCharReadFlg_NotInScope(Collection<String> htCharReadFlgList) {
        regINS(CK_NINS, cTL(htCharReadFlgList), xgetCValueHtCharReadFlg(), "HT_CHAR_READ_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     */
    public void setHtCharReadFlg_IsNull() { regHtCharReadFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     */
    public void setHtCharReadFlg_IsNotNull() { regHtCharReadFlg(CK_ISNN, DOBJ); }

    protected void regHtCharReadFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtCharReadFlg(), "HT_CHAR_READ_FLG"); }
    protected abstract ConditionValue xgetCValueHtCharReadFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_Equal(String htLotInputType) {
        doSetHtLotInputType_Equal(fRES(htLotInputType));
    }

    protected void doSetHtLotInputType_Equal(String htLotInputType) {
        regHtLotInputType(CK_EQ, htLotInputType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_NotEqual(String htLotInputType) {
        doSetHtLotInputType_NotEqual(fRES(htLotInputType));
    }

    protected void doSetHtLotInputType_NotEqual(String htLotInputType) {
        regHtLotInputType(CK_NES, htLotInputType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_GreaterThan(String htLotInputType) {
        regHtLotInputType(CK_GT, fRES(htLotInputType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_LessThan(String htLotInputType) {
        regHtLotInputType(CK_LT, fRES(htLotInputType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_GreaterEqual(String htLotInputType) {
        regHtLotInputType(CK_GE, fRES(htLotInputType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_LessEqual(String htLotInputType) {
        regHtLotInputType(CK_LE, fRES(htLotInputType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputTypeList The collection of htLotInputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_InScope(Collection<String> htLotInputTypeList) {
        doSetHtLotInputType_InScope(htLotInputTypeList);
    }

    protected void doSetHtLotInputType_InScope(Collection<String> htLotInputTypeList) {
        regINS(CK_INS, cTL(htLotInputTypeList), xgetCValueHtLotInputType(), "HT_LOT_INPUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputTypeList The collection of htLotInputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_NotInScope(Collection<String> htLotInputTypeList) {
        doSetHtLotInputType_NotInScope(htLotInputTypeList);
    }

    protected void doSetHtLotInputType_NotInScope(Collection<String> htLotInputTypeList) {
        regINS(CK_NINS, cTL(htLotInputTypeList), xgetCValueHtLotInputType(), "HT_LOT_INPUT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)} <br>
     * <pre>e.g. setHtLotInputType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htLotInputType The value of htLotInputType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtLotInputType_LikeSearch(String htLotInputType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htLotInputType), xgetCValueHtLotInputType(), "HT_LOT_INPUT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtLotInputType_NotLikeSearch(String htLotInputType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htLotInputType), xgetCValueHtLotInputType(), "HT_LOT_INPUT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @param htLotInputType The value of htLotInputType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtLotInputType_PrefixSearch(String htLotInputType) {
        setHtLotInputType_LikeSearch(htLotInputType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     */
    public void setHtLotInputType_IsNull() { regHtLotInputType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     */
    public void setHtLotInputType_IsNullOrEmpty() { regHtLotInputType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     */
    public void setHtLotInputType_IsNotNull() { regHtLotInputType(CK_ISNN, DOBJ); }

    protected void regHtLotInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtLotInputType(), "HT_LOT_INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueHtLotInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_Equal(String htSerialInputType) {
        doSetHtSerialInputType_Equal(fRES(htSerialInputType));
    }

    protected void doSetHtSerialInputType_Equal(String htSerialInputType) {
        regHtSerialInputType(CK_EQ, htSerialInputType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_NotEqual(String htSerialInputType) {
        doSetHtSerialInputType_NotEqual(fRES(htSerialInputType));
    }

    protected void doSetHtSerialInputType_NotEqual(String htSerialInputType) {
        regHtSerialInputType(CK_NES, htSerialInputType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_GreaterThan(String htSerialInputType) {
        regHtSerialInputType(CK_GT, fRES(htSerialInputType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_LessThan(String htSerialInputType) {
        regHtSerialInputType(CK_LT, fRES(htSerialInputType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_GreaterEqual(String htSerialInputType) {
        regHtSerialInputType(CK_GE, fRES(htSerialInputType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_LessEqual(String htSerialInputType) {
        regHtSerialInputType(CK_LE, fRES(htSerialInputType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputTypeList The collection of htSerialInputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_InScope(Collection<String> htSerialInputTypeList) {
        doSetHtSerialInputType_InScope(htSerialInputTypeList);
    }

    protected void doSetHtSerialInputType_InScope(Collection<String> htSerialInputTypeList) {
        regINS(CK_INS, cTL(htSerialInputTypeList), xgetCValueHtSerialInputType(), "HT_SERIAL_INPUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputTypeList The collection of htSerialInputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_NotInScope(Collection<String> htSerialInputTypeList) {
        doSetHtSerialInputType_NotInScope(htSerialInputTypeList);
    }

    protected void doSetHtSerialInputType_NotInScope(Collection<String> htSerialInputTypeList) {
        regINS(CK_NINS, cTL(htSerialInputTypeList), xgetCValueHtSerialInputType(), "HT_SERIAL_INPUT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)} <br>
     * <pre>e.g. setHtSerialInputType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htSerialInputType The value of htSerialInputType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtSerialInputType_LikeSearch(String htSerialInputType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htSerialInputType), xgetCValueHtSerialInputType(), "HT_SERIAL_INPUT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtSerialInputType_NotLikeSearch(String htSerialInputType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htSerialInputType), xgetCValueHtSerialInputType(), "HT_SERIAL_INPUT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @param htSerialInputType The value of htSerialInputType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtSerialInputType_PrefixSearch(String htSerialInputType) {
        setHtSerialInputType_LikeSearch(htSerialInputType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     */
    public void setHtSerialInputType_IsNull() { regHtSerialInputType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     */
    public void setHtSerialInputType_IsNullOrEmpty() { regHtSerialInputType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     */
    public void setHtSerialInputType_IsNotNull() { regHtSerialInputType(CK_ISNN, DOBJ); }

    protected void regHtSerialInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtSerialInputType(), "HT_SERIAL_INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueHtSerialInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @param inspectionLabelOutFlg The value of inspectionLabelOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_Equal(String inspectionLabelOutFlg) {
        doSetInspectionLabelOutFlg_Equal(fRES(inspectionLabelOutFlg));
    }

    /**
     * Equal(=). As InspectionLabelOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * 検品ラベル出力
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_Equal_AsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg cdef) {
        doSetInspectionLabelOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setInspectionLabelOutFlg_Equal_$0() {
        setInspectionLabelOutFlg_Equal_AsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力する
     */
    public void setInspectionLabelOutFlg_Equal_$1() {
        setInspectionLabelOutFlg_Equal_AsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.$1);
    }

    protected void doSetInspectionLabelOutFlg_Equal(String inspectionLabelOutFlg) {
        regInspectionLabelOutFlg(CK_EQ, inspectionLabelOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @param inspectionLabelOutFlg The value of inspectionLabelOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_NotEqual(String inspectionLabelOutFlg) {
        doSetInspectionLabelOutFlg_NotEqual(fRES(inspectionLabelOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InspectionLabelOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * 検品ラベル出力
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_NotEqual_AsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg cdef) {
        doSetInspectionLabelOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出力しない
     */
    public void setInspectionLabelOutFlg_NotEqual_$0() {
        setInspectionLabelOutFlg_NotEqual_AsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力する
     */
    public void setInspectionLabelOutFlg_NotEqual_$1() {
        setInspectionLabelOutFlg_NotEqual_AsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.$1);
    }

    protected void doSetInspectionLabelOutFlg_NotEqual(String inspectionLabelOutFlg) {
        regInspectionLabelOutFlg(CK_NES, inspectionLabelOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @param inspectionLabelOutFlgList The collection of inspectionLabelOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_InScope(Collection<String> inspectionLabelOutFlgList) {
        doSetInspectionLabelOutFlg_InScope(inspectionLabelOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InspectionLabelOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * 検品ラベル出力
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_InScope_AsInspectionLabelOutFlg(Collection<CDef.InspectionLabelOutFlg> cdefList) {
        doSetInspectionLabelOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInspectionLabelOutFlg_InScope(Collection<String> inspectionLabelOutFlgList) {
        regINS(CK_INS, cTL(inspectionLabelOutFlgList), xgetCValueInspectionLabelOutFlg(), "INSPECTION_LABEL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @param inspectionLabelOutFlgList The collection of inspectionLabelOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_NotInScope(Collection<String> inspectionLabelOutFlgList) {
        doSetInspectionLabelOutFlg_NotInScope(inspectionLabelOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InspectionLabelOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * 検品ラベル出力
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionLabelOutFlg_NotInScope_AsInspectionLabelOutFlg(Collection<CDef.InspectionLabelOutFlg> cdefList) {
        doSetInspectionLabelOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInspectionLabelOutFlg_NotInScope(Collection<String> inspectionLabelOutFlgList) {
        regINS(CK_NINS, cTL(inspectionLabelOutFlgList), xgetCValueInspectionLabelOutFlg(), "INSPECTION_LABEL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     */
    public void setInspectionLabelOutFlg_IsNull() { regInspectionLabelOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     */
    public void setInspectionLabelOutFlg_IsNotNull() { regInspectionLabelOutFlg(CK_ISNN, DOBJ); }

    protected void regInspectionLabelOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectionLabelOutFlg(), "INSPECTION_LABEL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueInspectionLabelOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @param autoShipInstFlg The value of autoShipInstFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_Equal(String autoShipInstFlg) {
        doSetAutoShipInstFlg_Equal(fRES(autoShipInstFlg));
    }

    /**
     * Equal(=). As AutoShipInstFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_Equal_AsAutoShipInstFlg(CDef.AutoShipInstFlg cdef) {
        doSetAutoShipInstFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setAutoShipInstFlg_Equal_$0() {
        setAutoShipInstFlg_Equal_AsAutoShipInstFlg(CDef.AutoShipInstFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setAutoShipInstFlg_Equal_$1() {
        setAutoShipInstFlg_Equal_AsAutoShipInstFlg(CDef.AutoShipInstFlg.$1);
    }

    protected void doSetAutoShipInstFlg_Equal(String autoShipInstFlg) {
        regAutoShipInstFlg(CK_EQ, autoShipInstFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @param autoShipInstFlg The value of autoShipInstFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_NotEqual(String autoShipInstFlg) {
        doSetAutoShipInstFlg_NotEqual(fRES(autoShipInstFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AutoShipInstFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_NotEqual_AsAutoShipInstFlg(CDef.AutoShipInstFlg cdef) {
        doSetAutoShipInstFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setAutoShipInstFlg_NotEqual_$0() {
        setAutoShipInstFlg_NotEqual_AsAutoShipInstFlg(CDef.AutoShipInstFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setAutoShipInstFlg_NotEqual_$1() {
        setAutoShipInstFlg_NotEqual_AsAutoShipInstFlg(CDef.AutoShipInstFlg.$1);
    }

    protected void doSetAutoShipInstFlg_NotEqual(String autoShipInstFlg) {
        regAutoShipInstFlg(CK_NES, autoShipInstFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @param autoShipInstFlgList The collection of autoShipInstFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_InScope(Collection<String> autoShipInstFlgList) {
        doSetAutoShipInstFlg_InScope(autoShipInstFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AutoShipInstFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_InScope_AsAutoShipInstFlg(Collection<CDef.AutoShipInstFlg> cdefList) {
        doSetAutoShipInstFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAutoShipInstFlg_InScope(Collection<String> autoShipInstFlgList) {
        regINS(CK_INS, cTL(autoShipInstFlgList), xgetCValueAutoShipInstFlg(), "AUTO_SHIP_INST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @param autoShipInstFlgList The collection of autoShipInstFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_NotInScope(Collection<String> autoShipInstFlgList) {
        doSetAutoShipInstFlg_NotInScope(autoShipInstFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AutoShipInstFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoShipInstFlg_NotInScope_AsAutoShipInstFlg(Collection<CDef.AutoShipInstFlg> cdefList) {
        doSetAutoShipInstFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAutoShipInstFlg_NotInScope(Collection<String> autoShipInstFlgList) {
        regINS(CK_NINS, cTL(autoShipInstFlgList), xgetCValueAutoShipInstFlg(), "AUTO_SHIP_INST_FLG");
    }

    protected void regAutoShipInstFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAutoShipInstFlg(), "AUTO_SHIP_INST_FLG"); }
    protected abstract ConditionValue xgetCValueAutoShipInstFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @param stockOutAutoInstFlg The value of stockOutAutoInstFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_Equal(String stockOutAutoInstFlg) {
        doSetStockOutAutoInstFlg_Equal(fRES(stockOutAutoInstFlg));
    }

    /**
     * Equal(=). As StockOutAutoInstFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_Equal_AsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg cdef) {
        doSetStockOutAutoInstFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 自動出庫指示に含めない
     */
    public void setStockOutAutoInstFlg_Equal_$0() {
        setStockOutAutoInstFlg_Equal_AsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 自動出庫指示に含める
     */
    public void setStockOutAutoInstFlg_Equal_$1() {
        setStockOutAutoInstFlg_Equal_AsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.$1);
    }

    protected void doSetStockOutAutoInstFlg_Equal(String stockOutAutoInstFlg) {
        regStockOutAutoInstFlg(CK_EQ, stockOutAutoInstFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @param stockOutAutoInstFlg The value of stockOutAutoInstFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_NotEqual(String stockOutAutoInstFlg) {
        doSetStockOutAutoInstFlg_NotEqual(fRES(stockOutAutoInstFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockOutAutoInstFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_NotEqual_AsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg cdef) {
        doSetStockOutAutoInstFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 自動出庫指示に含めない
     */
    public void setStockOutAutoInstFlg_NotEqual_$0() {
        setStockOutAutoInstFlg_NotEqual_AsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 自動出庫指示に含める
     */
    public void setStockOutAutoInstFlg_NotEqual_$1() {
        setStockOutAutoInstFlg_NotEqual_AsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.$1);
    }

    protected void doSetStockOutAutoInstFlg_NotEqual(String stockOutAutoInstFlg) {
        regStockOutAutoInstFlg(CK_NES, stockOutAutoInstFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @param stockOutAutoInstFlgList The collection of stockOutAutoInstFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_InScope(Collection<String> stockOutAutoInstFlgList) {
        doSetStockOutAutoInstFlg_InScope(stockOutAutoInstFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockOutAutoInstFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_InScope_AsStockOutAutoInstFlg(Collection<CDef.StockOutAutoInstFlg> cdefList) {
        doSetStockOutAutoInstFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockOutAutoInstFlg_InScope(Collection<String> stockOutAutoInstFlgList) {
        regINS(CK_INS, cTL(stockOutAutoInstFlgList), xgetCValueStockOutAutoInstFlg(), "STOCK_OUT_AUTO_INST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @param stockOutAutoInstFlgList The collection of stockOutAutoInstFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_NotInScope(Collection<String> stockOutAutoInstFlgList) {
        doSetStockOutAutoInstFlg_NotInScope(stockOutAutoInstFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockOutAutoInstFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAutoInstFlg_NotInScope_AsStockOutAutoInstFlg(Collection<CDef.StockOutAutoInstFlg> cdefList) {
        doSetStockOutAutoInstFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockOutAutoInstFlg_NotInScope(Collection<String> stockOutAutoInstFlgList) {
        regINS(CK_NINS, cTL(stockOutAutoInstFlgList), xgetCValueStockOutAutoInstFlg(), "STOCK_OUT_AUTO_INST_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     */
    public void setStockOutAutoInstFlg_IsNull() { regStockOutAutoInstFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     */
    public void setStockOutAutoInstFlg_IsNotNull() { regStockOutAutoInstFlg(CK_ISNN, DOBJ); }

    protected void regStockOutAutoInstFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutAutoInstFlg(), "STOCK_OUT_AUTO_INST_FLG"); }
    protected abstract ConditionValue xgetCValueStockOutAutoInstFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @param autoEmgSetFlg The value of autoEmgSetFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_Equal(String autoEmgSetFlg) {
        doSetAutoEmgSetFlg_Equal(fRES(autoEmgSetFlg));
    }

    /**
     * Equal(=). As AutoEmgSetFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_Equal_AsAutoEmgSetFlg(CDef.AutoEmgSetFlg cdef) {
        doSetAutoEmgSetFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setAutoEmgSetFlg_Equal_$0() {
        setAutoEmgSetFlg_Equal_AsAutoEmgSetFlg(CDef.AutoEmgSetFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setAutoEmgSetFlg_Equal_$1() {
        setAutoEmgSetFlg_Equal_AsAutoEmgSetFlg(CDef.AutoEmgSetFlg.$1);
    }

    protected void doSetAutoEmgSetFlg_Equal(String autoEmgSetFlg) {
        regAutoEmgSetFlg(CK_EQ, autoEmgSetFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @param autoEmgSetFlg The value of autoEmgSetFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_NotEqual(String autoEmgSetFlg) {
        doSetAutoEmgSetFlg_NotEqual(fRES(autoEmgSetFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AutoEmgSetFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_NotEqual_AsAutoEmgSetFlg(CDef.AutoEmgSetFlg cdef) {
        doSetAutoEmgSetFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setAutoEmgSetFlg_NotEqual_$0() {
        setAutoEmgSetFlg_NotEqual_AsAutoEmgSetFlg(CDef.AutoEmgSetFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setAutoEmgSetFlg_NotEqual_$1() {
        setAutoEmgSetFlg_NotEqual_AsAutoEmgSetFlg(CDef.AutoEmgSetFlg.$1);
    }

    protected void doSetAutoEmgSetFlg_NotEqual(String autoEmgSetFlg) {
        regAutoEmgSetFlg(CK_NES, autoEmgSetFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @param autoEmgSetFlgList The collection of autoEmgSetFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_InScope(Collection<String> autoEmgSetFlgList) {
        doSetAutoEmgSetFlg_InScope(autoEmgSetFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AutoEmgSetFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_InScope_AsAutoEmgSetFlg(Collection<CDef.AutoEmgSetFlg> cdefList) {
        doSetAutoEmgSetFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAutoEmgSetFlg_InScope(Collection<String> autoEmgSetFlgList) {
        regINS(CK_INS, cTL(autoEmgSetFlgList), xgetCValueAutoEmgSetFlg(), "AUTO_EMG_SET_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @param autoEmgSetFlgList The collection of autoEmgSetFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_NotInScope(Collection<String> autoEmgSetFlgList) {
        doSetAutoEmgSetFlg_NotInScope(autoEmgSetFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AutoEmgSetFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetFlg_NotInScope_AsAutoEmgSetFlg(Collection<CDef.AutoEmgSetFlg> cdefList) {
        doSetAutoEmgSetFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAutoEmgSetFlg_NotInScope(Collection<String> autoEmgSetFlgList) {
        regINS(CK_NINS, cTL(autoEmgSetFlgList), xgetCValueAutoEmgSetFlg(), "AUTO_EMG_SET_FLG");
    }

    protected void regAutoEmgSetFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAutoEmgSetFlg(), "AUTO_EMG_SET_FLG"); }
    protected abstract ConditionValue xgetCValueAutoEmgSetFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @param autoEmgSetTgt The value of autoEmgSetTgt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_Equal(String autoEmgSetTgt) {
        doSetAutoEmgSetTgt_Equal(fRES(autoEmgSetTgt));
    }

    /**
     * Equal(=). As AutoEmgSetTgt. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_Equal_AsAutoEmgSetTgt(CDef.AutoEmgSetTgt cdef) {
        doSetAutoEmgSetTgt_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 積込予定時刻
     */
    public void setAutoEmgSetTgt_Equal_$1() {
        setAutoEmgSetTgt_Equal_AsAutoEmgSetTgt(CDef.AutoEmgSetTgt.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 出荷予定時刻
     */
    public void setAutoEmgSetTgt_Equal_$2() {
        setAutoEmgSetTgt_Equal_AsAutoEmgSetTgt(CDef.AutoEmgSetTgt.$2);
    }

    protected void doSetAutoEmgSetTgt_Equal(String autoEmgSetTgt) {
        regAutoEmgSetTgt(CK_EQ, autoEmgSetTgt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @param autoEmgSetTgt The value of autoEmgSetTgt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_NotEqual(String autoEmgSetTgt) {
        doSetAutoEmgSetTgt_NotEqual(fRES(autoEmgSetTgt));
    }

    /**
     * NotEqual(&lt;&gt;). As AutoEmgSetTgt. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_NotEqual_AsAutoEmgSetTgt(CDef.AutoEmgSetTgt cdef) {
        doSetAutoEmgSetTgt_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 積込予定時刻
     */
    public void setAutoEmgSetTgt_NotEqual_$1() {
        setAutoEmgSetTgt_NotEqual_AsAutoEmgSetTgt(CDef.AutoEmgSetTgt.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 出荷予定時刻
     */
    public void setAutoEmgSetTgt_NotEqual_$2() {
        setAutoEmgSetTgt_NotEqual_AsAutoEmgSetTgt(CDef.AutoEmgSetTgt.$2);
    }

    protected void doSetAutoEmgSetTgt_NotEqual(String autoEmgSetTgt) {
        regAutoEmgSetTgt(CK_NES, autoEmgSetTgt);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @param autoEmgSetTgtList The collection of autoEmgSetTgt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_InScope(Collection<String> autoEmgSetTgtList) {
        doSetAutoEmgSetTgt_InScope(autoEmgSetTgtList);
    }

    /**
     * InScope {in ('a', 'b')}. As AutoEmgSetTgt. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_InScope_AsAutoEmgSetTgt(Collection<CDef.AutoEmgSetTgt> cdefList) {
        doSetAutoEmgSetTgt_InScope(cTStrL(cdefList));
    }

    protected void doSetAutoEmgSetTgt_InScope(Collection<String> autoEmgSetTgtList) {
        regINS(CK_INS, cTL(autoEmgSetTgtList), xgetCValueAutoEmgSetTgt(), "AUTO_EMG_SET_TGT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @param autoEmgSetTgtList The collection of autoEmgSetTgt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_NotInScope(Collection<String> autoEmgSetTgtList) {
        doSetAutoEmgSetTgt_NotInScope(autoEmgSetTgtList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AutoEmgSetTgt. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetTgt_NotInScope_AsAutoEmgSetTgt(Collection<CDef.AutoEmgSetTgt> cdefList) {
        doSetAutoEmgSetTgt_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAutoEmgSetTgt_NotInScope(Collection<String> autoEmgSetTgtList) {
        regINS(CK_NINS, cTL(autoEmgSetTgtList), xgetCValueAutoEmgSetTgt(), "AUTO_EMG_SET_TGT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     */
    public void setAutoEmgSetTgt_IsNull() { regAutoEmgSetTgt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     */
    public void setAutoEmgSetTgt_IsNullOrEmpty() { regAutoEmgSetTgt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     */
    public void setAutoEmgSetTgt_IsNotNull() { regAutoEmgSetTgt(CK_ISNN, DOBJ); }

    protected void regAutoEmgSetTgt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAutoEmgSetTgt(), "AUTO_EMG_SET_TGT"); }
    protected abstract ConditionValue xgetCValueAutoEmgSetTgt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinute The value of autoEmgSetMinute as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_Equal(Long autoEmgSetMinute) {
        doSetAutoEmgSetMinute_Equal(autoEmgSetMinute);
    }

    protected void doSetAutoEmgSetMinute_Equal(Long autoEmgSetMinute) {
        regAutoEmgSetMinute(CK_EQ, autoEmgSetMinute);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinute The value of autoEmgSetMinute as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_NotEqual(Long autoEmgSetMinute) {
        doSetAutoEmgSetMinute_NotEqual(autoEmgSetMinute);
    }

    protected void doSetAutoEmgSetMinute_NotEqual(Long autoEmgSetMinute) {
        regAutoEmgSetMinute(CK_NES, autoEmgSetMinute);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinute The value of autoEmgSetMinute as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_GreaterThan(Long autoEmgSetMinute) {
        regAutoEmgSetMinute(CK_GT, autoEmgSetMinute);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinute The value of autoEmgSetMinute as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_LessThan(Long autoEmgSetMinute) {
        regAutoEmgSetMinute(CK_LT, autoEmgSetMinute);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinute The value of autoEmgSetMinute as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_GreaterEqual(Long autoEmgSetMinute) {
        regAutoEmgSetMinute(CK_GE, autoEmgSetMinute);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinute The value of autoEmgSetMinute as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_LessEqual(Long autoEmgSetMinute) {
        regAutoEmgSetMinute(CK_LE, autoEmgSetMinute);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param minNumber The min number of autoEmgSetMinute. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of autoEmgSetMinute. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAutoEmgSetMinute_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAutoEmgSetMinute(), "AUTO_EMG_SET_MINUTE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinuteList The collection of autoEmgSetMinute as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_InScope(Collection<Long> autoEmgSetMinuteList) {
        doSetAutoEmgSetMinute_InScope(autoEmgSetMinuteList);
    }

    protected void doSetAutoEmgSetMinute_InScope(Collection<Long> autoEmgSetMinuteList) {
        regINS(CK_INS, cTL(autoEmgSetMinuteList), xgetCValueAutoEmgSetMinute(), "AUTO_EMG_SET_MINUTE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @param autoEmgSetMinuteList The collection of autoEmgSetMinute as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoEmgSetMinute_NotInScope(Collection<Long> autoEmgSetMinuteList) {
        doSetAutoEmgSetMinute_NotInScope(autoEmgSetMinuteList);
    }

    protected void doSetAutoEmgSetMinute_NotInScope(Collection<Long> autoEmgSetMinuteList) {
        regINS(CK_NINS, cTL(autoEmgSetMinuteList), xgetCValueAutoEmgSetMinute(), "AUTO_EMG_SET_MINUTE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     */
    public void setAutoEmgSetMinute_IsNull() { regAutoEmgSetMinute(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     */
    public void setAutoEmgSetMinute_IsNotNull() { regAutoEmgSetMinute(CK_ISNN, DOBJ); }

    protected void regAutoEmgSetMinute(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAutoEmgSetMinute(), "AUTO_EMG_SET_MINUTE"); }
    protected abstract ConditionValue xgetCValueAutoEmgSetMinute();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @param stockOutInstCxlFlg The value of stockOutInstCxlFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_Equal(String stockOutInstCxlFlg) {
        doSetStockOutInstCxlFlg_Equal(fRES(stockOutInstCxlFlg));
    }

    /**
     * Equal(=). As StockOutInstCxlFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_Equal_AsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg cdef) {
        doSetStockOutInstCxlFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出庫指示を取消しない
     */
    public void setStockOutInstCxlFlg_Equal_$0() {
        setStockOutInstCxlFlg_Equal_AsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫指示を取消
     */
    public void setStockOutInstCxlFlg_Equal_$1() {
        setStockOutInstCxlFlg_Equal_AsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.$1);
    }

    protected void doSetStockOutInstCxlFlg_Equal(String stockOutInstCxlFlg) {
        regStockOutInstCxlFlg(CK_EQ, stockOutInstCxlFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @param stockOutInstCxlFlg The value of stockOutInstCxlFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_NotEqual(String stockOutInstCxlFlg) {
        doSetStockOutInstCxlFlg_NotEqual(fRES(stockOutInstCxlFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockOutInstCxlFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_NotEqual_AsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg cdef) {
        doSetStockOutInstCxlFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出庫指示を取消しない
     */
    public void setStockOutInstCxlFlg_NotEqual_$0() {
        setStockOutInstCxlFlg_NotEqual_AsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫指示を取消
     */
    public void setStockOutInstCxlFlg_NotEqual_$1() {
        setStockOutInstCxlFlg_NotEqual_AsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.$1);
    }

    protected void doSetStockOutInstCxlFlg_NotEqual(String stockOutInstCxlFlg) {
        regStockOutInstCxlFlg(CK_NES, stockOutInstCxlFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @param stockOutInstCxlFlgList The collection of stockOutInstCxlFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_InScope(Collection<String> stockOutInstCxlFlgList) {
        doSetStockOutInstCxlFlg_InScope(stockOutInstCxlFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockOutInstCxlFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_InScope_AsStockOutInstCxlFlg(Collection<CDef.StockOutInstCxlFlg> cdefList) {
        doSetStockOutInstCxlFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockOutInstCxlFlg_InScope(Collection<String> stockOutInstCxlFlgList) {
        regINS(CK_INS, cTL(stockOutInstCxlFlgList), xgetCValueStockOutInstCxlFlg(), "STOCK_OUT_INST_CXL_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @param stockOutInstCxlFlgList The collection of stockOutInstCxlFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_NotInScope(Collection<String> stockOutInstCxlFlgList) {
        doSetStockOutInstCxlFlg_NotInScope(stockOutInstCxlFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockOutInstCxlFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstCxlFlg_NotInScope_AsStockOutInstCxlFlg(Collection<CDef.StockOutInstCxlFlg> cdefList) {
        doSetStockOutInstCxlFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockOutInstCxlFlg_NotInScope(Collection<String> stockOutInstCxlFlgList) {
        regINS(CK_NINS, cTL(stockOutInstCxlFlgList), xgetCValueStockOutInstCxlFlg(), "STOCK_OUT_INST_CXL_FLG");
    }

    protected void regStockOutInstCxlFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutInstCxlFlg(), "STOCK_OUT_INST_CXL_FLG"); }
    protected abstract ConditionValue xgetCValueStockOutInstCxlFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @param stockOutAllocCls The value of stockOutAllocCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_Equal(String stockOutAllocCls) {
        doSetStockOutAllocCls_Equal(fRES(stockOutAllocCls));
    }

    /**
     * Equal(=). As StockOutAllocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_Equal_AsStockOutAllocCls(CDef.StockOutAllocCls cdef) {
        doSetStockOutAllocCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 引当可能数を引当
     */
    public void setStockOutAllocCls_Equal_$0() {
        setStockOutAllocCls_Equal_AsStockOutAllocCls(CDef.StockOutAllocCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 商品毎に0引当
     */
    public void setStockOutAllocCls_Equal_$1() {
        setStockOutAllocCls_Equal_AsStockOutAllocCls(CDef.StockOutAllocCls.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 納品先毎に0引当
     */
    public void setStockOutAllocCls_Equal_$2() {
        setStockOutAllocCls_Equal_AsStockOutAllocCls(CDef.StockOutAllocCls.$2);
    }

    protected void doSetStockOutAllocCls_Equal(String stockOutAllocCls) {
        regStockOutAllocCls(CK_EQ, stockOutAllocCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @param stockOutAllocCls The value of stockOutAllocCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_NotEqual(String stockOutAllocCls) {
        doSetStockOutAllocCls_NotEqual(fRES(stockOutAllocCls));
    }

    /**
     * NotEqual(&lt;&gt;). As StockOutAllocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_NotEqual_AsStockOutAllocCls(CDef.StockOutAllocCls cdef) {
        doSetStockOutAllocCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 引当可能数を引当
     */
    public void setStockOutAllocCls_NotEqual_$0() {
        setStockOutAllocCls_NotEqual_AsStockOutAllocCls(CDef.StockOutAllocCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 商品毎に0引当
     */
    public void setStockOutAllocCls_NotEqual_$1() {
        setStockOutAllocCls_NotEqual_AsStockOutAllocCls(CDef.StockOutAllocCls.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 納品先毎に0引当
     */
    public void setStockOutAllocCls_NotEqual_$2() {
        setStockOutAllocCls_NotEqual_AsStockOutAllocCls(CDef.StockOutAllocCls.$2);
    }

    protected void doSetStockOutAllocCls_NotEqual(String stockOutAllocCls) {
        regStockOutAllocCls(CK_NES, stockOutAllocCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @param stockOutAllocClsList The collection of stockOutAllocCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_InScope(Collection<String> stockOutAllocClsList) {
        doSetStockOutAllocCls_InScope(stockOutAllocClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockOutAllocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_InScope_AsStockOutAllocCls(Collection<CDef.StockOutAllocCls> cdefList) {
        doSetStockOutAllocCls_InScope(cTStrL(cdefList));
    }

    protected void doSetStockOutAllocCls_InScope(Collection<String> stockOutAllocClsList) {
        regINS(CK_INS, cTL(stockOutAllocClsList), xgetCValueStockOutAllocCls(), "STOCK_OUT_ALLOC_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @param stockOutAllocClsList The collection of stockOutAllocCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_NotInScope(Collection<String> stockOutAllocClsList) {
        doSetStockOutAllocCls_NotInScope(stockOutAllocClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockOutAllocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutAllocCls_NotInScope_AsStockOutAllocCls(Collection<CDef.StockOutAllocCls> cdefList) {
        doSetStockOutAllocCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockOutAllocCls_NotInScope(Collection<String> stockOutAllocClsList) {
        regINS(CK_NINS, cTL(stockOutAllocClsList), xgetCValueStockOutAllocCls(), "STOCK_OUT_ALLOC_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     */
    public void setStockOutAllocCls_IsNull() { regStockOutAllocCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     */
    public void setStockOutAllocCls_IsNullOrEmpty() { regStockOutAllocCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     */
    public void setStockOutAllocCls_IsNotNull() { regStockOutAllocCls(CK_ISNN, DOBJ); }

    protected void regStockOutAllocCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutAllocCls(), "STOCK_OUT_ALLOC_CLS"); }
    protected abstract ConditionValue xgetCValueStockOutAllocCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @param stockOutInstSplitFlg The value of stockOutInstSplitFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_Equal(String stockOutInstSplitFlg) {
        doSetStockOutInstSplitFlg_Equal(fRES(stockOutInstSplitFlg));
    }

    /**
     * Equal(=). As StockOutInstSplitFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_Equal_AsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg cdef) {
        doSetStockOutInstSplitFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 分離しない
     */
    public void setStockOutInstSplitFlg_Equal_$0() {
        setStockOutInstSplitFlg_Equal_AsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 分離する
     */
    public void setStockOutInstSplitFlg_Equal_$1() {
        setStockOutInstSplitFlg_Equal_AsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.$1);
    }

    protected void doSetStockOutInstSplitFlg_Equal(String stockOutInstSplitFlg) {
        regStockOutInstSplitFlg(CK_EQ, stockOutInstSplitFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @param stockOutInstSplitFlg The value of stockOutInstSplitFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_NotEqual(String stockOutInstSplitFlg) {
        doSetStockOutInstSplitFlg_NotEqual(fRES(stockOutInstSplitFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockOutInstSplitFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_NotEqual_AsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg cdef) {
        doSetStockOutInstSplitFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 分離しない
     */
    public void setStockOutInstSplitFlg_NotEqual_$0() {
        setStockOutInstSplitFlg_NotEqual_AsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 分離する
     */
    public void setStockOutInstSplitFlg_NotEqual_$1() {
        setStockOutInstSplitFlg_NotEqual_AsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.$1);
    }

    protected void doSetStockOutInstSplitFlg_NotEqual(String stockOutInstSplitFlg) {
        regStockOutInstSplitFlg(CK_NES, stockOutInstSplitFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @param stockOutInstSplitFlgList The collection of stockOutInstSplitFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_InScope(Collection<String> stockOutInstSplitFlgList) {
        doSetStockOutInstSplitFlg_InScope(stockOutInstSplitFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockOutInstSplitFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_InScope_AsStockOutInstSplitFlg(Collection<CDef.StockOutInstSplitFlg> cdefList) {
        doSetStockOutInstSplitFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockOutInstSplitFlg_InScope(Collection<String> stockOutInstSplitFlgList) {
        regINS(CK_INS, cTL(stockOutInstSplitFlgList), xgetCValueStockOutInstSplitFlg(), "STOCK_OUT_INST_SPLIT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @param stockOutInstSplitFlgList The collection of stockOutInstSplitFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_NotInScope(Collection<String> stockOutInstSplitFlgList) {
        doSetStockOutInstSplitFlg_NotInScope(stockOutInstSplitFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockOutInstSplitFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutInstSplitFlg_NotInScope_AsStockOutInstSplitFlg(Collection<CDef.StockOutInstSplitFlg> cdefList) {
        doSetStockOutInstSplitFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockOutInstSplitFlg_NotInScope(Collection<String> stockOutInstSplitFlgList) {
        regINS(CK_NINS, cTL(stockOutInstSplitFlgList), xgetCValueStockOutInstSplitFlg(), "STOCK_OUT_INST_SPLIT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     */
    public void setStockOutInstSplitFlg_IsNull() { regStockOutInstSplitFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     */
    public void setStockOutInstSplitFlg_IsNotNull() { regStockOutInstSplitFlg(CK_ISNN, DOBJ); }

    protected void regStockOutInstSplitFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutInstSplitFlg(), "STOCK_OUT_INST_SPLIT_FLG"); }
    protected abstract ConditionValue xgetCValueStockOutInstSplitFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @param cesIntegrationFlg The value of cesIntegrationFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_Equal(String cesIntegrationFlg) {
        doSetCesIntegrationFlg_Equal(fRES(cesIntegrationFlg));
    }

    /**
     * Equal(=). As CesIntegrationFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_Equal_AsCesIntegrationFlg(CDef.CesIntegrationFlg cdef) {
        doSetCesIntegrationFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 連携しない
     */
    public void setCesIntegrationFlg_Equal_$0() {
        setCesIntegrationFlg_Equal_AsCesIntegrationFlg(CDef.CesIntegrationFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 連携する
     */
    public void setCesIntegrationFlg_Equal_$1() {
        setCesIntegrationFlg_Equal_AsCesIntegrationFlg(CDef.CesIntegrationFlg.$1);
    }

    protected void doSetCesIntegrationFlg_Equal(String cesIntegrationFlg) {
        regCesIntegrationFlg(CK_EQ, cesIntegrationFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @param cesIntegrationFlg The value of cesIntegrationFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_NotEqual(String cesIntegrationFlg) {
        doSetCesIntegrationFlg_NotEqual(fRES(cesIntegrationFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CesIntegrationFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_NotEqual_AsCesIntegrationFlg(CDef.CesIntegrationFlg cdef) {
        doSetCesIntegrationFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 連携しない
     */
    public void setCesIntegrationFlg_NotEqual_$0() {
        setCesIntegrationFlg_NotEqual_AsCesIntegrationFlg(CDef.CesIntegrationFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 連携する
     */
    public void setCesIntegrationFlg_NotEqual_$1() {
        setCesIntegrationFlg_NotEqual_AsCesIntegrationFlg(CDef.CesIntegrationFlg.$1);
    }

    protected void doSetCesIntegrationFlg_NotEqual(String cesIntegrationFlg) {
        regCesIntegrationFlg(CK_NES, cesIntegrationFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @param cesIntegrationFlgList The collection of cesIntegrationFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_InScope(Collection<String> cesIntegrationFlgList) {
        doSetCesIntegrationFlg_InScope(cesIntegrationFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CesIntegrationFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_InScope_AsCesIntegrationFlg(Collection<CDef.CesIntegrationFlg> cdefList) {
        doSetCesIntegrationFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCesIntegrationFlg_InScope(Collection<String> cesIntegrationFlgList) {
        regINS(CK_INS, cTL(cesIntegrationFlgList), xgetCValueCesIntegrationFlg(), "CES_INTEGRATION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @param cesIntegrationFlgList The collection of cesIntegrationFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_NotInScope(Collection<String> cesIntegrationFlgList) {
        doSetCesIntegrationFlg_NotInScope(cesIntegrationFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CesIntegrationFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCesIntegrationFlg_NotInScope_AsCesIntegrationFlg(Collection<CDef.CesIntegrationFlg> cdefList) {
        doSetCesIntegrationFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCesIntegrationFlg_NotInScope(Collection<String> cesIntegrationFlgList) {
        regINS(CK_NINS, cTL(cesIntegrationFlgList), xgetCValueCesIntegrationFlg(), "CES_INTEGRATION_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     */
    public void setCesIntegrationFlg_IsNull() { regCesIntegrationFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     */
    public void setCesIntegrationFlg_IsNotNull() { regCesIntegrationFlg(CK_ISNN, DOBJ); }

    protected void regCesIntegrationFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCesIntegrationFlg(), "CES_INTEGRATION_FLG"); }
    protected abstract ConditionValue xgetCValueCesIntegrationFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @param packingSlipAutoOutputFlg The value of packingSlipAutoOutputFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_Equal(String packingSlipAutoOutputFlg) {
        doSetPackingSlipAutoOutputFlg_Equal(fRES(packingSlipAutoOutputFlg));
    }

    /**
     * Equal(=). As PackingSlipAutoOutputFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_Equal_AsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg cdef) {
        doSetPackingSlipAutoOutputFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 発行しない
     */
    public void setPackingSlipAutoOutputFlg_Equal_$0() {
        setPackingSlipAutoOutputFlg_Equal_AsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行する
     */
    public void setPackingSlipAutoOutputFlg_Equal_$1() {
        setPackingSlipAutoOutputFlg_Equal_AsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.$1);
    }

    protected void doSetPackingSlipAutoOutputFlg_Equal(String packingSlipAutoOutputFlg) {
        regPackingSlipAutoOutputFlg(CK_EQ, packingSlipAutoOutputFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @param packingSlipAutoOutputFlg The value of packingSlipAutoOutputFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_NotEqual(String packingSlipAutoOutputFlg) {
        doSetPackingSlipAutoOutputFlg_NotEqual(fRES(packingSlipAutoOutputFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PackingSlipAutoOutputFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_NotEqual_AsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg cdef) {
        doSetPackingSlipAutoOutputFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 発行しない
     */
    public void setPackingSlipAutoOutputFlg_NotEqual_$0() {
        setPackingSlipAutoOutputFlg_NotEqual_AsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行する
     */
    public void setPackingSlipAutoOutputFlg_NotEqual_$1() {
        setPackingSlipAutoOutputFlg_NotEqual_AsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.$1);
    }

    protected void doSetPackingSlipAutoOutputFlg_NotEqual(String packingSlipAutoOutputFlg) {
        regPackingSlipAutoOutputFlg(CK_NES, packingSlipAutoOutputFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @param packingSlipAutoOutputFlgList The collection of packingSlipAutoOutputFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_InScope(Collection<String> packingSlipAutoOutputFlgList) {
        doSetPackingSlipAutoOutputFlg_InScope(packingSlipAutoOutputFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PackingSlipAutoOutputFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_InScope_AsPackingSlipAutoOutputFlg(Collection<CDef.PackingSlipAutoOutputFlg> cdefList) {
        doSetPackingSlipAutoOutputFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingSlipAutoOutputFlg_InScope(Collection<String> packingSlipAutoOutputFlgList) {
        regINS(CK_INS, cTL(packingSlipAutoOutputFlgList), xgetCValuePackingSlipAutoOutputFlg(), "PACKING_SLIP_AUTO_OUTPUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @param packingSlipAutoOutputFlgList The collection of packingSlipAutoOutputFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_NotInScope(Collection<String> packingSlipAutoOutputFlgList) {
        doSetPackingSlipAutoOutputFlg_NotInScope(packingSlipAutoOutputFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PackingSlipAutoOutputFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingSlipAutoOutputFlg_NotInScope_AsPackingSlipAutoOutputFlg(Collection<CDef.PackingSlipAutoOutputFlg> cdefList) {
        doSetPackingSlipAutoOutputFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingSlipAutoOutputFlg_NotInScope(Collection<String> packingSlipAutoOutputFlgList) {
        regINS(CK_NINS, cTL(packingSlipAutoOutputFlgList), xgetCValuePackingSlipAutoOutputFlg(), "PACKING_SLIP_AUTO_OUTPUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     */
    public void setPackingSlipAutoOutputFlg_IsNull() { regPackingSlipAutoOutputFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     */
    public void setPackingSlipAutoOutputFlg_IsNotNull() { regPackingSlipAutoOutputFlg(CK_ISNN, DOBJ); }

    protected void regPackingSlipAutoOutputFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingSlipAutoOutputFlg(), "PACKING_SLIP_AUTO_OUTPUT_FLG"); }
    protected abstract ConditionValue xgetCValuePackingSlipAutoOutputFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_Equal(String centerKbn) {
        doSetCenterKbn_Equal(fRES(centerKbn));
    }

    protected void doSetCenterKbn_Equal(String centerKbn) {
        regCenterKbn(CK_EQ, centerKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_NotEqual(String centerKbn) {
        doSetCenterKbn_NotEqual(fRES(centerKbn));
    }

    protected void doSetCenterKbn_NotEqual(String centerKbn) {
        regCenterKbn(CK_NES, centerKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_GreaterThan(String centerKbn) {
        regCenterKbn(CK_GT, fRES(centerKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_LessThan(String centerKbn) {
        regCenterKbn(CK_LT, fRES(centerKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_GreaterEqual(String centerKbn) {
        regCenterKbn(CK_GE, fRES(centerKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_LessEqual(String centerKbn) {
        regCenterKbn(CK_LE, fRES(centerKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbnList The collection of centerKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_InScope(Collection<String> centerKbnList) {
        doSetCenterKbn_InScope(centerKbnList);
    }

    protected void doSetCenterKbn_InScope(Collection<String> centerKbnList) {
        regINS(CK_INS, cTL(centerKbnList), xgetCValueCenterKbn(), "CENTER_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbnList The collection of centerKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_NotInScope(Collection<String> centerKbnList) {
        doSetCenterKbn_NotInScope(centerKbnList);
    }

    protected void doSetCenterKbn_NotInScope(Collection<String> centerKbnList) {
        regINS(CK_NINS, cTL(centerKbnList), xgetCValueCenterKbn(), "CENTER_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setCenterKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerKbn The value of centerKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterKbn_LikeSearch(String centerKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerKbn), xgetCValueCenterKbn(), "CENTER_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterKbn_NotLikeSearch(String centerKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerKbn), xgetCValueCenterKbn(), "CENTER_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @param centerKbn The value of centerKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterKbn_PrefixSearch(String centerKbn) {
        setCenterKbn_LikeSearch(centerKbn, xcLSOPPre());
    }

    protected void regCenterKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterKbn(), "CENTER_KBN"); }
    protected abstract ConditionValue xgetCValueCenterKbn();

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
    public HpSLCFunction<MParamCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MParamCB.class);
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
    public HpSLCFunction<MParamCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MParamCB.class);
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
    public HpSLCFunction<MParamCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MParamCB.class);
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
    public HpSLCFunction<MParamCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MParamCB.class);
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
    public HpSLCFunction<MParamCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MParamCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MParamCB&gt;() {
     *     public void query(MParamCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MParamCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MParamCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MParamCQ sq);

    protected MParamCB xcreateScalarConditionCB() {
        MParamCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MParamCB xcreateScalarConditionPartitionByCB() {
        MParamCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MParamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLIENT_CENTER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MParamCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MParamCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MParamCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLIENT_CENTER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MParamCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MParamCQ sq);

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
    protected MParamCB newMyCB() {
        return new MParamCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MParamCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

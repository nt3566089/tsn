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
 * The abstract condition-query of T_EC_ORDER_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTEcOrderHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTEcOrderHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_EC_ORDER_H";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHId The value of ecOrderHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_Equal(Long ecOrderHId) {
        doSetEcOrderHId_Equal(ecOrderHId);
    }

    protected void doSetEcOrderHId_Equal(Long ecOrderHId) {
        regEcOrderHId(CK_EQ, ecOrderHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHId The value of ecOrderHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_NotEqual(Long ecOrderHId) {
        doSetEcOrderHId_NotEqual(ecOrderHId);
    }

    protected void doSetEcOrderHId_NotEqual(Long ecOrderHId) {
        regEcOrderHId(CK_NES, ecOrderHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHId The value of ecOrderHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_GreaterThan(Long ecOrderHId) {
        regEcOrderHId(CK_GT, ecOrderHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHId The value of ecOrderHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_LessThan(Long ecOrderHId) {
        regEcOrderHId(CK_LT, ecOrderHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHId The value of ecOrderHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_GreaterEqual(Long ecOrderHId) {
        regEcOrderHId(CK_GE, ecOrderHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHId The value of ecOrderHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_LessEqual(Long ecOrderHId) {
        regEcOrderHId(CK_LE, ecOrderHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of ecOrderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ecOrderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEcOrderHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEcOrderHId(), "EC_ORDER_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHIdList The collection of ecOrderHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderHId_InScope(Collection<Long> ecOrderHIdList) {
        doSetEcOrderHId_InScope(ecOrderHIdList);
    }

    protected void doSetEcOrderHId_InScope(Collection<Long> ecOrderHIdList) {
        regINS(CK_INS, cTL(ecOrderHIdList), xgetCValueEcOrderHId(), "EC_ORDER_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderHIdList The collection of ecOrderHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderHId_NotInScope(Collection<Long> ecOrderHIdList) {
        doSetEcOrderHId_NotInScope(ecOrderHIdList);
    }

    protected void doSetEcOrderHId_NotInScope(Collection<Long> ecOrderHIdList) {
        regINS(CK_NINS, cTL(ecOrderHIdList), xgetCValueEcOrderHId(), "EC_ORDER_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EC_ORDER_H_ID from T_EC_ORDER_B where ...)} <br>
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderBList for 'exists'. (NotNull)
     */
    public void existsTEcOrderBList(SubQuery<TEcOrderBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderHId_ExistsReferrer_TEcOrderBList(cb.query());
        registerExistsReferrer(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderBList");
    }
    public abstract String keepEcOrderHId_ExistsReferrer_TEcOrderBList(TEcOrderBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EC_ORDER_H_ID from T_EC_ORDER_R where ...)} <br>
     * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderRAsOne for 'exists'. (NotNull)
     */
    public void existsTEcOrderRAsOne(SubQuery<TEcOrderRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderHId_ExistsReferrer_TEcOrderRAsOne(cb.query());
        registerExistsReferrer(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderRAsOne");
    }
    public abstract String keepEcOrderHId_ExistsReferrer_TEcOrderRAsOne(TEcOrderRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EC_ORDER_H_ID from T_EC_ORDER_B where ...)} <br>
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EcOrderHId_NotExistsReferrer_TEcOrderBList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderBList(SubQuery<TEcOrderBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderHId_NotExistsReferrer_TEcOrderBList(cb.query());
        registerNotExistsReferrer(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderBList");
    }
    public abstract String keepEcOrderHId_NotExistsReferrer_TEcOrderBList(TEcOrderBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EC_ORDER_H_ID from T_EC_ORDER_R where ...)} <br>
     * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EcOrderHId_NotExistsReferrer_TEcOrderRAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderRAsOne(SubQuery<TEcOrderRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderHId_NotExistsReferrer_TEcOrderRAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderRAsOne");
    }
    public abstract String keepEcOrderHId_NotExistsReferrer_TEcOrderRAsOne(TEcOrderRCQ sq);

    public void xsderiveTEcOrderBList(String fn, SubQuery<TEcOrderBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEcOrderHId_SpecifyDerivedReferrer_TEcOrderBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderBList", al, op);
    }
    public abstract String keepEcOrderHId_SpecifyDerivedReferrer_TEcOrderBList(TEcOrderBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_EC_ORDER_B where ...)} <br>
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTEcOrderBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TEcOrderBCB> derivedTEcOrderBList() {
        return xcreateQDRFunctionTEcOrderBList();
    }
    protected HpQDRFunction<TEcOrderBCB> xcreateQDRFunctionTEcOrderBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTEcOrderBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTEcOrderBList(String fn, SubQuery<TEcOrderBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepEcOrderHId_QueryDerivedReferrer_TEcOrderBList(cb.query()); String prpp = keepEcOrderHId_QueryDerivedReferrer_TEcOrderBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", sqpp, "tEcOrderBList", rd, vl, prpp, op);
    }
    public abstract String keepEcOrderHId_QueryDerivedReferrer_TEcOrderBList(TEcOrderBCQ sq);
    public abstract String keepEcOrderHId_QueryDerivedReferrer_TEcOrderBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEcOrderHId_IsNull() { regEcOrderHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEcOrderHId_IsNotNull() { regEcOrderHId(CK_ISNN, DOBJ); }

    protected void regEcOrderHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderHId(), "EC_ORDER_H_ID"); }
    protected abstract ConditionValue xgetCValueEcOrderHId();

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
     * CENTER_ID: {bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {bigint(19), FK to M_CENTER}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_Equal(String importDt) {
        doSetImportDt_Equal(fRES(importDt));
    }

    protected void doSetImportDt_Equal(String importDt) {
        regImportDt(CK_EQ, importDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_NotEqual(String importDt) {
        doSetImportDt_NotEqual(fRES(importDt));
    }

    protected void doSetImportDt_NotEqual(String importDt) {
        regImportDt(CK_NES, importDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_GreaterThan(String importDt) {
        regImportDt(CK_GT, fRES(importDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_LessThan(String importDt) {
        regImportDt(CK_LT, fRES(importDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_GreaterEqual(String importDt) {
        regImportDt(CK_GE, fRES(importDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_LessEqual(String importDt) {
        regImportDt(CK_LE, fRES(importDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDtList The collection of importDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_InScope(Collection<String> importDtList) {
        doSetImportDt_InScope(importDtList);
    }

    protected void doSetImportDt_InScope(Collection<String> importDtList) {
        regINS(CK_INS, cTL(importDtList), xgetCValueImportDt(), "IMPORT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDtList The collection of importDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_NotInScope(Collection<String> importDtList) {
        doSetImportDt_NotInScope(importDtList);
    }

    protected void doSetImportDt_NotInScope(Collection<String> importDtList) {
        regINS(CK_NINS, cTL(importDtList), xgetCValueImportDt(), "IMPORT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)} <br>
     * <pre>e.g. setImportDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importDt The value of importDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportDt_LikeSearch(String importDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importDt), xgetCValueImportDt(), "IMPORT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportDt_NotLikeSearch(String importDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importDt), xgetCValueImportDt(), "IMPORT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @param importDt The value of importDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportDt_PrefixSearch(String importDt) {
        setImportDt_LikeSearch(importDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     */
    public void setImportDt_IsNull() { regImportDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     */
    public void setImportDt_IsNullOrEmpty() { regImportDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_DT: {IX, varchar(8)}
     */
    public void setImportDt_IsNotNull() { regImportDt(CK_ISNN, DOBJ); }

    protected void regImportDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportDt(), "IMPORT_DT"); }
    protected abstract ConditionValue xgetCValueImportDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_Equal(String orderNo) {
        doSetOrderNo_Equal(fRES(orderNo));
    }

    protected void doSetOrderNo_Equal(String orderNo) {
        regOrderNo(CK_EQ, orderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_NotEqual(String orderNo) {
        doSetOrderNo_NotEqual(fRES(orderNo));
    }

    protected void doSetOrderNo_NotEqual(String orderNo) {
        regOrderNo(CK_NES, orderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_GreaterThan(String orderNo) {
        regOrderNo(CK_GT, fRES(orderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_LessThan(String orderNo) {
        regOrderNo(CK_LT, fRES(orderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_GreaterEqual(String orderNo) {
        regOrderNo(CK_GE, fRES(orderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_LessEqual(String orderNo) {
        regOrderNo(CK_LE, fRES(orderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNoList The collection of orderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_InScope(Collection<String> orderNoList) {
        doSetOrderNo_InScope(orderNoList);
    }

    protected void doSetOrderNo_InScope(Collection<String> orderNoList) {
        regINS(CK_INS, cTL(orderNoList), xgetCValueOrderNo(), "ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNoList The collection of orderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_NotInScope(Collection<String> orderNoList) {
        doSetOrderNo_NotInScope(orderNoList);
    }

    protected void doSetOrderNo_NotInScope(Collection<String> orderNoList) {
        regINS(CK_NINS, cTL(orderNoList), xgetCValueOrderNo(), "ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {IX, varchar(100)} <br>
     * <pre>e.g. setOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderNo The value of orderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderNo_LikeSearch(String orderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderNo), xgetCValueOrderNo(), "ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderNo_NotLikeSearch(String orderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderNo), xgetCValueOrderNo(), "ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @param orderNo The value of orderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_PrefixSearch(String orderNo) {
        setOrderNo_LikeSearch(orderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     */
    public void setOrderNo_IsNull() { regOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     */
    public void setOrderNo_IsNullOrEmpty() { regOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {IX, varchar(100)}
     */
    public void setOrderNo_IsNotNull() { regOrderNo(CK_ISNN, DOBJ); }

    protected void regOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNo(), "ORDER_NO"); }
    protected abstract ConditionValue xgetCValueOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @param priorityFlg The value of priorityFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorityFlg_Equal(String priorityFlg) {
        doSetPriorityFlg_Equal(fRES(priorityFlg));
    }

    /**
     * Equal(=). As PriorityFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorityFlg_Equal_AsPriorityFlg(CDef.PriorityFlg cdef) {
        doSetPriorityFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 優先指定無
     */
    public void setPriorityFlg_Equal_$0() {
        setPriorityFlg_Equal_AsPriorityFlg(CDef.PriorityFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 優先指定有
     */
    public void setPriorityFlg_Equal_$1() {
        setPriorityFlg_Equal_AsPriorityFlg(CDef.PriorityFlg.$1);
    }

    protected void doSetPriorityFlg_Equal(String priorityFlg) {
        regPriorityFlg(CK_EQ, priorityFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @param priorityFlg The value of priorityFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorityFlg_NotEqual(String priorityFlg) {
        doSetPriorityFlg_NotEqual(fRES(priorityFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PriorityFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorityFlg_NotEqual_AsPriorityFlg(CDef.PriorityFlg cdef) {
        doSetPriorityFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 優先指定無
     */
    public void setPriorityFlg_NotEqual_$0() {
        setPriorityFlg_NotEqual_AsPriorityFlg(CDef.PriorityFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 優先指定有
     */
    public void setPriorityFlg_NotEqual_$1() {
        setPriorityFlg_NotEqual_AsPriorityFlg(CDef.PriorityFlg.$1);
    }

    protected void doSetPriorityFlg_NotEqual(String priorityFlg) {
        regPriorityFlg(CK_NES, priorityFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @param priorityFlgList The collection of priorityFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorityFlg_InScope(Collection<String> priorityFlgList) {
        doSetPriorityFlg_InScope(priorityFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PriorityFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorityFlg_InScope_AsPriorityFlg(Collection<CDef.PriorityFlg> cdefList) {
        doSetPriorityFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPriorityFlg_InScope(Collection<String> priorityFlgList) {
        regINS(CK_INS, cTL(priorityFlgList), xgetCValuePriorityFlg(), "PRIORITY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @param priorityFlgList The collection of priorityFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorityFlg_NotInScope(Collection<String> priorityFlgList) {
        doSetPriorityFlg_NotInScope(priorityFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PriorityFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorityFlg_NotInScope_AsPriorityFlg(Collection<CDef.PriorityFlg> cdefList) {
        doSetPriorityFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPriorityFlg_NotInScope(Collection<String> priorityFlgList) {
        regINS(CK_NINS, cTL(priorityFlgList), xgetCValuePriorityFlg(), "PRIORITY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     */
    public void setPriorityFlg_IsNull() { regPriorityFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     */
    public void setPriorityFlg_IsNotNull() { regPriorityFlg(CK_ISNN, DOBJ); }

    protected void regPriorityFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriorityFlg(), "PRIORITY_FLG"); }
    protected abstract ConditionValue xgetCValuePriorityFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_Equal(String orderDt) {
        doSetOrderDt_Equal(fRES(orderDt));
    }

    protected void doSetOrderDt_Equal(String orderDt) {
        regOrderDt(CK_EQ, orderDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotEqual(String orderDt) {
        doSetOrderDt_NotEqual(fRES(orderDt));
    }

    protected void doSetOrderDt_NotEqual(String orderDt) {
        regOrderDt(CK_NES, orderDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterThan(String orderDt) {
        regOrderDt(CK_GT, fRES(orderDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessThan(String orderDt) {
        regOrderDt(CK_LT, fRES(orderDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterEqual(String orderDt) {
        regOrderDt(CK_GE, fRES(orderDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessEqual(String orderDt) {
        regOrderDt(CK_LE, fRES(orderDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDtList The collection of orderDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_InScope(Collection<String> orderDtList) {
        doSetOrderDt_InScope(orderDtList);
    }

    protected void doSetOrderDt_InScope(Collection<String> orderDtList) {
        regINS(CK_INS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDtList The collection of orderDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotInScope(Collection<String> orderDtList) {
        doSetOrderDt_NotInScope(orderDtList);
    }

    protected void doSetOrderDt_NotInScope(Collection<String> orderDtList) {
        regINS(CK_NINS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)} <br>
     * <pre>e.g. setOrderDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDt The value of orderDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDt_LikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDt_NotLikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_PrefixSearch(String orderDt) {
        setOrderDt_LikeSearch(orderDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     */
    public void setOrderDt_IsNull() { regOrderDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     */
    public void setOrderDt_IsNullOrEmpty() { regOrderDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     */
    public void setOrderDt_IsNotNull() { regOrderDt(CK_ISNN, DOBJ); }

    protected void regOrderDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDt(), "ORDER_DT"); }
    protected abstract ConditionValue xgetCValueOrderDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_Equal(String orderTime) {
        doSetOrderTime_Equal(fRES(orderTime));
    }

    protected void doSetOrderTime_Equal(String orderTime) {
        regOrderTime(CK_EQ, orderTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotEqual(String orderTime) {
        doSetOrderTime_NotEqual(fRES(orderTime));
    }

    protected void doSetOrderTime_NotEqual(String orderTime) {
        regOrderTime(CK_NES, orderTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterThan(String orderTime) {
        regOrderTime(CK_GT, fRES(orderTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessThan(String orderTime) {
        regOrderTime(CK_LT, fRES(orderTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterEqual(String orderTime) {
        regOrderTime(CK_GE, fRES(orderTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessEqual(String orderTime) {
        regOrderTime(CK_LE, fRES(orderTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTimeList The collection of orderTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_InScope(Collection<String> orderTimeList) {
        doSetOrderTime_InScope(orderTimeList);
    }

    protected void doSetOrderTime_InScope(Collection<String> orderTimeList) {
        regINS(CK_INS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTimeList The collection of orderTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotInScope(Collection<String> orderTimeList) {
        doSetOrderTime_NotInScope(orderTimeList);
    }

    protected void doSetOrderTime_NotInScope(Collection<String> orderTimeList) {
        regINS(CK_NINS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)} <br>
     * <pre>e.g. setOrderTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTime The value of orderTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTime_LikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTime_NotLikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_PrefixSearch(String orderTime) {
        setOrderTime_LikeSearch(orderTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     */
    public void setOrderTime_IsNull() { regOrderTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     */
    public void setOrderTime_IsNullOrEmpty() { regOrderTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     */
    public void setOrderTime_IsNotNull() { regOrderTime(CK_ISNN, DOBJ); }

    protected void regOrderTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTime(), "ORDER_TIME"); }
    protected abstract ConditionValue xgetCValueOrderTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_Equal(String delivDt) {
        doSetDelivDt_Equal(fRES(delivDt));
    }

    protected void doSetDelivDt_Equal(String delivDt) {
        regDelivDt(CK_EQ, delivDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotEqual(String delivDt) {
        doSetDelivDt_NotEqual(fRES(delivDt));
    }

    protected void doSetDelivDt_NotEqual(String delivDt) {
        regDelivDt(CK_NES, delivDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterThan(String delivDt) {
        regDelivDt(CK_GT, fRES(delivDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessThan(String delivDt) {
        regDelivDt(CK_LT, fRES(delivDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterEqual(String delivDt) {
        regDelivDt(CK_GE, fRES(delivDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessEqual(String delivDt) {
        regDelivDt(CK_LE, fRES(delivDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDtList The collection of delivDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_InScope(Collection<String> delivDtList) {
        doSetDelivDt_InScope(delivDtList);
    }

    protected void doSetDelivDt_InScope(Collection<String> delivDtList) {
        regINS(CK_INS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDtList The collection of delivDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotInScope(Collection<String> delivDtList) {
        doSetDelivDt_NotInScope(delivDtList);
    }

    protected void doSetDelivDt_NotInScope(Collection<String> delivDtList) {
        regINS(CK_NINS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)} <br>
     * <pre>e.g. setDelivDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivDt The value of delivDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivDt_LikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivDt_NotLikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_PrefixSearch(String delivDt) {
        setDelivDt_LikeSearch(delivDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     */
    public void setDelivDt_IsNull() { regDelivDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     */
    public void setDelivDt_IsNullOrEmpty() { regDelivDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     */
    public void setDelivDt_IsNotNull() { regDelivDt(CK_ISNN, DOBJ); }

    protected void regDelivDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivDt(), "DELIV_DT"); }
    protected abstract ConditionValue xgetCValueDelivDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_Equal(String delivTz) {
        doSetDelivTz_Equal(fRES(delivTz));
    }

    protected void doSetDelivTz_Equal(String delivTz) {
        regDelivTz(CK_EQ, delivTz);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual(String delivTz) {
        doSetDelivTz_NotEqual(fRES(delivTz));
    }

    protected void doSetDelivTz_NotEqual(String delivTz) {
        regDelivTz(CK_NES, delivTz);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_GreaterThan(String delivTz) {
        regDelivTz(CK_GT, fRES(delivTz));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_LessThan(String delivTz) {
        regDelivTz(CK_LT, fRES(delivTz));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_GreaterEqual(String delivTz) {
        regDelivTz(CK_GE, fRES(delivTz));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_LessEqual(String delivTz) {
        regDelivTz(CK_LE, fRES(delivTz));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTzList The collection of delivTz as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope(Collection<String> delivTzList) {
        doSetDelivTz_InScope(delivTzList);
    }

    protected void doSetDelivTz_InScope(Collection<String> delivTzList) {
        regINS(CK_INS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTzList The collection of delivTz as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope(Collection<String> delivTzList) {
        doSetDelivTz_NotInScope(delivTzList);
    }

    protected void doSetDelivTz_NotInScope(Collection<String> delivTzList) {
        regINS(CK_NINS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)} <br>
     * <pre>e.g. setDelivTz_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTz The value of delivTz as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTz_LikeSearch(String delivTz, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTz), xgetCValueDelivTz(), "DELIV_TZ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTz_NotLikeSearch(String delivTz, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTz), xgetCValueDelivTz(), "DELIV_TZ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_PrefixSearch(String delivTz) {
        setDelivTz_LikeSearch(delivTz, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     */
    public void setDelivTz_IsNull() { regDelivTz(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     */
    public void setDelivTz_IsNullOrEmpty() { regDelivTz(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     */
    public void setDelivTz_IsNotNull() { regDelivTz(CK_ISNN, DOBJ); }

    protected void regDelivTz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTz(), "DELIV_TZ"); }
    protected abstract ConditionValue xgetCValueDelivTz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_Equal(String comment1) {
        doSetComment1_Equal(fRES(comment1));
    }

    protected void doSetComment1_Equal(String comment1) {
        regComment1(CK_EQ, comment1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_NotEqual(String comment1) {
        doSetComment1_NotEqual(fRES(comment1));
    }

    protected void doSetComment1_NotEqual(String comment1) {
        regComment1(CK_NES, comment1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_GreaterThan(String comment1) {
        regComment1(CK_GT, fRES(comment1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_LessThan(String comment1) {
        regComment1(CK_LT, fRES(comment1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_GreaterEqual(String comment1) {
        regComment1(CK_GE, fRES(comment1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_LessEqual(String comment1) {
        regComment1(CK_LE, fRES(comment1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1List The collection of comment1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_InScope(Collection<String> comment1List) {
        doSetComment1_InScope(comment1List);
    }

    protected void doSetComment1_InScope(Collection<String> comment1List) {
        regINS(CK_INS, cTL(comment1List), xgetCValueComment1(), "COMMENT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1List The collection of comment1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_NotInScope(Collection<String> comment1List) {
        doSetComment1_NotInScope(comment1List);
    }

    protected void doSetComment1_NotInScope(Collection<String> comment1List) {
        regINS(CK_NINS, cTL(comment1List), xgetCValueComment1(), "COMMENT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT1: {varchar(255)} <br>
     * <pre>e.g. setComment1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comment1 The value of comment1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComment1_LikeSearch(String comment1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comment1), xgetCValueComment1(), "COMMENT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComment1_NotLikeSearch(String comment1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comment1), xgetCValueComment1(), "COMMENT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT1: {varchar(255)}
     * @param comment1 The value of comment1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_PrefixSearch(String comment1) {
        setComment1_LikeSearch(comment1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     */
    public void setComment1_IsNull() { regComment1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     */
    public void setComment1_IsNullOrEmpty() { regComment1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT1: {varchar(255)}
     */
    public void setComment1_IsNotNull() { regComment1(CK_ISNN, DOBJ); }

    protected void regComment1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComment1(), "COMMENT1"); }
    protected abstract ConditionValue xgetCValueComment1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_Equal(String comment2) {
        doSetComment2_Equal(fRES(comment2));
    }

    protected void doSetComment2_Equal(String comment2) {
        regComment2(CK_EQ, comment2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_NotEqual(String comment2) {
        doSetComment2_NotEqual(fRES(comment2));
    }

    protected void doSetComment2_NotEqual(String comment2) {
        regComment2(CK_NES, comment2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_GreaterThan(String comment2) {
        regComment2(CK_GT, fRES(comment2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_LessThan(String comment2) {
        regComment2(CK_LT, fRES(comment2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_GreaterEqual(String comment2) {
        regComment2(CK_GE, fRES(comment2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_LessEqual(String comment2) {
        regComment2(CK_LE, fRES(comment2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2List The collection of comment2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_InScope(Collection<String> comment2List) {
        doSetComment2_InScope(comment2List);
    }

    protected void doSetComment2_InScope(Collection<String> comment2List) {
        regINS(CK_INS, cTL(comment2List), xgetCValueComment2(), "COMMENT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2List The collection of comment2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_NotInScope(Collection<String> comment2List) {
        doSetComment2_NotInScope(comment2List);
    }

    protected void doSetComment2_NotInScope(Collection<String> comment2List) {
        regINS(CK_NINS, cTL(comment2List), xgetCValueComment2(), "COMMENT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT2: {varchar(255)} <br>
     * <pre>e.g. setComment2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comment2 The value of comment2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComment2_LikeSearch(String comment2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comment2), xgetCValueComment2(), "COMMENT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComment2_NotLikeSearch(String comment2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comment2), xgetCValueComment2(), "COMMENT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT2: {varchar(255)}
     * @param comment2 The value of comment2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_PrefixSearch(String comment2) {
        setComment2_LikeSearch(comment2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     */
    public void setComment2_IsNull() { regComment2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     */
    public void setComment2_IsNullOrEmpty() { regComment2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT2: {varchar(255)}
     */
    public void setComment2_IsNotNull() { regComment2(CK_ISNN, DOBJ); }

    protected void regComment2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComment2(), "COMMENT2"); }
    protected abstract ConditionValue xgetCValueComment2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @param giftFlg The value of giftFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_Equal(String giftFlg) {
        doSetGiftFlg_Equal(fRES(giftFlg));
    }

    /**
     * Equal(=). As GiftFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftFlg_Equal_AsGiftFlg(CDef.GiftFlg cdef) {
        doSetGiftFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ギフト指定無
     */
    public void setGiftFlg_Equal_$0() {
        setGiftFlg_Equal_AsGiftFlg(CDef.GiftFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ギフト指定有
     */
    public void setGiftFlg_Equal_$1() {
        setGiftFlg_Equal_AsGiftFlg(CDef.GiftFlg.$1);
    }

    protected void doSetGiftFlg_Equal(String giftFlg) {
        regGiftFlg(CK_EQ, giftFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @param giftFlg The value of giftFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_NotEqual(String giftFlg) {
        doSetGiftFlg_NotEqual(fRES(giftFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As GiftFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftFlg_NotEqual_AsGiftFlg(CDef.GiftFlg cdef) {
        doSetGiftFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ギフト指定無
     */
    public void setGiftFlg_NotEqual_$0() {
        setGiftFlg_NotEqual_AsGiftFlg(CDef.GiftFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ギフト指定有
     */
    public void setGiftFlg_NotEqual_$1() {
        setGiftFlg_NotEqual_AsGiftFlg(CDef.GiftFlg.$1);
    }

    protected void doSetGiftFlg_NotEqual(String giftFlg) {
        regGiftFlg(CK_NES, giftFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @param giftFlgList The collection of giftFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_InScope(Collection<String> giftFlgList) {
        doSetGiftFlg_InScope(giftFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As GiftFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_InScope_AsGiftFlg(Collection<CDef.GiftFlg> cdefList) {
        doSetGiftFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetGiftFlg_InScope(Collection<String> giftFlgList) {
        regINS(CK_INS, cTL(giftFlgList), xgetCValueGiftFlg(), "GIFT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @param giftFlgList The collection of giftFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_NotInScope(Collection<String> giftFlgList) {
        doSetGiftFlg_NotInScope(giftFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As GiftFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_NotInScope_AsGiftFlg(Collection<CDef.GiftFlg> cdefList) {
        doSetGiftFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetGiftFlg_NotInScope(Collection<String> giftFlgList) {
        regINS(CK_NINS, cTL(giftFlgList), xgetCValueGiftFlg(), "GIFT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     */
    public void setGiftFlg_IsNull() { regGiftFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     */
    public void setGiftFlg_IsNotNull() { regGiftFlg(CK_ISNN, DOBJ); }

    protected void regGiftFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftFlg(), "GIFT_FLG"); }
    protected abstract ConditionValue xgetCValueGiftFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_Equal(String noshi) {
        doSetNoshi_Equal(fRES(noshi));
    }

    protected void doSetNoshi_Equal(String noshi) {
        regNoshi(CK_EQ, noshi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_NotEqual(String noshi) {
        doSetNoshi_NotEqual(fRES(noshi));
    }

    protected void doSetNoshi_NotEqual(String noshi) {
        regNoshi(CK_NES, noshi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_GreaterThan(String noshi) {
        regNoshi(CK_GT, fRES(noshi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_LessThan(String noshi) {
        regNoshi(CK_LT, fRES(noshi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_GreaterEqual(String noshi) {
        regNoshi(CK_GE, fRES(noshi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_LessEqual(String noshi) {
        regNoshi(CK_LE, fRES(noshi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshiList The collection of noshi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_InScope(Collection<String> noshiList) {
        doSetNoshi_InScope(noshiList);
    }

    protected void doSetNoshi_InScope(Collection<String> noshiList) {
        regINS(CK_INS, cTL(noshiList), xgetCValueNoshi(), "NOSHI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshiList The collection of noshi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_NotInScope(Collection<String> noshiList) {
        doSetNoshi_NotInScope(noshiList);
    }

    protected void doSetNoshi_NotInScope(Collection<String> noshiList) {
        regINS(CK_NINS, cTL(noshiList), xgetCValueNoshi(), "NOSHI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)} <br>
     * <pre>e.g. setNoshi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noshi The value of noshi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoshi_LikeSearch(String noshi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noshi), xgetCValueNoshi(), "NOSHI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoshi_NotLikeSearch(String noshi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noshi), xgetCValueNoshi(), "NOSHI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_PrefixSearch(String noshi) {
        setNoshi_LikeSearch(noshi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     */
    public void setNoshi_IsNull() { regNoshi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     */
    public void setNoshi_IsNullOrEmpty() { regNoshi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     */
    public void setNoshi_IsNotNull() { regNoshi(CK_ISNN, DOBJ); }

    protected void regNoshi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshi(), "NOSHI"); }
    protected abstract ConditionValue xgetCValueNoshi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_Equal(String orderZipCd) {
        doSetOrderZipCd_Equal(fRES(orderZipCd));
    }

    protected void doSetOrderZipCd_Equal(String orderZipCd) {
        regOrderZipCd(CK_EQ, orderZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_NotEqual(String orderZipCd) {
        doSetOrderZipCd_NotEqual(fRES(orderZipCd));
    }

    protected void doSetOrderZipCd_NotEqual(String orderZipCd) {
        regOrderZipCd(CK_NES, orderZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_GreaterThan(String orderZipCd) {
        regOrderZipCd(CK_GT, fRES(orderZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_LessThan(String orderZipCd) {
        regOrderZipCd(CK_LT, fRES(orderZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_GreaterEqual(String orderZipCd) {
        regOrderZipCd(CK_GE, fRES(orderZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_LessEqual(String orderZipCd) {
        regOrderZipCd(CK_LE, fRES(orderZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCdList The collection of orderZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_InScope(Collection<String> orderZipCdList) {
        doSetOrderZipCd_InScope(orderZipCdList);
    }

    protected void doSetOrderZipCd_InScope(Collection<String> orderZipCdList) {
        regINS(CK_INS, cTL(orderZipCdList), xgetCValueOrderZipCd(), "ORDER_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCdList The collection of orderZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_NotInScope(Collection<String> orderZipCdList) {
        doSetOrderZipCd_NotInScope(orderZipCdList);
    }

    protected void doSetOrderZipCd_NotInScope(Collection<String> orderZipCdList) {
        regINS(CK_NINS, cTL(orderZipCdList), xgetCValueOrderZipCd(), "ORDER_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)} <br>
     * <pre>e.g. setOrderZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderZipCd The value of orderZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderZipCd_LikeSearch(String orderZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderZipCd), xgetCValueOrderZipCd(), "ORDER_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderZipCd_NotLikeSearch(String orderZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderZipCd), xgetCValueOrderZipCd(), "ORDER_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @param orderZipCd The value of orderZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd_PrefixSearch(String orderZipCd) {
        setOrderZipCd_LikeSearch(orderZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     */
    public void setOrderZipCd_IsNull() { regOrderZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     */
    public void setOrderZipCd_IsNullOrEmpty() { regOrderZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     */
    public void setOrderZipCd_IsNotNull() { regOrderZipCd(CK_ISNN, DOBJ); }

    protected void regOrderZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderZipCd(), "ORDER_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueOrderZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_Equal(String orderAddress1) {
        doSetOrderAddress1_Equal(fRES(orderAddress1));
    }

    protected void doSetOrderAddress1_Equal(String orderAddress1) {
        regOrderAddress1(CK_EQ, orderAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_NotEqual(String orderAddress1) {
        doSetOrderAddress1_NotEqual(fRES(orderAddress1));
    }

    protected void doSetOrderAddress1_NotEqual(String orderAddress1) {
        regOrderAddress1(CK_NES, orderAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_GreaterThan(String orderAddress1) {
        regOrderAddress1(CK_GT, fRES(orderAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_LessThan(String orderAddress1) {
        regOrderAddress1(CK_LT, fRES(orderAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_GreaterEqual(String orderAddress1) {
        regOrderAddress1(CK_GE, fRES(orderAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_LessEqual(String orderAddress1) {
        regOrderAddress1(CK_LE, fRES(orderAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1List The collection of orderAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_InScope(Collection<String> orderAddress1List) {
        doSetOrderAddress1_InScope(orderAddress1List);
    }

    protected void doSetOrderAddress1_InScope(Collection<String> orderAddress1List) {
        regINS(CK_INS, cTL(orderAddress1List), xgetCValueOrderAddress1(), "ORDER_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1List The collection of orderAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_NotInScope(Collection<String> orderAddress1List) {
        doSetOrderAddress1_NotInScope(orderAddress1List);
    }

    protected void doSetOrderAddress1_NotInScope(Collection<String> orderAddress1List) {
        regINS(CK_NINS, cTL(orderAddress1List), xgetCValueOrderAddress1(), "ORDER_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setOrderAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderAddress1 The value of orderAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderAddress1_LikeSearch(String orderAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderAddress1), xgetCValueOrderAddress1(), "ORDER_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderAddress1_NotLikeSearch(String orderAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderAddress1), xgetCValueOrderAddress1(), "ORDER_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_PrefixSearch(String orderAddress1) {
        setOrderAddress1_LikeSearch(orderAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     */
    public void setOrderAddress1_IsNull() { regOrderAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     */
    public void setOrderAddress1_IsNullOrEmpty() { regOrderAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     */
    public void setOrderAddress1_IsNotNull() { regOrderAddress1(CK_ISNN, DOBJ); }

    protected void regOrderAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderAddress1(), "ORDER_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueOrderAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_Equal(String orderAddress2) {
        doSetOrderAddress2_Equal(fRES(orderAddress2));
    }

    protected void doSetOrderAddress2_Equal(String orderAddress2) {
        regOrderAddress2(CK_EQ, orderAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_NotEqual(String orderAddress2) {
        doSetOrderAddress2_NotEqual(fRES(orderAddress2));
    }

    protected void doSetOrderAddress2_NotEqual(String orderAddress2) {
        regOrderAddress2(CK_NES, orderAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_GreaterThan(String orderAddress2) {
        regOrderAddress2(CK_GT, fRES(orderAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_LessThan(String orderAddress2) {
        regOrderAddress2(CK_LT, fRES(orderAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_GreaterEqual(String orderAddress2) {
        regOrderAddress2(CK_GE, fRES(orderAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_LessEqual(String orderAddress2) {
        regOrderAddress2(CK_LE, fRES(orderAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2List The collection of orderAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_InScope(Collection<String> orderAddress2List) {
        doSetOrderAddress2_InScope(orderAddress2List);
    }

    protected void doSetOrderAddress2_InScope(Collection<String> orderAddress2List) {
        regINS(CK_INS, cTL(orderAddress2List), xgetCValueOrderAddress2(), "ORDER_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2List The collection of orderAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_NotInScope(Collection<String> orderAddress2List) {
        doSetOrderAddress2_NotInScope(orderAddress2List);
    }

    protected void doSetOrderAddress2_NotInScope(Collection<String> orderAddress2List) {
        regINS(CK_NINS, cTL(orderAddress2List), xgetCValueOrderAddress2(), "ORDER_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setOrderAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderAddress2 The value of orderAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderAddress2_LikeSearch(String orderAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderAddress2), xgetCValueOrderAddress2(), "ORDER_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderAddress2_NotLikeSearch(String orderAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderAddress2), xgetCValueOrderAddress2(), "ORDER_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_PrefixSearch(String orderAddress2) {
        setOrderAddress2_LikeSearch(orderAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     */
    public void setOrderAddress2_IsNull() { regOrderAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     */
    public void setOrderAddress2_IsNullOrEmpty() { regOrderAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     */
    public void setOrderAddress2_IsNotNull() { regOrderAddress2(CK_ISNN, DOBJ); }

    protected void regOrderAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderAddress2(), "ORDER_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueOrderAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_Equal(String orderAddress3) {
        doSetOrderAddress3_Equal(fRES(orderAddress3));
    }

    protected void doSetOrderAddress3_Equal(String orderAddress3) {
        regOrderAddress3(CK_EQ, orderAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_NotEqual(String orderAddress3) {
        doSetOrderAddress3_NotEqual(fRES(orderAddress3));
    }

    protected void doSetOrderAddress3_NotEqual(String orderAddress3) {
        regOrderAddress3(CK_NES, orderAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_GreaterThan(String orderAddress3) {
        regOrderAddress3(CK_GT, fRES(orderAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_LessThan(String orderAddress3) {
        regOrderAddress3(CK_LT, fRES(orderAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_GreaterEqual(String orderAddress3) {
        regOrderAddress3(CK_GE, fRES(orderAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_LessEqual(String orderAddress3) {
        regOrderAddress3(CK_LE, fRES(orderAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3List The collection of orderAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_InScope(Collection<String> orderAddress3List) {
        doSetOrderAddress3_InScope(orderAddress3List);
    }

    protected void doSetOrderAddress3_InScope(Collection<String> orderAddress3List) {
        regINS(CK_INS, cTL(orderAddress3List), xgetCValueOrderAddress3(), "ORDER_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3List The collection of orderAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_NotInScope(Collection<String> orderAddress3List) {
        doSetOrderAddress3_NotInScope(orderAddress3List);
    }

    protected void doSetOrderAddress3_NotInScope(Collection<String> orderAddress3List) {
        regINS(CK_NINS, cTL(orderAddress3List), xgetCValueOrderAddress3(), "ORDER_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setOrderAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderAddress3 The value of orderAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderAddress3_LikeSearch(String orderAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderAddress3), xgetCValueOrderAddress3(), "ORDER_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderAddress3_NotLikeSearch(String orderAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderAddress3), xgetCValueOrderAddress3(), "ORDER_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_PrefixSearch(String orderAddress3) {
        setOrderAddress3_LikeSearch(orderAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     */
    public void setOrderAddress3_IsNull() { regOrderAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     */
    public void setOrderAddress3_IsNullOrEmpty() { regOrderAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     */
    public void setOrderAddress3_IsNotNull() { regOrderAddress3(CK_ISNN, DOBJ); }

    protected void regOrderAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderAddress3(), "ORDER_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueOrderAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_Equal(String orderCustomerNm) {
        doSetOrderCustomerNm_Equal(fRES(orderCustomerNm));
    }

    protected void doSetOrderCustomerNm_Equal(String orderCustomerNm) {
        regOrderCustomerNm(CK_EQ, orderCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_NotEqual(String orderCustomerNm) {
        doSetOrderCustomerNm_NotEqual(fRES(orderCustomerNm));
    }

    protected void doSetOrderCustomerNm_NotEqual(String orderCustomerNm) {
        regOrderCustomerNm(CK_NES, orderCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_GreaterThan(String orderCustomerNm) {
        regOrderCustomerNm(CK_GT, fRES(orderCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_LessThan(String orderCustomerNm) {
        regOrderCustomerNm(CK_LT, fRES(orderCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_GreaterEqual(String orderCustomerNm) {
        regOrderCustomerNm(CK_GE, fRES(orderCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_LessEqual(String orderCustomerNm) {
        regOrderCustomerNm(CK_LE, fRES(orderCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNmList The collection of orderCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_InScope(Collection<String> orderCustomerNmList) {
        doSetOrderCustomerNm_InScope(orderCustomerNmList);
    }

    protected void doSetOrderCustomerNm_InScope(Collection<String> orderCustomerNmList) {
        regINS(CK_INS, cTL(orderCustomerNmList), xgetCValueOrderCustomerNm(), "ORDER_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNmList The collection of orderCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_NotInScope(Collection<String> orderCustomerNmList) {
        doSetOrderCustomerNm_NotInScope(orderCustomerNmList);
    }

    protected void doSetOrderCustomerNm_NotInScope(Collection<String> orderCustomerNmList) {
        regINS(CK_NINS, cTL(orderCustomerNmList), xgetCValueOrderCustomerNm(), "ORDER_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)} <br>
     * <pre>e.g. setOrderCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderCustomerNm The value of orderCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderCustomerNm_LikeSearch(String orderCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderCustomerNm), xgetCValueOrderCustomerNm(), "ORDER_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderCustomerNm_NotLikeSearch(String orderCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderCustomerNm), xgetCValueOrderCustomerNm(), "ORDER_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @param orderCustomerNm The value of orderCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm_PrefixSearch(String orderCustomerNm) {
        setOrderCustomerNm_LikeSearch(orderCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     */
    public void setOrderCustomerNm_IsNull() { regOrderCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     */
    public void setOrderCustomerNm_IsNullOrEmpty() { regOrderCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     */
    public void setOrderCustomerNm_IsNotNull() { regOrderCustomerNm(CK_ISNN, DOBJ); }

    protected void regOrderCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderCustomerNm(), "ORDER_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueOrderCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_Equal(String orderCustomerNmKana) {
        doSetOrderCustomerNmKana_Equal(fRES(orderCustomerNmKana));
    }

    protected void doSetOrderCustomerNmKana_Equal(String orderCustomerNmKana) {
        regOrderCustomerNmKana(CK_EQ, orderCustomerNmKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_NotEqual(String orderCustomerNmKana) {
        doSetOrderCustomerNmKana_NotEqual(fRES(orderCustomerNmKana));
    }

    protected void doSetOrderCustomerNmKana_NotEqual(String orderCustomerNmKana) {
        regOrderCustomerNmKana(CK_NES, orderCustomerNmKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_GreaterThan(String orderCustomerNmKana) {
        regOrderCustomerNmKana(CK_GT, fRES(orderCustomerNmKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_LessThan(String orderCustomerNmKana) {
        regOrderCustomerNmKana(CK_LT, fRES(orderCustomerNmKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_GreaterEqual(String orderCustomerNmKana) {
        regOrderCustomerNmKana(CK_GE, fRES(orderCustomerNmKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_LessEqual(String orderCustomerNmKana) {
        regOrderCustomerNmKana(CK_LE, fRES(orderCustomerNmKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKanaList The collection of orderCustomerNmKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_InScope(Collection<String> orderCustomerNmKanaList) {
        doSetOrderCustomerNmKana_InScope(orderCustomerNmKanaList);
    }

    protected void doSetOrderCustomerNmKana_InScope(Collection<String> orderCustomerNmKanaList) {
        regINS(CK_INS, cTL(orderCustomerNmKanaList), xgetCValueOrderCustomerNmKana(), "ORDER_CUSTOMER_NM_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKanaList The collection of orderCustomerNmKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_NotInScope(Collection<String> orderCustomerNmKanaList) {
        doSetOrderCustomerNmKana_NotInScope(orderCustomerNmKanaList);
    }

    protected void doSetOrderCustomerNmKana_NotInScope(Collection<String> orderCustomerNmKanaList) {
        regINS(CK_NINS, cTL(orderCustomerNmKanaList), xgetCValueOrderCustomerNmKana(), "ORDER_CUSTOMER_NM_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * <pre>e.g. setOrderCustomerNmKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderCustomerNmKana The value of orderCustomerNmKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderCustomerNmKana_LikeSearch(String orderCustomerNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderCustomerNmKana), xgetCValueOrderCustomerNmKana(), "ORDER_CUSTOMER_NM_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderCustomerNmKana_NotLikeSearch(String orderCustomerNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderCustomerNmKana), xgetCValueOrderCustomerNmKana(), "ORDER_CUSTOMER_NM_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @param orderCustomerNmKana The value of orderCustomerNmKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNmKana_PrefixSearch(String orderCustomerNmKana) {
        setOrderCustomerNmKana_LikeSearch(orderCustomerNmKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     */
    public void setOrderCustomerNmKana_IsNull() { regOrderCustomerNmKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     */
    public void setOrderCustomerNmKana_IsNullOrEmpty() { regOrderCustomerNmKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     */
    public void setOrderCustomerNmKana_IsNotNull() { regOrderCustomerNmKana(CK_ISNN, DOBJ); }

    protected void regOrderCustomerNmKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderCustomerNmKana(), "ORDER_CUSTOMER_NM_KANA"); }
    protected abstract ConditionValue xgetCValueOrderCustomerNmKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_Equal(String orderTelNo) {
        doSetOrderTelNo_Equal(fRES(orderTelNo));
    }

    protected void doSetOrderTelNo_Equal(String orderTelNo) {
        regOrderTelNo(CK_EQ, orderTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_NotEqual(String orderTelNo) {
        doSetOrderTelNo_NotEqual(fRES(orderTelNo));
    }

    protected void doSetOrderTelNo_NotEqual(String orderTelNo) {
        regOrderTelNo(CK_NES, orderTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_GreaterThan(String orderTelNo) {
        regOrderTelNo(CK_GT, fRES(orderTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_LessThan(String orderTelNo) {
        regOrderTelNo(CK_LT, fRES(orderTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_GreaterEqual(String orderTelNo) {
        regOrderTelNo(CK_GE, fRES(orderTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_LessEqual(String orderTelNo) {
        regOrderTelNo(CK_LE, fRES(orderTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNoList The collection of orderTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_InScope(Collection<String> orderTelNoList) {
        doSetOrderTelNo_InScope(orderTelNoList);
    }

    protected void doSetOrderTelNo_InScope(Collection<String> orderTelNoList) {
        regINS(CK_INS, cTL(orderTelNoList), xgetCValueOrderTelNo(), "ORDER_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNoList The collection of orderTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_NotInScope(Collection<String> orderTelNoList) {
        doSetOrderTelNo_NotInScope(orderTelNoList);
    }

    protected void doSetOrderTelNo_NotInScope(Collection<String> orderTelNoList) {
        regINS(CK_NINS, cTL(orderTelNoList), xgetCValueOrderTelNo(), "ORDER_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)} <br>
     * <pre>e.g. setOrderTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTelNo The value of orderTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTelNo_LikeSearch(String orderTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTelNo), xgetCValueOrderTelNo(), "ORDER_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTelNo_NotLikeSearch(String orderTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTelNo), xgetCValueOrderTelNo(), "ORDER_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @param orderTelNo The value of orderTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo_PrefixSearch(String orderTelNo) {
        setOrderTelNo_LikeSearch(orderTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     */
    public void setOrderTelNo_IsNull() { regOrderTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     */
    public void setOrderTelNo_IsNullOrEmpty() { regOrderTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO: {varchar(255)}
     */
    public void setOrderTelNo_IsNotNull() { regOrderTelNo(CK_ISNN, DOBJ); }

    protected void regOrderTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTelNo(), "ORDER_TEL_NO"); }
    protected abstract ConditionValue xgetCValueOrderTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @param delivMatchFlg The value of delivMatchFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_Equal(String delivMatchFlg) {
        doSetDelivMatchFlg_Equal(fRES(delivMatchFlg));
    }

    /**
     * Equal(=). As DelivMatchFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_Equal_AsDelivMatchFlg(CDef.DelivMatchFlg cdef) {
        doSetDelivMatchFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不一致
     */
    public void setDelivMatchFlg_Equal_$0() {
        setDelivMatchFlg_Equal_AsDelivMatchFlg(CDef.DelivMatchFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 一致
     */
    public void setDelivMatchFlg_Equal_$1() {
        setDelivMatchFlg_Equal_AsDelivMatchFlg(CDef.DelivMatchFlg.$1);
    }

    protected void doSetDelivMatchFlg_Equal(String delivMatchFlg) {
        regDelivMatchFlg(CK_EQ, delivMatchFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @param delivMatchFlg The value of delivMatchFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_NotEqual(String delivMatchFlg) {
        doSetDelivMatchFlg_NotEqual(fRES(delivMatchFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DelivMatchFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_NotEqual_AsDelivMatchFlg(CDef.DelivMatchFlg cdef) {
        doSetDelivMatchFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 不一致
     */
    public void setDelivMatchFlg_NotEqual_$0() {
        setDelivMatchFlg_NotEqual_AsDelivMatchFlg(CDef.DelivMatchFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 一致
     */
    public void setDelivMatchFlg_NotEqual_$1() {
        setDelivMatchFlg_NotEqual_AsDelivMatchFlg(CDef.DelivMatchFlg.$1);
    }

    protected void doSetDelivMatchFlg_NotEqual(String delivMatchFlg) {
        regDelivMatchFlg(CK_NES, delivMatchFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @param delivMatchFlgList The collection of delivMatchFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_InScope(Collection<String> delivMatchFlgList) {
        doSetDelivMatchFlg_InScope(delivMatchFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelivMatchFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_InScope_AsDelivMatchFlg(Collection<CDef.DelivMatchFlg> cdefList) {
        doSetDelivMatchFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelivMatchFlg_InScope(Collection<String> delivMatchFlgList) {
        regINS(CK_INS, cTL(delivMatchFlgList), xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @param delivMatchFlgList The collection of delivMatchFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_NotInScope(Collection<String> delivMatchFlgList) {
        doSetDelivMatchFlg_NotInScope(delivMatchFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DelivMatchFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_NotInScope_AsDelivMatchFlg(Collection<CDef.DelivMatchFlg> cdefList) {
        doSetDelivMatchFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDelivMatchFlg_NotInScope(Collection<String> delivMatchFlgList) {
        regINS(CK_NINS, cTL(delivMatchFlgList), xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     */
    public void setDelivMatchFlg_IsNull() { regDelivMatchFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     */
    public void setDelivMatchFlg_IsNotNull() { regDelivMatchFlg(CK_ISNN, DOBJ); }

    protected void regDelivMatchFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG"); }
    protected abstract ConditionValue xgetCValueDelivMatchFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_Equal(String mergeId) {
        doSetMergeId_Equal(fRES(mergeId));
    }

    protected void doSetMergeId_Equal(String mergeId) {
        regMergeId(CK_EQ, mergeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_NotEqual(String mergeId) {
        doSetMergeId_NotEqual(fRES(mergeId));
    }

    protected void doSetMergeId_NotEqual(String mergeId) {
        regMergeId(CK_NES, mergeId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_GreaterThan(String mergeId) {
        regMergeId(CK_GT, fRES(mergeId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_LessThan(String mergeId) {
        regMergeId(CK_LT, fRES(mergeId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_GreaterEqual(String mergeId) {
        regMergeId(CK_GE, fRES(mergeId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_LessEqual(String mergeId) {
        regMergeId(CK_LE, fRES(mergeId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeIdList The collection of mergeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_InScope(Collection<String> mergeIdList) {
        doSetMergeId_InScope(mergeIdList);
    }

    protected void doSetMergeId_InScope(Collection<String> mergeIdList) {
        regINS(CK_INS, cTL(mergeIdList), xgetCValueMergeId(), "MERGE_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeIdList The collection of mergeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_NotInScope(Collection<String> mergeIdList) {
        doSetMergeId_NotInScope(mergeIdList);
    }

    protected void doSetMergeId_NotInScope(Collection<String> mergeIdList) {
        regINS(CK_NINS, cTL(mergeIdList), xgetCValueMergeId(), "MERGE_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_ID: {IX, varchar(100)} <br>
     * <pre>e.g. setMergeId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mergeId The value of mergeId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMergeId_LikeSearch(String mergeId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mergeId), xgetCValueMergeId(), "MERGE_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMergeId_NotLikeSearch(String mergeId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mergeId), xgetCValueMergeId(), "MERGE_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @param mergeId The value of mergeId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeId_PrefixSearch(String mergeId) {
        setMergeId_LikeSearch(mergeId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     */
    public void setMergeId_IsNull() { regMergeId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     */
    public void setMergeId_IsNullOrEmpty() { regMergeId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_ID: {IX, varchar(100)}
     */
    public void setMergeId_IsNotNull() { regMergeId(CK_ISNN, DOBJ); }

    protected void regMergeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeId(), "MERGE_ID"); }
    protected abstract ConditionValue xgetCValueMergeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_Equal(String mergeStatus) {
        doSetMergeStatus_Equal(fRES(mergeStatus));
    }

    protected void doSetMergeStatus_Equal(String mergeStatus) {
        regMergeStatus(CK_EQ, mergeStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_NotEqual(String mergeStatus) {
        doSetMergeStatus_NotEqual(fRES(mergeStatus));
    }

    protected void doSetMergeStatus_NotEqual(String mergeStatus) {
        regMergeStatus(CK_NES, mergeStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_GreaterThan(String mergeStatus) {
        regMergeStatus(CK_GT, fRES(mergeStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_LessThan(String mergeStatus) {
        regMergeStatus(CK_LT, fRES(mergeStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_GreaterEqual(String mergeStatus) {
        regMergeStatus(CK_GE, fRES(mergeStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_LessEqual(String mergeStatus) {
        regMergeStatus(CK_LE, fRES(mergeStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatusList The collection of mergeStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_InScope(Collection<String> mergeStatusList) {
        doSetMergeStatus_InScope(mergeStatusList);
    }

    protected void doSetMergeStatus_InScope(Collection<String> mergeStatusList) {
        regINS(CK_INS, cTL(mergeStatusList), xgetCValueMergeStatus(), "MERGE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatusList The collection of mergeStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_NotInScope(Collection<String> mergeStatusList) {
        doSetMergeStatus_NotInScope(mergeStatusList);
    }

    protected void doSetMergeStatus_NotInScope(Collection<String> mergeStatusList) {
        regINS(CK_NINS, cTL(mergeStatusList), xgetCValueMergeStatus(), "MERGE_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_STATUS: {varchar(30)} <br>
     * <pre>e.g. setMergeStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mergeStatus The value of mergeStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMergeStatus_LikeSearch(String mergeStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mergeStatus), xgetCValueMergeStatus(), "MERGE_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMergeStatus_NotLikeSearch(String mergeStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mergeStatus), xgetCValueMergeStatus(), "MERGE_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     * @param mergeStatus The value of mergeStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeStatus_PrefixSearch(String mergeStatus) {
        setMergeStatus_LikeSearch(mergeStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     */
    public void setMergeStatus_IsNull() { regMergeStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     */
    public void setMergeStatus_IsNullOrEmpty() { regMergeStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_STATUS: {varchar(30)}
     */
    public void setMergeStatus_IsNotNull() { regMergeStatus(CK_ISNN, DOBJ); }

    protected void regMergeStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeStatus(), "MERGE_STATUS"); }
    protected abstract ConditionValue xgetCValueMergeStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_Equal(String delivZipCd) {
        doSetDelivZipCd_Equal(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_Equal(String delivZipCd) {
        regDelivZipCd(CK_EQ, delivZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotEqual(String delivZipCd) {
        doSetDelivZipCd_NotEqual(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_NotEqual(String delivZipCd) {
        regDelivZipCd(CK_NES, delivZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterThan(String delivZipCd) {
        regDelivZipCd(CK_GT, fRES(delivZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessThan(String delivZipCd) {
        regDelivZipCd(CK_LT, fRES(delivZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterEqual(String delivZipCd) {
        regDelivZipCd(CK_GE, fRES(delivZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessEqual(String delivZipCd) {
        regDelivZipCd(CK_LE, fRES(delivZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCdList The collection of delivZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_InScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_InScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_InScope(Collection<String> delivZipCdList) {
        regINS(CK_INS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCdList The collection of delivZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_NotInScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        regINS(CK_NINS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)} <br>
     * <pre>e.g. setDelivZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd The value of delivZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd_LikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd_NotLikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_PrefixSearch(String delivZipCd) {
        setDelivZipCd_LikeSearch(delivZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     */
    public void setDelivZipCd_IsNull() { regDelivZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     */
    public void setDelivZipCd_IsNullOrEmpty() { regDelivZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     */
    public void setDelivZipCd_IsNotNull() { regDelivZipCd(CK_ISNN, DOBJ); }

    protected void regDelivZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd(), "DELIV_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDelivZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_Equal(String delivAddress1) {
        doSetDelivAddress1_Equal(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_Equal(String delivAddress1) {
        regDelivAddress1(CK_EQ, delivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotEqual(String delivAddress1) {
        doSetDelivAddress1_NotEqual(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_NotEqual(String delivAddress1) {
        regDelivAddress1(CK_NES, delivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterThan(String delivAddress1) {
        regDelivAddress1(CK_GT, fRES(delivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessThan(String delivAddress1) {
        regDelivAddress1(CK_LT, fRES(delivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterEqual(String delivAddress1) {
        regDelivAddress1(CK_GE, fRES(delivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessEqual(String delivAddress1) {
        regDelivAddress1(CK_LE, fRES(delivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1List The collection of delivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_InScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_InScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_InScope(Collection<String> delivAddress1List) {
        regINS(CK_INS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1List The collection of delivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_NotInScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        regINS(CK_NINS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress1 The value of delivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress1_LikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress1_NotLikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_PrefixSearch(String delivAddress1) {
        setDelivAddress1_LikeSearch(delivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNull() { regDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNullOrEmpty() { regDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNotNull() { regDelivAddress1(CK_ISNN, DOBJ); }

    protected void regDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress1(), "DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_Equal(String delivAddress2) {
        doSetDelivAddress2_Equal(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_Equal(String delivAddress2) {
        regDelivAddress2(CK_EQ, delivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotEqual(String delivAddress2) {
        doSetDelivAddress2_NotEqual(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_NotEqual(String delivAddress2) {
        regDelivAddress2(CK_NES, delivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterThan(String delivAddress2) {
        regDelivAddress2(CK_GT, fRES(delivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessThan(String delivAddress2) {
        regDelivAddress2(CK_LT, fRES(delivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterEqual(String delivAddress2) {
        regDelivAddress2(CK_GE, fRES(delivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessEqual(String delivAddress2) {
        regDelivAddress2(CK_LE, fRES(delivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2List The collection of delivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_InScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_InScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_InScope(Collection<String> delivAddress2List) {
        regINS(CK_INS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2List The collection of delivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_NotInScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        regINS(CK_NINS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress2 The value of delivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress2_LikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress2_NotLikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_PrefixSearch(String delivAddress2) {
        setDelivAddress2_LikeSearch(delivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNull() { regDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNullOrEmpty() { regDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNotNull() { regDelivAddress2(CK_ISNN, DOBJ); }

    protected void regDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress2(), "DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_Equal(String delivAddress3) {
        doSetDelivAddress3_Equal(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_Equal(String delivAddress3) {
        regDelivAddress3(CK_EQ, delivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotEqual(String delivAddress3) {
        doSetDelivAddress3_NotEqual(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_NotEqual(String delivAddress3) {
        regDelivAddress3(CK_NES, delivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterThan(String delivAddress3) {
        regDelivAddress3(CK_GT, fRES(delivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessThan(String delivAddress3) {
        regDelivAddress3(CK_LT, fRES(delivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterEqual(String delivAddress3) {
        regDelivAddress3(CK_GE, fRES(delivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessEqual(String delivAddress3) {
        regDelivAddress3(CK_LE, fRES(delivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3List The collection of delivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_InScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_InScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_InScope(Collection<String> delivAddress3List) {
        regINS(CK_INS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3List The collection of delivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_NotInScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        regINS(CK_NINS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress3 The value of delivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress3_LikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress3_NotLikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_PrefixSearch(String delivAddress3) {
        setDelivAddress3_LikeSearch(delivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNull() { regDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNullOrEmpty() { regDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNotNull() { regDelivAddress3(CK_ISNN, DOBJ); }

    protected void regDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress3(), "DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_Equal(String invoiceDelivAddress1) {
        doSetInvoiceDelivAddress1_Equal(fRES(invoiceDelivAddress1));
    }

    protected void doSetInvoiceDelivAddress1_Equal(String invoiceDelivAddress1) {
        regInvoiceDelivAddress1(CK_EQ, invoiceDelivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_NotEqual(String invoiceDelivAddress1) {
        doSetInvoiceDelivAddress1_NotEqual(fRES(invoiceDelivAddress1));
    }

    protected void doSetInvoiceDelivAddress1_NotEqual(String invoiceDelivAddress1) {
        regInvoiceDelivAddress1(CK_NES, invoiceDelivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_GreaterThan(String invoiceDelivAddress1) {
        regInvoiceDelivAddress1(CK_GT, fRES(invoiceDelivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_LessThan(String invoiceDelivAddress1) {
        regInvoiceDelivAddress1(CK_LT, fRES(invoiceDelivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_GreaterEqual(String invoiceDelivAddress1) {
        regInvoiceDelivAddress1(CK_GE, fRES(invoiceDelivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_LessEqual(String invoiceDelivAddress1) {
        regInvoiceDelivAddress1(CK_LE, fRES(invoiceDelivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1List The collection of invoiceDelivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_InScope(Collection<String> invoiceDelivAddress1List) {
        doSetInvoiceDelivAddress1_InScope(invoiceDelivAddress1List);
    }

    protected void doSetInvoiceDelivAddress1_InScope(Collection<String> invoiceDelivAddress1List) {
        regINS(CK_INS, cTL(invoiceDelivAddress1List), xgetCValueInvoiceDelivAddress1(), "INVOICE_DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1List The collection of invoiceDelivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_NotInScope(Collection<String> invoiceDelivAddress1List) {
        doSetInvoiceDelivAddress1_NotInScope(invoiceDelivAddress1List);
    }

    protected void doSetInvoiceDelivAddress1_NotInScope(Collection<String> invoiceDelivAddress1List) {
        regINS(CK_NINS, cTL(invoiceDelivAddress1List), xgetCValueInvoiceDelivAddress1(), "INVOICE_DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setInvoiceDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceDelivAddress1_LikeSearch(String invoiceDelivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceDelivAddress1), xgetCValueInvoiceDelivAddress1(), "INVOICE_DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceDelivAddress1_NotLikeSearch(String invoiceDelivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceDelivAddress1), xgetCValueInvoiceDelivAddress1(), "INVOICE_DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @param invoiceDelivAddress1 The value of invoiceDelivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress1_PrefixSearch(String invoiceDelivAddress1) {
        setInvoiceDelivAddress1_LikeSearch(invoiceDelivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     */
    public void setInvoiceDelivAddress1_IsNull() { regInvoiceDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     */
    public void setInvoiceDelivAddress1_IsNullOrEmpty() { regInvoiceDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     */
    public void setInvoiceDelivAddress1_IsNotNull() { regInvoiceDelivAddress1(CK_ISNN, DOBJ); }

    protected void regInvoiceDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceDelivAddress1(), "INVOICE_DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueInvoiceDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_Equal(String invoiceDelivAddress2) {
        doSetInvoiceDelivAddress2_Equal(fRES(invoiceDelivAddress2));
    }

    protected void doSetInvoiceDelivAddress2_Equal(String invoiceDelivAddress2) {
        regInvoiceDelivAddress2(CK_EQ, invoiceDelivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_NotEqual(String invoiceDelivAddress2) {
        doSetInvoiceDelivAddress2_NotEqual(fRES(invoiceDelivAddress2));
    }

    protected void doSetInvoiceDelivAddress2_NotEqual(String invoiceDelivAddress2) {
        regInvoiceDelivAddress2(CK_NES, invoiceDelivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_GreaterThan(String invoiceDelivAddress2) {
        regInvoiceDelivAddress2(CK_GT, fRES(invoiceDelivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_LessThan(String invoiceDelivAddress2) {
        regInvoiceDelivAddress2(CK_LT, fRES(invoiceDelivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_GreaterEqual(String invoiceDelivAddress2) {
        regInvoiceDelivAddress2(CK_GE, fRES(invoiceDelivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_LessEqual(String invoiceDelivAddress2) {
        regInvoiceDelivAddress2(CK_LE, fRES(invoiceDelivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2List The collection of invoiceDelivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_InScope(Collection<String> invoiceDelivAddress2List) {
        doSetInvoiceDelivAddress2_InScope(invoiceDelivAddress2List);
    }

    protected void doSetInvoiceDelivAddress2_InScope(Collection<String> invoiceDelivAddress2List) {
        regINS(CK_INS, cTL(invoiceDelivAddress2List), xgetCValueInvoiceDelivAddress2(), "INVOICE_DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2List The collection of invoiceDelivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_NotInScope(Collection<String> invoiceDelivAddress2List) {
        doSetInvoiceDelivAddress2_NotInScope(invoiceDelivAddress2List);
    }

    protected void doSetInvoiceDelivAddress2_NotInScope(Collection<String> invoiceDelivAddress2List) {
        regINS(CK_NINS, cTL(invoiceDelivAddress2List), xgetCValueInvoiceDelivAddress2(), "INVOICE_DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setInvoiceDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceDelivAddress2_LikeSearch(String invoiceDelivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceDelivAddress2), xgetCValueInvoiceDelivAddress2(), "INVOICE_DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceDelivAddress2_NotLikeSearch(String invoiceDelivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceDelivAddress2), xgetCValueInvoiceDelivAddress2(), "INVOICE_DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @param invoiceDelivAddress2 The value of invoiceDelivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress2_PrefixSearch(String invoiceDelivAddress2) {
        setInvoiceDelivAddress2_LikeSearch(invoiceDelivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     */
    public void setInvoiceDelivAddress2_IsNull() { regInvoiceDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     */
    public void setInvoiceDelivAddress2_IsNullOrEmpty() { regInvoiceDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     */
    public void setInvoiceDelivAddress2_IsNotNull() { regInvoiceDelivAddress2(CK_ISNN, DOBJ); }

    protected void regInvoiceDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceDelivAddress2(), "INVOICE_DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueInvoiceDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_Equal(String invoiceDelivAddress3) {
        doSetInvoiceDelivAddress3_Equal(fRES(invoiceDelivAddress3));
    }

    protected void doSetInvoiceDelivAddress3_Equal(String invoiceDelivAddress3) {
        regInvoiceDelivAddress3(CK_EQ, invoiceDelivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_NotEqual(String invoiceDelivAddress3) {
        doSetInvoiceDelivAddress3_NotEqual(fRES(invoiceDelivAddress3));
    }

    protected void doSetInvoiceDelivAddress3_NotEqual(String invoiceDelivAddress3) {
        regInvoiceDelivAddress3(CK_NES, invoiceDelivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_GreaterThan(String invoiceDelivAddress3) {
        regInvoiceDelivAddress3(CK_GT, fRES(invoiceDelivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_LessThan(String invoiceDelivAddress3) {
        regInvoiceDelivAddress3(CK_LT, fRES(invoiceDelivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_GreaterEqual(String invoiceDelivAddress3) {
        regInvoiceDelivAddress3(CK_GE, fRES(invoiceDelivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_LessEqual(String invoiceDelivAddress3) {
        regInvoiceDelivAddress3(CK_LE, fRES(invoiceDelivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3List The collection of invoiceDelivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_InScope(Collection<String> invoiceDelivAddress3List) {
        doSetInvoiceDelivAddress3_InScope(invoiceDelivAddress3List);
    }

    protected void doSetInvoiceDelivAddress3_InScope(Collection<String> invoiceDelivAddress3List) {
        regINS(CK_INS, cTL(invoiceDelivAddress3List), xgetCValueInvoiceDelivAddress3(), "INVOICE_DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3List The collection of invoiceDelivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_NotInScope(Collection<String> invoiceDelivAddress3List) {
        doSetInvoiceDelivAddress3_NotInScope(invoiceDelivAddress3List);
    }

    protected void doSetInvoiceDelivAddress3_NotInScope(Collection<String> invoiceDelivAddress3List) {
        regINS(CK_NINS, cTL(invoiceDelivAddress3List), xgetCValueInvoiceDelivAddress3(), "INVOICE_DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setInvoiceDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceDelivAddress3_LikeSearch(String invoiceDelivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceDelivAddress3), xgetCValueInvoiceDelivAddress3(), "INVOICE_DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceDelivAddress3_NotLikeSearch(String invoiceDelivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceDelivAddress3), xgetCValueInvoiceDelivAddress3(), "INVOICE_DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @param invoiceDelivAddress3 The value of invoiceDelivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceDelivAddress3_PrefixSearch(String invoiceDelivAddress3) {
        setInvoiceDelivAddress3_LikeSearch(invoiceDelivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     */
    public void setInvoiceDelivAddress3_IsNull() { regInvoiceDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     */
    public void setInvoiceDelivAddress3_IsNullOrEmpty() { regInvoiceDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     */
    public void setInvoiceDelivAddress3_IsNotNull() { regInvoiceDelivAddress3(CK_ISNN, DOBJ); }

    protected void regInvoiceDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceDelivAddress3(), "INVOICE_DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueInvoiceDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_Equal(String delivCustomerNm) {
        doSetDelivCustomerNm_Equal(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_Equal(String delivCustomerNm) {
        regDelivCustomerNm(CK_EQ, delivCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotEqual(String delivCustomerNm) {
        doSetDelivCustomerNm_NotEqual(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_NotEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_NES, delivCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_GT, fRES(delivCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_LT, fRES(delivCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_GE, fRES(delivCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_LE, fRES(delivCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_InScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        regINS(CK_INS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_NotInScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        regINS(CK_NINS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm The value of delivCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm_LikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm_NotLikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_PrefixSearch(String delivCustomerNm) {
        setDelivCustomerNm_LikeSearch(delivCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     */
    public void setDelivCustomerNm_IsNull() { regDelivCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     */
    public void setDelivCustomerNm_IsNullOrEmpty() { regDelivCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     */
    public void setDelivCustomerNm_IsNotNull() { regDelivCustomerNm(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_Equal(String delivCustomerNmKana) {
        doSetDelivCustomerNmKana_Equal(fRES(delivCustomerNmKana));
    }

    protected void doSetDelivCustomerNmKana_Equal(String delivCustomerNmKana) {
        regDelivCustomerNmKana(CK_EQ, delivCustomerNmKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_NotEqual(String delivCustomerNmKana) {
        doSetDelivCustomerNmKana_NotEqual(fRES(delivCustomerNmKana));
    }

    protected void doSetDelivCustomerNmKana_NotEqual(String delivCustomerNmKana) {
        regDelivCustomerNmKana(CK_NES, delivCustomerNmKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_GreaterThan(String delivCustomerNmKana) {
        regDelivCustomerNmKana(CK_GT, fRES(delivCustomerNmKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_LessThan(String delivCustomerNmKana) {
        regDelivCustomerNmKana(CK_LT, fRES(delivCustomerNmKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_GreaterEqual(String delivCustomerNmKana) {
        regDelivCustomerNmKana(CK_GE, fRES(delivCustomerNmKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_LessEqual(String delivCustomerNmKana) {
        regDelivCustomerNmKana(CK_LE, fRES(delivCustomerNmKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKanaList The collection of delivCustomerNmKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_InScope(Collection<String> delivCustomerNmKanaList) {
        doSetDelivCustomerNmKana_InScope(delivCustomerNmKanaList);
    }

    protected void doSetDelivCustomerNmKana_InScope(Collection<String> delivCustomerNmKanaList) {
        regINS(CK_INS, cTL(delivCustomerNmKanaList), xgetCValueDelivCustomerNmKana(), "DELIV_CUSTOMER_NM_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKanaList The collection of delivCustomerNmKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_NotInScope(Collection<String> delivCustomerNmKanaList) {
        doSetDelivCustomerNmKana_NotInScope(delivCustomerNmKanaList);
    }

    protected void doSetDelivCustomerNmKana_NotInScope(Collection<String> delivCustomerNmKanaList) {
        regINS(CK_NINS, cTL(delivCustomerNmKanaList), xgetCValueDelivCustomerNmKana(), "DELIV_CUSTOMER_NM_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerNmKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNmKana The value of delivCustomerNmKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNmKana_LikeSearch(String delivCustomerNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNmKana), xgetCValueDelivCustomerNmKana(), "DELIV_CUSTOMER_NM_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNmKana_NotLikeSearch(String delivCustomerNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNmKana), xgetCValueDelivCustomerNmKana(), "DELIV_CUSTOMER_NM_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @param delivCustomerNmKana The value of delivCustomerNmKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNmKana_PrefixSearch(String delivCustomerNmKana) {
        setDelivCustomerNmKana_LikeSearch(delivCustomerNmKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     */
    public void setDelivCustomerNmKana_IsNull() { regDelivCustomerNmKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     */
    public void setDelivCustomerNmKana_IsNullOrEmpty() { regDelivCustomerNmKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     */
    public void setDelivCustomerNmKana_IsNotNull() { regDelivCustomerNmKana(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNmKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNmKana(), "DELIV_CUSTOMER_NM_KANA"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNmKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_Equal(String delivTelNo) {
        doSetDelivTelNo_Equal(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_Equal(String delivTelNo) {
        regDelivTelNo(CK_EQ, delivTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotEqual(String delivTelNo) {
        doSetDelivTelNo_NotEqual(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_NotEqual(String delivTelNo) {
        regDelivTelNo(CK_NES, delivTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterThan(String delivTelNo) {
        regDelivTelNo(CK_GT, fRES(delivTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessThan(String delivTelNo) {
        regDelivTelNo(CK_LT, fRES(delivTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterEqual(String delivTelNo) {
        regDelivTelNo(CK_GE, fRES(delivTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessEqual(String delivTelNo) {
        regDelivTelNo(CK_LE, fRES(delivTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNoList The collection of delivTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_InScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_InScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_InScope(Collection<String> delivTelNoList) {
        regINS(CK_INS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNoList The collection of delivTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_NotInScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        regINS(CK_NINS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)} <br>
     * <pre>e.g. setDelivTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo The value of delivTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo_LikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo_NotLikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_PrefixSearch(String delivTelNo) {
        setDelivTelNo_LikeSearch(delivTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     */
    public void setDelivTelNo_IsNull() { regDelivTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     */
    public void setDelivTelNo_IsNullOrEmpty() { regDelivTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     */
    public void setDelivTelNo_IsNotNull() { regDelivTelNo(CK_ISNN, DOBJ); }

    protected void regDelivTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo(), "DELIV_TEL_NO"); }
    protected abstract ConditionValue xgetCValueDelivTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_Equal(String delivMethod) {
        doSetDelivMethod_Equal(fRES(delivMethod));
    }

    protected void doSetDelivMethod_Equal(String delivMethod) {
        regDelivMethod(CK_EQ, delivMethod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_NotEqual(String delivMethod) {
        doSetDelivMethod_NotEqual(fRES(delivMethod));
    }

    protected void doSetDelivMethod_NotEqual(String delivMethod) {
        regDelivMethod(CK_NES, delivMethod);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_GreaterThan(String delivMethod) {
        regDelivMethod(CK_GT, fRES(delivMethod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_LessThan(String delivMethod) {
        regDelivMethod(CK_LT, fRES(delivMethod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_GreaterEqual(String delivMethod) {
        regDelivMethod(CK_GE, fRES(delivMethod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_LessEqual(String delivMethod) {
        regDelivMethod(CK_LE, fRES(delivMethod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethodList The collection of delivMethod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_InScope(Collection<String> delivMethodList) {
        doSetDelivMethod_InScope(delivMethodList);
    }

    protected void doSetDelivMethod_InScope(Collection<String> delivMethodList) {
        regINS(CK_INS, cTL(delivMethodList), xgetCValueDelivMethod(), "DELIV_METHOD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethodList The collection of delivMethod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_NotInScope(Collection<String> delivMethodList) {
        doSetDelivMethod_NotInScope(delivMethodList);
    }

    protected void doSetDelivMethod_NotInScope(Collection<String> delivMethodList) {
        regINS(CK_NINS, cTL(delivMethodList), xgetCValueDelivMethod(), "DELIV_METHOD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)} <br>
     * <pre>e.g. setDelivMethod_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivMethod The value of delivMethod as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivMethod_LikeSearch(String delivMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivMethod), xgetCValueDelivMethod(), "DELIV_METHOD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivMethod_NotLikeSearch(String delivMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivMethod), xgetCValueDelivMethod(), "DELIV_METHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_PrefixSearch(String delivMethod) {
        setDelivMethod_LikeSearch(delivMethod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     */
    public void setDelivMethod_IsNull() { regDelivMethod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     */
    public void setDelivMethod_IsNullOrEmpty() { regDelivMethod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     */
    public void setDelivMethod_IsNotNull() { regDelivMethod(CK_ISNN, DOBJ); }

    protected void regDelivMethod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivMethod(), "DELIV_METHOD"); }
    protected abstract ConditionValue xgetCValueDelivMethod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_Equal(String delivType) {
        doSetDelivType_Equal(fRES(delivType));
    }

    protected void doSetDelivType_Equal(String delivType) {
        regDelivType(CK_EQ, delivType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_NotEqual(String delivType) {
        doSetDelivType_NotEqual(fRES(delivType));
    }

    protected void doSetDelivType_NotEqual(String delivType) {
        regDelivType(CK_NES, delivType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_GreaterThan(String delivType) {
        regDelivType(CK_GT, fRES(delivType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_LessThan(String delivType) {
        regDelivType(CK_LT, fRES(delivType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_GreaterEqual(String delivType) {
        regDelivType(CK_GE, fRES(delivType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_LessEqual(String delivType) {
        regDelivType(CK_LE, fRES(delivType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivTypeList The collection of delivType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_InScope(Collection<String> delivTypeList) {
        doSetDelivType_InScope(delivTypeList);
    }

    protected void doSetDelivType_InScope(Collection<String> delivTypeList) {
        regINS(CK_INS, cTL(delivTypeList), xgetCValueDelivType(), "DELIV_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivTypeList The collection of delivType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_NotInScope(Collection<String> delivTypeList) {
        doSetDelivType_NotInScope(delivTypeList);
    }

    protected void doSetDelivType_NotInScope(Collection<String> delivTypeList) {
        regINS(CK_NINS, cTL(delivTypeList), xgetCValueDelivType(), "DELIV_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)} <br>
     * <pre>e.g. setDelivType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivType The value of delivType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivType_LikeSearch(String delivType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivType), xgetCValueDelivType(), "DELIV_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivType_NotLikeSearch(String delivType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivType), xgetCValueDelivType(), "DELIV_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_PrefixSearch(String delivType) {
        setDelivType_LikeSearch(delivType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     */
    public void setDelivType_IsNull() { regDelivType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     */
    public void setDelivType_IsNullOrEmpty() { regDelivType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     */
    public void setDelivType_IsNotNull() { regDelivType(CK_ISNN, DOBJ); }

    protected void regDelivType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivType(), "DELIV_TYPE"); }
    protected abstract ConditionValue xgetCValueDelivType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_Equal(String delivCompany) {
        doSetDelivCompany_Equal(fRES(delivCompany));
    }

    protected void doSetDelivCompany_Equal(String delivCompany) {
        regDelivCompany(CK_EQ, delivCompany);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_NotEqual(String delivCompany) {
        doSetDelivCompany_NotEqual(fRES(delivCompany));
    }

    protected void doSetDelivCompany_NotEqual(String delivCompany) {
        regDelivCompany(CK_NES, delivCompany);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_GreaterThan(String delivCompany) {
        regDelivCompany(CK_GT, fRES(delivCompany));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_LessThan(String delivCompany) {
        regDelivCompany(CK_LT, fRES(delivCompany));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_GreaterEqual(String delivCompany) {
        regDelivCompany(CK_GE, fRES(delivCompany));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_LessEqual(String delivCompany) {
        regDelivCompany(CK_LE, fRES(delivCompany));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompanyList The collection of delivCompany as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_InScope(Collection<String> delivCompanyList) {
        doSetDelivCompany_InScope(delivCompanyList);
    }

    protected void doSetDelivCompany_InScope(Collection<String> delivCompanyList) {
        regINS(CK_INS, cTL(delivCompanyList), xgetCValueDelivCompany(), "DELIV_COMPANY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompanyList The collection of delivCompany as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_NotInScope(Collection<String> delivCompanyList) {
        doSetDelivCompany_NotInScope(delivCompanyList);
    }

    protected void doSetDelivCompany_NotInScope(Collection<String> delivCompanyList) {
        regINS(CK_NINS, cTL(delivCompanyList), xgetCValueDelivCompany(), "DELIV_COMPANY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)} <br>
     * <pre>e.g. setDelivCompany_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCompany The value of delivCompany as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCompany_LikeSearch(String delivCompany, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCompany), xgetCValueDelivCompany(), "DELIV_COMPANY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCompany_NotLikeSearch(String delivCompany, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCompany), xgetCValueDelivCompany(), "DELIV_COMPANY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_PrefixSearch(String delivCompany) {
        setDelivCompany_LikeSearch(delivCompany, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     */
    public void setDelivCompany_IsNull() { regDelivCompany(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     */
    public void setDelivCompany_IsNullOrEmpty() { regDelivCompany(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     */
    public void setDelivCompany_IsNotNull() { regDelivCompany(CK_ISNN, DOBJ); }

    protected void regDelivCompany(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCompany(), "DELIV_COMPANY"); }
    protected abstract ConditionValue xgetCValueDelivCompany();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_Equal(String paymentMethod) {
        doSetPaymentMethod_Equal(fRES(paymentMethod));
    }

    protected void doSetPaymentMethod_Equal(String paymentMethod) {
        regPaymentMethod(CK_EQ, paymentMethod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_NotEqual(String paymentMethod) {
        doSetPaymentMethod_NotEqual(fRES(paymentMethod));
    }

    protected void doSetPaymentMethod_NotEqual(String paymentMethod) {
        regPaymentMethod(CK_NES, paymentMethod);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_GreaterThan(String paymentMethod) {
        regPaymentMethod(CK_GT, fRES(paymentMethod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_LessThan(String paymentMethod) {
        regPaymentMethod(CK_LT, fRES(paymentMethod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_GreaterEqual(String paymentMethod) {
        regPaymentMethod(CK_GE, fRES(paymentMethod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_LessEqual(String paymentMethod) {
        regPaymentMethod(CK_LE, fRES(paymentMethod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethodList The collection of paymentMethod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_InScope(Collection<String> paymentMethodList) {
        doSetPaymentMethod_InScope(paymentMethodList);
    }

    protected void doSetPaymentMethod_InScope(Collection<String> paymentMethodList) {
        regINS(CK_INS, cTL(paymentMethodList), xgetCValuePaymentMethod(), "PAYMENT_METHOD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethodList The collection of paymentMethod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_NotInScope(Collection<String> paymentMethodList) {
        doSetPaymentMethod_NotInScope(paymentMethodList);
    }

    protected void doSetPaymentMethod_NotInScope(Collection<String> paymentMethodList) {
        regINS(CK_NINS, cTL(paymentMethodList), xgetCValuePaymentMethod(), "PAYMENT_METHOD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)} <br>
     * <pre>e.g. setPaymentMethod_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentMethod The value of paymentMethod as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentMethod_LikeSearch(String paymentMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentMethod), xgetCValuePaymentMethod(), "PAYMENT_METHOD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentMethod_NotLikeSearch(String paymentMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentMethod), xgetCValuePaymentMethod(), "PAYMENT_METHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_PrefixSearch(String paymentMethod) {
        setPaymentMethod_LikeSearch(paymentMethod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     */
    public void setPaymentMethod_IsNull() { regPaymentMethod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     */
    public void setPaymentMethod_IsNullOrEmpty() { regPaymentMethod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     */
    public void setPaymentMethod_IsNotNull() { regPaymentMethod(CK_ISNN, DOBJ); }

    protected void regPaymentMethod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentMethod(), "PAYMENT_METHOD"); }
    protected abstract ConditionValue xgetCValuePaymentMethod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_Equal(String cardType) {
        doSetCardType_Equal(fRES(cardType));
    }

    protected void doSetCardType_Equal(String cardType) {
        regCardType(CK_EQ, cardType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_NotEqual(String cardType) {
        doSetCardType_NotEqual(fRES(cardType));
    }

    protected void doSetCardType_NotEqual(String cardType) {
        regCardType(CK_NES, cardType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_GreaterThan(String cardType) {
        regCardType(CK_GT, fRES(cardType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_LessThan(String cardType) {
        regCardType(CK_LT, fRES(cardType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_GreaterEqual(String cardType) {
        regCardType(CK_GE, fRES(cardType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_LessEqual(String cardType) {
        regCardType(CK_LE, fRES(cardType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardTypeList The collection of cardType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_InScope(Collection<String> cardTypeList) {
        doSetCardType_InScope(cardTypeList);
    }

    protected void doSetCardType_InScope(Collection<String> cardTypeList) {
        regINS(CK_INS, cTL(cardTypeList), xgetCValueCardType(), "CARD_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardTypeList The collection of cardType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_NotInScope(Collection<String> cardTypeList) {
        doSetCardType_NotInScope(cardTypeList);
    }

    protected void doSetCardType_NotInScope(Collection<String> cardTypeList) {
        regINS(CK_NINS, cTL(cardTypeList), xgetCValueCardType(), "CARD_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(60)} <br>
     * <pre>e.g. setCardType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardType The value of cardType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardType_LikeSearch(String cardType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardType), xgetCValueCardType(), "CARD_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardType_NotLikeSearch(String cardType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardType), xgetCValueCardType(), "CARD_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     * @param cardType The value of cardType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_PrefixSearch(String cardType) {
        setCardType_LikeSearch(cardType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     */
    public void setCardType_IsNull() { regCardType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     */
    public void setCardType_IsNullOrEmpty() { regCardType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(60)}
     */
    public void setCardType_IsNotNull() { regCardType(CK_ISNN, DOBJ); }

    protected void regCardType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardType(), "CARD_TYPE"); }
    protected abstract ConditionValue xgetCValueCardType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_Equal(Long total) {
        doSetTotal_Equal(total);
    }

    protected void doSetTotal_Equal(Long total) {
        regTotal(CK_EQ, total);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_NotEqual(Long total) {
        doSetTotal_NotEqual(total);
    }

    protected void doSetTotal_NotEqual(Long total) {
        regTotal(CK_NES, total);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_GreaterThan(Long total) {
        regTotal(CK_GT, total);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_LessThan(Long total) {
        regTotal(CK_LT, total);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_GreaterEqual(Long total) {
        regTotal(CK_GE, total);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_LessEqual(Long total) {
        regTotal(CK_LE, total);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param minNumber The min number of total. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of total. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotal(), "TOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param totalList The collection of total as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotal_InScope(Collection<Long> totalList) {
        doSetTotal_InScope(totalList);
    }

    protected void doSetTotal_InScope(Collection<Long> totalList) {
        regINS(CK_INS, cTL(totalList), xgetCValueTotal(), "TOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param totalList The collection of total as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotal_NotInScope(Collection<Long> totalList) {
        doSetTotal_NotInScope(totalList);
    }

    protected void doSetTotal_NotInScope(Collection<Long> totalList) {
        regINS(CK_NINS, cTL(totalList), xgetCValueTotal(), "TOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     */
    public void setTotal_IsNull() { regTotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     */
    public void setTotal_IsNotNull() { regTotal(CK_ISNN, DOBJ); }

    protected void regTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotal(), "TOTAL"); }
    protected abstract ConditionValue xgetCValueTotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_Equal(Long tax) {
        doSetTax_Equal(tax);
    }

    protected void doSetTax_Equal(Long tax) {
        regTax(CK_EQ, tax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_NotEqual(Long tax) {
        doSetTax_NotEqual(tax);
    }

    protected void doSetTax_NotEqual(Long tax) {
        regTax(CK_NES, tax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_GreaterThan(Long tax) {
        regTax(CK_GT, tax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_LessThan(Long tax) {
        regTax(CK_LT, tax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_GreaterEqual(Long tax) {
        regTax(CK_GE, tax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_LessEqual(Long tax) {
        regTax(CK_LE, tax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param minNumber The min number of tax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTax(), "TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX: {bigint(19)}
     * @param taxList The collection of tax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_InScope(Collection<Long> taxList) {
        doSetTax_InScope(taxList);
    }

    protected void doSetTax_InScope(Collection<Long> taxList) {
        regINS(CK_INS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX: {bigint(19)}
     * @param taxList The collection of tax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_NotInScope(Collection<Long> taxList) {
        doSetTax_NotInScope(taxList);
    }

    protected void doSetTax_NotInScope(Collection<Long> taxList) {
        regINS(CK_NINS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     */
    public void setTax_IsNull() { regTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     */
    public void setTax_IsNotNull() { regTax(CK_ISNN, DOBJ); }

    protected void regTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTax(), "TAX"); }
    protected abstract ConditionValue xgetCValueTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_Equal(Long carriage) {
        doSetCarriage_Equal(carriage);
    }

    protected void doSetCarriage_Equal(Long carriage) {
        regCarriage(CK_EQ, carriage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_NotEqual(Long carriage) {
        doSetCarriage_NotEqual(carriage);
    }

    protected void doSetCarriage_NotEqual(Long carriage) {
        regCarriage(CK_NES, carriage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_GreaterThan(Long carriage) {
        regCarriage(CK_GT, carriage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_LessThan(Long carriage) {
        regCarriage(CK_LT, carriage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_GreaterEqual(Long carriage) {
        regCarriage(CK_GE, carriage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_LessEqual(Long carriage) {
        regCarriage(CK_LE, carriage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param minNumber The min number of carriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarriage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarriage(), "CARRIAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriageList The collection of carriage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriage_InScope(Collection<Long> carriageList) {
        doSetCarriage_InScope(carriageList);
    }

    protected void doSetCarriage_InScope(Collection<Long> carriageList) {
        regINS(CK_INS, cTL(carriageList), xgetCValueCarriage(), "CARRIAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriageList The collection of carriage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriage_NotInScope(Collection<Long> carriageList) {
        doSetCarriage_NotInScope(carriageList);
    }

    protected void doSetCarriage_NotInScope(Collection<Long> carriageList) {
        regINS(CK_NINS, cTL(carriageList), xgetCValueCarriage(), "CARRIAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     */
    public void setCarriage_IsNull() { regCarriage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     */
    public void setCarriage_IsNotNull() { regCarriage(CK_ISNN, DOBJ); }

    protected void regCarriage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriage(), "CARRIAGE"); }
    protected abstract ConditionValue xgetCValueCarriage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_Equal(Long cod) {
        doSetCod_Equal(cod);
    }

    protected void doSetCod_Equal(Long cod) {
        regCod(CK_EQ, cod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_NotEqual(Long cod) {
        doSetCod_NotEqual(cod);
    }

    protected void doSetCod_NotEqual(Long cod) {
        regCod(CK_NES, cod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterThan(Long cod) {
        regCod(CK_GT, cod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessThan(Long cod) {
        regCod(CK_LT, cod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterEqual(Long cod) {
        regCod(CK_GE, cod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessEqual(Long cod) {
        regCod(CK_LE, cod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param minNumber The min number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCod(), "COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {bigint(19)}
     * @param codList The collection of cod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_InScope(Collection<Long> codList) {
        doSetCod_InScope(codList);
    }

    protected void doSetCod_InScope(Collection<Long> codList) {
        regINS(CK_INS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {bigint(19)}
     * @param codList The collection of cod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_NotInScope(Collection<Long> codList) {
        doSetCod_NotInScope(codList);
    }

    protected void doSetCod_NotInScope(Collection<Long> codList) {
        regINS(CK_NINS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     */
    public void setCod_IsNull() { regCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     */
    public void setCod_IsNotNull() { regCod(CK_ISNN, DOBJ); }

    protected void regCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCod(), "COD"); }
    protected abstract ConditionValue xgetCValueCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_Equal(Long totalAmount) {
        doSetTotalAmount_Equal(totalAmount);
    }

    protected void doSetTotalAmount_Equal(Long totalAmount) {
        regTotalAmount(CK_EQ, totalAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_NotEqual(Long totalAmount) {
        doSetTotalAmount_NotEqual(totalAmount);
    }

    protected void doSetTotalAmount_NotEqual(Long totalAmount) {
        regTotalAmount(CK_NES, totalAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_GreaterThan(Long totalAmount) {
        regTotalAmount(CK_GT, totalAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_LessThan(Long totalAmount) {
        regTotalAmount(CK_LT, totalAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_GreaterEqual(Long totalAmount) {
        regTotalAmount(CK_GE, totalAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_LessEqual(Long totalAmount) {
        regTotalAmount(CK_LE, totalAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param minNumber The min number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalAmount(), "TOTAL_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmountList The collection of totalAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalAmount_InScope(Collection<Long> totalAmountList) {
        doSetTotalAmount_InScope(totalAmountList);
    }

    protected void doSetTotalAmount_InScope(Collection<Long> totalAmountList) {
        regINS(CK_INS, cTL(totalAmountList), xgetCValueTotalAmount(), "TOTAL_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmountList The collection of totalAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalAmount_NotInScope(Collection<Long> totalAmountList) {
        doSetTotalAmount_NotInScope(totalAmountList);
    }

    protected void doSetTotalAmount_NotInScope(Collection<Long> totalAmountList) {
        regINS(CK_NINS, cTL(totalAmountList), xgetCValueTotalAmount(), "TOTAL_AMOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     */
    public void setTotalAmount_IsNull() { regTotalAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     */
    public void setTotalAmount_IsNotNull() { regTotalAmount(CK_ISNN, DOBJ); }

    protected void regTotalAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalAmount(), "TOTAL_AMOUNT"); }
    protected abstract ConditionValue xgetCValueTotalAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_Equal(Long couponDiscount) {
        doSetCouponDiscount_Equal(couponDiscount);
    }

    protected void doSetCouponDiscount_Equal(Long couponDiscount) {
        regCouponDiscount(CK_EQ, couponDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_NotEqual(Long couponDiscount) {
        doSetCouponDiscount_NotEqual(couponDiscount);
    }

    protected void doSetCouponDiscount_NotEqual(Long couponDiscount) {
        regCouponDiscount(CK_NES, couponDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_GreaterThan(Long couponDiscount) {
        regCouponDiscount(CK_GT, couponDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_LessThan(Long couponDiscount) {
        regCouponDiscount(CK_LT, couponDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_GreaterEqual(Long couponDiscount) {
        regCouponDiscount(CK_GE, couponDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_LessEqual(Long couponDiscount) {
        regCouponDiscount(CK_LE, couponDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of couponDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of couponDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCouponDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCouponDiscount(), "COUPON_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscountList The collection of couponDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponDiscount_InScope(Collection<Long> couponDiscountList) {
        doSetCouponDiscount_InScope(couponDiscountList);
    }

    protected void doSetCouponDiscount_InScope(Collection<Long> couponDiscountList) {
        regINS(CK_INS, cTL(couponDiscountList), xgetCValueCouponDiscount(), "COUPON_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscountList The collection of couponDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponDiscount_NotInScope(Collection<Long> couponDiscountList) {
        doSetCouponDiscount_NotInScope(couponDiscountList);
    }

    protected void doSetCouponDiscount_NotInScope(Collection<Long> couponDiscountList) {
        regINS(CK_NINS, cTL(couponDiscountList), xgetCValueCouponDiscount(), "COUPON_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     */
    public void setCouponDiscount_IsNull() { regCouponDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     */
    public void setCouponDiscount_IsNotNull() { regCouponDiscount(CK_ISNN, DOBJ); }

    protected void regCouponDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCouponDiscount(), "COUPON_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueCouponDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscount The value of pointDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDiscount_Equal(Long pointDiscount) {
        doSetPointDiscount_Equal(pointDiscount);
    }

    protected void doSetPointDiscount_Equal(Long pointDiscount) {
        regPointDiscount(CK_EQ, pointDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscount The value of pointDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDiscount_NotEqual(Long pointDiscount) {
        doSetPointDiscount_NotEqual(pointDiscount);
    }

    protected void doSetPointDiscount_NotEqual(Long pointDiscount) {
        regPointDiscount(CK_NES, pointDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscount The value of pointDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDiscount_GreaterThan(Long pointDiscount) {
        regPointDiscount(CK_GT, pointDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscount The value of pointDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDiscount_LessThan(Long pointDiscount) {
        regPointDiscount(CK_LT, pointDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscount The value of pointDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDiscount_GreaterEqual(Long pointDiscount) {
        regPointDiscount(CK_GE, pointDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscount The value of pointDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDiscount_LessEqual(Long pointDiscount) {
        regPointDiscount(CK_LE, pointDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of pointDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPointDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePointDiscount(), "POINT_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscountList The collection of pointDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointDiscount_InScope(Collection<Long> pointDiscountList) {
        doSetPointDiscount_InScope(pointDiscountList);
    }

    protected void doSetPointDiscount_InScope(Collection<Long> pointDiscountList) {
        regINS(CK_INS, cTL(pointDiscountList), xgetCValuePointDiscount(), "POINT_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @param pointDiscountList The collection of pointDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointDiscount_NotInScope(Collection<Long> pointDiscountList) {
        doSetPointDiscount_NotInScope(pointDiscountList);
    }

    protected void doSetPointDiscount_NotInScope(Collection<Long> pointDiscountList) {
        regINS(CK_NINS, cTL(pointDiscountList), xgetCValuePointDiscount(), "POINT_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     */
    public void setPointDiscount_IsNull() { regPointDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_DISCOUNT: {bigint(19)}
     */
    public void setPointDiscount_IsNotNull() { regPointDiscount(CK_ISNN, DOBJ); }

    protected void regPointDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointDiscount(), "POINT_DISCOUNT"); }
    protected abstract ConditionValue xgetCValuePointDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscount The value of otherDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherDiscount_Equal(Long otherDiscount) {
        doSetOtherDiscount_Equal(otherDiscount);
    }

    protected void doSetOtherDiscount_Equal(Long otherDiscount) {
        regOtherDiscount(CK_EQ, otherDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscount The value of otherDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherDiscount_NotEqual(Long otherDiscount) {
        doSetOtherDiscount_NotEqual(otherDiscount);
    }

    protected void doSetOtherDiscount_NotEqual(Long otherDiscount) {
        regOtherDiscount(CK_NES, otherDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscount The value of otherDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherDiscount_GreaterThan(Long otherDiscount) {
        regOtherDiscount(CK_GT, otherDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscount The value of otherDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherDiscount_LessThan(Long otherDiscount) {
        regOtherDiscount(CK_LT, otherDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscount The value of otherDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherDiscount_GreaterEqual(Long otherDiscount) {
        regOtherDiscount(CK_GE, otherDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscount The value of otherDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherDiscount_LessEqual(Long otherDiscount) {
        regOtherDiscount(CK_LE, otherDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of otherDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherDiscount(), "OTHER_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscountList The collection of otherDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherDiscount_InScope(Collection<Long> otherDiscountList) {
        doSetOtherDiscount_InScope(otherDiscountList);
    }

    protected void doSetOtherDiscount_InScope(Collection<Long> otherDiscountList) {
        regINS(CK_INS, cTL(otherDiscountList), xgetCValueOtherDiscount(), "OTHER_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @param otherDiscountList The collection of otherDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherDiscount_NotInScope(Collection<Long> otherDiscountList) {
        doSetOtherDiscount_NotInScope(otherDiscountList);
    }

    protected void doSetOtherDiscount_NotInScope(Collection<Long> otherDiscountList) {
        regINS(CK_NINS, cTL(otherDiscountList), xgetCValueOtherDiscount(), "OTHER_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     */
    public void setOtherDiscount_IsNull() { regOtherDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     */
    public void setOtherDiscount_IsNotNull() { regOtherDiscount(CK_ISNN, DOBJ); }

    protected void regOtherDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherDiscount(), "OTHER_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueOtherDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_Equal(Long amountBilled) {
        doSetAmountBilled_Equal(amountBilled);
    }

    protected void doSetAmountBilled_Equal(Long amountBilled) {
        regAmountBilled(CK_EQ, amountBilled);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_NotEqual(Long amountBilled) {
        doSetAmountBilled_NotEqual(amountBilled);
    }

    protected void doSetAmountBilled_NotEqual(Long amountBilled) {
        regAmountBilled(CK_NES, amountBilled);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_GreaterThan(Long amountBilled) {
        regAmountBilled(CK_GT, amountBilled);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_LessThan(Long amountBilled) {
        regAmountBilled(CK_LT, amountBilled);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_GreaterEqual(Long amountBilled) {
        regAmountBilled(CK_GE, amountBilled);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_LessEqual(Long amountBilled) {
        regAmountBilled(CK_LE, amountBilled);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param minNumber The min number of amountBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amountBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAmountBilled_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmountBilled(), "AMOUNT_BILLED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilledList The collection of amountBilled as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmountBilled_InScope(Collection<Long> amountBilledList) {
        doSetAmountBilled_InScope(amountBilledList);
    }

    protected void doSetAmountBilled_InScope(Collection<Long> amountBilledList) {
        regINS(CK_INS, cTL(amountBilledList), xgetCValueAmountBilled(), "AMOUNT_BILLED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilledList The collection of amountBilled as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmountBilled_NotInScope(Collection<Long> amountBilledList) {
        doSetAmountBilled_NotInScope(amountBilledList);
    }

    protected void doSetAmountBilled_NotInScope(Collection<Long> amountBilledList) {
        regINS(CK_NINS, cTL(amountBilledList), xgetCValueAmountBilled(), "AMOUNT_BILLED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     */
    public void setAmountBilled_IsNull() { regAmountBilled(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     */
    public void setAmountBilled_IsNotNull() { regAmountBilled(CK_ISNN, DOBJ); }

    protected void regAmountBilled(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmountBilled(), "AMOUNT_BILLED"); }
    protected abstract ConditionValue xgetCValueAmountBilled();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotal The value of mergeTotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotal_Equal(Long mergeTotal) {
        doSetMergeTotal_Equal(mergeTotal);
    }

    protected void doSetMergeTotal_Equal(Long mergeTotal) {
        regMergeTotal(CK_EQ, mergeTotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotal The value of mergeTotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotal_NotEqual(Long mergeTotal) {
        doSetMergeTotal_NotEqual(mergeTotal);
    }

    protected void doSetMergeTotal_NotEqual(Long mergeTotal) {
        regMergeTotal(CK_NES, mergeTotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotal The value of mergeTotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotal_GreaterThan(Long mergeTotal) {
        regMergeTotal(CK_GT, mergeTotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotal The value of mergeTotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotal_LessThan(Long mergeTotal) {
        regMergeTotal(CK_LT, mergeTotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotal The value of mergeTotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotal_GreaterEqual(Long mergeTotal) {
        regMergeTotal(CK_GE, mergeTotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotal The value of mergeTotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotal_LessEqual(Long mergeTotal) {
        regMergeTotal(CK_LE, mergeTotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param minNumber The min number of mergeTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeTotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeTotal(), "MERGE_TOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotalList The collection of mergeTotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeTotal_InScope(Collection<Long> mergeTotalList) {
        doSetMergeTotal_InScope(mergeTotalList);
    }

    protected void doSetMergeTotal_InScope(Collection<Long> mergeTotalList) {
        regINS(CK_INS, cTL(mergeTotalList), xgetCValueMergeTotal(), "MERGE_TOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @param mergeTotalList The collection of mergeTotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeTotal_NotInScope(Collection<Long> mergeTotalList) {
        doSetMergeTotal_NotInScope(mergeTotalList);
    }

    protected void doSetMergeTotal_NotInScope(Collection<Long> mergeTotalList) {
        regINS(CK_NINS, cTL(mergeTotalList), xgetCValueMergeTotal(), "MERGE_TOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     */
    public void setMergeTotal_IsNull() { regMergeTotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_TOTAL: {bigint(19)}
     */
    public void setMergeTotal_IsNotNull() { regMergeTotal(CK_ISNN, DOBJ); }

    protected void regMergeTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeTotal(), "MERGE_TOTAL"); }
    protected abstract ConditionValue xgetCValueMergeTotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriage The value of mergeCarriage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCarriage_Equal(Long mergeCarriage) {
        doSetMergeCarriage_Equal(mergeCarriage);
    }

    protected void doSetMergeCarriage_Equal(Long mergeCarriage) {
        regMergeCarriage(CK_EQ, mergeCarriage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriage The value of mergeCarriage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCarriage_NotEqual(Long mergeCarriage) {
        doSetMergeCarriage_NotEqual(mergeCarriage);
    }

    protected void doSetMergeCarriage_NotEqual(Long mergeCarriage) {
        regMergeCarriage(CK_NES, mergeCarriage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriage The value of mergeCarriage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCarriage_GreaterThan(Long mergeCarriage) {
        regMergeCarriage(CK_GT, mergeCarriage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriage The value of mergeCarriage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCarriage_LessThan(Long mergeCarriage) {
        regMergeCarriage(CK_LT, mergeCarriage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriage The value of mergeCarriage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCarriage_GreaterEqual(Long mergeCarriage) {
        regMergeCarriage(CK_GE, mergeCarriage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriage The value of mergeCarriage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCarriage_LessEqual(Long mergeCarriage) {
        regMergeCarriage(CK_LE, mergeCarriage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param minNumber The min number of mergeCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeCarriage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeCarriage(), "MERGE_CARRIAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriageList The collection of mergeCarriage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCarriage_InScope(Collection<Long> mergeCarriageList) {
        doSetMergeCarriage_InScope(mergeCarriageList);
    }

    protected void doSetMergeCarriage_InScope(Collection<Long> mergeCarriageList) {
        regINS(CK_INS, cTL(mergeCarriageList), xgetCValueMergeCarriage(), "MERGE_CARRIAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @param mergeCarriageList The collection of mergeCarriage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCarriage_NotInScope(Collection<Long> mergeCarriageList) {
        doSetMergeCarriage_NotInScope(mergeCarriageList);
    }

    protected void doSetMergeCarriage_NotInScope(Collection<Long> mergeCarriageList) {
        regINS(CK_NINS, cTL(mergeCarriageList), xgetCValueMergeCarriage(), "MERGE_CARRIAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     */
    public void setMergeCarriage_IsNull() { regMergeCarriage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     */
    public void setMergeCarriage_IsNotNull() { regMergeCarriage(CK_ISNN, DOBJ); }

    protected void regMergeCarriage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeCarriage(), "MERGE_CARRIAGE"); }
    protected abstract ConditionValue xgetCValueMergeCarriage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCod The value of mergeCod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCod_Equal(Long mergeCod) {
        doSetMergeCod_Equal(mergeCod);
    }

    protected void doSetMergeCod_Equal(Long mergeCod) {
        regMergeCod(CK_EQ, mergeCod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCod The value of mergeCod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCod_NotEqual(Long mergeCod) {
        doSetMergeCod_NotEqual(mergeCod);
    }

    protected void doSetMergeCod_NotEqual(Long mergeCod) {
        regMergeCod(CK_NES, mergeCod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCod The value of mergeCod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCod_GreaterThan(Long mergeCod) {
        regMergeCod(CK_GT, mergeCod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCod The value of mergeCod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCod_LessThan(Long mergeCod) {
        regMergeCod(CK_LT, mergeCod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCod The value of mergeCod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCod_GreaterEqual(Long mergeCod) {
        regMergeCod(CK_GE, mergeCod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCod The value of mergeCod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCod_LessEqual(Long mergeCod) {
        regMergeCod(CK_LE, mergeCod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param minNumber The min number of mergeCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeCod(), "MERGE_COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCodList The collection of mergeCod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCod_InScope(Collection<Long> mergeCodList) {
        doSetMergeCod_InScope(mergeCodList);
    }

    protected void doSetMergeCod_InScope(Collection<Long> mergeCodList) {
        regINS(CK_INS, cTL(mergeCodList), xgetCValueMergeCod(), "MERGE_COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_COD: {bigint(19)}
     * @param mergeCodList The collection of mergeCod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCod_NotInScope(Collection<Long> mergeCodList) {
        doSetMergeCod_NotInScope(mergeCodList);
    }

    protected void doSetMergeCod_NotInScope(Collection<Long> mergeCodList) {
        regINS(CK_NINS, cTL(mergeCodList), xgetCValueMergeCod(), "MERGE_COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     */
    public void setMergeCod_IsNull() { regMergeCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_COD: {bigint(19)}
     */
    public void setMergeCod_IsNotNull() { regMergeCod(CK_ISNN, DOBJ); }

    protected void regMergeCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeCod(), "MERGE_COD"); }
    protected abstract ConditionValue xgetCValueMergeCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTax The value of mergeTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTax_Equal(Long mergeTax) {
        doSetMergeTax_Equal(mergeTax);
    }

    protected void doSetMergeTax_Equal(Long mergeTax) {
        regMergeTax(CK_EQ, mergeTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTax The value of mergeTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTax_NotEqual(Long mergeTax) {
        doSetMergeTax_NotEqual(mergeTax);
    }

    protected void doSetMergeTax_NotEqual(Long mergeTax) {
        regMergeTax(CK_NES, mergeTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTax The value of mergeTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTax_GreaterThan(Long mergeTax) {
        regMergeTax(CK_GT, mergeTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTax The value of mergeTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTax_LessThan(Long mergeTax) {
        regMergeTax(CK_LT, mergeTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTax The value of mergeTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTax_GreaterEqual(Long mergeTax) {
        regMergeTax(CK_GE, mergeTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTax The value of mergeTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTax_LessEqual(Long mergeTax) {
        regMergeTax(CK_LE, mergeTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param minNumber The min number of mergeTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeTax(), "MERGE_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTaxList The collection of mergeTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeTax_InScope(Collection<Long> mergeTaxList) {
        doSetMergeTax_InScope(mergeTaxList);
    }

    protected void doSetMergeTax_InScope(Collection<Long> mergeTaxList) {
        regINS(CK_INS, cTL(mergeTaxList), xgetCValueMergeTax(), "MERGE_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     * @param mergeTaxList The collection of mergeTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeTax_NotInScope(Collection<Long> mergeTaxList) {
        doSetMergeTax_NotInScope(mergeTaxList);
    }

    protected void doSetMergeTax_NotInScope(Collection<Long> mergeTaxList) {
        regINS(CK_NINS, cTL(mergeTaxList), xgetCValueMergeTax(), "MERGE_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     */
    public void setMergeTax_IsNull() { regMergeTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_TAX: {bigint(19)}
     */
    public void setMergeTax_IsNotNull() { regMergeTax(CK_ISNN, DOBJ); }

    protected void regMergeTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeTax(), "MERGE_TAX"); }
    protected abstract ConditionValue xgetCValueMergeTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilled The value of mergeAmountBilled as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_Equal(Long mergeAmountBilled) {
        doSetMergeAmountBilled_Equal(mergeAmountBilled);
    }

    protected void doSetMergeAmountBilled_Equal(Long mergeAmountBilled) {
        regMergeAmountBilled(CK_EQ, mergeAmountBilled);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilled The value of mergeAmountBilled as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_NotEqual(Long mergeAmountBilled) {
        doSetMergeAmountBilled_NotEqual(mergeAmountBilled);
    }

    protected void doSetMergeAmountBilled_NotEqual(Long mergeAmountBilled) {
        regMergeAmountBilled(CK_NES, mergeAmountBilled);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilled The value of mergeAmountBilled as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_GreaterThan(Long mergeAmountBilled) {
        regMergeAmountBilled(CK_GT, mergeAmountBilled);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilled The value of mergeAmountBilled as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_LessThan(Long mergeAmountBilled) {
        regMergeAmountBilled(CK_LT, mergeAmountBilled);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilled The value of mergeAmountBilled as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_GreaterEqual(Long mergeAmountBilled) {
        regMergeAmountBilled(CK_GE, mergeAmountBilled);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilled The value of mergeAmountBilled as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_LessEqual(Long mergeAmountBilled) {
        regMergeAmountBilled(CK_LE, mergeAmountBilled);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param minNumber The min number of mergeAmountBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeAmountBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeAmountBilled_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeAmountBilled(), "MERGE_AMOUNT_BILLED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilledList The collection of mergeAmountBilled as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_InScope(Collection<Long> mergeAmountBilledList) {
        doSetMergeAmountBilled_InScope(mergeAmountBilledList);
    }

    protected void doSetMergeAmountBilled_InScope(Collection<Long> mergeAmountBilledList) {
        regINS(CK_INS, cTL(mergeAmountBilledList), xgetCValueMergeAmountBilled(), "MERGE_AMOUNT_BILLED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @param mergeAmountBilledList The collection of mergeAmountBilled as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeAmountBilled_NotInScope(Collection<Long> mergeAmountBilledList) {
        doSetMergeAmountBilled_NotInScope(mergeAmountBilledList);
    }

    protected void doSetMergeAmountBilled_NotInScope(Collection<Long> mergeAmountBilledList) {
        regINS(CK_NINS, cTL(mergeAmountBilledList), xgetCValueMergeAmountBilled(), "MERGE_AMOUNT_BILLED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     */
    public void setMergeAmountBilled_IsNull() { regMergeAmountBilled(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     */
    public void setMergeAmountBilled_IsNotNull() { regMergeAmountBilled(CK_ISNN, DOBJ); }

    protected void regMergeAmountBilled(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeAmountBilled(), "MERGE_AMOUNT_BILLED"); }
    protected abstract ConditionValue xgetCValueMergeAmountBilled();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmount The value of mergeTotalAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_Equal(Long mergeTotalAmount) {
        doSetMergeTotalAmount_Equal(mergeTotalAmount);
    }

    protected void doSetMergeTotalAmount_Equal(Long mergeTotalAmount) {
        regMergeTotalAmount(CK_EQ, mergeTotalAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmount The value of mergeTotalAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_NotEqual(Long mergeTotalAmount) {
        doSetMergeTotalAmount_NotEqual(mergeTotalAmount);
    }

    protected void doSetMergeTotalAmount_NotEqual(Long mergeTotalAmount) {
        regMergeTotalAmount(CK_NES, mergeTotalAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmount The value of mergeTotalAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_GreaterThan(Long mergeTotalAmount) {
        regMergeTotalAmount(CK_GT, mergeTotalAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmount The value of mergeTotalAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_LessThan(Long mergeTotalAmount) {
        regMergeTotalAmount(CK_LT, mergeTotalAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmount The value of mergeTotalAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_GreaterEqual(Long mergeTotalAmount) {
        regMergeTotalAmount(CK_GE, mergeTotalAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmount The value of mergeTotalAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_LessEqual(Long mergeTotalAmount) {
        regMergeTotalAmount(CK_LE, mergeTotalAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param minNumber The min number of mergeTotalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeTotalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeTotalAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeTotalAmount(), "MERGE_TOTAL_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmountList The collection of mergeTotalAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_InScope(Collection<Long> mergeTotalAmountList) {
        doSetMergeTotalAmount_InScope(mergeTotalAmountList);
    }

    protected void doSetMergeTotalAmount_InScope(Collection<Long> mergeTotalAmountList) {
        regINS(CK_INS, cTL(mergeTotalAmountList), xgetCValueMergeTotalAmount(), "MERGE_TOTAL_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @param mergeTotalAmountList The collection of mergeTotalAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeTotalAmount_NotInScope(Collection<Long> mergeTotalAmountList) {
        doSetMergeTotalAmount_NotInScope(mergeTotalAmountList);
    }

    protected void doSetMergeTotalAmount_NotInScope(Collection<Long> mergeTotalAmountList) {
        regINS(CK_NINS, cTL(mergeTotalAmountList), xgetCValueMergeTotalAmount(), "MERGE_TOTAL_AMOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     */
    public void setMergeTotalAmount_IsNull() { regMergeTotalAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     */
    public void setMergeTotalAmount_IsNotNull() { regMergeTotalAmount(CK_ISNN, DOBJ); }

    protected void regMergeTotalAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeTotalAmount(), "MERGE_TOTAL_AMOUNT"); }
    protected abstract ConditionValue xgetCValueMergeTotalAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscount The value of mergeCouponDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_Equal(Long mergeCouponDiscount) {
        doSetMergeCouponDiscount_Equal(mergeCouponDiscount);
    }

    protected void doSetMergeCouponDiscount_Equal(Long mergeCouponDiscount) {
        regMergeCouponDiscount(CK_EQ, mergeCouponDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscount The value of mergeCouponDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_NotEqual(Long mergeCouponDiscount) {
        doSetMergeCouponDiscount_NotEqual(mergeCouponDiscount);
    }

    protected void doSetMergeCouponDiscount_NotEqual(Long mergeCouponDiscount) {
        regMergeCouponDiscount(CK_NES, mergeCouponDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscount The value of mergeCouponDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_GreaterThan(Long mergeCouponDiscount) {
        regMergeCouponDiscount(CK_GT, mergeCouponDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscount The value of mergeCouponDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_LessThan(Long mergeCouponDiscount) {
        regMergeCouponDiscount(CK_LT, mergeCouponDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscount The value of mergeCouponDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_GreaterEqual(Long mergeCouponDiscount) {
        regMergeCouponDiscount(CK_GE, mergeCouponDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscount The value of mergeCouponDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_LessEqual(Long mergeCouponDiscount) {
        regMergeCouponDiscount(CK_LE, mergeCouponDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of mergeCouponDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeCouponDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeCouponDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeCouponDiscount(), "MERGE_COUPON_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscountList The collection of mergeCouponDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_InScope(Collection<Long> mergeCouponDiscountList) {
        doSetMergeCouponDiscount_InScope(mergeCouponDiscountList);
    }

    protected void doSetMergeCouponDiscount_InScope(Collection<Long> mergeCouponDiscountList) {
        regINS(CK_INS, cTL(mergeCouponDiscountList), xgetCValueMergeCouponDiscount(), "MERGE_COUPON_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @param mergeCouponDiscountList The collection of mergeCouponDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCouponDiscount_NotInScope(Collection<Long> mergeCouponDiscountList) {
        doSetMergeCouponDiscount_NotInScope(mergeCouponDiscountList);
    }

    protected void doSetMergeCouponDiscount_NotInScope(Collection<Long> mergeCouponDiscountList) {
        regINS(CK_NINS, cTL(mergeCouponDiscountList), xgetCValueMergeCouponDiscount(), "MERGE_COUPON_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     */
    public void setMergeCouponDiscount_IsNull() { regMergeCouponDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     */
    public void setMergeCouponDiscount_IsNotNull() { regMergeCouponDiscount(CK_ISNN, DOBJ); }

    protected void regMergeCouponDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeCouponDiscount(), "MERGE_COUPON_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueMergeCouponDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscount The value of mergePointDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergePointDiscount_Equal(Long mergePointDiscount) {
        doSetMergePointDiscount_Equal(mergePointDiscount);
    }

    protected void doSetMergePointDiscount_Equal(Long mergePointDiscount) {
        regMergePointDiscount(CK_EQ, mergePointDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscount The value of mergePointDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergePointDiscount_NotEqual(Long mergePointDiscount) {
        doSetMergePointDiscount_NotEqual(mergePointDiscount);
    }

    protected void doSetMergePointDiscount_NotEqual(Long mergePointDiscount) {
        regMergePointDiscount(CK_NES, mergePointDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscount The value of mergePointDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergePointDiscount_GreaterThan(Long mergePointDiscount) {
        regMergePointDiscount(CK_GT, mergePointDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscount The value of mergePointDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergePointDiscount_LessThan(Long mergePointDiscount) {
        regMergePointDiscount(CK_LT, mergePointDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscount The value of mergePointDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergePointDiscount_GreaterEqual(Long mergePointDiscount) {
        regMergePointDiscount(CK_GE, mergePointDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscount The value of mergePointDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergePointDiscount_LessEqual(Long mergePointDiscount) {
        regMergePointDiscount(CK_LE, mergePointDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of mergePointDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergePointDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergePointDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergePointDiscount(), "MERGE_POINT_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscountList The collection of mergePointDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergePointDiscount_InScope(Collection<Long> mergePointDiscountList) {
        doSetMergePointDiscount_InScope(mergePointDiscountList);
    }

    protected void doSetMergePointDiscount_InScope(Collection<Long> mergePointDiscountList) {
        regINS(CK_INS, cTL(mergePointDiscountList), xgetCValueMergePointDiscount(), "MERGE_POINT_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @param mergePointDiscountList The collection of mergePointDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergePointDiscount_NotInScope(Collection<Long> mergePointDiscountList) {
        doSetMergePointDiscount_NotInScope(mergePointDiscountList);
    }

    protected void doSetMergePointDiscount_NotInScope(Collection<Long> mergePointDiscountList) {
        regINS(CK_NINS, cTL(mergePointDiscountList), xgetCValueMergePointDiscount(), "MERGE_POINT_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     */
    public void setMergePointDiscount_IsNull() { regMergePointDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     */
    public void setMergePointDiscount_IsNotNull() { regMergePointDiscount(CK_ISNN, DOBJ); }

    protected void regMergePointDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergePointDiscount(), "MERGE_POINT_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueMergePointDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscount The value of mergeOtherDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_Equal(Long mergeOtherDiscount) {
        doSetMergeOtherDiscount_Equal(mergeOtherDiscount);
    }

    protected void doSetMergeOtherDiscount_Equal(Long mergeOtherDiscount) {
        regMergeOtherDiscount(CK_EQ, mergeOtherDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscount The value of mergeOtherDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_NotEqual(Long mergeOtherDiscount) {
        doSetMergeOtherDiscount_NotEqual(mergeOtherDiscount);
    }

    protected void doSetMergeOtherDiscount_NotEqual(Long mergeOtherDiscount) {
        regMergeOtherDiscount(CK_NES, mergeOtherDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscount The value of mergeOtherDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_GreaterThan(Long mergeOtherDiscount) {
        regMergeOtherDiscount(CK_GT, mergeOtherDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscount The value of mergeOtherDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_LessThan(Long mergeOtherDiscount) {
        regMergeOtherDiscount(CK_LT, mergeOtherDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscount The value of mergeOtherDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_GreaterEqual(Long mergeOtherDiscount) {
        regMergeOtherDiscount(CK_GE, mergeOtherDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscount The value of mergeOtherDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_LessEqual(Long mergeOtherDiscount) {
        regMergeOtherDiscount(CK_LE, mergeOtherDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of mergeOtherDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mergeOtherDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMergeOtherDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMergeOtherDiscount(), "MERGE_OTHER_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscountList The collection of mergeOtherDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_InScope(Collection<Long> mergeOtherDiscountList) {
        doSetMergeOtherDiscount_InScope(mergeOtherDiscountList);
    }

    protected void doSetMergeOtherDiscount_InScope(Collection<Long> mergeOtherDiscountList) {
        regINS(CK_INS, cTL(mergeOtherDiscountList), xgetCValueMergeOtherDiscount(), "MERGE_OTHER_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @param mergeOtherDiscountList The collection of mergeOtherDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeOtherDiscount_NotInScope(Collection<Long> mergeOtherDiscountList) {
        doSetMergeOtherDiscount_NotInScope(mergeOtherDiscountList);
    }

    protected void doSetMergeOtherDiscount_NotInScope(Collection<Long> mergeOtherDiscountList) {
        regINS(CK_NINS, cTL(mergeOtherDiscountList), xgetCValueMergeOtherDiscount(), "MERGE_OTHER_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     */
    public void setMergeOtherDiscount_IsNull() { regMergeOtherDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     */
    public void setMergeOtherDiscount_IsNotNull() { regMergeOtherDiscount(CK_ISNN, DOBJ); }

    protected void regMergeOtherDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeOtherDiscount(), "MERGE_OTHER_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueMergeOtherDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_Equal(Long packingQty) {
        doSetPackingQty_Equal(packingQty);
    }

    protected void doSetPackingQty_Equal(Long packingQty) {
        regPackingQty(CK_EQ, packingQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_NotEqual(Long packingQty) {
        doSetPackingQty_NotEqual(packingQty);
    }

    protected void doSetPackingQty_NotEqual(Long packingQty) {
        regPackingQty(CK_NES, packingQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_GreaterThan(Long packingQty) {
        regPackingQty(CK_GT, packingQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_LessThan(Long packingQty) {
        regPackingQty(CK_LT, packingQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_GreaterEqual(Long packingQty) {
        regPackingQty(CK_GE, packingQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_LessEqual(Long packingQty) {
        regPackingQty(CK_LE, packingQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param minNumber The min number of packingQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingQty(), "PACKING_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQtyList The collection of packingQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingQty_InScope(Collection<Long> packingQtyList) {
        doSetPackingQty_InScope(packingQtyList);
    }

    protected void doSetPackingQty_InScope(Collection<Long> packingQtyList) {
        regINS(CK_INS, cTL(packingQtyList), xgetCValuePackingQty(), "PACKING_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQtyList The collection of packingQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingQty_NotInScope(Collection<Long> packingQtyList) {
        doSetPackingQty_NotInScope(packingQtyList);
    }

    protected void doSetPackingQty_NotInScope(Collection<Long> packingQtyList) {
        regINS(CK_NINS, cTL(packingQtyList), xgetCValuePackingQty(), "PACKING_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     */
    public void setPackingQty_IsNull() { regPackingQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     */
    public void setPackingQty_IsNotNull() { regPackingQty(CK_ISNN, DOBJ); }

    protected void regPackingQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingQty(), "PACKING_QTY"); }
    protected abstract ConditionValue xgetCValuePackingQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_Equal(String slipItemNm1) {
        doSetSlipItemNm1_Equal(fRES(slipItemNm1));
    }

    protected void doSetSlipItemNm1_Equal(String slipItemNm1) {
        regSlipItemNm1(CK_EQ, slipItemNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_NotEqual(String slipItemNm1) {
        doSetSlipItemNm1_NotEqual(fRES(slipItemNm1));
    }

    protected void doSetSlipItemNm1_NotEqual(String slipItemNm1) {
        regSlipItemNm1(CK_NES, slipItemNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterThan(String slipItemNm1) {
        regSlipItemNm1(CK_GT, fRES(slipItemNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessThan(String slipItemNm1) {
        regSlipItemNm1(CK_LT, fRES(slipItemNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterEqual(String slipItemNm1) {
        regSlipItemNm1(CK_GE, fRES(slipItemNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessEqual(String slipItemNm1) {
        regSlipItemNm1(CK_LE, fRES(slipItemNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1List The collection of slipItemNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_InScope(Collection<String> slipItemNm1List) {
        doSetSlipItemNm1_InScope(slipItemNm1List);
    }

    protected void doSetSlipItemNm1_InScope(Collection<String> slipItemNm1List) {
        regINS(CK_INS, cTL(slipItemNm1List), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1List The collection of slipItemNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_NotInScope(Collection<String> slipItemNm1List) {
        doSetSlipItemNm1_NotInScope(slipItemNm1List);
    }

    protected void doSetSlipItemNm1_NotInScope(Collection<String> slipItemNm1List) {
        regINS(CK_NINS, cTL(slipItemNm1List), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)} <br>
     * <pre>e.g. setSlipItemNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm1 The value of slipItemNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm1_LikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm1_NotLikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_PrefixSearch(String slipItemNm1) {
        setSlipItemNm1_LikeSearch(slipItemNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     */
    public void setSlipItemNm1_IsNull() { regSlipItemNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     */
    public void setSlipItemNm1_IsNullOrEmpty() { regSlipItemNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     */
    public void setSlipItemNm1_IsNotNull() { regSlipItemNm1(CK_ISNN, DOBJ); }

    protected void regSlipItemNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1"); }
    protected abstract ConditionValue xgetCValueSlipItemNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_Equal(String slipItemNm2) {
        doSetSlipItemNm2_Equal(fRES(slipItemNm2));
    }

    protected void doSetSlipItemNm2_Equal(String slipItemNm2) {
        regSlipItemNm2(CK_EQ, slipItemNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_NotEqual(String slipItemNm2) {
        doSetSlipItemNm2_NotEqual(fRES(slipItemNm2));
    }

    protected void doSetSlipItemNm2_NotEqual(String slipItemNm2) {
        regSlipItemNm2(CK_NES, slipItemNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterThan(String slipItemNm2) {
        regSlipItemNm2(CK_GT, fRES(slipItemNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessThan(String slipItemNm2) {
        regSlipItemNm2(CK_LT, fRES(slipItemNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterEqual(String slipItemNm2) {
        regSlipItemNm2(CK_GE, fRES(slipItemNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessEqual(String slipItemNm2) {
        regSlipItemNm2(CK_LE, fRES(slipItemNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2List The collection of slipItemNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_InScope(Collection<String> slipItemNm2List) {
        doSetSlipItemNm2_InScope(slipItemNm2List);
    }

    protected void doSetSlipItemNm2_InScope(Collection<String> slipItemNm2List) {
        regINS(CK_INS, cTL(slipItemNm2List), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2List The collection of slipItemNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_NotInScope(Collection<String> slipItemNm2List) {
        doSetSlipItemNm2_NotInScope(slipItemNm2List);
    }

    protected void doSetSlipItemNm2_NotInScope(Collection<String> slipItemNm2List) {
        regINS(CK_NINS, cTL(slipItemNm2List), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm2 The value of slipItemNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm2_LikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm2_NotLikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_PrefixSearch(String slipItemNm2) {
        setSlipItemNm2_LikeSearch(slipItemNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNull() { regSlipItemNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNullOrEmpty() { regSlipItemNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNotNull() { regSlipItemNm2(CK_ISNN, DOBJ); }

    protected void regSlipItemNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2"); }
    protected abstract ConditionValue xgetCValueSlipItemNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_Equal(String slipItemNm3) {
        doSetSlipItemNm3_Equal(fRES(slipItemNm3));
    }

    protected void doSetSlipItemNm3_Equal(String slipItemNm3) {
        regSlipItemNm3(CK_EQ, slipItemNm3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_NotEqual(String slipItemNm3) {
        doSetSlipItemNm3_NotEqual(fRES(slipItemNm3));
    }

    protected void doSetSlipItemNm3_NotEqual(String slipItemNm3) {
        regSlipItemNm3(CK_NES, slipItemNm3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_GreaterThan(String slipItemNm3) {
        regSlipItemNm3(CK_GT, fRES(slipItemNm3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_LessThan(String slipItemNm3) {
        regSlipItemNm3(CK_LT, fRES(slipItemNm3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_GreaterEqual(String slipItemNm3) {
        regSlipItemNm3(CK_GE, fRES(slipItemNm3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_LessEqual(String slipItemNm3) {
        regSlipItemNm3(CK_LE, fRES(slipItemNm3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3List The collection of slipItemNm3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_InScope(Collection<String> slipItemNm3List) {
        doSetSlipItemNm3_InScope(slipItemNm3List);
    }

    protected void doSetSlipItemNm3_InScope(Collection<String> slipItemNm3List) {
        regINS(CK_INS, cTL(slipItemNm3List), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3List The collection of slipItemNm3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_NotInScope(Collection<String> slipItemNm3List) {
        doSetSlipItemNm3_NotInScope(slipItemNm3List);
    }

    protected void doSetSlipItemNm3_NotInScope(Collection<String> slipItemNm3List) {
        regINS(CK_NINS, cTL(slipItemNm3List), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm3 The value of slipItemNm3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm3_LikeSearch(String slipItemNm3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm3), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm3_NotLikeSearch(String slipItemNm3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm3), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_PrefixSearch(String slipItemNm3) {
        setSlipItemNm3_LikeSearch(slipItemNm3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNull() { regSlipItemNm3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNullOrEmpty() { regSlipItemNm3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNotNull() { regSlipItemNm3(CK_ISNN, DOBJ); }

    protected void regSlipItemNm3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3"); }
    protected abstract ConditionValue xgetCValueSlipItemNm3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_Equal(String slipItemNm4) {
        doSetSlipItemNm4_Equal(fRES(slipItemNm4));
    }

    protected void doSetSlipItemNm4_Equal(String slipItemNm4) {
        regSlipItemNm4(CK_EQ, slipItemNm4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_NotEqual(String slipItemNm4) {
        doSetSlipItemNm4_NotEqual(fRES(slipItemNm4));
    }

    protected void doSetSlipItemNm4_NotEqual(String slipItemNm4) {
        regSlipItemNm4(CK_NES, slipItemNm4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_GreaterThan(String slipItemNm4) {
        regSlipItemNm4(CK_GT, fRES(slipItemNm4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_LessThan(String slipItemNm4) {
        regSlipItemNm4(CK_LT, fRES(slipItemNm4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_GreaterEqual(String slipItemNm4) {
        regSlipItemNm4(CK_GE, fRES(slipItemNm4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_LessEqual(String slipItemNm4) {
        regSlipItemNm4(CK_LE, fRES(slipItemNm4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4List The collection of slipItemNm4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_InScope(Collection<String> slipItemNm4List) {
        doSetSlipItemNm4_InScope(slipItemNm4List);
    }

    protected void doSetSlipItemNm4_InScope(Collection<String> slipItemNm4List) {
        regINS(CK_INS, cTL(slipItemNm4List), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4List The collection of slipItemNm4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_NotInScope(Collection<String> slipItemNm4List) {
        doSetSlipItemNm4_NotInScope(slipItemNm4List);
    }

    protected void doSetSlipItemNm4_NotInScope(Collection<String> slipItemNm4List) {
        regINS(CK_NINS, cTL(slipItemNm4List), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm4 The value of slipItemNm4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm4_LikeSearch(String slipItemNm4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm4), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm4_NotLikeSearch(String slipItemNm4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm4), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_PrefixSearch(String slipItemNm4) {
        setSlipItemNm4_LikeSearch(slipItemNm4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNull() { regSlipItemNm4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNullOrEmpty() { regSlipItemNm4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNotNull() { regSlipItemNm4(CK_ISNN, DOBJ); }

    protected void regSlipItemNm4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4"); }
    protected abstract ConditionValue xgetCValueSlipItemNm4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_Equal(String slipItemNm5) {
        doSetSlipItemNm5_Equal(fRES(slipItemNm5));
    }

    protected void doSetSlipItemNm5_Equal(String slipItemNm5) {
        regSlipItemNm5(CK_EQ, slipItemNm5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_NotEqual(String slipItemNm5) {
        doSetSlipItemNm5_NotEqual(fRES(slipItemNm5));
    }

    protected void doSetSlipItemNm5_NotEqual(String slipItemNm5) {
        regSlipItemNm5(CK_NES, slipItemNm5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_GreaterThan(String slipItemNm5) {
        regSlipItemNm5(CK_GT, fRES(slipItemNm5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_LessThan(String slipItemNm5) {
        regSlipItemNm5(CK_LT, fRES(slipItemNm5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_GreaterEqual(String slipItemNm5) {
        regSlipItemNm5(CK_GE, fRES(slipItemNm5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_LessEqual(String slipItemNm5) {
        regSlipItemNm5(CK_LE, fRES(slipItemNm5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5List The collection of slipItemNm5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_InScope(Collection<String> slipItemNm5List) {
        doSetSlipItemNm5_InScope(slipItemNm5List);
    }

    protected void doSetSlipItemNm5_InScope(Collection<String> slipItemNm5List) {
        regINS(CK_INS, cTL(slipItemNm5List), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5List The collection of slipItemNm5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_NotInScope(Collection<String> slipItemNm5List) {
        doSetSlipItemNm5_NotInScope(slipItemNm5List);
    }

    protected void doSetSlipItemNm5_NotInScope(Collection<String> slipItemNm5List) {
        regINS(CK_NINS, cTL(slipItemNm5List), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm5 The value of slipItemNm5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm5_LikeSearch(String slipItemNm5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm5), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm5_NotLikeSearch(String slipItemNm5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm5), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_PrefixSearch(String slipItemNm5) {
        setSlipItemNm5_LikeSearch(slipItemNm5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNull() { regSlipItemNm5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNullOrEmpty() { regSlipItemNm5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNotNull() { regSlipItemNm5(CK_ISNN, DOBJ); }

    protected void regSlipItemNm5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5"); }
    protected abstract ConditionValue xgetCValueSlipItemNm5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_Equal(String slipItemCd1) {
        doSetSlipItemCd1_Equal(fRES(slipItemCd1));
    }

    protected void doSetSlipItemCd1_Equal(String slipItemCd1) {
        regSlipItemCd1(CK_EQ, slipItemCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_NotEqual(String slipItemCd1) {
        doSetSlipItemCd1_NotEqual(fRES(slipItemCd1));
    }

    protected void doSetSlipItemCd1_NotEqual(String slipItemCd1) {
        regSlipItemCd1(CK_NES, slipItemCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_GreaterThan(String slipItemCd1) {
        regSlipItemCd1(CK_GT, fRES(slipItemCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_LessThan(String slipItemCd1) {
        regSlipItemCd1(CK_LT, fRES(slipItemCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_GreaterEqual(String slipItemCd1) {
        regSlipItemCd1(CK_GE, fRES(slipItemCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_LessEqual(String slipItemCd1) {
        regSlipItemCd1(CK_LE, fRES(slipItemCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1List The collection of slipItemCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_InScope(Collection<String> slipItemCd1List) {
        doSetSlipItemCd1_InScope(slipItemCd1List);
    }

    protected void doSetSlipItemCd1_InScope(Collection<String> slipItemCd1List) {
        regINS(CK_INS, cTL(slipItemCd1List), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1List The collection of slipItemCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_NotInScope(Collection<String> slipItemCd1List) {
        doSetSlipItemCd1_NotInScope(slipItemCd1List);
    }

    protected void doSetSlipItemCd1_NotInScope(Collection<String> slipItemCd1List) {
        regINS(CK_NINS, cTL(slipItemCd1List), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)} <br>
     * <pre>e.g. setSlipItemCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemCd1 The value of slipItemCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemCd1_LikeSearch(String slipItemCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemCd1), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemCd1_NotLikeSearch(String slipItemCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemCd1), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_PrefixSearch(String slipItemCd1) {
        setSlipItemCd1_LikeSearch(slipItemCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNull() { regSlipItemCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNullOrEmpty() { regSlipItemCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNotNull() { regSlipItemCd1(CK_ISNN, DOBJ); }

    protected void regSlipItemCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1"); }
    protected abstract ConditionValue xgetCValueSlipItemCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_Equal(String slipItemCd2) {
        doSetSlipItemCd2_Equal(fRES(slipItemCd2));
    }

    protected void doSetSlipItemCd2_Equal(String slipItemCd2) {
        regSlipItemCd2(CK_EQ, slipItemCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_NotEqual(String slipItemCd2) {
        doSetSlipItemCd2_NotEqual(fRES(slipItemCd2));
    }

    protected void doSetSlipItemCd2_NotEqual(String slipItemCd2) {
        regSlipItemCd2(CK_NES, slipItemCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_GreaterThan(String slipItemCd2) {
        regSlipItemCd2(CK_GT, fRES(slipItemCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_LessThan(String slipItemCd2) {
        regSlipItemCd2(CK_LT, fRES(slipItemCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_GreaterEqual(String slipItemCd2) {
        regSlipItemCd2(CK_GE, fRES(slipItemCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_LessEqual(String slipItemCd2) {
        regSlipItemCd2(CK_LE, fRES(slipItemCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2List The collection of slipItemCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_InScope(Collection<String> slipItemCd2List) {
        doSetSlipItemCd2_InScope(slipItemCd2List);
    }

    protected void doSetSlipItemCd2_InScope(Collection<String> slipItemCd2List) {
        regINS(CK_INS, cTL(slipItemCd2List), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2List The collection of slipItemCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_NotInScope(Collection<String> slipItemCd2List) {
        doSetSlipItemCd2_NotInScope(slipItemCd2List);
    }

    protected void doSetSlipItemCd2_NotInScope(Collection<String> slipItemCd2List) {
        regINS(CK_NINS, cTL(slipItemCd2List), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)} <br>
     * <pre>e.g. setSlipItemCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemCd2 The value of slipItemCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemCd2_LikeSearch(String slipItemCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemCd2), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemCd2_NotLikeSearch(String slipItemCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemCd2), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_PrefixSearch(String slipItemCd2) {
        setSlipItemCd2_LikeSearch(slipItemCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNull() { regSlipItemCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNullOrEmpty() { regSlipItemCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNotNull() { regSlipItemCd2(CK_ISNN, DOBJ); }

    protected void regSlipItemCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2"); }
    protected abstract ConditionValue xgetCValueSlipItemCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_Equal(String freightHandling1) {
        doSetFreightHandling1_Equal(fRES(freightHandling1));
    }

    protected void doSetFreightHandling1_Equal(String freightHandling1) {
        regFreightHandling1(CK_EQ, freightHandling1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_NotEqual(String freightHandling1) {
        doSetFreightHandling1_NotEqual(fRES(freightHandling1));
    }

    protected void doSetFreightHandling1_NotEqual(String freightHandling1) {
        regFreightHandling1(CK_NES, freightHandling1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_GreaterThan(String freightHandling1) {
        regFreightHandling1(CK_GT, fRES(freightHandling1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_LessThan(String freightHandling1) {
        regFreightHandling1(CK_LT, fRES(freightHandling1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_GreaterEqual(String freightHandling1) {
        regFreightHandling1(CK_GE, fRES(freightHandling1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_LessEqual(String freightHandling1) {
        regFreightHandling1(CK_LE, fRES(freightHandling1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1List The collection of freightHandling1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_InScope(Collection<String> freightHandling1List) {
        doSetFreightHandling1_InScope(freightHandling1List);
    }

    protected void doSetFreightHandling1_InScope(Collection<String> freightHandling1List) {
        regINS(CK_INS, cTL(freightHandling1List), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1List The collection of freightHandling1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_NotInScope(Collection<String> freightHandling1List) {
        doSetFreightHandling1_NotInScope(freightHandling1List);
    }

    protected void doSetFreightHandling1_NotInScope(Collection<String> freightHandling1List) {
        regINS(CK_NINS, cTL(freightHandling1List), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)} <br>
     * <pre>e.g. setFreightHandling1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param freightHandling1 The value of freightHandling1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFreightHandling1_LikeSearch(String freightHandling1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(freightHandling1), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFreightHandling1_NotLikeSearch(String freightHandling1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(freightHandling1), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_PrefixSearch(String freightHandling1) {
        setFreightHandling1_LikeSearch(freightHandling1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     */
    public void setFreightHandling1_IsNull() { regFreightHandling1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     */
    public void setFreightHandling1_IsNullOrEmpty() { regFreightHandling1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     */
    public void setFreightHandling1_IsNotNull() { regFreightHandling1(CK_ISNN, DOBJ); }

    protected void regFreightHandling1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightHandling1(), "FREIGHT_HANDLING1"); }
    protected abstract ConditionValue xgetCValueFreightHandling1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_Equal(String freightHandling2) {
        doSetFreightHandling2_Equal(fRES(freightHandling2));
    }

    protected void doSetFreightHandling2_Equal(String freightHandling2) {
        regFreightHandling2(CK_EQ, freightHandling2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_NotEqual(String freightHandling2) {
        doSetFreightHandling2_NotEqual(fRES(freightHandling2));
    }

    protected void doSetFreightHandling2_NotEqual(String freightHandling2) {
        regFreightHandling2(CK_NES, freightHandling2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_GreaterThan(String freightHandling2) {
        regFreightHandling2(CK_GT, fRES(freightHandling2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_LessThan(String freightHandling2) {
        regFreightHandling2(CK_LT, fRES(freightHandling2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_GreaterEqual(String freightHandling2) {
        regFreightHandling2(CK_GE, fRES(freightHandling2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_LessEqual(String freightHandling2) {
        regFreightHandling2(CK_LE, fRES(freightHandling2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2List The collection of freightHandling2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_InScope(Collection<String> freightHandling2List) {
        doSetFreightHandling2_InScope(freightHandling2List);
    }

    protected void doSetFreightHandling2_InScope(Collection<String> freightHandling2List) {
        regINS(CK_INS, cTL(freightHandling2List), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2List The collection of freightHandling2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_NotInScope(Collection<String> freightHandling2List) {
        doSetFreightHandling2_NotInScope(freightHandling2List);
    }

    protected void doSetFreightHandling2_NotInScope(Collection<String> freightHandling2List) {
        regINS(CK_NINS, cTL(freightHandling2List), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)} <br>
     * <pre>e.g. setFreightHandling2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param freightHandling2 The value of freightHandling2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFreightHandling2_LikeSearch(String freightHandling2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(freightHandling2), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFreightHandling2_NotLikeSearch(String freightHandling2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(freightHandling2), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_PrefixSearch(String freightHandling2) {
        setFreightHandling2_LikeSearch(freightHandling2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     */
    public void setFreightHandling2_IsNull() { regFreightHandling2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     */
    public void setFreightHandling2_IsNullOrEmpty() { regFreightHandling2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     */
    public void setFreightHandling2_IsNotNull() { regFreightHandling2(CK_ISNN, DOBJ); }

    protected void regFreightHandling2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightHandling2(), "FREIGHT_HANDLING2"); }
    protected abstract ConditionValue xgetCValueFreightHandling2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_Equal(String article) {
        doSetArticle_Equal(fRES(article));
    }

    protected void doSetArticle_Equal(String article) {
        regArticle(CK_EQ, article);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_NotEqual(String article) {
        doSetArticle_NotEqual(fRES(article));
    }

    protected void doSetArticle_NotEqual(String article) {
        regArticle(CK_NES, article);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_GreaterThan(String article) {
        regArticle(CK_GT, fRES(article));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_LessThan(String article) {
        regArticle(CK_LT, fRES(article));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_GreaterEqual(String article) {
        regArticle(CK_GE, fRES(article));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_LessEqual(String article) {
        regArticle(CK_LE, fRES(article));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param articleList The collection of article as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_InScope(Collection<String> articleList) {
        doSetArticle_InScope(articleList);
    }

    protected void doSetArticle_InScope(Collection<String> articleList) {
        regINS(CK_INS, cTL(articleList), xgetCValueArticle(), "ARTICLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param articleList The collection of article as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_NotInScope(Collection<String> articleList) {
        doSetArticle_NotInScope(articleList);
    }

    protected void doSetArticle_NotInScope(Collection<String> articleList) {
        regINS(CK_NINS, cTL(articleList), xgetCValueArticle(), "ARTICLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)} <br>
     * <pre>e.g. setArticle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param article The value of article as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArticle_LikeSearch(String article, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(article), xgetCValueArticle(), "ARTICLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArticle_NotLikeSearch(String article, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(article), xgetCValueArticle(), "ARTICLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_PrefixSearch(String article) {
        setArticle_LikeSearch(article, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNull() { regArticle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNullOrEmpty() { regArticle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNotNull() { regArticle(CK_ISNN, DOBJ); }

    protected void regArticle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticle(), "ARTICLE"); }
    protected abstract ConditionValue xgetCValueArticle();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveId The value of receiveId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_Equal(Long receiveId) {
        doSetReceiveId_Equal(receiveId);
    }

    protected void doSetReceiveId_Equal(Long receiveId) {
        regReceiveId(CK_EQ, receiveId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveId The value of receiveId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_NotEqual(Long receiveId) {
        doSetReceiveId_NotEqual(receiveId);
    }

    protected void doSetReceiveId_NotEqual(Long receiveId) {
        regReceiveId(CK_NES, receiveId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveId The value of receiveId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_GreaterThan(Long receiveId) {
        regReceiveId(CK_GT, receiveId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveId The value of receiveId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_LessThan(Long receiveId) {
        regReceiveId(CK_LT, receiveId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveId The value of receiveId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_GreaterEqual(Long receiveId) {
        regReceiveId(CK_GE, receiveId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveId The value of receiveId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_LessEqual(Long receiveId) {
        regReceiveId(CK_LE, receiveId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param minNumber The min number of receiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveId(), "RECEIVE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveIdList The collection of receiveId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveId_InScope(Collection<Long> receiveIdList) {
        doSetReceiveId_InScope(receiveIdList);
    }

    protected void doSetReceiveId_InScope(Collection<Long> receiveIdList) {
        regINS(CK_INS, cTL(receiveIdList), xgetCValueReceiveId(), "RECEIVE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     * @param receiveIdList The collection of receiveId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveId_NotInScope(Collection<Long> receiveIdList) {
        doSetReceiveId_NotInScope(receiveIdList);
    }

    protected void doSetReceiveId_NotInScope(Collection<Long> receiveIdList) {
        regINS(CK_NINS, cTL(receiveIdList), xgetCValueReceiveId(), "RECEIVE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     */
    public void setReceiveId_IsNull() { regReceiveId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_ID: {bigint(19)}
     */
    public void setReceiveId_IsNotNull() { regReceiveId(CK_ISNN, DOBJ); }

    protected void regReceiveId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveId(), "RECEIVE_ID"); }
    protected abstract ConditionValue xgetCValueReceiveId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    /**
     * Equal(=). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_Equal_$0() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_Equal_$1() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_NotEqual_$0() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_NotEqual_$1() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    /**
     * Equal(=). As ImportFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込みフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setImportFlg_Equal_AsImportFlg(CDef.ImportFlg cdef) {
        doSetImportFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未取込
     */
    public void setImportFlg_Equal_$0() {
        setImportFlg_Equal_AsImportFlg(CDef.ImportFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 取込済
     */
    public void setImportFlg_Equal_$1() {
        setImportFlg_Equal_AsImportFlg(CDef.ImportFlg.$1);
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ImportFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込みフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual_AsImportFlg(CDef.ImportFlg cdef) {
        doSetImportFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未取込
     */
    public void setImportFlg_NotEqual_$0() {
        setImportFlg_NotEqual_AsImportFlg(CDef.ImportFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 取込済
     */
    public void setImportFlg_NotEqual_$1() {
        setImportFlg_NotEqual_AsImportFlg(CDef.ImportFlg.$1);
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ImportFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込みフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope_AsImportFlg(Collection<CDef.ImportFlg> cdefList) {
        doSetImportFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ImportFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込みフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope_AsImportFlg(Collection<CDef.ImportFlg> cdefList) {
        doSetImportFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     */
    public void setImportFlg_IsNull() { regImportFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     */
    public void setImportFlg_IsNotNull() { regImportFlg(CK_ISNN, DOBJ); }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_Equal(Long importTypeId) {
        doSetImportTypeId_Equal(importTypeId);
    }

    protected void doSetImportTypeId_Equal(Long importTypeId) {
        regImportTypeId(CK_EQ, importTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_NotEqual(Long importTypeId) {
        doSetImportTypeId_NotEqual(importTypeId);
    }

    protected void doSetImportTypeId_NotEqual(Long importTypeId) {
        regImportTypeId(CK_NES, importTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterThan(Long importTypeId) {
        regImportTypeId(CK_GT, importTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessThan(Long importTypeId) {
        regImportTypeId(CK_LT, importTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterEqual(Long importTypeId) {
        regImportTypeId(CK_GE, importTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessEqual(Long importTypeId) {
        regImportTypeId(CK_LE, importTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param minNumber The min number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeId(), "IMPORT_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeIdList The collection of importTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_InScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_InScope(importTypeIdList);
    }

    protected void doSetImportTypeId_InScope(Collection<Long> importTypeIdList) {
        regINS(CK_INS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeIdList The collection of importTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_NotInScope(importTypeIdList);
    }

    protected void doSetImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        regINS(CK_NINS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPORT_TYPE_ID from M_IMPORT_TYPE where ...)} <br />
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @param subCBLambda The callback for sub-query of MImportType for 'in-scope'. (NotNull)
     */
    public void inScopeMImportType(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepImportTypeId_InScopeRelation_MImportType(cb.query());
        registerInScopeRelation(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportType", false);
    }
    public abstract String keepImportTypeId_InScopeRelation_MImportType(MImportTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPORT_TYPE_ID from M_IMPORT_TYPE where ...)} <br />
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @param subCBLambda The callback for sub-query of MImportType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMImportType(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepImportTypeId_NotInScopeRelation_MImportType(cb.query());
        registerInScopeRelation(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportType", true);
    }
    public abstract String keepImportTypeId_NotInScopeRelation_MImportType(MImportTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     */
    public void setImportTypeId_IsNull() { regImportTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     */
    public void setImportTypeId_IsNotNull() { regImportTypeId(CK_ISNN, DOBJ); }

    protected void regImportTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeId(), "IMPORT_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
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
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
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
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
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
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_H_ID from T_SHIPPING_INST_H where ...)} <br />
     * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @param subCBLambda The callback for sub-query of TShippingInstH for 'in-scope'. (NotNull)
     */
    public void inScopeTShippingInstH(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstHId_InScopeRelation_TShippingInstH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstH", false);
    }
    public abstract String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_H_ID from T_SHIPPING_INST_H where ...)} <br />
     * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @param subCBLambda The callback for sub-query of TShippingInstH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTShippingInstH(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstHId_NotInScopeRelation_TShippingInstH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstH", true);
    }
    public abstract String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     */
    public void setShippingInstHId_IsNull() { regShippingInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     */
    public void setShippingInstHId_IsNotNull() { regShippingInstHId(CK_ISNN, DOBJ); }

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

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
    public HpSLCFunction<TEcOrderHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TEcOrderHCB.class);
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
    public HpSLCFunction<TEcOrderHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TEcOrderHCB.class);
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
    public HpSLCFunction<TEcOrderHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TEcOrderHCB.class);
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
    public HpSLCFunction<TEcOrderHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TEcOrderHCB.class);
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
    public HpSLCFunction<TEcOrderHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TEcOrderHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TEcOrderHCB&gt;() {
     *     public void query(TEcOrderHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TEcOrderHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TEcOrderHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TEcOrderHCQ sq);

    protected TEcOrderHCB xcreateScalarConditionCB() {
        TEcOrderHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TEcOrderHCB xcreateScalarConditionPartitionByCB() {
        TEcOrderHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TEcOrderHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "EC_ORDER_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TEcOrderHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TEcOrderHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TEcOrderHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EC_ORDER_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TEcOrderHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TEcOrderHCQ sq);

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
    protected TEcOrderHCB newMyCB() {
        return new TEcOrderHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TEcOrderHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

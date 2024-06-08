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
 * The abstract condition-query of T_CORDHDR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCordhdrCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCordhdrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CORDHDR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHId The value of orderHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_Equal(Long orderHId) {
        doSetOrderHId_Equal(orderHId);
    }

    protected void doSetOrderHId_Equal(Long orderHId) {
        regOrderHId(CK_EQ, orderHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHId The value of orderHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_NotEqual(Long orderHId) {
        doSetOrderHId_NotEqual(orderHId);
    }

    protected void doSetOrderHId_NotEqual(Long orderHId) {
        regOrderHId(CK_NES, orderHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHId The value of orderHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_GreaterThan(Long orderHId) {
        regOrderHId(CK_GT, orderHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHId The value of orderHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_LessThan(Long orderHId) {
        regOrderHId(CK_LT, orderHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHId The value of orderHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_GreaterEqual(Long orderHId) {
        regOrderHId(CK_GE, orderHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHId The value of orderHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_LessEqual(Long orderHId) {
        regOrderHId(CK_LE, orderHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of orderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderHId(), "ORDER_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHIdList The collection of orderHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderHId_InScope(Collection<Long> orderHIdList) {
        doSetOrderHId_InScope(orderHIdList);
    }

    protected void doSetOrderHId_InScope(Collection<Long> orderHIdList) {
        regINS(CK_INS, cTL(orderHIdList), xgetCValueOrderHId(), "ORDER_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderHIdList The collection of orderHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderHId_NotInScope(Collection<Long> orderHIdList) {
        doSetOrderHId_NotInScope(orderHIdList);
    }

    protected void doSetOrderHId_NotInScope(Collection<Long> orderHIdList) {
        regINS(CK_NINS, cTL(orderHIdList), xgetCValueOrderHId(), "ORDER_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ORDER_H_ID from T_CORDDTAEC where ...)} <br>
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCorddtaecList</span>(corddtaecCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corddtaecCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCorddtaecList for 'exists'. (NotNull)
     */
    public void existsTCorddtaecList(SubQuery<TCorddtaecCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOrderHId_ExistsReferrer_TCorddtaecList(cb.query());
        registerExistsReferrer(cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCorddtaecList");
    }
    public abstract String keepOrderHId_ExistsReferrer_TCorddtaecList(TCorddtaecCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ORDER_H_ID from T_CORDDTASR where ...)} <br>
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCorddtasrList</span>(corddtasrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corddtasrCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCorddtasrList for 'exists'. (NotNull)
     */
    public void existsTCorddtasrList(SubQuery<TCorddtasrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCorddtasrCB cb = new TCorddtasrCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOrderHId_ExistsReferrer_TCorddtasrList(cb.query());
        registerExistsReferrer(cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCorddtasrList");
    }
    public abstract String keepOrderHId_ExistsReferrer_TCorddtasrList(TCorddtasrCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ORDER_H_ID from T_CORDDTAEC where ...)} <br>
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCorddtaecList</span>(corddtaecCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corddtaecCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of OrderHId_NotExistsReferrer_TCorddtaecList for 'not exists'. (NotNull)
     */
    public void notExistsTCorddtaecList(SubQuery<TCorddtaecCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOrderHId_NotExistsReferrer_TCorddtaecList(cb.query());
        registerNotExistsReferrer(cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCorddtaecList");
    }
    public abstract String keepOrderHId_NotExistsReferrer_TCorddtaecList(TCorddtaecCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ORDER_H_ID from T_CORDDTASR where ...)} <br>
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCorddtasrList</span>(corddtasrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corddtasrCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of OrderHId_NotExistsReferrer_TCorddtasrList for 'not exists'. (NotNull)
     */
    public void notExistsTCorddtasrList(SubQuery<TCorddtasrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCorddtasrCB cb = new TCorddtasrCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOrderHId_NotExistsReferrer_TCorddtasrList(cb.query());
        registerNotExistsReferrer(cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCorddtasrList");
    }
    public abstract String keepOrderHId_NotExistsReferrer_TCorddtasrList(TCorddtasrCQ sq);

    public void xsderiveTCorddtaecList(String fn, SubQuery<TCorddtaecCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepOrderHId_SpecifyDerivedReferrer_TCorddtaecList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCorddtaecList", al, op);
    }
    public abstract String keepOrderHId_SpecifyDerivedReferrer_TCorddtaecList(TCorddtaecCQ sq);

    public void xsderiveTCorddtasrList(String fn, SubQuery<TCorddtasrCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtasrCB cb = new TCorddtasrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepOrderHId_SpecifyDerivedReferrer_TCorddtasrList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCorddtasrList", al, op);
    }
    public abstract String keepOrderHId_SpecifyDerivedReferrer_TCorddtasrList(TCorddtasrCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CORDDTAEC where ...)} <br>
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCorddtaecList()</span>.<span style="color: #CC4747">max</span>(corddtaecCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corddtaecCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     corddtaecCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCorddtaecCB> derivedTCorddtaecList() {
        return xcreateQDRFunctionTCorddtaecList();
    }
    protected HpQDRFunction<TCorddtaecCB> xcreateQDRFunctionTCorddtaecList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCorddtaecList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCorddtaecList(String fn, SubQuery<TCorddtaecCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepOrderHId_QueryDerivedReferrer_TCorddtaecList(cb.query()); String prpp = keepOrderHId_QueryDerivedReferrer_TCorddtaecListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ORDER_H_ID", "ORDER_H_ID", sqpp, "tCorddtaecList", rd, vl, prpp, op);
    }
    public abstract String keepOrderHId_QueryDerivedReferrer_TCorddtaecList(TCorddtaecCQ sq);
    public abstract String keepOrderHId_QueryDerivedReferrer_TCorddtaecListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CORDDTASR where ...)} <br>
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCorddtasrList()</span>.<span style="color: #CC4747">max</span>(corddtasrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corddtasrCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     corddtasrCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCorddtasrCB> derivedTCorddtasrList() {
        return xcreateQDRFunctionTCorddtasrList();
    }
    protected HpQDRFunction<TCorddtasrCB> xcreateQDRFunctionTCorddtasrList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCorddtasrList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCorddtasrList(String fn, SubQuery<TCorddtasrCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtasrCB cb = new TCorddtasrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepOrderHId_QueryDerivedReferrer_TCorddtasrList(cb.query()); String prpp = keepOrderHId_QueryDerivedReferrer_TCorddtasrListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ORDER_H_ID", "ORDER_H_ID", sqpp, "tCorddtasrList", rd, vl, prpp, op);
    }
    public abstract String keepOrderHId_QueryDerivedReferrer_TCorddtasrList(TCorddtasrCQ sq);
    public abstract String keepOrderHId_QueryDerivedReferrer_TCorddtasrListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setOrderHId_IsNull() { regOrderHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setOrderHId_IsNotNull() { regOrderHId(CK_ISNN, DOBJ); }

    protected void regOrderHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderHId(), "ORDER_H_ID"); }
    protected abstract ConditionValue xgetCValueOrderHId();

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
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_Equal(String zzordymd) {
        doSetZzordymd_Equal(fRES(zzordymd));
    }

    protected void doSetZzordymd_Equal(String zzordymd) {
        regZzordymd(CK_EQ, zzordymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotEqual(String zzordymd) {
        doSetZzordymd_NotEqual(fRES(zzordymd));
    }

    protected void doSetZzordymd_NotEqual(String zzordymd) {
        regZzordymd(CK_NES, zzordymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterThan(String zzordymd) {
        regZzordymd(CK_GT, fRES(zzordymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessThan(String zzordymd) {
        regZzordymd(CK_LT, fRES(zzordymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterEqual(String zzordymd) {
        regZzordymd(CK_GE, fRES(zzordymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessEqual(String zzordymd) {
        regZzordymd(CK_LE, fRES(zzordymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymdList The collection of zzordymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_InScope(Collection<String> zzordymdList) {
        doSetZzordymd_InScope(zzordymdList);
    }

    protected void doSetZzordymd_InScope(Collection<String> zzordymdList) {
        regINS(CK_INS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymdList The collection of zzordymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotInScope(Collection<String> zzordymdList) {
        doSetZzordymd_NotInScope(zzordymdList);
    }

    protected void doSetZzordymd_NotInScope(Collection<String> zzordymdList) {
        regINS(CK_NINS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setZzordymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzordymd The value of zzordymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzordymd_LikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzordymd_NotLikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_PrefixSearch(String zzordymd) {
        setZzordymd_LikeSearch(zzordymd, xcLSOPPre());
    }

    protected void regZzordymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzordymd(), "ZZORDYMD"); }
    protected abstract ConditionValue xgetCValueZzordymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_Equal(String ordgr) {
        doSetOrdgr_Equal(fRES(ordgr));
    }

    protected void doSetOrdgr_Equal(String ordgr) {
        regOrdgr(CK_EQ, ordgr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotEqual(String ordgr) {
        doSetOrdgr_NotEqual(fRES(ordgr));
    }

    protected void doSetOrdgr_NotEqual(String ordgr) {
        regOrdgr(CK_NES, ordgr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterThan(String ordgr) {
        regOrdgr(CK_GT, fRES(ordgr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessThan(String ordgr) {
        regOrdgr(CK_LT, fRES(ordgr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterEqual(String ordgr) {
        regOrdgr(CK_GE, fRES(ordgr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessEqual(String ordgr) {
        regOrdgr(CK_LE, fRES(ordgr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgrList The collection of ordgr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_InScope(Collection<String> ordgrList) {
        doSetOrdgr_InScope(ordgrList);
    }

    protected void doSetOrdgr_InScope(Collection<String> ordgrList) {
        regINS(CK_INS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgrList The collection of ordgr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotInScope(Collection<String> ordgrList) {
        doSetOrdgr_NotInScope(ordgrList);
    }

    protected void doSetOrdgr_NotInScope(Collection<String> ordgrList) {
        regINS(CK_NINS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOrdgr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordgr The value of ordgr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdgr_LikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdgr_NotLikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_PrefixSearch(String ordgr) {
        setOrdgr_LikeSearch(ordgr, xcLSOPPre());
    }

    protected void regOrdgr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdgr(), "ORDGR"); }
    protected abstract ConditionValue xgetCValueOrdgr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_Equal(String dlvymd) {
        doSetDlvymd_Equal(fRES(dlvymd));
    }

    protected void doSetDlvymd_Equal(String dlvymd) {
        regDlvymd(CK_EQ, dlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotEqual(String dlvymd) {
        doSetDlvymd_NotEqual(fRES(dlvymd));
    }

    protected void doSetDlvymd_NotEqual(String dlvymd) {
        regDlvymd(CK_NES, dlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymdList The collection of dlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_InScope(Collection<String> dlvymdList) {
        doSetDlvymd_InScope(dlvymdList);
    }

    protected void doSetDlvymd_InScope(Collection<String> dlvymdList) {
        regINS(CK_INS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymdList The collection of dlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotInScope(Collection<String> dlvymdList) {
        doSetDlvymd_NotInScope(dlvymdList);
    }

    protected void doSetDlvymd_NotInScope(Collection<String> dlvymdList) {
        regINS(CK_NINS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setDlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvymd The value of dlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvymd_LikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
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
     * DED: {NotNull, varchar(30)}
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
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
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
     * DED: {NotNull, varchar(30)}
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
     * DED: {NotNull, varchar(30)} <br>
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
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_Equal(String pstnid) {
        doSetPstnid_Equal(fRES(pstnid));
    }

    protected void doSetPstnid_Equal(String pstnid) {
        regPstnid(CK_EQ, pstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotEqual(String pstnid) {
        doSetPstnid_NotEqual(fRES(pstnid));
    }

    protected void doSetPstnid_NotEqual(String pstnid) {
        regPstnid(CK_NES, pstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnidList The collection of pstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_InScope(Collection<String> pstnidList) {
        doSetPstnid_InScope(pstnidList);
    }

    protected void doSetPstnid_InScope(Collection<String> pstnidList) {
        regINS(CK_INS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnidList The collection of pstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotInScope(Collection<String> pstnidList) {
        doSetPstnid_NotInScope(pstnidList);
    }

    protected void doSetPstnid_NotInScope(Collection<String> pstnidList) {
        regINS(CK_NINS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pstnid The value of pstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPstnid_LikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_Equal(String scddlvymd) {
        doSetScddlvymd_Equal(fRES(scddlvymd));
    }

    protected void doSetScddlvymd_Equal(String scddlvymd) {
        regScddlvymd(CK_EQ, scddlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_NotEqual(String scddlvymd) {
        doSetScddlvymd_NotEqual(fRES(scddlvymd));
    }

    protected void doSetScddlvymd_NotEqual(String scddlvymd) {
        regScddlvymd(CK_NES, scddlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_GreaterThan(String scddlvymd) {
        regScddlvymd(CK_GT, fRES(scddlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_LessThan(String scddlvymd) {
        regScddlvymd(CK_LT, fRES(scddlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_GreaterEqual(String scddlvymd) {
        regScddlvymd(CK_GE, fRES(scddlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_LessEqual(String scddlvymd) {
        regScddlvymd(CK_LE, fRES(scddlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymdList The collection of scddlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_InScope(Collection<String> scddlvymdList) {
        doSetScddlvymd_InScope(scddlvymdList);
    }

    protected void doSetScddlvymd_InScope(Collection<String> scddlvymdList) {
        regINS(CK_INS, cTL(scddlvymdList), xgetCValueScddlvymd(), "SCDDLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymdList The collection of scddlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_NotInScope(Collection<String> scddlvymdList) {
        doSetScddlvymd_NotInScope(scddlvymdList);
    }

    protected void doSetScddlvymd_NotInScope(Collection<String> scddlvymdList) {
        regINS(CK_NINS, cTL(scddlvymdList), xgetCValueScddlvymd(), "SCDDLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setScddlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scddlvymd The value of scddlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScddlvymd_LikeSearch(String scddlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scddlvymd), xgetCValueScddlvymd(), "SCDDLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScddlvymd_NotLikeSearch(String scddlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scddlvymd), xgetCValueScddlvymd(), "SCDDLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @param scddlvymd The value of scddlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_PrefixSearch(String scddlvymd) {
        setScddlvymd_LikeSearch(scddlvymd, xcLSOPPre());
    }

    protected void regScddlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScddlvymd(), "SCDDLVYMD"); }
    protected abstract ConditionValue xgetCValueScddlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_Equal(String scdded) {
        doSetScdded_Equal(fRES(scdded));
    }

    protected void doSetScdded_Equal(String scdded) {
        regScdded(CK_EQ, scdded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_NotEqual(String scdded) {
        doSetScdded_NotEqual(fRES(scdded));
    }

    protected void doSetScdded_NotEqual(String scdded) {
        regScdded(CK_NES, scdded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_GreaterThan(String scdded) {
        regScdded(CK_GT, fRES(scdded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_LessThan(String scdded) {
        regScdded(CK_LT, fRES(scdded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_GreaterEqual(String scdded) {
        regScdded(CK_GE, fRES(scdded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_LessEqual(String scdded) {
        regScdded(CK_LE, fRES(scdded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scddedList The collection of scdded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_InScope(Collection<String> scddedList) {
        doSetScdded_InScope(scddedList);
    }

    protected void doSetScdded_InScope(Collection<String> scddedList) {
        regINS(CK_INS, cTL(scddedList), xgetCValueScdded(), "SCDDED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scddedList The collection of scdded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_NotInScope(Collection<String> scddedList) {
        doSetScdded_NotInScope(scddedList);
    }

    protected void doSetScdded_NotInScope(Collection<String> scddedList) {
        regINS(CK_NINS, cTL(scddedList), xgetCValueScdded(), "SCDDED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)} <br>
     * <pre>e.g. setScdded_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scdded The value of scdded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScdded_LikeSearch(String scdded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scdded), xgetCValueScdded(), "SCDDED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScdded_NotLikeSearch(String scdded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scdded), xgetCValueScdded(), "SCDDED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_PrefixSearch(String scdded) {
        setScdded_LikeSearch(scdded, xcLSOPPre());
    }

    protected void regScdded(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScdded(), "SCDDED"); }
    protected abstract ConditionValue xgetCValueScdded();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_Equal(String scdpstnid) {
        doSetScdpstnid_Equal(fRES(scdpstnid));
    }

    protected void doSetScdpstnid_Equal(String scdpstnid) {
        regScdpstnid(CK_EQ, scdpstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_NotEqual(String scdpstnid) {
        doSetScdpstnid_NotEqual(fRES(scdpstnid));
    }

    protected void doSetScdpstnid_NotEqual(String scdpstnid) {
        regScdpstnid(CK_NES, scdpstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_GreaterThan(String scdpstnid) {
        regScdpstnid(CK_GT, fRES(scdpstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_LessThan(String scdpstnid) {
        regScdpstnid(CK_LT, fRES(scdpstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_GreaterEqual(String scdpstnid) {
        regScdpstnid(CK_GE, fRES(scdpstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_LessEqual(String scdpstnid) {
        regScdpstnid(CK_LE, fRES(scdpstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnidList The collection of scdpstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_InScope(Collection<String> scdpstnidList) {
        doSetScdpstnid_InScope(scdpstnidList);
    }

    protected void doSetScdpstnid_InScope(Collection<String> scdpstnidList) {
        regINS(CK_INS, cTL(scdpstnidList), xgetCValueScdpstnid(), "SCDPSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnidList The collection of scdpstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_NotInScope(Collection<String> scdpstnidList) {
        doSetScdpstnid_NotInScope(scdpstnidList);
    }

    protected void doSetScdpstnid_NotInScope(Collection<String> scdpstnidList) {
        regINS(CK_NINS, cTL(scdpstnidList), xgetCValueScdpstnid(), "SCDPSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setScdpstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scdpstnid The value of scdpstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScdpstnid_LikeSearch(String scdpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scdpstnid), xgetCValueScdpstnid(), "SCDPSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScdpstnid_NotLikeSearch(String scdpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scdpstnid), xgetCValueScdpstnid(), "SCDPSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @param scdpstnid The value of scdpstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_PrefixSearch(String scdpstnid) {
        setScdpstnid_LikeSearch(scdpstnid, xcLSOPPre());
    }

    protected void regScdpstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScdpstnid(), "SCDPSTNID"); }
    protected abstract ConditionValue xgetCValueScdpstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_Equal(String ioid) {
        doSetIoid_Equal(fRES(ioid));
    }

    protected void doSetIoid_Equal(String ioid) {
        regIoid(CK_EQ, ioid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_NotEqual(String ioid) {
        doSetIoid_NotEqual(fRES(ioid));
    }

    protected void doSetIoid_NotEqual(String ioid) {
        regIoid(CK_NES, ioid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_GreaterThan(String ioid) {
        regIoid(CK_GT, fRES(ioid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_LessThan(String ioid) {
        regIoid(CK_LT, fRES(ioid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_GreaterEqual(String ioid) {
        regIoid(CK_GE, fRES(ioid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_LessEqual(String ioid) {
        regIoid(CK_LE, fRES(ioid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioidList The collection of ioid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_InScope(Collection<String> ioidList) {
        doSetIoid_InScope(ioidList);
    }

    protected void doSetIoid_InScope(Collection<String> ioidList) {
        regINS(CK_INS, cTL(ioidList), xgetCValueIoid(), "IOID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioidList The collection of ioid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_NotInScope(Collection<String> ioidList) {
        doSetIoid_NotInScope(ioidList);
    }

    protected void doSetIoid_NotInScope(Collection<String> ioidList) {
        regINS(CK_NINS, cTL(ioidList), xgetCValueIoid(), "IOID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)} <br>
     * <pre>e.g. setIoid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ioid The value of ioid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIoid_LikeSearch(String ioid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ioid), xgetCValueIoid(), "IOID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIoid_NotLikeSearch(String ioid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ioid), xgetCValueIoid(), "IOID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_PrefixSearch(String ioid) {
        setIoid_LikeSearch(ioid, xcLSOPPre());
    }

    protected void regIoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIoid(), "IOID"); }
    protected abstract ConditionValue xgetCValueIoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqa The value of ctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtqa_Equal(Long ctqa) {
        doSetCtqa_Equal(ctqa);
    }

    protected void doSetCtqa_Equal(Long ctqa) {
        regCtqa(CK_EQ, ctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqa The value of ctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtqa_NotEqual(Long ctqa) {
        doSetCtqa_NotEqual(ctqa);
    }

    protected void doSetCtqa_NotEqual(Long ctqa) {
        regCtqa(CK_NES, ctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqa The value of ctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtqa_GreaterThan(Long ctqa) {
        regCtqa(CK_GT, ctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqa The value of ctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtqa_LessThan(Long ctqa) {
        regCtqa(CK_LT, ctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqa The value of ctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtqa_GreaterEqual(Long ctqa) {
        regCtqa(CK_GE, ctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqa The value of ctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtqa_LessEqual(Long ctqa) {
        regCtqa(CK_LE, ctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param minNumber The min number of ctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtqa(), "CTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqaList The collection of ctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtqa_InScope(Collection<Long> ctqaList) {
        doSetCtqa_InScope(ctqaList);
    }

    protected void doSetCtqa_InScope(Collection<Long> ctqaList) {
        regINS(CK_INS, cTL(ctqaList), xgetCValueCtqa(), "CTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTQA: {NotNull, bigint(19)}
     * @param ctqaList The collection of ctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtqa_NotInScope(Collection<Long> ctqaList) {
        doSetCtqa_NotInScope(ctqaList);
    }

    protected void doSetCtqa_NotInScope(Collection<Long> ctqaList) {
        regINS(CK_NINS, cTL(ctqaList), xgetCValueCtqa(), "CTQA");
    }

    protected void regCtqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtqa(), "CTQA"); }
    protected abstract ConditionValue xgetCValueCtqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param sta The value of sta as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSta_Equal(java.math.BigDecimal sta) {
        doSetSta_Equal(sta);
    }

    protected void doSetSta_Equal(java.math.BigDecimal sta) {
        regSta(CK_EQ, sta);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param sta The value of sta as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSta_NotEqual(java.math.BigDecimal sta) {
        doSetSta_NotEqual(sta);
    }

    protected void doSetSta_NotEqual(java.math.BigDecimal sta) {
        regSta(CK_NES, sta);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param sta The value of sta as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSta_GreaterThan(java.math.BigDecimal sta) {
        regSta(CK_GT, sta);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param sta The value of sta as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSta_LessThan(java.math.BigDecimal sta) {
        regSta(CK_LT, sta);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param sta The value of sta as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSta_GreaterEqual(java.math.BigDecimal sta) {
        regSta(CK_GE, sta);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param sta The value of sta as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSta_LessEqual(java.math.BigDecimal sta) {
        regSta(CK_LE, sta);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of sta. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sta. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSta_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSta(), "STA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param staList The collection of sta as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSta_InScope(Collection<java.math.BigDecimal> staList) {
        doSetSta_InScope(staList);
    }

    protected void doSetSta_InScope(Collection<java.math.BigDecimal> staList) {
        regINS(CK_INS, cTL(staList), xgetCValueSta(), "STA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @param staList The collection of sta as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSta_NotInScope(Collection<java.math.BigDecimal> staList) {
        doSetSta_NotInScope(staList);
    }

    protected void doSetSta_NotInScope(Collection<java.math.BigDecimal> staList) {
        regINS(CK_NINS, cTL(staList), xgetCValueSta(), "STA");
    }

    protected void regSta(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSta(), "STA"); }
    protected abstract ConditionValue xgetCValueSta();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_Equal(String wrkmfg) {
        doSetWrkmfg_Equal(fRES(wrkmfg));
    }

    protected void doSetWrkmfg_Equal(String wrkmfg) {
        regWrkmfg(CK_EQ, wrkmfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_NotEqual(String wrkmfg) {
        doSetWrkmfg_NotEqual(fRES(wrkmfg));
    }

    protected void doSetWrkmfg_NotEqual(String wrkmfg) {
        regWrkmfg(CK_NES, wrkmfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_GreaterThan(String wrkmfg) {
        regWrkmfg(CK_GT, fRES(wrkmfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_LessThan(String wrkmfg) {
        regWrkmfg(CK_LT, fRES(wrkmfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_GreaterEqual(String wrkmfg) {
        regWrkmfg(CK_GE, fRES(wrkmfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_LessEqual(String wrkmfg) {
        regWrkmfg(CK_LE, fRES(wrkmfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfgList The collection of wrkmfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_InScope(Collection<String> wrkmfgList) {
        doSetWrkmfg_InScope(wrkmfgList);
    }

    protected void doSetWrkmfg_InScope(Collection<String> wrkmfgList) {
        regINS(CK_INS, cTL(wrkmfgList), xgetCValueWrkmfg(), "WRKMFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfgList The collection of wrkmfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_NotInScope(Collection<String> wrkmfgList) {
        doSetWrkmfg_NotInScope(wrkmfgList);
    }

    protected void doSetWrkmfg_NotInScope(Collection<String> wrkmfgList) {
        regINS(CK_NINS, cTL(wrkmfgList), xgetCValueWrkmfg(), "WRKMFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)} <br>
     * <pre>e.g. setWrkmfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrkmfg The value of wrkmfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrkmfg_LikeSearch(String wrkmfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrkmfg), xgetCValueWrkmfg(), "WRKMFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrkmfg_NotLikeSearch(String wrkmfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrkmfg), xgetCValueWrkmfg(), "WRKMFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_PrefixSearch(String wrkmfg) {
        setWrkmfg_LikeSearch(wrkmfg, xcLSOPPre());
    }

    protected void regWrkmfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrkmfg(), "WRKMFG"); }
    protected abstract ConditionValue xgetCValueWrkmfg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
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
     * SROPRTCNT: {NotNull, bigint(19)}
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
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
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
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
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
     * CORDRCVCNT: {NotNull, bigint(19)}
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
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_GreaterThan(Long cordrcvcnt) {
        regCordrcvcnt(CK_GT, cordrcvcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_LessThan(Long cordrcvcnt) {
        regCordrcvcnt(CK_LT, cordrcvcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_GreaterEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_GE, cordrcvcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_LessEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_LE, cordrcvcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @param minNumber The min number of cordrcvcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cordrcvcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCordrcvcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCordrcvcnt(), "CORDRCVCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
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
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @param cordrcvcntList The collection of cordrcvcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCordrcvcnt_NotInScope(Collection<Long> cordrcvcntList) {
        doSetCordrcvcnt_NotInScope(cordrcvcntList);
    }

    protected void doSetCordrcvcnt_NotInScope(Collection<Long> cordrcvcntList) {
        regINS(CK_NINS, cTL(cordrcvcntList), xgetCValueCordrcvcnt(), "CORDRCVCNT");
    }

    protected void regCordrcvcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCordrcvcnt(), "CORDRCVCNT"); }
    protected abstract ConditionValue xgetCValueCordrcvcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_Equal(String completeFlg) {
        doSetCompleteFlg_Equal(fRES(completeFlg));
    }

    protected void doSetCompleteFlg_Equal(String completeFlg) {
        regCompleteFlg(CK_EQ, completeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_NotEqual(String completeFlg) {
        doSetCompleteFlg_NotEqual(fRES(completeFlg));
    }

    protected void doSetCompleteFlg_NotEqual(String completeFlg) {
        regCompleteFlg(CK_NES, completeFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_GreaterThan(String completeFlg) {
        regCompleteFlg(CK_GT, fRES(completeFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_LessThan(String completeFlg) {
        regCompleteFlg(CK_LT, fRES(completeFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_GreaterEqual(String completeFlg) {
        regCompleteFlg(CK_GE, fRES(completeFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_LessEqual(String completeFlg) {
        regCompleteFlg(CK_LE, fRES(completeFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlgList The collection of completeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_InScope(Collection<String> completeFlgList) {
        doSetCompleteFlg_InScope(completeFlgList);
    }

    protected void doSetCompleteFlg_InScope(Collection<String> completeFlgList) {
        regINS(CK_INS, cTL(completeFlgList), xgetCValueCompleteFlg(), "COMPLETE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlgList The collection of completeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_NotInScope(Collection<String> completeFlgList) {
        doSetCompleteFlg_NotInScope(completeFlgList);
    }

    protected void doSetCompleteFlg_NotInScope(Collection<String> completeFlgList) {
        regINS(CK_NINS, cTL(completeFlgList), xgetCValueCompleteFlg(), "COMPLETE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)} <br>
     * <pre>e.g. setCompleteFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param completeFlg The value of completeFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompleteFlg_LikeSearch(String completeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(completeFlg), xgetCValueCompleteFlg(), "COMPLETE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompleteFlg_NotLikeSearch(String completeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(completeFlg), xgetCValueCompleteFlg(), "COMPLETE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @param completeFlg The value of completeFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteFlg_PrefixSearch(String completeFlg) {
        setCompleteFlg_LikeSearch(completeFlg, xcLSOPPre());
    }

    protected void regCompleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompleteFlg(), "COMPLETE_FLG"); }
    protected abstract ConditionValue xgetCValueCompleteFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_Equal(String rcvFlg) {
        doSetRcvFlg_Equal(fRES(rcvFlg));
    }

    protected void doSetRcvFlg_Equal(String rcvFlg) {
        regRcvFlg(CK_EQ, rcvFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_NotEqual(String rcvFlg) {
        doSetRcvFlg_NotEqual(fRES(rcvFlg));
    }

    protected void doSetRcvFlg_NotEqual(String rcvFlg) {
        regRcvFlg(CK_NES, rcvFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_GreaterThan(String rcvFlg) {
        regRcvFlg(CK_GT, fRES(rcvFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_LessThan(String rcvFlg) {
        regRcvFlg(CK_LT, fRES(rcvFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_GreaterEqual(String rcvFlg) {
        regRcvFlg(CK_GE, fRES(rcvFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_LessEqual(String rcvFlg) {
        regRcvFlg(CK_LE, fRES(rcvFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlgList The collection of rcvFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_InScope(Collection<String> rcvFlgList) {
        doSetRcvFlg_InScope(rcvFlgList);
    }

    protected void doSetRcvFlg_InScope(Collection<String> rcvFlgList) {
        regINS(CK_INS, cTL(rcvFlgList), xgetCValueRcvFlg(), "RCV_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlgList The collection of rcvFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_NotInScope(Collection<String> rcvFlgList) {
        doSetRcvFlg_NotInScope(rcvFlgList);
    }

    protected void doSetRcvFlg_NotInScope(Collection<String> rcvFlgList) {
        regINS(CK_NINS, cTL(rcvFlgList), xgetCValueRcvFlg(), "RCV_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setRcvFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvFlg The value of rcvFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvFlg_LikeSearch(String rcvFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvFlg), xgetCValueRcvFlg(), "RCV_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvFlg_NotLikeSearch(String rcvFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvFlg), xgetCValueRcvFlg(), "RCV_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @param rcvFlg The value of rcvFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvFlg_PrefixSearch(String rcvFlg) {
        setRcvFlg_LikeSearch(rcvFlg, xcLSOPPre());
    }

    protected void regRcvFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvFlg(), "RCV_FLG"); }
    protected abstract ConditionValue xgetCValueRcvFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_Equal(String skipKbn) {
        doSetSkipKbn_Equal(fRES(skipKbn));
    }

    protected void doSetSkipKbn_Equal(String skipKbn) {
        regSkipKbn(CK_EQ, skipKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_NotEqual(String skipKbn) {
        doSetSkipKbn_NotEqual(fRES(skipKbn));
    }

    protected void doSetSkipKbn_NotEqual(String skipKbn) {
        regSkipKbn(CK_NES, skipKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_GreaterThan(String skipKbn) {
        regSkipKbn(CK_GT, fRES(skipKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_LessThan(String skipKbn) {
        regSkipKbn(CK_LT, fRES(skipKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_GreaterEqual(String skipKbn) {
        regSkipKbn(CK_GE, fRES(skipKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_LessEqual(String skipKbn) {
        regSkipKbn(CK_LE, fRES(skipKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbnList The collection of skipKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_InScope(Collection<String> skipKbnList) {
        doSetSkipKbn_InScope(skipKbnList);
    }

    protected void doSetSkipKbn_InScope(Collection<String> skipKbnList) {
        regINS(CK_INS, cTL(skipKbnList), xgetCValueSkipKbn(), "SKIP_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbnList The collection of skipKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_NotInScope(Collection<String> skipKbnList) {
        doSetSkipKbn_NotInScope(skipKbnList);
    }

    protected void doSetSkipKbn_NotInScope(Collection<String> skipKbnList) {
        regINS(CK_NINS, cTL(skipKbnList), xgetCValueSkipKbn(), "SKIP_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKIP_KBN: {varchar(30)} <br>
     * <pre>e.g. setSkipKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skipKbn The value of skipKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkipKbn_LikeSearch(String skipKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skipKbn), xgetCValueSkipKbn(), "SKIP_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkipKbn_NotLikeSearch(String skipKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skipKbn), xgetCValueSkipKbn(), "SKIP_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     * @param skipKbn The value of skipKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkipKbn_PrefixSearch(String skipKbn) {
        setSkipKbn_LikeSearch(skipKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     */
    public void setSkipKbn_IsNull() { regSkipKbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     */
    public void setSkipKbn_IsNullOrEmpty() { regSkipKbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKIP_KBN: {varchar(30)}
     */
    public void setSkipKbn_IsNotNull() { regSkipKbn(CK_ISNN, DOBJ); }

    protected void regSkipKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkipKbn(), "SKIP_KBN"); }
    protected abstract ConditionValue xgetCValueSkipKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_Equal(String sortDate) {
        doSetSortDate_Equal(fRES(sortDate));
    }

    protected void doSetSortDate_Equal(String sortDate) {
        regSortDate(CK_EQ, sortDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_NotEqual(String sortDate) {
        doSetSortDate_NotEqual(fRES(sortDate));
    }

    protected void doSetSortDate_NotEqual(String sortDate) {
        regSortDate(CK_NES, sortDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_GreaterThan(String sortDate) {
        regSortDate(CK_GT, fRES(sortDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_LessThan(String sortDate) {
        regSortDate(CK_LT, fRES(sortDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_GreaterEqual(String sortDate) {
        regSortDate(CK_GE, fRES(sortDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_LessEqual(String sortDate) {
        regSortDate(CK_LE, fRES(sortDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDateList The collection of sortDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_InScope(Collection<String> sortDateList) {
        doSetSortDate_InScope(sortDateList);
    }

    protected void doSetSortDate_InScope(Collection<String> sortDateList) {
        regINS(CK_INS, cTL(sortDateList), xgetCValueSortDate(), "SORT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDateList The collection of sortDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_NotInScope(Collection<String> sortDateList) {
        doSetSortDate_NotInScope(sortDateList);
    }

    protected void doSetSortDate_NotInScope(Collection<String> sortDateList) {
        regINS(CK_NINS, cTL(sortDateList), xgetCValueSortDate(), "SORT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)} <br>
     * <pre>e.g. setSortDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortDate The value of sortDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortDate_LikeSearch(String sortDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortDate), xgetCValueSortDate(), "SORT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortDate_NotLikeSearch(String sortDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortDate), xgetCValueSortDate(), "SORT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_PrefixSearch(String sortDate) {
        setSortDate_LikeSearch(sortDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     */
    public void setSortDate_IsNull() { regSortDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     */
    public void setSortDate_IsNullOrEmpty() { regSortDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     */
    public void setSortDate_IsNotNull() { regSortDate(CK_ISNN, DOBJ); }

    protected void regSortDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortDate(), "SORT_DATE"); }
    protected abstract ConditionValue xgetCValueSortDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_Equal(String comment) {
        doSetComment_Equal(fRES(comment));
    }

    protected void doSetComment_Equal(String comment) {
        regComment(CK_EQ, comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_NotEqual(String comment) {
        doSetComment_NotEqual(fRES(comment));
    }

    protected void doSetComment_NotEqual(String comment) {
        regComment(CK_NES, comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_GreaterThan(String comment) {
        regComment(CK_GT, fRES(comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_LessThan(String comment) {
        regComment(CK_LT, fRES(comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_GreaterEqual(String comment) {
        regComment(CK_GE, fRES(comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_LessEqual(String comment) {
        regComment(CK_LE, fRES(comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param commentList The collection of comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_InScope(Collection<String> commentList) {
        doSetComment_InScope(commentList);
    }

    protected void doSetComment_InScope(Collection<String> commentList) {
        regINS(CK_INS, cTL(commentList), xgetCValueComment(), "COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param commentList The collection of comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_NotInScope(Collection<String> commentList) {
        doSetComment_NotInScope(commentList);
    }

    protected void doSetComment_NotInScope(Collection<String> commentList) {
        regINS(CK_NINS, cTL(commentList), xgetCValueComment(), "COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT: {varchar(255)} <br>
     * <pre>e.g. setComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comment The value of comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComment_LikeSearch(String comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comment), xgetCValueComment(), "COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComment_NotLikeSearch(String comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comment), xgetCValueComment(), "COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT: {varchar(255)}
     * @param comment The value of comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_PrefixSearch(String comment) {
        setComment_LikeSearch(comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     */
    public void setComment_IsNull() { regComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     */
    public void setComment_IsNullOrEmpty() { regComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT: {varchar(255)}
     */
    public void setComment_IsNotNull() { regComment(CK_ISNN, DOBJ); }

    protected void regComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComment(), "COMMENT"); }
    protected abstract ConditionValue xgetCValueComment();

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
    public HpSLCFunction<TCordhdrCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCordhdrCB.class);
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
    public HpSLCFunction<TCordhdrCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCordhdrCB.class);
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
    public HpSLCFunction<TCordhdrCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCordhdrCB.class);
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
    public HpSLCFunction<TCordhdrCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCordhdrCB.class);
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
    public HpSLCFunction<TCordhdrCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCordhdrCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCordhdrCB&gt;() {
     *     public void query(TCordhdrCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCordhdrCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCordhdrCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCordhdrCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCordhdrCQ sq);

    protected TCordhdrCB xcreateScalarConditionCB() {
        TCordhdrCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCordhdrCB xcreateScalarConditionPartitionByCB() {
        TCordhdrCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCordhdrCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ORDER_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCordhdrCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCordhdrCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCordhdrCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ORDER_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCordhdrCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCordhdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCordhdrCQ sq);

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
    protected TCordhdrCB newMyCB() {
        return new TCordhdrCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCordhdrCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

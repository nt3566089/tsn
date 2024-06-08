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
 * The abstract condition-query of T_CENTER_SYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCenterSymbolCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCenterSymbolCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CENTER_SYMBOL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolId The value of centerSymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_Equal(Long centerSymbolId) {
        doSetCenterSymbolId_Equal(centerSymbolId);
    }

    protected void doSetCenterSymbolId_Equal(Long centerSymbolId) {
        regCenterSymbolId(CK_EQ, centerSymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolId The value of centerSymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotEqual(Long centerSymbolId) {
        doSetCenterSymbolId_NotEqual(centerSymbolId);
    }

    protected void doSetCenterSymbolId_NotEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_NES, centerSymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolId The value of centerSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterThan(Long centerSymbolId) {
        regCenterSymbolId(CK_GT, centerSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolId The value of centerSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessThan(Long centerSymbolId) {
        regCenterSymbolId(CK_LT, centerSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolId The value of centerSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_GE, centerSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolId The value of centerSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_LE, centerSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param minNumber The min number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterSymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolIdList The collection of centerSymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_InScope(Collection<Long> centerSymbolIdList) {
        doSetCenterSymbolId_InScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_InScope(Collection<Long> centerSymbolIdList) {
        regINS(CK_INS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @param centerSymbolIdList The collection of centerSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotInScope(Collection<Long> centerSymbolIdList) {
        doSetCenterSymbolId_NotInScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_NotInScope(Collection<Long> centerSymbolIdList) {
        regINS(CK_NINS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CHILD_CENTER_SYMBOL_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCenterSymbolSelfList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCenterSymbolSelfList for 'exists'. (NotNull)
     */
    public void existsTCenterSymbolSelfList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterSymbolId_ExistsReferrer_TCenterSymbolSelfList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_SYMBOL_ID", "CHILD_CENTER_SYMBOL_ID", pp, "tCenterSymbolSelfList");
    }
    public abstract String keepCenterSymbolId_ExistsReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CHILD_CENTER_SYMBOL_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCenterSymbolSelfList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterSymbolId_NotExistsReferrer_TCenterSymbolSelfList for 'not exists'. (NotNull)
     */
    public void notExistsTCenterSymbolSelfList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterSymbolId_NotExistsReferrer_TCenterSymbolSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_SYMBOL_ID", "CHILD_CENTER_SYMBOL_ID", pp, "tCenterSymbolSelfList");
    }
    public abstract String keepCenterSymbolId_NotExistsReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq);

    public void xsderiveTCenterSymbolSelfList(String fn, SubQuery<TCenterSymbolCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_SYMBOL_ID", "CHILD_CENTER_SYMBOL_ID", pp, "tCenterSymbolSelfList", al, op);
    }
    public abstract String keepCenterSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCenterSymbolSelfList()</span>.<span style="color: #CC4747">max</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     symbolCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCenterSymbolCB> derivedTCenterSymbolSelfList() {
        return xcreateQDRFunctionTCenterSymbolSelfList();
    }
    protected HpQDRFunction<TCenterSymbolCB> xcreateQDRFunctionTCenterSymbolSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCenterSymbolSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCenterSymbolSelfList(String fn, SubQuery<TCenterSymbolCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList(cb.query()); String prpp = keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_SYMBOL_ID", "CHILD_CENTER_SYMBOL_ID", sqpp, "tCenterSymbolSelfList", rd, vl, prpp, op);
    }
    public abstract String keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq);
    public abstract String keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     */
    public void setCenterSymbolId_IsNull() { regCenterSymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     */
    public void setCenterSymbolId_IsNotNull() { regCenterSymbolId(CK_ISNN, DOBJ); }

    protected void regCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueCenterSymbolId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletId The value of palletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_Equal(Long palletId) {
        doSetPalletId_Equal(palletId);
    }

    protected void doSetPalletId_Equal(Long palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletId The value of palletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(Long palletId) {
        doSetPalletId_NotEqual(palletId);
    }

    protected void doSetPalletId_NotEqual(Long palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletId The value of palletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(Long palletId) {
        regPalletId(CK_GT, palletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletId The value of palletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(Long palletId) {
        regPalletId(CK_LT, palletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(Long palletId) {
        regPalletId(CK_GE, palletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletId The value of palletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(Long palletId) {
        regPalletId(CK_LE, palletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param minNumber The min number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletId(), "PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<Long> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<Long> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<Long> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<Long> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PALLET_ID from T_PALLET where ...)} <br />
     * T_PALLET by my PALLET_ID, named 'TPallet'.
     * @param subCBLambda The callback for sub-query of TPallet for 'in-scope'. (NotNull)
     */
    public void inScopeTPallet(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPalletId_InScopeRelation_TPallet(cb.query());
        registerInScopeRelation(cb.query(), "PALLET_ID", "PALLET_ID", pp, "tPallet", false);
    }
    public abstract String keepPalletId_InScopeRelation_TPallet(TPalletCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PALLET_ID from T_PALLET where ...)} <br />
     * T_PALLET by my PALLET_ID, named 'TPallet'.
     * @param subCBLambda The callback for sub-query of TPallet for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPallet(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPalletId_NotInScopeRelation_TPallet(cb.query());
        registerInScopeRelation(cb.query(), "PALLET_ID", "PALLET_ID", pp, "tPallet", true);
    }
    public abstract String keepPalletId_NotInScopeRelation_TPallet(TPalletCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     */
    public void setPalletId_IsNull() { regPalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     */
    public void setPalletId_IsNotNull() { regPalletId(CK_ISNN, DOBJ); }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolId The value of trsymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_Equal(Long trsymbolId) {
        doSetTrsymbolId_Equal(trsymbolId);
    }

    protected void doSetTrsymbolId_Equal(Long trsymbolId) {
        regTrsymbolId(CK_EQ, trsymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolId The value of trsymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotEqual(Long trsymbolId) {
        doSetTrsymbolId_NotEqual(trsymbolId);
    }

    protected void doSetTrsymbolId_NotEqual(Long trsymbolId) {
        regTrsymbolId(CK_NES, trsymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolIdList The collection of trsymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_InScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        regINS(CK_INS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRSYMBOL_ID from T_TRSYMBOL where ...)} <br />
     * T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'.
     * @param subCBLambda The callback for sub-query of TTrsymbol for 'in-scope'. (NotNull)
     */
    public void inScopeTTrsymbol(SubQuery<TTrsymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsymbolId_InScopeRelation_TTrsymbol(cb.query());
        registerInScopeRelation(cb.query(), "TRSYMBOL_ID", "TRSYMBOL_ID", pp, "tTrsymbol", false);
    }
    public abstract String keepTrsymbolId_InScopeRelation_TTrsymbol(TTrsymbolCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRSYMBOL_ID from T_TRSYMBOL where ...)} <br />
     * T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'.
     * @param subCBLambda The callback for sub-query of TTrsymbol for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrsymbol(SubQuery<TTrsymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsymbolId_NotInScopeRelation_TTrsymbol(cb.query());
        registerInScopeRelation(cb.query(), "TRSYMBOL_ID", "TRSYMBOL_ID", pp, "tTrsymbol", true);
    }
    public abstract String keepTrsymbolId_NotInScopeRelation_TTrsymbol(TTrsymbolCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     */
    public void setTrsymbolId_IsNull() { regTrsymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     */
    public void setTrsymbolId_IsNotNull() { regTrsymbolId(CK_ISNN, DOBJ); }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolId The value of childCenterSymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_Equal(Long childCenterSymbolId) {
        doSetChildCenterSymbolId_Equal(childCenterSymbolId);
    }

    protected void doSetChildCenterSymbolId_Equal(Long childCenterSymbolId) {
        regChildCenterSymbolId(CK_EQ, childCenterSymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolId The value of childCenterSymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_NotEqual(Long childCenterSymbolId) {
        doSetChildCenterSymbolId_NotEqual(childCenterSymbolId);
    }

    protected void doSetChildCenterSymbolId_NotEqual(Long childCenterSymbolId) {
        regChildCenterSymbolId(CK_NES, childCenterSymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolId The value of childCenterSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_GreaterThan(Long childCenterSymbolId) {
        regChildCenterSymbolId(CK_GT, childCenterSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolId The value of childCenterSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_LessThan(Long childCenterSymbolId) {
        regChildCenterSymbolId(CK_LT, childCenterSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolId The value of childCenterSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_GreaterEqual(Long childCenterSymbolId) {
        regChildCenterSymbolId(CK_GE, childCenterSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolId The value of childCenterSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_LessEqual(Long childCenterSymbolId) {
        regChildCenterSymbolId(CK_LE, childCenterSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param minNumber The min number of childCenterSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of childCenterSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChildCenterSymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChildCenterSymbolId(), "CHILD_CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolIdList The collection of childCenterSymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_InScope(Collection<Long> childCenterSymbolIdList) {
        doSetChildCenterSymbolId_InScope(childCenterSymbolIdList);
    }

    protected void doSetChildCenterSymbolId_InScope(Collection<Long> childCenterSymbolIdList) {
        regINS(CK_INS, cTL(childCenterSymbolIdList), xgetCValueChildCenterSymbolId(), "CHILD_CENTER_SYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @param childCenterSymbolIdList The collection of childCenterSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildCenterSymbolId_NotInScope(Collection<Long> childCenterSymbolIdList) {
        doSetChildCenterSymbolId_NotInScope(childCenterSymbolIdList);
    }

    protected void doSetChildCenterSymbolId_NotInScope(Collection<Long> childCenterSymbolIdList) {
        regINS(CK_NINS, cTL(childCenterSymbolIdList), xgetCValueChildCenterSymbolId(), "CHILD_CENTER_SYMBOL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CHILD_CENTER_SYMBOL_ID from T_CENTER_SYMBOL where ...)} <br />
     * T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'.
     * @param subCBLambda The callback for sub-query of TCenterSymbolSelf for 'in-scope'. (NotNull)
     */
    public void inScopeTCenterSymbolSelf(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepChildCenterSymbolId_InScopeRelation_TCenterSymbolSelf(cb.query());
        registerInScopeRelation(cb.query(), "CHILD_CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", pp, "tCenterSymbolSelf", false);
    }
    public abstract String keepChildCenterSymbolId_InScopeRelation_TCenterSymbolSelf(TCenterSymbolCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CHILD_CENTER_SYMBOL_ID from T_CENTER_SYMBOL where ...)} <br />
     * T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'.
     * @param subCBLambda The callback for sub-query of TCenterSymbolSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeTCenterSymbolSelf(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepChildCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf(cb.query());
        registerInScopeRelation(cb.query(), "CHILD_CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", pp, "tCenterSymbolSelf", true);
    }
    public abstract String keepChildCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf(TCenterSymbolCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     */
    public void setChildCenterSymbolId_IsNull() { regChildCenterSymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     */
    public void setChildCenterSymbolId_IsNotNull() { regChildCenterSymbolId(CK_ISNN, DOBJ); }

    protected void regChildCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChildCenterSymbolId(), "CHILD_CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueChildCenterSymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumber The value of sortstockNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortstockNumber_Equal(Long sortstockNumber) {
        doSetSortstockNumber_Equal(sortstockNumber);
    }

    protected void doSetSortstockNumber_Equal(Long sortstockNumber) {
        regSortstockNumber(CK_EQ, sortstockNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumber The value of sortstockNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortstockNumber_NotEqual(Long sortstockNumber) {
        doSetSortstockNumber_NotEqual(sortstockNumber);
    }

    protected void doSetSortstockNumber_NotEqual(Long sortstockNumber) {
        regSortstockNumber(CK_NES, sortstockNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumber The value of sortstockNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortstockNumber_GreaterThan(Long sortstockNumber) {
        regSortstockNumber(CK_GT, sortstockNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumber The value of sortstockNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortstockNumber_LessThan(Long sortstockNumber) {
        regSortstockNumber(CK_LT, sortstockNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumber The value of sortstockNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortstockNumber_GreaterEqual(Long sortstockNumber) {
        regSortstockNumber(CK_GE, sortstockNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumber The value of sortstockNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortstockNumber_LessEqual(Long sortstockNumber) {
        regSortstockNumber(CK_LE, sortstockNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param minNumber The min number of sortstockNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortstockNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortstockNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortstockNumber(), "SORTSTOCK_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumberList The collection of sortstockNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockNumber_InScope(Collection<Long> sortstockNumberList) {
        doSetSortstockNumber_InScope(sortstockNumberList);
    }

    protected void doSetSortstockNumber_InScope(Collection<Long> sortstockNumberList) {
        regINS(CK_INS, cTL(sortstockNumberList), xgetCValueSortstockNumber(), "SORTSTOCK_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @param sortstockNumberList The collection of sortstockNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockNumber_NotInScope(Collection<Long> sortstockNumberList) {
        doSetSortstockNumber_NotInScope(sortstockNumberList);
    }

    protected void doSetSortstockNumber_NotInScope(Collection<Long> sortstockNumberList) {
        regINS(CK_NINS, cTL(sortstockNumberList), xgetCValueSortstockNumber(), "SORTSTOCK_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     */
    public void setSortstockNumber_IsNull() { regSortstockNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     */
    public void setSortstockNumber_IsNotNull() { regSortstockNumber(CK_ISNN, DOBJ); }

    protected void regSortstockNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortstockNumber(), "SORTSTOCK_NUMBER"); }
    protected abstract ConditionValue xgetCValueSortstockNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_Equal(String qrCode) {
        doSetQrCode_Equal(fRES(qrCode));
    }

    protected void doSetQrCode_Equal(String qrCode) {
        regQrCode(CK_EQ, qrCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_NotEqual(String qrCode) {
        doSetQrCode_NotEqual(fRES(qrCode));
    }

    protected void doSetQrCode_NotEqual(String qrCode) {
        regQrCode(CK_NES, qrCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_GreaterThan(String qrCode) {
        regQrCode(CK_GT, fRES(qrCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_LessThan(String qrCode) {
        regQrCode(CK_LT, fRES(qrCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_GreaterEqual(String qrCode) {
        regQrCode(CK_GE, fRES(qrCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_LessEqual(String qrCode) {
        regQrCode(CK_LE, fRES(qrCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCodeList The collection of qrCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_InScope(Collection<String> qrCodeList) {
        doSetQrCode_InScope(qrCodeList);
    }

    protected void doSetQrCode_InScope(Collection<String> qrCodeList) {
        regINS(CK_INS, cTL(qrCodeList), xgetCValueQrCode(), "QR_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCodeList The collection of qrCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_NotInScope(Collection<String> qrCodeList) {
        doSetQrCode_NotInScope(qrCodeList);
    }

    protected void doSetQrCode_NotInScope(Collection<String> qrCodeList) {
        regINS(CK_NINS, cTL(qrCodeList), xgetCValueQrCode(), "QR_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)} <br>
     * <pre>e.g. setQrCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qrCode The value of qrCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQrCode_LikeSearch(String qrCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qrCode), xgetCValueQrCode(), "QR_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQrCode_NotLikeSearch(String qrCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qrCode), xgetCValueQrCode(), "QR_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @param qrCode The value of qrCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrCode_PrefixSearch(String qrCode) {
        setQrCode_LikeSearch(qrCode, xcLSOPPre());
    }

    protected void regQrCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQrCode(), "QR_CODE"); }
    protected abstract ConditionValue xgetCValueQrCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_Equal(String caseMoveSts) {
        doSetCaseMoveSts_Equal(fRES(caseMoveSts));
    }

    protected void doSetCaseMoveSts_Equal(String caseMoveSts) {
        regCaseMoveSts(CK_EQ, caseMoveSts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_NotEqual(String caseMoveSts) {
        doSetCaseMoveSts_NotEqual(fRES(caseMoveSts));
    }

    protected void doSetCaseMoveSts_NotEqual(String caseMoveSts) {
        regCaseMoveSts(CK_NES, caseMoveSts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_GreaterThan(String caseMoveSts) {
        regCaseMoveSts(CK_GT, fRES(caseMoveSts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_LessThan(String caseMoveSts) {
        regCaseMoveSts(CK_LT, fRES(caseMoveSts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_GreaterEqual(String caseMoveSts) {
        regCaseMoveSts(CK_GE, fRES(caseMoveSts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_LessEqual(String caseMoveSts) {
        regCaseMoveSts(CK_LE, fRES(caseMoveSts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveStsList The collection of caseMoveSts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_InScope(Collection<String> caseMoveStsList) {
        doSetCaseMoveSts_InScope(caseMoveStsList);
    }

    protected void doSetCaseMoveSts_InScope(Collection<String> caseMoveStsList) {
        regINS(CK_INS, cTL(caseMoveStsList), xgetCValueCaseMoveSts(), "CASE_MOVE_STS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveStsList The collection of caseMoveSts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_NotInScope(Collection<String> caseMoveStsList) {
        doSetCaseMoveSts_NotInScope(caseMoveStsList);
    }

    protected void doSetCaseMoveSts_NotInScope(Collection<String> caseMoveStsList) {
        regINS(CK_NINS, cTL(caseMoveStsList), xgetCValueCaseMoveSts(), "CASE_MOVE_STS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)} <br>
     * <pre>e.g. setCaseMoveSts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseMoveSts The value of caseMoveSts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseMoveSts_LikeSearch(String caseMoveSts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseMoveSts), xgetCValueCaseMoveSts(), "CASE_MOVE_STS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseMoveSts_NotLikeSearch(String caseMoveSts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseMoveSts), xgetCValueCaseMoveSts(), "CASE_MOVE_STS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @param caseMoveSts The value of caseMoveSts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseMoveSts_PrefixSearch(String caseMoveSts) {
        setCaseMoveSts_LikeSearch(caseMoveSts, xcLSOPPre());
    }

    protected void regCaseMoveSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseMoveSts(), "CASE_MOVE_STS"); }
    protected abstract ConditionValue xgetCValueCaseMoveSts();

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
    public HpSLCFunction<TCenterSymbolCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCenterSymbolCB.class);
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
    public HpSLCFunction<TCenterSymbolCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCenterSymbolCB.class);
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
    public HpSLCFunction<TCenterSymbolCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCenterSymbolCB.class);
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
    public HpSLCFunction<TCenterSymbolCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCenterSymbolCB.class);
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
    public HpSLCFunction<TCenterSymbolCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCenterSymbolCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCenterSymbolCB&gt;() {
     *     public void query(TCenterSymbolCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCenterSymbolCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCenterSymbolCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCenterSymbolCQ sq);

    protected TCenterSymbolCB xcreateScalarConditionCB() {
        TCenterSymbolCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCenterSymbolCB xcreateScalarConditionPartitionByCB() {
        TCenterSymbolCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCenterSymbolCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_SYMBOL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCenterSymbolCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCenterSymbolCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCenterSymbolCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_SYMBOL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCenterSymbolCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCenterSymbolCQ sq);

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
    protected TCenterSymbolCB newMyCB() {
        return new TCenterSymbolCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCenterSymbolCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

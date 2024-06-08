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
 * The abstract condition-query of T_YTRSO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTYtrsoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTYtrsoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_YTRSO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrId The value of trsrId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsrId_Equal(Long trsrId) {
        doSetTrsrId_Equal(trsrId);
    }

    protected void doSetTrsrId_Equal(Long trsrId) {
        regTrsrId(CK_EQ, trsrId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrId The value of trsrId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsrId_NotEqual(Long trsrId) {
        doSetTrsrId_NotEqual(trsrId);
    }

    protected void doSetTrsrId_NotEqual(Long trsrId) {
        regTrsrId(CK_NES, trsrId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrId The value of trsrId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsrId_GreaterThan(Long trsrId) {
        regTrsrId(CK_GT, trsrId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrId The value of trsrId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsrId_LessThan(Long trsrId) {
        regTrsrId(CK_LT, trsrId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrId The value of trsrId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsrId_GreaterEqual(Long trsrId) {
        regTrsrId(CK_GE, trsrId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrId The value of trsrId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsrId_LessEqual(Long trsrId) {
        regTrsrId(CK_LE, trsrId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsrId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsrId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsrId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsrId(), "TRSR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrIdList The collection of trsrId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsrId_InScope(Collection<Long> trsrIdList) {
        doSetTrsrId_InScope(trsrIdList);
    }

    protected void doSetTrsrId_InScope(Collection<Long> trsrIdList) {
        regINS(CK_INS, cTL(trsrIdList), xgetCValueTrsrId(), "TRSR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsrIdList The collection of trsrId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsrId_NotInScope(Collection<Long> trsrIdList) {
        doSetTrsrId_NotInScope(trsrIdList);
    }

    protected void doSetTrsrId_NotInScope(Collection<Long> trsrIdList) {
        regINS(CK_NINS, cTL(trsrIdList), xgetCValueTrsrId(), "TRSR_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRSO_ID from T_YTRSODETAIL where ...)} <br>
     * T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTYtrsodetailList</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsodetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TYtrsodetailList for 'exists'. (NotNull)
     */
    public void existsTYtrsodetailList(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsrId_ExistsReferrer_TYtrsodetailList(cb.query());
        registerExistsReferrer(cb.query(), "TRSR_ID", "TRSO_ID", pp, "tYtrsodetailList");
    }
    public abstract String keepTrsrId_ExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRSO_ID from T_YTRSODETAIL where ...)} <br>
     * T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTYtrsodetailList</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsodetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrsrId_NotExistsReferrer_TYtrsodetailList for 'not exists'. (NotNull)
     */
    public void notExistsTYtrsodetailList(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsrId_NotExistsReferrer_TYtrsodetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRSR_ID", "TRSO_ID", pp, "tYtrsodetailList");
    }
    public abstract String keepTrsrId_NotExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq);

    public void xsderiveTYtrsodetailList(String fn, SubQuery<TYtrsodetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrsrId_SpecifyDerivedReferrer_TYtrsodetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRSR_ID", "TRSO_ID", pp, "tYtrsodetailList", al, op);
    }
    public abstract String keepTrsrId_SpecifyDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_YTRSODETAIL where ...)} <br>
     * T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTYtrsodetailList()</span>.<span style="color: #CC4747">max</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsodetailCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ytrsodetailCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TYtrsodetailCB> derivedTYtrsodetailList() {
        return xcreateQDRFunctionTYtrsodetailList();
    }
    protected HpQDRFunction<TYtrsodetailCB> xcreateQDRFunctionTYtrsodetailList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTYtrsodetailList(fn, sq, rd, vl, op));
    }
    public void xqderiveTYtrsodetailList(String fn, SubQuery<TYtrsodetailCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrsrId_QueryDerivedReferrer_TYtrsodetailList(cb.query()); String prpp = keepTrsrId_QueryDerivedReferrer_TYtrsodetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRSR_ID", "TRSO_ID", sqpp, "tYtrsodetailList", rd, vl, prpp, op);
    }
    public abstract String keepTrsrId_QueryDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq);
    public abstract String keepTrsrId_QueryDerivedReferrer_TYtrsodetailListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsrId_IsNull() { regTrsrId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsrId_IsNotNull() { regTrsrId(CK_ISNN, DOBJ); }

    protected void regTrsrId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsrId(), "TRSR_ID"); }
    protected abstract ConditionValue xgetCValueTrsrId();

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
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKey The value of soKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoKey_Equal(Long soKey) {
        doSetSoKey_Equal(soKey);
    }

    protected void doSetSoKey_Equal(Long soKey) {
        regSoKey(CK_EQ, soKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKey The value of soKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoKey_NotEqual(Long soKey) {
        doSetSoKey_NotEqual(soKey);
    }

    protected void doSetSoKey_NotEqual(Long soKey) {
        regSoKey(CK_NES, soKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKey The value of soKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoKey_GreaterThan(Long soKey) {
        regSoKey(CK_GT, soKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKey The value of soKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoKey_LessThan(Long soKey) {
        regSoKey(CK_LT, soKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKey The value of soKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoKey_GreaterEqual(Long soKey) {
        regSoKey(CK_GE, soKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKey The value of soKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoKey_LessEqual(Long soKey) {
        regSoKey(CK_LE, soKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of soKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoKey(), "SO_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKeyList The collection of soKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoKey_InScope(Collection<Long> soKeyList) {
        doSetSoKey_InScope(soKeyList);
    }

    protected void doSetSoKey_InScope(Collection<Long> soKeyList) {
        regINS(CK_INS, cTL(soKeyList), xgetCValueSoKey(), "SO_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @param soKeyList The collection of soKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoKey_NotInScope(Collection<Long> soKeyList) {
        doSetSoKey_NotInScope(soKeyList);
    }

    protected void doSetSoKey_NotInScope(Collection<Long> soKeyList) {
        regINS(CK_NINS, cTL(soKeyList), xgetCValueSoKey(), "SO_KEY");
    }

    protected void regSoKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoKey(), "SO_KEY"); }
    protected abstract ConditionValue xgetCValueSoKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_Equal(String srStatus) {
        doSetSrStatus_Equal(fRES(srStatus));
    }

    protected void doSetSrStatus_Equal(String srStatus) {
        regSrStatus(CK_EQ, srStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_NotEqual(String srStatus) {
        doSetSrStatus_NotEqual(fRES(srStatus));
    }

    protected void doSetSrStatus_NotEqual(String srStatus) {
        regSrStatus(CK_NES, srStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_GreaterThan(String srStatus) {
        regSrStatus(CK_GT, fRES(srStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_LessThan(String srStatus) {
        regSrStatus(CK_LT, fRES(srStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_GreaterEqual(String srStatus) {
        regSrStatus(CK_GE, fRES(srStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_LessEqual(String srStatus) {
        regSrStatus(CK_LE, fRES(srStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatusList The collection of srStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_InScope(Collection<String> srStatusList) {
        doSetSrStatus_InScope(srStatusList);
    }

    protected void doSetSrStatus_InScope(Collection<String> srStatusList) {
        regINS(CK_INS, cTL(srStatusList), xgetCValueSrStatus(), "SR_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatusList The collection of srStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_NotInScope(Collection<String> srStatusList) {
        doSetSrStatus_NotInScope(srStatusList);
    }

    protected void doSetSrStatus_NotInScope(Collection<String> srStatusList) {
        regINS(CK_NINS, cTL(srStatusList), xgetCValueSrStatus(), "SR_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setSrStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srStatus The value of srStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrStatus_LikeSearch(String srStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srStatus), xgetCValueSrStatus(), "SR_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrStatus_NotLikeSearch(String srStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srStatus), xgetCValueSrStatus(), "SR_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @param srStatus The value of srStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrStatus_PrefixSearch(String srStatus) {
        setSrStatus_LikeSearch(srStatus, xcLSOPPre());
    }

    protected void regSrStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrStatus(), "SR_STATUS"); }
    protected abstract ConditionValue xgetCValueSrStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumber The value of restockNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestockNumber_Equal(Long restockNumber) {
        doSetRestockNumber_Equal(restockNumber);
    }

    protected void doSetRestockNumber_Equal(Long restockNumber) {
        regRestockNumber(CK_EQ, restockNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumber The value of restockNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestockNumber_NotEqual(Long restockNumber) {
        doSetRestockNumber_NotEqual(restockNumber);
    }

    protected void doSetRestockNumber_NotEqual(Long restockNumber) {
        regRestockNumber(CK_NES, restockNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumber The value of restockNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestockNumber_GreaterThan(Long restockNumber) {
        regRestockNumber(CK_GT, restockNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumber The value of restockNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestockNumber_LessThan(Long restockNumber) {
        regRestockNumber(CK_LT, restockNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumber The value of restockNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestockNumber_GreaterEqual(Long restockNumber) {
        regRestockNumber(CK_GE, restockNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumber The value of restockNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestockNumber_LessEqual(Long restockNumber) {
        regRestockNumber(CK_LE, restockNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param minNumber The min number of restockNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restockNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestockNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestockNumber(), "RESTOCK_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumberList The collection of restockNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockNumber_InScope(Collection<Long> restockNumberList) {
        doSetRestockNumber_InScope(restockNumberList);
    }

    protected void doSetRestockNumber_InScope(Collection<Long> restockNumberList) {
        regINS(CK_INS, cTL(restockNumberList), xgetCValueRestockNumber(), "RESTOCK_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @param restockNumberList The collection of restockNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockNumber_NotInScope(Collection<Long> restockNumberList) {
        doSetRestockNumber_NotInScope(restockNumberList);
    }

    protected void doSetRestockNumber_NotInScope(Collection<Long> restockNumberList) {
        regINS(CK_NINS, cTL(restockNumberList), xgetCValueRestockNumber(), "RESTOCK_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     */
    public void setRestockNumber_IsNull() { regRestockNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     */
    public void setRestockNumber_IsNotNull() { regRestockNumber(CK_ISNN, DOBJ); }

    protected void regRestockNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockNumber(), "RESTOCK_NUMBER"); }
    protected abstract ConditionValue xgetCValueRestockNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_Equal(String restockKbn) {
        doSetRestockKbn_Equal(fRES(restockKbn));
    }

    protected void doSetRestockKbn_Equal(String restockKbn) {
        regRestockKbn(CK_EQ, restockKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_NotEqual(String restockKbn) {
        doSetRestockKbn_NotEqual(fRES(restockKbn));
    }

    protected void doSetRestockKbn_NotEqual(String restockKbn) {
        regRestockKbn(CK_NES, restockKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_GreaterThan(String restockKbn) {
        regRestockKbn(CK_GT, fRES(restockKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_LessThan(String restockKbn) {
        regRestockKbn(CK_LT, fRES(restockKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_GreaterEqual(String restockKbn) {
        regRestockKbn(CK_GE, fRES(restockKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_LessEqual(String restockKbn) {
        regRestockKbn(CK_LE, fRES(restockKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbnList The collection of restockKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_InScope(Collection<String> restockKbnList) {
        doSetRestockKbn_InScope(restockKbnList);
    }

    protected void doSetRestockKbn_InScope(Collection<String> restockKbnList) {
        regINS(CK_INS, cTL(restockKbnList), xgetCValueRestockKbn(), "RESTOCK_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbnList The collection of restockKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_NotInScope(Collection<String> restockKbnList) {
        doSetRestockKbn_NotInScope(restockKbnList);
    }

    protected void doSetRestockKbn_NotInScope(Collection<String> restockKbnList) {
        regINS(CK_NINS, cTL(restockKbnList), xgetCValueRestockKbn(), "RESTOCK_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_KBN: {varchar(30)} <br>
     * <pre>e.g. setRestockKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockKbn The value of restockKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockKbn_LikeSearch(String restockKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockKbn), xgetCValueRestockKbn(), "RESTOCK_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockKbn_NotLikeSearch(String restockKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockKbn), xgetCValueRestockKbn(), "RESTOCK_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @param restockKbn The value of restockKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockKbn_PrefixSearch(String restockKbn) {
        setRestockKbn_LikeSearch(restockKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     */
    public void setRestockKbn_IsNull() { regRestockKbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     */
    public void setRestockKbn_IsNullOrEmpty() { regRestockKbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_KBN: {varchar(30)}
     */
    public void setRestockKbn_IsNotNull() { regRestockKbn(CK_ISNN, DOBJ); }

    protected void regRestockKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockKbn(), "RESTOCK_KBN"); }
    protected abstract ConditionValue xgetCValueRestockKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_Equal(String sortingRackNo) {
        doSetSortingRackNo_Equal(fRES(sortingRackNo));
    }

    protected void doSetSortingRackNo_Equal(String sortingRackNo) {
        regSortingRackNo(CK_EQ, sortingRackNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_NotEqual(String sortingRackNo) {
        doSetSortingRackNo_NotEqual(fRES(sortingRackNo));
    }

    protected void doSetSortingRackNo_NotEqual(String sortingRackNo) {
        regSortingRackNo(CK_NES, sortingRackNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_GreaterThan(String sortingRackNo) {
        regSortingRackNo(CK_GT, fRES(sortingRackNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_LessThan(String sortingRackNo) {
        regSortingRackNo(CK_LT, fRES(sortingRackNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_GreaterEqual(String sortingRackNo) {
        regSortingRackNo(CK_GE, fRES(sortingRackNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_LessEqual(String sortingRackNo) {
        regSortingRackNo(CK_LE, fRES(sortingRackNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNoList The collection of sortingRackNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_InScope(Collection<String> sortingRackNoList) {
        doSetSortingRackNo_InScope(sortingRackNoList);
    }

    protected void doSetSortingRackNo_InScope(Collection<String> sortingRackNoList) {
        regINS(CK_INS, cTL(sortingRackNoList), xgetCValueSortingRackNo(), "SORTING_RACK_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNoList The collection of sortingRackNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_NotInScope(Collection<String> sortingRackNoList) {
        doSetSortingRackNo_NotInScope(sortingRackNoList);
    }

    protected void doSetSortingRackNo_NotInScope(Collection<String> sortingRackNoList) {
        regINS(CK_NINS, cTL(sortingRackNoList), xgetCValueSortingRackNo(), "SORTING_RACK_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)} <br>
     * <pre>e.g. setSortingRackNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortingRackNo The value of sortingRackNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortingRackNo_LikeSearch(String sortingRackNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortingRackNo), xgetCValueSortingRackNo(), "SORTING_RACK_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortingRackNo_NotLikeSearch(String sortingRackNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortingRackNo), xgetCValueSortingRackNo(), "SORTING_RACK_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_PrefixSearch(String sortingRackNo) {
        setSortingRackNo_LikeSearch(sortingRackNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     */
    public void setSortingRackNo_IsNull() { regSortingRackNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     */
    public void setSortingRackNo_IsNullOrEmpty() { regSortingRackNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     */
    public void setSortingRackNo_IsNotNull() { regSortingRackNo(CK_ISNN, DOBJ); }

    protected void regSortingRackNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortingRackNo(), "SORTING_RACK_NO"); }
    protected abstract ConditionValue xgetCValueSortingRackNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_Equal(String restockSortKey) {
        doSetRestockSortKey_Equal(fRES(restockSortKey));
    }

    protected void doSetRestockSortKey_Equal(String restockSortKey) {
        regRestockSortKey(CK_EQ, restockSortKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_NotEqual(String restockSortKey) {
        doSetRestockSortKey_NotEqual(fRES(restockSortKey));
    }

    protected void doSetRestockSortKey_NotEqual(String restockSortKey) {
        regRestockSortKey(CK_NES, restockSortKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_GreaterThan(String restockSortKey) {
        regRestockSortKey(CK_GT, fRES(restockSortKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_LessThan(String restockSortKey) {
        regRestockSortKey(CK_LT, fRES(restockSortKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_GreaterEqual(String restockSortKey) {
        regRestockSortKey(CK_GE, fRES(restockSortKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_LessEqual(String restockSortKey) {
        regRestockSortKey(CK_LE, fRES(restockSortKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKeyList The collection of restockSortKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_InScope(Collection<String> restockSortKeyList) {
        doSetRestockSortKey_InScope(restockSortKeyList);
    }

    protected void doSetRestockSortKey_InScope(Collection<String> restockSortKeyList) {
        regINS(CK_INS, cTL(restockSortKeyList), xgetCValueRestockSortKey(), "RESTOCK_SORT_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKeyList The collection of restockSortKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_NotInScope(Collection<String> restockSortKeyList) {
        doSetRestockSortKey_NotInScope(restockSortKeyList);
    }

    protected void doSetRestockSortKey_NotInScope(Collection<String> restockSortKeyList) {
        regINS(CK_NINS, cTL(restockSortKeyList), xgetCValueRestockSortKey(), "RESTOCK_SORT_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)} <br>
     * <pre>e.g. setRestockSortKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockSortKey The value of restockSortKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockSortKey_LikeSearch(String restockSortKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockSortKey), xgetCValueRestockSortKey(), "RESTOCK_SORT_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockSortKey_NotLikeSearch(String restockSortKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockSortKey), xgetCValueRestockSortKey(), "RESTOCK_SORT_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @param restockSortKey The value of restockSortKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockSortKey_PrefixSearch(String restockSortKey) {
        setRestockSortKey_LikeSearch(restockSortKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     */
    public void setRestockSortKey_IsNull() { regRestockSortKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     */
    public void setRestockSortKey_IsNullOrEmpty() { regRestockSortKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     */
    public void setRestockSortKey_IsNotNull() { regRestockSortKey(CK_ISNN, DOBJ); }

    protected void regRestockSortKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockSortKey(), "RESTOCK_SORT_KEY"); }
    protected abstract ConditionValue xgetCValueRestockSortKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_Equal(String shipSchDate) {
        doSetShipSchDate_Equal(fRES(shipSchDate));
    }

    protected void doSetShipSchDate_Equal(String shipSchDate) {
        regShipSchDate(CK_EQ, shipSchDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_NotEqual(String shipSchDate) {
        doSetShipSchDate_NotEqual(fRES(shipSchDate));
    }

    protected void doSetShipSchDate_NotEqual(String shipSchDate) {
        regShipSchDate(CK_NES, shipSchDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_GreaterThan(String shipSchDate) {
        regShipSchDate(CK_GT, fRES(shipSchDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_LessThan(String shipSchDate) {
        regShipSchDate(CK_LT, fRES(shipSchDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_GreaterEqual(String shipSchDate) {
        regShipSchDate(CK_GE, fRES(shipSchDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_LessEqual(String shipSchDate) {
        regShipSchDate(CK_LE, fRES(shipSchDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDateList The collection of shipSchDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_InScope(Collection<String> shipSchDateList) {
        doSetShipSchDate_InScope(shipSchDateList);
    }

    protected void doSetShipSchDate_InScope(Collection<String> shipSchDateList) {
        regINS(CK_INS, cTL(shipSchDateList), xgetCValueShipSchDate(), "SHIP_SCH_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDateList The collection of shipSchDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_NotInScope(Collection<String> shipSchDateList) {
        doSetShipSchDate_NotInScope(shipSchDateList);
    }

    protected void doSetShipSchDate_NotInScope(Collection<String> shipSchDateList) {
        regINS(CK_NINS, cTL(shipSchDateList), xgetCValueShipSchDate(), "SHIP_SCH_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setShipSchDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipSchDate The value of shipSchDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipSchDate_LikeSearch(String shipSchDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipSchDate), xgetCValueShipSchDate(), "SHIP_SCH_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipSchDate_NotLikeSearch(String shipSchDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipSchDate), xgetCValueShipSchDate(), "SHIP_SCH_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @param shipSchDate The value of shipSchDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSchDate_PrefixSearch(String shipSchDate) {
        setShipSchDate_LikeSearch(shipSchDate, xcLSOPPre());
    }

    protected void regShipSchDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipSchDate(), "SHIP_SCH_DATE"); }
    protected abstract ConditionValue xgetCValueShipSchDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_Equal(String shipDate) {
        doSetShipDate_Equal(fRES(shipDate));
    }

    protected void doSetShipDate_Equal(String shipDate) {
        regShipDate(CK_EQ, shipDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_NotEqual(String shipDate) {
        doSetShipDate_NotEqual(fRES(shipDate));
    }

    protected void doSetShipDate_NotEqual(String shipDate) {
        regShipDate(CK_NES, shipDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_GreaterThan(String shipDate) {
        regShipDate(CK_GT, fRES(shipDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_LessThan(String shipDate) {
        regShipDate(CK_LT, fRES(shipDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_GreaterEqual(String shipDate) {
        regShipDate(CK_GE, fRES(shipDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_LessEqual(String shipDate) {
        regShipDate(CK_LE, fRES(shipDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDateList The collection of shipDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_InScope(Collection<String> shipDateList) {
        doSetShipDate_InScope(shipDateList);
    }

    protected void doSetShipDate_InScope(Collection<String> shipDateList) {
        regINS(CK_INS, cTL(shipDateList), xgetCValueShipDate(), "SHIP_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDateList The collection of shipDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_NotInScope(Collection<String> shipDateList) {
        doSetShipDate_NotInScope(shipDateList);
    }

    protected void doSetShipDate_NotInScope(Collection<String> shipDateList) {
        regINS(CK_NINS, cTL(shipDateList), xgetCValueShipDate(), "SHIP_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)} <br>
     * <pre>e.g. setShipDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipDate The value of shipDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipDate_LikeSearch(String shipDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipDate), xgetCValueShipDate(), "SHIP_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipDate_NotLikeSearch(String shipDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipDate), xgetCValueShipDate(), "SHIP_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @param shipDate The value of shipDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_PrefixSearch(String shipDate) {
        setShipDate_LikeSearch(shipDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     */
    public void setShipDate_IsNull() { regShipDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     */
    public void setShipDate_IsNullOrEmpty() { regShipDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {IX, varchar(8)}
     */
    public void setShipDate_IsNotNull() { regShipDate(CK_ISNN, DOBJ); }

    protected void regShipDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipDate(), "SHIP_DATE"); }
    protected abstract ConditionValue xgetCValueShipDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_Equal(String sortRestockFlg) {
        doSetSortRestockFlg_Equal(fRES(sortRestockFlg));
    }

    protected void doSetSortRestockFlg_Equal(String sortRestockFlg) {
        regSortRestockFlg(CK_EQ, sortRestockFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_NotEqual(String sortRestockFlg) {
        doSetSortRestockFlg_NotEqual(fRES(sortRestockFlg));
    }

    protected void doSetSortRestockFlg_NotEqual(String sortRestockFlg) {
        regSortRestockFlg(CK_NES, sortRestockFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_GreaterThan(String sortRestockFlg) {
        regSortRestockFlg(CK_GT, fRES(sortRestockFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_LessThan(String sortRestockFlg) {
        regSortRestockFlg(CK_LT, fRES(sortRestockFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_GreaterEqual(String sortRestockFlg) {
        regSortRestockFlg(CK_GE, fRES(sortRestockFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_LessEqual(String sortRestockFlg) {
        regSortRestockFlg(CK_LE, fRES(sortRestockFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlgList The collection of sortRestockFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_InScope(Collection<String> sortRestockFlgList) {
        doSetSortRestockFlg_InScope(sortRestockFlgList);
    }

    protected void doSetSortRestockFlg_InScope(Collection<String> sortRestockFlgList) {
        regINS(CK_INS, cTL(sortRestockFlgList), xgetCValueSortRestockFlg(), "SORT_RESTOCK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlgList The collection of sortRestockFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_NotInScope(Collection<String> sortRestockFlgList) {
        doSetSortRestockFlg_NotInScope(sortRestockFlgList);
    }

    protected void doSetSortRestockFlg_NotInScope(Collection<String> sortRestockFlgList) {
        regINS(CK_NINS, cTL(sortRestockFlgList), xgetCValueSortRestockFlg(), "SORT_RESTOCK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)} <br>
     * <pre>e.g. setSortRestockFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortRestockFlg The value of sortRestockFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortRestockFlg_LikeSearch(String sortRestockFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortRestockFlg), xgetCValueSortRestockFlg(), "SORT_RESTOCK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortRestockFlg_NotLikeSearch(String sortRestockFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortRestockFlg), xgetCValueSortRestockFlg(), "SORT_RESTOCK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @param sortRestockFlg The value of sortRestockFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortRestockFlg_PrefixSearch(String sortRestockFlg) {
        setSortRestockFlg_LikeSearch(sortRestockFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     */
    public void setSortRestockFlg_IsNull() { regSortRestockFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     */
    public void setSortRestockFlg_IsNullOrEmpty() { regSortRestockFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     */
    public void setSortRestockFlg_IsNotNull() { regSortRestockFlg(CK_ISNN, DOBJ); }

    protected void regSortRestockFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortRestockFlg(), "SORT_RESTOCK_FLG"); }
    protected abstract ConditionValue xgetCValueSortRestockFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_Equal(String deliveryCenterCd) {
        doSetDeliveryCenterCd_Equal(fRES(deliveryCenterCd));
    }

    protected void doSetDeliveryCenterCd_Equal(String deliveryCenterCd) {
        regDeliveryCenterCd(CK_EQ, deliveryCenterCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_NotEqual(String deliveryCenterCd) {
        doSetDeliveryCenterCd_NotEqual(fRES(deliveryCenterCd));
    }

    protected void doSetDeliveryCenterCd_NotEqual(String deliveryCenterCd) {
        regDeliveryCenterCd(CK_NES, deliveryCenterCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_GreaterThan(String deliveryCenterCd) {
        regDeliveryCenterCd(CK_GT, fRES(deliveryCenterCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_LessThan(String deliveryCenterCd) {
        regDeliveryCenterCd(CK_LT, fRES(deliveryCenterCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_GreaterEqual(String deliveryCenterCd) {
        regDeliveryCenterCd(CK_GE, fRES(deliveryCenterCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_LessEqual(String deliveryCenterCd) {
        regDeliveryCenterCd(CK_LE, fRES(deliveryCenterCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCdList The collection of deliveryCenterCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_InScope(Collection<String> deliveryCenterCdList) {
        doSetDeliveryCenterCd_InScope(deliveryCenterCdList);
    }

    protected void doSetDeliveryCenterCd_InScope(Collection<String> deliveryCenterCdList) {
        regINS(CK_INS, cTL(deliveryCenterCdList), xgetCValueDeliveryCenterCd(), "DELIVERY_CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCdList The collection of deliveryCenterCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_NotInScope(Collection<String> deliveryCenterCdList) {
        doSetDeliveryCenterCd_NotInScope(deliveryCenterCdList);
    }

    protected void doSetDeliveryCenterCd_NotInScope(Collection<String> deliveryCenterCdList) {
        regINS(CK_NINS, cTL(deliveryCenterCdList), xgetCValueDeliveryCenterCd(), "DELIVERY_CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)} <br>
     * <pre>e.g. setDeliveryCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCenterCd The value of deliveryCenterCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCenterCd_LikeSearch(String deliveryCenterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCenterCd), xgetCValueDeliveryCenterCd(), "DELIVERY_CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCenterCd_NotLikeSearch(String deliveryCenterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCenterCd), xgetCValueDeliveryCenterCd(), "DELIVERY_CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @param deliveryCenterCd The value of deliveryCenterCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCenterCd_PrefixSearch(String deliveryCenterCd) {
        setDeliveryCenterCd_LikeSearch(deliveryCenterCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     */
    public void setDeliveryCenterCd_IsNull() { regDeliveryCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     */
    public void setDeliveryCenterCd_IsNullOrEmpty() { regDeliveryCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     */
    public void setDeliveryCenterCd_IsNotNull() { regDeliveryCenterCd(CK_ISNN, DOBJ); }

    protected void regDeliveryCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCenterCd(), "DELIVERY_CENTER_CD"); }
    protected abstract ConditionValue xgetCValueDeliveryCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_Equal(String lineBlock) {
        doSetLineBlock_Equal(fRES(lineBlock));
    }

    protected void doSetLineBlock_Equal(String lineBlock) {
        regLineBlock(CK_EQ, lineBlock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotEqual(String lineBlock) {
        doSetLineBlock_NotEqual(fRES(lineBlock));
    }

    protected void doSetLineBlock_NotEqual(String lineBlock) {
        regLineBlock(CK_NES, lineBlock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterThan(String lineBlock) {
        regLineBlock(CK_GT, fRES(lineBlock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessThan(String lineBlock) {
        regLineBlock(CK_LT, fRES(lineBlock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterEqual(String lineBlock) {
        regLineBlock(CK_GE, fRES(lineBlock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessEqual(String lineBlock) {
        regLineBlock(CK_LE, fRES(lineBlock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlockList The collection of lineBlock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_InScope(Collection<String> lineBlockList) {
        doSetLineBlock_InScope(lineBlockList);
    }

    protected void doSetLineBlock_InScope(Collection<String> lineBlockList) {
        regINS(CK_INS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlockList The collection of lineBlock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotInScope(Collection<String> lineBlockList) {
        doSetLineBlock_NotInScope(lineBlockList);
    }

    protected void doSetLineBlock_NotInScope(Collection<String> lineBlockList) {
        regINS(CK_NINS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)} <br>
     * <pre>e.g. setLineBlock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlock The value of lineBlock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlock_LikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlock_NotLikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_PrefixSearch(String lineBlock) {
        setLineBlock_LikeSearch(lineBlock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNull() { regLineBlock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNullOrEmpty() { regLineBlock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNotNull() { regLineBlock(CK_ISNN, DOBJ); }

    protected void regLineBlock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlock(), "LINE_BLOCK"); }
    protected abstract ConditionValue xgetCValueLineBlock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_Equal(String deliveryDirection) {
        doSetDeliveryDirection_Equal(fRES(deliveryDirection));
    }

    protected void doSetDeliveryDirection_Equal(String deliveryDirection) {
        regDeliveryDirection(CK_EQ, deliveryDirection);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_NotEqual(String deliveryDirection) {
        doSetDeliveryDirection_NotEqual(fRES(deliveryDirection));
    }

    protected void doSetDeliveryDirection_NotEqual(String deliveryDirection) {
        regDeliveryDirection(CK_NES, deliveryDirection);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_GreaterThan(String deliveryDirection) {
        regDeliveryDirection(CK_GT, fRES(deliveryDirection));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_LessThan(String deliveryDirection) {
        regDeliveryDirection(CK_LT, fRES(deliveryDirection));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_GreaterEqual(String deliveryDirection) {
        regDeliveryDirection(CK_GE, fRES(deliveryDirection));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_LessEqual(String deliveryDirection) {
        regDeliveryDirection(CK_LE, fRES(deliveryDirection));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirectionList The collection of deliveryDirection as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_InScope(Collection<String> deliveryDirectionList) {
        doSetDeliveryDirection_InScope(deliveryDirectionList);
    }

    protected void doSetDeliveryDirection_InScope(Collection<String> deliveryDirectionList) {
        regINS(CK_INS, cTL(deliveryDirectionList), xgetCValueDeliveryDirection(), "DELIVERY_DIRECTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirectionList The collection of deliveryDirection as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_NotInScope(Collection<String> deliveryDirectionList) {
        doSetDeliveryDirection_NotInScope(deliveryDirectionList);
    }

    protected void doSetDeliveryDirection_NotInScope(Collection<String> deliveryDirectionList) {
        regINS(CK_NINS, cTL(deliveryDirectionList), xgetCValueDeliveryDirection(), "DELIVERY_DIRECTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)} <br>
     * <pre>e.g. setDeliveryDirection_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryDirection The value of deliveryDirection as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryDirection_LikeSearch(String deliveryDirection, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryDirection), xgetCValueDeliveryDirection(), "DELIVERY_DIRECTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryDirection_NotLikeSearch(String deliveryDirection, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryDirection), xgetCValueDeliveryDirection(), "DELIVERY_DIRECTION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @param deliveryDirection The value of deliveryDirection as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDirection_PrefixSearch(String deliveryDirection) {
        setDeliveryDirection_LikeSearch(deliveryDirection, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     */
    public void setDeliveryDirection_IsNull() { regDeliveryDirection(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     */
    public void setDeliveryDirection_IsNullOrEmpty() { regDeliveryDirection(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     */
    public void setDeliveryDirection_IsNotNull() { regDeliveryDirection(CK_ISNN, DOBJ); }

    protected void regDeliveryDirection(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryDirection(), "DELIVERY_DIRECTION"); }
    protected abstract ConditionValue xgetCValueDeliveryDirection();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_Equal(Long pickBatchKey) {
        doSetPickBatchKey_Equal(pickBatchKey);
    }

    protected void doSetPickBatchKey_Equal(Long pickBatchKey) {
        regPickBatchKey(CK_EQ, pickBatchKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_NotEqual(Long pickBatchKey) {
        doSetPickBatchKey_NotEqual(pickBatchKey);
    }

    protected void doSetPickBatchKey_NotEqual(Long pickBatchKey) {
        regPickBatchKey(CK_NES, pickBatchKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_GreaterThan(Long pickBatchKey) {
        regPickBatchKey(CK_GT, pickBatchKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_LessThan(Long pickBatchKey) {
        regPickBatchKey(CK_LT, pickBatchKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_GreaterEqual(Long pickBatchKey) {
        regPickBatchKey(CK_GE, pickBatchKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_LessEqual(Long pickBatchKey) {
        regPickBatchKey(CK_LE, pickBatchKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param minNumber The min number of pickBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickBatchKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickBatchKey(), "PICK_BATCH_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKeyList The collection of pickBatchKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchKey_InScope(Collection<Long> pickBatchKeyList) {
        doSetPickBatchKey_InScope(pickBatchKeyList);
    }

    protected void doSetPickBatchKey_InScope(Collection<Long> pickBatchKeyList) {
        regINS(CK_INS, cTL(pickBatchKeyList), xgetCValuePickBatchKey(), "PICK_BATCH_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKeyList The collection of pickBatchKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchKey_NotInScope(Collection<Long> pickBatchKeyList) {
        doSetPickBatchKey_NotInScope(pickBatchKeyList);
    }

    protected void doSetPickBatchKey_NotInScope(Collection<Long> pickBatchKeyList) {
        regINS(CK_NINS, cTL(pickBatchKeyList), xgetCValuePickBatchKey(), "PICK_BATCH_KEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     */
    public void setPickBatchKey_IsNull() { regPickBatchKey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     */
    public void setPickBatchKey_IsNotNull() { regPickBatchKey(CK_ISNN, DOBJ); }

    protected void regPickBatchKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickBatchKey(), "PICK_BATCH_KEY"); }
    protected abstract ConditionValue xgetCValuePickBatchKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_Equal(String picklistComment) {
        doSetPicklistComment_Equal(fRES(picklistComment));
    }

    protected void doSetPicklistComment_Equal(String picklistComment) {
        regPicklistComment(CK_EQ, picklistComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_NotEqual(String picklistComment) {
        doSetPicklistComment_NotEqual(fRES(picklistComment));
    }

    protected void doSetPicklistComment_NotEqual(String picklistComment) {
        regPicklistComment(CK_NES, picklistComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_GreaterThan(String picklistComment) {
        regPicklistComment(CK_GT, fRES(picklistComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_LessThan(String picklistComment) {
        regPicklistComment(CK_LT, fRES(picklistComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_GreaterEqual(String picklistComment) {
        regPicklistComment(CK_GE, fRES(picklistComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_LessEqual(String picklistComment) {
        regPicklistComment(CK_LE, fRES(picklistComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistCommentList The collection of picklistComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_InScope(Collection<String> picklistCommentList) {
        doSetPicklistComment_InScope(picklistCommentList);
    }

    protected void doSetPicklistComment_InScope(Collection<String> picklistCommentList) {
        regINS(CK_INS, cTL(picklistCommentList), xgetCValuePicklistComment(), "PICKLIST_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistCommentList The collection of picklistComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_NotInScope(Collection<String> picklistCommentList) {
        doSetPicklistComment_NotInScope(picklistCommentList);
    }

    protected void doSetPicklistComment_NotInScope(Collection<String> picklistCommentList) {
        regINS(CK_NINS, cTL(picklistCommentList), xgetCValuePicklistComment(), "PICKLIST_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)} <br>
     * <pre>e.g. setPicklistComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picklistComment The value of picklistComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicklistComment_LikeSearch(String picklistComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picklistComment), xgetCValuePicklistComment(), "PICKLIST_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicklistComment_NotLikeSearch(String picklistComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picklistComment), xgetCValuePicklistComment(), "PICKLIST_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @param picklistComment The value of picklistComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistComment_PrefixSearch(String picklistComment) {
        setPicklistComment_LikeSearch(picklistComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     */
    public void setPicklistComment_IsNull() { regPicklistComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     */
    public void setPicklistComment_IsNullOrEmpty() { regPicklistComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     */
    public void setPicklistComment_IsNotNull() { regPicklistComment(CK_ISNN, DOBJ); }

    protected void regPicklistComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistComment(), "PICKLIST_COMMENT"); }
    protected abstract ConditionValue xgetCValuePicklistComment();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNo The value of fromPicklistNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromPicklistNo_Equal(Long fromPicklistNo) {
        doSetFromPicklistNo_Equal(fromPicklistNo);
    }

    protected void doSetFromPicklistNo_Equal(Long fromPicklistNo) {
        regFromPicklistNo(CK_EQ, fromPicklistNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNo The value of fromPicklistNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromPicklistNo_NotEqual(Long fromPicklistNo) {
        doSetFromPicklistNo_NotEqual(fromPicklistNo);
    }

    protected void doSetFromPicklistNo_NotEqual(Long fromPicklistNo) {
        regFromPicklistNo(CK_NES, fromPicklistNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNo The value of fromPicklistNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromPicklistNo_GreaterThan(Long fromPicklistNo) {
        regFromPicklistNo(CK_GT, fromPicklistNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNo The value of fromPicklistNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromPicklistNo_LessThan(Long fromPicklistNo) {
        regFromPicklistNo(CK_LT, fromPicklistNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNo The value of fromPicklistNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromPicklistNo_GreaterEqual(Long fromPicklistNo) {
        regFromPicklistNo(CK_GE, fromPicklistNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNo The value of fromPicklistNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromPicklistNo_LessEqual(Long fromPicklistNo) {
        regFromPicklistNo(CK_LE, fromPicklistNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param minNumber The min number of fromPicklistNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromPicklistNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromPicklistNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFromPicklistNo(), "FROM_PICKLIST_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNoList The collection of fromPicklistNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromPicklistNo_InScope(Collection<Long> fromPicklistNoList) {
        doSetFromPicklistNo_InScope(fromPicklistNoList);
    }

    protected void doSetFromPicklistNo_InScope(Collection<Long> fromPicklistNoList) {
        regINS(CK_INS, cTL(fromPicklistNoList), xgetCValueFromPicklistNo(), "FROM_PICKLIST_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @param fromPicklistNoList The collection of fromPicklistNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromPicklistNo_NotInScope(Collection<Long> fromPicklistNoList) {
        doSetFromPicklistNo_NotInScope(fromPicklistNoList);
    }

    protected void doSetFromPicklistNo_NotInScope(Collection<Long> fromPicklistNoList) {
        regINS(CK_NINS, cTL(fromPicklistNoList), xgetCValueFromPicklistNo(), "FROM_PICKLIST_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     */
    public void setFromPicklistNo_IsNull() { regFromPicklistNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     */
    public void setFromPicklistNo_IsNotNull() { regFromPicklistNo(CK_ISNN, DOBJ); }

    protected void regFromPicklistNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromPicklistNo(), "FROM_PICKLIST_NO"); }
    protected abstract ConditionValue xgetCValueFromPicklistNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNo The value of toPicklistNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setToPicklistNo_Equal(Long toPicklistNo) {
        doSetToPicklistNo_Equal(toPicklistNo);
    }

    protected void doSetToPicklistNo_Equal(Long toPicklistNo) {
        regToPicklistNo(CK_EQ, toPicklistNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNo The value of toPicklistNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToPicklistNo_NotEqual(Long toPicklistNo) {
        doSetToPicklistNo_NotEqual(toPicklistNo);
    }

    protected void doSetToPicklistNo_NotEqual(Long toPicklistNo) {
        regToPicklistNo(CK_NES, toPicklistNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNo The value of toPicklistNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setToPicklistNo_GreaterThan(Long toPicklistNo) {
        regToPicklistNo(CK_GT, toPicklistNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNo The value of toPicklistNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setToPicklistNo_LessThan(Long toPicklistNo) {
        regToPicklistNo(CK_LT, toPicklistNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNo The value of toPicklistNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToPicklistNo_GreaterEqual(Long toPicklistNo) {
        regToPicklistNo(CK_GE, toPicklistNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNo The value of toPicklistNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToPicklistNo_LessEqual(Long toPicklistNo) {
        regToPicklistNo(CK_LE, toPicklistNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param minNumber The min number of toPicklistNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of toPicklistNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setToPicklistNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueToPicklistNo(), "TO_PICKLIST_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNoList The collection of toPicklistNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToPicklistNo_InScope(Collection<Long> toPicklistNoList) {
        doSetToPicklistNo_InScope(toPicklistNoList);
    }

    protected void doSetToPicklistNo_InScope(Collection<Long> toPicklistNoList) {
        regINS(CK_INS, cTL(toPicklistNoList), xgetCValueToPicklistNo(), "TO_PICKLIST_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @param toPicklistNoList The collection of toPicklistNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToPicklistNo_NotInScope(Collection<Long> toPicklistNoList) {
        doSetToPicklistNo_NotInScope(toPicklistNoList);
    }

    protected void doSetToPicklistNo_NotInScope(Collection<Long> toPicklistNoList) {
        regINS(CK_NINS, cTL(toPicklistNoList), xgetCValueToPicklistNo(), "TO_PICKLIST_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     */
    public void setToPicklistNo_IsNull() { regToPicklistNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     */
    public void setToPicklistNo_IsNotNull() { regToPicklistNo(CK_ISNN, DOBJ); }

    protected void regToPicklistNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToPicklistNo(), "TO_PICKLIST_NO"); }
    protected abstract ConditionValue xgetCValueToPicklistNo();

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
    public HpSLCFunction<TYtrsoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TYtrsoCB.class);
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
    public HpSLCFunction<TYtrsoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TYtrsoCB.class);
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
    public HpSLCFunction<TYtrsoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TYtrsoCB.class);
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
    public HpSLCFunction<TYtrsoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TYtrsoCB.class);
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
    public HpSLCFunction<TYtrsoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TYtrsoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TYtrsoCB&gt;() {
     *     public void query(TYtrsoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TYtrsoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TYtrsoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TYtrsoCQ sq);

    protected TYtrsoCB xcreateScalarConditionCB() {
        TYtrsoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TYtrsoCB xcreateScalarConditionPartitionByCB() {
        TYtrsoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TYtrsoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSR_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TYtrsoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TYtrsoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TYtrsoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSR_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TYtrsoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TYtrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TYtrsoCQ sq);

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
    protected TYtrsoCB newMyCB() {
        return new TYtrsoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TYtrsoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

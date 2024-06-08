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
 * The abstract condition-query of M_BOX_GRP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMBoxGrpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMBoxGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_BOX_GRP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpId The value of boxGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxGrpId_Equal(Long boxGrpId) {
        doSetBoxGrpId_Equal(boxGrpId);
    }

    protected void doSetBoxGrpId_Equal(Long boxGrpId) {
        regBoxGrpId(CK_EQ, boxGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpId The value of boxGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxGrpId_NotEqual(Long boxGrpId) {
        doSetBoxGrpId_NotEqual(boxGrpId);
    }

    protected void doSetBoxGrpId_NotEqual(Long boxGrpId) {
        regBoxGrpId(CK_NES, boxGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpId The value of boxGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxGrpId_GreaterThan(Long boxGrpId) {
        regBoxGrpId(CK_GT, boxGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpId The value of boxGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxGrpId_LessThan(Long boxGrpId) {
        regBoxGrpId(CK_LT, boxGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpId The value of boxGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxGrpId_GreaterEqual(Long boxGrpId) {
        regBoxGrpId(CK_GE, boxGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpId The value of boxGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxGrpId_LessEqual(Long boxGrpId) {
        regBoxGrpId(CK_LE, boxGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of boxGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxGrpId(), "BOX_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpIdList The collection of boxGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpId_InScope(Collection<Long> boxGrpIdList) {
        doSetBoxGrpId_InScope(boxGrpIdList);
    }

    protected void doSetBoxGrpId_InScope(Collection<Long> boxGrpIdList) {
        regINS(CK_INS, cTL(boxGrpIdList), xgetCValueBoxGrpId(), "BOX_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxGrpIdList The collection of boxGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpId_NotInScope(Collection<Long> boxGrpIdList) {
        doSetBoxGrpId_NotInScope(boxGrpIdList);
    }

    protected void doSetBoxGrpId_NotInScope(Collection<Long> boxGrpIdList) {
        regINS(CK_NINS, cTL(boxGrpIdList), xgetCValueBoxGrpId(), "BOX_GRP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_GRP_ID from M_BOX_GRP_DTL where ...)} <br>
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBoxGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBoxGrpDtlList for 'exists'. (NotNull)
     */
    public void existsMBoxGrpDtlList(SubQuery<MBoxGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxGrpId_ExistsReferrer_MBoxGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_GRP_ID", "BOX_GRP_ID", pp, "mBoxGrpDtlList");
    }
    public abstract String keepBoxGrpId_ExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PACKING_BOX_GROUP_ID from M_PARAM where ...)} <br>
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MParamList for 'exists'. (NotNull)
     */
    public void existsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxGrpId_ExistsReferrer_MParamList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_GRP_ID", "PACKING_BOX_GROUP_ID", pp, "mParamList");
    }
    public abstract String keepBoxGrpId_ExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_GRP_ID from M_BOX_GRP_DTL where ...)} <br>
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxGrpId_NotExistsReferrer_MBoxGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxGrpDtlList(SubQuery<MBoxGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxGrpId_NotExistsReferrer_MBoxGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_GRP_ID", "BOX_GRP_ID", pp, "mBoxGrpDtlList");
    }
    public abstract String keepBoxGrpId_NotExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PACKING_BOX_GROUP_ID from M_PARAM where ...)} <br>
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxGrpId_NotExistsReferrer_MParamList for 'not exists'. (NotNull)
     */
    public void notExistsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxGrpId_NotExistsReferrer_MParamList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_GRP_ID", "PACKING_BOX_GROUP_ID", pp, "mParamList");
    }
    public abstract String keepBoxGrpId_NotExistsReferrer_MParamList(MParamCQ sq);

    public void xsderiveMBoxGrpDtlList(String fn, SubQuery<MBoxGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_GRP_ID", "BOX_GRP_ID", pp, "mBoxGrpDtlList", al, op);
    }
    public abstract String keepBoxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);

    public void xsderiveMParamList(String fn, SubQuery<MParamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxGrpId_SpecifyDerivedReferrer_MParamList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_GRP_ID", "PACKING_BOX_GROUP_ID", pp, "mParamList", al, op);
    }
    public abstract String keepBoxGrpId_SpecifyDerivedReferrer_MParamList(MParamCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_BOX_GRP_DTL where ...)} <br>
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBoxGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBoxGrpDtlCB> derivedMBoxGrpDtlList() {
        return xcreateQDRFunctionMBoxGrpDtlList();
    }
    protected HpQDRFunction<MBoxGrpDtlCB> xcreateQDRFunctionMBoxGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBoxGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBoxGrpDtlList(String fn, SubQuery<MBoxGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlList(cb.query()); String prpp = keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_GRP_ID", "BOX_GRP_ID", sqpp, "mBoxGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);
    public abstract String keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PARAM where ...)} <br>
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMParamList()</span>.<span style="color: #CC4747">max</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     paramCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MParamCB> derivedMParamList() {
        return xcreateQDRFunctionMParamList();
    }
    protected HpQDRFunction<MParamCB> xcreateQDRFunctionMParamList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMParamList(fn, sq, rd, vl, op));
    }
    public void xqderiveMParamList(String fn, SubQuery<MParamCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxGrpId_QueryDerivedReferrer_MParamList(cb.query()); String prpp = keepBoxGrpId_QueryDerivedReferrer_MParamListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_GRP_ID", "PACKING_BOX_GROUP_ID", sqpp, "mParamList", rd, vl, prpp, op);
    }
    public abstract String keepBoxGrpId_QueryDerivedReferrer_MParamList(MParamCQ sq);
    public abstract String keepBoxGrpId_QueryDerivedReferrer_MParamListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBoxGrpId_IsNull() { regBoxGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBoxGrpId_IsNotNull() { regBoxGrpId(CK_ISNN, DOBJ); }

    protected void regBoxGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxGrpId(), "BOX_GRP_ID"); }
    protected abstract ConditionValue xgetCValueBoxGrpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_Equal(String boxGrpCd) {
        doSetBoxGrpCd_Equal(fRES(boxGrpCd));
    }

    protected void doSetBoxGrpCd_Equal(String boxGrpCd) {
        regBoxGrpCd(CK_EQ, boxGrpCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_NotEqual(String boxGrpCd) {
        doSetBoxGrpCd_NotEqual(fRES(boxGrpCd));
    }

    protected void doSetBoxGrpCd_NotEqual(String boxGrpCd) {
        regBoxGrpCd(CK_NES, boxGrpCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_GreaterThan(String boxGrpCd) {
        regBoxGrpCd(CK_GT, fRES(boxGrpCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_LessThan(String boxGrpCd) {
        regBoxGrpCd(CK_LT, fRES(boxGrpCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_GreaterEqual(String boxGrpCd) {
        regBoxGrpCd(CK_GE, fRES(boxGrpCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_LessEqual(String boxGrpCd) {
        regBoxGrpCd(CK_LE, fRES(boxGrpCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCdList The collection of boxGrpCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_InScope(Collection<String> boxGrpCdList) {
        doSetBoxGrpCd_InScope(boxGrpCdList);
    }

    protected void doSetBoxGrpCd_InScope(Collection<String> boxGrpCdList) {
        regINS(CK_INS, cTL(boxGrpCdList), xgetCValueBoxGrpCd(), "BOX_GRP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCdList The collection of boxGrpCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_NotInScope(Collection<String> boxGrpCdList) {
        doSetBoxGrpCd_NotInScope(boxGrpCdList);
    }

    protected void doSetBoxGrpCd_NotInScope(Collection<String> boxGrpCdList) {
        regINS(CK_NINS, cTL(boxGrpCdList), xgetCValueBoxGrpCd(), "BOX_GRP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setBoxGrpCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxGrpCd The value of boxGrpCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxGrpCd_LikeSearch(String boxGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxGrpCd), xgetCValueBoxGrpCd(), "BOX_GRP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxGrpCd_NotLikeSearch(String boxGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxGrpCd), xgetCValueBoxGrpCd(), "BOX_GRP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxGrpCd The value of boxGrpCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpCd_PrefixSearch(String boxGrpCd) {
        setBoxGrpCd_LikeSearch(boxGrpCd, xcLSOPPre());
    }

    protected void regBoxGrpCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxGrpCd(), "BOX_GRP_CD"); }
    protected abstract ConditionValue xgetCValueBoxGrpCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_Equal(String boxGrpNm) {
        doSetBoxGrpNm_Equal(fRES(boxGrpNm));
    }

    protected void doSetBoxGrpNm_Equal(String boxGrpNm) {
        regBoxGrpNm(CK_EQ, boxGrpNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_NotEqual(String boxGrpNm) {
        doSetBoxGrpNm_NotEqual(fRES(boxGrpNm));
    }

    protected void doSetBoxGrpNm_NotEqual(String boxGrpNm) {
        regBoxGrpNm(CK_NES, boxGrpNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_GreaterThan(String boxGrpNm) {
        regBoxGrpNm(CK_GT, fRES(boxGrpNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_LessThan(String boxGrpNm) {
        regBoxGrpNm(CK_LT, fRES(boxGrpNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_GreaterEqual(String boxGrpNm) {
        regBoxGrpNm(CK_GE, fRES(boxGrpNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_LessEqual(String boxGrpNm) {
        regBoxGrpNm(CK_LE, fRES(boxGrpNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNmList The collection of boxGrpNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_InScope(Collection<String> boxGrpNmList) {
        doSetBoxGrpNm_InScope(boxGrpNmList);
    }

    protected void doSetBoxGrpNm_InScope(Collection<String> boxGrpNmList) {
        regINS(CK_INS, cTL(boxGrpNmList), xgetCValueBoxGrpNm(), "BOX_GRP_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNmList The collection of boxGrpNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_NotInScope(Collection<String> boxGrpNmList) {
        doSetBoxGrpNm_NotInScope(boxGrpNmList);
    }

    protected void doSetBoxGrpNm_NotInScope(Collection<String> boxGrpNmList) {
        regINS(CK_NINS, cTL(boxGrpNmList), xgetCValueBoxGrpNm(), "BOX_GRP_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)} <br>
     * <pre>e.g. setBoxGrpNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxGrpNm The value of boxGrpNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxGrpNm_LikeSearch(String boxGrpNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxGrpNm), xgetCValueBoxGrpNm(), "BOX_GRP_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxGrpNm_NotLikeSearch(String boxGrpNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxGrpNm), xgetCValueBoxGrpNm(), "BOX_GRP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @param boxGrpNm The value of boxGrpNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxGrpNm_PrefixSearch(String boxGrpNm) {
        setBoxGrpNm_LikeSearch(boxGrpNm, xcLSOPPre());
    }

    protected void regBoxGrpNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxGrpNm(), "BOX_GRP_NM"); }
    protected abstract ConditionValue xgetCValueBoxGrpNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxId The value of standardBoxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStandardBoxId_Equal(Long standardBoxId) {
        doSetStandardBoxId_Equal(standardBoxId);
    }

    protected void doSetStandardBoxId_Equal(Long standardBoxId) {
        regStandardBoxId(CK_EQ, standardBoxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxId The value of standardBoxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStandardBoxId_NotEqual(Long standardBoxId) {
        doSetStandardBoxId_NotEqual(standardBoxId);
    }

    protected void doSetStandardBoxId_NotEqual(Long standardBoxId) {
        regStandardBoxId(CK_NES, standardBoxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxId The value of standardBoxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStandardBoxId_GreaterThan(Long standardBoxId) {
        regStandardBoxId(CK_GT, standardBoxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxId The value of standardBoxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStandardBoxId_LessThan(Long standardBoxId) {
        regStandardBoxId(CK_LT, standardBoxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxId The value of standardBoxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStandardBoxId_GreaterEqual(Long standardBoxId) {
        regStandardBoxId(CK_GE, standardBoxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxId The value of standardBoxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStandardBoxId_LessEqual(Long standardBoxId) {
        regStandardBoxId(CK_LE, standardBoxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param minNumber The min number of standardBoxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of standardBoxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStandardBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStandardBoxId(), "STANDARD_BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxIdList The collection of standardBoxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStandardBoxId_InScope(Collection<Long> standardBoxIdList) {
        doSetStandardBoxId_InScope(standardBoxIdList);
    }

    protected void doSetStandardBoxId_InScope(Collection<Long> standardBoxIdList) {
        regINS(CK_INS, cTL(standardBoxIdList), xgetCValueStandardBoxId(), "STANDARD_BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @param standardBoxIdList The collection of standardBoxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStandardBoxId_NotInScope(Collection<Long> standardBoxIdList) {
        doSetStandardBoxId_NotInScope(standardBoxIdList);
    }

    protected void doSetStandardBoxId_NotInScope(Collection<Long> standardBoxIdList) {
        regINS(CK_NINS, cTL(standardBoxIdList), xgetCValueStandardBoxId(), "STANDARD_BOX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STANDARD_BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my STANDARD_BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'in-scope'. (NotNull)
     */
    public void inScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStandardBoxId_InScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "STANDARD_BOX_ID", "BOX_ID", pp, "mBox", false);
    }
    public abstract String keepStandardBoxId_InScopeRelation_MBox(MBoxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STANDARD_BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my STANDARD_BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStandardBoxId_NotInScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "STANDARD_BOX_ID", "BOX_ID", pp, "mBox", true);
    }
    public abstract String keepStandardBoxId_NotInScopeRelation_MBox(MBoxCQ sq);

    protected void regStandardBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStandardBoxId(), "STANDARD_BOX_ID"); }
    protected abstract ConditionValue xgetCValueStandardBoxId();

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
    public HpSLCFunction<MBoxGrpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MBoxGrpCB.class);
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
    public HpSLCFunction<MBoxGrpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MBoxGrpCB.class);
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
    public HpSLCFunction<MBoxGrpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MBoxGrpCB.class);
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
    public HpSLCFunction<MBoxGrpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MBoxGrpCB.class);
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
    public HpSLCFunction<MBoxGrpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MBoxGrpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MBoxGrpCB&gt;() {
     *     public void query(MBoxGrpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MBoxGrpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MBoxGrpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MBoxGrpCQ sq);

    protected MBoxGrpCB xcreateScalarConditionCB() {
        MBoxGrpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MBoxGrpCB xcreateScalarConditionPartitionByCB() {
        MBoxGrpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MBoxGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BOX_GRP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MBoxGrpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MBoxGrpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MBoxGrpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BOX_GRP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MBoxGrpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MBoxGrpCQ sq);

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
    protected MBoxGrpCB newMyCB() {
        return new MBoxGrpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MBoxGrpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of M_CENTER_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCenterClassDtlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCenterClassDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CENTER_CLASS_DTL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlId The value of centerClassDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_Equal(Long centerClassDtlId) {
        doSetCenterClassDtlId_Equal(centerClassDtlId);
    }

    protected void doSetCenterClassDtlId_Equal(Long centerClassDtlId) {
        regCenterClassDtlId(CK_EQ, centerClassDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlId The value of centerClassDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_NotEqual(Long centerClassDtlId) {
        doSetCenterClassDtlId_NotEqual(centerClassDtlId);
    }

    protected void doSetCenterClassDtlId_NotEqual(Long centerClassDtlId) {
        regCenterClassDtlId(CK_NES, centerClassDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlId The value of centerClassDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_GreaterThan(Long centerClassDtlId) {
        regCenterClassDtlId(CK_GT, centerClassDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlId The value of centerClassDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_LessThan(Long centerClassDtlId) {
        regCenterClassDtlId(CK_LT, centerClassDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlId The value of centerClassDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_GreaterEqual(Long centerClassDtlId) {
        regCenterClassDtlId(CK_GE, centerClassDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlId The value of centerClassDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_LessEqual(Long centerClassDtlId) {
        regCenterClassDtlId(CK_LE, centerClassDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of centerClassDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerClassDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterClassDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlIdList The collection of centerClassDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_InScope(Collection<Long> centerClassDtlIdList) {
        doSetCenterClassDtlId_InScope(centerClassDtlIdList);
    }

    protected void doSetCenterClassDtlId_InScope(Collection<Long> centerClassDtlIdList) {
        regINS(CK_INS, cTL(centerClassDtlIdList), xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassDtlIdList The collection of centerClassDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_NotInScope(Collection<Long> centerClassDtlIdList) {
        doSetCenterClassDtlId_NotInScope(centerClassDtlIdList);
    }

    protected void doSetCenterClassDtlId_NotInScope(Collection<Long> centerClassDtlIdList) {
        regINS(CK_NINS, cTL(centerClassDtlIdList), xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_CLASS_DTL_ID from M_CENTER_CLASS_DTL_SUB where ...)} <br>
     * M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterClassDtlSubAsOne</span>(subCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     subCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterClassDtlSubAsOne for 'exists'. (NotNull)
     */
    public void existsMCenterClassDtlSubAsOne(SubQuery<MCenterClassDtlSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassDtlSubCB cb = new MCenterClassDtlSubCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterClassDtlId_ExistsReferrer_MCenterClassDtlSubAsOne(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassDtlSubAsOne");
    }
    public abstract String keepCenterClassDtlId_ExistsReferrer_MCenterClassDtlSubAsOne(MCenterClassDtlSubCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_CLASS_DTL_ID from M_CENTER_CLASS_GRP_DTL where ...)} <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterClassGrpDtlList for 'exists'. (NotNull)
     */
    public void existsMCenterClassGrpDtlList(SubQuery<MCenterClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterClassDtlId_ExistsReferrer_MCenterClassGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassGrpDtlList");
    }
    public abstract String keepCenterClassDtlId_ExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_CLASS_DTL_ID from M_CENTER_CLASS_DTL_SUB where ...)} <br>
     * M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterClassDtlSubAsOne</span>(subCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     subCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMCenterClassDtlSubAsOne(SubQuery<MCenterClassDtlSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassDtlSubCB cb = new MCenterClassDtlSubCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassDtlSubAsOne");
    }
    public abstract String keepCenterClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne(MCenterClassDtlSubCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_CLASS_DTL_ID from M_CENTER_CLASS_GRP_DTL where ...)} <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterClassGrpDtlList(SubQuery<MCenterClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassGrpDtlList");
    }
    public abstract String keepCenterClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);

    public void xsderiveMCenterClassGrpDtlList(String fn, SubQuery<MCenterClassGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterClassDtlId_SpecifyDerivedReferrer_MCenterClassGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassGrpDtlList", al, op);
    }
    public abstract String keepCenterClassDtlId_SpecifyDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_CLASS_GRP_DTL where ...)} <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterClassGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterClassGrpDtlCB> derivedMCenterClassGrpDtlList() {
        return xcreateQDRFunctionMCenterClassGrpDtlList();
    }
    protected HpQDRFunction<MCenterClassGrpDtlCB> xcreateQDRFunctionMCenterClassGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterClassGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterClassGrpDtlList(String fn, SubQuery<MCenterClassGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList(cb.query()); String prpp = keepCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", sqpp, "mCenterClassGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);
    public abstract String keepCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterClassDtlId_IsNull() { regCenterClassDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterClassDtlId_IsNotNull() { regCenterClassDtlId(CK_ISNN, DOBJ); }

    protected void regCenterClassDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID"); }
    protected abstract ConditionValue xgetCValueCenterClassDtlId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_Equal(Long centerClassId) {
        doSetCenterClassId_Equal(centerClassId);
    }

    protected void doSetCenterClassId_Equal(Long centerClassId) {
        regCenterClassId(CK_EQ, centerClassId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_NotEqual(Long centerClassId) {
        doSetCenterClassId_NotEqual(centerClassId);
    }

    protected void doSetCenterClassId_NotEqual(Long centerClassId) {
        regCenterClassId(CK_NES, centerClassId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_GreaterThan(Long centerClassId) {
        regCenterClassId(CK_GT, centerClassId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_LessThan(Long centerClassId) {
        regCenterClassId(CK_LT, centerClassId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_GreaterEqual(Long centerClassId) {
        regCenterClassId(CK_GE, centerClassId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_LessEqual(Long centerClassId) {
        regCenterClassId(CK_LE, centerClassId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param minNumber The min number of centerClassId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerClassId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterClassId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterClassId(), "CENTER_CLASS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassIdList The collection of centerClassId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassId_InScope(Collection<Long> centerClassIdList) {
        doSetCenterClassId_InScope(centerClassIdList);
    }

    protected void doSetCenterClassId_InScope(Collection<Long> centerClassIdList) {
        regINS(CK_INS, cTL(centerClassIdList), xgetCValueCenterClassId(), "CENTER_CLASS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassIdList The collection of centerClassId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassId_NotInScope(Collection<Long> centerClassIdList) {
        doSetCenterClassId_NotInScope(centerClassIdList);
    }

    protected void doSetCenterClassId_NotInScope(Collection<Long> centerClassIdList) {
        regINS(CK_NINS, cTL(centerClassIdList), xgetCValueCenterClassId(), "CENTER_CLASS_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_CLASS_ID from M_CENTER_CLASS where ...)} <br />
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @param subCBLambda The callback for sub-query of MCenterClass for 'in-scope'. (NotNull)
     */
    public void inScopeMCenterClass(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterClassId_InScopeRelation_MCenterClass(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_CLASS_ID", "CENTER_CLASS_ID", pp, "mCenterClass", false);
    }
    public abstract String keepCenterClassId_InScopeRelation_MCenterClass(MCenterClassCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_CLASS_ID from M_CENTER_CLASS where ...)} <br />
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @param subCBLambda The callback for sub-query of MCenterClass for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenterClass(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterClassId_NotInScopeRelation_MCenterClass(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_CLASS_ID", "CENTER_CLASS_ID", pp, "mCenterClass", true);
    }
    public abstract String keepCenterClassId_NotInScopeRelation_MCenterClass(MCenterClassCQ sq);

    protected void regCenterClassId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterClassId(), "CENTER_CLASS_ID"); }
    protected abstract ConditionValue xgetCValueCenterClassId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_Equal(String classDtlCd) {
        doSetClassDtlCd_Equal(fRES(classDtlCd));
    }

    protected void doSetClassDtlCd_Equal(String classDtlCd) {
        regClassDtlCd(CK_EQ, classDtlCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_NotEqual(String classDtlCd) {
        doSetClassDtlCd_NotEqual(fRES(classDtlCd));
    }

    protected void doSetClassDtlCd_NotEqual(String classDtlCd) {
        regClassDtlCd(CK_NES, classDtlCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_GreaterThan(String classDtlCd) {
        regClassDtlCd(CK_GT, fRES(classDtlCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_LessThan(String classDtlCd) {
        regClassDtlCd(CK_LT, fRES(classDtlCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_GreaterEqual(String classDtlCd) {
        regClassDtlCd(CK_GE, fRES(classDtlCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_LessEqual(String classDtlCd) {
        regClassDtlCd(CK_LE, fRES(classDtlCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCdList The collection of classDtlCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_InScope(Collection<String> classDtlCdList) {
        doSetClassDtlCd_InScope(classDtlCdList);
    }

    protected void doSetClassDtlCd_InScope(Collection<String> classDtlCdList) {
        regINS(CK_INS, cTL(classDtlCdList), xgetCValueClassDtlCd(), "CLASS_DTL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCdList The collection of classDtlCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_NotInScope(Collection<String> classDtlCdList) {
        doSetClassDtlCd_NotInScope(classDtlCdList);
    }

    protected void doSetClassDtlCd_NotInScope(Collection<String> classDtlCdList) {
        regINS(CK_NINS, cTL(classDtlCdList), xgetCValueClassDtlCd(), "CLASS_DTL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setClassDtlCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classDtlCd The value of classDtlCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassDtlCd_LikeSearch(String classDtlCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classDtlCd), xgetCValueClassDtlCd(), "CLASS_DTL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassDtlCd_NotLikeSearch(String classDtlCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classDtlCd), xgetCValueClassDtlCd(), "CLASS_DTL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_PrefixSearch(String classDtlCd) {
        setClassDtlCd_LikeSearch(classDtlCd, xcLSOPPre());
    }

    protected void regClassDtlCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassDtlCd(), "CLASS_DTL_CD"); }
    protected abstract ConditionValue xgetCValueClassDtlCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_Equal(Long dictId) {
        doSetDictId_Equal(dictId);
    }

    protected void doSetDictId_Equal(Long dictId) {
        regDictId(CK_EQ, dictId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_NotEqual(Long dictId) {
        doSetDictId_NotEqual(dictId);
    }

    protected void doSetDictId_NotEqual(Long dictId) {
        regDictId(CK_NES, dictId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_InScope(Collection<Long> dictIdList) {
        doSetDictId_InScope(dictIdList);
    }

    protected void doSetDictId_InScope(Collection<Long> dictIdList) {
        regINS(CK_INS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_NotInScope(Collection<Long> dictIdList) {
        doSetDictId_NotInScope(dictIdList);
    }

    protected void doSetDictId_NotInScope(Collection<Long> dictIdList) {
        regINS(CK_NINS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'in-scope'. (NotNull)
     */
    public void inScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_InScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", false);
    }
    public abstract String keepDictId_InScopeRelation_BDict(BDictCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'not in-scope'. (NotNull)
     */
    public void notInScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_NotInScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", true);
    }
    public abstract String keepDictId_NotInScopeRelation_BDict(BDictCQ sq);

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_Equal(Long viewOrder) {
        doSetViewOrder_Equal(viewOrder);
    }

    protected void doSetViewOrder_Equal(Long viewOrder) {
        regViewOrder(CK_EQ, viewOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_NotEqual(Long viewOrder) {
        doSetViewOrder_NotEqual(viewOrder);
    }

    protected void doSetViewOrder_NotEqual(Long viewOrder) {
        regViewOrder(CK_NES, viewOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_GreaterThan(Long viewOrder) {
        regViewOrder(CK_GT, viewOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_LessThan(Long viewOrder) {
        regViewOrder(CK_LT, viewOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_GreaterEqual(Long viewOrder) {
        regViewOrder(CK_GE, viewOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_LessEqual(Long viewOrder) {
        regViewOrder(CK_LE, viewOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param minNumber The min number of viewOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of viewOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setViewOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueViewOrder(), "VIEW_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrderList The collection of viewOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setViewOrder_InScope(Collection<Long> viewOrderList) {
        doSetViewOrder_InScope(viewOrderList);
    }

    protected void doSetViewOrder_InScope(Collection<Long> viewOrderList) {
        regINS(CK_INS, cTL(viewOrderList), xgetCValueViewOrder(), "VIEW_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrderList The collection of viewOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setViewOrder_NotInScope(Collection<Long> viewOrderList) {
        doSetViewOrder_NotInScope(viewOrderList);
    }

    protected void doSetViewOrder_NotInScope(Collection<Long> viewOrderList) {
        regINS(CK_NINS, cTL(viewOrderList), xgetCValueViewOrder(), "VIEW_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     */
    public void setViewOrder_IsNull() { regViewOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     */
    public void setViewOrder_IsNotNull() { regViewOrder(CK_ISNN, DOBJ); }

    protected void regViewOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueViewOrder(), "VIEW_ORDER"); }
    protected abstract ConditionValue xgetCValueViewOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_Equal(String defaultFlg) {
        doSetDefaultFlg_Equal(fRES(defaultFlg));
    }

    protected void doSetDefaultFlg_Equal(String defaultFlg) {
        regDefaultFlg(CK_EQ, defaultFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_NotEqual(String defaultFlg) {
        doSetDefaultFlg_NotEqual(fRES(defaultFlg));
    }

    protected void doSetDefaultFlg_NotEqual(String defaultFlg) {
        regDefaultFlg(CK_NES, defaultFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_GreaterThan(String defaultFlg) {
        regDefaultFlg(CK_GT, fRES(defaultFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_LessThan(String defaultFlg) {
        regDefaultFlg(CK_LT, fRES(defaultFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_GreaterEqual(String defaultFlg) {
        regDefaultFlg(CK_GE, fRES(defaultFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_LessEqual(String defaultFlg) {
        regDefaultFlg(CK_LE, fRES(defaultFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlgList The collection of defaultFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_InScope(Collection<String> defaultFlgList) {
        doSetDefaultFlg_InScope(defaultFlgList);
    }

    protected void doSetDefaultFlg_InScope(Collection<String> defaultFlgList) {
        regINS(CK_INS, cTL(defaultFlgList), xgetCValueDefaultFlg(), "DEFAULT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlgList The collection of defaultFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_NotInScope(Collection<String> defaultFlgList) {
        doSetDefaultFlg_NotInScope(defaultFlgList);
    }

    protected void doSetDefaultFlg_NotInScope(Collection<String> defaultFlgList) {
        regINS(CK_NINS, cTL(defaultFlgList), xgetCValueDefaultFlg(), "DEFAULT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setDefaultFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defaultFlg The value of defaultFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefaultFlg_LikeSearch(String defaultFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defaultFlg), xgetCValueDefaultFlg(), "DEFAULT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefaultFlg_NotLikeSearch(String defaultFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defaultFlg), xgetCValueDefaultFlg(), "DEFAULT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_PrefixSearch(String defaultFlg) {
        setDefaultFlg_LikeSearch(defaultFlg, xcLSOPPre());
    }

    protected void regDefaultFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultFlg(), "DEFAULT_FLG"); }
    protected abstract ConditionValue xgetCValueDefaultFlg();

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
    public HpSLCFunction<MCenterClassDtlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCenterClassDtlCB.class);
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
    public HpSLCFunction<MCenterClassDtlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCenterClassDtlCB.class);
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
    public HpSLCFunction<MCenterClassDtlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCenterClassDtlCB.class);
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
    public HpSLCFunction<MCenterClassDtlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCenterClassDtlCB.class);
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
    public HpSLCFunction<MCenterClassDtlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCenterClassDtlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCenterClassDtlCB&gt;() {
     *     public void query(MCenterClassDtlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterClassDtlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCenterClassDtlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassDtlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCenterClassDtlCQ sq);

    protected MCenterClassDtlCB xcreateScalarConditionCB() {
        MCenterClassDtlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCenterClassDtlCB xcreateScalarConditionPartitionByCB() {
        MCenterClassDtlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCenterClassDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassDtlCB cb = new MCenterClassDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_CLASS_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCenterClassDtlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCenterClassDtlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCenterClassDtlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassDtlCB cb = new MCenterClassDtlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_CLASS_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCenterClassDtlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCenterClassDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassDtlCB cb = new MCenterClassDtlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCenterClassDtlCQ sq);

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
    protected MCenterClassDtlCB newMyCB() {
        return new MCenterClassDtlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCenterClassDtlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

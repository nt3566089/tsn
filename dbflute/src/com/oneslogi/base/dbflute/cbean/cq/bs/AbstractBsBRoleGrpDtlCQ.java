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
 * The abstract condition-query of B_ROLE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBRoleGrpDtlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBRoleGrpDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_ROLE_GRP_DTL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlId The value of roleGrpDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_Equal(Long roleGrpDtlId) {
        doSetRoleGrpDtlId_Equal(roleGrpDtlId);
    }

    protected void doSetRoleGrpDtlId_Equal(Long roleGrpDtlId) {
        regRoleGrpDtlId(CK_EQ, roleGrpDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlId The value of roleGrpDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_NotEqual(Long roleGrpDtlId) {
        doSetRoleGrpDtlId_NotEqual(roleGrpDtlId);
    }

    protected void doSetRoleGrpDtlId_NotEqual(Long roleGrpDtlId) {
        regRoleGrpDtlId(CK_NES, roleGrpDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlId The value of roleGrpDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_GreaterThan(Long roleGrpDtlId) {
        regRoleGrpDtlId(CK_GT, roleGrpDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlId The value of roleGrpDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_LessThan(Long roleGrpDtlId) {
        regRoleGrpDtlId(CK_LT, roleGrpDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlId The value of roleGrpDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_GreaterEqual(Long roleGrpDtlId) {
        regRoleGrpDtlId(CK_GE, roleGrpDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlId The value of roleGrpDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_LessEqual(Long roleGrpDtlId) {
        regRoleGrpDtlId(CK_LE, roleGrpDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of roleGrpDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleGrpDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleGrpDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleGrpDtlId(), "ROLE_GRP_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlIdList The collection of roleGrpDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_InScope(Collection<Long> roleGrpDtlIdList) {
        doSetRoleGrpDtlId_InScope(roleGrpDtlIdList);
    }

    protected void doSetRoleGrpDtlId_InScope(Collection<Long> roleGrpDtlIdList) {
        regINS(CK_INS, cTL(roleGrpDtlIdList), xgetCValueRoleGrpDtlId(), "ROLE_GRP_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpDtlIdList The collection of roleGrpDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpDtlId_NotInScope(Collection<Long> roleGrpDtlIdList) {
        doSetRoleGrpDtlId_NotInScope(roleGrpDtlIdList);
    }

    protected void doSetRoleGrpDtlId_NotInScope(Collection<Long> roleGrpDtlIdList) {
        regINS(CK_NINS, cTL(roleGrpDtlIdList), xgetCValueRoleGrpDtlId(), "ROLE_GRP_DTL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRoleGrpDtlId_IsNull() { regRoleGrpDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRoleGrpDtlId_IsNotNull() { regRoleGrpDtlId(CK_ISNN, DOBJ); }

    protected void regRoleGrpDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleGrpDtlId(), "ROLE_GRP_DTL_ID"); }
    protected abstract ConditionValue xgetCValueRoleGrpDtlId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpId The value of roleGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_Equal(Long roleGrpId) {
        doSetRoleGrpId_Equal(roleGrpId);
    }

    protected void doSetRoleGrpId_Equal(Long roleGrpId) {
        regRoleGrpId(CK_EQ, roleGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpId The value of roleGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_NotEqual(Long roleGrpId) {
        doSetRoleGrpId_NotEqual(roleGrpId);
    }

    protected void doSetRoleGrpId_NotEqual(Long roleGrpId) {
        regRoleGrpId(CK_NES, roleGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpId The value of roleGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_GreaterThan(Long roleGrpId) {
        regRoleGrpId(CK_GT, roleGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpId The value of roleGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_LessThan(Long roleGrpId) {
        regRoleGrpId(CK_LT, roleGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpId The value of roleGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_GreaterEqual(Long roleGrpId) {
        regRoleGrpId(CK_GE, roleGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpId The value of roleGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_LessEqual(Long roleGrpId) {
        regRoleGrpId(CK_LE, roleGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param minNumber The min number of roleGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleGrpId(), "ROLE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpIdList The collection of roleGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpId_InScope(Collection<Long> roleGrpIdList) {
        doSetRoleGrpId_InScope(roleGrpIdList);
    }

    protected void doSetRoleGrpId_InScope(Collection<Long> roleGrpIdList) {
        regINS(CK_INS, cTL(roleGrpIdList), xgetCValueRoleGrpId(), "ROLE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @param roleGrpIdList The collection of roleGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpId_NotInScope(Collection<Long> roleGrpIdList) {
        doSetRoleGrpId_NotInScope(roleGrpIdList);
    }

    protected void doSetRoleGrpId_NotInScope(Collection<Long> roleGrpIdList) {
        regINS(CK_NINS, cTL(roleGrpIdList), xgetCValueRoleGrpId(), "ROLE_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ROLE_GRP_ID from B_ROLE_GRP where ...)} <br />
     * B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @param subCBLambda The callback for sub-query of BRoleGrp for 'in-scope'. (NotNull)
     */
    public void inScopeBRoleGrp(SubQuery<BRoleGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRoleGrpId_InScopeRelation_BRoleGrp(cb.query());
        registerInScopeRelation(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrp", false);
    }
    public abstract String keepRoleGrpId_InScopeRelation_BRoleGrp(BRoleGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ROLE_GRP_ID from B_ROLE_GRP where ...)} <br />
     * B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @param subCBLambda The callback for sub-query of BRoleGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeBRoleGrp(SubQuery<BRoleGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRoleGrpId_NotInScopeRelation_BRoleGrp(cb.query());
        registerInScopeRelation(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrp", true);
    }
    public abstract String keepRoleGrpId_NotInScopeRelation_BRoleGrp(BRoleGrpCQ sq);

    protected void regRoleGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleGrpId(), "ROLE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueRoleGrpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_Equal(Long roleId) {
        doSetRoleId_Equal(roleId);
    }

    protected void doSetRoleId_Equal(Long roleId) {
        regRoleId(CK_EQ, roleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_NotEqual(Long roleId) {
        doSetRoleId_NotEqual(roleId);
    }

    protected void doSetRoleId_NotEqual(Long roleId) {
        regRoleId(CK_NES, roleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_GreaterThan(Long roleId) {
        regRoleId(CK_GT, roleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_LessThan(Long roleId) {
        regRoleId(CK_LT, roleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_GreaterEqual(Long roleId) {
        regRoleId(CK_GE, roleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_LessEqual(Long roleId) {
        regRoleId(CK_LE, roleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param minNumber The min number of roleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleId(), "ROLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleIdList The collection of roleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleId_InScope(Collection<Long> roleIdList) {
        doSetRoleId_InScope(roleIdList);
    }

    protected void doSetRoleId_InScope(Collection<Long> roleIdList) {
        regINS(CK_INS, cTL(roleIdList), xgetCValueRoleId(), "ROLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleIdList The collection of roleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleId_NotInScope(Collection<Long> roleIdList) {
        doSetRoleId_NotInScope(roleIdList);
    }

    protected void doSetRoleId_NotInScope(Collection<Long> roleIdList) {
        regINS(CK_NINS, cTL(roleIdList), xgetCValueRoleId(), "ROLE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ROLE_ID from B_ROLE where ...)} <br />
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @param subCBLambda The callback for sub-query of BRole for 'in-scope'. (NotNull)
     */
    public void inScopeBRole(SubQuery<BRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleCB cb = new BRoleCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRoleId_InScopeRelation_BRole(cb.query());
        registerInScopeRelation(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bRole", false);
    }
    public abstract String keepRoleId_InScopeRelation_BRole(BRoleCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ROLE_ID from B_ROLE where ...)} <br />
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @param subCBLambda The callback for sub-query of BRole for 'not in-scope'. (NotNull)
     */
    public void notInScopeBRole(SubQuery<BRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleCB cb = new BRoleCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRoleId_NotInScopeRelation_BRole(cb.query());
        registerInScopeRelation(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bRole", true);
    }
    public abstract String keepRoleId_NotInScopeRelation_BRole(BRoleCQ sq);

    protected void regRoleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleId(), "ROLE_ID"); }
    protected abstract ConditionValue xgetCValueRoleId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrder The value of applyOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setApplyOrder_Equal(Long applyOrder) {
        doSetApplyOrder_Equal(applyOrder);
    }

    protected void doSetApplyOrder_Equal(Long applyOrder) {
        regApplyOrder(CK_EQ, applyOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrder The value of applyOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setApplyOrder_NotEqual(Long applyOrder) {
        doSetApplyOrder_NotEqual(applyOrder);
    }

    protected void doSetApplyOrder_NotEqual(Long applyOrder) {
        regApplyOrder(CK_NES, applyOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrder The value of applyOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setApplyOrder_GreaterThan(Long applyOrder) {
        regApplyOrder(CK_GT, applyOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrder The value of applyOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setApplyOrder_LessThan(Long applyOrder) {
        regApplyOrder(CK_LT, applyOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrder The value of applyOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setApplyOrder_GreaterEqual(Long applyOrder) {
        regApplyOrder(CK_GE, applyOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrder The value of applyOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setApplyOrder_LessEqual(Long applyOrder) {
        regApplyOrder(CK_LE, applyOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of applyOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of applyOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setApplyOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueApplyOrder(), "APPLY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrderList The collection of applyOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApplyOrder_InScope(Collection<Long> applyOrderList) {
        doSetApplyOrder_InScope(applyOrderList);
    }

    protected void doSetApplyOrder_InScope(Collection<Long> applyOrderList) {
        regINS(CK_INS, cTL(applyOrderList), xgetCValueApplyOrder(), "APPLY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @param applyOrderList The collection of applyOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApplyOrder_NotInScope(Collection<Long> applyOrderList) {
        doSetApplyOrder_NotInScope(applyOrderList);
    }

    protected void doSetApplyOrder_NotInScope(Collection<Long> applyOrderList) {
        regINS(CK_NINS, cTL(applyOrderList), xgetCValueApplyOrder(), "APPLY_ORDER");
    }

    protected void regApplyOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApplyOrder(), "APPLY_ORDER"); }
    protected abstract ConditionValue xgetCValueApplyOrder();

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
    public HpSLCFunction<BRoleGrpDtlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BRoleGrpDtlCB.class);
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
    public HpSLCFunction<BRoleGrpDtlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BRoleGrpDtlCB.class);
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
    public HpSLCFunction<BRoleGrpDtlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BRoleGrpDtlCB.class);
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
    public HpSLCFunction<BRoleGrpDtlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BRoleGrpDtlCB.class);
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
    public HpSLCFunction<BRoleGrpDtlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BRoleGrpDtlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BRoleGrpDtlCB&gt;() {
     *     public void query(BRoleGrpDtlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BRoleGrpDtlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BRoleGrpDtlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpDtlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BRoleGrpDtlCQ sq);

    protected BRoleGrpDtlCB xcreateScalarConditionCB() {
        BRoleGrpDtlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BRoleGrpDtlCB xcreateScalarConditionPartitionByCB() {
        BRoleGrpDtlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BRoleGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ROLE_GRP_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BRoleGrpDtlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BRoleGrpDtlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BRoleGrpDtlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ROLE_GRP_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BRoleGrpDtlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BRoleGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BRoleGrpDtlCQ sq);

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
    protected BRoleGrpDtlCB newMyCB() {
        return new BRoleGrpDtlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BRoleGrpDtlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

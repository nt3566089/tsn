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
 * The abstract condition-query of B_SCREEN_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBScreenRoleCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBScreenRoleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_SCREEN_ROLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleId The value of screenRoleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenRoleId_Equal(Long screenRoleId) {
        doSetScreenRoleId_Equal(screenRoleId);
    }

    protected void doSetScreenRoleId_Equal(Long screenRoleId) {
        regScreenRoleId(CK_EQ, screenRoleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleId The value of screenRoleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenRoleId_NotEqual(Long screenRoleId) {
        doSetScreenRoleId_NotEqual(screenRoleId);
    }

    protected void doSetScreenRoleId_NotEqual(Long screenRoleId) {
        regScreenRoleId(CK_NES, screenRoleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleId The value of screenRoleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenRoleId_GreaterThan(Long screenRoleId) {
        regScreenRoleId(CK_GT, screenRoleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleId The value of screenRoleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenRoleId_LessThan(Long screenRoleId) {
        regScreenRoleId(CK_LT, screenRoleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleId The value of screenRoleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenRoleId_GreaterEqual(Long screenRoleId) {
        regScreenRoleId(CK_GE, screenRoleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleId The value of screenRoleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenRoleId_LessEqual(Long screenRoleId) {
        regScreenRoleId(CK_LE, screenRoleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of screenRoleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of screenRoleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setScreenRoleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScreenRoleId(), "SCREEN_ROLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleIdList The collection of screenRoleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenRoleId_InScope(Collection<Long> screenRoleIdList) {
        doSetScreenRoleId_InScope(screenRoleIdList);
    }

    protected void doSetScreenRoleId_InScope(Collection<Long> screenRoleIdList) {
        regINS(CK_INS, cTL(screenRoleIdList), xgetCValueScreenRoleId(), "SCREEN_ROLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenRoleIdList The collection of screenRoleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenRoleId_NotInScope(Collection<Long> screenRoleIdList) {
        doSetScreenRoleId_NotInScope(screenRoleIdList);
    }

    protected void doSetScreenRoleId_NotInScope(Collection<Long> screenRoleIdList) {
        regINS(CK_NINS, cTL(screenRoleIdList), xgetCValueScreenRoleId(), "SCREEN_ROLE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setScreenRoleId_IsNull() { regScreenRoleId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setScreenRoleId_IsNotNull() { regScreenRoleId(CK_ISNN, DOBJ); }

    protected void regScreenRoleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenRoleId(), "SCREEN_ROLE_ID"); }
    protected abstract ConditionValue xgetCValueScreenRoleId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
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
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
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
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_GreaterThan(Long roleId) {
        regRoleId(CK_GT, roleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_LessThan(Long roleId) {
        regRoleId(CK_LT, roleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_GreaterEqual(Long roleId) {
        regRoleId(CK_GE, roleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param roleId The value of roleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_LessEqual(Long roleId) {
        regRoleId(CK_LE, roleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @param minNumber The min number of roleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleId(), "ROLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
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
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
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
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_Equal(Long screenId) {
        doSetScreenId_Equal(screenId);
    }

    protected void doSetScreenId_Equal(Long screenId) {
        regScreenId(CK_EQ, screenId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_NotEqual(Long screenId) {
        doSetScreenId_NotEqual(screenId);
    }

    protected void doSetScreenId_NotEqual(Long screenId) {
        regScreenId(CK_NES, screenId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterThan(Long screenId) {
        regScreenId(CK_GT, screenId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessThan(Long screenId) {
        regScreenId(CK_LT, screenId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterEqual(Long screenId) {
        regScreenId(CK_GE, screenId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessEqual(Long screenId) {
        regScreenId(CK_LE, screenId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param minNumber The min number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setScreenId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScreenId(), "SCREEN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenIdList The collection of screenId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenId_InScope(Collection<Long> screenIdList) {
        doSetScreenId_InScope(screenIdList);
    }

    protected void doSetScreenId_InScope(Collection<Long> screenIdList) {
        regINS(CK_INS, cTL(screenIdList), xgetCValueScreenId(), "SCREEN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenIdList The collection of screenId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenId_NotInScope(Collection<Long> screenIdList) {
        doSetScreenId_NotInScope(screenIdList);
    }

    protected void doSetScreenId_NotInScope(Collection<Long> screenIdList) {
        regINS(CK_NINS, cTL(screenIdList), xgetCValueScreenId(), "SCREEN_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SCREEN_ID from B_SCREEN where ...)} <br />
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @param subCBLambda The callback for sub-query of BScreen for 'in-scope'. (NotNull)
     */
    public void inScopeBScreen(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepScreenId_InScopeRelation_BScreen(cb.query());
        registerInScopeRelation(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreen", false);
    }
    public abstract String keepScreenId_InScopeRelation_BScreen(BScreenCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SCREEN_ID from B_SCREEN where ...)} <br />
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @param subCBLambda The callback for sub-query of BScreen for 'not in-scope'. (NotNull)
     */
    public void notInScopeBScreen(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepScreenId_NotInScopeRelation_BScreen(cb.query());
        registerInScopeRelation(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreen", true);
    }
    public abstract String keepScreenId_NotInScopeRelation_BScreen(BScreenCQ sq);

    protected void regScreenId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenId(), "SCREEN_ID"); }
    protected abstract ConditionValue xgetCValueScreenId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible}
     * @param visible The value of visible as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_Equal(String visible) {
        doSetVisible_Equal(fRES(visible));
    }

    /**
     * Equal(=). As Visible. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVisible_Equal_AsVisible(CDef.Visible cdef) {
        doSetVisible_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非表示
     */
    public void setVisible_Equal_$0() {
        setVisible_Equal_AsVisible(CDef.Visible.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示
     */
    public void setVisible_Equal_$1() {
        setVisible_Equal_AsVisible(CDef.Visible.$1);
    }

    protected void doSetVisible_Equal(String visible) {
        regVisible(CK_EQ, visible);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible}
     * @param visible The value of visible as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotEqual(String visible) {
        doSetVisible_NotEqual(fRES(visible));
    }

    /**
     * NotEqual(&lt;&gt;). As Visible. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVisible_NotEqual_AsVisible(CDef.Visible cdef) {
        doSetVisible_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非表示
     */
    public void setVisible_NotEqual_$0() {
        setVisible_NotEqual_AsVisible(CDef.Visible.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示
     */
    public void setVisible_NotEqual_$1() {
        setVisible_NotEqual_AsVisible(CDef.Visible.$1);
    }

    protected void doSetVisible_NotEqual(String visible) {
        regVisible(CK_NES, visible);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible}
     * @param visibleList The collection of visible as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope(Collection<String> visibleList) {
        doSetVisible_InScope(visibleList);
    }

    /**
     * InScope {in ('a', 'b')}. As Visible. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope_AsVisible(Collection<CDef.Visible> cdefList) {
        doSetVisible_InScope(cTStrL(cdefList));
    }

    protected void doSetVisible_InScope(Collection<String> visibleList) {
        regINS(CK_INS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible}
     * @param visibleList The collection of visible as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope(Collection<String> visibleList) {
        doSetVisible_NotInScope(visibleList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Visible. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope_AsVisible(Collection<CDef.Visible> cdefList) {
        doSetVisible_NotInScope(cTStrL(cdefList));
    }

    protected void doSetVisible_NotInScope(Collection<String> visibleList) {
        regINS(CK_NINS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    protected void regVisible(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVisible(), "VISIBLE"); }
    protected abstract ConditionValue xgetCValueVisible();

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
    public HpSLCFunction<BScreenRoleCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BScreenRoleCB.class);
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
    public HpSLCFunction<BScreenRoleCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BScreenRoleCB.class);
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
    public HpSLCFunction<BScreenRoleCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BScreenRoleCB.class);
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
    public HpSLCFunction<BScreenRoleCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BScreenRoleCB.class);
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
    public HpSLCFunction<BScreenRoleCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BScreenRoleCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BScreenRoleCB&gt;() {
     *     public void query(BScreenRoleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BScreenRoleCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BScreenRoleCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenRoleCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BScreenRoleCQ sq);

    protected BScreenRoleCB xcreateScalarConditionCB() {
        BScreenRoleCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BScreenRoleCB xcreateScalarConditionPartitionByCB() {
        BScreenRoleCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BScreenRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SCREEN_ROLE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BScreenRoleCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BScreenRoleCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BScreenRoleCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SCREEN_ROLE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BScreenRoleCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BScreenRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BScreenRoleCQ sq);

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
    protected BScreenRoleCB newMyCB() {
        return new BScreenRoleCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BScreenRoleCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

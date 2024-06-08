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
 * The abstract condition-query of B_MENU.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBMenuCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBMenuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_MENU";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuId The value of menuId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuId_Equal(Long menuId) {
        doSetMenuId_Equal(menuId);
    }

    protected void doSetMenuId_Equal(Long menuId) {
        regMenuId(CK_EQ, menuId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuId The value of menuId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuId_NotEqual(Long menuId) {
        doSetMenuId_NotEqual(menuId);
    }

    protected void doSetMenuId_NotEqual(Long menuId) {
        regMenuId(CK_NES, menuId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuId The value of menuId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuId_GreaterThan(Long menuId) {
        regMenuId(CK_GT, menuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuId The value of menuId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuId_LessThan(Long menuId) {
        regMenuId(CK_LT, menuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuId The value of menuId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuId_GreaterEqual(Long menuId) {
        regMenuId(CK_GE, menuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuId The value of menuId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuId_LessEqual(Long menuId) {
        regMenuId(CK_LE, menuId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of menuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of menuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMenuId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMenuId(), "MENU_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuIdList The collection of menuId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuId_InScope(Collection<Long> menuIdList) {
        doSetMenuId_InScope(menuIdList);
    }

    protected void doSetMenuId_InScope(Collection<Long> menuIdList) {
        regINS(CK_INS, cTL(menuIdList), xgetCValueMenuId(), "MENU_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuIdList The collection of menuId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuId_NotInScope(Collection<Long> menuIdList) {
        doSetMenuId_NotInScope(menuIdList);
    }

    protected void doSetMenuId_NotInScope(Collection<Long> menuIdList) {
        regINS(CK_NINS, cTL(menuIdList), xgetCValueMenuId(), "MENU_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMenuId_IsNull() { regMenuId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMenuId_IsNotNull() { regMenuId(CK_ISNN, DOBJ); }

    protected void regMenuId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMenuId(), "MENU_ID"); }
    protected abstract ConditionValue xgetCValueMenuId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpId The value of menuGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_Equal(Long menuGrpId) {
        doSetMenuGrpId_Equal(menuGrpId);
    }

    protected void doSetMenuGrpId_Equal(Long menuGrpId) {
        regMenuGrpId(CK_EQ, menuGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpId The value of menuGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_NotEqual(Long menuGrpId) {
        doSetMenuGrpId_NotEqual(menuGrpId);
    }

    protected void doSetMenuGrpId_NotEqual(Long menuGrpId) {
        regMenuGrpId(CK_NES, menuGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpId The value of menuGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_GreaterThan(Long menuGrpId) {
        regMenuGrpId(CK_GT, menuGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpId The value of menuGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_LessThan(Long menuGrpId) {
        regMenuGrpId(CK_LT, menuGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpId The value of menuGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_GreaterEqual(Long menuGrpId) {
        regMenuGrpId(CK_GE, menuGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpId The value of menuGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_LessEqual(Long menuGrpId) {
        regMenuGrpId(CK_LE, menuGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param minNumber The min number of menuGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of menuGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMenuGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMenuGrpId(), "MENU_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpIdList The collection of menuGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpId_InScope(Collection<Long> menuGrpIdList) {
        doSetMenuGrpId_InScope(menuGrpIdList);
    }

    protected void doSetMenuGrpId_InScope(Collection<Long> menuGrpIdList) {
        regINS(CK_INS, cTL(menuGrpIdList), xgetCValueMenuGrpId(), "MENU_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @param menuGrpIdList The collection of menuGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpId_NotInScope(Collection<Long> menuGrpIdList) {
        doSetMenuGrpId_NotInScope(menuGrpIdList);
    }

    protected void doSetMenuGrpId_NotInScope(Collection<Long> menuGrpIdList) {
        regINS(CK_NINS, cTL(menuGrpIdList), xgetCValueMenuGrpId(), "MENU_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MENU_GRP_ID from B_MENU_GRP where ...)} <br />
     * B_MENU_GRP by my MENU_GRP_ID, named 'BMenuGrp'.
     * @param subCBLambda The callback for sub-query of BMenuGrp for 'in-scope'. (NotNull)
     */
    public void inScopeBMenuGrp(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMenuGrpId_InScopeRelation_BMenuGrp(cb.query());
        registerInScopeRelation(cb.query(), "MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuGrp", false);
    }
    public abstract String keepMenuGrpId_InScopeRelation_BMenuGrp(BMenuGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MENU_GRP_ID from B_MENU_GRP where ...)} <br />
     * B_MENU_GRP by my MENU_GRP_ID, named 'BMenuGrp'.
     * @param subCBLambda The callback for sub-query of BMenuGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeBMenuGrp(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMenuGrpId_NotInScopeRelation_BMenuGrp(cb.query());
        registerInScopeRelation(cb.query(), "MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuGrp", true);
    }
    public abstract String keepMenuGrpId_NotInScopeRelation_BMenuGrp(BMenuGrpCQ sq);

    protected void regMenuGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMenuGrpId(), "MENU_GRP_ID"); }
    protected abstract ConditionValue xgetCValueMenuGrpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
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
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
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
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterThan(Long screenId) {
        regScreenId(CK_GT, screenId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessThan(Long screenId) {
        regScreenId(CK_LT, screenId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterEqual(Long screenId) {
        regScreenId(CK_GE, screenId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessEqual(Long screenId) {
        regScreenId(CK_LE, screenId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @param minNumber The min number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setScreenId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScreenId(), "SCREEN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
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
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     */
    public void setScreenId_IsNull() { regScreenId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     */
    public void setScreenId_IsNotNull() { regScreenId(CK_ISNN, DOBJ); }

    protected void regScreenId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenId(), "SCREEN_ID"); }
    protected abstract ConditionValue xgetCValueScreenId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNull() { regDictId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNotNull() { regDictId(CK_ISNN, DOBJ); }

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_Equal(String urlPath) {
        doSetUrlPath_Equal(fRES(urlPath));
    }

    protected void doSetUrlPath_Equal(String urlPath) {
        regUrlPath(CK_EQ, urlPath);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_NotEqual(String urlPath) {
        doSetUrlPath_NotEqual(fRES(urlPath));
    }

    protected void doSetUrlPath_NotEqual(String urlPath) {
        regUrlPath(CK_NES, urlPath);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_GreaterThan(String urlPath) {
        regUrlPath(CK_GT, fRES(urlPath));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_LessThan(String urlPath) {
        regUrlPath(CK_LT, fRES(urlPath));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_GreaterEqual(String urlPath) {
        regUrlPath(CK_GE, fRES(urlPath));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_LessEqual(String urlPath) {
        regUrlPath(CK_LE, fRES(urlPath));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPathList The collection of urlPath as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_InScope(Collection<String> urlPathList) {
        doSetUrlPath_InScope(urlPathList);
    }

    protected void doSetUrlPath_InScope(Collection<String> urlPathList) {
        regINS(CK_INS, cTL(urlPathList), xgetCValueUrlPath(), "URL_PATH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPathList The collection of urlPath as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_NotInScope(Collection<String> urlPathList) {
        doSetUrlPath_NotInScope(urlPathList);
    }

    protected void doSetUrlPath_NotInScope(Collection<String> urlPathList) {
        regINS(CK_NINS, cTL(urlPathList), xgetCValueUrlPath(), "URL_PATH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL_PATH: {varchar(255)} <br>
     * <pre>e.g. setUrlPath_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param urlPath The value of urlPath as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUrlPath_LikeSearch(String urlPath, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(urlPath), xgetCValueUrlPath(), "URL_PATH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUrlPath_NotLikeSearch(String urlPath, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(urlPath), xgetCValueUrlPath(), "URL_PATH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL_PATH: {varchar(255)}
     * @param urlPath The value of urlPath as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrlPath_PrefixSearch(String urlPath) {
        setUrlPath_LikeSearch(urlPath, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     */
    public void setUrlPath_IsNull() { regUrlPath(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     */
    public void setUrlPath_IsNullOrEmpty() { regUrlPath(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * URL_PATH: {varchar(255)}
     */
    public void setUrlPath_IsNotNull() { regUrlPath(CK_ISNN, DOBJ); }

    protected void regUrlPath(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUrlPath(), "URL_PATH"); }
    protected abstract ConditionValue xgetCValueUrlPath();

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
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @param targetWindow The value of targetWindow as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetWindow_Equal(String targetWindow) {
        doSetTargetWindow_Equal(fRES(targetWindow));
    }

    /**
     * Equal(=). As TargetWindow. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetWindow_Equal_AsTargetWindow(CDef.TargetWindow cdef) {
        doSetTargetWindow_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 同一ウインドウで開く
     */
    public void setTargetWindow_Equal_$0() {
        setTargetWindow_Equal_AsTargetWindow(CDef.TargetWindow.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 別ウインドウを新規で開く
     */
    public void setTargetWindow_Equal_$1() {
        setTargetWindow_Equal_AsTargetWindow(CDef.TargetWindow.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 別ウインドウを同一画面で開く
     */
    public void setTargetWindow_Equal_$2() {
        setTargetWindow_Equal_AsTargetWindow(CDef.TargetWindow.$2);
    }

    protected void doSetTargetWindow_Equal(String targetWindow) {
        regTargetWindow(CK_EQ, targetWindow);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @param targetWindow The value of targetWindow as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetWindow_NotEqual(String targetWindow) {
        doSetTargetWindow_NotEqual(fRES(targetWindow));
    }

    /**
     * NotEqual(&lt;&gt;). As TargetWindow. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetWindow_NotEqual_AsTargetWindow(CDef.TargetWindow cdef) {
        doSetTargetWindow_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 同一ウインドウで開く
     */
    public void setTargetWindow_NotEqual_$0() {
        setTargetWindow_NotEqual_AsTargetWindow(CDef.TargetWindow.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 別ウインドウを新規で開く
     */
    public void setTargetWindow_NotEqual_$1() {
        setTargetWindow_NotEqual_AsTargetWindow(CDef.TargetWindow.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 別ウインドウを同一画面で開く
     */
    public void setTargetWindow_NotEqual_$2() {
        setTargetWindow_NotEqual_AsTargetWindow(CDef.TargetWindow.$2);
    }

    protected void doSetTargetWindow_NotEqual(String targetWindow) {
        regTargetWindow(CK_NES, targetWindow);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @param targetWindowList The collection of targetWindow as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetWindow_InScope(Collection<String> targetWindowList) {
        doSetTargetWindow_InScope(targetWindowList);
    }

    /**
     * InScope {in ('a', 'b')}. As TargetWindow. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetWindow_InScope_AsTargetWindow(Collection<CDef.TargetWindow> cdefList) {
        doSetTargetWindow_InScope(cTStrL(cdefList));
    }

    protected void doSetTargetWindow_InScope(Collection<String> targetWindowList) {
        regINS(CK_INS, cTL(targetWindowList), xgetCValueTargetWindow(), "TARGET_WINDOW");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @param targetWindowList The collection of targetWindow as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetWindow_NotInScope(Collection<String> targetWindowList) {
        doSetTargetWindow_NotInScope(targetWindowList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TargetWindow. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetWindow_NotInScope_AsTargetWindow(Collection<CDef.TargetWindow> cdefList) {
        doSetTargetWindow_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTargetWindow_NotInScope(Collection<String> targetWindowList) {
        regINS(CK_NINS, cTL(targetWindowList), xgetCValueTargetWindow(), "TARGET_WINDOW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     */
    public void setTargetWindow_IsNull() { regTargetWindow(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     */
    public void setTargetWindow_IsNullOrEmpty() { regTargetWindow(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     */
    public void setTargetWindow_IsNotNull() { regTargetWindow(CK_ISNN, DOBJ); }

    protected void regTargetWindow(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTargetWindow(), "TARGET_WINDOW"); }
    protected abstract ConditionValue xgetCValueTargetWindow();

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
    public HpSLCFunction<BMenuCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BMenuCB.class);
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
    public HpSLCFunction<BMenuCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BMenuCB.class);
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
    public HpSLCFunction<BMenuCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BMenuCB.class);
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
    public HpSLCFunction<BMenuCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BMenuCB.class);
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
    public HpSLCFunction<BMenuCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BMenuCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BMenuCB&gt;() {
     *     public void query(BMenuCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BMenuCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BMenuCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BMenuCQ sq);

    protected BMenuCB xcreateScalarConditionCB() {
        BMenuCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BMenuCB xcreateScalarConditionPartitionByCB() {
        BMenuCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BMenuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuCB cb = new BMenuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MENU_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BMenuCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BMenuCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BMenuCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuCB cb = new BMenuCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MENU_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BMenuCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BMenuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuCB cb = new BMenuCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BMenuCQ sq);

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
    protected BMenuCB newMyCB() {
        return new BMenuCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BMenuCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

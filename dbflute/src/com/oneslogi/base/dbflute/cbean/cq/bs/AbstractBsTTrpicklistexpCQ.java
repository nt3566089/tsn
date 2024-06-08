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
 * The abstract condition-query of T_TRPICKLISTEXP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpicklistexpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpicklistexpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPICKLISTEXP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpId The value of tTrpicklistexpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_Equal(Long tTrpicklistexpId) {
        doSetTTrpicklistexpId_Equal(tTrpicklistexpId);
    }

    protected void doSetTTrpicklistexpId_Equal(Long tTrpicklistexpId) {
        regTTrpicklistexpId(CK_EQ, tTrpicklistexpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpId The value of tTrpicklistexpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_NotEqual(Long tTrpicklistexpId) {
        doSetTTrpicklistexpId_NotEqual(tTrpicklistexpId);
    }

    protected void doSetTTrpicklistexpId_NotEqual(Long tTrpicklistexpId) {
        regTTrpicklistexpId(CK_NES, tTrpicklistexpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpId The value of tTrpicklistexpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_GreaterThan(Long tTrpicklistexpId) {
        regTTrpicklistexpId(CK_GT, tTrpicklistexpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpId The value of tTrpicklistexpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_LessThan(Long tTrpicklistexpId) {
        regTTrpicklistexpId(CK_LT, tTrpicklistexpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpId The value of tTrpicklistexpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_GreaterEqual(Long tTrpicklistexpId) {
        regTTrpicklistexpId(CK_GE, tTrpicklistexpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpId The value of tTrpicklistexpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_LessEqual(Long tTrpicklistexpId) {
        regTTrpicklistexpId(CK_LE, tTrpicklistexpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of tTrpicklistexpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tTrpicklistexpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTTrpicklistexpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTTrpicklistexpId(), "T_TRPICKLISTEXP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpIdList The collection of tTrpicklistexpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_InScope(Collection<Long> tTrpicklistexpIdList) {
        doSetTTrpicklistexpId_InScope(tTrpicklistexpIdList);
    }

    protected void doSetTTrpicklistexpId_InScope(Collection<Long> tTrpicklistexpIdList) {
        regINS(CK_INS, cTL(tTrpicklistexpIdList), xgetCValueTTrpicklistexpId(), "T_TRPICKLISTEXP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @param tTrpicklistexpIdList The collection of tTrpicklistexpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrpicklistexpId_NotInScope(Collection<Long> tTrpicklistexpIdList) {
        doSetTTrpicklistexpId_NotInScope(tTrpicklistexpIdList);
    }

    protected void doSetTTrpicklistexpId_NotInScope(Collection<Long> tTrpicklistexpIdList) {
        regINS(CK_NINS, cTL(tTrpicklistexpIdList), xgetCValueTTrpicklistexpId(), "T_TRPICKLISTEXP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     */
    public void setTTrpicklistexpId_IsNull() { regTTrpicklistexpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     */
    public void setTTrpicklistexpId_IsNotNull() { regTTrpicklistexpId(CK_ISNN, DOBJ); }

    protected void regTTrpicklistexpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTTrpicklistexpId(), "T_TRPICKLISTEXP_ID"); }
    protected abstract ConditionValue xgetCValueTTrpicklistexpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistId The value of tTrpicklistId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistId_Equal(Long tTrpicklistId) {
        doSetTTrpicklistId_Equal(tTrpicklistId);
    }

    protected void doSetTTrpicklistId_Equal(Long tTrpicklistId) {
        regTTrpicklistId(CK_EQ, tTrpicklistId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistId The value of tTrpicklistId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistId_NotEqual(Long tTrpicklistId) {
        doSetTTrpicklistId_NotEqual(tTrpicklistId);
    }

    protected void doSetTTrpicklistId_NotEqual(Long tTrpicklistId) {
        regTTrpicklistId(CK_NES, tTrpicklistId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistId The value of tTrpicklistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistId_GreaterThan(Long tTrpicklistId) {
        regTTrpicklistId(CK_GT, tTrpicklistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistId The value of tTrpicklistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistId_LessThan(Long tTrpicklistId) {
        regTTrpicklistId(CK_LT, tTrpicklistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistId The value of tTrpicklistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistId_GreaterEqual(Long tTrpicklistId) {
        regTTrpicklistId(CK_GE, tTrpicklistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistId The value of tTrpicklistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrpicklistId_LessEqual(Long tTrpicklistId) {
        regTTrpicklistId(CK_LE, tTrpicklistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param minNumber The min number of tTrpicklistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tTrpicklistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTTrpicklistId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTTrpicklistId(), "T_TRPICKLIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistIdList The collection of tTrpicklistId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrpicklistId_InScope(Collection<Long> tTrpicklistIdList) {
        doSetTTrpicklistId_InScope(tTrpicklistIdList);
    }

    protected void doSetTTrpicklistId_InScope(Collection<Long> tTrpicklistIdList) {
        regINS(CK_INS, cTL(tTrpicklistIdList), xgetCValueTTrpicklistId(), "T_TRPICKLIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @param tTrpicklistIdList The collection of tTrpicklistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrpicklistId_NotInScope(Collection<Long> tTrpicklistIdList) {
        doSetTTrpicklistId_NotInScope(tTrpicklistIdList);
    }

    protected void doSetTTrpicklistId_NotInScope(Collection<Long> tTrpicklistIdList) {
        regINS(CK_NINS, cTL(tTrpicklistIdList), xgetCValueTTrpicklistId(), "T_TRPICKLIST_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select T_TRPICKLIST_ID from T_TR_PICKLIST where ...)} <br />
     * T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'.
     * @param subCBLambda The callback for sub-query of TTrPicklist for 'in-scope'. (NotNull)
     */
    public void inScopeTTrPicklist(SubQuery<TTrPicklistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTTrpicklistId_InScopeRelation_TTrPicklist(cb.query());
        registerInScopeRelation(cb.query(), "T_TRPICKLIST_ID", "T_TR_PICKLIST_ID", pp, "tTrPicklist", false);
    }
    public abstract String keepTTrpicklistId_InScopeRelation_TTrPicklist(TTrPicklistCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select T_TRPICKLIST_ID from T_TR_PICKLIST where ...)} <br />
     * T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'.
     * @param subCBLambda The callback for sub-query of TTrPicklist for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrPicklist(SubQuery<TTrPicklistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTTrpicklistId_NotInScopeRelation_TTrPicklist(cb.query());
        registerInScopeRelation(cb.query(), "T_TRPICKLIST_ID", "T_TR_PICKLIST_ID", pp, "tTrPicklist", true);
    }
    public abstract String keepTTrpicklistId_NotInScopeRelation_TTrPicklist(TTrPicklistCQ sq);

    protected void regTTrpicklistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTTrpicklistId(), "T_TRPICKLIST_ID"); }
    protected abstract ConditionValue xgetCValueTTrpicklistId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKey The value of picklistKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistKey_Equal(Long picklistKey) {
        doSetPicklistKey_Equal(picklistKey);
    }

    protected void doSetPicklistKey_Equal(Long picklistKey) {
        regPicklistKey(CK_EQ, picklistKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKey The value of picklistKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistKey_NotEqual(Long picklistKey) {
        doSetPicklistKey_NotEqual(picklistKey);
    }

    protected void doSetPicklistKey_NotEqual(Long picklistKey) {
        regPicklistKey(CK_NES, picklistKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKey The value of picklistKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistKey_GreaterThan(Long picklistKey) {
        regPicklistKey(CK_GT, picklistKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKey The value of picklistKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistKey_LessThan(Long picklistKey) {
        regPicklistKey(CK_LT, picklistKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKey The value of picklistKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistKey_GreaterEqual(Long picklistKey) {
        regPicklistKey(CK_GE, picklistKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKey The value of picklistKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistKey_LessEqual(Long picklistKey) {
        regPicklistKey(CK_LE, picklistKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of picklistKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistKey(), "PICKLIST_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKeyList The collection of picklistKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistKey_InScope(Collection<Long> picklistKeyList) {
        doSetPicklistKey_InScope(picklistKeyList);
    }

    protected void doSetPicklistKey_InScope(Collection<Long> picklistKeyList) {
        regINS(CK_INS, cTL(picklistKeyList), xgetCValuePicklistKey(), "PICKLIST_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @param picklistKeyList The collection of picklistKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistKey_NotInScope(Collection<Long> picklistKeyList) {
        doSetPicklistKey_NotInScope(picklistKeyList);
    }

    protected void doSetPicklistKey_NotInScope(Collection<Long> picklistKeyList) {
        regINS(CK_NINS, cTL(picklistKeyList), xgetCValuePicklistKey(), "PICKLIST_KEY");
    }

    protected void regPicklistKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistKey(), "PICKLIST_KEY"); }
    protected abstract ConditionValue xgetCValuePicklistKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_Equal(Long picklistGNo) {
        doSetPicklistGNo_Equal(picklistGNo);
    }

    protected void doSetPicklistGNo_Equal(Long picklistGNo) {
        regPicklistGNo(CK_EQ, picklistGNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_NotEqual(Long picklistGNo) {
        doSetPicklistGNo_NotEqual(picklistGNo);
    }

    protected void doSetPicklistGNo_NotEqual(Long picklistGNo) {
        regPicklistGNo(CK_NES, picklistGNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_GreaterThan(Long picklistGNo) {
        regPicklistGNo(CK_GT, picklistGNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_LessThan(Long picklistGNo) {
        regPicklistGNo(CK_LT, picklistGNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_GreaterEqual(Long picklistGNo) {
        regPicklistGNo(CK_GE, picklistGNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_LessEqual(Long picklistGNo) {
        regPicklistGNo(CK_LE, picklistGNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of picklistGNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistGNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistGNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistGNo(), "PICKLIST_G_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNoList The collection of picklistGNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistGNo_InScope(Collection<Long> picklistGNoList) {
        doSetPicklistGNo_InScope(picklistGNoList);
    }

    protected void doSetPicklistGNo_InScope(Collection<Long> picklistGNoList) {
        regINS(CK_INS, cTL(picklistGNoList), xgetCValuePicklistGNo(), "PICKLIST_G_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNoList The collection of picklistGNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistGNo_NotInScope(Collection<Long> picklistGNoList) {
        doSetPicklistGNo_NotInScope(picklistGNoList);
    }

    protected void doSetPicklistGNo_NotInScope(Collection<Long> picklistGNoList) {
        regINS(CK_NINS, cTL(picklistGNoList), xgetCValuePicklistGNo(), "PICKLIST_G_NO");
    }

    protected void regPicklistGNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistGNo(), "PICKLIST_G_NO"); }
    protected abstract ConditionValue xgetCValuePicklistGNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCd The value of caseCd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCd_Equal(Long caseCd) {
        doSetCaseCd_Equal(caseCd);
    }

    protected void doSetCaseCd_Equal(Long caseCd) {
        regCaseCd(CK_EQ, caseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCd The value of caseCd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCd_NotEqual(Long caseCd) {
        doSetCaseCd_NotEqual(caseCd);
    }

    protected void doSetCaseCd_NotEqual(Long caseCd) {
        regCaseCd(CK_NES, caseCd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCd The value of caseCd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCd_GreaterThan(Long caseCd) {
        regCaseCd(CK_GT, caseCd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCd The value of caseCd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCd_LessThan(Long caseCd) {
        regCaseCd(CK_LT, caseCd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCd The value of caseCd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCd_GreaterEqual(Long caseCd) {
        regCaseCd(CK_GE, caseCd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCd The value of caseCd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCd_LessEqual(Long caseCd) {
        regCaseCd(CK_LE, caseCd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param minNumber The min number of caseCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseCd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseCd(), "CASE_CD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCdList The collection of caseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCd_InScope(Collection<Long> caseCdList) {
        doSetCaseCd_InScope(caseCdList);
    }

    protected void doSetCaseCd_InScope(Collection<Long> caseCdList) {
        regINS(CK_INS, cTL(caseCdList), xgetCValueCaseCd(), "CASE_CD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @param caseCdList The collection of caseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCd_NotInScope(Collection<Long> caseCdList) {
        doSetCaseCd_NotInScope(caseCdList);
    }

    protected void doSetCaseCd_NotInScope(Collection<Long> caseCdList) {
        regINS(CK_NINS, cTL(caseCdList), xgetCValueCaseCd(), "CASE_CD");
    }

    protected void regCaseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCd(), "CASE_CD"); }
    protected abstract ConditionValue xgetCValueCaseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_Equal(String dummyCaseKbn) {
        doSetDummyCaseKbn_Equal(fRES(dummyCaseKbn));
    }

    protected void doSetDummyCaseKbn_Equal(String dummyCaseKbn) {
        regDummyCaseKbn(CK_EQ, dummyCaseKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_NotEqual(String dummyCaseKbn) {
        doSetDummyCaseKbn_NotEqual(fRES(dummyCaseKbn));
    }

    protected void doSetDummyCaseKbn_NotEqual(String dummyCaseKbn) {
        regDummyCaseKbn(CK_NES, dummyCaseKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_GreaterThan(String dummyCaseKbn) {
        regDummyCaseKbn(CK_GT, fRES(dummyCaseKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_LessThan(String dummyCaseKbn) {
        regDummyCaseKbn(CK_LT, fRES(dummyCaseKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_GreaterEqual(String dummyCaseKbn) {
        regDummyCaseKbn(CK_GE, fRES(dummyCaseKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_LessEqual(String dummyCaseKbn) {
        regDummyCaseKbn(CK_LE, fRES(dummyCaseKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbnList The collection of dummyCaseKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_InScope(Collection<String> dummyCaseKbnList) {
        doSetDummyCaseKbn_InScope(dummyCaseKbnList);
    }

    protected void doSetDummyCaseKbn_InScope(Collection<String> dummyCaseKbnList) {
        regINS(CK_INS, cTL(dummyCaseKbnList), xgetCValueDummyCaseKbn(), "DUMMY_CASE_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbnList The collection of dummyCaseKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_NotInScope(Collection<String> dummyCaseKbnList) {
        doSetDummyCaseKbn_NotInScope(dummyCaseKbnList);
    }

    protected void doSetDummyCaseKbn_NotInScope(Collection<String> dummyCaseKbnList) {
        regINS(CK_NINS, cTL(dummyCaseKbnList), xgetCValueDummyCaseKbn(), "DUMMY_CASE_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)} <br>
     * <pre>e.g. setDummyCaseKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dummyCaseKbn The value of dummyCaseKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDummyCaseKbn_LikeSearch(String dummyCaseKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dummyCaseKbn), xgetCValueDummyCaseKbn(), "DUMMY_CASE_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDummyCaseKbn_NotLikeSearch(String dummyCaseKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dummyCaseKbn), xgetCValueDummyCaseKbn(), "DUMMY_CASE_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @param dummyCaseKbn The value of dummyCaseKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDummyCaseKbn_PrefixSearch(String dummyCaseKbn) {
        setDummyCaseKbn_LikeSearch(dummyCaseKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     */
    public void setDummyCaseKbn_IsNull() { regDummyCaseKbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DUMMY_CASE_KBN: {char(1)}
     */
    public void setDummyCaseKbn_IsNotNull() { regDummyCaseKbn(CK_ISNN, DOBJ); }

    protected void regDummyCaseKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDummyCaseKbn(), "DUMMY_CASE_KBN"); }
    protected abstract ConditionValue xgetCValueDummyCaseKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_Equal(String readSdKbn) {
        doSetReadSdKbn_Equal(fRES(readSdKbn));
    }

    protected void doSetReadSdKbn_Equal(String readSdKbn) {
        regReadSdKbn(CK_EQ, readSdKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_NotEqual(String readSdKbn) {
        doSetReadSdKbn_NotEqual(fRES(readSdKbn));
    }

    protected void doSetReadSdKbn_NotEqual(String readSdKbn) {
        regReadSdKbn(CK_NES, readSdKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_GreaterThan(String readSdKbn) {
        regReadSdKbn(CK_GT, fRES(readSdKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_LessThan(String readSdKbn) {
        regReadSdKbn(CK_LT, fRES(readSdKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_GreaterEqual(String readSdKbn) {
        regReadSdKbn(CK_GE, fRES(readSdKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_LessEqual(String readSdKbn) {
        regReadSdKbn(CK_LE, fRES(readSdKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbnList The collection of readSdKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_InScope(Collection<String> readSdKbnList) {
        doSetReadSdKbn_InScope(readSdKbnList);
    }

    protected void doSetReadSdKbn_InScope(Collection<String> readSdKbnList) {
        regINS(CK_INS, cTL(readSdKbnList), xgetCValueReadSdKbn(), "READ_SD_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbnList The collection of readSdKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_NotInScope(Collection<String> readSdKbnList) {
        doSetReadSdKbn_NotInScope(readSdKbnList);
    }

    protected void doSetReadSdKbn_NotInScope(Collection<String> readSdKbnList) {
        regINS(CK_NINS, cTL(readSdKbnList), xgetCValueReadSdKbn(), "READ_SD_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_SD_KBN: {char(1)} <br>
     * <pre>e.g. setReadSdKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param readSdKbn The value of readSdKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReadSdKbn_LikeSearch(String readSdKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(readSdKbn), xgetCValueReadSdKbn(), "READ_SD_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReadSdKbn_NotLikeSearch(String readSdKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(readSdKbn), xgetCValueReadSdKbn(), "READ_SD_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_SD_KBN: {char(1)}
     * @param readSdKbn The value of readSdKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadSdKbn_PrefixSearch(String readSdKbn) {
        setReadSdKbn_LikeSearch(readSdKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     */
    public void setReadSdKbn_IsNull() { regReadSdKbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * READ_SD_KBN: {char(1)}
     */
    public void setReadSdKbn_IsNotNull() { regReadSdKbn(CK_ISNN, DOBJ); }

    protected void regReadSdKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReadSdKbn(), "READ_SD_KBN"); }
    protected abstract ConditionValue xgetCValueReadSdKbn();

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
    public HpSLCFunction<TTrpicklistexpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpicklistexpCB.class);
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
    public HpSLCFunction<TTrpicklistexpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpicklistexpCB.class);
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
    public HpSLCFunction<TTrpicklistexpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpicklistexpCB.class);
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
    public HpSLCFunction<TTrpicklistexpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpicklistexpCB.class);
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
    public HpSLCFunction<TTrpicklistexpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpicklistexpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpicklistexpCB&gt;() {
     *     public void query(TTrpicklistexpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpicklistexpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpicklistexpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpicklistexpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpicklistexpCQ sq);

    protected TTrpicklistexpCB xcreateScalarConditionCB() {
        TTrpicklistexpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpicklistexpCB xcreateScalarConditionPartitionByCB() {
        TTrpicklistexpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpicklistexpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "T_TRPICKLISTEXP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpicklistexpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpicklistexpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpicklistexpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "T_TRPICKLISTEXP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpicklistexpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpicklistexpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpicklistexpCQ sq);

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
    protected TTrpicklistexpCB newMyCB() {
        return new TTrpicklistexpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpicklistexpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

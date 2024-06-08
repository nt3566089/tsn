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
 * The abstract condition-query of T_EC_ORDER_R.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTEcOrderRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTEcOrderRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_EC_ORDER_R";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
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
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
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
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_GreaterThan(Long ecOrderHId) {
        regEcOrderHId(CK_GT, ecOrderHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_LessThan(Long ecOrderHId) {
        regEcOrderHId(CK_LT, ecOrderHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_GreaterEqual(Long ecOrderHId) {
        regEcOrderHId(CK_GE, ecOrderHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_LessEqual(Long ecOrderHId) {
        regEcOrderHId(CK_LE, ecOrderHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @param minNumber The min number of ecOrderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ecOrderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEcOrderHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEcOrderHId(), "EC_ORDER_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
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
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @param ecOrderHIdList The collection of ecOrderHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderHId_NotInScope(Collection<Long> ecOrderHIdList) {
        doSetEcOrderHId_NotInScope(ecOrderHIdList);
    }

    protected void doSetEcOrderHId_NotInScope(Collection<Long> ecOrderHIdList) {
        regINS(CK_NINS, cTL(ecOrderHIdList), xgetCValueEcOrderHId(), "EC_ORDER_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EC_ORDER_H_ID from T_EC_ORDER_H where ...)} <br />
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @param subCBLambda The callback for sub-query of TEcOrderH for 'in-scope'. (NotNull)
     */
    public void inScopeTEcOrderH(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEcOrderHId_InScopeRelation_TEcOrderH(cb.query());
        registerInScopeRelation(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderH", false);
    }
    public abstract String keepEcOrderHId_InScopeRelation_TEcOrderH(TEcOrderHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EC_ORDER_H_ID from T_EC_ORDER_H where ...)} <br />
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @param subCBLambda The callback for sub-query of TEcOrderH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTEcOrderH(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEcOrderHId_NotInScopeRelation_TEcOrderH(cb.query());
        registerInScopeRelation(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderH", true);
    }
    public abstract String keepEcOrderHId_NotInScopeRelation_TEcOrderH(TEcOrderHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     */
    public void setEcOrderHId_IsNull() { regEcOrderHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     */
    public void setEcOrderHId_IsNotNull() { regEcOrderHId(CK_ISNN, DOBJ); }

    protected void regEcOrderHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderHId(), "EC_ORDER_H_ID"); }
    protected abstract ConditionValue xgetCValueEcOrderHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param statementOutFlg The value of statementOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutFlg_Equal(String statementOutFlg) {
        doSetStatementOutFlg_Equal(fRES(statementOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetStatementOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setStatementOutFlg_Equal_$0() {
        setStatementOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setStatementOutFlg_Equal_$1() {
        setStatementOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetStatementOutFlg_Equal(String statementOutFlg) {
        regStatementOutFlg(CK_EQ, statementOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param statementOutFlg The value of statementOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutFlg_NotEqual(String statementOutFlg) {
        doSetStatementOutFlg_NotEqual(fRES(statementOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetStatementOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setStatementOutFlg_NotEqual_$0() {
        setStatementOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setStatementOutFlg_NotEqual_$1() {
        setStatementOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetStatementOutFlg_NotEqual(String statementOutFlg) {
        regStatementOutFlg(CK_NES, statementOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param statementOutFlgList The collection of statementOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutFlg_InScope(Collection<String> statementOutFlgList) {
        doSetStatementOutFlg_InScope(statementOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetStatementOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStatementOutFlg_InScope(Collection<String> statementOutFlgList) {
        regINS(CK_INS, cTL(statementOutFlgList), xgetCValueStatementOutFlg(), "STATEMENT_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param statementOutFlgList The collection of statementOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutFlg_NotInScope(Collection<String> statementOutFlgList) {
        doSetStatementOutFlg_NotInScope(statementOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetStatementOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStatementOutFlg_NotInScope(Collection<String> statementOutFlgList) {
        regINS(CK_NINS, cTL(statementOutFlgList), xgetCValueStatementOutFlg(), "STATEMENT_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setStatementOutFlg_IsNull() { regStatementOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setStatementOutFlg_IsNotNull() { regStatementOutFlg(CK_ISNN, DOBJ); }

    protected void regStatementOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatementOutFlg(), "STATEMENT_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueStatementOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserId The value of statementOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutUserId_Equal(Long statementOutUserId) {
        doSetStatementOutUserId_Equal(statementOutUserId);
    }

    protected void doSetStatementOutUserId_Equal(Long statementOutUserId) {
        regStatementOutUserId(CK_EQ, statementOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserId The value of statementOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutUserId_NotEqual(Long statementOutUserId) {
        doSetStatementOutUserId_NotEqual(statementOutUserId);
    }

    protected void doSetStatementOutUserId_NotEqual(Long statementOutUserId) {
        regStatementOutUserId(CK_NES, statementOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserId The value of statementOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutUserId_GreaterThan(Long statementOutUserId) {
        regStatementOutUserId(CK_GT, statementOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserId The value of statementOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutUserId_LessThan(Long statementOutUserId) {
        regStatementOutUserId(CK_LT, statementOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserId The value of statementOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutUserId_GreaterEqual(Long statementOutUserId) {
        regStatementOutUserId(CK_GE, statementOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserId The value of statementOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutUserId_LessEqual(Long statementOutUserId) {
        regStatementOutUserId(CK_LE, statementOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of statementOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of statementOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStatementOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStatementOutUserId(), "STATEMENT_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserIdList The collection of statementOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutUserId_InScope(Collection<Long> statementOutUserIdList) {
        doSetStatementOutUserId_InScope(statementOutUserIdList);
    }

    protected void doSetStatementOutUserId_InScope(Collection<Long> statementOutUserIdList) {
        regINS(CK_INS, cTL(statementOutUserIdList), xgetCValueStatementOutUserId(), "STATEMENT_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param statementOutUserIdList The collection of statementOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementOutUserId_NotInScope(Collection<Long> statementOutUserIdList) {
        doSetStatementOutUserId_NotInScope(statementOutUserIdList);
    }

    protected void doSetStatementOutUserId_NotInScope(Collection<Long> statementOutUserIdList) {
        regINS(CK_NINS, cTL(statementOutUserIdList), xgetCValueStatementOutUserId(), "STATEMENT_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STATEMENT_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStatementOutUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "STATEMENT_OUT_USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepStatementOutUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STATEMENT_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStatementOutUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "STATEMENT_OUT_USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepStatementOutUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setStatementOutUserId_IsNull() { regStatementOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setStatementOutUserId_IsNotNull() { regStatementOutUserId(CK_ISNN, DOBJ); }

    protected void regStatementOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatementOutUserId(), "STATEMENT_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueStatementOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @param statementOutDt The value of statementOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutDt_Equal(java.sql.Timestamp statementOutDt) {
        regStatementOutDt(CK_EQ,  statementOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @param statementOutDt The value of statementOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutDt_GreaterThan(java.sql.Timestamp statementOutDt) {
        regStatementOutDt(CK_GT,  statementOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @param statementOutDt The value of statementOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutDt_LessThan(java.sql.Timestamp statementOutDt) {
        regStatementOutDt(CK_LT,  statementOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @param statementOutDt The value of statementOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutDt_GreaterEqual(java.sql.Timestamp statementOutDt) {
        regStatementOutDt(CK_GE,  statementOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @param statementOutDt The value of statementOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatementOutDt_LessEqual(java.sql.Timestamp statementOutDt) {
        regStatementOutDt(CK_LE, statementOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setStatementOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statementOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statementOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStatementOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueStatementOutDt(), "STATEMENT_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of statementOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of statementOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setStatementOutDt_DateFromTo(Date fromDate, Date toDate) {
        setStatementOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     */
    public void setStatementOutDt_IsNull() { regStatementOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     */
    public void setStatementOutDt_IsNotNull() { regStatementOutDt(CK_ISNN, DOBJ); }

    protected void regStatementOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatementOutDt(), "STATEMENT_OUT_DT"); }
    protected abstract ConditionValue xgetCValueStatementOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlg The value of invoiceCreateFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_Equal(String invoiceCreateFlg) {
        doSetInvoiceCreateFlg_Equal(fRES(invoiceCreateFlg));
    }

    /**
     * Equal(=). As InvoiceCreateFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        doSetInvoiceCreateFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_Equal_$0() {
        setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_Equal_$1() {
        setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    protected void doSetInvoiceCreateFlg_Equal(String invoiceCreateFlg) {
        regInvoiceCreateFlg(CK_EQ, invoiceCreateFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlg The value of invoiceCreateFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotEqual(String invoiceCreateFlg) {
        doSetInvoiceCreateFlg_NotEqual(fRES(invoiceCreateFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InvoiceCreateFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        doSetInvoiceCreateFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_NotEqual_$0() {
        setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_NotEqual_$1() {
        setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    protected void doSetInvoiceCreateFlg_NotEqual(String invoiceCreateFlg) {
        regInvoiceCreateFlg(CK_NES, invoiceCreateFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlgList The collection of invoiceCreateFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_InScope(Collection<String> invoiceCreateFlgList) {
        doSetInvoiceCreateFlg_InScope(invoiceCreateFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InvoiceCreateFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_InScope_AsInvoiceCreateFlg(Collection<CDef.InvoiceCreateFlg> cdefList) {
        doSetInvoiceCreateFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInvoiceCreateFlg_InScope(Collection<String> invoiceCreateFlgList) {
        regINS(CK_INS, cTL(invoiceCreateFlgList), xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlgList The collection of invoiceCreateFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotInScope(Collection<String> invoiceCreateFlgList) {
        doSetInvoiceCreateFlg_NotInScope(invoiceCreateFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InvoiceCreateFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotInScope_AsInvoiceCreateFlg(Collection<CDef.InvoiceCreateFlg> cdefList) {
        doSetInvoiceCreateFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInvoiceCreateFlg_NotInScope(Collection<String> invoiceCreateFlgList) {
        regINS(CK_NINS, cTL(invoiceCreateFlgList), xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNull() { regInvoiceCreateFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNotNull() { regInvoiceCreateFlg(CK_ISNN, DOBJ); }

    protected void regInvoiceCreateFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG"); }
    protected abstract ConditionValue xgetCValueInvoiceCreateFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_Equal(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_EQ,  invoiceCreateDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_GreaterThan(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_GT,  invoiceCreateDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_LessThan(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_LT,  invoiceCreateDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_GreaterEqual(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_GE,  invoiceCreateDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_LessEqual(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_LE, invoiceCreateDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * <pre>e.g. setInvoiceCreateDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInvoiceCreateDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInvoiceCreateDt(), "INVOICE_CREATE_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInvoiceCreateDt_DateFromTo(Date fromDate, Date toDate) {
        setInvoiceCreateDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     */
    public void setInvoiceCreateDt_IsNull() { regInvoiceCreateDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     */
    public void setInvoiceCreateDt_IsNotNull() { regInvoiceCreateDt(CK_ISNN, DOBJ); }

    protected void regInvoiceCreateDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceCreateDt(), "INVOICE_CREATE_DT"); }
    protected abstract ConditionValue xgetCValueInvoiceCreateDt();

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
    public HpSLCFunction<TEcOrderRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TEcOrderRCB.class);
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
    public HpSLCFunction<TEcOrderRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TEcOrderRCB.class);
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
    public HpSLCFunction<TEcOrderRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TEcOrderRCB.class);
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
    public HpSLCFunction<TEcOrderRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TEcOrderRCB.class);
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
    public HpSLCFunction<TEcOrderRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TEcOrderRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TEcOrderRCB&gt;() {
     *     public void query(TEcOrderRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TEcOrderRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TEcOrderRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TEcOrderRCQ sq);

    protected TEcOrderRCB xcreateScalarConditionCB() {
        TEcOrderRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TEcOrderRCB xcreateScalarConditionPartitionByCB() {
        TEcOrderRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TEcOrderRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "EC_ORDER_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TEcOrderRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TEcOrderRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TEcOrderRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EC_ORDER_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TEcOrderRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TEcOrderRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TEcOrderRCQ sq);

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
    protected TEcOrderRCB newMyCB() {
        return new TEcOrderRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TEcOrderRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

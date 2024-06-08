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
 * The abstract condition-query of M_IMPORT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMImportTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMImportTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_IMPORT_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeId The value of importTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_Equal(Long importTypeId) {
        doSetImportTypeId_Equal(importTypeId);
    }

    protected void doSetImportTypeId_Equal(Long importTypeId) {
        regImportTypeId(CK_EQ, importTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeId The value of importTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_NotEqual(Long importTypeId) {
        doSetImportTypeId_NotEqual(importTypeId);
    }

    protected void doSetImportTypeId_NotEqual(Long importTypeId) {
        regImportTypeId(CK_NES, importTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeId The value of importTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterThan(Long importTypeId) {
        regImportTypeId(CK_GT, importTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeId The value of importTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessThan(Long importTypeId) {
        regImportTypeId(CK_LT, importTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeId The value of importTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterEqual(Long importTypeId) {
        regImportTypeId(CK_GE, importTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeId The value of importTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessEqual(Long importTypeId) {
        regImportTypeId(CK_LE, importTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeId(), "IMPORT_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeIdList The collection of importTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_InScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_InScope(importTypeIdList);
    }

    protected void doSetImportTypeId_InScope(Collection<Long> importTypeIdList) {
        regINS(CK_INS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeIdList The collection of importTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_NotInScope(importTypeIdList);
    }

    protected void doSetImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        regINS(CK_NINS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select IMPORT_TYPE_ID from M_IMPORT_TYPE_B where ...)} <br>
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMImportTypeBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MImportTypeBList for 'exists'. (NotNull)
     */
    public void existsMImportTypeBList(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeId_ExistsReferrer_MImportTypeBList(cb.query());
        registerExistsReferrer(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportTypeBList");
    }
    public abstract String keepImportTypeId_ExistsReferrer_MImportTypeBList(MImportTypeBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select IMPORT_TYPE_ID from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderHList for 'exists'. (NotNull)
     */
    public void existsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeId_ExistsReferrer_TEcOrderHList(cb.query());
        registerExistsReferrer(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "tEcOrderHList");
    }
    public abstract String keepImportTypeId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select IMPORT_TYPE_ID from M_IMPORT_TYPE_B where ...)} <br>
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMImportTypeBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ImportTypeId_NotExistsReferrer_MImportTypeBList for 'not exists'. (NotNull)
     */
    public void notExistsMImportTypeBList(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeId_NotExistsReferrer_MImportTypeBList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportTypeBList");
    }
    public abstract String keepImportTypeId_NotExistsReferrer_MImportTypeBList(MImportTypeBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select IMPORT_TYPE_ID from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ImportTypeId_NotExistsReferrer_TEcOrderHList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeId_NotExistsReferrer_TEcOrderHList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "tEcOrderHList");
    }
    public abstract String keepImportTypeId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    public void xsderiveMImportTypeBList(String fn, SubQuery<MImportTypeBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepImportTypeId_SpecifyDerivedReferrer_MImportTypeBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportTypeBList", al, op);
    }
    public abstract String keepImportTypeId_SpecifyDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq);

    public void xsderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepImportTypeId_SpecifyDerivedReferrer_TEcOrderHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "tEcOrderHList", al, op);
    }
    public abstract String keepImportTypeId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_IMPORT_TYPE_B where ...)} <br>
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMImportTypeBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MImportTypeBCB> derivedMImportTypeBList() {
        return xcreateQDRFunctionMImportTypeBList();
    }
    protected HpQDRFunction<MImportTypeBCB> xcreateQDRFunctionMImportTypeBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMImportTypeBList(fn, sq, rd, vl, op));
    }
    public void xqderiveMImportTypeBList(String fn, SubQuery<MImportTypeBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepImportTypeId_QueryDerivedReferrer_MImportTypeBList(cb.query()); String prpp = keepImportTypeId_QueryDerivedReferrer_MImportTypeBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", sqpp, "mImportTypeBList", rd, vl, prpp, op);
    }
    public abstract String keepImportTypeId_QueryDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq);
    public abstract String keepImportTypeId_QueryDerivedReferrer_MImportTypeBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTEcOrderHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TEcOrderHCB> derivedTEcOrderHList() {
        return xcreateQDRFunctionTEcOrderHList();
    }
    protected HpQDRFunction<TEcOrderHCB> xcreateQDRFunctionTEcOrderHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTEcOrderHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepImportTypeId_QueryDerivedReferrer_TEcOrderHList(cb.query()); String prpp = keepImportTypeId_QueryDerivedReferrer_TEcOrderHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", sqpp, "tEcOrderHList", rd, vl, prpp, op);
    }
    public abstract String keepImportTypeId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);
    public abstract String keepImportTypeId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setImportTypeId_IsNull() { regImportTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setImportTypeId_IsNotNull() { regImportTypeId(CK_ISNN, DOBJ); }

    protected void regImportTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeId(), "IMPORT_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_Equal(String importTypeCd) {
        doSetImportTypeCd_Equal(fRES(importTypeCd));
    }

    protected void doSetImportTypeCd_Equal(String importTypeCd) {
        regImportTypeCd(CK_EQ, importTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_NotEqual(String importTypeCd) {
        doSetImportTypeCd_NotEqual(fRES(importTypeCd));
    }

    protected void doSetImportTypeCd_NotEqual(String importTypeCd) {
        regImportTypeCd(CK_NES, importTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_GreaterThan(String importTypeCd) {
        regImportTypeCd(CK_GT, fRES(importTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_LessThan(String importTypeCd) {
        regImportTypeCd(CK_LT, fRES(importTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_GreaterEqual(String importTypeCd) {
        regImportTypeCd(CK_GE, fRES(importTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_LessEqual(String importTypeCd) {
        regImportTypeCd(CK_LE, fRES(importTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCdList The collection of importTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_InScope(Collection<String> importTypeCdList) {
        doSetImportTypeCd_InScope(importTypeCdList);
    }

    protected void doSetImportTypeCd_InScope(Collection<String> importTypeCdList) {
        regINS(CK_INS, cTL(importTypeCdList), xgetCValueImportTypeCd(), "IMPORT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCdList The collection of importTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_NotInScope(Collection<String> importTypeCdList) {
        doSetImportTypeCd_NotInScope(importTypeCdList);
    }

    protected void doSetImportTypeCd_NotInScope(Collection<String> importTypeCdList) {
        regINS(CK_NINS, cTL(importTypeCdList), xgetCValueImportTypeCd(), "IMPORT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setImportTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importTypeCd The value of importTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportTypeCd_LikeSearch(String importTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importTypeCd), xgetCValueImportTypeCd(), "IMPORT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportTypeCd_NotLikeSearch(String importTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importTypeCd), xgetCValueImportTypeCd(), "IMPORT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param importTypeCd The value of importTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeCd_PrefixSearch(String importTypeCd) {
        setImportTypeCd_LikeSearch(importTypeCd, xcLSOPPre());
    }

    protected void regImportTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeCd(), "IMPORT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueImportTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_Equal(String importTypeNm) {
        doSetImportTypeNm_Equal(fRES(importTypeNm));
    }

    protected void doSetImportTypeNm_Equal(String importTypeNm) {
        regImportTypeNm(CK_EQ, importTypeNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_NotEqual(String importTypeNm) {
        doSetImportTypeNm_NotEqual(fRES(importTypeNm));
    }

    protected void doSetImportTypeNm_NotEqual(String importTypeNm) {
        regImportTypeNm(CK_NES, importTypeNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_GreaterThan(String importTypeNm) {
        regImportTypeNm(CK_GT, fRES(importTypeNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_LessThan(String importTypeNm) {
        regImportTypeNm(CK_LT, fRES(importTypeNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_GreaterEqual(String importTypeNm) {
        regImportTypeNm(CK_GE, fRES(importTypeNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_LessEqual(String importTypeNm) {
        regImportTypeNm(CK_LE, fRES(importTypeNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNmList The collection of importTypeNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_InScope(Collection<String> importTypeNmList) {
        doSetImportTypeNm_InScope(importTypeNmList);
    }

    protected void doSetImportTypeNm_InScope(Collection<String> importTypeNmList) {
        regINS(CK_INS, cTL(importTypeNmList), xgetCValueImportTypeNm(), "IMPORT_TYPE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNmList The collection of importTypeNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_NotInScope(Collection<String> importTypeNmList) {
        doSetImportTypeNm_NotInScope(importTypeNmList);
    }

    protected void doSetImportTypeNm_NotInScope(Collection<String> importTypeNmList) {
        regINS(CK_NINS, cTL(importTypeNmList), xgetCValueImportTypeNm(), "IMPORT_TYPE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setImportTypeNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importTypeNm The value of importTypeNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportTypeNm_LikeSearch(String importTypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importTypeNm), xgetCValueImportTypeNm(), "IMPORT_TYPE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportTypeNm_NotLikeSearch(String importTypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importTypeNm), xgetCValueImportTypeNm(), "IMPORT_TYPE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @param importTypeNm The value of importTypeNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeNm_PrefixSearch(String importTypeNm) {
        setImportTypeNm_LikeSearch(importTypeNm, xcLSOPPre());
    }

    protected void regImportTypeNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeNm(), "IMPORT_TYPE_NM"); }
    protected abstract ConditionValue xgetCValueImportTypeNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_Equal(Long ediId) {
        doSetEdiId_Equal(ediId);
    }

    protected void doSetEdiId_Equal(Long ediId) {
        regEdiId(CK_EQ, ediId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_NotEqual(Long ediId) {
        doSetEdiId_NotEqual(ediId);
    }

    protected void doSetEdiId_NotEqual(Long ediId) {
        regEdiId(CK_NES, ediId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_GreaterThan(Long ediId) {
        regEdiId(CK_GT, ediId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_LessThan(Long ediId) {
        regEdiId(CK_LT, ediId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_GreaterEqual(Long ediId) {
        regEdiId(CK_GE, ediId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_LessEqual(Long ediId) {
        regEdiId(CK_LE, ediId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param minNumber The min number of ediId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ediId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEdiId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEdiId(), "EDI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediIdList The collection of ediId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiId_InScope(Collection<Long> ediIdList) {
        doSetEdiId_InScope(ediIdList);
    }

    protected void doSetEdiId_InScope(Collection<Long> ediIdList) {
        regINS(CK_INS, cTL(ediIdList), xgetCValueEdiId(), "EDI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediIdList The collection of ediId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiId_NotInScope(Collection<Long> ediIdList) {
        doSetEdiId_NotInScope(ediIdList);
    }

    protected void doSetEdiId_NotInScope(Collection<Long> ediIdList) {
        regINS(CK_NINS, cTL(ediIdList), xgetCValueEdiId(), "EDI_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EDI_ID from M_EDI where ...)} <br />
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @param subCBLambda The callback for sub-query of MEdi for 'in-scope'. (NotNull)
     */
    public void inScopeMEdi(SubQuery<MEdiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiCB cb = new MEdiCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEdiId_InScopeRelation_MEdi(cb.query());
        registerInScopeRelation(cb.query(), "EDI_ID", "EDI_ID", pp, "mEdi", false);
    }
    public abstract String keepEdiId_InScopeRelation_MEdi(MEdiCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EDI_ID from M_EDI where ...)} <br />
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @param subCBLambda The callback for sub-query of MEdi for 'not in-scope'. (NotNull)
     */
    public void notInScopeMEdi(SubQuery<MEdiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiCB cb = new MEdiCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEdiId_NotInScopeRelation_MEdi(cb.query());
        registerInScopeRelation(cb.query(), "EDI_ID", "EDI_ID", pp, "mEdi", true);
    }
    public abstract String keepEdiId_NotInScopeRelation_MEdi(MEdiCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     */
    public void setEdiId_IsNull() { regEdiId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     */
    public void setEdiId_IsNotNull() { regEdiId(CK_ISNN, DOBJ); }

    protected void regEdiId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEdiId(), "EDI_ID"); }
    protected abstract ConditionValue xgetCValueEdiId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_Equal(String characterCd) {
        doSetCharacterCd_Equal(fRES(characterCd));
    }

    protected void doSetCharacterCd_Equal(String characterCd) {
        regCharacterCd(CK_EQ, characterCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotEqual(String characterCd) {
        doSetCharacterCd_NotEqual(fRES(characterCd));
    }

    protected void doSetCharacterCd_NotEqual(String characterCd) {
        regCharacterCd(CK_NES, characterCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_GreaterThan(String characterCd) {
        regCharacterCd(CK_GT, fRES(characterCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_LessThan(String characterCd) {
        regCharacterCd(CK_LT, fRES(characterCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_GreaterEqual(String characterCd) {
        regCharacterCd(CK_GE, fRES(characterCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_LessEqual(String characterCd) {
        regCharacterCd(CK_LE, fRES(characterCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCdList The collection of characterCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_InScope(Collection<String> characterCdList) {
        doSetCharacterCd_InScope(characterCdList);
    }

    protected void doSetCharacterCd_InScope(Collection<String> characterCdList) {
        regINS(CK_INS, cTL(characterCdList), xgetCValueCharacterCd(), "CHARACTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCdList The collection of characterCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotInScope(Collection<String> characterCdList) {
        doSetCharacterCd_NotInScope(characterCdList);
    }

    protected void doSetCharacterCd_NotInScope(Collection<String> characterCdList) {
        regINS(CK_NINS, cTL(characterCdList), xgetCValueCharacterCd(), "CHARACTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)} <br>
     * <pre>e.g. setCharacterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param characterCd The value of characterCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacterCd_LikeSearch(String characterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(characterCd), xgetCValueCharacterCd(), "CHARACTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacterCd_NotLikeSearch(String characterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(characterCd), xgetCValueCharacterCd(), "CHARACTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_PrefixSearch(String characterCd) {
        setCharacterCd_LikeSearch(characterCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     */
    public void setCharacterCd_IsNull() { regCharacterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     */
    public void setCharacterCd_IsNullOrEmpty() { regCharacterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     */
    public void setCharacterCd_IsNotNull() { regCharacterCd(CK_ISNN, DOBJ); }

    protected void regCharacterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacterCd(), "CHARACTER_CD"); }
    protected abstract ConditionValue xgetCValueCharacterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @param lineFeedCd The value of lineFeedCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_Equal(String lineFeedCd) {
        doSetLineFeedCd_Equal(fRES(lineFeedCd));
    }

    /**
     * Equal(=). As LineFeedCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFeedCd_Equal_AsLineFeedCd(CDef.LineFeedCd cdef) {
        doSetLineFeedCd_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: CRLF
     */
    public void setLineFeedCd_Equal_$1() {
        setLineFeedCd_Equal_AsLineFeedCd(CDef.LineFeedCd.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: CR
     */
    public void setLineFeedCd_Equal_$2() {
        setLineFeedCd_Equal_AsLineFeedCd(CDef.LineFeedCd.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: LF
     */
    public void setLineFeedCd_Equal_$3() {
        setLineFeedCd_Equal_AsLineFeedCd(CDef.LineFeedCd.$3);
    }

    protected void doSetLineFeedCd_Equal(String lineFeedCd) {
        regLineFeedCd(CK_EQ, lineFeedCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @param lineFeedCd The value of lineFeedCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_NotEqual(String lineFeedCd) {
        doSetLineFeedCd_NotEqual(fRES(lineFeedCd));
    }

    /**
     * NotEqual(&lt;&gt;). As LineFeedCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFeedCd_NotEqual_AsLineFeedCd(CDef.LineFeedCd cdef) {
        doSetLineFeedCd_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: CRLF
     */
    public void setLineFeedCd_NotEqual_$1() {
        setLineFeedCd_NotEqual_AsLineFeedCd(CDef.LineFeedCd.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: CR
     */
    public void setLineFeedCd_NotEqual_$2() {
        setLineFeedCd_NotEqual_AsLineFeedCd(CDef.LineFeedCd.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: LF
     */
    public void setLineFeedCd_NotEqual_$3() {
        setLineFeedCd_NotEqual_AsLineFeedCd(CDef.LineFeedCd.$3);
    }

    protected void doSetLineFeedCd_NotEqual(String lineFeedCd) {
        regLineFeedCd(CK_NES, lineFeedCd);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @param lineFeedCdList The collection of lineFeedCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_InScope(Collection<String> lineFeedCdList) {
        doSetLineFeedCd_InScope(lineFeedCdList);
    }

    /**
     * InScope {in ('a', 'b')}. As LineFeedCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_InScope_AsLineFeedCd(Collection<CDef.LineFeedCd> cdefList) {
        doSetLineFeedCd_InScope(cTStrL(cdefList));
    }

    protected void doSetLineFeedCd_InScope(Collection<String> lineFeedCdList) {
        regINS(CK_INS, cTL(lineFeedCdList), xgetCValueLineFeedCd(), "LINE_FEED_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @param lineFeedCdList The collection of lineFeedCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_NotInScope(Collection<String> lineFeedCdList) {
        doSetLineFeedCd_NotInScope(lineFeedCdList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LineFeedCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_NotInScope_AsLineFeedCd(Collection<CDef.LineFeedCd> cdefList) {
        doSetLineFeedCd_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLineFeedCd_NotInScope(Collection<String> lineFeedCdList) {
        regINS(CK_NINS, cTL(lineFeedCdList), xgetCValueLineFeedCd(), "LINE_FEED_CD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     */
    public void setLineFeedCd_IsNull() { regLineFeedCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     */
    public void setLineFeedCd_IsNullOrEmpty() { regLineFeedCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     */
    public void setLineFeedCd_IsNotNull() { regLineFeedCd(CK_ISNN, DOBJ); }

    protected void regLineFeedCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineFeedCd(), "LINE_FEED_CD"); }
    protected abstract ConditionValue xgetCValueLineFeedCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_Equal(String delimiter) {
        doSetDelimiter_Equal(fRES(delimiter));
    }

    protected void doSetDelimiter_Equal(String delimiter) {
        regDelimiter(CK_EQ, delimiter);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_NotEqual(String delimiter) {
        doSetDelimiter_NotEqual(fRES(delimiter));
    }

    protected void doSetDelimiter_NotEqual(String delimiter) {
        regDelimiter(CK_NES, delimiter);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_GreaterThan(String delimiter) {
        regDelimiter(CK_GT, fRES(delimiter));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_LessThan(String delimiter) {
        regDelimiter(CK_LT, fRES(delimiter));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_GreaterEqual(String delimiter) {
        regDelimiter(CK_GE, fRES(delimiter));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_LessEqual(String delimiter) {
        regDelimiter(CK_LE, fRES(delimiter));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiterList The collection of delimiter as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_InScope(Collection<String> delimiterList) {
        doSetDelimiter_InScope(delimiterList);
    }

    protected void doSetDelimiter_InScope(Collection<String> delimiterList) {
        regINS(CK_INS, cTL(delimiterList), xgetCValueDelimiter(), "DELIMITER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiterList The collection of delimiter as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_NotInScope(Collection<String> delimiterList) {
        doSetDelimiter_NotInScope(delimiterList);
    }

    protected void doSetDelimiter_NotInScope(Collection<String> delimiterList) {
        regINS(CK_NINS, cTL(delimiterList), xgetCValueDelimiter(), "DELIMITER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)} <br>
     * <pre>e.g. setDelimiter_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delimiter The value of delimiter as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelimiter_LikeSearch(String delimiter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delimiter), xgetCValueDelimiter(), "DELIMITER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelimiter_NotLikeSearch(String delimiter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delimiter), xgetCValueDelimiter(), "DELIMITER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_PrefixSearch(String delimiter) {
        setDelimiter_LikeSearch(delimiter, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     */
    public void setDelimiter_IsNull() { regDelimiter(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     */
    public void setDelimiter_IsNullOrEmpty() { regDelimiter(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     */
    public void setDelimiter_IsNotNull() { regDelimiter(CK_ISNN, DOBJ); }

    protected void regDelimiter(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelimiter(), "DELIMITER"); }
    protected abstract ConditionValue xgetCValueDelimiter();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRows The value of skippingRows as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_Equal(Long skippingRows) {
        doSetSkippingRows_Equal(skippingRows);
    }

    protected void doSetSkippingRows_Equal(Long skippingRows) {
        regSkippingRows(CK_EQ, skippingRows);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRows The value of skippingRows as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_NotEqual(Long skippingRows) {
        doSetSkippingRows_NotEqual(skippingRows);
    }

    protected void doSetSkippingRows_NotEqual(Long skippingRows) {
        regSkippingRows(CK_NES, skippingRows);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRows The value of skippingRows as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_GreaterThan(Long skippingRows) {
        regSkippingRows(CK_GT, skippingRows);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRows The value of skippingRows as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_LessThan(Long skippingRows) {
        regSkippingRows(CK_LT, skippingRows);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRows The value of skippingRows as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_GreaterEqual(Long skippingRows) {
        regSkippingRows(CK_GE, skippingRows);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRows The value of skippingRows as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_LessEqual(Long skippingRows) {
        regSkippingRows(CK_LE, skippingRows);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param minNumber The min number of skippingRows. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of skippingRows. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSkippingRows_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSkippingRows(), "SKIPPING_ROWS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRowsList The collection of skippingRows as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkippingRows_InScope(Collection<Long> skippingRowsList) {
        doSetSkippingRows_InScope(skippingRowsList);
    }

    protected void doSetSkippingRows_InScope(Collection<Long> skippingRowsList) {
        regINS(CK_INS, cTL(skippingRowsList), xgetCValueSkippingRows(), "SKIPPING_ROWS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @param skippingRowsList The collection of skippingRows as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkippingRows_NotInScope(Collection<Long> skippingRowsList) {
        doSetSkippingRows_NotInScope(skippingRowsList);
    }

    protected void doSetSkippingRows_NotInScope(Collection<Long> skippingRowsList) {
        regINS(CK_NINS, cTL(skippingRowsList), xgetCValueSkippingRows(), "SKIPPING_ROWS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     */
    public void setSkippingRows_IsNull() { regSkippingRows(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     */
    public void setSkippingRows_IsNotNull() { regSkippingRows(CK_ISNN, DOBJ); }

    protected void regSkippingRows(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkippingRows(), "SKIPPING_ROWS"); }
    protected abstract ConditionValue xgetCValueSkippingRows();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @param uploadTableNm The value of uploadTableNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_Equal(String uploadTableNm) {
        doSetUploadTableNm_Equal(fRES(uploadTableNm));
    }

    /**
     * Equal(=). As UploadTableNm. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUploadTableNm_Equal_AsUploadTableNm(CDef.UploadTableNm cdef) {
        doSetUploadTableNm_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $tAmazonOrder (tAmazonOrder). And OnlyOnceRegistered. <br>
     * $tAmazonOrder: Amazon受注
     */
    public void setUploadTableNm_Equal_$tAmazonOrder() {
        setUploadTableNm_Equal_AsUploadTableNm(CDef.UploadTableNm.$tAmazonOrder);
    }

    /**
     * Equal(=). As $tRakutenOrder (tRakutenOrder). And OnlyOnceRegistered. <br>
     * $tRakutenOrder: 楽天RMS受注
     */
    public void setUploadTableNm_Equal_$tRakutenOrder() {
        setUploadTableNm_Equal_AsUploadTableNm(CDef.UploadTableNm.$tRakutenOrder);
    }

    /**
     * Equal(=). As $tYahooOrder (tYahooOrder). And OnlyOnceRegistered. <br>
     * $tYahooOrder: Yahoo受注
     */
    public void setUploadTableNm_Equal_$tYahooOrder() {
        setUploadTableNm_Equal_AsUploadTableNm(CDef.UploadTableNm.$tYahooOrder);
    }

    protected void doSetUploadTableNm_Equal(String uploadTableNm) {
        regUploadTableNm(CK_EQ, uploadTableNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @param uploadTableNm The value of uploadTableNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_NotEqual(String uploadTableNm) {
        doSetUploadTableNm_NotEqual(fRES(uploadTableNm));
    }

    /**
     * NotEqual(&lt;&gt;). As UploadTableNm. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUploadTableNm_NotEqual_AsUploadTableNm(CDef.UploadTableNm cdef) {
        doSetUploadTableNm_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $tAmazonOrder (tAmazonOrder). And OnlyOnceRegistered. <br>
     * $tAmazonOrder: Amazon受注
     */
    public void setUploadTableNm_NotEqual_$tAmazonOrder() {
        setUploadTableNm_NotEqual_AsUploadTableNm(CDef.UploadTableNm.$tAmazonOrder);
    }

    /**
     * NotEqual(&lt;&gt;). As $tRakutenOrder (tRakutenOrder). And OnlyOnceRegistered. <br>
     * $tRakutenOrder: 楽天RMS受注
     */
    public void setUploadTableNm_NotEqual_$tRakutenOrder() {
        setUploadTableNm_NotEqual_AsUploadTableNm(CDef.UploadTableNm.$tRakutenOrder);
    }

    /**
     * NotEqual(&lt;&gt;). As $tYahooOrder (tYahooOrder). And OnlyOnceRegistered. <br>
     * $tYahooOrder: Yahoo受注
     */
    public void setUploadTableNm_NotEqual_$tYahooOrder() {
        setUploadTableNm_NotEqual_AsUploadTableNm(CDef.UploadTableNm.$tYahooOrder);
    }

    protected void doSetUploadTableNm_NotEqual(String uploadTableNm) {
        regUploadTableNm(CK_NES, uploadTableNm);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @param uploadTableNmList The collection of uploadTableNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_InScope(Collection<String> uploadTableNmList) {
        doSetUploadTableNm_InScope(uploadTableNmList);
    }

    /**
     * InScope {in ('a', 'b')}. As UploadTableNm. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_InScope_AsUploadTableNm(Collection<CDef.UploadTableNm> cdefList) {
        doSetUploadTableNm_InScope(cTStrL(cdefList));
    }

    protected void doSetUploadTableNm_InScope(Collection<String> uploadTableNmList) {
        regINS(CK_INS, cTL(uploadTableNmList), xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @param uploadTableNmList The collection of uploadTableNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_NotInScope(Collection<String> uploadTableNmList) {
        doSetUploadTableNm_NotInScope(uploadTableNmList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UploadTableNm. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_NotInScope_AsUploadTableNm(Collection<CDef.UploadTableNm> cdefList) {
        doSetUploadTableNm_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUploadTableNm_NotInScope(Collection<String> uploadTableNmList) {
        regINS(CK_NINS, cTL(uploadTableNmList), xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     */
    public void setUploadTableNm_IsNull() { regUploadTableNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     */
    public void setUploadTableNm_IsNullOrEmpty() { regUploadTableNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     */
    public void setUploadTableNm_IsNotNull() { regUploadTableNm(CK_ISNN, DOBJ); }

    protected void regUploadTableNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM"); }
    protected abstract ConditionValue xgetCValueUploadTableNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_Equal(String duplicateColumnNm) {
        doSetDuplicateColumnNm_Equal(fRES(duplicateColumnNm));
    }

    protected void doSetDuplicateColumnNm_Equal(String duplicateColumnNm) {
        regDuplicateColumnNm(CK_EQ, duplicateColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_NotEqual(String duplicateColumnNm) {
        doSetDuplicateColumnNm_NotEqual(fRES(duplicateColumnNm));
    }

    protected void doSetDuplicateColumnNm_NotEqual(String duplicateColumnNm) {
        regDuplicateColumnNm(CK_NES, duplicateColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_GreaterThan(String duplicateColumnNm) {
        regDuplicateColumnNm(CK_GT, fRES(duplicateColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_LessThan(String duplicateColumnNm) {
        regDuplicateColumnNm(CK_LT, fRES(duplicateColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_GreaterEqual(String duplicateColumnNm) {
        regDuplicateColumnNm(CK_GE, fRES(duplicateColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_LessEqual(String duplicateColumnNm) {
        regDuplicateColumnNm(CK_LE, fRES(duplicateColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNmList The collection of duplicateColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_InScope(Collection<String> duplicateColumnNmList) {
        doSetDuplicateColumnNm_InScope(duplicateColumnNmList);
    }

    protected void doSetDuplicateColumnNm_InScope(Collection<String> duplicateColumnNmList) {
        regINS(CK_INS, cTL(duplicateColumnNmList), xgetCValueDuplicateColumnNm(), "DUPLICATE_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNmList The collection of duplicateColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_NotInScope(Collection<String> duplicateColumnNmList) {
        doSetDuplicateColumnNm_NotInScope(duplicateColumnNmList);
    }

    protected void doSetDuplicateColumnNm_NotInScope(Collection<String> duplicateColumnNmList) {
        regINS(CK_NINS, cTL(duplicateColumnNmList), xgetCValueDuplicateColumnNm(), "DUPLICATE_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)} <br>
     * <pre>e.g. setDuplicateColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param duplicateColumnNm The value of duplicateColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDuplicateColumnNm_LikeSearch(String duplicateColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(duplicateColumnNm), xgetCValueDuplicateColumnNm(), "DUPLICATE_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDuplicateColumnNm_NotLikeSearch(String duplicateColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(duplicateColumnNm), xgetCValueDuplicateColumnNm(), "DUPLICATE_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @param duplicateColumnNm The value of duplicateColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDuplicateColumnNm_PrefixSearch(String duplicateColumnNm) {
        setDuplicateColumnNm_LikeSearch(duplicateColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     */
    public void setDuplicateColumnNm_IsNull() { regDuplicateColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     */
    public void setDuplicateColumnNm_IsNullOrEmpty() { regDuplicateColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     */
    public void setDuplicateColumnNm_IsNotNull() { regDuplicateColumnNm(CK_ISNN, DOBJ); }

    protected void regDuplicateColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDuplicateColumnNm(), "DUPLICATE_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueDuplicateColumnNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_Equal(String rcvIdColumnNm) {
        doSetRcvIdColumnNm_Equal(fRES(rcvIdColumnNm));
    }

    protected void doSetRcvIdColumnNm_Equal(String rcvIdColumnNm) {
        regRcvIdColumnNm(CK_EQ, rcvIdColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_NotEqual(String rcvIdColumnNm) {
        doSetRcvIdColumnNm_NotEqual(fRES(rcvIdColumnNm));
    }

    protected void doSetRcvIdColumnNm_NotEqual(String rcvIdColumnNm) {
        regRcvIdColumnNm(CK_NES, rcvIdColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_GreaterThan(String rcvIdColumnNm) {
        regRcvIdColumnNm(CK_GT, fRES(rcvIdColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_LessThan(String rcvIdColumnNm) {
        regRcvIdColumnNm(CK_LT, fRES(rcvIdColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_GreaterEqual(String rcvIdColumnNm) {
        regRcvIdColumnNm(CK_GE, fRES(rcvIdColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_LessEqual(String rcvIdColumnNm) {
        regRcvIdColumnNm(CK_LE, fRES(rcvIdColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNmList The collection of rcvIdColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_InScope(Collection<String> rcvIdColumnNmList) {
        doSetRcvIdColumnNm_InScope(rcvIdColumnNmList);
    }

    protected void doSetRcvIdColumnNm_InScope(Collection<String> rcvIdColumnNmList) {
        regINS(CK_INS, cTL(rcvIdColumnNmList), xgetCValueRcvIdColumnNm(), "RCV_ID_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNmList The collection of rcvIdColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_NotInScope(Collection<String> rcvIdColumnNmList) {
        doSetRcvIdColumnNm_NotInScope(rcvIdColumnNmList);
    }

    protected void doSetRcvIdColumnNm_NotInScope(Collection<String> rcvIdColumnNmList) {
        regINS(CK_NINS, cTL(rcvIdColumnNmList), xgetCValueRcvIdColumnNm(), "RCV_ID_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)} <br>
     * <pre>e.g. setRcvIdColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvIdColumnNm The value of rcvIdColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvIdColumnNm_LikeSearch(String rcvIdColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvIdColumnNm), xgetCValueRcvIdColumnNm(), "RCV_ID_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvIdColumnNm_NotLikeSearch(String rcvIdColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvIdColumnNm), xgetCValueRcvIdColumnNm(), "RCV_ID_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @param rcvIdColumnNm The value of rcvIdColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvIdColumnNm_PrefixSearch(String rcvIdColumnNm) {
        setRcvIdColumnNm_LikeSearch(rcvIdColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     */
    public void setRcvIdColumnNm_IsNull() { regRcvIdColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     */
    public void setRcvIdColumnNm_IsNullOrEmpty() { regRcvIdColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     */
    public void setRcvIdColumnNm_IsNotNull() { regRcvIdColumnNm(CK_ISNN, DOBJ); }

    protected void regRcvIdColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvIdColumnNm(), "RCV_ID_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueRcvIdColumnNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_Equal(String rowNoColumnNm) {
        doSetRowNoColumnNm_Equal(fRES(rowNoColumnNm));
    }

    protected void doSetRowNoColumnNm_Equal(String rowNoColumnNm) {
        regRowNoColumnNm(CK_EQ, rowNoColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_NotEqual(String rowNoColumnNm) {
        doSetRowNoColumnNm_NotEqual(fRES(rowNoColumnNm));
    }

    protected void doSetRowNoColumnNm_NotEqual(String rowNoColumnNm) {
        regRowNoColumnNm(CK_NES, rowNoColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_GreaterThan(String rowNoColumnNm) {
        regRowNoColumnNm(CK_GT, fRES(rowNoColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_LessThan(String rowNoColumnNm) {
        regRowNoColumnNm(CK_LT, fRES(rowNoColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_GreaterEqual(String rowNoColumnNm) {
        regRowNoColumnNm(CK_GE, fRES(rowNoColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_LessEqual(String rowNoColumnNm) {
        regRowNoColumnNm(CK_LE, fRES(rowNoColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNmList The collection of rowNoColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_InScope(Collection<String> rowNoColumnNmList) {
        doSetRowNoColumnNm_InScope(rowNoColumnNmList);
    }

    protected void doSetRowNoColumnNm_InScope(Collection<String> rowNoColumnNmList) {
        regINS(CK_INS, cTL(rowNoColumnNmList), xgetCValueRowNoColumnNm(), "ROW_NO_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNmList The collection of rowNoColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_NotInScope(Collection<String> rowNoColumnNmList) {
        doSetRowNoColumnNm_NotInScope(rowNoColumnNmList);
    }

    protected void doSetRowNoColumnNm_NotInScope(Collection<String> rowNoColumnNmList) {
        regINS(CK_NINS, cTL(rowNoColumnNmList), xgetCValueRowNoColumnNm(), "ROW_NO_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)} <br>
     * <pre>e.g. setRowNoColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rowNoColumnNm The value of rowNoColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRowNoColumnNm_LikeSearch(String rowNoColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rowNoColumnNm), xgetCValueRowNoColumnNm(), "ROW_NO_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRowNoColumnNm_NotLikeSearch(String rowNoColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rowNoColumnNm), xgetCValueRowNoColumnNm(), "ROW_NO_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @param rowNoColumnNm The value of rowNoColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNoColumnNm_PrefixSearch(String rowNoColumnNm) {
        setRowNoColumnNm_LikeSearch(rowNoColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     */
    public void setRowNoColumnNm_IsNull() { regRowNoColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     */
    public void setRowNoColumnNm_IsNullOrEmpty() { regRowNoColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     */
    public void setRowNoColumnNm_IsNotNull() { regRowNoColumnNm(CK_ISNN, DOBJ); }

    protected void regRowNoColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRowNoColumnNm(), "ROW_NO_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueRowNoColumnNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @param giftStatementType The value of giftStatementType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementType_Equal(String giftStatementType) {
        doSetGiftStatementType_Equal(fRES(giftStatementType));
    }

    /**
     * Equal(=). As GiftStatementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftStatementType_Equal_AsGiftStatementType(CDef.GiftStatementType cdef) {
        doSetGiftStatementType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setGiftStatementType_Equal_$0() {
        setGiftStatementType_Equal_AsGiftStatementType(CDef.GiftStatementType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 金額非表示
     */
    public void setGiftStatementType_Equal_$1() {
        setGiftStatementType_Equal_AsGiftStatementType(CDef.GiftStatementType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 明細非表示
     */
    public void setGiftStatementType_Equal_$2() {
        setGiftStatementType_Equal_AsGiftStatementType(CDef.GiftStatementType.$2);
    }

    protected void doSetGiftStatementType_Equal(String giftStatementType) {
        regGiftStatementType(CK_EQ, giftStatementType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @param giftStatementType The value of giftStatementType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementType_NotEqual(String giftStatementType) {
        doSetGiftStatementType_NotEqual(fRES(giftStatementType));
    }

    /**
     * NotEqual(&lt;&gt;). As GiftStatementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftStatementType_NotEqual_AsGiftStatementType(CDef.GiftStatementType cdef) {
        doSetGiftStatementType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setGiftStatementType_NotEqual_$0() {
        setGiftStatementType_NotEqual_AsGiftStatementType(CDef.GiftStatementType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 金額非表示
     */
    public void setGiftStatementType_NotEqual_$1() {
        setGiftStatementType_NotEqual_AsGiftStatementType(CDef.GiftStatementType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 明細非表示
     */
    public void setGiftStatementType_NotEqual_$2() {
        setGiftStatementType_NotEqual_AsGiftStatementType(CDef.GiftStatementType.$2);
    }

    protected void doSetGiftStatementType_NotEqual(String giftStatementType) {
        regGiftStatementType(CK_NES, giftStatementType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @param giftStatementTypeList The collection of giftStatementType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementType_InScope(Collection<String> giftStatementTypeList) {
        doSetGiftStatementType_InScope(giftStatementTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As GiftStatementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementType_InScope_AsGiftStatementType(Collection<CDef.GiftStatementType> cdefList) {
        doSetGiftStatementType_InScope(cTStrL(cdefList));
    }

    protected void doSetGiftStatementType_InScope(Collection<String> giftStatementTypeList) {
        regINS(CK_INS, cTL(giftStatementTypeList), xgetCValueGiftStatementType(), "GIFT_STATEMENT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @param giftStatementTypeList The collection of giftStatementType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementType_NotInScope(Collection<String> giftStatementTypeList) {
        doSetGiftStatementType_NotInScope(giftStatementTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As GiftStatementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementType_NotInScope_AsGiftStatementType(Collection<CDef.GiftStatementType> cdefList) {
        doSetGiftStatementType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetGiftStatementType_NotInScope(Collection<String> giftStatementTypeList) {
        regINS(CK_NINS, cTL(giftStatementTypeList), xgetCValueGiftStatementType(), "GIFT_STATEMENT_TYPE");
    }

    protected void regGiftStatementType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftStatementType(), "GIFT_STATEMENT_TYPE"); }
    protected abstract ConditionValue xgetCValueGiftStatementType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_Equal(String giftStatementDetail) {
        doSetGiftStatementDetail_Equal(fRES(giftStatementDetail));
    }

    protected void doSetGiftStatementDetail_Equal(String giftStatementDetail) {
        regGiftStatementDetail(CK_EQ, giftStatementDetail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_NotEqual(String giftStatementDetail) {
        doSetGiftStatementDetail_NotEqual(fRES(giftStatementDetail));
    }

    protected void doSetGiftStatementDetail_NotEqual(String giftStatementDetail) {
        regGiftStatementDetail(CK_NES, giftStatementDetail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_GreaterThan(String giftStatementDetail) {
        regGiftStatementDetail(CK_GT, fRES(giftStatementDetail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_LessThan(String giftStatementDetail) {
        regGiftStatementDetail(CK_LT, fRES(giftStatementDetail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_GreaterEqual(String giftStatementDetail) {
        regGiftStatementDetail(CK_GE, fRES(giftStatementDetail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_LessEqual(String giftStatementDetail) {
        regGiftStatementDetail(CK_LE, fRES(giftStatementDetail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetailList The collection of giftStatementDetail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_InScope(Collection<String> giftStatementDetailList) {
        doSetGiftStatementDetail_InScope(giftStatementDetailList);
    }

    protected void doSetGiftStatementDetail_InScope(Collection<String> giftStatementDetailList) {
        regINS(CK_INS, cTL(giftStatementDetailList), xgetCValueGiftStatementDetail(), "GIFT_STATEMENT_DETAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetailList The collection of giftStatementDetail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_NotInScope(Collection<String> giftStatementDetailList) {
        doSetGiftStatementDetail_NotInScope(giftStatementDetailList);
    }

    protected void doSetGiftStatementDetail_NotInScope(Collection<String> giftStatementDetailList) {
        regINS(CK_NINS, cTL(giftStatementDetailList), xgetCValueGiftStatementDetail(), "GIFT_STATEMENT_DETAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)} <br>
     * <pre>e.g. setGiftStatementDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftStatementDetail The value of giftStatementDetail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftStatementDetail_LikeSearch(String giftStatementDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftStatementDetail), xgetCValueGiftStatementDetail(), "GIFT_STATEMENT_DETAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftStatementDetail_NotLikeSearch(String giftStatementDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftStatementDetail), xgetCValueGiftStatementDetail(), "GIFT_STATEMENT_DETAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @param giftStatementDetail The value of giftStatementDetail as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftStatementDetail_PrefixSearch(String giftStatementDetail) {
        setGiftStatementDetail_LikeSearch(giftStatementDetail, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     */
    public void setGiftStatementDetail_IsNull() { regGiftStatementDetail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     */
    public void setGiftStatementDetail_IsNullOrEmpty() { regGiftStatementDetail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     */
    public void setGiftStatementDetail_IsNotNull() { regGiftStatementDetail(CK_ISNN, DOBJ); }

    protected void regGiftStatementDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftStatementDetail(), "GIFT_STATEMENT_DETAIL"); }
    protected abstract ConditionValue xgetCValueGiftStatementDetail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDays The value of oKeepingDays as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOKeepingDays_Equal(Long oKeepingDays) {
        doSetOKeepingDays_Equal(oKeepingDays);
    }

    protected void doSetOKeepingDays_Equal(Long oKeepingDays) {
        regOKeepingDays(CK_EQ, oKeepingDays);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDays The value of oKeepingDays as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOKeepingDays_NotEqual(Long oKeepingDays) {
        doSetOKeepingDays_NotEqual(oKeepingDays);
    }

    protected void doSetOKeepingDays_NotEqual(Long oKeepingDays) {
        regOKeepingDays(CK_NES, oKeepingDays);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDays The value of oKeepingDays as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOKeepingDays_GreaterThan(Long oKeepingDays) {
        regOKeepingDays(CK_GT, oKeepingDays);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDays The value of oKeepingDays as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOKeepingDays_LessThan(Long oKeepingDays) {
        regOKeepingDays(CK_LT, oKeepingDays);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDays The value of oKeepingDays as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOKeepingDays_GreaterEqual(Long oKeepingDays) {
        regOKeepingDays(CK_GE, oKeepingDays);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDays The value of oKeepingDays as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOKeepingDays_LessEqual(Long oKeepingDays) {
        regOKeepingDays(CK_LE, oKeepingDays);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param minNumber The min number of oKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oKeepingDays. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOKeepingDays_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOKeepingDays(), "O_KEEPING_DAYS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDaysList The collection of oKeepingDays as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOKeepingDays_InScope(Collection<Long> oKeepingDaysList) {
        doSetOKeepingDays_InScope(oKeepingDaysList);
    }

    protected void doSetOKeepingDays_InScope(Collection<Long> oKeepingDaysList) {
        regINS(CK_INS, cTL(oKeepingDaysList), xgetCValueOKeepingDays(), "O_KEEPING_DAYS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @param oKeepingDaysList The collection of oKeepingDays as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOKeepingDays_NotInScope(Collection<Long> oKeepingDaysList) {
        doSetOKeepingDays_NotInScope(oKeepingDaysList);
    }

    protected void doSetOKeepingDays_NotInScope(Collection<Long> oKeepingDaysList) {
        regINS(CK_NINS, cTL(oKeepingDaysList), xgetCValueOKeepingDays(), "O_KEEPING_DAYS");
    }

    protected void regOKeepingDays(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOKeepingDays(), "O_KEEPING_DAYS"); }
    protected abstract ConditionValue xgetCValueOKeepingDays();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_Equal(String statementTitle) {
        doSetStatementTitle_Equal(fRES(statementTitle));
    }

    protected void doSetStatementTitle_Equal(String statementTitle) {
        regStatementTitle(CK_EQ, statementTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_NotEqual(String statementTitle) {
        doSetStatementTitle_NotEqual(fRES(statementTitle));
    }

    protected void doSetStatementTitle_NotEqual(String statementTitle) {
        regStatementTitle(CK_NES, statementTitle);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_GreaterThan(String statementTitle) {
        regStatementTitle(CK_GT, fRES(statementTitle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_LessThan(String statementTitle) {
        regStatementTitle(CK_LT, fRES(statementTitle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_GreaterEqual(String statementTitle) {
        regStatementTitle(CK_GE, fRES(statementTitle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_LessEqual(String statementTitle) {
        regStatementTitle(CK_LE, fRES(statementTitle));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitleList The collection of statementTitle as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_InScope(Collection<String> statementTitleList) {
        doSetStatementTitle_InScope(statementTitleList);
    }

    protected void doSetStatementTitle_InScope(Collection<String> statementTitleList) {
        regINS(CK_INS, cTL(statementTitleList), xgetCValueStatementTitle(), "STATEMENT_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitleList The collection of statementTitle as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_NotInScope(Collection<String> statementTitleList) {
        doSetStatementTitle_NotInScope(statementTitleList);
    }

    protected void doSetStatementTitle_NotInScope(Collection<String> statementTitleList) {
        regINS(CK_NINS, cTL(statementTitleList), xgetCValueStatementTitle(), "STATEMENT_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)} <br>
     * <pre>e.g. setStatementTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param statementTitle The value of statementTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatementTitle_LikeSearch(String statementTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(statementTitle), xgetCValueStatementTitle(), "STATEMENT_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatementTitle_NotLikeSearch(String statementTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(statementTitle), xgetCValueStatementTitle(), "STATEMENT_TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @param statementTitle The value of statementTitle as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementTitle_PrefixSearch(String statementTitle) {
        setStatementTitle_LikeSearch(statementTitle, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     */
    public void setStatementTitle_IsNull() { regStatementTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     */
    public void setStatementTitle_IsNullOrEmpty() { regStatementTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATEMENT_TITLE: {varchar(255)}
     */
    public void setStatementTitle_IsNotNull() { regStatementTitle(CK_ISNN, DOBJ); }

    protected void regStatementTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatementTitle(), "STATEMENT_TITLE"); }
    protected abstract ConditionValue xgetCValueStatementTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_Equal(String statementUrl) {
        doSetStatementUrl_Equal(fRES(statementUrl));
    }

    protected void doSetStatementUrl_Equal(String statementUrl) {
        regStatementUrl(CK_EQ, statementUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_NotEqual(String statementUrl) {
        doSetStatementUrl_NotEqual(fRES(statementUrl));
    }

    protected void doSetStatementUrl_NotEqual(String statementUrl) {
        regStatementUrl(CK_NES, statementUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_GreaterThan(String statementUrl) {
        regStatementUrl(CK_GT, fRES(statementUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_LessThan(String statementUrl) {
        regStatementUrl(CK_LT, fRES(statementUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_GreaterEqual(String statementUrl) {
        regStatementUrl(CK_GE, fRES(statementUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_LessEqual(String statementUrl) {
        regStatementUrl(CK_LE, fRES(statementUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrlList The collection of statementUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_InScope(Collection<String> statementUrlList) {
        doSetStatementUrl_InScope(statementUrlList);
    }

    protected void doSetStatementUrl_InScope(Collection<String> statementUrlList) {
        regINS(CK_INS, cTL(statementUrlList), xgetCValueStatementUrl(), "STATEMENT_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrlList The collection of statementUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_NotInScope(Collection<String> statementUrlList) {
        doSetStatementUrl_NotInScope(statementUrlList);
    }

    protected void doSetStatementUrl_NotInScope(Collection<String> statementUrlList) {
        regINS(CK_NINS, cTL(statementUrlList), xgetCValueStatementUrl(), "STATEMENT_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATEMENT_URL: {varchar(255)} <br>
     * <pre>e.g. setStatementUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param statementUrl The value of statementUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatementUrl_LikeSearch(String statementUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(statementUrl), xgetCValueStatementUrl(), "STATEMENT_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatementUrl_NotLikeSearch(String statementUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(statementUrl), xgetCValueStatementUrl(), "STATEMENT_URL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     * @param statementUrl The value of statementUrl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatementUrl_PrefixSearch(String statementUrl) {
        setStatementUrl_LikeSearch(statementUrl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     */
    public void setStatementUrl_IsNull() { regStatementUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     */
    public void setStatementUrl_IsNullOrEmpty() { regStatementUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATEMENT_URL: {varchar(255)}
     */
    public void setStatementUrl_IsNotNull() { regStatementUrl(CK_ISNN, DOBJ); }

    protected void regStatementUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatementUrl(), "STATEMENT_URL"); }
    protected abstract ConditionValue xgetCValueStatementUrl();

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
    public HpSLCFunction<MImportTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MImportTypeCB.class);
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
    public HpSLCFunction<MImportTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MImportTypeCB.class);
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
    public HpSLCFunction<MImportTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MImportTypeCB.class);
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
    public HpSLCFunction<MImportTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MImportTypeCB.class);
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
    public HpSLCFunction<MImportTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MImportTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MImportTypeCB&gt;() {
     *     public void query(MImportTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MImportTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MImportTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MImportTypeCQ sq);

    protected MImportTypeCB xcreateScalarConditionCB() {
        MImportTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MImportTypeCB xcreateScalarConditionPartitionByCB() {
        MImportTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MImportTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "IMPORT_TYPE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MImportTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MImportTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MImportTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPORT_TYPE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MImportTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MImportTypeCQ sq);

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
    protected MImportTypeCB newMyCB() {
        return new MImportTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MImportTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

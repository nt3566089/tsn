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
 * The abstract condition-query of W_SGL_ROW_SHIP_INSP_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWSglRowShipInspHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWSglRowShipInspHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_SGL_ROW_SHIP_INSP_H";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_Equal(Long sglRowShipInspHId) {
        doSetSglRowShipInspHId_Equal(sglRowShipInspHId);
    }

    protected void doSetSglRowShipInspHId_Equal(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_EQ, sglRowShipInspHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_NotEqual(Long sglRowShipInspHId) {
        doSetSglRowShipInspHId_NotEqual(sglRowShipInspHId);
    }

    protected void doSetSglRowShipInspHId_NotEqual(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_NES, sglRowShipInspHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_GreaterThan(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_GT, sglRowShipInspHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_LessThan(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_LT, sglRowShipInspHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_GreaterEqual(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_GE, sglRowShipInspHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_LessEqual(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_LE, sglRowShipInspHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sglRowShipInspHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sglRowShipInspHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSglRowShipInspHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHIdList The collection of sglRowShipInspHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_InScope(Collection<Long> sglRowShipInspHIdList) {
        doSetSglRowShipInspHId_InScope(sglRowShipInspHIdList);
    }

    protected void doSetSglRowShipInspHId_InScope(Collection<Long> sglRowShipInspHIdList) {
        regINS(CK_INS, cTL(sglRowShipInspHIdList), xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspHIdList The collection of sglRowShipInspHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_NotInScope(Collection<Long> sglRowShipInspHIdList) {
        doSetSglRowShipInspHId_NotInScope(sglRowShipInspHIdList);
    }

    protected void doSetSglRowShipInspHId_NotInScope(Collection<Long> sglRowShipInspHIdList) {
        regINS(CK_NINS, cTL(sglRowShipInspHIdList), xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SGL_ROW_SHIP_INSP_H_ID from W_SGL_ROW_SHIP_INSP_B where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWSglRowShipInspBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WSglRowShipInspBList for 'exists'. (NotNull)
     */
    public void existsWSglRowShipInspBList(SubQuery<WSglRowShipInspBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSglRowShipInspHId_ExistsReferrer_WSglRowShipInspBList(cb.query());
        registerExistsReferrer(cb.query(), "SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", pp, "wSglRowShipInspBList");
    }
    public abstract String keepSglRowShipInspHId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SGL_ROW_SHIP_INSP_H_ID from W_SGL_ROW_SHIP_INSP_B where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SglRowShipInspHId_NotExistsReferrer_WSglRowShipInspBList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspBList(SubQuery<WSglRowShipInspBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSglRowShipInspHId_NotExistsReferrer_WSglRowShipInspBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", pp, "wSglRowShipInspBList");
    }
    public abstract String keepSglRowShipInspHId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    public void xsderiveWSglRowShipInspBList(String fn, SubQuery<WSglRowShipInspBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSglRowShipInspHId_SpecifyDerivedReferrer_WSglRowShipInspBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", pp, "wSglRowShipInspBList", al, op);
    }
    public abstract String keepSglRowShipInspHId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SGL_ROW_SHIP_INSP_B where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWSglRowShipInspBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspBCB> derivedWSglRowShipInspBList() {
        return xcreateQDRFunctionWSglRowShipInspBList();
    }
    protected HpQDRFunction<WSglRowShipInspBCB> xcreateQDRFunctionWSglRowShipInspBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWSglRowShipInspBList(fn, sq, rd, vl, op));
    }
    public void xqderiveWSglRowShipInspBList(String fn, SubQuery<WSglRowShipInspBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSglRowShipInspHId_QueryDerivedReferrer_WSglRowShipInspBList(cb.query()); String prpp = keepSglRowShipInspHId_QueryDerivedReferrer_WSglRowShipInspBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", sqpp, "wSglRowShipInspBList", rd, vl, prpp, op);
    }
    public abstract String keepSglRowShipInspHId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);
    public abstract String keepSglRowShipInspHId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSglRowShipInspHId_IsNull() { regSglRowShipInspHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSglRowShipInspHId_IsNotNull() { regSglRowShipInspHId(CK_ISNN, DOBJ); }

    protected void regSglRowShipInspHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID"); }
    protected abstract ConditionValue xgetCValueSglRowShipInspHId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
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
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_Equal(String pickingGroupNo) {
        doSetPickingGroupNo_Equal(fRES(pickingGroupNo));
    }

    protected void doSetPickingGroupNo_Equal(String pickingGroupNo) {
        regPickingGroupNo(CK_EQ, pickingGroupNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_NotEqual(String pickingGroupNo) {
        doSetPickingGroupNo_NotEqual(fRES(pickingGroupNo));
    }

    protected void doSetPickingGroupNo_NotEqual(String pickingGroupNo) {
        regPickingGroupNo(CK_NES, pickingGroupNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_GreaterThan(String pickingGroupNo) {
        regPickingGroupNo(CK_GT, fRES(pickingGroupNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_LessThan(String pickingGroupNo) {
        regPickingGroupNo(CK_LT, fRES(pickingGroupNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_GreaterEqual(String pickingGroupNo) {
        regPickingGroupNo(CK_GE, fRES(pickingGroupNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_LessEqual(String pickingGroupNo) {
        regPickingGroupNo(CK_LE, fRES(pickingGroupNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNoList The collection of pickingGroupNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_InScope(Collection<String> pickingGroupNoList) {
        doSetPickingGroupNo_InScope(pickingGroupNoList);
    }

    protected void doSetPickingGroupNo_InScope(Collection<String> pickingGroupNoList) {
        regINS(CK_INS, cTL(pickingGroupNoList), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNoList The collection of pickingGroupNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_NotInScope(Collection<String> pickingGroupNoList) {
        doSetPickingGroupNo_NotInScope(pickingGroupNoList);
    }

    protected void doSetPickingGroupNo_NotInScope(Collection<String> pickingGroupNoList) {
        regINS(CK_NINS, cTL(pickingGroupNoList), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setPickingGroupNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingGroupNo The value of pickingGroupNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingGroupNo_LikeSearch(String pickingGroupNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingGroupNo), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingGroupNo_NotLikeSearch(String pickingGroupNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingGroupNo), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @param pickingGroupNo The value of pickingGroupNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_PrefixSearch(String pickingGroupNo) {
        setPickingGroupNo_LikeSearch(pickingGroupNo, xcLSOPPre());
    }

    protected void regPickingGroupNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingGroupNo(), "PICKING_GROUP_NO"); }
    protected abstract ConditionValue xgetCValuePickingGroupNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_Equal(String tempNo) {
        doSetTempNo_Equal(fRES(tempNo));
    }

    protected void doSetTempNo_Equal(String tempNo) {
        regTempNo(CK_EQ, tempNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_NotEqual(String tempNo) {
        doSetTempNo_NotEqual(fRES(tempNo));
    }

    protected void doSetTempNo_NotEqual(String tempNo) {
        regTempNo(CK_NES, tempNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_GreaterThan(String tempNo) {
        regTempNo(CK_GT, fRES(tempNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_LessThan(String tempNo) {
        regTempNo(CK_LT, fRES(tempNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_GreaterEqual(String tempNo) {
        regTempNo(CK_GE, fRES(tempNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_LessEqual(String tempNo) {
        regTempNo(CK_LE, fRES(tempNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNoList The collection of tempNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_InScope(Collection<String> tempNoList) {
        doSetTempNo_InScope(tempNoList);
    }

    protected void doSetTempNo_InScope(Collection<String> tempNoList) {
        regINS(CK_INS, cTL(tempNoList), xgetCValueTempNo(), "TEMP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNoList The collection of tempNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_NotInScope(Collection<String> tempNoList) {
        doSetTempNo_NotInScope(tempNoList);
    }

    protected void doSetTempNo_NotInScope(Collection<String> tempNoList) {
        regINS(CK_NINS, cTL(tempNoList), xgetCValueTempNo(), "TEMP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setTempNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tempNo The value of tempNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTempNo_LikeSearch(String tempNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tempNo), xgetCValueTempNo(), "TEMP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTempNo_NotLikeSearch(String tempNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tempNo), xgetCValueTempNo(), "TEMP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @param tempNo The value of tempNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_PrefixSearch(String tempNo) {
        setTempNo_LikeSearch(tempNo, xcLSOPPre());
    }

    protected void regTempNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTempNo(), "TEMP_NO"); }
    protected abstract ConditionValue xgetCValueTempNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNum The value of workInstNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkInstNum_Equal(Long workInstNum) {
        doSetWorkInstNum_Equal(workInstNum);
    }

    protected void doSetWorkInstNum_Equal(Long workInstNum) {
        regWorkInstNum(CK_EQ, workInstNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNum The value of workInstNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkInstNum_NotEqual(Long workInstNum) {
        doSetWorkInstNum_NotEqual(workInstNum);
    }

    protected void doSetWorkInstNum_NotEqual(Long workInstNum) {
        regWorkInstNum(CK_NES, workInstNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNum The value of workInstNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkInstNum_GreaterThan(Long workInstNum) {
        regWorkInstNum(CK_GT, workInstNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNum The value of workInstNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkInstNum_LessThan(Long workInstNum) {
        regWorkInstNum(CK_LT, workInstNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNum The value of workInstNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkInstNum_GreaterEqual(Long workInstNum) {
        regWorkInstNum(CK_GE, workInstNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNum The value of workInstNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkInstNum_LessEqual(Long workInstNum) {
        regWorkInstNum(CK_LE, workInstNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of workInstNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workInstNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkInstNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkInstNum(), "WORK_INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNumList The collection of workInstNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkInstNum_InScope(Collection<Long> workInstNumList) {
        doSetWorkInstNum_InScope(workInstNumList);
    }

    protected void doSetWorkInstNum_InScope(Collection<Long> workInstNumList) {
        regINS(CK_INS, cTL(workInstNumList), xgetCValueWorkInstNum(), "WORK_INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @param workInstNumList The collection of workInstNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkInstNum_NotInScope(Collection<Long> workInstNumList) {
        doSetWorkInstNum_NotInScope(workInstNumList);
    }

    protected void doSetWorkInstNum_NotInScope(Collection<Long> workInstNumList) {
        regINS(CK_NINS, cTL(workInstNumList), xgetCValueWorkInstNum(), "WORK_INST_NUM");
    }

    protected void regWorkInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkInstNum(), "WORK_INST_NUM"); }
    protected abstract ConditionValue xgetCValueWorkInstNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNum The value of slipNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipNum_Equal(Long slipNum) {
        doSetSlipNum_Equal(slipNum);
    }

    protected void doSetSlipNum_Equal(Long slipNum) {
        regSlipNum(CK_EQ, slipNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNum The value of slipNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipNum_NotEqual(Long slipNum) {
        doSetSlipNum_NotEqual(slipNum);
    }

    protected void doSetSlipNum_NotEqual(Long slipNum) {
        regSlipNum(CK_NES, slipNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNum The value of slipNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipNum_GreaterThan(Long slipNum) {
        regSlipNum(CK_GT, slipNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNum The value of slipNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipNum_LessThan(Long slipNum) {
        regSlipNum(CK_LT, slipNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNum The value of slipNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipNum_GreaterEqual(Long slipNum) {
        regSlipNum(CK_GE, slipNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNum The value of slipNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipNum_LessEqual(Long slipNum) {
        regSlipNum(CK_LE, slipNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param minNumber The min number of slipNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slipNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlipNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipNum(), "SLIP_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNumList The collection of slipNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNum_InScope(Collection<Long> slipNumList) {
        doSetSlipNum_InScope(slipNumList);
    }

    protected void doSetSlipNum_InScope(Collection<Long> slipNumList) {
        regINS(CK_INS, cTL(slipNumList), xgetCValueSlipNum(), "SLIP_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     * @param slipNumList The collection of slipNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNum_NotInScope(Collection<Long> slipNumList) {
        doSetSlipNum_NotInScope(slipNumList);
    }

    protected void doSetSlipNum_NotInScope(Collection<Long> slipNumList) {
        regINS(CK_NINS, cTL(slipNumList), xgetCValueSlipNum(), "SLIP_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     */
    public void setSlipNum_IsNull() { regSlipNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_NUM: {bigint(19)}
     */
    public void setSlipNum_IsNotNull() { regSlipNum(CK_ISNN, DOBJ); }

    protected void regSlipNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipNum(), "SLIP_NUM"); }
    protected abstract ConditionValue xgetCValueSlipNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNum The value of inspectedSlipNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_Equal(Long inspectedSlipNum) {
        doSetInspectedSlipNum_Equal(inspectedSlipNum);
    }

    protected void doSetInspectedSlipNum_Equal(Long inspectedSlipNum) {
        regInspectedSlipNum(CK_EQ, inspectedSlipNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNum The value of inspectedSlipNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_NotEqual(Long inspectedSlipNum) {
        doSetInspectedSlipNum_NotEqual(inspectedSlipNum);
    }

    protected void doSetInspectedSlipNum_NotEqual(Long inspectedSlipNum) {
        regInspectedSlipNum(CK_NES, inspectedSlipNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNum The value of inspectedSlipNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_GreaterThan(Long inspectedSlipNum) {
        regInspectedSlipNum(CK_GT, inspectedSlipNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNum The value of inspectedSlipNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_LessThan(Long inspectedSlipNum) {
        regInspectedSlipNum(CK_LT, inspectedSlipNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNum The value of inspectedSlipNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_GreaterEqual(Long inspectedSlipNum) {
        regInspectedSlipNum(CK_GE, inspectedSlipNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNum The value of inspectedSlipNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_LessEqual(Long inspectedSlipNum) {
        regInspectedSlipNum(CK_LE, inspectedSlipNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param minNumber The min number of inspectedSlipNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedSlipNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedSlipNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedSlipNum(), "INSPECTED_SLIP_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNumList The collection of inspectedSlipNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_InScope(Collection<Long> inspectedSlipNumList) {
        doSetInspectedSlipNum_InScope(inspectedSlipNumList);
    }

    protected void doSetInspectedSlipNum_InScope(Collection<Long> inspectedSlipNumList) {
        regINS(CK_INS, cTL(inspectedSlipNumList), xgetCValueInspectedSlipNum(), "INSPECTED_SLIP_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @param inspectedSlipNumList The collection of inspectedSlipNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedSlipNum_NotInScope(Collection<Long> inspectedSlipNumList) {
        doSetInspectedSlipNum_NotInScope(inspectedSlipNumList);
    }

    protected void doSetInspectedSlipNum_NotInScope(Collection<Long> inspectedSlipNumList) {
        regINS(CK_NINS, cTL(inspectedSlipNumList), xgetCValueInspectedSlipNum(), "INSPECTED_SLIP_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     */
    public void setInspectedSlipNum_IsNull() { regInspectedSlipNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTED_SLIP_NUM: {bigint(19)}
     */
    public void setInspectedSlipNum_IsNotNull() { regInspectedSlipNum(CK_ISNN, DOBJ); }

    protected void regInspectedSlipNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedSlipNum(), "INSPECTED_SLIP_NUM"); }
    protected abstract ConditionValue xgetCValueInspectedSlipNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_Equal(Long boxId) {
        doSetBoxId_Equal(boxId);
    }

    protected void doSetBoxId_Equal(Long boxId) {
        regBoxId(CK_EQ, boxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_NotEqual(Long boxId) {
        doSetBoxId_NotEqual(boxId);
    }

    protected void doSetBoxId_NotEqual(Long boxId) {
        regBoxId(CK_NES, boxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxIdList The collection of boxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_InScope(Collection<Long> boxIdList) {
        doSetBoxId_InScope(boxIdList);
    }

    protected void doSetBoxId_InScope(Collection<Long> boxIdList) {
        regINS(CK_INS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxIdList The collection of boxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_NotInScope(Collection<Long> boxIdList) {
        doSetBoxId_NotInScope(boxIdList);
    }

    protected void doSetBoxId_NotInScope(Collection<Long> boxIdList) {
        regINS(CK_NINS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'in-scope'. (NotNull)
     */
    public void inScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_InScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", false);
    }
    public abstract String keepBoxId_InScopeRelation_MBox(MBoxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_NotInScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", true);
    }
    public abstract String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setBoxId_IsNull() { regBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setBoxId_IsNotNull() { regBoxId(CK_ISNN, DOBJ); }

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

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
    public HpSLCFunction<WSglRowShipInspHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WSglRowShipInspHCB.class);
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
    public HpSLCFunction<WSglRowShipInspHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WSglRowShipInspHCB.class);
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
    public HpSLCFunction<WSglRowShipInspHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WSglRowShipInspHCB.class);
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
    public HpSLCFunction<WSglRowShipInspHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WSglRowShipInspHCB.class);
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
    public HpSLCFunction<WSglRowShipInspHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WSglRowShipInspHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WSglRowShipInspHCB&gt;() {
     *     public void query(WSglRowShipInspHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WSglRowShipInspHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WSglRowShipInspHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WSglRowShipInspHCQ sq);

    protected WSglRowShipInspHCB xcreateScalarConditionCB() {
        WSglRowShipInspHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WSglRowShipInspHCB xcreateScalarConditionPartitionByCB() {
        WSglRowShipInspHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SGL_ROW_SHIP_INSP_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WSglRowShipInspHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WSglRowShipInspHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SGL_ROW_SHIP_INSP_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WSglRowShipInspHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WSglRowShipInspHCQ sq);

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
    protected WSglRowShipInspHCB newMyCB() {
        return new WSglRowShipInspHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WSglRowShipInspHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

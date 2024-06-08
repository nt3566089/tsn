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
 * The abstract condition-query of W_SGL_ROW_SHIP_INSP_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWSglRowShipInspBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWSglRowShipInspBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_SGL_ROW_SHIP_INSP_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBId The value of sglRowShipInspBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_Equal(Long sglRowShipInspBId) {
        doSetSglRowShipInspBId_Equal(sglRowShipInspBId);
    }

    protected void doSetSglRowShipInspBId_Equal(Long sglRowShipInspBId) {
        regSglRowShipInspBId(CK_EQ, sglRowShipInspBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBId The value of sglRowShipInspBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_NotEqual(Long sglRowShipInspBId) {
        doSetSglRowShipInspBId_NotEqual(sglRowShipInspBId);
    }

    protected void doSetSglRowShipInspBId_NotEqual(Long sglRowShipInspBId) {
        regSglRowShipInspBId(CK_NES, sglRowShipInspBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBId The value of sglRowShipInspBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_GreaterThan(Long sglRowShipInspBId) {
        regSglRowShipInspBId(CK_GT, sglRowShipInspBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBId The value of sglRowShipInspBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_LessThan(Long sglRowShipInspBId) {
        regSglRowShipInspBId(CK_LT, sglRowShipInspBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBId The value of sglRowShipInspBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_GreaterEqual(Long sglRowShipInspBId) {
        regSglRowShipInspBId(CK_GE, sglRowShipInspBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBId The value of sglRowShipInspBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_LessEqual(Long sglRowShipInspBId) {
        regSglRowShipInspBId(CK_LE, sglRowShipInspBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sglRowShipInspBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sglRowShipInspBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSglRowShipInspBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSglRowShipInspBId(), "SGL_ROW_SHIP_INSP_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBIdList The collection of sglRowShipInspBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_InScope(Collection<Long> sglRowShipInspBIdList) {
        doSetSglRowShipInspBId_InScope(sglRowShipInspBIdList);
    }

    protected void doSetSglRowShipInspBId_InScope(Collection<Long> sglRowShipInspBIdList) {
        regINS(CK_INS, cTL(sglRowShipInspBIdList), xgetCValueSglRowShipInspBId(), "SGL_ROW_SHIP_INSP_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sglRowShipInspBIdList The collection of sglRowShipInspBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowShipInspBId_NotInScope(Collection<Long> sglRowShipInspBIdList) {
        doSetSglRowShipInspBId_NotInScope(sglRowShipInspBIdList);
    }

    protected void doSetSglRowShipInspBId_NotInScope(Collection<Long> sglRowShipInspBIdList) {
        regINS(CK_NINS, cTL(sglRowShipInspBIdList), xgetCValueSglRowShipInspBId(), "SGL_ROW_SHIP_INSP_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSglRowShipInspBId_IsNull() { regSglRowShipInspBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSglRowShipInspBId_IsNotNull() { regSglRowShipInspBId(CK_ISNN, DOBJ); }

    protected void regSglRowShipInspBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowShipInspBId(), "SGL_ROW_SHIP_INSP_B_ID"); }
    protected abstract ConditionValue xgetCValueSglRowShipInspBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
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
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
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
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_GreaterThan(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_GT, sglRowShipInspHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_LessThan(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_LT, sglRowShipInspHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_GreaterEqual(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_GE, sglRowShipInspHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @param sglRowShipInspHId The value of sglRowShipInspHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_LessEqual(Long sglRowShipInspHId) {
        regSglRowShipInspHId(CK_LE, sglRowShipInspHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @param minNumber The min number of sglRowShipInspHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sglRowShipInspHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSglRowShipInspHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
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
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @param sglRowShipInspHIdList The collection of sglRowShipInspHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowShipInspHId_NotInScope(Collection<Long> sglRowShipInspHIdList) {
        doSetSglRowShipInspHId_NotInScope(sglRowShipInspHIdList);
    }

    protected void doSetSglRowShipInspHId_NotInScope(Collection<Long> sglRowShipInspHIdList) {
        regINS(CK_NINS, cTL(sglRowShipInspHIdList), xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SGL_ROW_SHIP_INSP_H_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br />
     * W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @param subCBLambda The callback for sub-query of WSglRowShipInspH for 'in-scope'. (NotNull)
     */
    public void inScopeWSglRowShipInspH(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSglRowShipInspHId_InScopeRelation_WSglRowShipInspH(cb.query());
        registerInScopeRelation(cb.query(), "SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", pp, "wSglRowShipInspH", false);
    }
    public abstract String keepSglRowShipInspHId_InScopeRelation_WSglRowShipInspH(WSglRowShipInspHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SGL_ROW_SHIP_INSP_H_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br />
     * W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @param subCBLambda The callback for sub-query of WSglRowShipInspH for 'not in-scope'. (NotNull)
     */
    public void notInScopeWSglRowShipInspH(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH(cb.query());
        registerInScopeRelation(cb.query(), "SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", pp, "wSglRowShipInspH", true);
    }
    public abstract String keepSglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH(WSglRowShipInspHCQ sq);

    protected void regSglRowShipInspHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowShipInspHId(), "SGL_ROW_SHIP_INSP_H_ID"); }
    protected abstract ConditionValue xgetCValueSglRowShipInspHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_Equal(Long pickingHId) {
        doSetPickingHId_Equal(pickingHId);
    }

    protected void doSetPickingHId_Equal(Long pickingHId) {
        regPickingHId(CK_EQ, pickingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_NotEqual(Long pickingHId) {
        doSetPickingHId_NotEqual(pickingHId);
    }

    protected void doSetPickingHId_NotEqual(Long pickingHId) {
        regPickingHId(CK_NES, pickingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHIdList The collection of pickingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_InScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_InScope(pickingHIdList);
    }

    protected void doSetPickingHId_InScope(Collection<Long> pickingHIdList) {
        regINS(CK_INS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @param pickingHIdList The collection of pickingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_NotInScope(pickingHIdList);
    }

    protected void doSetPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        regINS(CK_NINS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_H_ID from T_PICKING_H where ...)} <br />
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_InScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", false);
    }
    public abstract String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_H_ID from T_PICKING_H where ...)} <br />
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_NotInScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", true);
    }
    public abstract String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq);

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select USER_ID from B_USER where ...)} <br />
     * B_USER by my USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select USER_ID from B_USER where ...)} <br />
     * B_USER by my USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNum The value of inspectedNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedNum_Equal(Long inspectedNum) {
        doSetInspectedNum_Equal(inspectedNum);
    }

    protected void doSetInspectedNum_Equal(Long inspectedNum) {
        regInspectedNum(CK_EQ, inspectedNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNum The value of inspectedNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedNum_NotEqual(Long inspectedNum) {
        doSetInspectedNum_NotEqual(inspectedNum);
    }

    protected void doSetInspectedNum_NotEqual(Long inspectedNum) {
        regInspectedNum(CK_NES, inspectedNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNum The value of inspectedNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedNum_GreaterThan(Long inspectedNum) {
        regInspectedNum(CK_GT, inspectedNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNum The value of inspectedNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedNum_LessThan(Long inspectedNum) {
        regInspectedNum(CK_LT, inspectedNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNum The value of inspectedNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedNum_GreaterEqual(Long inspectedNum) {
        regInspectedNum(CK_GE, inspectedNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNum The value of inspectedNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedNum_LessEqual(Long inspectedNum) {
        regInspectedNum(CK_LE, inspectedNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedNum(), "INSPECTED_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNumList The collection of inspectedNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedNum_InScope(Collection<Long> inspectedNumList) {
        doSetInspectedNum_InScope(inspectedNumList);
    }

    protected void doSetInspectedNum_InScope(Collection<Long> inspectedNumList) {
        regINS(CK_INS, cTL(inspectedNumList), xgetCValueInspectedNum(), "INSPECTED_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedNumList The collection of inspectedNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedNum_NotInScope(Collection<Long> inspectedNumList) {
        doSetInspectedNum_NotInScope(inspectedNumList);
    }

    protected void doSetInspectedNum_NotInScope(Collection<Long> inspectedNumList) {
        regINS(CK_NINS, cTL(inspectedNumList), xgetCValueInspectedNum(), "INSPECTED_NUM");
    }

    protected void regInspectedNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedNum(), "INSPECTED_NUM"); }
    protected abstract ConditionValue xgetCValueInspectedNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlg The value of inspectionFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_Equal(String inspectionFlg) {
        doSetInspectionFlg_Equal(fRES(inspectionFlg));
    }

    /**
     * Equal(=). As InspectionFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg cdef) {
        doSetInspectionFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未検品
     */
    public void setInspectionFlg_Equal_$0() {
        setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 検品済
     */
    public void setInspectionFlg_Equal_$1() {
        setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg.$1);
    }

    /**
     * Equal(=). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 検品作業中
     */
    public void setInspectionFlg_Equal_$7() {
        setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg.$7);
    }

    protected void doSetInspectionFlg_Equal(String inspectionFlg) {
        regInspectionFlg(CK_EQ, inspectionFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlg The value of inspectionFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotEqual(String inspectionFlg) {
        doSetInspectionFlg_NotEqual(fRES(inspectionFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InspectionFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg cdef) {
        doSetInspectionFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未検品
     */
    public void setInspectionFlg_NotEqual_$0() {
        setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 検品済
     */
    public void setInspectionFlg_NotEqual_$1() {
        setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 検品作業中
     */
    public void setInspectionFlg_NotEqual_$7() {
        setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg.$7);
    }

    protected void doSetInspectionFlg_NotEqual(String inspectionFlg) {
        regInspectionFlg(CK_NES, inspectionFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlgList The collection of inspectionFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_InScope(Collection<String> inspectionFlgList) {
        doSetInspectionFlg_InScope(inspectionFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InspectionFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_InScope_AsInspectionFlg(Collection<CDef.InspectionFlg> cdefList) {
        doSetInspectionFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInspectionFlg_InScope(Collection<String> inspectionFlgList) {
        regINS(CK_INS, cTL(inspectionFlgList), xgetCValueInspectionFlg(), "INSPECTION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlgList The collection of inspectionFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotInScope(Collection<String> inspectionFlgList) {
        doSetInspectionFlg_NotInScope(inspectionFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InspectionFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotInScope_AsInspectionFlg(Collection<CDef.InspectionFlg> cdefList) {
        doSetInspectionFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInspectionFlg_NotInScope(Collection<String> inspectionFlgList) {
        regINS(CK_NINS, cTL(inspectionFlgList), xgetCValueInspectionFlg(), "INSPECTION_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     */
    public void setInspectionFlg_IsNull() { regInspectionFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     */
    public void setInspectionFlg_IsNotNull() { regInspectionFlg(CK_ISNN, DOBJ); }

    protected void regInspectionFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectionFlg(), "INSPECTION_FLG"); }
    protected abstract ConditionValue xgetCValueInspectionFlg();

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
    public HpSLCFunction<WSglRowShipInspBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WSglRowShipInspBCB.class);
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
    public HpSLCFunction<WSglRowShipInspBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WSglRowShipInspBCB.class);
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
    public HpSLCFunction<WSglRowShipInspBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WSglRowShipInspBCB.class);
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
    public HpSLCFunction<WSglRowShipInspBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WSglRowShipInspBCB.class);
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
    public HpSLCFunction<WSglRowShipInspBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WSglRowShipInspBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WSglRowShipInspBCB&gt;() {
     *     public void query(WSglRowShipInspBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WSglRowShipInspBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WSglRowShipInspBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WSglRowShipInspBCQ sq);

    protected WSglRowShipInspBCB xcreateScalarConditionCB() {
        WSglRowShipInspBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WSglRowShipInspBCB xcreateScalarConditionPartitionByCB() {
        WSglRowShipInspBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WSglRowShipInspBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SGL_ROW_SHIP_INSP_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WSglRowShipInspBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WSglRowShipInspBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SGL_ROW_SHIP_INSP_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WSglRowShipInspBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WSglRowShipInspBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WSglRowShipInspBCQ sq);

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
    protected WSglRowShipInspBCB newMyCB() {
        return new WSglRowShipInspBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WSglRowShipInspBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

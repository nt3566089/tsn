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
 * The abstract condition-query of H_PACKING_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHPackingBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHPackingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_PACKING_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBId The value of packingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_Equal(Long packingBId) {
        doSetPackingBId_Equal(packingBId);
    }

    protected void doSetPackingBId_Equal(Long packingBId) {
        regPackingBId(CK_EQ, packingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBId The value of packingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_NotEqual(Long packingBId) {
        doSetPackingBId_NotEqual(packingBId);
    }

    protected void doSetPackingBId_NotEqual(Long packingBId) {
        regPackingBId(CK_NES, packingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBId The value of packingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_GreaterThan(Long packingBId) {
        regPackingBId(CK_GT, packingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBId The value of packingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_LessThan(Long packingBId) {
        regPackingBId(CK_LT, packingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBId The value of packingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_GreaterEqual(Long packingBId) {
        regPackingBId(CK_GE, packingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBId The value of packingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_LessEqual(Long packingBId) {
        regPackingBId(CK_LE, packingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of packingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingBId(), "PACKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBIdList The collection of packingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingBId_InScope(Collection<Long> packingBIdList) {
        doSetPackingBId_InScope(packingBIdList);
    }

    protected void doSetPackingBId_InScope(Collection<Long> packingBIdList) {
        regINS(CK_INS, cTL(packingBIdList), xgetCValuePackingBId(), "PACKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingBIdList The collection of packingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingBId_NotInScope(Collection<Long> packingBIdList) {
        doSetPackingBId_NotInScope(packingBIdList);
    }

    protected void doSetPackingBId_NotInScope(Collection<Long> packingBIdList) {
        regINS(CK_NINS, cTL(packingBIdList), xgetCValuePackingBId(), "PACKING_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPackingBId_IsNull() { regPackingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPackingBId_IsNotNull() { regPackingBId(CK_ISNN, DOBJ); }

    protected void regPackingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingBId(), "PACKING_B_ID"); }
    protected abstract ConditionValue xgetCValuePackingBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHId The value of packingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_Equal(Long packingHId) {
        doSetPackingHId_Equal(packingHId);
    }

    protected void doSetPackingHId_Equal(Long packingHId) {
        regPackingHId(CK_EQ, packingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHId The value of packingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_NotEqual(Long packingHId) {
        doSetPackingHId_NotEqual(packingHId);
    }

    protected void doSetPackingHId_NotEqual(Long packingHId) {
        regPackingHId(CK_NES, packingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHId The value of packingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterThan(Long packingHId) {
        regPackingHId(CK_GT, packingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHId The value of packingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessThan(Long packingHId) {
        regPackingHId(CK_LT, packingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHId The value of packingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterEqual(Long packingHId) {
        regPackingHId(CK_GE, packingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHId The value of packingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessEqual(Long packingHId) {
        regPackingHId(CK_LE, packingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param minNumber The min number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingHId(), "PACKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHIdList The collection of packingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_InScope(Collection<Long> packingHIdList) {
        doSetPackingHId_InScope(packingHIdList);
    }

    protected void doSetPackingHId_InScope(Collection<Long> packingHIdList) {
        regINS(CK_INS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @param packingHIdList The collection of packingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_NotInScope(Collection<Long> packingHIdList) {
        doSetPackingHId_NotInScope(packingHIdList);
    }

    protected void doSetPackingHId_NotInScope(Collection<Long> packingHIdList) {
        regINS(CK_NINS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_H_ID from H_PACKING_H where ...)} <br />
     * H_PACKING_H by my PACKING_H_ID, named 'HPackingH'.
     * @param subCBLambda The callback for sub-query of HPackingH for 'in-scope'. (NotNull)
     */
    public void inScopeHPackingH(SubQuery<HPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_InScopeRelation_HPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "hPackingH", false);
    }
    public abstract String keepPackingHId_InScopeRelation_HPackingH(HPackingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_H_ID from H_PACKING_H where ...)} <br />
     * H_PACKING_H by my PACKING_H_ID, named 'HPackingH'.
     * @param subCBLambda The callback for sub-query of HPackingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeHPackingH(SubQuery<HPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_NotInScopeRelation_HPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "hPackingH", true);
    }
    public abstract String keepPackingHId_NotInScopeRelation_HPackingH(HPackingHCQ sq);

    protected void regPackingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingHId(), "PACKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePackingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_Equal(Long shippingInstBId) {
        doSetShippingInstBId_Equal(shippingInstBId);
    }

    protected void doSetShippingInstBId_Equal(Long shippingInstBId) {
        regShippingInstBId(CK_EQ, shippingInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotEqual(Long shippingInstBId) {
        doSetShippingInstBId_NotEqual(shippingInstBId);
    }

    protected void doSetShippingInstBId_NotEqual(Long shippingInstBId) {
        regShippingInstBId(CK_NES, shippingInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterThan(Long shippingInstBId) {
        regShippingInstBId(CK_GT, shippingInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessThan(Long shippingInstBId) {
        regShippingInstBId(CK_LT, shippingInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterEqual(Long shippingInstBId) {
        regShippingInstBId(CK_GE, shippingInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessEqual(Long shippingInstBId) {
        regShippingInstBId(CK_LE, shippingInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param minNumber The min number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBIdList The collection of shippingInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_InScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_INS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @param shippingInstBIdList The collection of shippingInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_NotInScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_NINS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_B_ID from H_SHIPPING_B where ...)} <br />
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @param subCBLambda The callback for sub-query of HShippingB for 'in-scope'. (NotNull)
     */
    public void inScopeHShippingB(SubQuery<HShippingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_InScopeRelation_HShippingB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "hShippingB", false);
    }
    public abstract String keepShippingInstBId_InScopeRelation_HShippingB(HShippingBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_B_ID from H_SHIPPING_B where ...)} <br />
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @param subCBLambda The callback for sub-query of HShippingB for 'not in-scope'. (NotNull)
     */
    public void notInScopeHShippingB(SubQuery<HShippingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_NotInScopeRelation_HShippingB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "hShippingB", true);
    }
    public abstract String keepShippingInstBId_NotInScopeRelation_HShippingB(HShippingBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     */
    public void setShippingInstBId_IsNull() { regShippingInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     */
    public void setShippingInstBId_IsNotNull() { regShippingInstBId(CK_ISNN, DOBJ); }

    protected void regShippingInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from H_STOCK where ...)} <br />
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @param subCBLambda The callback for sub-query of HStock for 'in-scope'. (NotNull)
     */
    public void inScopeHStock(SubQuery<HStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockCB cb = new HStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_HStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "hStock", false);
    }
    public abstract String keepStockId_InScopeRelation_HStock(HStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from H_STOCK where ...)} <br />
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @param subCBLambda The callback for sub-query of HStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeHStock(SubQuery<HStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockCB cb = new HStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_HStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "hStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_HStock(HStockCQ sq);

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNum The value of packingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_Equal(java.math.BigDecimal packingNum) {
        doSetPackingNum_Equal(packingNum);
    }

    protected void doSetPackingNum_Equal(java.math.BigDecimal packingNum) {
        regPackingNum(CK_EQ, packingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNum The value of packingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_NotEqual(java.math.BigDecimal packingNum) {
        doSetPackingNum_NotEqual(packingNum);
    }

    protected void doSetPackingNum_NotEqual(java.math.BigDecimal packingNum) {
        regPackingNum(CK_NES, packingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNum The value of packingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_GreaterThan(java.math.BigDecimal packingNum) {
        regPackingNum(CK_GT, packingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNum The value of packingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_LessThan(java.math.BigDecimal packingNum) {
        regPackingNum(CK_LT, packingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNum The value of packingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_GreaterEqual(java.math.BigDecimal packingNum) {
        regPackingNum(CK_GE, packingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNum The value of packingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_LessEqual(java.math.BigDecimal packingNum) {
        regPackingNum(CK_LE, packingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param minNumber The min number of packingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingNum(), "PACKING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNumList The collection of packingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNum_InScope(Collection<java.math.BigDecimal> packingNumList) {
        doSetPackingNum_InScope(packingNumList);
    }

    protected void doSetPackingNum_InScope(Collection<java.math.BigDecimal> packingNumList) {
        regINS(CK_INS, cTL(packingNumList), xgetCValuePackingNum(), "PACKING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @param packingNumList The collection of packingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNum_NotInScope(Collection<java.math.BigDecimal> packingNumList) {
        doSetPackingNum_NotInScope(packingNumList);
    }

    protected void doSetPackingNum_NotInScope(Collection<java.math.BigDecimal> packingNumList) {
        regINS(CK_NINS, cTL(packingNumList), xgetCValuePackingNum(), "PACKING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     */
    public void setPackingNum_IsNull() { regPackingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_NUM: {decimal(16, 6)}
     */
    public void setPackingNum_IsNotNull() { regPackingNum(CK_ISNN, DOBJ); }

    protected void regPackingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingNum(), "PACKING_NUM"); }
    protected abstract ConditionValue xgetCValuePackingNum();

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
    public HpSLCFunction<HPackingBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HPackingBCB.class);
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
    public HpSLCFunction<HPackingBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HPackingBCB.class);
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
    public HpSLCFunction<HPackingBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HPackingBCB.class);
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
    public HpSLCFunction<HPackingBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HPackingBCB.class);
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
    public HpSLCFunction<HPackingBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HPackingBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HPackingBCB&gt;() {
     *     public void query(HPackingBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HPackingBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HPackingBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HPackingBCQ sq);

    protected HPackingBCB xcreateScalarConditionCB() {
        HPackingBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HPackingBCB xcreateScalarConditionPartitionByCB() {
        HPackingBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HPackingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HPackingBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HPackingBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HPackingBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HPackingBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HPackingBCQ sq);

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
    protected HPackingBCB newMyCB() {
        return new HPackingBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HPackingBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

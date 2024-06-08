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
 * The abstract condition-query of T_INVENTORY_INST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTInventoryInstCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTInventoryInstCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_INVENTORY_INST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstId The value of inventoryInstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstId_Equal(Long inventoryInstId) {
        doSetInventoryInstId_Equal(inventoryInstId);
    }

    protected void doSetInventoryInstId_Equal(Long inventoryInstId) {
        regInventoryInstId(CK_EQ, inventoryInstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstId The value of inventoryInstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstId_NotEqual(Long inventoryInstId) {
        doSetInventoryInstId_NotEqual(inventoryInstId);
    }

    protected void doSetInventoryInstId_NotEqual(Long inventoryInstId) {
        regInventoryInstId(CK_NES, inventoryInstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstId The value of inventoryInstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstId_GreaterThan(Long inventoryInstId) {
        regInventoryInstId(CK_GT, inventoryInstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstId The value of inventoryInstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstId_LessThan(Long inventoryInstId) {
        regInventoryInstId(CK_LT, inventoryInstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstId The value of inventoryInstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstId_GreaterEqual(Long inventoryInstId) {
        regInventoryInstId(CK_GE, inventoryInstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstId The value of inventoryInstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstId_LessEqual(Long inventoryInstId) {
        regInventoryInstId(CK_LE, inventoryInstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of inventoryInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryInstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryInstId(), "INVENTORY_INST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstIdList The collection of inventoryInstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstId_InScope(Collection<Long> inventoryInstIdList) {
        doSetInventoryInstId_InScope(inventoryInstIdList);
    }

    protected void doSetInventoryInstId_InScope(Collection<Long> inventoryInstIdList) {
        regINS(CK_INS, cTL(inventoryInstIdList), xgetCValueInventoryInstId(), "INVENTORY_INST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryInstIdList The collection of inventoryInstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstId_NotInScope(Collection<Long> inventoryInstIdList) {
        doSetInventoryInstId_NotInScope(inventoryInstIdList);
    }

    protected void doSetInventoryInstId_NotInScope(Collection<Long> inventoryInstIdList) {
        regINS(CK_NINS, cTL(inventoryInstIdList), xgetCValueInventoryInstId(), "INVENTORY_INST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryInstId_IsNull() { regInventoryInstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryInstId_IsNotNull() { regInventoryInstId(CK_ISNN, DOBJ); }

    protected void regInventoryInstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryInstId(), "INVENTORY_INST_ID"); }
    protected abstract ConditionValue xgetCValueInventoryInstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_Equal(Long inventoryHId) {
        doSetInventoryHId_Equal(inventoryHId);
    }

    protected void doSetInventoryHId_Equal(Long inventoryHId) {
        regInventoryHId(CK_EQ, inventoryHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_NotEqual(Long inventoryHId) {
        doSetInventoryHId_NotEqual(inventoryHId);
    }

    protected void doSetInventoryHId_NotEqual(Long inventoryHId) {
        regInventoryHId(CK_NES, inventoryHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterThan(Long inventoryHId) {
        regInventoryHId(CK_GT, inventoryHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessThan(Long inventoryHId) {
        regInventoryHId(CK_LT, inventoryHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterEqual(Long inventoryHId) {
        regInventoryHId(CK_GE, inventoryHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessEqual(Long inventoryHId) {
        regInventoryHId(CK_LE, inventoryHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param minNumber The min number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryHId(), "INVENTORY_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHIdList The collection of inventoryHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_InScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        regINS(CK_INS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHIdList The collection of inventoryHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_NotInScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        regINS(CK_NINS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_H_ID from T_INVENTORY_H where ...)} <br />
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @param subCBLambda The callback for sub-query of TInventoryH for 'in-scope'. (NotNull)
     */
    public void inScopeTInventoryH(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryHId_InScopeRelation_TInventoryH(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryH", false);
    }
    public abstract String keepInventoryHId_InScopeRelation_TInventoryH(TInventoryHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_H_ID from T_INVENTORY_H where ...)} <br />
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @param subCBLambda The callback for sub-query of TInventoryH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTInventoryH(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryHId_NotInScopeRelation_TInventoryH(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryH", true);
    }
    public abstract String keepInventoryHId_NotInScopeRelation_TInventoryH(TInventoryHCQ sq);

    protected void regInventoryHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryHId(), "INVENTORY_H_ID"); }
    protected abstract ConditionValue xgetCValueInventoryHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_Equal(Long depositId) {
        doSetDepositId_Equal(depositId);
    }

    protected void doSetDepositId_Equal(Long depositId) {
        regDepositId(CK_EQ, depositId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_NotEqual(Long depositId) {
        doSetDepositId_NotEqual(depositId);
    }

    protected void doSetDepositId_NotEqual(Long depositId) {
        regDepositId(CK_NES, depositId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterThan(Long depositId) {
        regDepositId(CK_GT, depositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessThan(Long depositId) {
        regDepositId(CK_LT, depositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterEqual(Long depositId) {
        regDepositId(CK_GE, depositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessEqual(Long depositId) {
        regDepositId(CK_LE, depositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDepositId(), "DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositIdList The collection of depositId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositId_InScope(Collection<Long> depositIdList) {
        doSetDepositId_InScope(depositIdList);
    }

    protected void doSetDepositId_InScope(Collection<Long> depositIdList) {
        regINS(CK_INS, cTL(depositIdList), xgetCValueDepositId(), "DEPOSIT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositIdList The collection of depositId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositId_NotInScope(Collection<Long> depositIdList) {
        doSetDepositId_NotInScope(depositIdList);
    }

    protected void doSetDepositId_NotInScope(Collection<Long> depositIdList) {
        regINS(CK_NINS, cTL(depositIdList), xgetCValueDepositId(), "DEPOSIT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DEPOSIT_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DEPOSIT_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setDepositId_IsNull() { regDepositId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setDepositId_IsNotNull() { regDepositId(CK_ISNN, DOBJ); }

    protected void regDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositId(), "DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValueDepositId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_Equal(Long stockTypeId) {
        doSetStockTypeId_Equal(stockTypeId);
    }

    protected void doSetStockTypeId_Equal(Long stockTypeId) {
        regStockTypeId(CK_EQ, stockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_NotEqual(Long stockTypeId) {
        doSetStockTypeId_NotEqual(stockTypeId);
    }

    protected void doSetStockTypeId_NotEqual(Long stockTypeId) {
        regStockTypeId(CK_NES, stockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterThan(Long stockTypeId) {
        regStockTypeId(CK_GT, stockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessThan(Long stockTypeId) {
        regStockTypeId(CK_LT, stockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterEqual(Long stockTypeId) {
        regStockTypeId(CK_GE, stockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessEqual(Long stockTypeId) {
        regStockTypeId(CK_LE, stockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param minNumber The min number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockTypeId(), "STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeIdList The collection of stockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_InScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        regINS(CK_INS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeIdList The collection of stockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_NotInScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        regINS(CK_NINS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_TYPE_ID from M_STOCK_TYPE where ...)} <br />
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_TYPE_ID from M_STOCK_TYPE where ...)} <br />
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     */
    public void setStockTypeId_IsNull() { regStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     */
    public void setStockTypeId_IsNotNull() { regStockTypeId(CK_ISNN, DOBJ); }

    protected void regStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeId(), "STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueStockTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_Equal(String fromLocationCd) {
        doSetFromLocationCd_Equal(fRES(fromLocationCd));
    }

    protected void doSetFromLocationCd_Equal(String fromLocationCd) {
        regFromLocationCd(CK_EQ, fromLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_NotEqual(String fromLocationCd) {
        doSetFromLocationCd_NotEqual(fRES(fromLocationCd));
    }

    protected void doSetFromLocationCd_NotEqual(String fromLocationCd) {
        regFromLocationCd(CK_NES, fromLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_GreaterThan(String fromLocationCd) {
        regFromLocationCd(CK_GT, fRES(fromLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_LessThan(String fromLocationCd) {
        regFromLocationCd(CK_LT, fRES(fromLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_GreaterEqual(String fromLocationCd) {
        regFromLocationCd(CK_GE, fRES(fromLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_LessEqual(String fromLocationCd) {
        regFromLocationCd(CK_LE, fRES(fromLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCdList The collection of fromLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_InScope(Collection<String> fromLocationCdList) {
        doSetFromLocationCd_InScope(fromLocationCdList);
    }

    protected void doSetFromLocationCd_InScope(Collection<String> fromLocationCdList) {
        regINS(CK_INS, cTL(fromLocationCdList), xgetCValueFromLocationCd(), "FROM_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCdList The collection of fromLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_NotInScope(Collection<String> fromLocationCdList) {
        doSetFromLocationCd_NotInScope(fromLocationCdList);
    }

    protected void doSetFromLocationCd_NotInScope(Collection<String> fromLocationCdList) {
        regINS(CK_NINS, cTL(fromLocationCdList), xgetCValueFromLocationCd(), "FROM_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setFromLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromLocationCd The value of fromLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromLocationCd_LikeSearch(String fromLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromLocationCd), xgetCValueFromLocationCd(), "FROM_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromLocationCd_NotLikeSearch(String fromLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromLocationCd), xgetCValueFromLocationCd(), "FROM_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @param fromLocationCd The value of fromLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationCd_PrefixSearch(String fromLocationCd) {
        setFromLocationCd_LikeSearch(fromLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     */
    public void setFromLocationCd_IsNull() { regFromLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     */
    public void setFromLocationCd_IsNullOrEmpty() { regFromLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     */
    public void setFromLocationCd_IsNotNull() { regFromLocationCd(CK_ISNN, DOBJ); }

    protected void regFromLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromLocationCd(), "FROM_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueFromLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_Equal(String toLocationCd) {
        doSetToLocationCd_Equal(fRES(toLocationCd));
    }

    protected void doSetToLocationCd_Equal(String toLocationCd) {
        regToLocationCd(CK_EQ, toLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_NotEqual(String toLocationCd) {
        doSetToLocationCd_NotEqual(fRES(toLocationCd));
    }

    protected void doSetToLocationCd_NotEqual(String toLocationCd) {
        regToLocationCd(CK_NES, toLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_GreaterThan(String toLocationCd) {
        regToLocationCd(CK_GT, fRES(toLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_LessThan(String toLocationCd) {
        regToLocationCd(CK_LT, fRES(toLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_GreaterEqual(String toLocationCd) {
        regToLocationCd(CK_GE, fRES(toLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_LessEqual(String toLocationCd) {
        regToLocationCd(CK_LE, fRES(toLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCdList The collection of toLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_InScope(Collection<String> toLocationCdList) {
        doSetToLocationCd_InScope(toLocationCdList);
    }

    protected void doSetToLocationCd_InScope(Collection<String> toLocationCdList) {
        regINS(CK_INS, cTL(toLocationCdList), xgetCValueToLocationCd(), "TO_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCdList The collection of toLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_NotInScope(Collection<String> toLocationCdList) {
        doSetToLocationCd_NotInScope(toLocationCdList);
    }

    protected void doSetToLocationCd_NotInScope(Collection<String> toLocationCdList) {
        regINS(CK_NINS, cTL(toLocationCdList), xgetCValueToLocationCd(), "TO_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setToLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param toLocationCd The value of toLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToLocationCd_LikeSearch(String toLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(toLocationCd), xgetCValueToLocationCd(), "TO_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setToLocationCd_NotLikeSearch(String toLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(toLocationCd), xgetCValueToLocationCd(), "TO_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @param toLocationCd The value of toLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationCd_PrefixSearch(String toLocationCd) {
        setToLocationCd_LikeSearch(toLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     */
    public void setToLocationCd_IsNull() { regToLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     */
    public void setToLocationCd_IsNullOrEmpty() { regToLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TO_LOCATION_CD: {varchar(30)}
     */
    public void setToLocationCd_IsNotNull() { regToLocationCd(CK_ISNN, DOBJ); }

    protected void regToLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToLocationCd(), "TO_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueToLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneId The value of zoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_Equal(Long zoneId) {
        doSetZoneId_Equal(zoneId);
    }

    protected void doSetZoneId_Equal(Long zoneId) {
        regZoneId(CK_EQ, zoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneId The value of zoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_NotEqual(Long zoneId) {
        doSetZoneId_NotEqual(zoneId);
    }

    protected void doSetZoneId_NotEqual(Long zoneId) {
        regZoneId(CK_NES, zoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneId The value of zoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_GreaterThan(Long zoneId) {
        regZoneId(CK_GT, zoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneId The value of zoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_LessThan(Long zoneId) {
        regZoneId(CK_LT, zoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneId The value of zoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_GreaterEqual(Long zoneId) {
        regZoneId(CK_GE, zoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneId The value of zoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_LessEqual(Long zoneId) {
        regZoneId(CK_LE, zoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param minNumber The min number of zoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZoneId(), "ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneIdList The collection of zoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneId_InScope(Collection<Long> zoneIdList) {
        doSetZoneId_InScope(zoneIdList);
    }

    protected void doSetZoneId_InScope(Collection<Long> zoneIdList) {
        regINS(CK_INS, cTL(zoneIdList), xgetCValueZoneId(), "ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @param zoneIdList The collection of zoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneId_NotInScope(Collection<Long> zoneIdList) {
        doSetZoneId_NotInScope(zoneIdList);
    }

    protected void doSetZoneId_NotInScope(Collection<Long> zoneIdList) {
        regINS(CK_NINS, cTL(zoneIdList), xgetCValueZoneId(), "ZONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ZONE_ID from M_ZONE where ...)} <br />
     * M_ZONE by my ZONE_ID, named 'MZone'.
     * @param subCBLambda The callback for sub-query of MZone for 'in-scope'. (NotNull)
     */
    public void inScopeMZone(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepZoneId_InScopeRelation_MZone(cb.query());
        registerInScopeRelation(cb.query(), "ZONE_ID", "ZONE_ID", pp, "mZone", false);
    }
    public abstract String keepZoneId_InScopeRelation_MZone(MZoneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ZONE_ID from M_ZONE where ...)} <br />
     * M_ZONE by my ZONE_ID, named 'MZone'.
     * @param subCBLambda The callback for sub-query of MZone for 'not in-scope'. (NotNull)
     */
    public void notInScopeMZone(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepZoneId_NotInScopeRelation_MZone(cb.query());
        registerInScopeRelation(cb.query(), "ZONE_ID", "ZONE_ID", pp, "mZone", true);
    }
    public abstract String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     */
    public void setZoneId_IsNull() { regZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     */
    public void setZoneId_IsNotNull() { regZoneId(CK_ISNN, DOBJ); }

    protected void regZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneId(), "ZONE_ID"); }
    protected abstract ConditionValue xgetCValueZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_Equal(String fromStockInoutDt) {
        doSetFromStockInoutDt_Equal(fRES(fromStockInoutDt));
    }

    protected void doSetFromStockInoutDt_Equal(String fromStockInoutDt) {
        regFromStockInoutDt(CK_EQ, fromStockInoutDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_NotEqual(String fromStockInoutDt) {
        doSetFromStockInoutDt_NotEqual(fRES(fromStockInoutDt));
    }

    protected void doSetFromStockInoutDt_NotEqual(String fromStockInoutDt) {
        regFromStockInoutDt(CK_NES, fromStockInoutDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_GreaterThan(String fromStockInoutDt) {
        regFromStockInoutDt(CK_GT, fRES(fromStockInoutDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_LessThan(String fromStockInoutDt) {
        regFromStockInoutDt(CK_LT, fRES(fromStockInoutDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_GreaterEqual(String fromStockInoutDt) {
        regFromStockInoutDt(CK_GE, fRES(fromStockInoutDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_LessEqual(String fromStockInoutDt) {
        regFromStockInoutDt(CK_LE, fRES(fromStockInoutDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDtList The collection of fromStockInoutDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_InScope(Collection<String> fromStockInoutDtList) {
        doSetFromStockInoutDt_InScope(fromStockInoutDtList);
    }

    protected void doSetFromStockInoutDt_InScope(Collection<String> fromStockInoutDtList) {
        regINS(CK_INS, cTL(fromStockInoutDtList), xgetCValueFromStockInoutDt(), "FROM_STOCK_INOUT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDtList The collection of fromStockInoutDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_NotInScope(Collection<String> fromStockInoutDtList) {
        doSetFromStockInoutDt_NotInScope(fromStockInoutDtList);
    }

    protected void doSetFromStockInoutDt_NotInScope(Collection<String> fromStockInoutDtList) {
        regINS(CK_NINS, cTL(fromStockInoutDtList), xgetCValueFromStockInoutDt(), "FROM_STOCK_INOUT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)} <br>
     * <pre>e.g. setFromStockInoutDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromStockInoutDt The value of fromStockInoutDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromStockInoutDt_LikeSearch(String fromStockInoutDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromStockInoutDt), xgetCValueFromStockInoutDt(), "FROM_STOCK_INOUT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromStockInoutDt_NotLikeSearch(String fromStockInoutDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromStockInoutDt), xgetCValueFromStockInoutDt(), "FROM_STOCK_INOUT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @param fromStockInoutDt The value of fromStockInoutDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromStockInoutDt_PrefixSearch(String fromStockInoutDt) {
        setFromStockInoutDt_LikeSearch(fromStockInoutDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     */
    public void setFromStockInoutDt_IsNull() { regFromStockInoutDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     */
    public void setFromStockInoutDt_IsNullOrEmpty() { regFromStockInoutDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     */
    public void setFromStockInoutDt_IsNotNull() { regFromStockInoutDt(CK_ISNN, DOBJ); }

    protected void regFromStockInoutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromStockInoutDt(), "FROM_STOCK_INOUT_DT"); }
    protected abstract ConditionValue xgetCValueFromStockInoutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_Equal(String toStockInoutDt) {
        doSetToStockInoutDt_Equal(fRES(toStockInoutDt));
    }

    protected void doSetToStockInoutDt_Equal(String toStockInoutDt) {
        regToStockInoutDt(CK_EQ, toStockInoutDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_NotEqual(String toStockInoutDt) {
        doSetToStockInoutDt_NotEqual(fRES(toStockInoutDt));
    }

    protected void doSetToStockInoutDt_NotEqual(String toStockInoutDt) {
        regToStockInoutDt(CK_NES, toStockInoutDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_GreaterThan(String toStockInoutDt) {
        regToStockInoutDt(CK_GT, fRES(toStockInoutDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_LessThan(String toStockInoutDt) {
        regToStockInoutDt(CK_LT, fRES(toStockInoutDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_GreaterEqual(String toStockInoutDt) {
        regToStockInoutDt(CK_GE, fRES(toStockInoutDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_LessEqual(String toStockInoutDt) {
        regToStockInoutDt(CK_LE, fRES(toStockInoutDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDtList The collection of toStockInoutDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_InScope(Collection<String> toStockInoutDtList) {
        doSetToStockInoutDt_InScope(toStockInoutDtList);
    }

    protected void doSetToStockInoutDt_InScope(Collection<String> toStockInoutDtList) {
        regINS(CK_INS, cTL(toStockInoutDtList), xgetCValueToStockInoutDt(), "TO_STOCK_INOUT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDtList The collection of toStockInoutDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_NotInScope(Collection<String> toStockInoutDtList) {
        doSetToStockInoutDt_NotInScope(toStockInoutDtList);
    }

    protected void doSetToStockInoutDt_NotInScope(Collection<String> toStockInoutDtList) {
        regINS(CK_NINS, cTL(toStockInoutDtList), xgetCValueToStockInoutDt(), "TO_STOCK_INOUT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)} <br>
     * <pre>e.g. setToStockInoutDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param toStockInoutDt The value of toStockInoutDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToStockInoutDt_LikeSearch(String toStockInoutDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(toStockInoutDt), xgetCValueToStockInoutDt(), "TO_STOCK_INOUT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setToStockInoutDt_NotLikeSearch(String toStockInoutDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(toStockInoutDt), xgetCValueToStockInoutDt(), "TO_STOCK_INOUT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @param toStockInoutDt The value of toStockInoutDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToStockInoutDt_PrefixSearch(String toStockInoutDt) {
        setToStockInoutDt_LikeSearch(toStockInoutDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     */
    public void setToStockInoutDt_IsNull() { regToStockInoutDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     */
    public void setToStockInoutDt_IsNullOrEmpty() { regToStockInoutDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     */
    public void setToStockInoutDt_IsNotNull() { regToStockInoutDt(CK_ISNN, DOBJ); }

    protected void regToStockInoutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToStockInoutDt(), "TO_STOCK_INOUT_DT"); }
    protected abstract ConditionValue xgetCValueToStockInoutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @param stockExistOnlyFlg The value of stockExistOnlyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_Equal(String stockExistOnlyFlg) {
        doSetStockExistOnlyFlg_Equal(fRES(stockExistOnlyFlg));
    }

    /**
     * Equal(=). As StockExistOnlyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_Equal_AsStockExistOnlyFlg(CDef.StockExistOnlyFlg cdef) {
        doSetStockExistOnlyFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 全て
     */
    public void setStockExistOnlyFlg_Equal_$0() {
        setStockExistOnlyFlg_Equal_AsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 在庫有のみ
     */
    public void setStockExistOnlyFlg_Equal_$1() {
        setStockExistOnlyFlg_Equal_AsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$1);
    }

    protected void doSetStockExistOnlyFlg_Equal(String stockExistOnlyFlg) {
        regStockExistOnlyFlg(CK_EQ, stockExistOnlyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @param stockExistOnlyFlg The value of stockExistOnlyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_NotEqual(String stockExistOnlyFlg) {
        doSetStockExistOnlyFlg_NotEqual(fRES(stockExistOnlyFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockExistOnlyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_NotEqual_AsStockExistOnlyFlg(CDef.StockExistOnlyFlg cdef) {
        doSetStockExistOnlyFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 全て
     */
    public void setStockExistOnlyFlg_NotEqual_$0() {
        setStockExistOnlyFlg_NotEqual_AsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 在庫有のみ
     */
    public void setStockExistOnlyFlg_NotEqual_$1() {
        setStockExistOnlyFlg_NotEqual_AsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$1);
    }

    protected void doSetStockExistOnlyFlg_NotEqual(String stockExistOnlyFlg) {
        regStockExistOnlyFlg(CK_NES, stockExistOnlyFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @param stockExistOnlyFlgList The collection of stockExistOnlyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_InScope(Collection<String> stockExistOnlyFlgList) {
        doSetStockExistOnlyFlg_InScope(stockExistOnlyFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockExistOnlyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_InScope_AsStockExistOnlyFlg(Collection<CDef.StockExistOnlyFlg> cdefList) {
        doSetStockExistOnlyFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockExistOnlyFlg_InScope(Collection<String> stockExistOnlyFlgList) {
        regINS(CK_INS, cTL(stockExistOnlyFlgList), xgetCValueStockExistOnlyFlg(), "STOCK_EXIST_ONLY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @param stockExistOnlyFlgList The collection of stockExistOnlyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_NotInScope(Collection<String> stockExistOnlyFlgList) {
        doSetStockExistOnlyFlg_NotInScope(stockExistOnlyFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockExistOnlyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockExistOnlyFlg_NotInScope_AsStockExistOnlyFlg(Collection<CDef.StockExistOnlyFlg> cdefList) {
        doSetStockExistOnlyFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockExistOnlyFlg_NotInScope(Collection<String> stockExistOnlyFlgList) {
        regINS(CK_NINS, cTL(stockExistOnlyFlgList), xgetCValueStockExistOnlyFlg(), "STOCK_EXIST_ONLY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     */
    public void setStockExistOnlyFlg_IsNull() { regStockExistOnlyFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     */
    public void setStockExistOnlyFlg_IsNotNull() { regStockExistOnlyFlg(CK_ISNN, DOBJ); }

    protected void regStockExistOnlyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockExistOnlyFlg(), "STOCK_EXIST_ONLY_FLG"); }
    protected abstract ConditionValue xgetCValueStockExistOnlyFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_Equal(String inventoryInstKbn) {
        doSetInventoryInstKbn_Equal(fRES(inventoryInstKbn));
    }

    protected void doSetInventoryInstKbn_Equal(String inventoryInstKbn) {
        regInventoryInstKbn(CK_EQ, inventoryInstKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_NotEqual(String inventoryInstKbn) {
        doSetInventoryInstKbn_NotEqual(fRES(inventoryInstKbn));
    }

    protected void doSetInventoryInstKbn_NotEqual(String inventoryInstKbn) {
        regInventoryInstKbn(CK_NES, inventoryInstKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_GreaterThan(String inventoryInstKbn) {
        regInventoryInstKbn(CK_GT, fRES(inventoryInstKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_LessThan(String inventoryInstKbn) {
        regInventoryInstKbn(CK_LT, fRES(inventoryInstKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_GreaterEqual(String inventoryInstKbn) {
        regInventoryInstKbn(CK_GE, fRES(inventoryInstKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_LessEqual(String inventoryInstKbn) {
        regInventoryInstKbn(CK_LE, fRES(inventoryInstKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbnList The collection of inventoryInstKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_InScope(Collection<String> inventoryInstKbnList) {
        doSetInventoryInstKbn_InScope(inventoryInstKbnList);
    }

    protected void doSetInventoryInstKbn_InScope(Collection<String> inventoryInstKbnList) {
        regINS(CK_INS, cTL(inventoryInstKbnList), xgetCValueInventoryInstKbn(), "INVENTORY_INST_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbnList The collection of inventoryInstKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_NotInScope(Collection<String> inventoryInstKbnList) {
        doSetInventoryInstKbn_NotInScope(inventoryInstKbnList);
    }

    protected void doSetInventoryInstKbn_NotInScope(Collection<String> inventoryInstKbnList) {
        regINS(CK_NINS, cTL(inventoryInstKbnList), xgetCValueInventoryInstKbn(), "INVENTORY_INST_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInventoryInstKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryInstKbn The value of inventoryInstKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryInstKbn_LikeSearch(String inventoryInstKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryInstKbn), xgetCValueInventoryInstKbn(), "INVENTORY_INST_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryInstKbn_NotLikeSearch(String inventoryInstKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryInstKbn), xgetCValueInventoryInstKbn(), "INVENTORY_INST_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @param inventoryInstKbn The value of inventoryInstKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstKbn_PrefixSearch(String inventoryInstKbn) {
        setInventoryInstKbn_LikeSearch(inventoryInstKbn, xcLSOPPre());
    }

    protected void regInventoryInstKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryInstKbn(), "INVENTORY_INST_KBN"); }
    protected abstract ConditionValue xgetCValueInventoryInstKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_Equal(String lineBlock) {
        doSetLineBlock_Equal(fRES(lineBlock));
    }

    protected void doSetLineBlock_Equal(String lineBlock) {
        regLineBlock(CK_EQ, lineBlock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotEqual(String lineBlock) {
        doSetLineBlock_NotEqual(fRES(lineBlock));
    }

    protected void doSetLineBlock_NotEqual(String lineBlock) {
        regLineBlock(CK_NES, lineBlock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterThan(String lineBlock) {
        regLineBlock(CK_GT, fRES(lineBlock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessThan(String lineBlock) {
        regLineBlock(CK_LT, fRES(lineBlock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterEqual(String lineBlock) {
        regLineBlock(CK_GE, fRES(lineBlock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessEqual(String lineBlock) {
        regLineBlock(CK_LE, fRES(lineBlock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlockList The collection of lineBlock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_InScope(Collection<String> lineBlockList) {
        doSetLineBlock_InScope(lineBlockList);
    }

    protected void doSetLineBlock_InScope(Collection<String> lineBlockList) {
        regINS(CK_INS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlockList The collection of lineBlock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotInScope(Collection<String> lineBlockList) {
        doSetLineBlock_NotInScope(lineBlockList);
    }

    protected void doSetLineBlock_NotInScope(Collection<String> lineBlockList) {
        regINS(CK_NINS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)} <br>
     * <pre>e.g. setLineBlock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlock The value of lineBlock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlock_LikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlock_NotLikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_PrefixSearch(String lineBlock) {
        setLineBlock_LikeSearch(lineBlock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNull() { regLineBlock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNullOrEmpty() { regLineBlock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNotNull() { regLineBlock(CK_ISNN, DOBJ); }

    protected void regLineBlock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlock(), "LINE_BLOCK"); }
    protected abstract ConditionValue xgetCValueLineBlock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_Equal(String directionalPiston) {
        doSetDirectionalPiston_Equal(fRES(directionalPiston));
    }

    protected void doSetDirectionalPiston_Equal(String directionalPiston) {
        regDirectionalPiston(CK_EQ, directionalPiston);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_NotEqual(String directionalPiston) {
        doSetDirectionalPiston_NotEqual(fRES(directionalPiston));
    }

    protected void doSetDirectionalPiston_NotEqual(String directionalPiston) {
        regDirectionalPiston(CK_NES, directionalPiston);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_GreaterThan(String directionalPiston) {
        regDirectionalPiston(CK_GT, fRES(directionalPiston));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_LessThan(String directionalPiston) {
        regDirectionalPiston(CK_LT, fRES(directionalPiston));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_GreaterEqual(String directionalPiston) {
        regDirectionalPiston(CK_GE, fRES(directionalPiston));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_LessEqual(String directionalPiston) {
        regDirectionalPiston(CK_LE, fRES(directionalPiston));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPistonList The collection of directionalPiston as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_InScope(Collection<String> directionalPistonList) {
        doSetDirectionalPiston_InScope(directionalPistonList);
    }

    protected void doSetDirectionalPiston_InScope(Collection<String> directionalPistonList) {
        regINS(CK_INS, cTL(directionalPistonList), xgetCValueDirectionalPiston(), "DIRECTIONAL_PISTON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPistonList The collection of directionalPiston as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_NotInScope(Collection<String> directionalPistonList) {
        doSetDirectionalPiston_NotInScope(directionalPistonList);
    }

    protected void doSetDirectionalPiston_NotInScope(Collection<String> directionalPistonList) {
        regINS(CK_NINS, cTL(directionalPistonList), xgetCValueDirectionalPiston(), "DIRECTIONAL_PISTON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)} <br>
     * <pre>e.g. setDirectionalPiston_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionalPiston The value of directionalPiston as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionalPiston_LikeSearch(String directionalPiston, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionalPiston), xgetCValueDirectionalPiston(), "DIRECTIONAL_PISTON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionalPiston_NotLikeSearch(String directionalPiston, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionalPiston), xgetCValueDirectionalPiston(), "DIRECTIONAL_PISTON", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @param directionalPiston The value of directionalPiston as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionalPiston_PrefixSearch(String directionalPiston) {
        setDirectionalPiston_LikeSearch(directionalPiston, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     */
    public void setDirectionalPiston_IsNull() { regDirectionalPiston(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     */
    public void setDirectionalPiston_IsNullOrEmpty() { regDirectionalPiston(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     */
    public void setDirectionalPiston_IsNotNull() { regDirectionalPiston(CK_ISNN, DOBJ); }

    protected void regDirectionalPiston(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionalPiston(), "DIRECTIONAL_PISTON"); }
    protected abstract ConditionValue xgetCValueDirectionalPiston();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_Equal(String sortingOrder) {
        doSetSortingOrder_Equal(fRES(sortingOrder));
    }

    protected void doSetSortingOrder_Equal(String sortingOrder) {
        regSortingOrder(CK_EQ, sortingOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_NotEqual(String sortingOrder) {
        doSetSortingOrder_NotEqual(fRES(sortingOrder));
    }

    protected void doSetSortingOrder_NotEqual(String sortingOrder) {
        regSortingOrder(CK_NES, sortingOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_GreaterThan(String sortingOrder) {
        regSortingOrder(CK_GT, fRES(sortingOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_LessThan(String sortingOrder) {
        regSortingOrder(CK_LT, fRES(sortingOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_GreaterEqual(String sortingOrder) {
        regSortingOrder(CK_GE, fRES(sortingOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_LessEqual(String sortingOrder) {
        regSortingOrder(CK_LE, fRES(sortingOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrderList The collection of sortingOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_InScope(Collection<String> sortingOrderList) {
        doSetSortingOrder_InScope(sortingOrderList);
    }

    protected void doSetSortingOrder_InScope(Collection<String> sortingOrderList) {
        regINS(CK_INS, cTL(sortingOrderList), xgetCValueSortingOrder(), "SORTING_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrderList The collection of sortingOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_NotInScope(Collection<String> sortingOrderList) {
        doSetSortingOrder_NotInScope(sortingOrderList);
    }

    protected void doSetSortingOrder_NotInScope(Collection<String> sortingOrderList) {
        regINS(CK_NINS, cTL(sortingOrderList), xgetCValueSortingOrder(), "SORTING_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_ORDER: {varchar(255)} <br>
     * <pre>e.g. setSortingOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortingOrder The value of sortingOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortingOrder_LikeSearch(String sortingOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortingOrder), xgetCValueSortingOrder(), "SORTING_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortingOrder_NotLikeSearch(String sortingOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortingOrder), xgetCValueSortingOrder(), "SORTING_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     * @param sortingOrder The value of sortingOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingOrder_PrefixSearch(String sortingOrder) {
        setSortingOrder_LikeSearch(sortingOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     */
    public void setSortingOrder_IsNull() { regSortingOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     */
    public void setSortingOrder_IsNullOrEmpty() { regSortingOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTING_ORDER: {varchar(255)}
     */
    public void setSortingOrder_IsNotNull() { regSortingOrder(CK_ISNN, DOBJ); }

    protected void regSortingOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortingOrder(), "SORTING_ORDER"); }
    protected abstract ConditionValue xgetCValueSortingOrder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimes The value of sortingNumTimes as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortingNumTimes_Equal(Long sortingNumTimes) {
        doSetSortingNumTimes_Equal(sortingNumTimes);
    }

    protected void doSetSortingNumTimes_Equal(Long sortingNumTimes) {
        regSortingNumTimes(CK_EQ, sortingNumTimes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimes The value of sortingNumTimes as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortingNumTimes_NotEqual(Long sortingNumTimes) {
        doSetSortingNumTimes_NotEqual(sortingNumTimes);
    }

    protected void doSetSortingNumTimes_NotEqual(Long sortingNumTimes) {
        regSortingNumTimes(CK_NES, sortingNumTimes);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimes The value of sortingNumTimes as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortingNumTimes_GreaterThan(Long sortingNumTimes) {
        regSortingNumTimes(CK_GT, sortingNumTimes);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimes The value of sortingNumTimes as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortingNumTimes_LessThan(Long sortingNumTimes) {
        regSortingNumTimes(CK_LT, sortingNumTimes);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimes The value of sortingNumTimes as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortingNumTimes_GreaterEqual(Long sortingNumTimes) {
        regSortingNumTimes(CK_GE, sortingNumTimes);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimes The value of sortingNumTimes as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortingNumTimes_LessEqual(Long sortingNumTimes) {
        regSortingNumTimes(CK_LE, sortingNumTimes);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param minNumber The min number of sortingNumTimes. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortingNumTimes. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortingNumTimes_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortingNumTimes(), "SORTING_NUM_TIMES", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimesList The collection of sortingNumTimes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingNumTimes_InScope(Collection<Long> sortingNumTimesList) {
        doSetSortingNumTimes_InScope(sortingNumTimesList);
    }

    protected void doSetSortingNumTimes_InScope(Collection<Long> sortingNumTimesList) {
        regINS(CK_INS, cTL(sortingNumTimesList), xgetCValueSortingNumTimes(), "SORTING_NUM_TIMES");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @param sortingNumTimesList The collection of sortingNumTimes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingNumTimes_NotInScope(Collection<Long> sortingNumTimesList) {
        doSetSortingNumTimes_NotInScope(sortingNumTimesList);
    }

    protected void doSetSortingNumTimes_NotInScope(Collection<Long> sortingNumTimesList) {
        regINS(CK_NINS, cTL(sortingNumTimesList), xgetCValueSortingNumTimes(), "SORTING_NUM_TIMES");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     */
    public void setSortingNumTimes_IsNull() { regSortingNumTimes(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     */
    public void setSortingNumTimes_IsNotNull() { regSortingNumTimes(CK_ISNN, DOBJ); }

    protected void regSortingNumTimes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortingNumTimes(), "SORTING_NUM_TIMES"); }
    protected abstract ConditionValue xgetCValueSortingNumTimes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_Equal(String productDivision) {
        doSetProductDivision_Equal(fRES(productDivision));
    }

    protected void doSetProductDivision_Equal(String productDivision) {
        regProductDivision(CK_EQ, productDivision);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_NotEqual(String productDivision) {
        doSetProductDivision_NotEqual(fRES(productDivision));
    }

    protected void doSetProductDivision_NotEqual(String productDivision) {
        regProductDivision(CK_NES, productDivision);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_GreaterThan(String productDivision) {
        regProductDivision(CK_GT, fRES(productDivision));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_LessThan(String productDivision) {
        regProductDivision(CK_LT, fRES(productDivision));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_GreaterEqual(String productDivision) {
        regProductDivision(CK_GE, fRES(productDivision));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_LessEqual(String productDivision) {
        regProductDivision(CK_LE, fRES(productDivision));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivisionList The collection of productDivision as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_InScope(Collection<String> productDivisionList) {
        doSetProductDivision_InScope(productDivisionList);
    }

    protected void doSetProductDivision_InScope(Collection<String> productDivisionList) {
        regINS(CK_INS, cTL(productDivisionList), xgetCValueProductDivision(), "PRODUCT_DIVISION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivisionList The collection of productDivision as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_NotInScope(Collection<String> productDivisionList) {
        doSetProductDivision_NotInScope(productDivisionList);
    }

    protected void doSetProductDivision_NotInScope(Collection<String> productDivisionList) {
        regINS(CK_NINS, cTL(productDivisionList), xgetCValueProductDivision(), "PRODUCT_DIVISION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)} <br>
     * <pre>e.g. setProductDivision_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productDivision The value of productDivision as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductDivision_LikeSearch(String productDivision, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productDivision), xgetCValueProductDivision(), "PRODUCT_DIVISION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductDivision_NotLikeSearch(String productDivision, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productDivision), xgetCValueProductDivision(), "PRODUCT_DIVISION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @param productDivision The value of productDivision as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductDivision_PrefixSearch(String productDivision) {
        setProductDivision_LikeSearch(productDivision, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     */
    public void setProductDivision_IsNull() { regProductDivision(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     */
    public void setProductDivision_IsNullOrEmpty() { regProductDivision(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     */
    public void setProductDivision_IsNotNull() { regProductDivision(CK_ISNN, DOBJ); }

    protected void regProductDivision(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductDivision(), "PRODUCT_DIVISION"); }
    protected abstract ConditionValue xgetCValueProductDivision();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_Equal(String locationGrp) {
        doSetLocationGrp_Equal(fRES(locationGrp));
    }

    protected void doSetLocationGrp_Equal(String locationGrp) {
        regLocationGrp(CK_EQ, locationGrp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_NotEqual(String locationGrp) {
        doSetLocationGrp_NotEqual(fRES(locationGrp));
    }

    protected void doSetLocationGrp_NotEqual(String locationGrp) {
        regLocationGrp(CK_NES, locationGrp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_GreaterThan(String locationGrp) {
        regLocationGrp(CK_GT, fRES(locationGrp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_LessThan(String locationGrp) {
        regLocationGrp(CK_LT, fRES(locationGrp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_GreaterEqual(String locationGrp) {
        regLocationGrp(CK_GE, fRES(locationGrp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_LessEqual(String locationGrp) {
        regLocationGrp(CK_LE, fRES(locationGrp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrpList The collection of locationGrp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_InScope(Collection<String> locationGrpList) {
        doSetLocationGrp_InScope(locationGrpList);
    }

    protected void doSetLocationGrp_InScope(Collection<String> locationGrpList) {
        regINS(CK_INS, cTL(locationGrpList), xgetCValueLocationGrp(), "LOCATION_GRP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrpList The collection of locationGrp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_NotInScope(Collection<String> locationGrpList) {
        doSetLocationGrp_NotInScope(locationGrpList);
    }

    protected void doSetLocationGrp_NotInScope(Collection<String> locationGrpList) {
        regINS(CK_NINS, cTL(locationGrpList), xgetCValueLocationGrp(), "LOCATION_GRP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_GRP: {varchar(30)} <br>
     * <pre>e.g. setLocationGrp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationGrp The value of locationGrp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationGrp_LikeSearch(String locationGrp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationGrp), xgetCValueLocationGrp(), "LOCATION_GRP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationGrp_NotLikeSearch(String locationGrp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationGrp), xgetCValueLocationGrp(), "LOCATION_GRP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     * @param locationGrp The value of locationGrp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationGrp_PrefixSearch(String locationGrp) {
        setLocationGrp_LikeSearch(locationGrp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     */
    public void setLocationGrp_IsNull() { regLocationGrp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     */
    public void setLocationGrp_IsNullOrEmpty() { regLocationGrp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_GRP: {varchar(30)}
     */
    public void setLocationGrp_IsNotNull() { regLocationGrp(CK_ISNN, DOBJ); }

    protected void regLocationGrp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationGrp(), "LOCATION_GRP"); }
    protected abstract ConditionValue xgetCValueLocationGrp();

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
    public HpSLCFunction<TInventoryInstCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TInventoryInstCB.class);
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
    public HpSLCFunction<TInventoryInstCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TInventoryInstCB.class);
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
    public HpSLCFunction<TInventoryInstCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TInventoryInstCB.class);
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
    public HpSLCFunction<TInventoryInstCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TInventoryInstCB.class);
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
    public HpSLCFunction<TInventoryInstCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TInventoryInstCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TInventoryInstCB&gt;() {
     *     public void query(TInventoryInstCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TInventoryInstCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TInventoryInstCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TInventoryInstCQ sq);

    protected TInventoryInstCB xcreateScalarConditionCB() {
        TInventoryInstCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TInventoryInstCB xcreateScalarConditionPartitionByCB() {
        TInventoryInstCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TInventoryInstCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_INST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TInventoryInstCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TInventoryInstCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TInventoryInstCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_INST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TInventoryInstCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TInventoryInstCQ sq);

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
    protected TInventoryInstCB newMyCB() {
        return new TInventoryInstCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TInventoryInstCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

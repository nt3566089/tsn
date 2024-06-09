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
 * The abstract condition-query of M_CUSTOMER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCustomerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCustomerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CUSTOMER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(Long customerId) {
        doSetCustomerId_Equal(customerId);
    }

    protected void doSetCustomerId_Equal(Long customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(Long customerId) {
        doSetCustomerId_NotEqual(customerId);
    }

    protected void doSetCustomerId_NotEqual(Long customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(Long customerId) {
        regCustomerId(CK_GT, customerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(Long customerId) {
        regCustomerId(CK_LT, customerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(Long customerId) {
        regCustomerId(CK_GE, customerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(Long customerId) {
        regCustomerId(CK_LE, customerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param minNumber The min number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomerId(), "CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<Long> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<Long> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<Long> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<Long> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from M_CARRIER_SLIP_CES where ...)} <br>
     * M_CARRIER_SLIP_CES by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipCesAsOne</span>(cesCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cesCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipCesAsOne for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipCesAsOne(SubQuery<MCarrierSlipCesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCarrierSlipCesAsOne(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierSlipCesAsOne");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by CUSTOMER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterCustomerList for 'exists'. (NotNull)
     */
    public void existsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCenterCustomerList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from M_CLIENT where ...)} <br>
     * M_CLIENT by CUSTOMER_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientList for 'exists'. (NotNull)
     */
    public void existsMClientList(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MClientList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MClientList(MClientCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CUSTOMER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientCenterList for 'exists'. (NotNull)
     */
    public void existsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MClientCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_CUSTOMER_ID from M_CUSTOMER where ...)} <br>
     * M_CUSTOMER by DELIV_CUSTOMER_ID, named 'MCustomerSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCustomerSelfList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCustomerSelfList for 'exists'. (NotNull)
     */
    public void existsMCustomerSelfList(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCustomerSelfList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "mCustomerSelfList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCustomerSelfList(MCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_DEPOSIT_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_DEPOSIT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationList for 'exists'. (NotNull)
     */
    public void existsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from M_USER_DEPOSIT where ...)} <br>
     * M_USER_DEPOSIT by CUSTOMER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserDepositList</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserDepositList for 'exists'. (NotNull)
     */
    public void existsMUserDepositList(SubQuery<MUserDepositCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MUserDepositList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mUserDepositList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by DEPOSIT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstBList for 'exists'. (NotNull)
     */
    public void existsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_CUSTOMER_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHByDelivCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHByDelivCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tAllocInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLY_CUSTOMER_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHBySupplyCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHBySupplyCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tAllocInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by CUSTOMER_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocLotList for 'exists'. (NotNull)
     */
    public void existsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocLotList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tAllocLotList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by DEPOSIT_ID, named 'TInventoryBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBByDepositIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBByDepositIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryBByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryBByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by SUPPLIER_ID, named 'TInventoryBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBBySupplierIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryBBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tInventoryBBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_INVENTORY_INST where ...)} <br>
     * T_INVENTORY_INST by DEPOSIT_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryInstList for 'exists'. (NotNull)
     */
    public void existsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryInstList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryInstList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by CUSTOMER_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TKeepingLotList for 'exists'. (NotNull)
     */
    public void existsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TKeepingLotList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tKeepingLotList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by CUSTOMER_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TLastLotList for 'exists'. (NotNull)
     */
    public void existsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TLastLotList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tLastLotList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by DEPOSIT_ID, named 'TMoveInstBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBByDepositIdList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBByDepositIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TMoveInstBByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tMoveInstBByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by SUPPLIER_ID, named 'TMoveInstBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBBySupplierIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tMoveInstBBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PLAN_DEPOSIT_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHByPlanDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHByPlanDepositIdList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHByPlanDepositIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", pp, "tReceivePlanHByPlanDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PLAN_SUPPLIER_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHByPlanSupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHByPlanSupplierIdList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHByPlanSupplierIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", pp, "tReceivePlanHByPlanSupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by DEPOSIT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstBList for 'exists'. (NotNull)
     */
    public void existsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_CUSTOMER_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHByDelivCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHByDelivCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tShippingInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLY_CUSTOMER_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHBySupplyCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHBySupplyCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tShippingInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_STOCK where ...)} <br>
     * T_STOCK by DEPOSIT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockList for 'exists'. (NotNull)
     */
    public void existsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStockList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from T_STORE_NO where ...)} <br>
     * T_STORE_NO by SUPPLIER_ID, named 'TStoreNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreNoList for 'exists'. (NotNull)
     */
    public void existsTStoreNoList(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStoreNoList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreNoList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStoreNoList(TStoreNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by DEPOSIT_ID, named 'TStoreRecordHByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHByDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHByDepositIdList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHByDepositIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStoreRecordHByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHBySupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHBySupplierIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreRecordHBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CONSIGNMENT_CLS_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtInventoryInputProdList for 'exists'. (NotNull)
     */
    public void existsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspByDepositIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspByDepositIdList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspByDepositIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "wHtReceiveNoPlanInspByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspBySupplierIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspBySupplierIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "wHtReceiveNoPlanInspBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CUSTOMER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialReceiveInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CUSTOMER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialShippingInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from M_CARRIER_SLIP_CES where ...)} <br>
     * M_CARRIER_SLIP_CES by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipCesAsOne</span>(cesCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cesCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCarrierSlipCesAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipCesAsOne(SubQuery<MCarrierSlipCesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierSlipCesAsOne");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by CUSTOMER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCenterCustomerList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCenterCustomerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from M_CLIENT where ...)} <br>
     * M_CLIENT by CUSTOMER_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MClientList for 'not exists'. (NotNull)
     */
    public void notExistsMClientList(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MClientList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MClientList(MClientCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CUSTOMER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MClientCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MClientCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_CUSTOMER_ID from M_CUSTOMER where ...)} <br>
     * M_CUSTOMER by DELIV_CUSTOMER_ID, named 'MCustomerSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCustomerSelfList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCustomerSelfList for 'not exists'. (NotNull)
     */
    public void notExistsMCustomerSelfList(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCustomerSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "mCustomerSelfList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCustomerSelfList(MCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_DEPOSIT_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_DEPOSIT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from M_USER_DEPOSIT where ...)} <br>
     * M_USER_DEPOSIT by CUSTOMER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserDepositList</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MUserDepositList for 'not exists'. (NotNull)
     */
    public void notExistsMUserDepositList(SubQuery<MUserDepositCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MUserDepositList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mUserDepositList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by DEPOSIT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_CUSTOMER_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHByDelivCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tAllocInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLY_CUSTOMER_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHBySupplyCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tAllocInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by CUSTOMER_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocLotList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tAllocLotList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by DEPOSIT_ID, named 'TInventoryBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryBByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBByDepositIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryBByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryBByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by SUPPLIER_ID, named 'TInventoryBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryBBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBBySupplierIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tInventoryBBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_INVENTORY_INST where ...)} <br>
     * T_INVENTORY_INST by DEPOSIT_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryInstList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryInstList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryInstList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by CUSTOMER_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TKeepingLotList for 'not exists'. (NotNull)
     */
    public void notExistsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TKeepingLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tKeepingLotList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by CUSTOMER_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TLastLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TLastLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tLastLotList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by DEPOSIT_ID, named 'TMoveInstBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TMoveInstBByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBByDepositIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tMoveInstBByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by SUPPLIER_ID, named 'TMoveInstBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBBySupplierIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tMoveInstBBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PLAN_DEPOSIT_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHByPlanDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHByPlanDepositIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", pp, "tReceivePlanHByPlanDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PLAN_SUPPLIER_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHByPlanSupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHByPlanSupplierIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", pp, "tReceivePlanHByPlanSupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by DEPOSIT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_CUSTOMER_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHByDelivCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tShippingInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLY_CUSTOMER_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHBySupplyCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tShippingInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_STOCK where ...)} <br>
     * T_STOCK by DEPOSIT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStockList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from T_STORE_NO where ...)} <br>
     * T_STORE_NO by SUPPLIER_ID, named 'TStoreNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStoreNoList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreNoList(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStoreNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreNoList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStoreNoList(TStoreNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by DEPOSIT_ID, named 'TStoreRecordHByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHByDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHByDepositIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStoreRecordHByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHBySupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHBySupplierIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreRecordHBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CONSIGNMENT_CLS_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspByDepositIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspByDepositIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "wHtReceiveNoPlanInspByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspBySupplierIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspBySupplierIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "wHtReceiveNoPlanInspBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CUSTOMER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtSerialReceiveInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CUSTOMER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtSerialShippingInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    public void xsderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MCenterCustomerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCenterCustomerList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    public void xsderiveMClientList(String fn, SubQuery<MClientCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MClientList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MClientList(MClientCQ sq);

    public void xsderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MClientCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientCenterList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq);

    public void xsderiveMCustomerSelfList(String fn, SubQuery<MCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MCustomerSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "mCustomerSelfList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MCustomerSelfList(MCustomerCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMUserDepositList(String fn, SubQuery<MUserDepositCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MUserDepositList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mUserDepositList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTAllocInstHByDelivCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tAllocInstHByDelivCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);

    public void xsderiveTAllocInstHBySupplyCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tAllocInstHBySupplyCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);

    public void xsderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tAllocLotList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq);

    public void xsderiveTInventoryBByDepositIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryBByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryBBySupplierIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tInventoryBBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryInstList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryInstList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);

    public void xsderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TKeepingLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tKeepingLotList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);

    public void xsderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TLastLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tLastLotList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq);

    public void xsderiveTMoveInstBByDepositIdList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tMoveInstBByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);

    public void xsderiveTMoveInstBBySupplierIdList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tMoveInstBBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);

    public void xsderiveTReceivePlanHByPlanDepositIdList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", pp, "tReceivePlanHByPlanDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);

    public void xsderiveTReceivePlanHByPlanSupplierIdList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", pp, "tReceivePlanHByPlanSupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTShippingInstHByDelivCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tShippingInstHByDelivCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);

    public void xsderiveTShippingInstHBySupplyCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tShippingInstHBySupplyCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStockList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveTStoreNoList(String fn, SubQuery<TStoreNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStoreNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreNoList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStoreNoList(TStoreNoCQ sq);

    public void xsderiveTStoreRecordHByDepositIdList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStoreRecordHByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);

    public void xsderiveTStoreRecordHBySupplierIdList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreRecordHBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtReceiveNoPlanInspByDepositIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "wHtReceiveNoPlanInspByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveNoPlanInspBySupplierIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "wHtReceiveNoPlanInspBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialReceiveInspList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    public void xsderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialShippingInspList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by CUSTOMER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterCustomerList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterCustomerCB> derivedMCenterCustomerList() {
        return xcreateQDRFunctionMCenterCustomerList();
    }
    protected HpQDRFunction<MCenterCustomerCB> xcreateQDRFunctionMCenterCustomerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterCustomerList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MCenterCustomerList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mCenterCustomerList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT where ...)} <br>
     * M_CLIENT by CUSTOMER_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientList()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     clientCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCB> derivedMClientList() {
        return xcreateQDRFunctionMClientList();
    }
    protected HpQDRFunction<MClientCB> xcreateQDRFunctionMClientList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientList(String fn, SubQuery<MClientCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MClientList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MClientListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mClientList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientList(MClientCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CUSTOMER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCenterCB> derivedMClientCenterList() {
        return xcreateQDRFunctionMClientCenterList();
    }
    protected HpQDRFunction<MClientCenterCB> xcreateQDRFunctionMClientCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MClientCenterList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MClientCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mClientCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CUSTOMER where ...)} <br>
     * M_CUSTOMER by DELIV_CUSTOMER_ID, named 'MCustomerSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCustomerSelfList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCustomerCB> derivedMCustomerSelfList() {
        return xcreateQDRFunctionMCustomerSelfList();
    }
    protected HpQDRFunction<MCustomerCB> xcreateQDRFunctionMCustomerSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCustomerSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCustomerSelfList(String fn, SubQuery<MCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MCustomerSelfList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", sqpp, "mCustomerSelfList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MCustomerSelfList(MCustomerCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_DEPOSIT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationList() {
        return xcreateQDRFunctionMLocationList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_USER_DEPOSIT where ...)} <br>
     * M_USER_DEPOSIT by CUSTOMER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserDepositList()</span>.<span style="color: #CC4747">max</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     depositCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserDepositCB> derivedMUserDepositList() {
        return xcreateQDRFunctionMUserDepositList();
    }
    protected HpQDRFunction<MUserDepositCB> xcreateQDRFunctionMUserDepositList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserDepositList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserDepositList(String fn, SubQuery<MUserDepositCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MUserDepositList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MUserDepositListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mUserDepositList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MUserDepositListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by DEPOSIT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstBCB> derivedTAllocInstBList() {
        return xcreateQDRFunctionTAllocInstBList();
    }
    protected HpQDRFunction<TAllocInstBCB> xcreateQDRFunctionTAllocInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHByDelivCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHByDelivCustomerIdList() {
        return xcreateQDRFunctionTAllocInstHByDelivCustomerIdList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHByDelivCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHByDelivCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHByDelivCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", sqpp, "tAllocInstHByDelivCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHBySupplyCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHBySupplyCustomerIdList() {
        return xcreateQDRFunctionTAllocInstHBySupplyCustomerIdList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHBySupplyCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHBySupplyCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHBySupplyCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", sqpp, "tAllocInstHBySupplyCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by CUSTOMER_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocLotCB> derivedTAllocLotList() {
        return xcreateQDRFunctionTAllocLotList();
    }
    protected HpQDRFunction<TAllocLotCB> xcreateQDRFunctionTAllocLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocLotList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "tAllocLotList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by DEPOSIT_ID, named 'TInventoryBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBByDepositIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBByDepositIdList() {
        return xcreateQDRFunctionTInventoryBByDepositIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBByDepositIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tInventoryBByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by SUPPLIER_ID, named 'TInventoryBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBBySupplierIdList() {
        return xcreateQDRFunctionTInventoryBBySupplierIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBBySupplierIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tInventoryBBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_INST where ...)} <br>
     * T_INVENTORY_INST by DEPOSIT_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryInstList()</span>.<span style="color: #CC4747">max</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     instCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryInstCB> derivedTInventoryInstList() {
        return xcreateQDRFunctionTInventoryInstList();
    }
    protected HpQDRFunction<TInventoryInstCB> xcreateQDRFunctionTInventoryInstList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryInstList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryInstList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryInstListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tInventoryInstList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryInstListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by CUSTOMER_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTKeepingLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TKeepingLotCB> derivedTKeepingLotList() {
        return xcreateQDRFunctionTKeepingLotList();
    }
    protected HpQDRFunction<TKeepingLotCB> xcreateQDRFunctionTKeepingLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTKeepingLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TKeepingLotList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TKeepingLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "tKeepingLotList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by CUSTOMER_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTLastLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TLastLotCB> derivedTLastLotList() {
        return xcreateQDRFunctionTLastLotList();
    }
    protected HpQDRFunction<TLastLotCB> xcreateQDRFunctionTLastLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTLastLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TLastLotList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TLastLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "tLastLotList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TLastLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by DEPOSIT_ID, named 'TMoveInstBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBByDepositIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBByDepositIdList() {
        return xcreateQDRFunctionTMoveInstBByDepositIdList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBByDepositIdList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tMoveInstBByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by SUPPLIER_ID, named 'TMoveInstBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBBySupplierIdList() {
        return xcreateQDRFunctionTMoveInstBBySupplierIdList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBBySupplierIdList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tMoveInstBBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHByPlanDepositIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHByPlanDepositIdList() {
        return xcreateQDRFunctionTReceivePlanHByPlanDepositIdList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHByPlanDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHByPlanDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHByPlanDepositIdList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", sqpp, "tReceivePlanHByPlanDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHByPlanSupplierIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHByPlanSupplierIdList() {
        return xcreateQDRFunctionTReceivePlanHByPlanSupplierIdList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHByPlanSupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHByPlanSupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHByPlanSupplierIdList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", sqpp, "tReceivePlanHByPlanSupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by DEPOSIT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBCB> derivedTShippingInstBList() {
        return xcreateQDRFunctionTShippingInstBList();
    }
    protected HpQDRFunction<TShippingInstBCB> xcreateQDRFunctionTShippingInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHByDelivCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHByDelivCustomerIdList() {
        return xcreateQDRFunctionTShippingInstHByDelivCustomerIdList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHByDelivCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHByDelivCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHByDelivCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", sqpp, "tShippingInstHByDelivCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHBySupplyCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHBySupplyCustomerIdList() {
        return xcreateQDRFunctionTShippingInstHBySupplyCustomerIdList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHBySupplyCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHBySupplyCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHBySupplyCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", sqpp, "tShippingInstHBySupplyCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK where ...)} <br>
     * T_STOCK by DEPOSIT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockList()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     stockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockCB> derivedTStockList() {
        return xcreateQDRFunctionTStockList();
    }
    protected HpQDRFunction<TStockCB> xcreateQDRFunctionTStockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockList(String fn, SubQuery<TStockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STORE_NO where ...)} <br>
     * T_STORE_NO by SUPPLIER_ID, named 'TStoreNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreNoList()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     noCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreNoCB> derivedTStoreNoList() {
        return xcreateQDRFunctionTStoreNoList();
    }
    protected HpQDRFunction<TStoreNoCB> xcreateQDRFunctionTStoreNoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreNoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreNoList(String fn, SubQuery<TStoreNoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStoreNoList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStoreNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tStoreNoList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreNoList(TStoreNoCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by DEPOSIT_ID, named 'TStoreRecordHByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHByDepositIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHByDepositIdList() {
        return xcreateQDRFunctionTStoreRecordHByDepositIdList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHByDepositIdList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tStoreRecordHByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHBySupplierIdList() {
        return xcreateQDRFunctionTStoreRecordHBySupplierIdList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHBySupplierIdList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tStoreRecordHBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtInventoryInputProdList()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     prodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtInventoryInputProdCB> derivedWHtInventoryInputProdList() {
        return xcreateQDRFunctionWHtInventoryInputProdList();
    }
    protected HpQDRFunction<WHtInventoryInputProdCB> xcreateQDRFunctionWHtInventoryInputProdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtInventoryInputProdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspByDepositIdList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspByDepositIdList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspByDepositIdList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspByDepositIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "wHtReceiveNoPlanInspByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspBySupplierIdList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspBySupplierIdList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspBySupplierIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "wHtReceiveNoPlanInspBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CUSTOMER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialReceiveInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialReceiveInspCB> derivedWHtSerialReceiveInspList() {
        return xcreateQDRFunctionWHtSerialReceiveInspList();
    }
    protected HpQDRFunction<WHtSerialReceiveInspCB> xcreateQDRFunctionWHtSerialReceiveInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialReceiveInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "wHtSerialReceiveInspList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CUSTOMER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialShippingInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialShippingInspCB> derivedWHtSerialShippingInspList() {
        return xcreateQDRFunctionWHtSerialShippingInspList();
    }
    protected HpQDRFunction<WHtSerialShippingInspCB> xcreateQDRFunctionWHtSerialShippingInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialShippingInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "wHtSerialShippingInspList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

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
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_Equal(String customerNm) {
        doSetCustomerNm_Equal(fRES(customerNm));
    }

    protected void doSetCustomerNm_Equal(String customerNm) {
        regCustomerNm(CK_EQ, customerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotEqual(String customerNm) {
        doSetCustomerNm_NotEqual(fRES(customerNm));
    }

    protected void doSetCustomerNm_NotEqual(String customerNm) {
        regCustomerNm(CK_NES, customerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterThan(String customerNm) {
        regCustomerNm(CK_GT, fRES(customerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessThan(String customerNm) {
        regCustomerNm(CK_LT, fRES(customerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterEqual(String customerNm) {
        regCustomerNm(CK_GE, fRES(customerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessEqual(String customerNm) {
        regCustomerNm(CK_LE, fRES(customerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNmList The collection of customerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_InScope(Collection<String> customerNmList) {
        doSetCustomerNm_InScope(customerNmList);
    }

    protected void doSetCustomerNm_InScope(Collection<String> customerNmList) {
        regINS(CK_INS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNmList The collection of customerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotInScope(Collection<String> customerNmList) {
        doSetCustomerNm_NotInScope(customerNmList);
    }

    protected void doSetCustomerNm_NotInScope(Collection<String> customerNmList) {
        regINS(CK_NINS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerNm The value of customerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerNm_LikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerNm_NotLikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @param customerNm The value of customerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_PrefixSearch(String customerNm) {
        setCustomerNm_LikeSearch(customerNm, xcLSOPPre());
    }

    protected void regCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerNm(), "CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_Equal(String customerAbbr) {
        doSetCustomerAbbr_Equal(fRES(customerAbbr));
    }

    protected void doSetCustomerAbbr_Equal(String customerAbbr) {
        regCustomerAbbr(CK_EQ, customerAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_NotEqual(String customerAbbr) {
        doSetCustomerAbbr_NotEqual(fRES(customerAbbr));
    }

    protected void doSetCustomerAbbr_NotEqual(String customerAbbr) {
        regCustomerAbbr(CK_NES, customerAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_GreaterThan(String customerAbbr) {
        regCustomerAbbr(CK_GT, fRES(customerAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_LessThan(String customerAbbr) {
        regCustomerAbbr(CK_LT, fRES(customerAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_GreaterEqual(String customerAbbr) {
        regCustomerAbbr(CK_GE, fRES(customerAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_LessEqual(String customerAbbr) {
        regCustomerAbbr(CK_LE, fRES(customerAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbrList The collection of customerAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_InScope(Collection<String> customerAbbrList) {
        doSetCustomerAbbr_InScope(customerAbbrList);
    }

    protected void doSetCustomerAbbr_InScope(Collection<String> customerAbbrList) {
        regINS(CK_INS, cTL(customerAbbrList), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbrList The collection of customerAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_NotInScope(Collection<String> customerAbbrList) {
        doSetCustomerAbbr_NotInScope(customerAbbrList);
    }

    protected void doSetCustomerAbbr_NotInScope(Collection<String> customerAbbrList) {
        regINS(CK_NINS, cTL(customerAbbrList), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)} <br>
     * <pre>e.g. setCustomerAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerAbbr The value of customerAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerAbbr_LikeSearch(String customerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerAbbr), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerAbbr_NotLikeSearch(String customerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerAbbr), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @param customerAbbr The value of customerAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_PrefixSearch(String customerAbbr) {
        setCustomerAbbr_LikeSearch(customerAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     */
    public void setCustomerAbbr_IsNull() { regCustomerAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     */
    public void setCustomerAbbr_IsNullOrEmpty() { regCustomerAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     */
    public void setCustomerAbbr_IsNotNull() { regCustomerAbbr(CK_ISNN, DOBJ); }

    protected void regCustomerAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerAbbr(), "CUSTOMER_ABBR"); }
    protected abstract ConditionValue xgetCValueCustomerAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_Equal(String zipCd) {
        doSetZipCd_Equal(fRES(zipCd));
    }

    protected void doSetZipCd_Equal(String zipCd) {
        regZipCd(CK_EQ, zipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotEqual(String zipCd) {
        doSetZipCd_NotEqual(fRES(zipCd));
    }

    protected void doSetZipCd_NotEqual(String zipCd) {
        regZipCd(CK_NES, zipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterThan(String zipCd) {
        regZipCd(CK_GT, fRES(zipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessThan(String zipCd) {
        regZipCd(CK_LT, fRES(zipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterEqual(String zipCd) {
        regZipCd(CK_GE, fRES(zipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessEqual(String zipCd) {
        regZipCd(CK_LE, fRES(zipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCdList The collection of zipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_InScope(Collection<String> zipCdList) {
        doSetZipCd_InScope(zipCdList);
    }

    protected void doSetZipCd_InScope(Collection<String> zipCdList) {
        regINS(CK_INS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCdList The collection of zipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotInScope(Collection<String> zipCdList) {
        doSetZipCd_NotInScope(zipCdList);
    }

    protected void doSetZipCd_NotInScope(Collection<String> zipCdList) {
        regINS(CK_NINS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(30)} <br>
     * <pre>e.g. setZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zipCd The value of zipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZipCd_LikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZipCd_NotLikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(30)}
     * @param zipCd The value of zipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_PrefixSearch(String zipCd) {
        setZipCd_LikeSearch(zipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     */
    public void setZipCd_IsNull() { regZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     */
    public void setZipCd_IsNullOrEmpty() { regZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(30)}
     */
    public void setZipCd_IsNotNull() { regZipCd(CK_ISNN, DOBJ); }

    protected void regZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipCd(), "ZIP_CD"); }
    protected abstract ConditionValue xgetCValueZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_Equal(String telNo) {
        doSetTelNo_Equal(fRES(telNo));
    }

    protected void doSetTelNo_Equal(String telNo) {
        regTelNo(CK_EQ, telNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotEqual(String telNo) {
        doSetTelNo_NotEqual(fRES(telNo));
    }

    protected void doSetTelNo_NotEqual(String telNo) {
        regTelNo(CK_NES, telNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterThan(String telNo) {
        regTelNo(CK_GT, fRES(telNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessThan(String telNo) {
        regTelNo(CK_LT, fRES(telNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterEqual(String telNo) {
        regTelNo(CK_GE, fRES(telNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessEqual(String telNo) {
        regTelNo(CK_LE, fRES(telNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNoList The collection of telNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_InScope(Collection<String> telNoList) {
        doSetTelNo_InScope(telNoList);
    }

    protected void doSetTelNo_InScope(Collection<String> telNoList) {
        regINS(CK_INS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNoList The collection of telNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotInScope(Collection<String> telNoList) {
        doSetTelNo_NotInScope(telNoList);
    }

    protected void doSetTelNo_NotInScope(Collection<String> telNoList) {
        regINS(CK_NINS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {varchar(30)} <br>
     * <pre>e.g. setTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param telNo The value of telNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTelNo_LikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTelNo_NotLikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {varchar(30)}
     * @param telNo The value of telNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_PrefixSearch(String telNo) {
        setTelNo_LikeSearch(telNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     */
    public void setTelNo_IsNull() { regTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     */
    public void setTelNo_IsNullOrEmpty() { regTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {varchar(30)}
     */
    public void setTelNo_IsNotNull() { regTelNo(CK_ISNN, DOBJ); }

    protected void regTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo(), "TEL_NO"); }
    protected abstract ConditionValue xgetCValueTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(60)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(60)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(60)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(60)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(60)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(60)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(60)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(60)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(60)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlg The value of vendorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_Equal(String vendorFlg) {
        doSetVendorFlg_Equal(fRES(vendorFlg));
    }

    /**
     * Equal(=). As VendorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorFlg_Equal_AsVendorFlg(CDef.VendorFlg cdef) {
        doSetVendorFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setVendorFlg_Equal_$0() {
        setVendorFlg_Equal_AsVendorFlg(CDef.VendorFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setVendorFlg_Equal_$1() {
        setVendorFlg_Equal_AsVendorFlg(CDef.VendorFlg.$1);
    }

    protected void doSetVendorFlg_Equal(String vendorFlg) {
        regVendorFlg(CK_EQ, vendorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlg The value of vendorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_NotEqual(String vendorFlg) {
        doSetVendorFlg_NotEqual(fRES(vendorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As VendorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorFlg_NotEqual_AsVendorFlg(CDef.VendorFlg cdef) {
        doSetVendorFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setVendorFlg_NotEqual_$0() {
        setVendorFlg_NotEqual_AsVendorFlg(CDef.VendorFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setVendorFlg_NotEqual_$1() {
        setVendorFlg_NotEqual_AsVendorFlg(CDef.VendorFlg.$1);
    }

    protected void doSetVendorFlg_NotEqual(String vendorFlg) {
        regVendorFlg(CK_NES, vendorFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlgList The collection of vendorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_InScope(Collection<String> vendorFlgList) {
        doSetVendorFlg_InScope(vendorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As VendorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_InScope_AsVendorFlg(Collection<CDef.VendorFlg> cdefList) {
        doSetVendorFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetVendorFlg_InScope(Collection<String> vendorFlgList) {
        regINS(CK_INS, cTL(vendorFlgList), xgetCValueVendorFlg(), "VENDOR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlgList The collection of vendorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_NotInScope(Collection<String> vendorFlgList) {
        doSetVendorFlg_NotInScope(vendorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VendorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_NotInScope_AsVendorFlg(Collection<CDef.VendorFlg> cdefList) {
        doSetVendorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetVendorFlg_NotInScope(Collection<String> vendorFlgList) {
        regINS(CK_NINS, cTL(vendorFlgList), xgetCValueVendorFlg(), "VENDOR_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     */
    public void setVendorFlg_IsNull() { regVendorFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     */
    public void setVendorFlg_IsNotNull() { regVendorFlg(CK_ISNN, DOBJ); }

    protected void regVendorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorFlg(), "VENDOR_FLG"); }
    protected abstract ConditionValue xgetCValueVendorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlg The value of deliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_Equal(String deliveryFlg) {
        doSetDeliveryFlg_Equal(fRES(deliveryFlg));
    }

    /**
     * Equal(=). As DeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryFlg_Equal_AsDeliveryFlg(CDef.DeliveryFlg cdef) {
        doSetDeliveryFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDeliveryFlg_Equal_$0() {
        setDeliveryFlg_Equal_AsDeliveryFlg(CDef.DeliveryFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDeliveryFlg_Equal_$1() {
        setDeliveryFlg_Equal_AsDeliveryFlg(CDef.DeliveryFlg.$1);
    }

    protected void doSetDeliveryFlg_Equal(String deliveryFlg) {
        regDeliveryFlg(CK_EQ, deliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlg The value of deliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotEqual(String deliveryFlg) {
        doSetDeliveryFlg_NotEqual(fRES(deliveryFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotEqual_AsDeliveryFlg(CDef.DeliveryFlg cdef) {
        doSetDeliveryFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDeliveryFlg_NotEqual_$0() {
        setDeliveryFlg_NotEqual_AsDeliveryFlg(CDef.DeliveryFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDeliveryFlg_NotEqual_$1() {
        setDeliveryFlg_NotEqual_AsDeliveryFlg(CDef.DeliveryFlg.$1);
    }

    protected void doSetDeliveryFlg_NotEqual(String deliveryFlg) {
        regDeliveryFlg(CK_NES, deliveryFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlgList The collection of deliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_InScope(Collection<String> deliveryFlgList) {
        doSetDeliveryFlg_InScope(deliveryFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_InScope_AsDeliveryFlg(Collection<CDef.DeliveryFlg> cdefList) {
        doSetDeliveryFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDeliveryFlg_InScope(Collection<String> deliveryFlgList) {
        regINS(CK_INS, cTL(deliveryFlgList), xgetCValueDeliveryFlg(), "DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlgList The collection of deliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotInScope(Collection<String> deliveryFlgList) {
        doSetDeliveryFlg_NotInScope(deliveryFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotInScope_AsDeliveryFlg(Collection<CDef.DeliveryFlg> cdefList) {
        doSetDeliveryFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDeliveryFlg_NotInScope(Collection<String> deliveryFlgList) {
        regINS(CK_NINS, cTL(deliveryFlgList), xgetCValueDeliveryFlg(), "DELIVERY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     */
    public void setDeliveryFlg_IsNull() { regDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     */
    public void setDeliveryFlg_IsNotNull() { regDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryFlg(), "DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlg The value of onetimeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_Equal(String onetimeFlg) {
        doSetOnetimeFlg_Equal(fRES(onetimeFlg));
    }

    /**
     * Equal(=). As OnetimeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOnetimeFlg_Equal_AsOnetimeFlg(CDef.OnetimeFlg cdef) {
        doSetOnetimeFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setOnetimeFlg_Equal_$0() {
        setOnetimeFlg_Equal_AsOnetimeFlg(CDef.OnetimeFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setOnetimeFlg_Equal_$1() {
        setOnetimeFlg_Equal_AsOnetimeFlg(CDef.OnetimeFlg.$1);
    }

    protected void doSetOnetimeFlg_Equal(String onetimeFlg) {
        regOnetimeFlg(CK_EQ, onetimeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlg The value of onetimeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotEqual(String onetimeFlg) {
        doSetOnetimeFlg_NotEqual(fRES(onetimeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As OnetimeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotEqual_AsOnetimeFlg(CDef.OnetimeFlg cdef) {
        doSetOnetimeFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setOnetimeFlg_NotEqual_$0() {
        setOnetimeFlg_NotEqual_AsOnetimeFlg(CDef.OnetimeFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setOnetimeFlg_NotEqual_$1() {
        setOnetimeFlg_NotEqual_AsOnetimeFlg(CDef.OnetimeFlg.$1);
    }

    protected void doSetOnetimeFlg_NotEqual(String onetimeFlg) {
        regOnetimeFlg(CK_NES, onetimeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlgList The collection of onetimeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_InScope(Collection<String> onetimeFlgList) {
        doSetOnetimeFlg_InScope(onetimeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As OnetimeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_InScope_AsOnetimeFlg(Collection<CDef.OnetimeFlg> cdefList) {
        doSetOnetimeFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetOnetimeFlg_InScope(Collection<String> onetimeFlgList) {
        regINS(CK_INS, cTL(onetimeFlgList), xgetCValueOnetimeFlg(), "ONETIME_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlgList The collection of onetimeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotInScope(Collection<String> onetimeFlgList) {
        doSetOnetimeFlg_NotInScope(onetimeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As OnetimeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotInScope_AsOnetimeFlg(Collection<CDef.OnetimeFlg> cdefList) {
        doSetOnetimeFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOnetimeFlg_NotInScope(Collection<String> onetimeFlgList) {
        regINS(CK_NINS, cTL(onetimeFlgList), xgetCValueOnetimeFlg(), "ONETIME_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     */
    public void setOnetimeFlg_IsNull() { regOnetimeFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     */
    public void setOnetimeFlg_IsNotNull() { regOnetimeFlg(CK_ISNN, DOBJ); }

    protected void regOnetimeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnetimeFlg(), "ONETIME_FLG"); }
    protected abstract ConditionValue xgetCValueOnetimeFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlg The value of depositFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_Equal(String depositFlg) {
        doSetDepositFlg_Equal(fRES(depositFlg));
    }

    /**
     * Equal(=). As DepositFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositFlg_Equal_AsDepositFlg(CDef.DepositFlg cdef) {
        doSetDepositFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDepositFlg_Equal_$0() {
        setDepositFlg_Equal_AsDepositFlg(CDef.DepositFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDepositFlg_Equal_$1() {
        setDepositFlg_Equal_AsDepositFlg(CDef.DepositFlg.$1);
    }

    protected void doSetDepositFlg_Equal(String depositFlg) {
        regDepositFlg(CK_EQ, depositFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlg The value of depositFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotEqual(String depositFlg) {
        doSetDepositFlg_NotEqual(fRES(depositFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DepositFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositFlg_NotEqual_AsDepositFlg(CDef.DepositFlg cdef) {
        doSetDepositFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDepositFlg_NotEqual_$0() {
        setDepositFlg_NotEqual_AsDepositFlg(CDef.DepositFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDepositFlg_NotEqual_$1() {
        setDepositFlg_NotEqual_AsDepositFlg(CDef.DepositFlg.$1);
    }

    protected void doSetDepositFlg_NotEqual(String depositFlg) {
        regDepositFlg(CK_NES, depositFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlgList The collection of depositFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_InScope(Collection<String> depositFlgList) {
        doSetDepositFlg_InScope(depositFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DepositFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_InScope_AsDepositFlg(Collection<CDef.DepositFlg> cdefList) {
        doSetDepositFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDepositFlg_InScope(Collection<String> depositFlgList) {
        regINS(CK_INS, cTL(depositFlgList), xgetCValueDepositFlg(), "DEPOSIT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlgList The collection of depositFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotInScope(Collection<String> depositFlgList) {
        doSetDepositFlg_NotInScope(depositFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DepositFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotInScope_AsDepositFlg(Collection<CDef.DepositFlg> cdefList) {
        doSetDepositFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDepositFlg_NotInScope(Collection<String> depositFlgList) {
        regINS(CK_NINS, cTL(depositFlgList), xgetCValueDepositFlg(), "DEPOSIT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     */
    public void setDepositFlg_IsNull() { regDepositFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     */
    public void setDepositFlg_IsNotNull() { regDepositFlg(CK_ISNN, DOBJ); }

    protected void regDepositFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositFlg(), "DEPOSIT_FLG"); }
    protected abstract ConditionValue xgetCValueDepositFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrder The value of allocOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_Equal(Long allocOrder) {
        doSetAllocOrder_Equal(allocOrder);
    }

    protected void doSetAllocOrder_Equal(Long allocOrder) {
        regAllocOrder(CK_EQ, allocOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrder The value of allocOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_NotEqual(Long allocOrder) {
        doSetAllocOrder_NotEqual(allocOrder);
    }

    protected void doSetAllocOrder_NotEqual(Long allocOrder) {
        regAllocOrder(CK_NES, allocOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrder The value of allocOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterThan(Long allocOrder) {
        regAllocOrder(CK_GT, allocOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrder The value of allocOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_LessThan(Long allocOrder) {
        regAllocOrder(CK_LT, allocOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrder The value of allocOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterEqual(Long allocOrder) {
        regAllocOrder(CK_GE, allocOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrder The value of allocOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_LessEqual(Long allocOrder) {
        regAllocOrder(CK_LE, allocOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param minNumber The min number of allocOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocOrder(), "ALLOC_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrderList The collection of allocOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_InScope(Collection<Long> allocOrderList) {
        doSetAllocOrder_InScope(allocOrderList);
    }

    protected void doSetAllocOrder_InScope(Collection<Long> allocOrderList) {
        regINS(CK_INS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @param allocOrderList The collection of allocOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotInScope(Collection<Long> allocOrderList) {
        doSetAllocOrder_NotInScope(allocOrderList);
    }

    protected void doSetAllocOrder_NotInScope(Collection<Long> allocOrderList) {
        regINS(CK_NINS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     */
    public void setAllocOrder_IsNull() { regAllocOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {bigint(19)}
     */
    public void setAllocOrder_IsNotNull() { regAllocOrder(CK_ISNN, DOBJ); }

    protected void regAllocOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocOrder(), "ALLOC_ORDER"); }
    protected abstract ConditionValue xgetCValueAllocOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal(String lotReverseFlg) {
        doSetLotReverseFlg_Equal(fRES(lotReverseFlg));
    }

    /**
     * Equal(=). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_Equal_$0() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_Equal_$1() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    protected void doSetLotReverseFlg_Equal(String lotReverseFlg) {
        regLotReverseFlg(CK_EQ, lotReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual(String lotReverseFlg) {
        doSetLotReverseFlg_NotEqual(fRES(lotReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_NotEqual_$0() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_NotEqual_$1() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    protected void doSetLotReverseFlg_NotEqual(String lotReverseFlg) {
        regLotReverseFlg(CK_NES, lotReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_InScope(lotReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        regINS(CK_INS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_NotInScope(lotReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        regINS(CK_NINS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNull() { regLotReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNotNull() { regLotReverseFlg(CK_ISNN, DOBJ); }

    protected void regLotReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLotReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_Equal(fRES(limitDtReverseFlg));
    }

    /**
     * Equal(=). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_Equal_$0() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_Equal_$1() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    protected void doSetLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_EQ, limitDtReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_NotEqual(fRES(limitDtReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_NotEqual_$0() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_NotEqual_$1() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    protected void doSetLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_NES, limitDtReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_InScope(limitDtReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_INS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_NotInScope(limitDtReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_NINS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNull() { regLimitDtReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNotNull() { regLimitDtReverseFlg(CK_ISNN, DOBJ); }

    protected void regLimitDtReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal(String shippingStopFlg) {
        doSetShippingStopFlg_Equal(fRES(shippingStopFlg));
    }

    /**
     * Equal(=). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_Equal_$0() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_Equal_$1() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    protected void doSetShippingStopFlg_Equal(String shippingStopFlg) {
        regShippingStopFlg(CK_EQ, shippingStopFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual(String shippingStopFlg) {
        doSetShippingStopFlg_NotEqual(fRES(shippingStopFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_NotEqual_$0() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_NotEqual_$1() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    protected void doSetShippingStopFlg_NotEqual(String shippingStopFlg) {
        regShippingStopFlg(CK_NES, shippingStopFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_InScope(shippingStopFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        regINS(CK_INS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_NotInScope(shippingStopFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        regINS(CK_NINS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNull() { regShippingStopFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNotNull() { regShippingStopFlg(CK_ISNN, DOBJ); }

    protected void regShippingStopFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG"); }
    protected abstract ConditionValue xgetCValueShippingStopFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerId The value of delivCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_Equal(Long delivCustomerId) {
        doSetDelivCustomerId_Equal(delivCustomerId);
    }

    protected void doSetDelivCustomerId_Equal(Long delivCustomerId) {
        regDelivCustomerId(CK_EQ, delivCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerId The value of delivCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotEqual(Long delivCustomerId) {
        doSetDelivCustomerId_NotEqual(delivCustomerId);
    }

    protected void doSetDelivCustomerId_NotEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_NES, delivCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerId The value of delivCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterThan(Long delivCustomerId) {
        regDelivCustomerId(CK_GT, delivCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerId The value of delivCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessThan(Long delivCustomerId) {
        regDelivCustomerId(CK_LT, delivCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerId The value of delivCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_GE, delivCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerId The value of delivCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_LE, delivCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerIdList The collection of delivCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_InScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_INS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param delivCustomerIdList The collection of delivCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_NotInScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_NINS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIV_CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @param subCBLambda The callback for sub-query of MCustomerSelf for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerSelf(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_InScopeRelation_MCustomerSelf(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerSelf", false);
    }
    public abstract String keepDelivCustomerId_InScopeRelation_MCustomerSelf(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIV_CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @param subCBLambda The callback for sub-query of MCustomerSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerSelf(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerSelf", true);
    }
    public abstract String keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setDelivCustomerId_IsNull() { regDelivCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setDelivCustomerId_IsNotNull() { regDelivCustomerId(CK_ISNN, DOBJ); }

    protected void regDelivCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueDelivCustomerId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriority The value of showPriority as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShowPriority_Equal(Long showPriority) {
        doSetShowPriority_Equal(showPriority);
    }

    protected void doSetShowPriority_Equal(Long showPriority) {
        regShowPriority(CK_EQ, showPriority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriority The value of showPriority as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShowPriority_NotEqual(Long showPriority) {
        doSetShowPriority_NotEqual(showPriority);
    }

    protected void doSetShowPriority_NotEqual(Long showPriority) {
        regShowPriority(CK_NES, showPriority);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriority The value of showPriority as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShowPriority_GreaterThan(Long showPriority) {
        regShowPriority(CK_GT, showPriority);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriority The value of showPriority as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShowPriority_LessThan(Long showPriority) {
        regShowPriority(CK_LT, showPriority);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriority The value of showPriority as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShowPriority_GreaterEqual(Long showPriority) {
        regShowPriority(CK_GE, showPriority);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriority The value of showPriority as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShowPriority_LessEqual(Long showPriority) {
        regShowPriority(CK_LE, showPriority);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param minNumber The min number of showPriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of showPriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShowPriority_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShowPriority(), "SHOW_PRIORITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriorityList The collection of showPriority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShowPriority_InScope(Collection<Long> showPriorityList) {
        doSetShowPriority_InScope(showPriorityList);
    }

    protected void doSetShowPriority_InScope(Collection<Long> showPriorityList) {
        regINS(CK_INS, cTL(showPriorityList), xgetCValueShowPriority(), "SHOW_PRIORITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @param showPriorityList The collection of showPriority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShowPriority_NotInScope(Collection<Long> showPriorityList) {
        doSetShowPriority_NotInScope(showPriorityList);
    }

    protected void doSetShowPriority_NotInScope(Collection<Long> showPriorityList) {
        regINS(CK_NINS, cTL(showPriorityList), xgetCValueShowPriority(), "SHOW_PRIORITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     */
    public void setShowPriority_IsNull() { regShowPriority(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHOW_PRIORITY: {bigint(19)}
     */
    public void setShowPriority_IsNotNull() { regShowPriority(CK_ISNN, DOBJ); }

    protected void regShowPriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShowPriority(), "SHOW_PRIORITY"); }
    protected abstract ConditionValue xgetCValueShowPriority();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_Equal(String marketType) {
        doSetMarketType_Equal(fRES(marketType));
    }

    protected void doSetMarketType_Equal(String marketType) {
        regMarketType(CK_EQ, marketType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_NotEqual(String marketType) {
        doSetMarketType_NotEqual(fRES(marketType));
    }

    protected void doSetMarketType_NotEqual(String marketType) {
        regMarketType(CK_NES, marketType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_GreaterThan(String marketType) {
        regMarketType(CK_GT, fRES(marketType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_LessThan(String marketType) {
        regMarketType(CK_LT, fRES(marketType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_GreaterEqual(String marketType) {
        regMarketType(CK_GE, fRES(marketType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_LessEqual(String marketType) {
        regMarketType(CK_LE, fRES(marketType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketTypeList The collection of marketType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_InScope(Collection<String> marketTypeList) {
        doSetMarketType_InScope(marketTypeList);
    }

    protected void doSetMarketType_InScope(Collection<String> marketTypeList) {
        regINS(CK_INS, cTL(marketTypeList), xgetCValueMarketType(), "MARKET_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketTypeList The collection of marketType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_NotInScope(Collection<String> marketTypeList) {
        doSetMarketType_NotInScope(marketTypeList);
    }

    protected void doSetMarketType_NotInScope(Collection<String> marketTypeList) {
        regINS(CK_NINS, cTL(marketTypeList), xgetCValueMarketType(), "MARKET_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MARKET_TYPE: {varchar(30)} <br>
     * <pre>e.g. setMarketType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param marketType The value of marketType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMarketType_LikeSearch(String marketType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(marketType), xgetCValueMarketType(), "MARKET_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMarketType_NotLikeSearch(String marketType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(marketType), xgetCValueMarketType(), "MARKET_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     * @param marketType The value of marketType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMarketType_PrefixSearch(String marketType) {
        setMarketType_LikeSearch(marketType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     */
    public void setMarketType_IsNull() { regMarketType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     */
    public void setMarketType_IsNullOrEmpty() { regMarketType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MARKET_TYPE: {varchar(30)}
     */
    public void setMarketType_IsNotNull() { regMarketType(CK_ISNN, DOBJ); }

    protected void regMarketType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMarketType(), "MARKET_TYPE"); }
    protected abstract ConditionValue xgetCValueMarketType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_Equal(String logisticsCd) {
        doSetLogisticsCd_Equal(fRES(logisticsCd));
    }

    protected void doSetLogisticsCd_Equal(String logisticsCd) {
        regLogisticsCd(CK_EQ, logisticsCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_NotEqual(String logisticsCd) {
        doSetLogisticsCd_NotEqual(fRES(logisticsCd));
    }

    protected void doSetLogisticsCd_NotEqual(String logisticsCd) {
        regLogisticsCd(CK_NES, logisticsCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_GreaterThan(String logisticsCd) {
        regLogisticsCd(CK_GT, fRES(logisticsCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_LessThan(String logisticsCd) {
        regLogisticsCd(CK_LT, fRES(logisticsCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_GreaterEqual(String logisticsCd) {
        regLogisticsCd(CK_GE, fRES(logisticsCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_LessEqual(String logisticsCd) {
        regLogisticsCd(CK_LE, fRES(logisticsCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCdList The collection of logisticsCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_InScope(Collection<String> logisticsCdList) {
        doSetLogisticsCd_InScope(logisticsCdList);
    }

    protected void doSetLogisticsCd_InScope(Collection<String> logisticsCdList) {
        regINS(CK_INS, cTL(logisticsCdList), xgetCValueLogisticsCd(), "LOGISTICS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCdList The collection of logisticsCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_NotInScope(Collection<String> logisticsCdList) {
        doSetLogisticsCd_NotInScope(logisticsCdList);
    }

    protected void doSetLogisticsCd_NotInScope(Collection<String> logisticsCdList) {
        regINS(CK_NINS, cTL(logisticsCdList), xgetCValueLogisticsCd(), "LOGISTICS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICS_CD: {varchar(30)} <br>
     * <pre>e.g. setLogisticsCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logisticsCd The value of logisticsCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogisticsCd_LikeSearch(String logisticsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logisticsCd), xgetCValueLogisticsCd(), "LOGISTICS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogisticsCd_NotLikeSearch(String logisticsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logisticsCd), xgetCValueLogisticsCd(), "LOGISTICS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @param logisticsCd The value of logisticsCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticsCd_PrefixSearch(String logisticsCd) {
        setLogisticsCd_LikeSearch(logisticsCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     */
    public void setLogisticsCd_IsNull() { regLogisticsCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     */
    public void setLogisticsCd_IsNullOrEmpty() { regLogisticsCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGISTICS_CD: {varchar(30)}
     */
    public void setLogisticsCd_IsNotNull() { regLogisticsCd(CK_ISNN, DOBJ); }

    protected void regLogisticsCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogisticsCd(), "LOGISTICS_CD"); }
    protected abstract ConditionValue xgetCValueLogisticsCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_Equal(String faxNo) {
        doSetFaxNo_Equal(fRES(faxNo));
    }

    protected void doSetFaxNo_Equal(String faxNo) {
        regFaxNo(CK_EQ, faxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_NotEqual(String faxNo) {
        doSetFaxNo_NotEqual(fRES(faxNo));
    }

    protected void doSetFaxNo_NotEqual(String faxNo) {
        regFaxNo(CK_NES, faxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_GreaterThan(String faxNo) {
        regFaxNo(CK_GT, fRES(faxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_LessThan(String faxNo) {
        regFaxNo(CK_LT, fRES(faxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_GreaterEqual(String faxNo) {
        regFaxNo(CK_GE, fRES(faxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_LessEqual(String faxNo) {
        regFaxNo(CK_LE, fRES(faxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNoList The collection of faxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_InScope(Collection<String> faxNoList) {
        doSetFaxNo_InScope(faxNoList);
    }

    protected void doSetFaxNo_InScope(Collection<String> faxNoList) {
        regINS(CK_INS, cTL(faxNoList), xgetCValueFaxNo(), "FAX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNoList The collection of faxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_NotInScope(Collection<String> faxNoList) {
        doSetFaxNo_NotInScope(faxNoList);
    }

    protected void doSetFaxNo_NotInScope(Collection<String> faxNoList) {
        regINS(CK_NINS, cTL(faxNoList), xgetCValueFaxNo(), "FAX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX_NO: {varchar(30)} <br>
     * <pre>e.g. setFaxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param faxNo The value of faxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFaxNo_LikeSearch(String faxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(faxNo), xgetCValueFaxNo(), "FAX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFaxNo_NotLikeSearch(String faxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(faxNo), xgetCValueFaxNo(), "FAX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX_NO: {varchar(30)}
     * @param faxNo The value of faxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_PrefixSearch(String faxNo) {
        setFaxNo_LikeSearch(faxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     */
    public void setFaxNo_IsNull() { regFaxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     */
    public void setFaxNo_IsNullOrEmpty() { regFaxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAX_NO: {varchar(30)}
     */
    public void setFaxNo_IsNotNull() { regFaxNo(CK_ISNN, DOBJ); }

    protected void regFaxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFaxNo(), "FAX_NO"); }
    protected abstract ConditionValue xgetCValueFaxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_Equal(String deliveryTime) {
        doSetDeliveryTime_Equal(fRES(deliveryTime));
    }

    protected void doSetDeliveryTime_Equal(String deliveryTime) {
        regDeliveryTime(CK_EQ, deliveryTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_NotEqual(String deliveryTime) {
        doSetDeliveryTime_NotEqual(fRES(deliveryTime));
    }

    protected void doSetDeliveryTime_NotEqual(String deliveryTime) {
        regDeliveryTime(CK_NES, deliveryTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_GreaterThan(String deliveryTime) {
        regDeliveryTime(CK_GT, fRES(deliveryTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_LessThan(String deliveryTime) {
        regDeliveryTime(CK_LT, fRES(deliveryTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_GreaterEqual(String deliveryTime) {
        regDeliveryTime(CK_GE, fRES(deliveryTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_LessEqual(String deliveryTime) {
        regDeliveryTime(CK_LE, fRES(deliveryTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTimeList The collection of deliveryTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_InScope(Collection<String> deliveryTimeList) {
        doSetDeliveryTime_InScope(deliveryTimeList);
    }

    protected void doSetDeliveryTime_InScope(Collection<String> deliveryTimeList) {
        regINS(CK_INS, cTL(deliveryTimeList), xgetCValueDeliveryTime(), "DELIVERY_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTimeList The collection of deliveryTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_NotInScope(Collection<String> deliveryTimeList) {
        doSetDeliveryTime_NotInScope(deliveryTimeList);
    }

    protected void doSetDeliveryTime_NotInScope(Collection<String> deliveryTimeList) {
        regINS(CK_NINS, cTL(deliveryTimeList), xgetCValueDeliveryTime(), "DELIVERY_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME: {varchar(60)} <br>
     * <pre>e.g. setDeliveryTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryTime The value of deliveryTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryTime_LikeSearch(String deliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryTime), xgetCValueDeliveryTime(), "DELIVERY_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryTime_NotLikeSearch(String deliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryTime), xgetCValueDeliveryTime(), "DELIVERY_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @param deliveryTime The value of deliveryTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTime_PrefixSearch(String deliveryTime) {
        setDeliveryTime_LikeSearch(deliveryTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     */
    public void setDeliveryTime_IsNull() { regDeliveryTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     */
    public void setDeliveryTime_IsNullOrEmpty() { regDeliveryTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_TIME: {varchar(60)}
     */
    public void setDeliveryTime_IsNotNull() { regDeliveryTime(CK_ISNN, DOBJ); }

    protected void regDeliveryTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryTime(), "DELIVERY_TIME"); }
    protected abstract ConditionValue xgetCValueDeliveryTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_Equal(String comments) {
        doSetComments_Equal(fRES(comments));
    }

    protected void doSetComments_Equal(String comments) {
        regComments(CK_EQ, comments);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_NotEqual(String comments) {
        doSetComments_NotEqual(fRES(comments));
    }

    protected void doSetComments_NotEqual(String comments) {
        regComments(CK_NES, comments);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_GreaterThan(String comments) {
        regComments(CK_GT, fRES(comments));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_LessThan(String comments) {
        regComments(CK_LT, fRES(comments));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_GreaterEqual(String comments) {
        regComments(CK_GE, fRES(comments));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_LessEqual(String comments) {
        regComments(CK_LE, fRES(comments));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param commentsList The collection of comments as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_InScope(Collection<String> commentsList) {
        doSetComments_InScope(commentsList);
    }

    protected void doSetComments_InScope(Collection<String> commentsList) {
        regINS(CK_INS, cTL(commentsList), xgetCValueComments(), "COMMENTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param commentsList The collection of comments as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_NotInScope(Collection<String> commentsList) {
        doSetComments_NotInScope(commentsList);
    }

    protected void doSetComments_NotInScope(Collection<String> commentsList) {
        regINS(CK_NINS, cTL(commentsList), xgetCValueComments(), "COMMENTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENTS: {varchar(60)} <br>
     * <pre>e.g. setComments_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comments The value of comments as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComments_LikeSearch(String comments, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comments), xgetCValueComments(), "COMMENTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComments_NotLikeSearch(String comments, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comments), xgetCValueComments(), "COMMENTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENTS: {varchar(60)}
     * @param comments The value of comments as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComments_PrefixSearch(String comments) {
        setComments_LikeSearch(comments, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     */
    public void setComments_IsNull() { regComments(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     */
    public void setComments_IsNullOrEmpty() { regComments(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENTS: {varchar(60)}
     */
    public void setComments_IsNotNull() { regComments(CK_ISNN, DOBJ); }

    protected void regComments(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComments(), "COMMENTS"); }
    protected abstract ConditionValue xgetCValueComments();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_Equal(String specialAgentsCd2) {
        doSetSpecialAgentsCd2_Equal(fRES(specialAgentsCd2));
    }

    protected void doSetSpecialAgentsCd2_Equal(String specialAgentsCd2) {
        regSpecialAgentsCd2(CK_EQ, specialAgentsCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_NotEqual(String specialAgentsCd2) {
        doSetSpecialAgentsCd2_NotEqual(fRES(specialAgentsCd2));
    }

    protected void doSetSpecialAgentsCd2_NotEqual(String specialAgentsCd2) {
        regSpecialAgentsCd2(CK_NES, specialAgentsCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_GreaterThan(String specialAgentsCd2) {
        regSpecialAgentsCd2(CK_GT, fRES(specialAgentsCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_LessThan(String specialAgentsCd2) {
        regSpecialAgentsCd2(CK_LT, fRES(specialAgentsCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_GreaterEqual(String specialAgentsCd2) {
        regSpecialAgentsCd2(CK_GE, fRES(specialAgentsCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_LessEqual(String specialAgentsCd2) {
        regSpecialAgentsCd2(CK_LE, fRES(specialAgentsCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2List The collection of specialAgentsCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_InScope(Collection<String> specialAgentsCd2List) {
        doSetSpecialAgentsCd2_InScope(specialAgentsCd2List);
    }

    protected void doSetSpecialAgentsCd2_InScope(Collection<String> specialAgentsCd2List) {
        regINS(CK_INS, cTL(specialAgentsCd2List), xgetCValueSpecialAgentsCd2(), "SPECIAL_AGENTS_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2List The collection of specialAgentsCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_NotInScope(Collection<String> specialAgentsCd2List) {
        doSetSpecialAgentsCd2_NotInScope(specialAgentsCd2List);
    }

    protected void doSetSpecialAgentsCd2_NotInScope(Collection<String> specialAgentsCd2List) {
        regINS(CK_NINS, cTL(specialAgentsCd2List), xgetCValueSpecialAgentsCd2(), "SPECIAL_AGENTS_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)} <br>
     * <pre>e.g. setSpecialAgentsCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specialAgentsCd2 The value of specialAgentsCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecialAgentsCd2_LikeSearch(String specialAgentsCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specialAgentsCd2), xgetCValueSpecialAgentsCd2(), "SPECIAL_AGENTS_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecialAgentsCd2_NotLikeSearch(String specialAgentsCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specialAgentsCd2), xgetCValueSpecialAgentsCd2(), "SPECIAL_AGENTS_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @param specialAgentsCd2 The value of specialAgentsCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsCd2_PrefixSearch(String specialAgentsCd2) {
        setSpecialAgentsCd2_LikeSearch(specialAgentsCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     */
    public void setSpecialAgentsCd2_IsNull() { regSpecialAgentsCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     */
    public void setSpecialAgentsCd2_IsNullOrEmpty() { regSpecialAgentsCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     */
    public void setSpecialAgentsCd2_IsNotNull() { regSpecialAgentsCd2(CK_ISNN, DOBJ); }

    protected void regSpecialAgentsCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecialAgentsCd2(), "SPECIAL_AGENTS_CD2"); }
    protected abstract ConditionValue xgetCValueSpecialAgentsCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_Equal(String specialAgentsFlg) {
        doSetSpecialAgentsFlg_Equal(fRES(specialAgentsFlg));
    }

    protected void doSetSpecialAgentsFlg_Equal(String specialAgentsFlg) {
        regSpecialAgentsFlg(CK_EQ, specialAgentsFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_NotEqual(String specialAgentsFlg) {
        doSetSpecialAgentsFlg_NotEqual(fRES(specialAgentsFlg));
    }

    protected void doSetSpecialAgentsFlg_NotEqual(String specialAgentsFlg) {
        regSpecialAgentsFlg(CK_NES, specialAgentsFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_GreaterThan(String specialAgentsFlg) {
        regSpecialAgentsFlg(CK_GT, fRES(specialAgentsFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_LessThan(String specialAgentsFlg) {
        regSpecialAgentsFlg(CK_LT, fRES(specialAgentsFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_GreaterEqual(String specialAgentsFlg) {
        regSpecialAgentsFlg(CK_GE, fRES(specialAgentsFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_LessEqual(String specialAgentsFlg) {
        regSpecialAgentsFlg(CK_LE, fRES(specialAgentsFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlgList The collection of specialAgentsFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_InScope(Collection<String> specialAgentsFlgList) {
        doSetSpecialAgentsFlg_InScope(specialAgentsFlgList);
    }

    protected void doSetSpecialAgentsFlg_InScope(Collection<String> specialAgentsFlgList) {
        regINS(CK_INS, cTL(specialAgentsFlgList), xgetCValueSpecialAgentsFlg(), "SPECIAL_AGENTS_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlgList The collection of specialAgentsFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_NotInScope(Collection<String> specialAgentsFlgList) {
        doSetSpecialAgentsFlg_NotInScope(specialAgentsFlgList);
    }

    protected void doSetSpecialAgentsFlg_NotInScope(Collection<String> specialAgentsFlgList) {
        regINS(CK_NINS, cTL(specialAgentsFlgList), xgetCValueSpecialAgentsFlg(), "SPECIAL_AGENTS_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setSpecialAgentsFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specialAgentsFlg The value of specialAgentsFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecialAgentsFlg_LikeSearch(String specialAgentsFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specialAgentsFlg), xgetCValueSpecialAgentsFlg(), "SPECIAL_AGENTS_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecialAgentsFlg_NotLikeSearch(String specialAgentsFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specialAgentsFlg), xgetCValueSpecialAgentsFlg(), "SPECIAL_AGENTS_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @param specialAgentsFlg The value of specialAgentsFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecialAgentsFlg_PrefixSearch(String specialAgentsFlg) {
        setSpecialAgentsFlg_LikeSearch(specialAgentsFlg, xcLSOPPre());
    }

    protected void regSpecialAgentsFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecialAgentsFlg(), "SPECIAL_AGENTS_FLG"); }
    protected abstract ConditionValue xgetCValueSpecialAgentsFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_Equal(String othercolumn1) {
        doSetOthercolumn1_Equal(fRES(othercolumn1));
    }

    protected void doSetOthercolumn1_Equal(String othercolumn1) {
        regOthercolumn1(CK_EQ, othercolumn1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_NotEqual(String othercolumn1) {
        doSetOthercolumn1_NotEqual(fRES(othercolumn1));
    }

    protected void doSetOthercolumn1_NotEqual(String othercolumn1) {
        regOthercolumn1(CK_NES, othercolumn1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_GreaterThan(String othercolumn1) {
        regOthercolumn1(CK_GT, fRES(othercolumn1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_LessThan(String othercolumn1) {
        regOthercolumn1(CK_LT, fRES(othercolumn1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_GreaterEqual(String othercolumn1) {
        regOthercolumn1(CK_GE, fRES(othercolumn1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_LessEqual(String othercolumn1) {
        regOthercolumn1(CK_LE, fRES(othercolumn1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1List The collection of othercolumn1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_InScope(Collection<String> othercolumn1List) {
        doSetOthercolumn1_InScope(othercolumn1List);
    }

    protected void doSetOthercolumn1_InScope(Collection<String> othercolumn1List) {
        regINS(CK_INS, cTL(othercolumn1List), xgetCValueOthercolumn1(), "OtherColumn1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1List The collection of othercolumn1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_NotInScope(Collection<String> othercolumn1List) {
        doSetOthercolumn1_NotInScope(othercolumn1List);
    }

    protected void doSetOthercolumn1_NotInScope(Collection<String> othercolumn1List) {
        regINS(CK_NINS, cTL(othercolumn1List), xgetCValueOthercolumn1(), "OtherColumn1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OtherColumn1: {varchar(30)} <br>
     * <pre>e.g. setOthercolumn1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param othercolumn1 The value of othercolumn1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOthercolumn1_LikeSearch(String othercolumn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(othercolumn1), xgetCValueOthercolumn1(), "OtherColumn1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercolumn1_NotLikeSearch(String othercolumn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercolumn1), xgetCValueOthercolumn1(), "OtherColumn1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OtherColumn1: {varchar(30)}
     * @param othercolumn1 The value of othercolumn1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercolumn1_PrefixSearch(String othercolumn1) {
        setOthercolumn1_LikeSearch(othercolumn1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     */
    public void setOthercolumn1_IsNull() { regOthercolumn1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     */
    public void setOthercolumn1_IsNullOrEmpty() { regOthercolumn1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OtherColumn1: {varchar(30)}
     */
    public void setOthercolumn1_IsNotNull() { regOthercolumn1(CK_ISNN, DOBJ); }

    protected void regOthercolumn1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercolumn1(), "OtherColumn1"); }
    protected abstract ConditionValue xgetCValueOthercolumn1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {varchar(100)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {varchar(100)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {varchar(100)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {varchar(100)}
     * @param name The value of name as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_PrefixSearch(String name) {
        setName_LikeSearch(name, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     */
    public void setName_IsNullOrEmpty() { regName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NAME: {varchar(100)}
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "NAME"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_Equal(String aName) {
        doSetAName_Equal(fRES(aName));
    }

    protected void doSetAName_Equal(String aName) {
        regAName(CK_EQ, aName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_NotEqual(String aName) {
        doSetAName_NotEqual(fRES(aName));
    }

    protected void doSetAName_NotEqual(String aName) {
        regAName(CK_NES, aName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_GreaterThan(String aName) {
        regAName(CK_GT, fRES(aName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_LessThan(String aName) {
        regAName(CK_LT, fRES(aName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_GreaterEqual(String aName) {
        regAName(CK_GE, fRES(aName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_LessEqual(String aName) {
        regAName(CK_LE, fRES(aName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aNameList The collection of aName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_InScope(Collection<String> aNameList) {
        doSetAName_InScope(aNameList);
    }

    protected void doSetAName_InScope(Collection<String> aNameList) {
        regINS(CK_INS, cTL(aNameList), xgetCValueAName(), "A_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aNameList The collection of aName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_NotInScope(Collection<String> aNameList) {
        doSetAName_NotInScope(aNameList);
    }

    protected void doSetAName_NotInScope(Collection<String> aNameList) {
        regINS(CK_NINS, cTL(aNameList), xgetCValueAName(), "A_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * A_NAME: {varchar(100)} <br>
     * <pre>e.g. setAName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aName The value of aName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAName_LikeSearch(String aName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aName), xgetCValueAName(), "A_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAName_NotLikeSearch(String aName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aName), xgetCValueAName(), "A_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * A_NAME: {varchar(100)}
     * @param aName The value of aName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAName_PrefixSearch(String aName) {
        setAName_LikeSearch(aName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     */
    public void setAName_IsNull() { regAName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     */
    public void setAName_IsNullOrEmpty() { regAName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * A_NAME: {varchar(100)}
     */
    public void setAName_IsNotNull() { regAName(CK_ISNN, DOBJ); }

    protected void regAName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAName(), "A_NAME"); }
    protected abstract ConditionValue xgetCValueAName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_Equal(String ssName) {
        doSetSsName_Equal(fRES(ssName));
    }

    protected void doSetSsName_Equal(String ssName) {
        regSsName(CK_EQ, ssName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_NotEqual(String ssName) {
        doSetSsName_NotEqual(fRES(ssName));
    }

    protected void doSetSsName_NotEqual(String ssName) {
        regSsName(CK_NES, ssName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_GreaterThan(String ssName) {
        regSsName(CK_GT, fRES(ssName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_LessThan(String ssName) {
        regSsName(CK_LT, fRES(ssName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_GreaterEqual(String ssName) {
        regSsName(CK_GE, fRES(ssName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_LessEqual(String ssName) {
        regSsName(CK_LE, fRES(ssName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssNameList The collection of ssName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_InScope(Collection<String> ssNameList) {
        doSetSsName_InScope(ssNameList);
    }

    protected void doSetSsName_InScope(Collection<String> ssNameList) {
        regINS(CK_INS, cTL(ssNameList), xgetCValueSsName(), "SS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssNameList The collection of ssName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_NotInScope(Collection<String> ssNameList) {
        doSetSsName_NotInScope(ssNameList);
    }

    protected void doSetSsName_NotInScope(Collection<String> ssNameList) {
        regINS(CK_NINS, cTL(ssNameList), xgetCValueSsName(), "SS_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SS_NAME: {varchar(30)} <br>
     * <pre>e.g. setSsName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ssName The value of ssName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSsName_LikeSearch(String ssName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ssName), xgetCValueSsName(), "SS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSsName_NotLikeSearch(String ssName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ssName), xgetCValueSsName(), "SS_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SS_NAME: {varchar(30)}
     * @param ssName The value of ssName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsName_PrefixSearch(String ssName) {
        setSsName_LikeSearch(ssName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     */
    public void setSsName_IsNull() { regSsName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     */
    public void setSsName_IsNullOrEmpty() { regSsName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SS_NAME: {varchar(30)}
     */
    public void setSsName_IsNotNull() { regSsName(CK_ISNN, DOBJ); }

    protected void regSsName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSsName(), "SS_NAME"); }
    protected abstract ConditionValue xgetCValueSsName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MCustomerCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCustomerCB&gt;() {
     *     public void query(MCustomerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCustomerCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCustomerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCustomerCQ sq);

    protected MCustomerCB xcreateScalarConditionCB() {
        MCustomerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCustomerCB xcreateScalarConditionPartitionByCB() {
        MCustomerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CUSTOMER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCustomerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCustomerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCustomerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CUSTOMER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCustomerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCustomerCQ sq);

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
    protected MCustomerCB newMyCB() {
        return new MCustomerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCustomerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

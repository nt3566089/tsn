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
 * The abstract condition-query of M_CARRIER_BOX.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierBoxCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierBoxCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CARRIER_BOX";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxId The value of carrierBoxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierBoxId_Equal(Long carrierBoxId) {
        doSetCarrierBoxId_Equal(carrierBoxId);
    }

    protected void doSetCarrierBoxId_Equal(Long carrierBoxId) {
        regCarrierBoxId(CK_EQ, carrierBoxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxId The value of carrierBoxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierBoxId_NotEqual(Long carrierBoxId) {
        doSetCarrierBoxId_NotEqual(carrierBoxId);
    }

    protected void doSetCarrierBoxId_NotEqual(Long carrierBoxId) {
        regCarrierBoxId(CK_NES, carrierBoxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxId The value of carrierBoxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierBoxId_GreaterThan(Long carrierBoxId) {
        regCarrierBoxId(CK_GT, carrierBoxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxId The value of carrierBoxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierBoxId_LessThan(Long carrierBoxId) {
        regCarrierBoxId(CK_LT, carrierBoxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxId The value of carrierBoxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierBoxId_GreaterEqual(Long carrierBoxId) {
        regCarrierBoxId(CK_GE, carrierBoxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxId The value of carrierBoxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierBoxId_LessEqual(Long carrierBoxId) {
        regCarrierBoxId(CK_LE, carrierBoxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of carrierBoxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierBoxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierBoxId(), "CARRIER_BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxIdList The collection of carrierBoxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierBoxId_InScope(Collection<Long> carrierBoxIdList) {
        doSetCarrierBoxId_InScope(carrierBoxIdList);
    }

    protected void doSetCarrierBoxId_InScope(Collection<Long> carrierBoxIdList) {
        regINS(CK_INS, cTL(carrierBoxIdList), xgetCValueCarrierBoxId(), "CARRIER_BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierBoxIdList The collection of carrierBoxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierBoxId_NotInScope(Collection<Long> carrierBoxIdList) {
        doSetCarrierBoxId_NotInScope(carrierBoxIdList);
    }

    protected void doSetCarrierBoxId_NotInScope(Collection<Long> carrierBoxIdList) {
        regINS(CK_NINS, cTL(carrierBoxIdList), xgetCValueCarrierBoxId(), "CARRIER_BOX_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierBoxId_IsNull() { regCarrierBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierBoxId_IsNotNull() { regCarrierBoxId(CK_ISNN, DOBJ); }

    protected void regCarrierBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierBoxId(), "CARRIER_BOX_ID"); }
    protected abstract ConditionValue xgetCValueCarrierBoxId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_Equal(Long carrierId) {
        doSetCarrierId_Equal(carrierId);
    }

    protected void doSetCarrierId_Equal(Long carrierId) {
        regCarrierId(CK_EQ, carrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_NotEqual(Long carrierId) {
        doSetCarrierId_NotEqual(carrierId);
    }

    protected void doSetCarrierId_NotEqual(Long carrierId) {
        regCarrierId(CK_NES, carrierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterThan(Long carrierId) {
        regCarrierId(CK_GT, carrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessThan(Long carrierId) {
        regCarrierId(CK_LT, carrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterEqual(Long carrierId) {
        regCarrierId(CK_GE, carrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessEqual(Long carrierId) {
        regCarrierId(CK_LE, carrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param minNumber The min number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId(), "CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierIdList The collection of carrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_InScope(Collection<Long> carrierIdList) {
        doSetCarrierId_InScope(carrierIdList);
    }

    protected void doSetCarrierId_InScope(Collection<Long> carrierIdList) {
        regINS(CK_INS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierIdList The collection of carrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotInScope(Collection<Long> carrierIdList) {
        doSetCarrierId_NotInScope(carrierIdList);
    }

    protected void doSetCarrierId_NotInScope(Collection<Long> carrierIdList) {
        regINS(CK_NINS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_ID from M_CARRIER where ...)} <br />
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @param subCBLambda The callback for sub-query of MCarrier for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrier(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId_InScopeRelation_MCarrier(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrier", false);
    }
    public abstract String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_ID from M_CARRIER where ...)} <br />
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @param subCBLambda The callback for sub-query of MCarrier for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrier(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId_NotInScopeRelation_MCarrier(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrier", true);
    }
    public abstract String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq);

    protected void regCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId(), "CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCarrierId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
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
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
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
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
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
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
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

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_Equal(String boxSizeCd) {
        doSetBoxSizeCd_Equal(fRES(boxSizeCd));
    }

    protected void doSetBoxSizeCd_Equal(String boxSizeCd) {
        regBoxSizeCd(CK_EQ, boxSizeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_NotEqual(String boxSizeCd) {
        doSetBoxSizeCd_NotEqual(fRES(boxSizeCd));
    }

    protected void doSetBoxSizeCd_NotEqual(String boxSizeCd) {
        regBoxSizeCd(CK_NES, boxSizeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_GreaterThan(String boxSizeCd) {
        regBoxSizeCd(CK_GT, fRES(boxSizeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_LessThan(String boxSizeCd) {
        regBoxSizeCd(CK_LT, fRES(boxSizeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_GreaterEqual(String boxSizeCd) {
        regBoxSizeCd(CK_GE, fRES(boxSizeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_LessEqual(String boxSizeCd) {
        regBoxSizeCd(CK_LE, fRES(boxSizeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCdList The collection of boxSizeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_InScope(Collection<String> boxSizeCdList) {
        doSetBoxSizeCd_InScope(boxSizeCdList);
    }

    protected void doSetBoxSizeCd_InScope(Collection<String> boxSizeCdList) {
        regINS(CK_INS, cTL(boxSizeCdList), xgetCValueBoxSizeCd(), "BOX_SIZE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCdList The collection of boxSizeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_NotInScope(Collection<String> boxSizeCdList) {
        doSetBoxSizeCd_NotInScope(boxSizeCdList);
    }

    protected void doSetBoxSizeCd_NotInScope(Collection<String> boxSizeCdList) {
        regINS(CK_NINS, cTL(boxSizeCdList), xgetCValueBoxSizeCd(), "BOX_SIZE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setBoxSizeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxSizeCd The value of boxSizeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxSizeCd_LikeSearch(String boxSizeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxSizeCd), xgetCValueBoxSizeCd(), "BOX_SIZE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxSizeCd_NotLikeSearch(String boxSizeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxSizeCd), xgetCValueBoxSizeCd(), "BOX_SIZE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_SIZE_CD: {NotNull, varchar(30)}
     * @param boxSizeCd The value of boxSizeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxSizeCd_PrefixSearch(String boxSizeCd) {
        setBoxSizeCd_LikeSearch(boxSizeCd, xcLSOPPre());
    }

    protected void regBoxSizeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxSizeCd(), "BOX_SIZE_CD"); }
    protected abstract ConditionValue xgetCValueBoxSizeCd();

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
    public HpSLCFunction<MCarrierBoxCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierBoxCB.class);
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
    public HpSLCFunction<MCarrierBoxCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierBoxCB.class);
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
    public HpSLCFunction<MCarrierBoxCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierBoxCB.class);
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
    public HpSLCFunction<MCarrierBoxCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierBoxCB.class);
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
    public HpSLCFunction<MCarrierBoxCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierBoxCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierBoxCB&gt;() {
     *     public void query(MCarrierBoxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierBoxCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierBoxCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierBoxCQ sq);

    protected MCarrierBoxCB xcreateScalarConditionCB() {
        MCarrierBoxCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierBoxCB xcreateScalarConditionPartitionByCB() {
        MCarrierBoxCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierBoxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_BOX_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierBoxCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierBoxCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierBoxCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_BOX_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierBoxCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierBoxCQ sq);

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
    protected MCarrierBoxCB newMyCB() {
        return new MCarrierBoxCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierBoxCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of M_CARRIER_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierZipCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierZipCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CARRIER_ZIP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipId The value of carrierZipId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierZipId_Equal(Long carrierZipId) {
        doSetCarrierZipId_Equal(carrierZipId);
    }

    protected void doSetCarrierZipId_Equal(Long carrierZipId) {
        regCarrierZipId(CK_EQ, carrierZipId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipId The value of carrierZipId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierZipId_NotEqual(Long carrierZipId) {
        doSetCarrierZipId_NotEqual(carrierZipId);
    }

    protected void doSetCarrierZipId_NotEqual(Long carrierZipId) {
        regCarrierZipId(CK_NES, carrierZipId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipId The value of carrierZipId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierZipId_GreaterThan(Long carrierZipId) {
        regCarrierZipId(CK_GT, carrierZipId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipId The value of carrierZipId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierZipId_LessThan(Long carrierZipId) {
        regCarrierZipId(CK_LT, carrierZipId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipId The value of carrierZipId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierZipId_GreaterEqual(Long carrierZipId) {
        regCarrierZipId(CK_GE, carrierZipId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipId The value of carrierZipId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierZipId_LessEqual(Long carrierZipId) {
        regCarrierZipId(CK_LE, carrierZipId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of carrierZipId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierZipId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierZipId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierZipId(), "CARRIER_ZIP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipIdList The collection of carrierZipId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierZipId_InScope(Collection<Long> carrierZipIdList) {
        doSetCarrierZipId_InScope(carrierZipIdList);
    }

    protected void doSetCarrierZipId_InScope(Collection<Long> carrierZipIdList) {
        regINS(CK_INS, cTL(carrierZipIdList), xgetCValueCarrierZipId(), "CARRIER_ZIP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierZipIdList The collection of carrierZipId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierZipId_NotInScope(Collection<Long> carrierZipIdList) {
        doSetCarrierZipId_NotInScope(carrierZipIdList);
    }

    protected void doSetCarrierZipId_NotInScope(Collection<Long> carrierZipIdList) {
        regINS(CK_NINS, cTL(carrierZipIdList), xgetCValueCarrierZipId(), "CARRIER_ZIP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierZipId_IsNull() { regCarrierZipId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierZipId_IsNotNull() { regCarrierZipId(CK_ISNN, DOBJ); }

    protected void regCarrierZipId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierZipId(), "CARRIER_ZIP_ID"); }
    protected abstract ConditionValue xgetCValueCarrierZipId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierId The value of commonCarrierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_Equal(Long commonCarrierId) {
        doSetCommonCarrierId_Equal(commonCarrierId);
    }

    protected void doSetCommonCarrierId_Equal(Long commonCarrierId) {
        regCommonCarrierId(CK_EQ, commonCarrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierId The value of commonCarrierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_NotEqual(Long commonCarrierId) {
        doSetCommonCarrierId_NotEqual(commonCarrierId);
    }

    protected void doSetCommonCarrierId_NotEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_NES, commonCarrierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierId The value of commonCarrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_GreaterThan(Long commonCarrierId) {
        regCommonCarrierId(CK_GT, commonCarrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierId The value of commonCarrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_LessThan(Long commonCarrierId) {
        regCommonCarrierId(CK_LT, commonCarrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierId The value of commonCarrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_GreaterEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_GE, commonCarrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierId The value of commonCarrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_LessEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_LE, commonCarrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param minNumber The min number of commonCarrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of commonCarrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCommonCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierIdList The collection of commonCarrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonCarrierId_InScope(Collection<Long> commonCarrierIdList) {
        doSetCommonCarrierId_InScope(commonCarrierIdList);
    }

    protected void doSetCommonCarrierId_InScope(Collection<Long> commonCarrierIdList) {
        regINS(CK_INS, cTL(commonCarrierIdList), xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @param commonCarrierIdList The collection of commonCarrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonCarrierId_NotInScope(Collection<Long> commonCarrierIdList) {
        doSetCommonCarrierId_NotInScope(commonCarrierIdList);
    }

    protected void doSetCommonCarrierId_NotInScope(Collection<Long> commonCarrierIdList) {
        regINS(CK_NINS, cTL(commonCarrierIdList), xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COMMON_CARRIER_ID from M_COMMON_CARRIER where ...)} <br />
     * M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @param subCBLambda The callback for sub-query of MCommonCarrier for 'in-scope'. (NotNull)
     */
    public void inScopeMCommonCarrier(SubQuery<MCommonCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCommonCarrierId_InScopeRelation_MCommonCarrier(cb.query());
        registerInScopeRelation(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCommonCarrier", false);
    }
    public abstract String keepCommonCarrierId_InScopeRelation_MCommonCarrier(MCommonCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COMMON_CARRIER_ID from M_COMMON_CARRIER where ...)} <br />
     * M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @param subCBLambda The callback for sub-query of MCommonCarrier for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCommonCarrier(SubQuery<MCommonCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCommonCarrierId_NotInScopeRelation_MCommonCarrier(cb.query());
        registerInScopeRelation(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCommonCarrier", true);
    }
    public abstract String keepCommonCarrierId_NotInScopeRelation_MCommonCarrier(MCommonCarrierCQ sq);

    protected void regCommonCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCommonCarrierId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipId The value of zipId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_Equal(Long zipId) {
        doSetZipId_Equal(zipId);
    }

    protected void doSetZipId_Equal(Long zipId) {
        regZipId(CK_EQ, zipId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipId The value of zipId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_NotEqual(Long zipId) {
        doSetZipId_NotEqual(zipId);
    }

    protected void doSetZipId_NotEqual(Long zipId) {
        regZipId(CK_NES, zipId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipId The value of zipId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_GreaterThan(Long zipId) {
        regZipId(CK_GT, zipId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipId The value of zipId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_LessThan(Long zipId) {
        regZipId(CK_LT, zipId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipId The value of zipId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_GreaterEqual(Long zipId) {
        regZipId(CK_GE, zipId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipId The value of zipId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_LessEqual(Long zipId) {
        regZipId(CK_LE, zipId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param minNumber The min number of zipId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zipId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZipId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZipId(), "ZIP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipIdList The collection of zipId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipId_InScope(Collection<Long> zipIdList) {
        doSetZipId_InScope(zipIdList);
    }

    protected void doSetZipId_InScope(Collection<Long> zipIdList) {
        regINS(CK_INS, cTL(zipIdList), xgetCValueZipId(), "ZIP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @param zipIdList The collection of zipId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipId_NotInScope(Collection<Long> zipIdList) {
        doSetZipId_NotInScope(zipIdList);
    }

    protected void doSetZipId_NotInScope(Collection<Long> zipIdList) {
        regINS(CK_NINS, cTL(zipIdList), xgetCValueZipId(), "ZIP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ZIP_ID from M_ZIP where ...)} <br />
     * M_ZIP by my ZIP_ID, named 'MZip'.
     * @param subCBLambda The callback for sub-query of MZip for 'in-scope'. (NotNull)
     */
    public void inScopeMZip(SubQuery<MZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZipCB cb = new MZipCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepZipId_InScopeRelation_MZip(cb.query());
        registerInScopeRelation(cb.query(), "ZIP_ID", "ZIP_ID", pp, "mZip", false);
    }
    public abstract String keepZipId_InScopeRelation_MZip(MZipCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ZIP_ID from M_ZIP where ...)} <br />
     * M_ZIP by my ZIP_ID, named 'MZip'.
     * @param subCBLambda The callback for sub-query of MZip for 'not in-scope'. (NotNull)
     */
    public void notInScopeMZip(SubQuery<MZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZipCB cb = new MZipCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepZipId_NotInScopeRelation_MZip(cb.query());
        registerInScopeRelation(cb.query(), "ZIP_ID", "ZIP_ID", pp, "mZip", true);
    }
    public abstract String keepZipId_NotInScopeRelation_MZip(MZipCQ sq);

    protected void regZipId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipId(), "ZIP_ID"); }
    protected abstract ConditionValue xgetCValueZipId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_Equal(String arrivalStoreCd) {
        doSetArrivalStoreCd_Equal(fRES(arrivalStoreCd));
    }

    protected void doSetArrivalStoreCd_Equal(String arrivalStoreCd) {
        regArrivalStoreCd(CK_EQ, arrivalStoreCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_NotEqual(String arrivalStoreCd) {
        doSetArrivalStoreCd_NotEqual(fRES(arrivalStoreCd));
    }

    protected void doSetArrivalStoreCd_NotEqual(String arrivalStoreCd) {
        regArrivalStoreCd(CK_NES, arrivalStoreCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_GreaterThan(String arrivalStoreCd) {
        regArrivalStoreCd(CK_GT, fRES(arrivalStoreCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_LessThan(String arrivalStoreCd) {
        regArrivalStoreCd(CK_LT, fRES(arrivalStoreCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_GreaterEqual(String arrivalStoreCd) {
        regArrivalStoreCd(CK_GE, fRES(arrivalStoreCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_LessEqual(String arrivalStoreCd) {
        regArrivalStoreCd(CK_LE, fRES(arrivalStoreCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCdList The collection of arrivalStoreCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_InScope(Collection<String> arrivalStoreCdList) {
        doSetArrivalStoreCd_InScope(arrivalStoreCdList);
    }

    protected void doSetArrivalStoreCd_InScope(Collection<String> arrivalStoreCdList) {
        regINS(CK_INS, cTL(arrivalStoreCdList), xgetCValueArrivalStoreCd(), "ARRIVAL_STORE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCdList The collection of arrivalStoreCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_NotInScope(Collection<String> arrivalStoreCdList) {
        doSetArrivalStoreCd_NotInScope(arrivalStoreCdList);
    }

    protected void doSetArrivalStoreCd_NotInScope(Collection<String> arrivalStoreCdList) {
        regINS(CK_NINS, cTL(arrivalStoreCdList), xgetCValueArrivalStoreCd(), "ARRIVAL_STORE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setArrivalStoreCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalStoreCd The value of arrivalStoreCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalStoreCd_LikeSearch(String arrivalStoreCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalStoreCd), xgetCValueArrivalStoreCd(), "ARRIVAL_STORE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalStoreCd_NotLikeSearch(String arrivalStoreCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalStoreCd), xgetCValueArrivalStoreCd(), "ARRIVAL_STORE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @param arrivalStoreCd The value of arrivalStoreCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreCd_PrefixSearch(String arrivalStoreCd) {
        setArrivalStoreCd_LikeSearch(arrivalStoreCd, xcLSOPPre());
    }

    protected void regArrivalStoreCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalStoreCd(), "ARRIVAL_STORE_CD"); }
    protected abstract ConditionValue xgetCValueArrivalStoreCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_Equal(String arrivalStoreNm) {
        doSetArrivalStoreNm_Equal(fRES(arrivalStoreNm));
    }

    protected void doSetArrivalStoreNm_Equal(String arrivalStoreNm) {
        regArrivalStoreNm(CK_EQ, arrivalStoreNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_NotEqual(String arrivalStoreNm) {
        doSetArrivalStoreNm_NotEqual(fRES(arrivalStoreNm));
    }

    protected void doSetArrivalStoreNm_NotEqual(String arrivalStoreNm) {
        regArrivalStoreNm(CK_NES, arrivalStoreNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_GreaterThan(String arrivalStoreNm) {
        regArrivalStoreNm(CK_GT, fRES(arrivalStoreNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_LessThan(String arrivalStoreNm) {
        regArrivalStoreNm(CK_LT, fRES(arrivalStoreNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_GreaterEqual(String arrivalStoreNm) {
        regArrivalStoreNm(CK_GE, fRES(arrivalStoreNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_LessEqual(String arrivalStoreNm) {
        regArrivalStoreNm(CK_LE, fRES(arrivalStoreNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNmList The collection of arrivalStoreNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_InScope(Collection<String> arrivalStoreNmList) {
        doSetArrivalStoreNm_InScope(arrivalStoreNmList);
    }

    protected void doSetArrivalStoreNm_InScope(Collection<String> arrivalStoreNmList) {
        regINS(CK_INS, cTL(arrivalStoreNmList), xgetCValueArrivalStoreNm(), "ARRIVAL_STORE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNmList The collection of arrivalStoreNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_NotInScope(Collection<String> arrivalStoreNmList) {
        doSetArrivalStoreNm_NotInScope(arrivalStoreNmList);
    }

    protected void doSetArrivalStoreNm_NotInScope(Collection<String> arrivalStoreNmList) {
        regINS(CK_NINS, cTL(arrivalStoreNmList), xgetCValueArrivalStoreNm(), "ARRIVAL_STORE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)} <br>
     * <pre>e.g. setArrivalStoreNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalStoreNm The value of arrivalStoreNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalStoreNm_LikeSearch(String arrivalStoreNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalStoreNm), xgetCValueArrivalStoreNm(), "ARRIVAL_STORE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalStoreNm_NotLikeSearch(String arrivalStoreNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalStoreNm), xgetCValueArrivalStoreNm(), "ARRIVAL_STORE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @param arrivalStoreNm The value of arrivalStoreNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreNm_PrefixSearch(String arrivalStoreNm) {
        setArrivalStoreNm_LikeSearch(arrivalStoreNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     */
    public void setArrivalStoreNm_IsNull() { regArrivalStoreNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     */
    public void setArrivalStoreNm_IsNullOrEmpty() { regArrivalStoreNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     */
    public void setArrivalStoreNm_IsNotNull() { regArrivalStoreNm(CK_ISNN, DOBJ); }

    protected void regArrivalStoreNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalStoreNm(), "ARRIVAL_STORE_NM"); }
    protected abstract ConditionValue xgetCValueArrivalStoreNm();

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
    public HpSLCFunction<MCarrierZipCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierZipCB.class);
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
    public HpSLCFunction<MCarrierZipCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierZipCB.class);
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
    public HpSLCFunction<MCarrierZipCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierZipCB.class);
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
    public HpSLCFunction<MCarrierZipCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierZipCB.class);
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
    public HpSLCFunction<MCarrierZipCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierZipCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierZipCB&gt;() {
     *     public void query(MCarrierZipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierZipCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierZipCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierZipCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierZipCQ sq);

    protected MCarrierZipCB xcreateScalarConditionCB() {
        MCarrierZipCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierZipCB xcreateScalarConditionPartitionByCB() {
        MCarrierZipCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierZipCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_ZIP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierZipCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierZipCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierZipCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_ZIP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierZipCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierZipCQ sq);

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
    protected MCarrierZipCB newMyCB() {
        return new MCarrierZipCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierZipCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

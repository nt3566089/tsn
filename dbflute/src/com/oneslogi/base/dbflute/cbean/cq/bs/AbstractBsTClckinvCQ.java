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
 * The abstract condition-query of T_CLCKINV.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTClckinvCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTClckinvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CLCKINV";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvId The value of clckinvId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClckinvId_Equal(Long clckinvId) {
        doSetClckinvId_Equal(clckinvId);
    }

    protected void doSetClckinvId_Equal(Long clckinvId) {
        regClckinvId(CK_EQ, clckinvId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvId The value of clckinvId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClckinvId_NotEqual(Long clckinvId) {
        doSetClckinvId_NotEqual(clckinvId);
    }

    protected void doSetClckinvId_NotEqual(Long clckinvId) {
        regClckinvId(CK_NES, clckinvId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvId The value of clckinvId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClckinvId_GreaterThan(Long clckinvId) {
        regClckinvId(CK_GT, clckinvId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvId The value of clckinvId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClckinvId_LessThan(Long clckinvId) {
        regClckinvId(CK_LT, clckinvId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvId The value of clckinvId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClckinvId_GreaterEqual(Long clckinvId) {
        regClckinvId(CK_GE, clckinvId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvId The value of clckinvId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClckinvId_LessEqual(Long clckinvId) {
        regClckinvId(CK_LE, clckinvId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of clckinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clckinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClckinvId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClckinvId(), "CLCKINV_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvIdList The collection of clckinvId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClckinvId_InScope(Collection<Long> clckinvIdList) {
        doSetClckinvId_InScope(clckinvIdList);
    }

    protected void doSetClckinvId_InScope(Collection<Long> clckinvIdList) {
        regINS(CK_INS, cTL(clckinvIdList), xgetCValueClckinvId(), "CLCKINV_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clckinvIdList The collection of clckinvId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClckinvId_NotInScope(Collection<Long> clckinvIdList) {
        doSetClckinvId_NotInScope(clckinvIdList);
    }

    protected void doSetClckinvId_NotInScope(Collection<Long> clckinvIdList) {
        regINS(CK_NINS, cTL(clckinvIdList), xgetCValueClckinvId(), "CLCKINV_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClckinvId_IsNull() { regClckinvId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClckinvId_IsNotNull() { regClckinvId(CK_ISNN, DOBJ); }

    protected void regClckinvId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClckinvId(), "CLCKINV_ID"); }
    protected abstract ConditionValue xgetCValueClckinvId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
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
     * CENTER_ID: {bigint(19)}
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
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19)}
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
     * CENTER_ID: {bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqa The value of presrcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrcbqa_Equal(Long presrcbqa) {
        doSetPresrcbqa_Equal(presrcbqa);
    }

    protected void doSetPresrcbqa_Equal(Long presrcbqa) {
        regPresrcbqa(CK_EQ, presrcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqa The value of presrcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrcbqa_NotEqual(Long presrcbqa) {
        doSetPresrcbqa_NotEqual(presrcbqa);
    }

    protected void doSetPresrcbqa_NotEqual(Long presrcbqa) {
        regPresrcbqa(CK_NES, presrcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqa The value of presrcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrcbqa_GreaterThan(Long presrcbqa) {
        regPresrcbqa(CK_GT, presrcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqa The value of presrcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrcbqa_LessThan(Long presrcbqa) {
        regPresrcbqa(CK_LT, presrcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqa The value of presrcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrcbqa_GreaterEqual(Long presrcbqa) {
        regPresrcbqa(CK_GE, presrcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqa The value of presrcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrcbqa_LessEqual(Long presrcbqa) {
        regPresrcbqa(CK_LE, presrcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param minNumber The min number of presrcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presrcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresrcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresrcbqa(), "PRESRCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqaList The collection of presrcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresrcbqa_InScope(Collection<Long> presrcbqaList) {
        doSetPresrcbqa_InScope(presrcbqaList);
    }

    protected void doSetPresrcbqa_InScope(Collection<Long> presrcbqaList) {
        regINS(CK_INS, cTL(presrcbqaList), xgetCValuePresrcbqa(), "PRESRCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     * @param presrcbqaList The collection of presrcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresrcbqa_NotInScope(Collection<Long> presrcbqaList) {
        doSetPresrcbqa_NotInScope(presrcbqaList);
    }

    protected void doSetPresrcbqa_NotInScope(Collection<Long> presrcbqaList) {
        regINS(CK_NINS, cTL(presrcbqaList), xgetCValuePresrcbqa(), "PRESRCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     */
    public void setPresrcbqa_IsNull() { regPresrcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESRCBQA: {bigint(19)}
     */
    public void setPresrcbqa_IsNotNull() { regPresrcbqa(CK_ISNN, DOBJ); }

    protected void regPresrcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresrcbqa(), "PRESRCBQA"); }
    protected abstract ConditionValue xgetCValuePresrcbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqa The value of presrctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrctqa_Equal(Long presrctqa) {
        doSetPresrctqa_Equal(presrctqa);
    }

    protected void doSetPresrctqa_Equal(Long presrctqa) {
        regPresrctqa(CK_EQ, presrctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqa The value of presrctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrctqa_NotEqual(Long presrctqa) {
        doSetPresrctqa_NotEqual(presrctqa);
    }

    protected void doSetPresrctqa_NotEqual(Long presrctqa) {
        regPresrctqa(CK_NES, presrctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqa The value of presrctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrctqa_GreaterThan(Long presrctqa) {
        regPresrctqa(CK_GT, presrctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqa The value of presrctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrctqa_LessThan(Long presrctqa) {
        regPresrctqa(CK_LT, presrctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqa The value of presrctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrctqa_GreaterEqual(Long presrctqa) {
        regPresrctqa(CK_GE, presrctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqa The value of presrctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresrctqa_LessEqual(Long presrctqa) {
        regPresrctqa(CK_LE, presrctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param minNumber The min number of presrctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presrctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresrctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresrctqa(), "PRESRCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqaList The collection of presrctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresrctqa_InScope(Collection<Long> presrctqaList) {
        doSetPresrctqa_InScope(presrctqaList);
    }

    protected void doSetPresrctqa_InScope(Collection<Long> presrctqaList) {
        regINS(CK_INS, cTL(presrctqaList), xgetCValuePresrctqa(), "PRESRCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     * @param presrctqaList The collection of presrctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresrctqa_NotInScope(Collection<Long> presrctqaList) {
        doSetPresrctqa_NotInScope(presrctqaList);
    }

    protected void doSetPresrctqa_NotInScope(Collection<Long> presrctqaList) {
        regINS(CK_NINS, cTL(presrctqaList), xgetCValuePresrctqa(), "PRESRCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     */
    public void setPresrctqa_IsNull() { regPresrctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESRCTQA: {bigint(19)}
     */
    public void setPresrctqa_IsNotNull() { regPresrctqa(CK_ISNN, DOBJ); }

    protected void regPresrctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresrctqa(), "PRESRCTQA"); }
    protected abstract ConditionValue xgetCValuePresrctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivq The value of lckcbivq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckcbivq_Equal(Long lckcbivq) {
        doSetLckcbivq_Equal(lckcbivq);
    }

    protected void doSetLckcbivq_Equal(Long lckcbivq) {
        regLckcbivq(CK_EQ, lckcbivq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivq The value of lckcbivq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckcbivq_NotEqual(Long lckcbivq) {
        doSetLckcbivq_NotEqual(lckcbivq);
    }

    protected void doSetLckcbivq_NotEqual(Long lckcbivq) {
        regLckcbivq(CK_NES, lckcbivq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivq The value of lckcbivq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckcbivq_GreaterThan(Long lckcbivq) {
        regLckcbivq(CK_GT, lckcbivq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivq The value of lckcbivq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckcbivq_LessThan(Long lckcbivq) {
        regLckcbivq(CK_LT, lckcbivq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivq The value of lckcbivq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckcbivq_GreaterEqual(Long lckcbivq) {
        regLckcbivq(CK_GE, lckcbivq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivq The value of lckcbivq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckcbivq_LessEqual(Long lckcbivq) {
        regLckcbivq(CK_LE, lckcbivq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param minNumber The min number of lckcbivq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lckcbivq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLckcbivq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLckcbivq(), "LCKCBIVQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivqList The collection of lckcbivq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLckcbivq_InScope(Collection<Long> lckcbivqList) {
        doSetLckcbivq_InScope(lckcbivqList);
    }

    protected void doSetLckcbivq_InScope(Collection<Long> lckcbivqList) {
        regINS(CK_INS, cTL(lckcbivqList), xgetCValueLckcbivq(), "LCKCBIVQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     * @param lckcbivqList The collection of lckcbivq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLckcbivq_NotInScope(Collection<Long> lckcbivqList) {
        doSetLckcbivq_NotInScope(lckcbivqList);
    }

    protected void doSetLckcbivq_NotInScope(Collection<Long> lckcbivqList) {
        regINS(CK_NINS, cTL(lckcbivqList), xgetCValueLckcbivq(), "LCKCBIVQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     */
    public void setLckcbivq_IsNull() { regLckcbivq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LCKCBIVQ: {bigint(19)}
     */
    public void setLckcbivq_IsNotNull() { regLckcbivq(CK_ISNN, DOBJ); }

    protected void regLckcbivq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLckcbivq(), "LCKCBIVQ"); }
    protected abstract ConditionValue xgetCValueLckcbivq();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivq The value of lckctivq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckctivq_Equal(Long lckctivq) {
        doSetLckctivq_Equal(lckctivq);
    }

    protected void doSetLckctivq_Equal(Long lckctivq) {
        regLckctivq(CK_EQ, lckctivq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivq The value of lckctivq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckctivq_NotEqual(Long lckctivq) {
        doSetLckctivq_NotEqual(lckctivq);
    }

    protected void doSetLckctivq_NotEqual(Long lckctivq) {
        regLckctivq(CK_NES, lckctivq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivq The value of lckctivq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckctivq_GreaterThan(Long lckctivq) {
        regLckctivq(CK_GT, lckctivq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivq The value of lckctivq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckctivq_LessThan(Long lckctivq) {
        regLckctivq(CK_LT, lckctivq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivq The value of lckctivq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckctivq_GreaterEqual(Long lckctivq) {
        regLckctivq(CK_GE, lckctivq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivq The value of lckctivq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLckctivq_LessEqual(Long lckctivq) {
        regLckctivq(CK_LE, lckctivq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param minNumber The min number of lckctivq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lckctivq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLckctivq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLckctivq(), "LCKCTIVQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivqList The collection of lckctivq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLckctivq_InScope(Collection<Long> lckctivqList) {
        doSetLckctivq_InScope(lckctivqList);
    }

    protected void doSetLckctivq_InScope(Collection<Long> lckctivqList) {
        regINS(CK_INS, cTL(lckctivqList), xgetCValueLckctivq(), "LCKCTIVQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     * @param lckctivqList The collection of lckctivq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLckctivq_NotInScope(Collection<Long> lckctivqList) {
        doSetLckctivq_NotInScope(lckctivqList);
    }

    protected void doSetLckctivq_NotInScope(Collection<Long> lckctivqList) {
        regINS(CK_NINS, cTL(lckctivqList), xgetCValueLckctivq(), "LCKCTIVQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     */
    public void setLckctivq_IsNull() { regLckctivq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LCKCTIVQ: {bigint(19)}
     */
    public void setLckctivq_IsNotNull() { regLckctivq(CK_ISNN, DOBJ); }

    protected void regLckctivq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLckctivq(), "LCKCTIVQ"); }
    protected abstract ConditionValue xgetCValueLckctivq();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqa The value of dscbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDscbqa_Equal(Long dscbqa) {
        doSetDscbqa_Equal(dscbqa);
    }

    protected void doSetDscbqa_Equal(Long dscbqa) {
        regDscbqa(CK_EQ, dscbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqa The value of dscbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDscbqa_NotEqual(Long dscbqa) {
        doSetDscbqa_NotEqual(dscbqa);
    }

    protected void doSetDscbqa_NotEqual(Long dscbqa) {
        regDscbqa(CK_NES, dscbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqa The value of dscbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDscbqa_GreaterThan(Long dscbqa) {
        regDscbqa(CK_GT, dscbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqa The value of dscbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDscbqa_LessThan(Long dscbqa) {
        regDscbqa(CK_LT, dscbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqa The value of dscbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDscbqa_GreaterEqual(Long dscbqa) {
        regDscbqa(CK_GE, dscbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqa The value of dscbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDscbqa_LessEqual(Long dscbqa) {
        regDscbqa(CK_LE, dscbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param minNumber The min number of dscbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dscbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDscbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDscbqa(), "DSCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqaList The collection of dscbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDscbqa_InScope(Collection<Long> dscbqaList) {
        doSetDscbqa_InScope(dscbqaList);
    }

    protected void doSetDscbqa_InScope(Collection<Long> dscbqaList) {
        regINS(CK_INS, cTL(dscbqaList), xgetCValueDscbqa(), "DSCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DSCBQA: {bigint(19)}
     * @param dscbqaList The collection of dscbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDscbqa_NotInScope(Collection<Long> dscbqaList) {
        doSetDscbqa_NotInScope(dscbqaList);
    }

    protected void doSetDscbqa_NotInScope(Collection<Long> dscbqaList) {
        regINS(CK_NINS, cTL(dscbqaList), xgetCValueDscbqa(), "DSCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     */
    public void setDscbqa_IsNull() { regDscbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DSCBQA: {bigint(19)}
     */
    public void setDscbqa_IsNotNull() { regDscbqa(CK_ISNN, DOBJ); }

    protected void regDscbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDscbqa(), "DSCBQA"); }
    protected abstract ConditionValue xgetCValueDscbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqa The value of dsctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDsctqa_Equal(Long dsctqa) {
        doSetDsctqa_Equal(dsctqa);
    }

    protected void doSetDsctqa_Equal(Long dsctqa) {
        regDsctqa(CK_EQ, dsctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqa The value of dsctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDsctqa_NotEqual(Long dsctqa) {
        doSetDsctqa_NotEqual(dsctqa);
    }

    protected void doSetDsctqa_NotEqual(Long dsctqa) {
        regDsctqa(CK_NES, dsctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqa The value of dsctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDsctqa_GreaterThan(Long dsctqa) {
        regDsctqa(CK_GT, dsctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqa The value of dsctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDsctqa_LessThan(Long dsctqa) {
        regDsctqa(CK_LT, dsctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqa The value of dsctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDsctqa_GreaterEqual(Long dsctqa) {
        regDsctqa(CK_GE, dsctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqa The value of dsctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDsctqa_LessEqual(Long dsctqa) {
        regDsctqa(CK_LE, dsctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param minNumber The min number of dsctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dsctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDsctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDsctqa(), "DSCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqaList The collection of dsctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsctqa_InScope(Collection<Long> dsctqaList) {
        doSetDsctqa_InScope(dsctqaList);
    }

    protected void doSetDsctqa_InScope(Collection<Long> dsctqaList) {
        regINS(CK_INS, cTL(dsctqaList), xgetCValueDsctqa(), "DSCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DSCTQA: {bigint(19)}
     * @param dsctqaList The collection of dsctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsctqa_NotInScope(Collection<Long> dsctqaList) {
        doSetDsctqa_NotInScope(dsctqaList);
    }

    protected void doSetDsctqa_NotInScope(Collection<Long> dsctqaList) {
        regINS(CK_NINS, cTL(dsctqaList), xgetCValueDsctqa(), "DSCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     */
    public void setDsctqa_IsNull() { regDsctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DSCTQA: {bigint(19)}
     */
    public void setDsctqa_IsNotNull() { regDsctqa(CK_ISNN, DOBJ); }

    protected void regDsctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDsctqa(), "DSCTQA"); }
    protected abstract ConditionValue xgetCValueDsctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_Equal(Long tosplcbqa) {
        doSetTosplcbqa_Equal(tosplcbqa);
    }

    protected void doSetTosplcbqa_Equal(Long tosplcbqa) {
        regTosplcbqa(CK_EQ, tosplcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_NotEqual(Long tosplcbqa) {
        doSetTosplcbqa_NotEqual(tosplcbqa);
    }

    protected void doSetTosplcbqa_NotEqual(Long tosplcbqa) {
        regTosplcbqa(CK_NES, tosplcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_GreaterThan(Long tosplcbqa) {
        regTosplcbqa(CK_GT, tosplcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_LessThan(Long tosplcbqa) {
        regTosplcbqa(CK_LT, tosplcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_GreaterEqual(Long tosplcbqa) {
        regTosplcbqa(CK_GE, tosplcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_LessEqual(Long tosplcbqa) {
        regTosplcbqa(CK_LE, tosplcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param minNumber The min number of tosplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tosplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTosplcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTosplcbqa(), "TOSPLCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqaList The collection of tosplcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplcbqa_InScope(Collection<Long> tosplcbqaList) {
        doSetTosplcbqa_InScope(tosplcbqaList);
    }

    protected void doSetTosplcbqa_InScope(Collection<Long> tosplcbqaList) {
        regINS(CK_INS, cTL(tosplcbqaList), xgetCValueTosplcbqa(), "TOSPLCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqaList The collection of tosplcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplcbqa_NotInScope(Collection<Long> tosplcbqaList) {
        doSetTosplcbqa_NotInScope(tosplcbqaList);
    }

    protected void doSetTosplcbqa_NotInScope(Collection<Long> tosplcbqaList) {
        regINS(CK_NINS, cTL(tosplcbqaList), xgetCValueTosplcbqa(), "TOSPLCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     */
    public void setTosplcbqa_IsNull() { regTosplcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     */
    public void setTosplcbqa_IsNotNull() { regTosplcbqa(CK_ISNN, DOBJ); }

    protected void regTosplcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTosplcbqa(), "TOSPLCBQA"); }
    protected abstract ConditionValue xgetCValueTosplcbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_Equal(Long tosplctqa) {
        doSetTosplctqa_Equal(tosplctqa);
    }

    protected void doSetTosplctqa_Equal(Long tosplctqa) {
        regTosplctqa(CK_EQ, tosplctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_NotEqual(Long tosplctqa) {
        doSetTosplctqa_NotEqual(tosplctqa);
    }

    protected void doSetTosplctqa_NotEqual(Long tosplctqa) {
        regTosplctqa(CK_NES, tosplctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_GreaterThan(Long tosplctqa) {
        regTosplctqa(CK_GT, tosplctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_LessThan(Long tosplctqa) {
        regTosplctqa(CK_LT, tosplctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_GreaterEqual(Long tosplctqa) {
        regTosplctqa(CK_GE, tosplctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_LessEqual(Long tosplctqa) {
        regTosplctqa(CK_LE, tosplctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param minNumber The min number of tosplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tosplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTosplctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTosplctqa(), "TOSPLCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqaList The collection of tosplctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplctqa_InScope(Collection<Long> tosplctqaList) {
        doSetTosplctqa_InScope(tosplctqaList);
    }

    protected void doSetTosplctqa_InScope(Collection<Long> tosplctqaList) {
        regINS(CK_INS, cTL(tosplctqaList), xgetCValueTosplctqa(), "TOSPLCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqaList The collection of tosplctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplctqa_NotInScope(Collection<Long> tosplctqaList) {
        doSetTosplctqa_NotInScope(tosplctqaList);
    }

    protected void doSetTosplctqa_NotInScope(Collection<Long> tosplctqaList) {
        regINS(CK_NINS, cTL(tosplctqaList), xgetCValueTosplctqa(), "TOSPLCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     */
    public void setTosplctqa_IsNull() { regTosplctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     */
    public void setTosplctqa_IsNotNull() { regTosplctqa(CK_ISNN, DOBJ); }

    protected void regTosplctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTosplctqa(), "TOSPLCTQA"); }
    protected abstract ConditionValue xgetCValueTosplctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_Equal(Long presplcbqa) {
        doSetPresplcbqa_Equal(presplcbqa);
    }

    protected void doSetPresplcbqa_Equal(Long presplcbqa) {
        regPresplcbqa(CK_EQ, presplcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_NotEqual(Long presplcbqa) {
        doSetPresplcbqa_NotEqual(presplcbqa);
    }

    protected void doSetPresplcbqa_NotEqual(Long presplcbqa) {
        regPresplcbqa(CK_NES, presplcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_GreaterThan(Long presplcbqa) {
        regPresplcbqa(CK_GT, presplcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_LessThan(Long presplcbqa) {
        regPresplcbqa(CK_LT, presplcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_GreaterEqual(Long presplcbqa) {
        regPresplcbqa(CK_GE, presplcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_LessEqual(Long presplcbqa) {
        regPresplcbqa(CK_LE, presplcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param minNumber The min number of presplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresplcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresplcbqa(), "PRESPLCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqaList The collection of presplcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplcbqa_InScope(Collection<Long> presplcbqaList) {
        doSetPresplcbqa_InScope(presplcbqaList);
    }

    protected void doSetPresplcbqa_InScope(Collection<Long> presplcbqaList) {
        regINS(CK_INS, cTL(presplcbqaList), xgetCValuePresplcbqa(), "PRESPLCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqaList The collection of presplcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplcbqa_NotInScope(Collection<Long> presplcbqaList) {
        doSetPresplcbqa_NotInScope(presplcbqaList);
    }

    protected void doSetPresplcbqa_NotInScope(Collection<Long> presplcbqaList) {
        regINS(CK_NINS, cTL(presplcbqaList), xgetCValuePresplcbqa(), "PRESPLCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     */
    public void setPresplcbqa_IsNull() { regPresplcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     */
    public void setPresplcbqa_IsNotNull() { regPresplcbqa(CK_ISNN, DOBJ); }

    protected void regPresplcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresplcbqa(), "PRESPLCBQA"); }
    protected abstract ConditionValue xgetCValuePresplcbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_Equal(Long presplctqa) {
        doSetPresplctqa_Equal(presplctqa);
    }

    protected void doSetPresplctqa_Equal(Long presplctqa) {
        regPresplctqa(CK_EQ, presplctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_NotEqual(Long presplctqa) {
        doSetPresplctqa_NotEqual(presplctqa);
    }

    protected void doSetPresplctqa_NotEqual(Long presplctqa) {
        regPresplctqa(CK_NES, presplctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_GreaterThan(Long presplctqa) {
        regPresplctqa(CK_GT, presplctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_LessThan(Long presplctqa) {
        regPresplctqa(CK_LT, presplctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_GreaterEqual(Long presplctqa) {
        regPresplctqa(CK_GE, presplctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_LessEqual(Long presplctqa) {
        regPresplctqa(CK_LE, presplctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param minNumber The min number of presplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresplctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresplctqa(), "PRESPLCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqaList The collection of presplctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplctqa_InScope(Collection<Long> presplctqaList) {
        doSetPresplctqa_InScope(presplctqaList);
    }

    protected void doSetPresplctqa_InScope(Collection<Long> presplctqaList) {
        regINS(CK_INS, cTL(presplctqaList), xgetCValuePresplctqa(), "PRESPLCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqaList The collection of presplctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplctqa_NotInScope(Collection<Long> presplctqaList) {
        doSetPresplctqa_NotInScope(presplctqaList);
    }

    protected void doSetPresplctqa_NotInScope(Collection<Long> presplctqaList) {
        regINS(CK_NINS, cTL(presplctqaList), xgetCValuePresplctqa(), "PRESPLCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     */
    public void setPresplctqa_IsNull() { regPresplctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     */
    public void setPresplctqa_IsNotNull() { regPresplctqa(CK_ISNN, DOBJ); }

    protected void regPresplctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresplctqa(), "PRESPLCTQA"); }
    protected abstract ConditionValue xgetCValuePresplctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_Equal(Long tstinvcb) {
        doSetTstinvcb_Equal(tstinvcb);
    }

    protected void doSetTstinvcb_Equal(Long tstinvcb) {
        regTstinvcb(CK_EQ, tstinvcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_NotEqual(Long tstinvcb) {
        doSetTstinvcb_NotEqual(tstinvcb);
    }

    protected void doSetTstinvcb_NotEqual(Long tstinvcb) {
        regTstinvcb(CK_NES, tstinvcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_GreaterThan(Long tstinvcb) {
        regTstinvcb(CK_GT, tstinvcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_LessThan(Long tstinvcb) {
        regTstinvcb(CK_LT, tstinvcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_GreaterEqual(Long tstinvcb) {
        regTstinvcb(CK_GE, tstinvcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_LessEqual(Long tstinvcb) {
        regTstinvcb(CK_LE, tstinvcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param minNumber The min number of tstinvcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tstinvcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTstinvcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTstinvcb(), "TSTINVCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcbList The collection of tstinvcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvcb_InScope(Collection<Long> tstinvcbList) {
        doSetTstinvcb_InScope(tstinvcbList);
    }

    protected void doSetTstinvcb_InScope(Collection<Long> tstinvcbList) {
        regINS(CK_INS, cTL(tstinvcbList), xgetCValueTstinvcb(), "TSTINVCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcbList The collection of tstinvcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvcb_NotInScope(Collection<Long> tstinvcbList) {
        doSetTstinvcb_NotInScope(tstinvcbList);
    }

    protected void doSetTstinvcb_NotInScope(Collection<Long> tstinvcbList) {
        regINS(CK_NINS, cTL(tstinvcbList), xgetCValueTstinvcb(), "TSTINVCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     */
    public void setTstinvcb_IsNull() { regTstinvcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     */
    public void setTstinvcb_IsNotNull() { regTstinvcb(CK_ISNN, DOBJ); }

    protected void regTstinvcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTstinvcb(), "TSTINVCB"); }
    protected abstract ConditionValue xgetCValueTstinvcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_Equal(Long tstinvct) {
        doSetTstinvct_Equal(tstinvct);
    }

    protected void doSetTstinvct_Equal(Long tstinvct) {
        regTstinvct(CK_EQ, tstinvct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_NotEqual(Long tstinvct) {
        doSetTstinvct_NotEqual(tstinvct);
    }

    protected void doSetTstinvct_NotEqual(Long tstinvct) {
        regTstinvct(CK_NES, tstinvct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_GreaterThan(Long tstinvct) {
        regTstinvct(CK_GT, tstinvct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_LessThan(Long tstinvct) {
        regTstinvct(CK_LT, tstinvct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_GreaterEqual(Long tstinvct) {
        regTstinvct(CK_GE, tstinvct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_LessEqual(Long tstinvct) {
        regTstinvct(CK_LE, tstinvct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param minNumber The min number of tstinvct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tstinvct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTstinvct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTstinvct(), "TSTINVCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvctList The collection of tstinvct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvct_InScope(Collection<Long> tstinvctList) {
        doSetTstinvct_InScope(tstinvctList);
    }

    protected void doSetTstinvct_InScope(Collection<Long> tstinvctList) {
        regINS(CK_INS, cTL(tstinvctList), xgetCValueTstinvct(), "TSTINVCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvctList The collection of tstinvct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvct_NotInScope(Collection<Long> tstinvctList) {
        doSetTstinvct_NotInScope(tstinvctList);
    }

    protected void doSetTstinvct_NotInScope(Collection<Long> tstinvctList) {
        regINS(CK_NINS, cTL(tstinvctList), xgetCValueTstinvct(), "TSTINVCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     */
    public void setTstinvct_IsNull() { regTstinvct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     */
    public void setTstinvct_IsNotNull() { regTstinvct(CK_ISNN, DOBJ); }

    protected void regTstinvct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTstinvct(), "TSTINVCT"); }
    protected abstract ConditionValue xgetCValueTstinvct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_Equal(Long tsplcb) {
        doSetTsplcb_Equal(tsplcb);
    }

    protected void doSetTsplcb_Equal(Long tsplcb) {
        regTsplcb(CK_EQ, tsplcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_NotEqual(Long tsplcb) {
        doSetTsplcb_NotEqual(tsplcb);
    }

    protected void doSetTsplcb_NotEqual(Long tsplcb) {
        regTsplcb(CK_NES, tsplcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_GreaterThan(Long tsplcb) {
        regTsplcb(CK_GT, tsplcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_LessThan(Long tsplcb) {
        regTsplcb(CK_LT, tsplcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_GreaterEqual(Long tsplcb) {
        regTsplcb(CK_GE, tsplcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_LessEqual(Long tsplcb) {
        regTsplcb(CK_LE, tsplcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param minNumber The min number of tsplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsplcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsplcb(), "TSPLCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcbList The collection of tsplcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplcb_InScope(Collection<Long> tsplcbList) {
        doSetTsplcb_InScope(tsplcbList);
    }

    protected void doSetTsplcb_InScope(Collection<Long> tsplcbList) {
        regINS(CK_INS, cTL(tsplcbList), xgetCValueTsplcb(), "TSPLCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcbList The collection of tsplcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplcb_NotInScope(Collection<Long> tsplcbList) {
        doSetTsplcb_NotInScope(tsplcbList);
    }

    protected void doSetTsplcb_NotInScope(Collection<Long> tsplcbList) {
        regINS(CK_NINS, cTL(tsplcbList), xgetCValueTsplcb(), "TSPLCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     */
    public void setTsplcb_IsNull() { regTsplcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     */
    public void setTsplcb_IsNotNull() { regTsplcb(CK_ISNN, DOBJ); }

    protected void regTsplcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsplcb(), "TSPLCB"); }
    protected abstract ConditionValue xgetCValueTsplcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_Equal(Long tsplct) {
        doSetTsplct_Equal(tsplct);
    }

    protected void doSetTsplct_Equal(Long tsplct) {
        regTsplct(CK_EQ, tsplct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_NotEqual(Long tsplct) {
        doSetTsplct_NotEqual(tsplct);
    }

    protected void doSetTsplct_NotEqual(Long tsplct) {
        regTsplct(CK_NES, tsplct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_GreaterThan(Long tsplct) {
        regTsplct(CK_GT, tsplct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_LessThan(Long tsplct) {
        regTsplct(CK_LT, tsplct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_GreaterEqual(Long tsplct) {
        regTsplct(CK_GE, tsplct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_LessEqual(Long tsplct) {
        regTsplct(CK_LE, tsplct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param minNumber The min number of tsplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsplct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsplct(), "TSPLCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplctList The collection of tsplct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplct_InScope(Collection<Long> tsplctList) {
        doSetTsplct_InScope(tsplctList);
    }

    protected void doSetTsplct_InScope(Collection<Long> tsplctList) {
        regINS(CK_INS, cTL(tsplctList), xgetCValueTsplct(), "TSPLCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplctList The collection of tsplct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplct_NotInScope(Collection<Long> tsplctList) {
        doSetTsplct_NotInScope(tsplctList);
    }

    protected void doSetTsplct_NotInScope(Collection<Long> tsplctList) {
        regINS(CK_NINS, cTL(tsplctList), xgetCValueTsplct(), "TSPLCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     */
    public void setTsplct_IsNull() { regTsplct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     */
    public void setTsplct_IsNotNull() { regTsplct(CK_ISNN, DOBJ); }

    protected void regTsplct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsplct(), "TSPLCT"); }
    protected abstract ConditionValue xgetCValueTsplct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_Equal(Long tpresplcb) {
        doSetTpresplcb_Equal(tpresplcb);
    }

    protected void doSetTpresplcb_Equal(Long tpresplcb) {
        regTpresplcb(CK_EQ, tpresplcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_NotEqual(Long tpresplcb) {
        doSetTpresplcb_NotEqual(tpresplcb);
    }

    protected void doSetTpresplcb_NotEqual(Long tpresplcb) {
        regTpresplcb(CK_NES, tpresplcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_GreaterThan(Long tpresplcb) {
        regTpresplcb(CK_GT, tpresplcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_LessThan(Long tpresplcb) {
        regTpresplcb(CK_LT, tpresplcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_GreaterEqual(Long tpresplcb) {
        regTpresplcb(CK_GE, tpresplcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_LessEqual(Long tpresplcb) {
        regTpresplcb(CK_LE, tpresplcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param minNumber The min number of tpresplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tpresplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTpresplcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTpresplcb(), "TPRESPLCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcbList The collection of tpresplcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplcb_InScope(Collection<Long> tpresplcbList) {
        doSetTpresplcb_InScope(tpresplcbList);
    }

    protected void doSetTpresplcb_InScope(Collection<Long> tpresplcbList) {
        regINS(CK_INS, cTL(tpresplcbList), xgetCValueTpresplcb(), "TPRESPLCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcbList The collection of tpresplcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplcb_NotInScope(Collection<Long> tpresplcbList) {
        doSetTpresplcb_NotInScope(tpresplcbList);
    }

    protected void doSetTpresplcb_NotInScope(Collection<Long> tpresplcbList) {
        regINS(CK_NINS, cTL(tpresplcbList), xgetCValueTpresplcb(), "TPRESPLCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     */
    public void setTpresplcb_IsNull() { regTpresplcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     */
    public void setTpresplcb_IsNotNull() { regTpresplcb(CK_ISNN, DOBJ); }

    protected void regTpresplcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTpresplcb(), "TPRESPLCB"); }
    protected abstract ConditionValue xgetCValueTpresplcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_Equal(Long tpresplct) {
        doSetTpresplct_Equal(tpresplct);
    }

    protected void doSetTpresplct_Equal(Long tpresplct) {
        regTpresplct(CK_EQ, tpresplct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_NotEqual(Long tpresplct) {
        doSetTpresplct_NotEqual(tpresplct);
    }

    protected void doSetTpresplct_NotEqual(Long tpresplct) {
        regTpresplct(CK_NES, tpresplct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_GreaterThan(Long tpresplct) {
        regTpresplct(CK_GT, tpresplct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_LessThan(Long tpresplct) {
        regTpresplct(CK_LT, tpresplct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_GreaterEqual(Long tpresplct) {
        regTpresplct(CK_GE, tpresplct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_LessEqual(Long tpresplct) {
        regTpresplct(CK_LE, tpresplct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param minNumber The min number of tpresplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tpresplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTpresplct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTpresplct(), "TPRESPLCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplctList The collection of tpresplct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplct_InScope(Collection<Long> tpresplctList) {
        doSetTpresplct_InScope(tpresplctList);
    }

    protected void doSetTpresplct_InScope(Collection<Long> tpresplctList) {
        regINS(CK_INS, cTL(tpresplctList), xgetCValueTpresplct(), "TPRESPLCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplctList The collection of tpresplct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplct_NotInScope(Collection<Long> tpresplctList) {
        doSetTpresplct_NotInScope(tpresplctList);
    }

    protected void doSetTpresplct_NotInScope(Collection<Long> tpresplctList) {
        regINS(CK_NINS, cTL(tpresplctList), xgetCValueTpresplct(), "TPRESPLCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     */
    public void setTpresplct_IsNull() { regTpresplct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     */
    public void setTpresplct_IsNotNull() { regTpresplct(CK_ISNN, DOBJ); }

    protected void regTpresplct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTpresplct(), "TPRESPLCT"); }
    protected abstract ConditionValue xgetCValueTpresplct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_Equal(Long tinvmdtcb) {
        doSetTinvmdtcb_Equal(tinvmdtcb);
    }

    protected void doSetTinvmdtcb_Equal(Long tinvmdtcb) {
        regTinvmdtcb(CK_EQ, tinvmdtcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_NotEqual(Long tinvmdtcb) {
        doSetTinvmdtcb_NotEqual(tinvmdtcb);
    }

    protected void doSetTinvmdtcb_NotEqual(Long tinvmdtcb) {
        regTinvmdtcb(CK_NES, tinvmdtcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_GreaterThan(Long tinvmdtcb) {
        regTinvmdtcb(CK_GT, tinvmdtcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_LessThan(Long tinvmdtcb) {
        regTinvmdtcb(CK_LT, tinvmdtcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_GreaterEqual(Long tinvmdtcb) {
        regTinvmdtcb(CK_GE, tinvmdtcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_LessEqual(Long tinvmdtcb) {
        regTinvmdtcb(CK_LE, tinvmdtcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param minNumber The min number of tinvmdtcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tinvmdtcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTinvmdtcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTinvmdtcb(), "TINVMDTCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcbList The collection of tinvmdtcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcb_InScope(Collection<Long> tinvmdtcbList) {
        doSetTinvmdtcb_InScope(tinvmdtcbList);
    }

    protected void doSetTinvmdtcb_InScope(Collection<Long> tinvmdtcbList) {
        regINS(CK_INS, cTL(tinvmdtcbList), xgetCValueTinvmdtcb(), "TINVMDTCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcbList The collection of tinvmdtcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcb_NotInScope(Collection<Long> tinvmdtcbList) {
        doSetTinvmdtcb_NotInScope(tinvmdtcbList);
    }

    protected void doSetTinvmdtcb_NotInScope(Collection<Long> tinvmdtcbList) {
        regINS(CK_NINS, cTL(tinvmdtcbList), xgetCValueTinvmdtcb(), "TINVMDTCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     */
    public void setTinvmdtcb_IsNull() { regTinvmdtcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     */
    public void setTinvmdtcb_IsNotNull() { regTinvmdtcb(CK_ISNN, DOBJ); }

    protected void regTinvmdtcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTinvmdtcb(), "TINVMDTCB"); }
    protected abstract ConditionValue xgetCValueTinvmdtcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_Equal(Long tinvmdtct) {
        doSetTinvmdtct_Equal(tinvmdtct);
    }

    protected void doSetTinvmdtct_Equal(Long tinvmdtct) {
        regTinvmdtct(CK_EQ, tinvmdtct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_NotEqual(Long tinvmdtct) {
        doSetTinvmdtct_NotEqual(tinvmdtct);
    }

    protected void doSetTinvmdtct_NotEqual(Long tinvmdtct) {
        regTinvmdtct(CK_NES, tinvmdtct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_GreaterThan(Long tinvmdtct) {
        regTinvmdtct(CK_GT, tinvmdtct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_LessThan(Long tinvmdtct) {
        regTinvmdtct(CK_LT, tinvmdtct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_GreaterEqual(Long tinvmdtct) {
        regTinvmdtct(CK_GE, tinvmdtct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_LessEqual(Long tinvmdtct) {
        regTinvmdtct(CK_LE, tinvmdtct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param minNumber The min number of tinvmdtct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tinvmdtct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTinvmdtct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTinvmdtct(), "TINVMDTCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtctList The collection of tinvmdtct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtct_InScope(Collection<Long> tinvmdtctList) {
        doSetTinvmdtct_InScope(tinvmdtctList);
    }

    protected void doSetTinvmdtct_InScope(Collection<Long> tinvmdtctList) {
        regINS(CK_INS, cTL(tinvmdtctList), xgetCValueTinvmdtct(), "TINVMDTCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtctList The collection of tinvmdtct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtct_NotInScope(Collection<Long> tinvmdtctList) {
        doSetTinvmdtct_NotInScope(tinvmdtctList);
    }

    protected void doSetTinvmdtct_NotInScope(Collection<Long> tinvmdtctList) {
        regINS(CK_NINS, cTL(tinvmdtctList), xgetCValueTinvmdtct(), "TINVMDTCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     */
    public void setTinvmdtct_IsNull() { regTinvmdtct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     */
    public void setTinvmdtct_IsNotNull() { regTinvmdtct(CK_ISNN, DOBJ); }

    protected void regTinvmdtct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTinvmdtct(), "TINVMDTCT"); }
    protected abstract ConditionValue xgetCValueTinvmdtct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_Equal(Long csplnun) {
        doSetCsplnun_Equal(csplnun);
    }

    protected void doSetCsplnun_Equal(Long csplnun) {
        regCsplnun(CK_EQ, csplnun);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_NotEqual(Long csplnun) {
        doSetCsplnun_NotEqual(csplnun);
    }

    protected void doSetCsplnun_NotEqual(Long csplnun) {
        regCsplnun(CK_NES, csplnun);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_GreaterThan(Long csplnun) {
        regCsplnun(CK_GT, csplnun);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_LessThan(Long csplnun) {
        regCsplnun(CK_LT, csplnun);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_GreaterEqual(Long csplnun) {
        regCsplnun(CK_GE, csplnun);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_LessEqual(Long csplnun) {
        regCsplnun(CK_LE, csplnun);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param minNumber The min number of csplnun. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of csplnun. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCsplnun_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCsplnun(), "CSPLNUN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnunList The collection of csplnun as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsplnun_InScope(Collection<Long> csplnunList) {
        doSetCsplnun_InScope(csplnunList);
    }

    protected void doSetCsplnun_InScope(Collection<Long> csplnunList) {
        regINS(CK_INS, cTL(csplnunList), xgetCValueCsplnun(), "CSPLNUN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnunList The collection of csplnun as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsplnun_NotInScope(Collection<Long> csplnunList) {
        doSetCsplnun_NotInScope(csplnunList);
    }

    protected void doSetCsplnun_NotInScope(Collection<Long> csplnunList) {
        regINS(CK_NINS, cTL(csplnunList), xgetCValueCsplnun(), "CSPLNUN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     */
    public void setCsplnun_IsNull() { regCsplnun(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     */
    public void setCsplnun_IsNotNull() { regCsplnun(CK_ISNN, DOBJ); }

    protected void regCsplnun(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsplnun(), "CSPLNUN"); }
    protected abstract ConditionValue xgetCValueCsplnun();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_Equal(String upfg) {
        doSetUpfg_Equal(fRES(upfg));
    }

    protected void doSetUpfg_Equal(String upfg) {
        regUpfg(CK_EQ, upfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_NotEqual(String upfg) {
        doSetUpfg_NotEqual(fRES(upfg));
    }

    protected void doSetUpfg_NotEqual(String upfg) {
        regUpfg(CK_NES, upfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_GreaterThan(String upfg) {
        regUpfg(CK_GT, fRES(upfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_LessThan(String upfg) {
        regUpfg(CK_LT, fRES(upfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_GreaterEqual(String upfg) {
        regUpfg(CK_GE, fRES(upfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_LessEqual(String upfg) {
        regUpfg(CK_LE, fRES(upfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfgList The collection of upfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_InScope(Collection<String> upfgList) {
        doSetUpfg_InScope(upfgList);
    }

    protected void doSetUpfg_InScope(Collection<String> upfgList) {
        regINS(CK_INS, cTL(upfgList), xgetCValueUpfg(), "UPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfgList The collection of upfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_NotInScope(Collection<String> upfgList) {
        doSetUpfg_NotInScope(upfgList);
    }

    protected void doSetUpfg_NotInScope(Collection<String> upfgList) {
        regINS(CK_NINS, cTL(upfgList), xgetCValueUpfg(), "UPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]} <br>
     * <pre>e.g. setUpfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param upfg The value of upfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpfg_LikeSearch(String upfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(upfg), xgetCValueUpfg(), "UPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpfg_NotLikeSearch(String upfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(upfg), xgetCValueUpfg(), "UPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @param upfg The value of upfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpfg_PrefixSearch(String upfg) {
        setUpfg_LikeSearch(upfg, xcLSOPPre());
    }

    protected void regUpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpfg(), "UPFG"); }
    protected abstract ConditionValue xgetCValueUpfg();

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
    public HpSLCFunction<TClckinvCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TClckinvCB.class);
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
    public HpSLCFunction<TClckinvCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TClckinvCB.class);
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
    public HpSLCFunction<TClckinvCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TClckinvCB.class);
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
    public HpSLCFunction<TClckinvCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TClckinvCB.class);
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
    public HpSLCFunction<TClckinvCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TClckinvCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TClckinvCB&gt;() {
     *     public void query(TClckinvCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TClckinvCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TClckinvCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TClckinvCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TClckinvCQ sq);

    protected TClckinvCB xcreateScalarConditionCB() {
        TClckinvCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TClckinvCB xcreateScalarConditionPartitionByCB() {
        TClckinvCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TClckinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TClckinvCB cb = new TClckinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLCKINV_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TClckinvCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TClckinvCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TClckinvCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TClckinvCB cb = new TClckinvCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLCKINV_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TClckinvCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TClckinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TClckinvCB cb = new TClckinvCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TClckinvCQ sq);

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
    protected TClckinvCB newMyCB() {
        return new TClckinvCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TClckinvCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

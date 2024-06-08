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
 * The abstract condition-query of T_TRSODETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsodetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsodetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSODETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailid The value of sodetailid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_Equal(Long sodetailid) {
        doSetSodetailid_Equal(sodetailid);
    }

    protected void doSetSodetailid_Equal(Long sodetailid) {
        regSodetailid(CK_EQ, sodetailid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailid The value of sodetailid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_NotEqual(Long sodetailid) {
        doSetSodetailid_NotEqual(sodetailid);
    }

    protected void doSetSodetailid_NotEqual(Long sodetailid) {
        regSodetailid(CK_NES, sodetailid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailid The value of sodetailid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterThan(Long sodetailid) {
        regSodetailid(CK_GT, sodetailid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailid The value of sodetailid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessThan(Long sodetailid) {
        regSodetailid(CK_LT, sodetailid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailid The value of sodetailid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterEqual(Long sodetailid) {
        regSodetailid(CK_GE, sodetailid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailid The value of sodetailid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessEqual(Long sodetailid) {
        regSodetailid(CK_LE, sodetailid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSodetailid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSodetailid(), "SODETAILID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailidList The collection of sodetailid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_InScope(Collection<Long> sodetailidList) {
        doSetSodetailid_InScope(sodetailidList);
    }

    protected void doSetSodetailid_InScope(Collection<Long> sodetailidList) {
        regINS(CK_INS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @param sodetailidList The collection of sodetailid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_NotInScope(Collection<Long> sodetailidList) {
        doSetSodetailid_NotInScope(sodetailidList);
    }

    protected void doSetSodetailid_NotInScope(Collection<Long> sodetailidList) {
        regINS(CK_NINS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSodetailid_IsNull() { regSodetailid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSodetailid_IsNotNull() { regSodetailid(CK_ISNN, DOBJ); }

    protected void regSodetailid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSodetailid(), "SODETAILID"); }
    protected abstract ConditionValue xgetCValueSodetailid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soid The value of soid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_Equal(Long soid) {
        doSetSoid_Equal(soid);
    }

    protected void doSetSoid_Equal(Long soid) {
        regSoid(CK_EQ, soid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soid The value of soid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_NotEqual(Long soid) {
        doSetSoid_NotEqual(soid);
    }

    protected void doSetSoid_NotEqual(Long soid) {
        regSoid(CK_NES, soid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soid The value of soid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterThan(Long soid) {
        regSoid(CK_GT, soid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soid The value of soid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessThan(Long soid) {
        regSoid(CK_LT, soid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soid The value of soid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterEqual(Long soid) {
        regSoid(CK_GE, soid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soid The value of soid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessEqual(Long soid) {
        regSoid(CK_LE, soid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param minNumber The min number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoid(), "SOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soidList The collection of soid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_InScope(Collection<Long> soidList) {
        doSetSoid_InScope(soidList);
    }

    protected void doSetSoid_InScope(Collection<Long> soidList) {
        regINS(CK_INS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {NotNull, bigint(19)}
     * @param soidList The collection of soid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_NotInScope(Collection<Long> soidList) {
        doSetSoid_NotInScope(soidList);
    }

    protected void doSetSoid_NotInScope(Collection<Long> soidList) {
        regINS(CK_NINS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    protected void regSoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoid(), "SOID"); }
    protected abstract ConditionValue xgetCValueSoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_Equal(Long solineno) {
        doSetSolineno_Equal(solineno);
    }

    protected void doSetSolineno_Equal(Long solineno) {
        regSolineno(CK_EQ, solineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_NotEqual(Long solineno) {
        doSetSolineno_NotEqual(solineno);
    }

    protected void doSetSolineno_NotEqual(Long solineno) {
        regSolineno(CK_NES, solineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_GreaterThan(Long solineno) {
        regSolineno(CK_GT, solineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_LessThan(Long solineno) {
        regSolineno(CK_LT, solineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_GreaterEqual(Long solineno) {
        regSolineno(CK_GE, solineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solineno The value of solineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_LessEqual(Long solineno) {
        regSolineno(CK_LE, solineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of solineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of solineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSolineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSolineno(), "SOLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solinenoList The collection of solineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSolineno_InScope(Collection<Long> solinenoList) {
        doSetSolineno_InScope(solinenoList);
    }

    protected void doSetSolineno_InScope(Collection<Long> solinenoList) {
        regINS(CK_INS, cTL(solinenoList), xgetCValueSolineno(), "SOLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @param solinenoList The collection of solineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSolineno_NotInScope(Collection<Long> solinenoList) {
        doSetSolineno_NotInScope(solinenoList);
    }

    protected void doSetSolineno_NotInScope(Collection<Long> solinenoList) {
        regINS(CK_NINS, cTL(solinenoList), xgetCValueSolineno(), "SOLINENO");
    }

    protected void regSolineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSolineno(), "SOLINENO"); }
    protected abstract ConditionValue xgetCValueSolineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlineno The value of orderlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderlineno_Equal(Long orderlineno) {
        doSetOrderlineno_Equal(orderlineno);
    }

    protected void doSetOrderlineno_Equal(Long orderlineno) {
        regOrderlineno(CK_EQ, orderlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlineno The value of orderlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderlineno_NotEqual(Long orderlineno) {
        doSetOrderlineno_NotEqual(orderlineno);
    }

    protected void doSetOrderlineno_NotEqual(Long orderlineno) {
        regOrderlineno(CK_NES, orderlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlineno The value of orderlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderlineno_GreaterThan(Long orderlineno) {
        regOrderlineno(CK_GT, orderlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlineno The value of orderlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderlineno_LessThan(Long orderlineno) {
        regOrderlineno(CK_LT, orderlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlineno The value of orderlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderlineno_GreaterEqual(Long orderlineno) {
        regOrderlineno(CK_GE, orderlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlineno The value of orderlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderlineno_LessEqual(Long orderlineno) {
        regOrderlineno(CK_LE, orderlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param minNumber The min number of orderlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderlineno(), "ORDERLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlinenoList The collection of orderlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderlineno_InScope(Collection<Long> orderlinenoList) {
        doSetOrderlineno_InScope(orderlinenoList);
    }

    protected void doSetOrderlineno_InScope(Collection<Long> orderlinenoList) {
        regINS(CK_INS, cTL(orderlinenoList), xgetCValueOrderlineno(), "ORDERLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     * @param orderlinenoList The collection of orderlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderlineno_NotInScope(Collection<Long> orderlinenoList) {
        doSetOrderlineno_NotInScope(orderlinenoList);
    }

    protected void doSetOrderlineno_NotInScope(Collection<Long> orderlinenoList) {
        regINS(CK_NINS, cTL(orderlinenoList), xgetCValueOrderlineno(), "ORDERLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     */
    public void setOrderlineno_IsNull() { regOrderlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERLINENO: {bigint(19)}
     */
    public void setOrderlineno_IsNotNull() { regOrderlineno(CK_ISNN, DOBJ); }

    protected void regOrderlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderlineno(), "ORDERLINENO"); }
    protected abstract ConditionValue xgetCValueOrderlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlineno The value of ownerorderlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_Equal(Long ownerorderlineno) {
        doSetOwnerorderlineno_Equal(ownerorderlineno);
    }

    protected void doSetOwnerorderlineno_Equal(Long ownerorderlineno) {
        regOwnerorderlineno(CK_EQ, ownerorderlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlineno The value of ownerorderlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_NotEqual(Long ownerorderlineno) {
        doSetOwnerorderlineno_NotEqual(ownerorderlineno);
    }

    protected void doSetOwnerorderlineno_NotEqual(Long ownerorderlineno) {
        regOwnerorderlineno(CK_NES, ownerorderlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlineno The value of ownerorderlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_GreaterThan(Long ownerorderlineno) {
        regOwnerorderlineno(CK_GT, ownerorderlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlineno The value of ownerorderlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_LessThan(Long ownerorderlineno) {
        regOwnerorderlineno(CK_LT, ownerorderlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlineno The value of ownerorderlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_GreaterEqual(Long ownerorderlineno) {
        regOwnerorderlineno(CK_GE, ownerorderlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlineno The value of ownerorderlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_LessEqual(Long ownerorderlineno) {
        regOwnerorderlineno(CK_LE, ownerorderlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param minNumber The min number of ownerorderlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ownerorderlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOwnerorderlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOwnerorderlineno(), "OWNERORDERLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlinenoList The collection of ownerorderlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_InScope(Collection<Long> ownerorderlinenoList) {
        doSetOwnerorderlineno_InScope(ownerorderlinenoList);
    }

    protected void doSetOwnerorderlineno_InScope(Collection<Long> ownerorderlinenoList) {
        regINS(CK_INS, cTL(ownerorderlinenoList), xgetCValueOwnerorderlineno(), "OWNERORDERLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @param ownerorderlinenoList The collection of ownerorderlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderlineno_NotInScope(Collection<Long> ownerorderlinenoList) {
        doSetOwnerorderlineno_NotInScope(ownerorderlinenoList);
    }

    protected void doSetOwnerorderlineno_NotInScope(Collection<Long> ownerorderlinenoList) {
        regINS(CK_NINS, cTL(ownerorderlinenoList), xgetCValueOwnerorderlineno(), "OWNERORDERLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     */
    public void setOwnerorderlineno_IsNull() { regOwnerorderlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERORDERLINENO: {bigint(19)}
     */
    public void setOwnerorderlineno_IsNotNull() { regOwnerorderlineno(CK_ISNN, DOBJ); }

    protected void regOwnerorderlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerorderlineno(), "OWNERORDERLINENO"); }
    protected abstract ConditionValue xgetCValueOwnerorderlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlineno The value of custorderlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustorderlineno_Equal(Long custorderlineno) {
        doSetCustorderlineno_Equal(custorderlineno);
    }

    protected void doSetCustorderlineno_Equal(Long custorderlineno) {
        regCustorderlineno(CK_EQ, custorderlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlineno The value of custorderlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustorderlineno_NotEqual(Long custorderlineno) {
        doSetCustorderlineno_NotEqual(custorderlineno);
    }

    protected void doSetCustorderlineno_NotEqual(Long custorderlineno) {
        regCustorderlineno(CK_NES, custorderlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlineno The value of custorderlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustorderlineno_GreaterThan(Long custorderlineno) {
        regCustorderlineno(CK_GT, custorderlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlineno The value of custorderlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustorderlineno_LessThan(Long custorderlineno) {
        regCustorderlineno(CK_LT, custorderlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlineno The value of custorderlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustorderlineno_GreaterEqual(Long custorderlineno) {
        regCustorderlineno(CK_GE, custorderlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlineno The value of custorderlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustorderlineno_LessEqual(Long custorderlineno) {
        regCustorderlineno(CK_LE, custorderlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param minNumber The min number of custorderlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of custorderlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustorderlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustorderlineno(), "CUSTORDERLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlinenoList The collection of custorderlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderlineno_InScope(Collection<Long> custorderlinenoList) {
        doSetCustorderlineno_InScope(custorderlinenoList);
    }

    protected void doSetCustorderlineno_InScope(Collection<Long> custorderlinenoList) {
        regINS(CK_INS, cTL(custorderlinenoList), xgetCValueCustorderlineno(), "CUSTORDERLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @param custorderlinenoList The collection of custorderlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderlineno_NotInScope(Collection<Long> custorderlinenoList) {
        doSetCustorderlineno_NotInScope(custorderlinenoList);
    }

    protected void doSetCustorderlineno_NotInScope(Collection<Long> custorderlinenoList) {
        regINS(CK_NINS, cTL(custorderlinenoList), xgetCValueCustorderlineno(), "CUSTORDERLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     */
    public void setCustorderlineno_IsNull() { regCustorderlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTORDERLINENO: {bigint(19)}
     */
    public void setCustorderlineno_IsNotNull() { regCustorderlineno(CK_ISNN, DOBJ); }

    protected void regCustorderlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustorderlineno(), "CUSTORDERLINENO"); }
    protected abstract ConditionValue xgetCValueCustorderlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolineno The value of originalpolineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalpolineno_Equal(Long originalpolineno) {
        doSetOriginalpolineno_Equal(originalpolineno);
    }

    protected void doSetOriginalpolineno_Equal(Long originalpolineno) {
        regOriginalpolineno(CK_EQ, originalpolineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolineno The value of originalpolineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalpolineno_NotEqual(Long originalpolineno) {
        doSetOriginalpolineno_NotEqual(originalpolineno);
    }

    protected void doSetOriginalpolineno_NotEqual(Long originalpolineno) {
        regOriginalpolineno(CK_NES, originalpolineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolineno The value of originalpolineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalpolineno_GreaterThan(Long originalpolineno) {
        regOriginalpolineno(CK_GT, originalpolineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolineno The value of originalpolineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalpolineno_LessThan(Long originalpolineno) {
        regOriginalpolineno(CK_LT, originalpolineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolineno The value of originalpolineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalpolineno_GreaterEqual(Long originalpolineno) {
        regOriginalpolineno(CK_GE, originalpolineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolineno The value of originalpolineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalpolineno_LessEqual(Long originalpolineno) {
        regOriginalpolineno(CK_LE, originalpolineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param minNumber The min number of originalpolineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of originalpolineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOriginalpolineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOriginalpolineno(), "ORIGINALPOLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolinenoList The collection of originalpolineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpolineno_InScope(Collection<Long> originalpolinenoList) {
        doSetOriginalpolineno_InScope(originalpolinenoList);
    }

    protected void doSetOriginalpolineno_InScope(Collection<Long> originalpolinenoList) {
        regINS(CK_INS, cTL(originalpolinenoList), xgetCValueOriginalpolineno(), "ORIGINALPOLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @param originalpolinenoList The collection of originalpolineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpolineno_NotInScope(Collection<Long> originalpolinenoList) {
        doSetOriginalpolineno_NotInScope(originalpolinenoList);
    }

    protected void doSetOriginalpolineno_NotInScope(Collection<Long> originalpolinenoList) {
        regINS(CK_NINS, cTL(originalpolinenoList), xgetCValueOriginalpolineno(), "ORIGINALPOLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     */
    public void setOriginalpolineno_IsNull() { regOriginalpolineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     */
    public void setOriginalpolineno_IsNotNull() { regOriginalpolineno(CK_ISNN, DOBJ); }

    protected void regOriginalpolineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalpolineno(), "ORIGINALPOLINENO"); }
    protected abstract ConditionValue xgetCValueOriginalpolineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
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
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
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
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
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
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_Equal(String ifitemcd) {
        doSetIfitemcd_Equal(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_Equal(String ifitemcd) {
        regIfitemcd(CK_EQ, ifitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotEqual(String ifitemcd) {
        doSetIfitemcd_NotEqual(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_NotEqual(String ifitemcd) {
        regIfitemcd(CK_NES, ifitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterThan(String ifitemcd) {
        regIfitemcd(CK_GT, fRES(ifitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessThan(String ifitemcd) {
        regIfitemcd(CK_LT, fRES(ifitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterEqual(String ifitemcd) {
        regIfitemcd(CK_GE, fRES(ifitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessEqual(String ifitemcd) {
        regIfitemcd(CK_LE, fRES(ifitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcdList The collection of ifitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_InScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_InScope(ifitemcdList);
    }

    protected void doSetIfitemcd_InScope(Collection<String> ifitemcdList) {
        regINS(CK_INS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IFITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcdList The collection of ifitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_NotInScope(ifitemcdList);
    }

    protected void doSetIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        regINS(CK_NINS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IFITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)} <br>
     * <pre>e.g. setIfitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifitemcd The value of ifitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfitemcd_LikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifitemcd), xgetCValueIfitemcd(), "IFITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfitemcd_NotLikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifitemcd), xgetCValueIfitemcd(), "IFITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_PrefixSearch(String ifitemcd) {
        setIfitemcd_LikeSearch(ifitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNull() { regIfitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNullOrEmpty() { regIfitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNotNull() { regIfitemcd(CK_ISNN, DOBJ); }

    protected void regIfitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfitemcd(), "IFITEMCD"); }
    protected abstract ConditionValue xgetCValueIfitemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_Equal(String lot2) {
        doSetLot2_Equal(fRES(lot2));
    }

    protected void doSetLot2_Equal(String lot2) {
        regLot2(CK_EQ, lot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotEqual(String lot2) {
        doSetLot2_NotEqual(fRES(lot2));
    }

    protected void doSetLot2_NotEqual(String lot2) {
        regLot2(CK_NES, lot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2List The collection of lot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_InScope(Collection<String> lot2List) {
        doSetLot2_InScope(lot2List);
    }

    protected void doSetLot2_InScope(Collection<String> lot2List) {
        regINS(CK_INS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2List The collection of lot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotInScope(Collection<String> lot2List) {
        doSetLot2_NotInScope(lot2List);
    }

    protected void doSetLot2_NotInScope(Collection<String> lot2List) {
        regINS(CK_NINS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)} <br>
     * <pre>e.g. setLot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot2 The value of lot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot2_LikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_Equal(String lot5) {
        doSetLot5_Equal(fRES(lot5));
    }

    protected void doSetLot5_Equal(String lot5) {
        regLot5(CK_EQ, lot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_NotEqual(String lot5) {
        doSetLot5_NotEqual(fRES(lot5));
    }

    protected void doSetLot5_NotEqual(String lot5) {
        regLot5(CK_NES, lot5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_GreaterThan(String lot5) {
        regLot5(CK_GT, fRES(lot5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_LessThan(String lot5) {
        regLot5(CK_LT, fRES(lot5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_GreaterEqual(String lot5) {
        regLot5(CK_GE, fRES(lot5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_LessEqual(String lot5) {
        regLot5(CK_LE, fRES(lot5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5List The collection of lot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_InScope(Collection<String> lot5List) {
        doSetLot5_InScope(lot5List);
    }

    protected void doSetLot5_InScope(Collection<String> lot5List) {
        regINS(CK_INS, cTL(lot5List), xgetCValueLot5(), "LOT5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5List The collection of lot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_NotInScope(Collection<String> lot5List) {
        doSetLot5_NotInScope(lot5List);
    }

    protected void doSetLot5_NotInScope(Collection<String> lot5List) {
        regINS(CK_NINS, cTL(lot5List), xgetCValueLot5(), "LOT5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)} <br>
     * <pre>e.g. setLot5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot5 The value of lot5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot5_LikeSearch(String lot5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot5), xgetCValueLot5(), "LOT5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot5_NotLikeSearch(String lot5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot5), xgetCValueLot5(), "LOT5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_PrefixSearch(String lot5) {
        setLot5_LikeSearch(lot5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNull() { regLot5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNullOrEmpty() { regLot5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNotNull() { regLot5(CK_ISNN, DOBJ); }

    protected void regLot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot5(), "LOT5"); }
    protected abstract ConditionValue xgetCValueLot5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_Equal(String stockTypeCd) {
        doSetStockTypeCd_Equal(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_Equal(String stockTypeCd) {
        regStockTypeCd(CK_EQ, stockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotEqual(String stockTypeCd) {
        doSetStockTypeCd_NotEqual(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_NotEqual(String stockTypeCd) {
        regStockTypeCd(CK_NES, stockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterThan(String stockTypeCd) {
        regStockTypeCd(CK_GT, fRES(stockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessThan(String stockTypeCd) {
        regStockTypeCd(CK_LT, fRES(stockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterEqual(String stockTypeCd) {
        regStockTypeCd(CK_GE, fRES(stockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessEqual(String stockTypeCd) {
        regStockTypeCd(CK_LE, fRES(stockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCdList The collection of stockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_InScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        regINS(CK_INS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCdList The collection of stockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_NotInScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        regINS(CK_NINS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)} <br>
     * <pre>e.g. setStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockTypeCd The value of stockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockTypeCd_LikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockTypeCd_NotLikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_PrefixSearch(String stockTypeCd) {
        setStockTypeCd_LikeSearch(stockTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNull() { regStockTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNullOrEmpty() { regStockTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNotNull() { regStockTypeCd(CK_ISNN, DOBJ); }

    protected void regStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeCd(), "STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueStockTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_Equal(String otherlot2) {
        doSetOtherlot2_Equal(fRES(otherlot2));
    }

    protected void doSetOtherlot2_Equal(String otherlot2) {
        regOtherlot2(CK_EQ, otherlot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_NotEqual(String otherlot2) {
        doSetOtherlot2_NotEqual(fRES(otherlot2));
    }

    protected void doSetOtherlot2_NotEqual(String otherlot2) {
        regOtherlot2(CK_NES, otherlot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_GreaterThan(String otherlot2) {
        regOtherlot2(CK_GT, fRES(otherlot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_LessThan(String otherlot2) {
        regOtherlot2(CK_LT, fRES(otherlot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_GreaterEqual(String otherlot2) {
        regOtherlot2(CK_GE, fRES(otherlot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_LessEqual(String otherlot2) {
        regOtherlot2(CK_LE, fRES(otherlot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2List The collection of otherlot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_InScope(Collection<String> otherlot2List) {
        doSetOtherlot2_InScope(otherlot2List);
    }

    protected void doSetOtherlot2_InScope(Collection<String> otherlot2List) {
        regINS(CK_INS, cTL(otherlot2List), xgetCValueOtherlot2(), "OTHERLOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2List The collection of otherlot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_NotInScope(Collection<String> otherlot2List) {
        doSetOtherlot2_NotInScope(otherlot2List);
    }

    protected void doSetOtherlot2_NotInScope(Collection<String> otherlot2List) {
        regINS(CK_NINS, cTL(otherlot2List), xgetCValueOtherlot2(), "OTHERLOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)} <br>
     * <pre>e.g. setOtherlot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot2 The value of otherlot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot2_LikeSearch(String otherlot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot2), xgetCValueOtherlot2(), "OTHERLOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot2_NotLikeSearch(String otherlot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot2), xgetCValueOtherlot2(), "OTHERLOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_PrefixSearch(String otherlot2) {
        setOtherlot2_LikeSearch(otherlot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNull() { regOtherlot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNullOrEmpty() { regOtherlot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNotNull() { regOtherlot2(CK_ISNN, DOBJ); }

    protected void regOtherlot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot2(), "OTHERLOT2"); }
    protected abstract ConditionValue xgetCValueOtherlot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_Equal(String otherlot3) {
        doSetOtherlot3_Equal(fRES(otherlot3));
    }

    protected void doSetOtherlot3_Equal(String otherlot3) {
        regOtherlot3(CK_EQ, otherlot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_NotEqual(String otherlot3) {
        doSetOtherlot3_NotEqual(fRES(otherlot3));
    }

    protected void doSetOtherlot3_NotEqual(String otherlot3) {
        regOtherlot3(CK_NES, otherlot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_GreaterThan(String otherlot3) {
        regOtherlot3(CK_GT, fRES(otherlot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_LessThan(String otherlot3) {
        regOtherlot3(CK_LT, fRES(otherlot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_GreaterEqual(String otherlot3) {
        regOtherlot3(CK_GE, fRES(otherlot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_LessEqual(String otherlot3) {
        regOtherlot3(CK_LE, fRES(otherlot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3List The collection of otherlot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_InScope(Collection<String> otherlot3List) {
        doSetOtherlot3_InScope(otherlot3List);
    }

    protected void doSetOtherlot3_InScope(Collection<String> otherlot3List) {
        regINS(CK_INS, cTL(otherlot3List), xgetCValueOtherlot3(), "OTHERLOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3List The collection of otherlot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_NotInScope(Collection<String> otherlot3List) {
        doSetOtherlot3_NotInScope(otherlot3List);
    }

    protected void doSetOtherlot3_NotInScope(Collection<String> otherlot3List) {
        regINS(CK_NINS, cTL(otherlot3List), xgetCValueOtherlot3(), "OTHERLOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)} <br>
     * <pre>e.g. setOtherlot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot3 The value of otherlot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot3_LikeSearch(String otherlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot3), xgetCValueOtherlot3(), "OTHERLOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot3_NotLikeSearch(String otherlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot3), xgetCValueOtherlot3(), "OTHERLOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_PrefixSearch(String otherlot3) {
        setOtherlot3_LikeSearch(otherlot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNull() { regOtherlot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNullOrEmpty() { regOtherlot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNotNull() { regOtherlot3(CK_ISNN, DOBJ); }

    protected void regOtherlot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot3(), "OTHERLOT3"); }
    protected abstract ConditionValue xgetCValueOtherlot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_Equal(String otherlot4) {
        doSetOtherlot4_Equal(fRES(otherlot4));
    }

    protected void doSetOtherlot4_Equal(String otherlot4) {
        regOtherlot4(CK_EQ, otherlot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_NotEqual(String otherlot4) {
        doSetOtherlot4_NotEqual(fRES(otherlot4));
    }

    protected void doSetOtherlot4_NotEqual(String otherlot4) {
        regOtherlot4(CK_NES, otherlot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_GreaterThan(String otherlot4) {
        regOtherlot4(CK_GT, fRES(otherlot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_LessThan(String otherlot4) {
        regOtherlot4(CK_LT, fRES(otherlot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_GreaterEqual(String otherlot4) {
        regOtherlot4(CK_GE, fRES(otherlot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_LessEqual(String otherlot4) {
        regOtherlot4(CK_LE, fRES(otherlot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4List The collection of otherlot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_InScope(Collection<String> otherlot4List) {
        doSetOtherlot4_InScope(otherlot4List);
    }

    protected void doSetOtherlot4_InScope(Collection<String> otherlot4List) {
        regINS(CK_INS, cTL(otherlot4List), xgetCValueOtherlot4(), "OTHERLOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4List The collection of otherlot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_NotInScope(Collection<String> otherlot4List) {
        doSetOtherlot4_NotInScope(otherlot4List);
    }

    protected void doSetOtherlot4_NotInScope(Collection<String> otherlot4List) {
        regINS(CK_NINS, cTL(otherlot4List), xgetCValueOtherlot4(), "OTHERLOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)} <br>
     * <pre>e.g. setOtherlot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot4 The value of otherlot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot4_LikeSearch(String otherlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot4), xgetCValueOtherlot4(), "OTHERLOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot4_NotLikeSearch(String otherlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot4), xgetCValueOtherlot4(), "OTHERLOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_PrefixSearch(String otherlot4) {
        setOtherlot4_LikeSearch(otherlot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNull() { regOtherlot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNullOrEmpty() { regOtherlot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNotNull() { regOtherlot4(CK_ISNN, DOBJ); }

    protected void regOtherlot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot4(), "OTHERLOT4"); }
    protected abstract ConditionValue xgetCValueOtherlot4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5 The value of otherlot5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_Equal(Long otherlot5) {
        doSetOtherlot5_Equal(otherlot5);
    }

    protected void doSetOtherlot5_Equal(Long otherlot5) {
        regOtherlot5(CK_EQ, otherlot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5 The value of otherlot5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_NotEqual(Long otherlot5) {
        doSetOtherlot5_NotEqual(otherlot5);
    }

    protected void doSetOtherlot5_NotEqual(Long otherlot5) {
        regOtherlot5(CK_NES, otherlot5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5 The value of otherlot5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterThan(Long otherlot5) {
        regOtherlot5(CK_GT, otherlot5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5 The value of otherlot5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessThan(Long otherlot5) {
        regOtherlot5(CK_LT, otherlot5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5 The value of otherlot5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterEqual(Long otherlot5) {
        regOtherlot5(CK_GE, otherlot5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5 The value of otherlot5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessEqual(Long otherlot5) {
        regOtherlot5(CK_LE, otherlot5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param minNumber The min number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot5_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot5(), "OTHERLOT5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5List The collection of otherlot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_InScope(Collection<Long> otherlot5List) {
        doSetOtherlot5_InScope(otherlot5List);
    }

    protected void doSetOtherlot5_InScope(Collection<Long> otherlot5List) {
        regINS(CK_INS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     * @param otherlot5List The collection of otherlot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_NotInScope(Collection<Long> otherlot5List) {
        doSetOtherlot5_NotInScope(otherlot5List);
    }

    protected void doSetOtherlot5_NotInScope(Collection<Long> otherlot5List) {
        regINS(CK_NINS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     */
    public void setOtherlot5_IsNull() { regOtherlot5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {bigint(19)}
     */
    public void setOtherlot5_IsNotNull() { regOtherlot5(CK_ISNN, DOBJ); }

    protected void regOtherlot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot5(), "OTHERLOT5"); }
    protected abstract ConditionValue xgetCValueOtherlot5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_Equal(String damageflg) {
        doSetDamageflg_Equal(fRES(damageflg));
    }

    protected void doSetDamageflg_Equal(String damageflg) {
        regDamageflg(CK_EQ, damageflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotEqual(String damageflg) {
        doSetDamageflg_NotEqual(fRES(damageflg));
    }

    protected void doSetDamageflg_NotEqual(String damageflg) {
        regDamageflg(CK_NES, damageflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterThan(String damageflg) {
        regDamageflg(CK_GT, fRES(damageflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_LessThan(String damageflg) {
        regDamageflg(CK_LT, fRES(damageflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterEqual(String damageflg) {
        regDamageflg(CK_GE, fRES(damageflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_LessEqual(String damageflg) {
        regDamageflg(CK_LE, fRES(damageflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflgList The collection of damageflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_InScope(Collection<String> damageflgList) {
        doSetDamageflg_InScope(damageflgList);
    }

    protected void doSetDamageflg_InScope(Collection<String> damageflgList) {
        regINS(CK_INS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflgList The collection of damageflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotInScope(Collection<String> damageflgList) {
        doSetDamageflg_NotInScope(damageflgList);
    }

    protected void doSetDamageflg_NotInScope(Collection<String> damageflgList) {
        regINS(CK_NINS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setDamageflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param damageflg The value of damageflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDamageflg_LikeSearch(String damageflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(damageflg), xgetCValueDamageflg(), "DAMAGEFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDamageflg_NotLikeSearch(String damageflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(damageflg), xgetCValueDamageflg(), "DAMAGEFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @param damageflg The value of damageflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_PrefixSearch(String damageflg) {
        setDamageflg_LikeSearch(damageflg, xcLSOPPre());
    }

    protected void regDamageflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageflg(), "DAMAGEFLG"); }
    protected abstract ConditionValue xgetCValueDamageflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_Equal(String noshippingflg) {
        doSetNoshippingflg_Equal(fRES(noshippingflg));
    }

    protected void doSetNoshippingflg_Equal(String noshippingflg) {
        regNoshippingflg(CK_EQ, noshippingflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotEqual(String noshippingflg) {
        doSetNoshippingflg_NotEqual(fRES(noshippingflg));
    }

    protected void doSetNoshippingflg_NotEqual(String noshippingflg) {
        regNoshippingflg(CK_NES, noshippingflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterThan(String noshippingflg) {
        regNoshippingflg(CK_GT, fRES(noshippingflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessThan(String noshippingflg) {
        regNoshippingflg(CK_LT, fRES(noshippingflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterEqual(String noshippingflg) {
        regNoshippingflg(CK_GE, fRES(noshippingflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessEqual(String noshippingflg) {
        regNoshippingflg(CK_LE, fRES(noshippingflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_InScope(Collection<String> noshippingflgList) {
        doSetNoshippingflg_InScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_InScope(Collection<String> noshippingflgList) {
        regINS(CK_INS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotInScope(Collection<String> noshippingflgList) {
        doSetNoshippingflg_NotInScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_NotInScope(Collection<String> noshippingflgList) {
        regINS(CK_NINS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setNoshippingflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noshippingflg The value of noshippingflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoshippingflg_LikeSearch(String noshippingflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noshippingflg), xgetCValueNoshippingflg(), "NOSHIPPINGFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoshippingflg_NotLikeSearch(String noshippingflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noshippingflg), xgetCValueNoshippingflg(), "NOSHIPPINGFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_PrefixSearch(String noshippingflg) {
        setNoshippingflg_LikeSearch(noshippingflg, xcLSOPPre());
    }

    protected void regNoshippingflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshippingflg(), "NOSHIPPINGFLG"); }
    protected abstract ConditionValue xgetCValueNoshippingflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(String foreigncargoflg) {
        doSetForeigncargoflg_Equal(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_Equal(String foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(String foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_NotEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(String foreigncargoflg) {
        regForeigncargoflg(CK_GT, fRES(foreigncargoflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(String foreigncargoflg) {
        regForeigncargoflg(CK_LT, fRES(foreigncargoflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_GE, fRES(foreigncargoflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_LE, fRES(foreigncargoflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setForeigncargoflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foreigncargoflg The value of foreigncargoflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setForeigncargoflg_LikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setForeigncargoflg_NotLikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_PrefixSearch(String foreigncargoflg) {
        setForeigncargoflg_LikeSearch(foreigncargoflg, xcLSOPPre());
    }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_Equal(String customsreleaseflg) {
        doSetCustomsreleaseflg_Equal(fRES(customsreleaseflg));
    }

    protected void doSetCustomsreleaseflg_Equal(String customsreleaseflg) {
        regCustomsreleaseflg(CK_EQ, customsreleaseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotEqual(String customsreleaseflg) {
        doSetCustomsreleaseflg_NotEqual(fRES(customsreleaseflg));
    }

    protected void doSetCustomsreleaseflg_NotEqual(String customsreleaseflg) {
        regCustomsreleaseflg(CK_NES, customsreleaseflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterThan(String customsreleaseflg) {
        regCustomsreleaseflg(CK_GT, fRES(customsreleaseflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessThan(String customsreleaseflg) {
        regCustomsreleaseflg(CK_LT, fRES(customsreleaseflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterEqual(String customsreleaseflg) {
        regCustomsreleaseflg(CK_GE, fRES(customsreleaseflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessEqual(String customsreleaseflg) {
        regCustomsreleaseflg(CK_LE, fRES(customsreleaseflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_InScope(Collection<String> customsreleaseflgList) {
        doSetCustomsreleaseflg_InScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_InScope(Collection<String> customsreleaseflgList) {
        regINS(CK_INS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotInScope(Collection<String> customsreleaseflgList) {
        doSetCustomsreleaseflg_NotInScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_NotInScope(Collection<String> customsreleaseflgList) {
        regINS(CK_NINS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setCustomsreleaseflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customsreleaseflg The value of customsreleaseflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomsreleaseflg_LikeSearch(String customsreleaseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customsreleaseflg), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomsreleaseflg_NotLikeSearch(String customsreleaseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customsreleaseflg), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_PrefixSearch(String customsreleaseflg) {
        setCustomsreleaseflg_LikeSearch(customsreleaseflg, xcLSOPPre());
    }

    protected void regCustomsreleaseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG"); }
    protected abstract ConditionValue xgetCValueCustomsreleaseflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_Equal(String taxflg) {
        doSetTaxflg_Equal(fRES(taxflg));
    }

    protected void doSetTaxflg_Equal(String taxflg) {
        regTaxflg(CK_EQ, taxflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotEqual(String taxflg) {
        doSetTaxflg_NotEqual(fRES(taxflg));
    }

    protected void doSetTaxflg_NotEqual(String taxflg) {
        regTaxflg(CK_NES, taxflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterThan(String taxflg) {
        regTaxflg(CK_GT, fRES(taxflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_LessThan(String taxflg) {
        regTaxflg(CK_LT, fRES(taxflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterEqual(String taxflg) {
        regTaxflg(CK_GE, fRES(taxflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_LessEqual(String taxflg) {
        regTaxflg(CK_LE, fRES(taxflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflgList The collection of taxflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_InScope(Collection<String> taxflgList) {
        doSetTaxflg_InScope(taxflgList);
    }

    protected void doSetTaxflg_InScope(Collection<String> taxflgList) {
        regINS(CK_INS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflgList The collection of taxflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotInScope(Collection<String> taxflgList) {
        doSetTaxflg_NotInScope(taxflgList);
    }

    protected void doSetTaxflg_NotInScope(Collection<String> taxflgList) {
        regINS(CK_NINS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setTaxflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taxflg The value of taxflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTaxflg_LikeSearch(String taxflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taxflg), xgetCValueTaxflg(), "TAXFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaxflg_NotLikeSearch(String taxflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taxflg), xgetCValueTaxflg(), "TAXFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @param taxflg The value of taxflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_PrefixSearch(String taxflg) {
        setTaxflg_LikeSearch(taxflg, xcLSOPPre());
    }

    protected void regTaxflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxflg(), "TAXFLG"); }
    protected abstract ConditionValue xgetCValueTaxflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(Long expectqty1) {
        doSetExpectqty1_Equal(expectqty1);
    }

    protected void doSetExpectqty1_Equal(Long expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(Long expectqty1) {
        doSetExpectqty1_NotEqual(expectqty1);
    }

    protected void doSetExpectqty1_NotEqual(Long expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(Long expectqty1) {
        regExpectqty1(CK_GT, expectqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(Long expectqty1) {
        regExpectqty1(CK_LT, expectqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(Long expectqty1) {
        regExpectqty1(CK_GE, expectqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(Long expectqty1) {
        regExpectqty1(CK_LE, expectqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty1(), "EXPECTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<Long> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<Long> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<Long> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<Long> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1 The value of xdockqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockqty1_Equal(Long xdockqty1) {
        doSetXdockqty1_Equal(xdockqty1);
    }

    protected void doSetXdockqty1_Equal(Long xdockqty1) {
        regXdockqty1(CK_EQ, xdockqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1 The value of xdockqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockqty1_NotEqual(Long xdockqty1) {
        doSetXdockqty1_NotEqual(xdockqty1);
    }

    protected void doSetXdockqty1_NotEqual(Long xdockqty1) {
        regXdockqty1(CK_NES, xdockqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1 The value of xdockqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockqty1_GreaterThan(Long xdockqty1) {
        regXdockqty1(CK_GT, xdockqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1 The value of xdockqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockqty1_LessThan(Long xdockqty1) {
        regXdockqty1(CK_LT, xdockqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1 The value of xdockqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockqty1_GreaterEqual(Long xdockqty1) {
        regXdockqty1(CK_GE, xdockqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1 The value of xdockqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockqty1_LessEqual(Long xdockqty1) {
        regXdockqty1(CK_LE, xdockqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of xdockqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of xdockqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setXdockqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueXdockqty1(), "XDOCKQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1List The collection of xdockqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdockqty1_InScope(Collection<Long> xdockqty1List) {
        doSetXdockqty1_InScope(xdockqty1List);
    }

    protected void doSetXdockqty1_InScope(Collection<Long> xdockqty1List) {
        regINS(CK_INS, cTL(xdockqty1List), xgetCValueXdockqty1(), "XDOCKQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param xdockqty1List The collection of xdockqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdockqty1_NotInScope(Collection<Long> xdockqty1List) {
        doSetXdockqty1_NotInScope(xdockqty1List);
    }

    protected void doSetXdockqty1_NotInScope(Collection<Long> xdockqty1List) {
        regINS(CK_NINS, cTL(xdockqty1List), xgetCValueXdockqty1(), "XDOCKQTY1");
    }

    protected void regXdockqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueXdockqty1(), "XDOCKQTY1"); }
    protected abstract ConditionValue xgetCValueXdockqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_Equal(Long allocqty1) {
        doSetAllocqty1_Equal(allocqty1);
    }

    protected void doSetAllocqty1_Equal(Long allocqty1) {
        regAllocqty1(CK_EQ, allocqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_NotEqual(Long allocqty1) {
        doSetAllocqty1_NotEqual(allocqty1);
    }

    protected void doSetAllocqty1_NotEqual(Long allocqty1) {
        regAllocqty1(CK_NES, allocqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_GreaterThan(Long allocqty1) {
        regAllocqty1(CK_GT, allocqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_LessThan(Long allocqty1) {
        regAllocqty1(CK_LT, allocqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_GreaterEqual(Long allocqty1) {
        regAllocqty1(CK_GE, allocqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1 The value of allocqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocqty1_LessEqual(Long allocqty1) {
        regAllocqty1(CK_LE, allocqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of allocqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocqty1(), "ALLOCQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1List The collection of allocqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocqty1_InScope(Collection<Long> allocqty1List) {
        doSetAllocqty1_InScope(allocqty1List);
    }

    protected void doSetAllocqty1_InScope(Collection<Long> allocqty1List) {
        regINS(CK_INS, cTL(allocqty1List), xgetCValueAllocqty1(), "ALLOCQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param allocqty1List The collection of allocqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocqty1_NotInScope(Collection<Long> allocqty1List) {
        doSetAllocqty1_NotInScope(allocqty1List);
    }

    protected void doSetAllocqty1_NotInScope(Collection<Long> allocqty1List) {
        regINS(CK_NINS, cTL(allocqty1List), xgetCValueAllocqty1(), "ALLOCQTY1");
    }

    protected void regAllocqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocqty1(), "ALLOCQTY1"); }
    protected abstract ConditionValue xgetCValueAllocqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1 The value of pickedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_Equal(Long pickedqty1) {
        doSetPickedqty1_Equal(pickedqty1);
    }

    protected void doSetPickedqty1_Equal(Long pickedqty1) {
        regPickedqty1(CK_EQ, pickedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1 The value of pickedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_NotEqual(Long pickedqty1) {
        doSetPickedqty1_NotEqual(pickedqty1);
    }

    protected void doSetPickedqty1_NotEqual(Long pickedqty1) {
        regPickedqty1(CK_NES, pickedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1 The value of pickedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_GreaterThan(Long pickedqty1) {
        regPickedqty1(CK_GT, pickedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1 The value of pickedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_LessThan(Long pickedqty1) {
        regPickedqty1(CK_LT, pickedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1 The value of pickedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_GreaterEqual(Long pickedqty1) {
        regPickedqty1(CK_GE, pickedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1 The value of pickedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_LessEqual(Long pickedqty1) {
        regPickedqty1(CK_LE, pickedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of pickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqty1(), "PICKEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1List The collection of pickedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqty1_InScope(Collection<Long> pickedqty1List) {
        doSetPickedqty1_InScope(pickedqty1List);
    }

    protected void doSetPickedqty1_InScope(Collection<Long> pickedqty1List) {
        regINS(CK_INS, cTL(pickedqty1List), xgetCValuePickedqty1(), "PICKEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param pickedqty1List The collection of pickedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqty1_NotInScope(Collection<Long> pickedqty1List) {
        doSetPickedqty1_NotInScope(pickedqty1List);
    }

    protected void doSetPickedqty1_NotInScope(Collection<Long> pickedqty1List) {
        regINS(CK_NINS, cTL(pickedqty1List), xgetCValuePickedqty1(), "PICKEDQTY1");
    }

    protected void regPickedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqty1(), "PICKEDQTY1"); }
    protected abstract ConditionValue xgetCValuePickedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_Equal(Long sortedqty1) {
        doSetSortedqty1_Equal(sortedqty1);
    }

    protected void doSetSortedqty1_Equal(Long sortedqty1) {
        regSortedqty1(CK_EQ, sortedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_NotEqual(Long sortedqty1) {
        doSetSortedqty1_NotEqual(sortedqty1);
    }

    protected void doSetSortedqty1_NotEqual(Long sortedqty1) {
        regSortedqty1(CK_NES, sortedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterThan(Long sortedqty1) {
        regSortedqty1(CK_GT, sortedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessThan(Long sortedqty1) {
        regSortedqty1(CK_LT, sortedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterEqual(Long sortedqty1) {
        regSortedqty1(CK_GE, sortedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessEqual(Long sortedqty1) {
        regSortedqty1(CK_LE, sortedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedqty1(), "SORTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1List The collection of sortedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_InScope(Collection<Long> sortedqty1List) {
        doSetSortedqty1_InScope(sortedqty1List);
    }

    protected void doSetSortedqty1_InScope(Collection<Long> sortedqty1List) {
        regINS(CK_INS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1List The collection of sortedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_NotInScope(Collection<Long> sortedqty1List) {
        doSetSortedqty1_NotInScope(sortedqty1List);
    }

    protected void doSetSortedqty1_NotInScope(Collection<Long> sortedqty1List) {
        regINS(CK_NINS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    protected void regSortedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedqty1(), "SORTEDQTY1"); }
    protected abstract ConditionValue xgetCValueSortedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_Equal(Long inspectedqty1) {
        doSetInspectedqty1_Equal(inspectedqty1);
    }

    protected void doSetInspectedqty1_Equal(Long inspectedqty1) {
        regInspectedqty1(CK_EQ, inspectedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotEqual(Long inspectedqty1) {
        doSetInspectedqty1_NotEqual(inspectedqty1);
    }

    protected void doSetInspectedqty1_NotEqual(Long inspectedqty1) {
        regInspectedqty1(CK_NES, inspectedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterThan(Long inspectedqty1) {
        regInspectedqty1(CK_GT, inspectedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessThan(Long inspectedqty1) {
        regInspectedqty1(CK_LT, inspectedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterEqual(Long inspectedqty1) {
        regInspectedqty1(CK_GE, inspectedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessEqual(Long inspectedqty1) {
        regInspectedqty1(CK_LE, inspectedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty1(), "INSPECTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_InScope(Collection<Long> inspectedqty1List) {
        doSetInspectedqty1_InScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_InScope(Collection<Long> inspectedqty1List) {
        regINS(CK_INS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotInScope(Collection<Long> inspectedqty1List) {
        doSetInspectedqty1_NotInScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_NotInScope(Collection<Long> inspectedqty1List) {
        regINS(CK_NINS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    protected void regInspectedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty1(), "INSPECTEDQTY1"); }
    protected abstract ConditionValue xgetCValueInspectedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1 The value of shippedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedqty1_Equal(Long shippedqty1) {
        doSetShippedqty1_Equal(shippedqty1);
    }

    protected void doSetShippedqty1_Equal(Long shippedqty1) {
        regShippedqty1(CK_EQ, shippedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1 The value of shippedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedqty1_NotEqual(Long shippedqty1) {
        doSetShippedqty1_NotEqual(shippedqty1);
    }

    protected void doSetShippedqty1_NotEqual(Long shippedqty1) {
        regShippedqty1(CK_NES, shippedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1 The value of shippedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedqty1_GreaterThan(Long shippedqty1) {
        regShippedqty1(CK_GT, shippedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1 The value of shippedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedqty1_LessThan(Long shippedqty1) {
        regShippedqty1(CK_LT, shippedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1 The value of shippedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedqty1_GreaterEqual(Long shippedqty1) {
        regShippedqty1(CK_GE, shippedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1 The value of shippedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedqty1_LessEqual(Long shippedqty1) {
        regShippedqty1(CK_LE, shippedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of shippedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippedqty1(), "SHIPPEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1List The collection of shippedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedqty1_InScope(Collection<Long> shippedqty1List) {
        doSetShippedqty1_InScope(shippedqty1List);
    }

    protected void doSetShippedqty1_InScope(Collection<Long> shippedqty1List) {
        regINS(CK_INS, cTL(shippedqty1List), xgetCValueShippedqty1(), "SHIPPEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param shippedqty1List The collection of shippedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedqty1_NotInScope(Collection<Long> shippedqty1List) {
        doSetShippedqty1_NotInScope(shippedqty1List);
    }

    protected void doSetShippedqty1_NotInScope(Collection<Long> shippedqty1List) {
        regINS(CK_NINS, cTL(shippedqty1List), xgetCValueShippedqty1(), "SHIPPEDQTY1");
    }

    protected void regShippedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippedqty1(), "SHIPPEDQTY1"); }
    protected abstract ConditionValue xgetCValueShippedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_Equal(Long adjustqty1) {
        doSetAdjustqty1_Equal(adjustqty1);
    }

    protected void doSetAdjustqty1_Equal(Long adjustqty1) {
        regAdjustqty1(CK_EQ, adjustqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_NotEqual(Long adjustqty1) {
        doSetAdjustqty1_NotEqual(adjustqty1);
    }

    protected void doSetAdjustqty1_NotEqual(Long adjustqty1) {
        regAdjustqty1(CK_NES, adjustqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_GreaterThan(Long adjustqty1) {
        regAdjustqty1(CK_GT, adjustqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_LessThan(Long adjustqty1) {
        regAdjustqty1(CK_LT, adjustqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_GreaterEqual(Long adjustqty1) {
        regAdjustqty1(CK_GE, adjustqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_LessEqual(Long adjustqty1) {
        regAdjustqty1(CK_LE, adjustqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of adjustqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustqty1(), "ADJUSTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1List The collection of adjustqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty1_InScope(Collection<Long> adjustqty1List) {
        doSetAdjustqty1_InScope(adjustqty1List);
    }

    protected void doSetAdjustqty1_InScope(Collection<Long> adjustqty1List) {
        regINS(CK_INS, cTL(adjustqty1List), xgetCValueAdjustqty1(), "ADJUSTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty1List The collection of adjustqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty1_NotInScope(Collection<Long> adjustqty1List) {
        doSetAdjustqty1_NotInScope(adjustqty1List);
    }

    protected void doSetAdjustqty1_NotInScope(Collection<Long> adjustqty1List) {
        regINS(CK_NINS, cTL(adjustqty1List), xgetCValueAdjustqty1(), "ADJUSTQTY1");
    }

    protected void regAdjustqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustqty1(), "ADJUSTQTY1"); }
    protected abstract ConditionValue xgetCValueAdjustqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1 The value of price1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice1_Equal(java.math.BigDecimal price1) {
        doSetPrice1_Equal(price1);
    }

    protected void doSetPrice1_Equal(java.math.BigDecimal price1) {
        regPrice1(CK_EQ, price1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1 The value of price1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice1_NotEqual(java.math.BigDecimal price1) {
        doSetPrice1_NotEqual(price1);
    }

    protected void doSetPrice1_NotEqual(java.math.BigDecimal price1) {
        regPrice1(CK_NES, price1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1 The value of price1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice1_GreaterThan(java.math.BigDecimal price1) {
        regPrice1(CK_GT, price1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1 The value of price1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice1_LessThan(java.math.BigDecimal price1) {
        regPrice1(CK_LT, price1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1 The value of price1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice1_GreaterEqual(java.math.BigDecimal price1) {
        regPrice1(CK_GE, price1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1 The value of price1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice1_LessEqual(java.math.BigDecimal price1) {
        regPrice1(CK_LE, price1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of price1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of price1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrice1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrice1(), "PRICE1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1List The collection of price1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice1_InScope(Collection<java.math.BigDecimal> price1List) {
        doSetPrice1_InScope(price1List);
    }

    protected void doSetPrice1_InScope(Collection<java.math.BigDecimal> price1List) {
        regINS(CK_INS, cTL(price1List), xgetCValuePrice1(), "PRICE1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price1List The collection of price1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice1_NotInScope(Collection<java.math.BigDecimal> price1List) {
        doSetPrice1_NotInScope(price1List);
    }

    protected void doSetPrice1_NotInScope(Collection<java.math.BigDecimal> price1List) {
        regINS(CK_NINS, cTL(price1List), xgetCValuePrice1(), "PRICE1");
    }

    protected void regPrice1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrice1(), "PRICE1"); }
    protected abstract ConditionValue xgetCValuePrice1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2 The value of price2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice2_Equal(java.math.BigDecimal price2) {
        doSetPrice2_Equal(price2);
    }

    protected void doSetPrice2_Equal(java.math.BigDecimal price2) {
        regPrice2(CK_EQ, price2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2 The value of price2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice2_NotEqual(java.math.BigDecimal price2) {
        doSetPrice2_NotEqual(price2);
    }

    protected void doSetPrice2_NotEqual(java.math.BigDecimal price2) {
        regPrice2(CK_NES, price2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2 The value of price2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice2_GreaterThan(java.math.BigDecimal price2) {
        regPrice2(CK_GT, price2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2 The value of price2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice2_LessThan(java.math.BigDecimal price2) {
        regPrice2(CK_LT, price2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2 The value of price2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice2_GreaterEqual(java.math.BigDecimal price2) {
        regPrice2(CK_GE, price2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2 The value of price2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice2_LessEqual(java.math.BigDecimal price2) {
        regPrice2(CK_LE, price2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of price2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of price2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrice2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrice2(), "PRICE2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2List The collection of price2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice2_InScope(Collection<java.math.BigDecimal> price2List) {
        doSetPrice2_InScope(price2List);
    }

    protected void doSetPrice2_InScope(Collection<java.math.BigDecimal> price2List) {
        regINS(CK_INS, cTL(price2List), xgetCValuePrice2(), "PRICE2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price2List The collection of price2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice2_NotInScope(Collection<java.math.BigDecimal> price2List) {
        doSetPrice2_NotInScope(price2List);
    }

    protected void doSetPrice2_NotInScope(Collection<java.math.BigDecimal> price2List) {
        regINS(CK_NINS, cTL(price2List), xgetCValuePrice2(), "PRICE2");
    }

    protected void regPrice2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrice2(), "PRICE2"); }
    protected abstract ConditionValue xgetCValuePrice2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3 The value of price3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice3_Equal(java.math.BigDecimal price3) {
        doSetPrice3_Equal(price3);
    }

    protected void doSetPrice3_Equal(java.math.BigDecimal price3) {
        regPrice3(CK_EQ, price3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3 The value of price3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice3_NotEqual(java.math.BigDecimal price3) {
        doSetPrice3_NotEqual(price3);
    }

    protected void doSetPrice3_NotEqual(java.math.BigDecimal price3) {
        regPrice3(CK_NES, price3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3 The value of price3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice3_GreaterThan(java.math.BigDecimal price3) {
        regPrice3(CK_GT, price3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3 The value of price3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice3_LessThan(java.math.BigDecimal price3) {
        regPrice3(CK_LT, price3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3 The value of price3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice3_GreaterEqual(java.math.BigDecimal price3) {
        regPrice3(CK_GE, price3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3 The value of price3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice3_LessEqual(java.math.BigDecimal price3) {
        regPrice3(CK_LE, price3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of price3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of price3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrice3_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrice3(), "PRICE3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3List The collection of price3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice3_InScope(Collection<java.math.BigDecimal> price3List) {
        doSetPrice3_InScope(price3List);
    }

    protected void doSetPrice3_InScope(Collection<java.math.BigDecimal> price3List) {
        regINS(CK_INS, cTL(price3List), xgetCValuePrice3(), "PRICE3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param price3List The collection of price3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice3_NotInScope(Collection<java.math.BigDecimal> price3List) {
        doSetPrice3_NotInScope(price3List);
    }

    protected void doSetPrice3_NotInScope(Collection<java.math.BigDecimal> price3List) {
        regINS(CK_NINS, cTL(price3List), xgetCValuePrice3(), "PRICE3");
    }

    protected void regPrice3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrice3(), "PRICE3"); }
    protected abstract ConditionValue xgetCValuePrice3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(30)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(30)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(30)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_Equal(String lotreserveflg) {
        doSetLotreserveflg_Equal(fRES(lotreserveflg));
    }

    protected void doSetLotreserveflg_Equal(String lotreserveflg) {
        regLotreserveflg(CK_EQ, lotreserveflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_NotEqual(String lotreserveflg) {
        doSetLotreserveflg_NotEqual(fRES(lotreserveflg));
    }

    protected void doSetLotreserveflg_NotEqual(String lotreserveflg) {
        regLotreserveflg(CK_NES, lotreserveflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_GreaterThan(String lotreserveflg) {
        regLotreserveflg(CK_GT, fRES(lotreserveflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_LessThan(String lotreserveflg) {
        regLotreserveflg(CK_LT, fRES(lotreserveflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_GreaterEqual(String lotreserveflg) {
        regLotreserveflg(CK_GE, fRES(lotreserveflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_LessEqual(String lotreserveflg) {
        regLotreserveflg(CK_LE, fRES(lotreserveflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflgList The collection of lotreserveflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_InScope(Collection<String> lotreserveflgList) {
        doSetLotreserveflg_InScope(lotreserveflgList);
    }

    protected void doSetLotreserveflg_InScope(Collection<String> lotreserveflgList) {
        regINS(CK_INS, cTL(lotreserveflgList), xgetCValueLotreserveflg(), "LOTRESERVEFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflgList The collection of lotreserveflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_NotInScope(Collection<String> lotreserveflgList) {
        doSetLotreserveflg_NotInScope(lotreserveflgList);
    }

    protected void doSetLotreserveflg_NotInScope(Collection<String> lotreserveflgList) {
        regINS(CK_NINS, cTL(lotreserveflgList), xgetCValueLotreserveflg(), "LOTRESERVEFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setLotreserveflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotreserveflg The value of lotreserveflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotreserveflg_LikeSearch(String lotreserveflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotreserveflg), xgetCValueLotreserveflg(), "LOTRESERVEFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotreserveflg_NotLikeSearch(String lotreserveflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotreserveflg), xgetCValueLotreserveflg(), "LOTRESERVEFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_PrefixSearch(String lotreserveflg) {
        setLotreserveflg_LikeSearch(lotreserveflg, xcLSOPPre());
    }

    protected void regLotreserveflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotreserveflg(), "LOTRESERVEFLG"); }
    protected abstract ConditionValue xgetCValueLotreserveflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_Equal(String pickqtyerrorflg) {
        doSetPickqtyerrorflg_Equal(fRES(pickqtyerrorflg));
    }

    protected void doSetPickqtyerrorflg_Equal(String pickqtyerrorflg) {
        regPickqtyerrorflg(CK_EQ, pickqtyerrorflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_NotEqual(String pickqtyerrorflg) {
        doSetPickqtyerrorflg_NotEqual(fRES(pickqtyerrorflg));
    }

    protected void doSetPickqtyerrorflg_NotEqual(String pickqtyerrorflg) {
        regPickqtyerrorflg(CK_NES, pickqtyerrorflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_GreaterThan(String pickqtyerrorflg) {
        regPickqtyerrorflg(CK_GT, fRES(pickqtyerrorflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_LessThan(String pickqtyerrorflg) {
        regPickqtyerrorflg(CK_LT, fRES(pickqtyerrorflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_GreaterEqual(String pickqtyerrorflg) {
        regPickqtyerrorflg(CK_GE, fRES(pickqtyerrorflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_LessEqual(String pickqtyerrorflg) {
        regPickqtyerrorflg(CK_LE, fRES(pickqtyerrorflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflgList The collection of pickqtyerrorflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_InScope(Collection<String> pickqtyerrorflgList) {
        doSetPickqtyerrorflg_InScope(pickqtyerrorflgList);
    }

    protected void doSetPickqtyerrorflg_InScope(Collection<String> pickqtyerrorflgList) {
        regINS(CK_INS, cTL(pickqtyerrorflgList), xgetCValuePickqtyerrorflg(), "PICKQTYERRORFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflgList The collection of pickqtyerrorflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_NotInScope(Collection<String> pickqtyerrorflgList) {
        doSetPickqtyerrorflg_NotInScope(pickqtyerrorflgList);
    }

    protected void doSetPickqtyerrorflg_NotInScope(Collection<String> pickqtyerrorflgList) {
        regINS(CK_NINS, cTL(pickqtyerrorflgList), xgetCValuePickqtyerrorflg(), "PICKQTYERRORFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setPickqtyerrorflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickqtyerrorflg The value of pickqtyerrorflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickqtyerrorflg_LikeSearch(String pickqtyerrorflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickqtyerrorflg), xgetCValuePickqtyerrorflg(), "PICKQTYERRORFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickqtyerrorflg_NotLikeSearch(String pickqtyerrorflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickqtyerrorflg), xgetCValuePickqtyerrorflg(), "PICKQTYERRORFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @param pickqtyerrorflg The value of pickqtyerrorflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickqtyerrorflg_PrefixSearch(String pickqtyerrorflg) {
        setPickqtyerrorflg_LikeSearch(pickqtyerrorflg, xcLSOPPre());
    }

    protected void regPickqtyerrorflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickqtyerrorflg(), "PICKQTYERRORFLG"); }
    protected abstract ConditionValue xgetCValuePickqtyerrorflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_Equal(String logicflg1) {
        doSetLogicflg1_Equal(fRES(logicflg1));
    }

    protected void doSetLogicflg1_Equal(String logicflg1) {
        regLogicflg1(CK_EQ, logicflg1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotEqual(String logicflg1) {
        doSetLogicflg1_NotEqual(fRES(logicflg1));
    }

    protected void doSetLogicflg1_NotEqual(String logicflg1) {
        regLogicflg1(CK_NES, logicflg1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterThan(String logicflg1) {
        regLogicflg1(CK_GT, fRES(logicflg1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_LessThan(String logicflg1) {
        regLogicflg1(CK_LT, fRES(logicflg1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterEqual(String logicflg1) {
        regLogicflg1(CK_GE, fRES(logicflg1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_LessEqual(String logicflg1) {
        regLogicflg1(CK_LE, fRES(logicflg1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1List The collection of logicflg1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_InScope(Collection<String> logicflg1List) {
        doSetLogicflg1_InScope(logicflg1List);
    }

    protected void doSetLogicflg1_InScope(Collection<String> logicflg1List) {
        regINS(CK_INS, cTL(logicflg1List), xgetCValueLogicflg1(), "LOGICFLG1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1List The collection of logicflg1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotInScope(Collection<String> logicflg1List) {
        doSetLogicflg1_NotInScope(logicflg1List);
    }

    protected void doSetLogicflg1_NotInScope(Collection<String> logicflg1List) {
        regINS(CK_NINS, cTL(logicflg1List), xgetCValueLogicflg1(), "LOGICFLG1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setLogicflg1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg1 The value of logicflg1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg1_LikeSearch(String logicflg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg1), xgetCValueLogicflg1(), "LOGICFLG1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg1_NotLikeSearch(String logicflg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg1), xgetCValueLogicflg1(), "LOGICFLG1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_PrefixSearch(String logicflg1) {
        setLogicflg1_LikeSearch(logicflg1, xcLSOPPre());
    }

    protected void regLogicflg1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg1(), "LOGICFLG1"); }
    protected abstract ConditionValue xgetCValueLogicflg1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_Equal(String logicflg2) {
        doSetLogicflg2_Equal(fRES(logicflg2));
    }

    protected void doSetLogicflg2_Equal(String logicflg2) {
        regLogicflg2(CK_EQ, logicflg2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotEqual(String logicflg2) {
        doSetLogicflg2_NotEqual(fRES(logicflg2));
    }

    protected void doSetLogicflg2_NotEqual(String logicflg2) {
        regLogicflg2(CK_NES, logicflg2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterThan(String logicflg2) {
        regLogicflg2(CK_GT, fRES(logicflg2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_LessThan(String logicflg2) {
        regLogicflg2(CK_LT, fRES(logicflg2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterEqual(String logicflg2) {
        regLogicflg2(CK_GE, fRES(logicflg2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_LessEqual(String logicflg2) {
        regLogicflg2(CK_LE, fRES(logicflg2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2List The collection of logicflg2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_InScope(Collection<String> logicflg2List) {
        doSetLogicflg2_InScope(logicflg2List);
    }

    protected void doSetLogicflg2_InScope(Collection<String> logicflg2List) {
        regINS(CK_INS, cTL(logicflg2List), xgetCValueLogicflg2(), "LOGICFLG2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2List The collection of logicflg2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotInScope(Collection<String> logicflg2List) {
        doSetLogicflg2_NotInScope(logicflg2List);
    }

    protected void doSetLogicflg2_NotInScope(Collection<String> logicflg2List) {
        regINS(CK_NINS, cTL(logicflg2List), xgetCValueLogicflg2(), "LOGICFLG2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setLogicflg2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg2 The value of logicflg2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg2_LikeSearch(String logicflg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg2), xgetCValueLogicflg2(), "LOGICFLG2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg2_NotLikeSearch(String logicflg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg2), xgetCValueLogicflg2(), "LOGICFLG2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_PrefixSearch(String logicflg2) {
        setLogicflg2_LikeSearch(logicflg2, xcLSOPPre());
    }

    protected void regLogicflg2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg2(), "LOGICFLG2"); }
    protected abstract ConditionValue xgetCValueLogicflg2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_Equal(String logicflg3) {
        doSetLogicflg3_Equal(fRES(logicflg3));
    }

    protected void doSetLogicflg3_Equal(String logicflg3) {
        regLogicflg3(CK_EQ, logicflg3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_NotEqual(String logicflg3) {
        doSetLogicflg3_NotEqual(fRES(logicflg3));
    }

    protected void doSetLogicflg3_NotEqual(String logicflg3) {
        regLogicflg3(CK_NES, logicflg3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_GreaterThan(String logicflg3) {
        regLogicflg3(CK_GT, fRES(logicflg3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_LessThan(String logicflg3) {
        regLogicflg3(CK_LT, fRES(logicflg3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_GreaterEqual(String logicflg3) {
        regLogicflg3(CK_GE, fRES(logicflg3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_LessEqual(String logicflg3) {
        regLogicflg3(CK_LE, fRES(logicflg3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3List The collection of logicflg3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_InScope(Collection<String> logicflg3List) {
        doSetLogicflg3_InScope(logicflg3List);
    }

    protected void doSetLogicflg3_InScope(Collection<String> logicflg3List) {
        regINS(CK_INS, cTL(logicflg3List), xgetCValueLogicflg3(), "LOGICFLG3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3List The collection of logicflg3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_NotInScope(Collection<String> logicflg3List) {
        doSetLogicflg3_NotInScope(logicflg3List);
    }

    protected void doSetLogicflg3_NotInScope(Collection<String> logicflg3List) {
        regINS(CK_NINS, cTL(logicflg3List), xgetCValueLogicflg3(), "LOGICFLG3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setLogicflg3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg3 The value of logicflg3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg3_LikeSearch(String logicflg3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg3), xgetCValueLogicflg3(), "LOGICFLG3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg3_NotLikeSearch(String logicflg3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg3), xgetCValueLogicflg3(), "LOGICFLG3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_PrefixSearch(String logicflg3) {
        setLogicflg3_LikeSearch(logicflg3, xcLSOPPre());
    }

    protected void regLogicflg3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg3(), "LOGICFLG3"); }
    protected abstract ConditionValue xgetCValueLogicflg3();

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
    public HpSLCFunction<TTrsodetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsodetailCB.class);
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
    public HpSLCFunction<TTrsodetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsodetailCB.class);
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
    public HpSLCFunction<TTrsodetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsodetailCB.class);
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
    public HpSLCFunction<TTrsodetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsodetailCB.class);
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
    public HpSLCFunction<TTrsodetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsodetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsodetailCB&gt;() {
     *     public void query(TTrsodetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsodetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsodetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsodetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsodetailCQ sq);

    protected TTrsodetailCB xcreateScalarConditionCB() {
        TTrsodetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsodetailCB xcreateScalarConditionPartitionByCB() {
        TTrsodetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsodetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsodetailCB cb = new TTrsodetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SODETAILID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsodetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsodetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsodetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsodetailCB cb = new TTrsodetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SODETAILID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsodetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsodetailCB cb = new TTrsodetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsodetailCQ sq);

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
    protected TTrsodetailCB newMyCB() {
        return new TTrsodetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsodetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

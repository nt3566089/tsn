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
 * The abstract condition-query of T_BTRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBtrpickdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBtrpickdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_BTRPICKDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_Equal(Long pickingInstDetailId) {
        doSetPickingInstDetailId_Equal(pickingInstDetailId);
    }

    protected void doSetPickingInstDetailId_Equal(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_EQ, pickingInstDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotEqual(Long pickingInstDetailId) {
        doSetPickingInstDetailId_NotEqual(pickingInstDetailId);
    }

    protected void doSetPickingInstDetailId_NotEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_NES, pickingInstDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GT, pickingInstDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LT, pickingInstDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GE, pickingInstDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LE, pickingInstDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_InScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_InScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_InScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_INS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_NotInScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_NINS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingInstDetailId_IsNull() { regPickingInstDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingInstDetailId_IsNotNull() { regPickingInstDetailId(CK_ISNN, DOBJ); }

    protected void regPickingInstDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstDetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstId The value of pickingInstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_Equal(Long pickingInstId) {
        doSetPickingInstId_Equal(pickingInstId);
    }

    protected void doSetPickingInstId_Equal(Long pickingInstId) {
        regPickingInstId(CK_EQ, pickingInstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstId The value of pickingInstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_NotEqual(Long pickingInstId) {
        doSetPickingInstId_NotEqual(pickingInstId);
    }

    protected void doSetPickingInstId_NotEqual(Long pickingInstId) {
        regPickingInstId(CK_NES, pickingInstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstId The value of pickingInstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterThan(Long pickingInstId) {
        regPickingInstId(CK_GT, pickingInstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstId The value of pickingInstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessThan(Long pickingInstId) {
        regPickingInstId(CK_LT, pickingInstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstId The value of pickingInstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterEqual(Long pickingInstId) {
        regPickingInstId(CK_GE, pickingInstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstId The value of pickingInstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessEqual(Long pickingInstId) {
        regPickingInstId(CK_LE, pickingInstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstId(), "PICKING_INST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstIdList The collection of pickingInstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstId_InScope(Collection<Long> pickingInstIdList) {
        doSetPickingInstId_InScope(pickingInstIdList);
    }

    protected void doSetPickingInstId_InScope(Collection<Long> pickingInstIdList) {
        regINS(CK_INS, cTL(pickingInstIdList), xgetCValuePickingInstId(), "PICKING_INST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @param pickingInstIdList The collection of pickingInstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstId_NotInScope(Collection<Long> pickingInstIdList) {
        doSetPickingInstId_NotInScope(pickingInstIdList);
    }

    protected void doSetPickingInstId_NotInScope(Collection<Long> pickingInstIdList) {
        regINS(CK_NINS, cTL(pickingInstIdList), xgetCValuePickingInstId(), "PICKING_INST_ID");
    }

    protected void regPickingInstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstId(), "PICKING_INST_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlineno The value of pickbatchlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchlineno_Equal(Long pickbatchlineno) {
        doSetPickbatchlineno_Equal(pickbatchlineno);
    }

    protected void doSetPickbatchlineno_Equal(Long pickbatchlineno) {
        regPickbatchlineno(CK_EQ, pickbatchlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlineno The value of pickbatchlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchlineno_NotEqual(Long pickbatchlineno) {
        doSetPickbatchlineno_NotEqual(pickbatchlineno);
    }

    protected void doSetPickbatchlineno_NotEqual(Long pickbatchlineno) {
        regPickbatchlineno(CK_NES, pickbatchlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlineno The value of pickbatchlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchlineno_GreaterThan(Long pickbatchlineno) {
        regPickbatchlineno(CK_GT, pickbatchlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlineno The value of pickbatchlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchlineno_LessThan(Long pickbatchlineno) {
        regPickbatchlineno(CK_LT, pickbatchlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlineno The value of pickbatchlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchlineno_GreaterEqual(Long pickbatchlineno) {
        regPickbatchlineno(CK_GE, pickbatchlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlineno The value of pickbatchlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchlineno_LessEqual(Long pickbatchlineno) {
        regPickbatchlineno(CK_LE, pickbatchlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param minNumber The min number of pickbatchlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickbatchlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickbatchlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickbatchlineno(), "PICKBATCHLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlinenoList The collection of pickbatchlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchlineno_InScope(Collection<Long> pickbatchlinenoList) {
        doSetPickbatchlineno_InScope(pickbatchlinenoList);
    }

    protected void doSetPickbatchlineno_InScope(Collection<Long> pickbatchlinenoList) {
        regINS(CK_INS, cTL(pickbatchlinenoList), xgetCValuePickbatchlineno(), "PICKBATCHLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @param pickbatchlinenoList The collection of pickbatchlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchlineno_NotInScope(Collection<Long> pickbatchlinenoList) {
        doSetPickbatchlineno_NotInScope(pickbatchlinenoList);
    }

    protected void doSetPickbatchlineno_NotInScope(Collection<Long> pickbatchlinenoList) {
        regINS(CK_NINS, cTL(pickbatchlinenoList), xgetCValuePickbatchlineno(), "PICKBATCHLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     */
    public void setPickbatchlineno_IsNull() { regPickbatchlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKBATCHLINENO: {bigint(19)}
     */
    public void setPickbatchlineno_IsNotNull() { regPickbatchlineno(CK_ISNN, DOBJ); }

    protected void regPickbatchlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickbatchlineno(), "PICKBATCHLINENO"); }
    protected abstract ConditionValue xgetCValuePickbatchlineno();

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
     * SODETAILID: {IX, NotNull, bigint(19)}
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
     * SODETAILID: {IX, NotNull, bigint(19)}
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
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterThan(Long sodetailid) {
        regSodetailid(CK_GT, sodetailid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessThan(Long sodetailid) {
        regSodetailid(CK_LT, sodetailid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterEqual(Long sodetailid) {
        regSodetailid(CK_GE, sodetailid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessEqual(Long sodetailid) {
        regSodetailid(CK_LE, sodetailid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSodetailid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSodetailid(), "SODETAILID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
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
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @param sodetailidList The collection of sodetailid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_NotInScope(Collection<Long> sodetailidList) {
        doSetSodetailid_NotInScope(sodetailidList);
    }

    protected void doSetSodetailid_NotInScope(Collection<Long> sodetailidList) {
        regINS(CK_NINS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    protected void regSodetailid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSodetailid(), "SODETAILID"); }
    protected abstract ConditionValue xgetCValueSodetailid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_Equal(Long sts) {
        doSetSts_Equal(sts);
    }

    protected void doSetSts_Equal(Long sts) {
        regSts(CK_EQ, sts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_NotEqual(Long sts) {
        doSetSts_NotEqual(sts);
    }

    protected void doSetSts_NotEqual(Long sts) {
        regSts(CK_NES, sts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterThan(Long sts) {
        regSts(CK_GT, sts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessThan(Long sts) {
        regSts(CK_LT, sts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterEqual(Long sts) {
        regSts(CK_GE, sts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessEqual(Long sts) {
        regSts(CK_LE, sts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSts(), "STS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param stsList The collection of sts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_InScope(Collection<Long> stsList) {
        doSetSts_InScope(stsList);
    }

    protected void doSetSts_InScope(Collection<Long> stsList) {
        regINS(CK_INS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param stsList The collection of sts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotInScope(Collection<Long> stsList) {
        doSetSts_NotInScope(stsList);
    }

    protected void doSetSts_NotInScope(Collection<Long> stsList) {
        regINS(CK_NINS, cTL(stsList), xgetCValueSts(), "STS");
    }

    protected void regSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSts(), "STS"); }
    protected abstract ConditionValue xgetCValueSts();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductId The value of ifProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfProductId_Equal(Long ifProductId) {
        doSetIfProductId_Equal(ifProductId);
    }

    protected void doSetIfProductId_Equal(Long ifProductId) {
        regIfProductId(CK_EQ, ifProductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductId The value of ifProductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfProductId_NotEqual(Long ifProductId) {
        doSetIfProductId_NotEqual(ifProductId);
    }

    protected void doSetIfProductId_NotEqual(Long ifProductId) {
        regIfProductId(CK_NES, ifProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductId The value of ifProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfProductId_GreaterThan(Long ifProductId) {
        regIfProductId(CK_GT, ifProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductId The value of ifProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfProductId_LessThan(Long ifProductId) {
        regIfProductId(CK_LT, ifProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductId The value of ifProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfProductId_GreaterEqual(Long ifProductId) {
        regIfProductId(CK_GE, ifProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductId The value of ifProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIfProductId_LessEqual(Long ifProductId) {
        regIfProductId(CK_LE, ifProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param minNumber The min number of ifProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ifProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIfProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIfProductId(), "IF_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductIdList The collection of ifProductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfProductId_InScope(Collection<Long> ifProductIdList) {
        doSetIfProductId_InScope(ifProductIdList);
    }

    protected void doSetIfProductId_InScope(Collection<Long> ifProductIdList) {
        regINS(CK_INS, cTL(ifProductIdList), xgetCValueIfProductId(), "IF_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @param ifProductIdList The collection of ifProductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfProductId_NotInScope(Collection<Long> ifProductIdList) {
        doSetIfProductId_NotInScope(ifProductIdList);
    }

    protected void doSetIfProductId_NotInScope(Collection<Long> ifProductIdList) {
        regINS(CK_NINS, cTL(ifProductIdList), xgetCValueIfProductId(), "IF_PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     */
    public void setIfProductId_IsNull() { regIfProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     */
    public void setIfProductId_IsNotNull() { regIfProductId(CK_ISNN, DOBJ); }

    protected void regIfProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfProductId(), "IF_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueIfProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
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
     * LOCATION_ID: {IX, NotNull, bigint(19)}
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
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
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
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_Equal(String locgroup) {
        doSetLocgroup_Equal(fRES(locgroup));
    }

    protected void doSetLocgroup_Equal(String locgroup) {
        regLocgroup(CK_EQ, locgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotEqual(String locgroup) {
        doSetLocgroup_NotEqual(fRES(locgroup));
    }

    protected void doSetLocgroup_NotEqual(String locgroup) {
        regLocgroup(CK_NES, locgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterThan(String locgroup) {
        regLocgroup(CK_GT, fRES(locgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessThan(String locgroup) {
        regLocgroup(CK_LT, fRES(locgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterEqual(String locgroup) {
        regLocgroup(CK_GE, fRES(locgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessEqual(String locgroup) {
        regLocgroup(CK_LE, fRES(locgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroupList The collection of locgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_InScope(Collection<String> locgroupList) {
        doSetLocgroup_InScope(locgroupList);
    }

    protected void doSetLocgroup_InScope(Collection<String> locgroupList) {
        regINS(CK_INS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroupList The collection of locgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotInScope(Collection<String> locgroupList) {
        doSetLocgroup_NotInScope(locgroupList);
    }

    protected void doSetLocgroup_NotInScope(Collection<String> locgroupList) {
        regINS(CK_NINS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(60)} <br>
     * <pre>e.g. setLocgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locgroup The value of locgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocgroup_LikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocgroup_NotLikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(60)}
     * @param locgroup The value of locgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_PrefixSearch(String locgroup) {
        setLocgroup_LikeSearch(locgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     */
    public void setLocgroup_IsNull() { regLocgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     */
    public void setLocgroup_IsNullOrEmpty() { regLocgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(60)}
     */
    public void setLocgroup_IsNotNull() { regLocgroup(CK_ISNN, DOBJ); }

    protected void regLocgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocgroup(), "LOCGROUP"); }
    protected abstract ConditionValue xgetCValueLocgroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_Equal(String loctype) {
        doSetLoctype_Equal(fRES(loctype));
    }

    protected void doSetLoctype_Equal(String loctype) {
        regLoctype(CK_EQ, loctype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_NotEqual(String loctype) {
        doSetLoctype_NotEqual(fRES(loctype));
    }

    protected void doSetLoctype_NotEqual(String loctype) {
        regLoctype(CK_NES, loctype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_GreaterThan(String loctype) {
        regLoctype(CK_GT, fRES(loctype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_LessThan(String loctype) {
        regLoctype(CK_LT, fRES(loctype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_GreaterEqual(String loctype) {
        regLoctype(CK_GE, fRES(loctype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_LessEqual(String loctype) {
        regLoctype(CK_LE, fRES(loctype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctypeList The collection of loctype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_InScope(Collection<String> loctypeList) {
        doSetLoctype_InScope(loctypeList);
    }

    protected void doSetLoctype_InScope(Collection<String> loctypeList) {
        regINS(CK_INS, cTL(loctypeList), xgetCValueLoctype(), "LOCTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctypeList The collection of loctype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_NotInScope(Collection<String> loctypeList) {
        doSetLoctype_NotInScope(loctypeList);
    }

    protected void doSetLoctype_NotInScope(Collection<String> loctypeList) {
        regINS(CK_NINS, cTL(loctypeList), xgetCValueLoctype(), "LOCTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCTYPE: {varchar(30)} <br>
     * <pre>e.g. setLoctype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loctype The value of loctype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoctype_LikeSearch(String loctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loctype), xgetCValueLoctype(), "LOCTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoctype_NotLikeSearch(String loctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loctype), xgetCValueLoctype(), "LOCTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCTYPE: {varchar(30)}
     * @param loctype The value of loctype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoctype_PrefixSearch(String loctype) {
        setLoctype_LikeSearch(loctype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     */
    public void setLoctype_IsNull() { regLoctype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     */
    public void setLoctype_IsNullOrEmpty() { regLoctype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCTYPE: {varchar(30)}
     */
    public void setLoctype_IsNotNull() { regLoctype(CK_ISNN, DOBJ); }

    protected void regLoctype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoctype(), "LOCTYPE"); }
    protected abstract ConditionValue xgetCValueLoctype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_Equal(String picktype) {
        doSetPicktype_Equal(fRES(picktype));
    }

    protected void doSetPicktype_Equal(String picktype) {
        regPicktype(CK_EQ, picktype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_NotEqual(String picktype) {
        doSetPicktype_NotEqual(fRES(picktype));
    }

    protected void doSetPicktype_NotEqual(String picktype) {
        regPicktype(CK_NES, picktype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_GreaterThan(String picktype) {
        regPicktype(CK_GT, fRES(picktype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_LessThan(String picktype) {
        regPicktype(CK_LT, fRES(picktype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_GreaterEqual(String picktype) {
        regPicktype(CK_GE, fRES(picktype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_LessEqual(String picktype) {
        regPicktype(CK_LE, fRES(picktype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktypeList The collection of picktype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_InScope(Collection<String> picktypeList) {
        doSetPicktype_InScope(picktypeList);
    }

    protected void doSetPicktype_InScope(Collection<String> picktypeList) {
        regINS(CK_INS, cTL(picktypeList), xgetCValuePicktype(), "PICKTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktypeList The collection of picktype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_NotInScope(Collection<String> picktypeList) {
        doSetPicktype_NotInScope(picktypeList);
    }

    protected void doSetPicktype_NotInScope(Collection<String> picktypeList) {
        regINS(CK_NINS, cTL(picktypeList), xgetCValuePicktype(), "PICKTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKTYPE: {varchar(30)} <br>
     * <pre>e.g. setPicktype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picktype The value of picktype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicktype_LikeSearch(String picktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picktype), xgetCValuePicktype(), "PICKTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicktype_NotLikeSearch(String picktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picktype), xgetCValuePicktype(), "PICKTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKTYPE: {varchar(30)}
     * @param picktype The value of picktype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktype_PrefixSearch(String picktype) {
        setPicktype_LikeSearch(picktype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     */
    public void setPicktype_IsNull() { regPicktype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     */
    public void setPicktype_IsNullOrEmpty() { regPicktype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKTYPE: {varchar(30)}
     */
    public void setPicktype_IsNotNull() { regPicktype(CK_ISNN, DOBJ); }

    protected void regPicktype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicktype(), "PICKTYPE"); }
    protected abstract ConditionValue xgetCValuePicktype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_Equal(String alloctype) {
        doSetAlloctype_Equal(fRES(alloctype));
    }

    protected void doSetAlloctype_Equal(String alloctype) {
        regAlloctype(CK_EQ, alloctype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_NotEqual(String alloctype) {
        doSetAlloctype_NotEqual(fRES(alloctype));
    }

    protected void doSetAlloctype_NotEqual(String alloctype) {
        regAlloctype(CK_NES, alloctype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_GreaterThan(String alloctype) {
        regAlloctype(CK_GT, fRES(alloctype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_LessThan(String alloctype) {
        regAlloctype(CK_LT, fRES(alloctype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_GreaterEqual(String alloctype) {
        regAlloctype(CK_GE, fRES(alloctype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_LessEqual(String alloctype) {
        regAlloctype(CK_LE, fRES(alloctype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctypeList The collection of alloctype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_InScope(Collection<String> alloctypeList) {
        doSetAlloctype_InScope(alloctypeList);
    }

    protected void doSetAlloctype_InScope(Collection<String> alloctypeList) {
        regINS(CK_INS, cTL(alloctypeList), xgetCValueAlloctype(), "ALLOCTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctypeList The collection of alloctype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_NotInScope(Collection<String> alloctypeList) {
        doSetAlloctype_NotInScope(alloctypeList);
    }

    protected void doSetAlloctype_NotInScope(Collection<String> alloctypeList) {
        regINS(CK_NINS, cTL(alloctypeList), xgetCValueAlloctype(), "ALLOCTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCTYPE: {varchar(30)} <br>
     * <pre>e.g. setAlloctype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param alloctype The value of alloctype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAlloctype_LikeSearch(String alloctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(alloctype), xgetCValueAlloctype(), "ALLOCTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAlloctype_NotLikeSearch(String alloctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(alloctype), xgetCValueAlloctype(), "ALLOCTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     * @param alloctype The value of alloctype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlloctype_PrefixSearch(String alloctype) {
        setAlloctype_LikeSearch(alloctype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     */
    public void setAlloctype_IsNull() { regAlloctype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     */
    public void setAlloctype_IsNullOrEmpty() { regAlloctype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOCTYPE: {varchar(30)}
     */
    public void setAlloctype_IsNotNull() { regAlloctype(CK_ISNN, DOBJ); }

    protected void regAlloctype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlloctype(), "ALLOCTYPE"); }
    protected abstract ConditionValue xgetCValueAlloctype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_Equal(String tagcd) {
        doSetTagcd_Equal(fRES(tagcd));
    }

    protected void doSetTagcd_Equal(String tagcd) {
        regTagcd(CK_EQ, tagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotEqual(String tagcd) {
        doSetTagcd_NotEqual(fRES(tagcd));
    }

    protected void doSetTagcd_NotEqual(String tagcd) {
        regTagcd(CK_NES, tagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterThan(String tagcd) {
        regTagcd(CK_GT, fRES(tagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessThan(String tagcd) {
        regTagcd(CK_LT, fRES(tagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterEqual(String tagcd) {
        regTagcd(CK_GE, fRES(tagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessEqual(String tagcd) {
        regTagcd(CK_LE, fRES(tagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcdList The collection of tagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_InScope(Collection<String> tagcdList) {
        doSetTagcd_InScope(tagcdList);
    }

    protected void doSetTagcd_InScope(Collection<String> tagcdList) {
        regINS(CK_INS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcdList The collection of tagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotInScope(Collection<String> tagcdList) {
        doSetTagcd_NotInScope(tagcdList);
    }

    protected void doSetTagcd_NotInScope(Collection<String> tagcdList) {
        regINS(CK_NINS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setTagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagcd The value of tagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagcd_LikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagcd_NotLikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @param tagcd The value of tagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_PrefixSearch(String tagcd) {
        setTagcd_LikeSearch(tagcd, xcLSOPPre());
    }

    protected void regTagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagcd(), "TAGCD"); }
    protected abstract ConditionValue xgetCValueTagcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_Equal(String actualtagcd) {
        doSetActualtagcd_Equal(fRES(actualtagcd));
    }

    protected void doSetActualtagcd_Equal(String actualtagcd) {
        regActualtagcd(CK_EQ, actualtagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_NotEqual(String actualtagcd) {
        doSetActualtagcd_NotEqual(fRES(actualtagcd));
    }

    protected void doSetActualtagcd_NotEqual(String actualtagcd) {
        regActualtagcd(CK_NES, actualtagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_GreaterThan(String actualtagcd) {
        regActualtagcd(CK_GT, fRES(actualtagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_LessThan(String actualtagcd) {
        regActualtagcd(CK_LT, fRES(actualtagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_GreaterEqual(String actualtagcd) {
        regActualtagcd(CK_GE, fRES(actualtagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_LessEqual(String actualtagcd) {
        regActualtagcd(CK_LE, fRES(actualtagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcdList The collection of actualtagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_InScope(Collection<String> actualtagcdList) {
        doSetActualtagcd_InScope(actualtagcdList);
    }

    protected void doSetActualtagcd_InScope(Collection<String> actualtagcdList) {
        regINS(CK_INS, cTL(actualtagcdList), xgetCValueActualtagcd(), "ACTUALTAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcdList The collection of actualtagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_NotInScope(Collection<String> actualtagcdList) {
        doSetActualtagcd_NotInScope(actualtagcdList);
    }

    protected void doSetActualtagcd_NotInScope(Collection<String> actualtagcdList) {
        regINS(CK_NINS, cTL(actualtagcdList), xgetCValueActualtagcd(), "ACTUALTAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALTAGCD: {varchar(30)} <br>
     * <pre>e.g. setActualtagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param actualtagcd The value of actualtagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActualtagcd_LikeSearch(String actualtagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(actualtagcd), xgetCValueActualtagcd(), "ACTUALTAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setActualtagcd_NotLikeSearch(String actualtagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(actualtagcd), xgetCValueActualtagcd(), "ACTUALTAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @param actualtagcd The value of actualtagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActualtagcd_PrefixSearch(String actualtagcd) {
        setActualtagcd_LikeSearch(actualtagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     */
    public void setActualtagcd_IsNull() { regActualtagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     */
    public void setActualtagcd_IsNullOrEmpty() { regActualtagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACTUALTAGCD: {varchar(30)}
     */
    public void setActualtagcd_IsNotNull() { regActualtagcd(CK_ISNN, DOBJ); }

    protected void regActualtagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActualtagcd(), "ACTUALTAGCD"); }
    protected abstract ConditionValue xgetCValueActualtagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationId The value of fromLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromLocationId_Equal(Long fromLocationId) {
        doSetFromLocationId_Equal(fromLocationId);
    }

    protected void doSetFromLocationId_Equal(Long fromLocationId) {
        regFromLocationId(CK_EQ, fromLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationId The value of fromLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromLocationId_NotEqual(Long fromLocationId) {
        doSetFromLocationId_NotEqual(fromLocationId);
    }

    protected void doSetFromLocationId_NotEqual(Long fromLocationId) {
        regFromLocationId(CK_NES, fromLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationId The value of fromLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromLocationId_GreaterThan(Long fromLocationId) {
        regFromLocationId(CK_GT, fromLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationId The value of fromLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromLocationId_LessThan(Long fromLocationId) {
        regFromLocationId(CK_LT, fromLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationId The value of fromLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromLocationId_GreaterEqual(Long fromLocationId) {
        regFromLocationId(CK_GE, fromLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationId The value of fromLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromLocationId_LessEqual(Long fromLocationId) {
        regFromLocationId(CK_LE, fromLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of fromLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFromLocationId(), "FROM_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationIdList The collection of fromLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationId_InScope(Collection<Long> fromLocationIdList) {
        doSetFromLocationId_InScope(fromLocationIdList);
    }

    protected void doSetFromLocationId_InScope(Collection<Long> fromLocationIdList) {
        regINS(CK_INS, cTL(fromLocationIdList), xgetCValueFromLocationId(), "FROM_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @param fromLocationIdList The collection of fromLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromLocationId_NotInScope(Collection<Long> fromLocationIdList) {
        doSetFromLocationId_NotInScope(fromLocationIdList);
    }

    protected void doSetFromLocationId_NotInScope(Collection<Long> fromLocationIdList) {
        regINS(CK_NINS, cTL(fromLocationIdList), xgetCValueFromLocationId(), "FROM_LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     */
    public void setFromLocationId_IsNull() { regFromLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     */
    public void setFromLocationId_IsNotNull() { regFromLocationId(CK_ISNN, DOBJ); }

    protected void regFromLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromLocationId(), "FROM_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueFromLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_Equal(String fromtagcd) {
        doSetFromtagcd_Equal(fRES(fromtagcd));
    }

    protected void doSetFromtagcd_Equal(String fromtagcd) {
        regFromtagcd(CK_EQ, fromtagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_NotEqual(String fromtagcd) {
        doSetFromtagcd_NotEqual(fRES(fromtagcd));
    }

    protected void doSetFromtagcd_NotEqual(String fromtagcd) {
        regFromtagcd(CK_NES, fromtagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_GreaterThan(String fromtagcd) {
        regFromtagcd(CK_GT, fRES(fromtagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_LessThan(String fromtagcd) {
        regFromtagcd(CK_LT, fRES(fromtagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_GreaterEqual(String fromtagcd) {
        regFromtagcd(CK_GE, fRES(fromtagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_LessEqual(String fromtagcd) {
        regFromtagcd(CK_LE, fRES(fromtagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcdList The collection of fromtagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_InScope(Collection<String> fromtagcdList) {
        doSetFromtagcd_InScope(fromtagcdList);
    }

    protected void doSetFromtagcd_InScope(Collection<String> fromtagcdList) {
        regINS(CK_INS, cTL(fromtagcdList), xgetCValueFromtagcd(), "FROMTAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcdList The collection of fromtagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_NotInScope(Collection<String> fromtagcdList) {
        doSetFromtagcd_NotInScope(fromtagcdList);
    }

    protected void doSetFromtagcd_NotInScope(Collection<String> fromtagcdList) {
        regINS(CK_NINS, cTL(fromtagcdList), xgetCValueFromtagcd(), "FROMTAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMTAGCD: {varchar(30)} <br>
     * <pre>e.g. setFromtagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromtagcd The value of fromtagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromtagcd_LikeSearch(String fromtagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromtagcd), xgetCValueFromtagcd(), "FROMTAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromtagcd_NotLikeSearch(String fromtagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromtagcd), xgetCValueFromtagcd(), "FROMTAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     * @param fromtagcd The value of fromtagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromtagcd_PrefixSearch(String fromtagcd) {
        setFromtagcd_LikeSearch(fromtagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     */
    public void setFromtagcd_IsNull() { regFromtagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     */
    public void setFromtagcd_IsNullOrEmpty() { regFromtagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMTAGCD: {varchar(30)}
     */
    public void setFromtagcd_IsNotNull() { regFromtagcd(CK_ISNN, DOBJ); }

    protected void regFromtagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromtagcd(), "FROMTAGCD"); }
    protected abstract ConditionValue xgetCValueFromtagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationId The value of toLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setToLocationId_Equal(Long toLocationId) {
        doSetToLocationId_Equal(toLocationId);
    }

    protected void doSetToLocationId_Equal(Long toLocationId) {
        regToLocationId(CK_EQ, toLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationId The value of toLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToLocationId_NotEqual(Long toLocationId) {
        doSetToLocationId_NotEqual(toLocationId);
    }

    protected void doSetToLocationId_NotEqual(Long toLocationId) {
        regToLocationId(CK_NES, toLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationId The value of toLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setToLocationId_GreaterThan(Long toLocationId) {
        regToLocationId(CK_GT, toLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationId The value of toLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setToLocationId_LessThan(Long toLocationId) {
        regToLocationId(CK_LT, toLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationId The value of toLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToLocationId_GreaterEqual(Long toLocationId) {
        regToLocationId(CK_GE, toLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationId The value of toLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToLocationId_LessEqual(Long toLocationId) {
        regToLocationId(CK_LE, toLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of toLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of toLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setToLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueToLocationId(), "TO_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationIdList The collection of toLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationId_InScope(Collection<Long> toLocationIdList) {
        doSetToLocationId_InScope(toLocationIdList);
    }

    protected void doSetToLocationId_InScope(Collection<Long> toLocationIdList) {
        regINS(CK_INS, cTL(toLocationIdList), xgetCValueToLocationId(), "TO_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @param toLocationIdList The collection of toLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToLocationId_NotInScope(Collection<Long> toLocationIdList) {
        doSetToLocationId_NotInScope(toLocationIdList);
    }

    protected void doSetToLocationId_NotInScope(Collection<Long> toLocationIdList) {
        regINS(CK_NINS, cTL(toLocationIdList), xgetCValueToLocationId(), "TO_LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     */
    public void setToLocationId_IsNull() { regToLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TO_LOCATION_ID: {bigint(19)}
     */
    public void setToLocationId_IsNotNull() { regToLocationId(CK_ISNN, DOBJ); }

    protected void regToLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToLocationId(), "TO_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueToLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_Equal(String totagcd) {
        doSetTotagcd_Equal(fRES(totagcd));
    }

    protected void doSetTotagcd_Equal(String totagcd) {
        regTotagcd(CK_EQ, totagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_NotEqual(String totagcd) {
        doSetTotagcd_NotEqual(fRES(totagcd));
    }

    protected void doSetTotagcd_NotEqual(String totagcd) {
        regTotagcd(CK_NES, totagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_GreaterThan(String totagcd) {
        regTotagcd(CK_GT, fRES(totagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_LessThan(String totagcd) {
        regTotagcd(CK_LT, fRES(totagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_GreaterEqual(String totagcd) {
        regTotagcd(CK_GE, fRES(totagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_LessEqual(String totagcd) {
        regTotagcd(CK_LE, fRES(totagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcdList The collection of totagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_InScope(Collection<String> totagcdList) {
        doSetTotagcd_InScope(totagcdList);
    }

    protected void doSetTotagcd_InScope(Collection<String> totagcdList) {
        regINS(CK_INS, cTL(totagcdList), xgetCValueTotagcd(), "TOTAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcdList The collection of totagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_NotInScope(Collection<String> totagcdList) {
        doSetTotagcd_NotInScope(totagcdList);
    }

    protected void doSetTotagcd_NotInScope(Collection<String> totagcdList) {
        regINS(CK_NINS, cTL(totagcdList), xgetCValueTotagcd(), "TOTAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAGCD: {varchar(30)} <br>
     * <pre>e.g. setTotagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param totagcd The value of totagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTotagcd_LikeSearch(String totagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(totagcd), xgetCValueTotagcd(), "TOTAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTotagcd_NotLikeSearch(String totagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(totagcd), xgetCValueTotagcd(), "TOTAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAGCD: {varchar(30)}
     * @param totagcd The value of totagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotagcd_PrefixSearch(String totagcd) {
        setTotagcd_LikeSearch(totagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     */
    public void setTotagcd_IsNull() { regTotagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     */
    public void setTotagcd_IsNullOrEmpty() { regTotagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAGCD: {varchar(30)}
     */
    public void setTotagcd_IsNotNull() { regTotagcd(CK_ISNN, DOBJ); }

    protected void regTotagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotagcd(), "TOTAGCD"); }
    protected abstract ConditionValue xgetCValueTotagcd();

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
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettype The value of pallettype as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettype_Equal(Long pallettype) {
        doSetPallettype_Equal(pallettype);
    }

    protected void doSetPallettype_Equal(Long pallettype) {
        regPallettype(CK_EQ, pallettype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettype The value of pallettype as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettype_NotEqual(Long pallettype) {
        doSetPallettype_NotEqual(pallettype);
    }

    protected void doSetPallettype_NotEqual(Long pallettype) {
        regPallettype(CK_NES, pallettype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettype The value of pallettype as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettype_GreaterThan(Long pallettype) {
        regPallettype(CK_GT, pallettype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettype The value of pallettype as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettype_LessThan(Long pallettype) {
        regPallettype(CK_LT, pallettype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettype The value of pallettype as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettype_GreaterEqual(Long pallettype) {
        regPallettype(CK_GE, pallettype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettype The value of pallettype as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettype_LessEqual(Long pallettype) {
        regPallettype(CK_LE, pallettype);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of pallettype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pallettype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPallettype_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePallettype(), "PALLETTYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettypeList The collection of pallettype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_InScope(Collection<Long> pallettypeList) {
        doSetPallettype_InScope(pallettypeList);
    }

    protected void doSetPallettype_InScope(Collection<Long> pallettypeList) {
        regINS(CK_INS, cTL(pallettypeList), xgetCValuePallettype(), "PALLETTYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @param pallettypeList The collection of pallettype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_NotInScope(Collection<Long> pallettypeList) {
        doSetPallettype_NotInScope(pallettypeList);
    }

    protected void doSetPallettype_NotInScope(Collection<Long> pallettypeList) {
        regINS(CK_NINS, cTL(pallettypeList), xgetCValuePallettype(), "PALLETTYPE");
    }

    protected void regPallettype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePallettype(), "PALLETTYPE"); }
    protected abstract ConditionValue xgetCValuePallettype();

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
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(Long rcvkey) {
        doSetRcvkey_Equal(rcvkey);
    }

    protected void doSetRcvkey_Equal(Long rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(Long rcvkey) {
        doSetRcvkey_NotEqual(rcvkey);
    }

    protected void doSetRcvkey_NotEqual(Long rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(Long rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(Long rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(Long rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(Long rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<Long> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<Long> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<Long> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<Long> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, bigint(19)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_Equal(Long rcvlineno) {
        doSetRcvlineno_Equal(rcvlineno);
    }

    protected void doSetRcvlineno_Equal(Long rcvlineno) {
        regRcvlineno(CK_EQ, rcvlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_NotEqual(Long rcvlineno) {
        doSetRcvlineno_NotEqual(rcvlineno);
    }

    protected void doSetRcvlineno_NotEqual(Long rcvlineno) {
        regRcvlineno(CK_NES, rcvlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(Long rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(Long rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(Long rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(Long rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_InScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        regINS(CK_INS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     */
    public void setRcvlineno_IsNull() { regRcvlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     */
    public void setRcvlineno_IsNotNull() { regRcvlineno(CK_ISNN, DOBJ); }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RCVLINENO"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_Equal(String pickusercd) {
        doSetPickusercd_Equal(fRES(pickusercd));
    }

    protected void doSetPickusercd_Equal(String pickusercd) {
        regPickusercd(CK_EQ, pickusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_NotEqual(String pickusercd) {
        doSetPickusercd_NotEqual(fRES(pickusercd));
    }

    protected void doSetPickusercd_NotEqual(String pickusercd) {
        regPickusercd(CK_NES, pickusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_GreaterThan(String pickusercd) {
        regPickusercd(CK_GT, fRES(pickusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_LessThan(String pickusercd) {
        regPickusercd(CK_LT, fRES(pickusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_GreaterEqual(String pickusercd) {
        regPickusercd(CK_GE, fRES(pickusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_LessEqual(String pickusercd) {
        regPickusercd(CK_LE, fRES(pickusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercdList The collection of pickusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_InScope(Collection<String> pickusercdList) {
        doSetPickusercd_InScope(pickusercdList);
    }

    protected void doSetPickusercd_InScope(Collection<String> pickusercdList) {
        regINS(CK_INS, cTL(pickusercdList), xgetCValuePickusercd(), "PICKUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercdList The collection of pickusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_NotInScope(Collection<String> pickusercdList) {
        doSetPickusercd_NotInScope(pickusercdList);
    }

    protected void doSetPickusercd_NotInScope(Collection<String> pickusercdList) {
        regINS(CK_NINS, cTL(pickusercdList), xgetCValuePickusercd(), "PICKUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKUSERCD: {varchar(30)} <br>
     * <pre>e.g. setPickusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickusercd The value of pickusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickusercd_LikeSearch(String pickusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickusercd), xgetCValuePickusercd(), "PICKUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickusercd_NotLikeSearch(String pickusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickusercd), xgetCValuePickusercd(), "PICKUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     * @param pickusercd The value of pickusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickusercd_PrefixSearch(String pickusercd) {
        setPickusercd_LikeSearch(pickusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     */
    public void setPickusercd_IsNull() { regPickusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     */
    public void setPickusercd_IsNullOrEmpty() { regPickusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKUSERCD: {varchar(30)}
     */
    public void setPickusercd_IsNotNull() { regPickusercd(CK_ISNN, DOBJ); }

    protected void regPickusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickusercd(), "PICKUSERCD"); }
    protected abstract ConditionValue xgetCValuePickusercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotreserveflg_Equal(Long lotreserveflg) {
        doSetLotreserveflg_Equal(lotreserveflg);
    }

    protected void doSetLotreserveflg_Equal(Long lotreserveflg) {
        regLotreserveflg(CK_EQ, lotreserveflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotreserveflg_NotEqual(Long lotreserveflg) {
        doSetLotreserveflg_NotEqual(lotreserveflg);
    }

    protected void doSetLotreserveflg_NotEqual(Long lotreserveflg) {
        regLotreserveflg(CK_NES, lotreserveflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotreserveflg_GreaterThan(Long lotreserveflg) {
        regLotreserveflg(CK_GT, lotreserveflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotreserveflg_LessThan(Long lotreserveflg) {
        regLotreserveflg(CK_LT, lotreserveflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotreserveflg_GreaterEqual(Long lotreserveflg) {
        regLotreserveflg(CK_GE, lotreserveflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflg The value of lotreserveflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotreserveflg_LessEqual(Long lotreserveflg) {
        regLotreserveflg(CK_LE, lotreserveflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of lotreserveflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotreserveflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotreserveflg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotreserveflg(), "LOTRESERVEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflgList The collection of lotreserveflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_InScope(Collection<Long> lotreserveflgList) {
        doSetLotreserveflg_InScope(lotreserveflgList);
    }

    protected void doSetLotreserveflg_InScope(Collection<Long> lotreserveflgList) {
        regINS(CK_INS, cTL(lotreserveflgList), xgetCValueLotreserveflg(), "LOTRESERVEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param lotreserveflgList The collection of lotreserveflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotreserveflg_NotInScope(Collection<Long> lotreserveflgList) {
        doSetLotreserveflg_NotInScope(lotreserveflgList);
    }

    protected void doSetLotreserveflg_NotInScope(Collection<Long> lotreserveflgList) {
        regINS(CK_NINS, cTL(lotreserveflgList), xgetCValueLotreserveflg(), "LOTRESERVEFLG");
    }

    protected void regLotreserveflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotreserveflg(), "LOTRESERVEFLG"); }
    protected abstract ConditionValue xgetCValueLotreserveflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_Equal(Long labelprintedflg) {
        doSetLabelprintedflg_Equal(labelprintedflg);
    }

    protected void doSetLabelprintedflg_Equal(Long labelprintedflg) {
        regLabelprintedflg(CK_EQ, labelprintedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_NotEqual(Long labelprintedflg) {
        doSetLabelprintedflg_NotEqual(labelprintedflg);
    }

    protected void doSetLabelprintedflg_NotEqual(Long labelprintedflg) {
        regLabelprintedflg(CK_NES, labelprintedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_GreaterThan(Long labelprintedflg) {
        regLabelprintedflg(CK_GT, labelprintedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_LessThan(Long labelprintedflg) {
        regLabelprintedflg(CK_LT, labelprintedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_GreaterEqual(Long labelprintedflg) {
        regLabelprintedflg(CK_GE, labelprintedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_LessEqual(Long labelprintedflg) {
        regLabelprintedflg(CK_LE, labelprintedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of labelprintedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of labelprintedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLabelprintedflg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLabelprintedflg(), "LABELPRINTEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflgList The collection of labelprintedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelprintedflg_InScope(Collection<Long> labelprintedflgList) {
        doSetLabelprintedflg_InScope(labelprintedflgList);
    }

    protected void doSetLabelprintedflg_InScope(Collection<Long> labelprintedflgList) {
        regINS(CK_INS, cTL(labelprintedflgList), xgetCValueLabelprintedflg(), "LABELPRINTEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelprintedflgList The collection of labelprintedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelprintedflg_NotInScope(Collection<Long> labelprintedflgList) {
        doSetLabelprintedflg_NotInScope(labelprintedflgList);
    }

    protected void doSetLabelprintedflg_NotInScope(Collection<Long> labelprintedflgList) {
        regINS(CK_NINS, cTL(labelprintedflgList), xgetCValueLabelprintedflg(), "LABELPRINTEDFLG");
    }

    protected void regLabelprintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLabelprintedflg(), "LABELPRINTEDFLG"); }
    protected abstract ConditionValue xgetCValueLabelprintedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletype The value of allocstyletype as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocstyletype_Equal(Long allocstyletype) {
        doSetAllocstyletype_Equal(allocstyletype);
    }

    protected void doSetAllocstyletype_Equal(Long allocstyletype) {
        regAllocstyletype(CK_EQ, allocstyletype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletype The value of allocstyletype as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocstyletype_NotEqual(Long allocstyletype) {
        doSetAllocstyletype_NotEqual(allocstyletype);
    }

    protected void doSetAllocstyletype_NotEqual(Long allocstyletype) {
        regAllocstyletype(CK_NES, allocstyletype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletype The value of allocstyletype as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocstyletype_GreaterThan(Long allocstyletype) {
        regAllocstyletype(CK_GT, allocstyletype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletype The value of allocstyletype as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocstyletype_LessThan(Long allocstyletype) {
        regAllocstyletype(CK_LT, allocstyletype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletype The value of allocstyletype as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocstyletype_GreaterEqual(Long allocstyletype) {
        regAllocstyletype(CK_GE, allocstyletype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletype The value of allocstyletype as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocstyletype_LessEqual(Long allocstyletype) {
        regAllocstyletype(CK_LE, allocstyletype);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param minNumber The min number of allocstyletype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocstyletype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocstyletype_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocstyletype(), "ALLOCSTYLETYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletypeList The collection of allocstyletype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocstyletype_InScope(Collection<Long> allocstyletypeList) {
        doSetAllocstyletype_InScope(allocstyletypeList);
    }

    protected void doSetAllocstyletype_InScope(Collection<Long> allocstyletypeList) {
        regINS(CK_INS, cTL(allocstyletypeList), xgetCValueAllocstyletype(), "ALLOCSTYLETYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @param allocstyletypeList The collection of allocstyletype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocstyletype_NotInScope(Collection<Long> allocstyletypeList) {
        doSetAllocstyletype_NotInScope(allocstyletypeList);
    }

    protected void doSetAllocstyletype_NotInScope(Collection<Long> allocstyletypeList) {
        regINS(CK_NINS, cTL(allocstyletypeList), xgetCValueAllocstyletype(), "ALLOCSTYLETYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     */
    public void setAllocstyletype_IsNull() { regAllocstyletype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     */
    public void setAllocstyletype_IsNotNull() { regAllocstyletype(CK_ISNN, DOBJ); }

    protected void regAllocstyletype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocstyletype(), "ALLOCSTYLETYPE"); }
    protected abstract ConditionValue xgetCValueAllocstyletype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkey The value of fullpalletkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_Equal(Long fullpalletkey) {
        doSetFullpalletkey_Equal(fullpalletkey);
    }

    protected void doSetFullpalletkey_Equal(Long fullpalletkey) {
        regFullpalletkey(CK_EQ, fullpalletkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkey The value of fullpalletkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_NotEqual(Long fullpalletkey) {
        doSetFullpalletkey_NotEqual(fullpalletkey);
    }

    protected void doSetFullpalletkey_NotEqual(Long fullpalletkey) {
        regFullpalletkey(CK_NES, fullpalletkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkey The value of fullpalletkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_GreaterThan(Long fullpalletkey) {
        regFullpalletkey(CK_GT, fullpalletkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkey The value of fullpalletkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_LessThan(Long fullpalletkey) {
        regFullpalletkey(CK_LT, fullpalletkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkey The value of fullpalletkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_GreaterEqual(Long fullpalletkey) {
        regFullpalletkey(CK_GE, fullpalletkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkey The value of fullpalletkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_LessEqual(Long fullpalletkey) {
        regFullpalletkey(CK_LE, fullpalletkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param minNumber The min number of fullpalletkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fullpalletkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFullpalletkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFullpalletkey(), "FULLPALLETKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkeyList The collection of fullpalletkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletkey_InScope(Collection<Long> fullpalletkeyList) {
        doSetFullpalletkey_InScope(fullpalletkeyList);
    }

    protected void doSetFullpalletkey_InScope(Collection<Long> fullpalletkeyList) {
        regINS(CK_INS, cTL(fullpalletkeyList), xgetCValueFullpalletkey(), "FULLPALLETKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @param fullpalletkeyList The collection of fullpalletkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletkey_NotInScope(Collection<Long> fullpalletkeyList) {
        doSetFullpalletkey_NotInScope(fullpalletkeyList);
    }

    protected void doSetFullpalletkey_NotInScope(Collection<Long> fullpalletkeyList) {
        regINS(CK_NINS, cTL(fullpalletkeyList), xgetCValueFullpalletkey(), "FULLPALLETKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     */
    public void setFullpalletkey_IsNull() { regFullpalletkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {bigint(19)}
     */
    public void setFullpalletkey_IsNotNull() { regFullpalletkey(CK_ISNN, DOBJ); }

    protected void regFullpalletkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFullpalletkey(), "FULLPALLETKEY"); }
    protected abstract ConditionValue xgetCValueFullpalletkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunit The value of pickingunit as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingunit_Equal(Long pickingunit) {
        doSetPickingunit_Equal(pickingunit);
    }

    protected void doSetPickingunit_Equal(Long pickingunit) {
        regPickingunit(CK_EQ, pickingunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunit The value of pickingunit as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingunit_NotEqual(Long pickingunit) {
        doSetPickingunit_NotEqual(pickingunit);
    }

    protected void doSetPickingunit_NotEqual(Long pickingunit) {
        regPickingunit(CK_NES, pickingunit);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunit The value of pickingunit as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingunit_GreaterThan(Long pickingunit) {
        regPickingunit(CK_GT, pickingunit);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunit The value of pickingunit as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingunit_LessThan(Long pickingunit) {
        regPickingunit(CK_LT, pickingunit);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunit The value of pickingunit as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingunit_GreaterEqual(Long pickingunit) {
        regPickingunit(CK_GE, pickingunit);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunit The value of pickingunit as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingunit_LessEqual(Long pickingunit) {
        regPickingunit(CK_LE, pickingunit);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param minNumber The min number of pickingunit. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingunit. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingunit_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingunit(), "PICKINGUNIT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunitList The collection of pickingunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingunit_InScope(Collection<Long> pickingunitList) {
        doSetPickingunit_InScope(pickingunitList);
    }

    protected void doSetPickingunit_InScope(Collection<Long> pickingunitList) {
        regINS(CK_INS, cTL(pickingunitList), xgetCValuePickingunit(), "PICKINGUNIT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     * @param pickingunitList The collection of pickingunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingunit_NotInScope(Collection<Long> pickingunitList) {
        doSetPickingunit_NotInScope(pickingunitList);
    }

    protected void doSetPickingunit_NotInScope(Collection<Long> pickingunitList) {
        regINS(CK_NINS, cTL(pickingunitList), xgetCValuePickingunit(), "PICKINGUNIT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     */
    public void setPickingunit_IsNull() { regPickingunit(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKINGUNIT: {bigint(19)}
     */
    public void setPickingunit_IsNotNull() { regPickingunit(CK_ISNN, DOBJ); }

    protected void regPickingunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingunit(), "PICKINGUNIT"); }
    protected abstract ConditionValue xgetCValuePickingunit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateid The value of workallocateid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_Equal(Long workallocateid) {
        doSetWorkallocateid_Equal(workallocateid);
    }

    protected void doSetWorkallocateid_Equal(Long workallocateid) {
        regWorkallocateid(CK_EQ, workallocateid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateid The value of workallocateid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotEqual(Long workallocateid) {
        doSetWorkallocateid_NotEqual(workallocateid);
    }

    protected void doSetWorkallocateid_NotEqual(Long workallocateid) {
        regWorkallocateid(CK_NES, workallocateid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateid The value of workallocateid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterThan(Long workallocateid) {
        regWorkallocateid(CK_GT, workallocateid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateid The value of workallocateid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessThan(Long workallocateid) {
        regWorkallocateid(CK_LT, workallocateid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateid The value of workallocateid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterEqual(Long workallocateid) {
        regWorkallocateid(CK_GE, workallocateid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateid The value of workallocateid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessEqual(Long workallocateid) {
        regWorkallocateid(CK_LE, workallocateid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param minNumber The min number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkallocateid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkallocateid(), "WORKALLOCATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateidList The collection of workallocateid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_InScope(Collection<Long> workallocateidList) {
        doSetWorkallocateid_InScope(workallocateidList);
    }

    protected void doSetWorkallocateid_InScope(Collection<Long> workallocateidList) {
        regINS(CK_INS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @param workallocateidList The collection of workallocateid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotInScope(Collection<Long> workallocateidList) {
        doSetWorkallocateid_NotInScope(workallocateidList);
    }

    protected void doSetWorkallocateid_NotInScope(Collection<Long> workallocateidList) {
        regINS(CK_NINS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     */
    public void setWorkallocateid_IsNull() { regWorkallocateid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     */
    public void setWorkallocateid_IsNotNull() { regWorkallocateid(CK_ISNN, DOBJ); }

    protected void regWorkallocateid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkallocateid(), "WORKALLOCATEID"); }
    protected abstract ConditionValue xgetCValueWorkallocateid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_Equal(String workallocatename) {
        doSetWorkallocatename_Equal(fRES(workallocatename));
    }

    protected void doSetWorkallocatename_Equal(String workallocatename) {
        regWorkallocatename(CK_EQ, workallocatename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_NotEqual(String workallocatename) {
        doSetWorkallocatename_NotEqual(fRES(workallocatename));
    }

    protected void doSetWorkallocatename_NotEqual(String workallocatename) {
        regWorkallocatename(CK_NES, workallocatename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_GreaterThan(String workallocatename) {
        regWorkallocatename(CK_GT, fRES(workallocatename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_LessThan(String workallocatename) {
        regWorkallocatename(CK_LT, fRES(workallocatename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_GreaterEqual(String workallocatename) {
        regWorkallocatename(CK_GE, fRES(workallocatename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_LessEqual(String workallocatename) {
        regWorkallocatename(CK_LE, fRES(workallocatename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatenameList The collection of workallocatename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_InScope(Collection<String> workallocatenameList) {
        doSetWorkallocatename_InScope(workallocatenameList);
    }

    protected void doSetWorkallocatename_InScope(Collection<String> workallocatenameList) {
        regINS(CK_INS, cTL(workallocatenameList), xgetCValueWorkallocatename(), "WORKALLOCATENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatenameList The collection of workallocatename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_NotInScope(Collection<String> workallocatenameList) {
        doSetWorkallocatename_NotInScope(workallocatenameList);
    }

    protected void doSetWorkallocatename_NotInScope(Collection<String> workallocatenameList) {
        regINS(CK_NINS, cTL(workallocatenameList), xgetCValueWorkallocatename(), "WORKALLOCATENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)} <br>
     * <pre>e.g. setWorkallocatename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workallocatename The value of workallocatename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkallocatename_LikeSearch(String workallocatename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workallocatename), xgetCValueWorkallocatename(), "WORKALLOCATENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkallocatename_NotLikeSearch(String workallocatename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workallocatename), xgetCValueWorkallocatename(), "WORKALLOCATENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @param workallocatename The value of workallocatename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_PrefixSearch(String workallocatename) {
        setWorkallocatename_LikeSearch(workallocatename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     */
    public void setWorkallocatename_IsNull() { regWorkallocatename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     */
    public void setWorkallocatename_IsNullOrEmpty() { regWorkallocatename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(100)}
     */
    public void setWorkallocatename_IsNotNull() { regWorkallocatename(CK_ISNN, DOBJ); }

    protected void regWorkallocatename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkallocatename(), "WORKALLOCATENAME"); }
    protected abstract ConditionValue xgetCValueWorkallocatename();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_Equal(Long alertflg) {
        doSetAlertflg_Equal(alertflg);
    }

    protected void doSetAlertflg_Equal(Long alertflg) {
        regAlertflg(CK_EQ, alertflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_NotEqual(Long alertflg) {
        doSetAlertflg_NotEqual(alertflg);
    }

    protected void doSetAlertflg_NotEqual(Long alertflg) {
        regAlertflg(CK_NES, alertflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_GreaterThan(Long alertflg) {
        regAlertflg(CK_GT, alertflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_LessThan(Long alertflg) {
        regAlertflg(CK_LT, alertflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_GreaterEqual(Long alertflg) {
        regAlertflg(CK_GE, alertflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_LessEqual(Long alertflg) {
        regAlertflg(CK_LE, alertflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of alertflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alertflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlertflg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlertflg(), "ALERTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflgList The collection of alertflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertflg_InScope(Collection<Long> alertflgList) {
        doSetAlertflg_InScope(alertflgList);
    }

    protected void doSetAlertflg_InScope(Collection<Long> alertflgList) {
        regINS(CK_INS, cTL(alertflgList), xgetCValueAlertflg(), "ALERTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflgList The collection of alertflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertflg_NotInScope(Collection<Long> alertflgList) {
        doSetAlertflg_NotInScope(alertflgList);
    }

    protected void doSetAlertflg_NotInScope(Collection<Long> alertflgList) {
        regINS(CK_NINS, cTL(alertflgList), xgetCValueAlertflg(), "ALERTFLG");
    }

    protected void regAlertflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlertflg(), "ALERTFLG"); }
    protected abstract ConditionValue xgetCValueAlertflg();

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
    public HpSLCFunction<TBtrpickdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBtrpickdetailCB.class);
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
    public HpSLCFunction<TBtrpickdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBtrpickdetailCB.class);
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
    public HpSLCFunction<TBtrpickdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBtrpickdetailCB.class);
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
    public HpSLCFunction<TBtrpickdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBtrpickdetailCB.class);
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
    public HpSLCFunction<TBtrpickdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBtrpickdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBtrpickdetailCB&gt;() {
     *     public void query(TBtrpickdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBtrpickdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBtrpickdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBtrpickdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBtrpickdetailCQ sq);

    protected TBtrpickdetailCB xcreateScalarConditionCB() {
        TBtrpickdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBtrpickdetailCB xcreateScalarConditionPartitionByCB() {
        TBtrpickdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBtrpickdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBtrpickdetailCB cb = new TBtrpickdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_INST_DETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBtrpickdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBtrpickdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBtrpickdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBtrpickdetailCB cb = new TBtrpickdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_INST_DETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBtrpickdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBtrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBtrpickdetailCB cb = new TBtrpickdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBtrpickdetailCQ sq);

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
    protected TBtrpickdetailCB newMyCB() {
        return new TBtrpickdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBtrpickdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

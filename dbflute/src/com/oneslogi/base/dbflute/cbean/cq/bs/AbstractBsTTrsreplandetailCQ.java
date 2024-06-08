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
 * The abstract condition-query of T_TRSREPLANDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsreplandetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsreplandetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSREPLANDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailId The value of trsreplandetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_Equal(Long trsreplandetailId) {
        doSetTrsreplandetailId_Equal(trsreplandetailId);
    }

    protected void doSetTrsreplandetailId_Equal(Long trsreplandetailId) {
        regTrsreplandetailId(CK_EQ, trsreplandetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailId The value of trsreplandetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_NotEqual(Long trsreplandetailId) {
        doSetTrsreplandetailId_NotEqual(trsreplandetailId);
    }

    protected void doSetTrsreplandetailId_NotEqual(Long trsreplandetailId) {
        regTrsreplandetailId(CK_NES, trsreplandetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailId The value of trsreplandetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_GreaterThan(Long trsreplandetailId) {
        regTrsreplandetailId(CK_GT, trsreplandetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailId The value of trsreplandetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_LessThan(Long trsreplandetailId) {
        regTrsreplandetailId(CK_LT, trsreplandetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailId The value of trsreplandetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_GreaterEqual(Long trsreplandetailId) {
        regTrsreplandetailId(CK_GE, trsreplandetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailId The value of trsreplandetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_LessEqual(Long trsreplandetailId) {
        regTrsreplandetailId(CK_LE, trsreplandetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsreplandetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsreplandetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsreplandetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsreplandetailId(), "TRSREPLANDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailIdList The collection of trsreplandetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_InScope(Collection<Long> trsreplandetailIdList) {
        doSetTrsreplandetailId_InScope(trsreplandetailIdList);
    }

    protected void doSetTrsreplandetailId_InScope(Collection<Long> trsreplandetailIdList) {
        regINS(CK_INS, cTL(trsreplandetailIdList), xgetCValueTrsreplandetailId(), "TRSREPLANDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplandetailIdList The collection of trsreplandetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsreplandetailId_NotInScope(Collection<Long> trsreplandetailIdList) {
        doSetTrsreplandetailId_NotInScope(trsreplandetailIdList);
    }

    protected void doSetTrsreplandetailId_NotInScope(Collection<Long> trsreplandetailIdList) {
        regINS(CK_NINS, cTL(trsreplandetailIdList), xgetCValueTrsreplandetailId(), "TRSREPLANDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsreplandetailId_IsNull() { regTrsreplandetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsreplandetailId_IsNotNull() { regTrsreplandetailId(CK_ISNN, DOBJ); }

    protected void regTrsreplandetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsreplandetailId(), "TRSREPLANDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrsreplandetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanId The value of trsreplanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_Equal(Long trsreplanId) {
        doSetTrsreplanId_Equal(trsreplanId);
    }

    protected void doSetTrsreplanId_Equal(Long trsreplanId) {
        regTrsreplanId(CK_EQ, trsreplanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanId The value of trsreplanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_NotEqual(Long trsreplanId) {
        doSetTrsreplanId_NotEqual(trsreplanId);
    }

    protected void doSetTrsreplanId_NotEqual(Long trsreplanId) {
        regTrsreplanId(CK_NES, trsreplanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanId The value of trsreplanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_GreaterThan(Long trsreplanId) {
        regTrsreplanId(CK_GT, trsreplanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanId The value of trsreplanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_LessThan(Long trsreplanId) {
        regTrsreplanId(CK_LT, trsreplanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanId The value of trsreplanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_GreaterEqual(Long trsreplanId) {
        regTrsreplanId(CK_GE, trsreplanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanId The value of trsreplanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_LessEqual(Long trsreplanId) {
        regTrsreplanId(CK_LE, trsreplanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of trsreplanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsreplanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsreplanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsreplanId(), "TRSREPLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanIdList The collection of trsreplanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsreplanId_InScope(Collection<Long> trsreplanIdList) {
        doSetTrsreplanId_InScope(trsreplanIdList);
    }

    protected void doSetTrsreplanId_InScope(Collection<Long> trsreplanIdList) {
        regINS(CK_INS, cTL(trsreplanIdList), xgetCValueTrsreplanId(), "TRSREPLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @param trsreplanIdList The collection of trsreplanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsreplanId_NotInScope(Collection<Long> trsreplanIdList) {
        doSetTrsreplanId_NotInScope(trsreplanIdList);
    }

    protected void doSetTrsreplanId_NotInScope(Collection<Long> trsreplanIdList) {
        regINS(CK_NINS, cTL(trsreplanIdList), xgetCValueTrsreplanId(), "TRSREPLAN_ID");
    }

    protected void regTrsreplanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsreplanId(), "TRSREPLAN_ID"); }
    protected abstract ConditionValue xgetCValueTrsreplanId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
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
     * RCVLINENO: {NotNull, bigint(19)}
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
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(Long rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(Long rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(Long rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(Long rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
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
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RCVLINENO"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlineno The value of supplierrcvlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_Equal(Long supplierrcvlineno) {
        doSetSupplierrcvlineno_Equal(supplierrcvlineno);
    }

    protected void doSetSupplierrcvlineno_Equal(Long supplierrcvlineno) {
        regSupplierrcvlineno(CK_EQ, supplierrcvlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlineno The value of supplierrcvlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_NotEqual(Long supplierrcvlineno) {
        doSetSupplierrcvlineno_NotEqual(supplierrcvlineno);
    }

    protected void doSetSupplierrcvlineno_NotEqual(Long supplierrcvlineno) {
        regSupplierrcvlineno(CK_NES, supplierrcvlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlineno The value of supplierrcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_GreaterThan(Long supplierrcvlineno) {
        regSupplierrcvlineno(CK_GT, supplierrcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlineno The value of supplierrcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_LessThan(Long supplierrcvlineno) {
        regSupplierrcvlineno(CK_LT, supplierrcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlineno The value of supplierrcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_GreaterEqual(Long supplierrcvlineno) {
        regSupplierrcvlineno(CK_GE, supplierrcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlineno The value of supplierrcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_LessEqual(Long supplierrcvlineno) {
        regSupplierrcvlineno(CK_LE, supplierrcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param minNumber The min number of supplierrcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of supplierrcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSupplierrcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSupplierrcvlineno(), "SUPPLIERRCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlinenoList The collection of supplierrcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_InScope(Collection<Long> supplierrcvlinenoList) {
        doSetSupplierrcvlineno_InScope(supplierrcvlinenoList);
    }

    protected void doSetSupplierrcvlineno_InScope(Collection<Long> supplierrcvlinenoList) {
        regINS(CK_INS, cTL(supplierrcvlinenoList), xgetCValueSupplierrcvlineno(), "SUPPLIERRCVLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @param supplierrcvlinenoList The collection of supplierrcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvlineno_NotInScope(Collection<Long> supplierrcvlinenoList) {
        doSetSupplierrcvlineno_NotInScope(supplierrcvlinenoList);
    }

    protected void doSetSupplierrcvlineno_NotInScope(Collection<Long> supplierrcvlinenoList) {
        regINS(CK_NINS, cTL(supplierrcvlinenoList), xgetCValueSupplierrcvlineno(), "SUPPLIERRCVLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     */
    public void setSupplierrcvlineno_IsNull() { regSupplierrcvlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     */
    public void setSupplierrcvlineno_IsNotNull() { regSupplierrcvlineno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvlineno(), "SUPPLIERRCVLINENO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflg The value of xdocflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocflg_Equal(java.math.BigDecimal xdocflg) {
        doSetXdocflg_Equal(xdocflg);
    }

    protected void doSetXdocflg_Equal(java.math.BigDecimal xdocflg) {
        regXdocflg(CK_EQ, xdocflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflg The value of xdocflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocflg_NotEqual(java.math.BigDecimal xdocflg) {
        doSetXdocflg_NotEqual(xdocflg);
    }

    protected void doSetXdocflg_NotEqual(java.math.BigDecimal xdocflg) {
        regXdocflg(CK_NES, xdocflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflg The value of xdocflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocflg_GreaterThan(java.math.BigDecimal xdocflg) {
        regXdocflg(CK_GT, xdocflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflg The value of xdocflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocflg_LessThan(java.math.BigDecimal xdocflg) {
        regXdocflg(CK_LT, xdocflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflg The value of xdocflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocflg_GreaterEqual(java.math.BigDecimal xdocflg) {
        regXdocflg(CK_GE, xdocflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflg The value of xdocflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocflg_LessEqual(java.math.BigDecimal xdocflg) {
        regXdocflg(CK_LE, xdocflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of xdocflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of xdocflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setXdocflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueXdocflg(), "XDOCFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflgList The collection of xdocflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdocflg_InScope(Collection<java.math.BigDecimal> xdocflgList) {
        doSetXdocflg_InScope(xdocflgList);
    }

    protected void doSetXdocflg_InScope(Collection<java.math.BigDecimal> xdocflgList) {
        regINS(CK_INS, cTL(xdocflgList), xgetCValueXdocflg(), "XDOCFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocflgList The collection of xdocflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdocflg_NotInScope(Collection<java.math.BigDecimal> xdocflgList) {
        doSetXdocflg_NotInScope(xdocflgList);
    }

    protected void doSetXdocflg_NotInScope(Collection<java.math.BigDecimal> xdocflgList) {
        regINS(CK_NINS, cTL(xdocflgList), xgetCValueXdocflg(), "XDOCFLG");
    }

    protected void regXdocflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueXdocflg(), "XDOCFLG"); }
    protected abstract ConditionValue xgetCValueXdocflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokey The value of pokey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPokey_Equal(java.math.BigDecimal pokey) {
        doSetPokey_Equal(pokey);
    }

    protected void doSetPokey_Equal(java.math.BigDecimal pokey) {
        regPokey(CK_EQ, pokey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokey The value of pokey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPokey_NotEqual(java.math.BigDecimal pokey) {
        doSetPokey_NotEqual(pokey);
    }

    protected void doSetPokey_NotEqual(java.math.BigDecimal pokey) {
        regPokey(CK_NES, pokey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokey The value of pokey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPokey_GreaterThan(java.math.BigDecimal pokey) {
        regPokey(CK_GT, pokey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokey The value of pokey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPokey_LessThan(java.math.BigDecimal pokey) {
        regPokey(CK_LT, pokey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokey The value of pokey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPokey_GreaterEqual(java.math.BigDecimal pokey) {
        regPokey(CK_GE, pokey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokey The value of pokey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPokey_LessEqual(java.math.BigDecimal pokey) {
        regPokey(CK_LE, pokey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param minNumber The min number of pokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPokey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePokey(), "POKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokeyList The collection of pokey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPokey_InScope(Collection<java.math.BigDecimal> pokeyList) {
        doSetPokey_InScope(pokeyList);
    }

    protected void doSetPokey_InScope(Collection<java.math.BigDecimal> pokeyList) {
        regINS(CK_INS, cTL(pokeyList), xgetCValuePokey(), "POKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POKEY: {decimal(16, 6)}
     * @param pokeyList The collection of pokey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPokey_NotInScope(Collection<java.math.BigDecimal> pokeyList) {
        doSetPokey_NotInScope(pokeyList);
    }

    protected void doSetPokey_NotInScope(Collection<java.math.BigDecimal> pokeyList) {
        regINS(CK_NINS, cTL(pokeyList), xgetCValuePokey(), "POKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     */
    public void setPokey_IsNull() { regPokey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POKEY: {decimal(16, 6)}
     */
    public void setPokey_IsNotNull() { regPokey(CK_ISNN, DOBJ); }

    protected void regPokey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePokey(), "POKEY"); }
    protected abstract ConditionValue xgetCValuePokey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polineno The value of polineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPolineno_Equal(Long polineno) {
        doSetPolineno_Equal(polineno);
    }

    protected void doSetPolineno_Equal(Long polineno) {
        regPolineno(CK_EQ, polineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polineno The value of polineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPolineno_NotEqual(Long polineno) {
        doSetPolineno_NotEqual(polineno);
    }

    protected void doSetPolineno_NotEqual(Long polineno) {
        regPolineno(CK_NES, polineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polineno The value of polineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPolineno_GreaterThan(Long polineno) {
        regPolineno(CK_GT, polineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polineno The value of polineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPolineno_LessThan(Long polineno) {
        regPolineno(CK_LT, polineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polineno The value of polineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPolineno_GreaterEqual(Long polineno) {
        regPolineno(CK_GE, polineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polineno The value of polineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPolineno_LessEqual(Long polineno) {
        regPolineno(CK_LE, polineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param minNumber The min number of polineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of polineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPolineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePolineno(), "POLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polinenoList The collection of polineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPolineno_InScope(Collection<Long> polinenoList) {
        doSetPolineno_InScope(polinenoList);
    }

    protected void doSetPolineno_InScope(Collection<Long> polinenoList) {
        regINS(CK_INS, cTL(polinenoList), xgetCValuePolineno(), "POLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POLINENO: {bigint(19)}
     * @param polinenoList The collection of polineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPolineno_NotInScope(Collection<Long> polinenoList) {
        doSetPolineno_NotInScope(polinenoList);
    }

    protected void doSetPolineno_NotInScope(Collection<Long> polinenoList) {
        regINS(CK_NINS, cTL(polinenoList), xgetCValuePolineno(), "POLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     */
    public void setPolineno_IsNull() { regPolineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POLINENO: {bigint(19)}
     */
    public void setPolineno_IsNotNull() { regPolineno(CK_ISNN, DOBJ); }

    protected void regPolineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePolineno(), "POLINENO"); }
    protected abstract ConditionValue xgetCValuePolineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_Equal(String potype) {
        doSetPotype_Equal(fRES(potype));
    }

    protected void doSetPotype_Equal(String potype) {
        regPotype(CK_EQ, potype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_NotEqual(String potype) {
        doSetPotype_NotEqual(fRES(potype));
    }

    protected void doSetPotype_NotEqual(String potype) {
        regPotype(CK_NES, potype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_GreaterThan(String potype) {
        regPotype(CK_GT, fRES(potype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_LessThan(String potype) {
        regPotype(CK_LT, fRES(potype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_GreaterEqual(String potype) {
        regPotype(CK_GE, fRES(potype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_LessEqual(String potype) {
        regPotype(CK_LE, fRES(potype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potypeList The collection of potype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_InScope(Collection<String> potypeList) {
        doSetPotype_InScope(potypeList);
    }

    protected void doSetPotype_InScope(Collection<String> potypeList) {
        regINS(CK_INS, cTL(potypeList), xgetCValuePotype(), "POTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potypeList The collection of potype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_NotInScope(Collection<String> potypeList) {
        doSetPotype_NotInScope(potypeList);
    }

    protected void doSetPotype_NotInScope(Collection<String> potypeList) {
        regINS(CK_NINS, cTL(potypeList), xgetCValuePotype(), "POTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POTYPE: {varchar(30)} <br>
     * <pre>e.g. setPotype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param potype The value of potype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPotype_LikeSearch(String potype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(potype), xgetCValuePotype(), "POTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPotype_NotLikeSearch(String potype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(potype), xgetCValuePotype(), "POTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POTYPE: {varchar(30)}
     * @param potype The value of potype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPotype_PrefixSearch(String potype) {
        setPotype_LikeSearch(potype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     */
    public void setPotype_IsNull() { regPotype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     */
    public void setPotype_IsNullOrEmpty() { regPotype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POTYPE: {varchar(30)}
     */
    public void setPotype_IsNotNull() { regPotype(CK_ISNN, DOBJ); }

    protected void regPotype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePotype(), "POTYPE"); }
    protected abstract ConditionValue xgetCValuePotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_Equal(String ownerpono) {
        doSetOwnerpono_Equal(fRES(ownerpono));
    }

    protected void doSetOwnerpono_Equal(String ownerpono) {
        regOwnerpono(CK_EQ, ownerpono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_NotEqual(String ownerpono) {
        doSetOwnerpono_NotEqual(fRES(ownerpono));
    }

    protected void doSetOwnerpono_NotEqual(String ownerpono) {
        regOwnerpono(CK_NES, ownerpono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_GreaterThan(String ownerpono) {
        regOwnerpono(CK_GT, fRES(ownerpono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_LessThan(String ownerpono) {
        regOwnerpono(CK_LT, fRES(ownerpono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_GreaterEqual(String ownerpono) {
        regOwnerpono(CK_GE, fRES(ownerpono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_LessEqual(String ownerpono) {
        regOwnerpono(CK_LE, fRES(ownerpono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerponoList The collection of ownerpono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_InScope(Collection<String> ownerponoList) {
        doSetOwnerpono_InScope(ownerponoList);
    }

    protected void doSetOwnerpono_InScope(Collection<String> ownerponoList) {
        regINS(CK_INS, cTL(ownerponoList), xgetCValueOwnerpono(), "OWNERPONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerponoList The collection of ownerpono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_NotInScope(Collection<String> ownerponoList) {
        doSetOwnerpono_NotInScope(ownerponoList);
    }

    protected void doSetOwnerpono_NotInScope(Collection<String> ownerponoList) {
        regINS(CK_NINS, cTL(ownerponoList), xgetCValueOwnerpono(), "OWNERPONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERPONO: {varchar(60)} <br>
     * <pre>e.g. setOwnerpono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerpono The value of ownerpono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerpono_LikeSearch(String ownerpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerpono), xgetCValueOwnerpono(), "OWNERPONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerpono_NotLikeSearch(String ownerpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerpono), xgetCValueOwnerpono(), "OWNERPONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERPONO: {varchar(60)}
     * @param ownerpono The value of ownerpono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpono_PrefixSearch(String ownerpono) {
        setOwnerpono_LikeSearch(ownerpono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     */
    public void setOwnerpono_IsNull() { regOwnerpono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     */
    public void setOwnerpono_IsNullOrEmpty() { regOwnerpono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERPONO: {varchar(60)}
     */
    public void setOwnerpono_IsNotNull() { regOwnerpono(CK_ISNN, DOBJ); }

    protected void regOwnerpono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerpono(), "OWNERPONO"); }
    protected abstract ConditionValue xgetCValueOwnerpono();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolineno The value of ownerpolineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerpolineno_Equal(Long ownerpolineno) {
        doSetOwnerpolineno_Equal(ownerpolineno);
    }

    protected void doSetOwnerpolineno_Equal(Long ownerpolineno) {
        regOwnerpolineno(CK_EQ, ownerpolineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolineno The value of ownerpolineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerpolineno_NotEqual(Long ownerpolineno) {
        doSetOwnerpolineno_NotEqual(ownerpolineno);
    }

    protected void doSetOwnerpolineno_NotEqual(Long ownerpolineno) {
        regOwnerpolineno(CK_NES, ownerpolineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolineno The value of ownerpolineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerpolineno_GreaterThan(Long ownerpolineno) {
        regOwnerpolineno(CK_GT, ownerpolineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolineno The value of ownerpolineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerpolineno_LessThan(Long ownerpolineno) {
        regOwnerpolineno(CK_LT, ownerpolineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolineno The value of ownerpolineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerpolineno_GreaterEqual(Long ownerpolineno) {
        regOwnerpolineno(CK_GE, ownerpolineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolineno The value of ownerpolineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerpolineno_LessEqual(Long ownerpolineno) {
        regOwnerpolineno(CK_LE, ownerpolineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param minNumber The min number of ownerpolineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ownerpolineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOwnerpolineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOwnerpolineno(), "OWNERPOLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolinenoList The collection of ownerpolineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpolineno_InScope(Collection<Long> ownerpolinenoList) {
        doSetOwnerpolineno_InScope(ownerpolinenoList);
    }

    protected void doSetOwnerpolineno_InScope(Collection<Long> ownerpolinenoList) {
        regINS(CK_INS, cTL(ownerpolinenoList), xgetCValueOwnerpolineno(), "OWNERPOLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @param ownerpolinenoList The collection of ownerpolineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerpolineno_NotInScope(Collection<Long> ownerpolinenoList) {
        doSetOwnerpolineno_NotInScope(ownerpolinenoList);
    }

    protected void doSetOwnerpolineno_NotInScope(Collection<Long> ownerpolinenoList) {
        regINS(CK_NINS, cTL(ownerpolinenoList), xgetCValueOwnerpolineno(), "OWNERPOLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     */
    public void setOwnerpolineno_IsNull() { regOwnerpolineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERPOLINENO: {bigint(19)}
     */
    public void setOwnerpolineno_IsNotNull() { regOwnerpolineno(CK_ISNN, DOBJ); }

    protected void regOwnerpolineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerpolineno(), "OWNERPOLINENO"); }
    protected abstract ConditionValue xgetCValueOwnerpolineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_Equal(String originalpono) {
        doSetOriginalpono_Equal(fRES(originalpono));
    }

    protected void doSetOriginalpono_Equal(String originalpono) {
        regOriginalpono(CK_EQ, originalpono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_NotEqual(String originalpono) {
        doSetOriginalpono_NotEqual(fRES(originalpono));
    }

    protected void doSetOriginalpono_NotEqual(String originalpono) {
        regOriginalpono(CK_NES, originalpono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_GreaterThan(String originalpono) {
        regOriginalpono(CK_GT, fRES(originalpono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_LessThan(String originalpono) {
        regOriginalpono(CK_LT, fRES(originalpono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_GreaterEqual(String originalpono) {
        regOriginalpono(CK_GE, fRES(originalpono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_LessEqual(String originalpono) {
        regOriginalpono(CK_LE, fRES(originalpono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalponoList The collection of originalpono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_InScope(Collection<String> originalponoList) {
        doSetOriginalpono_InScope(originalponoList);
    }

    protected void doSetOriginalpono_InScope(Collection<String> originalponoList) {
        regINS(CK_INS, cTL(originalponoList), xgetCValueOriginalpono(), "ORIGINALPONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalponoList The collection of originalpono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_NotInScope(Collection<String> originalponoList) {
        doSetOriginalpono_NotInScope(originalponoList);
    }

    protected void doSetOriginalpono_NotInScope(Collection<String> originalponoList) {
        regINS(CK_NINS, cTL(originalponoList), xgetCValueOriginalpono(), "ORIGINALPONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)} <br>
     * <pre>e.g. setOriginalpono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalpono The value of originalpono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOriginalpono_LikeSearch(String originalpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalpono), xgetCValueOriginalpono(), "ORIGINALPONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOriginalpono_NotLikeSearch(String originalpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalpono), xgetCValueOriginalpono(), "ORIGINALPONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_PrefixSearch(String originalpono) {
        setOriginalpono_LikeSearch(originalpono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     */
    public void setOriginalpono_IsNull() { regOriginalpono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     */
    public void setOriginalpono_IsNullOrEmpty() { regOriginalpono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     */
    public void setOriginalpono_IsNotNull() { regOriginalpono(CK_ISNN, DOBJ); }

    protected void regOriginalpono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalpono(), "ORIGINALPONO"); }
    protected abstract ConditionValue xgetCValueOriginalpono();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_Equal(String podate) {
        doSetPodate_Equal(fRES(podate));
    }

    protected void doSetPodate_Equal(String podate) {
        regPodate(CK_EQ, podate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_NotEqual(String podate) {
        doSetPodate_NotEqual(fRES(podate));
    }

    protected void doSetPodate_NotEqual(String podate) {
        regPodate(CK_NES, podate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_GreaterThan(String podate) {
        regPodate(CK_GT, fRES(podate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_LessThan(String podate) {
        regPodate(CK_LT, fRES(podate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_GreaterEqual(String podate) {
        regPodate(CK_GE, fRES(podate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_LessEqual(String podate) {
        regPodate(CK_LE, fRES(podate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podateList The collection of podate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_InScope(Collection<String> podateList) {
        doSetPodate_InScope(podateList);
    }

    protected void doSetPodate_InScope(Collection<String> podateList) {
        regINS(CK_INS, cTL(podateList), xgetCValuePodate(), "PODATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podateList The collection of podate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_NotInScope(Collection<String> podateList) {
        doSetPodate_NotInScope(podateList);
    }

    protected void doSetPodate_NotInScope(Collection<String> podateList) {
        regINS(CK_NINS, cTL(podateList), xgetCValuePodate(), "PODATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PODATE: {varchar(8)} <br>
     * <pre>e.g. setPodate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param podate The value of podate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPodate_LikeSearch(String podate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(podate), xgetCValuePodate(), "PODATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPodate_NotLikeSearch(String podate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(podate), xgetCValuePodate(), "PODATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PODATE: {varchar(8)}
     * @param podate The value of podate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPodate_PrefixSearch(String podate) {
        setPodate_LikeSearch(podate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     */
    public void setPodate_IsNull() { regPodate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     */
    public void setPodate_IsNullOrEmpty() { regPodate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PODATE: {varchar(8)}
     */
    public void setPodate_IsNotNull() { regPodate(CK_ISNN, DOBJ); }

    protected void regPodate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePodate(), "PODATE"); }
    protected abstract ConditionValue xgetCValuePodate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_Equal(String ownercd) {
        doSetOwnercd_Equal(fRES(ownercd));
    }

    protected void doSetOwnercd_Equal(String ownercd) {
        regOwnercd(CK_EQ, ownercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotEqual(String ownercd) {
        doSetOwnercd_NotEqual(fRES(ownercd));
    }

    protected void doSetOwnercd_NotEqual(String ownercd) {
        regOwnercd(CK_NES, ownercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterThan(String ownercd) {
        regOwnercd(CK_GT, fRES(ownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessThan(String ownercd) {
        regOwnercd(CK_LT, fRES(ownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterEqual(String ownercd) {
        regOwnercd(CK_GE, fRES(ownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessEqual(String ownercd) {
        regOwnercd(CK_LE, fRES(ownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_InScope(Collection<String> ownercdList) {
        doSetOwnercd_InScope(ownercdList);
    }

    protected void doSetOwnercd_InScope(Collection<String> ownercdList) {
        regINS(CK_INS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotInScope(Collection<String> ownercdList) {
        doSetOwnercd_NotInScope(ownercdList);
    }

    protected void doSetOwnercd_NotInScope(Collection<String> ownercdList) {
        regINS(CK_NINS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOwnercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownercd The value of ownercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnercd_LikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercd_NotLikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_PrefixSearch(String ownercd) {
        setOwnercd_LikeSearch(ownercd, xcLSOPPre());
    }

    protected void regOwnercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercd(), "OWNERCD"); }
    protected abstract ConditionValue xgetCValueOwnercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_Equal(String itemadmin) {
        doSetItemadmin_Equal(fRES(itemadmin));
    }

    protected void doSetItemadmin_Equal(String itemadmin) {
        regItemadmin(CK_EQ, itemadmin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotEqual(String itemadmin) {
        doSetItemadmin_NotEqual(fRES(itemadmin));
    }

    protected void doSetItemadmin_NotEqual(String itemadmin) {
        regItemadmin(CK_NES, itemadmin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterThan(String itemadmin) {
        regItemadmin(CK_GT, fRES(itemadmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessThan(String itemadmin) {
        regItemadmin(CK_LT, fRES(itemadmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterEqual(String itemadmin) {
        regItemadmin(CK_GE, fRES(itemadmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessEqual(String itemadmin) {
        regItemadmin(CK_LE, fRES(itemadmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadminList The collection of itemadmin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_InScope(Collection<String> itemadminList) {
        doSetItemadmin_InScope(itemadminList);
    }

    protected void doSetItemadmin_InScope(Collection<String> itemadminList) {
        regINS(CK_INS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadminList The collection of itemadmin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotInScope(Collection<String> itemadminList) {
        doSetItemadmin_NotInScope(itemadminList);
    }

    protected void doSetItemadmin_NotInScope(Collection<String> itemadminList) {
        regINS(CK_NINS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemadmin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemadmin The value of itemadmin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemadmin_LikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemadmin_NotLikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_PrefixSearch(String itemadmin) {
        setItemadmin_LikeSearch(itemadmin, xcLSOPPre());
    }

    protected void regItemadmin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemadmin(), "ITEMADMIN"); }
    protected abstract ConditionValue xgetCValueItemadmin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

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
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_Equal(String otherlot1) {
        doSetOtherlot1_Equal(fRES(otherlot1));
    }

    protected void doSetOtherlot1_Equal(String otherlot1) {
        regOtherlot1(CK_EQ, otherlot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotEqual(String otherlot1) {
        doSetOtherlot1_NotEqual(fRES(otherlot1));
    }

    protected void doSetOtherlot1_NotEqual(String otherlot1) {
        regOtherlot1(CK_NES, otherlot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterThan(String otherlot1) {
        regOtherlot1(CK_GT, fRES(otherlot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessThan(String otherlot1) {
        regOtherlot1(CK_LT, fRES(otherlot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterEqual(String otherlot1) {
        regOtherlot1(CK_GE, fRES(otherlot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessEqual(String otherlot1) {
        regOtherlot1(CK_LE, fRES(otherlot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_InScope(Collection<String> otherlot1List) {
        doSetOtherlot1_InScope(otherlot1List);
    }

    protected void doSetOtherlot1_InScope(Collection<String> otherlot1List) {
        regINS(CK_INS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotInScope(Collection<String> otherlot1List) {
        doSetOtherlot1_NotInScope(otherlot1List);
    }

    protected void doSetOtherlot1_NotInScope(Collection<String> otherlot1List) {
        regINS(CK_NINS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)} <br>
     * <pre>e.g. setOtherlot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot1 The value of otherlot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot1_LikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot1_NotLikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_PrefixSearch(String otherlot1) {
        setOtherlot1_LikeSearch(otherlot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNull() { regOtherlot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNullOrEmpty() { regOtherlot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNotNull() { regOtherlot1(CK_ISNN, DOBJ); }

    protected void regOtherlot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1(), "OTHERLOT1"); }
    protected abstract ConditionValue xgetCValueOtherlot1();

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
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_Equal(java.math.BigDecimal otherlot5) {
        doSetOtherlot5_Equal(otherlot5);
    }

    protected void doSetOtherlot5_Equal(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_EQ, otherlot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_NotEqual(java.math.BigDecimal otherlot5) {
        doSetOtherlot5_NotEqual(otherlot5);
    }

    protected void doSetOtherlot5_NotEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_NES, otherlot5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterThan(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_GT, otherlot5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessThan(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_LT, otherlot5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_GE, otherlot5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_LE, otherlot5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param minNumber The min number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot5_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot5(), "OTHERLOT5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5List The collection of otherlot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_InScope(Collection<java.math.BigDecimal> otherlot5List) {
        doSetOtherlot5_InScope(otherlot5List);
    }

    protected void doSetOtherlot5_InScope(Collection<java.math.BigDecimal> otherlot5List) {
        regINS(CK_INS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5List The collection of otherlot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_NotInScope(Collection<java.math.BigDecimal> otherlot5List) {
        doSetOtherlot5_NotInScope(otherlot5List);
    }

    protected void doSetOtherlot5_NotInScope(Collection<java.math.BigDecimal> otherlot5List) {
        regINS(CK_NINS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     */
    public void setOtherlot5_IsNull() { regOtherlot5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     */
    public void setOtherlot5_IsNotNull() { regOtherlot5(CK_ISNN, DOBJ); }

    protected void regOtherlot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot5(), "OTHERLOT5"); }
    protected abstract ConditionValue xgetCValueOtherlot5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_Equal(java.math.BigDecimal damageflg) {
        doSetDamageflg_Equal(damageflg);
    }

    protected void doSetDamageflg_Equal(java.math.BigDecimal damageflg) {
        regDamageflg(CK_EQ, damageflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        doSetDamageflg_NotEqual(damageflg);
    }

    protected void doSetDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_NES, damageflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GT, damageflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LT, damageflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GE, damageflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LE, damageflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDamageflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDamageflg(), "DAMAGEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflgList The collection of damageflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_InScope(damageflgList);
    }

    protected void doSetDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_INS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflgList The collection of damageflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_NotInScope(damageflgList);
    }

    protected void doSetDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_NINS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    protected void regDamageflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageflg(), "DAMAGEFLG"); }
    protected abstract ConditionValue xgetCValueDamageflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_Equal(noshippingflg);
    }

    protected void doSetNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_EQ, noshippingflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_NotEqual(noshippingflg);
    }

    protected void doSetNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_NES, noshippingflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GT, noshippingflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LT, noshippingflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GE, noshippingflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LE, noshippingflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoshippingflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoshippingflg(), "NOSHIPPINGFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_InScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_INS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_NotInScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_NINS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    protected void regNoshippingflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshippingflg(), "NOSHIPPINGFLG"); }
    protected abstract ConditionValue xgetCValueNoshippingflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_Equal(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GT, foreigncargoflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LT, foreigncargoflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GE, foreigncargoflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LE, foreigncargoflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setForeigncargoflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_Equal(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_EQ, customsreleaseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_NotEqual(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_NES, customsreleaseflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GT, customsreleaseflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LT, customsreleaseflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GE, customsreleaseflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LE, customsreleaseflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomsreleaseflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_InScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_INS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_NotInScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_NINS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    protected void regCustomsreleaseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG"); }
    protected abstract ConditionValue xgetCValueCustomsreleaseflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_Equal(java.math.BigDecimal taxflg) {
        doSetTaxflg_Equal(taxflg);
    }

    protected void doSetTaxflg_Equal(java.math.BigDecimal taxflg) {
        regTaxflg(CK_EQ, taxflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_NotEqual(java.math.BigDecimal taxflg) {
        doSetTaxflg_NotEqual(taxflg);
    }

    protected void doSetTaxflg_NotEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_NES, taxflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterThan(java.math.BigDecimal taxflg) {
        regTaxflg(CK_GT, taxflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_LessThan(java.math.BigDecimal taxflg) {
        regTaxflg(CK_LT, taxflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_GE, taxflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_LessEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_LE, taxflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of taxflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of taxflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTaxflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaxflg(), "TAXFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflgList The collection of taxflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_InScope(Collection<java.math.BigDecimal> taxflgList) {
        doSetTaxflg_InScope(taxflgList);
    }

    protected void doSetTaxflg_InScope(Collection<java.math.BigDecimal> taxflgList) {
        regINS(CK_INS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflgList The collection of taxflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotInScope(Collection<java.math.BigDecimal> taxflgList) {
        doSetTaxflg_NotInScope(taxflgList);
    }

    protected void doSetTaxflg_NotInScope(Collection<java.math.BigDecimal> taxflgList) {
        regINS(CK_NINS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    protected void regTaxflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxflg(), "TAXFLG"); }
    protected abstract ConditionValue xgetCValueTaxflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(java.math.BigDecimal expectqty1) {
        doSetExpectqty1_Equal(expectqty1);
    }

    protected void doSetExpectqty1_Equal(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(java.math.BigDecimal expectqty1) {
        doSetExpectqty1_NotEqual(expectqty1);
    }

    protected void doSetExpectqty1_NotEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_GT, expectqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_LT, expectqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_GE, expectqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_LE, expectqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty1(), "EXPECTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<java.math.BigDecimal> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<java.math.BigDecimal> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<java.math.BigDecimal> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<java.math.BigDecimal> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_Equal(Long expectqty2) {
        doSetExpectqty2_Equal(expectqty2);
    }

    protected void doSetExpectqty2_Equal(Long expectqty2) {
        regExpectqty2(CK_EQ, expectqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_NotEqual(Long expectqty2) {
        doSetExpectqty2_NotEqual(expectqty2);
    }

    protected void doSetExpectqty2_NotEqual(Long expectqty2) {
        regExpectqty2(CK_NES, expectqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_GreaterThan(Long expectqty2) {
        regExpectqty2(CK_GT, expectqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_LessThan(Long expectqty2) {
        regExpectqty2(CK_LT, expectqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_GreaterEqual(Long expectqty2) {
        regExpectqty2(CK_GE, expectqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2 The value of expectqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty2_LessEqual(Long expectqty2) {
        regExpectqty2(CK_LE, expectqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty2(), "EXPECTQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2List The collection of expectqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty2_InScope(Collection<Long> expectqty2List) {
        doSetExpectqty2_InScope(expectqty2List);
    }

    protected void doSetExpectqty2_InScope(Collection<Long> expectqty2List) {
        regINS(CK_INS, cTL(expectqty2List), xgetCValueExpectqty2(), "EXPECTQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty2List The collection of expectqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty2_NotInScope(Collection<Long> expectqty2List) {
        doSetExpectqty2_NotInScope(expectqty2List);
    }

    protected void doSetExpectqty2_NotInScope(Collection<Long> expectqty2List) {
        regINS(CK_NINS, cTL(expectqty2List), xgetCValueExpectqty2(), "EXPECTQTY2");
    }

    protected void regExpectqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty2(), "EXPECTQTY2"); }
    protected abstract ConditionValue xgetCValueExpectqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_Equal(Long expectqty3) {
        doSetExpectqty3_Equal(expectqty3);
    }

    protected void doSetExpectqty3_Equal(Long expectqty3) {
        regExpectqty3(CK_EQ, expectqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_NotEqual(Long expectqty3) {
        doSetExpectqty3_NotEqual(expectqty3);
    }

    protected void doSetExpectqty3_NotEqual(Long expectqty3) {
        regExpectqty3(CK_NES, expectqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_GreaterThan(Long expectqty3) {
        regExpectqty3(CK_GT, expectqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_LessThan(Long expectqty3) {
        regExpectqty3(CK_LT, expectqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_GreaterEqual(Long expectqty3) {
        regExpectqty3(CK_GE, expectqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3 The value of expectqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty3_LessEqual(Long expectqty3) {
        regExpectqty3(CK_LE, expectqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty3(), "EXPECTQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3List The collection of expectqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty3_InScope(Collection<Long> expectqty3List) {
        doSetExpectqty3_InScope(expectqty3List);
    }

    protected void doSetExpectqty3_InScope(Collection<Long> expectqty3List) {
        regINS(CK_INS, cTL(expectqty3List), xgetCValueExpectqty3(), "EXPECTQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param expectqty3List The collection of expectqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty3_NotInScope(Collection<Long> expectqty3List) {
        doSetExpectqty3_NotInScope(expectqty3List);
    }

    protected void doSetExpectqty3_NotInScope(Collection<Long> expectqty3List) {
        regINS(CK_NINS, cTL(expectqty3List), xgetCValueExpectqty3(), "EXPECTQTY3");
    }

    protected void regExpectqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty3(), "EXPECTQTY3"); }
    protected abstract ConditionValue xgetCValueExpectqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1 The value of receivedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty1_Equal(java.math.BigDecimal receivedqty1) {
        doSetReceivedqty1_Equal(receivedqty1);
    }

    protected void doSetReceivedqty1_Equal(java.math.BigDecimal receivedqty1) {
        regReceivedqty1(CK_EQ, receivedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1 The value of receivedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty1_NotEqual(java.math.BigDecimal receivedqty1) {
        doSetReceivedqty1_NotEqual(receivedqty1);
    }

    protected void doSetReceivedqty1_NotEqual(java.math.BigDecimal receivedqty1) {
        regReceivedqty1(CK_NES, receivedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1 The value of receivedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty1_GreaterThan(java.math.BigDecimal receivedqty1) {
        regReceivedqty1(CK_GT, receivedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1 The value of receivedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty1_LessThan(java.math.BigDecimal receivedqty1) {
        regReceivedqty1(CK_LT, receivedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1 The value of receivedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty1_GreaterEqual(java.math.BigDecimal receivedqty1) {
        regReceivedqty1(CK_GE, receivedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1 The value of receivedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty1_LessEqual(java.math.BigDecimal receivedqty1) {
        regReceivedqty1(CK_LE, receivedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of receivedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivedqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivedqty1(), "RECEIVEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1List The collection of receivedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty1_InScope(Collection<java.math.BigDecimal> receivedqty1List) {
        doSetReceivedqty1_InScope(receivedqty1List);
    }

    protected void doSetReceivedqty1_InScope(Collection<java.math.BigDecimal> receivedqty1List) {
        regINS(CK_INS, cTL(receivedqty1List), xgetCValueReceivedqty1(), "RECEIVEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param receivedqty1List The collection of receivedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty1_NotInScope(Collection<java.math.BigDecimal> receivedqty1List) {
        doSetReceivedqty1_NotInScope(receivedqty1List);
    }

    protected void doSetReceivedqty1_NotInScope(Collection<java.math.BigDecimal> receivedqty1List) {
        regINS(CK_NINS, cTL(receivedqty1List), xgetCValueReceivedqty1(), "RECEIVEDQTY1");
    }

    protected void regReceivedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedqty1(), "RECEIVEDQTY1"); }
    protected abstract ConditionValue xgetCValueReceivedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2 The value of receivedqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty2_Equal(Long receivedqty2) {
        doSetReceivedqty2_Equal(receivedqty2);
    }

    protected void doSetReceivedqty2_Equal(Long receivedqty2) {
        regReceivedqty2(CK_EQ, receivedqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2 The value of receivedqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty2_NotEqual(Long receivedqty2) {
        doSetReceivedqty2_NotEqual(receivedqty2);
    }

    protected void doSetReceivedqty2_NotEqual(Long receivedqty2) {
        regReceivedqty2(CK_NES, receivedqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2 The value of receivedqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty2_GreaterThan(Long receivedqty2) {
        regReceivedqty2(CK_GT, receivedqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2 The value of receivedqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty2_LessThan(Long receivedqty2) {
        regReceivedqty2(CK_LT, receivedqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2 The value of receivedqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty2_GreaterEqual(Long receivedqty2) {
        regReceivedqty2(CK_GE, receivedqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2 The value of receivedqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty2_LessEqual(Long receivedqty2) {
        regReceivedqty2(CK_LE, receivedqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of receivedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivedqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivedqty2(), "RECEIVEDQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2List The collection of receivedqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty2_InScope(Collection<Long> receivedqty2List) {
        doSetReceivedqty2_InScope(receivedqty2List);
    }

    protected void doSetReceivedqty2_InScope(Collection<Long> receivedqty2List) {
        regINS(CK_INS, cTL(receivedqty2List), xgetCValueReceivedqty2(), "RECEIVEDQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty2List The collection of receivedqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty2_NotInScope(Collection<Long> receivedqty2List) {
        doSetReceivedqty2_NotInScope(receivedqty2List);
    }

    protected void doSetReceivedqty2_NotInScope(Collection<Long> receivedqty2List) {
        regINS(CK_NINS, cTL(receivedqty2List), xgetCValueReceivedqty2(), "RECEIVEDQTY2");
    }

    protected void regReceivedqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedqty2(), "RECEIVEDQTY2"); }
    protected abstract ConditionValue xgetCValueReceivedqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3 The value of receivedqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty3_Equal(Long receivedqty3) {
        doSetReceivedqty3_Equal(receivedqty3);
    }

    protected void doSetReceivedqty3_Equal(Long receivedqty3) {
        regReceivedqty3(CK_EQ, receivedqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3 The value of receivedqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty3_NotEqual(Long receivedqty3) {
        doSetReceivedqty3_NotEqual(receivedqty3);
    }

    protected void doSetReceivedqty3_NotEqual(Long receivedqty3) {
        regReceivedqty3(CK_NES, receivedqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3 The value of receivedqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty3_GreaterThan(Long receivedqty3) {
        regReceivedqty3(CK_GT, receivedqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3 The value of receivedqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty3_LessThan(Long receivedqty3) {
        regReceivedqty3(CK_LT, receivedqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3 The value of receivedqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty3_GreaterEqual(Long receivedqty3) {
        regReceivedqty3(CK_GE, receivedqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3 The value of receivedqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty3_LessEqual(Long receivedqty3) {
        regReceivedqty3(CK_LE, receivedqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of receivedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivedqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivedqty3(), "RECEIVEDQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3List The collection of receivedqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty3_InScope(Collection<Long> receivedqty3List) {
        doSetReceivedqty3_InScope(receivedqty3List);
    }

    protected void doSetReceivedqty3_InScope(Collection<Long> receivedqty3List) {
        regINS(CK_INS, cTL(receivedqty3List), xgetCValueReceivedqty3(), "RECEIVEDQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param receivedqty3List The collection of receivedqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty3_NotInScope(Collection<Long> receivedqty3List) {
        doSetReceivedqty3_NotInScope(receivedqty3List);
    }

    protected void doSetReceivedqty3_NotInScope(Collection<Long> receivedqty3List) {
        regINS(CK_NINS, cTL(receivedqty3List), xgetCValueReceivedqty3(), "RECEIVEDQTY3");
    }

    protected void regReceivedqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedqty3(), "RECEIVEDQTY3"); }
    protected abstract ConditionValue xgetCValueReceivedqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_Equal(java.math.BigDecimal adjustqty1) {
        doSetAdjustqty1_Equal(adjustqty1);
    }

    protected void doSetAdjustqty1_Equal(java.math.BigDecimal adjustqty1) {
        regAdjustqty1(CK_EQ, adjustqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_NotEqual(java.math.BigDecimal adjustqty1) {
        doSetAdjustqty1_NotEqual(adjustqty1);
    }

    protected void doSetAdjustqty1_NotEqual(java.math.BigDecimal adjustqty1) {
        regAdjustqty1(CK_NES, adjustqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_GreaterThan(java.math.BigDecimal adjustqty1) {
        regAdjustqty1(CK_GT, adjustqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_LessThan(java.math.BigDecimal adjustqty1) {
        regAdjustqty1(CK_LT, adjustqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_GreaterEqual(java.math.BigDecimal adjustqty1) {
        regAdjustqty1(CK_GE, adjustqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1 The value of adjustqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty1_LessEqual(java.math.BigDecimal adjustqty1) {
        regAdjustqty1(CK_LE, adjustqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of adjustqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustqty1(), "ADJUSTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1List The collection of adjustqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty1_InScope(Collection<java.math.BigDecimal> adjustqty1List) {
        doSetAdjustqty1_InScope(adjustqty1List);
    }

    protected void doSetAdjustqty1_InScope(Collection<java.math.BigDecimal> adjustqty1List) {
        regINS(CK_INS, cTL(adjustqty1List), xgetCValueAdjustqty1(), "ADJUSTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param adjustqty1List The collection of adjustqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty1_NotInScope(Collection<java.math.BigDecimal> adjustqty1List) {
        doSetAdjustqty1_NotInScope(adjustqty1List);
    }

    protected void doSetAdjustqty1_NotInScope(Collection<java.math.BigDecimal> adjustqty1List) {
        regINS(CK_NINS, cTL(adjustqty1List), xgetCValueAdjustqty1(), "ADJUSTQTY1");
    }

    protected void regAdjustqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustqty1(), "ADJUSTQTY1"); }
    protected abstract ConditionValue xgetCValueAdjustqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2 The value of adjustqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty2_Equal(Long adjustqty2) {
        doSetAdjustqty2_Equal(adjustqty2);
    }

    protected void doSetAdjustqty2_Equal(Long adjustqty2) {
        regAdjustqty2(CK_EQ, adjustqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2 The value of adjustqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty2_NotEqual(Long adjustqty2) {
        doSetAdjustqty2_NotEqual(adjustqty2);
    }

    protected void doSetAdjustqty2_NotEqual(Long adjustqty2) {
        regAdjustqty2(CK_NES, adjustqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2 The value of adjustqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty2_GreaterThan(Long adjustqty2) {
        regAdjustqty2(CK_GT, adjustqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2 The value of adjustqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty2_LessThan(Long adjustqty2) {
        regAdjustqty2(CK_LT, adjustqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2 The value of adjustqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty2_GreaterEqual(Long adjustqty2) {
        regAdjustqty2(CK_GE, adjustqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2 The value of adjustqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty2_LessEqual(Long adjustqty2) {
        regAdjustqty2(CK_LE, adjustqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of adjustqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustqty2(), "ADJUSTQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2List The collection of adjustqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty2_InScope(Collection<Long> adjustqty2List) {
        doSetAdjustqty2_InScope(adjustqty2List);
    }

    protected void doSetAdjustqty2_InScope(Collection<Long> adjustqty2List) {
        regINS(CK_INS, cTL(adjustqty2List), xgetCValueAdjustqty2(), "ADJUSTQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty2List The collection of adjustqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty2_NotInScope(Collection<Long> adjustqty2List) {
        doSetAdjustqty2_NotInScope(adjustqty2List);
    }

    protected void doSetAdjustqty2_NotInScope(Collection<Long> adjustqty2List) {
        regINS(CK_NINS, cTL(adjustqty2List), xgetCValueAdjustqty2(), "ADJUSTQTY2");
    }

    protected void regAdjustqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustqty2(), "ADJUSTQTY2"); }
    protected abstract ConditionValue xgetCValueAdjustqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3 The value of adjustqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty3_Equal(Long adjustqty3) {
        doSetAdjustqty3_Equal(adjustqty3);
    }

    protected void doSetAdjustqty3_Equal(Long adjustqty3) {
        regAdjustqty3(CK_EQ, adjustqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3 The value of adjustqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty3_NotEqual(Long adjustqty3) {
        doSetAdjustqty3_NotEqual(adjustqty3);
    }

    protected void doSetAdjustqty3_NotEqual(Long adjustqty3) {
        regAdjustqty3(CK_NES, adjustqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3 The value of adjustqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty3_GreaterThan(Long adjustqty3) {
        regAdjustqty3(CK_GT, adjustqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3 The value of adjustqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty3_LessThan(Long adjustqty3) {
        regAdjustqty3(CK_LT, adjustqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3 The value of adjustqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty3_GreaterEqual(Long adjustqty3) {
        regAdjustqty3(CK_GE, adjustqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3 The value of adjustqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustqty3_LessEqual(Long adjustqty3) {
        regAdjustqty3(CK_LE, adjustqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of adjustqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustqty3(), "ADJUSTQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3List The collection of adjustqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty3_InScope(Collection<Long> adjustqty3List) {
        doSetAdjustqty3_InScope(adjustqty3List);
    }

    protected void doSetAdjustqty3_InScope(Collection<Long> adjustqty3List) {
        regINS(CK_INS, cTL(adjustqty3List), xgetCValueAdjustqty3(), "ADJUSTQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param adjustqty3List The collection of adjustqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustqty3_NotInScope(Collection<Long> adjustqty3List) {
        doSetAdjustqty3_NotInScope(adjustqty3List);
    }

    protected void doSetAdjustqty3_NotInScope(Collection<Long> adjustqty3List) {
        regINS(CK_NINS, cTL(adjustqty3List), xgetCValueAdjustqty3(), "ADJUSTQTY3");
    }

    protected void regAdjustqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustqty3(), "ADJUSTQTY3"); }
    protected abstract ConditionValue xgetCValueAdjustqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1 The value of rcvtagqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagqty1_Equal(java.math.BigDecimal rcvtagqty1) {
        doSetRcvtagqty1_Equal(rcvtagqty1);
    }

    protected void doSetRcvtagqty1_Equal(java.math.BigDecimal rcvtagqty1) {
        regRcvtagqty1(CK_EQ, rcvtagqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1 The value of rcvtagqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagqty1_NotEqual(java.math.BigDecimal rcvtagqty1) {
        doSetRcvtagqty1_NotEqual(rcvtagqty1);
    }

    protected void doSetRcvtagqty1_NotEqual(java.math.BigDecimal rcvtagqty1) {
        regRcvtagqty1(CK_NES, rcvtagqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1 The value of rcvtagqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagqty1_GreaterThan(java.math.BigDecimal rcvtagqty1) {
        regRcvtagqty1(CK_GT, rcvtagqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1 The value of rcvtagqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagqty1_LessThan(java.math.BigDecimal rcvtagqty1) {
        regRcvtagqty1(CK_LT, rcvtagqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1 The value of rcvtagqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagqty1_GreaterEqual(java.math.BigDecimal rcvtagqty1) {
        regRcvtagqty1(CK_GE, rcvtagqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1 The value of rcvtagqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagqty1_LessEqual(java.math.BigDecimal rcvtagqty1) {
        regRcvtagqty1(CK_LE, rcvtagqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of rcvtagqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvtagqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvtagqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvtagqty1(), "RCVTAGQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1List The collection of rcvtagqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtagqty1_InScope(Collection<java.math.BigDecimal> rcvtagqty1List) {
        doSetRcvtagqty1_InScope(rcvtagqty1List);
    }

    protected void doSetRcvtagqty1_InScope(Collection<java.math.BigDecimal> rcvtagqty1List) {
        regINS(CK_INS, cTL(rcvtagqty1List), xgetCValueRcvtagqty1(), "RCVTAGQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvtagqty1List The collection of rcvtagqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtagqty1_NotInScope(Collection<java.math.BigDecimal> rcvtagqty1List) {
        doSetRcvtagqty1_NotInScope(rcvtagqty1List);
    }

    protected void doSetRcvtagqty1_NotInScope(Collection<java.math.BigDecimal> rcvtagqty1List) {
        regINS(CK_NINS, cTL(rcvtagqty1List), xgetCValueRcvtagqty1(), "RCVTAGQTY1");
    }

    protected void regRcvtagqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvtagqty1(), "RCVTAGQTY1"); }
    protected abstract ConditionValue xgetCValueRcvtagqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1 The value of xdocfreeqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_Equal(java.math.BigDecimal xdocfreeqty1) {
        doSetXdocfreeqty1_Equal(xdocfreeqty1);
    }

    protected void doSetXdocfreeqty1_Equal(java.math.BigDecimal xdocfreeqty1) {
        regXdocfreeqty1(CK_EQ, xdocfreeqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1 The value of xdocfreeqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_NotEqual(java.math.BigDecimal xdocfreeqty1) {
        doSetXdocfreeqty1_NotEqual(xdocfreeqty1);
    }

    protected void doSetXdocfreeqty1_NotEqual(java.math.BigDecimal xdocfreeqty1) {
        regXdocfreeqty1(CK_NES, xdocfreeqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1 The value of xdocfreeqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_GreaterThan(java.math.BigDecimal xdocfreeqty1) {
        regXdocfreeqty1(CK_GT, xdocfreeqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1 The value of xdocfreeqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_LessThan(java.math.BigDecimal xdocfreeqty1) {
        regXdocfreeqty1(CK_LT, xdocfreeqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1 The value of xdocfreeqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_GreaterEqual(java.math.BigDecimal xdocfreeqty1) {
        regXdocfreeqty1(CK_GE, xdocfreeqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1 The value of xdocfreeqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_LessEqual(java.math.BigDecimal xdocfreeqty1) {
        regXdocfreeqty1(CK_LE, xdocfreeqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of xdocfreeqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of xdocfreeqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setXdocfreeqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueXdocfreeqty1(), "XDOCFREEQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1List The collection of xdocfreeqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_InScope(Collection<java.math.BigDecimal> xdocfreeqty1List) {
        doSetXdocfreeqty1_InScope(xdocfreeqty1List);
    }

    protected void doSetXdocfreeqty1_InScope(Collection<java.math.BigDecimal> xdocfreeqty1List) {
        regINS(CK_INS, cTL(xdocfreeqty1List), xgetCValueXdocfreeqty1(), "XDOCFREEQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param xdocfreeqty1List The collection of xdocfreeqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdocfreeqty1_NotInScope(Collection<java.math.BigDecimal> xdocfreeqty1List) {
        doSetXdocfreeqty1_NotInScope(xdocfreeqty1List);
    }

    protected void doSetXdocfreeqty1_NotInScope(Collection<java.math.BigDecimal> xdocfreeqty1List) {
        regINS(CK_NINS, cTL(xdocfreeqty1List), xgetCValueXdocfreeqty1(), "XDOCFREEQTY1");
    }

    protected void regXdocfreeqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueXdocfreeqty1(), "XDOCFREEQTY1"); }
    protected abstract ConditionValue xgetCValueXdocfreeqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_Equal(java.math.BigDecimal inspectedqty1) {
        doSetInspectedqty1_Equal(inspectedqty1);
    }

    protected void doSetInspectedqty1_Equal(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_EQ, inspectedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotEqual(java.math.BigDecimal inspectedqty1) {
        doSetInspectedqty1_NotEqual(inspectedqty1);
    }

    protected void doSetInspectedqty1_NotEqual(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_NES, inspectedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterThan(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_GT, inspectedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessThan(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_LT, inspectedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterEqual(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_GE, inspectedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessEqual(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_LE, inspectedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty1(), "INSPECTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_InScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        doSetInspectedqty1_InScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_InScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        regINS(CK_INS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotInScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        doSetInspectedqty1_NotInScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_NotInScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        regINS(CK_NINS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    protected void regInspectedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty1(), "INSPECTEDQTY1"); }
    protected abstract ConditionValue xgetCValueInspectedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_Equal(Long inspectedqty2) {
        doSetInspectedqty2_Equal(inspectedqty2);
    }

    protected void doSetInspectedqty2_Equal(Long inspectedqty2) {
        regInspectedqty2(CK_EQ, inspectedqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_NotEqual(Long inspectedqty2) {
        doSetInspectedqty2_NotEqual(inspectedqty2);
    }

    protected void doSetInspectedqty2_NotEqual(Long inspectedqty2) {
        regInspectedqty2(CK_NES, inspectedqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_GreaterThan(Long inspectedqty2) {
        regInspectedqty2(CK_GT, inspectedqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_LessThan(Long inspectedqty2) {
        regInspectedqty2(CK_LT, inspectedqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_GreaterEqual(Long inspectedqty2) {
        regInspectedqty2(CK_GE, inspectedqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_LessEqual(Long inspectedqty2) {
        regInspectedqty2(CK_LE, inspectedqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty2(), "INSPECTEDQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2List The collection of inspectedqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty2_InScope(Collection<Long> inspectedqty2List) {
        doSetInspectedqty2_InScope(inspectedqty2List);
    }

    protected void doSetInspectedqty2_InScope(Collection<Long> inspectedqty2List) {
        regINS(CK_INS, cTL(inspectedqty2List), xgetCValueInspectedqty2(), "INSPECTEDQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2List The collection of inspectedqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty2_NotInScope(Collection<Long> inspectedqty2List) {
        doSetInspectedqty2_NotInScope(inspectedqty2List);
    }

    protected void doSetInspectedqty2_NotInScope(Collection<Long> inspectedqty2List) {
        regINS(CK_NINS, cTL(inspectedqty2List), xgetCValueInspectedqty2(), "INSPECTEDQTY2");
    }

    protected void regInspectedqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty2(), "INSPECTEDQTY2"); }
    protected abstract ConditionValue xgetCValueInspectedqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_Equal(Long inspectedqty3) {
        doSetInspectedqty3_Equal(inspectedqty3);
    }

    protected void doSetInspectedqty3_Equal(Long inspectedqty3) {
        regInspectedqty3(CK_EQ, inspectedqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_NotEqual(Long inspectedqty3) {
        doSetInspectedqty3_NotEqual(inspectedqty3);
    }

    protected void doSetInspectedqty3_NotEqual(Long inspectedqty3) {
        regInspectedqty3(CK_NES, inspectedqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_GreaterThan(Long inspectedqty3) {
        regInspectedqty3(CK_GT, inspectedqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_LessThan(Long inspectedqty3) {
        regInspectedqty3(CK_LT, inspectedqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_GreaterEqual(Long inspectedqty3) {
        regInspectedqty3(CK_GE, inspectedqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_LessEqual(Long inspectedqty3) {
        regInspectedqty3(CK_LE, inspectedqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty3(), "INSPECTEDQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3List The collection of inspectedqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty3_InScope(Collection<Long> inspectedqty3List) {
        doSetInspectedqty3_InScope(inspectedqty3List);
    }

    protected void doSetInspectedqty3_InScope(Collection<Long> inspectedqty3List) {
        regINS(CK_INS, cTL(inspectedqty3List), xgetCValueInspectedqty3(), "INSPECTEDQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3List The collection of inspectedqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty3_NotInScope(Collection<Long> inspectedqty3List) {
        doSetInspectedqty3_NotInScope(inspectedqty3List);
    }

    protected void doSetInspectedqty3_NotInScope(Collection<Long> inspectedqty3List) {
        regINS(CK_NINS, cTL(inspectedqty3List), xgetCValueInspectedqty3(), "INSPECTEDQTY3");
    }

    protected void regInspectedqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty3(), "INSPECTEDQTY3"); }
    protected abstract ConditionValue xgetCValueInspectedqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_Equal(Long priceBuy) {
        doSetPriceBuy_Equal(priceBuy);
    }

    protected void doSetPriceBuy_Equal(Long priceBuy) {
        regPriceBuy(CK_EQ, priceBuy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_NotEqual(Long priceBuy) {
        doSetPriceBuy_NotEqual(priceBuy);
    }

    protected void doSetPriceBuy_NotEqual(Long priceBuy) {
        regPriceBuy(CK_NES, priceBuy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterThan(Long priceBuy) {
        regPriceBuy(CK_GT, priceBuy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_LessThan(Long priceBuy) {
        regPriceBuy(CK_LT, priceBuy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterEqual(Long priceBuy) {
        regPriceBuy(CK_GE, priceBuy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_LessEqual(Long priceBuy) {
        regPriceBuy(CK_LE, priceBuy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceBuy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceBuy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceBuy_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceBuy(), "PRICE_BUY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuyList The collection of priceBuy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_InScope(Collection<Long> priceBuyList) {
        doSetPriceBuy_InScope(priceBuyList);
    }

    protected void doSetPriceBuy_InScope(Collection<Long> priceBuyList) {
        regINS(CK_INS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuyList The collection of priceBuy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_NotInScope(Collection<Long> priceBuyList) {
        doSetPriceBuy_NotInScope(priceBuyList);
    }

    protected void doSetPriceBuy_NotInScope(Collection<Long> priceBuyList) {
        regINS(CK_NINS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    protected void regPriceBuy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceBuy(), "PRICE_BUY"); }
    protected abstract ConditionValue xgetCValuePriceBuy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_Equal(Long priceWholesale) {
        doSetPriceWholesale_Equal(priceWholesale);
    }

    protected void doSetPriceWholesale_Equal(Long priceWholesale) {
        regPriceWholesale(CK_EQ, priceWholesale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_NotEqual(Long priceWholesale) {
        doSetPriceWholesale_NotEqual(priceWholesale);
    }

    protected void doSetPriceWholesale_NotEqual(Long priceWholesale) {
        regPriceWholesale(CK_NES, priceWholesale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_GreaterThan(Long priceWholesale) {
        regPriceWholesale(CK_GT, priceWholesale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_LessThan(Long priceWholesale) {
        regPriceWholesale(CK_LT, priceWholesale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_GreaterEqual(Long priceWholesale) {
        regPriceWholesale(CK_GE, priceWholesale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_LessEqual(Long priceWholesale) {
        regPriceWholesale(CK_LE, priceWholesale);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceWholesale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceWholesale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceWholesale_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceWholesale(), "PRICE_WHOLESALE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesaleList The collection of priceWholesale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_InScope(Collection<Long> priceWholesaleList) {
        doSetPriceWholesale_InScope(priceWholesaleList);
    }

    protected void doSetPriceWholesale_InScope(Collection<Long> priceWholesaleList) {
        regINS(CK_INS, cTL(priceWholesaleList), xgetCValuePriceWholesale(), "PRICE_WHOLESALE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesaleList The collection of priceWholesale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_NotInScope(Collection<Long> priceWholesaleList) {
        doSetPriceWholesale_NotInScope(priceWholesaleList);
    }

    protected void doSetPriceWholesale_NotInScope(Collection<Long> priceWholesaleList) {
        regINS(CK_NINS, cTL(priceWholesaleList), xgetCValuePriceWholesale(), "PRICE_WHOLESALE");
    }

    protected void regPriceWholesale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceWholesale(), "PRICE_WHOLESALE"); }
    protected abstract ConditionValue xgetCValuePriceWholesale();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_Equal(Long priceSale) {
        doSetPriceSale_Equal(priceSale);
    }

    protected void doSetPriceSale_Equal(Long priceSale) {
        regPriceSale(CK_EQ, priceSale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_NotEqual(Long priceSale) {
        doSetPriceSale_NotEqual(priceSale);
    }

    protected void doSetPriceSale_NotEqual(Long priceSale) {
        regPriceSale(CK_NES, priceSale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_GreaterThan(Long priceSale) {
        regPriceSale(CK_GT, priceSale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_LessThan(Long priceSale) {
        regPriceSale(CK_LT, priceSale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_GreaterEqual(Long priceSale) {
        regPriceSale(CK_GE, priceSale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_LessEqual(Long priceSale) {
        regPriceSale(CK_LE, priceSale);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceSale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceSale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceSale_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceSale(), "PRICE_SALE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSaleList The collection of priceSale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_InScope(Collection<Long> priceSaleList) {
        doSetPriceSale_InScope(priceSaleList);
    }

    protected void doSetPriceSale_InScope(Collection<Long> priceSaleList) {
        regINS(CK_INS, cTL(priceSaleList), xgetCValuePriceSale(), "PRICE_SALE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSaleList The collection of priceSale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_NotInScope(Collection<Long> priceSaleList) {
        doSetPriceSale_NotInScope(priceSaleList);
    }

    protected void doSetPriceSale_NotInScope(Collection<Long> priceSaleList) {
        regINS(CK_NINS, cTL(priceSaleList), xgetCValuePriceSale(), "PRICE_SALE");
    }

    protected void regPriceSale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceSale(), "PRICE_SALE"); }
    protected abstract ConditionValue xgetCValuePriceSale();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
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
     * NOTES: {varchar(4000)}
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
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
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
     * NOTES: {varchar(4000)}
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
     * NOTES: {varchar(4000)} <br>
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
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_Equal(String icdate) {
        doSetIcdate_Equal(fRES(icdate));
    }

    protected void doSetIcdate_Equal(String icdate) {
        regIcdate(CK_EQ, icdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_NotEqual(String icdate) {
        doSetIcdate_NotEqual(fRES(icdate));
    }

    protected void doSetIcdate_NotEqual(String icdate) {
        regIcdate(CK_NES, icdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_GreaterThan(String icdate) {
        regIcdate(CK_GT, fRES(icdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_LessThan(String icdate) {
        regIcdate(CK_LT, fRES(icdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_GreaterEqual(String icdate) {
        regIcdate(CK_GE, fRES(icdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_LessEqual(String icdate) {
        regIcdate(CK_LE, fRES(icdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdateList The collection of icdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_InScope(Collection<String> icdateList) {
        doSetIcdate_InScope(icdateList);
    }

    protected void doSetIcdate_InScope(Collection<String> icdateList) {
        regINS(CK_INS, cTL(icdateList), xgetCValueIcdate(), "ICDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdateList The collection of icdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_NotInScope(Collection<String> icdateList) {
        doSetIcdate_NotInScope(icdateList);
    }

    protected void doSetIcdate_NotInScope(Collection<String> icdateList) {
        regINS(CK_NINS, cTL(icdateList), xgetCValueIcdate(), "ICDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ICDATE: {varchar(8)} <br>
     * <pre>e.g. setIcdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param icdate The value of icdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIcdate_LikeSearch(String icdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(icdate), xgetCValueIcdate(), "ICDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIcdate_NotLikeSearch(String icdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(icdate), xgetCValueIcdate(), "ICDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ICDATE: {varchar(8)}
     * @param icdate The value of icdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIcdate_PrefixSearch(String icdate) {
        setIcdate_LikeSearch(icdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     */
    public void setIcdate_IsNull() { regIcdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     */
    public void setIcdate_IsNullOrEmpty() { regIcdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ICDATE: {varchar(8)}
     */
    public void setIcdate_IsNotNull() { regIcdate(CK_ISNN, DOBJ); }

    protected void regIcdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIcdate(), "ICDATE"); }
    protected abstract ConditionValue xgetCValueIcdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkey The value of orderkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_Equal(java.math.BigDecimal orderkey) {
        doSetOrderkey_Equal(orderkey);
    }

    protected void doSetOrderkey_Equal(java.math.BigDecimal orderkey) {
        regOrderkey(CK_EQ, orderkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkey The value of orderkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_NotEqual(java.math.BigDecimal orderkey) {
        doSetOrderkey_NotEqual(orderkey);
    }

    protected void doSetOrderkey_NotEqual(java.math.BigDecimal orderkey) {
        regOrderkey(CK_NES, orderkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkey The value of orderkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_GreaterThan(java.math.BigDecimal orderkey) {
        regOrderkey(CK_GT, orderkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkey The value of orderkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_LessThan(java.math.BigDecimal orderkey) {
        regOrderkey(CK_LT, orderkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkey The value of orderkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_GreaterEqual(java.math.BigDecimal orderkey) {
        regOrderkey(CK_GE, orderkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkey The value of orderkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_LessEqual(java.math.BigDecimal orderkey) {
        regOrderkey(CK_LE, orderkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param minNumber The min number of orderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderkey(), "ORDERKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkeyList The collection of orderkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderkey_InScope(Collection<java.math.BigDecimal> orderkeyList) {
        doSetOrderkey_InScope(orderkeyList);
    }

    protected void doSetOrderkey_InScope(Collection<java.math.BigDecimal> orderkeyList) {
        regINS(CK_INS, cTL(orderkeyList), xgetCValueOrderkey(), "ORDERKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     * @param orderkeyList The collection of orderkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderkey_NotInScope(Collection<java.math.BigDecimal> orderkeyList) {
        doSetOrderkey_NotInScope(orderkeyList);
    }

    protected void doSetOrderkey_NotInScope(Collection<java.math.BigDecimal> orderkeyList) {
        regINS(CK_NINS, cTL(orderkeyList), xgetCValueOrderkey(), "ORDERKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     */
    public void setOrderkey_IsNull() { regOrderkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERKEY: {decimal(16, 6)}
     */
    public void setOrderkey_IsNotNull() { regOrderkey(CK_ISNN, DOBJ); }

    protected void regOrderkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderkey(), "ORDERKEY"); }
    protected abstract ConditionValue xgetCValueOrderkey();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_Equal(String ownerorderno) {
        doSetOwnerorderno_Equal(fRES(ownerorderno));
    }

    protected void doSetOwnerorderno_Equal(String ownerorderno) {
        regOwnerorderno(CK_EQ, ownerorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_NotEqual(String ownerorderno) {
        doSetOwnerorderno_NotEqual(fRES(ownerorderno));
    }

    protected void doSetOwnerorderno_NotEqual(String ownerorderno) {
        regOwnerorderno(CK_NES, ownerorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_GreaterThan(String ownerorderno) {
        regOwnerorderno(CK_GT, fRES(ownerorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_LessThan(String ownerorderno) {
        regOwnerorderno(CK_LT, fRES(ownerorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_GreaterEqual(String ownerorderno) {
        regOwnerorderno(CK_GE, fRES(ownerorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_LessEqual(String ownerorderno) {
        regOwnerorderno(CK_LE, fRES(ownerorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerordernoList The collection of ownerorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_InScope(Collection<String> ownerordernoList) {
        doSetOwnerorderno_InScope(ownerordernoList);
    }

    protected void doSetOwnerorderno_InScope(Collection<String> ownerordernoList) {
        regINS(CK_INS, cTL(ownerordernoList), xgetCValueOwnerorderno(), "OWNERORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerordernoList The collection of ownerorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_NotInScope(Collection<String> ownerordernoList) {
        doSetOwnerorderno_NotInScope(ownerordernoList);
    }

    protected void doSetOwnerorderno_NotInScope(Collection<String> ownerordernoList) {
        regINS(CK_NINS, cTL(ownerordernoList), xgetCValueOwnerorderno(), "OWNERORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)} <br>
     * <pre>e.g. setOwnerorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerorderno The value of ownerorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerorderno_LikeSearch(String ownerorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerorderno), xgetCValueOwnerorderno(), "OWNERORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerorderno_NotLikeSearch(String ownerorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerorderno), xgetCValueOwnerorderno(), "OWNERORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_PrefixSearch(String ownerorderno) {
        setOwnerorderno_LikeSearch(ownerorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     */
    public void setOwnerorderno_IsNull() { regOwnerorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     */
    public void setOwnerorderno_IsNullOrEmpty() { regOwnerorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     */
    public void setOwnerorderno_IsNotNull() { regOwnerorderno(CK_ISNN, DOBJ); }

    protected void regOwnerorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerorderno(), "OWNERORDERNO"); }
    protected abstract ConditionValue xgetCValueOwnerorderno();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_Equal(String custorderno) {
        doSetCustorderno_Equal(fRES(custorderno));
    }

    protected void doSetCustorderno_Equal(String custorderno) {
        regCustorderno(CK_EQ, custorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotEqual(String custorderno) {
        doSetCustorderno_NotEqual(fRES(custorderno));
    }

    protected void doSetCustorderno_NotEqual(String custorderno) {
        regCustorderno(CK_NES, custorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterThan(String custorderno) {
        regCustorderno(CK_GT, fRES(custorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessThan(String custorderno) {
        regCustorderno(CK_LT, fRES(custorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterEqual(String custorderno) {
        regCustorderno(CK_GE, fRES(custorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessEqual(String custorderno) {
        regCustorderno(CK_LE, fRES(custorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custordernoList The collection of custorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_InScope(Collection<String> custordernoList) {
        doSetCustorderno_InScope(custordernoList);
    }

    protected void doSetCustorderno_InScope(Collection<String> custordernoList) {
        regINS(CK_INS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custordernoList The collection of custorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotInScope(Collection<String> custordernoList) {
        doSetCustorderno_NotInScope(custordernoList);
    }

    protected void doSetCustorderno_NotInScope(Collection<String> custordernoList) {
        regINS(CK_NINS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)} <br>
     * <pre>e.g. setCustorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param custorderno The value of custorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustorderno_LikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustorderno_NotLikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_PrefixSearch(String custorderno) {
        setCustorderno_LikeSearch(custorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     */
    public void setCustorderno_IsNull() { regCustorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     */
    public void setCustorderno_IsNullOrEmpty() { regCustorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     */
    public void setCustorderno_IsNotNull() { regCustorderno(CK_ISNN, DOBJ); }

    protected void regCustorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustorderno(), "CUSTORDERNO"); }
    protected abstract ConditionValue xgetCValueCustorderno();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_Equal(String ordertype) {
        doSetOrdertype_Equal(fRES(ordertype));
    }

    protected void doSetOrdertype_Equal(String ordertype) {
        regOrdertype(CK_EQ, ordertype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotEqual(String ordertype) {
        doSetOrdertype_NotEqual(fRES(ordertype));
    }

    protected void doSetOrdertype_NotEqual(String ordertype) {
        regOrdertype(CK_NES, ordertype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterThan(String ordertype) {
        regOrdertype(CK_GT, fRES(ordertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessThan(String ordertype) {
        regOrdertype(CK_LT, fRES(ordertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterEqual(String ordertype) {
        regOrdertype(CK_GE, fRES(ordertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessEqual(String ordertype) {
        regOrdertype(CK_LE, fRES(ordertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertypeList The collection of ordertype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_InScope(Collection<String> ordertypeList) {
        doSetOrdertype_InScope(ordertypeList);
    }

    protected void doSetOrdertype_InScope(Collection<String> ordertypeList) {
        regINS(CK_INS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertypeList The collection of ordertype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotInScope(Collection<String> ordertypeList) {
        doSetOrdertype_NotInScope(ordertypeList);
    }

    protected void doSetOrdertype_NotInScope(Collection<String> ordertypeList) {
        regINS(CK_NINS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)} <br>
     * <pre>e.g. setOrdertype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordertype The value of ordertype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdertype_LikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdertype_NotLikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_PrefixSearch(String ordertype) {
        setOrdertype_LikeSearch(ordertype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNull() { regOrdertype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNullOrEmpty() { regOrdertype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNotNull() { regOrdertype(CK_ISNN, DOBJ); }

    protected void regOrdertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdertype(), "ORDERTYPE"); }
    protected abstract ConditionValue xgetCValueOrdertype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflg The value of rcvqtyerrorflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_Equal(java.math.BigDecimal rcvqtyerrorflg) {
        doSetRcvqtyerrorflg_Equal(rcvqtyerrorflg);
    }

    protected void doSetRcvqtyerrorflg_Equal(java.math.BigDecimal rcvqtyerrorflg) {
        regRcvqtyerrorflg(CK_EQ, rcvqtyerrorflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflg The value of rcvqtyerrorflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_NotEqual(java.math.BigDecimal rcvqtyerrorflg) {
        doSetRcvqtyerrorflg_NotEqual(rcvqtyerrorflg);
    }

    protected void doSetRcvqtyerrorflg_NotEqual(java.math.BigDecimal rcvqtyerrorflg) {
        regRcvqtyerrorflg(CK_NES, rcvqtyerrorflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflg The value of rcvqtyerrorflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_GreaterThan(java.math.BigDecimal rcvqtyerrorflg) {
        regRcvqtyerrorflg(CK_GT, rcvqtyerrorflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflg The value of rcvqtyerrorflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_LessThan(java.math.BigDecimal rcvqtyerrorflg) {
        regRcvqtyerrorflg(CK_LT, rcvqtyerrorflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflg The value of rcvqtyerrorflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_GreaterEqual(java.math.BigDecimal rcvqtyerrorflg) {
        regRcvqtyerrorflg(CK_GE, rcvqtyerrorflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflg The value of rcvqtyerrorflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_LessEqual(java.math.BigDecimal rcvqtyerrorflg) {
        regRcvqtyerrorflg(CK_LE, rcvqtyerrorflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of rcvqtyerrorflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvqtyerrorflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvqtyerrorflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvqtyerrorflg(), "RCVQTYERRORFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflgList The collection of rcvqtyerrorflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_InScope(Collection<java.math.BigDecimal> rcvqtyerrorflgList) {
        doSetRcvqtyerrorflg_InScope(rcvqtyerrorflgList);
    }

    protected void doSetRcvqtyerrorflg_InScope(Collection<java.math.BigDecimal> rcvqtyerrorflgList) {
        regINS(CK_INS, cTL(rcvqtyerrorflgList), xgetCValueRcvqtyerrorflg(), "RCVQTYERRORFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param rcvqtyerrorflgList The collection of rcvqtyerrorflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqtyerrorflg_NotInScope(Collection<java.math.BigDecimal> rcvqtyerrorflgList) {
        doSetRcvqtyerrorflg_NotInScope(rcvqtyerrorflgList);
    }

    protected void doSetRcvqtyerrorflg_NotInScope(Collection<java.math.BigDecimal> rcvqtyerrorflgList) {
        regINS(CK_NINS, cTL(rcvqtyerrorflgList), xgetCValueRcvqtyerrorflg(), "RCVQTYERRORFLG");
    }

    protected void regRcvqtyerrorflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvqtyerrorflg(), "RCVQTYERRORFLG"); }
    protected abstract ConditionValue xgetCValueRcvqtyerrorflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg1_Equal(java.math.BigDecimal logicflg1) {
        doSetLogicflg1_Equal(logicflg1);
    }

    protected void doSetLogicflg1_Equal(java.math.BigDecimal logicflg1) {
        regLogicflg1(CK_EQ, logicflg1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg1_NotEqual(java.math.BigDecimal logicflg1) {
        doSetLogicflg1_NotEqual(logicflg1);
    }

    protected void doSetLogicflg1_NotEqual(java.math.BigDecimal logicflg1) {
        regLogicflg1(CK_NES, logicflg1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterThan(java.math.BigDecimal logicflg1) {
        regLogicflg1(CK_GT, logicflg1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg1_LessThan(java.math.BigDecimal logicflg1) {
        regLogicflg1(CK_LT, logicflg1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterEqual(java.math.BigDecimal logicflg1) {
        regLogicflg1(CK_GE, logicflg1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1 The value of logicflg1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg1_LessEqual(java.math.BigDecimal logicflg1) {
        regLogicflg1(CK_LE, logicflg1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of logicflg1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logicflg1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogicflg1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogicflg1(), "LOGICFLG1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1List The collection of logicflg1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_InScope(Collection<java.math.BigDecimal> logicflg1List) {
        doSetLogicflg1_InScope(logicflg1List);
    }

    protected void doSetLogicflg1_InScope(Collection<java.math.BigDecimal> logicflg1List) {
        regINS(CK_INS, cTL(logicflg1List), xgetCValueLogicflg1(), "LOGICFLG1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg1List The collection of logicflg1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotInScope(Collection<java.math.BigDecimal> logicflg1List) {
        doSetLogicflg1_NotInScope(logicflg1List);
    }

    protected void doSetLogicflg1_NotInScope(Collection<java.math.BigDecimal> logicflg1List) {
        regINS(CK_NINS, cTL(logicflg1List), xgetCValueLogicflg1(), "LOGICFLG1");
    }

    protected void regLogicflg1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg1(), "LOGICFLG1"); }
    protected abstract ConditionValue xgetCValueLogicflg1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg2_Equal(java.math.BigDecimal logicflg2) {
        doSetLogicflg2_Equal(logicflg2);
    }

    protected void doSetLogicflg2_Equal(java.math.BigDecimal logicflg2) {
        regLogicflg2(CK_EQ, logicflg2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg2_NotEqual(java.math.BigDecimal logicflg2) {
        doSetLogicflg2_NotEqual(logicflg2);
    }

    protected void doSetLogicflg2_NotEqual(java.math.BigDecimal logicflg2) {
        regLogicflg2(CK_NES, logicflg2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterThan(java.math.BigDecimal logicflg2) {
        regLogicflg2(CK_GT, logicflg2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg2_LessThan(java.math.BigDecimal logicflg2) {
        regLogicflg2(CK_LT, logicflg2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterEqual(java.math.BigDecimal logicflg2) {
        regLogicflg2(CK_GE, logicflg2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2 The value of logicflg2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg2_LessEqual(java.math.BigDecimal logicflg2) {
        regLogicflg2(CK_LE, logicflg2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of logicflg2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logicflg2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogicflg2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogicflg2(), "LOGICFLG2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2List The collection of logicflg2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_InScope(Collection<java.math.BigDecimal> logicflg2List) {
        doSetLogicflg2_InScope(logicflg2List);
    }

    protected void doSetLogicflg2_InScope(Collection<java.math.BigDecimal> logicflg2List) {
        regINS(CK_INS, cTL(logicflg2List), xgetCValueLogicflg2(), "LOGICFLG2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg2List The collection of logicflg2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotInScope(Collection<java.math.BigDecimal> logicflg2List) {
        doSetLogicflg2_NotInScope(logicflg2List);
    }

    protected void doSetLogicflg2_NotInScope(Collection<java.math.BigDecimal> logicflg2List) {
        regINS(CK_NINS, cTL(logicflg2List), xgetCValueLogicflg2(), "LOGICFLG2");
    }

    protected void regLogicflg2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg2(), "LOGICFLG2"); }
    protected abstract ConditionValue xgetCValueLogicflg2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg3_Equal(java.math.BigDecimal logicflg3) {
        doSetLogicflg3_Equal(logicflg3);
    }

    protected void doSetLogicflg3_Equal(java.math.BigDecimal logicflg3) {
        regLogicflg3(CK_EQ, logicflg3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg3_NotEqual(java.math.BigDecimal logicflg3) {
        doSetLogicflg3_NotEqual(logicflg3);
    }

    protected void doSetLogicflg3_NotEqual(java.math.BigDecimal logicflg3) {
        regLogicflg3(CK_NES, logicflg3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg3_GreaterThan(java.math.BigDecimal logicflg3) {
        regLogicflg3(CK_GT, logicflg3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg3_LessThan(java.math.BigDecimal logicflg3) {
        regLogicflg3(CK_LT, logicflg3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg3_GreaterEqual(java.math.BigDecimal logicflg3) {
        regLogicflg3(CK_GE, logicflg3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3 The value of logicflg3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogicflg3_LessEqual(java.math.BigDecimal logicflg3) {
        regLogicflg3(CK_LE, logicflg3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of logicflg3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logicflg3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogicflg3_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogicflg3(), "LOGICFLG3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3List The collection of logicflg3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_InScope(Collection<java.math.BigDecimal> logicflg3List) {
        doSetLogicflg3_InScope(logicflg3List);
    }

    protected void doSetLogicflg3_InScope(Collection<java.math.BigDecimal> logicflg3List) {
        regINS(CK_INS, cTL(logicflg3List), xgetCValueLogicflg3(), "LOGICFLG3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param logicflg3List The collection of logicflg3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_NotInScope(Collection<java.math.BigDecimal> logicflg3List) {
        doSetLogicflg3_NotInScope(logicflg3List);
    }

    protected void doSetLogicflg3_NotInScope(Collection<java.math.BigDecimal> logicflg3List) {
        regINS(CK_NINS, cTL(logicflg3List), xgetCValueLogicflg3(), "LOGICFLG3");
    }

    protected void regLogicflg3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg3(), "LOGICFLG3"); }
    protected abstract ConditionValue xgetCValueLogicflg3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelineno The value of movelineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovelineno_Equal(Long movelineno) {
        doSetMovelineno_Equal(movelineno);
    }

    protected void doSetMovelineno_Equal(Long movelineno) {
        regMovelineno(CK_EQ, movelineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelineno The value of movelineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovelineno_NotEqual(Long movelineno) {
        doSetMovelineno_NotEqual(movelineno);
    }

    protected void doSetMovelineno_NotEqual(Long movelineno) {
        regMovelineno(CK_NES, movelineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelineno The value of movelineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovelineno_GreaterThan(Long movelineno) {
        regMovelineno(CK_GT, movelineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelineno The value of movelineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovelineno_LessThan(Long movelineno) {
        regMovelineno(CK_LT, movelineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelineno The value of movelineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovelineno_GreaterEqual(Long movelineno) {
        regMovelineno(CK_GE, movelineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelineno The value of movelineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovelineno_LessEqual(Long movelineno) {
        regMovelineno(CK_LE, movelineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param minNumber The min number of movelineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of movelineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMovelineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMovelineno(), "MOVELINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelinenoList The collection of movelineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovelineno_InScope(Collection<Long> movelinenoList) {
        doSetMovelineno_InScope(movelinenoList);
    }

    protected void doSetMovelineno_InScope(Collection<Long> movelinenoList) {
        regINS(CK_INS, cTL(movelinenoList), xgetCValueMovelineno(), "MOVELINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVELINENO: {bigint(19)}
     * @param movelinenoList The collection of movelineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovelineno_NotInScope(Collection<Long> movelinenoList) {
        doSetMovelineno_NotInScope(movelinenoList);
    }

    protected void doSetMovelineno_NotInScope(Collection<Long> movelinenoList) {
        regINS(CK_NINS, cTL(movelinenoList), xgetCValueMovelineno(), "MOVELINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     */
    public void setMovelineno_IsNull() { regMovelineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVELINENO: {bigint(19)}
     */
    public void setMovelineno_IsNotNull() { regMovelineno(CK_ISNN, DOBJ); }

    protected void regMovelineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMovelineno(), "MOVELINENO"); }
    protected abstract ConditionValue xgetCValueMovelineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylineno The value of assylineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssylineno_Equal(Long assylineno) {
        doSetAssylineno_Equal(assylineno);
    }

    protected void doSetAssylineno_Equal(Long assylineno) {
        regAssylineno(CK_EQ, assylineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylineno The value of assylineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssylineno_NotEqual(Long assylineno) {
        doSetAssylineno_NotEqual(assylineno);
    }

    protected void doSetAssylineno_NotEqual(Long assylineno) {
        regAssylineno(CK_NES, assylineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylineno The value of assylineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssylineno_GreaterThan(Long assylineno) {
        regAssylineno(CK_GT, assylineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylineno The value of assylineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssylineno_LessThan(Long assylineno) {
        regAssylineno(CK_LT, assylineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylineno The value of assylineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssylineno_GreaterEqual(Long assylineno) {
        regAssylineno(CK_GE, assylineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylineno The value of assylineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssylineno_LessEqual(Long assylineno) {
        regAssylineno(CK_LE, assylineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param minNumber The min number of assylineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assylineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssylineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssylineno(), "ASSYLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylinenoList The collection of assylineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssylineno_InScope(Collection<Long> assylinenoList) {
        doSetAssylineno_InScope(assylinenoList);
    }

    protected void doSetAssylineno_InScope(Collection<Long> assylinenoList) {
        regINS(CK_INS, cTL(assylinenoList), xgetCValueAssylineno(), "ASSYLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     * @param assylinenoList The collection of assylineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssylineno_NotInScope(Collection<Long> assylinenoList) {
        doSetAssylineno_NotInScope(assylinenoList);
    }

    protected void doSetAssylineno_NotInScope(Collection<Long> assylinenoList) {
        regINS(CK_NINS, cTL(assylinenoList), xgetCValueAssylineno(), "ASSYLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     */
    public void setAssylineno_IsNull() { regAssylineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSYLINENO: {bigint(19)}
     */
    public void setAssylineno_IsNotNull() { regAssylineno(CK_ISNN, DOBJ); }

    protected void regAssylineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssylineno(), "ASSYLINENO"); }
    protected abstract ConditionValue xgetCValueAssylineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelineno The value of producelineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducelineno_Equal(Long producelineno) {
        doSetProducelineno_Equal(producelineno);
    }

    protected void doSetProducelineno_Equal(Long producelineno) {
        regProducelineno(CK_EQ, producelineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelineno The value of producelineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducelineno_NotEqual(Long producelineno) {
        doSetProducelineno_NotEqual(producelineno);
    }

    protected void doSetProducelineno_NotEqual(Long producelineno) {
        regProducelineno(CK_NES, producelineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelineno The value of producelineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducelineno_GreaterThan(Long producelineno) {
        regProducelineno(CK_GT, producelineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelineno The value of producelineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducelineno_LessThan(Long producelineno) {
        regProducelineno(CK_LT, producelineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelineno The value of producelineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducelineno_GreaterEqual(Long producelineno) {
        regProducelineno(CK_GE, producelineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelineno The value of producelineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducelineno_LessEqual(Long producelineno) {
        regProducelineno(CK_LE, producelineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param minNumber The min number of producelineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of producelineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProducelineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProducelineno(), "PRODUCELINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelinenoList The collection of producelineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProducelineno_InScope(Collection<Long> producelinenoList) {
        doSetProducelineno_InScope(producelinenoList);
    }

    protected void doSetProducelineno_InScope(Collection<Long> producelinenoList) {
        regINS(CK_INS, cTL(producelinenoList), xgetCValueProducelineno(), "PRODUCELINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     * @param producelinenoList The collection of producelineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProducelineno_NotInScope(Collection<Long> producelinenoList) {
        doSetProducelineno_NotInScope(producelinenoList);
    }

    protected void doSetProducelineno_NotInScope(Collection<Long> producelinenoList) {
        regINS(CK_NINS, cTL(producelinenoList), xgetCValueProducelineno(), "PRODUCELINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     */
    public void setProducelineno_IsNull() { regProducelineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCELINENO: {bigint(19)}
     */
    public void setProducelineno_IsNotNull() { regProducelineno(CK_ISNN, DOBJ); }

    protected void regProducelineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProducelineno(), "PRODUCELINENO"); }
    protected abstract ConditionValue xgetCValueProducelineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflg The value of checklastlotflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecklastlotflg_Equal(java.math.BigDecimal checklastlotflg) {
        doSetChecklastlotflg_Equal(checklastlotflg);
    }

    protected void doSetChecklastlotflg_Equal(java.math.BigDecimal checklastlotflg) {
        regChecklastlotflg(CK_EQ, checklastlotflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflg The value of checklastlotflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecklastlotflg_NotEqual(java.math.BigDecimal checklastlotflg) {
        doSetChecklastlotflg_NotEqual(checklastlotflg);
    }

    protected void doSetChecklastlotflg_NotEqual(java.math.BigDecimal checklastlotflg) {
        regChecklastlotflg(CK_NES, checklastlotflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflg The value of checklastlotflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecklastlotflg_GreaterThan(java.math.BigDecimal checklastlotflg) {
        regChecklastlotflg(CK_GT, checklastlotflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflg The value of checklastlotflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecklastlotflg_LessThan(java.math.BigDecimal checklastlotflg) {
        regChecklastlotflg(CK_LT, checklastlotflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflg The value of checklastlotflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecklastlotflg_GreaterEqual(java.math.BigDecimal checklastlotflg) {
        regChecklastlotflg(CK_GE, checklastlotflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflg The value of checklastlotflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecklastlotflg_LessEqual(java.math.BigDecimal checklastlotflg) {
        regChecklastlotflg(CK_LE, checklastlotflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of checklastlotflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of checklastlotflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChecklastlotflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChecklastlotflg(), "CHECKLASTLOTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflgList The collection of checklastlotflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChecklastlotflg_InScope(Collection<java.math.BigDecimal> checklastlotflgList) {
        doSetChecklastlotflg_InScope(checklastlotflgList);
    }

    protected void doSetChecklastlotflg_InScope(Collection<java.math.BigDecimal> checklastlotflgList) {
        regINS(CK_INS, cTL(checklastlotflgList), xgetCValueChecklastlotflg(), "CHECKLASTLOTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param checklastlotflgList The collection of checklastlotflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChecklastlotflg_NotInScope(Collection<java.math.BigDecimal> checklastlotflgList) {
        doSetChecklastlotflg_NotInScope(checklastlotflgList);
    }

    protected void doSetChecklastlotflg_NotInScope(Collection<java.math.BigDecimal> checklastlotflgList) {
        regINS(CK_NINS, cTL(checklastlotflgList), xgetCValueChecklastlotflg(), "CHECKLASTLOTFLG");
    }

    protected void regChecklastlotflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChecklastlotflg(), "CHECKLASTLOTFLG"); }
    protected abstract ConditionValue xgetCValueChecklastlotflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
    public HpSLCFunction<TTrsreplandetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsreplandetailCB.class);
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
    public HpSLCFunction<TTrsreplandetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsreplandetailCB.class);
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
    public HpSLCFunction<TTrsreplandetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsreplandetailCB.class);
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
    public HpSLCFunction<TTrsreplandetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsreplandetailCB.class);
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
    public HpSLCFunction<TTrsreplandetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsreplandetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsreplandetailCB&gt;() {
     *     public void query(TTrsreplandetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsreplandetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsreplandetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsreplandetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsreplandetailCQ sq);

    protected TTrsreplandetailCB xcreateScalarConditionCB() {
        TTrsreplandetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsreplandetailCB xcreateScalarConditionPartitionByCB() {
        TTrsreplandetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsreplandetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsreplandetailCB cb = new TTrsreplandetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSREPLANDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsreplandetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsreplandetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsreplandetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsreplandetailCB cb = new TTrsreplandetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSREPLANDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsreplandetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsreplandetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsreplandetailCB cb = new TTrsreplandetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsreplandetailCQ sq);

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
    protected TTrsreplandetailCB newMyCB() {
        return new TTrsreplandetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsreplandetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

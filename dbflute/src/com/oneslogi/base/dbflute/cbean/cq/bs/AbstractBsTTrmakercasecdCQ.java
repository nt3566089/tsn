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
 * The abstract condition-query of T_TRMAKERCASECD.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrmakercasecdCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrmakercasecdCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRMAKERCASECD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdId The value of trmakercasecdId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_Equal(Long trmakercasecdId) {
        doSetTrmakercasecdId_Equal(trmakercasecdId);
    }

    protected void doSetTrmakercasecdId_Equal(Long trmakercasecdId) {
        regTrmakercasecdId(CK_EQ, trmakercasecdId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdId The value of trmakercasecdId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_NotEqual(Long trmakercasecdId) {
        doSetTrmakercasecdId_NotEqual(trmakercasecdId);
    }

    protected void doSetTrmakercasecdId_NotEqual(Long trmakercasecdId) {
        regTrmakercasecdId(CK_NES, trmakercasecdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdId The value of trmakercasecdId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_GreaterThan(Long trmakercasecdId) {
        regTrmakercasecdId(CK_GT, trmakercasecdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdId The value of trmakercasecdId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_LessThan(Long trmakercasecdId) {
        regTrmakercasecdId(CK_LT, trmakercasecdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdId The value of trmakercasecdId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_GreaterEqual(Long trmakercasecdId) {
        regTrmakercasecdId(CK_GE, trmakercasecdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdId The value of trmakercasecdId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_LessEqual(Long trmakercasecdId) {
        regTrmakercasecdId(CK_LE, trmakercasecdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trmakercasecdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trmakercasecdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrmakercasecdId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrmakercasecdId(), "TRMAKERCASECD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdIdList The collection of trmakercasecdId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_InScope(Collection<Long> trmakercasecdIdList) {
        doSetTrmakercasecdId_InScope(trmakercasecdIdList);
    }

    protected void doSetTrmakercasecdId_InScope(Collection<Long> trmakercasecdIdList) {
        regINS(CK_INS, cTL(trmakercasecdIdList), xgetCValueTrmakercasecdId(), "TRMAKERCASECD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmakercasecdIdList The collection of trmakercasecdId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrmakercasecdId_NotInScope(Collection<Long> trmakercasecdIdList) {
        doSetTrmakercasecdId_NotInScope(trmakercasecdIdList);
    }

    protected void doSetTrmakercasecdId_NotInScope(Collection<Long> trmakercasecdIdList) {
        regINS(CK_NINS, cTL(trmakercasecdIdList), xgetCValueTrmakercasecdId(), "TRMAKERCASECD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrmakercasecdId_IsNull() { regTrmakercasecdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrmakercasecdId_IsNotNull() { regTrmakercasecdId(CK_ISNN, DOBJ); }

    protected void regTrmakercasecdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrmakercasecdId(), "TRMAKERCASECD_ID"); }
    protected abstract ConditionValue xgetCValueTrmakercasecdId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_Equal(Long seqno) {
        doSetSeqno_Equal(seqno);
    }

    protected void doSetSeqno_Equal(Long seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_NotEqual(Long seqno) {
        doSetSeqno_NotEqual(seqno);
    }

    protected void doSetSeqno_NotEqual(Long seqno) {
        regSeqno(CK_NES, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterThan(Long seqno) {
        regSeqno(CK_GT, seqno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessThan(Long seqno) {
        regSeqno(CK_LT, seqno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterEqual(Long seqno) {
        regSeqno(CK_GE, seqno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessEqual(Long seqno) {
        regSeqno(CK_LE, seqno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param minNumber The min number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqno(), "SEQNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqnoList The collection of seqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_InScope(Collection<Long> seqnoList) {
        doSetSeqno_InScope(seqnoList);
    }

    protected void doSetSeqno_InScope(Collection<Long> seqnoList) {
        regINS(CK_INS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqnoList The collection of seqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotInScope(Collection<Long> seqnoList) {
        doSetSeqno_NotInScope(seqnoList);
    }

    protected void doSetSeqno_NotInScope(Collection<Long> seqnoList) {
        regINS(CK_NINS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     */
    public void setSeqno_IsNull() { regSeqno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     */
    public void setSeqno_IsNotNull() { regSeqno(CK_ISNN, DOBJ); }

    protected void regSeqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqno(), "SEQNO"); }
    protected abstract ConditionValue xgetCValueSeqno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_Equal(Long receivePlanHId) {
        doSetReceivePlanHId_Equal(receivePlanHId);
    }

    protected void doSetReceivePlanHId_Equal(Long receivePlanHId) {
        regReceivePlanHId(CK_EQ, receivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotEqual(Long receivePlanHId) {
        doSetReceivePlanHId_NotEqual(receivePlanHId);
    }

    protected void doSetReceivePlanHId_NotEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_NES, receivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_InScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_INS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     */
    public void setReceivePlanHId_IsNull() { regReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     */
    public void setReceivePlanHId_IsNotNull() { regReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_Equal(String senderLocation) {
        doSetSenderLocation_Equal(fRES(senderLocation));
    }

    protected void doSetSenderLocation_Equal(String senderLocation) {
        regSenderLocation(CK_EQ, senderLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotEqual(String senderLocation) {
        doSetSenderLocation_NotEqual(fRES(senderLocation));
    }

    protected void doSetSenderLocation_NotEqual(String senderLocation) {
        regSenderLocation(CK_NES, senderLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterThan(String senderLocation) {
        regSenderLocation(CK_GT, fRES(senderLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessThan(String senderLocation) {
        regSenderLocation(CK_LT, fRES(senderLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterEqual(String senderLocation) {
        regSenderLocation(CK_GE, fRES(senderLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessEqual(String senderLocation) {
        regSenderLocation(CK_LE, fRES(senderLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocationList The collection of senderLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_InScope(Collection<String> senderLocationList) {
        doSetSenderLocation_InScope(senderLocationList);
    }

    protected void doSetSenderLocation_InScope(Collection<String> senderLocationList) {
        regINS(CK_INS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocationList The collection of senderLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotInScope(Collection<String> senderLocationList) {
        doSetSenderLocation_NotInScope(senderLocationList);
    }

    protected void doSetSenderLocation_NotInScope(Collection<String> senderLocationList) {
        regINS(CK_NINS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)} <br>
     * <pre>e.g. setSenderLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param senderLocation The value of senderLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSenderLocation_LikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSenderLocation_NotLikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_PrefixSearch(String senderLocation) {
        setSenderLocation_LikeSearch(senderLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNull() { regSenderLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNullOrEmpty() { regSenderLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNotNull() { regSenderLocation(CK_ISNN, DOBJ); }

    protected void regSenderLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSenderLocation(), "SENDER_LOCATION"); }
    protected abstract ConditionValue xgetCValueSenderLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_Equal(String receiverLocation) {
        doSetReceiverLocation_Equal(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_Equal(String receiverLocation) {
        regReceiverLocation(CK_EQ, receiverLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotEqual(String receiverLocation) {
        doSetReceiverLocation_NotEqual(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_NotEqual(String receiverLocation) {
        regReceiverLocation(CK_NES, receiverLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterThan(String receiverLocation) {
        regReceiverLocation(CK_GT, fRES(receiverLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessThan(String receiverLocation) {
        regReceiverLocation(CK_LT, fRES(receiverLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterEqual(String receiverLocation) {
        regReceiverLocation(CK_GE, fRES(receiverLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessEqual(String receiverLocation) {
        regReceiverLocation(CK_LE, fRES(receiverLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocationList The collection of receiverLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_InScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_InScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_InScope(Collection<String> receiverLocationList) {
        regINS(CK_INS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocationList The collection of receiverLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_NotInScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        regINS(CK_NINS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)} <br>
     * <pre>e.g. setReceiverLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiverLocation The value of receiverLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiverLocation_LikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiverLocation_NotLikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_PrefixSearch(String receiverLocation) {
        setReceiverLocation_LikeSearch(receiverLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNull() { regReceiverLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNullOrEmpty() { regReceiverLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNotNull() { regReceiverLocation(CK_ISNN, DOBJ); }

    protected void regReceiverLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiverLocation(), "RECEIVER_LOCATION"); }
    protected abstract ConditionValue xgetCValueReceiverLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_Equal(String shipmentId) {
        doSetShipmentId_Equal(fRES(shipmentId));
    }

    protected void doSetShipmentId_Equal(String shipmentId) {
        regShipmentId(CK_EQ, shipmentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotEqual(String shipmentId) {
        doSetShipmentId_NotEqual(fRES(shipmentId));
    }

    protected void doSetShipmentId_NotEqual(String shipmentId) {
        regShipmentId(CK_NES, shipmentId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterThan(String shipmentId) {
        regShipmentId(CK_GT, fRES(shipmentId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessThan(String shipmentId) {
        regShipmentId(CK_LT, fRES(shipmentId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterEqual(String shipmentId) {
        regShipmentId(CK_GE, fRES(shipmentId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessEqual(String shipmentId) {
        regShipmentId(CK_LE, fRES(shipmentId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentIdList The collection of shipmentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_InScope(Collection<String> shipmentIdList) {
        doSetShipmentId_InScope(shipmentIdList);
    }

    protected void doSetShipmentId_InScope(Collection<String> shipmentIdList) {
        regINS(CK_INS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentIdList The collection of shipmentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotInScope(Collection<String> shipmentIdList) {
        doSetShipmentId_NotInScope(shipmentIdList);
    }

    protected void doSetShipmentId_NotInScope(Collection<String> shipmentIdList) {
        regINS(CK_NINS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)} <br>
     * <pre>e.g. setShipmentId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentId The value of shipmentId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentId_LikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentId_NotLikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_PrefixSearch(String shipmentId) {
        setShipmentId_LikeSearch(shipmentId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNull() { regShipmentId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNullOrEmpty() { regShipmentId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNotNull() { regShipmentId(CK_ISNN, DOBJ); }

    protected void regShipmentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentId(), "SHIPMENT_ID"); }
    protected abstract ConditionValue xgetCValueShipmentId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_Equal(String shipmentDate) {
        doSetShipmentDate_Equal(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_Equal(String shipmentDate) {
        regShipmentDate(CK_EQ, shipmentDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotEqual(String shipmentDate) {
        doSetShipmentDate_NotEqual(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_NotEqual(String shipmentDate) {
        regShipmentDate(CK_NES, shipmentDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterThan(String shipmentDate) {
        regShipmentDate(CK_GT, fRES(shipmentDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessThan(String shipmentDate) {
        regShipmentDate(CK_LT, fRES(shipmentDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterEqual(String shipmentDate) {
        regShipmentDate(CK_GE, fRES(shipmentDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessEqual(String shipmentDate) {
        regShipmentDate(CK_LE, fRES(shipmentDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDateList The collection of shipmentDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_InScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_InScope(shipmentDateList);
    }

    protected void doSetShipmentDate_InScope(Collection<String> shipmentDateList) {
        regINS(CK_INS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDateList The collection of shipmentDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_NotInScope(shipmentDateList);
    }

    protected void doSetShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        regINS(CK_NINS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)} <br>
     * <pre>e.g. setShipmentDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentDate The value of shipmentDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentDate_LikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentDate_NotLikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_PrefixSearch(String shipmentDate) {
        setShipmentDate_LikeSearch(shipmentDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNull() { regShipmentDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNullOrEmpty() { regShipmentDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNotNull() { regShipmentDate(CK_ISNN, DOBJ); }

    protected void regShipmentDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentDate(), "SHIPMENT_DATE"); }
    protected abstract ConditionValue xgetCValueShipmentDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_Equal(String carrierwbno) {
        doSetCarrierwbno_Equal(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_Equal(String carrierwbno) {
        regCarrierwbno(CK_EQ, carrierwbno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotEqual(String carrierwbno) {
        doSetCarrierwbno_NotEqual(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_NotEqual(String carrierwbno) {
        regCarrierwbno(CK_NES, carrierwbno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterThan(String carrierwbno) {
        regCarrierwbno(CK_GT, fRES(carrierwbno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessThan(String carrierwbno) {
        regCarrierwbno(CK_LT, fRES(carrierwbno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterEqual(String carrierwbno) {
        regCarrierwbno(CK_GE, fRES(carrierwbno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessEqual(String carrierwbno) {
        regCarrierwbno(CK_LE, fRES(carrierwbno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbnoList The collection of carrierwbno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_InScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        regINS(CK_INS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbnoList The collection of carrierwbno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_NotInScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        regINS(CK_NINS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(30)} <br>
     * <pre>e.g. setCarrierwbno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierwbno The value of carrierwbno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierwbno_LikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierwbno_NotLikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     * @param carrierwbno The value of carrierwbno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_PrefixSearch(String carrierwbno) {
        setCarrierwbno_LikeSearch(carrierwbno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     */
    public void setCarrierwbno_IsNull() { regCarrierwbno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     */
    public void setCarrierwbno_IsNullOrEmpty() { regCarrierwbno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(30)}
     */
    public void setCarrierwbno_IsNotNull() { regCarrierwbno(CK_ISNN, DOBJ); }

    protected void regCarrierwbno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierwbno(), "CARRIERWBNO"); }
    protected abstract ConditionValue xgetCValueCarrierwbno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_Equal(String numberOfPallets) {
        doSetNumberOfPallets_Equal(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_Equal(String numberOfPallets) {
        regNumberOfPallets(CK_EQ, numberOfPallets);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotEqual(String numberOfPallets) {
        doSetNumberOfPallets_NotEqual(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_NotEqual(String numberOfPallets) {
        regNumberOfPallets(CK_NES, numberOfPallets);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterThan(String numberOfPallets) {
        regNumberOfPallets(CK_GT, fRES(numberOfPallets));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessThan(String numberOfPallets) {
        regNumberOfPallets(CK_LT, fRES(numberOfPallets));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterEqual(String numberOfPallets) {
        regNumberOfPallets(CK_GE, fRES(numberOfPallets));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessEqual(String numberOfPallets) {
        regNumberOfPallets(CK_LE, fRES(numberOfPallets));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPalletsList The collection of numberOfPallets as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_InScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        regINS(CK_INS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPalletsList The collection of numberOfPallets as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_NotInScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        regINS(CK_NINS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)} <br>
     * <pre>e.g. setNumberOfPallets_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberOfPallets The value of numberOfPallets as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberOfPallets_LikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberOfPallets_NotLikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_PrefixSearch(String numberOfPallets) {
        setNumberOfPallets_LikeSearch(numberOfPallets, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNull() { regNumberOfPallets(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNullOrEmpty() { regNumberOfPallets(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNotNull() { regNumberOfPallets(CK_ISNN, DOBJ); }

    protected void regNumberOfPallets(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS"); }
    protected abstract ConditionValue xgetCValueNumberOfPallets();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_Equal(String sscc) {
        doSetSscc_Equal(fRES(sscc));
    }

    protected void doSetSscc_Equal(String sscc) {
        regSscc(CK_EQ, sscc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotEqual(String sscc) {
        doSetSscc_NotEqual(fRES(sscc));
    }

    protected void doSetSscc_NotEqual(String sscc) {
        regSscc(CK_NES, sscc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterThan(String sscc) {
        regSscc(CK_GT, fRES(sscc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessThan(String sscc) {
        regSscc(CK_LT, fRES(sscc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterEqual(String sscc) {
        regSscc(CK_GE, fRES(sscc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessEqual(String sscc) {
        regSscc(CK_LE, fRES(sscc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param ssccList The collection of sscc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_InScope(Collection<String> ssccList) {
        doSetSscc_InScope(ssccList);
    }

    protected void doSetSscc_InScope(Collection<String> ssccList) {
        regINS(CK_INS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param ssccList The collection of sscc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotInScope(Collection<String> ssccList) {
        doSetSscc_NotInScope(ssccList);
    }

    protected void doSetSscc_NotInScope(Collection<String> ssccList) {
        regINS(CK_NINS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)} <br>
     * <pre>e.g. setSscc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscc The value of sscc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscc_LikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscc_NotLikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_PrefixSearch(String sscc) {
        setSscc_LikeSearch(sscc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNull() { regSscc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNullOrEmpty() { regSscc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNotNull() { regSscc(CK_ISNN, DOBJ); }

    protected void regSscc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscc(), "SSCC"); }
    protected abstract ConditionValue xgetCValueSscc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_Equal(String caseno) {
        doSetCaseno_Equal(fRES(caseno));
    }

    protected void doSetCaseno_Equal(String caseno) {
        regCaseno(CK_EQ, caseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_NotEqual(String caseno) {
        doSetCaseno_NotEqual(fRES(caseno));
    }

    protected void doSetCaseno_NotEqual(String caseno) {
        regCaseno(CK_NES, caseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_GreaterThan(String caseno) {
        regCaseno(CK_GT, fRES(caseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_LessThan(String caseno) {
        regCaseno(CK_LT, fRES(caseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_GreaterEqual(String caseno) {
        regCaseno(CK_GE, fRES(caseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_LessEqual(String caseno) {
        regCaseno(CK_LE, fRES(caseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param casenoList The collection of caseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_InScope(Collection<String> casenoList) {
        doSetCaseno_InScope(casenoList);
    }

    protected void doSetCaseno_InScope(Collection<String> casenoList) {
        regINS(CK_INS, cTL(casenoList), xgetCValueCaseno(), "CASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param casenoList The collection of caseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_NotInScope(Collection<String> casenoList) {
        doSetCaseno_NotInScope(casenoList);
    }

    protected void doSetCaseno_NotInScope(Collection<String> casenoList) {
        regINS(CK_NINS, cTL(casenoList), xgetCValueCaseno(), "CASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)} <br>
     * <pre>e.g. setCaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseno The value of caseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseno_LikeSearch(String caseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseno), xgetCValueCaseno(), "CASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseno_NotLikeSearch(String caseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseno), xgetCValueCaseno(), "CASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_PrefixSearch(String caseno) {
        setCaseno_LikeSearch(caseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNull() { regCaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNullOrEmpty() { regCaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNotNull() { regCaseno(CK_ISNN, DOBJ); }

    protected void regCaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseno(), "CASENO"); }
    protected abstract ConditionValue xgetCValueCaseno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_Equal(String makercaseno) {
        doSetMakercaseno_Equal(fRES(makercaseno));
    }

    protected void doSetMakercaseno_Equal(String makercaseno) {
        regMakercaseno(CK_EQ, makercaseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotEqual(String makercaseno) {
        doSetMakercaseno_NotEqual(fRES(makercaseno));
    }

    protected void doSetMakercaseno_NotEqual(String makercaseno) {
        regMakercaseno(CK_NES, makercaseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterThan(String makercaseno) {
        regMakercaseno(CK_GT, fRES(makercaseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessThan(String makercaseno) {
        regMakercaseno(CK_LT, fRES(makercaseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterEqual(String makercaseno) {
        regMakercaseno(CK_GE, fRES(makercaseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessEqual(String makercaseno) {
        regMakercaseno(CK_LE, fRES(makercaseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_InScope(Collection<String> makercasenoList) {
        doSetMakercaseno_InScope(makercasenoList);
    }

    protected void doSetMakercaseno_InScope(Collection<String> makercasenoList) {
        regINS(CK_INS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotInScope(Collection<String> makercasenoList) {
        doSetMakercaseno_NotInScope(makercasenoList);
    }

    protected void doSetMakercaseno_NotInScope(Collection<String> makercasenoList) {
        regINS(CK_NINS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)} <br>
     * <pre>e.g. setMakercaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makercaseno The value of makercaseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakercaseno_LikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakercaseno_NotLikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_PrefixSearch(String makercaseno) {
        setMakercaseno_LikeSearch(makercaseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNull() { regMakercaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNullOrEmpty() { regMakercaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNotNull() { regMakercaseno(CK_ISNN, DOBJ); }

    protected void regMakercaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakercaseno(), "MAKERCASENO"); }
    protected abstract ConditionValue xgetCValueMakercaseno();

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
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_Equal(String resultflg) {
        doSetResultflg_Equal(fRES(resultflg));
    }

    protected void doSetResultflg_Equal(String resultflg) {
        regResultflg(CK_EQ, resultflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_NotEqual(String resultflg) {
        doSetResultflg_NotEqual(fRES(resultflg));
    }

    protected void doSetResultflg_NotEqual(String resultflg) {
        regResultflg(CK_NES, resultflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_GreaterThan(String resultflg) {
        regResultflg(CK_GT, fRES(resultflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_LessThan(String resultflg) {
        regResultflg(CK_LT, fRES(resultflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_GreaterEqual(String resultflg) {
        regResultflg(CK_GE, fRES(resultflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_LessEqual(String resultflg) {
        regResultflg(CK_LE, fRES(resultflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflgList The collection of resultflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_InScope(Collection<String> resultflgList) {
        doSetResultflg_InScope(resultflgList);
    }

    protected void doSetResultflg_InScope(Collection<String> resultflgList) {
        regINS(CK_INS, cTL(resultflgList), xgetCValueResultflg(), "RESULTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflgList The collection of resultflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_NotInScope(Collection<String> resultflgList) {
        doSetResultflg_NotInScope(resultflgList);
    }

    protected void doSetResultflg_NotInScope(Collection<String> resultflgList) {
        regINS(CK_NINS, cTL(resultflgList), xgetCValueResultflg(), "RESULTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESULTFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setResultflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param resultflg The value of resultflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResultflg_LikeSearch(String resultflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(resultflg), xgetCValueResultflg(), "RESULTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setResultflg_NotLikeSearch(String resultflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(resultflg), xgetCValueResultflg(), "RESULTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @param resultflg The value of resultflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultflg_PrefixSearch(String resultflg) {
        setResultflg_LikeSearch(resultflg, xcLSOPPre());
    }

    protected void regResultflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResultflg(), "RESULTFLG"); }
    protected abstract ConditionValue xgetCValueResultflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_Equal(String receivedflg) {
        doSetReceivedflg_Equal(fRES(receivedflg));
    }

    protected void doSetReceivedflg_Equal(String receivedflg) {
        regReceivedflg(CK_EQ, receivedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_NotEqual(String receivedflg) {
        doSetReceivedflg_NotEqual(fRES(receivedflg));
    }

    protected void doSetReceivedflg_NotEqual(String receivedflg) {
        regReceivedflg(CK_NES, receivedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_GreaterThan(String receivedflg) {
        regReceivedflg(CK_GT, fRES(receivedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_LessThan(String receivedflg) {
        regReceivedflg(CK_LT, fRES(receivedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_GreaterEqual(String receivedflg) {
        regReceivedflg(CK_GE, fRES(receivedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_LessEqual(String receivedflg) {
        regReceivedflg(CK_LE, fRES(receivedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflgList The collection of receivedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_InScope(Collection<String> receivedflgList) {
        doSetReceivedflg_InScope(receivedflgList);
    }

    protected void doSetReceivedflg_InScope(Collection<String> receivedflgList) {
        regINS(CK_INS, cTL(receivedflgList), xgetCValueReceivedflg(), "RECEIVEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflgList The collection of receivedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_NotInScope(Collection<String> receivedflgList) {
        doSetReceivedflg_NotInScope(receivedflgList);
    }

    protected void doSetReceivedflg_NotInScope(Collection<String> receivedflgList) {
        regINS(CK_NINS, cTL(receivedflgList), xgetCValueReceivedflg(), "RECEIVEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setReceivedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedflg The value of receivedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedflg_LikeSearch(String receivedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedflg), xgetCValueReceivedflg(), "RECEIVEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedflg_NotLikeSearch(String receivedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedflg), xgetCValueReceivedflg(), "RECEIVEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @param receivedflg The value of receivedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedflg_PrefixSearch(String receivedflg) {
        setReceivedflg_LikeSearch(receivedflg, xcLSOPPre());
    }

    protected void regReceivedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedflg(), "RECEIVEDFLG"); }
    protected abstract ConditionValue xgetCValueReceivedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_Equal(String ifreceivedflg) {
        doSetIfreceivedflg_Equal(fRES(ifreceivedflg));
    }

    protected void doSetIfreceivedflg_Equal(String ifreceivedflg) {
        regIfreceivedflg(CK_EQ, ifreceivedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_NotEqual(String ifreceivedflg) {
        doSetIfreceivedflg_NotEqual(fRES(ifreceivedflg));
    }

    protected void doSetIfreceivedflg_NotEqual(String ifreceivedflg) {
        regIfreceivedflg(CK_NES, ifreceivedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_GreaterThan(String ifreceivedflg) {
        regIfreceivedflg(CK_GT, fRES(ifreceivedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_LessThan(String ifreceivedflg) {
        regIfreceivedflg(CK_LT, fRES(ifreceivedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_GreaterEqual(String ifreceivedflg) {
        regIfreceivedflg(CK_GE, fRES(ifreceivedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_LessEqual(String ifreceivedflg) {
        regIfreceivedflg(CK_LE, fRES(ifreceivedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflgList The collection of ifreceivedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_InScope(Collection<String> ifreceivedflgList) {
        doSetIfreceivedflg_InScope(ifreceivedflgList);
    }

    protected void doSetIfreceivedflg_InScope(Collection<String> ifreceivedflgList) {
        regINS(CK_INS, cTL(ifreceivedflgList), xgetCValueIfreceivedflg(), "IFRECEIVEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflgList The collection of ifreceivedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_NotInScope(Collection<String> ifreceivedflgList) {
        doSetIfreceivedflg_NotInScope(ifreceivedflgList);
    }

    protected void doSetIfreceivedflg_NotInScope(Collection<String> ifreceivedflgList) {
        regINS(CK_NINS, cTL(ifreceivedflgList), xgetCValueIfreceivedflg(), "IFRECEIVEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setIfreceivedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifreceivedflg The value of ifreceivedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfreceivedflg_LikeSearch(String ifreceivedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifreceivedflg), xgetCValueIfreceivedflg(), "IFRECEIVEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfreceivedflg_NotLikeSearch(String ifreceivedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifreceivedflg), xgetCValueIfreceivedflg(), "IFRECEIVEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @param ifreceivedflg The value of ifreceivedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfreceivedflg_PrefixSearch(String ifreceivedflg) {
        setIfreceivedflg_LikeSearch(ifreceivedflg, xcLSOPPre());
    }

    protected void regIfreceivedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfreceivedflg(), "IFRECEIVEDFLG"); }
    protected abstract ConditionValue xgetCValueIfreceivedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolno The value of symbolno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_Equal(Long symbolno) {
        doSetSymbolno_Equal(symbolno);
    }

    protected void doSetSymbolno_Equal(Long symbolno) {
        regSymbolno(CK_EQ, symbolno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolno The value of symbolno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_NotEqual(Long symbolno) {
        doSetSymbolno_NotEqual(symbolno);
    }

    protected void doSetSymbolno_NotEqual(Long symbolno) {
        regSymbolno(CK_NES, symbolno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolno The value of symbolno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterThan(Long symbolno) {
        regSymbolno(CK_GT, symbolno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolno The value of symbolno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessThan(Long symbolno) {
        regSymbolno(CK_LT, symbolno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolno The value of symbolno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_GreaterEqual(Long symbolno) {
        regSymbolno(CK_GE, symbolno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolno The value of symbolno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolno_LessEqual(Long symbolno) {
        regSymbolno(CK_LE, symbolno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param minNumber The min number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolno(), "SYMBOLNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolnoList The collection of symbolno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolno_InScope(Collection<Long> symbolnoList) {
        doSetSymbolno_InScope(symbolnoList);
    }

    protected void doSetSymbolno_InScope(Collection<Long> symbolnoList) {
        regINS(CK_INS, cTL(symbolnoList), xgetCValueSymbolno(), "SYMBOLNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     * @param symbolnoList The collection of symbolno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolno_NotInScope(Collection<Long> symbolnoList) {
        doSetSymbolno_NotInScope(symbolnoList);
    }

    protected void doSetSymbolno_NotInScope(Collection<Long> symbolnoList) {
        regINS(CK_NINS, cTL(symbolnoList), xgetCValueSymbolno(), "SYMBOLNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     */
    public void setSymbolno_IsNull() { regSymbolno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLNO: {bigint(19)}
     */
    public void setSymbolno_IsNotNull() { regSymbolno(CK_ISNN, DOBJ); }

    protected void regSymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolno(), "SYMBOLNO"); }
    protected abstract ConditionValue xgetCValueSymbolno();

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
    public HpSLCFunction<TTrmakercasecdCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrmakercasecdCB.class);
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
    public HpSLCFunction<TTrmakercasecdCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrmakercasecdCB.class);
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
    public HpSLCFunction<TTrmakercasecdCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrmakercasecdCB.class);
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
    public HpSLCFunction<TTrmakercasecdCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrmakercasecdCB.class);
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
    public HpSLCFunction<TTrmakercasecdCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrmakercasecdCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrmakercasecdCB&gt;() {
     *     public void query(TTrmakercasecdCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrmakercasecdCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrmakercasecdCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmakercasecdCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrmakercasecdCQ sq);

    protected TTrmakercasecdCB xcreateScalarConditionCB() {
        TTrmakercasecdCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrmakercasecdCB xcreateScalarConditionPartitionByCB() {
        TTrmakercasecdCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrmakercasecdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmakercasecdCB cb = new TTrmakercasecdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRMAKERCASECD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrmakercasecdCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrmakercasecdCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrmakercasecdCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmakercasecdCB cb = new TTrmakercasecdCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRMAKERCASECD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrmakercasecdCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrmakercasecdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmakercasecdCB cb = new TTrmakercasecdCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrmakercasecdCQ sq);

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
    protected TTrmakercasecdCB newMyCB() {
        return new TTrmakercasecdCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrmakercasecdCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of T_TRCASEADOPTINVDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrcaseadoptinvdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrcaseadoptinvdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRCASEADOPTINVDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailId The value of tTrcaseadoptinvdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_Equal(Long tTrcaseadoptinvdetailId) {
        doSetTTrcaseadoptinvdetailId_Equal(tTrcaseadoptinvdetailId);
    }

    protected void doSetTTrcaseadoptinvdetailId_Equal(Long tTrcaseadoptinvdetailId) {
        regTTrcaseadoptinvdetailId(CK_EQ, tTrcaseadoptinvdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailId The value of tTrcaseadoptinvdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_NotEqual(Long tTrcaseadoptinvdetailId) {
        doSetTTrcaseadoptinvdetailId_NotEqual(tTrcaseadoptinvdetailId);
    }

    protected void doSetTTrcaseadoptinvdetailId_NotEqual(Long tTrcaseadoptinvdetailId) {
        regTTrcaseadoptinvdetailId(CK_NES, tTrcaseadoptinvdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailId The value of tTrcaseadoptinvdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_GreaterThan(Long tTrcaseadoptinvdetailId) {
        regTTrcaseadoptinvdetailId(CK_GT, tTrcaseadoptinvdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailId The value of tTrcaseadoptinvdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_LessThan(Long tTrcaseadoptinvdetailId) {
        regTTrcaseadoptinvdetailId(CK_LT, tTrcaseadoptinvdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailId The value of tTrcaseadoptinvdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_GreaterEqual(Long tTrcaseadoptinvdetailId) {
        regTTrcaseadoptinvdetailId(CK_GE, tTrcaseadoptinvdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailId The value of tTrcaseadoptinvdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_LessEqual(Long tTrcaseadoptinvdetailId) {
        regTTrcaseadoptinvdetailId(CK_LE, tTrcaseadoptinvdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tTrcaseadoptinvdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tTrcaseadoptinvdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTTrcaseadoptinvdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTTrcaseadoptinvdetailId(), "T_TRCASEADOPTINVDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailIdList The collection of tTrcaseadoptinvdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_InScope(Collection<Long> tTrcaseadoptinvdetailIdList) {
        doSetTTrcaseadoptinvdetailId_InScope(tTrcaseadoptinvdetailIdList);
    }

    protected void doSetTTrcaseadoptinvdetailId_InScope(Collection<Long> tTrcaseadoptinvdetailIdList) {
        regINS(CK_INS, cTL(tTrcaseadoptinvdetailIdList), xgetCValueTTrcaseadoptinvdetailId(), "T_TRCASEADOPTINVDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrcaseadoptinvdetailIdList The collection of tTrcaseadoptinvdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrcaseadoptinvdetailId_NotInScope(Collection<Long> tTrcaseadoptinvdetailIdList) {
        doSetTTrcaseadoptinvdetailId_NotInScope(tTrcaseadoptinvdetailIdList);
    }

    protected void doSetTTrcaseadoptinvdetailId_NotInScope(Collection<Long> tTrcaseadoptinvdetailIdList) {
        regINS(CK_NINS, cTL(tTrcaseadoptinvdetailIdList), xgetCValueTTrcaseadoptinvdetailId(), "T_TRCASEADOPTINVDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTTrcaseadoptinvdetailId_IsNull() { regTTrcaseadoptinvdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTTrcaseadoptinvdetailId_IsNotNull() { regTTrcaseadoptinvdetailId(CK_ISNN, DOBJ); }

    protected void regTTrcaseadoptinvdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTTrcaseadoptinvdetailId(), "T_TRCASEADOPTINVDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTTrcaseadoptinvdetailId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKey The value of inventoryKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryKey_Equal(Long inventoryKey) {
        doSetInventoryKey_Equal(inventoryKey);
    }

    protected void doSetInventoryKey_Equal(Long inventoryKey) {
        regInventoryKey(CK_EQ, inventoryKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKey The value of inventoryKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryKey_NotEqual(Long inventoryKey) {
        doSetInventoryKey_NotEqual(inventoryKey);
    }

    protected void doSetInventoryKey_NotEqual(Long inventoryKey) {
        regInventoryKey(CK_NES, inventoryKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKey The value of inventoryKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryKey_GreaterThan(Long inventoryKey) {
        regInventoryKey(CK_GT, inventoryKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKey The value of inventoryKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryKey_LessThan(Long inventoryKey) {
        regInventoryKey(CK_LT, inventoryKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKey The value of inventoryKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryKey_GreaterEqual(Long inventoryKey) {
        regInventoryKey(CK_GE, inventoryKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKey The value of inventoryKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryKey_LessEqual(Long inventoryKey) {
        regInventoryKey(CK_LE, inventoryKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of inventoryKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryKey(), "INVENTORY_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKeyList The collection of inventoryKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_InScope(Collection<Long> inventoryKeyList) {
        doSetInventoryKey_InScope(inventoryKeyList);
    }

    protected void doSetInventoryKey_InScope(Collection<Long> inventoryKeyList) {
        regINS(CK_INS, cTL(inventoryKeyList), xgetCValueInventoryKey(), "INVENTORY_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @param inventoryKeyList The collection of inventoryKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_NotInScope(Collection<Long> inventoryKeyList) {
        doSetInventoryKey_NotInScope(inventoryKeyList);
    }

    protected void doSetInventoryKey_NotInScope(Collection<Long> inventoryKeyList) {
        regINS(CK_NINS, cTL(inventoryKeyList), xgetCValueInventoryKey(), "INVENTORY_KEY");
    }

    protected void regInventoryKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryKey(), "INVENTORY_KEY"); }
    protected abstract ConditionValue xgetCValueInventoryKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_Equal(Long inventoryBId) {
        doSetInventoryBId_Equal(inventoryBId);
    }

    protected void doSetInventoryBId_Equal(Long inventoryBId) {
        regInventoryBId(CK_EQ, inventoryBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_NotEqual(Long inventoryBId) {
        doSetInventoryBId_NotEqual(inventoryBId);
    }

    protected void doSetInventoryBId_NotEqual(Long inventoryBId) {
        regInventoryBId(CK_NES, inventoryBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterThan(Long inventoryBId) {
        regInventoryBId(CK_GT, inventoryBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessThan(Long inventoryBId) {
        regInventoryBId(CK_LT, inventoryBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterEqual(Long inventoryBId) {
        regInventoryBId(CK_GE, inventoryBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessEqual(Long inventoryBId) {
        regInventoryBId(CK_LE, inventoryBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryBId(), "INVENTORY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBIdList The collection of inventoryBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_InScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        regINS(CK_INS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBIdList The collection of inventoryBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_NotInScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        regINS(CK_NINS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    protected void regInventoryBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryBId(), "INVENTORY_B_ID"); }
    protected abstract ConditionValue xgetCValueInventoryBId();

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
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_Equal(String qrData) {
        doSetQrData_Equal(fRES(qrData));
    }

    protected void doSetQrData_Equal(String qrData) {
        regQrData(CK_EQ, qrData);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_NotEqual(String qrData) {
        doSetQrData_NotEqual(fRES(qrData));
    }

    protected void doSetQrData_NotEqual(String qrData) {
        regQrData(CK_NES, qrData);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_GreaterThan(String qrData) {
        regQrData(CK_GT, fRES(qrData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_LessThan(String qrData) {
        regQrData(CK_LT, fRES(qrData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_GreaterEqual(String qrData) {
        regQrData(CK_GE, fRES(qrData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_LessEqual(String qrData) {
        regQrData(CK_LE, fRES(qrData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrDataList The collection of qrData as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_InScope(Collection<String> qrDataList) {
        doSetQrData_InScope(qrDataList);
    }

    protected void doSetQrData_InScope(Collection<String> qrDataList) {
        regINS(CK_INS, cTL(qrDataList), xgetCValueQrData(), "QR_DATA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrDataList The collection of qrData as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_NotInScope(Collection<String> qrDataList) {
        doSetQrData_NotInScope(qrDataList);
    }

    protected void doSetQrData_NotInScope(Collection<String> qrDataList) {
        regINS(CK_NINS, cTL(qrDataList), xgetCValueQrData(), "QR_DATA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)} <br>
     * <pre>e.g. setQrData_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qrData The value of qrData as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQrData_LikeSearch(String qrData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qrData), xgetCValueQrData(), "QR_DATA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQrData_NotLikeSearch(String qrData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qrData), xgetCValueQrData(), "QR_DATA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QR_DATA: {NotNull, varchar(255)}
     * @param qrData The value of qrData as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrData_PrefixSearch(String qrData) {
        setQrData_LikeSearch(qrData, xcLSOPPre());
    }

    protected void regQrData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQrData(), "QR_DATA"); }
    protected abstract ConditionValue xgetCValueQrData();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQty The value of caseInvQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseInvQty_Equal(Long caseInvQty) {
        doSetCaseInvQty_Equal(caseInvQty);
    }

    protected void doSetCaseInvQty_Equal(Long caseInvQty) {
        regCaseInvQty(CK_EQ, caseInvQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQty The value of caseInvQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseInvQty_NotEqual(Long caseInvQty) {
        doSetCaseInvQty_NotEqual(caseInvQty);
    }

    protected void doSetCaseInvQty_NotEqual(Long caseInvQty) {
        regCaseInvQty(CK_NES, caseInvQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQty The value of caseInvQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseInvQty_GreaterThan(Long caseInvQty) {
        regCaseInvQty(CK_GT, caseInvQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQty The value of caseInvQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseInvQty_LessThan(Long caseInvQty) {
        regCaseInvQty(CK_LT, caseInvQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQty The value of caseInvQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseInvQty_GreaterEqual(Long caseInvQty) {
        regCaseInvQty(CK_GE, caseInvQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQty The value of caseInvQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseInvQty_LessEqual(Long caseInvQty) {
        regCaseInvQty(CK_LE, caseInvQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of caseInvQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseInvQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseInvQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseInvQty(), "CASE_INV_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQtyList The collection of caseInvQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInvQty_InScope(Collection<Long> caseInvQtyList) {
        doSetCaseInvQty_InScope(caseInvQtyList);
    }

    protected void doSetCaseInvQty_InScope(Collection<Long> caseInvQtyList) {
        regINS(CK_INS, cTL(caseInvQtyList), xgetCValueCaseInvQty(), "CASE_INV_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @param caseInvQtyList The collection of caseInvQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInvQty_NotInScope(Collection<Long> caseInvQtyList) {
        doSetCaseInvQty_NotInScope(caseInvQtyList);
    }

    protected void doSetCaseInvQty_NotInScope(Collection<Long> caseInvQtyList) {
        regINS(CK_NINS, cTL(caseInvQtyList), xgetCValueCaseInvQty(), "CASE_INV_QTY");
    }

    protected void regCaseInvQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseInvQty(), "CASE_INV_QTY"); }
    protected abstract ConditionValue xgetCValueCaseInvQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_Equal(String manufactureDate) {
        doSetManufactureDate_Equal(fRES(manufactureDate));
    }

    protected void doSetManufactureDate_Equal(String manufactureDate) {
        regManufactureDate(CK_EQ, manufactureDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_NotEqual(String manufactureDate) {
        doSetManufactureDate_NotEqual(fRES(manufactureDate));
    }

    protected void doSetManufactureDate_NotEqual(String manufactureDate) {
        regManufactureDate(CK_NES, manufactureDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_GreaterThan(String manufactureDate) {
        regManufactureDate(CK_GT, fRES(manufactureDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_LessThan(String manufactureDate) {
        regManufactureDate(CK_LT, fRES(manufactureDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_GreaterEqual(String manufactureDate) {
        regManufactureDate(CK_GE, fRES(manufactureDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_LessEqual(String manufactureDate) {
        regManufactureDate(CK_LE, fRES(manufactureDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDateList The collection of manufactureDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_InScope(Collection<String> manufactureDateList) {
        doSetManufactureDate_InScope(manufactureDateList);
    }

    protected void doSetManufactureDate_InScope(Collection<String> manufactureDateList) {
        regINS(CK_INS, cTL(manufactureDateList), xgetCValueManufactureDate(), "MANUFACTURE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDateList The collection of manufactureDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_NotInScope(Collection<String> manufactureDateList) {
        doSetManufactureDate_NotInScope(manufactureDateList);
    }

    protected void doSetManufactureDate_NotInScope(Collection<String> manufactureDateList) {
        regINS(CK_NINS, cTL(manufactureDateList), xgetCValueManufactureDate(), "MANUFACTURE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)} <br>
     * <pre>e.g. setManufactureDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureDate The value of manufactureDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureDate_LikeSearch(String manufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureDate), xgetCValueManufactureDate(), "MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureDate_NotLikeSearch(String manufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureDate), xgetCValueManufactureDate(), "MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     * @param manufactureDate The value of manufactureDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_PrefixSearch(String manufactureDate) {
        setManufactureDate_LikeSearch(manufactureDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     */
    public void setManufactureDate_IsNull() { regManufactureDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     */
    public void setManufactureDate_IsNullOrEmpty() { regManufactureDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {varchar(8)}
     */
    public void setManufactureDate_IsNotNull() { regManufactureDate(CK_ISNN, DOBJ); }

    protected void regManufactureDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureDate(), "MANUFACTURE_DATE"); }
    protected abstract ConditionValue xgetCValueManufactureDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_Equal(String designFlg) {
        doSetDesignFlg_Equal(fRES(designFlg));
    }

    protected void doSetDesignFlg_Equal(String designFlg) {
        regDesignFlg(CK_EQ, designFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_NotEqual(String designFlg) {
        doSetDesignFlg_NotEqual(fRES(designFlg));
    }

    protected void doSetDesignFlg_NotEqual(String designFlg) {
        regDesignFlg(CK_NES, designFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_GreaterThan(String designFlg) {
        regDesignFlg(CK_GT, fRES(designFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_LessThan(String designFlg) {
        regDesignFlg(CK_LT, fRES(designFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_GreaterEqual(String designFlg) {
        regDesignFlg(CK_GE, fRES(designFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_LessEqual(String designFlg) {
        regDesignFlg(CK_LE, fRES(designFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlgList The collection of designFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_InScope(Collection<String> designFlgList) {
        doSetDesignFlg_InScope(designFlgList);
    }

    protected void doSetDesignFlg_InScope(Collection<String> designFlgList) {
        regINS(CK_INS, cTL(designFlgList), xgetCValueDesignFlg(), "DESIGN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlgList The collection of designFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_NotInScope(Collection<String> designFlgList) {
        doSetDesignFlg_NotInScope(designFlgList);
    }

    protected void doSetDesignFlg_NotInScope(Collection<String> designFlgList) {
        regINS(CK_NINS, cTL(designFlgList), xgetCValueDesignFlg(), "DESIGN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)} <br>
     * <pre>e.g. setDesignFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designFlg The value of designFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignFlg_LikeSearch(String designFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designFlg), xgetCValueDesignFlg(), "DESIGN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignFlg_NotLikeSearch(String designFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designFlg), xgetCValueDesignFlg(), "DESIGN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_PrefixSearch(String designFlg) {
        setDesignFlg_LikeSearch(designFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     */
    public void setDesignFlg_IsNull() { regDesignFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     */
    public void setDesignFlg_IsNullOrEmpty() { regDesignFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     */
    public void setDesignFlg_IsNotNull() { regDesignFlg(CK_ISNN, DOBJ); }

    protected void regDesignFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignFlg(), "DESIGN_FLG"); }
    protected abstract ConditionValue xgetCValueDesignFlg();

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
    public HpSLCFunction<TTrcaseadoptinvdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrcaseadoptinvdetailCB.class);
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
    public HpSLCFunction<TTrcaseadoptinvdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrcaseadoptinvdetailCB.class);
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
    public HpSLCFunction<TTrcaseadoptinvdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrcaseadoptinvdetailCB.class);
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
    public HpSLCFunction<TTrcaseadoptinvdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrcaseadoptinvdetailCB.class);
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
    public HpSLCFunction<TTrcaseadoptinvdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrcaseadoptinvdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrcaseadoptinvdetailCB&gt;() {
     *     public void query(TTrcaseadoptinvdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrcaseadoptinvdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrcaseadoptinvdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseadoptinvdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrcaseadoptinvdetailCQ sq);

    protected TTrcaseadoptinvdetailCB xcreateScalarConditionCB() {
        TTrcaseadoptinvdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrcaseadoptinvdetailCB xcreateScalarConditionPartitionByCB() {
        TTrcaseadoptinvdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrcaseadoptinvdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseadoptinvdetailCB cb = new TTrcaseadoptinvdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "T_TRCASEADOPTINVDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrcaseadoptinvdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrcaseadoptinvdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrcaseadoptinvdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseadoptinvdetailCB cb = new TTrcaseadoptinvdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "T_TRCASEADOPTINVDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrcaseadoptinvdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrcaseadoptinvdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcaseadoptinvdetailCB cb = new TTrcaseadoptinvdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrcaseadoptinvdetailCQ sq);

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
    protected TTrcaseadoptinvdetailCB newMyCB() {
        return new TTrcaseadoptinvdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrcaseadoptinvdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

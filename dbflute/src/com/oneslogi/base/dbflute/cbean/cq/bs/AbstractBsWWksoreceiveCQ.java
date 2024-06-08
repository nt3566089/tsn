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
 * The abstract condition-query of W_WKSORECEIVE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWksoreceiveCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWksoreceiveCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKSORECEIVE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveId The value of wksoreceiveId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksoreceiveId_Equal(Long wksoreceiveId) {
        doSetWksoreceiveId_Equal(wksoreceiveId);
    }

    protected void doSetWksoreceiveId_Equal(Long wksoreceiveId) {
        regWksoreceiveId(CK_EQ, wksoreceiveId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveId The value of wksoreceiveId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksoreceiveId_NotEqual(Long wksoreceiveId) {
        doSetWksoreceiveId_NotEqual(wksoreceiveId);
    }

    protected void doSetWksoreceiveId_NotEqual(Long wksoreceiveId) {
        regWksoreceiveId(CK_NES, wksoreceiveId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveId The value of wksoreceiveId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksoreceiveId_GreaterThan(Long wksoreceiveId) {
        regWksoreceiveId(CK_GT, wksoreceiveId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveId The value of wksoreceiveId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksoreceiveId_LessThan(Long wksoreceiveId) {
        regWksoreceiveId(CK_LT, wksoreceiveId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveId The value of wksoreceiveId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksoreceiveId_GreaterEqual(Long wksoreceiveId) {
        regWksoreceiveId(CK_GE, wksoreceiveId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveId The value of wksoreceiveId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksoreceiveId_LessEqual(Long wksoreceiveId) {
        regWksoreceiveId(CK_LE, wksoreceiveId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of wksoreceiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wksoreceiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWksoreceiveId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWksoreceiveId(), "WKSORECEIVE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveIdList The collection of wksoreceiveId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWksoreceiveId_InScope(Collection<Long> wksoreceiveIdList) {
        doSetWksoreceiveId_InScope(wksoreceiveIdList);
    }

    protected void doSetWksoreceiveId_InScope(Collection<Long> wksoreceiveIdList) {
        regINS(CK_INS, cTL(wksoreceiveIdList), xgetCValueWksoreceiveId(), "WKSORECEIVE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param wksoreceiveIdList The collection of wksoreceiveId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWksoreceiveId_NotInScope(Collection<Long> wksoreceiveIdList) {
        doSetWksoreceiveId_NotInScope(wksoreceiveIdList);
    }

    protected void doSetWksoreceiveId_NotInScope(Collection<Long> wksoreceiveIdList) {
        regINS(CK_NINS, cTL(wksoreceiveIdList), xgetCValueWksoreceiveId(), "WKSORECEIVE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWksoreceiveId_IsNull() { regWksoreceiveId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWksoreceiveId_IsNotNull() { regWksoreceiveId(CK_ISNN, DOBJ); }

    protected void regWksoreceiveId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWksoreceiveId(), "WKSORECEIVE_ID"); }
    protected abstract ConditionValue xgetCValueWksoreceiveId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKey The value of soReceiveKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoReceiveKey_Equal(Long soReceiveKey) {
        doSetSoReceiveKey_Equal(soReceiveKey);
    }

    protected void doSetSoReceiveKey_Equal(Long soReceiveKey) {
        regSoReceiveKey(CK_EQ, soReceiveKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKey The value of soReceiveKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoReceiveKey_NotEqual(Long soReceiveKey) {
        doSetSoReceiveKey_NotEqual(soReceiveKey);
    }

    protected void doSetSoReceiveKey_NotEqual(Long soReceiveKey) {
        regSoReceiveKey(CK_NES, soReceiveKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKey The value of soReceiveKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoReceiveKey_GreaterThan(Long soReceiveKey) {
        regSoReceiveKey(CK_GT, soReceiveKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKey The value of soReceiveKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoReceiveKey_LessThan(Long soReceiveKey) {
        regSoReceiveKey(CK_LT, soReceiveKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKey The value of soReceiveKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoReceiveKey_GreaterEqual(Long soReceiveKey) {
        regSoReceiveKey(CK_GE, soReceiveKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKey The value of soReceiveKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoReceiveKey_LessEqual(Long soReceiveKey) {
        regSoReceiveKey(CK_LE, soReceiveKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of soReceiveKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soReceiveKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoReceiveKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoReceiveKey(), "SO_RECEIVE_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKeyList The collection of soReceiveKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoReceiveKey_InScope(Collection<Long> soReceiveKeyList) {
        doSetSoReceiveKey_InScope(soReceiveKeyList);
    }

    protected void doSetSoReceiveKey_InScope(Collection<Long> soReceiveKeyList) {
        regINS(CK_INS, cTL(soReceiveKeyList), xgetCValueSoReceiveKey(), "SO_RECEIVE_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SO_RECEIVE_KEY: {NotNull, bigint(19)}
     * @param soReceiveKeyList The collection of soReceiveKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoReceiveKey_NotInScope(Collection<Long> soReceiveKeyList) {
        doSetSoReceiveKey_NotInScope(soReceiveKeyList);
    }

    protected void doSetSoReceiveKey_NotInScope(Collection<Long> soReceiveKeyList) {
        regINS(CK_NINS, cTL(soReceiveKeyList), xgetCValueSoReceiveKey(), "SO_RECEIVE_KEY");
    }

    protected void regSoReceiveKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoReceiveKey(), "SO_RECEIVE_KEY"); }
    protected abstract ConditionValue xgetCValueSoReceiveKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHId The value of shippingInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_Equal(Long shippingInstHId) {
        doSetShippingInstHId_Equal(shippingInstHId);
    }

    protected void doSetShippingInstHId_Equal(Long shippingInstHId) {
        regShippingInstHId(CK_EQ, shippingInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHId The value of shippingInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotEqual(Long shippingInstHId) {
        doSetShippingInstHId_NotEqual(shippingInstHId);
    }

    protected void doSetShippingInstHId_NotEqual(Long shippingInstHId) {
        regShippingInstHId(CK_NES, shippingInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_InScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_INS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     */
    public void setShippingInstHId_IsNull() { regShippingInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {bigint(19)}
     */
    public void setShippingInstHId_IsNotNull() { regShippingInstHId(CK_ISNN, DOBJ); }

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
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
     * LOT_ID: {bigint(19)}
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
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
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
     * LOT_ID: {bigint(19)}
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
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_Equal(String ownersono) {
        doSetOwnersono_Equal(fRES(ownersono));
    }

    protected void doSetOwnersono_Equal(String ownersono) {
        regOwnersono(CK_EQ, ownersono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotEqual(String ownersono) {
        doSetOwnersono_NotEqual(fRES(ownersono));
    }

    protected void doSetOwnersono_NotEqual(String ownersono) {
        regOwnersono(CK_NES, ownersono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterThan(String ownersono) {
        regOwnersono(CK_GT, fRES(ownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessThan(String ownersono) {
        regOwnersono(CK_LT, fRES(ownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterEqual(String ownersono) {
        regOwnersono(CK_GE, fRES(ownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessEqual(String ownersono) {
        regOwnersono(CK_LE, fRES(ownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersonoList The collection of ownersono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_InScope(Collection<String> ownersonoList) {
        doSetOwnersono_InScope(ownersonoList);
    }

    protected void doSetOwnersono_InScope(Collection<String> ownersonoList) {
        regINS(CK_INS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersonoList The collection of ownersono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotInScope(Collection<String> ownersonoList) {
        doSetOwnersono_NotInScope(ownersonoList);
    }

    protected void doSetOwnersono_NotInScope(Collection<String> ownersonoList) {
        regINS(CK_NINS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(30)} <br>
     * <pre>e.g. setOwnersono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownersono The value of ownersono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnersono_LikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersono_NotLikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(30)}
     * @param ownersono The value of ownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_PrefixSearch(String ownersono) {
        setOwnersono_LikeSearch(ownersono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     */
    public void setOwnersono_IsNull() { regOwnersono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     */
    public void setOwnersono_IsNullOrEmpty() { regOwnersono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(30)}
     */
    public void setOwnersono_IsNotNull() { regOwnersono(CK_ISNN, DOBJ); }

    protected void regOwnersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersono(), "OWNERSONO"); }
    protected abstract ConditionValue xgetCValueOwnersono();

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
    public HpSLCFunction<WWksoreceiveCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWksoreceiveCB.class);
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
    public HpSLCFunction<WWksoreceiveCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWksoreceiveCB.class);
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
    public HpSLCFunction<WWksoreceiveCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWksoreceiveCB.class);
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
    public HpSLCFunction<WWksoreceiveCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWksoreceiveCB.class);
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
    public HpSLCFunction<WWksoreceiveCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWksoreceiveCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWksoreceiveCB&gt;() {
     *     public void query(WWksoreceiveCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWksoreceiveCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWksoreceiveCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWksoreceiveCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWksoreceiveCQ sq);

    protected WWksoreceiveCB xcreateScalarConditionCB() {
        WWksoreceiveCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWksoreceiveCB xcreateScalarConditionPartitionByCB() {
        WWksoreceiveCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WWksoreceiveCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWksoreceiveCB cb = new WWksoreceiveCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WKSORECEIVE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WWksoreceiveCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WWksoreceiveCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WWksoreceiveCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWksoreceiveCB cb = new WWksoreceiveCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WKSORECEIVE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WWksoreceiveCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WWksoreceiveCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WWksoreceiveCB cb = new WWksoreceiveCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WWksoreceiveCQ sq);

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
    protected WWksoreceiveCB newMyCB() {
        return new WWksoreceiveCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWksoreceiveCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of W_PALLET_SYMBOL_JT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWPalletSymbolJtCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWPalletSymbolJtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_PALLET_SYMBOL_JT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkey The value of wksojtkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_Equal(Long wksojtkey) {
        doSetWksojtkey_Equal(wksojtkey);
    }

    protected void doSetWksojtkey_Equal(Long wksojtkey) {
        regWksojtkey(CK_EQ, wksojtkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkey The value of wksojtkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_NotEqual(Long wksojtkey) {
        doSetWksojtkey_NotEqual(wksojtkey);
    }

    protected void doSetWksojtkey_NotEqual(Long wksojtkey) {
        regWksojtkey(CK_NES, wksojtkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkey The value of wksojtkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_GreaterThan(Long wksojtkey) {
        regWksojtkey(CK_GT, wksojtkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkey The value of wksojtkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_LessThan(Long wksojtkey) {
        regWksojtkey(CK_LT, wksojtkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkey The value of wksojtkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_GreaterEqual(Long wksojtkey) {
        regWksojtkey(CK_GE, wksojtkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkey The value of wksojtkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWksojtkey_LessEqual(Long wksojtkey) {
        regWksojtkey(CK_LE, wksojtkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of wksojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wksojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWksojtkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWksojtkey(), "WKSOJTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkeyList The collection of wksojtkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWksojtkey_InScope(Collection<Long> wksojtkeyList) {
        doSetWksojtkey_InScope(wksojtkeyList);
    }

    protected void doSetWksojtkey_InScope(Collection<Long> wksojtkeyList) {
        regINS(CK_INS, cTL(wksojtkeyList), xgetCValueWksojtkey(), "WKSOJTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param wksojtkeyList The collection of wksojtkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWksojtkey_NotInScope(Collection<Long> wksojtkeyList) {
        doSetWksojtkey_NotInScope(wksojtkeyList);
    }

    protected void doSetWksojtkey_NotInScope(Collection<Long> wksojtkeyList) {
        regINS(CK_NINS, cTL(wksojtkeyList), xgetCValueWksojtkey(), "WKSOJTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWksojtkey_IsNull() { regWksojtkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWksojtkey_IsNotNull() { regWksojtkey(CK_ISNN, DOBJ); }

    protected void regWksojtkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWksojtkey(), "WKSOJTKEY"); }
    protected abstract ConditionValue xgetCValueWksojtkey();

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
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_Equal(Long trpalletId) {
        doSetTrpalletId_Equal(trpalletId);
    }

    protected void doSetTrpalletId_Equal(Long trpalletId) {
        regTrpalletId(CK_EQ, trpalletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_NotEqual(Long trpalletId) {
        doSetTrpalletId_NotEqual(trpalletId);
    }

    protected void doSetTrpalletId_NotEqual(Long trpalletId) {
        regTrpalletId(CK_NES, trpalletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterThan(Long trpalletId) {
        regTrpalletId(CK_GT, trpalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessThan(Long trpalletId) {
        regTrpalletId(CK_LT, trpalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterEqual(Long trpalletId) {
        regTrpalletId(CK_GE, trpalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessEqual(Long trpalletId) {
        regTrpalletId(CK_LE, trpalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletId(), "TRPALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletIdList The collection of trpalletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_InScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_InScope(trpalletIdList);
    }

    protected void doSetTrpalletId_InScope(Collection<Long> trpalletIdList) {
        regINS(CK_INS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @param trpalletIdList The collection of trpalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_NotInScope(trpalletIdList);
    }

    protected void doSetTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        regINS(CK_NINS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    protected void regTrpalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpalletId(), "TRPALLET_ID"); }
    protected abstract ConditionValue xgetCValueTrpalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNo The value of palletNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletNo_Equal(Long palletNo) {
        doSetPalletNo_Equal(palletNo);
    }

    protected void doSetPalletNo_Equal(Long palletNo) {
        regPalletNo(CK_EQ, palletNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNo The value of palletNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletNo_NotEqual(Long palletNo) {
        doSetPalletNo_NotEqual(palletNo);
    }

    protected void doSetPalletNo_NotEqual(Long palletNo) {
        regPalletNo(CK_NES, palletNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNo The value of palletNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletNo_GreaterThan(Long palletNo) {
        regPalletNo(CK_GT, palletNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNo The value of palletNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletNo_LessThan(Long palletNo) {
        regPalletNo(CK_LT, palletNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNo The value of palletNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletNo_GreaterEqual(Long palletNo) {
        regPalletNo(CK_GE, palletNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNo The value of palletNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletNo_LessEqual(Long palletNo) {
        regPalletNo(CK_LE, palletNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of palletNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletNo(), "PALLET_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNoList The collection of palletNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_InScope(Collection<Long> palletNoList) {
        doSetPalletNo_InScope(palletNoList);
    }

    protected void doSetPalletNo_InScope(Collection<Long> palletNoList) {
        regINS(CK_INS, cTL(palletNoList), xgetCValuePalletNo(), "PALLET_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @param palletNoList The collection of palletNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletNo_NotInScope(Collection<Long> palletNoList) {
        doSetPalletNo_NotInScope(palletNoList);
    }

    protected void doSetPalletNo_NotInScope(Collection<Long> palletNoList) {
        regINS(CK_NINS, cTL(palletNoList), xgetCValuePalletNo(), "PALLET_NO");
    }

    protected void regPalletNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletNo(), "PALLET_NO"); }
    protected abstract ConditionValue xgetCValuePalletNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_Equal(String ownerSoNo) {
        doSetOwnerSoNo_Equal(fRES(ownerSoNo));
    }

    protected void doSetOwnerSoNo_Equal(String ownerSoNo) {
        regOwnerSoNo(CK_EQ, ownerSoNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_NotEqual(String ownerSoNo) {
        doSetOwnerSoNo_NotEqual(fRES(ownerSoNo));
    }

    protected void doSetOwnerSoNo_NotEqual(String ownerSoNo) {
        regOwnerSoNo(CK_NES, ownerSoNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_GreaterThan(String ownerSoNo) {
        regOwnerSoNo(CK_GT, fRES(ownerSoNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_LessThan(String ownerSoNo) {
        regOwnerSoNo(CK_LT, fRES(ownerSoNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_GreaterEqual(String ownerSoNo) {
        regOwnerSoNo(CK_GE, fRES(ownerSoNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_LessEqual(String ownerSoNo) {
        regOwnerSoNo(CK_LE, fRES(ownerSoNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNoList The collection of ownerSoNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_InScope(Collection<String> ownerSoNoList) {
        doSetOwnerSoNo_InScope(ownerSoNoList);
    }

    protected void doSetOwnerSoNo_InScope(Collection<String> ownerSoNoList) {
        regINS(CK_INS, cTL(ownerSoNoList), xgetCValueOwnerSoNo(), "OWNER_SO_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNoList The collection of ownerSoNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_NotInScope(Collection<String> ownerSoNoList) {
        doSetOwnerSoNo_NotInScope(ownerSoNoList);
    }

    protected void doSetOwnerSoNo_NotInScope(Collection<String> ownerSoNoList) {
        regINS(CK_NINS, cTL(ownerSoNoList), xgetCValueOwnerSoNo(), "OWNER_SO_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)} <br>
     * <pre>e.g. setOwnerSoNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerSoNo The value of ownerSoNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerSoNo_LikeSearch(String ownerSoNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerSoNo), xgetCValueOwnerSoNo(), "OWNER_SO_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerSoNo_NotLikeSearch(String ownerSoNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerSoNo), xgetCValueOwnerSoNo(), "OWNER_SO_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @param ownerSoNo The value of ownerSoNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerSoNo_PrefixSearch(String ownerSoNo) {
        setOwnerSoNo_LikeSearch(ownerSoNo, xcLSOPPre());
    }

    protected void regOwnerSoNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerSoNo(), "OWNER_SO_NO"); }
    protected abstract ConditionValue xgetCValueOwnerSoNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_Equal(String soPalletNo) {
        doSetSoPalletNo_Equal(fRES(soPalletNo));
    }

    protected void doSetSoPalletNo_Equal(String soPalletNo) {
        regSoPalletNo(CK_EQ, soPalletNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_NotEqual(String soPalletNo) {
        doSetSoPalletNo_NotEqual(fRES(soPalletNo));
    }

    protected void doSetSoPalletNo_NotEqual(String soPalletNo) {
        regSoPalletNo(CK_NES, soPalletNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_GreaterThan(String soPalletNo) {
        regSoPalletNo(CK_GT, fRES(soPalletNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_LessThan(String soPalletNo) {
        regSoPalletNo(CK_LT, fRES(soPalletNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_GreaterEqual(String soPalletNo) {
        regSoPalletNo(CK_GE, fRES(soPalletNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_LessEqual(String soPalletNo) {
        regSoPalletNo(CK_LE, fRES(soPalletNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNoList The collection of soPalletNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_InScope(Collection<String> soPalletNoList) {
        doSetSoPalletNo_InScope(soPalletNoList);
    }

    protected void doSetSoPalletNo_InScope(Collection<String> soPalletNoList) {
        regINS(CK_INS, cTL(soPalletNoList), xgetCValueSoPalletNo(), "SO_PALLET_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNoList The collection of soPalletNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_NotInScope(Collection<String> soPalletNoList) {
        doSetSoPalletNo_NotInScope(soPalletNoList);
    }

    protected void doSetSoPalletNo_NotInScope(Collection<String> soPalletNoList) {
        regINS(CK_NINS, cTL(soPalletNoList), xgetCValueSoPalletNo(), "SO_PALLET_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSoPalletNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param soPalletNo The value of soPalletNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSoPalletNo_LikeSearch(String soPalletNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(soPalletNo), xgetCValueSoPalletNo(), "SO_PALLET_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSoPalletNo_NotLikeSearch(String soPalletNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(soPalletNo), xgetCValueSoPalletNo(), "SO_PALLET_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @param soPalletNo The value of soPalletNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoPalletNo_PrefixSearch(String soPalletNo) {
        setSoPalletNo_LikeSearch(soPalletNo, xcLSOPPre());
    }

    protected void regSoPalletNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoPalletNo(), "SO_PALLET_NO"); }
    protected abstract ConditionValue xgetCValueSoPalletNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_Equal(Long trsymbolId) {
        doSetTrsymbolId_Equal(trsymbolId);
    }

    protected void doSetTrsymbolId_Equal(Long trsymbolId) {
        regTrsymbolId(CK_EQ, trsymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotEqual(Long trsymbolId) {
        doSetTrsymbolId_NotEqual(trsymbolId);
    }

    protected void doSetTrsymbolId_NotEqual(Long trsymbolId) {
        regTrsymbolId(CK_NES, trsymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_InScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        regINS(CK_INS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNo The value of symbolNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolNo_Equal(Long symbolNo) {
        doSetSymbolNo_Equal(symbolNo);
    }

    protected void doSetSymbolNo_Equal(Long symbolNo) {
        regSymbolNo(CK_EQ, symbolNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNo The value of symbolNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolNo_NotEqual(Long symbolNo) {
        doSetSymbolNo_NotEqual(symbolNo);
    }

    protected void doSetSymbolNo_NotEqual(Long symbolNo) {
        regSymbolNo(CK_NES, symbolNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNo The value of symbolNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolNo_GreaterThan(Long symbolNo) {
        regSymbolNo(CK_GT, symbolNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNo The value of symbolNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolNo_LessThan(Long symbolNo) {
        regSymbolNo(CK_LT, symbolNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNo The value of symbolNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolNo_GreaterEqual(Long symbolNo) {
        regSymbolNo(CK_GE, symbolNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNo The value of symbolNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolNo_LessEqual(Long symbolNo) {
        regSymbolNo(CK_LE, symbolNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of symbolNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolNo(), "SYMBOL_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNoList The collection of symbolNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolNo_InScope(Collection<Long> symbolNoList) {
        doSetSymbolNo_InScope(symbolNoList);
    }

    protected void doSetSymbolNo_InScope(Collection<Long> symbolNoList) {
        regINS(CK_INS, cTL(symbolNoList), xgetCValueSymbolNo(), "SYMBOL_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @param symbolNoList The collection of symbolNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolNo_NotInScope(Collection<Long> symbolNoList) {
        doSetSymbolNo_NotInScope(symbolNoList);
    }

    protected void doSetSymbolNo_NotInScope(Collection<Long> symbolNoList) {
        regINS(CK_NINS, cTL(symbolNoList), xgetCValueSymbolNo(), "SYMBOL_NO");
    }

    protected void regSymbolNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolNo(), "SYMBOL_NO"); }
    protected abstract ConditionValue xgetCValueSymbolNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQty The value of sortedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_Equal(Long sortedQty) {
        doSetSortedQty_Equal(sortedQty);
    }

    protected void doSetSortedQty_Equal(Long sortedQty) {
        regSortedQty(CK_EQ, sortedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQty The value of sortedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_NotEqual(Long sortedQty) {
        doSetSortedQty_NotEqual(sortedQty);
    }

    protected void doSetSortedQty_NotEqual(Long sortedQty) {
        regSortedQty(CK_NES, sortedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQty The value of sortedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_GreaterThan(Long sortedQty) {
        regSortedQty(CK_GT, sortedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQty The value of sortedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_LessThan(Long sortedQty) {
        regSortedQty(CK_LT, sortedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQty The value of sortedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_GreaterEqual(Long sortedQty) {
        regSortedQty(CK_GE, sortedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQty The value of sortedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_LessEqual(Long sortedQty) {
        regSortedQty(CK_LE, sortedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of sortedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedQty(), "SORTED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQtyList The collection of sortedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedQty_InScope(Collection<Long> sortedQtyList) {
        doSetSortedQty_InScope(sortedQtyList);
    }

    protected void doSetSortedQty_InScope(Collection<Long> sortedQtyList) {
        regINS(CK_INS, cTL(sortedQtyList), xgetCValueSortedQty(), "SORTED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @param sortedQtyList The collection of sortedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedQty_NotInScope(Collection<Long> sortedQtyList) {
        doSetSortedQty_NotInScope(sortedQtyList);
    }

    protected void doSetSortedQty_NotInScope(Collection<Long> sortedQtyList) {
        regINS(CK_NINS, cTL(sortedQtyList), xgetCValueSortedQty(), "SORTED_QTY");
    }

    protected void regSortedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedQty(), "SORTED_QTY"); }
    protected abstract ConditionValue xgetCValueSortedQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_Equal(String enterFlg) {
        doSetEnterFlg_Equal(fRES(enterFlg));
    }

    protected void doSetEnterFlg_Equal(String enterFlg) {
        regEnterFlg(CK_EQ, enterFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_NotEqual(String enterFlg) {
        doSetEnterFlg_NotEqual(fRES(enterFlg));
    }

    protected void doSetEnterFlg_NotEqual(String enterFlg) {
        regEnterFlg(CK_NES, enterFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_GreaterThan(String enterFlg) {
        regEnterFlg(CK_GT, fRES(enterFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_LessThan(String enterFlg) {
        regEnterFlg(CK_LT, fRES(enterFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_GreaterEqual(String enterFlg) {
        regEnterFlg(CK_GE, fRES(enterFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_LessEqual(String enterFlg) {
        regEnterFlg(CK_LE, fRES(enterFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlgList The collection of enterFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_InScope(Collection<String> enterFlgList) {
        doSetEnterFlg_InScope(enterFlgList);
    }

    protected void doSetEnterFlg_InScope(Collection<String> enterFlgList) {
        regINS(CK_INS, cTL(enterFlgList), xgetCValueEnterFlg(), "ENTER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlgList The collection of enterFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_NotInScope(Collection<String> enterFlgList) {
        doSetEnterFlg_NotInScope(enterFlgList);
    }

    protected void doSetEnterFlg_NotInScope(Collection<String> enterFlgList) {
        regINS(CK_NINS, cTL(enterFlgList), xgetCValueEnterFlg(), "ENTER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)} <br>
     * <pre>e.g. setEnterFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param enterFlg The value of enterFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEnterFlg_LikeSearch(String enterFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(enterFlg), xgetCValueEnterFlg(), "ENTER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEnterFlg_NotLikeSearch(String enterFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(enterFlg), xgetCValueEnterFlg(), "ENTER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @param enterFlg The value of enterFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnterFlg_PrefixSearch(String enterFlg) {
        setEnterFlg_LikeSearch(enterFlg, xcLSOPPre());
    }

    protected void regEnterFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEnterFlg(), "ENTER_FLG"); }
    protected abstract ConditionValue xgetCValueEnterFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_Equal(String packedFlg) {
        doSetPackedFlg_Equal(fRES(packedFlg));
    }

    protected void doSetPackedFlg_Equal(String packedFlg) {
        regPackedFlg(CK_EQ, packedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_NotEqual(String packedFlg) {
        doSetPackedFlg_NotEqual(fRES(packedFlg));
    }

    protected void doSetPackedFlg_NotEqual(String packedFlg) {
        regPackedFlg(CK_NES, packedFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_GreaterThan(String packedFlg) {
        regPackedFlg(CK_GT, fRES(packedFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_LessThan(String packedFlg) {
        regPackedFlg(CK_LT, fRES(packedFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_GreaterEqual(String packedFlg) {
        regPackedFlg(CK_GE, fRES(packedFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_LessEqual(String packedFlg) {
        regPackedFlg(CK_LE, fRES(packedFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlgList The collection of packedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_InScope(Collection<String> packedFlgList) {
        doSetPackedFlg_InScope(packedFlgList);
    }

    protected void doSetPackedFlg_InScope(Collection<String> packedFlgList) {
        regINS(CK_INS, cTL(packedFlgList), xgetCValuePackedFlg(), "PACKED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlgList The collection of packedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_NotInScope(Collection<String> packedFlgList) {
        doSetPackedFlg_NotInScope(packedFlgList);
    }

    protected void doSetPackedFlg_NotInScope(Collection<String> packedFlgList) {
        regINS(CK_NINS, cTL(packedFlgList), xgetCValuePackedFlg(), "PACKED_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPackedFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param packedFlg The value of packedFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackedFlg_LikeSearch(String packedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packedFlg), xgetCValuePackedFlg(), "PACKED_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackedFlg_NotLikeSearch(String packedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packedFlg), xgetCValuePackedFlg(), "PACKED_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @param packedFlg The value of packedFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedFlg_PrefixSearch(String packedFlg) {
        setPackedFlg_LikeSearch(packedFlg, xcLSOPPre());
    }

    protected void regPackedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackedFlg(), "PACKED_FLG"); }
    protected abstract ConditionValue xgetCValuePackedFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKey The value of rcvKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvKey_Equal(Long rcvKey) {
        doSetRcvKey_Equal(rcvKey);
    }

    protected void doSetRcvKey_Equal(Long rcvKey) {
        regRcvKey(CK_EQ, rcvKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKey The value of rcvKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvKey_NotEqual(Long rcvKey) {
        doSetRcvKey_NotEqual(rcvKey);
    }

    protected void doSetRcvKey_NotEqual(Long rcvKey) {
        regRcvKey(CK_NES, rcvKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKey The value of rcvKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvKey_GreaterThan(Long rcvKey) {
        regRcvKey(CK_GT, rcvKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKey The value of rcvKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvKey_LessThan(Long rcvKey) {
        regRcvKey(CK_LT, rcvKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKey The value of rcvKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvKey_GreaterEqual(Long rcvKey) {
        regRcvKey(CK_GE, rcvKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKey The value of rcvKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvKey_LessEqual(Long rcvKey) {
        regRcvKey(CK_LE, rcvKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of rcvKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvKey(), "RCV_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKeyList The collection of rcvKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_InScope(Collection<Long> rcvKeyList) {
        doSetRcvKey_InScope(rcvKeyList);
    }

    protected void doSetRcvKey_InScope(Collection<Long> rcvKeyList) {
        regINS(CK_INS, cTL(rcvKeyList), xgetCValueRcvKey(), "RCV_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @param rcvKeyList The collection of rcvKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_NotInScope(Collection<Long> rcvKeyList) {
        doSetRcvKey_NotInScope(rcvKeyList);
    }

    protected void doSetRcvKey_NotInScope(Collection<Long> rcvKeyList) {
        regINS(CK_NINS, cTL(rcvKeyList), xgetCValueRcvKey(), "RCV_KEY");
    }

    protected void regRcvKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvKey(), "RCV_KEY"); }
    protected abstract ConditionValue xgetCValueRcvKey();

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
    public HpSLCFunction<WPalletSymbolJtCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WPalletSymbolJtCB.class);
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
    public HpSLCFunction<WPalletSymbolJtCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WPalletSymbolJtCB.class);
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
    public HpSLCFunction<WPalletSymbolJtCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WPalletSymbolJtCB.class);
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
    public HpSLCFunction<WPalletSymbolJtCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WPalletSymbolJtCB.class);
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
    public HpSLCFunction<WPalletSymbolJtCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WPalletSymbolJtCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WPalletSymbolJtCB&gt;() {
     *     public void query(WPalletSymbolJtCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WPalletSymbolJtCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WPalletSymbolJtCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WPalletSymbolJtCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WPalletSymbolJtCQ sq);

    protected WPalletSymbolJtCB xcreateScalarConditionCB() {
        WPalletSymbolJtCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WPalletSymbolJtCB xcreateScalarConditionPartitionByCB() {
        WPalletSymbolJtCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WPalletSymbolJtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WPalletSymbolJtCB cb = new WPalletSymbolJtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WKSOJTKEY";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WPalletSymbolJtCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WPalletSymbolJtCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WPalletSymbolJtCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WPalletSymbolJtCB cb = new WPalletSymbolJtCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WKSOJTKEY";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WPalletSymbolJtCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WPalletSymbolJtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WPalletSymbolJtCB cb = new WPalletSymbolJtCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WPalletSymbolJtCQ sq);

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
    protected WPalletSymbolJtCB newMyCB() {
        return new WPalletSymbolJtCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WPalletSymbolJtCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of T_TRPALLETDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpalletdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpalletdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPALLETDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailId The value of trpalletdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_Equal(Long trpalletdetailId) {
        doSetTrpalletdetailId_Equal(trpalletdetailId);
    }

    protected void doSetTrpalletdetailId_Equal(Long trpalletdetailId) {
        regTrpalletdetailId(CK_EQ, trpalletdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailId The value of trpalletdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_NotEqual(Long trpalletdetailId) {
        doSetTrpalletdetailId_NotEqual(trpalletdetailId);
    }

    protected void doSetTrpalletdetailId_NotEqual(Long trpalletdetailId) {
        regTrpalletdetailId(CK_NES, trpalletdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailId The value of trpalletdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_GreaterThan(Long trpalletdetailId) {
        regTrpalletdetailId(CK_GT, trpalletdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailId The value of trpalletdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_LessThan(Long trpalletdetailId) {
        regTrpalletdetailId(CK_LT, trpalletdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailId The value of trpalletdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_GreaterEqual(Long trpalletdetailId) {
        regTrpalletdetailId(CK_GE, trpalletdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailId The value of trpalletdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_LessEqual(Long trpalletdetailId) {
        regTrpalletdetailId(CK_LE, trpalletdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trpalletdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletdetailId(), "TRPALLETDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailIdList The collection of trpalletdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_InScope(Collection<Long> trpalletdetailIdList) {
        doSetTrpalletdetailId_InScope(trpalletdetailIdList);
    }

    protected void doSetTrpalletdetailId_InScope(Collection<Long> trpalletdetailIdList) {
        regINS(CK_INS, cTL(trpalletdetailIdList), xgetCValueTrpalletdetailId(), "TRPALLETDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpalletdetailIdList The collection of trpalletdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletdetailId_NotInScope(Collection<Long> trpalletdetailIdList) {
        doSetTrpalletdetailId_NotInScope(trpalletdetailIdList);
    }

    protected void doSetTrpalletdetailId_NotInScope(Collection<Long> trpalletdetailIdList) {
        regINS(CK_NINS, cTL(trpalletdetailIdList), xgetCValueTrpalletdetailId(), "TRPALLETDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpalletdetailId_IsNull() { regTrpalletdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpalletdetailId_IsNotNull() { regTrpalletdetailId(CK_ISNN, DOBJ); }

    protected void regTrpalletdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpalletdetailId(), "TRPALLETDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrpalletdetailId();

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
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKey The value of palletDetailKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletDetailKey_Equal(Long palletDetailKey) {
        doSetPalletDetailKey_Equal(palletDetailKey);
    }

    protected void doSetPalletDetailKey_Equal(Long palletDetailKey) {
        regPalletDetailKey(CK_EQ, palletDetailKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKey The value of palletDetailKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletDetailKey_NotEqual(Long palletDetailKey) {
        doSetPalletDetailKey_NotEqual(palletDetailKey);
    }

    protected void doSetPalletDetailKey_NotEqual(Long palletDetailKey) {
        regPalletDetailKey(CK_NES, palletDetailKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKey The value of palletDetailKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletDetailKey_GreaterThan(Long palletDetailKey) {
        regPalletDetailKey(CK_GT, palletDetailKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKey The value of palletDetailKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletDetailKey_LessThan(Long palletDetailKey) {
        regPalletDetailKey(CK_LT, palletDetailKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKey The value of palletDetailKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletDetailKey_GreaterEqual(Long palletDetailKey) {
        regPalletDetailKey(CK_GE, palletDetailKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKey The value of palletDetailKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletDetailKey_LessEqual(Long palletDetailKey) {
        regPalletDetailKey(CK_LE, palletDetailKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of palletDetailKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletDetailKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletDetailKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletDetailKey(), "PALLET_DETAIL_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKeyList The collection of palletDetailKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletDetailKey_InScope(Collection<Long> palletDetailKeyList) {
        doSetPalletDetailKey_InScope(palletDetailKeyList);
    }

    protected void doSetPalletDetailKey_InScope(Collection<Long> palletDetailKeyList) {
        regINS(CK_INS, cTL(palletDetailKeyList), xgetCValuePalletDetailKey(), "PALLET_DETAIL_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @param palletDetailKeyList The collection of palletDetailKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletDetailKey_NotInScope(Collection<Long> palletDetailKeyList) {
        doSetPalletDetailKey_NotInScope(palletDetailKeyList);
    }

    protected void doSetPalletDetailKey_NotInScope(Collection<Long> palletDetailKeyList) {
        regINS(CK_NINS, cTL(palletDetailKeyList), xgetCValuePalletDetailKey(), "PALLET_DETAIL_KEY");
    }

    protected void regPalletDetailKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletDetailKey(), "PALLET_DETAIL_KEY"); }
    protected abstract ConditionValue xgetCValuePalletDetailKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_Equal(String inoutType) {
        doSetInoutType_Equal(fRES(inoutType));
    }

    protected void doSetInoutType_Equal(String inoutType) {
        regInoutType(CK_EQ, inoutType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual(String inoutType) {
        doSetInoutType_NotEqual(fRES(inoutType));
    }

    protected void doSetInoutType_NotEqual(String inoutType) {
        regInoutType(CK_NES, inoutType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_GreaterThan(String inoutType) {
        regInoutType(CK_GT, fRES(inoutType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_LessThan(String inoutType) {
        regInoutType(CK_LT, fRES(inoutType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_GreaterEqual(String inoutType) {
        regInoutType(CK_GE, fRES(inoutType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_LessEqual(String inoutType) {
        regInoutType(CK_LE, fRES(inoutType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutTypeList The collection of inoutType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope(Collection<String> inoutTypeList) {
        doSetInoutType_InScope(inoutTypeList);
    }

    protected void doSetInoutType_InScope(Collection<String> inoutTypeList) {
        regINS(CK_INS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutTypeList The collection of inoutType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope(Collection<String> inoutTypeList) {
        doSetInoutType_NotInScope(inoutTypeList);
    }

    protected void doSetInoutType_NotInScope(Collection<String> inoutTypeList) {
        regINS(CK_NINS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInoutType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inoutType The value of inoutType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInoutType_LikeSearch(String inoutType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inoutType), xgetCValueInoutType(), "INOUT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutType_NotLikeSearch(String inoutType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutType), xgetCValueInoutType(), "INOUT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @param inoutType The value of inoutType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_PrefixSearch(String inoutType) {
        setInoutType_LikeSearch(inoutType, xcLSOPPre());
    }

    protected void regInoutType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutType(), "INOUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInoutType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
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
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
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
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterThan(Long trpalletId) {
        regTrpalletId(CK_GT, trpalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessThan(Long trpalletId) {
        regTrpalletId(CK_LT, trpalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterEqual(Long trpalletId) {
        regTrpalletId(CK_GE, trpalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @param trpalletId The value of trpalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessEqual(Long trpalletId) {
        regTrpalletId(CK_LE, trpalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletId(), "TRPALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
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
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
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
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNo The value of basePalletNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletNo_Equal(java.math.BigDecimal basePalletNo) {
        doSetBasePalletNo_Equal(basePalletNo);
    }

    protected void doSetBasePalletNo_Equal(java.math.BigDecimal basePalletNo) {
        regBasePalletNo(CK_EQ, basePalletNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNo The value of basePalletNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletNo_NotEqual(java.math.BigDecimal basePalletNo) {
        doSetBasePalletNo_NotEqual(basePalletNo);
    }

    protected void doSetBasePalletNo_NotEqual(java.math.BigDecimal basePalletNo) {
        regBasePalletNo(CK_NES, basePalletNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNo The value of basePalletNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletNo_GreaterThan(java.math.BigDecimal basePalletNo) {
        regBasePalletNo(CK_GT, basePalletNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNo The value of basePalletNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletNo_LessThan(java.math.BigDecimal basePalletNo) {
        regBasePalletNo(CK_LT, basePalletNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNo The value of basePalletNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletNo_GreaterEqual(java.math.BigDecimal basePalletNo) {
        regBasePalletNo(CK_GE, basePalletNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNo The value of basePalletNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletNo_LessEqual(java.math.BigDecimal basePalletNo) {
        regBasePalletNo(CK_LE, basePalletNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param minNumber The min number of basePalletNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of basePalletNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBasePalletNo_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBasePalletNo(), "BASE_PALLET_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNoList The collection of basePalletNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBasePalletNo_InScope(Collection<java.math.BigDecimal> basePalletNoList) {
        doSetBasePalletNo_InScope(basePalletNoList);
    }

    protected void doSetBasePalletNo_InScope(Collection<java.math.BigDecimal> basePalletNoList) {
        regINS(CK_INS, cTL(basePalletNoList), xgetCValueBasePalletNo(), "BASE_PALLET_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @param basePalletNoList The collection of basePalletNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBasePalletNo_NotInScope(Collection<java.math.BigDecimal> basePalletNoList) {
        doSetBasePalletNo_NotInScope(basePalletNoList);
    }

    protected void doSetBasePalletNo_NotInScope(Collection<java.math.BigDecimal> basePalletNoList) {
        regINS(CK_NINS, cTL(basePalletNoList), xgetCValueBasePalletNo(), "BASE_PALLET_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     */
    public void setBasePalletNo_IsNull() { regBasePalletNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     */
    public void setBasePalletNo_IsNotNull() { regBasePalletNo(CK_ISNN, DOBJ); }

    protected void regBasePalletNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBasePalletNo(), "BASE_PALLET_NO"); }
    protected abstract ConditionValue xgetCValueBasePalletNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNo The value of divPalletNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivPalletNo_Equal(java.math.BigDecimal divPalletNo) {
        doSetDivPalletNo_Equal(divPalletNo);
    }

    protected void doSetDivPalletNo_Equal(java.math.BigDecimal divPalletNo) {
        regDivPalletNo(CK_EQ, divPalletNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNo The value of divPalletNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivPalletNo_NotEqual(java.math.BigDecimal divPalletNo) {
        doSetDivPalletNo_NotEqual(divPalletNo);
    }

    protected void doSetDivPalletNo_NotEqual(java.math.BigDecimal divPalletNo) {
        regDivPalletNo(CK_NES, divPalletNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNo The value of divPalletNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivPalletNo_GreaterThan(java.math.BigDecimal divPalletNo) {
        regDivPalletNo(CK_GT, divPalletNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNo The value of divPalletNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivPalletNo_LessThan(java.math.BigDecimal divPalletNo) {
        regDivPalletNo(CK_LT, divPalletNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNo The value of divPalletNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivPalletNo_GreaterEqual(java.math.BigDecimal divPalletNo) {
        regDivPalletNo(CK_GE, divPalletNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNo The value of divPalletNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivPalletNo_LessEqual(java.math.BigDecimal divPalletNo) {
        regDivPalletNo(CK_LE, divPalletNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param minNumber The min number of divPalletNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of divPalletNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDivPalletNo_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDivPalletNo(), "DIV_PALLET_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNoList The collection of divPalletNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivPalletNo_InScope(Collection<java.math.BigDecimal> divPalletNoList) {
        doSetDivPalletNo_InScope(divPalletNoList);
    }

    protected void doSetDivPalletNo_InScope(Collection<java.math.BigDecimal> divPalletNoList) {
        regINS(CK_INS, cTL(divPalletNoList), xgetCValueDivPalletNo(), "DIV_PALLET_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @param divPalletNoList The collection of divPalletNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivPalletNo_NotInScope(Collection<java.math.BigDecimal> divPalletNoList) {
        doSetDivPalletNo_NotInScope(divPalletNoList);
    }

    protected void doSetDivPalletNo_NotInScope(Collection<java.math.BigDecimal> divPalletNoList) {
        regINS(CK_NINS, cTL(divPalletNoList), xgetCValueDivPalletNo(), "DIV_PALLET_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     */
    public void setDivPalletNo_IsNull() { regDivPalletNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     */
    public void setDivPalletNo_IsNotNull() { regDivPalletNo(CK_ISNN, DOBJ); }

    protected void regDivPalletNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivPalletNo(), "DIV_PALLET_NO"); }
    protected abstract ConditionValue xgetCValueDivPalletNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_Equal(String workType) {
        doSetWorkType_Equal(fRES(workType));
    }

    protected void doSetWorkType_Equal(String workType) {
        regWorkType(CK_EQ, workType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_NotEqual(String workType) {
        doSetWorkType_NotEqual(fRES(workType));
    }

    protected void doSetWorkType_NotEqual(String workType) {
        regWorkType(CK_NES, workType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_GreaterThan(String workType) {
        regWorkType(CK_GT, fRES(workType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_LessThan(String workType) {
        regWorkType(CK_LT, fRES(workType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_GreaterEqual(String workType) {
        regWorkType(CK_GE, fRES(workType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_LessEqual(String workType) {
        regWorkType(CK_LE, fRES(workType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workTypeList The collection of workType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_InScope(Collection<String> workTypeList) {
        doSetWorkType_InScope(workTypeList);
    }

    protected void doSetWorkType_InScope(Collection<String> workTypeList) {
        regINS(CK_INS, cTL(workTypeList), xgetCValueWorkType(), "WORK_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workTypeList The collection of workType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_NotInScope(Collection<String> workTypeList) {
        doSetWorkType_NotInScope(workTypeList);
    }

    protected void doSetWorkType_NotInScope(Collection<String> workTypeList) {
        regINS(CK_NINS, cTL(workTypeList), xgetCValueWorkType(), "WORK_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setWorkType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workType The value of workType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkType_LikeSearch(String workType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workType), xgetCValueWorkType(), "WORK_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkType_NotLikeSearch(String workType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workType), xgetCValueWorkType(), "WORK_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @param workType The value of workType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkType_PrefixSearch(String workType) {
        setWorkType_LikeSearch(workType, xcLSOPPre());
    }

    protected void regWorkType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkType(), "WORK_TYPE"); }
    protected abstract ConditionValue xgetCValueWorkType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKey The value of workKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkKey_Equal(Long workKey) {
        doSetWorkKey_Equal(workKey);
    }

    protected void doSetWorkKey_Equal(Long workKey) {
        regWorkKey(CK_EQ, workKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKey The value of workKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkKey_NotEqual(Long workKey) {
        doSetWorkKey_NotEqual(workKey);
    }

    protected void doSetWorkKey_NotEqual(Long workKey) {
        regWorkKey(CK_NES, workKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKey The value of workKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkKey_GreaterThan(Long workKey) {
        regWorkKey(CK_GT, workKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKey The value of workKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkKey_LessThan(Long workKey) {
        regWorkKey(CK_LT, workKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKey The value of workKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkKey_GreaterEqual(Long workKey) {
        regWorkKey(CK_GE, workKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKey The value of workKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkKey_LessEqual(Long workKey) {
        regWorkKey(CK_LE, workKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param minNumber The min number of workKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkKey(), "WORK_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKeyList The collection of workKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkKey_InScope(Collection<Long> workKeyList) {
        doSetWorkKey_InScope(workKeyList);
    }

    protected void doSetWorkKey_InScope(Collection<Long> workKeyList) {
        regINS(CK_INS, cTL(workKeyList), xgetCValueWorkKey(), "WORK_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_KEY: {bigint(19)}
     * @param workKeyList The collection of workKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkKey_NotInScope(Collection<Long> workKeyList) {
        doSetWorkKey_NotInScope(workKeyList);
    }

    protected void doSetWorkKey_NotInScope(Collection<Long> workKeyList) {
        regINS(CK_NINS, cTL(workKeyList), xgetCValueWorkKey(), "WORK_KEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     */
    public void setWorkKey_IsNull() { regWorkKey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_KEY: {bigint(19)}
     */
    public void setWorkKey_IsNotNull() { regWorkKey(CK_ISNN, DOBJ); }

    protected void regWorkKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkKey(), "WORK_KEY"); }
    protected abstract ConditionValue xgetCValueWorkKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_Equal(String registrationDate) {
        doSetRegistrationDate_Equal(fRES(registrationDate));
    }

    protected void doSetRegistrationDate_Equal(String registrationDate) {
        regRegistrationDate(CK_EQ, registrationDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_NotEqual(String registrationDate) {
        doSetRegistrationDate_NotEqual(fRES(registrationDate));
    }

    protected void doSetRegistrationDate_NotEqual(String registrationDate) {
        regRegistrationDate(CK_NES, registrationDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_GreaterThan(String registrationDate) {
        regRegistrationDate(CK_GT, fRES(registrationDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_LessThan(String registrationDate) {
        regRegistrationDate(CK_LT, fRES(registrationDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_GreaterEqual(String registrationDate) {
        regRegistrationDate(CK_GE, fRES(registrationDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_LessEqual(String registrationDate) {
        regRegistrationDate(CK_LE, fRES(registrationDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDateList The collection of registrationDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_InScope(Collection<String> registrationDateList) {
        doSetRegistrationDate_InScope(registrationDateList);
    }

    protected void doSetRegistrationDate_InScope(Collection<String> registrationDateList) {
        regINS(CK_INS, cTL(registrationDateList), xgetCValueRegistrationDate(), "REGISTRATION_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDateList The collection of registrationDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_NotInScope(Collection<String> registrationDateList) {
        doSetRegistrationDate_NotInScope(registrationDateList);
    }

    protected void doSetRegistrationDate_NotInScope(Collection<String> registrationDateList) {
        regINS(CK_NINS, cTL(registrationDateList), xgetCValueRegistrationDate(), "REGISTRATION_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)} <br>
     * <pre>e.g. setRegistrationDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registrationDate The value of registrationDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegistrationDate_LikeSearch(String registrationDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registrationDate), xgetCValueRegistrationDate(), "REGISTRATION_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegistrationDate_NotLikeSearch(String registrationDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registrationDate), xgetCValueRegistrationDate(), "REGISTRATION_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @param registrationDate The value of registrationDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegistrationDate_PrefixSearch(String registrationDate) {
        setRegistrationDate_LikeSearch(registrationDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     */
    public void setRegistrationDate_IsNull() { regRegistrationDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     */
    public void setRegistrationDate_IsNullOrEmpty() { regRegistrationDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REGISTRATION_DATE: {varchar(8)}
     */
    public void setRegistrationDate_IsNotNull() { regRegistrationDate(CK_ISNN, DOBJ); }

    protected void regRegistrationDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegistrationDate(), "REGISTRATION_DATE"); }
    protected abstract ConditionValue xgetCValueRegistrationDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @param workDate The value of workDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDate_Equal(java.sql.Timestamp workDate) {
        regWorkDate(CK_EQ,  workDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @param workDate The value of workDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDate_GreaterThan(java.sql.Timestamp workDate) {
        regWorkDate(CK_GT,  workDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @param workDate The value of workDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDate_LessThan(java.sql.Timestamp workDate) {
        regWorkDate(CK_LT,  workDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @param workDate The value of workDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDate_GreaterEqual(java.sql.Timestamp workDate) {
        regWorkDate(CK_GE,  workDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @param workDate The value of workDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDate_LessEqual(java.sql.Timestamp workDate) {
        regWorkDate(CK_LE, workDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setWorkDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of workDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of workDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setWorkDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueWorkDate(), "WORK_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of workDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of workDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setWorkDate_DateFromTo(Date fromDate, Date toDate) {
        setWorkDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regWorkDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDate(), "WORK_DATE"); }
    protected abstract ConditionValue xgetCValueWorkDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)} <br>
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

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
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_Equal(String limitDate) {
        doSetLimitDate_Equal(fRES(limitDate));
    }

    protected void doSetLimitDate_Equal(String limitDate) {
        regLimitDate(CK_EQ, limitDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_NotEqual(String limitDate) {
        doSetLimitDate_NotEqual(fRES(limitDate));
    }

    protected void doSetLimitDate_NotEqual(String limitDate) {
        regLimitDate(CK_NES, limitDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_GreaterThan(String limitDate) {
        regLimitDate(CK_GT, fRES(limitDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_LessThan(String limitDate) {
        regLimitDate(CK_LT, fRES(limitDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_GreaterEqual(String limitDate) {
        regLimitDate(CK_GE, fRES(limitDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_LessEqual(String limitDate) {
        regLimitDate(CK_LE, fRES(limitDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDateList The collection of limitDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_InScope(Collection<String> limitDateList) {
        doSetLimitDate_InScope(limitDateList);
    }

    protected void doSetLimitDate_InScope(Collection<String> limitDateList) {
        regINS(CK_INS, cTL(limitDateList), xgetCValueLimitDate(), "LIMIT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDateList The collection of limitDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_NotInScope(Collection<String> limitDateList) {
        doSetLimitDate_NotInScope(limitDateList);
    }

    protected void doSetLimitDate_NotInScope(Collection<String> limitDateList) {
        regINS(CK_NINS, cTL(limitDateList), xgetCValueLimitDate(), "LIMIT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)} <br>
     * <pre>e.g. setLimitDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDate The value of limitDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDate_LikeSearch(String limitDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDate), xgetCValueLimitDate(), "LIMIT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDate_NotLikeSearch(String limitDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDate), xgetCValueLimitDate(), "LIMIT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_PrefixSearch(String limitDate) {
        setLimitDate_LikeSearch(limitDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     */
    public void setLimitDate_IsNull() { regLimitDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     */
    public void setLimitDate_IsNullOrEmpty() { regLimitDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     */
    public void setLimitDate_IsNotNull() { regLimitDate(CK_ISNN, DOBJ); }

    protected void regLimitDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDate(), "LIMIT_DATE"); }
    protected abstract ConditionValue xgetCValueLimitDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_Equal(String firmCarryNo) {
        doSetFirmCarryNo_Equal(fRES(firmCarryNo));
    }

    protected void doSetFirmCarryNo_Equal(String firmCarryNo) {
        regFirmCarryNo(CK_EQ, firmCarryNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_NotEqual(String firmCarryNo) {
        doSetFirmCarryNo_NotEqual(fRES(firmCarryNo));
    }

    protected void doSetFirmCarryNo_NotEqual(String firmCarryNo) {
        regFirmCarryNo(CK_NES, firmCarryNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_GreaterThan(String firmCarryNo) {
        regFirmCarryNo(CK_GT, fRES(firmCarryNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_LessThan(String firmCarryNo) {
        regFirmCarryNo(CK_LT, fRES(firmCarryNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_GreaterEqual(String firmCarryNo) {
        regFirmCarryNo(CK_GE, fRES(firmCarryNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_LessEqual(String firmCarryNo) {
        regFirmCarryNo(CK_LE, fRES(firmCarryNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNoList The collection of firmCarryNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_InScope(Collection<String> firmCarryNoList) {
        doSetFirmCarryNo_InScope(firmCarryNoList);
    }

    protected void doSetFirmCarryNo_InScope(Collection<String> firmCarryNoList) {
        regINS(CK_INS, cTL(firmCarryNoList), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNoList The collection of firmCarryNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_NotInScope(Collection<String> firmCarryNoList) {
        doSetFirmCarryNo_NotInScope(firmCarryNoList);
    }

    protected void doSetFirmCarryNo_NotInScope(Collection<String> firmCarryNoList) {
        regINS(CK_NINS, cTL(firmCarryNoList), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)} <br>
     * <pre>e.g. setFirmCarryNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmCarryNo The value of firmCarryNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmCarryNo_LikeSearch(String firmCarryNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmCarryNo), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmCarryNo_NotLikeSearch(String firmCarryNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmCarryNo), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_PrefixSearch(String firmCarryNo) {
        setFirmCarryNo_LikeSearch(firmCarryNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     */
    public void setFirmCarryNo_IsNull() { regFirmCarryNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     */
    public void setFirmCarryNo_IsNullOrEmpty() { regFirmCarryNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     */
    public void setFirmCarryNo_IsNotNull() { regFirmCarryNo(CK_ISNN, DOBJ); }

    protected void regFirmCarryNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmCarryNo(), "FIRM_CARRY_NO"); }
    protected abstract ConditionValue xgetCValueFirmCarryNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_Equal(String batArticleSign) {
        doSetBatArticleSign_Equal(fRES(batArticleSign));
    }

    protected void doSetBatArticleSign_Equal(String batArticleSign) {
        regBatArticleSign(CK_EQ, batArticleSign);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_NotEqual(String batArticleSign) {
        doSetBatArticleSign_NotEqual(fRES(batArticleSign));
    }

    protected void doSetBatArticleSign_NotEqual(String batArticleSign) {
        regBatArticleSign(CK_NES, batArticleSign);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_GreaterThan(String batArticleSign) {
        regBatArticleSign(CK_GT, fRES(batArticleSign));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_LessThan(String batArticleSign) {
        regBatArticleSign(CK_LT, fRES(batArticleSign));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_GreaterEqual(String batArticleSign) {
        regBatArticleSign(CK_GE, fRES(batArticleSign));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_LessEqual(String batArticleSign) {
        regBatArticleSign(CK_LE, fRES(batArticleSign));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSignList The collection of batArticleSign as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_InScope(Collection<String> batArticleSignList) {
        doSetBatArticleSign_InScope(batArticleSignList);
    }

    protected void doSetBatArticleSign_InScope(Collection<String> batArticleSignList) {
        regINS(CK_INS, cTL(batArticleSignList), xgetCValueBatArticleSign(), "BAT_ARTICLE_SIGN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSignList The collection of batArticleSign as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_NotInScope(Collection<String> batArticleSignList) {
        doSetBatArticleSign_NotInScope(batArticleSignList);
    }

    protected void doSetBatArticleSign_NotInScope(Collection<String> batArticleSignList) {
        regINS(CK_NINS, cTL(batArticleSignList), xgetCValueBatArticleSign(), "BAT_ARTICLE_SIGN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)} <br>
     * <pre>e.g. setBatArticleSign_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batArticleSign The value of batArticleSign as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatArticleSign_LikeSearch(String batArticleSign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batArticleSign), xgetCValueBatArticleSign(), "BAT_ARTICLE_SIGN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatArticleSign_NotLikeSearch(String batArticleSign, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batArticleSign), xgetCValueBatArticleSign(), "BAT_ARTICLE_SIGN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @param batArticleSign The value of batArticleSign as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatArticleSign_PrefixSearch(String batArticleSign) {
        setBatArticleSign_LikeSearch(batArticleSign, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     */
    public void setBatArticleSign_IsNull() { regBatArticleSign(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     */
    public void setBatArticleSign_IsNullOrEmpty() { regBatArticleSign(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     */
    public void setBatArticleSign_IsNotNull() { regBatArticleSign(CK_ISNN, DOBJ); }

    protected void regBatArticleSign(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatArticleSign(), "BAT_ARTICLE_SIGN"); }
    protected abstract ConditionValue xgetCValueBatArticleSign();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationId The value of moveBLlocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_Equal(Long moveBLlocationId) {
        doSetMoveBLlocationId_Equal(moveBLlocationId);
    }

    protected void doSetMoveBLlocationId_Equal(Long moveBLlocationId) {
        regMoveBLlocationId(CK_EQ, moveBLlocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationId The value of moveBLlocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_NotEqual(Long moveBLlocationId) {
        doSetMoveBLlocationId_NotEqual(moveBLlocationId);
    }

    protected void doSetMoveBLlocationId_NotEqual(Long moveBLlocationId) {
        regMoveBLlocationId(CK_NES, moveBLlocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationId The value of moveBLlocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_GreaterThan(Long moveBLlocationId) {
        regMoveBLlocationId(CK_GT, moveBLlocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationId The value of moveBLlocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_LessThan(Long moveBLlocationId) {
        regMoveBLlocationId(CK_LT, moveBLlocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationId The value of moveBLlocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_GreaterEqual(Long moveBLlocationId) {
        regMoveBLlocationId(CK_GE, moveBLlocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationId The value of moveBLlocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_LessEqual(Long moveBLlocationId) {
        regMoveBLlocationId(CK_LE, moveBLlocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param minNumber The min number of moveBLlocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveBLlocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveBLlocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveBLlocationId(), "MOVE_B_LLOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationIdList The collection of moveBLlocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_InScope(Collection<Long> moveBLlocationIdList) {
        doSetMoveBLlocationId_InScope(moveBLlocationIdList);
    }

    protected void doSetMoveBLlocationId_InScope(Collection<Long> moveBLlocationIdList) {
        regINS(CK_INS, cTL(moveBLlocationIdList), xgetCValueMoveBLlocationId(), "MOVE_B_LLOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @param moveBLlocationIdList The collection of moveBLlocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLlocationId_NotInScope(Collection<Long> moveBLlocationIdList) {
        doSetMoveBLlocationId_NotInScope(moveBLlocationIdList);
    }

    protected void doSetMoveBLlocationId_NotInScope(Collection<Long> moveBLlocationIdList) {
        regINS(CK_NINS, cTL(moveBLlocationIdList), xgetCValueMoveBLlocationId(), "MOVE_B_LLOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     */
    public void setMoveBLlocationId_IsNull() { regMoveBLlocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     */
    public void setMoveBLlocationId_IsNotNull() { regMoveBLlocationId(CK_ISNN, DOBJ); }

    protected void regMoveBLlocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveBLlocationId(), "MOVE_B_LLOCATION_ID"); }
    protected abstract ConditionValue xgetCValueMoveBLlocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_Equal(String moveBLocationCd) {
        doSetMoveBLocationCd_Equal(fRES(moveBLocationCd));
    }

    protected void doSetMoveBLocationCd_Equal(String moveBLocationCd) {
        regMoveBLocationCd(CK_EQ, moveBLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_NotEqual(String moveBLocationCd) {
        doSetMoveBLocationCd_NotEqual(fRES(moveBLocationCd));
    }

    protected void doSetMoveBLocationCd_NotEqual(String moveBLocationCd) {
        regMoveBLocationCd(CK_NES, moveBLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_GreaterThan(String moveBLocationCd) {
        regMoveBLocationCd(CK_GT, fRES(moveBLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_LessThan(String moveBLocationCd) {
        regMoveBLocationCd(CK_LT, fRES(moveBLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_GreaterEqual(String moveBLocationCd) {
        regMoveBLocationCd(CK_GE, fRES(moveBLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_LessEqual(String moveBLocationCd) {
        regMoveBLocationCd(CK_LE, fRES(moveBLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCdList The collection of moveBLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_InScope(Collection<String> moveBLocationCdList) {
        doSetMoveBLocationCd_InScope(moveBLocationCdList);
    }

    protected void doSetMoveBLocationCd_InScope(Collection<String> moveBLocationCdList) {
        regINS(CK_INS, cTL(moveBLocationCdList), xgetCValueMoveBLocationCd(), "MOVE_B_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCdList The collection of moveBLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_NotInScope(Collection<String> moveBLocationCdList) {
        doSetMoveBLocationCd_NotInScope(moveBLocationCdList);
    }

    protected void doSetMoveBLocationCd_NotInScope(Collection<String> moveBLocationCdList) {
        regINS(CK_NINS, cTL(moveBLocationCdList), xgetCValueMoveBLocationCd(), "MOVE_B_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setMoveBLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param moveBLocationCd The value of moveBLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMoveBLocationCd_LikeSearch(String moveBLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(moveBLocationCd), xgetCValueMoveBLocationCd(), "MOVE_B_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMoveBLocationCd_NotLikeSearch(String moveBLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(moveBLocationCd), xgetCValueMoveBLocationCd(), "MOVE_B_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @param moveBLocationCd The value of moveBLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveBLocationCd_PrefixSearch(String moveBLocationCd) {
        setMoveBLocationCd_LikeSearch(moveBLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     */
    public void setMoveBLocationCd_IsNull() { regMoveBLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     */
    public void setMoveBLocationCd_IsNullOrEmpty() { regMoveBLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     */
    public void setMoveBLocationCd_IsNotNull() { regMoveBLocationCd(CK_ISNN, DOBJ); }

    protected void regMoveBLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveBLocationCd(), "MOVE_B_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueMoveBLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationId The value of moveALocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveALocationId_Equal(Long moveALocationId) {
        doSetMoveALocationId_Equal(moveALocationId);
    }

    protected void doSetMoveALocationId_Equal(Long moveALocationId) {
        regMoveALocationId(CK_EQ, moveALocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationId The value of moveALocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveALocationId_NotEqual(Long moveALocationId) {
        doSetMoveALocationId_NotEqual(moveALocationId);
    }

    protected void doSetMoveALocationId_NotEqual(Long moveALocationId) {
        regMoveALocationId(CK_NES, moveALocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationId The value of moveALocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveALocationId_GreaterThan(Long moveALocationId) {
        regMoveALocationId(CK_GT, moveALocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationId The value of moveALocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveALocationId_LessThan(Long moveALocationId) {
        regMoveALocationId(CK_LT, moveALocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationId The value of moveALocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveALocationId_GreaterEqual(Long moveALocationId) {
        regMoveALocationId(CK_GE, moveALocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationId The value of moveALocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveALocationId_LessEqual(Long moveALocationId) {
        regMoveALocationId(CK_LE, moveALocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of moveALocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveALocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveALocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveALocationId(), "MOVE_A_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationIdList The collection of moveALocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationId_InScope(Collection<Long> moveALocationIdList) {
        doSetMoveALocationId_InScope(moveALocationIdList);
    }

    protected void doSetMoveALocationId_InScope(Collection<Long> moveALocationIdList) {
        regINS(CK_INS, cTL(moveALocationIdList), xgetCValueMoveALocationId(), "MOVE_A_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @param moveALocationIdList The collection of moveALocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationId_NotInScope(Collection<Long> moveALocationIdList) {
        doSetMoveALocationId_NotInScope(moveALocationIdList);
    }

    protected void doSetMoveALocationId_NotInScope(Collection<Long> moveALocationIdList) {
        regINS(CK_NINS, cTL(moveALocationIdList), xgetCValueMoveALocationId(), "MOVE_A_LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     */
    public void setMoveALocationId_IsNull() { regMoveALocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     */
    public void setMoveALocationId_IsNotNull() { regMoveALocationId(CK_ISNN, DOBJ); }

    protected void regMoveALocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveALocationId(), "MOVE_A_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueMoveALocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_Equal(String moveALocationCd) {
        doSetMoveALocationCd_Equal(fRES(moveALocationCd));
    }

    protected void doSetMoveALocationCd_Equal(String moveALocationCd) {
        regMoveALocationCd(CK_EQ, moveALocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_NotEqual(String moveALocationCd) {
        doSetMoveALocationCd_NotEqual(fRES(moveALocationCd));
    }

    protected void doSetMoveALocationCd_NotEqual(String moveALocationCd) {
        regMoveALocationCd(CK_NES, moveALocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_GreaterThan(String moveALocationCd) {
        regMoveALocationCd(CK_GT, fRES(moveALocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_LessThan(String moveALocationCd) {
        regMoveALocationCd(CK_LT, fRES(moveALocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_GreaterEqual(String moveALocationCd) {
        regMoveALocationCd(CK_GE, fRES(moveALocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_LessEqual(String moveALocationCd) {
        regMoveALocationCd(CK_LE, fRES(moveALocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCdList The collection of moveALocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_InScope(Collection<String> moveALocationCdList) {
        doSetMoveALocationCd_InScope(moveALocationCdList);
    }

    protected void doSetMoveALocationCd_InScope(Collection<String> moveALocationCdList) {
        regINS(CK_INS, cTL(moveALocationCdList), xgetCValueMoveALocationCd(), "MOVE_A_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCdList The collection of moveALocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_NotInScope(Collection<String> moveALocationCdList) {
        doSetMoveALocationCd_NotInScope(moveALocationCdList);
    }

    protected void doSetMoveALocationCd_NotInScope(Collection<String> moveALocationCdList) {
        regINS(CK_NINS, cTL(moveALocationCdList), xgetCValueMoveALocationCd(), "MOVE_A_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setMoveALocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param moveALocationCd The value of moveALocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMoveALocationCd_LikeSearch(String moveALocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(moveALocationCd), xgetCValueMoveALocationCd(), "MOVE_A_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMoveALocationCd_NotLikeSearch(String moveALocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(moveALocationCd), xgetCValueMoveALocationCd(), "MOVE_A_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @param moveALocationCd The value of moveALocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveALocationCd_PrefixSearch(String moveALocationCd) {
        setMoveALocationCd_LikeSearch(moveALocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     */
    public void setMoveALocationCd_IsNull() { regMoveALocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     */
    public void setMoveALocationCd_IsNullOrEmpty() { regMoveALocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     */
    public void setMoveALocationCd_IsNotNull() { regMoveALocationCd(CK_ISNN, DOBJ); }

    protected void regMoveALocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveALocationCd(), "MOVE_A_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueMoveALocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_Equal(java.math.BigDecimal instNum) {
        doSetInstNum_Equal(instNum);
    }

    protected void doSetInstNum_Equal(java.math.BigDecimal instNum) {
        regInstNum(CK_EQ, instNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_NotEqual(java.math.BigDecimal instNum) {
        doSetInstNum_NotEqual(instNum);
    }

    protected void doSetInstNum_NotEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_NES, instNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterThan(java.math.BigDecimal instNum) {
        regInstNum(CK_GT, instNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessThan(java.math.BigDecimal instNum) {
        regInstNum(CK_LT, instNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_GE, instNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_LE, instNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param minNumber The min number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstNum(), "INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNumList The collection of instNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_InScope(instNumList);
    }

    protected void doSetInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_INS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNumList The collection of instNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_NotInScope(instNumList);
    }

    protected void doSetInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_NINS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     */
    public void setInstNum_IsNull() { regInstNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     */
    public void setInstNum_IsNotNull() { regInstNum(CK_ISNN, DOBJ); }

    protected void regInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstNum(), "INST_NUM"); }
    protected abstract ConditionValue xgetCValueInstNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCase The value of restQtyCase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyCase_Equal(java.math.BigDecimal restQtyCase) {
        doSetRestQtyCase_Equal(restQtyCase);
    }

    protected void doSetRestQtyCase_Equal(java.math.BigDecimal restQtyCase) {
        regRestQtyCase(CK_EQ, restQtyCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCase The value of restQtyCase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyCase_NotEqual(java.math.BigDecimal restQtyCase) {
        doSetRestQtyCase_NotEqual(restQtyCase);
    }

    protected void doSetRestQtyCase_NotEqual(java.math.BigDecimal restQtyCase) {
        regRestQtyCase(CK_NES, restQtyCase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCase The value of restQtyCase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyCase_GreaterThan(java.math.BigDecimal restQtyCase) {
        regRestQtyCase(CK_GT, restQtyCase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCase The value of restQtyCase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyCase_LessThan(java.math.BigDecimal restQtyCase) {
        regRestQtyCase(CK_LT, restQtyCase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCase The value of restQtyCase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyCase_GreaterEqual(java.math.BigDecimal restQtyCase) {
        regRestQtyCase(CK_GE, restQtyCase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCase The value of restQtyCase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyCase_LessEqual(java.math.BigDecimal restQtyCase) {
        regRestQtyCase(CK_LE, restQtyCase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param minNumber The min number of restQtyCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restQtyCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestQtyCase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestQtyCase(), "REST_QTY_CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCaseList The collection of restQtyCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestQtyCase_InScope(Collection<java.math.BigDecimal> restQtyCaseList) {
        doSetRestQtyCase_InScope(restQtyCaseList);
    }

    protected void doSetRestQtyCase_InScope(Collection<java.math.BigDecimal> restQtyCaseList) {
        regINS(CK_INS, cTL(restQtyCaseList), xgetCValueRestQtyCase(), "REST_QTY_CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @param restQtyCaseList The collection of restQtyCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestQtyCase_NotInScope(Collection<java.math.BigDecimal> restQtyCaseList) {
        doSetRestQtyCase_NotInScope(restQtyCaseList);
    }

    protected void doSetRestQtyCase_NotInScope(Collection<java.math.BigDecimal> restQtyCaseList) {
        regINS(CK_NINS, cTL(restQtyCaseList), xgetCValueRestQtyCase(), "REST_QTY_CASE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     */
    public void setRestQtyCase_IsNull() { regRestQtyCase(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     */
    public void setRestQtyCase_IsNotNull() { regRestQtyCase(CK_ISNN, DOBJ); }

    protected void regRestQtyCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestQtyCase(), "REST_QTY_CASE"); }
    protected abstract ConditionValue xgetCValueRestQtyCase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowl The value of restQtyBowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyBowl_Equal(java.math.BigDecimal restQtyBowl) {
        doSetRestQtyBowl_Equal(restQtyBowl);
    }

    protected void doSetRestQtyBowl_Equal(java.math.BigDecimal restQtyBowl) {
        regRestQtyBowl(CK_EQ, restQtyBowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowl The value of restQtyBowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyBowl_NotEqual(java.math.BigDecimal restQtyBowl) {
        doSetRestQtyBowl_NotEqual(restQtyBowl);
    }

    protected void doSetRestQtyBowl_NotEqual(java.math.BigDecimal restQtyBowl) {
        regRestQtyBowl(CK_NES, restQtyBowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowl The value of restQtyBowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyBowl_GreaterThan(java.math.BigDecimal restQtyBowl) {
        regRestQtyBowl(CK_GT, restQtyBowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowl The value of restQtyBowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyBowl_LessThan(java.math.BigDecimal restQtyBowl) {
        regRestQtyBowl(CK_LT, restQtyBowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowl The value of restQtyBowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyBowl_GreaterEqual(java.math.BigDecimal restQtyBowl) {
        regRestQtyBowl(CK_GE, restQtyBowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowl The value of restQtyBowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQtyBowl_LessEqual(java.math.BigDecimal restQtyBowl) {
        regRestQtyBowl(CK_LE, restQtyBowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param minNumber The min number of restQtyBowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restQtyBowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestQtyBowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestQtyBowl(), "REST_QTY_BOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowlList The collection of restQtyBowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestQtyBowl_InScope(Collection<java.math.BigDecimal> restQtyBowlList) {
        doSetRestQtyBowl_InScope(restQtyBowlList);
    }

    protected void doSetRestQtyBowl_InScope(Collection<java.math.BigDecimal> restQtyBowlList) {
        regINS(CK_INS, cTL(restQtyBowlList), xgetCValueRestQtyBowl(), "REST_QTY_BOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @param restQtyBowlList The collection of restQtyBowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestQtyBowl_NotInScope(Collection<java.math.BigDecimal> restQtyBowlList) {
        doSetRestQtyBowl_NotInScope(restQtyBowlList);
    }

    protected void doSetRestQtyBowl_NotInScope(Collection<java.math.BigDecimal> restQtyBowlList) {
        regINS(CK_NINS, cTL(restQtyBowlList), xgetCValueRestQtyBowl(), "REST_QTY_BOWL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     */
    public void setRestQtyBowl_IsNull() { regRestQtyBowl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     */
    public void setRestQtyBowl_IsNotNull() { regRestQtyBowl(CK_ISNN, DOBJ); }

    protected void regRestQtyBowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestQtyBowl(), "REST_QTY_BOWL"); }
    protected abstract ConditionValue xgetCValueRestQtyBowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQty The value of restQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQty_Equal(java.math.BigDecimal restQty) {
        doSetRestQty_Equal(restQty);
    }

    protected void doSetRestQty_Equal(java.math.BigDecimal restQty) {
        regRestQty(CK_EQ, restQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQty The value of restQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQty_NotEqual(java.math.BigDecimal restQty) {
        doSetRestQty_NotEqual(restQty);
    }

    protected void doSetRestQty_NotEqual(java.math.BigDecimal restQty) {
        regRestQty(CK_NES, restQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQty The value of restQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQty_GreaterThan(java.math.BigDecimal restQty) {
        regRestQty(CK_GT, restQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQty The value of restQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQty_LessThan(java.math.BigDecimal restQty) {
        regRestQty(CK_LT, restQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQty The value of restQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQty_GreaterEqual(java.math.BigDecimal restQty) {
        regRestQty(CK_GE, restQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQty The value of restQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestQty_LessEqual(java.math.BigDecimal restQty) {
        regRestQty(CK_LE, restQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param minNumber The min number of restQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestQty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestQty(), "REST_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQtyList The collection of restQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestQty_InScope(Collection<java.math.BigDecimal> restQtyList) {
        doSetRestQty_InScope(restQtyList);
    }

    protected void doSetRestQty_InScope(Collection<java.math.BigDecimal> restQtyList) {
        regINS(CK_INS, cTL(restQtyList), xgetCValueRestQty(), "REST_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     * @param restQtyList The collection of restQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestQty_NotInScope(Collection<java.math.BigDecimal> restQtyList) {
        doSetRestQty_NotInScope(restQtyList);
    }

    protected void doSetRestQty_NotInScope(Collection<java.math.BigDecimal> restQtyList) {
        regINS(CK_NINS, cTL(restQtyList), xgetCValueRestQty(), "REST_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     */
    public void setRestQty_IsNull() { regRestQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REST_QTY: {decimal(16, 6)}
     */
    public void setRestQty_IsNotNull() { regRestQty(CK_ISNN, DOBJ); }

    protected void regRestQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestQty(), "REST_QTY"); }
    protected abstract ConditionValue xgetCValueRestQty();

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
    public HpSLCFunction<TTrpalletdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpalletdetailCB.class);
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
    public HpSLCFunction<TTrpalletdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpalletdetailCB.class);
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
    public HpSLCFunction<TTrpalletdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpalletdetailCB.class);
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
    public HpSLCFunction<TTrpalletdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpalletdetailCB.class);
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
    public HpSLCFunction<TTrpalletdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpalletdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpalletdetailCB&gt;() {
     *     public void query(TTrpalletdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpalletdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpalletdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpalletdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpalletdetailCQ sq);

    protected TTrpalletdetailCB xcreateScalarConditionCB() {
        TTrpalletdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpalletdetailCB xcreateScalarConditionPartitionByCB() {
        TTrpalletdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpalletdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpalletdetailCB cb = new TTrpalletdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRPALLETDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpalletdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpalletdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpalletdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpalletdetailCB cb = new TTrpalletdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRPALLETDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpalletdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpalletdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpalletdetailCB cb = new TTrpalletdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpalletdetailCQ sq);

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
    protected TTrpalletdetailCB newMyCB() {
        return new TTrpalletdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpalletdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

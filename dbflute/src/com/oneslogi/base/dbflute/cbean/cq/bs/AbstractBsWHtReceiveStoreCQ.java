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
 * The abstract condition-query of W_HT_RECEIVE_STORE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWHtReceiveStoreCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWHtReceiveStoreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_HT_RECEIVE_STORE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreId The value of htReceiveStoreId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_Equal(Long htReceiveStoreId) {
        doSetHtReceiveStoreId_Equal(htReceiveStoreId);
    }

    protected void doSetHtReceiveStoreId_Equal(Long htReceiveStoreId) {
        regHtReceiveStoreId(CK_EQ, htReceiveStoreId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreId The value of htReceiveStoreId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_NotEqual(Long htReceiveStoreId) {
        doSetHtReceiveStoreId_NotEqual(htReceiveStoreId);
    }

    protected void doSetHtReceiveStoreId_NotEqual(Long htReceiveStoreId) {
        regHtReceiveStoreId(CK_NES, htReceiveStoreId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreId The value of htReceiveStoreId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_GreaterThan(Long htReceiveStoreId) {
        regHtReceiveStoreId(CK_GT, htReceiveStoreId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreId The value of htReceiveStoreId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_LessThan(Long htReceiveStoreId) {
        regHtReceiveStoreId(CK_LT, htReceiveStoreId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreId The value of htReceiveStoreId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_GreaterEqual(Long htReceiveStoreId) {
        regHtReceiveStoreId(CK_GE, htReceiveStoreId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreId The value of htReceiveStoreId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_LessEqual(Long htReceiveStoreId) {
        regHtReceiveStoreId(CK_LE, htReceiveStoreId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of htReceiveStoreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of htReceiveStoreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHtReceiveStoreId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHtReceiveStoreId(), "HT_RECEIVE_STORE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreIdList The collection of htReceiveStoreId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_InScope(Collection<Long> htReceiveStoreIdList) {
        doSetHtReceiveStoreId_InScope(htReceiveStoreIdList);
    }

    protected void doSetHtReceiveStoreId_InScope(Collection<Long> htReceiveStoreIdList) {
        regINS(CK_INS, cTL(htReceiveStoreIdList), xgetCValueHtReceiveStoreId(), "HT_RECEIVE_STORE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param htReceiveStoreIdList The collection of htReceiveStoreId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtReceiveStoreId_NotInScope(Collection<Long> htReceiveStoreIdList) {
        doSetHtReceiveStoreId_NotInScope(htReceiveStoreIdList);
    }

    protected void doSetHtReceiveStoreId_NotInScope(Collection<Long> htReceiveStoreIdList) {
        regINS(CK_NINS, cTL(htReceiveStoreIdList), xgetCValueHtReceiveStoreId(), "HT_RECEIVE_STORE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setHtReceiveStoreId_IsNull() { regHtReceiveStoreId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setHtReceiveStoreId_IsNotNull() { regHtReceiveStoreId(CK_ISNN, DOBJ); }

    protected void regHtReceiveStoreId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtReceiveStoreId(), "HT_RECEIVE_STORE_ID"); }
    protected abstract ConditionValue xgetCValueHtReceiveStoreId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_Equal(String macAddress) {
        doSetMacAddress_Equal(fRES(macAddress));
    }

    protected void doSetMacAddress_Equal(String macAddress) {
        regMacAddress(CK_EQ, macAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_NotEqual(String macAddress) {
        doSetMacAddress_NotEqual(fRES(macAddress));
    }

    protected void doSetMacAddress_NotEqual(String macAddress) {
        regMacAddress(CK_NES, macAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_GreaterThan(String macAddress) {
        regMacAddress(CK_GT, fRES(macAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_LessThan(String macAddress) {
        regMacAddress(CK_LT, fRES(macAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_GreaterEqual(String macAddress) {
        regMacAddress(CK_GE, fRES(macAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_LessEqual(String macAddress) {
        regMacAddress(CK_LE, fRES(macAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddressList The collection of macAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_InScope(Collection<String> macAddressList) {
        doSetMacAddress_InScope(macAddressList);
    }

    protected void doSetMacAddress_InScope(Collection<String> macAddressList) {
        regINS(CK_INS, cTL(macAddressList), xgetCValueMacAddress(), "MAC_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddressList The collection of macAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_NotInScope(Collection<String> macAddressList) {
        doSetMacAddress_NotInScope(macAddressList);
    }

    protected void doSetMacAddress_NotInScope(Collection<String> macAddressList) {
        regINS(CK_NINS, cTL(macAddressList), xgetCValueMacAddress(), "MAC_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setMacAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param macAddress The value of macAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMacAddress_LikeSearch(String macAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(macAddress), xgetCValueMacAddress(), "MAC_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMacAddress_NotLikeSearch(String macAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(macAddress), xgetCValueMacAddress(), "MAC_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @param macAddress The value of macAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_PrefixSearch(String macAddress) {
        setMacAddress_LikeSearch(macAddress, xcLSOPPre());
    }

    protected void regMacAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMacAddress(), "MAC_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMacAddress();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_Equal(Long warehouseId) {
        doSetWarehouseId_Equal(warehouseId);
    }

    protected void doSetWarehouseId_Equal(Long warehouseId) {
        regWarehouseId(CK_EQ, warehouseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_NotEqual(Long warehouseId) {
        doSetWarehouseId_NotEqual(warehouseId);
    }

    protected void doSetWarehouseId_NotEqual(Long warehouseId) {
        regWarehouseId(CK_NES, warehouseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterThan(Long warehouseId) {
        regWarehouseId(CK_GT, warehouseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessThan(Long warehouseId) {
        regWarehouseId(CK_LT, warehouseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterEqual(Long warehouseId) {
        regWarehouseId(CK_GE, warehouseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessEqual(Long warehouseId) {
        regWarehouseId(CK_LE, warehouseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param minNumber The min number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseId(), "WAREHOUSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseIdList The collection of warehouseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseId_InScope(Collection<Long> warehouseIdList) {
        doSetWarehouseId_InScope(warehouseIdList);
    }

    protected void doSetWarehouseId_InScope(Collection<Long> warehouseIdList) {
        regINS(CK_INS, cTL(warehouseIdList), xgetCValueWarehouseId(), "WAREHOUSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @param warehouseIdList The collection of warehouseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseId_NotInScope(Collection<Long> warehouseIdList) {
        doSetWarehouseId_NotInScope(warehouseIdList);
    }

    protected void doSetWarehouseId_NotInScope(Collection<Long> warehouseIdList) {
        regINS(CK_NINS, cTL(warehouseIdList), xgetCValueWarehouseId(), "WAREHOUSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WAREHOUSE_ID from M_WAREHOUSE where ...)} <br />
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'in-scope'. (NotNull)
     */
    public void inScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWarehouseId_InScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", false);
    }
    public abstract String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WAREHOUSE_ID from M_WAREHOUSE where ...)} <br />
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWarehouseId_NotInScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", true);
    }
    public abstract String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     */
    public void setWarehouseId_IsNull() { regWarehouseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     */
    public void setWarehouseId_IsNotNull() { regWarehouseId(CK_ISNN, DOBJ); }

    protected void regWarehouseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseId(), "WAREHOUSE_ID"); }
    protected abstract ConditionValue xgetCValueWarehouseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locId The value of locId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocId_Equal(Long locId) {
        doSetLocId_Equal(locId);
    }

    protected void doSetLocId_Equal(Long locId) {
        regLocId(CK_EQ, locId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locId The value of locId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocId_NotEqual(Long locId) {
        doSetLocId_NotEqual(locId);
    }

    protected void doSetLocId_NotEqual(Long locId) {
        regLocId(CK_NES, locId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locId The value of locId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocId_GreaterThan(Long locId) {
        regLocId(CK_GT, locId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locId The value of locId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocId_LessThan(Long locId) {
        regLocId(CK_LT, locId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locId The value of locId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocId_GreaterEqual(Long locId) {
        regLocId(CK_GE, locId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locId The value of locId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocId_LessEqual(Long locId) {
        regLocId(CK_LE, locId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param minNumber The min number of locId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocId(), "LOC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locIdList The collection of locId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocId_InScope(Collection<Long> locIdList) {
        doSetLocId_InScope(locIdList);
    }

    protected void doSetLocId_InScope(Collection<Long> locIdList) {
        regINS(CK_INS, cTL(locIdList), xgetCValueLocId(), "LOC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     * @param locIdList The collection of locId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocId_NotInScope(Collection<Long> locIdList) {
        doSetLocId_NotInScope(locIdList);
    }

    protected void doSetLocId_NotInScope(Collection<Long> locIdList) {
        regINS(CK_NINS, cTL(locIdList), xgetCValueLocId(), "LOC_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOC_ID from M_LOCATION where ...)} <br />
     * M_LOCATION by my LOC_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOC_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepLocId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOC_ID from M_LOCATION where ...)} <br />
     * M_LOCATION by my LOC_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOC_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepLocId_NotInScopeRelation_MLocation(MLocationCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     */
    public void setLocId_IsNull() { regLocId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOC_ID: {bigint(19), FK to M_LOCATION}
     */
    public void setLocId_IsNotNull() { regLocId(CK_ISNN, DOBJ); }

    protected void regLocId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocId(), "LOC_ID"); }
    protected abstract ConditionValue xgetCValueLocId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_Equal(String locCd) {
        doSetLocCd_Equal(fRES(locCd));
    }

    protected void doSetLocCd_Equal(String locCd) {
        regLocCd(CK_EQ, locCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_NotEqual(String locCd) {
        doSetLocCd_NotEqual(fRES(locCd));
    }

    protected void doSetLocCd_NotEqual(String locCd) {
        regLocCd(CK_NES, locCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_GreaterThan(String locCd) {
        regLocCd(CK_GT, fRES(locCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_LessThan(String locCd) {
        regLocCd(CK_LT, fRES(locCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_GreaterEqual(String locCd) {
        regLocCd(CK_GE, fRES(locCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_LessEqual(String locCd) {
        regLocCd(CK_LE, fRES(locCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCdList The collection of locCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_InScope(Collection<String> locCdList) {
        doSetLocCd_InScope(locCdList);
    }

    protected void doSetLocCd_InScope(Collection<String> locCdList) {
        regINS(CK_INS, cTL(locCdList), xgetCValueLocCd(), "LOC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCdList The collection of locCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_NotInScope(Collection<String> locCdList) {
        doSetLocCd_NotInScope(locCdList);
    }

    protected void doSetLocCd_NotInScope(Collection<String> locCdList) {
        regINS(CK_NINS, cTL(locCdList), xgetCValueLocCd(), "LOC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(30)} <br>
     * <pre>e.g. setLocCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locCd The value of locCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocCd_LikeSearch(String locCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locCd), xgetCValueLocCd(), "LOC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocCd_NotLikeSearch(String locCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locCd), xgetCValueLocCd(), "LOC_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(30)}
     * @param locCd The value of locCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_PrefixSearch(String locCd) {
        setLocCd_LikeSearch(locCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     */
    public void setLocCd_IsNull() { regLocCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     */
    public void setLocCd_IsNullOrEmpty() { regLocCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(30)}
     */
    public void setLocCd_IsNotNull() { regLocCd(CK_ISNN, DOBJ); }

    protected void regLocCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocCd(), "LOC_CD"); }
    protected abstract ConditionValue xgetCValueLocCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_Equal(String locNm) {
        doSetLocNm_Equal(fRES(locNm));
    }

    protected void doSetLocNm_Equal(String locNm) {
        regLocNm(CK_EQ, locNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_NotEqual(String locNm) {
        doSetLocNm_NotEqual(fRES(locNm));
    }

    protected void doSetLocNm_NotEqual(String locNm) {
        regLocNm(CK_NES, locNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_GreaterThan(String locNm) {
        regLocNm(CK_GT, fRES(locNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_LessThan(String locNm) {
        regLocNm(CK_LT, fRES(locNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_GreaterEqual(String locNm) {
        regLocNm(CK_GE, fRES(locNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_LessEqual(String locNm) {
        regLocNm(CK_LE, fRES(locNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNmList The collection of locNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_InScope(Collection<String> locNmList) {
        doSetLocNm_InScope(locNmList);
    }

    protected void doSetLocNm_InScope(Collection<String> locNmList) {
        regINS(CK_INS, cTL(locNmList), xgetCValueLocNm(), "LOC_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNmList The collection of locNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_NotInScope(Collection<String> locNmList) {
        doSetLocNm_NotInScope(locNmList);
    }

    protected void doSetLocNm_NotInScope(Collection<String> locNmList) {
        regINS(CK_NINS, cTL(locNmList), xgetCValueLocNm(), "LOC_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_NM: {varchar(60)} <br>
     * <pre>e.g. setLocNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locNm The value of locNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocNm_LikeSearch(String locNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locNm), xgetCValueLocNm(), "LOC_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocNm_NotLikeSearch(String locNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locNm), xgetCValueLocNm(), "LOC_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_NM: {varchar(60)}
     * @param locNm The value of locNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocNm_PrefixSearch(String locNm) {
        setLocNm_LikeSearch(locNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     */
    public void setLocNm_IsNull() { regLocNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     */
    public void setLocNm_IsNullOrEmpty() { regLocNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOC_NM: {varchar(60)}
     */
    public void setLocNm_IsNotNull() { regLocNm(CK_ISNN, DOBJ); }

    protected void regLocNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocNm(), "LOC_NM"); }
    protected abstract ConditionValue xgetCValueLocNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_Equal(String janCd) {
        doSetJanCd_Equal(fRES(janCd));
    }

    protected void doSetJanCd_Equal(String janCd) {
        regJanCd(CK_EQ, janCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotEqual(String janCd) {
        doSetJanCd_NotEqual(fRES(janCd));
    }

    protected void doSetJanCd_NotEqual(String janCd) {
        regJanCd(CK_NES, janCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCdList The collection of janCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_InScope(Collection<String> janCdList) {
        doSetJanCd_InScope(janCdList);
    }

    protected void doSetJanCd_InScope(Collection<String> janCdList) {
        regINS(CK_INS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCdList The collection of janCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotInScope(Collection<String> janCdList) {
        doSetJanCd_NotInScope(janCdList);
    }

    protected void doSetJanCd_NotInScope(Collection<String> janCdList) {
        regINS(CK_NINS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {varchar(30)} <br>
     * <pre>e.g. setJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param janCd The value of janCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJanCd_LikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {varchar(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {varchar(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

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
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_Equal(String productNm) {
        doSetProductNm_Equal(fRES(productNm));
    }

    protected void doSetProductNm_Equal(String productNm) {
        regProductNm(CK_EQ, productNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotEqual(String productNm) {
        doSetProductNm_NotEqual(fRES(productNm));
    }

    protected void doSetProductNm_NotEqual(String productNm) {
        regProductNm(CK_NES, productNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNmList The collection of productNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_InScope(Collection<String> productNmList) {
        doSetProductNm_InScope(productNmList);
    }

    protected void doSetProductNm_InScope(Collection<String> productNmList) {
        regINS(CK_INS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNmList The collection of productNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotInScope(Collection<String> productNmList) {
        doSetProductNm_NotInScope(productNmList);
    }

    protected void doSetProductNm_NotInScope(Collection<String> productNmList) {
        regINS(CK_NINS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)} <br>
     * <pre>e.g. setProductNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNm The value of productNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNm_LikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNull() { regProductNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNullOrEmpty() { regProductNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNotNull() { regProductNm(CK_ISNN, DOBJ); }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_Equal(Long stockTypeId) {
        doSetStockTypeId_Equal(stockTypeId);
    }

    protected void doSetStockTypeId_Equal(Long stockTypeId) {
        regStockTypeId(CK_EQ, stockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_NotEqual(Long stockTypeId) {
        doSetStockTypeId_NotEqual(stockTypeId);
    }

    protected void doSetStockTypeId_NotEqual(Long stockTypeId) {
        regStockTypeId(CK_NES, stockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterThan(Long stockTypeId) {
        regStockTypeId(CK_GT, stockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessThan(Long stockTypeId) {
        regStockTypeId(CK_LT, stockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterEqual(Long stockTypeId) {
        regStockTypeId(CK_GE, stockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessEqual(Long stockTypeId) {
        regStockTypeId(CK_LE, stockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param minNumber The min number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockTypeId(), "STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeIdList The collection of stockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_InScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        regINS(CK_INS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeIdList The collection of stockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_NotInScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        regINS(CK_NINS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_TYPE_ID from M_STOCK_TYPE where ...)} <br />
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_TYPE_ID from M_STOCK_TYPE where ...)} <br />
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     */
    public void setStockTypeId_IsNull() { regStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     */
    public void setStockTypeId_IsNotNull() { regStockTypeId(CK_ISNN, DOBJ); }

    protected void regStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeId(), "STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueStockTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_Equal(String stkClsNm) {
        doSetStkClsNm_Equal(fRES(stkClsNm));
    }

    protected void doSetStkClsNm_Equal(String stkClsNm) {
        regStkClsNm(CK_EQ, stkClsNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_NotEqual(String stkClsNm) {
        doSetStkClsNm_NotEqual(fRES(stkClsNm));
    }

    protected void doSetStkClsNm_NotEqual(String stkClsNm) {
        regStkClsNm(CK_NES, stkClsNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_GreaterThan(String stkClsNm) {
        regStkClsNm(CK_GT, fRES(stkClsNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_LessThan(String stkClsNm) {
        regStkClsNm(CK_LT, fRES(stkClsNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_GreaterEqual(String stkClsNm) {
        regStkClsNm(CK_GE, fRES(stkClsNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_LessEqual(String stkClsNm) {
        regStkClsNm(CK_LE, fRES(stkClsNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNmList The collection of stkClsNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_InScope(Collection<String> stkClsNmList) {
        doSetStkClsNm_InScope(stkClsNmList);
    }

    protected void doSetStkClsNm_InScope(Collection<String> stkClsNmList) {
        regINS(CK_INS, cTL(stkClsNmList), xgetCValueStkClsNm(), "STK_CLS_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNmList The collection of stkClsNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_NotInScope(Collection<String> stkClsNmList) {
        doSetStkClsNm_NotInScope(stkClsNmList);
    }

    protected void doSetStkClsNm_NotInScope(Collection<String> stkClsNmList) {
        regINS(CK_NINS, cTL(stkClsNmList), xgetCValueStkClsNm(), "STK_CLS_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STK_CLS_NM: {varchar(60)} <br>
     * <pre>e.g. setStkClsNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stkClsNm The value of stkClsNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStkClsNm_LikeSearch(String stkClsNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stkClsNm), xgetCValueStkClsNm(), "STK_CLS_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStkClsNm_NotLikeSearch(String stkClsNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stkClsNm), xgetCValueStkClsNm(), "STK_CLS_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     * @param stkClsNm The value of stkClsNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStkClsNm_PrefixSearch(String stkClsNm) {
        setStkClsNm_LikeSearch(stkClsNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     */
    public void setStkClsNm_IsNull() { regStkClsNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     */
    public void setStkClsNm_IsNullOrEmpty() { regStkClsNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STK_CLS_NM: {varchar(60)}
     */
    public void setStkClsNm_IsNotNull() { regStkClsNm(CK_ISNN, DOBJ); }

    protected void regStkClsNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStkClsNm(), "STK_CLS_NM"); }
    protected abstract ConditionValue xgetCValueStkClsNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_Equal(java.math.BigDecimal storeNum) {
        doSetStoreNum_Equal(storeNum);
    }

    protected void doSetStoreNum_Equal(java.math.BigDecimal storeNum) {
        regStoreNum(CK_EQ, storeNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_NotEqual(java.math.BigDecimal storeNum) {
        doSetStoreNum_NotEqual(storeNum);
    }

    protected void doSetStoreNum_NotEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_NES, storeNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_GreaterThan(java.math.BigDecimal storeNum) {
        regStoreNum(CK_GT, storeNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_LessThan(java.math.BigDecimal storeNum) {
        regStoreNum(CK_LT, storeNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_GreaterEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_GE, storeNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_LessEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_LE, storeNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param minNumber The min number of storeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNum(), "STORE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNumList The collection of storeNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNum_InScope(Collection<java.math.BigDecimal> storeNumList) {
        doSetStoreNum_InScope(storeNumList);
    }

    protected void doSetStoreNum_InScope(Collection<java.math.BigDecimal> storeNumList) {
        regINS(CK_INS, cTL(storeNumList), xgetCValueStoreNum(), "STORE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNumList The collection of storeNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNum_NotInScope(Collection<java.math.BigDecimal> storeNumList) {
        doSetStoreNum_NotInScope(storeNumList);
    }

    protected void doSetStoreNum_NotInScope(Collection<java.math.BigDecimal> storeNumList) {
        regINS(CK_NINS, cTL(storeNumList), xgetCValueStoreNum(), "STORE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     */
    public void setStoreNum_IsNull() { regStoreNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     */
    public void setStoreNum_IsNotNull() { regStoreNum(CK_ISNN, DOBJ); }

    protected void regStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNum(), "STORE_NUM"); }
    protected abstract ConditionValue xgetCValueStoreNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_Equal(String onsNum) {
        doSetOnsNum_Equal(fRES(onsNum));
    }

    protected void doSetOnsNum_Equal(String onsNum) {
        regOnsNum(CK_EQ, onsNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_NotEqual(String onsNum) {
        doSetOnsNum_NotEqual(fRES(onsNum));
    }

    protected void doSetOnsNum_NotEqual(String onsNum) {
        regOnsNum(CK_NES, onsNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_GreaterThan(String onsNum) {
        regOnsNum(CK_GT, fRES(onsNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_LessThan(String onsNum) {
        regOnsNum(CK_LT, fRES(onsNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_GreaterEqual(String onsNum) {
        regOnsNum(CK_GE, fRES(onsNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_LessEqual(String onsNum) {
        regOnsNum(CK_LE, fRES(onsNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNumList The collection of onsNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_InScope(Collection<String> onsNumList) {
        doSetOnsNum_InScope(onsNumList);
    }

    protected void doSetOnsNum_InScope(Collection<String> onsNumList) {
        regINS(CK_INS, cTL(onsNumList), xgetCValueOnsNum(), "ONS_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNumList The collection of onsNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_NotInScope(Collection<String> onsNumList) {
        doSetOnsNum_NotInScope(onsNumList);
    }

    protected void doSetOnsNum_NotInScope(Collection<String> onsNumList) {
        regINS(CK_NINS, cTL(onsNumList), xgetCValueOnsNum(), "ONS_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONS_NUM: {varchar(30)} <br>
     * <pre>e.g. setOnsNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param onsNum The value of onsNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOnsNum_LikeSearch(String onsNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(onsNum), xgetCValueOnsNum(), "ONS_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOnsNum_NotLikeSearch(String onsNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(onsNum), xgetCValueOnsNum(), "ONS_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONS_NUM: {varchar(30)}
     * @param onsNum The value of onsNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnsNum_PrefixSearch(String onsNum) {
        setOnsNum_LikeSearch(onsNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     */
    public void setOnsNum_IsNull() { regOnsNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     */
    public void setOnsNum_IsNullOrEmpty() { regOnsNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONS_NUM: {varchar(30)}
     */
    public void setOnsNum_IsNotNull() { regOnsNum(CK_ISNN, DOBJ); }

    protected void regOnsNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnsNum(), "ONS_NUM"); }
    protected abstract ConditionValue xgetCValueOnsNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
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
     * LOT_ID: {bigint(19), FK to T_LOT}
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
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
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
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOT_ID from T_LOT where ...)} <br />
     * T_LOT by my LOT_ID, named 'TLot'.
     * @param subCBLambda The callback for sub-query of TLot for 'in-scope'. (NotNull)
     */
    public void inScopeTLot(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLotId_InScopeRelation_TLot(cb.query());
        registerInScopeRelation(cb.query(), "LOT_ID", "LOT_ID", pp, "tLot", false);
    }
    public abstract String keepLotId_InScopeRelation_TLot(TLotCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOT_ID from T_LOT where ...)} <br />
     * T_LOT by my LOT_ID, named 'TLot'.
     * @param subCBLambda The callback for sub-query of TLot for 'not in-scope'. (NotNull)
     */
    public void notInScopeTLot(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLotId_NotInScopeRelation_TLot(cb.query());
        registerInScopeRelation(cb.query(), "LOT_ID", "LOT_ID", pp, "tLot", true);
    }
    public abstract String keepLotId_NotInScopeRelation_TLot(TLotCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_Equal(String lot) {
        doSetLot_Equal(fRES(lot));
    }

    protected void doSetLot_Equal(String lot) {
        regLot(CK_EQ, lot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotEqual(String lot) {
        doSetLot_NotEqual(fRES(lot));
    }

    protected void doSetLot_NotEqual(String lot) {
        regLot(CK_NES, lot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lotList The collection of lot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_InScope(Collection<String> lotList) {
        doSetLot_InScope(lotList);
    }

    protected void doSetLot_InScope(Collection<String> lotList) {
        regINS(CK_INS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lotList The collection of lot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotInScope(Collection<String> lotList) {
        doSetLot_NotInScope(lotList);
    }

    protected void doSetLot_NotInScope(Collection<String> lotList) {
        regINS(CK_NINS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)} <br>
     * <pre>e.g. setLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot The value of lot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot_LikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_Equal(String limitDt) {
        doSetLimitDt_Equal(fRES(limitDt));
    }

    protected void doSetLimitDt_Equal(String limitDt) {
        regLimitDt(CK_EQ, limitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotEqual(String limitDt) {
        doSetLimitDt_NotEqual(fRES(limitDt));
    }

    protected void doSetLimitDt_NotEqual(String limitDt) {
        regLimitDt(CK_NES, limitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterThan(String limitDt) {
        regLimitDt(CK_GT, fRES(limitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessThan(String limitDt) {
        regLimitDt(CK_LT, fRES(limitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterEqual(String limitDt) {
        regLimitDt(CK_GE, fRES(limitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessEqual(String limitDt) {
        regLimitDt(CK_LE, fRES(limitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDtList The collection of limitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_InScope(Collection<String> limitDtList) {
        doSetLimitDt_InScope(limitDtList);
    }

    protected void doSetLimitDt_InScope(Collection<String> limitDtList) {
        regINS(CK_INS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDtList The collection of limitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotInScope(Collection<String> limitDtList) {
        doSetLimitDt_NotInScope(limitDtList);
    }

    protected void doSetLimitDt_NotInScope(Collection<String> limitDtList) {
        regINS(CK_NINS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)} <br>
     * <pre>e.g. setLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDt The value of limitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDt_LikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDt_NotLikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_PrefixSearch(String limitDt) {
        setLimitDt_LikeSearch(limitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     */
    public void setLimitDt_IsNull() { regLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     */
    public void setLimitDt_IsNullOrEmpty() { regLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     */
    public void setLimitDt_IsNotNull() { regLimitDt(CK_ISNN, DOBJ); }

    protected void regLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDt(), "LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueLimitDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_Equal(java.math.BigDecimal planNum) {
        doSetPlanNum_Equal(planNum);
    }

    protected void doSetPlanNum_Equal(java.math.BigDecimal planNum) {
        regPlanNum(CK_EQ, planNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_NotEqual(java.math.BigDecimal planNum) {
        doSetPlanNum_NotEqual(planNum);
    }

    protected void doSetPlanNum_NotEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_NES, planNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterThan(java.math.BigDecimal planNum) {
        regPlanNum(CK_GT, planNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_LessThan(java.math.BigDecimal planNum) {
        regPlanNum(CK_LT, planNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_GE, planNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_LessEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_LE, planNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param minNumber The min number of planNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanNum(), "PLAN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNumList The collection of planNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_InScope(Collection<java.math.BigDecimal> planNumList) {
        doSetPlanNum_InScope(planNumList);
    }

    protected void doSetPlanNum_InScope(Collection<java.math.BigDecimal> planNumList) {
        regINS(CK_INS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNumList The collection of planNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_NotInScope(Collection<java.math.BigDecimal> planNumList) {
        doSetPlanNum_NotInScope(planNumList);
    }

    protected void doSetPlanNum_NotInScope(Collection<java.math.BigDecimal> planNumList) {
        regINS(CK_NINS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     */
    public void setPlanNum_IsNull() { regPlanNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     */
    public void setPlanNum_IsNotNull() { regPlanNum(CK_ISNN, DOBJ); }

    protected void regPlanNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanNum(), "PLAN_NUM"); }
    protected abstract ConditionValue xgetCValuePlanNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @param workStartDt The value of workStartDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkStartDt_Equal(java.sql.Timestamp workStartDt) {
        regWorkStartDt(CK_EQ,  workStartDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @param workStartDt The value of workStartDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkStartDt_GreaterThan(java.sql.Timestamp workStartDt) {
        regWorkStartDt(CK_GT,  workStartDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @param workStartDt The value of workStartDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkStartDt_LessThan(java.sql.Timestamp workStartDt) {
        regWorkStartDt(CK_LT,  workStartDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @param workStartDt The value of workStartDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkStartDt_GreaterEqual(java.sql.Timestamp workStartDt) {
        regWorkStartDt(CK_GE,  workStartDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @param workStartDt The value of workStartDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkStartDt_LessEqual(java.sql.Timestamp workStartDt) {
        regWorkStartDt(CK_LE, workStartDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * <pre>e.g. setWorkStartDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of workStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of workStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setWorkStartDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueWorkStartDt(), "WORK_START_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of workStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of workStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setWorkStartDt_DateFromTo(Date fromDate, Date toDate) {
        setWorkStartDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     */
    public void setWorkStartDt_IsNull() { regWorkStartDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     */
    public void setWorkStartDt_IsNotNull() { regWorkStartDt(CK_ISNN, DOBJ); }

    protected void regWorkStartDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkStartDt(), "WORK_START_DT"); }
    protected abstract ConditionValue xgetCValueWorkStartDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @param workEndDt The value of workEndDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkEndDt_Equal(java.sql.Timestamp workEndDt) {
        regWorkEndDt(CK_EQ,  workEndDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @param workEndDt The value of workEndDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkEndDt_GreaterThan(java.sql.Timestamp workEndDt) {
        regWorkEndDt(CK_GT,  workEndDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @param workEndDt The value of workEndDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkEndDt_LessThan(java.sql.Timestamp workEndDt) {
        regWorkEndDt(CK_LT,  workEndDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @param workEndDt The value of workEndDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkEndDt_GreaterEqual(java.sql.Timestamp workEndDt) {
        regWorkEndDt(CK_GE,  workEndDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @param workEndDt The value of workEndDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkEndDt_LessEqual(java.sql.Timestamp workEndDt) {
        regWorkEndDt(CK_LE, workEndDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * <pre>e.g. setWorkEndDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of workEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of workEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setWorkEndDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueWorkEndDt(), "WORK_END_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of workEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of workEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setWorkEndDt_DateFromTo(Date fromDate, Date toDate) {
        setWorkEndDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     */
    public void setWorkEndDt_IsNull() { regWorkEndDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     */
    public void setWorkEndDt_IsNotNull() { regWorkEndDt(CK_ISNN, DOBJ); }

    protected void regWorkEndDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkEndDt(), "WORK_END_DT"); }
    protected abstract ConditionValue xgetCValueWorkEndDt();

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
    public HpSLCFunction<WHtReceiveStoreCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WHtReceiveStoreCB.class);
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
    public HpSLCFunction<WHtReceiveStoreCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WHtReceiveStoreCB.class);
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
    public HpSLCFunction<WHtReceiveStoreCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WHtReceiveStoreCB.class);
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
    public HpSLCFunction<WHtReceiveStoreCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WHtReceiveStoreCB.class);
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
    public HpSLCFunction<WHtReceiveStoreCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WHtReceiveStoreCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WHtReceiveStoreCB&gt;() {
     *     public void query(WHtReceiveStoreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WHtReceiveStoreCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WHtReceiveStoreCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WHtReceiveStoreCQ sq);

    protected WHtReceiveStoreCB xcreateScalarConditionCB() {
        WHtReceiveStoreCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WHtReceiveStoreCB xcreateScalarConditionPartitionByCB() {
        WHtReceiveStoreCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "HT_RECEIVE_STORE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WHtReceiveStoreCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveStoreCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WHtReceiveStoreCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "HT_RECEIVE_STORE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WHtReceiveStoreCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WHtReceiveStoreCQ sq);

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
    protected WHtReceiveStoreCB newMyCB() {
        return new WHtReceiveStoreCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WHtReceiveStoreCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

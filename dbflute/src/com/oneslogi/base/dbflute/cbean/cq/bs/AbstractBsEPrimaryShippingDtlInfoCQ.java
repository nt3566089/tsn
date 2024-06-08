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
 * The abstract condition-query of E_PRIMARY_SHIPPING_DTL_INFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEPrimaryShippingDtlInfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEPrimaryShippingDtlInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_PRIMARY_SHIPPING_DTL_INFO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoId The value of primaryShippingDtlInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_Equal(Long primaryShippingDtlInfoId) {
        doSetPrimaryShippingDtlInfoId_Equal(primaryShippingDtlInfoId);
    }

    protected void doSetPrimaryShippingDtlInfoId_Equal(Long primaryShippingDtlInfoId) {
        regPrimaryShippingDtlInfoId(CK_EQ, primaryShippingDtlInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoId The value of primaryShippingDtlInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_NotEqual(Long primaryShippingDtlInfoId) {
        doSetPrimaryShippingDtlInfoId_NotEqual(primaryShippingDtlInfoId);
    }

    protected void doSetPrimaryShippingDtlInfoId_NotEqual(Long primaryShippingDtlInfoId) {
        regPrimaryShippingDtlInfoId(CK_NES, primaryShippingDtlInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoId The value of primaryShippingDtlInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_GreaterThan(Long primaryShippingDtlInfoId) {
        regPrimaryShippingDtlInfoId(CK_GT, primaryShippingDtlInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoId The value of primaryShippingDtlInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_LessThan(Long primaryShippingDtlInfoId) {
        regPrimaryShippingDtlInfoId(CK_LT, primaryShippingDtlInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoId The value of primaryShippingDtlInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_GreaterEqual(Long primaryShippingDtlInfoId) {
        regPrimaryShippingDtlInfoId(CK_GE, primaryShippingDtlInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoId The value of primaryShippingDtlInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_LessEqual(Long primaryShippingDtlInfoId) {
        regPrimaryShippingDtlInfoId(CK_LE, primaryShippingDtlInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of primaryShippingDtlInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of primaryShippingDtlInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrimaryShippingDtlInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrimaryShippingDtlInfoId(), "PRIMARY_SHIPPING_DTL_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoIdList The collection of primaryShippingDtlInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_InScope(Collection<Long> primaryShippingDtlInfoIdList) {
        doSetPrimaryShippingDtlInfoId_InScope(primaryShippingDtlInfoIdList);
    }

    protected void doSetPrimaryShippingDtlInfoId_InScope(Collection<Long> primaryShippingDtlInfoIdList) {
        regINS(CK_INS, cTL(primaryShippingDtlInfoIdList), xgetCValuePrimaryShippingDtlInfoId(), "PRIMARY_SHIPPING_DTL_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param primaryShippingDtlInfoIdList The collection of primaryShippingDtlInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrimaryShippingDtlInfoId_NotInScope(Collection<Long> primaryShippingDtlInfoIdList) {
        doSetPrimaryShippingDtlInfoId_NotInScope(primaryShippingDtlInfoIdList);
    }

    protected void doSetPrimaryShippingDtlInfoId_NotInScope(Collection<Long> primaryShippingDtlInfoIdList) {
        regINS(CK_NINS, cTL(primaryShippingDtlInfoIdList), xgetCValuePrimaryShippingDtlInfoId(), "PRIMARY_SHIPPING_DTL_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrimaryShippingDtlInfoId_IsNull() { regPrimaryShippingDtlInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrimaryShippingDtlInfoId_IsNotNull() { regPrimaryShippingDtlInfoId(CK_ISNN, DOBJ); }

    protected void regPrimaryShippingDtlInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrimaryShippingDtlInfoId(), "PRIMARY_SHIPPING_DTL_INFO_ID"); }
    protected abstract ConditionValue xgetCValuePrimaryShippingDtlInfoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_Equal(String receiveCd) {
        doSetReceiveCd_Equal(fRES(receiveCd));
    }

    protected void doSetReceiveCd_Equal(String receiveCd) {
        regReceiveCd(CK_EQ, receiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotEqual(String receiveCd) {
        doSetReceiveCd_NotEqual(fRES(receiveCd));
    }

    protected void doSetReceiveCd_NotEqual(String receiveCd) {
        regReceiveCd(CK_NES, receiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_InScope(Collection<String> receiveCdList) {
        doSetReceiveCd_InScope(receiveCdList);
    }

    protected void doSetReceiveCd_InScope(Collection<String> receiveCdList) {
        regINS(CK_INS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotInScope(Collection<String> receiveCdList) {
        doSetReceiveCd_NotInScope(receiveCdList);
    }

    protected void doSetReceiveCd_NotInScope(Collection<String> receiveCdList) {
        regINS(CK_NINS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveCd The value of receiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveCd_LikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_Equal(Long receiveRowId) {
        doSetReceiveRowId_Equal(receiveRowId);
    }

    protected void doSetReceiveRowId_Equal(Long receiveRowId) {
        regReceiveRowId(CK_EQ, receiveRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotEqual(Long receiveRowId) {
        doSetReceiveRowId_NotEqual(receiveRowId);
    }

    protected void doSetReceiveRowId_NotEqual(Long receiveRowId) {
        regReceiveRowId(CK_NES, receiveRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_InScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        regINS(CK_INS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_NotInScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        regINS(CK_NINS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    protected void regReceiveRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_Equal(String zzbukrs) {
        doSetZzbukrs_Equal(fRES(zzbukrs));
    }

    protected void doSetZzbukrs_Equal(String zzbukrs) {
        regZzbukrs(CK_EQ, zzbukrs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_NotEqual(String zzbukrs) {
        doSetZzbukrs_NotEqual(fRES(zzbukrs));
    }

    protected void doSetZzbukrs_NotEqual(String zzbukrs) {
        regZzbukrs(CK_NES, zzbukrs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_GreaterThan(String zzbukrs) {
        regZzbukrs(CK_GT, fRES(zzbukrs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_LessThan(String zzbukrs) {
        regZzbukrs(CK_LT, fRES(zzbukrs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_GreaterEqual(String zzbukrs) {
        regZzbukrs(CK_GE, fRES(zzbukrs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_LessEqual(String zzbukrs) {
        regZzbukrs(CK_LE, fRES(zzbukrs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrsList The collection of zzbukrs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_InScope(Collection<String> zzbukrsList) {
        doSetZzbukrs_InScope(zzbukrsList);
    }

    protected void doSetZzbukrs_InScope(Collection<String> zzbukrsList) {
        regINS(CK_INS, cTL(zzbukrsList), xgetCValueZzbukrs(), "ZZBUKRS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrsList The collection of zzbukrs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_NotInScope(Collection<String> zzbukrsList) {
        doSetZzbukrs_NotInScope(zzbukrsList);
    }

    protected void doSetZzbukrs_NotInScope(Collection<String> zzbukrsList) {
        regINS(CK_NINS, cTL(zzbukrsList), xgetCValueZzbukrs(), "ZZBUKRS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBUKRS: {varchar(100)} <br>
     * <pre>e.g. setZzbukrs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzbukrs The value of zzbukrs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzbukrs_LikeSearch(String zzbukrs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzbukrs), xgetCValueZzbukrs(), "ZZBUKRS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzbukrs_NotLikeSearch(String zzbukrs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzbukrs), xgetCValueZzbukrs(), "ZZBUKRS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     * @param zzbukrs The value of zzbukrs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbukrs_PrefixSearch(String zzbukrs) {
        setZzbukrs_LikeSearch(zzbukrs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     */
    public void setZzbukrs_IsNull() { regZzbukrs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     */
    public void setZzbukrs_IsNullOrEmpty() { regZzbukrs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZBUKRS: {varchar(100)}
     */
    public void setZzbukrs_IsNotNull() { regZzbukrs(CK_ISNN, DOBJ); }

    protected void regZzbukrs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzbukrs(), "ZZBUKRS"); }
    protected abstract ConditionValue xgetCValueZzbukrs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_Equal(String zzsndymd) {
        doSetZzsndymd_Equal(fRES(zzsndymd));
    }

    protected void doSetZzsndymd_Equal(String zzsndymd) {
        regZzsndymd(CK_EQ, zzsndymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_NotEqual(String zzsndymd) {
        doSetZzsndymd_NotEqual(fRES(zzsndymd));
    }

    protected void doSetZzsndymd_NotEqual(String zzsndymd) {
        regZzsndymd(CK_NES, zzsndymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_GreaterThan(String zzsndymd) {
        regZzsndymd(CK_GT, fRES(zzsndymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_LessThan(String zzsndymd) {
        regZzsndymd(CK_LT, fRES(zzsndymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_GreaterEqual(String zzsndymd) {
        regZzsndymd(CK_GE, fRES(zzsndymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_LessEqual(String zzsndymd) {
        regZzsndymd(CK_LE, fRES(zzsndymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymdList The collection of zzsndymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_InScope(Collection<String> zzsndymdList) {
        doSetZzsndymd_InScope(zzsndymdList);
    }

    protected void doSetZzsndymd_InScope(Collection<String> zzsndymdList) {
        regINS(CK_INS, cTL(zzsndymdList), xgetCValueZzsndymd(), "ZZSNDYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymdList The collection of zzsndymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_NotInScope(Collection<String> zzsndymdList) {
        doSetZzsndymd_NotInScope(zzsndymdList);
    }

    protected void doSetZzsndymd_NotInScope(Collection<String> zzsndymdList) {
        regINS(CK_NINS, cTL(zzsndymdList), xgetCValueZzsndymd(), "ZZSNDYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSNDYMD: {varchar(100)} <br>
     * <pre>e.g. setZzsndymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzsndymd The value of zzsndymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzsndymd_LikeSearch(String zzsndymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzsndymd), xgetCValueZzsndymd(), "ZZSNDYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzsndymd_NotLikeSearch(String zzsndymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzsndymd), xgetCValueZzsndymd(), "ZZSNDYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     * @param zzsndymd The value of zzsndymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsndymd_PrefixSearch(String zzsndymd) {
        setZzsndymd_LikeSearch(zzsndymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     */
    public void setZzsndymd_IsNull() { regZzsndymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     */
    public void setZzsndymd_IsNullOrEmpty() { regZzsndymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSNDYMD: {varchar(100)}
     */
    public void setZzsndymd_IsNotNull() { regZzsndymd(CK_ISNN, DOBJ); }

    protected void regZzsndymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzsndymd(), "ZZSNDYMD"); }
    protected abstract ConditionValue xgetCValueZzsndymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_Equal(String rcdid) {
        doSetRcdid_Equal(fRES(rcdid));
    }

    protected void doSetRcdid_Equal(String rcdid) {
        regRcdid(CK_EQ, rcdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_NotEqual(String rcdid) {
        doSetRcdid_NotEqual(fRES(rcdid));
    }

    protected void doSetRcdid_NotEqual(String rcdid) {
        regRcdid(CK_NES, rcdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_GreaterThan(String rcdid) {
        regRcdid(CK_GT, fRES(rcdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_LessThan(String rcdid) {
        regRcdid(CK_LT, fRES(rcdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_GreaterEqual(String rcdid) {
        regRcdid(CK_GE, fRES(rcdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_LessEqual(String rcdid) {
        regRcdid(CK_LE, fRES(rcdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdidList The collection of rcdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_InScope(Collection<String> rcdidList) {
        doSetRcdid_InScope(rcdidList);
    }

    protected void doSetRcdid_InScope(Collection<String> rcdidList) {
        regINS(CK_INS, cTL(rcdidList), xgetCValueRcdid(), "RCDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdidList The collection of rcdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_NotInScope(Collection<String> rcdidList) {
        doSetRcdid_NotInScope(rcdidList);
    }

    protected void doSetRcdid_NotInScope(Collection<String> rcdidList) {
        regINS(CK_NINS, cTL(rcdidList), xgetCValueRcdid(), "RCDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDID: {varchar(100)} <br>
     * <pre>e.g. setRcdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcdid The value of rcdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcdid_LikeSearch(String rcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcdid), xgetCValueRcdid(), "RCDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcdid_NotLikeSearch(String rcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcdid), xgetCValueRcdid(), "RCDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDID: {varchar(100)}
     * @param rcdid The value of rcdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdid_PrefixSearch(String rcdid) {
        setRcdid_LikeSearch(rcdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     */
    public void setRcdid_IsNull() { regRcdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     */
    public void setRcdid_IsNullOrEmpty() { regRcdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCDID: {varchar(100)}
     */
    public void setRcdid_IsNotNull() { regRcdid(CK_ISNN, DOBJ); }

    protected void regRcdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcdid(), "RCDID"); }
    protected abstract ConditionValue xgetCValueRcdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_Equal(String zzrefeno) {
        doSetZzrefeno_Equal(fRES(zzrefeno));
    }

    protected void doSetZzrefeno_Equal(String zzrefeno) {
        regZzrefeno(CK_EQ, zzrefeno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_NotEqual(String zzrefeno) {
        doSetZzrefeno_NotEqual(fRES(zzrefeno));
    }

    protected void doSetZzrefeno_NotEqual(String zzrefeno) {
        regZzrefeno(CK_NES, zzrefeno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_GreaterThan(String zzrefeno) {
        regZzrefeno(CK_GT, fRES(zzrefeno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_LessThan(String zzrefeno) {
        regZzrefeno(CK_LT, fRES(zzrefeno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_GreaterEqual(String zzrefeno) {
        regZzrefeno(CK_GE, fRES(zzrefeno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_LessEqual(String zzrefeno) {
        regZzrefeno(CK_LE, fRES(zzrefeno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefenoList The collection of zzrefeno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_InScope(Collection<String> zzrefenoList) {
        doSetZzrefeno_InScope(zzrefenoList);
    }

    protected void doSetZzrefeno_InScope(Collection<String> zzrefenoList) {
        regINS(CK_INS, cTL(zzrefenoList), xgetCValueZzrefeno(), "ZZREFENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefenoList The collection of zzrefeno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_NotInScope(Collection<String> zzrefenoList) {
        doSetZzrefeno_NotInScope(zzrefenoList);
    }

    protected void doSetZzrefeno_NotInScope(Collection<String> zzrefenoList) {
        regINS(CK_NINS, cTL(zzrefenoList), xgetCValueZzrefeno(), "ZZREFENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFENO: {varchar(100)} <br>
     * <pre>e.g. setZzrefeno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefeno The value of zzrefeno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefeno_LikeSearch(String zzrefeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefeno), xgetCValueZzrefeno(), "ZZREFENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefeno_NotLikeSearch(String zzrefeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefeno), xgetCValueZzrefeno(), "ZZREFENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFENO: {varchar(100)}
     * @param zzrefeno The value of zzrefeno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno_PrefixSearch(String zzrefeno) {
        setZzrefeno_LikeSearch(zzrefeno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     */
    public void setZzrefeno_IsNull() { regZzrefeno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     */
    public void setZzrefeno_IsNullOrEmpty() { regZzrefeno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFENO: {varchar(100)}
     */
    public void setZzrefeno_IsNotNull() { regZzrefeno(CK_ISNN, DOBJ); }

    protected void regZzrefeno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefeno(), "ZZREFENO"); }
    protected abstract ConditionValue xgetCValueZzrefeno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_Equal(String bnwhcd) {
        doSetBnwhcd_Equal(fRES(bnwhcd));
    }

    protected void doSetBnwhcd_Equal(String bnwhcd) {
        regBnwhcd(CK_EQ, bnwhcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_NotEqual(String bnwhcd) {
        doSetBnwhcd_NotEqual(fRES(bnwhcd));
    }

    protected void doSetBnwhcd_NotEqual(String bnwhcd) {
        regBnwhcd(CK_NES, bnwhcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_GreaterThan(String bnwhcd) {
        regBnwhcd(CK_GT, fRES(bnwhcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_LessThan(String bnwhcd) {
        regBnwhcd(CK_LT, fRES(bnwhcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_GreaterEqual(String bnwhcd) {
        regBnwhcd(CK_GE, fRES(bnwhcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_LessEqual(String bnwhcd) {
        regBnwhcd(CK_LE, fRES(bnwhcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcdList The collection of bnwhcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_InScope(Collection<String> bnwhcdList) {
        doSetBnwhcd_InScope(bnwhcdList);
    }

    protected void doSetBnwhcd_InScope(Collection<String> bnwhcdList) {
        regINS(CK_INS, cTL(bnwhcdList), xgetCValueBnwhcd(), "BNWHCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcdList The collection of bnwhcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_NotInScope(Collection<String> bnwhcdList) {
        doSetBnwhcd_NotInScope(bnwhcdList);
    }

    protected void doSetBnwhcd_NotInScope(Collection<String> bnwhcdList) {
        regINS(CK_NINS, cTL(bnwhcdList), xgetCValueBnwhcd(), "BNWHCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BNWHCD: {varchar(100)} <br>
     * <pre>e.g. setBnwhcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bnwhcd The value of bnwhcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBnwhcd_LikeSearch(String bnwhcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bnwhcd), xgetCValueBnwhcd(), "BNWHCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBnwhcd_NotLikeSearch(String bnwhcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bnwhcd), xgetCValueBnwhcd(), "BNWHCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BNWHCD: {varchar(100)}
     * @param bnwhcd The value of bnwhcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBnwhcd_PrefixSearch(String bnwhcd) {
        setBnwhcd_LikeSearch(bnwhcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     */
    public void setBnwhcd_IsNull() { regBnwhcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     */
    public void setBnwhcd_IsNullOrEmpty() { regBnwhcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BNWHCD: {varchar(100)}
     */
    public void setBnwhcd_IsNotNull() { regBnwhcd(CK_ISNN, DOBJ); }

    protected void regBnwhcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBnwhcd(), "BNWHCD"); }
    protected abstract ConditionValue xgetCValueBnwhcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_Equal(String hdrid) {
        doSetHdrid_Equal(fRES(hdrid));
    }

    protected void doSetHdrid_Equal(String hdrid) {
        regHdrid(CK_EQ, hdrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_NotEqual(String hdrid) {
        doSetHdrid_NotEqual(fRES(hdrid));
    }

    protected void doSetHdrid_NotEqual(String hdrid) {
        regHdrid(CK_NES, hdrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_GreaterThan(String hdrid) {
        regHdrid(CK_GT, fRES(hdrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_LessThan(String hdrid) {
        regHdrid(CK_LT, fRES(hdrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_GreaterEqual(String hdrid) {
        regHdrid(CK_GE, fRES(hdrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_LessEqual(String hdrid) {
        regHdrid(CK_LE, fRES(hdrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdridList The collection of hdrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_InScope(Collection<String> hdridList) {
        doSetHdrid_InScope(hdridList);
    }

    protected void doSetHdrid_InScope(Collection<String> hdridList) {
        regINS(CK_INS, cTL(hdridList), xgetCValueHdrid(), "HDRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdridList The collection of hdrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_NotInScope(Collection<String> hdridList) {
        doSetHdrid_NotInScope(hdridList);
    }

    protected void doSetHdrid_NotInScope(Collection<String> hdridList) {
        regINS(CK_NINS, cTL(hdridList), xgetCValueHdrid(), "HDRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRID: {varchar(100)} <br>
     * <pre>e.g. setHdrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrid The value of hdrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrid_LikeSearch(String hdrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrid), xgetCValueHdrid(), "HDRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrid_NotLikeSearch(String hdrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrid), xgetCValueHdrid(), "HDRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRID: {varchar(100)}
     * @param hdrid The value of hdrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrid_PrefixSearch(String hdrid) {
        setHdrid_LikeSearch(hdrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     */
    public void setHdrid_IsNull() { regHdrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     */
    public void setHdrid_IsNullOrEmpty() { regHdrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRID: {varchar(100)}
     */
    public void setHdrid_IsNotNull() { regHdrid(CK_ISNN, DOBJ); }

    protected void regHdrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrid(), "HDRID"); }
    protected abstract ConditionValue xgetCValueHdrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_Equal(String dtlno) {
        doSetDtlno_Equal(fRES(dtlno));
    }

    protected void doSetDtlno_Equal(String dtlno) {
        regDtlno(CK_EQ, dtlno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_NotEqual(String dtlno) {
        doSetDtlno_NotEqual(fRES(dtlno));
    }

    protected void doSetDtlno_NotEqual(String dtlno) {
        regDtlno(CK_NES, dtlno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_GreaterThan(String dtlno) {
        regDtlno(CK_GT, fRES(dtlno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_LessThan(String dtlno) {
        regDtlno(CK_LT, fRES(dtlno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_GreaterEqual(String dtlno) {
        regDtlno(CK_GE, fRES(dtlno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_LessEqual(String dtlno) {
        regDtlno(CK_LE, fRES(dtlno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlnoList The collection of dtlno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_InScope(Collection<String> dtlnoList) {
        doSetDtlno_InScope(dtlnoList);
    }

    protected void doSetDtlno_InScope(Collection<String> dtlnoList) {
        regINS(CK_INS, cTL(dtlnoList), xgetCValueDtlno(), "DTLNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlnoList The collection of dtlno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_NotInScope(Collection<String> dtlnoList) {
        doSetDtlno_NotInScope(dtlnoList);
    }

    protected void doSetDtlno_NotInScope(Collection<String> dtlnoList) {
        regINS(CK_NINS, cTL(dtlnoList), xgetCValueDtlno(), "DTLNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLNO: {varchar(100)} <br>
     * <pre>e.g. setDtlno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtlno The value of dtlno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtlno_LikeSearch(String dtlno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtlno), xgetCValueDtlno(), "DTLNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtlno_NotLikeSearch(String dtlno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtlno), xgetCValueDtlno(), "DTLNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLNO: {varchar(100)}
     * @param dtlno The value of dtlno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlno_PrefixSearch(String dtlno) {
        setDtlno_LikeSearch(dtlno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     */
    public void setDtlno_IsNull() { regDtlno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     */
    public void setDtlno_IsNullOrEmpty() { regDtlno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DTLNO: {varchar(100)}
     */
    public void setDtlno_IsNotNull() { regDtlno(CK_ISNN, DOBJ); }

    protected void regDtlno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtlno(), "DTLNO"); }
    protected abstract ConditionValue xgetCValueDtlno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_Equal(String spndda) {
        doSetSpndda_Equal(fRES(spndda));
    }

    protected void doSetSpndda_Equal(String spndda) {
        regSpndda(CK_EQ, spndda);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_NotEqual(String spndda) {
        doSetSpndda_NotEqual(fRES(spndda));
    }

    protected void doSetSpndda_NotEqual(String spndda) {
        regSpndda(CK_NES, spndda);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_GreaterThan(String spndda) {
        regSpndda(CK_GT, fRES(spndda));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_LessThan(String spndda) {
        regSpndda(CK_LT, fRES(spndda));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_GreaterEqual(String spndda) {
        regSpndda(CK_GE, fRES(spndda));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_LessEqual(String spndda) {
        regSpndda(CK_LE, fRES(spndda));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spnddaList The collection of spndda as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_InScope(Collection<String> spnddaList) {
        doSetSpndda_InScope(spnddaList);
    }

    protected void doSetSpndda_InScope(Collection<String> spnddaList) {
        regINS(CK_INS, cTL(spnddaList), xgetCValueSpndda(), "SPNDDA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spnddaList The collection of spndda as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_NotInScope(Collection<String> spnddaList) {
        doSetSpndda_NotInScope(spnddaList);
    }

    protected void doSetSpndda_NotInScope(Collection<String> spnddaList) {
        regINS(CK_NINS, cTL(spnddaList), xgetCValueSpndda(), "SPNDDA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPNDDA: {varchar(100)} <br>
     * <pre>e.g. setSpndda_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spndda The value of spndda as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpndda_LikeSearch(String spndda, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spndda), xgetCValueSpndda(), "SPNDDA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpndda_NotLikeSearch(String spndda, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spndda), xgetCValueSpndda(), "SPNDDA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPNDDA: {varchar(100)}
     * @param spndda The value of spndda as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpndda_PrefixSearch(String spndda) {
        setSpndda_LikeSearch(spndda, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     */
    public void setSpndda_IsNull() { regSpndda(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     */
    public void setSpndda_IsNullOrEmpty() { regSpndda(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPNDDA: {varchar(100)}
     */
    public void setSpndda_IsNotNull() { regSpndda(CK_ISNN, DOBJ); }

    protected void regSpndda(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpndda(), "SPNDDA"); }
    protected abstract ConditionValue xgetCValueSpndda();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_Equal(String pdlgtm) {
        doSetPdlgtm_Equal(fRES(pdlgtm));
    }

    protected void doSetPdlgtm_Equal(String pdlgtm) {
        regPdlgtm(CK_EQ, pdlgtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_NotEqual(String pdlgtm) {
        doSetPdlgtm_NotEqual(fRES(pdlgtm));
    }

    protected void doSetPdlgtm_NotEqual(String pdlgtm) {
        regPdlgtm(CK_NES, pdlgtm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_GreaterThan(String pdlgtm) {
        regPdlgtm(CK_GT, fRES(pdlgtm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_LessThan(String pdlgtm) {
        regPdlgtm(CK_LT, fRES(pdlgtm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_GreaterEqual(String pdlgtm) {
        regPdlgtm(CK_GE, fRES(pdlgtm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_LessEqual(String pdlgtm) {
        regPdlgtm(CK_LE, fRES(pdlgtm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtmList The collection of pdlgtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_InScope(Collection<String> pdlgtmList) {
        doSetPdlgtm_InScope(pdlgtmList);
    }

    protected void doSetPdlgtm_InScope(Collection<String> pdlgtmList) {
        regINS(CK_INS, cTL(pdlgtmList), xgetCValuePdlgtm(), "PDLGTM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtmList The collection of pdlgtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_NotInScope(Collection<String> pdlgtmList) {
        doSetPdlgtm_NotInScope(pdlgtmList);
    }

    protected void doSetPdlgtm_NotInScope(Collection<String> pdlgtmList) {
        regINS(CK_NINS, cTL(pdlgtmList), xgetCValuePdlgtm(), "PDLGTM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PDLGTM: {varchar(100)} <br>
     * <pre>e.g. setPdlgtm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pdlgtm The value of pdlgtm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdlgtm_LikeSearch(String pdlgtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdlgtm), xgetCValuePdlgtm(), "PDLGTM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdlgtm_NotLikeSearch(String pdlgtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdlgtm), xgetCValuePdlgtm(), "PDLGTM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PDLGTM: {varchar(100)}
     * @param pdlgtm The value of pdlgtm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdlgtm_PrefixSearch(String pdlgtm) {
        setPdlgtm_LikeSearch(pdlgtm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     */
    public void setPdlgtm_IsNull() { regPdlgtm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     */
    public void setPdlgtm_IsNullOrEmpty() { regPdlgtm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PDLGTM: {varchar(100)}
     */
    public void setPdlgtm_IsNotNull() { regPdlgtm(CK_ISNN, DOBJ); }

    protected void regPdlgtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePdlgtm(), "PDLGTM"); }
    protected abstract ConditionValue xgetCValuePdlgtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_Equal(String zzsendno) {
        doSetZzsendno_Equal(fRES(zzsendno));
    }

    protected void doSetZzsendno_Equal(String zzsendno) {
        regZzsendno(CK_EQ, zzsendno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_NotEqual(String zzsendno) {
        doSetZzsendno_NotEqual(fRES(zzsendno));
    }

    protected void doSetZzsendno_NotEqual(String zzsendno) {
        regZzsendno(CK_NES, zzsendno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_GreaterThan(String zzsendno) {
        regZzsendno(CK_GT, fRES(zzsendno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_LessThan(String zzsendno) {
        regZzsendno(CK_LT, fRES(zzsendno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_GreaterEqual(String zzsendno) {
        regZzsendno(CK_GE, fRES(zzsendno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_LessEqual(String zzsendno) {
        regZzsendno(CK_LE, fRES(zzsendno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendnoList The collection of zzsendno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_InScope(Collection<String> zzsendnoList) {
        doSetZzsendno_InScope(zzsendnoList);
    }

    protected void doSetZzsendno_InScope(Collection<String> zzsendnoList) {
        regINS(CK_INS, cTL(zzsendnoList), xgetCValueZzsendno(), "ZZSENDNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendnoList The collection of zzsendno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_NotInScope(Collection<String> zzsendnoList) {
        doSetZzsendno_NotInScope(zzsendnoList);
    }

    protected void doSetZzsendno_NotInScope(Collection<String> zzsendnoList) {
        regINS(CK_NINS, cTL(zzsendnoList), xgetCValueZzsendno(), "ZZSENDNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSENDNO: {varchar(100)} <br>
     * <pre>e.g. setZzsendno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzsendno The value of zzsendno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzsendno_LikeSearch(String zzsendno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzsendno), xgetCValueZzsendno(), "ZZSENDNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzsendno_NotLikeSearch(String zzsendno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzsendno), xgetCValueZzsendno(), "ZZSENDNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     * @param zzsendno The value of zzsendno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsendno_PrefixSearch(String zzsendno) {
        setZzsendno_LikeSearch(zzsendno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     */
    public void setZzsendno_IsNull() { regZzsendno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     */
    public void setZzsendno_IsNullOrEmpty() { regZzsendno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSENDNO: {varchar(100)}
     */
    public void setZzsendno_IsNotNull() { regZzsendno(CK_ISNN, DOBJ); }

    protected void regZzsendno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzsendno(), "ZZSENDNO"); }
    protected abstract ConditionValue xgetCValueZzsendno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_Equal(String prcsorg) {
        doSetPrcsorg_Equal(fRES(prcsorg));
    }

    protected void doSetPrcsorg_Equal(String prcsorg) {
        regPrcsorg(CK_EQ, prcsorg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_NotEqual(String prcsorg) {
        doSetPrcsorg_NotEqual(fRES(prcsorg));
    }

    protected void doSetPrcsorg_NotEqual(String prcsorg) {
        regPrcsorg(CK_NES, prcsorg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_GreaterThan(String prcsorg) {
        regPrcsorg(CK_GT, fRES(prcsorg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_LessThan(String prcsorg) {
        regPrcsorg(CK_LT, fRES(prcsorg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_GreaterEqual(String prcsorg) {
        regPrcsorg(CK_GE, fRES(prcsorg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_LessEqual(String prcsorg) {
        regPrcsorg(CK_LE, fRES(prcsorg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorgList The collection of prcsorg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_InScope(Collection<String> prcsorgList) {
        doSetPrcsorg_InScope(prcsorgList);
    }

    protected void doSetPrcsorg_InScope(Collection<String> prcsorgList) {
        regINS(CK_INS, cTL(prcsorgList), xgetCValuePrcsorg(), "PRCSORG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorgList The collection of prcsorg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_NotInScope(Collection<String> prcsorgList) {
        doSetPrcsorg_NotInScope(prcsorgList);
    }

    protected void doSetPrcsorg_NotInScope(Collection<String> prcsorgList) {
        regINS(CK_NINS, cTL(prcsorgList), xgetCValuePrcsorg(), "PRCSORG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRCSORG: {varchar(100)} <br>
     * <pre>e.g. setPrcsorg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prcsorg The value of prcsorg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrcsorg_LikeSearch(String prcsorg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prcsorg), xgetCValuePrcsorg(), "PRCSORG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrcsorg_NotLikeSearch(String prcsorg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prcsorg), xgetCValuePrcsorg(), "PRCSORG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRCSORG: {varchar(100)}
     * @param prcsorg The value of prcsorg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcsorg_PrefixSearch(String prcsorg) {
        setPrcsorg_LikeSearch(prcsorg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     */
    public void setPrcsorg_IsNull() { regPrcsorg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     */
    public void setPrcsorg_IsNullOrEmpty() { regPrcsorg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRCSORG: {varchar(100)}
     */
    public void setPrcsorg_IsNotNull() { regPrcsorg(CK_ISNN, DOBJ); }

    protected void regPrcsorg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrcsorg(), "PRCSORG"); }
    protected abstract ConditionValue xgetCValuePrcsorg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_Equal(String ekgrp) {
        doSetEkgrp_Equal(fRES(ekgrp));
    }

    protected void doSetEkgrp_Equal(String ekgrp) {
        regEkgrp(CK_EQ, ekgrp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_NotEqual(String ekgrp) {
        doSetEkgrp_NotEqual(fRES(ekgrp));
    }

    protected void doSetEkgrp_NotEqual(String ekgrp) {
        regEkgrp(CK_NES, ekgrp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_GreaterThan(String ekgrp) {
        regEkgrp(CK_GT, fRES(ekgrp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_LessThan(String ekgrp) {
        regEkgrp(CK_LT, fRES(ekgrp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_GreaterEqual(String ekgrp) {
        regEkgrp(CK_GE, fRES(ekgrp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_LessEqual(String ekgrp) {
        regEkgrp(CK_LE, fRES(ekgrp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrpList The collection of ekgrp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_InScope(Collection<String> ekgrpList) {
        doSetEkgrp_InScope(ekgrpList);
    }

    protected void doSetEkgrp_InScope(Collection<String> ekgrpList) {
        regINS(CK_INS, cTL(ekgrpList), xgetCValueEkgrp(), "EKGRP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrpList The collection of ekgrp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_NotInScope(Collection<String> ekgrpList) {
        doSetEkgrp_NotInScope(ekgrpList);
    }

    protected void doSetEkgrp_NotInScope(Collection<String> ekgrpList) {
        regINS(CK_NINS, cTL(ekgrpList), xgetCValueEkgrp(), "EKGRP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EKGRP: {varchar(100)} <br>
     * <pre>e.g. setEkgrp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ekgrp The value of ekgrp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEkgrp_LikeSearch(String ekgrp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ekgrp), xgetCValueEkgrp(), "EKGRP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEkgrp_NotLikeSearch(String ekgrp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ekgrp), xgetCValueEkgrp(), "EKGRP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EKGRP: {varchar(100)}
     * @param ekgrp The value of ekgrp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEkgrp_PrefixSearch(String ekgrp) {
        setEkgrp_LikeSearch(ekgrp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     */
    public void setEkgrp_IsNull() { regEkgrp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     */
    public void setEkgrp_IsNullOrEmpty() { regEkgrp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EKGRP: {varchar(100)}
     */
    public void setEkgrp_IsNotNull() { regEkgrp(CK_ISNN, DOBJ); }

    protected void regEkgrp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEkgrp(), "EKGRP"); }
    protected abstract ConditionValue xgetCValueEkgrp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_Equal(String spcd) {
        doSetSpcd_Equal(fRES(spcd));
    }

    protected void doSetSpcd_Equal(String spcd) {
        regSpcd(CK_EQ, spcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_NotEqual(String spcd) {
        doSetSpcd_NotEqual(fRES(spcd));
    }

    protected void doSetSpcd_NotEqual(String spcd) {
        regSpcd(CK_NES, spcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_GreaterThan(String spcd) {
        regSpcd(CK_GT, fRES(spcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_LessThan(String spcd) {
        regSpcd(CK_LT, fRES(spcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_GreaterEqual(String spcd) {
        regSpcd(CK_GE, fRES(spcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_LessEqual(String spcd) {
        regSpcd(CK_LE, fRES(spcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcdList The collection of spcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_InScope(Collection<String> spcdList) {
        doSetSpcd_InScope(spcdList);
    }

    protected void doSetSpcd_InScope(Collection<String> spcdList) {
        regINS(CK_INS, cTL(spcdList), xgetCValueSpcd(), "SPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcdList The collection of spcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_NotInScope(Collection<String> spcdList) {
        doSetSpcd_NotInScope(spcdList);
    }

    protected void doSetSpcd_NotInScope(Collection<String> spcdList) {
        regINS(CK_NINS, cTL(spcdList), xgetCValueSpcd(), "SPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPCD: {varchar(100)} <br>
     * <pre>e.g. setSpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spcd The value of spcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpcd_LikeSearch(String spcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spcd), xgetCValueSpcd(), "SPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpcd_NotLikeSearch(String spcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spcd), xgetCValueSpcd(), "SPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPCD: {varchar(100)}
     * @param spcd The value of spcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpcd_PrefixSearch(String spcd) {
        setSpcd_LikeSearch(spcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     */
    public void setSpcd_IsNull() { regSpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     */
    public void setSpcd_IsNullOrEmpty() { regSpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPCD: {varchar(100)}
     */
    public void setSpcd_IsNotNull() { regSpcd(CK_ISNN, DOBJ); }

    protected void regSpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpcd(), "SPCD"); }
    protected abstract ConditionValue xgetCValueSpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_Equal(String spskplcd) {
        doSetSpskplcd_Equal(fRES(spskplcd));
    }

    protected void doSetSpskplcd_Equal(String spskplcd) {
        regSpskplcd(CK_EQ, spskplcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_NotEqual(String spskplcd) {
        doSetSpskplcd_NotEqual(fRES(spskplcd));
    }

    protected void doSetSpskplcd_NotEqual(String spskplcd) {
        regSpskplcd(CK_NES, spskplcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_GreaterThan(String spskplcd) {
        regSpskplcd(CK_GT, fRES(spskplcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_LessThan(String spskplcd) {
        regSpskplcd(CK_LT, fRES(spskplcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_GreaterEqual(String spskplcd) {
        regSpskplcd(CK_GE, fRES(spskplcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_LessEqual(String spskplcd) {
        regSpskplcd(CK_LE, fRES(spskplcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcdList The collection of spskplcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_InScope(Collection<String> spskplcdList) {
        doSetSpskplcd_InScope(spskplcdList);
    }

    protected void doSetSpskplcd_InScope(Collection<String> spskplcdList) {
        regINS(CK_INS, cTL(spskplcdList), xgetCValueSpskplcd(), "SPSKPLCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcdList The collection of spskplcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_NotInScope(Collection<String> spskplcdList) {
        doSetSpskplcd_NotInScope(spskplcdList);
    }

    protected void doSetSpskplcd_NotInScope(Collection<String> spskplcdList) {
        regINS(CK_NINS, cTL(spskplcdList), xgetCValueSpskplcd(), "SPSKPLCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPSKPLCD: {varchar(100)} <br>
     * <pre>e.g. setSpskplcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spskplcd The value of spskplcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpskplcd_LikeSearch(String spskplcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spskplcd), xgetCValueSpskplcd(), "SPSKPLCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpskplcd_NotLikeSearch(String spskplcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spskplcd), xgetCValueSpskplcd(), "SPSKPLCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     * @param spskplcd The value of spskplcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpskplcd_PrefixSearch(String spskplcd) {
        setSpskplcd_LikeSearch(spskplcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     */
    public void setSpskplcd_IsNull() { regSpskplcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     */
    public void setSpskplcd_IsNullOrEmpty() { regSpskplcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPSKPLCD: {varchar(100)}
     */
    public void setSpskplcd_IsNotNull() { regSpskplcd(CK_ISNN, DOBJ); }

    protected void regSpskplcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpskplcd(), "SPSKPLCD"); }
    protected abstract ConditionValue xgetCValueSpskplcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_Equal(String rccd) {
        doSetRccd_Equal(fRES(rccd));
    }

    protected void doSetRccd_Equal(String rccd) {
        regRccd(CK_EQ, rccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_NotEqual(String rccd) {
        doSetRccd_NotEqual(fRES(rccd));
    }

    protected void doSetRccd_NotEqual(String rccd) {
        regRccd(CK_NES, rccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_GreaterThan(String rccd) {
        regRccd(CK_GT, fRES(rccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_LessThan(String rccd) {
        regRccd(CK_LT, fRES(rccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_GreaterEqual(String rccd) {
        regRccd(CK_GE, fRES(rccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_LessEqual(String rccd) {
        regRccd(CK_LE, fRES(rccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccdList The collection of rccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_InScope(Collection<String> rccdList) {
        doSetRccd_InScope(rccdList);
    }

    protected void doSetRccd_InScope(Collection<String> rccdList) {
        regINS(CK_INS, cTL(rccdList), xgetCValueRccd(), "RCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccdList The collection of rccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_NotInScope(Collection<String> rccdList) {
        doSetRccd_NotInScope(rccdList);
    }

    protected void doSetRccd_NotInScope(Collection<String> rccdList) {
        regINS(CK_NINS, cTL(rccdList), xgetCValueRccd(), "RCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCCD: {varchar(100)} <br>
     * <pre>e.g. setRccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rccd The value of rccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRccd_LikeSearch(String rccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rccd), xgetCValueRccd(), "RCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRccd_NotLikeSearch(String rccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rccd), xgetCValueRccd(), "RCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCCD: {varchar(100)}
     * @param rccd The value of rccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRccd_PrefixSearch(String rccd) {
        setRccd_LikeSearch(rccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     */
    public void setRccd_IsNull() { regRccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     */
    public void setRccd_IsNullOrEmpty() { regRccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCCD: {varchar(100)}
     */
    public void setRccd_IsNotNull() { regRccd(CK_ISNN, DOBJ); }

    protected void regRccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRccd(), "RCCD"); }
    protected abstract ConditionValue xgetCValueRccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_Equal(String rcskplcd) {
        doSetRcskplcd_Equal(fRES(rcskplcd));
    }

    protected void doSetRcskplcd_Equal(String rcskplcd) {
        regRcskplcd(CK_EQ, rcskplcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_NotEqual(String rcskplcd) {
        doSetRcskplcd_NotEqual(fRES(rcskplcd));
    }

    protected void doSetRcskplcd_NotEqual(String rcskplcd) {
        regRcskplcd(CK_NES, rcskplcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_GreaterThan(String rcskplcd) {
        regRcskplcd(CK_GT, fRES(rcskplcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_LessThan(String rcskplcd) {
        regRcskplcd(CK_LT, fRES(rcskplcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_GreaterEqual(String rcskplcd) {
        regRcskplcd(CK_GE, fRES(rcskplcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_LessEqual(String rcskplcd) {
        regRcskplcd(CK_LE, fRES(rcskplcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcdList The collection of rcskplcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_InScope(Collection<String> rcskplcdList) {
        doSetRcskplcd_InScope(rcskplcdList);
    }

    protected void doSetRcskplcd_InScope(Collection<String> rcskplcdList) {
        regINS(CK_INS, cTL(rcskplcdList), xgetCValueRcskplcd(), "RCSKPLCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcdList The collection of rcskplcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_NotInScope(Collection<String> rcskplcdList) {
        doSetRcskplcd_NotInScope(rcskplcdList);
    }

    protected void doSetRcskplcd_NotInScope(Collection<String> rcskplcdList) {
        regINS(CK_NINS, cTL(rcskplcdList), xgetCValueRcskplcd(), "RCSKPLCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCSKPLCD: {varchar(100)} <br>
     * <pre>e.g. setRcskplcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcskplcd The value of rcskplcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcskplcd_LikeSearch(String rcskplcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcskplcd), xgetCValueRcskplcd(), "RCSKPLCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcskplcd_NotLikeSearch(String rcskplcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcskplcd), xgetCValueRcskplcd(), "RCSKPLCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     * @param rcskplcd The value of rcskplcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcskplcd_PrefixSearch(String rcskplcd) {
        setRcskplcd_LikeSearch(rcskplcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     */
    public void setRcskplcd_IsNull() { regRcskplcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     */
    public void setRcskplcd_IsNullOrEmpty() { regRcskplcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCSKPLCD: {varchar(100)}
     */
    public void setRcskplcd_IsNotNull() { regRcskplcd(CK_ISNN, DOBJ); }

    protected void regRcskplcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcskplcd(), "RCSKPLCD"); }
    protected abstract ConditionValue xgetCValueRcskplcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_Equal(String zzrcvymd) {
        doSetZzrcvymd_Equal(fRES(zzrcvymd));
    }

    protected void doSetZzrcvymd_Equal(String zzrcvymd) {
        regZzrcvymd(CK_EQ, zzrcvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_NotEqual(String zzrcvymd) {
        doSetZzrcvymd_NotEqual(fRES(zzrcvymd));
    }

    protected void doSetZzrcvymd_NotEqual(String zzrcvymd) {
        regZzrcvymd(CK_NES, zzrcvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_GreaterThan(String zzrcvymd) {
        regZzrcvymd(CK_GT, fRES(zzrcvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_LessThan(String zzrcvymd) {
        regZzrcvymd(CK_LT, fRES(zzrcvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_GreaterEqual(String zzrcvymd) {
        regZzrcvymd(CK_GE, fRES(zzrcvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_LessEqual(String zzrcvymd) {
        regZzrcvymd(CK_LE, fRES(zzrcvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymdList The collection of zzrcvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_InScope(Collection<String> zzrcvymdList) {
        doSetZzrcvymd_InScope(zzrcvymdList);
    }

    protected void doSetZzrcvymd_InScope(Collection<String> zzrcvymdList) {
        regINS(CK_INS, cTL(zzrcvymdList), xgetCValueZzrcvymd(), "ZZRCVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymdList The collection of zzrcvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_NotInScope(Collection<String> zzrcvymdList) {
        doSetZzrcvymd_NotInScope(zzrcvymdList);
    }

    protected void doSetZzrcvymd_NotInScope(Collection<String> zzrcvymdList) {
        regINS(CK_NINS, cTL(zzrcvymdList), xgetCValueZzrcvymd(), "ZZRCVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZRCVYMD: {varchar(100)} <br>
     * <pre>e.g. setZzrcvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrcvymd The value of zzrcvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrcvymd_LikeSearch(String zzrcvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrcvymd), xgetCValueZzrcvymd(), "ZZRCVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrcvymd_NotLikeSearch(String zzrcvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrcvymd), xgetCValueZzrcvymd(), "ZZRCVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     * @param zzrcvymd The value of zzrcvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrcvymd_PrefixSearch(String zzrcvymd) {
        setZzrcvymd_LikeSearch(zzrcvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     */
    public void setZzrcvymd_IsNull() { regZzrcvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     */
    public void setZzrcvymd_IsNullOrEmpty() { regZzrcvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZRCVYMD: {varchar(100)}
     */
    public void setZzrcvymd_IsNotNull() { regZzrcvymd(CK_ISNN, DOBJ); }

    protected void regZzrcvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrcvymd(), "ZZRCVYMD"); }
    protected abstract ConditionValue xgetCValueZzrcvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_Equal(String zzshtype) {
        doSetZzshtype_Equal(fRES(zzshtype));
    }

    protected void doSetZzshtype_Equal(String zzshtype) {
        regZzshtype(CK_EQ, zzshtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_NotEqual(String zzshtype) {
        doSetZzshtype_NotEqual(fRES(zzshtype));
    }

    protected void doSetZzshtype_NotEqual(String zzshtype) {
        regZzshtype(CK_NES, zzshtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_GreaterThan(String zzshtype) {
        regZzshtype(CK_GT, fRES(zzshtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_LessThan(String zzshtype) {
        regZzshtype(CK_LT, fRES(zzshtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_GreaterEqual(String zzshtype) {
        regZzshtype(CK_GE, fRES(zzshtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_LessEqual(String zzshtype) {
        regZzshtype(CK_LE, fRES(zzshtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtypeList The collection of zzshtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_InScope(Collection<String> zzshtypeList) {
        doSetZzshtype_InScope(zzshtypeList);
    }

    protected void doSetZzshtype_InScope(Collection<String> zzshtypeList) {
        regINS(CK_INS, cTL(zzshtypeList), xgetCValueZzshtype(), "ZZSHTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtypeList The collection of zzshtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_NotInScope(Collection<String> zzshtypeList) {
        doSetZzshtype_NotInScope(zzshtypeList);
    }

    protected void doSetZzshtype_NotInScope(Collection<String> zzshtypeList) {
        regINS(CK_NINS, cTL(zzshtypeList), xgetCValueZzshtype(), "ZZSHTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSHTYPE: {varchar(100)} <br>
     * <pre>e.g. setZzshtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzshtype The value of zzshtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzshtype_LikeSearch(String zzshtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzshtype), xgetCValueZzshtype(), "ZZSHTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzshtype_NotLikeSearch(String zzshtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzshtype), xgetCValueZzshtype(), "ZZSHTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     * @param zzshtype The value of zzshtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshtype_PrefixSearch(String zzshtype) {
        setZzshtype_LikeSearch(zzshtype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     */
    public void setZzshtype_IsNull() { regZzshtype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     */
    public void setZzshtype_IsNullOrEmpty() { regZzshtype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSHTYPE: {varchar(100)}
     */
    public void setZzshtype_IsNotNull() { regZzshtype(CK_ISNN, DOBJ); }

    protected void regZzshtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzshtype(), "ZZSHTYPE"); }
    protected abstract ConditionValue xgetCValueZzshtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_Equal(String agcd) {
        doSetAgcd_Equal(fRES(agcd));
    }

    protected void doSetAgcd_Equal(String agcd) {
        regAgcd(CK_EQ, agcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_NotEqual(String agcd) {
        doSetAgcd_NotEqual(fRES(agcd));
    }

    protected void doSetAgcd_NotEqual(String agcd) {
        regAgcd(CK_NES, agcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_GreaterThan(String agcd) {
        regAgcd(CK_GT, fRES(agcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_LessThan(String agcd) {
        regAgcd(CK_LT, fRES(agcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_GreaterEqual(String agcd) {
        regAgcd(CK_GE, fRES(agcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_LessEqual(String agcd) {
        regAgcd(CK_LE, fRES(agcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcdList The collection of agcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_InScope(Collection<String> agcdList) {
        doSetAgcd_InScope(agcdList);
    }

    protected void doSetAgcd_InScope(Collection<String> agcdList) {
        regINS(CK_INS, cTL(agcdList), xgetCValueAgcd(), "AGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcdList The collection of agcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_NotInScope(Collection<String> agcdList) {
        doSetAgcd_NotInScope(agcdList);
    }

    protected void doSetAgcd_NotInScope(Collection<String> agcdList) {
        regINS(CK_NINS, cTL(agcdList), xgetCValueAgcd(), "AGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AGCD: {varchar(100)} <br>
     * <pre>e.g. setAgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param agcd The value of agcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAgcd_LikeSearch(String agcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(agcd), xgetCValueAgcd(), "AGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAgcd_NotLikeSearch(String agcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(agcd), xgetCValueAgcd(), "AGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AGCD: {varchar(100)}
     * @param agcd The value of agcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgcd_PrefixSearch(String agcd) {
        setAgcd_LikeSearch(agcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     */
    public void setAgcd_IsNull() { regAgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     */
    public void setAgcd_IsNullOrEmpty() { regAgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AGCD: {varchar(100)}
     */
    public void setAgcd_IsNotNull() { regAgcd(CK_ISNN, DOBJ); }

    protected void regAgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAgcd(), "AGCD"); }
    protected abstract ConditionValue xgetCValueAgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_Equal(String zzcbxqty) {
        doSetZzcbxqty_Equal(fRES(zzcbxqty));
    }

    protected void doSetZzcbxqty_Equal(String zzcbxqty) {
        regZzcbxqty(CK_EQ, zzcbxqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_NotEqual(String zzcbxqty) {
        doSetZzcbxqty_NotEqual(fRES(zzcbxqty));
    }

    protected void doSetZzcbxqty_NotEqual(String zzcbxqty) {
        regZzcbxqty(CK_NES, zzcbxqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_GreaterThan(String zzcbxqty) {
        regZzcbxqty(CK_GT, fRES(zzcbxqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_LessThan(String zzcbxqty) {
        regZzcbxqty(CK_LT, fRES(zzcbxqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_GreaterEqual(String zzcbxqty) {
        regZzcbxqty(CK_GE, fRES(zzcbxqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_LessEqual(String zzcbxqty) {
        regZzcbxqty(CK_LE, fRES(zzcbxqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqtyList The collection of zzcbxqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_InScope(Collection<String> zzcbxqtyList) {
        doSetZzcbxqty_InScope(zzcbxqtyList);
    }

    protected void doSetZzcbxqty_InScope(Collection<String> zzcbxqtyList) {
        regINS(CK_INS, cTL(zzcbxqtyList), xgetCValueZzcbxqty(), "ZZCBXQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqtyList The collection of zzcbxqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_NotInScope(Collection<String> zzcbxqtyList) {
        doSetZzcbxqty_NotInScope(zzcbxqtyList);
    }

    protected void doSetZzcbxqty_NotInScope(Collection<String> zzcbxqtyList) {
        regINS(CK_NINS, cTL(zzcbxqtyList), xgetCValueZzcbxqty(), "ZZCBXQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZCBXQTY: {varchar(100)} <br>
     * <pre>e.g. setZzcbxqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzcbxqty The value of zzcbxqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzcbxqty_LikeSearch(String zzcbxqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzcbxqty), xgetCValueZzcbxqty(), "ZZCBXQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzcbxqty_NotLikeSearch(String zzcbxqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzcbxqty), xgetCValueZzcbxqty(), "ZZCBXQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     * @param zzcbxqty The value of zzcbxqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzcbxqty_PrefixSearch(String zzcbxqty) {
        setZzcbxqty_LikeSearch(zzcbxqty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     */
    public void setZzcbxqty_IsNull() { regZzcbxqty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     */
    public void setZzcbxqty_IsNullOrEmpty() { regZzcbxqty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZCBXQTY: {varchar(100)}
     */
    public void setZzcbxqty_IsNotNull() { regZzcbxqty(CK_ISNN, DOBJ); }

    protected void regZzcbxqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzcbxqty(), "ZZCBXQTY"); }
    protected abstract ConditionValue xgetCValueZzcbxqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_Equal(String zzpltqty) {
        doSetZzpltqty_Equal(fRES(zzpltqty));
    }

    protected void doSetZzpltqty_Equal(String zzpltqty) {
        regZzpltqty(CK_EQ, zzpltqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_NotEqual(String zzpltqty) {
        doSetZzpltqty_NotEqual(fRES(zzpltqty));
    }

    protected void doSetZzpltqty_NotEqual(String zzpltqty) {
        regZzpltqty(CK_NES, zzpltqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_GreaterThan(String zzpltqty) {
        regZzpltqty(CK_GT, fRES(zzpltqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_LessThan(String zzpltqty) {
        regZzpltqty(CK_LT, fRES(zzpltqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_GreaterEqual(String zzpltqty) {
        regZzpltqty(CK_GE, fRES(zzpltqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_LessEqual(String zzpltqty) {
        regZzpltqty(CK_LE, fRES(zzpltqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqtyList The collection of zzpltqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_InScope(Collection<String> zzpltqtyList) {
        doSetZzpltqty_InScope(zzpltqtyList);
    }

    protected void doSetZzpltqty_InScope(Collection<String> zzpltqtyList) {
        regINS(CK_INS, cTL(zzpltqtyList), xgetCValueZzpltqty(), "ZZPLTQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqtyList The collection of zzpltqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_NotInScope(Collection<String> zzpltqtyList) {
        doSetZzpltqty_NotInScope(zzpltqtyList);
    }

    protected void doSetZzpltqty_NotInScope(Collection<String> zzpltqtyList) {
        regINS(CK_NINS, cTL(zzpltqtyList), xgetCValueZzpltqty(), "ZZPLTQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPLTQTY: {varchar(100)} <br>
     * <pre>e.g. setZzpltqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzpltqty The value of zzpltqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzpltqty_LikeSearch(String zzpltqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzpltqty), xgetCValueZzpltqty(), "ZZPLTQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzpltqty_NotLikeSearch(String zzpltqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzpltqty), xgetCValueZzpltqty(), "ZZPLTQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     * @param zzpltqty The value of zzpltqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpltqty_PrefixSearch(String zzpltqty) {
        setZzpltqty_LikeSearch(zzpltqty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     */
    public void setZzpltqty_IsNull() { regZzpltqty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     */
    public void setZzpltqty_IsNullOrEmpty() { regZzpltqty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZPLTQTY: {varchar(100)}
     */
    public void setZzpltqty_IsNotNull() { regZzpltqty(CK_ISNN, DOBJ); }

    protected void regZzpltqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzpltqty(), "ZZPLTQTY"); }
    protected abstract ConditionValue xgetCValueZzpltqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_Equal(String zztplqty) {
        doSetZztplqty_Equal(fRES(zztplqty));
    }

    protected void doSetZztplqty_Equal(String zztplqty) {
        regZztplqty(CK_EQ, zztplqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_NotEqual(String zztplqty) {
        doSetZztplqty_NotEqual(fRES(zztplqty));
    }

    protected void doSetZztplqty_NotEqual(String zztplqty) {
        regZztplqty(CK_NES, zztplqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_GreaterThan(String zztplqty) {
        regZztplqty(CK_GT, fRES(zztplqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_LessThan(String zztplqty) {
        regZztplqty(CK_LT, fRES(zztplqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_GreaterEqual(String zztplqty) {
        regZztplqty(CK_GE, fRES(zztplqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_LessEqual(String zztplqty) {
        regZztplqty(CK_LE, fRES(zztplqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqtyList The collection of zztplqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_InScope(Collection<String> zztplqtyList) {
        doSetZztplqty_InScope(zztplqtyList);
    }

    protected void doSetZztplqty_InScope(Collection<String> zztplqtyList) {
        regINS(CK_INS, cTL(zztplqtyList), xgetCValueZztplqty(), "ZZTPLQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqtyList The collection of zztplqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_NotInScope(Collection<String> zztplqtyList) {
        doSetZztplqty_NotInScope(zztplqtyList);
    }

    protected void doSetZztplqty_NotInScope(Collection<String> zztplqtyList) {
        regINS(CK_NINS, cTL(zztplqtyList), xgetCValueZztplqty(), "ZZTPLQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTPLQTY: {varchar(100)} <br>
     * <pre>e.g. setZztplqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zztplqty The value of zztplqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZztplqty_LikeSearch(String zztplqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zztplqty), xgetCValueZztplqty(), "ZZTPLQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZztplqty_NotLikeSearch(String zztplqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zztplqty), xgetCValueZztplqty(), "ZZTPLQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     * @param zztplqty The value of zztplqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztplqty_PrefixSearch(String zztplqty) {
        setZztplqty_LikeSearch(zztplqty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     */
    public void setZztplqty_IsNull() { regZztplqty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     */
    public void setZztplqty_IsNullOrEmpty() { regZztplqty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZTPLQTY: {varchar(100)}
     */
    public void setZztplqty_IsNotNull() { regZztplqty(CK_ISNN, DOBJ); }

    protected void regZztplqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZztplqty(), "ZZTPLQTY"); }
    protected abstract ConditionValue xgetCValueZztplqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_Equal(String zzshpcls) {
        doSetZzshpcls_Equal(fRES(zzshpcls));
    }

    protected void doSetZzshpcls_Equal(String zzshpcls) {
        regZzshpcls(CK_EQ, zzshpcls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_NotEqual(String zzshpcls) {
        doSetZzshpcls_NotEqual(fRES(zzshpcls));
    }

    protected void doSetZzshpcls_NotEqual(String zzshpcls) {
        regZzshpcls(CK_NES, zzshpcls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_GreaterThan(String zzshpcls) {
        regZzshpcls(CK_GT, fRES(zzshpcls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_LessThan(String zzshpcls) {
        regZzshpcls(CK_LT, fRES(zzshpcls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_GreaterEqual(String zzshpcls) {
        regZzshpcls(CK_GE, fRES(zzshpcls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_LessEqual(String zzshpcls) {
        regZzshpcls(CK_LE, fRES(zzshpcls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpclsList The collection of zzshpcls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_InScope(Collection<String> zzshpclsList) {
        doSetZzshpcls_InScope(zzshpclsList);
    }

    protected void doSetZzshpcls_InScope(Collection<String> zzshpclsList) {
        regINS(CK_INS, cTL(zzshpclsList), xgetCValueZzshpcls(), "ZZSHPCLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpclsList The collection of zzshpcls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_NotInScope(Collection<String> zzshpclsList) {
        doSetZzshpcls_NotInScope(zzshpclsList);
    }

    protected void doSetZzshpcls_NotInScope(Collection<String> zzshpclsList) {
        regINS(CK_NINS, cTL(zzshpclsList), xgetCValueZzshpcls(), "ZZSHPCLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSHPCLS: {varchar(100)} <br>
     * <pre>e.g. setZzshpcls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzshpcls The value of zzshpcls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzshpcls_LikeSearch(String zzshpcls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzshpcls), xgetCValueZzshpcls(), "ZZSHPCLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzshpcls_NotLikeSearch(String zzshpcls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzshpcls), xgetCValueZzshpcls(), "ZZSHPCLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     * @param zzshpcls The value of zzshpcls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzshpcls_PrefixSearch(String zzshpcls) {
        setZzshpcls_LikeSearch(zzshpcls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     */
    public void setZzshpcls_IsNull() { regZzshpcls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     */
    public void setZzshpcls_IsNullOrEmpty() { regZzshpcls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSHPCLS: {varchar(100)}
     */
    public void setZzshpcls_IsNotNull() { regZzshpcls(CK_ISNN, DOBJ); }

    protected void regZzshpcls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzshpcls(), "ZZSHPCLS"); }
    protected abstract ConditionValue xgetCValueZzshpcls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_Equal(String zzrefe01) {
        doSetZzrefe01_Equal(fRES(zzrefe01));
    }

    protected void doSetZzrefe01_Equal(String zzrefe01) {
        regZzrefe01(CK_EQ, zzrefe01);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_NotEqual(String zzrefe01) {
        doSetZzrefe01_NotEqual(fRES(zzrefe01));
    }

    protected void doSetZzrefe01_NotEqual(String zzrefe01) {
        regZzrefe01(CK_NES, zzrefe01);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_GreaterThan(String zzrefe01) {
        regZzrefe01(CK_GT, fRES(zzrefe01));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_LessThan(String zzrefe01) {
        regZzrefe01(CK_LT, fRES(zzrefe01));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_GreaterEqual(String zzrefe01) {
        regZzrefe01(CK_GE, fRES(zzrefe01));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_LessEqual(String zzrefe01) {
        regZzrefe01(CK_LE, fRES(zzrefe01));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01List The collection of zzrefe01 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_InScope(Collection<String> zzrefe01List) {
        doSetZzrefe01_InScope(zzrefe01List);
    }

    protected void doSetZzrefe01_InScope(Collection<String> zzrefe01List) {
        regINS(CK_INS, cTL(zzrefe01List), xgetCValueZzrefe01(), "ZZREFE01");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01List The collection of zzrefe01 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_NotInScope(Collection<String> zzrefe01List) {
        doSetZzrefe01_NotInScope(zzrefe01List);
    }

    protected void doSetZzrefe01_NotInScope(Collection<String> zzrefe01List) {
        regINS(CK_NINS, cTL(zzrefe01List), xgetCValueZzrefe01(), "ZZREFE01");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE01: {varchar(100)} <br>
     * <pre>e.g. setZzrefe01_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe01 The value of zzrefe01 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe01_LikeSearch(String zzrefe01, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe01), xgetCValueZzrefe01(), "ZZREFE01", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe01_NotLikeSearch(String zzrefe01, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe01), xgetCValueZzrefe01(), "ZZREFE01", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE01: {varchar(100)}
     * @param zzrefe01 The value of zzrefe01 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe01_PrefixSearch(String zzrefe01) {
        setZzrefe01_LikeSearch(zzrefe01, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     */
    public void setZzrefe01_IsNull() { regZzrefe01(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     */
    public void setZzrefe01_IsNullOrEmpty() { regZzrefe01(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE01: {varchar(100)}
     */
    public void setZzrefe01_IsNotNull() { regZzrefe01(CK_ISNN, DOBJ); }

    protected void regZzrefe01(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe01(), "ZZREFE01"); }
    protected abstract ConditionValue xgetCValueZzrefe01();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_Equal(String zzrefe02) {
        doSetZzrefe02_Equal(fRES(zzrefe02));
    }

    protected void doSetZzrefe02_Equal(String zzrefe02) {
        regZzrefe02(CK_EQ, zzrefe02);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_NotEqual(String zzrefe02) {
        doSetZzrefe02_NotEqual(fRES(zzrefe02));
    }

    protected void doSetZzrefe02_NotEqual(String zzrefe02) {
        regZzrefe02(CK_NES, zzrefe02);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_GreaterThan(String zzrefe02) {
        regZzrefe02(CK_GT, fRES(zzrefe02));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_LessThan(String zzrefe02) {
        regZzrefe02(CK_LT, fRES(zzrefe02));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_GreaterEqual(String zzrefe02) {
        regZzrefe02(CK_GE, fRES(zzrefe02));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_LessEqual(String zzrefe02) {
        regZzrefe02(CK_LE, fRES(zzrefe02));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02List The collection of zzrefe02 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_InScope(Collection<String> zzrefe02List) {
        doSetZzrefe02_InScope(zzrefe02List);
    }

    protected void doSetZzrefe02_InScope(Collection<String> zzrefe02List) {
        regINS(CK_INS, cTL(zzrefe02List), xgetCValueZzrefe02(), "ZZREFE02");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02List The collection of zzrefe02 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_NotInScope(Collection<String> zzrefe02List) {
        doSetZzrefe02_NotInScope(zzrefe02List);
    }

    protected void doSetZzrefe02_NotInScope(Collection<String> zzrefe02List) {
        regINS(CK_NINS, cTL(zzrefe02List), xgetCValueZzrefe02(), "ZZREFE02");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE02: {varchar(100)} <br>
     * <pre>e.g. setZzrefe02_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe02 The value of zzrefe02 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe02_LikeSearch(String zzrefe02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe02), xgetCValueZzrefe02(), "ZZREFE02", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe02_NotLikeSearch(String zzrefe02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe02), xgetCValueZzrefe02(), "ZZREFE02", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE02: {varchar(100)}
     * @param zzrefe02 The value of zzrefe02 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe02_PrefixSearch(String zzrefe02) {
        setZzrefe02_LikeSearch(zzrefe02, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     */
    public void setZzrefe02_IsNull() { regZzrefe02(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     */
    public void setZzrefe02_IsNullOrEmpty() { regZzrefe02(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE02: {varchar(100)}
     */
    public void setZzrefe02_IsNotNull() { regZzrefe02(CK_ISNN, DOBJ); }

    protected void regZzrefe02(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe02(), "ZZREFE02"); }
    protected abstract ConditionValue xgetCValueZzrefe02();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_Equal(String zzrefe03) {
        doSetZzrefe03_Equal(fRES(zzrefe03));
    }

    protected void doSetZzrefe03_Equal(String zzrefe03) {
        regZzrefe03(CK_EQ, zzrefe03);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_NotEqual(String zzrefe03) {
        doSetZzrefe03_NotEqual(fRES(zzrefe03));
    }

    protected void doSetZzrefe03_NotEqual(String zzrefe03) {
        regZzrefe03(CK_NES, zzrefe03);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_GreaterThan(String zzrefe03) {
        regZzrefe03(CK_GT, fRES(zzrefe03));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_LessThan(String zzrefe03) {
        regZzrefe03(CK_LT, fRES(zzrefe03));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_GreaterEqual(String zzrefe03) {
        regZzrefe03(CK_GE, fRES(zzrefe03));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_LessEqual(String zzrefe03) {
        regZzrefe03(CK_LE, fRES(zzrefe03));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03List The collection of zzrefe03 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_InScope(Collection<String> zzrefe03List) {
        doSetZzrefe03_InScope(zzrefe03List);
    }

    protected void doSetZzrefe03_InScope(Collection<String> zzrefe03List) {
        regINS(CK_INS, cTL(zzrefe03List), xgetCValueZzrefe03(), "ZZREFE03");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03List The collection of zzrefe03 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_NotInScope(Collection<String> zzrefe03List) {
        doSetZzrefe03_NotInScope(zzrefe03List);
    }

    protected void doSetZzrefe03_NotInScope(Collection<String> zzrefe03List) {
        regINS(CK_NINS, cTL(zzrefe03List), xgetCValueZzrefe03(), "ZZREFE03");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE03: {varchar(100)} <br>
     * <pre>e.g. setZzrefe03_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe03 The value of zzrefe03 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe03_LikeSearch(String zzrefe03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe03), xgetCValueZzrefe03(), "ZZREFE03", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe03_NotLikeSearch(String zzrefe03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe03), xgetCValueZzrefe03(), "ZZREFE03", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE03: {varchar(100)}
     * @param zzrefe03 The value of zzrefe03 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe03_PrefixSearch(String zzrefe03) {
        setZzrefe03_LikeSearch(zzrefe03, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     */
    public void setZzrefe03_IsNull() { regZzrefe03(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     */
    public void setZzrefe03_IsNullOrEmpty() { regZzrefe03(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE03: {varchar(100)}
     */
    public void setZzrefe03_IsNotNull() { regZzrefe03(CK_ISNN, DOBJ); }

    protected void regZzrefe03(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe03(), "ZZREFE03"); }
    protected abstract ConditionValue xgetCValueZzrefe03();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_Equal(String zzrefe04) {
        doSetZzrefe04_Equal(fRES(zzrefe04));
    }

    protected void doSetZzrefe04_Equal(String zzrefe04) {
        regZzrefe04(CK_EQ, zzrefe04);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_NotEqual(String zzrefe04) {
        doSetZzrefe04_NotEqual(fRES(zzrefe04));
    }

    protected void doSetZzrefe04_NotEqual(String zzrefe04) {
        regZzrefe04(CK_NES, zzrefe04);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_GreaterThan(String zzrefe04) {
        regZzrefe04(CK_GT, fRES(zzrefe04));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_LessThan(String zzrefe04) {
        regZzrefe04(CK_LT, fRES(zzrefe04));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_GreaterEqual(String zzrefe04) {
        regZzrefe04(CK_GE, fRES(zzrefe04));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_LessEqual(String zzrefe04) {
        regZzrefe04(CK_LE, fRES(zzrefe04));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04List The collection of zzrefe04 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_InScope(Collection<String> zzrefe04List) {
        doSetZzrefe04_InScope(zzrefe04List);
    }

    protected void doSetZzrefe04_InScope(Collection<String> zzrefe04List) {
        regINS(CK_INS, cTL(zzrefe04List), xgetCValueZzrefe04(), "ZZREFE04");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04List The collection of zzrefe04 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_NotInScope(Collection<String> zzrefe04List) {
        doSetZzrefe04_NotInScope(zzrefe04List);
    }

    protected void doSetZzrefe04_NotInScope(Collection<String> zzrefe04List) {
        regINS(CK_NINS, cTL(zzrefe04List), xgetCValueZzrefe04(), "ZZREFE04");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE04: {varchar(100)} <br>
     * <pre>e.g. setZzrefe04_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe04 The value of zzrefe04 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe04_LikeSearch(String zzrefe04, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe04), xgetCValueZzrefe04(), "ZZREFE04", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe04_NotLikeSearch(String zzrefe04, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe04), xgetCValueZzrefe04(), "ZZREFE04", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE04: {varchar(100)}
     * @param zzrefe04 The value of zzrefe04 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe04_PrefixSearch(String zzrefe04) {
        setZzrefe04_LikeSearch(zzrefe04, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     */
    public void setZzrefe04_IsNull() { regZzrefe04(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     */
    public void setZzrefe04_IsNullOrEmpty() { regZzrefe04(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE04: {varchar(100)}
     */
    public void setZzrefe04_IsNotNull() { regZzrefe04(CK_ISNN, DOBJ); }

    protected void regZzrefe04(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe04(), "ZZREFE04"); }
    protected abstract ConditionValue xgetCValueZzrefe04();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_Equal(String zzrefe05) {
        doSetZzrefe05_Equal(fRES(zzrefe05));
    }

    protected void doSetZzrefe05_Equal(String zzrefe05) {
        regZzrefe05(CK_EQ, zzrefe05);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_NotEqual(String zzrefe05) {
        doSetZzrefe05_NotEqual(fRES(zzrefe05));
    }

    protected void doSetZzrefe05_NotEqual(String zzrefe05) {
        regZzrefe05(CK_NES, zzrefe05);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_GreaterThan(String zzrefe05) {
        regZzrefe05(CK_GT, fRES(zzrefe05));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_LessThan(String zzrefe05) {
        regZzrefe05(CK_LT, fRES(zzrefe05));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_GreaterEqual(String zzrefe05) {
        regZzrefe05(CK_GE, fRES(zzrefe05));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_LessEqual(String zzrefe05) {
        regZzrefe05(CK_LE, fRES(zzrefe05));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05List The collection of zzrefe05 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_InScope(Collection<String> zzrefe05List) {
        doSetZzrefe05_InScope(zzrefe05List);
    }

    protected void doSetZzrefe05_InScope(Collection<String> zzrefe05List) {
        regINS(CK_INS, cTL(zzrefe05List), xgetCValueZzrefe05(), "ZZREFE05");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05List The collection of zzrefe05 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_NotInScope(Collection<String> zzrefe05List) {
        doSetZzrefe05_NotInScope(zzrefe05List);
    }

    protected void doSetZzrefe05_NotInScope(Collection<String> zzrefe05List) {
        regINS(CK_NINS, cTL(zzrefe05List), xgetCValueZzrefe05(), "ZZREFE05");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE05: {varchar(100)} <br>
     * <pre>e.g. setZzrefe05_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe05 The value of zzrefe05 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe05_LikeSearch(String zzrefe05, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe05), xgetCValueZzrefe05(), "ZZREFE05", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe05_NotLikeSearch(String zzrefe05, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe05), xgetCValueZzrefe05(), "ZZREFE05", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE05: {varchar(100)}
     * @param zzrefe05 The value of zzrefe05 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe05_PrefixSearch(String zzrefe05) {
        setZzrefe05_LikeSearch(zzrefe05, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     */
    public void setZzrefe05_IsNull() { regZzrefe05(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     */
    public void setZzrefe05_IsNullOrEmpty() { regZzrefe05(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE05: {varchar(100)}
     */
    public void setZzrefe05_IsNotNull() { regZzrefe05(CK_ISNN, DOBJ); }

    protected void regZzrefe05(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe05(), "ZZREFE05"); }
    protected abstract ConditionValue xgetCValueZzrefe05();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_Equal(String zzrefe06) {
        doSetZzrefe06_Equal(fRES(zzrefe06));
    }

    protected void doSetZzrefe06_Equal(String zzrefe06) {
        regZzrefe06(CK_EQ, zzrefe06);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_NotEqual(String zzrefe06) {
        doSetZzrefe06_NotEqual(fRES(zzrefe06));
    }

    protected void doSetZzrefe06_NotEqual(String zzrefe06) {
        regZzrefe06(CK_NES, zzrefe06);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_GreaterThan(String zzrefe06) {
        regZzrefe06(CK_GT, fRES(zzrefe06));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_LessThan(String zzrefe06) {
        regZzrefe06(CK_LT, fRES(zzrefe06));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_GreaterEqual(String zzrefe06) {
        regZzrefe06(CK_GE, fRES(zzrefe06));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_LessEqual(String zzrefe06) {
        regZzrefe06(CK_LE, fRES(zzrefe06));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06List The collection of zzrefe06 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_InScope(Collection<String> zzrefe06List) {
        doSetZzrefe06_InScope(zzrefe06List);
    }

    protected void doSetZzrefe06_InScope(Collection<String> zzrefe06List) {
        regINS(CK_INS, cTL(zzrefe06List), xgetCValueZzrefe06(), "ZZREFE06");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06List The collection of zzrefe06 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_NotInScope(Collection<String> zzrefe06List) {
        doSetZzrefe06_NotInScope(zzrefe06List);
    }

    protected void doSetZzrefe06_NotInScope(Collection<String> zzrefe06List) {
        regINS(CK_NINS, cTL(zzrefe06List), xgetCValueZzrefe06(), "ZZREFE06");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE06: {varchar(100)} <br>
     * <pre>e.g. setZzrefe06_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe06 The value of zzrefe06 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe06_LikeSearch(String zzrefe06, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe06), xgetCValueZzrefe06(), "ZZREFE06", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe06_NotLikeSearch(String zzrefe06, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe06), xgetCValueZzrefe06(), "ZZREFE06", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE06: {varchar(100)}
     * @param zzrefe06 The value of zzrefe06 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe06_PrefixSearch(String zzrefe06) {
        setZzrefe06_LikeSearch(zzrefe06, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     */
    public void setZzrefe06_IsNull() { regZzrefe06(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     */
    public void setZzrefe06_IsNullOrEmpty() { regZzrefe06(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE06: {varchar(100)}
     */
    public void setZzrefe06_IsNotNull() { regZzrefe06(CK_ISNN, DOBJ); }

    protected void regZzrefe06(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe06(), "ZZREFE06"); }
    protected abstract ConditionValue xgetCValueZzrefe06();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_Equal(String zzrefe07) {
        doSetZzrefe07_Equal(fRES(zzrefe07));
    }

    protected void doSetZzrefe07_Equal(String zzrefe07) {
        regZzrefe07(CK_EQ, zzrefe07);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_NotEqual(String zzrefe07) {
        doSetZzrefe07_NotEqual(fRES(zzrefe07));
    }

    protected void doSetZzrefe07_NotEqual(String zzrefe07) {
        regZzrefe07(CK_NES, zzrefe07);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_GreaterThan(String zzrefe07) {
        regZzrefe07(CK_GT, fRES(zzrefe07));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_LessThan(String zzrefe07) {
        regZzrefe07(CK_LT, fRES(zzrefe07));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_GreaterEqual(String zzrefe07) {
        regZzrefe07(CK_GE, fRES(zzrefe07));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_LessEqual(String zzrefe07) {
        regZzrefe07(CK_LE, fRES(zzrefe07));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07List The collection of zzrefe07 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_InScope(Collection<String> zzrefe07List) {
        doSetZzrefe07_InScope(zzrefe07List);
    }

    protected void doSetZzrefe07_InScope(Collection<String> zzrefe07List) {
        regINS(CK_INS, cTL(zzrefe07List), xgetCValueZzrefe07(), "ZZREFE07");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07List The collection of zzrefe07 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_NotInScope(Collection<String> zzrefe07List) {
        doSetZzrefe07_NotInScope(zzrefe07List);
    }

    protected void doSetZzrefe07_NotInScope(Collection<String> zzrefe07List) {
        regINS(CK_NINS, cTL(zzrefe07List), xgetCValueZzrefe07(), "ZZREFE07");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE07: {varchar(100)} <br>
     * <pre>e.g. setZzrefe07_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe07 The value of zzrefe07 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe07_LikeSearch(String zzrefe07, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe07), xgetCValueZzrefe07(), "ZZREFE07", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe07_NotLikeSearch(String zzrefe07, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe07), xgetCValueZzrefe07(), "ZZREFE07", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE07: {varchar(100)}
     * @param zzrefe07 The value of zzrefe07 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe07_PrefixSearch(String zzrefe07) {
        setZzrefe07_LikeSearch(zzrefe07, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     */
    public void setZzrefe07_IsNull() { regZzrefe07(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     */
    public void setZzrefe07_IsNullOrEmpty() { regZzrefe07(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE07: {varchar(100)}
     */
    public void setZzrefe07_IsNotNull() { regZzrefe07(CK_ISNN, DOBJ); }

    protected void regZzrefe07(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe07(), "ZZREFE07"); }
    protected abstract ConditionValue xgetCValueZzrefe07();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_Equal(String zzrefe08) {
        doSetZzrefe08_Equal(fRES(zzrefe08));
    }

    protected void doSetZzrefe08_Equal(String zzrefe08) {
        regZzrefe08(CK_EQ, zzrefe08);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_NotEqual(String zzrefe08) {
        doSetZzrefe08_NotEqual(fRES(zzrefe08));
    }

    protected void doSetZzrefe08_NotEqual(String zzrefe08) {
        regZzrefe08(CK_NES, zzrefe08);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_GreaterThan(String zzrefe08) {
        regZzrefe08(CK_GT, fRES(zzrefe08));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_LessThan(String zzrefe08) {
        regZzrefe08(CK_LT, fRES(zzrefe08));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_GreaterEqual(String zzrefe08) {
        regZzrefe08(CK_GE, fRES(zzrefe08));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_LessEqual(String zzrefe08) {
        regZzrefe08(CK_LE, fRES(zzrefe08));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08List The collection of zzrefe08 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_InScope(Collection<String> zzrefe08List) {
        doSetZzrefe08_InScope(zzrefe08List);
    }

    protected void doSetZzrefe08_InScope(Collection<String> zzrefe08List) {
        regINS(CK_INS, cTL(zzrefe08List), xgetCValueZzrefe08(), "ZZREFE08");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08List The collection of zzrefe08 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_NotInScope(Collection<String> zzrefe08List) {
        doSetZzrefe08_NotInScope(zzrefe08List);
    }

    protected void doSetZzrefe08_NotInScope(Collection<String> zzrefe08List) {
        regINS(CK_NINS, cTL(zzrefe08List), xgetCValueZzrefe08(), "ZZREFE08");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE08: {varchar(100)} <br>
     * <pre>e.g. setZzrefe08_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe08 The value of zzrefe08 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe08_LikeSearch(String zzrefe08, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe08), xgetCValueZzrefe08(), "ZZREFE08", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe08_NotLikeSearch(String zzrefe08, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe08), xgetCValueZzrefe08(), "ZZREFE08", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE08: {varchar(100)}
     * @param zzrefe08 The value of zzrefe08 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe08_PrefixSearch(String zzrefe08) {
        setZzrefe08_LikeSearch(zzrefe08, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     */
    public void setZzrefe08_IsNull() { regZzrefe08(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     */
    public void setZzrefe08_IsNullOrEmpty() { regZzrefe08(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE08: {varchar(100)}
     */
    public void setZzrefe08_IsNotNull() { regZzrefe08(CK_ISNN, DOBJ); }

    protected void regZzrefe08(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe08(), "ZZREFE08"); }
    protected abstract ConditionValue xgetCValueZzrefe08();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_Equal(String zzrefe09) {
        doSetZzrefe09_Equal(fRES(zzrefe09));
    }

    protected void doSetZzrefe09_Equal(String zzrefe09) {
        regZzrefe09(CK_EQ, zzrefe09);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_NotEqual(String zzrefe09) {
        doSetZzrefe09_NotEqual(fRES(zzrefe09));
    }

    protected void doSetZzrefe09_NotEqual(String zzrefe09) {
        regZzrefe09(CK_NES, zzrefe09);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_GreaterThan(String zzrefe09) {
        regZzrefe09(CK_GT, fRES(zzrefe09));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_LessThan(String zzrefe09) {
        regZzrefe09(CK_LT, fRES(zzrefe09));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_GreaterEqual(String zzrefe09) {
        regZzrefe09(CK_GE, fRES(zzrefe09));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_LessEqual(String zzrefe09) {
        regZzrefe09(CK_LE, fRES(zzrefe09));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09List The collection of zzrefe09 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_InScope(Collection<String> zzrefe09List) {
        doSetZzrefe09_InScope(zzrefe09List);
    }

    protected void doSetZzrefe09_InScope(Collection<String> zzrefe09List) {
        regINS(CK_INS, cTL(zzrefe09List), xgetCValueZzrefe09(), "ZZREFE09");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09List The collection of zzrefe09 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_NotInScope(Collection<String> zzrefe09List) {
        doSetZzrefe09_NotInScope(zzrefe09List);
    }

    protected void doSetZzrefe09_NotInScope(Collection<String> zzrefe09List) {
        regINS(CK_NINS, cTL(zzrefe09List), xgetCValueZzrefe09(), "ZZREFE09");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE09: {varchar(100)} <br>
     * <pre>e.g. setZzrefe09_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe09 The value of zzrefe09 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe09_LikeSearch(String zzrefe09, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe09), xgetCValueZzrefe09(), "ZZREFE09", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe09_NotLikeSearch(String zzrefe09, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe09), xgetCValueZzrefe09(), "ZZREFE09", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE09: {varchar(100)}
     * @param zzrefe09 The value of zzrefe09 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe09_PrefixSearch(String zzrefe09) {
        setZzrefe09_LikeSearch(zzrefe09, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     */
    public void setZzrefe09_IsNull() { regZzrefe09(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     */
    public void setZzrefe09_IsNullOrEmpty() { regZzrefe09(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE09: {varchar(100)}
     */
    public void setZzrefe09_IsNotNull() { regZzrefe09(CK_ISNN, DOBJ); }

    protected void regZzrefe09(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe09(), "ZZREFE09"); }
    protected abstract ConditionValue xgetCValueZzrefe09();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_Equal(String zzrefe10) {
        doSetZzrefe10_Equal(fRES(zzrefe10));
    }

    protected void doSetZzrefe10_Equal(String zzrefe10) {
        regZzrefe10(CK_EQ, zzrefe10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_NotEqual(String zzrefe10) {
        doSetZzrefe10_NotEqual(fRES(zzrefe10));
    }

    protected void doSetZzrefe10_NotEqual(String zzrefe10) {
        regZzrefe10(CK_NES, zzrefe10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_GreaterThan(String zzrefe10) {
        regZzrefe10(CK_GT, fRES(zzrefe10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_LessThan(String zzrefe10) {
        regZzrefe10(CK_LT, fRES(zzrefe10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_GreaterEqual(String zzrefe10) {
        regZzrefe10(CK_GE, fRES(zzrefe10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_LessEqual(String zzrefe10) {
        regZzrefe10(CK_LE, fRES(zzrefe10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10List The collection of zzrefe10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_InScope(Collection<String> zzrefe10List) {
        doSetZzrefe10_InScope(zzrefe10List);
    }

    protected void doSetZzrefe10_InScope(Collection<String> zzrefe10List) {
        regINS(CK_INS, cTL(zzrefe10List), xgetCValueZzrefe10(), "ZZREFE10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10List The collection of zzrefe10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_NotInScope(Collection<String> zzrefe10List) {
        doSetZzrefe10_NotInScope(zzrefe10List);
    }

    protected void doSetZzrefe10_NotInScope(Collection<String> zzrefe10List) {
        regINS(CK_NINS, cTL(zzrefe10List), xgetCValueZzrefe10(), "ZZREFE10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE10: {varchar(100)} <br>
     * <pre>e.g. setZzrefe10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefe10 The value of zzrefe10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefe10_LikeSearch(String zzrefe10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefe10), xgetCValueZzrefe10(), "ZZREFE10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefe10_NotLikeSearch(String zzrefe10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefe10), xgetCValueZzrefe10(), "ZZREFE10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFE10: {varchar(100)}
     * @param zzrefe10 The value of zzrefe10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefe10_PrefixSearch(String zzrefe10) {
        setZzrefe10_LikeSearch(zzrefe10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     */
    public void setZzrefe10_IsNull() { regZzrefe10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     */
    public void setZzrefe10_IsNullOrEmpty() { regZzrefe10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFE10: {varchar(100)}
     */
    public void setZzrefe10_IsNotNull() { regZzrefe10(CK_ISNN, DOBJ); }

    protected void regZzrefe10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefe10(), "ZZREFE10"); }
    protected abstract ConditionValue xgetCValueZzrefe10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_Equal(String dtlqa) {
        doSetDtlqa_Equal(fRES(dtlqa));
    }

    protected void doSetDtlqa_Equal(String dtlqa) {
        regDtlqa(CK_EQ, dtlqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_NotEqual(String dtlqa) {
        doSetDtlqa_NotEqual(fRES(dtlqa));
    }

    protected void doSetDtlqa_NotEqual(String dtlqa) {
        regDtlqa(CK_NES, dtlqa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_GreaterThan(String dtlqa) {
        regDtlqa(CK_GT, fRES(dtlqa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_LessThan(String dtlqa) {
        regDtlqa(CK_LT, fRES(dtlqa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_GreaterEqual(String dtlqa) {
        regDtlqa(CK_GE, fRES(dtlqa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_LessEqual(String dtlqa) {
        regDtlqa(CK_LE, fRES(dtlqa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqaList The collection of dtlqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_InScope(Collection<String> dtlqaList) {
        doSetDtlqa_InScope(dtlqaList);
    }

    protected void doSetDtlqa_InScope(Collection<String> dtlqaList) {
        regINS(CK_INS, cTL(dtlqaList), xgetCValueDtlqa(), "DTLQA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqaList The collection of dtlqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_NotInScope(Collection<String> dtlqaList) {
        doSetDtlqa_NotInScope(dtlqaList);
    }

    protected void doSetDtlqa_NotInScope(Collection<String> dtlqaList) {
        regINS(CK_NINS, cTL(dtlqaList), xgetCValueDtlqa(), "DTLQA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLQA: {varchar(100)} <br>
     * <pre>e.g. setDtlqa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtlqa The value of dtlqa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtlqa_LikeSearch(String dtlqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtlqa), xgetCValueDtlqa(), "DTLQA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtlqa_NotLikeSearch(String dtlqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtlqa), xgetCValueDtlqa(), "DTLQA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLQA: {varchar(100)}
     * @param dtlqa The value of dtlqa as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlqa_PrefixSearch(String dtlqa) {
        setDtlqa_LikeSearch(dtlqa, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     */
    public void setDtlqa_IsNull() { regDtlqa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     */
    public void setDtlqa_IsNullOrEmpty() { regDtlqa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DTLQA: {varchar(100)}
     */
    public void setDtlqa_IsNotNull() { regDtlqa(CK_ISNN, DOBJ); }

    protected void regDtlqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtlqa(), "DTLQA"); }
    protected abstract ConditionValue xgetCValueDtlqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_Equal(String zzrefeno2) {
        doSetZzrefeno2_Equal(fRES(zzrefeno2));
    }

    protected void doSetZzrefeno2_Equal(String zzrefeno2) {
        regZzrefeno2(CK_EQ, zzrefeno2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_NotEqual(String zzrefeno2) {
        doSetZzrefeno2_NotEqual(fRES(zzrefeno2));
    }

    protected void doSetZzrefeno2_NotEqual(String zzrefeno2) {
        regZzrefeno2(CK_NES, zzrefeno2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_GreaterThan(String zzrefeno2) {
        regZzrefeno2(CK_GT, fRES(zzrefeno2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_LessThan(String zzrefeno2) {
        regZzrefeno2(CK_LT, fRES(zzrefeno2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_GreaterEqual(String zzrefeno2) {
        regZzrefeno2(CK_GE, fRES(zzrefeno2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_LessEqual(String zzrefeno2) {
        regZzrefeno2(CK_LE, fRES(zzrefeno2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2List The collection of zzrefeno2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_InScope(Collection<String> zzrefeno2List) {
        doSetZzrefeno2_InScope(zzrefeno2List);
    }

    protected void doSetZzrefeno2_InScope(Collection<String> zzrefeno2List) {
        regINS(CK_INS, cTL(zzrefeno2List), xgetCValueZzrefeno2(), "ZZREFENO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2List The collection of zzrefeno2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_NotInScope(Collection<String> zzrefeno2List) {
        doSetZzrefeno2_NotInScope(zzrefeno2List);
    }

    protected void doSetZzrefeno2_NotInScope(Collection<String> zzrefeno2List) {
        regINS(CK_NINS, cTL(zzrefeno2List), xgetCValueZzrefeno2(), "ZZREFENO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFENO2: {varchar(100)} <br>
     * <pre>e.g. setZzrefeno2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzrefeno2 The value of zzrefeno2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzrefeno2_LikeSearch(String zzrefeno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzrefeno2), xgetCValueZzrefeno2(), "ZZREFENO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzrefeno2_NotLikeSearch(String zzrefeno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzrefeno2), xgetCValueZzrefeno2(), "ZZREFENO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     * @param zzrefeno2 The value of zzrefeno2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzrefeno2_PrefixSearch(String zzrefeno2) {
        setZzrefeno2_LikeSearch(zzrefeno2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     */
    public void setZzrefeno2_IsNull() { regZzrefeno2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     */
    public void setZzrefeno2_IsNullOrEmpty() { regZzrefeno2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREFENO2: {varchar(100)}
     */
    public void setZzrefeno2_IsNotNull() { regZzrefeno2(CK_ISNN, DOBJ); }

    protected void regZzrefeno2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzrefeno2(), "ZZREFENO2"); }
    protected abstract ConditionValue xgetCValueZzrefeno2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_Equal(String oprtno) {
        doSetOprtno_Equal(fRES(oprtno));
    }

    protected void doSetOprtno_Equal(String oprtno) {
        regOprtno(CK_EQ, oprtno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_NotEqual(String oprtno) {
        doSetOprtno_NotEqual(fRES(oprtno));
    }

    protected void doSetOprtno_NotEqual(String oprtno) {
        regOprtno(CK_NES, oprtno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_GreaterThan(String oprtno) {
        regOprtno(CK_GT, fRES(oprtno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_LessThan(String oprtno) {
        regOprtno(CK_LT, fRES(oprtno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_GreaterEqual(String oprtno) {
        regOprtno(CK_GE, fRES(oprtno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_LessEqual(String oprtno) {
        regOprtno(CK_LE, fRES(oprtno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtnoList The collection of oprtno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_InScope(Collection<String> oprtnoList) {
        doSetOprtno_InScope(oprtnoList);
    }

    protected void doSetOprtno_InScope(Collection<String> oprtnoList) {
        regINS(CK_INS, cTL(oprtnoList), xgetCValueOprtno(), "OPRTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtnoList The collection of oprtno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_NotInScope(Collection<String> oprtnoList) {
        doSetOprtno_NotInScope(oprtnoList);
    }

    protected void doSetOprtno_NotInScope(Collection<String> oprtnoList) {
        regINS(CK_NINS, cTL(oprtnoList), xgetCValueOprtno(), "OPRTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPRTNO: {varchar(100)} <br>
     * <pre>e.g. setOprtno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oprtno The value of oprtno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOprtno_LikeSearch(String oprtno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oprtno), xgetCValueOprtno(), "OPRTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOprtno_NotLikeSearch(String oprtno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oprtno), xgetCValueOprtno(), "OPRTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPRTNO: {varchar(100)}
     * @param oprtno The value of oprtno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOprtno_PrefixSearch(String oprtno) {
        setOprtno_LikeSearch(oprtno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     */
    public void setOprtno_IsNull() { regOprtno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     */
    public void setOprtno_IsNullOrEmpty() { regOprtno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPRTNO: {varchar(100)}
     */
    public void setOprtno_IsNotNull() { regOprtno(CK_ISNN, DOBJ); }

    protected void regOprtno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOprtno(), "OPRTNO"); }
    protected abstract ConditionValue xgetCValueOprtno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_Equal(String blocknm) {
        doSetBlocknm_Equal(fRES(blocknm));
    }

    protected void doSetBlocknm_Equal(String blocknm) {
        regBlocknm(CK_EQ, blocknm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_NotEqual(String blocknm) {
        doSetBlocknm_NotEqual(fRES(blocknm));
    }

    protected void doSetBlocknm_NotEqual(String blocknm) {
        regBlocknm(CK_NES, blocknm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_GreaterThan(String blocknm) {
        regBlocknm(CK_GT, fRES(blocknm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_LessThan(String blocknm) {
        regBlocknm(CK_LT, fRES(blocknm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_GreaterEqual(String blocknm) {
        regBlocknm(CK_GE, fRES(blocknm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_LessEqual(String blocknm) {
        regBlocknm(CK_LE, fRES(blocknm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknmList The collection of blocknm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_InScope(Collection<String> blocknmList) {
        doSetBlocknm_InScope(blocknmList);
    }

    protected void doSetBlocknm_InScope(Collection<String> blocknmList) {
        regINS(CK_INS, cTL(blocknmList), xgetCValueBlocknm(), "BLOCKNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknmList The collection of blocknm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_NotInScope(Collection<String> blocknmList) {
        doSetBlocknm_NotInScope(blocknmList);
    }

    protected void doSetBlocknm_NotInScope(Collection<String> blocknmList) {
        regINS(CK_NINS, cTL(blocknmList), xgetCValueBlocknm(), "BLOCKNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLOCKNM: {varchar(100)} <br>
     * <pre>e.g. setBlocknm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blocknm The value of blocknm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlocknm_LikeSearch(String blocknm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blocknm), xgetCValueBlocknm(), "BLOCKNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlocknm_NotLikeSearch(String blocknm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blocknm), xgetCValueBlocknm(), "BLOCKNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLOCKNM: {varchar(100)}
     * @param blocknm The value of blocknm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlocknm_PrefixSearch(String blocknm) {
        setBlocknm_LikeSearch(blocknm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     */
    public void setBlocknm_IsNull() { regBlocknm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     */
    public void setBlocknm_IsNullOrEmpty() { regBlocknm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLOCKNM: {varchar(100)}
     */
    public void setBlocknm_IsNotNull() { regBlocknm(CK_ISNN, DOBJ); }

    protected void regBlocknm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlocknm(), "BLOCKNM"); }
    protected abstract ConditionValue xgetCValueBlocknm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_Equal(String zzmatnr) {
        doSetZzmatnr_Equal(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_Equal(String zzmatnr) {
        regZzmatnr(CK_EQ, zzmatnr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotEqual(String zzmatnr) {
        doSetZzmatnr_NotEqual(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_NotEqual(String zzmatnr) {
        regZzmatnr(CK_NES, zzmatnr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterThan(String zzmatnr) {
        regZzmatnr(CK_GT, fRES(zzmatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessThan(String zzmatnr) {
        regZzmatnr(CK_LT, fRES(zzmatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterEqual(String zzmatnr) {
        regZzmatnr(CK_GE, fRES(zzmatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessEqual(String zzmatnr) {
        regZzmatnr(CK_LE, fRES(zzmatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnrList The collection of zzmatnr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_InScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_InScope(zzmatnrList);
    }

    protected void doSetZzmatnr_InScope(Collection<String> zzmatnrList) {
        regINS(CK_INS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnrList The collection of zzmatnr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_NotInScope(zzmatnrList);
    }

    protected void doSetZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        regINS(CK_NINS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(100)} <br>
     * <pre>e.g. setZzmatnr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzmatnr The value of zzmatnr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzmatnr_LikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnr_NotLikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(100)}
     * @param zzmatnr The value of zzmatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_PrefixSearch(String zzmatnr) {
        setZzmatnr_LikeSearch(zzmatnr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     */
    public void setZzmatnr_IsNull() { regZzmatnr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     */
    public void setZzmatnr_IsNullOrEmpty() { regZzmatnr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(100)}
     */
    public void setZzmatnr_IsNotNull() { regZzmatnr(CK_ISNN, DOBJ); }

    protected void regZzmatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnr(), "ZZMATNR"); }
    protected abstract ConditionValue xgetCValueZzmatnr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_Equal(String lotno) {
        doSetLotno_Equal(fRES(lotno));
    }

    protected void doSetLotno_Equal(String lotno) {
        regLotno(CK_EQ, lotno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_NotEqual(String lotno) {
        doSetLotno_NotEqual(fRES(lotno));
    }

    protected void doSetLotno_NotEqual(String lotno) {
        regLotno(CK_NES, lotno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_GreaterThan(String lotno) {
        regLotno(CK_GT, fRES(lotno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_LessThan(String lotno) {
        regLotno(CK_LT, fRES(lotno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_GreaterEqual(String lotno) {
        regLotno(CK_GE, fRES(lotno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_LessEqual(String lotno) {
        regLotno(CK_LE, fRES(lotno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotnoList The collection of lotno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_InScope(Collection<String> lotnoList) {
        doSetLotno_InScope(lotnoList);
    }

    protected void doSetLotno_InScope(Collection<String> lotnoList) {
        regINS(CK_INS, cTL(lotnoList), xgetCValueLotno(), "LOTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotnoList The collection of lotno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_NotInScope(Collection<String> lotnoList) {
        doSetLotno_NotInScope(lotnoList);
    }

    protected void doSetLotno_NotInScope(Collection<String> lotnoList) {
        regINS(CK_NINS, cTL(lotnoList), xgetCValueLotno(), "LOTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTNO: {varchar(100)} <br>
     * <pre>e.g. setLotno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotno The value of lotno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotno_LikeSearch(String lotno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotno), xgetCValueLotno(), "LOTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotno_NotLikeSearch(String lotno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotno), xgetCValueLotno(), "LOTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTNO: {varchar(100)}
     * @param lotno The value of lotno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotno_PrefixSearch(String lotno) {
        setLotno_LikeSearch(lotno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     */
    public void setLotno_IsNull() { regLotno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     */
    public void setLotno_IsNullOrEmpty() { regLotno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTNO: {varchar(100)}
     */
    public void setLotno_IsNotNull() { regLotno(CK_ISNN, DOBJ); }

    protected void regLotno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotno(), "LOTNO"); }
    protected abstract ConditionValue xgetCValueLotno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_Equal(String quanty) {
        doSetQuanty_Equal(fRES(quanty));
    }

    protected void doSetQuanty_Equal(String quanty) {
        regQuanty(CK_EQ, quanty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_NotEqual(String quanty) {
        doSetQuanty_NotEqual(fRES(quanty));
    }

    protected void doSetQuanty_NotEqual(String quanty) {
        regQuanty(CK_NES, quanty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_GreaterThan(String quanty) {
        regQuanty(CK_GT, fRES(quanty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_LessThan(String quanty) {
        regQuanty(CK_LT, fRES(quanty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_GreaterEqual(String quanty) {
        regQuanty(CK_GE, fRES(quanty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_LessEqual(String quanty) {
        regQuanty(CK_LE, fRES(quanty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quantyList The collection of quanty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_InScope(Collection<String> quantyList) {
        doSetQuanty_InScope(quantyList);
    }

    protected void doSetQuanty_InScope(Collection<String> quantyList) {
        regINS(CK_INS, cTL(quantyList), xgetCValueQuanty(), "QUANTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quantyList The collection of quanty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_NotInScope(Collection<String> quantyList) {
        doSetQuanty_NotInScope(quantyList);
    }

    protected void doSetQuanty_NotInScope(Collection<String> quantyList) {
        regINS(CK_NINS, cTL(quantyList), xgetCValueQuanty(), "QUANTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUANTY: {varchar(100)} <br>
     * <pre>e.g. setQuanty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param quanty The value of quanty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQuanty_LikeSearch(String quanty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(quanty), xgetCValueQuanty(), "QUANTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQuanty_NotLikeSearch(String quanty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(quanty), xgetCValueQuanty(), "QUANTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUANTY: {varchar(100)}
     * @param quanty The value of quanty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuanty_PrefixSearch(String quanty) {
        setQuanty_LikeSearch(quanty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     */
    public void setQuanty_IsNull() { regQuanty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     */
    public void setQuanty_IsNullOrEmpty() { regQuanty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUANTY: {varchar(100)}
     */
    public void setQuanty_IsNotNull() { regQuanty(CK_ISNN, DOBJ); }

    protected void regQuanty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuanty(), "QUANTY"); }
    protected abstract ConditionValue xgetCValueQuanty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_Equal(String grpcsd) {
        doSetGrpcsd_Equal(fRES(grpcsd));
    }

    protected void doSetGrpcsd_Equal(String grpcsd) {
        regGrpcsd(CK_EQ, grpcsd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_NotEqual(String grpcsd) {
        doSetGrpcsd_NotEqual(fRES(grpcsd));
    }

    protected void doSetGrpcsd_NotEqual(String grpcsd) {
        regGrpcsd(CK_NES, grpcsd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_GreaterThan(String grpcsd) {
        regGrpcsd(CK_GT, fRES(grpcsd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_LessThan(String grpcsd) {
        regGrpcsd(CK_LT, fRES(grpcsd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_GreaterEqual(String grpcsd) {
        regGrpcsd(CK_GE, fRES(grpcsd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_LessEqual(String grpcsd) {
        regGrpcsd(CK_LE, fRES(grpcsd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsdList The collection of grpcsd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_InScope(Collection<String> grpcsdList) {
        doSetGrpcsd_InScope(grpcsdList);
    }

    protected void doSetGrpcsd_InScope(Collection<String> grpcsdList) {
        regINS(CK_INS, cTL(grpcsdList), xgetCValueGrpcsd(), "GRPCSD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsdList The collection of grpcsd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_NotInScope(Collection<String> grpcsdList) {
        doSetGrpcsd_NotInScope(grpcsdList);
    }

    protected void doSetGrpcsd_NotInScope(Collection<String> grpcsdList) {
        regINS(CK_NINS, cTL(grpcsdList), xgetCValueGrpcsd(), "GRPCSD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GRPCSD: {varchar(100)} <br>
     * <pre>e.g. setGrpcsd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grpcsd The value of grpcsd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGrpcsd_LikeSearch(String grpcsd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grpcsd), xgetCValueGrpcsd(), "GRPCSD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGrpcsd_NotLikeSearch(String grpcsd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grpcsd), xgetCValueGrpcsd(), "GRPCSD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GRPCSD: {varchar(100)}
     * @param grpcsd The value of grpcsd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrpcsd_PrefixSearch(String grpcsd) {
        setGrpcsd_LikeSearch(grpcsd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     */
    public void setGrpcsd_IsNull() { regGrpcsd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     */
    public void setGrpcsd_IsNullOrEmpty() { regGrpcsd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GRPCSD: {varchar(100)}
     */
    public void setGrpcsd_IsNotNull() { regGrpcsd(CK_ISNN, DOBJ); }

    protected void regGrpcsd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrpcsd(), "GRPCSD"); }
    protected abstract ConditionValue xgetCValueGrpcsd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_Equal(String sfpoqa) {
        doSetSfpoqa_Equal(fRES(sfpoqa));
    }

    protected void doSetSfpoqa_Equal(String sfpoqa) {
        regSfpoqa(CK_EQ, sfpoqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_NotEqual(String sfpoqa) {
        doSetSfpoqa_NotEqual(fRES(sfpoqa));
    }

    protected void doSetSfpoqa_NotEqual(String sfpoqa) {
        regSfpoqa(CK_NES, sfpoqa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_GreaterThan(String sfpoqa) {
        regSfpoqa(CK_GT, fRES(sfpoqa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_LessThan(String sfpoqa) {
        regSfpoqa(CK_LT, fRES(sfpoqa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_GreaterEqual(String sfpoqa) {
        regSfpoqa(CK_GE, fRES(sfpoqa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_LessEqual(String sfpoqa) {
        regSfpoqa(CK_LE, fRES(sfpoqa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqaList The collection of sfpoqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_InScope(Collection<String> sfpoqaList) {
        doSetSfpoqa_InScope(sfpoqaList);
    }

    protected void doSetSfpoqa_InScope(Collection<String> sfpoqaList) {
        regINS(CK_INS, cTL(sfpoqaList), xgetCValueSfpoqa(), "SFPOQA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqaList The collection of sfpoqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_NotInScope(Collection<String> sfpoqaList) {
        doSetSfpoqa_NotInScope(sfpoqaList);
    }

    protected void doSetSfpoqa_NotInScope(Collection<String> sfpoqaList) {
        regINS(CK_NINS, cTL(sfpoqaList), xgetCValueSfpoqa(), "SFPOQA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFPOQA: {varchar(100)} <br>
     * <pre>e.g. setSfpoqa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sfpoqa The value of sfpoqa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSfpoqa_LikeSearch(String sfpoqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sfpoqa), xgetCValueSfpoqa(), "SFPOQA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSfpoqa_NotLikeSearch(String sfpoqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sfpoqa), xgetCValueSfpoqa(), "SFPOQA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFPOQA: {varchar(100)}
     * @param sfpoqa The value of sfpoqa as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfpoqa_PrefixSearch(String sfpoqa) {
        setSfpoqa_LikeSearch(sfpoqa, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     */
    public void setSfpoqa_IsNull() { regSfpoqa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     */
    public void setSfpoqa_IsNullOrEmpty() { regSfpoqa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFPOQA: {varchar(100)}
     */
    public void setSfpoqa_IsNotNull() { regSfpoqa(CK_ISNN, DOBJ); }

    protected void regSfpoqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSfpoqa(), "SFPOQA"); }
    protected abstract ConditionValue xgetCValueSfpoqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_Equal(String dsskplcd) {
        doSetDsskplcd_Equal(fRES(dsskplcd));
    }

    protected void doSetDsskplcd_Equal(String dsskplcd) {
        regDsskplcd(CK_EQ, dsskplcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_NotEqual(String dsskplcd) {
        doSetDsskplcd_NotEqual(fRES(dsskplcd));
    }

    protected void doSetDsskplcd_NotEqual(String dsskplcd) {
        regDsskplcd(CK_NES, dsskplcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_GreaterThan(String dsskplcd) {
        regDsskplcd(CK_GT, fRES(dsskplcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_LessThan(String dsskplcd) {
        regDsskplcd(CK_LT, fRES(dsskplcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_GreaterEqual(String dsskplcd) {
        regDsskplcd(CK_GE, fRES(dsskplcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_LessEqual(String dsskplcd) {
        regDsskplcd(CK_LE, fRES(dsskplcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcdList The collection of dsskplcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_InScope(Collection<String> dsskplcdList) {
        doSetDsskplcd_InScope(dsskplcdList);
    }

    protected void doSetDsskplcd_InScope(Collection<String> dsskplcdList) {
        regINS(CK_INS, cTL(dsskplcdList), xgetCValueDsskplcd(), "DSSKPLCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcdList The collection of dsskplcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_NotInScope(Collection<String> dsskplcdList) {
        doSetDsskplcd_NotInScope(dsskplcdList);
    }

    protected void doSetDsskplcd_NotInScope(Collection<String> dsskplcdList) {
        regINS(CK_NINS, cTL(dsskplcdList), xgetCValueDsskplcd(), "DSSKPLCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSSKPLCD: {varchar(100)} <br>
     * <pre>e.g. setDsskplcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dsskplcd The value of dsskplcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDsskplcd_LikeSearch(String dsskplcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dsskplcd), xgetCValueDsskplcd(), "DSSKPLCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDsskplcd_NotLikeSearch(String dsskplcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dsskplcd), xgetCValueDsskplcd(), "DSSKPLCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     * @param dsskplcd The value of dsskplcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDsskplcd_PrefixSearch(String dsskplcd) {
        setDsskplcd_LikeSearch(dsskplcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     */
    public void setDsskplcd_IsNull() { regDsskplcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     */
    public void setDsskplcd_IsNullOrEmpty() { regDsskplcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DSSKPLCD: {varchar(100)}
     */
    public void setDsskplcd_IsNotNull() { regDsskplcd(CK_ISNN, DOBJ); }

    protected void regDsskplcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDsskplcd(), "DSSKPLCD"); }
    protected abstract ConditionValue xgetCValueDsskplcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_Equal(String mfinf) {
        doSetMfinf_Equal(fRES(mfinf));
    }

    protected void doSetMfinf_Equal(String mfinf) {
        regMfinf(CK_EQ, mfinf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_NotEqual(String mfinf) {
        doSetMfinf_NotEqual(fRES(mfinf));
    }

    protected void doSetMfinf_NotEqual(String mfinf) {
        regMfinf(CK_NES, mfinf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_GreaterThan(String mfinf) {
        regMfinf(CK_GT, fRES(mfinf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_LessThan(String mfinf) {
        regMfinf(CK_LT, fRES(mfinf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_GreaterEqual(String mfinf) {
        regMfinf(CK_GE, fRES(mfinf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_LessEqual(String mfinf) {
        regMfinf(CK_LE, fRES(mfinf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinfList The collection of mfinf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_InScope(Collection<String> mfinfList) {
        doSetMfinf_InScope(mfinfList);
    }

    protected void doSetMfinf_InScope(Collection<String> mfinfList) {
        regINS(CK_INS, cTL(mfinfList), xgetCValueMfinf(), "MFINF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinfList The collection of mfinf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_NotInScope(Collection<String> mfinfList) {
        doSetMfinf_NotInScope(mfinfList);
    }

    protected void doSetMfinf_NotInScope(Collection<String> mfinfList) {
        regINS(CK_NINS, cTL(mfinfList), xgetCValueMfinf(), "MFINF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MFINF: {varchar(100)} <br>
     * <pre>e.g. setMfinf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mfinf The value of mfinf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMfinf_LikeSearch(String mfinf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mfinf), xgetCValueMfinf(), "MFINF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMfinf_NotLikeSearch(String mfinf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mfinf), xgetCValueMfinf(), "MFINF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MFINF: {varchar(100)}
     * @param mfinf The value of mfinf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfinf_PrefixSearch(String mfinf) {
        setMfinf_LikeSearch(mfinf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     */
    public void setMfinf_IsNull() { regMfinf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     */
    public void setMfinf_IsNullOrEmpty() { regMfinf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MFINF: {varchar(100)}
     */
    public void setMfinf_IsNotNull() { regMfinf(CK_ISNN, DOBJ); }

    protected void regMfinf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMfinf(), "MFINF"); }
    protected abstract ConditionValue xgetCValueMfinf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_Equal(String sfthdes) {
        doSetSfthdes_Equal(fRES(sfthdes));
    }

    protected void doSetSfthdes_Equal(String sfthdes) {
        regSfthdes(CK_EQ, sfthdes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_NotEqual(String sfthdes) {
        doSetSfthdes_NotEqual(fRES(sfthdes));
    }

    protected void doSetSfthdes_NotEqual(String sfthdes) {
        regSfthdes(CK_NES, sfthdes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_GreaterThan(String sfthdes) {
        regSfthdes(CK_GT, fRES(sfthdes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_LessThan(String sfthdes) {
        regSfthdes(CK_LT, fRES(sfthdes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_GreaterEqual(String sfthdes) {
        regSfthdes(CK_GE, fRES(sfthdes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_LessEqual(String sfthdes) {
        regSfthdes(CK_LE, fRES(sfthdes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdesList The collection of sfthdes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_InScope(Collection<String> sfthdesList) {
        doSetSfthdes_InScope(sfthdesList);
    }

    protected void doSetSfthdes_InScope(Collection<String> sfthdesList) {
        regINS(CK_INS, cTL(sfthdesList), xgetCValueSfthdes(), "SFTHDES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdesList The collection of sfthdes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_NotInScope(Collection<String> sfthdesList) {
        doSetSfthdes_NotInScope(sfthdesList);
    }

    protected void doSetSfthdes_NotInScope(Collection<String> sfthdesList) {
        regINS(CK_NINS, cTL(sfthdesList), xgetCValueSfthdes(), "SFTHDES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTHDES: {varchar(100)} <br>
     * <pre>e.g. setSfthdes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sfthdes The value of sfthdes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSfthdes_LikeSearch(String sfthdes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sfthdes), xgetCValueSfthdes(), "SFTHDES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSfthdes_NotLikeSearch(String sfthdes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sfthdes), xgetCValueSfthdes(), "SFTHDES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTHDES: {varchar(100)}
     * @param sfthdes The value of sfthdes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfthdes_PrefixSearch(String sfthdes) {
        setSfthdes_LikeSearch(sfthdes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     */
    public void setSfthdes_IsNull() { regSfthdes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     */
    public void setSfthdes_IsNullOrEmpty() { regSfthdes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFTHDES: {varchar(100)}
     */
    public void setSfthdes_IsNotNull() { regSfthdes(CK_ISNN, DOBJ); }

    protected void regSfthdes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSfthdes(), "SFTHDES"); }
    protected abstract ConditionValue xgetCValueSfthdes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_Equal(String cnfatcl) {
        doSetCnfatcl_Equal(fRES(cnfatcl));
    }

    protected void doSetCnfatcl_Equal(String cnfatcl) {
        regCnfatcl(CK_EQ, cnfatcl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_NotEqual(String cnfatcl) {
        doSetCnfatcl_NotEqual(fRES(cnfatcl));
    }

    protected void doSetCnfatcl_NotEqual(String cnfatcl) {
        regCnfatcl(CK_NES, cnfatcl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_GreaterThan(String cnfatcl) {
        regCnfatcl(CK_GT, fRES(cnfatcl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_LessThan(String cnfatcl) {
        regCnfatcl(CK_LT, fRES(cnfatcl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_GreaterEqual(String cnfatcl) {
        regCnfatcl(CK_GE, fRES(cnfatcl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_LessEqual(String cnfatcl) {
        regCnfatcl(CK_LE, fRES(cnfatcl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatclList The collection of cnfatcl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_InScope(Collection<String> cnfatclList) {
        doSetCnfatcl_InScope(cnfatclList);
    }

    protected void doSetCnfatcl_InScope(Collection<String> cnfatclList) {
        regINS(CK_INS, cTL(cnfatclList), xgetCValueCnfatcl(), "CNFATCL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatclList The collection of cnfatcl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_NotInScope(Collection<String> cnfatclList) {
        doSetCnfatcl_NotInScope(cnfatclList);
    }

    protected void doSetCnfatcl_NotInScope(Collection<String> cnfatclList) {
        regINS(CK_NINS, cTL(cnfatclList), xgetCValueCnfatcl(), "CNFATCL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNFATCL: {varchar(100)} <br>
     * <pre>e.g. setCnfatcl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cnfatcl The value of cnfatcl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCnfatcl_LikeSearch(String cnfatcl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cnfatcl), xgetCValueCnfatcl(), "CNFATCL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCnfatcl_NotLikeSearch(String cnfatcl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cnfatcl), xgetCValueCnfatcl(), "CNFATCL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNFATCL: {varchar(100)}
     * @param cnfatcl The value of cnfatcl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnfatcl_PrefixSearch(String cnfatcl) {
        setCnfatcl_LikeSearch(cnfatcl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     */
    public void setCnfatcl_IsNull() { regCnfatcl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     */
    public void setCnfatcl_IsNullOrEmpty() { regCnfatcl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNFATCL: {varchar(100)}
     */
    public void setCnfatcl_IsNotNull() { regCnfatcl(CK_ISNN, DOBJ); }

    protected void regCnfatcl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCnfatcl(), "CNFATCL"); }
    protected abstract ConditionValue xgetCValueCnfatcl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_Equal(String lastgr) {
        doSetLastgr_Equal(fRES(lastgr));
    }

    protected void doSetLastgr_Equal(String lastgr) {
        regLastgr(CK_EQ, lastgr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_NotEqual(String lastgr) {
        doSetLastgr_NotEqual(fRES(lastgr));
    }

    protected void doSetLastgr_NotEqual(String lastgr) {
        regLastgr(CK_NES, lastgr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_GreaterThan(String lastgr) {
        regLastgr(CK_GT, fRES(lastgr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_LessThan(String lastgr) {
        regLastgr(CK_LT, fRES(lastgr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_GreaterEqual(String lastgr) {
        regLastgr(CK_GE, fRES(lastgr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_LessEqual(String lastgr) {
        regLastgr(CK_LE, fRES(lastgr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgrList The collection of lastgr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_InScope(Collection<String> lastgrList) {
        doSetLastgr_InScope(lastgrList);
    }

    protected void doSetLastgr_InScope(Collection<String> lastgrList) {
        regINS(CK_INS, cTL(lastgrList), xgetCValueLastgr(), "LASTGR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgrList The collection of lastgr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_NotInScope(Collection<String> lastgrList) {
        doSetLastgr_NotInScope(lastgrList);
    }

    protected void doSetLastgr_NotInScope(Collection<String> lastgrList) {
        regINS(CK_NINS, cTL(lastgrList), xgetCValueLastgr(), "LASTGR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LASTGR: {varchar(100)} <br>
     * <pre>e.g. setLastgr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastgr The value of lastgr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLastgr_LikeSearch(String lastgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastgr), xgetCValueLastgr(), "LASTGR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLastgr_NotLikeSearch(String lastgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastgr), xgetCValueLastgr(), "LASTGR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LASTGR: {varchar(100)}
     * @param lastgr The value of lastgr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastgr_PrefixSearch(String lastgr) {
        setLastgr_LikeSearch(lastgr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     */
    public void setLastgr_IsNull() { regLastgr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     */
    public void setLastgr_IsNullOrEmpty() { regLastgr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LASTGR: {varchar(100)}
     */
    public void setLastgr_IsNotNull() { regLastgr(CK_ISNN, DOBJ); }

    protected void regLastgr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastgr(), "LASTGR"); }
    protected abstract ConditionValue xgetCValueLastgr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_Equal(String sflastdes) {
        doSetSflastdes_Equal(fRES(sflastdes));
    }

    protected void doSetSflastdes_Equal(String sflastdes) {
        regSflastdes(CK_EQ, sflastdes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_NotEqual(String sflastdes) {
        doSetSflastdes_NotEqual(fRES(sflastdes));
    }

    protected void doSetSflastdes_NotEqual(String sflastdes) {
        regSflastdes(CK_NES, sflastdes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_GreaterThan(String sflastdes) {
        regSflastdes(CK_GT, fRES(sflastdes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_LessThan(String sflastdes) {
        regSflastdes(CK_LT, fRES(sflastdes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_GreaterEqual(String sflastdes) {
        regSflastdes(CK_GE, fRES(sflastdes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_LessEqual(String sflastdes) {
        regSflastdes(CK_LE, fRES(sflastdes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdesList The collection of sflastdes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_InScope(Collection<String> sflastdesList) {
        doSetSflastdes_InScope(sflastdesList);
    }

    protected void doSetSflastdes_InScope(Collection<String> sflastdesList) {
        regINS(CK_INS, cTL(sflastdesList), xgetCValueSflastdes(), "SFLASTDES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdesList The collection of sflastdes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_NotInScope(Collection<String> sflastdesList) {
        doSetSflastdes_NotInScope(sflastdesList);
    }

    protected void doSetSflastdes_NotInScope(Collection<String> sflastdesList) {
        regINS(CK_NINS, cTL(sflastdesList), xgetCValueSflastdes(), "SFLASTDES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFLASTDES: {varchar(100)} <br>
     * <pre>e.g. setSflastdes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sflastdes The value of sflastdes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSflastdes_LikeSearch(String sflastdes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sflastdes), xgetCValueSflastdes(), "SFLASTDES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSflastdes_NotLikeSearch(String sflastdes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sflastdes), xgetCValueSflastdes(), "SFLASTDES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFLASTDES: {varchar(100)}
     * @param sflastdes The value of sflastdes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSflastdes_PrefixSearch(String sflastdes) {
        setSflastdes_LikeSearch(sflastdes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     */
    public void setSflastdes_IsNull() { regSflastdes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     */
    public void setSflastdes_IsNullOrEmpty() { regSflastdes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFLASTDES: {varchar(100)}
     */
    public void setSflastdes_IsNotNull() { regSflastdes(CK_ISNN, DOBJ); }

    protected void regSflastdes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSflastdes(), "SFLASTDES"); }
    protected abstract ConditionValue xgetCValueSflastdes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_Equal(String shno) {
        doSetShno_Equal(fRES(shno));
    }

    protected void doSetShno_Equal(String shno) {
        regShno(CK_EQ, shno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_NotEqual(String shno) {
        doSetShno_NotEqual(fRES(shno));
    }

    protected void doSetShno_NotEqual(String shno) {
        regShno(CK_NES, shno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_GreaterThan(String shno) {
        regShno(CK_GT, fRES(shno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_LessThan(String shno) {
        regShno(CK_LT, fRES(shno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_GreaterEqual(String shno) {
        regShno(CK_GE, fRES(shno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_LessEqual(String shno) {
        regShno(CK_LE, fRES(shno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shnoList The collection of shno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_InScope(Collection<String> shnoList) {
        doSetShno_InScope(shnoList);
    }

    protected void doSetShno_InScope(Collection<String> shnoList) {
        regINS(CK_INS, cTL(shnoList), xgetCValueShno(), "SHNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shnoList The collection of shno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_NotInScope(Collection<String> shnoList) {
        doSetShno_NotInScope(shnoList);
    }

    protected void doSetShno_NotInScope(Collection<String> shnoList) {
        regINS(CK_NINS, cTL(shnoList), xgetCValueShno(), "SHNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHNO: {varchar(100)} <br>
     * <pre>e.g. setShno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shno The value of shno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShno_LikeSearch(String shno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shno), xgetCValueShno(), "SHNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShno_NotLikeSearch(String shno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shno), xgetCValueShno(), "SHNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHNO: {varchar(100)}
     * @param shno The value of shno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShno_PrefixSearch(String shno) {
        setShno_LikeSearch(shno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     */
    public void setShno_IsNull() { regShno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     */
    public void setShno_IsNullOrEmpty() { regShno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHNO: {varchar(100)}
     */
    public void setShno_IsNotNull() { regShno(CK_ISNN, DOBJ); }

    protected void regShno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShno(), "SHNO"); }
    protected abstract ConditionValue xgetCValueShno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_Equal(String pltno) {
        doSetPltno_Equal(fRES(pltno));
    }

    protected void doSetPltno_Equal(String pltno) {
        regPltno(CK_EQ, pltno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_NotEqual(String pltno) {
        doSetPltno_NotEqual(fRES(pltno));
    }

    protected void doSetPltno_NotEqual(String pltno) {
        regPltno(CK_NES, pltno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_GreaterThan(String pltno) {
        regPltno(CK_GT, fRES(pltno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_LessThan(String pltno) {
        regPltno(CK_LT, fRES(pltno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_GreaterEqual(String pltno) {
        regPltno(CK_GE, fRES(pltno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_LessEqual(String pltno) {
        regPltno(CK_LE, fRES(pltno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltnoList The collection of pltno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_InScope(Collection<String> pltnoList) {
        doSetPltno_InScope(pltnoList);
    }

    protected void doSetPltno_InScope(Collection<String> pltnoList) {
        regINS(CK_INS, cTL(pltnoList), xgetCValuePltno(), "PLTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltnoList The collection of pltno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_NotInScope(Collection<String> pltnoList) {
        doSetPltno_NotInScope(pltnoList);
    }

    protected void doSetPltno_NotInScope(Collection<String> pltnoList) {
        regINS(CK_NINS, cTL(pltnoList), xgetCValuePltno(), "PLTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLTNO: {varchar(100)} <br>
     * <pre>e.g. setPltno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pltno The value of pltno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPltno_LikeSearch(String pltno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pltno), xgetCValuePltno(), "PLTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPltno_NotLikeSearch(String pltno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pltno), xgetCValuePltno(), "PLTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLTNO: {varchar(100)}
     * @param pltno The value of pltno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPltno_PrefixSearch(String pltno) {
        setPltno_LikeSearch(pltno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     */
    public void setPltno_IsNull() { regPltno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     */
    public void setPltno_IsNullOrEmpty() { regPltno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLTNO: {varchar(100)}
     */
    public void setPltno_IsNotNull() { regPltno(CK_ISNN, DOBJ); }

    protected void regPltno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePltno(), "PLTNO"); }
    protected abstract ConditionValue xgetCValuePltno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_Equal(String tradelivno) {
        doSetTradelivno_Equal(fRES(tradelivno));
    }

    protected void doSetTradelivno_Equal(String tradelivno) {
        regTradelivno(CK_EQ, tradelivno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_NotEqual(String tradelivno) {
        doSetTradelivno_NotEqual(fRES(tradelivno));
    }

    protected void doSetTradelivno_NotEqual(String tradelivno) {
        regTradelivno(CK_NES, tradelivno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_GreaterThan(String tradelivno) {
        regTradelivno(CK_GT, fRES(tradelivno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_LessThan(String tradelivno) {
        regTradelivno(CK_LT, fRES(tradelivno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_GreaterEqual(String tradelivno) {
        regTradelivno(CK_GE, fRES(tradelivno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_LessEqual(String tradelivno) {
        regTradelivno(CK_LE, fRES(tradelivno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivnoList The collection of tradelivno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_InScope(Collection<String> tradelivnoList) {
        doSetTradelivno_InScope(tradelivnoList);
    }

    protected void doSetTradelivno_InScope(Collection<String> tradelivnoList) {
        regINS(CK_INS, cTL(tradelivnoList), xgetCValueTradelivno(), "TRADELIVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivnoList The collection of tradelivno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_NotInScope(Collection<String> tradelivnoList) {
        doSetTradelivno_NotInScope(tradelivnoList);
    }

    protected void doSetTradelivno_NotInScope(Collection<String> tradelivnoList) {
        regINS(CK_NINS, cTL(tradelivnoList), xgetCValueTradelivno(), "TRADELIVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRADELIVNO: {varchar(100)} <br>
     * <pre>e.g. setTradelivno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tradelivno The value of tradelivno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTradelivno_LikeSearch(String tradelivno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tradelivno), xgetCValueTradelivno(), "TRADELIVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTradelivno_NotLikeSearch(String tradelivno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tradelivno), xgetCValueTradelivno(), "TRADELIVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     * @param tradelivno The value of tradelivno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTradelivno_PrefixSearch(String tradelivno) {
        setTradelivno_LikeSearch(tradelivno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     */
    public void setTradelivno_IsNull() { regTradelivno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     */
    public void setTradelivno_IsNullOrEmpty() { regTradelivno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRADELIVNO: {varchar(100)}
     */
    public void setTradelivno_IsNotNull() { regTradelivno(CK_ISNN, DOBJ); }

    protected void regTradelivno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTradelivno(), "TRADELIVNO"); }
    protected abstract ConditionValue xgetCValueTradelivno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_Equal(String batjmfym) {
        doSetBatjmfym_Equal(fRES(batjmfym));
    }

    protected void doSetBatjmfym_Equal(String batjmfym) {
        regBatjmfym(CK_EQ, batjmfym);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_NotEqual(String batjmfym) {
        doSetBatjmfym_NotEqual(fRES(batjmfym));
    }

    protected void doSetBatjmfym_NotEqual(String batjmfym) {
        regBatjmfym(CK_NES, batjmfym);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_GreaterThan(String batjmfym) {
        regBatjmfym(CK_GT, fRES(batjmfym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_LessThan(String batjmfym) {
        regBatjmfym(CK_LT, fRES(batjmfym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_GreaterEqual(String batjmfym) {
        regBatjmfym(CK_GE, fRES(batjmfym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_LessEqual(String batjmfym) {
        regBatjmfym(CK_LE, fRES(batjmfym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfymList The collection of batjmfym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_InScope(Collection<String> batjmfymList) {
        doSetBatjmfym_InScope(batjmfymList);
    }

    protected void doSetBatjmfym_InScope(Collection<String> batjmfymList) {
        regINS(CK_INS, cTL(batjmfymList), xgetCValueBatjmfym(), "BATJMFYM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfymList The collection of batjmfym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_NotInScope(Collection<String> batjmfymList) {
        doSetBatjmfym_NotInScope(batjmfymList);
    }

    protected void doSetBatjmfym_NotInScope(Collection<String> batjmfymList) {
        regINS(CK_NINS, cTL(batjmfymList), xgetCValueBatjmfym(), "BATJMFYM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(100)} <br>
     * <pre>e.g. setBatjmfym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batjmfym The value of batjmfym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatjmfym_LikeSearch(String batjmfym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batjmfym), xgetCValueBatjmfym(), "BATJMFYM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatjmfym_NotLikeSearch(String batjmfym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batjmfym), xgetCValueBatjmfym(), "BATJMFYM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(100)}
     * @param batjmfym The value of batjmfym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_PrefixSearch(String batjmfym) {
        setBatjmfym_LikeSearch(batjmfym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     */
    public void setBatjmfym_IsNull() { regBatjmfym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     */
    public void setBatjmfym_IsNullOrEmpty() { regBatjmfym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(100)}
     */
    public void setBatjmfym_IsNotNull() { regBatjmfym(CK_ISNN, DOBJ); }

    protected void regBatjmfym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatjmfym(), "BATJMFYM"); }
    protected abstract ConditionValue xgetCValueBatjmfym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_Equal(String sffil) {
        doSetSffil_Equal(fRES(sffil));
    }

    protected void doSetSffil_Equal(String sffil) {
        regSffil(CK_EQ, sffil);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_NotEqual(String sffil) {
        doSetSffil_NotEqual(fRES(sffil));
    }

    protected void doSetSffil_NotEqual(String sffil) {
        regSffil(CK_NES, sffil);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_GreaterThan(String sffil) {
        regSffil(CK_GT, fRES(sffil));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_LessThan(String sffil) {
        regSffil(CK_LT, fRES(sffil));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_GreaterEqual(String sffil) {
        regSffil(CK_GE, fRES(sffil));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_LessEqual(String sffil) {
        regSffil(CK_LE, fRES(sffil));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffilList The collection of sffil as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_InScope(Collection<String> sffilList) {
        doSetSffil_InScope(sffilList);
    }

    protected void doSetSffil_InScope(Collection<String> sffilList) {
        regINS(CK_INS, cTL(sffilList), xgetCValueSffil(), "SFFIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffilList The collection of sffil as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_NotInScope(Collection<String> sffilList) {
        doSetSffil_NotInScope(sffilList);
    }

    protected void doSetSffil_NotInScope(Collection<String> sffilList) {
        regINS(CK_NINS, cTL(sffilList), xgetCValueSffil(), "SFFIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFFIL: {varchar(100)} <br>
     * <pre>e.g. setSffil_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sffil The value of sffil as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSffil_LikeSearch(String sffil, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sffil), xgetCValueSffil(), "SFFIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSffil_NotLikeSearch(String sffil, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sffil), xgetCValueSffil(), "SFFIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFFIL: {varchar(100)}
     * @param sffil The value of sffil as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSffil_PrefixSearch(String sffil) {
        setSffil_LikeSearch(sffil, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     */
    public void setSffil_IsNull() { regSffil(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     */
    public void setSffil_IsNullOrEmpty() { regSffil(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFFIL: {varchar(100)}
     */
    public void setSffil_IsNotNull() { regSffil(CK_ISNN, DOBJ); }

    protected void regSffil(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSffil(), "SFFIL"); }
    protected abstract ConditionValue xgetCValueSffil();

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
    public HpSLCFunction<EPrimaryShippingDtlInfoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EPrimaryShippingDtlInfoCB.class);
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
    public HpSLCFunction<EPrimaryShippingDtlInfoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EPrimaryShippingDtlInfoCB.class);
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
    public HpSLCFunction<EPrimaryShippingDtlInfoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EPrimaryShippingDtlInfoCB.class);
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
    public HpSLCFunction<EPrimaryShippingDtlInfoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EPrimaryShippingDtlInfoCB.class);
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
    public HpSLCFunction<EPrimaryShippingDtlInfoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EPrimaryShippingDtlInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EPrimaryShippingDtlInfoCB&gt;() {
     *     public void query(EPrimaryShippingDtlInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EPrimaryShippingDtlInfoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EPrimaryShippingDtlInfoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EPrimaryShippingDtlInfoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EPrimaryShippingDtlInfoCQ sq);

    protected EPrimaryShippingDtlInfoCB xcreateScalarConditionCB() {
        EPrimaryShippingDtlInfoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EPrimaryShippingDtlInfoCB xcreateScalarConditionPartitionByCB() {
        EPrimaryShippingDtlInfoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EPrimaryShippingDtlInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EPrimaryShippingDtlInfoCB cb = new EPrimaryShippingDtlInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRIMARY_SHIPPING_DTL_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EPrimaryShippingDtlInfoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EPrimaryShippingDtlInfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EPrimaryShippingDtlInfoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EPrimaryShippingDtlInfoCB cb = new EPrimaryShippingDtlInfoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRIMARY_SHIPPING_DTL_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EPrimaryShippingDtlInfoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EPrimaryShippingDtlInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EPrimaryShippingDtlInfoCB cb = new EPrimaryShippingDtlInfoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EPrimaryShippingDtlInfoCQ sq);

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
    protected EPrimaryShippingDtlInfoCB newMyCB() {
        return new EPrimaryShippingDtlInfoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EPrimaryShippingDtlInfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

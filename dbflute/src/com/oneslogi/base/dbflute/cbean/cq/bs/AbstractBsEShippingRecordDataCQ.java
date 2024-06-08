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
 * The abstract condition-query of E_SHIPPING_RECORD_DATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShippingRecordDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShippingRecordDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SHIPPING_RECORD_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataId The value of shippingRecordDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_Equal(Long shippingRecordDataId) {
        doSetShippingRecordDataId_Equal(shippingRecordDataId);
    }

    protected void doSetShippingRecordDataId_Equal(Long shippingRecordDataId) {
        regShippingRecordDataId(CK_EQ, shippingRecordDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataId The value of shippingRecordDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_NotEqual(Long shippingRecordDataId) {
        doSetShippingRecordDataId_NotEqual(shippingRecordDataId);
    }

    protected void doSetShippingRecordDataId_NotEqual(Long shippingRecordDataId) {
        regShippingRecordDataId(CK_NES, shippingRecordDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataId The value of shippingRecordDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_GreaterThan(Long shippingRecordDataId) {
        regShippingRecordDataId(CK_GT, shippingRecordDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataId The value of shippingRecordDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_LessThan(Long shippingRecordDataId) {
        regShippingRecordDataId(CK_LT, shippingRecordDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataId The value of shippingRecordDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_GreaterEqual(Long shippingRecordDataId) {
        regShippingRecordDataId(CK_GE, shippingRecordDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataId The value of shippingRecordDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_LessEqual(Long shippingRecordDataId) {
        regShippingRecordDataId(CK_LE, shippingRecordDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingRecordDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingRecordDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingRecordDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingRecordDataId(), "SHIPPING_RECORD_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataIdList The collection of shippingRecordDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_InScope(Collection<Long> shippingRecordDataIdList) {
        doSetShippingRecordDataId_InScope(shippingRecordDataIdList);
    }

    protected void doSetShippingRecordDataId_InScope(Collection<Long> shippingRecordDataIdList) {
        regINS(CK_INS, cTL(shippingRecordDataIdList), xgetCValueShippingRecordDataId(), "SHIPPING_RECORD_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingRecordDataIdList The collection of shippingRecordDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordDataId_NotInScope(Collection<Long> shippingRecordDataIdList) {
        doSetShippingRecordDataId_NotInScope(shippingRecordDataIdList);
    }

    protected void doSetShippingRecordDataId_NotInScope(Collection<Long> shippingRecordDataIdList) {
        regINS(CK_NINS, cTL(shippingRecordDataIdList), xgetCValueShippingRecordDataId(), "SHIPPING_RECORD_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingRecordDataId_IsNull() { regShippingRecordDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingRecordDataId_IsNotNull() { regShippingRecordDataId(CK_ISNN, DOBJ); }

    protected void regShippingRecordDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordDataId(), "SHIPPING_RECORD_DATA_ID"); }
    protected abstract ConditionValue xgetCValueShippingRecordDataId();

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
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_Equal(String dataFlg) {
        doSetDataFlg_Equal(fRES(dataFlg));
    }

    protected void doSetDataFlg_Equal(String dataFlg) {
        regDataFlg(CK_EQ, dataFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_NotEqual(String dataFlg) {
        doSetDataFlg_NotEqual(fRES(dataFlg));
    }

    protected void doSetDataFlg_NotEqual(String dataFlg) {
        regDataFlg(CK_NES, dataFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_GreaterThan(String dataFlg) {
        regDataFlg(CK_GT, fRES(dataFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_LessThan(String dataFlg) {
        regDataFlg(CK_LT, fRES(dataFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_GreaterEqual(String dataFlg) {
        regDataFlg(CK_GE, fRES(dataFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_LessEqual(String dataFlg) {
        regDataFlg(CK_LE, fRES(dataFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlgList The collection of dataFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_InScope(Collection<String> dataFlgList) {
        doSetDataFlg_InScope(dataFlgList);
    }

    protected void doSetDataFlg_InScope(Collection<String> dataFlgList) {
        regINS(CK_INS, cTL(dataFlgList), xgetCValueDataFlg(), "DATA_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlgList The collection of dataFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_NotInScope(Collection<String> dataFlgList) {
        doSetDataFlg_NotInScope(dataFlgList);
    }

    protected void doSetDataFlg_NotInScope(Collection<String> dataFlgList) {
        regINS(CK_NINS, cTL(dataFlgList), xgetCValueDataFlg(), "DATA_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setDataFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataFlg The value of dataFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataFlg_LikeSearch(String dataFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataFlg), xgetCValueDataFlg(), "DATA_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataFlg_NotLikeSearch(String dataFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataFlg), xgetCValueDataFlg(), "DATA_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @param dataFlg The value of dataFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataFlg_PrefixSearch(String dataFlg) {
        setDataFlg_LikeSearch(dataFlg, xcLSOPPre());
    }

    protected void regDataFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataFlg(), "DATA_FLG"); }
    protected abstract ConditionValue xgetCValueDataFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_Equal(String recordData) {
        doSetRecordData_Equal(fRES(recordData));
    }

    protected void doSetRecordData_Equal(String recordData) {
        regRecordData(CK_EQ, recordData);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_NotEqual(String recordData) {
        doSetRecordData_NotEqual(fRES(recordData));
    }

    protected void doSetRecordData_NotEqual(String recordData) {
        regRecordData(CK_NES, recordData);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_GreaterThan(String recordData) {
        regRecordData(CK_GT, fRES(recordData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_LessThan(String recordData) {
        regRecordData(CK_LT, fRES(recordData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_GreaterEqual(String recordData) {
        regRecordData(CK_GE, fRES(recordData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_LessEqual(String recordData) {
        regRecordData(CK_LE, fRES(recordData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordDataList The collection of recordData as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_InScope(Collection<String> recordDataList) {
        doSetRecordData_InScope(recordDataList);
    }

    protected void doSetRecordData_InScope(Collection<String> recordDataList) {
        regINS(CK_INS, cTL(recordDataList), xgetCValueRecordData(), "RECORD_DATA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordDataList The collection of recordData as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_NotInScope(Collection<String> recordDataList) {
        doSetRecordData_NotInScope(recordDataList);
    }

    protected void doSetRecordData_NotInScope(Collection<String> recordDataList) {
        regINS(CK_NINS, cTL(recordDataList), xgetCValueRecordData(), "RECORD_DATA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECORD_DATA: {varchar(255)} <br>
     * <pre>e.g. setRecordData_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recordData The value of recordData as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecordData_LikeSearch(String recordData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recordData), xgetCValueRecordData(), "RECORD_DATA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecordData_NotLikeSearch(String recordData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recordData), xgetCValueRecordData(), "RECORD_DATA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     * @param recordData The value of recordData as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordData_PrefixSearch(String recordData) {
        setRecordData_LikeSearch(recordData, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     */
    public void setRecordData_IsNull() { regRecordData(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     */
    public void setRecordData_IsNullOrEmpty() { regRecordData(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECORD_DATA: {varchar(255)}
     */
    public void setRecordData_IsNotNull() { regRecordData(CK_ISNN, DOBJ); }

    protected void regRecordData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecordData(), "RECORD_DATA"); }
    protected abstract ConditionValue xgetCValueRecordData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_Equal(String transportcd) {
        doSetTransportcd_Equal(fRES(transportcd));
    }

    protected void doSetTransportcd_Equal(String transportcd) {
        regTransportcd(CK_EQ, transportcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotEqual(String transportcd) {
        doSetTransportcd_NotEqual(fRES(transportcd));
    }

    protected void doSetTransportcd_NotEqual(String transportcd) {
        regTransportcd(CK_NES, transportcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterThan(String transportcd) {
        regTransportcd(CK_GT, fRES(transportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessThan(String transportcd) {
        regTransportcd(CK_LT, fRES(transportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterEqual(String transportcd) {
        regTransportcd(CK_GE, fRES(transportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessEqual(String transportcd) {
        regTransportcd(CK_LE, fRES(transportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcdList The collection of transportcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_InScope(Collection<String> transportcdList) {
        doSetTransportcd_InScope(transportcdList);
    }

    protected void doSetTransportcd_InScope(Collection<String> transportcdList) {
        regINS(CK_INS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcdList The collection of transportcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotInScope(Collection<String> transportcdList) {
        doSetTransportcd_NotInScope(transportcdList);
    }

    protected void doSetTransportcd_NotInScope(Collection<String> transportcdList) {
        regINS(CK_NINS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)} <br>
     * <pre>e.g. setTransportcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportcd The value of transportcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportcd_LikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportcd_NotLikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_PrefixSearch(String transportcd) {
        setTransportcd_LikeSearch(transportcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNull() { regTransportcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNullOrEmpty() { regTransportcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNotNull() { regTransportcd(CK_ISNN, DOBJ); }

    protected void regTransportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportcd(), "TRANSPORTCD"); }
    protected abstract ConditionValue xgetCValueTransportcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_Equal(String itemcdH) {
        doSetItemcdH_Equal(fRES(itemcdH));
    }

    protected void doSetItemcdH_Equal(String itemcdH) {
        regItemcdH(CK_EQ, itemcdH);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_NotEqual(String itemcdH) {
        doSetItemcdH_NotEqual(fRES(itemcdH));
    }

    protected void doSetItemcdH_NotEqual(String itemcdH) {
        regItemcdH(CK_NES, itemcdH);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_GreaterThan(String itemcdH) {
        regItemcdH(CK_GT, fRES(itemcdH));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_LessThan(String itemcdH) {
        regItemcdH(CK_LT, fRES(itemcdH));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_GreaterEqual(String itemcdH) {
        regItemcdH(CK_GE, fRES(itemcdH));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_LessEqual(String itemcdH) {
        regItemcdH(CK_LE, fRES(itemcdH));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdHList The collection of itemcdH as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_InScope(Collection<String> itemcdHList) {
        doSetItemcdH_InScope(itemcdHList);
    }

    protected void doSetItemcdH_InScope(Collection<String> itemcdHList) {
        regINS(CK_INS, cTL(itemcdHList), xgetCValueItemcdH(), "ITEMCD_H");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdHList The collection of itemcdH as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_NotInScope(Collection<String> itemcdHList) {
        doSetItemcdH_NotInScope(itemcdHList);
    }

    protected void doSetItemcdH_NotInScope(Collection<String> itemcdHList) {
        regINS(CK_NINS, cTL(itemcdHList), xgetCValueItemcdH(), "ITEMCD_H");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_H: {varchar(255)} <br>
     * <pre>e.g. setItemcdH_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdH The value of itemcdH as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdH_LikeSearch(String itemcdH, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdH), xgetCValueItemcdH(), "ITEMCD_H", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdH_NotLikeSearch(String itemcdH, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdH), xgetCValueItemcdH(), "ITEMCD_H", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     * @param itemcdH The value of itemcdH as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdH_PrefixSearch(String itemcdH) {
        setItemcdH_LikeSearch(itemcdH, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     */
    public void setItemcdH_IsNull() { regItemcdH(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     */
    public void setItemcdH_IsNullOrEmpty() { regItemcdH(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_H: {varchar(255)}
     */
    public void setItemcdH_IsNotNull() { regItemcdH(CK_ISNN, DOBJ); }

    protected void regItemcdH(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdH(), "ITEMCD_H"); }
    protected abstract ConditionValue xgetCValueItemcdH();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_Equal(String ordernoH) {
        doSetOrdernoH_Equal(fRES(ordernoH));
    }

    protected void doSetOrdernoH_Equal(String ordernoH) {
        regOrdernoH(CK_EQ, ordernoH);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_NotEqual(String ordernoH) {
        doSetOrdernoH_NotEqual(fRES(ordernoH));
    }

    protected void doSetOrdernoH_NotEqual(String ordernoH) {
        regOrdernoH(CK_NES, ordernoH);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_GreaterThan(String ordernoH) {
        regOrdernoH(CK_GT, fRES(ordernoH));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_LessThan(String ordernoH) {
        regOrdernoH(CK_LT, fRES(ordernoH));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_GreaterEqual(String ordernoH) {
        regOrdernoH(CK_GE, fRES(ordernoH));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_LessEqual(String ordernoH) {
        regOrdernoH(CK_LE, fRES(ordernoH));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoHList The collection of ordernoH as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_InScope(Collection<String> ordernoHList) {
        doSetOrdernoH_InScope(ordernoHList);
    }

    protected void doSetOrdernoH_InScope(Collection<String> ordernoHList) {
        regINS(CK_INS, cTL(ordernoHList), xgetCValueOrdernoH(), "ORDERNO_H");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoHList The collection of ordernoH as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_NotInScope(Collection<String> ordernoHList) {
        doSetOrdernoH_NotInScope(ordernoHList);
    }

    protected void doSetOrdernoH_NotInScope(Collection<String> ordernoHList) {
        regINS(CK_NINS, cTL(ordernoHList), xgetCValueOrdernoH(), "ORDERNO_H");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO_H: {varchar(255)} <br>
     * <pre>e.g. setOrdernoH_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordernoH The value of ordernoH as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdernoH_LikeSearch(String ordernoH, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordernoH), xgetCValueOrdernoH(), "ORDERNO_H", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdernoH_NotLikeSearch(String ordernoH, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordernoH), xgetCValueOrdernoH(), "ORDERNO_H", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     * @param ordernoH The value of ordernoH as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoH_PrefixSearch(String ordernoH) {
        setOrdernoH_LikeSearch(ordernoH, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     */
    public void setOrdernoH_IsNull() { regOrdernoH(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     */
    public void setOrdernoH_IsNullOrEmpty() { regOrdernoH(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERNO_H: {varchar(255)}
     */
    public void setOrdernoH_IsNotNull() { regOrdernoH(CK_ISNN, DOBJ); }

    protected void regOrdernoH(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdernoH(), "ORDERNO_H"); }
    protected abstract ConditionValue xgetCValueOrdernoH();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_Equal(String caseqty) {
        doSetCaseqty_Equal(fRES(caseqty));
    }

    protected void doSetCaseqty_Equal(String caseqty) {
        regCaseqty(CK_EQ, caseqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_NotEqual(String caseqty) {
        doSetCaseqty_NotEqual(fRES(caseqty));
    }

    protected void doSetCaseqty_NotEqual(String caseqty) {
        regCaseqty(CK_NES, caseqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_GreaterThan(String caseqty) {
        regCaseqty(CK_GT, fRES(caseqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_LessThan(String caseqty) {
        regCaseqty(CK_LT, fRES(caseqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_GreaterEqual(String caseqty) {
        regCaseqty(CK_GE, fRES(caseqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_LessEqual(String caseqty) {
        regCaseqty(CK_LE, fRES(caseqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqtyList The collection of caseqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_InScope(Collection<String> caseqtyList) {
        doSetCaseqty_InScope(caseqtyList);
    }

    protected void doSetCaseqty_InScope(Collection<String> caseqtyList) {
        regINS(CK_INS, cTL(caseqtyList), xgetCValueCaseqty(), "CASEQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqtyList The collection of caseqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_NotInScope(Collection<String> caseqtyList) {
        doSetCaseqty_NotInScope(caseqtyList);
    }

    protected void doSetCaseqty_NotInScope(Collection<String> caseqtyList) {
        regINS(CK_NINS, cTL(caseqtyList), xgetCValueCaseqty(), "CASEQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEQTY: {varchar(255)} <br>
     * <pre>e.g. setCaseqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseqty The value of caseqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseqty_LikeSearch(String caseqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseqty), xgetCValueCaseqty(), "CASEQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseqty_NotLikeSearch(String caseqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseqty), xgetCValueCaseqty(), "CASEQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEQTY: {varchar(255)}
     * @param caseqty The value of caseqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_PrefixSearch(String caseqty) {
        setCaseqty_LikeSearch(caseqty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     */
    public void setCaseqty_IsNull() { regCaseqty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     */
    public void setCaseqty_IsNullOrEmpty() { regCaseqty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEQTY: {varchar(255)}
     */
    public void setCaseqty_IsNotNull() { regCaseqty(CK_ISNN, DOBJ); }

    protected void regCaseqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseqty(), "CASEQTY"); }
    protected abstract ConditionValue xgetCValueCaseqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_Equal(String fractqty) {
        doSetFractqty_Equal(fRES(fractqty));
    }

    protected void doSetFractqty_Equal(String fractqty) {
        regFractqty(CK_EQ, fractqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_NotEqual(String fractqty) {
        doSetFractqty_NotEqual(fRES(fractqty));
    }

    protected void doSetFractqty_NotEqual(String fractqty) {
        regFractqty(CK_NES, fractqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_GreaterThan(String fractqty) {
        regFractqty(CK_GT, fRES(fractqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_LessThan(String fractqty) {
        regFractqty(CK_LT, fRES(fractqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_GreaterEqual(String fractqty) {
        regFractqty(CK_GE, fRES(fractqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_LessEqual(String fractqty) {
        regFractqty(CK_LE, fRES(fractqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqtyList The collection of fractqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_InScope(Collection<String> fractqtyList) {
        doSetFractqty_InScope(fractqtyList);
    }

    protected void doSetFractqty_InScope(Collection<String> fractqtyList) {
        regINS(CK_INS, cTL(fractqtyList), xgetCValueFractqty(), "FRACTQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqtyList The collection of fractqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_NotInScope(Collection<String> fractqtyList) {
        doSetFractqty_NotInScope(fractqtyList);
    }

    protected void doSetFractqty_NotInScope(Collection<String> fractqtyList) {
        regINS(CK_NINS, cTL(fractqtyList), xgetCValueFractqty(), "FRACTQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRACTQTY: {varchar(255)} <br>
     * <pre>e.g. setFractqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fractqty The value of fractqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFractqty_LikeSearch(String fractqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fractqty), xgetCValueFractqty(), "FRACTQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFractqty_NotLikeSearch(String fractqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fractqty), xgetCValueFractqty(), "FRACTQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRACTQTY: {varchar(255)}
     * @param fractqty The value of fractqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_PrefixSearch(String fractqty) {
        setFractqty_LikeSearch(fractqty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     */
    public void setFractqty_IsNull() { regFractqty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     */
    public void setFractqty_IsNullOrEmpty() { regFractqty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FRACTQTY: {varchar(255)}
     */
    public void setFractqty_IsNotNull() { regFractqty(CK_ISNN, DOBJ); }

    protected void regFractqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFractqty(), "FRACTQTY"); }
    protected abstract ConditionValue xgetCValueFractqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_Equal(String shiptocd) {
        doSetShiptocd_Equal(fRES(shiptocd));
    }

    protected void doSetShiptocd_Equal(String shiptocd) {
        regShiptocd(CK_EQ, shiptocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotEqual(String shiptocd) {
        doSetShiptocd_NotEqual(fRES(shiptocd));
    }

    protected void doSetShiptocd_NotEqual(String shiptocd) {
        regShiptocd(CK_NES, shiptocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocdList The collection of shiptocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_InScope(Collection<String> shiptocdList) {
        doSetShiptocd_InScope(shiptocdList);
    }

    protected void doSetShiptocd_InScope(Collection<String> shiptocdList) {
        regINS(CK_INS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocdList The collection of shiptocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotInScope(Collection<String> shiptocdList) {
        doSetShiptocd_NotInScope(shiptocdList);
    }

    protected void doSetShiptocd_NotInScope(Collection<String> shiptocdList) {
        regINS(CK_NINS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(255)} <br>
     * <pre>e.g. setShiptocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocd The value of shiptocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocd_LikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(255)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_Equal(String factorycd) {
        doSetFactorycd_Equal(fRES(factorycd));
    }

    protected void doSetFactorycd_Equal(String factorycd) {
        regFactorycd(CK_EQ, factorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotEqual(String factorycd) {
        doSetFactorycd_NotEqual(fRES(factorycd));
    }

    protected void doSetFactorycd_NotEqual(String factorycd) {
        regFactorycd(CK_NES, factorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterThan(String factorycd) {
        regFactorycd(CK_GT, fRES(factorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessThan(String factorycd) {
        regFactorycd(CK_LT, fRES(factorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterEqual(String factorycd) {
        regFactorycd(CK_GE, fRES(factorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessEqual(String factorycd) {
        regFactorycd(CK_LE, fRES(factorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycdList The collection of factorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_InScope(Collection<String> factorycdList) {
        doSetFactorycd_InScope(factorycdList);
    }

    protected void doSetFactorycd_InScope(Collection<String> factorycdList) {
        regINS(CK_INS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycdList The collection of factorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotInScope(Collection<String> factorycdList) {
        doSetFactorycd_NotInScope(factorycdList);
    }

    protected void doSetFactorycd_NotInScope(Collection<String> factorycdList) {
        regINS(CK_NINS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)} <br>
     * <pre>e.g. setFactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorycd The value of factorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorycd_LikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorycd_NotLikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_PrefixSearch(String factorycd) {
        setFactorycd_LikeSearch(factorycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNull() { regFactorycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNullOrEmpty() { regFactorycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNotNull() { regFactorycd(CK_ISNN, DOBJ); }

    protected void regFactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorycd(), "FACTORYCD"); }
    protected abstract ConditionValue xgetCValueFactorycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_Equal(String itemcdM) {
        doSetItemcdM_Equal(fRES(itemcdM));
    }

    protected void doSetItemcdM_Equal(String itemcdM) {
        regItemcdM(CK_EQ, itemcdM);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_NotEqual(String itemcdM) {
        doSetItemcdM_NotEqual(fRES(itemcdM));
    }

    protected void doSetItemcdM_NotEqual(String itemcdM) {
        regItemcdM(CK_NES, itemcdM);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_GreaterThan(String itemcdM) {
        regItemcdM(CK_GT, fRES(itemcdM));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_LessThan(String itemcdM) {
        regItemcdM(CK_LT, fRES(itemcdM));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_GreaterEqual(String itemcdM) {
        regItemcdM(CK_GE, fRES(itemcdM));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_LessEqual(String itemcdM) {
        regItemcdM(CK_LE, fRES(itemcdM));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdMList The collection of itemcdM as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_InScope(Collection<String> itemcdMList) {
        doSetItemcdM_InScope(itemcdMList);
    }

    protected void doSetItemcdM_InScope(Collection<String> itemcdMList) {
        regINS(CK_INS, cTL(itemcdMList), xgetCValueItemcdM(), "ITEMCD_M");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdMList The collection of itemcdM as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_NotInScope(Collection<String> itemcdMList) {
        doSetItemcdM_NotInScope(itemcdMList);
    }

    protected void doSetItemcdM_NotInScope(Collection<String> itemcdMList) {
        regINS(CK_NINS, cTL(itemcdMList), xgetCValueItemcdM(), "ITEMCD_M");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_M: {varchar(255)} <br>
     * <pre>e.g. setItemcdM_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdM The value of itemcdM as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdM_LikeSearch(String itemcdM, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdM), xgetCValueItemcdM(), "ITEMCD_M", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdM_NotLikeSearch(String itemcdM, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdM), xgetCValueItemcdM(), "ITEMCD_M", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     * @param itemcdM The value of itemcdM as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdM_PrefixSearch(String itemcdM) {
        setItemcdM_LikeSearch(itemcdM, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     */
    public void setItemcdM_IsNull() { regItemcdM(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     */
    public void setItemcdM_IsNullOrEmpty() { regItemcdM(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_M: {varchar(255)}
     */
    public void setItemcdM_IsNotNull() { regItemcdM(CK_ISNN, DOBJ); }

    protected void regItemcdM(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdM(), "ITEMCD_M"); }
    protected abstract ConditionValue xgetCValueItemcdM();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_Equal(String skucd) {
        doSetSkucd_Equal(fRES(skucd));
    }

    protected void doSetSkucd_Equal(String skucd) {
        regSkucd(CK_EQ, skucd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotEqual(String skucd) {
        doSetSkucd_NotEqual(fRES(skucd));
    }

    protected void doSetSkucd_NotEqual(String skucd) {
        regSkucd(CK_NES, skucd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterThan(String skucd) {
        regSkucd(CK_GT, fRES(skucd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessThan(String skucd) {
        regSkucd(CK_LT, fRES(skucd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterEqual(String skucd) {
        regSkucd(CK_GE, fRES(skucd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessEqual(String skucd) {
        regSkucd(CK_LE, fRES(skucd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucdList The collection of skucd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_InScope(Collection<String> skucdList) {
        doSetSkucd_InScope(skucdList);
    }

    protected void doSetSkucd_InScope(Collection<String> skucdList) {
        regINS(CK_INS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucdList The collection of skucd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotInScope(Collection<String> skucdList) {
        doSetSkucd_NotInScope(skucdList);
    }

    protected void doSetSkucd_NotInScope(Collection<String> skucdList) {
        regINS(CK_NINS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)} <br>
     * <pre>e.g. setSkucd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skucd The value of skucd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkucd_LikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkucd_NotLikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_PrefixSearch(String skucd) {
        setSkucd_LikeSearch(skucd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNull() { regSkucd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNullOrEmpty() { regSkucd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNotNull() { regSkucd(CK_ISNN, DOBJ); }

    protected void regSkucd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkucd(), "SKUCD"); }
    protected abstract ConditionValue xgetCValueSkucd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_Equal(String destinationcd) {
        doSetDestinationcd_Equal(fRES(destinationcd));
    }

    protected void doSetDestinationcd_Equal(String destinationcd) {
        regDestinationcd(CK_EQ, destinationcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotEqual(String destinationcd) {
        doSetDestinationcd_NotEqual(fRES(destinationcd));
    }

    protected void doSetDestinationcd_NotEqual(String destinationcd) {
        regDestinationcd(CK_NES, destinationcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterThan(String destinationcd) {
        regDestinationcd(CK_GT, fRES(destinationcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessThan(String destinationcd) {
        regDestinationcd(CK_LT, fRES(destinationcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterEqual(String destinationcd) {
        regDestinationcd(CK_GE, fRES(destinationcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessEqual(String destinationcd) {
        regDestinationcd(CK_LE, fRES(destinationcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcdList The collection of destinationcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_InScope(Collection<String> destinationcdList) {
        doSetDestinationcd_InScope(destinationcdList);
    }

    protected void doSetDestinationcd_InScope(Collection<String> destinationcdList) {
        regINS(CK_INS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcdList The collection of destinationcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotInScope(Collection<String> destinationcdList) {
        doSetDestinationcd_NotInScope(destinationcdList);
    }

    protected void doSetDestinationcd_NotInScope(Collection<String> destinationcdList) {
        regINS(CK_NINS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)} <br>
     * <pre>e.g. setDestinationcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationcd The value of destinationcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationcd_LikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationcd_NotLikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_PrefixSearch(String destinationcd) {
        setDestinationcd_LikeSearch(destinationcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     */
    public void setDestinationcd_IsNull() { regDestinationcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     */
    public void setDestinationcd_IsNullOrEmpty() { regDestinationcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     */
    public void setDestinationcd_IsNotNull() { regDestinationcd(CK_ISNN, DOBJ); }

    protected void regDestinationcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationcd(), "DESTINATIONCD"); }
    protected abstract ConditionValue xgetCValueDestinationcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_Equal(String manufacturecd) {
        doSetManufacturecd_Equal(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_Equal(String manufacturecd) {
        regManufacturecd(CK_EQ, manufacturecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotEqual(String manufacturecd) {
        doSetManufacturecd_NotEqual(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_NotEqual(String manufacturecd) {
        regManufacturecd(CK_NES, manufacturecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterThan(String manufacturecd) {
        regManufacturecd(CK_GT, fRES(manufacturecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessThan(String manufacturecd) {
        regManufacturecd(CK_LT, fRES(manufacturecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterEqual(String manufacturecd) {
        regManufacturecd(CK_GE, fRES(manufacturecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessEqual(String manufacturecd) {
        regManufacturecd(CK_LE, fRES(manufacturecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecdList The collection of manufacturecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_InScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_InScope(manufacturecdList);
    }

    protected void doSetManufacturecd_InScope(Collection<String> manufacturecdList) {
        regINS(CK_INS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecdList The collection of manufacturecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_NotInScope(manufacturecdList);
    }

    protected void doSetManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        regINS(CK_NINS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)} <br>
     * <pre>e.g. setManufacturecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturecd The value of manufacturecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturecd_LikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturecd_NotLikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_PrefixSearch(String manufacturecd) {
        setManufacturecd_LikeSearch(manufacturecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     */
    public void setManufacturecd_IsNull() { regManufacturecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     */
    public void setManufacturecd_IsNullOrEmpty() { regManufacturecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     */
    public void setManufacturecd_IsNotNull() { regManufacturecd(CK_ISNN, DOBJ); }

    protected void regManufacturecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturecd(), "MANUFACTURECD"); }
    protected abstract ConditionValue xgetCValueManufacturecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_Equal(String ordernoM) {
        doSetOrdernoM_Equal(fRES(ordernoM));
    }

    protected void doSetOrdernoM_Equal(String ordernoM) {
        regOrdernoM(CK_EQ, ordernoM);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_NotEqual(String ordernoM) {
        doSetOrdernoM_NotEqual(fRES(ordernoM));
    }

    protected void doSetOrdernoM_NotEqual(String ordernoM) {
        regOrdernoM(CK_NES, ordernoM);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_GreaterThan(String ordernoM) {
        regOrdernoM(CK_GT, fRES(ordernoM));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_LessThan(String ordernoM) {
        regOrdernoM(CK_LT, fRES(ordernoM));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_GreaterEqual(String ordernoM) {
        regOrdernoM(CK_GE, fRES(ordernoM));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_LessEqual(String ordernoM) {
        regOrdernoM(CK_LE, fRES(ordernoM));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoMList The collection of ordernoM as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_InScope(Collection<String> ordernoMList) {
        doSetOrdernoM_InScope(ordernoMList);
    }

    protected void doSetOrdernoM_InScope(Collection<String> ordernoMList) {
        regINS(CK_INS, cTL(ordernoMList), xgetCValueOrdernoM(), "ORDERNO_M");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoMList The collection of ordernoM as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_NotInScope(Collection<String> ordernoMList) {
        doSetOrdernoM_NotInScope(ordernoMList);
    }

    protected void doSetOrdernoM_NotInScope(Collection<String> ordernoMList) {
        regINS(CK_NINS, cTL(ordernoMList), xgetCValueOrdernoM(), "ORDERNO_M");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO_M: {varchar(255)} <br>
     * <pre>e.g. setOrdernoM_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordernoM The value of ordernoM as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdernoM_LikeSearch(String ordernoM, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordernoM), xgetCValueOrdernoM(), "ORDERNO_M", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdernoM_NotLikeSearch(String ordernoM, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordernoM), xgetCValueOrdernoM(), "ORDERNO_M", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     * @param ordernoM The value of ordernoM as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernoM_PrefixSearch(String ordernoM) {
        setOrdernoM_LikeSearch(ordernoM, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     */
    public void setOrdernoM_IsNull() { regOrdernoM(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     */
    public void setOrdernoM_IsNullOrEmpty() { regOrdernoM(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERNO_M: {varchar(255)}
     */
    public void setOrdernoM_IsNotNull() { regOrdernoM(CK_ISNN, DOBJ); }

    protected void regOrdernoM(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdernoM(), "ORDERNO_M"); }
    protected abstract ConditionValue xgetCValueOrdernoM();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_Equal(String machineno) {
        doSetMachineno_Equal(fRES(machineno));
    }

    protected void doSetMachineno_Equal(String machineno) {
        regMachineno(CK_EQ, machineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotEqual(String machineno) {
        doSetMachineno_NotEqual(fRES(machineno));
    }

    protected void doSetMachineno_NotEqual(String machineno) {
        regMachineno(CK_NES, machineno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterThan(String machineno) {
        regMachineno(CK_GT, fRES(machineno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessThan(String machineno) {
        regMachineno(CK_LT, fRES(machineno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterEqual(String machineno) {
        regMachineno(CK_GE, fRES(machineno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessEqual(String machineno) {
        regMachineno(CK_LE, fRES(machineno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machinenoList The collection of machineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_InScope(Collection<String> machinenoList) {
        doSetMachineno_InScope(machinenoList);
    }

    protected void doSetMachineno_InScope(Collection<String> machinenoList) {
        regINS(CK_INS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machinenoList The collection of machineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotInScope(Collection<String> machinenoList) {
        doSetMachineno_NotInScope(machinenoList);
    }

    protected void doSetMachineno_NotInScope(Collection<String> machinenoList) {
        regINS(CK_NINS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(255)} <br>
     * <pre>e.g. setMachineno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machineno The value of machineno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachineno_LikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachineno_NotLikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(255)}
     * @param machineno The value of machineno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_PrefixSearch(String machineno) {
        setMachineno_LikeSearch(machineno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     */
    public void setMachineno_IsNull() { regMachineno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     */
    public void setMachineno_IsNullOrEmpty() { regMachineno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(255)}
     */
    public void setMachineno_IsNotNull() { regMachineno(CK_ISNN, DOBJ); }

    protected void regMachineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachineno(), "MACHINENO"); }
    protected abstract ConditionValue xgetCValueMachineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_Equal(String createno) {
        doSetCreateno_Equal(fRES(createno));
    }

    protected void doSetCreateno_Equal(String createno) {
        regCreateno(CK_EQ, createno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotEqual(String createno) {
        doSetCreateno_NotEqual(fRES(createno));
    }

    protected void doSetCreateno_NotEqual(String createno) {
        regCreateno(CK_NES, createno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterThan(String createno) {
        regCreateno(CK_GT, fRES(createno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessThan(String createno) {
        regCreateno(CK_LT, fRES(createno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterEqual(String createno) {
        regCreateno(CK_GE, fRES(createno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessEqual(String createno) {
        regCreateno(CK_LE, fRES(createno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createnoList The collection of createno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_InScope(Collection<String> createnoList) {
        doSetCreateno_InScope(createnoList);
    }

    protected void doSetCreateno_InScope(Collection<String> createnoList) {
        regINS(CK_INS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createnoList The collection of createno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotInScope(Collection<String> createnoList) {
        doSetCreateno_NotInScope(createnoList);
    }

    protected void doSetCreateno_NotInScope(Collection<String> createnoList) {
        regINS(CK_NINS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)} <br>
     * <pre>e.g. setCreateno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createno The value of createno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateno_LikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateno_NotLikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_PrefixSearch(String createno) {
        setCreateno_LikeSearch(createno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     */
    public void setCreateno_IsNull() { regCreateno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     */
    public void setCreateno_IsNullOrEmpty() { regCreateno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     */
    public void setCreateno_IsNotNull() { regCreateno(CK_ISNN, DOBJ); }

    protected void regCreateno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateno(), "CREATENO"); }
    protected abstract ConditionValue xgetCValueCreateno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_Equal(String limitdate) {
        doSetLimitdate_Equal(fRES(limitdate));
    }

    protected void doSetLimitdate_Equal(String limitdate) {
        regLimitdate(CK_EQ, limitdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotEqual(String limitdate) {
        doSetLimitdate_NotEqual(fRES(limitdate));
    }

    protected void doSetLimitdate_NotEqual(String limitdate) {
        regLimitdate(CK_NES, limitdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterThan(String limitdate) {
        regLimitdate(CK_GT, fRES(limitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessThan(String limitdate) {
        regLimitdate(CK_LT, fRES(limitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterEqual(String limitdate) {
        regLimitdate(CK_GE, fRES(limitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessEqual(String limitdate) {
        regLimitdate(CK_LE, fRES(limitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdateList The collection of limitdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_InScope(Collection<String> limitdateList) {
        doSetLimitdate_InScope(limitdateList);
    }

    protected void doSetLimitdate_InScope(Collection<String> limitdateList) {
        regINS(CK_INS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdateList The collection of limitdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotInScope(Collection<String> limitdateList) {
        doSetLimitdate_NotInScope(limitdateList);
    }

    protected void doSetLimitdate_NotInScope(Collection<String> limitdateList) {
        regINS(CK_NINS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)} <br>
     * <pre>e.g. setLimitdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitdate The value of limitdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitdate_LikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdate_NotLikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_PrefixSearch(String limitdate) {
        setLimitdate_LikeSearch(limitdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     */
    public void setLimitdate_IsNull() { regLimitdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     */
    public void setLimitdate_IsNullOrEmpty() { regLimitdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     */
    public void setLimitdate_IsNotNull() { regLimitdate(CK_ISNN, DOBJ); }

    protected void regLimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdate(), "LIMITDATE"); }
    protected abstract ConditionValue xgetCValueLimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_Equal(String caselot4) {
        doSetCaselot4_Equal(fRES(caselot4));
    }

    protected void doSetCaselot4_Equal(String caselot4) {
        regCaselot4(CK_EQ, caselot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotEqual(String caselot4) {
        doSetCaselot4_NotEqual(fRES(caselot4));
    }

    protected void doSetCaselot4_NotEqual(String caselot4) {
        regCaselot4(CK_NES, caselot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterThan(String caselot4) {
        regCaselot4(CK_GT, fRES(caselot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessThan(String caselot4) {
        regCaselot4(CK_LT, fRES(caselot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterEqual(String caselot4) {
        regCaselot4(CK_GE, fRES(caselot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessEqual(String caselot4) {
        regCaselot4(CK_LE, fRES(caselot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4List The collection of caselot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_InScope(Collection<String> caselot4List) {
        doSetCaselot4_InScope(caselot4List);
    }

    protected void doSetCaselot4_InScope(Collection<String> caselot4List) {
        regINS(CK_INS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4List The collection of caselot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotInScope(Collection<String> caselot4List) {
        doSetCaselot4_NotInScope(caselot4List);
    }

    protected void doSetCaselot4_NotInScope(Collection<String> caselot4List) {
        regINS(CK_NINS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(255)} <br>
     * <pre>e.g. setCaselot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caselot4 The value of caselot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaselot4_LikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaselot4_NotLikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(255)}
     * @param caselot4 The value of caselot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_PrefixSearch(String caselot4) {
        setCaselot4_LikeSearch(caselot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     */
    public void setCaselot4_IsNull() { regCaselot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     */
    public void setCaselot4_IsNullOrEmpty() { regCaselot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(255)}
     */
    public void setCaselot4_IsNotNull() { regCaselot4(CK_ISNN, DOBJ); }

    protected void regCaselot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaselot4(), "CASELOT4"); }
    protected abstract ConditionValue xgetCValueCaselot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_Equal(String distributioncd) {
        doSetDistributioncd_Equal(fRES(distributioncd));
    }

    protected void doSetDistributioncd_Equal(String distributioncd) {
        regDistributioncd(CK_EQ, distributioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotEqual(String distributioncd) {
        doSetDistributioncd_NotEqual(fRES(distributioncd));
    }

    protected void doSetDistributioncd_NotEqual(String distributioncd) {
        regDistributioncd(CK_NES, distributioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterThan(String distributioncd) {
        regDistributioncd(CK_GT, fRES(distributioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessThan(String distributioncd) {
        regDistributioncd(CK_LT, fRES(distributioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterEqual(String distributioncd) {
        regDistributioncd(CK_GE, fRES(distributioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessEqual(String distributioncd) {
        regDistributioncd(CK_LE, fRES(distributioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncdList The collection of distributioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_InScope(Collection<String> distributioncdList) {
        doSetDistributioncd_InScope(distributioncdList);
    }

    protected void doSetDistributioncd_InScope(Collection<String> distributioncdList) {
        regINS(CK_INS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncdList The collection of distributioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotInScope(Collection<String> distributioncdList) {
        doSetDistributioncd_NotInScope(distributioncdList);
    }

    protected void doSetDistributioncd_NotInScope(Collection<String> distributioncdList) {
        regINS(CK_NINS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)} <br>
     * <pre>e.g. setDistributioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distributioncd The value of distributioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistributioncd_LikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistributioncd_NotLikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_PrefixSearch(String distributioncd) {
        setDistributioncd_LikeSearch(distributioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNull() { regDistributioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNullOrEmpty() { regDistributioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNotNull() { regDistributioncd(CK_ISNN, DOBJ); }

    protected void regDistributioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistributioncd(), "DISTRIBUTIONCD"); }
    protected abstract ConditionValue xgetCValueDistributioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_Equal(String palletid) {
        doSetPalletid_Equal(fRES(palletid));
    }

    protected void doSetPalletid_Equal(String palletid) {
        regPalletid(CK_EQ, palletid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotEqual(String palletid) {
        doSetPalletid_NotEqual(fRES(palletid));
    }

    protected void doSetPalletid_NotEqual(String palletid) {
        regPalletid(CK_NES, palletid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterThan(String palletid) {
        regPalletid(CK_GT, fRES(palletid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessThan(String palletid) {
        regPalletid(CK_LT, fRES(palletid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterEqual(String palletid) {
        regPalletid(CK_GE, fRES(palletid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessEqual(String palletid) {
        regPalletid(CK_LE, fRES(palletid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletidList The collection of palletid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_InScope(Collection<String> palletidList) {
        doSetPalletid_InScope(palletidList);
    }

    protected void doSetPalletid_InScope(Collection<String> palletidList) {
        regINS(CK_INS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletidList The collection of palletid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotInScope(Collection<String> palletidList) {
        doSetPalletid_NotInScope(palletidList);
    }

    protected void doSetPalletid_NotInScope(Collection<String> palletidList) {
        regINS(CK_NINS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)} <br>
     * <pre>e.g. setPalletid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletid The value of palletid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletid_LikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletid_NotLikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_PrefixSearch(String palletid) {
        setPalletid_LikeSearch(palletid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNull() { regPalletid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNullOrEmpty() { regPalletid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNotNull() { regPalletid(CK_ISNN, DOBJ); }

    protected void regPalletid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletid(), "PALLETID"); }
    protected abstract ConditionValue xgetCValuePalletid();

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
    public HpSLCFunction<EShippingRecordDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShippingRecordDataCB.class);
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
    public HpSLCFunction<EShippingRecordDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShippingRecordDataCB.class);
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
    public HpSLCFunction<EShippingRecordDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShippingRecordDataCB.class);
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
    public HpSLCFunction<EShippingRecordDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShippingRecordDataCB.class);
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
    public HpSLCFunction<EShippingRecordDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShippingRecordDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShippingRecordDataCB&gt;() {
     *     public void query(EShippingRecordDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShippingRecordDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShippingRecordDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingRecordDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShippingRecordDataCQ sq);

    protected EShippingRecordDataCB xcreateScalarConditionCB() {
        EShippingRecordDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShippingRecordDataCB xcreateScalarConditionPartitionByCB() {
        EShippingRecordDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShippingRecordDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingRecordDataCB cb = new EShippingRecordDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_RECORD_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShippingRecordDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShippingRecordDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShippingRecordDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingRecordDataCB cb = new EShippingRecordDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_RECORD_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShippingRecordDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShippingRecordDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShippingRecordDataCB cb = new EShippingRecordDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShippingRecordDataCQ sq);

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
    protected EShippingRecordDataCB newMyCB() {
        return new EShippingRecordDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShippingRecordDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

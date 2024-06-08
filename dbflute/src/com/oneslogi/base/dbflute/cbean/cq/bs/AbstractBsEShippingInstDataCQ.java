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
 * The abstract condition-query of E_SHIPPING_INST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShippingInstDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShippingInstDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SHIPPING_INST_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataId The value of shippingInstDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataId_Equal(Long shippingInstDataId) {
        doSetShippingInstDataId_Equal(shippingInstDataId);
    }

    protected void doSetShippingInstDataId_Equal(Long shippingInstDataId) {
        regShippingInstDataId(CK_EQ, shippingInstDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataId The value of shippingInstDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataId_NotEqual(Long shippingInstDataId) {
        doSetShippingInstDataId_NotEqual(shippingInstDataId);
    }

    protected void doSetShippingInstDataId_NotEqual(Long shippingInstDataId) {
        regShippingInstDataId(CK_NES, shippingInstDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataId The value of shippingInstDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataId_GreaterThan(Long shippingInstDataId) {
        regShippingInstDataId(CK_GT, shippingInstDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataId The value of shippingInstDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataId_LessThan(Long shippingInstDataId) {
        regShippingInstDataId(CK_LT, shippingInstDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataId The value of shippingInstDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataId_GreaterEqual(Long shippingInstDataId) {
        regShippingInstDataId(CK_GE, shippingInstDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataId The value of shippingInstDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataId_LessEqual(Long shippingInstDataId) {
        regShippingInstDataId(CK_LE, shippingInstDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingInstDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstDataId(), "SHIPPING_INST_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataIdList The collection of shippingInstDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstDataId_InScope(Collection<Long> shippingInstDataIdList) {
        doSetShippingInstDataId_InScope(shippingInstDataIdList);
    }

    protected void doSetShippingInstDataId_InScope(Collection<Long> shippingInstDataIdList) {
        regINS(CK_INS, cTL(shippingInstDataIdList), xgetCValueShippingInstDataId(), "SHIPPING_INST_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstDataIdList The collection of shippingInstDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstDataId_NotInScope(Collection<Long> shippingInstDataIdList) {
        doSetShippingInstDataId_NotInScope(shippingInstDataIdList);
    }

    protected void doSetShippingInstDataId_NotInScope(Collection<Long> shippingInstDataIdList) {
        regINS(CK_NINS, cTL(shippingInstDataIdList), xgetCValueShippingInstDataId(), "SHIPPING_INST_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInstDataId_IsNull() { regShippingInstDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInstDataId_IsNotNull() { regShippingInstDataId(CK_ISNN, DOBJ); }

    protected void regShippingInstDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstDataId(), "SHIPPING_INST_DATA_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstDataId();

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
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_Equal(String instructionsDate) {
        doSetInstructionsDate_Equal(fRES(instructionsDate));
    }

    protected void doSetInstructionsDate_Equal(String instructionsDate) {
        regInstructionsDate(CK_EQ, instructionsDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_NotEqual(String instructionsDate) {
        doSetInstructionsDate_NotEqual(fRES(instructionsDate));
    }

    protected void doSetInstructionsDate_NotEqual(String instructionsDate) {
        regInstructionsDate(CK_NES, instructionsDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_GreaterThan(String instructionsDate) {
        regInstructionsDate(CK_GT, fRES(instructionsDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_LessThan(String instructionsDate) {
        regInstructionsDate(CK_LT, fRES(instructionsDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_GreaterEqual(String instructionsDate) {
        regInstructionsDate(CK_GE, fRES(instructionsDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_LessEqual(String instructionsDate) {
        regInstructionsDate(CK_LE, fRES(instructionsDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDateList The collection of instructionsDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_InScope(Collection<String> instructionsDateList) {
        doSetInstructionsDate_InScope(instructionsDateList);
    }

    protected void doSetInstructionsDate_InScope(Collection<String> instructionsDateList) {
        regINS(CK_INS, cTL(instructionsDateList), xgetCValueInstructionsDate(), "INSTRUCTIONS_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDateList The collection of instructionsDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_NotInScope(Collection<String> instructionsDateList) {
        doSetInstructionsDate_NotInScope(instructionsDateList);
    }

    protected void doSetInstructionsDate_NotInScope(Collection<String> instructionsDateList) {
        regINS(CK_NINS, cTL(instructionsDateList), xgetCValueInstructionsDate(), "INSTRUCTIONS_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)} <br>
     * <pre>e.g. setInstructionsDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param instructionsDate The value of instructionsDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInstructionsDate_LikeSearch(String instructionsDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(instructionsDate), xgetCValueInstructionsDate(), "INSTRUCTIONS_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInstructionsDate_NotLikeSearch(String instructionsDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(instructionsDate), xgetCValueInstructionsDate(), "INSTRUCTIONS_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @param instructionsDate The value of instructionsDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsDate_PrefixSearch(String instructionsDate) {
        setInstructionsDate_LikeSearch(instructionsDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     */
    public void setInstructionsDate_IsNull() { regInstructionsDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     */
    public void setInstructionsDate_IsNullOrEmpty() { regInstructionsDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     */
    public void setInstructionsDate_IsNotNull() { regInstructionsDate(CK_ISNN, DOBJ); }

    protected void regInstructionsDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstructionsDate(), "INSTRUCTIONS_DATE"); }
    protected abstract ConditionValue xgetCValueInstructionsDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_Equal(String ownerDirectNo) {
        doSetOwnerDirectNo_Equal(fRES(ownerDirectNo));
    }

    protected void doSetOwnerDirectNo_Equal(String ownerDirectNo) {
        regOwnerDirectNo(CK_EQ, ownerDirectNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_NotEqual(String ownerDirectNo) {
        doSetOwnerDirectNo_NotEqual(fRES(ownerDirectNo));
    }

    protected void doSetOwnerDirectNo_NotEqual(String ownerDirectNo) {
        regOwnerDirectNo(CK_NES, ownerDirectNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_GreaterThan(String ownerDirectNo) {
        regOwnerDirectNo(CK_GT, fRES(ownerDirectNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_LessThan(String ownerDirectNo) {
        regOwnerDirectNo(CK_LT, fRES(ownerDirectNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_GreaterEqual(String ownerDirectNo) {
        regOwnerDirectNo(CK_GE, fRES(ownerDirectNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_LessEqual(String ownerDirectNo) {
        regOwnerDirectNo(CK_LE, fRES(ownerDirectNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNoList The collection of ownerDirectNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_InScope(Collection<String> ownerDirectNoList) {
        doSetOwnerDirectNo_InScope(ownerDirectNoList);
    }

    protected void doSetOwnerDirectNo_InScope(Collection<String> ownerDirectNoList) {
        regINS(CK_INS, cTL(ownerDirectNoList), xgetCValueOwnerDirectNo(), "OWNER_DIRECT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNoList The collection of ownerDirectNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_NotInScope(Collection<String> ownerDirectNoList) {
        doSetOwnerDirectNo_NotInScope(ownerDirectNoList);
    }

    protected void doSetOwnerDirectNo_NotInScope(Collection<String> ownerDirectNoList) {
        regINS(CK_NINS, cTL(ownerDirectNoList), xgetCValueOwnerDirectNo(), "OWNER_DIRECT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)} <br>
     * <pre>e.g. setOwnerDirectNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerDirectNo The value of ownerDirectNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerDirectNo_LikeSearch(String ownerDirectNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerDirectNo), xgetCValueOwnerDirectNo(), "OWNER_DIRECT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerDirectNo_NotLikeSearch(String ownerDirectNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerDirectNo), xgetCValueOwnerDirectNo(), "OWNER_DIRECT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @param ownerDirectNo The value of ownerDirectNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerDirectNo_PrefixSearch(String ownerDirectNo) {
        setOwnerDirectNo_LikeSearch(ownerDirectNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     */
    public void setOwnerDirectNo_IsNull() { regOwnerDirectNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     */
    public void setOwnerDirectNo_IsNullOrEmpty() { regOwnerDirectNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     */
    public void setOwnerDirectNo_IsNotNull() { regOwnerDirectNo(CK_ISNN, DOBJ); }

    protected void regOwnerDirectNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerDirectNo(), "OWNER_DIRECT_NO"); }
    protected abstract ConditionValue xgetCValueOwnerDirectNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_Equal(String salesType) {
        doSetSalesType_Equal(fRES(salesType));
    }

    protected void doSetSalesType_Equal(String salesType) {
        regSalesType(CK_EQ, salesType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_NotEqual(String salesType) {
        doSetSalesType_NotEqual(fRES(salesType));
    }

    protected void doSetSalesType_NotEqual(String salesType) {
        regSalesType(CK_NES, salesType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_GreaterThan(String salesType) {
        regSalesType(CK_GT, fRES(salesType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_LessThan(String salesType) {
        regSalesType(CK_LT, fRES(salesType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_GreaterEqual(String salesType) {
        regSalesType(CK_GE, fRES(salesType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_LessEqual(String salesType) {
        regSalesType(CK_LE, fRES(salesType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesTypeList The collection of salesType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_InScope(Collection<String> salesTypeList) {
        doSetSalesType_InScope(salesTypeList);
    }

    protected void doSetSalesType_InScope(Collection<String> salesTypeList) {
        regINS(CK_INS, cTL(salesTypeList), xgetCValueSalesType(), "SALES_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesTypeList The collection of salesType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_NotInScope(Collection<String> salesTypeList) {
        doSetSalesType_NotInScope(salesTypeList);
    }

    protected void doSetSalesType_NotInScope(Collection<String> salesTypeList) {
        regINS(CK_NINS, cTL(salesTypeList), xgetCValueSalesType(), "SALES_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_TYPE: {varchar(255)} <br>
     * <pre>e.g. setSalesType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesType The value of salesType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesType_LikeSearch(String salesType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesType), xgetCValueSalesType(), "SALES_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesType_NotLikeSearch(String salesType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesType), xgetCValueSalesType(), "SALES_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     * @param salesType The value of salesType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesType_PrefixSearch(String salesType) {
        setSalesType_LikeSearch(salesType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     */
    public void setSalesType_IsNull() { regSalesType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     */
    public void setSalesType_IsNullOrEmpty() { regSalesType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_TYPE: {varchar(255)}
     */
    public void setSalesType_IsNotNull() { regSalesType(CK_ISNN, DOBJ); }

    protected void regSalesType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesType(), "SALES_TYPE"); }
    protected abstract ConditionValue xgetCValueSalesType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_Equal(String shiptoCode) {
        doSetShiptoCode_Equal(fRES(shiptoCode));
    }

    protected void doSetShiptoCode_Equal(String shiptoCode) {
        regShiptoCode(CK_EQ, shiptoCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_NotEqual(String shiptoCode) {
        doSetShiptoCode_NotEqual(fRES(shiptoCode));
    }

    protected void doSetShiptoCode_NotEqual(String shiptoCode) {
        regShiptoCode(CK_NES, shiptoCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_GreaterThan(String shiptoCode) {
        regShiptoCode(CK_GT, fRES(shiptoCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_LessThan(String shiptoCode) {
        regShiptoCode(CK_LT, fRES(shiptoCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_GreaterEqual(String shiptoCode) {
        regShiptoCode(CK_GE, fRES(shiptoCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_LessEqual(String shiptoCode) {
        regShiptoCode(CK_LE, fRES(shiptoCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCodeList The collection of shiptoCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_InScope(Collection<String> shiptoCodeList) {
        doSetShiptoCode_InScope(shiptoCodeList);
    }

    protected void doSetShiptoCode_InScope(Collection<String> shiptoCodeList) {
        regINS(CK_INS, cTL(shiptoCodeList), xgetCValueShiptoCode(), "SHIPTO_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCodeList The collection of shiptoCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_NotInScope(Collection<String> shiptoCodeList) {
        doSetShiptoCode_NotInScope(shiptoCodeList);
    }

    protected void doSetShiptoCode_NotInScope(Collection<String> shiptoCodeList) {
        regINS(CK_NINS, cTL(shiptoCodeList), xgetCValueShiptoCode(), "SHIPTO_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTO_CODE: {varchar(255)} <br>
     * <pre>e.g. setShiptoCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptoCode The value of shiptoCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptoCode_LikeSearch(String shiptoCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptoCode), xgetCValueShiptoCode(), "SHIPTO_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptoCode_NotLikeSearch(String shiptoCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptoCode), xgetCValueShiptoCode(), "SHIPTO_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @param shiptoCode The value of shiptoCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptoCode_PrefixSearch(String shiptoCode) {
        setShiptoCode_LikeSearch(shiptoCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     */
    public void setShiptoCode_IsNull() { regShiptoCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     */
    public void setShiptoCode_IsNullOrEmpty() { regShiptoCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTO_CODE: {varchar(255)}
     */
    public void setShiptoCode_IsNotNull() { regShiptoCode(CK_ISNN, DOBJ); }

    protected void regShiptoCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptoCode(), "SHIPTO_CODE"); }
    protected abstract ConditionValue xgetCValueShiptoCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)} <br>
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_Equal(String expectQty) {
        doSetExpectQty_Equal(fRES(expectQty));
    }

    protected void doSetExpectQty_Equal(String expectQty) {
        regExpectQty(CK_EQ, expectQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_NotEqual(String expectQty) {
        doSetExpectQty_NotEqual(fRES(expectQty));
    }

    protected void doSetExpectQty_NotEqual(String expectQty) {
        regExpectQty(CK_NES, expectQty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterThan(String expectQty) {
        regExpectQty(CK_GT, fRES(expectQty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_LessThan(String expectQty) {
        regExpectQty(CK_LT, fRES(expectQty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterEqual(String expectQty) {
        regExpectQty(CK_GE, fRES(expectQty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_LessEqual(String expectQty) {
        regExpectQty(CK_LE, fRES(expectQty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQtyList The collection of expectQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_InScope(Collection<String> expectQtyList) {
        doSetExpectQty_InScope(expectQtyList);
    }

    protected void doSetExpectQty_InScope(Collection<String> expectQtyList) {
        regINS(CK_INS, cTL(expectQtyList), xgetCValueExpectQty(), "EXPECT_QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQtyList The collection of expectQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_NotInScope(Collection<String> expectQtyList) {
        doSetExpectQty_NotInScope(expectQtyList);
    }

    protected void doSetExpectQty_NotInScope(Collection<String> expectQtyList) {
        regINS(CK_NINS, cTL(expectQtyList), xgetCValueExpectQty(), "EXPECT_QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {varchar(255)} <br>
     * <pre>e.g. setExpectQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param expectQty The value of expectQty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExpectQty_LikeSearch(String expectQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(expectQty), xgetCValueExpectQty(), "EXPECT_QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExpectQty_NotLikeSearch(String expectQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(expectQty), xgetCValueExpectQty(), "EXPECT_QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     * @param expectQty The value of expectQty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_PrefixSearch(String expectQty) {
        setExpectQty_LikeSearch(expectQty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     */
    public void setExpectQty_IsNull() { regExpectQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     */
    public void setExpectQty_IsNullOrEmpty() { regExpectQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECT_QTY: {varchar(255)}
     */
    public void setExpectQty_IsNotNull() { regExpectQty(CK_ISNN, DOBJ); }

    protected void regExpectQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectQty(), "EXPECT_QTY"); }
    protected abstract ConditionValue xgetCValueExpectQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_Equal(String unitPrice) {
        doSetUnitPrice_Equal(fRES(unitPrice));
    }

    protected void doSetUnitPrice_Equal(String unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotEqual(String unitPrice) {
        doSetUnitPrice_NotEqual(fRES(unitPrice));
    }

    protected void doSetUnitPrice_NotEqual(String unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterThan(String unitPrice) {
        regUnitPrice(CK_GT, fRES(unitPrice));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_LessThan(String unitPrice) {
        regUnitPrice(CK_LT, fRES(unitPrice));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterEqual(String unitPrice) {
        regUnitPrice(CK_GE, fRES(unitPrice));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_LessEqual(String unitPrice) {
        regUnitPrice(CK_LE, fRES(unitPrice));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPriceList The collection of unitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_InScope(Collection<String> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<String> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPriceList The collection of unitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotInScope(Collection<String> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<String> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {varchar(255)} <br>
     * <pre>e.g. setUnitPrice_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitPrice The value of unitPrice as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitPrice_LikeSearch(String unitPrice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitPrice), xgetCValueUnitPrice(), "UNIT_PRICE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitPrice_NotLikeSearch(String unitPrice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitPrice), xgetCValueUnitPrice(), "UNIT_PRICE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     * @param unitPrice The value of unitPrice as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_PrefixSearch(String unitPrice) {
        setUnitPrice_LikeSearch(unitPrice, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     */
    public void setUnitPrice_IsNull() { regUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     */
    public void setUnitPrice_IsNullOrEmpty() { regUnitPrice(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {varchar(255)}
     */
    public void setUnitPrice_IsNotNull() { regUnitPrice(CK_ISNN, DOBJ); }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_Equal(String planPriceTotal) {
        doSetPlanPriceTotal_Equal(fRES(planPriceTotal));
    }

    protected void doSetPlanPriceTotal_Equal(String planPriceTotal) {
        regPlanPriceTotal(CK_EQ, planPriceTotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_NotEqual(String planPriceTotal) {
        doSetPlanPriceTotal_NotEqual(fRES(planPriceTotal));
    }

    protected void doSetPlanPriceTotal_NotEqual(String planPriceTotal) {
        regPlanPriceTotal(CK_NES, planPriceTotal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_GreaterThan(String planPriceTotal) {
        regPlanPriceTotal(CK_GT, fRES(planPriceTotal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_LessThan(String planPriceTotal) {
        regPlanPriceTotal(CK_LT, fRES(planPriceTotal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_GreaterEqual(String planPriceTotal) {
        regPlanPriceTotal(CK_GE, fRES(planPriceTotal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_LessEqual(String planPriceTotal) {
        regPlanPriceTotal(CK_LE, fRES(planPriceTotal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotalList The collection of planPriceTotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_InScope(Collection<String> planPriceTotalList) {
        doSetPlanPriceTotal_InScope(planPriceTotalList);
    }

    protected void doSetPlanPriceTotal_InScope(Collection<String> planPriceTotalList) {
        regINS(CK_INS, cTL(planPriceTotalList), xgetCValuePlanPriceTotal(), "PLAN_PRICE_TOTAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotalList The collection of planPriceTotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_NotInScope(Collection<String> planPriceTotalList) {
        doSetPlanPriceTotal_NotInScope(planPriceTotalList);
    }

    protected void doSetPlanPriceTotal_NotInScope(Collection<String> planPriceTotalList) {
        regINS(CK_NINS, cTL(planPriceTotalList), xgetCValuePlanPriceTotal(), "PLAN_PRICE_TOTAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)} <br>
     * <pre>e.g. setPlanPriceTotal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planPriceTotal The value of planPriceTotal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanPriceTotal_LikeSearch(String planPriceTotal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planPriceTotal), xgetCValuePlanPriceTotal(), "PLAN_PRICE_TOTAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanPriceTotal_NotLikeSearch(String planPriceTotal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planPriceTotal), xgetCValuePlanPriceTotal(), "PLAN_PRICE_TOTAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @param planPriceTotal The value of planPriceTotal as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanPriceTotal_PrefixSearch(String planPriceTotal) {
        setPlanPriceTotal_LikeSearch(planPriceTotal, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     */
    public void setPlanPriceTotal_IsNull() { regPlanPriceTotal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     */
    public void setPlanPriceTotal_IsNullOrEmpty() { regPlanPriceTotal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     */
    public void setPlanPriceTotal_IsNotNull() { regPlanPriceTotal(CK_ISNN, DOBJ); }

    protected void regPlanPriceTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanPriceTotal(), "PLAN_PRICE_TOTAL"); }
    protected abstract ConditionValue xgetCValuePlanPriceTotal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_Equal(String planName) {
        doSetPlanName_Equal(fRES(planName));
    }

    protected void doSetPlanName_Equal(String planName) {
        regPlanName(CK_EQ, planName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_NotEqual(String planName) {
        doSetPlanName_NotEqual(fRES(planName));
    }

    protected void doSetPlanName_NotEqual(String planName) {
        regPlanName(CK_NES, planName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_GreaterThan(String planName) {
        regPlanName(CK_GT, fRES(planName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_LessThan(String planName) {
        regPlanName(CK_LT, fRES(planName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_GreaterEqual(String planName) {
        regPlanName(CK_GE, fRES(planName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_LessEqual(String planName) {
        regPlanName(CK_LE, fRES(planName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planNameList The collection of planName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_InScope(Collection<String> planNameList) {
        doSetPlanName_InScope(planNameList);
    }

    protected void doSetPlanName_InScope(Collection<String> planNameList) {
        regINS(CK_INS, cTL(planNameList), xgetCValuePlanName(), "PLAN_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planNameList The collection of planName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_NotInScope(Collection<String> planNameList) {
        doSetPlanName_NotInScope(planNameList);
    }

    protected void doSetPlanName_NotInScope(Collection<String> planNameList) {
        regINS(CK_NINS, cTL(planNameList), xgetCValuePlanName(), "PLAN_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_NAME: {varchar(255)} <br>
     * <pre>e.g. setPlanName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planName The value of planName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanName_LikeSearch(String planName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planName), xgetCValuePlanName(), "PLAN_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanName_NotLikeSearch(String planName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planName), xgetCValuePlanName(), "PLAN_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     * @param planName The value of planName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanName_PrefixSearch(String planName) {
        setPlanName_LikeSearch(planName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     */
    public void setPlanName_IsNull() { regPlanName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     */
    public void setPlanName_IsNullOrEmpty() { regPlanName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_NAME: {varchar(255)}
     */
    public void setPlanName_IsNotNull() { regPlanName(CK_ISNN, DOBJ); }

    protected void regPlanName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanName(), "PLAN_NAME"); }
    protected abstract ConditionValue xgetCValuePlanName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_Equal(String planpost) {
        doSetPlanpost_Equal(fRES(planpost));
    }

    protected void doSetPlanpost_Equal(String planpost) {
        regPlanpost(CK_EQ, planpost);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_NotEqual(String planpost) {
        doSetPlanpost_NotEqual(fRES(planpost));
    }

    protected void doSetPlanpost_NotEqual(String planpost) {
        regPlanpost(CK_NES, planpost);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_GreaterThan(String planpost) {
        regPlanpost(CK_GT, fRES(planpost));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_LessThan(String planpost) {
        regPlanpost(CK_LT, fRES(planpost));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_GreaterEqual(String planpost) {
        regPlanpost(CK_GE, fRES(planpost));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_LessEqual(String planpost) {
        regPlanpost(CK_LE, fRES(planpost));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpostList The collection of planpost as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_InScope(Collection<String> planpostList) {
        doSetPlanpost_InScope(planpostList);
    }

    protected void doSetPlanpost_InScope(Collection<String> planpostList) {
        regINS(CK_INS, cTL(planpostList), xgetCValuePlanpost(), "PLANPOST");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpostList The collection of planpost as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_NotInScope(Collection<String> planpostList) {
        doSetPlanpost_NotInScope(planpostList);
    }

    protected void doSetPlanpost_NotInScope(Collection<String> planpostList) {
        regINS(CK_NINS, cTL(planpostList), xgetCValuePlanpost(), "PLANPOST");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(255)} <br>
     * <pre>e.g. setPlanpost_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planpost The value of planpost as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanpost_LikeSearch(String planpost, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planpost), xgetCValuePlanpost(), "PLANPOST", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanpost_NotLikeSearch(String planpost, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planpost), xgetCValuePlanpost(), "PLANPOST", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPOST: {varchar(255)}
     * @param planpost The value of planpost as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_PrefixSearch(String planpost) {
        setPlanpost_LikeSearch(planpost, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     */
    public void setPlanpost_IsNull() { regPlanpost(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     */
    public void setPlanpost_IsNullOrEmpty() { regPlanpost(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANPOST: {varchar(255)}
     */
    public void setPlanpost_IsNotNull() { regPlanpost(CK_ISNN, DOBJ); }

    protected void regPlanpost(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanpost(), "PLANPOST"); }
    protected abstract ConditionValue xgetCValuePlanpost();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_Equal(String planAdress1) {
        doSetPlanAdress1_Equal(fRES(planAdress1));
    }

    protected void doSetPlanAdress1_Equal(String planAdress1) {
        regPlanAdress1(CK_EQ, planAdress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_NotEqual(String planAdress1) {
        doSetPlanAdress1_NotEqual(fRES(planAdress1));
    }

    protected void doSetPlanAdress1_NotEqual(String planAdress1) {
        regPlanAdress1(CK_NES, planAdress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_GreaterThan(String planAdress1) {
        regPlanAdress1(CK_GT, fRES(planAdress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_LessThan(String planAdress1) {
        regPlanAdress1(CK_LT, fRES(planAdress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_GreaterEqual(String planAdress1) {
        regPlanAdress1(CK_GE, fRES(planAdress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_LessEqual(String planAdress1) {
        regPlanAdress1(CK_LE, fRES(planAdress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1List The collection of planAdress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_InScope(Collection<String> planAdress1List) {
        doSetPlanAdress1_InScope(planAdress1List);
    }

    protected void doSetPlanAdress1_InScope(Collection<String> planAdress1List) {
        regINS(CK_INS, cTL(planAdress1List), xgetCValuePlanAdress1(), "PLAN_ADRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1List The collection of planAdress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_NotInScope(Collection<String> planAdress1List) {
        doSetPlanAdress1_NotInScope(planAdress1List);
    }

    protected void doSetPlanAdress1_NotInScope(Collection<String> planAdress1List) {
        regINS(CK_NINS, cTL(planAdress1List), xgetCValuePlanAdress1(), "PLAN_ADRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)} <br>
     * <pre>e.g. setPlanAdress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planAdress1 The value of planAdress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanAdress1_LikeSearch(String planAdress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planAdress1), xgetCValuePlanAdress1(), "PLAN_ADRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanAdress1_NotLikeSearch(String planAdress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planAdress1), xgetCValuePlanAdress1(), "PLAN_ADRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @param planAdress1 The value of planAdress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress1_PrefixSearch(String planAdress1) {
        setPlanAdress1_LikeSearch(planAdress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     */
    public void setPlanAdress1_IsNull() { regPlanAdress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     */
    public void setPlanAdress1_IsNullOrEmpty() { regPlanAdress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_ADRESS1: {varchar(255)}
     */
    public void setPlanAdress1_IsNotNull() { regPlanAdress1(CK_ISNN, DOBJ); }

    protected void regPlanAdress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanAdress1(), "PLAN_ADRESS1"); }
    protected abstract ConditionValue xgetCValuePlanAdress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_Equal(String planAdress2) {
        doSetPlanAdress2_Equal(fRES(planAdress2));
    }

    protected void doSetPlanAdress2_Equal(String planAdress2) {
        regPlanAdress2(CK_EQ, planAdress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_NotEqual(String planAdress2) {
        doSetPlanAdress2_NotEqual(fRES(planAdress2));
    }

    protected void doSetPlanAdress2_NotEqual(String planAdress2) {
        regPlanAdress2(CK_NES, planAdress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_GreaterThan(String planAdress2) {
        regPlanAdress2(CK_GT, fRES(planAdress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_LessThan(String planAdress2) {
        regPlanAdress2(CK_LT, fRES(planAdress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_GreaterEqual(String planAdress2) {
        regPlanAdress2(CK_GE, fRES(planAdress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_LessEqual(String planAdress2) {
        regPlanAdress2(CK_LE, fRES(planAdress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2List The collection of planAdress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_InScope(Collection<String> planAdress2List) {
        doSetPlanAdress2_InScope(planAdress2List);
    }

    protected void doSetPlanAdress2_InScope(Collection<String> planAdress2List) {
        regINS(CK_INS, cTL(planAdress2List), xgetCValuePlanAdress2(), "PLAN_ADRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2List The collection of planAdress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_NotInScope(Collection<String> planAdress2List) {
        doSetPlanAdress2_NotInScope(planAdress2List);
    }

    protected void doSetPlanAdress2_NotInScope(Collection<String> planAdress2List) {
        regINS(CK_NINS, cTL(planAdress2List), xgetCValuePlanAdress2(), "PLAN_ADRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)} <br>
     * <pre>e.g. setPlanAdress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planAdress2 The value of planAdress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanAdress2_LikeSearch(String planAdress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planAdress2), xgetCValuePlanAdress2(), "PLAN_ADRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanAdress2_NotLikeSearch(String planAdress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planAdress2), xgetCValuePlanAdress2(), "PLAN_ADRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @param planAdress2 The value of planAdress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanAdress2_PrefixSearch(String planAdress2) {
        setPlanAdress2_LikeSearch(planAdress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     */
    public void setPlanAdress2_IsNull() { regPlanAdress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     */
    public void setPlanAdress2_IsNullOrEmpty() { regPlanAdress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_ADRESS2: {varchar(255)}
     */
    public void setPlanAdress2_IsNotNull() { regPlanAdress2(CK_ISNN, DOBJ); }

    protected void regPlanAdress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanAdress2(), "PLAN_ADRESS2"); }
    protected abstract ConditionValue xgetCValuePlanAdress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_Equal(String planProductName) {
        doSetPlanProductName_Equal(fRES(planProductName));
    }

    protected void doSetPlanProductName_Equal(String planProductName) {
        regPlanProductName(CK_EQ, planProductName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_NotEqual(String planProductName) {
        doSetPlanProductName_NotEqual(fRES(planProductName));
    }

    protected void doSetPlanProductName_NotEqual(String planProductName) {
        regPlanProductName(CK_NES, planProductName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_GreaterThan(String planProductName) {
        regPlanProductName(CK_GT, fRES(planProductName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_LessThan(String planProductName) {
        regPlanProductName(CK_LT, fRES(planProductName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_GreaterEqual(String planProductName) {
        regPlanProductName(CK_GE, fRES(planProductName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_LessEqual(String planProductName) {
        regPlanProductName(CK_LE, fRES(planProductName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductNameList The collection of planProductName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_InScope(Collection<String> planProductNameList) {
        doSetPlanProductName_InScope(planProductNameList);
    }

    protected void doSetPlanProductName_InScope(Collection<String> planProductNameList) {
        regINS(CK_INS, cTL(planProductNameList), xgetCValuePlanProductName(), "PLAN_PRODUCT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductNameList The collection of planProductName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_NotInScope(Collection<String> planProductNameList) {
        doSetPlanProductName_NotInScope(planProductNameList);
    }

    protected void doSetPlanProductName_NotInScope(Collection<String> planProductNameList) {
        regINS(CK_NINS, cTL(planProductNameList), xgetCValuePlanProductName(), "PLAN_PRODUCT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)} <br>
     * <pre>e.g. setPlanProductName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planProductName The value of planProductName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanProductName_LikeSearch(String planProductName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planProductName), xgetCValuePlanProductName(), "PLAN_PRODUCT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanProductName_NotLikeSearch(String planProductName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planProductName), xgetCValuePlanProductName(), "PLAN_PRODUCT_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @param planProductName The value of planProductName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProductName_PrefixSearch(String planProductName) {
        setPlanProductName_LikeSearch(planProductName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     */
    public void setPlanProductName_IsNull() { regPlanProductName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     */
    public void setPlanProductName_IsNullOrEmpty() { regPlanProductName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     */
    public void setPlanProductName_IsNotNull() { regPlanProductName(CK_ISNN, DOBJ); }

    protected void regPlanProductName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanProductName(), "PLAN_PRODUCT_NAME"); }
    protected abstract ConditionValue xgetCValuePlanProductName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_Equal(String warehousePlant) {
        doSetWarehousePlant_Equal(fRES(warehousePlant));
    }

    protected void doSetWarehousePlant_Equal(String warehousePlant) {
        regWarehousePlant(CK_EQ, warehousePlant);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_NotEqual(String warehousePlant) {
        doSetWarehousePlant_NotEqual(fRES(warehousePlant));
    }

    protected void doSetWarehousePlant_NotEqual(String warehousePlant) {
        regWarehousePlant(CK_NES, warehousePlant);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_GreaterThan(String warehousePlant) {
        regWarehousePlant(CK_GT, fRES(warehousePlant));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_LessThan(String warehousePlant) {
        regWarehousePlant(CK_LT, fRES(warehousePlant));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_GreaterEqual(String warehousePlant) {
        regWarehousePlant(CK_GE, fRES(warehousePlant));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_LessEqual(String warehousePlant) {
        regWarehousePlant(CK_LE, fRES(warehousePlant));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlantList The collection of warehousePlant as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_InScope(Collection<String> warehousePlantList) {
        doSetWarehousePlant_InScope(warehousePlantList);
    }

    protected void doSetWarehousePlant_InScope(Collection<String> warehousePlantList) {
        regINS(CK_INS, cTL(warehousePlantList), xgetCValueWarehousePlant(), "WAREHOUSE_PLANT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlantList The collection of warehousePlant as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_NotInScope(Collection<String> warehousePlantList) {
        doSetWarehousePlant_NotInScope(warehousePlantList);
    }

    protected void doSetWarehousePlant_NotInScope(Collection<String> warehousePlantList) {
        regINS(CK_NINS, cTL(warehousePlantList), xgetCValueWarehousePlant(), "WAREHOUSE_PLANT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)} <br>
     * <pre>e.g. setWarehousePlant_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousePlant The value of warehousePlant as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousePlant_LikeSearch(String warehousePlant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousePlant), xgetCValueWarehousePlant(), "WAREHOUSE_PLANT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousePlant_NotLikeSearch(String warehousePlant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousePlant), xgetCValueWarehousePlant(), "WAREHOUSE_PLANT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @param warehousePlant The value of warehousePlant as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlant_PrefixSearch(String warehousePlant) {
        setWarehousePlant_LikeSearch(warehousePlant, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     */
    public void setWarehousePlant_IsNull() { regWarehousePlant(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     */
    public void setWarehousePlant_IsNullOrEmpty() { regWarehousePlant(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     */
    public void setWarehousePlant_IsNotNull() { regWarehousePlant(CK_ISNN, DOBJ); }

    protected void regWarehousePlant(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousePlant(), "WAREHOUSE_PLANT"); }
    protected abstract ConditionValue xgetCValueWarehousePlant();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_Equal(String warehousePlantName) {
        doSetWarehousePlantName_Equal(fRES(warehousePlantName));
    }

    protected void doSetWarehousePlantName_Equal(String warehousePlantName) {
        regWarehousePlantName(CK_EQ, warehousePlantName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_NotEqual(String warehousePlantName) {
        doSetWarehousePlantName_NotEqual(fRES(warehousePlantName));
    }

    protected void doSetWarehousePlantName_NotEqual(String warehousePlantName) {
        regWarehousePlantName(CK_NES, warehousePlantName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_GreaterThan(String warehousePlantName) {
        regWarehousePlantName(CK_GT, fRES(warehousePlantName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_LessThan(String warehousePlantName) {
        regWarehousePlantName(CK_LT, fRES(warehousePlantName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_GreaterEqual(String warehousePlantName) {
        regWarehousePlantName(CK_GE, fRES(warehousePlantName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_LessEqual(String warehousePlantName) {
        regWarehousePlantName(CK_LE, fRES(warehousePlantName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantNameList The collection of warehousePlantName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_InScope(Collection<String> warehousePlantNameList) {
        doSetWarehousePlantName_InScope(warehousePlantNameList);
    }

    protected void doSetWarehousePlantName_InScope(Collection<String> warehousePlantNameList) {
        regINS(CK_INS, cTL(warehousePlantNameList), xgetCValueWarehousePlantName(), "WAREHOUSE_PLANT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantNameList The collection of warehousePlantName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_NotInScope(Collection<String> warehousePlantNameList) {
        doSetWarehousePlantName_NotInScope(warehousePlantNameList);
    }

    protected void doSetWarehousePlantName_NotInScope(Collection<String> warehousePlantNameList) {
        regINS(CK_NINS, cTL(warehousePlantNameList), xgetCValueWarehousePlantName(), "WAREHOUSE_PLANT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)} <br>
     * <pre>e.g. setWarehousePlantName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousePlantName The value of warehousePlantName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousePlantName_LikeSearch(String warehousePlantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousePlantName), xgetCValueWarehousePlantName(), "WAREHOUSE_PLANT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousePlantName_NotLikeSearch(String warehousePlantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousePlantName), xgetCValueWarehousePlantName(), "WAREHOUSE_PLANT_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @param warehousePlantName The value of warehousePlantName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousePlantName_PrefixSearch(String warehousePlantName) {
        setWarehousePlantName_LikeSearch(warehousePlantName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     */
    public void setWarehousePlantName_IsNull() { regWarehousePlantName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     */
    public void setWarehousePlantName_IsNullOrEmpty() { regWarehousePlantName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     */
    public void setWarehousePlantName_IsNotNull() { regWarehousePlantName(CK_ISNN, DOBJ); }

    protected void regWarehousePlantName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousePlantName(), "WAREHOUSE_PLANT_NAME"); }
    protected abstract ConditionValue xgetCValueWarehousePlantName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_Equal(String orderDate) {
        doSetOrderDate_Equal(fRES(orderDate));
    }

    protected void doSetOrderDate_Equal(String orderDate) {
        regOrderDate(CK_EQ, orderDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotEqual(String orderDate) {
        doSetOrderDate_NotEqual(fRES(orderDate));
    }

    protected void doSetOrderDate_NotEqual(String orderDate) {
        regOrderDate(CK_NES, orderDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterThan(String orderDate) {
        regOrderDate(CK_GT, fRES(orderDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessThan(String orderDate) {
        regOrderDate(CK_LT, fRES(orderDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterEqual(String orderDate) {
        regOrderDate(CK_GE, fRES(orderDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessEqual(String orderDate) {
        regOrderDate(CK_LE, fRES(orderDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDateList The collection of orderDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_InScope(Collection<String> orderDateList) {
        doSetOrderDate_InScope(orderDateList);
    }

    protected void doSetOrderDate_InScope(Collection<String> orderDateList) {
        regINS(CK_INS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDateList The collection of orderDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotInScope(Collection<String> orderDateList) {
        doSetOrderDate_NotInScope(orderDateList);
    }

    protected void doSetOrderDate_NotInScope(Collection<String> orderDateList) {
        regINS(CK_NINS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)} <br>
     * <pre>e.g. setOrderDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDate The value of orderDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDate_LikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDate_NotLikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_PrefixSearch(String orderDate) {
        setOrderDate_LikeSearch(orderDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     */
    public void setOrderDate_IsNull() { regOrderDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     */
    public void setOrderDate_IsNullOrEmpty() { regOrderDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     */
    public void setOrderDate_IsNotNull() { regOrderDate(CK_ISNN, DOBJ); }

    protected void regOrderDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDate(), "ORDER_DATE"); }
    protected abstract ConditionValue xgetCValueOrderDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_Equal(String deliveryDate) {
        doSetDeliveryDate_Equal(fRES(deliveryDate));
    }

    protected void doSetDeliveryDate_Equal(String deliveryDate) {
        regDeliveryDate(CK_EQ, deliveryDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_NotEqual(String deliveryDate) {
        doSetDeliveryDate_NotEqual(fRES(deliveryDate));
    }

    protected void doSetDeliveryDate_NotEqual(String deliveryDate) {
        regDeliveryDate(CK_NES, deliveryDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_GreaterThan(String deliveryDate) {
        regDeliveryDate(CK_GT, fRES(deliveryDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_LessThan(String deliveryDate) {
        regDeliveryDate(CK_LT, fRES(deliveryDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_GreaterEqual(String deliveryDate) {
        regDeliveryDate(CK_GE, fRES(deliveryDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_LessEqual(String deliveryDate) {
        regDeliveryDate(CK_LE, fRES(deliveryDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDateList The collection of deliveryDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_InScope(Collection<String> deliveryDateList) {
        doSetDeliveryDate_InScope(deliveryDateList);
    }

    protected void doSetDeliveryDate_InScope(Collection<String> deliveryDateList) {
        regINS(CK_INS, cTL(deliveryDateList), xgetCValueDeliveryDate(), "DELIVERY_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDateList The collection of deliveryDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_NotInScope(Collection<String> deliveryDateList) {
        doSetDeliveryDate_NotInScope(deliveryDateList);
    }

    protected void doSetDeliveryDate_NotInScope(Collection<String> deliveryDateList) {
        regINS(CK_NINS, cTL(deliveryDateList), xgetCValueDeliveryDate(), "DELIVERY_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATE: {varchar(255)} <br>
     * <pre>e.g. setDeliveryDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryDate The value of deliveryDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryDate_LikeSearch(String deliveryDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryDate), xgetCValueDeliveryDate(), "DELIVERY_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryDate_NotLikeSearch(String deliveryDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryDate), xgetCValueDeliveryDate(), "DELIVERY_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @param deliveryDate The value of deliveryDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDate_PrefixSearch(String deliveryDate) {
        setDeliveryDate_LikeSearch(deliveryDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     */
    public void setDeliveryDate_IsNull() { regDeliveryDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     */
    public void setDeliveryDate_IsNullOrEmpty() { regDeliveryDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATE: {varchar(255)}
     */
    public void setDeliveryDate_IsNotNull() { regDeliveryDate(CK_ISNN, DOBJ); }

    protected void regDeliveryDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryDate(), "DELIVERY_DATE"); }
    protected abstract ConditionValue xgetCValueDeliveryDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_Equal(String purchaseNo) {
        doSetPurchaseNo_Equal(fRES(purchaseNo));
    }

    protected void doSetPurchaseNo_Equal(String purchaseNo) {
        regPurchaseNo(CK_EQ, purchaseNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_NotEqual(String purchaseNo) {
        doSetPurchaseNo_NotEqual(fRES(purchaseNo));
    }

    protected void doSetPurchaseNo_NotEqual(String purchaseNo) {
        regPurchaseNo(CK_NES, purchaseNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_GreaterThan(String purchaseNo) {
        regPurchaseNo(CK_GT, fRES(purchaseNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_LessThan(String purchaseNo) {
        regPurchaseNo(CK_LT, fRES(purchaseNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_GreaterEqual(String purchaseNo) {
        regPurchaseNo(CK_GE, fRES(purchaseNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_LessEqual(String purchaseNo) {
        regPurchaseNo(CK_LE, fRES(purchaseNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNoList The collection of purchaseNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_InScope(Collection<String> purchaseNoList) {
        doSetPurchaseNo_InScope(purchaseNoList);
    }

    protected void doSetPurchaseNo_InScope(Collection<String> purchaseNoList) {
        regINS(CK_INS, cTL(purchaseNoList), xgetCValuePurchaseNo(), "PURCHASE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNoList The collection of purchaseNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_NotInScope(Collection<String> purchaseNoList) {
        doSetPurchaseNo_NotInScope(purchaseNoList);
    }

    protected void doSetPurchaseNo_NotInScope(Collection<String> purchaseNoList) {
        regINS(CK_NINS, cTL(purchaseNoList), xgetCValuePurchaseNo(), "PURCHASE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_NO: {varchar(255)} <br>
     * <pre>e.g. setPurchaseNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseNo The value of purchaseNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseNo_LikeSearch(String purchaseNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseNo), xgetCValuePurchaseNo(), "PURCHASE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseNo_NotLikeSearch(String purchaseNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseNo), xgetCValuePurchaseNo(), "PURCHASE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     * @param purchaseNo The value of purchaseNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseNo_PrefixSearch(String purchaseNo) {
        setPurchaseNo_LikeSearch(purchaseNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     */
    public void setPurchaseNo_IsNull() { regPurchaseNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     */
    public void setPurchaseNo_IsNullOrEmpty() { regPurchaseNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_NO: {varchar(255)}
     */
    public void setPurchaseNo_IsNotNull() { regPurchaseNo(CK_ISNN, DOBJ); }

    protected void regPurchaseNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseNo(), "PURCHASE_NO"); }
    protected abstract ConditionValue xgetCValuePurchaseNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_Equal(String orderNumber) {
        doSetOrderNumber_Equal(fRES(orderNumber));
    }

    protected void doSetOrderNumber_Equal(String orderNumber) {
        regOrderNumber(CK_EQ, orderNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_NotEqual(String orderNumber) {
        doSetOrderNumber_NotEqual(fRES(orderNumber));
    }

    protected void doSetOrderNumber_NotEqual(String orderNumber) {
        regOrderNumber(CK_NES, orderNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_GreaterThan(String orderNumber) {
        regOrderNumber(CK_GT, fRES(orderNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_LessThan(String orderNumber) {
        regOrderNumber(CK_LT, fRES(orderNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_GreaterEqual(String orderNumber) {
        regOrderNumber(CK_GE, fRES(orderNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_LessEqual(String orderNumber) {
        regOrderNumber(CK_LE, fRES(orderNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumberList The collection of orderNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_InScope(Collection<String> orderNumberList) {
        doSetOrderNumber_InScope(orderNumberList);
    }

    protected void doSetOrderNumber_InScope(Collection<String> orderNumberList) {
        regINS(CK_INS, cTL(orderNumberList), xgetCValueOrderNumber(), "ORDER_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumberList The collection of orderNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_NotInScope(Collection<String> orderNumberList) {
        doSetOrderNumber_NotInScope(orderNumberList);
    }

    protected void doSetOrderNumber_NotInScope(Collection<String> orderNumberList) {
        regINS(CK_NINS, cTL(orderNumberList), xgetCValueOrderNumber(), "ORDER_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NUMBER: {varchar(255)} <br>
     * <pre>e.g. setOrderNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderNumber The value of orderNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderNumber_LikeSearch(String orderNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderNumber), xgetCValueOrderNumber(), "ORDER_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderNumber_NotLikeSearch(String orderNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderNumber), xgetCValueOrderNumber(), "ORDER_NUMBER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @param orderNumber The value of orderNumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNumber_PrefixSearch(String orderNumber) {
        setOrderNumber_LikeSearch(orderNumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     */
    public void setOrderNumber_IsNull() { regOrderNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     */
    public void setOrderNumber_IsNullOrEmpty() { regOrderNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NUMBER: {varchar(255)}
     */
    public void setOrderNumber_IsNotNull() { regOrderNumber(CK_ISNN, DOBJ); }

    protected void regOrderNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNumber(), "ORDER_NUMBER"); }
    protected abstract ConditionValue xgetCValueOrderNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_Equal(String itemLineNo) {
        doSetItemLineNo_Equal(fRES(itemLineNo));
    }

    protected void doSetItemLineNo_Equal(String itemLineNo) {
        regItemLineNo(CK_EQ, itemLineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_NotEqual(String itemLineNo) {
        doSetItemLineNo_NotEqual(fRES(itemLineNo));
    }

    protected void doSetItemLineNo_NotEqual(String itemLineNo) {
        regItemLineNo(CK_NES, itemLineNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_GreaterThan(String itemLineNo) {
        regItemLineNo(CK_GT, fRES(itemLineNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_LessThan(String itemLineNo) {
        regItemLineNo(CK_LT, fRES(itemLineNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_GreaterEqual(String itemLineNo) {
        regItemLineNo(CK_GE, fRES(itemLineNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_LessEqual(String itemLineNo) {
        regItemLineNo(CK_LE, fRES(itemLineNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNoList The collection of itemLineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_InScope(Collection<String> itemLineNoList) {
        doSetItemLineNo_InScope(itemLineNoList);
    }

    protected void doSetItemLineNo_InScope(Collection<String> itemLineNoList) {
        regINS(CK_INS, cTL(itemLineNoList), xgetCValueItemLineNo(), "ITEM_LINE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNoList The collection of itemLineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_NotInScope(Collection<String> itemLineNoList) {
        doSetItemLineNo_NotInScope(itemLineNoList);
    }

    protected void doSetItemLineNo_NotInScope(Collection<String> itemLineNoList) {
        regINS(CK_NINS, cTL(itemLineNoList), xgetCValueItemLineNo(), "ITEM_LINE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)} <br>
     * <pre>e.g. setItemLineNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemLineNo The value of itemLineNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemLineNo_LikeSearch(String itemLineNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemLineNo), xgetCValueItemLineNo(), "ITEM_LINE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemLineNo_NotLikeSearch(String itemLineNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemLineNo), xgetCValueItemLineNo(), "ITEM_LINE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @param itemLineNo The value of itemLineNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemLineNo_PrefixSearch(String itemLineNo) {
        setItemLineNo_LikeSearch(itemLineNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     */
    public void setItemLineNo_IsNull() { regItemLineNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     */
    public void setItemLineNo_IsNullOrEmpty() { regItemLineNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_LINE_NO: {varchar(255)}
     */
    public void setItemLineNo_IsNotNull() { regItemLineNo(CK_ISNN, DOBJ); }

    protected void regItemLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemLineNo(), "ITEM_LINE_NO"); }
    protected abstract ConditionValue xgetCValueItemLineNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_Equal(String skuCode) {
        doSetSkuCode_Equal(fRES(skuCode));
    }

    protected void doSetSkuCode_Equal(String skuCode) {
        regSkuCode(CK_EQ, skuCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_NotEqual(String skuCode) {
        doSetSkuCode_NotEqual(fRES(skuCode));
    }

    protected void doSetSkuCode_NotEqual(String skuCode) {
        regSkuCode(CK_NES, skuCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_GreaterThan(String skuCode) {
        regSkuCode(CK_GT, fRES(skuCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_LessThan(String skuCode) {
        regSkuCode(CK_LT, fRES(skuCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_GreaterEqual(String skuCode) {
        regSkuCode(CK_GE, fRES(skuCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_LessEqual(String skuCode) {
        regSkuCode(CK_LE, fRES(skuCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCodeList The collection of skuCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_InScope(Collection<String> skuCodeList) {
        doSetSkuCode_InScope(skuCodeList);
    }

    protected void doSetSkuCode_InScope(Collection<String> skuCodeList) {
        regINS(CK_INS, cTL(skuCodeList), xgetCValueSkuCode(), "SKU_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCodeList The collection of skuCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_NotInScope(Collection<String> skuCodeList) {
        doSetSkuCode_NotInScope(skuCodeList);
    }

    protected void doSetSkuCode_NotInScope(Collection<String> skuCodeList) {
        regINS(CK_NINS, cTL(skuCodeList), xgetCValueSkuCode(), "SKU_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU_CODE: {varchar(255)} <br>
     * <pre>e.g. setSkuCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skuCode The value of skuCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkuCode_LikeSearch(String skuCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skuCode), xgetCValueSkuCode(), "SKU_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkuCode_NotLikeSearch(String skuCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skuCode), xgetCValueSkuCode(), "SKU_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU_CODE: {varchar(255)}
     * @param skuCode The value of skuCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkuCode_PrefixSearch(String skuCode) {
        setSkuCode_LikeSearch(skuCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     */
    public void setSkuCode_IsNull() { regSkuCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     */
    public void setSkuCode_IsNullOrEmpty() { regSkuCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKU_CODE: {varchar(255)}
     */
    public void setSkuCode_IsNotNull() { regSkuCode(CK_ISNN, DOBJ); }

    protected void regSkuCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkuCode(), "SKU_CODE"); }
    protected abstract ConditionValue xgetCValueSkuCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_Equal(String cardboard) {
        doSetCardboard_Equal(fRES(cardboard));
    }

    protected void doSetCardboard_Equal(String cardboard) {
        regCardboard(CK_EQ, cardboard);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_NotEqual(String cardboard) {
        doSetCardboard_NotEqual(fRES(cardboard));
    }

    protected void doSetCardboard_NotEqual(String cardboard) {
        regCardboard(CK_NES, cardboard);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_GreaterThan(String cardboard) {
        regCardboard(CK_GT, fRES(cardboard));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_LessThan(String cardboard) {
        regCardboard(CK_LT, fRES(cardboard));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_GreaterEqual(String cardboard) {
        regCardboard(CK_GE, fRES(cardboard));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_LessEqual(String cardboard) {
        regCardboard(CK_LE, fRES(cardboard));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboardList The collection of cardboard as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_InScope(Collection<String> cardboardList) {
        doSetCardboard_InScope(cardboardList);
    }

    protected void doSetCardboard_InScope(Collection<String> cardboardList) {
        regINS(CK_INS, cTL(cardboardList), xgetCValueCardboard(), "CARDBOARD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboardList The collection of cardboard as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_NotInScope(Collection<String> cardboardList) {
        doSetCardboard_NotInScope(cardboardList);
    }

    protected void doSetCardboard_NotInScope(Collection<String> cardboardList) {
        regINS(CK_NINS, cTL(cardboardList), xgetCValueCardboard(), "CARDBOARD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARDBOARD: {varchar(255)} <br>
     * <pre>e.g. setCardboard_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardboard The value of cardboard as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardboard_LikeSearch(String cardboard, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardboard), xgetCValueCardboard(), "CARDBOARD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardboard_NotLikeSearch(String cardboard, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardboard), xgetCValueCardboard(), "CARDBOARD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARDBOARD: {varchar(255)}
     * @param cardboard The value of cardboard as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_PrefixSearch(String cardboard) {
        setCardboard_LikeSearch(cardboard, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     */
    public void setCardboard_IsNull() { regCardboard(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     */
    public void setCardboard_IsNullOrEmpty() { regCardboard(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARDBOARD: {varchar(255)}
     */
    public void setCardboard_IsNotNull() { regCardboard(CK_ISNN, DOBJ); }

    protected void regCardboard(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardboard(), "CARDBOARD"); }
    protected abstract ConditionValue xgetCValueCardboard();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_Equal(String carton) {
        doSetCarton_Equal(fRES(carton));
    }

    protected void doSetCarton_Equal(String carton) {
        regCarton(CK_EQ, carton);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_NotEqual(String carton) {
        doSetCarton_NotEqual(fRES(carton));
    }

    protected void doSetCarton_NotEqual(String carton) {
        regCarton(CK_NES, carton);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_GreaterThan(String carton) {
        regCarton(CK_GT, fRES(carton));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_LessThan(String carton) {
        regCarton(CK_LT, fRES(carton));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_GreaterEqual(String carton) {
        regCarton(CK_GE, fRES(carton));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_LessEqual(String carton) {
        regCarton(CK_LE, fRES(carton));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARTON: {varchar(255)}
     * @param cartonList The collection of carton as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_InScope(Collection<String> cartonList) {
        doSetCarton_InScope(cartonList);
    }

    protected void doSetCarton_InScope(Collection<String> cartonList) {
        regINS(CK_INS, cTL(cartonList), xgetCValueCarton(), "CARTON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARTON: {varchar(255)}
     * @param cartonList The collection of carton as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_NotInScope(Collection<String> cartonList) {
        doSetCarton_NotInScope(cartonList);
    }

    protected void doSetCarton_NotInScope(Collection<String> cartonList) {
        regINS(CK_NINS, cTL(cartonList), xgetCValueCarton(), "CARTON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARTON: {varchar(255)} <br>
     * <pre>e.g. setCarton_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carton The value of carton as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarton_LikeSearch(String carton, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carton), xgetCValueCarton(), "CARTON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarton_NotLikeSearch(String carton, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carton), xgetCValueCarton(), "CARTON", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARTON: {varchar(255)}
     * @param carton The value of carton as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_PrefixSearch(String carton) {
        setCarton_LikeSearch(carton, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     */
    public void setCarton_IsNull() { regCarton(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     */
    public void setCarton_IsNullOrEmpty() { regCarton(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARTON: {varchar(255)}
     */
    public void setCarton_IsNotNull() { regCarton(CK_ISNN, DOBJ); }

    protected void regCarton(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarton(), "CARTON"); }
    protected abstract ConditionValue xgetCValueCarton();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_Equal(String totalQty) {
        doSetTotalQty_Equal(fRES(totalQty));
    }

    protected void doSetTotalQty_Equal(String totalQty) {
        regTotalQty(CK_EQ, totalQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_NotEqual(String totalQty) {
        doSetTotalQty_NotEqual(fRES(totalQty));
    }

    protected void doSetTotalQty_NotEqual(String totalQty) {
        regTotalQty(CK_NES, totalQty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_GreaterThan(String totalQty) {
        regTotalQty(CK_GT, fRES(totalQty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_LessThan(String totalQty) {
        regTotalQty(CK_LT, fRES(totalQty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_GreaterEqual(String totalQty) {
        regTotalQty(CK_GE, fRES(totalQty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_LessEqual(String totalQty) {
        regTotalQty(CK_LE, fRES(totalQty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQtyList The collection of totalQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_InScope(Collection<String> totalQtyList) {
        doSetTotalQty_InScope(totalQtyList);
    }

    protected void doSetTotalQty_InScope(Collection<String> totalQtyList) {
        regINS(CK_INS, cTL(totalQtyList), xgetCValueTotalQty(), "TOTAL_QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQtyList The collection of totalQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_NotInScope(Collection<String> totalQtyList) {
        doSetTotalQty_NotInScope(totalQtyList);
    }

    protected void doSetTotalQty_NotInScope(Collection<String> totalQtyList) {
        regINS(CK_NINS, cTL(totalQtyList), xgetCValueTotalQty(), "TOTAL_QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_QTY: {varchar(255)} <br>
     * <pre>e.g. setTotalQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param totalQty The value of totalQty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTotalQty_LikeSearch(String totalQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(totalQty), xgetCValueTotalQty(), "TOTAL_QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTotalQty_NotLikeSearch(String totalQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(totalQty), xgetCValueTotalQty(), "TOTAL_QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     * @param totalQty The value of totalQty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalQty_PrefixSearch(String totalQty) {
        setTotalQty_LikeSearch(totalQty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     */
    public void setTotalQty_IsNull() { regTotalQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     */
    public void setTotalQty_IsNullOrEmpty() { regTotalQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_QTY: {varchar(255)}
     */
    public void setTotalQty_IsNotNull() { regTotalQty(CK_ISNN, DOBJ); }

    protected void regTotalQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalQty(), "TOTAL_QTY"); }
    protected abstract ConditionValue xgetCValueTotalQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_Equal(String note) {
        doSetNote_Equal(fRES(note));
    }

    protected void doSetNote_Equal(String note) {
        regNote(CK_EQ, note);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_NotEqual(String note) {
        doSetNote_NotEqual(fRES(note));
    }

    protected void doSetNote_NotEqual(String note) {
        regNote(CK_NES, note);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_GreaterThan(String note) {
        regNote(CK_GT, fRES(note));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_LessThan(String note) {
        regNote(CK_LT, fRES(note));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_GreaterEqual(String note) {
        regNote(CK_GE, fRES(note));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_LessEqual(String note) {
        regNote(CK_LE, fRES(note));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTE: {varchar(255)}
     * @param noteList The collection of note as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_InScope(Collection<String> noteList) {
        doSetNote_InScope(noteList);
    }

    protected void doSetNote_InScope(Collection<String> noteList) {
        regINS(CK_INS, cTL(noteList), xgetCValueNote(), "NOTE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTE: {varchar(255)}
     * @param noteList The collection of note as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_NotInScope(Collection<String> noteList) {
        doSetNote_NotInScope(noteList);
    }

    protected void doSetNote_NotInScope(Collection<String> noteList) {
        regINS(CK_NINS, cTL(noteList), xgetCValueNote(), "NOTE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTE: {varchar(255)} <br>
     * <pre>e.g. setNote_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param note The value of note as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNote_LikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(note), xgetCValueNote(), "NOTE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNote_NotLikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(note), xgetCValueNote(), "NOTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTE: {varchar(255)}
     * @param note The value of note as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_PrefixSearch(String note) {
        setNote_LikeSearch(note, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     */
    public void setNote_IsNull() { regNote(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     */
    public void setNote_IsNullOrEmpty() { regNote(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTE: {varchar(255)}
     */
    public void setNote_IsNotNull() { regNote(CK_ISNN, DOBJ); }

    protected void regNote(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNote(), "NOTE"); }
    protected abstract ConditionValue xgetCValueNote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_Equal(String reserve2) {
        doSetReserve2_Equal(fRES(reserve2));
    }

    protected void doSetReserve2_Equal(String reserve2) {
        regReserve2(CK_EQ, reserve2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_NotEqual(String reserve2) {
        doSetReserve2_NotEqual(fRES(reserve2));
    }

    protected void doSetReserve2_NotEqual(String reserve2) {
        regReserve2(CK_NES, reserve2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_GreaterThan(String reserve2) {
        regReserve2(CK_GT, fRES(reserve2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_LessThan(String reserve2) {
        regReserve2(CK_LT, fRES(reserve2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_GreaterEqual(String reserve2) {
        regReserve2(CK_GE, fRES(reserve2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_LessEqual(String reserve2) {
        regReserve2(CK_LE, fRES(reserve2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2List The collection of reserve2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_InScope(Collection<String> reserve2List) {
        doSetReserve2_InScope(reserve2List);
    }

    protected void doSetReserve2_InScope(Collection<String> reserve2List) {
        regINS(CK_INS, cTL(reserve2List), xgetCValueReserve2(), "RESERVE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2List The collection of reserve2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_NotInScope(Collection<String> reserve2List) {
        doSetReserve2_NotInScope(reserve2List);
    }

    protected void doSetReserve2_NotInScope(Collection<String> reserve2List) {
        regINS(CK_NINS, cTL(reserve2List), xgetCValueReserve2(), "RESERVE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE2: {varchar(255)} <br>
     * <pre>e.g. setReserve2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reserve2 The value of reserve2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReserve2_LikeSearch(String reserve2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reserve2), xgetCValueReserve2(), "RESERVE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReserve2_NotLikeSearch(String reserve2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reserve2), xgetCValueReserve2(), "RESERVE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE2: {varchar(255)}
     * @param reserve2 The value of reserve2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_PrefixSearch(String reserve2) {
        setReserve2_LikeSearch(reserve2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     */
    public void setReserve2_IsNull() { regReserve2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     */
    public void setReserve2_IsNullOrEmpty() { regReserve2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESERVE2: {varchar(255)}
     */
    public void setReserve2_IsNotNull() { regReserve2(CK_ISNN, DOBJ); }

    protected void regReserve2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReserve2(), "RESERVE2"); }
    protected abstract ConditionValue xgetCValueReserve2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_Equal(String reserve3) {
        doSetReserve3_Equal(fRES(reserve3));
    }

    protected void doSetReserve3_Equal(String reserve3) {
        regReserve3(CK_EQ, reserve3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_NotEqual(String reserve3) {
        doSetReserve3_NotEqual(fRES(reserve3));
    }

    protected void doSetReserve3_NotEqual(String reserve3) {
        regReserve3(CK_NES, reserve3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_GreaterThan(String reserve3) {
        regReserve3(CK_GT, fRES(reserve3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_LessThan(String reserve3) {
        regReserve3(CK_LT, fRES(reserve3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_GreaterEqual(String reserve3) {
        regReserve3(CK_GE, fRES(reserve3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_LessEqual(String reserve3) {
        regReserve3(CK_LE, fRES(reserve3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3List The collection of reserve3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_InScope(Collection<String> reserve3List) {
        doSetReserve3_InScope(reserve3List);
    }

    protected void doSetReserve3_InScope(Collection<String> reserve3List) {
        regINS(CK_INS, cTL(reserve3List), xgetCValueReserve3(), "RESERVE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3List The collection of reserve3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_NotInScope(Collection<String> reserve3List) {
        doSetReserve3_NotInScope(reserve3List);
    }

    protected void doSetReserve3_NotInScope(Collection<String> reserve3List) {
        regINS(CK_NINS, cTL(reserve3List), xgetCValueReserve3(), "RESERVE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE3: {varchar(255)} <br>
     * <pre>e.g. setReserve3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reserve3 The value of reserve3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReserve3_LikeSearch(String reserve3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reserve3), xgetCValueReserve3(), "RESERVE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReserve3_NotLikeSearch(String reserve3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reserve3), xgetCValueReserve3(), "RESERVE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE3: {varchar(255)}
     * @param reserve3 The value of reserve3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_PrefixSearch(String reserve3) {
        setReserve3_LikeSearch(reserve3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     */
    public void setReserve3_IsNull() { regReserve3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     */
    public void setReserve3_IsNullOrEmpty() { regReserve3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESERVE3: {varchar(255)}
     */
    public void setReserve3_IsNotNull() { regReserve3(CK_ISNN, DOBJ); }

    protected void regReserve3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReserve3(), "RESERVE3"); }
    protected abstract ConditionValue xgetCValueReserve3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_Equal(String reserve) {
        doSetReserve_Equal(fRES(reserve));
    }

    protected void doSetReserve_Equal(String reserve) {
        regReserve(CK_EQ, reserve);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_NotEqual(String reserve) {
        doSetReserve_NotEqual(fRES(reserve));
    }

    protected void doSetReserve_NotEqual(String reserve) {
        regReserve(CK_NES, reserve);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_GreaterThan(String reserve) {
        regReserve(CK_GT, fRES(reserve));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_LessThan(String reserve) {
        regReserve(CK_LT, fRES(reserve));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_GreaterEqual(String reserve) {
        regReserve(CK_GE, fRES(reserve));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_LessEqual(String reserve) {
        regReserve(CK_LE, fRES(reserve));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserveList The collection of reserve as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_InScope(Collection<String> reserveList) {
        doSetReserve_InScope(reserveList);
    }

    protected void doSetReserve_InScope(Collection<String> reserveList) {
        regINS(CK_INS, cTL(reserveList), xgetCValueReserve(), "RESERVE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserveList The collection of reserve as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_NotInScope(Collection<String> reserveList) {
        doSetReserve_NotInScope(reserveList);
    }

    protected void doSetReserve_NotInScope(Collection<String> reserveList) {
        regINS(CK_NINS, cTL(reserveList), xgetCValueReserve(), "RESERVE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE: {varchar(255)} <br>
     * <pre>e.g. setReserve_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reserve The value of reserve as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReserve_LikeSearch(String reserve, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reserve), xgetCValueReserve(), "RESERVE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReserve_NotLikeSearch(String reserve, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reserve), xgetCValueReserve(), "RESERVE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVE: {varchar(255)}
     * @param reserve The value of reserve as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_PrefixSearch(String reserve) {
        setReserve_LikeSearch(reserve, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     */
    public void setReserve_IsNull() { regReserve(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     */
    public void setReserve_IsNullOrEmpty() { regReserve(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESERVE: {varchar(255)}
     */
    public void setReserve_IsNotNull() { regReserve(CK_ISNN, DOBJ); }

    protected void regReserve(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReserve(), "RESERVE"); }
    protected abstract ConditionValue xgetCValueReserve();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     */
    public void setDelFlg_IsNull() { regDelFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     */
    public void setDelFlg_IsNotNull() { regDelFlg(CK_ISNN, DOBJ); }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
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
     * VERSION_NO: {bigint(19), default=[(0)]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     */
    public void setVersionNo_IsNull() { regVersionNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     */
    public void setVersionNo_IsNotNull() { regVersionNo(CK_ISNN, DOBJ); }

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
    public HpSLCFunction<EShippingInstDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShippingInstDataCB.class);
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
    public HpSLCFunction<EShippingInstDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShippingInstDataCB.class);
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
    public HpSLCFunction<EShippingInstDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShippingInstDataCB.class);
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
    public HpSLCFunction<EShippingInstDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShippingInstDataCB.class);
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
    public HpSLCFunction<EShippingInstDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShippingInstDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShippingInstDataCB&gt;() {
     *     public void query(EShippingInstDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShippingInstDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShippingInstDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInstDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShippingInstDataCQ sq);

    protected EShippingInstDataCB xcreateScalarConditionCB() {
        EShippingInstDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShippingInstDataCB xcreateScalarConditionPartitionByCB() {
        EShippingInstDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShippingInstDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInstDataCB cb = new EShippingInstDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShippingInstDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShippingInstDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShippingInstDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInstDataCB cb = new EShippingInstDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShippingInstDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShippingInstDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShippingInstDataCB cb = new EShippingInstDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShippingInstDataCQ sq);

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
    protected EShippingInstDataCB newMyCB() {
        return new EShippingInstDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShippingInstDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
